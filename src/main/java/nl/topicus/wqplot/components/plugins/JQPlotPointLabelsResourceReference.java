package nl.topicus.wqplot.components.plugins;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotPointLabelsResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotPointLabelsResourceReference INSTANCE =
		new JQPlotPointLabelsResourceReference();

	private JQPlotPointLabelsResourceReference()
	{
		super(JQPlotPointLabelsResourceReference.class, "jqplot.pointLabels.js");
	}

	public static JQPlotPointLabelsResourceReference get()
	{
		return INSTANCE;
	}
}
