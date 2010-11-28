package nl.topicus.wiqueryjqplot.web.pages.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.NumberSeries;
import nl.topicus.wiqueryjqplot.data.NumberSeriesEntry;
import nl.topicus.wiqueryjqplot.data.SimpleNumberSeries;
import nl.topicus.wiqueryjqplot.options.*;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class CorePage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public CorePage()
	{
		addPlot1();
		addPlot2();
		addPlot3();
		addPlot4();
	}

	private void addPlot1()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.4)
			l1.addEntry(i, Math.cos(i));

		NumberSeries<Double, Double> l2 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.4)
			l2.addEntry(i, 2 * Math.sin(i - 0.8));

		NumberSeries<Double, Double> l3 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.4)
			l3.addEntry(i, 2.5 + Math.pow(i / 4, 2));

		NumberSeries<Double, Double> l4 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.4)
			l4.addEntry(i, -2.5 - Math.pow(i / 4, 2));

		@SuppressWarnings("unchecked")
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<NumberSeries<Double, Double>>(Arrays.asList(l1, l2,
				l3, l4)));
		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle(new PlotTitle("Line Style Options"));
		List<PlotSeries> chart1series = new ArrayList<PlotSeries>();

		PlotSeries chart1series1 = new PlotSeries();
		chart1series1.setLineWidth(2d);
		PlotSeriesMarkerOptions chart1series1marker = new PlotSeriesMarkerOptions();
		chart1series1marker.setStyle(PlotMarkerStyle.diamond);
		chart1series1.setMarkerOptions(chart1series1marker);
		chart1series.add(chart1series1);

		PlotSeries chart1series2 = new PlotSeries();
		chart1series2.setShowLine(false);
		PlotSeriesMarkerOptions chart1series2marker = new PlotSeriesMarkerOptions();
		chart1series2marker.setSize(7d);
		chart1series2marker.setStyle(PlotMarkerStyle.x);
		chart1series2.setMarkerOptions(chart1series2marker);
		chart1series.add(chart1series2);

		PlotSeries chart1series3 = new PlotSeries();
		PlotSeriesMarkerOptions chart1series3marker = new PlotSeriesMarkerOptions();
		chart1series3marker.setStyle(PlotMarkerStyle.circle);
		chart1series3.setMarkerOptions(chart1series3marker);
		chart1series.add(chart1series3);

		PlotSeries chart1series4 = new PlotSeries();
		chart1series4.setLineWidth(5d);
		PlotSeriesMarkerOptions chart1series4marker = new PlotSeriesMarkerOptions();
		chart1series4marker.setStyle(PlotMarkerStyle.filledSquare);
		chart1series4marker.setSize(14d);
		chart1series4.setMarkerOptions(chart1series4marker);
		chart1series.add(chart1series4);

		chart1O.setSeries(chart1series);
		add(chart1);
	}

	private void addPlot2()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.1)
			l1.addEntry(i, Math.cos(i));

		@SuppressWarnings("unchecked")
		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<NumberSeries<Double, Double>>(Arrays.asList(l1)));
		PlotOptions chart2O = chart2.getOptions();
		chart2O.setTitle(new PlotTitle("Shadow Options"));
		List<PlotSeries> chart2series = new ArrayList<PlotSeries>();

		PlotSeries chart2series1 = new PlotSeries();
		chart2series1.setLineWidth(5d);
		chart2series1.setShadowAlpha(0d);
		chart2series1.setShadowOffset(1.5d);
		chart2series1.setShadowAlpha(0.08d);
		chart2series1.setShadowDepth(6);
		PlotSeriesMarkerOptions chart2series1marker = new PlotSeriesMarkerOptions();
		chart2series1marker.setShow(false);
		chart2series1.setMarkerOptions(chart2series1marker);
		chart2series.add(chart2series1);

		chart2O.setSeries(chart2series);
		add(chart2);
	}

	private void addPlot3()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		l1.addEntry(new NumberSeriesEntry<Double, Double>(1d, 1d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(1.5d, 2.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(2d, 4d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(2.5d, 6.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(3d, 9d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(3.5d, 12.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(4d, 16d));

		SimpleNumberSeries<Double> l2 =
			new SimpleNumberSeries<Double>(25d, 17.5d, 12.25d, 8.6d, 6.0d, 4.2d, 2.9d);

		SimpleNumberSeries<Integer> l3 = new SimpleNumberSeries<Integer>(4, 25, 13, 22, 14, 17, 15);

		@SuppressWarnings("unchecked")
		JQPlot chart3 = new JQPlot("chart3", new ListModel(Arrays.asList(l1, l2, l3)));
		PlotOptions chart3O = chart3.getOptions();
		PlotLegend chart3legend = new PlotLegend();
		chart3legend.setShow(true);
		chart3O.setLegend(chart3legend);
		chart3O.setTitle(new PlotTitle("Mixed Data Input Formats"));
		List<PlotSeries> chart3series = new ArrayList<PlotSeries>();

		PlotSeries chart3series1 = new PlotSeries();
		chart3series1.setLabel("Rising line");
		chart3series1.setShowLine(false);
		PlotSeriesMarkerOptions chart3series1marker = new PlotSeriesMarkerOptions();
		chart3series1marker.setStyle(PlotMarkerStyle.square);
		chart3series1.setMarkerOptions(chart3series1marker);
		chart3series.add(chart3series1);

		PlotSeries chart3series2 = new PlotSeries();
		chart3series2.setLabel("Declining line");
		chart3series.add(chart3series2);

		PlotSeries chart3series3 = new PlotSeries();
		chart3series3.setLabel("Zig Zag line");
		chart3series3.setLineWidth(5d);
		chart3series3.setShowMarker(false);
		chart3series.add(chart3series3);

		chart3O.setSeries(chart3series);
		add(chart3);
	}

	private void addPlot4()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		l1.addEntry(new NumberSeriesEntry<Double, Double>(1d, 1d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(1.5d, 2.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(2d, 4d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(2.5d, 6.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(3d, 9d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(3.5d, 12.25d));
		l1.addEntry(new NumberSeriesEntry<Double, Double>(4d, 16d));

		SimpleNumberSeries<Double> l2 = new SimpleNumberSeries<Double>(25d, 12.5d, 6.25d, 3.125d);

		@SuppressWarnings("unchecked")
		JQPlot chart4 = new JQPlot("chart4", new ListModel(Arrays.asList(l1, l2)));
		PlotOptions chart4O = chart4.getOptions();
		PlotLegend chart4legend = new PlotLegend();
		chart4legend.setShow(true);
		chart4O.setLegend(chart4legend);
		chart4O.setTitle(new PlotTitle("Customized Axes Ticks"));
		PlotGrid chart4grid = new PlotGrid();
		chart4grid.setBackground("#f3f3f3");
		chart4grid.setGridLineColor("#accf9b");
		// chart4O.setGrid(chart4grid);

		List<PlotSeries> chart4series = new ArrayList<PlotSeries>();
		PlotSeries chart4series1 = new PlotSeries();
		chart4series1.setLabel("Rising line");
		PlotSeriesMarkerOptions chart4series1marker = new PlotSeriesMarkerOptions();
		chart4series1marker.setStyle(PlotMarkerStyle.square);
		chart4series1.setMarkerOptions(chart4series1marker);
		chart4series.add(chart4series1);

		PlotSeries chart4series2 = new PlotSeries();
		chart4series2.setLabel("Declining line");
		chart4series.add(chart4series2);

		chart4O.setSeries(chart4series);

		PlotAxes chart4axes = new PlotAxes();
		PlotAxis chart4xaxis = new PlotAxis();
		List<PlotTick> chart4xaxisticks = new ArrayList<PlotTick>();
		chart4xaxisticks.add(new PlotTick("0", "zero"));
		chart4xaxisticks.add(new PlotTick("1", "one"));
		chart4xaxisticks.add(new PlotTick("2", "two"));
		chart4xaxisticks.add(new PlotTick("3", "three"));
		chart4xaxisticks.add(new PlotTick("4", "four"));
		chart4xaxisticks.add(new PlotTick("5", "five"));
		chart4xaxis.setTicks(chart4xaxisticks);

		PlotAxis chart4yaxis = new PlotAxis();
		List<PlotTick> chart4yaxisticks = new ArrayList<PlotTick>();
		chart4yaxisticks.add(new PlotTick("-5"));
		chart4yaxisticks.add(new PlotTick("0"));
		chart4yaxisticks.add(new PlotTick("5"));
		chart4yaxisticks.add(new PlotTick("10"));
		chart4yaxisticks.add(new PlotTick("15"));
		chart4yaxisticks.add(new PlotTick("20"));
		chart4yaxisticks.add(new PlotTick("25"));
		chart4yaxisticks.add(new PlotTick("30"));
		chart4yaxis.setTicks(chart4yaxisticks);

		chart4axes.setXaxis(chart4xaxis);
		chart4axes.setYaxis(chart4yaxis);
		// chart4O.setAxes(chart4axes);
		add(chart4);
	}
}
