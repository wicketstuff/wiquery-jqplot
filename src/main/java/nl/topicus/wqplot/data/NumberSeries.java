package nl.topicus.wqplot.data;

import java.io.Serializable;

public class NumberSeries<T extends Number, Y extends Number> extends
		AbstractSeries<T, Y, NumberSeriesEntry<T, Y>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor to prevent varargs warnings
	 */
	public NumberSeries()
	{

	}

	public NumberSeries(NumberSeriesEntry<T, Y>... values)
	{
		for (NumberSeriesEntry<T, Y> curValue : values)
			addEntry(curValue);
	}

	public NumberSeries<T, Y> addEntry(T key, Y value)
	{
		addEntry(new NumberSeriesEntry<T, Y>(key, value));
		return this;
	}
}
