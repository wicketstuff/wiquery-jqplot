package nl.topicus.wiqueryjqplot.components;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

public class JQPlotJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotJavaScriptResourceReference instance =
		new JQPlotJavaScriptResourceReference();

	private JQPlotJavaScriptResourceReference()
	{
		super(JQPlotJavaScriptResourceReference.class, "jquery.jqplot.js");
	}

	public static JQPlotJavaScriptResourceReference get()
	{
		return instance;
	}
}
