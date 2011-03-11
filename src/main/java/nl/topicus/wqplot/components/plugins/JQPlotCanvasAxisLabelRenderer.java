package nl.topicus.wqplot.components.plugins;

public class JQPlotCanvasAxisLabelRenderer extends Renderer
{
	private static final JQPlotCanvasAxisLabelRenderer INSTANCE =
		new JQPlotCanvasAxisLabelRenderer();

	private JQPlotCanvasAxisLabelRenderer()
	{
		super("$.jqplot.CanvasAxisLabelRenderer", JQPlotCanvasAxisLabelRendererResourceReference
			.get());
	}

	public static JQPlotCanvasAxisLabelRenderer get()
	{
		return INSTANCE;
	}
}
