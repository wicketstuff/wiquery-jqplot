package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotCanvasTextRendererResourceReference extends JavaScriptResourceReference
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
