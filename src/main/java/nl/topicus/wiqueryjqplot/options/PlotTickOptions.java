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

	public void setMark(PlotTickMarkPlacement mark)
	{
		this.mark = mark;
	}

	public Boolean isShowMark()
	{
		return showMark;
	}

	public void setShowMark(Boolean showMark)
	{
		this.showMark = showMark;
	}

	public Boolean isShowGridline()
	{
		return showGridline;
	}

	public void setShowGridline(Boolean showGridline)
	{
		this.showGridline = showGridline;
	}

	public Integer getMarkSize()
	{
		return markSize;
	}

	public void setMarkSize(Integer markSize)
	{
		this.markSize = markSize;
	}

	public Boolean isShow()
	{
		return show;
	}

	public void setShow(Boolean show)
	{
		this.show = show;
	}

	public Boolean isShowLabel()
	{
		return showLabel;
	}

	public void setShowLabel(Boolean showLabel)
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
