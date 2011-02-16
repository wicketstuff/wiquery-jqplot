package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotPieRenderer extends Renderer
{
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
