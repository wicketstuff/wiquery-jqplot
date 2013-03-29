package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotBubbleRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotBubbleRendererResourceReference INSTANCE =
		new JQPlotBubbleRendererResourceReference();

	private JQPlotBubbleRendererResourceReference()
	{
		super(JQPlotBubbleRendererResourceReference.class, "jqplot.bubbleRenderer.js");
	}

	public static JQPlotBubbleRendererResourceReference get()
	{
		return INSTANCE;
	}
}
