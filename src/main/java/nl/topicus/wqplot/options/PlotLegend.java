package nl.topicus.wqplot.options;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotLegend implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Wether to display the legend on the graph.
	 */
	private Boolean show;

	/**
	 * Placement of the legend. one of the compass directions: nw, n, ne, e, se, s, sw, w
	 */
	private PlotLegendLocation location;

	/**
	 * Array of labels to use. By default the renderer will look for labels on the series.
	 * Labels specified in this array will override labels specified on the series.
	 */
	private List<String> labels;

	/**
	 * true to show the label text on the legend.
	 */
	private Boolean showLabels;

	/**
	 * true to show the color swatches on the legend.
	 */
	private Boolean showSwatch;

	/**
	 * ”insideGrid” places legend inside the grid area of the plot. “outsideGrid” places
	 * the legend outside the grid but inside the plot container, shrinking the grid to
	 * accomodate the legend. “inside” synonym for “insideGrid”, “outside” places the
	 * legend ouside the grid area, but does not shrink the grid which can cause the
	 * legend to overflow the plot container.
	 */
	private PlotLegendPlacement placement;

	/**
	 * DEPRECATED. Set the margins on the legend using the marginTop, marginLeft, etc.
	 * properties or via CSS margin styling of the .jqplot-table-legend class.
	 */
	private Integer xoffset;

	/**
	 * DEPRECATED. Set the margins on the legend using the marginTop, marginLeft, etc.
	 * properties or via CSS margin styling of the .jqplot-table-legend class.
	 */
	private Integer yoffset;

	/**
	 * css spec for the border around the legend box.
	 */
	private String border;

	/**
	 * css spec for the background of the legend box.
	 */
	private String background;

	/**
	 * css color spec for the legend text.
	 */
	private String textColor;

	/**
	 * css font-family spec for the legend text.
	 */
	private String fontFamily;

	/**
	 * css font-size spec for the legend text.
	 */
	private String fontSize;

	/**
	 * css padding-top spec for the rows in the legend.
	 */
	private String rowSpacing;

	/**
	 * renderer specific options passed to the renderer.
	 */
	private Object rendererOptions;

	/**
	 * Wether to draw the legend before the series or not. Used with series specific
	 * legend renderers for pie, donut, mekko charts, etc.
	 */
	private Boolean predraw;

	/**
	 * CSS margin for the legend DOM element. This will set an element CSS style for the
	 * margin which will override any style sheet setting. The default will be taken from
	 * the stylesheet.
	 */
	private String marginTop;

	/**
	 * CSS margin for the legend DOM element. This will set an element CSS style for the
	 * margin which will override any style sheet setting. The default will be taken from
	 * the stylesheet.
	 */
	private String marginRight;

	/**
	 * CSS margin for the legend DOM element. This will set an element CSS style for the
	 * margin which will override any style sheet setting. The default will be taken from
	 * the stylesheet.
	 */
	private String marginBottom;

	/**
	 * CSS margin for the legend DOM element. This will set an element CSS style for the
	 * margin which will override any style sheet setting. The default will be taken from
	 * the stylesheet.
	 */
	private String marginLeft;

	public PlotLegend()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotLegend setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public PlotLegendLocation getLocation()
	{
		return location;
	}

	public PlotLegend setLocation(PlotLegendLocation location)
	{
		this.location = location;
		return this;
	}

	public List<String> getLabels()
	{
		return labels;
	}

	public PlotLegend setLabels(List<String> labels)
	{
		this.labels = labels;
		return this;
	}

	public Boolean getShowLabels()
	{
		return showLabels;
	}

	public PlotLegend setShowLabels(Boolean showLabels)
	{
		this.showLabels = showLabels;
		return this;
	}

	public Boolean getShowSwatch()
	{
		return showSwatch;
	}

	public PlotLegend setShowSwatch(Boolean showSwatch)
	{
		this.showSwatch = showSwatch;
		return this;
	}

	public PlotLegendPlacement getPlacement()
	{
		return placement;
	}

	public PlotLegend setPlacement(PlotLegendPlacement placement)
	{
		this.placement = placement;
		return this;
	}

	public Integer getXoffset()
	{
		return xoffset;
	}

	public PlotLegend setXoffset(Integer xoffset)
	{
		this.xoffset = xoffset;
		return this;
	}

	public Integer getYoffset()
	{
		return yoffset;
	}

	public PlotLegend setYoffset(Integer yoffset)
	{
		this.yoffset = yoffset;
		return this;
	}

	public String getBorder()
	{
		return border;
	}

	public PlotLegend setBorder(String border)
	{
		this.border = border;
		return this;
	}

	public String getBackground()
	{
		return background;
	}

	public PlotLegend setBackground(String background)
	{
		this.background = background;
		return this;
	}

	public String getTextColor()
	{
		return textColor;
	}

	public PlotLegend setTextColor(String textColor)
	{
		this.textColor = textColor;
		return this;
	}

	public String getFontFamily()
	{
		return fontFamily;
	}

	public PlotLegend setFontFamily(String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}

	public PlotLegend setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getRowSpacing()
	{
		return rowSpacing;
	}

	public PlotLegend setRowSpacing(String rowSpacing)
	{
		this.rowSpacing = rowSpacing;
		return this;
	}

	public Object getRendererOptions()
	{
		return rendererOptions;
	}

	public PlotLegend setRendererOptions(Object rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		return this;
	}

	public Boolean getPredraw()
	{
		return predraw;
	}

	public PlotLegend setPredraw(Boolean predraw)
	{
		this.predraw = predraw;
		return this;
	}

	public String getMarginTop()
	{
		return marginTop;
	}

	public PlotLegend setMarginTop(String marginTop)
	{
		this.marginTop = marginTop;
		return this;
	}

	public String getMarginRight()
	{
		return marginRight;
	}

	public PlotLegend setMarginRight(String marginRight)
	{
		this.marginRight = marginRight;
		return this;
	}

	public String getMarginBottom()
	{
		return marginBottom;
	}

	public PlotLegend setMarginBottom(String marginBottom)
	{
		this.marginBottom = marginBottom;
		return this;
	}

	public String getMarginLeft()
	{
		return marginLeft;
	}

	public PlotLegend setMarginLeft(String marginLeft)
	{
		this.marginLeft = marginLeft;
		return this;
	}
}
