package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotHighlighterResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotHighlighterResourceReference INSTANCE =
		new JQPlotHighlighterResourceReference();

	private JQPlotHighlighterResourceReference()
	{
		super(JQPlotHighlighterResourceReference.class, "jqplot.highlighter.js");
	}

	public static JQPlotHighlighterResourceReference get()
	{
		return INSTANCE;
	}
}
