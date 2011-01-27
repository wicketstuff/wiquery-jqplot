package nl.topicus.wqplot.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotLineRendererOptions extends PlotSeriesRendererOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * True to highlight area on a filled plot when moused over. This must be false to
	 * enable highlightMouseDown to highlight when clicking on an area on a filled plot.
	 */
	private Boolean highlightMouseOver;

	/**
	 * True to highlight when a mouse button is pressed over an area on a filled plot.
	 * This will be disabled if highlightMouseOver is true.
	 */
	private Boolean highlightMouseDown;

	/**
	 * color to use when highlighting an area on a filled plot.
	 */
	private String highlightColor;

	public PlotLineRendererOptions()
	{
	}

	public Boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	public PlotLineRendererOptions setHighlightMouseOver(Boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return this;
	}

	public Boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	public PlotLineRendererOptions setHighlightMouseDown(Boolean highlightMouseDown)
	{
		this.highlightMouseDown = highlightMouseDown;
		return this;
	}

	public String getHighlightColor()
	{
		return highlightColor;
	}

	public PlotLineRendererOptions setHighlightColor(String highlightColor)
	{
		this.highlightColor = highlightColor;
		return this;
	}
}
