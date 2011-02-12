/**
 * 
 */
package nl.topicus.wqplot.components.plugins;


/**
 * @author Ernesto Reinaldo Barreiro
 *
 */
public class JQPlotBarRenderer extends Renderer {

	public static final JQPlotBarRenderer INSTANCE = new JQPlotBarRenderer();
	
	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotBarRenderer() {
		super("$.jqplot.BarRenderer", JQPlotBarRendererResourceReference.get());
	}

	public static JQPlotBarRenderer get()
	{
		return INSTANCE;
	}
}
