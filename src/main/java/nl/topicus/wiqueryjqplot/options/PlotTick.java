package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public class PlotTick implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Object val;

	private Object label;

	public PlotTick(Object val)
	{
		this.val = val;
		this.label = null;
	}

	public PlotTick(Object val, Object label)
	{
		this.val = val;
		this.label = label;
	}

	public Object getVal()
	{
		return val;
	}

	public void setVal(Object val)
	{
		this.val = val;
	}

	public Object getLabel()
	{
		return label;
	}

	public void setLabel(Object label)
	{
		this.label = label;
	}

	@JsonValue
	public Object values()
	{
		if (getLabel() == null)
			return getVal();
		List<Object> ret = new ArrayList<Object>();
		ret.add(getVal());
		ret.add(getLabel());
		return ret;
	}
}
