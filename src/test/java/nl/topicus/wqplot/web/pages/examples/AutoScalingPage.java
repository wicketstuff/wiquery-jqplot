package nl.topicus.wqplot.web.pages.examples;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.SimpleNumberSeries;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.util.ListModel;

public class AutoScalingPage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public AutoScalingPage()
	{
		addPlot1();
		addPlot2();
		addPlot3();
		addPlot4();
	}

	private void addPlot1()
	{
		SimpleNumberSeries<Double> l1 = new SimpleNumberSeries<Double>();
		l1.addEntry(0.82d);
		l1.addEntry(1.5d);
		l1.addEntry(3.4d);
		l1.addEntry(4d);

		@SuppressWarnings("unchecked")
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<SimpleNumberSeries<Double>>(Arrays.asList(l1)));
		add(chart1);
	}

	private void addPlot2()
	{
		SimpleNumberSeries<Double> l1 = new SimpleNumberSeries<Double>();
		l1.addEntry(0.82d);
		l1.addEntry(1.5d);
		l1.addEntry(3.4d);
		l1.addEntry(4d);

		@SuppressWarnings("unchecked")
		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<SimpleNumberSeries<Double>>(Arrays.asList(l1)));
		chart2.getOptions().getAxes().getYaxis().getTickOptions().setFormatString("%.3f");
		add(chart2);
	}

	private void addPlot3()
	{
		SimpleNumberSeries<Double> l1 = new SimpleNumberSeries<Double>();
		l1.addEntry(0.82d);
		l1.addEntry(1.5d);
		l1.addEntry(3.4d);
		l1.addEntry(4d);

		@SuppressWarnings("unchecked")
		JQPlot chart3 =
			new JQPlot("chart3", new ListModel<SimpleNumberSeries<Double>>(Arrays.asList(l1)));
		chart3.getOptions().getAxes().getYaxis().setAutoscale(true);
		add(chart3);
	}

	private void addPlot4()
	{
		SimpleNumberSeries<Double> l1 = new SimpleNumberSeries<Double>();
		l1.addEntry(0.82d);
		l1.addEntry(1.5d);
		l1.addEntry(3.4d);
		l1.addEntry(4d);

		@SuppressWarnings("unchecked")
		JQPlot chart4 =
			new JQPlot("chart4", new ListModel<SimpleNumberSeries<Double>>(Arrays.asList(l1)));
		chart4.getOptions().getAxes().getYaxis().setAutoscale(true).getTickOptions()
			.setFormatString("%.3f");
		add(chart4);
	}
}
