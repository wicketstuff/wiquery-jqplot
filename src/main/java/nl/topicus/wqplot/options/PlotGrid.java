package nl.topicus.wqplot.options;

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
	 * width of the grid lines.
	 */
	private Double gridLineWidth;

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
	 * True to draw border around grid.
	 */
	private Boolean drawBorder;

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
	 * an optional css color spec for the shadow in ‘rgba(n, n, n, n)’ form
	 */
	private String shadowColor;

	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;

	/**
	 * renderer to use to draw the grid.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	/**
	 * options to pass to the renderer. Note, the default CanvasGridRenderer takes no
	 * additional options.
	 */
	private Object rendererOptions;

	public PlotGrid()
	{
	}

	public Boolean getDrawGridLines()
	{
		return drawGridLines;
	}

	public PlotGrid setDrawGridLines(Boolean drawGridLines)
	{
		this.drawGridLines = drawGridLines;
		return this;
	}

	public String getGridLineColor()
	{
		return gridLineColor;
	}

	public PlotGrid setGridLineColor(String gridLineColor)
	{
		this.gridLineColor = gridLineColor;
		return this;
	}

	public Double getGridLineWidth()
	{
		return gridLineWidth;
	}

	public PlotGrid setGridLineWidth(Double gridLineWidth)
	{
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	public String getBackground()
	{
		return background;
	}

	public PlotGrid setBackground(String background)
	{
		this.background = background;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public PlotGrid setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Double getBorderWidth()
	{
		return borderWidth;
	}

	public PlotGrid setBorderWidth(Double borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getDrawBorder()
	{
		return drawBorder;
	}

	public PlotGrid setDrawBorder(Boolean drawBorder)
	{
		this.drawBorder = drawBorder;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public PlotGrid setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Double getShadowAngle()
	{
		return shadowAngle;
	}

	public PlotGrid setShadowAngle(Double shadowAngle)
	{
		this.shadowAngle = shadowAngle;
		return this;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public PlotGrid setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Double getShadowWidth()
	{
		return shadowWidth;
	}

	public PlotGrid setShadowWidth(Double shadowWidth)
	{
		this.shadowWidth = shadowWidth;
		return this;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public PlotGrid setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return this;
	}

	public String getShadowColor()
	{
		return shadowColor;
	}

	public PlotGrid setShadowColor(String shadowColor)
	{
		this.shadowColor = shadowColor;
		return this;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public PlotGrid setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotGrid setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotGrid setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return this;
	}
}
