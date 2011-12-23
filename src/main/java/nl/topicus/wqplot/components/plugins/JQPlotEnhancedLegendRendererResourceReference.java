package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotEnhancedLegendRendererResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotEnhancedLegendRendererResourceReference INSTANCE =
		new JQPlotEnhancedLegendRendererResourceReference();

	private JQPlotEnhancedLegendRendererResourceReference()
	{
		super(JQPlotEnhancedLegendRendererResourceReference.class,
			"jqplot.enhancedLegendRenderer.js");
	}

	public static JQPlotEnhancedLegendRendererResourceReference get()
	{
		return INSTANCE;
	}
}
