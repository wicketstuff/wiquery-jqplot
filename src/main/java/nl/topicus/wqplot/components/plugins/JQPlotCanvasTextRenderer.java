package nl.topicus.wqplot.components.plugins;

public class JQPlotCanvasTextRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

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
