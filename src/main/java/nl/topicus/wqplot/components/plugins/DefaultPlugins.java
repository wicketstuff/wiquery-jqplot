/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

import java.util.HashMap;
import java.util.Map;

/**
 * Default plugins resolver.
 * 
 * @author Ernesto Reinaldo Barreiro
 *
 */
public class DefaultPlugins implements IPluginResolver {

	private static final DefaultPlugins INSTANCE = new DefaultPlugins();

	private Map<String, IPlugin> plugins = new HashMap<String, IPlugin>();
	{
		plugins.put(JQPlotCanvasTextRenderer.get().getName(), JQPlotCanvasTextRenderer.get());
		plugins.put(JQPlotCanvasAxisLabelRenderer.get().getName(),JQPlotCanvasAxisLabelRenderer.get());
		plugins.put(JQPlotCanvasAxisTickRenderer.get().getName(),JQPlotCanvasAxisTickRenderer.get());
		plugins.put(JQPlotCategoryAxisRenderer.get().getName(),JQPlotCategoryAxisRenderer.get());
		plugins.put(JQPlotBarRenderer.get().getName(), JQPlotBarRenderer.get());
		plugins.put(JQPlotBubbleRenderer.get().getName(), JQPlotBubbleRenderer.get());
		plugins.put(JQPlotPieRenderer.get().getName(), JQPlotPieRenderer.get());
		plugins.put(JQPlotDateAxisRenderer.get().getName(), JQPlotDateAxisRenderer.get());
		plugins.put(JQPlotLogAxisRenderer.get().getName(), JQPlotLogAxisRenderer.get());
		plugins.put(JQPlotCursorRenderer.get().getName(), JQPlotCursorRenderer.get());
		plugins.put(JQPlotEnhancedLegendRenderer.get().getName(),JQPlotEnhancedLegendRenderer.get());
	}
	
	private DefaultPlugins() 
	{
	}
	
	@Override
	public IPlugin getPlugin(String name) 
	{
		IPlugin iPlugin = plugins.get(name);
		System.out.println(iPlugin.getName()+":"+iPlugin.getJavaScriptResourceReference().getClass().getName());
		return iPlugin;
	}
	
	public static IPluginResolver get() {
		return INSTANCE;
	}

}
