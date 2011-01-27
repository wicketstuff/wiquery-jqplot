package nl.topicus.wqplot.options;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotBubbleRendererOptions extends PlotSeriesRendererOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * True to vary the color of each bubble in this series according to the seriesColors
	 * array. False to set each bubble to the color specified on this series. This has no
	 * effect if a css background color option is specified in the renderer css options.
	 */
	private Boolean varyBubbleColors;

	/**
	 * True to scale the bubble radius based on plot size. False will use the radius value
	 * as provided as a raw pixel value for bubble radius.
	 */
	private Boolean autoscaleBubbles;

	/**
	 * Multiplier the bubble size if autoscaleBubbles is true.
	 */
	private Double autoscaleMultiplier;

	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart. 0
	 * means no adjustment for number of bubbles. Negative values will decrease size of
	 * bubbles as more bubbles are added. Values between 0 and -0.2 should work well.
	 */
	private Double autoscalePointsFactor;

	/**
	 * True to escape html in bubble label text.
	 */
	private Boolean escapeHtml;

	/**
	 * True to highlight bubbles when moused over. This must be false to enable
	 * highlightMouseDown to highlight when clicking on a slice.
	 */
	private Boolean highlightMouseOver;

	/**
	 * True to highlight when a mouse button is pressed over a bubble. This will be
	 * disabled if highlightMouseOver is true.
	 */
	private Boolean highlightMouseDown;

	/**
	 * An array of colors to use when highlighting a slice. Calculated automatically if
	 * not supplied.
	 */
	private List<String> highlightColors;

	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 */
	private Double bubbleAlpha;

	/**
	 * Alpha transparency to apply when highlighting bubble. Set to value of bubbleAlpha
	 * by default.
	 */
	private Double highlightAlpha;

	/**
	 * True to color the bubbles with gradient fills instead of flat colors. NOT AVAILABLE
	 * IN IE due to lack of excanvas support for radial gradient fills. will be ignored in
	 * IE.
	 */
	private Boolean bubbleGradients;

	/**
	 * True to show labels on bubbles (if any), false to not show.
	 */
	private Boolean showLabels;

	public PlotBubbleRendererOptions()
	{
	}

	public Boolean getVaryBubbleColors()
	{
		return varyBubbleColors;
	}

	public PlotBubbleRendererOptions setVaryBubbleColors(Boolean varyBubbleColors)
	{
		this.varyBubbleColors = varyBubbleColors;
		return this;
	}

	public Boolean getAutoscaleBubbles()
	{
		return autoscaleBubbles;
	}

	public PlotBubbleRendererOptions setAutoscaleBubbles(Boolean autoscaleBubbles)
	{
		this.autoscaleBubbles = autoscaleBubbles;
		return this;
	}

	public Double getAutoscaleMultiplier()
	{
		return autoscaleMultiplier;
	}

	public PlotBubbleRendererOptions setAutoscaleMultiplier(Double autoscaleMultiplier)
	{
		this.autoscaleMultiplier = autoscaleMultiplier;
		return this;
	}

	public Double getAutoscalePointsFactor()
	{
		return autoscalePointsFactor;
	}

	public PlotBubbleRendererOptions setAutoscalePointsFactor(Double autoscalePointsFactor)
	{
		this.autoscalePointsFactor = autoscalePointsFactor;
		return this;
	}

	public Boolean getEscapeHtml()
	{
		return escapeHtml;
	}

	public PlotBubbleRendererOptions setEscapeHtml(Boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return this;
	}

	public Boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	public PlotBubbleRendererOptions setHighlightMouseOver(Boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public Boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	public PlotBubbleRendererOptions setHighlightMouseDown(Boolean highlightMouseDown)
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

	public PlotBubbleRendererOptions setHighlightColors(List<String> highlightColors)
	{
		this.highlightColors = highlightColors;
		return this;
	}

	public Double getBubbleAlpha()
	{
		return bubbleAlpha;
	}

	public PlotBubbleRendererOptions setBubbleAlpha(Double bubbleAlpha)
	{
		this.bubbleAlpha = bubbleAlpha;
		return this;
	}

	public Double getHighlightAlpha()
	{
		return highlightAlpha;
	}

	public PlotBubbleRendererOptions setHighlightAlpha(Double highlightAlpha)
	{
		this.highlightAlpha = highlightAlpha;
		return this;
	}

	public Boolean getBubbleGradients()
	{
		return bubbleGradients;
	}

	public PlotBubbleRendererOptions setBubbleGradients(Boolean bubbleGradients)
	{
		this.bubbleGradients = bubbleGradients;
		return this;
	}

	public Boolean getShowLabels()
	{
		return showLabels;
	}

	public PlotBubbleRendererOptions setShowLabels(Boolean showLabels)
	{
		this.showLabels = showLabels;
		return this;
	}
}
