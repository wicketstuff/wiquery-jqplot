package nl.topicus.wqplot.components;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import nl.topicus.wqplot.components.plugins.*;
import nl.topicus.wqplot.data.Series;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PluginReferenceSerializer;

import org.apache.wicket.RequestCycle;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.http.request.WebClientInfo;
import org.apache.wicket.request.ClientInfo;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class JQPlot extends WebMarkupContainer implements IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private PlotOptions options = new PlotOptions();

	private Map<String, WiQueryJavaScriptResourceReference> plugins =
		new HashMap<String, WiQueryJavaScriptResourceReference>();
	{
		plugins.put("$.jqplot.CanvasTextRenderer", JQPlotCanvasTextRendererResourceReference.get());
		plugins.put("$.jqplot.CanvasAxisLabelRenderer",
			JQPlotCanvasAxisLabelRendererResourceReference.get());
		plugins.put("$.jqplot.CanvasAxisTickRenderer",
			JQPlotCanvasAxisTickRendererResourceReference.get());
		plugins.put("$.jqplot.CategoryAxisRenderer",
			JQPlotCategoryAxisRendererResourceReference.get());
		plugins.put("$.jqplot.BarRenderer", JQPlotBarRendererResourceReference.get());
		plugins.put("$.jqplot.BubbleRenderer", JQPlotBubbleRendererResourceReference.get());
		plugins.put("$.jqplot.PieRenderer", JQPlotPieRendererResourceReference.get());
		plugins.put("$.jqplot.DateAxisRenderer", JQPlotDateAxisRendererResourceReference.get());
		plugins.put("$.jqplot.LogAxisRenderer", JQPlotLogAxisRendererResourceReference.get());
		plugins.put("$.jqplot.Cursor", JQPlotCursorResourceReference.get());
		plugins.put("$.jqplot.EnhancedLegendRenderer",
			JQPlotEnhancedLegendRendererResourceReference.get());
		plugins.put("$.jqplot.PointLabels", JQPlotPointLabelsResourceReference.get());
		plugins.put("$.jqplot.Highlighter", JQPlotHighlighterResourceReference.get());
	}

	private List<String> afterRenderStatements = new ArrayList<String>();

	public JQPlot(String id, IModel< ? extends Collection< ? extends Series< ? , ? , ? >>> model)
	{
		super(id, model);
		setOutputMarkupId(true);
	}

	public PlotOptions getOptions()
	{
		return options;
	}

	@SuppressWarnings("unchecked")
	private Collection< ? extends Series< ? , ? , ? >> getModelObject()
	{
		return (Collection< ? extends Series< ? , ? , ? >>) getDefaultModelObject();
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager)
	{
		ClientInfo info = RequestCycle.get().getClientInfo();
		if (info instanceof WebClientInfo)
		{
			/**
			 * only IE 9 supports canvas natively.
			 */
			WebClientInfo webinfo = (WebClientInfo) info;
			if (webinfo.getProperties().isBrowserInternetExplorer()
				&& webinfo.getProperties().getBrowserVersionMajor() < 9)
				wiQueryResourceManager
					.addJavaScriptResource(JQPlotExcanvasJavaScriptResourceReference.get());
		}

		wiQueryResourceManager.addJavaScriptResource(JQPlotJavaScriptResourceReference.get());
		wiQueryResourceManager.addCssResource(JQPlotStyleSheetResourceReference.get());
		wiQueryResourceManager.addJavaScriptResource(JQPlotCanvasTextRendererResourceReference
			.get());

		try
		{
			addPlugins(wiQueryResourceManager);
		}
		catch (IllegalAccessException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void addPlugins(WiQueryResourceManager wiQueryResourceManager)
			throws IllegalAccessException
	{
		LinkedList<Object> remaining = new LinkedList<Object>();
		remaining.add(options);
		while (!remaining.isEmpty())
		{
			Object curOptionObject = remaining.removeFirst();
			Class< ? > curOptionClass = curOptionObject.getClass();
			while (curOptionClass != Object.class)
			{
				for (Field curField : curOptionClass.getDeclaredFields())
				{
					if (Modifier.isStatic(curField.getModifiers()))
						continue;
					curField.setAccessible(true);
					Object value = curField.get(curOptionObject);
					if (value == null)
						continue;

					if (value instanceof Iterable< ? >)
					{
						for (Object curItem : (Iterable< ? >) value)
							remaining.add(curItem);
					}
					else if (value instanceof String)
					{
						JsonSerialize serialize = curField.getAnnotation(JsonSerialize.class);
						if (serialize != null
							&& serialize.using() == PluginReferenceSerializer.class)
							addPlugin(wiQueryResourceManager, (String) value);
					}
					else if (!(value instanceof Number) && !(value instanceof Boolean))
						remaining.add(value);
				}
				curOptionClass = curOptionClass.getSuperclass();
			}
		}
	}

	private void addPlugin(WiQueryResourceManager wiQueryResourceManager, String plugin)
	{
		if (!plugins.containsKey(plugin))
			throw new IllegalArgumentException("Unknown plugin '" + plugin + "'");
		wiQueryResourceManager.addJavaScriptResource(plugins.get(plugin));
	}

	public void addAfterRenderStatement(String statement)
	{
		afterRenderStatements.add(statement);
	}

	@Override
	public JsStatement statement()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
		String optionsStr = "{}";
		String plotDataStr = "[]";
		try
		{
			optionsStr = mapper.writeValueAsString(options);
			plotDataStr = mapper.writeValueAsString(getModelObject());
		}
		catch (JsonGenerationException e)
		{
			e.printStackTrace();
		}
		catch (JsonMappingException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		JsStatement jsStatement = new JsStatement().append("$.jqplot.config.catchErrors = true;\n");
		jsStatement.append("var " + getMarkupId() + " = $.jqplot('" + getMarkupId() + "', "
			+ plotDataStr + ", " + optionsStr + ");\n");

		for (String statement : afterRenderStatements)
			jsStatement.append(statement);

		return jsStatement;
	}
}
