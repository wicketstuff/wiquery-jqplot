package nl.topicus.wiqueryjqplot.data;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSeries<K, V, E extends SeriesEntry<K, V>> implements Series<K, V, E>
{
	private List<E> data = new ArrayList<E>();

	@Override
	public List<E> getData()
	{
		return data;
	}

	public void addEntry(E entry)
	{
		data.add(entry);
	}
}
