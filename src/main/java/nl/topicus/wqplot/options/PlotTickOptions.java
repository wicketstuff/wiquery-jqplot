package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotTickOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Where to put the tick mark on the axis 'outside', 'inside' or 'cross'
	 */
	private PlotTickMarkPlacement mark;

	/**
	 * wether or not to show the mark on the axis.
	 */
	private Boolean showMark;

	/**
	 * wether to draw a gridline (across the whole grid) at this tick,
	 */
	private Boolean showGridline;

	/**
	 * if this is a minor tick.
	 */
	private Boolean isMinorTick;

	/**
	 * length the tick will extend beyond the grid in pixels. For 'cross', length will be
	 * added above and below the grid boundary,
	 */
	private Double markSize;

	/**
	 * wether to show the tick (mark and label),
	 */
	private Boolean show;

	/**
	 * wether to show the text label at the tick,
	 */
	private Boolean showLabel;

	/**
	 * A class of a formatter for the tick text. sprintf by default.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String formatter;

	/**
	 * string appended to the tick label if no formatString is specified.
	 */
	private String prefix;

	/**
	 * format string to use with the axis tick formatter
	 */
	private String formatString;

	/**
	 * css spec for the font-family css attribute.
	 */
	private String fontFamily;

	/**
	 * css spec for the font-size css attribute.
	 */
	private String fontSize;

	/**
	 * css spec for the color attribute.
	 */
	private String textColor;

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

	public Boolean getShowMark()
	{
		return showMark;
	}

	public PlotTickOptions setShowMark(Boolean showMark)
	{
		this.showMark = showMark;
		return this;
	}

	public Boolean getShowGridline()
	{
		return showGridline;
	}

	public PlotTickOptions setShowGridline(Boolean showGridline)
	{
		this.showGridline = showGridline;
		return this;
	}

	public Boolean getIsMinorTick()
	{
		return isMinorTick;
	}

	public PlotTickOptions setIsMinorTick(Boolean isMinorTick)
	{
		this.isMinorTick = isMinorTick;
		return this;
	}

	public Double getMarkSize()
	{
		return markSize;
	}

	public PlotTickOptions setMarkSize(Double markSize)
	{
		this.markSize = markSize;
		return this;
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotTickOptions setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public Boolean getShowLabel()
	{
		return showLabel;
	}

	public PlotTickOptions setShowLabel(Boolean showLabel)
	{
		this.showLabel = showLabel;
		return this;
	}

	public String getFormatter()
	{
		return formatter;
	}

	public PlotTickOptions setFormatter(String formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public String getPrefix()
	{
		return prefix;
	}

	public PlotTickOptions setPrefix(String prefix)
	{
		this.prefix = prefix;
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

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotTickOptions setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotTickOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getTextColor()
	{
		return textColor;
	}

	public PlotTickOptions setTextColor(String textColor)
	{
		this.textColor = textColor;
		return this;
	}
}
