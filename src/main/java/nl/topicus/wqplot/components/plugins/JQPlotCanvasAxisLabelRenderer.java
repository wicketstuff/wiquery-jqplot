/**
 * 
 */
package nl.topicus.wqplot.components.plugins;


/**
 * @author Ernesto Reinaldo Barreiro
 *
 */
public class JQPlotCanvasAxisLabelRenderer extends Renderer {

	public static final JQPlotCanvasAxisLabelRenderer INSTANCE = new JQPlotCanvasAxisLabelRenderer();
	
	/**
	 * @param name
	 * @param javaScriptResourceReference
	 */
	private JQPlotCanvasAxisLabelRenderer() {
		super("$.jqplot.CanvasAxisLabelRenderer", JQPlotCanvasAxisLabelRendererResourceReference.get());
	}

	public static JQPlotCanvasAxisLabelRenderer get()
	{
		return INSTANCE;
	}
}
