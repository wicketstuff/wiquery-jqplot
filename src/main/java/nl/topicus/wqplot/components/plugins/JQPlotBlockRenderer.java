package nl.topicus.wqplot.components.plugins;

public class JQPlotBlockRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotBlockRenderer INSTANCE = new JQPlotBlockRenderer();

	private JQPlotBlockRenderer()
	{
		super("$.jqplot.BlockRenderer", JQPlotBlockRendererResourceReference.get());
	}

	public static JQPlotBlockRenderer get()
	{
		return INSTANCE;
	}
}
