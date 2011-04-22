package nl.topicus.wqplot.components.plugins;

public class JQPlotDateAxisRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

	private static final JQPlotDateAxisRenderer INSTANCE = new JQPlotDateAxisRenderer();

	private JQPlotDateAxisRenderer()
	{
		super("$.jqplot.DateAxisRenderer", JQPlotDateAxisRendererResourceReference.get());
	}

	public static JQPlotDateAxisRenderer get()
	{
		return INSTANCE;
	}
}
