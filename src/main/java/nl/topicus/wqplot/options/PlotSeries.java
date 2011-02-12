package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotSeries implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to render the series.
	 */
	private Boolean show;

	/**
	 * either 'xaxis' or 'x2axis'.
	 */
	private String xaxis;

	/**
	 * either 'yaxis' or 'y2axis'.
	 */
	private String yaxis;

	/**
	 * renderer used to draw the series.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	/**
	 * options passed to the renderer. LineRenderer has no options.
	 */
	private PlotSeriesRendererOptions rendererOptions;

	/**
	 * label to use in the legend for this line.
	 */
	private String label;

	/**
	 * true to show label for this series in the legend.
	 */
	private Boolean showLabel;

	/**
	 * CSS color spec to use for the line. Determined automatically.
	 */
	private String color;

	/**
	 * Width of the line in pixels.
	 */
	private Double lineWidth;

	/**
	 * show shadow or not.
	 */
	private Boolean shadow;

	/**
	 * angle (degrees) of the shadow, clockwise from x axis.
	 */
	private Double shadowAngle;

	/**
	 * offset from the line of the shadow.
	 */
	private Double shadowOffset;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset
	 * from the last.
	 */
	private Integer shadowDepth;

	/**
	 * Opacity of the shadow.
	 */
	private Double shadowAlpha;

	/**
	 * wether line segments should be be broken at null value. False will join point on
	 * either side of line.
	 */
	private Boolean breakOnNull;

	/**
	 * renderer to use to draw the data point markers.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String markerRenderer;

	/**
	 * renderer specific options to pass to the markerRenderer, see
	 * $.jqplot.MarkerRenderer.
	 */
	private PlotSeriesMarkerOptions markerOptions;

	/**
	 * whether to render the line segments or not.
	 */
	private Boolean showLine;

	/**
	 * render the data point markers or not.
	 */
	private Boolean showMarker;

	/**
	 * 0 based index of this series in the plot series array.
	 */
	private Integer index;

	/**
	 * fill under the line,
	 */
	private Boolean fill;

	/**
	 * custom fill color for filled lines (default is line color).
	 */
	private String fillColor;

	/**
	 * custom alpha to apply to fillColor.
	 */
	private Double fillAlpha;

	/**
	 * stroke a line at top of fill area.
	 */
	private Boolean fillAndStroke;

	/**
	 * true to not stack this series with other series in the plot. To render properly,
	 * non-stacked series must come after any stacked series in the plot’s data series
	 * array. So, the plot’s data series array would look like:
	 * 
	 * [stackedSeries1, stackedSeries2, ..., nonStackedSeries1, nonStackedSeries2, ...]
	 * disableStack will put a gap in the stacking order of series, and subsequent stacked
	 * series will not fill down through the non-stacked series and will most likely not
	 * stack properly on top of the non-stacked series.
	 */
	private Boolean disableStack;

	/**
	 * how close or far (in pixels) the cursor must be from a point marker to detect the
	 * point.
	 */
	private Double neighborThreshold;

	/**
	 * true will force bar and filled series to fill toward zero on the fill Axis.
	 */
	private Boolean fillToZero;

	/**
	 * fill a filled series to this value on the fill axis. Works in conjunction with
	 * fillToZero, so that must be true.
	 */
	private Object fillToValue;

	/**
	 * Either ‘x’ or ‘y’. Which axis to fill the line toward if fillToZero is true. ‘y’
	 * means fill up/down to 0 on the y axis for this series.
	 */
	private String fillAxis;

	/** true to color negative values differently in filled and bar charts. */
	private Boolean useNegativeColors;

	private PlotPointLabels pointLabels;

	public PlotSeries()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotSeries setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public String getXaxis()
	{
		return xaxis;
	}

	public PlotSeries setXaxis(String xaxis)
	{
		this.xaxis = xaxis;
		return this;
	}

	public String getYaxis()
	{
		return yaxis;
	}

	public PlotSeries setYaxis(String yaxis)
	{
		this.yaxis = yaxis;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotSeries setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public PlotSeriesRendererOptions getRendererOptions()
	{
		if (rendererOptions == null)
			rendererOptions = new PlotSeriesRendererOptions();
		return rendererOptions;
	}

	public PlotSeries setRendererOptions(PlotSeriesRendererOptions rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return this;
	}

	public String getLabel()
	{
		return label;
	}

	public PlotSeries setLabel(String label)
	{
		this.label = label;
		return this;
	}

	public Boolean getShowLabel()
	{
		return showLabel;
	}

	public PlotSeries setShowLabel(Boolean showLabel)
	{
		this.showLabel = showLabel;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public PlotSeries setColor(String color)
	{
		this.color = color;
		return this;
	}

	public Double getLineWidth()
	{
		return lineWidth;
	}

	public PlotSeries setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public PlotSeries setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Double getShadowAngle()
	{
		return shadowAngle;
	}

	public PlotSeries setShadowAngle(Double shadowAngle)
	{
		this.shadowAngle = shadowAngle;
		return this;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public PlotSeries setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public PlotSeries setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return this;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public PlotSeries setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public Boolean getBreakOnNull()
	{
		return breakOnNull;
	}

	public PlotSeries setBreakOnNull(Boolean breakOnNull)
	{
		this.breakOnNull = breakOnNull;
		return this;
	}

	public String getMarkerRenderer()
	{
		return markerRenderer;
	}

	public PlotSeries setMarkerRenderer(String markerRenderer)
	{
		this.markerRenderer = markerRenderer;
		return this;
	}

	public PlotSeriesMarkerOptions getMarkerOptions()
	{
		if (markerOptions == null)
			markerOptions = new PlotSeriesMarkerOptions();
		return markerOptions;
	}

	public PlotSeries setMarkerOptions(PlotSeriesMarkerOptions markerOptions)
	{
		this.markerOptions = markerOptions;
		return this;
	}

	public Boolean getShowLine()
	{
		return showLine;
	}

	public PlotSeries setShowLine(Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}

	public Boolean getShowMarker()
	{
		return showMarker;
	}

	public PlotSeries setShowMarker(Boolean showMarker)
	{
		this.showMarker = showMarker;
		return this;
	}

	public Integer getIndex()
	{
		return index;
	}

	public PlotSeries setIndex(Integer index)
	{
		this.index = index;
		return this;
	}

	public Boolean getFill()
	{
		return fill;
	}

	public PlotSeries setFill(Boolean fill)
	{
		this.fill = fill;
		return this;
	}

	public String getFillColor()
	{
		return fillColor;
	}

	public PlotSeries setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return this;
	}

	public Double getFillAlpha()
	{
		return fillAlpha;
	}

	public PlotSeries setFillAlpha(Double fillAlpha)
	{
		this.fillAlpha = fillAlpha;
		return this;
	}

	public Boolean getFillAndStroke()
	{
		return fillAndStroke;
	}

	public PlotSeries setFillAndStroke(Boolean fillAndStroke)
	{
		this.fillAndStroke = fillAndStroke;
		return this;
	}

	public Boolean getDisableStack()
	{
		return disableStack;
	}

	public PlotSeries setDisableStack(Boolean disableStack)
	{
		this.disableStack = disableStack;
		return this;
	}

	public Double getNeighborThreshold()
	{
		return neighborThreshold;
	}

	public PlotSeries setNeighborThreshold(Double neighborThreshold)
	{
		this.neighborThreshold = neighborThreshold;
		return this;
	}

	public Boolean getFillToZero()
	{
		return fillToZero;
	}

	public PlotSeries setFillToZero(Boolean fillToZero)
	{
		this.fillToZero = fillToZero;
		return this;
	}

	public Object getFillToValue()
	{
		return fillToValue;
	}

	public PlotSeries setFillToValue(Object fillToValue)
	{
		this.fillToValue = fillToValue;
		return this;
	}

	public String getFillAxis()
	{
		return fillAxis;
	}

	public PlotSeries setFillAxis(String fillAxis)
	{
		this.fillAxis = fillAxis;
		return this;
	}

	public Boolean getUseNegativeColors()
	{
		return useNegativeColors;
	}

	public PlotSeries setUseNegativeColors(Boolean useNegativeColors)
	{
		this.useNegativeColors = useNegativeColors;
		return this;
	}

	public PlotPointLabels getPointLabels()
	{
		if (pointLabels == null)
			pointLabels = new PlotPointLabels();
		return pointLabels;
	}

	public PlotSeries setPlotPointLabels(PlotPointLabels plotPointLabels)
	{
		this.pointLabels = plotPointLabels;
		return this;
	}
}
