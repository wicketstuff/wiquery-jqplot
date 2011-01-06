package nl.topicus.wqplot.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotCanvasAxisTickRendererOptions extends PlotTickOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * angle of text, measured clockwise from x axis.
	 */
	private Double angle;

	/**
	 * ’auto’, ‘start’, ‘middle’ or ‘end’. Whether tick label should be positioned so the
	 * start, middle, or end of the tick mark.
	 */
	private PlotTickLabelPosition labelPosition;

	/**
	 * CSS spec for fontWeight
	 */
	private String fontWeight;

	/**
	 * Multiplier to condense or expand font width. Applies only to browsers which don’t
	 * support canvas native font rendering.
	 */
	private Double fontStretch;

	/**
	 * true to turn on native canvas font support in Mozilla 3.5+ and Safari 4+. If true,
	 * tick label will be drawn with canvas tag native support for fonts. If false, tick
	 * label will be drawn with Hershey font metrics.
	 */
	private Boolean enableFontSupport;

	/**
	 * Point to pixel scaling factor, used for computing height of bounding box around a
	 * label. The labels text renderer has a default setting of 1.4, which should be
	 * suitable for most fonts. Leave as null to use default. If tops of letters appear
	 * clipped, increase this. If bounding box seems too big, decrease. This is an issue
	 * only with the native font renderering capabilities of Mozilla 3.5 and Safari 4
	 * since they do not provide a method to determine the font height.
	 */
	private Double pt2px;

	public PlotCanvasAxisTickRendererOptions()
	{
	}

	public Double getAngle()
	{
		return angle;
	}

	public PlotCanvasAxisTickRendererOptions setAngle(Double angle)
	{
		this.angle = angle;
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

	public Boolean getEnableFontSupport()
	{
		return enableFontSupport;
	}

	public PlotCanvasAxisTickRendererOptions setEnableFontSupport(Boolean enableFontSupport)
	{
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public Double getPt2px()
	{
		return pt2px;
	}

	public PlotCanvasAxisTickRendererOptions setPt2px(Double pt2px)
	{
		this.pt2px = pt2px;
		return this;
	}
}
