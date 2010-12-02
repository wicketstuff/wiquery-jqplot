package nl.topicus.wqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.data.NumberSeriesEntry;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotAxes;
import nl.topicus.wqplot.options.PlotMarkerStyle;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotSeries;
import nl.topicus.wqplot.options.PlotTick;
import nl.topicus.wqplot.options.PlotTitle;

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
		chart1O.setTitle("Line Style Options");

		PlotSeries chart1series1 = chart1O.addNewSeries();
		chart1series1.setLineWidth(2d);
		chart1series1.getMarkerOptions().setStyle(PlotMarkerStyle.diamond);

		PlotSeries chart1series2 = chart1O.addNewSeries();
		chart1series2.setShowLine(false);
		chart1series2.getMarkerOptions().setSize(7d).setStyle(PlotMarkerStyle.diamond);

		PlotSeries chart1series3 = chart1O.addNewSeries();
		chart1series3.getMarkerOptions().setStyle(PlotMarkerStyle.circle);

		PlotSeries chart1series4 = chart1O.addNewSeries();
		chart1series4.setLineWidth(5d);
		chart1series4.getMarkerOptions().setSize(14d).setStyle(PlotMarkerStyle.filledSquare);

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

		PlotSeries chart2series1 = chart2O.addNewSeries();
		chart2series1.setLineWidth(5d);
		chart2series1.setShadowAngle(0d);
		chart2series1.setShadowOffset(1.5d);
		chart2series1.setShadowAlpha(0.08d);
		chart2series1.setShadowDepth(6);
		chart2series1.getMarkerOptions().setShow(false);

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
		chart3O.getLegend().setShow(true);
		chart3O.setTitle("Mixed Data Input Formats");

		PlotSeries chart3series1 = chart3O.addNewSeries();
		chart3series1.setLabel("Rising line");
		chart3series1.setShowLine(false);
		chart3series1.getMarkerOptions().setStyle(PlotMarkerStyle.square);

		chart3O.addNewSeries().setLabel("Declining line");

		PlotSeries chart3series3 = chart3O.addNewSeries();
		chart3series3.setLabel("Zig Zag line");
		chart3series3.setLineWidth(5d);
		chart3series3.setShowMarker(false);

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
		chart4O.getLegend().setShow(true);
		chart4O.setTitle("Customized Axes Ticks");
		chart4O.getGrid().setBackground("#f3f3f3").setGridLineColor("#accf9b");

		PlotSeries chart4series1 = chart4O.addNewSeries();
		chart4series1.setLabel("Rising line");
		chart4series1.getMarkerOptions().setStyle(PlotMarkerStyle.square);

		chart4O.addNewSeries().setLabel("Declining line");

		PlotAxes chart4axes = chart4O.getAxes();
		chart4axes.getXaxis().setTicks(
			Arrays.asList(new PlotTick(0, "zero"), new PlotTick(1, "one"), new PlotTick(2, "two"),
				new PlotTick(3, "three"), new PlotTick(4, "four"), new PlotTick(5, "five")));

		chart4axes.getYaxis().setTicks(-5, 0, 5, 10, 15, 20, 25, 30).getTickOptions()
			.setFormatString("%d");

		add(chart4);
	}
}
