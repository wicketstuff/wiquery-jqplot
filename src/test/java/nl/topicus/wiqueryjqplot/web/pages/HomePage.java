package nl.topicus.wiqueryjqplot.web.pages;

import java.util.Arrays;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.SimpleNumberSeries;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class HomePage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public HomePage()
	{
		SimpleNumberSeries series = new SimpleNumberSeries();
		series.addEntry(500.0);
		series.addEntry(250.0);
		series.addEntry(125.0);
		series.addEntry(62.5);
		series.addEntry(31.25);
		series.addEntry(15.625);
		series.addEntry(7.8125);
		add(new JQPlot("graph", new ListModel<SimpleNumberSeries>(Arrays.asList(series))));
	}
}
