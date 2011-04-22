package nl.topicus.wqplot.components.plugins;

import java.io.Serializable;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public interface IPluginResolver extends Serializable
{

	IPlugin getPlugin(String name);
}
