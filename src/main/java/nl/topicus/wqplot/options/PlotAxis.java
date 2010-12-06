package nl.topicus.wqplot.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotAxis implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Wether to display the axis on the graph.
	 */
	private Boolean show;

	/**
	 * renderer to use to draw the ticks,
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String tickRenderer;

	/**
	 * Options that will be passed to the tickRenderer, see $.jqplot.AxisTickRenderer
	 * options.
	 */
	private PlotTickOptions tickOptions;

	/**
	 * renderer to use to draw the ticks,
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String labelRenderer;

	/**
	 * Options passed to the label renderer.
	 */
	private PlotLabelOptions labelOptions;

	/**
	 * Label for the axis
	 */
	private String label;

	/**
	 * true to show the axis label.
	 */
	private Boolean showLabel;

	/**
	 * minimum numerical value of the axis. Determined automatically.
	 */
	private Object min;

	/**
	 * maximum numverical value of the axis. Determined automatically.
	 */
	private Object max;

	/**
	 * Autoscale the axis min and max values to provide sensible tick spacing.
	 */
	private Boolean autoscale;

	/**
	 * a factor multiplied by the data range on the axis to give the axis range so that
	 * data points don't fall on the edges of the axis.
	 */
	private Double pad;

	/**
	 * Padding to extend the range above data bounds.
	 */
	private Double padMax;

	/**
	 * Padding to extend the range below data bounds.
	 */
	private Double padMin;

	/**
	 * a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...] array of ticks to
	 * use. Computed automatically.
	 */
	private List<PlotTick> ticks;

	/**
	 * Desired number of ticks.
	 */
	private Integer numberTicks;

	/**
	 * number of units between ticks. Mutually exclusive with numberTicks.
	 */
	private Object tickInterval;

	/**
	 * renderer to use to draw the axis,
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	/**
	 * options to pass to the renderer. LinearAxisRenderer has no options.
	 */
	private PlotAxisRendererOptions rendererOptions;

	/**
	 * wether or not to show the tick labels,
	 */
	private Boolean showTicks;

	/**
	 * wether or not to show the tick marks
	 */
	private Boolean showTickMarks;

	/**
	 * Wether or not to show minor ticks.
	 */
	private Boolean showMinorTicks;

	/**
	 * Use the color of the first series associated with this axis for the tick marks and
	 * line bordering this axis.
	 */
	private Boolean useSeriesColor;

	/**
	 * width of line stroked at the border of the axis.
	 */
	private Double borderWidth;

	/**
	 * color of the border adjacent to the axis.
	 */
	private String borderColor;

	/**
	 * true to try and synchronize tick spacing across multiple axes so that ticks and
	 * grid lines line up.
	 */
	private Boolean syncTicks;

	/**
	 * Approximate pixel spacing between ticks on graph.
	 */
	private Double tickSpacing;

	public PlotAxis()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotAxis setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public String getTickRenderer()
	{
		return tickRenderer;
	}

	public PlotAxis setTickRenderer(String tickRenderer)
	{
		this.tickRenderer = tickRenderer;
		return this;
	}

	public PlotTickOptions getTickOptions()
	{
		if (tickOptions == null)
			tickOptions = new PlotTickOptions();
		return tickOptions;
	}

	public PlotAxis setTickOptions(PlotTickOptions tickOptions)
	{
		this.tickOptions = tickOptions;
		return this;
	}

	public String getLabelRenderer()
	{
		return labelRenderer;
	}

	public PlotAxis setLabelRenderer(String labelRenderer)
	{
		this.labelRenderer = labelRenderer;
		return this;
	}

	public PlotLabelOptions getLabelOptions()
	{
		if (labelOptions == null)
			labelOptions = new PlotLabelOptions();
		return labelOptions;
	}

	public PlotAxis setLabelOptions(PlotLabelOptions labelOptions)
	{
		this.labelOptions = labelOptions;
		return this;
	}

	public String getLabel()
	{
		return label;
	}

	public PlotAxis setLabel(String label)
	{
		this.label = label;
		return this;
	}

	public Boolean getShowLabel()
	{
		return showLabel;
	}

	public PlotAxis setShowLabel(Boolean showLabel)
	{
		this.showLabel = showLabel;
		return this;
	}

	public Object getMin()
	{
		return min;
	}

	public PlotAxis setMin(Object min)
	{
		this.min = min;
		return this;
	}

	public Object getMax()
	{
		return max;
	}

	public PlotAxis setMax(Object max)
	{
		this.max = max;
		return this;
	}

	public Boolean getAutoscale()
	{
		return autoscale;
	}

	public PlotAxis setAutoscale(Boolean autoscale)
	{
		this.autoscale = autoscale;
		return this;
	}

	public Double getPad()
	{
		return pad;
	}

	public PlotAxis setPad(Double pad)
	{
		this.pad = pad;
		return this;
	}

	public Double getPadMax()
	{
		return padMax;
	}

	public PlotAxis setPadMax(Double padMax)
	{
		this.padMax = padMax;
		return this;
	}

	public Double getPadMin()
	{
		return padMin;
	}

	public PlotAxis setPadMin(Double padMin)
	{
		this.padMin = padMin;
		return this;
	}

	public List<PlotTick> getTicks()
	{
		if (ticks == null)
			ticks = new ArrayList<PlotTick>();
		return ticks;
	}

	public PlotAxis setTicks(List<PlotTick> ticks)
	{
		this.ticks = ticks;
		return this;
	}

	public PlotAxis setTicks(Object... ticks)
	{
		List<PlotTick> newTicks = new ArrayList<PlotTick>();
		for (Object curTick : ticks)
		{
			newTicks.add(new PlotTick(curTick));
		}
		this.ticks = newTicks;
		return this;
	}

	public Integer getNumberTicks()
	{
		return numberTicks;
	}

	public PlotAxis setNumberTicks(Integer numberTicks)
	{
		this.numberTicks = numberTicks;
		return this;
	}

	public Object getTickInterval()
	{
		return tickInterval;
	}

	public PlotAxis setTickInterval(Object tickInterval)
	{
		this.tickInterval = tickInterval;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotAxis setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public PlotAxisRendererOptions getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotAxis setRendererOptions(PlotAxisRendererOptions rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return this;
	}

	public Boolean getShowTicks()
	{
		return showTicks;
	}

	public PlotAxis setShowTicks(Boolean showTicks)
	{
		this.showTicks = showTicks;
		return this;
	}

	public Boolean getShowTickMarks()
	{
		return showTickMarks;
	}

	public PlotAxis setShowTickMarks(Boolean showTickMarks)
	{
		this.showTickMarks = showTickMarks;
		return this;
	}

	public Boolean getShowMinorTicks()
	{
		return showMinorTicks;
	}

	public PlotAxis setShowMinorTicks(Boolean showMinorTicks)
	{
		this.showMinorTicks = showMinorTicks;
		return this;
	}

	public Boolean getUseSeriesColor()
	{
		return useSeriesColor;
	}

	public PlotAxis setUseSeriesColor(Boolean useSeriesColor)
	{
		this.useSeriesColor = useSeriesColor;
		return this;
	}

	public Double getBorderWidth()
	{
		return borderWidth;
	}

	public PlotAxis setBorderWidth(Double borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public PlotAxis setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Boolean getSyncTicks()
	{
		return syncTicks;
	}

	public PlotAxis setSyncTicks(Boolean syncTicks)
	{
		this.syncTicks = syncTicks;
		return this;
	}

	public Double getTickSpacing()
	{
		return tickSpacing;
	}

	public PlotAxis setTickSpacing(Double tickSpacing)
	{
		this.tickSpacing = tickSpacing;
		return this;
	}
}
