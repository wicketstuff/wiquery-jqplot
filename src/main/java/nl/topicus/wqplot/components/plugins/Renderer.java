package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class Renderer extends Plugin implements IRenderer
{
	private static final long serialVersionUID = 1L;

	protected Renderer(String name, WiQueryJavaScriptResourceReference javaScriptResourceReference)
	{
		super(name, javaScriptResourceReference);
	}
}
