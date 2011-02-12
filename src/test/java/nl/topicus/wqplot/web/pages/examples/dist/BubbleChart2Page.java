package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.data.BubbleSeries;
import nl.topicus.wqplot.data.BubbleSeriesEntryLabel;
import nl.topicus.wqplot.options.PlotBubbleRendererOptions;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BubbleChart2Page extends BasePage
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

		JQPlot chart1b =
			new JQPlot("chart1b", new ListModel<BubbleSeries<Integer, Integer, Integer, String>>(
				lines));

		PlotOptions chart1bO = chart1b.getOptions();
		chart1bO.setTitle("Tooltip and Custom Legend Highlighting");
		chart1bO.getSeriesDefaults().setRenderer("$.jqplot.BubbleRenderer");
		PlotBubbleRendererOptions renderOptions = new PlotBubbleRendererOptions();
		renderOptions.setBubbleAlpha(0.6);
		renderOptions.setHighlightAlpha(0.8);
		renderOptions.setShowLabels(false);
		chart1bO.getSeriesDefaults().setRendererOptions(renderOptions);
		chart1bO.getSeriesDefaults().setShadow(true);
		chart1bO.getSeriesDefaults().setShadowAlpha(0.05);

		add(chart1b);
	}

	private void addChart1c()
	{
		List<BubbleSeries<Integer, Integer, Integer, Object>> lines =
			new ArrayList<BubbleSeries<Integer, Integer, Integer, Object>>();
		BubbleSeries<Integer, Integer, Integer, Object> arr =
			new BubbleSeries<Integer, Integer, Integer, Object>();
		arr.addEntry(11, 123, 1236, new BubbleSeriesEntryLabel("Acura", "sandybrown"));
		arr.addEntry(45, 92, 1067, new BubbleSeriesEntryLabel("Alfa Romeo", "skyblue"));
		arr.addEntry(24, 104, 1176, new BubbleSeriesEntryLabel("AM General", "salmon"));
		arr.addEntry(50, 23, 610, new BubbleSeriesEntryLabel(null, "papayawhip"));
		arr.addEntry(18, 17, 539, "Audi");
		arr.addEntry(7, 89, 864, null);
		arr.addEntry(2, 13, 1026, "Bugatti");
		lines.add(arr);

		JQPlot chart1c =
			new JQPlot("chart1c", new ListModel<BubbleSeries<Integer, Integer, Integer, Object>>(
				lines));

		PlotOptions chart1cO = chart1c.getOptions();
		chart1cO.setTitle("Bubble Data Customizations");
		chart1cO.getSeriesDefaults().setRenderer("$.jqplot.BubbleRenderer");

		add(chart1c);
	}

	private void addChart2()
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

		JQPlot chart2 =
			new JQPlot("chart2", new ListModel<BubbleSeries<Integer, Integer, Integer, String>>(
				lines));

		PlotOptions chart2O = chart2.getOptions();
		chart2O.setTitle("Bubble Gradient Fills<sup>*</sup>");
		chart2O.getSeriesDefaults().setRenderer("$.jqplot.BubbleRenderer");
		PlotBubbleRendererOptions renderOptions = new PlotBubbleRendererOptions();
		renderOptions.setBubbleGradients(true);
		chart2O.getSeriesDefaults().setRendererOptions(renderOptions);
		chart2O.getSeriesDefaults().setShadow(true);

		add(chart2);
	}

	private void addChart3()
	{
		List<BubbleSeries<Integer, Integer, Integer, String>> lines =
			new ArrayList<BubbleSeries<Integer, Integer, Integer, String>>();
		BubbleSeries<Integer, Integer, Integer, String> arr =
			new BubbleSeries<Integer, Integer, Integer, String>();
		arr.addEntry(44, 66, 897, "Acura");
		arr.addEntry(25, 40, 1119, "Alfa Romeo");
		arr.addEntry(2, 33, 1197, "AM General");
		arr.addEntry(4, 132, 896, "Aston Martin Lagonda");
		arr.addEntry(2, 129, 314, "Audi");
		arr.addEntry(14, 47, 612, "BMW");
		arr.addEntry(45, 112, 719, "Bugatti");
		arr.addEntry(11, 38, 785, "Buick");
		arr.addEntry(15, 39, 367, "Cadillac");
		arr.addEntry(6, 133, 726, "Chevrolet");
		arr.addEntry(48, 84, 1082, "Citroen");
		arr.addEntry(40, 18, 1047, "DaimlerChrysler Corporation");
		arr.addEntry(24, 107, 1065, "Daewoo Motor Co.");
		arr.addEntry(27, 92, 792, "Delorean Motor Company");
		arr.addEntry(1, 78, 803, "Dodge");
		arr.addEntry(5, 149, 320, "Ferrari");
		arr.addEntry(11, 127, 497, "Fiat");
		arr.addEntry(14, 18, 805, "Ford Motor Company");
		arr.addEntry(9, 101, 394, "General Motors");
		arr.addEntry(16, 57, 338, "GMC");
		arr.addEntry(19, 89, 977, "Holden");
		arr.addEntry(35, 78, 464, "Honda");
		arr.addEntry(18, 130, 364, "Hummer");
		arr.addEntry(37, 20, 699, "Hyundai");
		arr.addEntry(33, 140, 457, "Infiniti");
		arr.addEntry(12, 122, 533, "Isuzu");
		arr.addEntry(25, 67, 767, "Jaguar Cars");
		arr.addEntry(0, 7, 481, "Jeep");
		arr.addEntry(38, 36, 611, "Jensen Motors");
		arr.addEntry(43, 91, 943, "Kia");
		arr.addEntry(45, 21, 569, "Laforza");
		lines.add(arr);

		JQPlot chart3 =
			new JQPlot("chart3", new ListModel<BubbleSeries<Integer, Integer, Integer, String>>(
				lines));

		PlotOptions chart3O = chart3.getOptions();
		chart3O.setTitle("Bubble Auto Scaling Options");
		chart3O.getSeriesDefaults().setRenderer("$.jqplot.BubbleRenderer");
		PlotBubbleRendererOptions renderOptions = new PlotBubbleRendererOptions();
		renderOptions.setAutoscalePointsFactor(-0.15);
		renderOptions.setAutoscaleMultiplier(0.85);
		renderOptions.setHighlightMouseDown(true);
		renderOptions.setBubbleAlpha(0.7);
		chart3O.getSeriesDefaults().setRendererOptions(renderOptions);
		chart3O.getSeriesDefaults().setShadow(true);
		chart3O.getSeriesDefaults().setShadowAlpha(0.05);

		add(chart3);
	}
}
