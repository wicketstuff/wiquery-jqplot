package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.options.PlotEnhancedLegendRendererOptions;
import nl.topicus.wqplot.options.PlotLegendLocation;
import nl.topicus.wqplot.options.PlotLegendPlacement;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotTick;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class AxisLabelPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AxisLabelPage()
	{
		addChart1();
	}

	private void addChart1()
	{
		NumberSeries<Integer, Integer> l1 = new NumberSeries<Integer, Integer>();
		l1.addEntry(2011, 1200);
		l1.addEntry(2039, 1200);
		NumberSeries<Integer, Integer> l2 = new NumberSeries<Integer, Integer>();
		l2.addEntry(2011, 0);
		l2.addEntry(2039, 800);
		NumberSeries<Integer, Integer> l3 = new NumberSeries<Integer, Integer>();
		l3.addEntry(2011, 0);
		l3.addEntry(2039, 400);

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<NumberSeries<Integer, Integer>>(Arrays.asList(l1,
				l2, l3)));
		add(chart1);

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getGrid().setBackground("#ffffff");
		chart1O.getGrid().setBorderWidth(0d);
		chart1O.getGrid().setBorderColor("#ffffff");
		chart1O.getGrid().setShadow(true);
		chart1O.getGrid().setShadowWidth(10d);
		chart1O.getGrid().setShadowOffset(3d);
		chart1O.getGrid().setShadowDepth(8);
		chart1O.getGrid().setShadowColor("rgba(230, 230, 230, 0.07)");

		chart1O.getLegend().setRenderer("$.jqplot.EnhancedLegendRenderer");
		chart1O.getLegend().setShow(true);
		chart1O.getLegend().setLocation(PlotLegendLocation.s);
		chart1O.getLegend().setPlacement(PlotLegendPlacement.outside);
		chart1O.getLegend().setYoffset(30);
		chart1O.getLegend().setRendererOptions(
			new PlotEnhancedLegendRendererOptions().setNumberRows(2));

		chart1O.setStackSeries(true);
		chart1O.getSeriesDefaults().setFill(true);
		chart1O.getSeriesDefaults().setFillToZero(true);
		chart1O.getSeriesDefaults().setFillToValue(100);
		chart1O.getSeriesDefaults().setYaxis("y2axis");

		chart1O.addNewSeries().setLabel("oil");
		chart1O.addNewSeries().setLabel("renewables");
		chart1O.addNewSeries().setLabel("wind and water");

		chart1O.getAxesDefaults().setShowTickMarks(false);
		chart1O.getAxesDefaults().getTickOptions().setFormatString("%d");

		chart1O.getAxes().getXaxis().setBorderWidth(2d);
		chart1O.getAxes().getXaxis().setBorderColor("#999999");
		chart1O.getAxes().getXaxis()
			.setTicks(Arrays.asList(new PlotTick(2010), new PlotTick(2040)));
		chart1O.getAxes().getXaxis().getTickOptions().setShowGridline(false);

		chart1O.getAxes().getY2axis().setBorderWidth(0d);
		chart1O.getAxes().getY2axis().setBorderColor("#ffffff");
		chart1O.getAxes().getY2axis().setAutoscale(true);
		chart1O.getAxes().getY2axis().setMin(0);
		chart1O.getAxes().getY2axis().setMax(3000);
		chart1O.getAxes().getY2axis().setNumberTicks(4);
		chart1O.getAxes().getY2axis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart1O.getAxes().getY2axis().setLabel("energy use");

		chart1O.getAxes().getX2axis().setBorderWidth(0d);
		chart1O.getAxes().getX2axis().setBorderColor("#ffffff");

		chart1O.getAxes().getYaxis().setBorderWidth(2d);
		chart1O.getAxes().getYaxis().setBorderColor("#999999");

		chart1.addAfterRenderStatement("var r = " + chart1.getMarkupId() + "._width - "
			+ chart1.getMarkupId() + "._gridPadding.left - 5; "
			+ "r = r + 'px'; $('.jqplot-y2axis-label').css({ top : '10px', right : r });");
	}
}
