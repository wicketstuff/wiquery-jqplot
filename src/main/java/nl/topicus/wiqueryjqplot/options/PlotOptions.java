package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;
import java.util.List;

public class PlotOptions implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean stackSeries;

	private PlotTitle title;

	private PlotAxis axesDefaults;

	private List<PlotSeries> series;

	public PlotOptions() {
	}

	public boolean isStackSeries() {
		return stackSeries;
	}

	public void setStackSeries(boolean stackSeries) {
		this.stackSeries = stackSeries;
	}

	public PlotTitle getTitle() {
		return title;
	}

	public void setTitle(PlotTitle title) {
		this.title = title;
	}

	public void setTitle(String title) {
		setTitle(new PlotTitle(title));
	}

	public PlotAxis getAxesDefaults() {
		return axesDefaults;
	}

	public void setAxesDefaults(PlotAxis axesDefaults) {
		this.axesDefaults = axesDefaults;
	}

	public List<PlotSeries> getSeries() {
		return series;
	}

	public void setSeries(List<PlotSeries> series) {
		this.series = series;
	}
}
