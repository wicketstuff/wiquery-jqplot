package nl.topicus.wqplot.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotJavaScriptResourceReference INSTANCE =
		new JQPlotJavaScriptResourceReference();

	private JQPlotJavaScriptResourceReference()
	{
		super(JQPlotJavaScriptResourceReference.class, "jquery.jqplot.js");
	}

	public static JQPlotJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
