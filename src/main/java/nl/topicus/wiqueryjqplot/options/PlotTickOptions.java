package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotTickOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Where to put the tick mark on the axis 'outside', 'inside' or 'cross'
	 */
	private PlotTickMarkPlacement mark;

	private Boolean showMark;

	/**
	 * wether to draw a gridline (across the whole grid) at this tick,
	 */
	private Boolean showGridline;

	/**
	 * length the tick will extend beyond the grid in pixels. For 'cross', length will be
	 * added above and below the grid boundary,
	 */
	private Integer markSize;

	/**
	 * wether to show the tick (mark and label),
	 */
	private Boolean show;

	/**
	 * wether to show the text label at the tick,
	 */
	private Boolean showLabel;

	/**
	 * format string to use with the axis tick formatter
	 */
	private String formatString;

	public PlotTickOptions()
	{
	}

	public PlotTickMarkPlacement getMark()
	{
		return mark;
	}

	public PlotTickOptions setMark(PlotTickMarkPlacement mark)
	{
		this.mark = mark;
		return this;
	}

	public Boolean isShowMark()
	{
		return showMark;
	}

	public PlotTickOptions setShowMark(Boolean showMark)
	{
		this.showMark = showMark;
		return this;
	}

	public Boolean isShowGridline()
	{
		return showGridline;
	}

	public PlotTickOptions setShowGridline(Boolean showGridline)
	{
		this.showGridline = showGridline;
		return this;
	}

	public Integer getMarkSize()
	{
		return markSize;
	}

	public PlotTickOptions setMarkSize(Integer markSize)
	{
		this.markSize = markSize;
		return this;
	}

	public Boolean isShow()
	{
		return show;
	}

	public PlotTickOptions setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public Boolean isShowLabel()
	{
		return showLabel;
	}

	public PlotTickOptions setShowLabel(Boolean showLabel)
	{
		this.showLabel = showLabel;
		return this;
	}

	public String getFormatString()
	{
		return formatString;
	}

	public PlotTickOptions setFormatString(String formatString)
	{
		this.formatString = formatString;
		return this;
	}
}
