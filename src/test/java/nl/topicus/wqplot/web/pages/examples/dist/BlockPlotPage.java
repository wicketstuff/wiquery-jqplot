package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.plugins.JQPlotBlockRenderer;
import nl.topicus.wqplot.components.plugins.JQPlotEnhancedLegendRenderer;
import nl.topicus.wqplot.data.BlockSeries;
import nl.topicus.wqplot.data.BlockSeriesEntryLabel;
import nl.topicus.wqplot.options.PlotBlockRendererOptions;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BlockPlotPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BlockPlotPage()
	{
		addChart1();
		addChart2();
	}

	private void addChart1()
	{
		List<BlockSeries<Double, Double, String, Object>> lines =
			new ArrayList<BlockSeries<Double, Double, String, Object>>();
		BlockSeries<Double, Double, String, Object> s1 =
			new BlockSeries<Double, Double, String, Object>();
		s1.addEntry(0.9, 120d, "Vernors", null);
		s1.addEntry(1.8, 140d, "Fanta", null);
		s1.addEntry(3.2, 90d, "Barqs", new BlockSeriesEntryLabel("#ddbb33"));
		s1.addEntry(4.1, 140d, "Arizon Iced Tea", null);
		s1.addEntry(4.5, 91d, "Red Bull", null);
		s1.addEntry(6.8, 17d, "Go Girl", null);
		lines.add(s1);

		BlockSeries<Double, Double, String, Object> s2 =
			new BlockSeries<Double, Double, String, Object>();
		s2.addEntry(1.3, 44d, "Pepsi", null);
		s2.addEntry(2.1, 170d, "Sierra Mist", null);
		s2.addEntry(2.6, 66d, "Mountain Dew", null);
		s2.addEntry(4d, 52d, "Sobe", null);
		s2.addEntry(5.4, 16d, "Amp", null);
		s2.addEntry(6d, 48d, "Aquafina", null);
		lines.add(s2);

		BlockSeries<Double, Double, String, Object> s3 =
			new BlockSeries<Double, Double, String, Object>();
		s3.addEntry(1d, 59d, "Coca-Cola", new BlockSeriesEntryLabel("rgb(250, 160, 160)"));
		s3.addEntry(2d, 50d, "Ambasa", null);
		s3.addEntry(3d, 90d, "Mello Yello", null);
		s3.addEntry(4d, 90d, "Sprite", null);
		s3.addEntry(5d, 71d, "Squirt", null);
		s3.addEntry(5d, 155d, "Youki", null);
		lines.add(s3);

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<BlockSeries<Double, Double, String, Object>>(lines));

		PlotOptions chart1O = chart1.getOptions();
		chart1O.getSeriesDefaults().setRenderer(JQPlotBlockRenderer.get());
		chart1O.getLegend().setRenderer(JQPlotEnhancedLegendRenderer.get()).setShow(true);
		chart1O.addNewSeries();
		chart1O.addNewSeries().setRendererOptions(
			new PlotBlockRendererOptions().setCss("background: '#A1EED6'"));
		chart1O.addNewSeries().setRendererOptions(
			new PlotBlockRendererOptions().setCss("background: '#D3E4A0'"));
		chart1O.getAxes().getXaxis().setMin(0).setMax(8);
		chart1O.getAxes().getYaxis().setMin(0).setMax(200);
		add(chart1);
	}

	private void addChart2()
	{
		List<BlockSeries<Double, Double, String, Object>> lines =
			new ArrayList<BlockSeries<Double, Double, String, Object>>();
		BlockSeries<Double, Double, String, Object> s1 =
			new BlockSeries<Double, Double, String, Object>();
		s1.addEntry(0.9, 120d, "Vernors", null);
		s1.addEntry(1.8, 140d, "Fanta", null);
		s1.addEntry(3.2, 90d, "Barqs", null);
		s1.addEntry(4.1, 140d, "Arizon Iced Tea", null);
		s1.addEntry(4.5, 91d, "Red Bull", null);
		s1.addEntry(6.8, 17d, "Go Girl", null);
		lines.add(s1);

		BlockSeries<Double, Double, String, Object> s2 =
			new BlockSeries<Double, Double, String, Object>();
		s2.addEntry(1.3, 44d, "Pepsi", null);
		s2.addEntry(2.1, 170d, "Sierra Mist", null);
		s2.addEntry(2.6, 66d, "Mountain Dew", null);
		s2.addEntry(4d, 52d, "Sobe", null);
		s2.addEntry(5.4, 16d, "Amp", null);
		s2.addEntry(6d, 48d, "Aquafina", null);
		lines.add(s2);

		BlockSeries<Double, Double, String, Object> s3 =
			new BlockSeries<Double, Double, String, Object>();
		s3.addEntry(1d, 59d, "Coca-Cola", null);
		s3.addEntry(2d, 50d, "Ambasa", null);
		s3.addEntry(3d, 90d, "Mello Yello", null);
		s3.addEntry(4d, 90d, "Sprite", null);
		s3.addEntry(5d, 71d, "Squirt", null);
		s3.addEntry(5d, 155d, "Youki", null);
		lines.add(s3);

		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<BlockSeries<Double, Double, String, Object>>(lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.getSeriesDefaults().setRenderer(JQPlotBlockRenderer.get())
			.setRendererOptions(new PlotBlockRendererOptions().setVaryBlockColors(true));
		chart2O.getSeriesDefaults().getPointLabels().setShow(false);
		chart2O.getLegend().setRenderer(JQPlotEnhancedLegendRenderer.get()).setShow(true)
			.setShowSwatch(false);
		chart2O.addNewSeries().setLabel("Independent Brands");
		chart2O.addNewSeries().setLabel("Pepsi Brands");
		chart2O.addNewSeries().setLabel("Coke Brands");
		chart2O.getAxes().getXaxis().setMin(0).setMax(8);
		chart2O.getAxes().getYaxis().setMin(0).setMax(200);

		add(chart2);
	}
}
