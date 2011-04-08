package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.plugins.JQPlotBezierCurveRenderer;
import nl.topicus.wqplot.components.plugins.JQPlotDateAxisRenderer;
import nl.topicus.wqplot.data.BaseSeries;
import nl.topicus.wqplot.data.BaseSeriesEntry;
import nl.topicus.wqplot.data.BezierCurveSeries;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BezierCurvePage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BezierCurvePage()
	{
		addChart1();
		addChart2();
		addChart3();
	}

	private void addChart1()
	{

		List<BezierCurveSeries<Double, Double, Double>> series =
			new ArrayList<BezierCurveSeries<Double, Double, Double>>();
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 1d, Arrays.asList(2d, 2d, 4d,
			0.5d, 6d, 0d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 5d, Arrays.asList(2d, 6d, 5d,
			1d, 6d, 0.5)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 6d, Arrays.asList(3d, 9d, 4d,
			8d, 6d, 3d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 7d, Arrays.asList(2d, 9d, 4d,
			8d, 6d, 6d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 8d, Arrays.asList(3d, 9d, 4d,
			8d, 6d, 8d)));

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<BezierCurveSeries<Double, Double, Double>>(series));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getSeriesDefaults().setRenderer(JQPlotBezierCurveRenderer.get());

		chart1O.getLegend().setShow(true);

		add(chart1);
	}

	private void addChart2()
	{
		List<BezierCurveSeries<Double, Double, Double>> series =
			new ArrayList<BezierCurveSeries<Double, Double, Double>>();
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 1d, Arrays.asList(2d, 2d, 4d,
			0.5d, 6d, 0d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 5d, Arrays.asList(2d, 6d, 5d,
			1d, 6d, 0.5)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 6d, Arrays.asList(3d, 9d, 4d,
			8d, 6d, 3d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 7d, Arrays.asList(2d, 9d, 4d,
			8d, 6d, 6d)));
		series.add(new BezierCurveSeries<Double, Double, Double>(0d, 8d, Arrays.asList(3d, 9d, 4d,
			8d, 6d, 8d)));

		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<BezierCurveSeries<Double, Double, Double>>(series));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getSeriesDefaults().setRenderer(JQPlotBezierCurveRenderer.get());

		chart2O.getLegend().setShow(true);

		add(chart2);
	}

	@SuppressWarnings("unchecked")
	private void addChart3()
	{
		List<BaseSeries<String, Double>> series = new ArrayList<BaseSeries<String, Double>>();
		series.add(new BaseSeries<String, Double>(new BaseSeriesEntry<String, Double>("01/01/2010",
			1d), new BaseSeriesEntry<String, Double>("02/01/2010", 2d),
			new BaseSeriesEntry<String, Double>("03/01/2010", 0.5d),
			new BaseSeriesEntry<String, Double>("04/01/2010", 0d)));
		series.add(new BaseSeries<String, Double>(new BaseSeriesEntry<String, Double>("01/01/2010",
			5d), new BaseSeriesEntry<String, Double>("02/01/2010", 6d),
			new BaseSeriesEntry<String, Double>("03/01/2010", 1d),
			new BaseSeriesEntry<String, Double>("04/01/2010", 0.5d)));
		series.add(new BaseSeries<String, Double>(new BaseSeriesEntry<String, Double>("01/01/2010",
			6d), new BaseSeriesEntry<String, Double>("02/01/2010", 9d),
			new BaseSeriesEntry<String, Double>("03/01/2010", 8d),
			new BaseSeriesEntry<String, Double>("04/01/2010", 3d)));
		series.add(new BaseSeries<String, Double>(new BaseSeriesEntry<String, Double>("01/01/2010",
			7d), new BaseSeriesEntry<String, Double>("02/01/2010", 9d),
			new BaseSeriesEntry<String, Double>("03/01/2010", 8d),
			new BaseSeriesEntry<String, Double>("04/01/2010", 6d)));
		series.add(new BaseSeries<String, Double>(new BaseSeriesEntry<String, Double>("01/01/2010",
			8d), new BaseSeriesEntry<String, Double>("02/01/2010", 9d),
			new BaseSeriesEntry<String, Double>("03/01/2010", 8d),
			new BaseSeriesEntry<String, Double>("04/01/2010", 8d)));

		JQPlot chart3 = new JQPlot("chart3", new ListModel<BaseSeries<String, Double>>(series));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.getSeriesDefaults().setRenderer(JQPlotBezierCurveRenderer.get());
		chart3O.getAxes().getXaxis().setRenderer(JQPlotDateAxisRenderer.get()).setNumberTicks(4);
		chart3O.getLegend().setShow(true);

		add(chart3);
	}
}
