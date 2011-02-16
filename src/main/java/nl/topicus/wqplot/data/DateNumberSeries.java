package nl.topicus.wqplot.data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class DateNumberSeries<Y extends Number> extends
		AbstractSeries<Date, Y, DateNumberSeriesEntry<Y>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	public DateNumberSeries()
	{

	}

	public DateNumberSeries(DateNumberSeriesEntry<Y>... values)
	{
		for (DateNumberSeriesEntry<Y> curValue : values)
			addEntry(curValue);
	}

	public void addEntry(Date key, Y value)
	{
		addEntry(new DateNumberSeriesEntry<Y>(key, value));
	}
}
