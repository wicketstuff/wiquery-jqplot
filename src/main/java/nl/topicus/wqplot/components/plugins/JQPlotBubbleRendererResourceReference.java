package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotBubbleRendererResourceReference extends WiQueryJavaScriptResourceReference
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
