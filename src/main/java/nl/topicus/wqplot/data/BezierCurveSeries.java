package nl.topicus.wqplot.data;

import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public class BezierCurveSeries<A, B, V> extends AbstractSeries<Void, V, BezierCurveSeriesEntry<V>>
{
	private A xstart;

	private B ystart;

	public BezierCurveSeries(A xstart, B ystart)
	{
		this.xstart = xstart;
		this.ystart = ystart;
	}

	public BezierCurveSeries(A xstart, B ystart, List<V> values)
	{
		this(xstart, ystart);
		for (V value : values)
			addEntry(new BezierCurveSeriesEntry<V>(value));
	}

	public A getXstart()
	{
		return xstart;
	}

	public BezierCurveSeries<A, B, V> setXstart(A xstart)
	{
		this.xstart = xstart;
		return this;
	}

	public B getYstart()
	{
		return ystart;
	}

	public BezierCurveSeries<A, B, V> setYstart(B ystart)
	{
		this.ystart = ystart;
		return this;
	}

	@SuppressWarnings("rawtypes")
	@JsonValue
	public List<List> values()
	{
		return Arrays.asList(Arrays.asList(getXstart(), getYstart()), (List) getData());
	}
}
