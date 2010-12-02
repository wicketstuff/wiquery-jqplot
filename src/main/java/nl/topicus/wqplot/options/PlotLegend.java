package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotLegend implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean show;

	/**
	 * compass direction, nw, n, ne, e, se, s, sw, w.
	 */
	private PlotLegendLocation location;

	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 */
	private Integer xoffset;

	/**
	 * pixel offset of the legend box from the y (or y2) axis.
	 */
	private Integer yoffset;

	public PlotLegend()
	{
	}

	public Boolean isShow()
	{
		return show;
	}

	public PlotLegend setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public PlotLegendLocation getLocation()
	{
		return location;
	}

	public PlotLegend setLocation(PlotLegendLocation location)
	{
		this.location = location;
		return this;
	}

	public Integer getXoffset()
	{
		return xoffset;
	}

	public PlotLegend setXoffset(Integer xoffset)
	{
		this.xoffset = xoffset;
		return this;
	}

	public Integer getYoffset()
	{
		return yoffset;
	}

	public PlotLegend setYoffset(Integer yoffset)
	{
		this.yoffset = yoffset;
		return this;
	}
}
