package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotPointLabelsResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotPointLabelsResourceReference INSTANCE =
		new JQPlotPointLabelsResourceReference();

	private JQPlotPointLabelsResourceReference()
	{
		super(JQPlotPointLabelsResourceReference.class, "jqplot.pointLabels.js");
	}

	public static JQPlotPointLabelsResourceReference get()
	{
		return INSTANCE;
	}
}
