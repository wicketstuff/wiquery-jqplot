package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean stackSeries;

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

	public Boolean isStackSeries()
	{
		return stackSeries;
	}

	public PlotOptions setStackSeries(Boolean stackSeries)
	{
		this.stackSeries = stackSeries;
		return this;
	}

	public PlotTitle getTitle()
	{
		if (title == null)
			title = new PlotTitle();
		return title;
	}

	public PlotOptions setTitle(PlotTitle title)
	{
		this.title = title;
		return this;
	}

	public PlotOptions setTitle(String title)
	{
		setTitle(new PlotTitle(title));
		return this;
	}

	public PlotAxis getAxesDefaults()
	{
		if (axesDefaults == null)
			axesDefaults = new PlotAxis();
		return axesDefaults;
	}

	public PlotOptions setAxesDefaults(PlotAxis axesDefaults)
	{
		this.axesDefaults = axesDefaults;
		return this;
	}

	public PlotAxes getAxes()
	{
		if (axes == null)
			axes = new PlotAxes();
		return axes;
	}

	public PlotOptions setAxes(PlotAxes axes)
	{
		this.axes = axes;
		return this;
	}

	public PlotSeries getSeriesDefaults()
	{
		if (seriesDefaults == null)
			seriesDefaults = new PlotSeries();
		return seriesDefaults;
	}

	public PlotOptions setSeriesDefaults(PlotSeries seriesDefaults)
	{
		this.seriesDefaults = seriesDefaults;
		return this;
	}

	public PlotSeries addNewSeries()
	{
		PlotSeries ret = new PlotSeries();
		getSeries().add(ret);
		return ret;
	}

	public List<PlotSeries> getSeries()
	{
		if (series == null)
			series = new ArrayList<PlotSeries>();
		return series;
	}

	public PlotOptions setSeries(List<PlotSeries> series)
	{
		this.series = series;
		return this;
	}

	public PlotLegend getLegend()
	{
		if (legend == null)
			legend = new PlotLegend();
		return legend;
	}

	public PlotOptions setLegend(PlotLegend legend)
	{
		this.legend = legend;
		return this;
	}

	public PlotGrid getGrid()
	{
		if (grid == null)
			grid = new PlotGrid();
		return grid;
	}

	public PlotOptions setGrid(PlotGrid grid)
	{
		this.grid = grid;
		return this;
	}
}
