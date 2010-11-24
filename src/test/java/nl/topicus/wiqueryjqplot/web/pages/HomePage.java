package nl.topicus.wiqueryjqplot.web.pages;

import nl.topicus.wiqueryjqplot.components.JQPlot;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		add(new JQPlot("graph"));
	}
}
