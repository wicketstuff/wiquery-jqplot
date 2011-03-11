package nl.topicus.wqplot.data;

import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public class BezierCurveSeriesEntry<V> extends AbstractSeriesEntry<Void, V>
{
	public BezierCurveSeriesEntry(V value)
	{
		super(null, value);
	}

	@Override
	public Void getKey()
	{
		throw new UnsupportedOperationException(
			"BezierCurveSeries does not support key value pair data.");
	}

	@Override
	public List<Object> values()
	{
		throw new UnsupportedOperationException(
			"BezierCurveSeries does not support key value pair data.");
	}

	@JsonValue
	public Object value()
	{
		return getValue();
	}
}
