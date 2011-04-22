package nl.topicus.wqplot.components.plugins;

import java.util.HashMap;
import java.util.Map;

/**
 * Default plugins resolver.
 * 
 * @author Ernesto Reinaldo Barreiro
 */
public class DefaultPlugins implements IPluginResolver
{
	private static final long serialVersionUID = 1L;

	private Map<String, IPlugin> plugins = new HashMap<String, IPlugin>();
	{
		plugins.put(JQPlotBarRenderer.get().getName(), JQPlotBarRenderer.get());
		plugins.put(JQPlotBezierCurveRenderer.get().getName(), JQPlotBezierCurveRenderer.get());
		plugins.put(JQPlotBlockRenderer.get().getName(), JQPlotBlockRenderer.get());
		plugins.put(JQPlotBubbleRenderer.get().getName(), JQPlotBubbleRenderer.get());
		plugins.put(JQPlotCanvasAxisLabelRenderer.get().getName(),
			JQPlotCanvasAxisLabelRenderer.get());
		plugins.put(JQPlotCanvasAxisTickRenderer.get().getName(),
			JQPlotCanvasAxisTickRenderer.get());
		plugins.put(JQPlotCanvasTextRenderer.get().getName(), JQPlotCanvasTextRenderer.get());
		plugins.put(JQPlotCategoryAxisRenderer.get().getName(), JQPlotCategoryAxisRenderer.get());
		plugins.put(JQPlotCursorRenderer.get().getName(), JQPlotCursorRenderer.get());
		plugins.put(JQPlotDateAxisRenderer.get().getName(), JQPlotDateAxisRenderer.get());
		plugins.put(JQPlotEnhancedLegendRenderer.get().getName(),
			JQPlotEnhancedLegendRenderer.get());
		plugins.put(JQPlotHighlighterRenderer.get().getName(), JQPlotHighlighterRenderer.get());
		plugins.put(JQPlotLogAxisRenderer.get().getName(), JQPlotLogAxisRenderer.get());
		plugins.put(JQPlotPieRenderer.get().getName(), JQPlotPieRenderer.get());
		plugins.put(JQPlotPointLabelsRenderer.get().getName(), JQPlotPointLabelsRenderer.get());
	}

	public DefaultPlugins()
	{
	}

	@Override
	public IPlugin getPlugin(String name)
	{
		IPlugin iPlugin = plugins.get(name);
		return iPlugin;
	}
}
