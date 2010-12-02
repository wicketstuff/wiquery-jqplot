package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class BaseSeriesEntry<T, Y extends Number> extends AbstractSeriesEntry<T, Y> implements
		Serializable
{
	private static final long serialVersionUID = 1L;

	public BaseSeriesEntry(T key, Y value)
	{
		super(key, value);
	}
}