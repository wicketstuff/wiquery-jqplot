package nl.topicus.wqplot.data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Ernesto Reinaldo Barreiro
 *
 * @param <Y>
 */
public class DateNumberSeriesEntry<Y extends Number> extends AbstractSeriesEntry<Date, Y>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	public DateNumberSeriesEntry(Date key, Y value)
	{
		super(key, value);
	}
}