package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotGrid implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * wether to draw lines across the grid or not.
	 */
	private boolean drawGridLines = true;
	/**
	 * Color of the grid lines.
	 */
	private String gridLineColor = "#cccccc";
	/**
	 * CSS color spec for background color of grid.
	 */
	private String background = "#fffdf6";
	/**
	 * CSS color spec for border around grid.
	 */
	private String borderColor = "#999999";
	/**
	 * pixel width of border around grid.
	 */
	private double borderWidth = 2.0;
	/**
	 * draw a shadow for grid.
	 */
	private boolean shadow = true;
	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private double shadowAngle = 45;
	/**
	 * offset from the line of the shadow.
	 */
	private double shadowOffset = 1.5;
	/**
	 * width of the stroke for the shadow.
	 */
	private double shadowWidth = 3;
	/**
	 * Number of strokes to make when drawing shadow. Each stroke offset by
	 * shadowOffset from the last.
	 */
	private int shadowDepth = 3;
	/**
	 * Opacity of the shadow
	 */
	private double shadowAlpha = 0.07;
	/**
	 * renderer to use to draw the grid.
	 */
	private String renderer = "$.jqplot.CanvasGridRenderer";
	/**
	 * options to pass to the renderer. Note, the default CanvasGridRenderer
	 * takes no additional options.
	 */
	private Object rendererOptions;

	public PlotGrid() {
	}

	public boolean isDrawGridLines() {
		return drawGridLines;
	}

	public void setDrawGridLines(boolean drawGridLines) {
		this.drawGridLines = drawGridLines;
	}

	public String getGridLineColor() {
		return gridLineColor;
	}

	public void setGridLineColor(String gridLineColor) {
		this.gridLineColor = gridLineColor;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public double getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
	}

	public boolean isShadow() {
		return shadow;
	}

	public void setShadow(boolean shadow) {
		this.shadow = shadow;
	}

	public double getShadowAngle() {
		return shadowAngle;
	}

	public void setShadowAngle(double shadowAngle) {
		this.shadowAngle = shadowAngle;
	}

	public double getShadowOffset() {
		return shadowOffset;
	}

	public void setShadowOffset(double shadowOffset) {
		this.shadowOffset = shadowOffset;
	}

	public double getShadowWidth() {
		return shadowWidth;
	}

	public void setShadowWidth(double shadowWidth) {
		this.shadowWidth = shadowWidth;
	}

	public int getShadowDepth() {
		return shadowDepth;
	}

	public void setShadowDepth(int shadowDepth) {
		this.shadowDepth = shadowDepth;
	}

	public double getShadowAlpha() {
		return shadowAlpha;
	}

	public void setShadowAlpha(double shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
	}

	public String getRenderer() {
		return renderer;
	}

	public void setRenderer(String renderer) {
		this.renderer = renderer;
	}

	public Object getRendererOptions() {
		return rendererOptions;
	}

	public void setRendererOptions(Object rendererOptions) {
		this.rendererOptions = rendererOptions;
	}
}
