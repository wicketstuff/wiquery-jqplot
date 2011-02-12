package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.data.StringNumberSeries;
import nl.topicus.wqplot.options.PlotCanvasAxisTickRendererOptions;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotTickLabelPosition;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class AxisLabelsRotatedTextPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AxisLabelsRotatedTextPage()
	{
		SimpleNumberSeries<Double> line = new SimpleNumberSeries<Double>();
		line.addEntry(6.5d);
		line.addEntry(9.2d);
		line.addEntry(14d);
		line.addEntry(19.65d);
		line.addEntry(26.4d);
		line.addEntry(35d);
		line.addEntry(51d);

		StringNumberSeries<Integer> line2 = new StringNumberSeries<Integer>();
		line2.addEntry("1/1/2008", 42);
		line2.addEntry("2/14/2008", 56);
		line2.addEntry("3/7/2008", 39);
		line2.addEntry("4/22/2008", 81);

		StringNumberSeries<Integer> line3 = new StringNumberSeries<Integer>();
		line3.addEntry("Cup Holder Pinion Bob", 7);
		line3.addEntry("Generic Fog Lamp Marketing Gimmick", 9);
		line3.addEntry("HDTV Receiver", 15);
		line3.addEntry("8 Track Control Module", 12);
		line3.addEntry("SSPFM (Sealed Sludge Pump Fourier Modulator)", 3);
		line3.addEntry("Transcender/Spice Rack", 6);
		line3.addEntry("Hair Spray Rear View Mirror Danger Indicator", 18);

		addChart1(line);
		addChart2(line2);
		addChart3(line3);
	}

	private void addChart1(SimpleNumberSeries<Double> line)
	{
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<SimpleNumberSeries<Double>>(Arrays.asList(line)));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getLegend().setShow(false);
		chart1O.getAxes().getXaxis().setAutoscale(true);
		chart1O.getAxes().getXaxis().setLabel("Core Motor Amperage");
		chart1O.getAxes().getXaxis().getLabelOptions().setFontSize("13pt");
		chart1O.getAxes().getXaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");

		chart1O.getAxes().getYaxis().setAutoscale(true);
		chart1O.getAxes().getYaxis().setRenderer("$.jqplot.LogAxisRenderer");
		chart1O
			.getAxes()
			.getYaxis()
			.setTickOptions(
				new PlotCanvasAxisTickRendererOptions().setFormatString("%.2f")
					.setLabelPosition(PlotTickLabelPosition.middle).setAngle(-30d));
		chart1O.getAxes().getYaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart1O.getAxes().getYaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart1O.getAxes().getYaxis().getLabelOptions().setFontSize("13pt");
		chart1O.getAxes().getYaxis().setLabel("Core Motor Voltage");

		add(chart1);
	}

	private void addChart2(StringNumberSeries<Integer> line)
	{
		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<StringNumberSeries<Integer>>(Arrays.asList(line)));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getAxes().getXaxis().setAutoscale(true);
		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.DateAxisRenderer");
		chart2O.getAxes().getXaxis().setLabel("Incliment Occurrance");
		chart2O.getAxes().getXaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart2O.getAxes().getXaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart2O
			.getAxes()
			.getXaxis()
			.setTickOptions(
				new PlotCanvasAxisTickRendererOptions().setLabelPosition(
					PlotTickLabelPosition.middle).setAngle(15d));
		chart2O.getAxes().getYaxis().setLabel("Incliment Factor");
		chart2O.getAxes().getYaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");

		add(chart2);
	}

	private void addChart3(StringNumberSeries<Integer> line)
	{
		JQPlot chart3 =
			new JQPlot("chart3", new ListModel<StringNumberSeries<Integer>>(Arrays.asList(line)));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.addNewSeries().setRenderer("$.jqplot.BarRenderer");
		chart3O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart3O.getAxes().getXaxis().setLabel("Warranty Concern");
		chart3O.getAxes().getXaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart3O.getAxes().getXaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart3O.getAxes().getXaxis()
			.setTickOptions(new PlotCanvasAxisTickRendererOptions().setAngle(-30d));

		chart3O.getAxes().getYaxis().setAutoscale(true);
		chart3O.getAxes().getYaxis().setLabel("Occurance");
		chart3O.getAxes().getYaxis().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");

		add(chart3);
	}
}
