package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotCategoryAxisRenderer extends Renderer
{

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
