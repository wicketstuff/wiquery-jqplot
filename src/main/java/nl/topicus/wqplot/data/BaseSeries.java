package nl.topicus.wqplot.data;

import java.io.Serializable;

public class BaseSeries<T, Y extends Number> extends AbstractSeries<T, Y, BaseSeriesEntry<T, Y>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor to prevent varargs warnings
	 */
	public BaseSeries()
	{

	}

	public BaseSeries(BaseSeriesEntry<T, Y>... values)
	{
		for (BaseSeriesEntry<T, Y> curValue : values)
			addEntry(curValue);
	}

	public BaseSeries<T, Y> addEntry(T key, Y value)
	{
		addEntry(new BaseSeriesEntry<T, Y>(key, value));
		return this;
	}
}
