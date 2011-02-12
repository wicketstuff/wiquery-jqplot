/**
 * 
 */
package nl.topicus.wqplot.components.plugins;


/**
 * @author Ernesto Reinaldo Barreiro
 *
 */
public class JQPlotCategoryAxisRenderer extends Renderer {

	public static final JQPlotCategoryAxisRenderer INSTANCE = new JQPlotCategoryAxisRenderer();
	
	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotCategoryAxisRenderer() {
		super("$.jqplot.CategoryAxisRenderer", JQPlotCategoryAxisRendererResourceReference.get());
	}

	public static JQPlotCategoryAxisRenderer get()
	{
		return INSTANCE;
	}
}
