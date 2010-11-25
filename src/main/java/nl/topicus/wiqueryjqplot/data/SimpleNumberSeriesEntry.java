package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class SimpleNumberSeriesEntry<T extends Number> extends AbstractSeriesEntry<Integer, T>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	public SimpleNumberSeriesEntry(Integer key, T value)
	{
		super(key, value);
	}
}