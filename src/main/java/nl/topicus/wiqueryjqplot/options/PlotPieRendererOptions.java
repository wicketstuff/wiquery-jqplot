package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
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
