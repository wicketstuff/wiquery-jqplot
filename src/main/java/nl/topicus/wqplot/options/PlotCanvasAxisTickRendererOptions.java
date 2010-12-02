package nl.topicus.wqplot.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotCanvasAxisTickRendererOptions extends PlotTickOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * angle of text, measured clockwise from x axis.
	 */
	private Integer angle;

	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+. If true,
	 * tick label will be drawn with canvas tag native support for fonts. If false, tick
	 * label will be drawn with Hershey font metrics.
	 */
	private Boolean enableFontSupport;

	/**
	 * ’auto’, ‘start’, ‘middle’ or ‘end’. Whether tick label should be positioned so the
	 * start, middle, or end of the tick mark.
	 */
	private PlotTickLabelPosition labelPosition;

	private String fontSize;

	private String fontFamily;

	private String fontWeight;

	private Double fontStretch;

	public PlotCanvasAxisTickRendererOptions()
	{
	}

	public Integer getAngle()
	{
		return angle;
	}

	public PlotCanvasAxisTickRendererOptions setAngle(Integer angle)
	{
		this.angle = angle;
		return this;
	}

	public Boolean getEnableFontSupport()
	{
		return enableFontSupport;
	}

	public PlotCanvasAxisTickRendererOptions setEnableFontSupport(Boolean enableFontSupport)
	{
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public PlotTickLabelPosition getLabelPosition()
	{
		return labelPosition;
	}

	public PlotCanvasAxisTickRendererOptions setLabelPosition(PlotTickLabelPosition labelPosition)
	{
		this.labelPosition = labelPosition;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotCanvasAxisTickRendererOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotCanvasAxisTickRendererOptions setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontWeight()
	{
		return fontWeight;
	}

	public PlotCanvasAxisTickRendererOptions setFontWeight(String fontWeight)
	{
		this.fontWeight = fontWeight;
		return this;
	}

	public Double getFontStretch()
	{
		return fontStretch;
	}

	public PlotCanvasAxisTickRendererOptions setFontStretch(Double fontStretch)
	{
		this.fontStretch = fontStretch;
		return this;
	}
}
