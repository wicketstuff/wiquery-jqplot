package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotCategoryAxisRendererResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotCategoryAxisRendererResourceReference INSTANCE =
		new JQPlotCategoryAxisRendererResourceReference();

	private JQPlotCategoryAxisRendererResourceReference()
	{
		super(JQPlotCategoryAxisRendererResourceReference.class, "jqplot.categoryAxisRenderer.js");
	}

	public static JQPlotCategoryAxisRendererResourceReference get()
	{
		return INSTANCE;
	}
}
