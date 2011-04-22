package nl.topicus.wqplot.components.plugins;

public class JQPlotCursorRenderer extends Renderer
{

	private static final long serialVersionUID = 1L;

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
