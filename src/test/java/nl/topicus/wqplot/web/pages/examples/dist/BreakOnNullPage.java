package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BreakOnNullPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BreakOnNullPage()
	{
		addChart1();
	}

	@SuppressWarnings("unchecked")
	private void addChart1()
	{
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<SimpleNumberSeries<Integer>>(
				Arrays.asList(new SimpleNumberSeries<Integer>(null, 13, 43, null, 18, 25, 26, 41,
					42, null, null, null, 37, 29, 27, 19))));
		PlotOptions chart1O = chart1.getOptions();
		chart1O.setTitle("breakOnNull true");
		chart1O.getSeriesDefaults().setBreakOnNull(true);
		chart1O.getAxes().getXaxis().setMin(0).setMax(18).setTickInterval(2);

		add(chart1);
	}
}
