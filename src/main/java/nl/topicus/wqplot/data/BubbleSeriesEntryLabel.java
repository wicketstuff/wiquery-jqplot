package nl.topicus.wqplot.data;

import java.io.Serializable;

public class BubbleSeriesEntryLabel implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String label;

	private String color;

	public BubbleSeriesEntryLabel(String label, String color)
	{
		this.label = label;
		this.color = color;
	}

	public String getLabel()
	{
		return label;
	}

	public String getColor()
	{
		return color;
	}
}
