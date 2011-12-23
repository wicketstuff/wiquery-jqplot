package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotHighlighterResourceReference extends WiQueryJavaScriptResourceReference
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
