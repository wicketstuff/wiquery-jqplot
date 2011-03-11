package nl.topicus.wqplot.components.plugins;

public class JQPlotLogAxisRenderer extends Renderer
{
	private static final JQPlotLogAxisRenderer INSTANCE = new JQPlotLogAxisRenderer();

	private JQPlotLogAxisRenderer()
	{
		super("$.jqplot.LogAxisRenderer", JQPlotLogAxisRendererResourceReference.get());
	}

	public static JQPlotLogAxisRenderer get()
	{
		return INSTANCE;
	}
}
