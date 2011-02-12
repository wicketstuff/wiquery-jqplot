package nl.topicus.wqplot.web.pages.examples.dist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.BaseSeries;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotBarDirection;
import nl.topicus.wqplot.options.PlotBarRendererOptions;
import nl.topicus.wqplot.options.PlotCanvasAxisTickRendererOptions;
import nl.topicus.wqplot.options.PlotLegendLocation;
import nl.topicus.wqplot.options.PlotMarkerStyle;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotPieRendererOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BarLinePieStackPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	public BarLinePieStackPage()
	{
		addChart1();
		addChart2();
		addChart3();
		addChart3b();
		addChart3c();
		addChart4();
	}

	private void addChart1()
	{
		List<SimpleNumberSeries<Integer>> lines = new ArrayList<SimpleNumberSeries<Integer>>();
		lines.add(new SimpleNumberSeries<Integer>(2, 3, 1, 4, 3));
		lines.add(new SimpleNumberSeries<Integer>(1, 4, 3, 2, 5));

		JQPlot chart1 = new JQPlot("chart1", new ListModel<SimpleNumberSeries<Integer>>(lines));

		PlotOptions chart1O = chart1.getOptions();
		chart1O
			.setTitle("Stacked Filled Line Plot with Transparency (transparency not supported in IE6)");
		chart1O.setStackSeries(true);
		chart1O.getGrid().setBackground("#fefbf3").setBorderWidth(2.5);
		chart1O.getSeriesDefaults().setFill(true).setShowMarker(false).setShadow(false);
		chart1O.getAxes().getXaxis().setPad(1.0).setNumberTicks(5).setAutoscale(false);
		chart1O.getAxes().getYaxis().setMin(0.0).setMax(12.0).setNumberTicks(5);
		chart1O.addNewSeries().setColor("rgba(68, 124, 147, 0.7)");
		chart1O.addNewSeries().setColor("rgba(150, 35, 90, 0.7)");

		add(chart1);
	}

	private void addChart2()
	{
		List<BaseSeries<Date, Double>> lines = new ArrayList<BaseSeries<Date, Double>>();
		BaseSeries<Date, Double> line1 = new BaseSeries<Date, Double>();
		line1.addEntry(asDate("2008-09-30"), 4.0);
		line1.addEntry(asDate("2008-10-30"), 6.5);
		line1.addEntry(asDate("2008-11-30"), 5.7);
		line1.addEntry(asDate("2008-12-30"), 9.0);
		line1.addEntry(asDate("2009-01-30"), 8.2);
		lines.add(line1);

		JQPlot chart2 = new JQPlot("chart2", new ListModel<BaseSeries<Date, Double>>(lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.setTitle("Rotated Axis Text");
		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.DateAxisRenderer");
		chart2O.getAxes().getXaxis().setMin(asDate("2008-08-30"));
		chart2O.getAxes().getXaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart2O.getAxes().getXaxis().setTickInterval("1 month");
		PlotCanvasAxisTickRendererOptions tickOptions = new PlotCanvasAxisTickRendererOptions();
		tickOptions.setFormatString("%b %#d, %Y");
		tickOptions.setFontSize("10pt");
		tickOptions.setFontFamily("Tahoma");
		tickOptions.setAngle(-40.0);
		tickOptions.setFontWeight("normal");
		tickOptions.setFontStretch(1.0);
		chart2O.getAxes().getXaxis().setTickOptions(tickOptions);
		chart2O.addNewSeries().setLineWidth(4.0).getMarkerOptions()
			.setStyle(PlotMarkerStyle.square);

		add(chart2);
	}

	private Date asDate(String date)
	{
		try
		{
			return FORMAT.parse(date);
		}
		catch (ParseException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void addChart3()
	{
		List<BaseSeries<Double, Integer>> lines = new ArrayList<BaseSeries<Double, Integer>>();
		BaseSeries<Double, Integer> line1 = new BaseSeries<Double, Integer>();
		line1.addEntry(4.0, 1);
		line1.addEntry(4.0, 2);
		line1.addEntry(3.0, 3);
		line1.addEntry(16.0, 4);

		BaseSeries<Double, Integer> line2 = new BaseSeries<Double, Integer>();
		line2.addEntry(3.0, 1);
		line2.addEntry(7.0, 2);
		line2.addEntry(4.0, 3);
		line2.addEntry(3.125, 4);

		lines.add(line1);
		lines.add(line2);

		JQPlot chart3 = new JQPlot("chart3", new ListModel<BaseSeries<Double, Integer>>(lines));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.setStackSeries(true);
		chart3O.getLegend().setShow(true).setLocation(PlotLegendLocation.se);
		chart3O.setTitle("Unit Sales: Acme Decoy Division");
		chart3O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		PlotBarRendererOptions renderOptions = new PlotBarRendererOptions();
		renderOptions.setBarDirection(PlotBarDirection.horizontal);
		renderOptions.setBarPadding(6.0);
		renderOptions.setBarMargin(40.0);
		chart3O.getSeriesDefaults().setRendererOptions(renderOptions);
		chart3O.addNewSeries().setLabel("1st Qtr");
		chart3O.addNewSeries().setLabel("2nd Qtr");
		chart3O.getAxes().getYaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart3O.getAxes().getYaxis().setTicks("Q1", "Q2", "Q3", "Q4");
		chart3O.getAxes().getXaxis().setMin(0).setMax(20).setNumberTicks(5);

		add(chart3);
	}

	private void addChart3b()
	{
		List<SimpleNumberSeries<Double>> lines = new ArrayList<SimpleNumberSeries<Double>>();
		lines.add(new SimpleNumberSeries<Double>(4.0, 2.0, 9.0, 16.0));
		lines.add(new SimpleNumberSeries<Double>(3.0, 7.0, 6.25, 3.125));

		JQPlot chart3b = new JQPlot("chart3b", new ListModel<SimpleNumberSeries<Double>>(lines));

		PlotOptions chart3bO = chart3b.getOptions();
		chart3bO.setStackSeries(true);
		chart3bO.getLegend().setShow(true).setLocation(PlotLegendLocation.nw);
		chart3bO.setTitle("Unit Sales: Acme Decoy Division");
		chart3bO.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		PlotBarRendererOptions renderOptions = new PlotBarRendererOptions();
		renderOptions.setBarPadding(6.0);
		renderOptions.setBarMargin(40.0);
		chart3bO.getSeriesDefaults().setRendererOptions(renderOptions);
		chart3bO.addNewSeries().setLabel("1st Qtr");
		chart3bO.addNewSeries().setLabel("2nd Qtr");
		chart3bO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart3bO.getAxes().getXaxis().setTicks("Q1", "Q2", "Q3", "Q4");
		chart3bO.getAxes().getYaxis().setMin(0).setMax(20).setNumberTicks(5);

		add(chart3b);
	}

	private void addChart3c()
	{
		List<SimpleNumberSeries<Double>> lines = new ArrayList<SimpleNumberSeries<Double>>();
		lines.add(new SimpleNumberSeries<Double>(4.0, 2.0, 9.0, 16.0));
		lines.add(new SimpleNumberSeries<Double>(3.0, 7.0, 6.25, 3.125));

		JQPlot chart3c = new JQPlot("chart3c", new ListModel<SimpleNumberSeries<Double>>(lines));

		PlotOptions chart3cO = chart3c.getOptions();
		chart3cO.getLegend().setShow(true).setLocation(PlotLegendLocation.nw);
		chart3cO.setTitle("Unit Sales: Acme Decoy Division");
		chart3cO.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		PlotBarRendererOptions renderOptions = new PlotBarRendererOptions();
		renderOptions.setBarPadding(6.0);
		renderOptions.setBarMargin(20.0);
		chart3cO.getSeriesDefaults().setRendererOptions(renderOptions);
		chart3cO.addNewSeries().setLabel("1st Qtr");
		chart3cO.addNewSeries().setLabel("2nd Qtr");
		chart3cO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart3cO.getAxes().getXaxis().setTicks("Q1", "Q2", "Q3", "Q4");
		chart3cO.getAxes().getYaxis().setMin(0).setMax(20).setNumberTicks(5);

		add(chart3c);
	}

	private void addChart4()
	{
		BaseSeries<String, Double> line = new BaseSeries<String, Double>();
		line.addEntry("frogs", 3.0);
		line.addEntry("buzzards", 7.0);
		line.addEntry("deer", 2.5);
		line.addEntry("turkeys", 6.0);
		line.addEntry("moles", 5.0);
		line.addEntry("ground hogs", 4.0);
		List<BaseSeries<String, Double>> lines = new ArrayList<BaseSeries<String, Double>>();
		lines.add(line);

		JQPlot chart4 = new JQPlot("chart4", new ListModel<BaseSeries<String, Double>>(lines));

		PlotOptions chart4O = chart4.getOptions();
		chart4O.setTitle("Pie Chart with Legend and sliceMargin");
		PlotPieRendererOptions renderOptions = new PlotPieRendererOptions();
		renderOptions.setSliceMargin(8.0);
		chart4O.getSeriesDefaults().setRenderer("$.jqplot.PieRenderer")
			.setRendererOptions(renderOptions);
		chart4O.getLegend().setShow(true);

		add(chart4);
	}
}
