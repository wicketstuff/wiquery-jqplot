package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotTitle implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean show;

	private String text;

	public PlotTitle()
	{
	}

	public PlotTitle(String text)
	{
		setText(text);
	}

	public Boolean isShow()
	{
		return show;
	}

	public void setShow(Boolean show)
	{
		this.show = show;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}
}
