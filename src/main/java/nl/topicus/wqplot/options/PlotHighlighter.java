package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotHighlighter implements Serializable
{
	private static final long serialVersionUID = 1L;

	/** true to show the highlight. */
	private Boolean show;

	/** Renderer used to draw the marker of the highlighted point. */
	private String markerRenderer;

	/** true to show the marker */
	private Boolean showMarker;

	/** Pixels to add to the lineWidth of the highlight. */
	private Double lineWidthAdjust;

	/** Pixels to add to the overall size of the highlight. */
	private Double sizeAdjust;

	/** Show a tooltip with data point values. */
	private Boolean showTooltip;

	/** Where to position tooltip, ‘n’, ‘ne’, ‘e’, ‘se’, ‘s’, ‘sw’, ‘w’, ‘nw’ */
	private PlotTooltipLocation tooltipLocation;

	/** true = fade in/out tooltip, flase = show/hide tooltip */
	private Boolean tooltipFade;

	/** ‘slow’, ‘def’, ‘fast’, or number of milliseconds. */
	private String tooltipFadeSpeed;

	/** Pixel offset of tooltip from the highlight. */
	private Double tooltipOffset;

	/**
	 * Which axes to display in tooltip, ‘x’, ‘y’ or ‘both’, ‘xy’ or ‘yx’ ‘both’ and ‘xy’
	 * are equivalent, ‘yx’ reverses order of labels.
	 */
	private PlotTooltipAxes tooltipAxes;

	/** Use the x and y axes formatters to format the text in the tooltip. */
	private Boolean useAxesFormatters;

	/** sprintf format string for the tooltip. */
	private String tooltipFormatString;

	/**
	 * alternative to tooltipFormatString will format the whole tooltip text, populating
	 * with x, y values as indicated by tooltipAxes option.
	 */
	private String formatString;

	/** Number of y values to expect in the data point array. */
	private Integer yvalues;

	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	public PlotHighlighter()
	{
		renderer = "$.jqplot.Highlighter";
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotHighlighter setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public String getMarkerRenderer()
	{
		return markerRenderer;
	}

	public PlotHighlighter setMarkerRenderer(String markerRenderer)
	{
		this.markerRenderer = markerRenderer;
		return this;
	}

	public Boolean getShowMarker()
	{
		return showMarker;
	}

	public PlotHighlighter setShowMarker(Boolean showMarker)
	{
		this.showMarker = showMarker;
		return this;
	}

	public Double getLineWidthAdjust()
	{
		return lineWidthAdjust;
	}

	public PlotHighlighter setLineWidthAdjust(Double lineWidthAdjust)
	{
		this.lineWidthAdjust = lineWidthAdjust;
		return this;
	}

	public Double getSizeAdjust()
	{
		return sizeAdjust;
	}

	public PlotHighlighter setSizeAdjust(Double sizeAdjust)
	{
		this.sizeAdjust = sizeAdjust;
		return this;
	}

	public Boolean getShowTooltip()
	{
		return showTooltip;
	}

	public PlotHighlighter setShowTooltip(Boolean showTooltip)
	{
		this.showTooltip = showTooltip;
		return this;
	}

	public PlotTooltipLocation getTooltipLocation()
	{
		return tooltipLocation;
	}

	public PlotHighlighter setTooltipLocation(PlotTooltipLocation tooltipLocation)
	{
		this.tooltipLocation = tooltipLocation;
		return this;
	}

	public Boolean getTooltipFade()
	{
		return tooltipFade;
	}

	public PlotHighlighter setTooltipFade(Boolean tooltipFade)
	{
		this.tooltipFade = tooltipFade;
		return this;
	}

	public String getTooltipFadeSpeed()
	{
		return tooltipFadeSpeed;
	}

	public PlotHighlighter setTooltipFadeSpeed(String tooltipFadeSpeed)
	{
		this.tooltipFadeSpeed = tooltipFadeSpeed;
		return this;
	}

	public Double getTooltipOffset()
	{
		return tooltipOffset;
	}

	public PlotHighlighter setTooltipOffset(Double tooltipOffset)
	{
		this.tooltipOffset = tooltipOffset;
		return this;
	}

	public PlotTooltipAxes getTooltipAxes()
	{
		return tooltipAxes;
	}

	public PlotHighlighter setTooltipAxes(PlotTooltipAxes tooltipAxes)
	{
		this.tooltipAxes = tooltipAxes;
		return this;
	}

	public Boolean getUseAxesFormatters()
	{
		return useAxesFormatters;
	}

	public PlotHighlighter setUseAxesFormatters(Boolean useAxesFormatters)
	{
		this.useAxesFormatters = useAxesFormatters;
		return this;
	}

	public String getTooltipFormatString()
	{
		return tooltipFormatString;
	}

	public PlotHighlighter setTooltipFormatString(String tooltipFormatString)
	{
		this.tooltipFormatString = tooltipFormatString;
		return this;
	}

	public String getFormatString()
	{
		return formatString;
	}

	public PlotHighlighter setFormatString(String formatString)
	{
		this.formatString = formatString;
		return this;
	}

	public Integer getYvalues()
	{
		return yvalues;
	}

	public PlotHighlighter setYvalues(Integer yvalues)
	{
		this.yvalues = yvalues;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotHighlighter setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}
}
