package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
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
