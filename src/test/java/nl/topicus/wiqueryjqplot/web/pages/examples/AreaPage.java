package nl.topicus.wiqueryjqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.SimpleNumberSeries;
import nl.topicus.wiqueryjqplot.options.PlotOptions;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class AreaPage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public AreaPage()
	{
		SimpleNumberSeries<Integer> l2 = new SimpleNumberSeries<Integer>(11, 9, 5, 12, 14);
		SimpleNumberSeries<Integer> l3 = new SimpleNumberSeries<Integer>(4, 8, 5, 3, 6);
		SimpleNumberSeries<Integer> l4 = new SimpleNumberSeries<Integer>(12, 6, 13, 11, 2);
		SimpleNumberSeries<Integer> l5 = new SimpleNumberSeries<Integer>(4, -3, 3, 6, 2, -2);

		@SuppressWarnings("unchecked")
		JQPlot chart1b =
			new JQPlot("chart1b", new ListModel<SimpleNumberSeries<Integer>>(Arrays.asList(l2, l3,
				l4)));

		PlotOptions chart1bO = chart1b.getOptions();
		chart1bO.setStackSeries(true);
		chart1bO.getSeriesDefaults().setFill(true);
		chart1bO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart1bO.getAxes().getXaxis().setTicks("Mon", "Tue", "Wed", "Thu", "Fri");

		add(chart1b);
	}
}
