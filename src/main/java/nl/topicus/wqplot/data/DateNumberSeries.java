package nl.topicus.wqplot.data;

import java.io.Serializable;
import java.util.Date;

/**
 * Allows to define  a Date series.
 * 
 * @author Ernesto Reinaldo Barreiro
 *
 * @param <Y>
 */
public class DateNumberSeries<Y extends Number> extends
		AbstractSeries<Date, Y, DateNumberSeriesEntry<Y>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor to prevent varargs warnings
	 */
	public DateNumberSeries()
	{

	}

	/**
	 * Constructor
	 * 
	 * @param values Initial values for the series.
	 */
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
