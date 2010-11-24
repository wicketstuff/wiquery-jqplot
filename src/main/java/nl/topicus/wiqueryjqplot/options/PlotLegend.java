package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotLegend implements Serializable {
	private static final long serialVersionUID = 1L;
	private boolean show = false;
	/**
	 * compass direction, nw, n, ne, e, se, s, sw, w.
	 */
	private PlotLegendLocation location = PlotLegendLocation.ne;
	/**
	 * pixel offset of the legend box from the x (or x2) axis.
	 */
	private int xoffset = 12;
	/**
	 * pixel offset of the legend box from the y (or y2) axis.
	 */
	private int yoffset = 12;

	public PlotLegend() {
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public PlotLegendLocation getLocation() {
		return location;
	}

	public void setLocation(PlotLegendLocation location) {
		this.location = location;
	}

	public int getXoffset() {
		return xoffset;
	}

	public void setXoffset(int xoffset) {
		this.xoffset = xoffset;
	}

	public int getYoffset() {
		return yoffset;
	}

	public void setYoffset(int yoffset) {
		this.yoffset = yoffset;
	}
}
