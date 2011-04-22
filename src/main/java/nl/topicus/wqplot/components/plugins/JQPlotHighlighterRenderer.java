package nl.topicus.wqplot.components.plugins;

public class JQPlotHighlighterRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotHighlighterRenderer INSTANCE = new JQPlotHighlighterRenderer();

	private JQPlotHighlighterRenderer()
	{
		super("$.jqplot.Highlighter", JQPlotHighlighterResourceReference.get());
	}

	public static JQPlotHighlighterRenderer get()
	{
		return INSTANCE;
	}
}
