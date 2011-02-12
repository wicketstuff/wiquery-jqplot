/**
 * 
 */
package nl.topicus.wqplot.components.plugins;


/**
 * @author Ernesto Reinaldo Barreiro
 *
 */
public class JQPlotDateAxisRenderer extends Renderer {

	public static final JQPlotDateAxisRenderer INSTANCE = new JQPlotDateAxisRenderer();
	
	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotDateAxisRenderer() {
		super("$.jqplot.DateAxisRenderer", JQPlotDateAxisRendererResourceReference.get());
	}

	public static JQPlotDateAxisRenderer get()
	{
		return INSTANCE;
	}
}
