package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class PlotAxis implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean show;

	/**
	 * minimum numerical value of the axis. Determined automatically.
	 */
	private Integer min;

	/**
	 * maximum numverical value of the axis. Determined automatically.
	 */
	private Integer max;

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
	 * renderer to use to draw the axis,
	 */
	private String renderer;

	/**
	 * options to pass to the renderer. LinearAxisRenderer has no options.
	 */
	private Object rendererOptions;

	private PlotTickOptions tickOptions;

	/**
	 * wether or not to show the tick labels,
	 */
	private Boolean showTicks;

	/**
	 * wether or not to show the tick marks
	 */
	private Boolean showTickMarks;

	public PlotAxis()
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

	public Integer getMin()
	{
		return min;
	}

	public void setMin(Integer min)
	{
		this.min = min;
	}

	public Integer getMax()
	{
		return max;
	}

	public void setMax(Integer max)
	{
		this.max = max;
	}

	public Double getPad()
	{
		return pad;
	}

	public void setPad(Double pad)
	{
		this.pad = pad;
	}

	public List<PlotTick> getTicks()
	{
		return ticks;
	}

	public void setTicks(List<PlotTick> ticks)
	{
		this.ticks = ticks;
	}

	public Integer getNumberTicks()
	{
		return numberTicks;
	}

	public void setNumberTicks(Integer numberTicks)
	{
		this.numberTicks = numberTicks;
	}

	@JsonSerialize(using = RawSerializer.class)
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

	public PlotTickOptions getTickOptions()
	{
		return tickOptions;
	}

	public void setTickOptions(PlotTickOptions tickOptions)
	{
		this.tickOptions = tickOptions;
	}

	public Boolean isShowTicks()
	{
		return showTicks;
	}

	public void setShowTicks(Boolean showTicks)
	{
		this.showTicks = showTicks;
	}

	public Boolean isShowTickMarks()
	{
		return showTickMarks;
	}

	public void setShowTickMarks(Boolean showTickMarks)
	{
		this.showTickMarks = showTickMarks;
	}
}
