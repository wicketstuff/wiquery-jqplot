package nl.topicus.wqplot.data;

public class BubbleSeries<K, V, S extends Number, L> extends
		AbstractSeries<K, V, BubbleSeriesEntry<K, V, S, L>>
{

	public BubbleSeries()
	{
	}

	public BubbleSeries<K, V, S, L> addEntry(K key, V value, S size, L label)
	{
		addEntry(new BubbleSeriesEntry<K, V, S, L>(key, value, size, label));
		return this;
	}
}
