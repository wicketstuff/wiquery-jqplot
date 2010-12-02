package nl.topicus.wiqueryjqplot.options;

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

	private Boolean show;

	/**
	 * minimum numerical value of the axis. Determined automatically.
	 */
	private Object min;

	/**
	 * maximum numverical value of the axis. Determined automatically.
	 */
	private Object max;

	/**
	 * a factor multiplied by the data range on the axis to give the axis range so that
	 * data points don't fall on the edges of the axis.
	 */
	private Double pad;

	/**
	 * a 1D [val1, val2, ...], or 2D [[val, label], [val, label], ...] array of ticks to
	 * use. Computed automatically.
	 */
	private List<PlotTick> ticks;

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
	private Object rendererOptions;

	/**
	 * renderer to use to draw the ticks,
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String tickRenderer;

	private PlotTickOptions tickOptions;

	/**
	 * wether or not to show the tick labels,
	 */
	private Boolean showTicks;

	/**
	 * wether or not to show the tick marks
	 */
	private Boolean showTickMarks;

	/**
	 * Label for the axis
	 */
	private String label;

	/**
	 * renderer to use to draw the ticks,
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String labelRenderer;

	private Boolean autoscale;

	public PlotAxis()
	{
	}

	public Boolean isShow()
	{
		return show;
	}

	public PlotAxis setShow(Boolean show)
	{
		this.show = show;
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

	public Double getPad()
	{
		return pad;
	}

	public PlotAxis setPad(Double pad)
	{
		this.pad = pad;
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

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotAxis setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
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

	public Boolean isShowTicks()
	{
		return showTicks;
	}

	public PlotAxis setShowTicks(Boolean showTicks)
	{
		this.showTicks = showTicks;
		return this;
	}

	public Boolean isShowTickMarks()
	{
		return showTickMarks;
	}

	public PlotAxis setShowTickMarks(Boolean showTickMarks)
	{
		this.showTickMarks = showTickMarks;
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

	public String getLabelRenderer()
	{
		return labelRenderer;
	}

	public PlotAxis setLabelRenderer(String labelRenderer)
	{
		this.labelRenderer = labelRenderer;
		return this;
	}

	public Boolean isAutoscale()
	{
		return autoscale;
	}

	public PlotAxis setAutoscale(Boolean autoscale)
	{
		this.autoscale = autoscale;
		return this;
	}
}
