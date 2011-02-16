/**
 * 
 */
package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public class Plugin implements IPlugin
{

	private String name;

	private WiQueryJavaScriptResourceReference javaScriptResourceReference;

	protected Plugin(String name, WiQueryJavaScriptResourceReference javaScriptResourceReference)
	{
		this.name = name;
		this.javaScriptResourceReference = javaScriptResourceReference;
	}

	/*
	 * (non-Javadoc)
	 * @see nl.topicus.wqplot.components.plugins.IPlugin#getName()
	 */
	public String getName()
	{
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see nl.topicus.wqplot.components.plugins.IPlugin#getJavaScriptResourceReference()
	 */
	public WiQueryJavaScriptResourceReference getJavaScriptResourceReference()
	{
		return javaScriptResourceReference;
	}

}
