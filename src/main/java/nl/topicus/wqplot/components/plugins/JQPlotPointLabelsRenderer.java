package nl.topicus.wqplot.components.plugins;

public class JQPlotPointLabelsRenderer extends Renderer
{
	private static final JQPlotPointLabelsRenderer INSTANCE = new JQPlotPointLabelsRenderer();

	private JQPlotPointLabelsRenderer()
	{
		super("$.jqplot.PointLabels", JQPlotPointLabelsResourceReference.get());
	}

	public static JQPlotPointLabelsRenderer get()
	{
		return INSTANCE;
	}
}
