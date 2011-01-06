package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotPieRendererOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Double sliceMargin;

	public PlotPieRendererOptions()
	{
	}

	public Double getSliceMargin()
	{
		return sliceMargin;
	}

	public PlotPieRendererOptions setSliceMargin(Double sliceMargin)
	{
		this.sliceMargin = sliceMargin;
		return this;
	}
}
