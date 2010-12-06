package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotTitle implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * text of the title
	 */
	private String text;

	/**
	 * wether or not to show the title
	 */
	private Boolean show;

	/**
	 * css font-family spec for the text.
	 */
	private String fontFamily;

	/**
	 * css font-size spec for the text.
	 */
	private String fontSize;

	/**
	 * css text-align spec for the text.
	 */
	private String textAlign;

	/**
	 * css color spec for the text.
	 */
	private String textColor;

	/**
	 * A class for creating a DOM element for the title, see $.jqplot.DivTitleRenderer.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	/**
	 * renderer specific options passed to the renderer.
	 */
	private Object rendererOptions;

	public PlotTitle()
	{
	}

	public PlotTitle(String text)
	{
		setText(text);
	}

	public String getText()
	{
		return text;
	}

	public PlotTitle setText(String text)
	{
		this.text = text;
		return this;
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotTitle setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotTitle setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotTitle setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getTextAlign()
	{
		return textAlign;
	}

	public PlotTitle setTextAlign(String textAlign)
	{
		this.textAlign = textAlign;
		return this;
	}

	public String getTextColor()
	{
		return textColor;
	}

	public PlotTitle setTextColor(String textColor)
	{
		this.textColor = textColor;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotTitle setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotTitle setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return this;
	}
}
