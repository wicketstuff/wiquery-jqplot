package nl.topicus.wqplot.components;

import org.apache.wicket.request.resource.CssResourceReference;

public class JQPlotStyleSheetResourceReference extends CssResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotStyleSheetResourceReference INSTANCE =
		new JQPlotStyleSheetResourceReference();

	private JQPlotStyleSheetResourceReference()
	{
		super(JQPlotStyleSheetResourceReference.class, "jquery.jqplot.css");
	}

	public static JQPlotStyleSheetResourceReference get()
	{
		return INSTANCE;
	}
}
