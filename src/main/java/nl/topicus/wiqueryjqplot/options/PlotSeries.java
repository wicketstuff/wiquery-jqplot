package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

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

	public void setShow(Boolean show)
	{
		this.show = show;
	}

	public String getXaxis()
	{
		return xaxis;
	}

	public void setXaxis(String xaxis)
	{
		this.xaxis = xaxis;
	}

	public String getYaxis()
	{
		return yaxis;
	}

	public void setYaxis(String yaxis)
	{
		this.yaxis = yaxis;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public Double getLineWidth()
	{
		return lineWidth;
	}

	public void setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
	}

	public Boolean isShadow()
	{
		return shadow;
	}

	public void setShadow(Boolean shadow)
	{
		this.shadow = shadow;
	}

	public Double getShadowAngle()
	{
		return shadowAngle;
	}

	public void setShadowAngle(Double shadowAngle)
	{
		this.shadowAngle = shadowAngle;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public void setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public void setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public void setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
	}

	public Boolean isShowLine()
	{
		return showLine;
	}

	public void setShowLine(Boolean showLine)
	{
		this.showLine = showLine;
	}

	public Boolean isShowMarker()
	{
		return showMarker;
	}

	public void setShowMarker(Boolean showMarker)
	{
		this.showMarker = showMarker;
	}

	public Boolean isFill()
	{
		return fill;
	}

	public void setFill(Boolean fill)
	{
		this.fill = fill;
	}

	public Boolean isFillAndStroke()
	{
		return fillAndStroke;
	}

	public void setFillAndStroke(Boolean fillAndStroke)
	{
		this.fillAndStroke = fillAndStroke;
	}

	public String getFillColor()
	{
		return fillColor;
	}

	public void setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
	}

	public Double getFillAlpha()
	{
		return fillAlpha;
	}

	public void setFillAlpha(Double fillAlpha)
	{
		this.fillAlpha = fillAlpha;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public void setRenderer(String renderer)
	{
		this.renderer = renderer;
	}

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public void setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
	}

	public String getMarkerRenderer()
	{
		return markerRenderer;
	}

	public void setMarkerRenderer(String markerRenderer)
	{
		this.markerRenderer = markerRenderer;
	}

	public PlotSeriesMarkerOptions getMarkerOptions()
	{
		return markerOptions;
	}

	public void setMarkerOptions(PlotSeriesMarkerOptions markerOptions)
	{
		this.markerOptions = markerOptions;
	}
}
