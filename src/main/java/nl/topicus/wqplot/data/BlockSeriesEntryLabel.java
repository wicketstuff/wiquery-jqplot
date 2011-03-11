package nl.topicus.wqplot.data;

import java.io.Serializable;

public class BlockSeriesEntryLabel implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String background;

	public BlockSeriesEntryLabel(String background)
	{
		this.background = background;
	}

	public String getBackground()
	{
		return background;
	}

	public BlockSeriesEntryLabel setBackground(String background)
	{
		this.background = background;
		return this;
	}
}
