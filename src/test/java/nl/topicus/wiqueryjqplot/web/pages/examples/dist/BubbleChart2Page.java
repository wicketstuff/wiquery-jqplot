package nl.topicus.wiqueryjqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wiqueryjqplot.components.JQPlot;
import nl.topicus.wiqueryjqplot.data.BubbleSeries;
import nl.topicus.wiqueryjqplot.options.PlotBubbleRendererOptions;
import nl.topicus.wiqueryjqplot.options.PlotOptions;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class BubbleChart2Page extends WebPage
{
	private static final long serialVersionUID = 1L;

	public BubbleChart2Page()
	{
		addChart1();
		addChart1b();
		addChart1c();
		addChart2();
		addChart3();
	}

	private void addChart1()
	{
		List<BubbleSeries<Integer, Integer, Integer, String>> lines =
			new ArrayList<BubbleSeries<Integer, Integer, Integer, String>>();
		BubbleSeries<Integer, Integer, Integer, String> arr =
			new BubbleSeries<Integer, Integer, Integer, String>();
		arr.addEntry(11, 123, 1236, "Acura");
		arr.addEntry(45, 92, 1067, "Alfa Romeo");
		arr.addEntry(24, 104, 1176, "AM General");
		arr.addEntry(50, 23, 610, "Aston Martin Lagonda");
		arr.addEntry(18, 17, 539, "Audi");
		arr.addEntry(7, 89, 864, "BMW");
		arr.addEntry(2, 13, 1026, "Bugatti");
		lines.add(arr);

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<BubbleSeries<Integer, Integer, Integer, String>>(
				lines));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("Transparent Bubbles");
		chart1O.getSeriesDefaults().setRenderer("$.jqplot.BubbleRenderer");
		chart1O.getSeriesDefaults().setShadow(true);
		chart1O.getSeriesDefaults().setShadowAlpha(0.05);
		PlotBubbleRendererOptions renderOptions = new PlotBubbleRendererOptions();
		renderOptions.setBubbleAlpha(0.6);
		renderOptions.setHighlightAlpha(0.8);
		chart1O.getSeriesDefaults().setRendererOptions(renderOptions);

		add(chart1);
	}

	private void addChart1b()
	{
	}

	private void addChart1c()
	{
	}

	private void addChart2()
	{
	}

	private void addChart3()
	{
	}
}
