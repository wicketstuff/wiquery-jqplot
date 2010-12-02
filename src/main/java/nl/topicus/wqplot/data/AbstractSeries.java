package nl.topicus.wqplot.data;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public abstract class AbstractSeries<K, V, E extends SeriesEntry<K, V>> implements Series<K, V, E>
{
	private List<E> data = new ArrayList<E>();

	@Override
	@JsonValue
	public List<E> getData()
	{
		return data;
	}

	public void addEntry(E entry)
	{
		data.add(entry);
	}
}
