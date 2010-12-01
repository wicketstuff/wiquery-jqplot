package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class CategorySeriesEntry<T, Y extends Number> extends AbstractSeriesEntry<T, Y> implements
		Serializable
{
	private static final long serialVersionUID = 1L;

	public CategorySeriesEntry(T key, Y value)
	{
		super(key, value);
	}
}