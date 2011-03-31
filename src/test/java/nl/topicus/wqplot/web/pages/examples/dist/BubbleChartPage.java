package nl.topicus.wqplot.web.pages.examples.dist;

import java.util.Arrays;

import nl.topicus.wqplot.components.JQPlot;
import nl.topicus.wqplot.components.plugins.JQPlotBubbleRenderer;
import nl.topicus.wqplot.data.BubbleSeries;
import nl.topicus.wqplot.options.PlotBubbleRendererOptions;
import nl.topicus.wqplot.options.PlotOptions;
import nl.topicus.wqplot.web.pages.BasePage;

import org.apache.wicket.model.util.ListModel;

public class BubbleChartPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public BubbleChartPage()
	{
		addChart1();
	}

	@SuppressWarnings("unchecked")
	private void addChart1()
	{
		String[] makes =
			{"Acura", "Alfa Romeo", "AM General", "Aston Martin Lagonda Ltd.", "Audi", "BMW",
				"Bugatti", "Buick", "Cadillac", "Chevrolet", "Citroen",
				"DaimlerChrysler Corporation", "Daewoo Motor Co.", "Delorean Motor Company",
				"Dodge", "Ferrari", "Fiat", "Ford Motor Company", "General Motors", "GMC",
				"Holden", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar Cars", "Jeep",
				"Jensen Motors", "Kia", "Laforza", "Lamborghini", "Lancia", "Land Rover",
				"Lincoln", "Lotus Cars", "Lexus", "Maserati", "Mazda", "Mercedes-Benz", "Mercury",
				"MG", "Minelli", "The Mini Cooper", "Mistubishi", "Morgan Motor Co.",
				"Mosler Automotive", "Nissan", "NUMMI ", "Oldsmobile", "Opel", "Packard", "Panoz",
				"Peugeot", "Pontiac", "Porsche", "Proton", "PSA Peugeot Citroen", "Renault",
				"Rolls-Royce", "Rover Cars", "Saab", "Saturn", "Shelby American", "Skoda",
				"Spectre Cars", "Studebaker Motor Company", "Subaru", "Suzuki", "Th!nk", "Toyota",
				"Toyota Motor Manufacturing - Georgetown, KY", "TVR", "Vauxhall", "Volkswagen",
				"Volvo", "Zimmer Motor Cars"};
		BubbleSeries<Long, Long, Long, String> arr = new BubbleSeries<Long, Long, Long, String>();

		for (int i = 0; i < 7; i++)
		{
			arr.addEntry(Math.round(Math.random() * 50), Math.round(Math.random() * 150),
				Math.round(400 + Math.random() * 900), makes[i]);
		}

		JQPlot chart1 =
			new JQPlot("chart1", new ListModel<BubbleSeries<Long, Long, Long, String>>(
				Arrays.asList(arr)));

		PlotOptions chart1O = chart1.getOptions();

		chart1O.setSortData(true);
		chart1O.setTitle("Bubble Test");
		chart1O.getSeriesDefaults().setRenderer(JQPlotBubbleRenderer.get());
		chart1O.getSeriesDefaults().setRendererOptions(
			new PlotBubbleRendererOptions().setAutoscalePointsFactor(-.15d).setBubbleAlpha(0.6d)
				.setHighlightAlpha(0.8d));
		chart1O.getSeriesDefaults().setHighlightMouseDown(true);
		chart1O.getSeriesDefaults().setShadow(true);
		chart1O.getSeriesDefaults().setShadowAlpha(0.05d);

		add(chart1);
	}
}
