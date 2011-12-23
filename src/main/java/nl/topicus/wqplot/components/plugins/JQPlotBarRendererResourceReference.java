package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotBarRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotBarRendererResourceReference INSTANCE =
		new JQPlotBarRendererResourceReference();

	private JQPlotBarRendererResourceReference()
	{
		super(JQPlotBarRendererResourceReference.class, "jqplot.barRenderer.js");
	}

	public static JQPlotBarRendererResourceReference get()
	{
		return INSTANCE;
	}
}
