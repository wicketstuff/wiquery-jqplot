package nl.topicus.wqplot.components.plugins;

public class JQPlotCanvasAxisTickRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotCanvasAxisTickRenderer INSTANCE = new JQPlotCanvasAxisTickRenderer();

	private JQPlotCanvasAxisTickRenderer()
	{
		super("$.jqplot.CanvasAxisTickRenderer", JQPlotCanvasAxisTickRendererResourceReference
			.get());
	}

	public static JQPlotCanvasAxisTickRenderer get()
	{
		return INSTANCE;
	}
}
