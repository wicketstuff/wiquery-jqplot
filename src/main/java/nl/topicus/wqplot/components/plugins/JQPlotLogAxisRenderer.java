/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public class JQPlotLogAxisRenderer extends Renderer
{

	private static final JQPlotLogAxisRenderer INSTANCE = new JQPlotLogAxisRenderer();

	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotLogAxisRenderer()
	{
		super("$.jqplot.LogAxisRenderer", JQPlotLogAxisRendererResourceReference.get());
	}

	public static JQPlotLogAxisRenderer get()
	{
		return INSTANCE;
	}
}
