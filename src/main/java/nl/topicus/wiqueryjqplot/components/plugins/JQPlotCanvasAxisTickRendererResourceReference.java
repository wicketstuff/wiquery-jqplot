package nl.topicus.wiqueryjqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class JQPlotCanvasAxisTickRendererResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotCanvasAxisTickRendererResourceReference INSTANCE =
		new JQPlotCanvasAxisTickRendererResourceReference();

	private JQPlotCanvasAxisTickRendererResourceReference()
	{
		super(JQPlotCanvasAxisTickRendererResourceReference.class,
			"jqplot.canvasAxisTickRenderer.js");
	}

	public static JQPlotCanvasAxisTickRendererResourceReference get()
	{
		return INSTANCE;
	}
}
