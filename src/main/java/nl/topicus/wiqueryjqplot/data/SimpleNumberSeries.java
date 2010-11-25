package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class SimpleNumberSeries extends AbstractSeries<Integer, Double, SimpleNumberSeriesEntry>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	public void addEntry(Double value)
	{
		addEntry(new SimpleNumberSeriesEntry(getData().size(), value));
	}
}
