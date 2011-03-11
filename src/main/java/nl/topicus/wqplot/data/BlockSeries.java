package nl.topicus.wqplot.data;

public class BlockSeries<K, V, S, L> extends AbstractSeries<K, V, BlockSeriesEntry<K, V, S, L>>
{

	public BlockSeries()
	{
	}

	public BlockSeries<K, V, S, L> addEntry(K key, V value, S label, L properties)
	{
		addEntry(new BlockSeriesEntry<K, V, S, L>(key, value, label, properties));
		return this;
	}
}
