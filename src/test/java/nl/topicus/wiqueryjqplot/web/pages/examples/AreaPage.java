package nl.topicus.wiqueryjqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.SimpleNumberSeries;
import nl.topicus.wiqueryjqplot.options.PlotAxes;
import nl.topicus.wiqueryjqplot.options.PlotAxis;
import nl.topicus.wiqueryjqplot.options.PlotOptions;
import nl.topicus.wiqueryjqplot.options.PlotSeries;
import nl.topicus.wiqueryjqplot.options.PlotTick;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class AreaPage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public AreaPage()
	{
		SimpleNumberSeries<Integer> l1 = new SimpleNumberSeries<Integer>(11, 9, 5, 12, 14);
		SimpleNumberSeries<Integer> l2 = new SimpleNumberSeries<Integer>(4, 8, 5, 3, 6);
		SimpleNumberSeries<Integer> l3 = new SimpleNumberSeries<Integer>(12, 6, 13, 11, 2);
		SimpleNumberSeries<Integer> l4 = new SimpleNumberSeries<Integer>(4, -3, 3, 6, 2, -2);
		JQPlot chart1b =
			new JQPlot("chart1b", new ListModel<SimpleNumberSeries<Integer>>(Arrays.asList(l1, l2,
				l3)));
		PlotOptions chart1bO = chart1b.getOptions();
		chart1bO.setStackSeries(true);
		chart1bO.setSeriesDefaults(new PlotSeries());
		chart1bO.getSeriesDefaults().setFill(true);
		chart1bO.setAxes(new PlotAxes());
		chart1bO.getAxes().setXaxis(new PlotAxis());
		chart1bO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart1bO.getAxes().getXaxis().setTicks(
			Arrays.asList(new PlotTick("Mon"), new PlotTick("Tue"), new PlotTick("Wed"),
				new PlotTick("Thu"), new PlotTick("Fri")));

		add(chart1b);
	}
}
