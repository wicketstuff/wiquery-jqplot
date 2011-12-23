package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotPieRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotPieRendererResourceReference INSTANCE =
		new JQPlotPieRendererResourceReference();

	private JQPlotPieRendererResourceReference()
	{
		super(JQPlotPieRendererResourceReference.class, "jqplot.pieRenderer.js");
	}

	public static JQPlotPieRendererResourceReference get()
	{
		return INSTANCE;
	}
}
