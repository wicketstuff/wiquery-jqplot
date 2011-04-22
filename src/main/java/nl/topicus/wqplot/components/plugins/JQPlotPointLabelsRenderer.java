package nl.topicus.wqplot.components.plugins;

public class JQPlotPointLabelsRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

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
