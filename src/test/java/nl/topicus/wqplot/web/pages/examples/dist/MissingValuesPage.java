package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class MissingValuesPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public MissingValuesPage()
	{
		addChart1();
		addChart1b();
		addChart2();
		addChart2b();
	}

	private void addChart1()
	{
		List<SimpleNumberSeries<Integer>> lines = new ArrayList<SimpleNumberSeries<Integer>>();
		lines.add(new SimpleNumberSeries<Integer>(23, 53, 13, null, 18, 25, 26, 41, 42, null, null,
			null, 37, 29, 27, 19));

		JQPlot chart1 = new JQPlot("chart1", new ListModel<SimpleNumberSeries<Integer>>(lines));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("Default Line, ignore nulls");

		add(chart1);
	}

	private void addChart1b()
	{
		List<SimpleNumberSeries<Integer>> lines = new ArrayList<SimpleNumberSeries<Integer>>();
		lines.add(new SimpleNumberSeries<Integer>(23, 53, 13, null, 18, 25, 26, 41, 42, null, null,
			null, 37, 29, 27, 19));

		JQPlot chart1b = new JQPlot("chart1b", new ListModel<SimpleNumberSeries<Integer>>(lines));

		PlotOptions chart1bO = chart1b.getOptions();
		chart1bO.setTitle("breakOnNull true, Nulls Break Line");
		chart1bO.addNewSeries().setBreakOnNull(true);

		add(chart1b);
	}

	private void addChart2()
	{
		List<NumberSeries<Integer, Integer>> lines =
			new ArrayList<NumberSeries<Integer, Integer>>();
		NumberSeries<Integer, Integer> line = new NumberSeries<Integer, Integer>();
		line.addEntry(1, 2);
		line.addEntry(2, null);
		line.addEntry(3, 7);
		line.addEntry(4, 10);
		lines.add(line);

		JQPlot chart2 = new JQPlot("chart2", new ListModel<NumberSeries<Integer, Integer>>(lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");

		add(chart2);
	}

	private void addChart2b()
	{
		List<NumberSeries<Integer, Integer>> lines =
			new ArrayList<NumberSeries<Integer, Integer>>();
		NumberSeries<Integer, Integer> line = new NumberSeries<Integer, Integer>();
		line.addEntry(1, 2);
		line.addEntry(2, null);
		line.addEntry(3, 7);
		line.addEntry(4, 10);
		lines.add(line);

		JQPlot chart2b =
			new JQPlot("chart2b", new ListModel<NumberSeries<Integer, Integer>>(lines));

		PlotOptions chart2bO = chart2b.getOptions();
		chart2bO.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer").setBreakOnNull(true);
		chart2bO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");

		add(chart2b);
	}
}
