package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class Plugin implements IPlugin
{

	private static final long serialVersionUID = 1L;

	private String name;

	private JavaScriptResourceReference javaScriptResourceReference;

	protected Plugin(String name, JavaScriptResourceReference javaScriptResourceReference)
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
	public JavaScriptResourceReference getJavaScriptResourceReference()
	{
		return javaScriptResourceReference;
	}

}
