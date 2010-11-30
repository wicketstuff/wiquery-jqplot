package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotSeriesMarkerOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to show data point markers.
	 */
	private Boolean show;

	/**
	 * circle, diamond, square, filledCircle. filledDiamond or filledSquare.
	 */
	private PlotMarkerStyle style;

	/**
	 * width of the stroke drawing the marker.
	 */
	private Double lineWidth;

	/**
	 * size (diameter, edge length, etc.) of the marker.
	 */
	private Double size;

	/**
	 * color of marker, set to color of line by default.
	 */
	private String color;

	/**
	 * wether to draw shadow on marker or not.
	 */
	private Boolean shadow;

	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private Double shadowAngle;

	/**
	 * offset from the line of the shadow,
	 */
	private Double shadowOffset;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke/ offset by shadowOffset
	 * from the last.
	 */
	private Integer shadowDepth;

	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;

	public PlotSeriesMarkerOptions()
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

	public PlotMarkerStyle getStyle()
	{
		return style;
	}

	public void setStyle(PlotMarkerStyle style)
	{
		this.style = style;
	}

	public Double getLineWidth()
	{
		return lineWidth;
	}

	public void setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
	}

	public Double getSize()
	{
		return size;
	}

	public void setSize(Double size)
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
}
