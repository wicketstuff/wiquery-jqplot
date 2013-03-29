package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotBlockRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotBlockRendererResourceReference INSTANCE =
		new JQPlotBlockRendererResourceReference();

	private JQPlotBlockRendererResourceReference()
	{
		super(JQPlotBlockRendererResourceReference.class, "jqplot.blockRenderer.js");
	}

	public static JQPlotBlockRendererResourceReference get()
	{
		return INSTANCE;
	}
}
