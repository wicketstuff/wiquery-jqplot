package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotCategoryAxisRendererResourceReference extends WiQueryJavaScriptResourceReference
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
