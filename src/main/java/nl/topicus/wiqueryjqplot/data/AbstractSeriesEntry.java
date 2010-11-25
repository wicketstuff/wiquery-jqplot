package nl.topicus.wiqueryjqplot.data;

public class AbstractSeriesEntry<K, V> implements SeriesEntry<K, V>
{
	private K key;

	private V value;

	public AbstractSeriesEntry(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey()
	{
		return key;
	}

	@Override
	public V getValue()
	{
		return value;
	}
}