package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotLabelOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean show;

	private Boolean enableFontSupport;

	private String fontFamily;

	private String fontSize;

	public PlotLabelOptions()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotLabelOptions setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public Boolean getEnableFontSupport()
	{
		return enableFontSupport;
	}

	public PlotLabelOptions setEnableFontSupport(Boolean enableFontSupport)
	{
		this.enableFontSupport = enableFontSupport;
		return this;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotLabelOptions setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotLabelOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}
}
