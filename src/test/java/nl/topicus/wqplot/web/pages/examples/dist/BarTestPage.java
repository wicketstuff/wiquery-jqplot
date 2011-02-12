package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.JQPlotEvent;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.util.ListModel;
import org.odlabs.wiquery.core.events.Event;
import org.odlabs.wiquery.core.events.WiQueryEventBehavior;
import org.odlabs.wiquery.core.javascript.JsScope;
import org.odlabs.wiquery.core.javascript.JsScopeContext;

public class BarTestPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BarTestPage()
	{
		addChart1();
		addChart2();
		// addChart3();
		// addChart4();
		// addChart5();
		// addChart6();
	}

	private void addChart1()
	{
		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<SimpleNumberSeries<Integer>>(
				Arrays.asList(new SimpleNumberSeries<Integer>(2, 6, 7, 10))));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart1O.getSeriesDefaults().getPointLabels().setShow(true);

		chart1O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart1O.getAxes().getXaxis().setTicks("a", "b", "c", "d");

		chart1O.getHighlighter().setShow(false);

		add(chart1);

		final WebMarkupContainer info1 = new WebMarkupContainer("info1");
		info1.setOutputMarkupId(true);
		add(info1);

		chart1.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_CLICK)
		{
			private static final long serialVersionUID = 1L;

			@Override
			public JsScope callback()
			{
				return new JsScope("ev", "seriesIndex", "pointIndex", "data")
				{
					private static final long serialVersionUID = 1L;

					@Override
					protected void execute(JsScopeContext scopeContext)
					{
						StringBuilder body = new StringBuilder();
						body.append("$('#");
						body.append(info1.getMarkupId());
						body.append("').html("
							+ "'series: '+seriesIndex+', point: '+pointIndex+', data: '+data);");
						scopeContext.append(body);
					}
				};
			}
		}));
	}

	private void addChart2()
	{
		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<SimpleNumberSeries<Integer>>(Arrays.asList(
				new SimpleNumberSeries<Integer>(2, 6, 7, 10), new SimpleNumberSeries<Integer>(7, 5,
					3, 2))));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart2O.getSeriesDefaults().getPointLabels().setShow(true);

		chart2O.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart2O.getAxes().getXaxis().setTicks("a", "b", "c", "d");

		add(chart2);

		final WebMarkupContainer info2 = new WebMarkupContainer("info2");
		info2.setOutputMarkupId(true);
		add(info2);

		chart2.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_HIGHLIGHT)
		{
			private static final long serialVersionUID = 1L;

			@Override
			public JsScope callback()
			{
				return new JsScope("ev", "seriesIndex", "pointIndex", "data")
				{
					private static final long serialVersionUID = 1L;

					@Override
					protected void execute(JsScopeContext scopeContext)
					{
						StringBuilder body = new StringBuilder();
						body.append("$('#");
						body.append(info2.getMarkupId());
						body.append("').html("
							+ "'series: '+seriesIndex+', point: '+pointIndex+', data: '+data);");
						scopeContext.append(body);
					}
				};
			}
		}));

		chart2.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_UNHIGHLIGHT)
		{
			private static final long serialVersionUID = 1L;

			@Override
			public JsScope callback()
			{
				return new JsScope("ev", "seriesIndex", "pointIndex", "data")
				{
					private static final long serialVersionUID = 1L;

					@Override
					protected void execute(JsScopeContext scopeContext)
					{
						StringBuilder body = new StringBuilder();
						body.append("$('#");
						body.append(info2.getMarkupId());
						body.append("').html('Nothing');");
						scopeContext.append(body);
					}
				};
			}
		}));
	}
}
