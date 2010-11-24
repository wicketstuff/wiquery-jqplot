package nl.topicus.wiqueryjqplot.components;

import nl.topicus.wiqueryjqplot.options.PlotOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;
import org.odlabs.wiquery.ui.commons.WiQueryUIPlugin;

@WiQueryUIPlugin
public class JQPlot extends WebMarkupContainer implements IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private PlotOptions options = new PlotOptions();

	public JQPlot(String id)
	{
		super(id);
	}

	public JQPlot(String id, IModel< ? > model)
	{
		super(id, model);
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager)
	{
		wiQueryResourceManager.addJavaScriptResource(JQPlotJavaScriptResourceReference.get());
		wiQueryResourceManager.addCssResource(JQPlotStyleSheetResourceReference.get());
	}

	public PlotOptions getOptions()
	{
		return options;
	}

	public void setOptions(PlotOptions options)
	{
		this.options = options;
	}

	public String getData()
	{
		// TODO make sure this returns a correct array of series of data.
		return "[]";
	}

	@Override
	public JsStatement statement()
	{
		return new JsStatement().append("$.jqplot('#'" + getMarkupId() + "', " + getData() + ");");
	}
}
