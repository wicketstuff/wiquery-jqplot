package nl.topicus.wqplot.data;

import java.io.Serializable;

public class SimpleNumberSeries<T extends Number> extends
		AbstractSeries<Integer, T, SimpleNumberSeriesEntry<T>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	public SimpleNumberSeries(T... values)
	{
		for (T curValue : values)
		{
			addEntry(curValue);
		}
	}

	public SimpleNumberSeries<T> addEntry(T value)
	{
		addEntry(new SimpleNumberSeriesEntry<T>(getData().size() + 1, value));
		return this;
	}
}
