package nl.topicus.wiqueryjqplot.options;

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

	public void setShow(Boolean show)
	{
		this.show = show;
	}

	public PlotLegendLocation getLocation()
	{
		return location;
	}

	public void setLocation(PlotLegendLocation location)
	{
		this.location = location;
	}

	public Integer getXoffset()
	{
		return xoffset;
	}

	public void setXoffset(Integer xoffset)
	{
		this.xoffset = xoffset;
	}

	public Integer getYoffset()
	{
		return yoffset;
	}

	public void setYoffset(Integer yoffset)
	{
		this.yoffset = yoffset;
	}
}
