package nl.topicus.wqplot.data;

import java.io.Serializable;

public class StringNumberSeriesEntry<Y extends Number> extends AbstractSeriesEntry<String, Y>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	public StringNumberSeriesEntry(String key, Y value)
	{
		super(key, value);
	}
}