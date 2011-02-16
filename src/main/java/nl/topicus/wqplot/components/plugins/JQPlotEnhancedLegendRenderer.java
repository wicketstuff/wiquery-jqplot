/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public class JQPlotEnhancedLegendRenderer extends Renderer
{

	private static final JQPlotEnhancedLegendRenderer INSTANCE = new JQPlotEnhancedLegendRenderer();

	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
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
