package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotLogAxisRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotLogAxisRendererResourceReference INSTANCE =
		new JQPlotLogAxisRendererResourceReference();

	private JQPlotLogAxisRendererResourceReference()
	{
		super(JQPlotLogAxisRendererResourceReference.class, "jqplot.logAxisRenderer.js");
	}

	public static JQPlotLogAxisRendererResourceReference get()
	{
		return INSTANCE;
	}
}
