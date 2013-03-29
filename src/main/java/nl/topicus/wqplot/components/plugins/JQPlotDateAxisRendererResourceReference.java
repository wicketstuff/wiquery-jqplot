package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotDateAxisRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotDateAxisRendererResourceReference INSTANCE =
		new JQPlotDateAxisRendererResourceReference();

	private JQPlotDateAxisRendererResourceReference()
	{
		super(JQPlotDateAxisRendererResourceReference.class, "jqplot.dateAxisRenderer.js");
	}

	public static JQPlotDateAxisRendererResourceReference get()
	{
		return INSTANCE;
	}
}
