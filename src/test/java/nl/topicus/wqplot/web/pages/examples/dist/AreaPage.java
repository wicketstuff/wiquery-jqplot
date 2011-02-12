package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.JQPlotEvent;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotLineRendererOptions;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.util.ListModel;
import org.odlabs.wiquery.core.events.Event;
import org.odlabs.wiquery.core.events.WiQueryEventBehavior;
import org.odlabs.wiquery.core.javascript.JsScope;
import org.odlabs.wiquery.core.javascript.JsScopeContext;

public class AreaPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AreaPage()
	{
		addChart1b();
		addChart1c();
	}

	private void addChart1b()
	{
		List<SimpleNumberSeries<Integer>> chart1series =
			new ArrayList<SimpleNumberSeries<Integer>>();
		chart1series.add(new SimpleNumberSeries<Integer>(11, 9, 5, 12, 14));
		chart1series.add(new SimpleNumberSeries<Integer>(4, 8, 5, 3, 6));
		chart1series.add(new SimpleNumberSeries<Integer>(12, 6, 13, 11, 2));

		JQPlot chart1b =
			new JQPlot("chart1b", new ListModel<SimpleNumberSeries<Integer>>(chart1series));

		PlotOptions chart1bO = chart1b.getOptions();
		chart1bO.setStackSeries(true);
		chart1bO.getSeriesDefaults().setFill(true);
		chart1bO.getAxes().getXaxis().setRenderer("$.jqplot.CategoryAxisRenderer");
		chart1bO.getAxes().getXaxis().setTicks("Mon", "Tue", "Wed", "Thu", "Fri");

		add(chart1b);

		final WebMarkupContainer info1b = new WebMarkupContainer("info1b");
		info1b.setOutputMarkupId(true);
		add(info1b);

		chart1b.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_HIGHLIGHT)
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
						body.append(info1b.getMarkupId());
						body.append("').html("
							+ "'series: '+seriesIndex+', point: '+pointIndex+', data: '+data);");
						scopeContext.append(body);
					}
				};
			}
		}));

		chart1b.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_UNHIGHLIGHT)
		{
			private static final long serialVersionUID = 1L;

			@Override
			public JsScope callback()
			{
				return new JsScope("ev")
				{
					private static final long serialVersionUID = 1L;

					@Override
					protected void execute(JsScopeContext scopeContext)
					{
						StringBuilder body = new StringBuilder();
						body.append("$('#");
						body.append(info1b.getMarkupId());
						body.append("').html('Nothing');");
						scopeContext.append(body);
					}
				};
			}
		}));
	}

	private void addChart1c()
	{
		List<SimpleNumberSeries<Integer>> chart2series =
			new ArrayList<SimpleNumberSeries<Integer>>();
		chart2series.add(new SimpleNumberSeries<Integer>(4, -3, 3, 6, 2, -2));

		JQPlot chart1c =
			new JQPlot("chart1c", new ListModel<SimpleNumberSeries<Integer>>(chart2series));

		PlotOptions chart1cO = chart1c.getOptions();
		chart1cO.setStackSeries(true);
		chart1cO.getSeriesDefaults().setFill(true);
		chart1cO.getSeriesDefaults().setFillToZero(true);
		chart1cO.getSeriesDefaults().setRendererOptions(
			new PlotLineRendererOptions().setHighlightMouseDown(true));

		add(chart1c);

		final WebMarkupContainer info1c = new WebMarkupContainer("info1c");
		info1c.setOutputMarkupId(true);
		add(info1c);

		chart1c.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_HIGHLIGHT)
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
						body.append(info1c.getMarkupId());
						body.append("').html("
							+ "'series: '+seriesIndex+', point: '+pointIndex+', data: '+data);");
						scopeContext.append(body);
					}
				};
			}
		}));
	}
}
