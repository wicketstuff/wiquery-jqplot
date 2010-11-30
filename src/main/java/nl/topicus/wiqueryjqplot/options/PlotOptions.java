package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private boolean stackSeries;

	private PlotTitle title;

	private PlotAxis axesDefaults;

	private PlotAxes axes;

	private PlotSeries seriesDefaults;

	private List<PlotSeries> series;

	private PlotLegend legend;

	private PlotGrid grid;

	public PlotOptions()
	{
	}

	public boolean isStackSeries()
	{
		return stackSeries;
	}

	public void setStackSeries(boolean stackSeries)
	{
		this.stackSeries = stackSeries;
	}

	public PlotTitle getTitle()
	{
		return title;
	}

	public void setTitle(PlotTitle title)
	{
		this.title = title;
	}

	public void setTitle(String title)
	{
		setTitle(new PlotTitle(title));
	}

	public PlotAxis getAxesDefaults()
	{
		return axesDefaults;
	}

	public void setAxesDefaults(PlotAxis axesDefaults)
	{
		this.axesDefaults = axesDefaults;
	}

	public PlotAxes getAxes()
	{
		return axes;
	}

	public void setAxes(PlotAxes axes)
	{
		this.axes = axes;
	}

	public PlotSeries getSeriesDefaults()
	{
		return seriesDefaults;
	}

	public void setSeriesDefaults(PlotSeries seriesDefaults)
	{
		this.seriesDefaults = seriesDefaults;
	}

	public List<PlotSeries> getSeries()
	{
		return series;
	}

	public void setSeries(List<PlotSeries> series)
	{
		this.series = series;
	}

	public PlotLegend getLegend()
	{
		return legend;
	}

	public void setLegend(PlotLegend legend)
	{
		this.legend = legend;
	}

	public PlotGrid getGrid()
	{
		return grid;
	}

	public void setGrid(PlotGrid grid)
	{
		this.grid = grid;
	}
}
