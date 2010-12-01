package nl.topicus.wiqueryjqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.CategorySeries;
import nl.topicus.wiqueryjqplot.options.PlotCanvasAxisTickRendererOptions;
import nl.topicus.wiqueryjqplot.options.PlotOptions;
import nl.topicus.wiqueryjqplot.options.PlotTickLabelPosition;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class AxisLabelsRotatedText2Page extends WebPage
{
	private static final long serialVersionUID = 1L;

	public AxisLabelsRotatedText2Page()
	{
		CategorySeries<String, Integer> line = new CategorySeries<String, Integer>();
		line.addEntry("Cup Holder Pinion Bob", 7);
		line.addEntry("Generic Fog Lamp", 9);
		line.addEntry("HDTV Receiver", 15);
		line.addEntry("8 Track Control Module", 12);
		line.addEntry("Sludge Pump Fourier Modulator", 3);
		line.addEntry("Transcender/Spice Rack", 6);
		line.addEntry("Hair Spray Danger Indicator", 18);

		CategorySeries<String, Integer> line2 = new CategorySeries<String, Integer>();
		line2.addEntry("Nickle", 28);
		line2.addEntry("Aluminum", 13);
		line2.addEntry("Xenon", 54);
		line2.addEntry("Silver", 47);
		line2.addEntry("Sulfer", 16);
		line2.addEntry("Silicon", 14);
		line2.addEntry("Vanadium", 23);

		addChart1(line);
		addChart2(line, line2);
		addChart3(line);
	}

	private void addChart1(CategorySeries<String, Integer> line)
	{
		List<CategorySeries<String, Integer>> lines =
			new ArrayList<CategorySeries<String, Integer>>();
		lines.add(line);

		JQPlot chart1 = new JQPlot("chart1", new ListModel<CategorySeries<String, Integer>>(lines));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("Concern vs. Occurrance");
		chart1O.addNewSeries().setRenderer("$.jqplot.BarRenderer");
		chart1O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart1O.getAxes().getXaxis().setLabel("Warranty Concern");
		chart1O.getAxes().getXaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");

		PlotCanvasAxisTickRendererOptions xAxisTickOptions =
			new PlotCanvasAxisTickRendererOptions();
		xAxisTickOptions.setAngle(-30);
		xAxisTickOptions.setEnableFontSupport(true);
		chart1O.getAxes().getXaxis().setTickOptions(xAxisTickOptions);

		chart1O.getAxes().getYaxis().setAutoscale(true);
		chart1O.getAxes().getYaxis().setLabel("Occurance");
		chart1O.getAxes().getYaxis().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");

		PlotCanvasAxisTickRendererOptions yAxisTickOptions =
			new PlotCanvasAxisTickRendererOptions();
		yAxisTickOptions.setAngle(-30);
		yAxisTickOptions.setEnableFontSupport(true);
		chart1O.getAxes().getYaxis().setTickOptions(yAxisTickOptions);

		add(chart1);
	}

	private void addChart2(CategorySeries<String, Integer> line,
			CategorySeries<String, Integer> line2)
	{
		List<CategorySeries<String, Integer>> lines =
			new ArrayList<CategorySeries<String, Integer>>();
		lines.add(line);
		lines.add(line2);

		JQPlot chart2 = new JQPlot("chart2", new ListModel<CategorySeries<String, Integer>>(lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.addNewSeries().setRenderer("$.jqplot.BarRenderer");
		chart2O.addNewSeries().setXaxis("x2axis").setYaxis("y2axis");

		chart2O.getAxesDefaults().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart2O.getAxesDefaults().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart2O.getAxesDefaults().setTickOptions(
			new PlotCanvasAxisTickRendererOptions().setAngle(30));

		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart2O.getAxes().getXaxis().setLabel("Warranty Concern");
		chart2O.getAxes().getX2axis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart2O.getAxes().getX2axis().setLabel("Metal");
		chart2O.getAxes().getYaxis().setLabel("Occurance");
		chart2O.getAxes().getYaxis().setAutoscale(true);
		chart2O.getAxes().getY2axis().setLabel("Number");
		chart2O.getAxes().getY2axis().setAutoscale(true);

		add(chart2);
	}

	private void addChart3(CategorySeries<String, Integer> line)
	{
		List<CategorySeries<String, Integer>> lines =
			new ArrayList<CategorySeries<String, Integer>>();
		lines.add(line);

		JQPlot chart3 = new JQPlot("chart3", new ListModel<CategorySeries<String, Integer>>(lines));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.setTitle("Concern vs. Occurrance");
		chart3O.addNewSeries().setRenderer("$.jqplot.BarRenderer");
		chart3O.getAxesDefaults().setLabelRenderer("$.jqplot.CanvasAxisLabelRenderer");
		chart3O.getAxesDefaults().setTickRenderer("$.jqplot.CanvasAxisTickRenderer");
		chart3O.getAxesDefaults().setTickOptions(
			new PlotCanvasAxisTickRendererOptions().setLabelPosition(PlotTickLabelPosition.middle)
				.setAngle(-30));
		chart3O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart3O.getAxes().getXaxis().setLabel("Warranty Concern");
		chart3O.getAxes().getYaxis().setAutoscale(true);
		chart3O.getAxes().getYaxis().setLabel("Occurance");
		add(chart3);
	}
}
