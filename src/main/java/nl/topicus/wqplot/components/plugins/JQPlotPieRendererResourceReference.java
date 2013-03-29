package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotPieRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotPieRendererResourceReference INSTANCE =
		new JQPlotPieRendererResourceReference();

	private JQPlotPieRendererResourceReference()
	{
		super(JQPlotPieRendererResourceReference.class, "jqplot.pieRenderer.js");
	}

	public static JQPlotPieRendererResourceReference get()
	{
		return INSTANCE;
	}
}
