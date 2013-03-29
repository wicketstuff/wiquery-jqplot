package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotCursorResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotCursorResourceReference INSTANCE = new JQPlotCursorResourceReference();

	private JQPlotCursorResourceReference()
	{
		super(JQPlotCursorResourceReference.class, "jqplot.cursor.js");
	}

	public static JQPlotCursorResourceReference get()
	{
		return INSTANCE;
	}
}
