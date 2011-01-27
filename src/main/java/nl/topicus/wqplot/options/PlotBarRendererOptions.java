package nl.topicus.wqplot.options;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotBarRendererOptions extends PlotSeriesRendererOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * Number of pixels between adjacent bars at the same axis value.
	 */
	private Double barPadding;

	/**
	 * Number of pixels between groups of bars at adjacent axis values.
	 */
	private Double barMargin;

	/**
	 * ’vertical’ = up and down bars, ‘horizontal’ = side to side bars
	 */
	private PlotBarDirection barDirection;

	/**
	 * Width of the bar in pixels (auto by devaul). null = calculated automatically.
	 */
	private Double barWidth;

	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the
	 * shadow from the last.
	 */
	private Double shadowOffset;

	/**
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the
	 * last.
	 */
	private Integer shadowDepth;

	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 */
	private Double shadowAlpha;

	/**
	 * true to enable waterfall plot.
	 */
	private Boolean waterfall;

	/**
	 * group bars into this many groups
	 */
	private Integer groups;

	/**
	 * true to color each bar of a series separately rather than have every bar of a given
	 * series the same color. If used for non-stacked multiple series bar plots, user
	 * should specify a separate ‘seriesColors’ array for each series. Otherwise, each
	 * series will set their bars to the same color array. This option has no Effect for
	 * stacked bar charts and is disabled.
	 */
	private Boolean varyBarColor;

	/**
	 * True to highlight slice when moused over. This must be false to enable
	 * highlightMouseDown to highlight when clicking on a slice.
	 */
	private Boolean highlightMouseOver;

	/**
	 * True to highlight when a mouse button is pressed over a slice. This will be
	 * disabled if highlightMouseOver is true.
	 */
	private Boolean highlightMouseDown;

	/**
	 * an array of colors to use when highlighting a bar.
	 */
	private List<String> highlightColors;

	public PlotBarRendererOptions()
	{
	}

	public Double getBarPadding()
	{
		return barPadding;
	}

	public PlotBarRendererOptions setBarPadding(Double barPadding)
	{
		this.barPadding = barPadding;
		return this;
	}

	public Double getBarMargin()
	{
		return barMargin;
	}

	public PlotBarRendererOptions setBarMargin(Double barMargin)
	{
		this.barMargin = barMargin;
		return this;
	}

	public PlotBarDirection getBarDirection()
	{
		return barDirection;
	}

	public PlotBarRendererOptions setBarDirection(PlotBarDirection barDirection)
	{
		this.barDirection = barDirection;
		return this;
	}

	public Double getBarWidth()
	{
		return barWidth;
	}

	public PlotBarRendererOptions setBarWidth(Double barWidth)
	{
		this.barWidth = barWidth;
		return this;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public PlotBarRendererOptions setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public PlotBarRendererOptions setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return this;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public PlotBarRendererOptions setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public Boolean getWaterfall()
	{
		return waterfall;
	}

	public PlotBarRendererOptions setWaterfall(Boolean waterfall)
	{
		this.waterfall = waterfall;
		return this;
	}

	public Integer getGroups()
	{
		return groups;
	}

	public PlotBarRendererOptions setGroups(Integer groups)
	{
		this.groups = groups;
		return this;
	}

	public Boolean getVaryBarColor()
	{
		return varyBarColor;
	}

	public PlotBarRendererOptions setVaryBarColor(Boolean varyBarColor)
	{
		this.varyBarColor = varyBarColor;
		return this;
	}

	public Boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	public PlotBarRendererOptions setHighlightMouseOver(Boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public Boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	public PlotBarRendererOptions setHighlightMouseDown(Boolean highlightMouseDown)
	{
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public List<String> getHighlightColors()
	{
		if (highlightColors == null)
			highlightColors = new ArrayList<String>();
		return highlightColors;
	}

	public PlotBarRendererOptions setHighlightColors(List<String> highlightColors)
	{
		this.highlightColors = highlightColors;
		return this;
	}

}
