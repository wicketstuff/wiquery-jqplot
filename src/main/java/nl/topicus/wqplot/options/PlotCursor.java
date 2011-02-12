package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotCursor implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String style;

	private Boolean zoom;

	private Boolean show;

	private Boolean showTooltip;

	private Boolean followMouse;

	private PlotTooltipLocation tooltipLocation;

	private Integer tooltipOffset;

	private Boolean showTooltipGridPosition;

	private Boolean showTooltipUnitPosition;

	private String tooltipFormatString;

	private Boolean useAxesFormatters;

	// private String[] tooltipAxesGroups;

	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	public PlotCursor()
	{
		renderer = "$.jqplot.Cursor";
	}

	public String getStyle()
	{
		return style;
	}

	public PlotCursor setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public Boolean getZoom()
	{
		return zoom;
	}

	public PlotCursor setZoom(Boolean zoom)
	{
		this.zoom = zoom;
		return this;
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotCursor setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public Boolean getShowTooltip()
	{
		return showTooltip;
	}

	public PlotCursor setShowTooltip(Boolean showTooltip)
	{
		this.showTooltip = showTooltip;
		return this;
	}

	public Boolean getFollowMouse()
	{
		return followMouse;
	}

	public PlotCursor setFollowMouse(Boolean followMouse)
	{
		this.followMouse = followMouse;
		return this;
	}

	public PlotTooltipLocation getTooltipLocation()
	{
		return tooltipLocation;
	}

	public PlotCursor setTooltipLocation(PlotTooltipLocation tooltipLocation)
	{
		this.tooltipLocation = tooltipLocation;
		return this;
	}

	public Integer getTooltipOffset()
	{
		return tooltipOffset;
	}

	public PlotCursor setTooltipOffset(Integer tooltipOffset)
	{
		this.tooltipOffset = tooltipOffset;
		return this;
	}

	public Boolean getShowTooltipGridPosition()
	{
		return showTooltipGridPosition;
	}

	public PlotCursor setShowTooltipGridPosition(Boolean showTooltipGridPosition)
	{
		this.showTooltipGridPosition = showTooltipGridPosition;
		return this;
	}

	public Boolean getShowTooltipUnitPosition()
	{
		return showTooltipUnitPosition;
	}

	public PlotCursor setShowTooltipUnitPosition(Boolean showTooltipUnitPosition)
	{
		this.showTooltipUnitPosition = showTooltipUnitPosition;
		return this;
	}

	public String getTooltipFormatString()
	{
		return tooltipFormatString;
	}

	public PlotCursor setTooltipFormatString(String tooltipFormatString)
	{
		this.tooltipFormatString = tooltipFormatString;
		return this;
	}

	public Boolean getUseAxesFormatters()
	{
		return useAxesFormatters;
	}

	public PlotCursor setUseAxesFormatters(Boolean useAxesFormatters)
	{
		this.useAxesFormatters = useAxesFormatters;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotCursor setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}
}
