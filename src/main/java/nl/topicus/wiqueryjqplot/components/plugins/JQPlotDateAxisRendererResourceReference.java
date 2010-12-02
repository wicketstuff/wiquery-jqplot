package nl.topicus.wiqueryjqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class JQPlotDateAxisRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotDateAxisRendererResourceReference INSTANCE =
		new JQPlotDateAxisRendererResourceReference();

	private JQPlotDateAxisRendererResourceReference()
	{
		super(JQPlotDateAxisRendererResourceReference.class, "jqplot.dateAxisRenderer.js");
	}

	public static JQPlotDateAxisRendererResourceReference get()
	{
		return INSTANCE;
	}
}
