/**
 * 
 */
package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;
import java.util.Date;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.plugins.JQPlotDateAxisRenderer;
import nl.topicus.wqplot.data.DateNumberSeries;
import nl.topicus.wqplot.options.PlotMarkerStyle;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotSeries;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

/**
 * @author Ernesto Reinaldo Barreiro
 * 
 */
public class DateAxisTestPage extends WebPage
{

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DateAxisTestPage()
	{
		addPlot1();
	}

	private void addPlot1()
	{
		long currentTime = System.currentTimeMillis();
		long day = 1000 * 60 * 60 * 24;
		DateNumberSeries<Double> l1 = new DateNumberSeries<Double>();
		for (int i = 0; i < 10; i++)
			l1.addEntry(new Date(currentTime + i * day), Math.random() * 1000);

		DateNumberSeries<Double> l2 = new DateNumberSeries<Double>();
		for (int i = 0; i < 10; i++)
			l2.addEntry(new Date(currentTime + i * day), Math.random() * 1000);

		DateNumberSeries<Double> l3 = new DateNumberSeries<Double>();
		for (int i = 0; i < 10; i++)
			l3.addEntry(new Date(currentTime + i * day), Math.random() * 1000);

		DateNumberSeries<Double> l4 = new DateNumberSeries<Double>();
		for (int i = 0; i < 10; i++)
			l4.addEntry(new Date(currentTime + i * day), Math.random() * 1000);

		@SuppressWarnings("unchecked")
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<DateNumberSeries<Double>>(Arrays.asList(l1, l2, l3,
				l4)));
		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("Date chart");

		chart1O.getAxes().getXaxis().setRenderer(JQPlotDateAxisRenderer.get().getName());

		PlotSeries chart1series1 = chart1O.addNewSeries();
		chart1series1.setLineWidth(2d);
		chart1series1.getMarkerOptions().setStyle(PlotMarkerStyle.diamond);

		PlotSeries chart1series2 = chart1O.addNewSeries();
		chart1series2.setShowLine(true);
		chart1series2.getMarkerOptions().setSize(7d).setStyle(PlotMarkerStyle.diamond);

		PlotSeries chart1series3 = chart1O.addNewSeries();
		chart1series3.getMarkerOptions().setStyle(PlotMarkerStyle.circle);

		PlotSeries chart1series4 = chart1O.addNewSeries();
		chart1series4.setLineWidth(5d);
		chart1series4.getMarkerOptions().setSize(14d).setStyle(PlotMarkerStyle.filledSquare);

		add(chart1);
	}

}
