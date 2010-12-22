package nl.topicus.wqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotSeries;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class AxisLabelPage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public AxisLabelPage()
	{
		addPlot1();
		addPlot2();
		addPlot3();
	}

	private void addPlot1()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.1)
			l1.addEntry(i, Math.cos(i));

		@SuppressWarnings("unchecked")
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<NumberSeries<Double, Double>>(Arrays.asList(l1)));
		PlotOptions chart1O = chart1.getOptions();

		PlotSeries chart1series1 = chart1O.addNewSeries();
		chart1series1.setShowMarker(false);

		chart1O.getAxes().getXaxis().setLabel("Angle (radians)");
		chart1O.getAxes().getXaxis().setAutoscale(true);
		chart1O.getAxes().getYaxis().setLabel("Cosine");
		chart1O.getAxes().getYaxis().setAutoscale(true);

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

		PlotSeries chart2series1 = chart2O.addNewSeries();
		chart2series1.setShowMarker(false);

		chart2O.getAxes().getXaxis().setLabel("Angle (radians)");
		chart2O.getAxes().getXaxis().setAutoscale(true);
		chart2O.getAxes().getXaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart2O.getAxes().getYaxis().setLabel("Cosine");
		chart2O.getAxes().getYaxis().setAutoscale(true);
		chart2O.getAxes().getYaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");

		add(chart2);
	}

	private void addPlot3()
	{
		NumberSeries<Double, Double> l1 = new NumberSeries<Double, Double>();
		for (double i = 0; i < 2 * Math.PI; i += 0.1)
			l1.addEntry(i, Math.cos(i));

		@SuppressWarnings("unchecked")
		JQPlot chart3 =
			new JQPlot("chart3", new ListModel<NumberSeries<Double, Double>>(Arrays.asList(l1)));
		PlotOptions chart3O = chart3.getOptions();

		PlotSeries chart3series1 = chart3O.addNewSeries();
		chart3series1.setShowMarker(false);

		chart3O.getAxes().getXaxis().setLabel("Angle (radians)");
		chart3O.getAxes().getXaxis().setAutoscale(true);
		chart3O.getAxes().getXaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart3O.getAxes().getXaxis().getLabelOptions().setEnableFontSupport(true);
		chart3O.getAxes().getXaxis().getLabelOptions().setFontFamily("Georgia");
		chart3O.getAxes().getXaxis().getLabelOptions().setFontSize("12pt");
		chart3O.getAxes().getYaxis().setLabel("Cosine");
		chart3O.getAxes().getYaxis().setAutoscale(true);
		chart3O.getAxes().getYaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart3O.getAxes().getYaxis().getLabelOptions().setEnableFontSupport(true);
		chart3O.getAxes().getYaxis().getLabelOptions().setFontFamily("Georgia");
		chart3O.getAxes().getYaxis().getLabelOptions().setFontSize("12pt");

		add(chart3);
	}
}
