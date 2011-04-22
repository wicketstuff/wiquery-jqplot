package nl.topicus.wqplot.components.plugins;

public class JQPlotPieRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotPieRenderer INSTANCE = new JQPlotPieRenderer();

	private JQPlotPieRenderer()
	{
		super("$.jqplot.PieRenderer", JQPlotPieRendererResourceReference.get());
	}

	public static JQPlotPieRenderer get()
	{
		return INSTANCE;
	}
}
