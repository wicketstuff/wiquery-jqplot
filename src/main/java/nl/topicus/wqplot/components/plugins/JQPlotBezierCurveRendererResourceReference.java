package nl.topicus.wqplot.components.plugins;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class JQPlotBezierCurveRendererResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotBezierCurveRendererResourceReference INSTANCE =
		new JQPlotBezierCurveRendererResourceReference();

	private JQPlotBezierCurveRendererResourceReference()
	{
		super(JQPlotBezierCurveRendererResourceReference.class, "jqplot.bezierCurveRenderer.js");
	}

	public static JQPlotBezierCurveRendererResourceReference get()
	{
		return INSTANCE;
	}
}
