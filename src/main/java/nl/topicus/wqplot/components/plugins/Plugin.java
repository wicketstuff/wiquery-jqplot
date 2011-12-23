package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class Plugin implements IPlugin
{

	private static final long serialVersionUID = 1L;

	private String name;

	private WiQueryJavaScriptResourceReference javaScriptResourceReference;

	protected Plugin(String name, WiQueryJavaScriptResourceReference javaScriptResourceReference)
	{
		this.name = name;
		this.javaScriptResourceReference = javaScriptResourceReference;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public WiQueryJavaScriptResourceReference getJavaScriptResourceReference()
	{
		return javaScriptResourceReference;
	}

}
