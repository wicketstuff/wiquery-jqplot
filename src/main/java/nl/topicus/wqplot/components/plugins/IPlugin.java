package nl.topicus.wqplot.components.plugins;

import java.io.Serializable;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public interface IPlugin extends Serializable
{

	/**
	 * The name of the plugin (e.g. $.jqplot.EnhancedLegendRenderer)
	 */
	String getName();

	/**
	 * The resource reference for the JavaScript file implementing the plugin.
	 */
	JavaScriptResourceReference getJavaScriptResourceReference();

}
