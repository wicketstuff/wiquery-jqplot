package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotGrid implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to draw lines across the grid or not.
	 */
	private Boolean drawGridLines;

	/**
	 * Color of the grid lines.
	 */
	private String gridLineColor;

	/**
	 * CSS color spec for background color of grid.
	 */
	private String background;

	/**
	 * CSS color spec for border around grid.
	 */
	private String borderColor;

	/**
	 * pixel width of border around grid.
	 */
	private Double borderWidth;

	/**
	 * draw a shadow for grid.
	 */
	private Boolean shadow;

	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private Double shadowAngle;

	/**
	 * offset from the line of the shadow.
	 */
	private Double shadowOffset;

	/**
	 * width of the stroke for the shadow.
	 */
	private Double shadowWidth;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by shadowOffset
	 * from the last.
	 */
	private Integer shadowDepth;

	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;

	/**
	 * renderer to use to draw the grid.
	 */
	@JsonSerialize(using = RawSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	/**
	 * options to pass to the renderer. Note, the default CanvasGridRenderer takes no
	 * additional options.
	 */
	private Object rendererOptions;

	public PlotGrid()
	{
	}

	public Boolean isDrawGridLines()
	{
		return drawGridLines;
	}

	public void setDrawGridLines(Boolean drawGridLines)
	{
		this.drawGridLines = drawGridLines;
	}

	public String getGridLineColor()
	{
		return gridLineColor;
	}

	public void setGridLineColor(String gridLineColor)
	{
		this.gridLineColor = gridLineColor;
	}

	public String getBackground()
	{
		return background;
	}

	public void setBackground(String background)
	{
		this.background = background;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public void setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
	}

	public Double getBorderWidth()
	{
		return borderWidth;
	}

	public void setBorderWidth(Double borderWidth)
	{
		this.borderWidth = borderWidth;
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

	public Double getShadowWidth()
	{
		return shadowWidth;
	}

	public void setShadowWidth(Double shadowWidth)
	{
		this.shadowWidth = shadowWidth;
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
}
