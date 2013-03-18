package nl.topicus.wqplot.components;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotJavaScriptResourceReference extends JavaScriptResourceReference
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
