package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class NumberSeriesEntry<T extends Number, Y extends Number> extends
		AbstractSeriesEntry<T, Y> implements Serializable
{
	private static final long serialVersionUID = 1L;

	public NumberSeriesEntry(T key, Y value)
	{
		super(key, value);
	}
}