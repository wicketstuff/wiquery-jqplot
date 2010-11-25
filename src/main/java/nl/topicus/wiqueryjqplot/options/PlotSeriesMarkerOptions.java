package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotSeriesMarkerOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to show data point markers.
	 */
	private boolean show = true;

	/**
	 * circle, diamond, square, filledCircle. filledDiamond or filledSquare.
	 */
	private PlotMarkerStyle style = PlotMarkerStyle.filledCircle;

	/**
	 * width of the stroke drawing the marker.
	 */
	private double lineWidth = 2;

	/**
	 * size (diameter, edge length, etc.) of the marker.
	 */
	private double size = 9;

	/**
	 * color of marker, set to color of line by default.
	 */
	private String color = "#666666";

	/**
	 * wether to draw shadow on marker or not.
	 */
	private boolean shadow = true;

	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private double shadowAngle = 45;

	/**
	 * offset from the line of the shadow,
	 */
	private double shadowOffset = 1;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke/ offset by shadowOffset
	 * from the last.
	 */
	private int shadowDepth = 3;

	/**
	 * Opacity of the shadow
	 */
	private double shadowAlpha = 0.07;

	public PlotSeriesMarkerOptions()
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

	public PlotMarkerStyle getStyle()
	{
		return style;
	}

	public void setStyle(PlotMarkerStyle style)
	{
		this.style = style;
	}

	public double getLineWidth()
	{
		return lineWidth;
	}

	public void setLineWidth(double lineWidth)
	{
		this.lineWidth = lineWidth;
	}

	public double getSize()
	{
		return size;
	}

	public void setSize(double size)
	{
		this.size = size;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
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
}
