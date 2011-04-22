package nl.topicus.wqplot.components.plugins;

public class JQPlotEnhancedLegendRenderer extends Renderer
{
	private static final long serialVersionUID = 1L;

	private static final JQPlotEnhancedLegendRenderer INSTANCE = new JQPlotEnhancedLegendRenderer();

	private JQPlotEnhancedLegendRenderer()
	{
		super("$.jqplot.EnhancedLegendRenderer", JQPlotEnhancedLegendRendererResourceReference
			.get());
	}

	public static JQPlotEnhancedLegendRenderer get()
	{
		return INSTANCE;
	}
}
