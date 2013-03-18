package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotEnhancedLegendRendererResourceReference extends
		JavaScriptResourceReference
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
