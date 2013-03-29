package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotBarRendererResourceReference extends JavaScriptResourceReference
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
