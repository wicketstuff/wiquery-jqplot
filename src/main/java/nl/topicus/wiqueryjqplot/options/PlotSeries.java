package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
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
	 * label to use in the legend for this line.
	 */
	private String label;

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
	 * whether to render the line segments or not.
	 */
	private Boolean showLine;

	/**
	 * render the data point markers or not.
	 */
	private Boolean showMarker;

	/**
	 * fill under the line,
	 */
	private Boolean fill;

	/**
	 * stroke a line at top of fill area.
	 */
	private Boolean fillAndStroke;

	/**
	 * custom fill color for filled lines (default is line color).
	 */
	private String fillColor;

	/**
	 * custom alpha to apply to fillColor.
	 */
	private Double fillAlpha;

	/**
	 * renderer used to draw the series.
	 */
	private String renderer;

	/**
	 * options passed to the renderer. LineRenderer has no options.
	 */
	private Object rendererOptions;

	/**
	 * renderer to use to draw the data point markers.
	 */
	private String markerRenderer;

	private PlotSeriesMarkerOptions markerOptions;

	public PlotSeries()
	{
	}

	public Boolean isShow()
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

	public String getLabel()
	{
		return label;
	}

	public PlotSeries setLabel(String label)
	{
		this.label = label;
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

	public Boolean isShadow()
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

	public Boolean isShowLine()
	{
		return showLine;
	}

	public PlotSeries setShowLine(Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}

	public Boolean isShowMarker()
	{
		return showMarker;
	}

	public PlotSeries setShowMarker(Boolean showMarker)
	{
		this.showMarker = showMarker;
		return this;
	}

	public Boolean isFill()
	{
		return fill;
	}

	public PlotSeries setFill(Boolean fill)
	{
		this.fill = fill;
		return this;
	}

	public Boolean isFillAndStroke()
	{
		return fillAndStroke;
	}

	public PlotSeries setFillAndStroke(Boolean fillAndStroke)
	{
		this.fillAndStroke = fillAndStroke;
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

	public String getRenderer()
	{
		return renderer;
	}

	public PlotSeries setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotSeries setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
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
}
