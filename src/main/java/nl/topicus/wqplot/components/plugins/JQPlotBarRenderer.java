package nl.topicus.wqplot.components.plugins;

public class JQPlotBarRenderer extends Renderer
{
	private static final JQPlotBarRenderer INSTANCE = new JQPlotBarRenderer();

	private JQPlotBarRenderer()
	{
		super("$.jqplot.BarRenderer", JQPlotBarRendererResourceReference.get());
	}

	public static JQPlotBarRenderer get()
	{
		return INSTANCE;
	}
}
