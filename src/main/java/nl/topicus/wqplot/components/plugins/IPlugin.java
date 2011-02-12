/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 *
 */
public interface IPlugin {
     
	String getName();
	
	WiQueryJavaScriptResourceReference getJavaScriptResourceReference();
	
}
