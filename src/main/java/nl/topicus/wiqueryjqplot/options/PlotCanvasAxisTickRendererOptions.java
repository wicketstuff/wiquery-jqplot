package nl.topicus.wiqueryjqplot.options;

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
}
