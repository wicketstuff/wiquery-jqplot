package nl.topicus.wiqueryjqplot.components;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import nl.topicus.wiqueryjqplot.data.Series;
import nl.topicus.wiqueryjqplot.data.SeriesEntry;
import nl.topicus.wiqueryjqplot.options.PlotOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class JQPlot extends WebMarkupContainer implements IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private PlotOptions options = new PlotOptions();

	public JQPlot(String id, IModel< ? extends Collection< ? extends Series< ? , ? , ? >>> model)
	{
		super(id, model);
		setOutputMarkupId(true);
	}

	private List<List<List<Object>>> getPlotData()
	{
		List<List<List<Object>>> ret = new ArrayList<List<List<Object>>>();
		Collection< ? extends Series< ? , ? , ? >> allSeries = getModelObject();
		for (Series< ? , ? , ? > curSeries : allSeries)
		{
			List<List<Object>> curSeriesData = new ArrayList<List<Object>>();
			for (SeriesEntry< ? , ? > curEntry : curSeries.getData())
			{
				curSeriesData.add(Arrays.asList(curEntry.getKey(), curEntry.getValue()));
			}
			ret.add(curSeriesData);
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	private Collection< ? extends Series< ? , ? , ? >> getModelObject()
	{
		return (Collection< ? extends Series< ? , ? , ? >>) getDefaultModelObject();
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager)
	{
		wiQueryResourceManager.addJavaScriptResource(JQPlotJavaScriptResourceReference.get());
		wiQueryResourceManager.addCssResource(JQPlotStyleSheetResourceReference.get());
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
			plotDataStr = mapper.writeValueAsString(getPlotData());
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
		return new JsStatement().append("$.jqplot('" + getMarkupId() + "', " + plotDataStr + ", "
			+ optionsStr + ")");
	}
}
