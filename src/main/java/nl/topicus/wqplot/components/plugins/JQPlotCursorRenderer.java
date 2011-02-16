package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotCursorRenderer extends Renderer
{

	private static final JQPlotCursorRenderer INSTANCE = new JQPlotCursorRenderer();

	private JQPlotCursorRenderer()
	{
		super("$.jqplot.Cursor", JQPlotCursorResourceReference.get());
	}

	public static JQPlotCursorRenderer get()
	{
		return INSTANCE;
	}
}
