package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotAxisRendererOptions;
import nl.topicus.wqplot.options.PlotBarRendererOptions;
import nl.topicus.wqplot.options.PlotLegendLocation;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BarMissingValuesPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BarMissingValuesPage()
	{
		addChart1();
		addChart2();
	}

	private void addChart1()
	{
		NumberSeries<Integer, Integer> line1 = new NumberSeries<Integer, Integer>();
		line1.addEntry(2006, 4);
		line1.addEntry(2008, 9);
		line1.addEntry(2009, 16);
		NumberSeries<Integer, Integer> line2 = new NumberSeries<Integer, Integer>();
		line2.addEntry(2006, 3);
		line2.addEntry(2007, 7);
		line2.addEntry(2008, 6);
		NumberSeries<Integer, Integer> line3 = new NumberSeries<Integer, Integer>();
		line3.addEntry(2006, 5);
		line3.addEntry(2007, 1);
		line3.addEntry(2008, 3);
		line3.addEntry(2009, 7);
		NumberSeries<Integer, Integer> line4 = new NumberSeries<Integer, Integer>();
		line4.addEntry(2006, 2);
		line4.addEntry(2007, 5);
		line4.addEntry(2008, 4);
		line4.addEntry(2009, 9);

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<NumberSeries<Integer, Integer>>(Arrays.asList(line1,
				line2, line3, line4)));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart1O.getSeriesDefaults().setRendererOptions(
			new PlotBarRendererOptions().setBarPadding(10d).setBarMargin(10d));
		chart1O.getLegend().setShow(true).setLocation(PlotLegendLocation.nw);
		chart1O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer")
			.setRendererOptions(new PlotAxisRendererOptions().setSortMergedLabels(true));
		chart1O.getAxes().getYaxis().setMin(0).setMax(20).setNumberTicks(6);

		add(chart1);
	}

	private void addChart2()
	{
		List<SimpleNumberSeries<Integer>> lines = new ArrayList<SimpleNumberSeries<Integer>>();
		lines.add(new SimpleNumberSeries<Integer>(4, 3, 9, 16, 12, 8));
		lines.add(new SimpleNumberSeries<Integer>(null, null, null, 3, 7, 6));

		JQPlot chart2 = new JQPlot("chart2", new ListModel<SimpleNumberSeries<Integer>>(lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getSeriesDefaults();
		chart2O.getLegend().setShow(true).setLocation(PlotLegendLocation.nw);
		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer")
			.setTicks(2006, 2007, 2008, 2009, 2010, 2011);
		chart2O.getAxes().getYaxis().setMin(0).setMax(20).setNumberTicks(6);

		add(chart2);
	}
}
