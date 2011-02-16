/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public class JQPlotBubbleRenderer extends Renderer
{

	private static final JQPlotBubbleRenderer INSTANCE = new JQPlotBubbleRenderer();

	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotBubbleRenderer()
	{
		super("$.jqplot.BubbleRenderer", JQPlotBubbleRendererResourceReference.get());
	}

	public static JQPlotBubbleRenderer get()
	{
		return INSTANCE;
	}
}
