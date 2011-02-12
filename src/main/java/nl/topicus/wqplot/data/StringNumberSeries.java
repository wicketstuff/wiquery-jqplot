package nl.topicus.wqplot.data;

import java.io.Serializable;

public class StringNumberSeries<Y extends Number> extends
		AbstractSeries<String, Y, StringNumberSeriesEntry<Y>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor to prevent varargs warnings
	 */
	public StringNumberSeries()
	{

	}

	public StringNumberSeries(StringNumberSeriesEntry<Y>... values)
	{
		for (StringNumberSeriesEntry<Y> curValue : values)
			addEntry(curValue);
	}

	public StringNumberSeries<Y> addEntry(String key, Y value)
	{
		addEntry(new StringNumberSeriesEntry<Y>(key, value));
		return this;
	}
}
