package nl.topicus.wqplot.components.plugins;

public class JQPlotCategoryAxisRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

	private static final JQPlotCategoryAxisRenderer INSTANCE = new JQPlotCategoryAxisRenderer();

	private JQPlotCategoryAxisRenderer()
	{
		super("$.jqplot.CategoryAxisRenderer", JQPlotCategoryAxisRendererResourceReference.get());
	}

	public static JQPlotCategoryAxisRenderer get()
	{
		return INSTANCE;
	}
}
