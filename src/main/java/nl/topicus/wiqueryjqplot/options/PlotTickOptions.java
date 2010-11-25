package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotTickOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Where to put the tick mark on the axis 'outside', 'inside' or 'cross'
	 */
	private PlotTickMarkPlacement mark = PlotTickMarkPlacement.outside;

	private boolean showMark = true;

	/**
	 * wether to draw a gridline (across the whole grid) at this tick,
	 */
	private boolean showGridline = true;

	/**
	 * length the tick will extend beyond the grid in pixels. For 'cross', length will be
	 * added above and below the grid boundary,
	 */
	private int markSize = 4;

	/**
	 * wether to show the tick (mark and label),
	 */
	private boolean show = true;

	/**
	 * wether to show the text label at the tick,
	 */
	private boolean showLabel = true;

	/**
	 * format string to use with the axis tick formatter
	 */
	private String formatString = "";

	public PlotTickOptions()
	{
	}

	public PlotTickMarkPlacement getMark()
	{
		return mark;
	}

	public void setMark(PlotTickMarkPlacement mark)
	{
		this.mark = mark;
	}

	public boolean isShowMark()
	{
		return showMark;
	}

	public void setShowMark(boolean showMark)
	{
		this.showMark = showMark;
	}

	public boolean isShowGridline()
	{
		return showGridline;
	}

	public void setShowGridline(boolean showGridline)
	{
		this.showGridline = showGridline;
	}

	public int getMarkSize()
	{
		return markSize;
	}

	public void setMarkSize(int markSize)
	{
		this.markSize = markSize;
	}

	public boolean isShow()
	{
		return show;
	}

	public void setShow(boolean show)
	{
		this.show = show;
	}

	public boolean isShowLabel()
	{
		return showLabel;
	}

	public void setShowLabel(boolean showLabel)
	{
		this.showLabel = showLabel;
	}

	public String getFormatString()
	{
		return formatString;
	}

	public void setFormatString(String formatString)
	{
		this.formatString = formatString;
	}
}
