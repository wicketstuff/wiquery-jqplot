package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.JQPlotEvent;
import nl.topicus.wqplot.data.NumberSeries;
import nl.topicus.wqplot.data.SimpleNumberSeries;
import nl.topicus.wqplot.options.PlotBarDirection;
import nl.topicus.wqplot.options.PlotBarRendererOptions;
import nl.topicus.wqplot.options.PlotLegendLocation;
import nl.topicus.wqplot.options.PlotLegendPlacement;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.options.PlotPointLabelLocation;
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
		addChart2b();
		addChart3();
		addChart4();
		addChart5();
		addChart6();
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

	private void addChart2b()
	{
		List<NumberSeries<Integer, Integer>> series =
			new ArrayList<NumberSeries<Integer, Integer>>();
		NumberSeries<Integer, Integer> l1 = new NumberSeries<Integer, Integer>();
		l1.addEntry(2, 1).addEntry(4, 2).addEntry(6, 3).addEntry(3, 4);
		series.add(l1);
		NumberSeries<Integer, Integer> l2 = new NumberSeries<Integer, Integer>();
		l2.addEntry(5, 1).addEntry(1, 2).addEntry(3, 3).addEntry(4, 4);
		series.add(l2);
		NumberSeries<Integer, Integer> l3 = new NumberSeries<Integer, Integer>();
		l3.addEntry(4, 1).addEntry(7, 2).addEntry(1, 3).addEntry(2, 4);
		series.add(l3);

		JQPlot chart2b =
			new JQPlot("chart2b", new ListModel<NumberSeries<Integer, Integer>>(series));

		PlotOptions chart2bO = chart2b.getOptions();
		chart2bO.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart2bO.getSeriesDefaults().getPointLabels().setShow(true);
		chart2bO.getSeriesDefaults().getPointLabels().setLocation(PlotPointLabelLocation.e);
		chart2bO.getSeriesDefaults().getPointLabels().setEdgeTolerance(-15d);
		chart2bO.getSeriesDefaults().setShadowAngle(135d);
		chart2bO.getSeriesDefaults().setRendererOptions(
			new PlotBarRendererOptions().setBarDirection(PlotBarDirection.horizontal));

		chart2bO.getAxes().getYaxis().setRenderer("$.jqplot.CategoryAxisRenderer");

		add(chart2b);

		final WebMarkupContainer info2b = new WebMarkupContainer("info2b");
		info2b.setOutputMarkupId(true);
		add(info2b);

		final WebMarkupContainer info2c = new WebMarkupContainer("info2c");
		info2c.setOutputMarkupId(true);
		add(info2c);

		chart2b.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_HIGHLIGHT)
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
						body.append(info2b.getMarkupId());
						body.append("').html('series: '+seriesIndex+', point: '+pointIndex+', data: '+data+ ', pageX: '+ev.pageX+', pageY: '+ev.pageY);");
						scopeContext.append(body);
					}
				};
			}
		}));

		chart2b.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_CLICK)
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
						body.append(info2c.getMarkupId());
						body.append("').html('series: '+seriesIndex+', point: '+pointIndex+', data: '+data+ ', pageX: '+ev.pageX+', pageY: '+ev.pageY);");
						scopeContext.append(body);
					}
				};
			}
		}));

		chart2b.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_UNHIGHLIGHT)
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
						body.append(info2b.getMarkupId());
						body.append("').html('Nothing');");
						scopeContext.append(body);
					}
				};
			}
		}));
	}

	private void addChart3()
	{
		JQPlot chart3 =
			new JQPlot("chart3", new ListModel<SimpleNumberSeries<Integer>>(Arrays.asList(
				new SimpleNumberSeries<Integer>(2, 6, 7, 10), new SimpleNumberSeries<Integer>(7, 5,
					3, 2), new SimpleNumberSeries<Integer>(14, 9, 3, 8))));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.setStackSeries(true);
		chart3O.setCaptureRightClick(true);

		chart3O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart3O.getSeriesDefaults().setRendererOptions(
			new PlotBarRendererOptions().setHighlightMouseDown(true));
		chart3O.getSeriesDefaults().getPointLabels().setShow(true);

		chart3O.getLegend().setShow(true);
		chart3O.getLegend().setLocation(PlotLegendLocation.e);
		chart3O.getLegend().setPlacement(PlotLegendPlacement.outside);

		add(chart3);

		final WebMarkupContainer info3 = new WebMarkupContainer("info3");
		info3.setOutputMarkupId(true);
		add(info3);

		chart3.add(new WiQueryEventBehavior(new Event(JQPlotEvent.DATA_RIGHTCLICK)
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
						body.append(info3.getMarkupId());
						body.append("').html('series: '+seriesIndex+', point: '+pointIndex+', data: '+data);");
						scopeContext.append(body);
					}
				};
			}
		}));
	}

	private void addChart4()
	{
		List<NumberSeries<Integer, Integer>> series =
			new ArrayList<NumberSeries<Integer, Integer>>();
		NumberSeries<Integer, Integer> l1 = new NumberSeries<Integer, Integer>();
		l1.addEntry(2, 1).addEntry(6, 2).addEntry(7, 3).addEntry(10, 4);
		series.add(l1);
		NumberSeries<Integer, Integer> l2 = new NumberSeries<Integer, Integer>();
		l2.addEntry(7, 1).addEntry(5, 2).addEntry(3, 3).addEntry(2, 4);
		series.add(l2);
		NumberSeries<Integer, Integer> l3 = new NumberSeries<Integer, Integer>();
		l3.addEntry(14, 1).addEntry(9, 2).addEntry(9, 3).addEntry(8, 4);
		series.add(l3);

		JQPlot chart4 = new JQPlot("chart4", new ListModel<NumberSeries<Integer, Integer>>(series));

		PlotOptions chart4O = chart4.getOptions();
		chart4O.setStackSeries(true);
		chart4O.setCaptureRightClick(true);

		chart4O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart4O.getSeriesDefaults().setShadowAngle(135d);
		chart4O.getSeriesDefaults().setRendererOptions(
			new PlotBarRendererOptions().setHighlightMouseDown(true).setBarDirection(
				PlotBarDirection.horizontal));
		chart4O.getSeriesDefaults().getPointLabels().setShow(true);
		chart4O.getSeriesDefaults().getPointLabels().setFormatString("%d");

		chart4O.getLegend().setShow(true);
		chart4O.getLegend().setLocation(PlotLegendLocation.e);
		chart4O.getLegend().setPlacement(PlotLegendPlacement.outside);

		chart4O.getAxes().getYaxis().setRenderer("$.jqplot.CategoryAxisRenderer");

		add(chart4);
	}

	private void addChart5()
	{
		List<NumberSeries<Integer, Integer>> series =
			new ArrayList<NumberSeries<Integer, Integer>>();
		NumberSeries<Integer, Integer> l1 = new NumberSeries<Integer, Integer>();
		l1.addEntry(2, 1).addEntry(null, 2).addEntry(7, 3).addEntry(10, 4);
		series.add(l1);

		JQPlot chart5 = new JQPlot("chart5", new ListModel<NumberSeries<Integer, Integer>>(series));

		PlotOptions chart5O = chart5.getOptions();
		chart5O.setCaptureRightClick(true);

		chart5O.getSeriesDefaults().setRenderer("$.jqplot.BarRenderer");
		chart5O.getSeriesDefaults().setShadowAngle(135d);
		chart5O.getSeriesDefaults().setRendererOptions(
			new PlotBarRendererOptions().setHighlightMouseDown(true).setBarDirection(
				PlotBarDirection.horizontal));
		chart5O.getSeriesDefaults().getPointLabels().setShow(true);
		chart5O.getSeriesDefaults().getPointLabels().setFormatString("%d");

		chart5O.getLegend().setShow(true);
		chart5O.getLegend().setLocation(PlotLegendLocation.e);
		chart5O.getLegend().setPlacement(PlotLegendPlacement.outside);

		chart5O.getAxes().getYaxis().setRenderer("$.jqplot.CategoryAxisRenderer");

		add(chart5);
	}

	private void addChart6()
	{
		JQPlot chart6 =
			new JQPlot("chart6", new ListModel<SimpleNumberSeries<Integer>>(
				Arrays.asList(new SimpleNumberSeries<Integer>(1, 2, 3, 4))));

		PlotOptions chart6O = chart6.getOptions();

		chart6O.getSeriesDefaults().setRenderer("$.jqplot.PieRenderer");

		add(chart6);
	}
}
