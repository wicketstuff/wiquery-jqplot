package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.plugins.JQPlotBarRenderer;
import nl.topicus.wqplot.components.plugins.JQPlotCategoryAxisRenderer;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BarTest2Page extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BarTest2Page()
	{
		addChart1();
	}

	@SuppressWarnings("unchecked")
	private void addChart1()
	{
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<SimpleNumberSeries<Integer>>(
				Arrays.asList(new SimpleNumberSeries<Integer>(2, 6, 7, 10))));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getSeriesDefaults().setRenderer(JQPlotBarRenderer.get());

		chart1O.getAxes().getXaxis().setRenderer(JQPlotCategoryAxisRenderer.get());
		chart1O.getAxes().getXaxis().setTicks("a", "b", "c", "d");

		add(chart1);
	}
}
