package nl.topicus.wqplot.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotEnhancedLegendRendererOptions extends PlotLegendRendererOptions
{
	private static final long serialVersionUID = 1L;

	private Integer numberRows;

	public PlotEnhancedLegendRendererOptions()
	{
	}

	public Integer getNumberRows()
	{
		return numberRows;
	}

	public PlotEnhancedLegendRendererOptions setNumberRows(Integer numberRows)
	{
		this.numberRows = numberRows;
		return this;
	}
}
