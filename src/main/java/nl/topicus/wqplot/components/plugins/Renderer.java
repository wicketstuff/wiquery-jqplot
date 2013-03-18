package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class Renderer extends Plugin implements IRenderer
{
	private static final long serialVersionUID = 1L;

	protected Renderer(String name, JavaScriptResourceReference javaScriptResourceReference)
	{
		super(name, javaScriptResourceReference);
	}
}
