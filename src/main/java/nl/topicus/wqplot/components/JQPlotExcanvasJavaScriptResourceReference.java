package nl.topicus.wqplot.components;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * Special javascript for when the User Agent is Internet Explorer.
 * 
 * @author hielkehoeve
 */
public class JQPlotExcanvasJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotExcanvasJavaScriptResourceReference INSTANCE =
		new JQPlotExcanvasJavaScriptResourceReference();

	private JQPlotExcanvasJavaScriptResourceReference()
	{
		super(JQPlotExcanvasJavaScriptResourceReference.class, "excanvas.js");
	}

	public static JQPlotExcanvasJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
