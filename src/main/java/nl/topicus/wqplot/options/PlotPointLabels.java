package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotPointLabels implements Serializable
{
	private static final long serialVersionUID = 1L;

	/** show the labels or not. */
	private Boolean show;

	/** compass location where to position the label around the point. */
	private PlotPointLabelLocation location;

	/** true to use labels within data point arrays. */
	private Boolean labelsFromSeries;

	/** array index for location of labels within data point arrays. */
	private Integer seriesLabelIndex;

	/** array of arrays of labels, one array for each series. */
	private String[][] labels;

	/** true to display value as stacked in a stacked plot. */
	private Boolean stackedValue;

	/** vertical padding in pixels between point and label */
	private Double ypadding;

	/** horizontal padding in pixels between point and label */
	private Double xpadding;

	/** true to escape html entities in the labels. */
	private Boolean escapeHTML;

	/**
	 * Number of pixels that the label must be away from an axis boundary in order to be
	 * drawn.
	 */
	private Double edgeTolerance;

	/** true to not show a label for a value which is 0. */
	private Boolean hideZeros;

	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String renderer;

	private String formatString;

	public PlotPointLabels()
	{
		renderer = "$.jqplot.PointLabels";
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotPointLabels setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public PlotPointLabelLocation getLocation()
	{
		return location;
	}

	public PlotPointLabels setLocation(PlotPointLabelLocation location)
	{
		this.location = location;
		return this;
	}

	public Boolean getLabelsFromSeries()
	{
		return labelsFromSeries;
	}

	public PlotPointLabels setLabelsFromSeries(Boolean labelsFromSeries)
	{
		this.labelsFromSeries = labelsFromSeries;
		return this;
	}

	public Integer getSeriesLabelIndex()
	{
		return seriesLabelIndex;
	}

	public PlotPointLabels setSeriesLabelIndex(Integer seriesLabelIndex)
	{
		this.seriesLabelIndex = seriesLabelIndex;
		return this;
	}

	public String[][] getLabels()
	{
		return labels;
	}

	public PlotPointLabels setLabels(String[][] labels)
	{
		this.labels = labels;
		return this;
	}

	public Boolean getStackedValue()
	{
		return stackedValue;
	}

	public PlotPointLabels setStackedValue(Boolean stackedValue)
	{
		this.stackedValue = stackedValue;
		return this;
	}

	public Double getYpadding()
	{
		return ypadding;
	}

	public PlotPointLabels setYpadding(Double ypadding)
	{
		this.ypadding = ypadding;
		return this;
	}

	public Double getXpadding()
	{
		return xpadding;
	}

	public PlotPointLabels setXpadding(Double xpadding)
	{
		this.xpadding = xpadding;
		return this;
	}

	public Boolean getEscapeHTML()
	{
		return escapeHTML;
	}

	public PlotPointLabels setEscapeHTML(Boolean escapeHTML)
	{
		this.escapeHTML = escapeHTML;
		return this;
	}

	public Double getEdgeTolerance()
	{
		return edgeTolerance;
	}

	public PlotPointLabels setEdgeTolerance(Double edgeTolerance)
	{
		this.edgeTolerance = edgeTolerance;
		return this;
	}

	public Boolean getHideZeros()
	{
		return hideZeros;
	}

	public PlotPointLabels setHideZeros(Boolean hideZeros)
	{
		this.hideZeros = hideZeros;
		return this;
	}

	public String getRenderer()
	{
		return renderer;
	}

	public PlotPointLabels setRenderer(String renderer)
	{
		this.renderer = renderer;
		return this;
	}

	public String getFormatString()
	{
		return formatString;
	}

	public PlotPointLabels setFormatString(String formatString)
	{
		this.formatString = formatString;
		return this;
	}
}
