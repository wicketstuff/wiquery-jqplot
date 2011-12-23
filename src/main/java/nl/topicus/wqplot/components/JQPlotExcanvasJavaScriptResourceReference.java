package nl.topicus.wqplot.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

/**
 * Special javascript for when the User Agent is Internet Explorer.
 * 
 * @author hielkehoeve
 */
public class JQPlotExcanvasJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
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
