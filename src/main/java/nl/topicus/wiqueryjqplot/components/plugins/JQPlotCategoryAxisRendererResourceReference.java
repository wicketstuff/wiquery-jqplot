package nl.topicus.wiqueryjqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

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
