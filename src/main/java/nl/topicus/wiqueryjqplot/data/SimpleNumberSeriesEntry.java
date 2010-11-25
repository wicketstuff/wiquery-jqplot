package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class SimpleNumberSeriesEntry extends AbstractSeriesEntry<Integer, Double> implements
		Serializable
{
	private static final long serialVersionUID = 1L;

	public SimpleNumberSeriesEntry(Integer key, Double value)
	{
		super(key, value);
	}
}