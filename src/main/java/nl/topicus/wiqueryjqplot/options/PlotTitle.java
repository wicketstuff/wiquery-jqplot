package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotTitle implements Serializable
{
	private static final long serialVersionUID = 1L;

	private boolean show = true;

	private String text;

	public PlotTitle()
	{
	}

	public PlotTitle(String text)
	{
		setText(text);
	}

	public boolean isShow()
	{
		return show;
	}

	public void setShow(boolean show)
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
