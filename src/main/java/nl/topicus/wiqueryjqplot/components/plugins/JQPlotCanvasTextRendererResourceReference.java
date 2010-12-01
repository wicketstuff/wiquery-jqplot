package nl.topicus.wiqueryjqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class JQPlotCanvasTextRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotCanvasTextRendererResourceReference INSTANCE =
		new JQPlotCanvasTextRendererResourceReference();

	private JQPlotCanvasTextRendererResourceReference()
	{
		super(JQPlotCanvasTextRendererResourceReference.class, "jqplot.canvasTextRenderer.js");
	}

	public static JQPlotCanvasTextRendererResourceReference get()
	{
		return INSTANCE;
	}
}
