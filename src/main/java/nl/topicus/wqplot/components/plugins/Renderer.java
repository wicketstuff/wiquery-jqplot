package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.commons.WiQueryJavaScriptResourceReference;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class Renderer extends Plugin implements IRenderer
{
	protected Renderer(String name, WiQueryJavaScriptResourceReference javaScriptResourceReference)
	{
		super(name, javaScriptResourceReference);
	}
}
