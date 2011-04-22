package nl.topicus.wqplot.components.plugins;

public class JQPlotBezierCurveRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotBezierCurveRenderer INSTANCE = new JQPlotBezierCurveRenderer();

	private JQPlotBezierCurveRenderer()
	{
		super("$.jqplot.BezierCurveRenderer", JQPlotBezierCurveRendererResourceReference.get());
	}

	public static JQPlotBezierCurveRenderer get()
	{
		return INSTANCE;
	}
}
