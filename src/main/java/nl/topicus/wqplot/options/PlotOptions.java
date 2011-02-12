package nl.topicus.wqplot.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * default options that will be applied to all axes. see {@link PlotAxis} for axes
	 * options.
	 */
	private PlotAxis axesDefaults;

	/**
	 * default options that will be applied to all series. see {@link PlotSeries} for
	 * series options.
	 */
	private PlotSeries seriesDefaults;

	/**
	 * Array of series object options. see {@link PlotSeries} for series specific options.
	 */
	private List<PlotSeries> series;

	/**
	 * up to 4 axes are supported, each with it’s own options, See {@link PlotAxis} for
	 * axis specific options.
	 */
	private PlotAxes axes;

	/**
	 * See {@link PlotGrid} for grid specific options.
	 */
	private PlotGrid grid;

	/**
	 * see {@link PlotLegend}
	 */
	private PlotLegend legend;

	/**
	 * Ann array of CSS color specifications that will be applied, in order, to the series
	 * in the plot. Colors will wrap around so, if their are more series than colors,
	 * colors will be reused starting at the beginning. For pie charts, this specifies the
	 * colors of the slices.
	 */
	private List<String> seriesColors;

	/**
	 * false to not sort the data passed in by the user. Many bar, stakced and other
	 * graphs as well as many plugins depend on having sorted data.
	 */
	private Boolean sortData;

	/**
	 * css spec for the font-size attribute. Default for the entire plot.
	 */
	private String fontSize;

	/**
	 * Title object. See Title for specific options. As a shortcut, you can specify the
	 * title option as just a string like: title: ‘My Plot’ and this will create a new
	 * title object with the specified text.
	 */
	private PlotTitle title;

	/**
	 * true or false, creates a stack or “mountain” plot. Not all series renderers may
	 * implement this option.
	 */
	private Boolean stackSeries;

	/**
	 * 1-D data series are internally converted into 2-D [x,y] data point arrays by
	 * jqPlot. This is the default starting value for the missing x or y value. The added
	 * data will be a monotonically increasing series (e.g. [1, 2, 3, ...]) starting at
	 * this value.
	 */
	private Integer defaultAxisStart;

	private PlotCursor cursor;

	private PlotHighlighter highlighter;

	public PlotOptions()
	{
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

	public List<String> getSeriesColors()
	{
		if (seriesColors == null)
			seriesColors = new ArrayList<String>();
		return seriesColors;
	}

	public PlotOptions setSeriesColors(List<String> seriesColors)
	{
		this.seriesColors = seriesColors;
		return this;
	}

	public Boolean getSortData()
	{
		return sortData;
	}

	public PlotOptions setSortData(Boolean sortData)
	{
		this.sortData = sortData;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
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

	public Boolean getStackSeries()
	{
		return stackSeries;
	}

	public PlotOptions setStackSeries(Boolean stackSeries)
	{
		this.stackSeries = stackSeries;
		return this;
	}

	public Integer getDefaultAxisStart()
	{
		return defaultAxisStart;
	}

	public PlotOptions setDefaultAxisStart(Integer defaultAxisStart)
	{
		this.defaultAxisStart = defaultAxisStart;
		return this;
	}

	public PlotCursor getCursor()
	{
		if (cursor == null)
			cursor = new PlotCursor();
		return cursor;
	}

	public PlotOptions setCursor(PlotCursor cursor)
	{
		this.cursor = cursor;
		return this;
	}

	public PlotHighlighter getHighlighter()
	{
		if (highlighter == null)
			highlighter = new PlotHighlighter();
		return highlighter;
	}

	public PlotOptions setHighlighter(PlotHighlighter highlighter)
	{
		this.highlighter = highlighter;
		return this;
	}
}
