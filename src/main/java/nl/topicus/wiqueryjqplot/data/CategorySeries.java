package nl.topicus.wiqueryjqplot.data;

import java.io.Serializable;

public class CategorySeries<T, Y extends Number> extends
		AbstractSeries<T, Y, CategorySeriesEntry<T, Y>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor to prevent varargs warnings
	 */
	public CategorySeries()
	{

	}

	public CategorySeries(CategorySeriesEntry<T, Y>... values)
	{
		for (CategorySeriesEntry<T, Y> curValue : values)
			addEntry(curValue);
	}

	public void addEntry(T key, Y value)
	{
		addEntry(new CategorySeriesEntry<T, Y>(key, value));
	}
}
