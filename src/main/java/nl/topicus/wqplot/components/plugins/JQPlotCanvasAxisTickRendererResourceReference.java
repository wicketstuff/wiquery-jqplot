package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotCanvasAxisTickRendererResourceReference extends
		JavaScriptResourceReference
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
