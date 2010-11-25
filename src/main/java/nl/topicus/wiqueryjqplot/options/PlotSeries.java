package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotSeries implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to render the series.
	 */
	private boolean show = true;

	/**
	 * either 'xaxis' or 'x2axis'.
	 */
	private String xaxis = "xaxis";

	/**
	 * either 'yaxis' or 'y2axis'.
	 */
	private String yaxis = "yaxis";

	/**
	 * label to use in the legend for this line.
	 */
	private String label = "";

	/**
	 * CSS color spec to use for the line. Determined automatically.
	 */
	private String color = "";

	/**
	 * Width of the line in pixels.
	 */
	private double lineWidth = 2.5;

	/**
	 * show shadow or not.
	 */
	private boolean shadow = true;

	/**
	 * angle (degrees) of the shadow, clockwise from x axis.
	 */
	private double shadowAngle = 45;

	/**
	 * offset from the line of the shadow.
	 */
	private double shadowOffset = 1.25;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset
	 * from the last.
	 */
	private int shadowDepth = 3;

	/**
	 * Opacity of the shadow.
	 */
	private double shadowAlpha = 0.1;

	/**
	 * whether to render the line segments or not.
	 */
	private boolean showLine = true;

	/**
	 * render the data point markers or not.
	 */
	private boolean showMarker = true;

	/**
	 * fill under the line,
	 */
	private boolean fill = false;

	/**
	 * stroke a line at top of fill area.
	 */
	private boolean fillAndStroke = false;

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
	private String renderer = "$.jqplot.LineRenderer";

	/**
	 * options passed to the renderer. LineRenderer has no options.
	 */
	private Object rendererOptions;

	/**
	 * renderer to use to draw the data point markers.
	 */
	private String markerRenderer = "$.jqplot.MarkerRenderer";

	private PlotSeriesMarkerOptions markerOptions;

	public PlotSeries()
	{
	}

	public boolean isShow()
	{
		return show;
	}

	public void setShow(boolean show)
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

	public double getLineWidth()
	{
		return lineWidth;
	}

	public void setLineWidth(double lineWidth)
	{
		this.lineWidth = lineWidth;
	}

	public boolean isShadow()
	{
		return shadow;
	}

	public void setShadow(boolean shadow)
	{
		this.shadow = shadow;
	}

	public double getShadowAngle()
	{
		return shadowAngle;
	}

	public void setShadowAngle(double shadowAngle)
	{
		this.shadowAngle = shadowAngle;
	}

	public double getShadowOffset()
	{
		return shadowOffset;
	}

	public void setShadowOffset(double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
	}

	public int getShadowDepth()
	{
		return shadowDepth;
	}

	public void setShadowDepth(int shadowDepth)
	{
		this.shadowDepth = shadowDepth;
	}

	public double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public void setShadowAlpha(double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
	}

	public boolean isShowLine()
	{
		return showLine;
	}

	public void setShowLine(boolean showLine)
	{
		this.showLine = showLine;
	}

	public boolean isShowMarker()
	{
		return showMarker;
	}

	public void setShowMarker(boolean showMarker)
	{
		this.showMarker = showMarker;
	}

	public boolean isFill()
	{
		return fill;
	}

	public void setFill(boolean fill)
	{
		this.fill = fill;
	}

	public boolean isFillAndStroke()
	{
		return fillAndStroke;
	}

	public void setFillAndStroke(boolean fillAndStroke)
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
