package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotAxes implements Serializable
{
	private static final long serialVersionUID = 1L;

	private PlotAxis xaxis;

	private PlotAxis yaxis;

	private PlotAxis x2axis;

	private PlotAxis y2axis;

	private PlotAxis y3axis;

	private PlotAxis y4axis;

	private PlotAxis y5axis;

	private PlotAxis y6axis;

	private PlotAxis y7axis;

	private PlotAxis y8axis;

	private PlotAxis y9axis;

	public PlotAxes()
	{
	}

	public PlotAxis getXaxis()
	{
		if (xaxis == null)
			xaxis = new PlotAxis();
		return xaxis;
	}

	public PlotAxes setXaxis(PlotAxis xaxis)
	{
		this.xaxis = xaxis;
		return this;
	}

	public PlotAxis getYaxis()
	{
		if (yaxis == null)
			yaxis = new PlotAxis();
		return yaxis;
	}

	public PlotAxes setYaxis(PlotAxis yaxis)
	{
		this.yaxis = yaxis;
		return this;
	}

	public PlotAxis getX2axis()
	{
		if (x2axis == null)
			x2axis = new PlotAxis();
		return x2axis;
	}

	public PlotAxes setX2axis(PlotAxis x2axis)
	{
		this.x2axis = x2axis;
		return this;
	}

	public PlotAxis getY2axis()
	{
		if (y2axis == null)
			y2axis = new PlotAxis();
		return y2axis;
	}

	public PlotAxes setY2axis(PlotAxis y2axis)
	{
		this.y2axis = y2axis;
		return this;
	}

	public PlotAxis getY3axis()
	{
		if (y3axis == null)
			y3axis = new PlotAxis();
		return y3axis;
	}

	public PlotAxes setY3axis(PlotAxis y3axis)
	{
		this.y3axis = y3axis;
		return this;
	}

	public PlotAxis getY4axis()
	{
		if (y4axis == null)
			y4axis = new PlotAxis();
		return y4axis;
	}

	public PlotAxes setY4axis(PlotAxis y4axis)
	{
		this.y4axis = y4axis;
		return this;
	}

	public PlotAxis getY5axis()
	{
		if (y5axis == null)
			y5axis = new PlotAxis();
		return y5axis;
	}

	public PlotAxes setY5axis(PlotAxis y5axis)
	{
		this.y5axis = y5axis;
		return this;
	}

	public PlotAxis getY6axis()
	{
		if (y6axis == null)
			y6axis = new PlotAxis();
		return y6axis;
	}

	public PlotAxes setY6axis(PlotAxis y6axis)
	{
		this.y6axis = y6axis;
		return this;
	}

	public PlotAxis getY7axis()
	{
		if (y7axis == null)
			y7axis = new PlotAxis();
		return y7axis;
	}

	public PlotAxes setY7axis(PlotAxis y7axis)
	{
		this.y7axis = y7axis;
		return this;
	}

	public PlotAxis getY8axis()
	{
		if (y8axis == null)
			y8axis = new PlotAxis();
		return y8axis;
	}

	public PlotAxes setY8axis(PlotAxis y8axis)
	{
		this.y8axis = y8axis;
		return this;
	}

	public PlotAxis getY9axis()
	{
		if (y9axis == null)
			y9axis = new PlotAxis();
		return y9axis;
	}

	public PlotAxes setY9axis(PlotAxis y9axis)
	{
		this.y9axis = y9axis;
		return this;
	}
}
