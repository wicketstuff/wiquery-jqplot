package nl.topicus.wqplot.data;

import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public class BlockSeriesEntry<K, V, S, L> extends AbstractSeriesEntry<K, V>
{
	private S label;

	private L properties;

	public BlockSeriesEntry(K key, V value, S label, L properties)
	{
		super(key, value);
		this.label = label;
		this.properties = properties;
	}

	public S getLabel()
	{
		return label;
	}

	public L getProperties()
	{
		return properties;
	}

	@Override
	@JsonValue
	public List<Object> values()
	{
		if (getProperties() != null)
			return Arrays.asList(getKey(), getValue(), getLabel(), getProperties());

		return Arrays.asList(getKey(), getValue(), getLabel());
	}
}
