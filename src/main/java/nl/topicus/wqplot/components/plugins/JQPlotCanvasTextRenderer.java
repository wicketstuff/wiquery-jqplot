package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotCanvasTextRenderer extends Renderer
{

	private static final JQPlotCanvasTextRenderer INSTANCE = new JQPlotCanvasTextRenderer();

	private JQPlotCanvasTextRenderer()
	{
		super("$.jqplot.CanvasTextRenderer", JQPlotCanvasTextRendererResourceReference.get());
	}

	public static JQPlotCanvasTextRenderer get()
	{
		return INSTANCE;
	}
}
