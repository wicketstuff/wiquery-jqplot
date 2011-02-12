/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public interface IPlugin
{

	/**
	 * The name of the plugin (e.g. $.jqplot.EnhancedLegendRenderer)
	 */
	String getName();

	/**
	 * The resource reference for the JavaScript file implementing the plugin.
	 */
	WiQueryJavaScriptResourceReference getJavaScriptResourceReference();

}
