package nl.topicus.wiqueryjqplot.web.pages;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wiqueryjqplot.web.pages.examples.CorePage;
import nl.topicus.wiqueryjqplot.web.pages.examples.dist.AreaPage;
import nl.topicus.wiqueryjqplot.web.pages.examples.dist.AxisLabelsRotatedText2Page;
import nl.topicus.wiqueryjqplot.web.pages.examples.dist.BarLinePieStackPage;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.util.ListModel;

public class HomePage extends WebPage
{
	private static final long serialVersionUID = 1L;

	public HomePage()
	{
		List<Class< ? extends Page>> pages = new ArrayList<Class< ? extends Page>>();
		pages.add(CorePage.class);
		pages.add(AreaPage.class);
		pages.add(AxisLabelsRotatedText2Page.class);
		pages.add(BarLinePieStackPage.class);

		ListView<Class< ? extends Page>> links =
			new ListView<Class< ? extends Page>>("links", new ListModel<Class< ? extends Page>>(
				pages))
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(ListItem<Class< ? extends Page>> item)
				{
					BookmarkablePageLink<Void> link =
						new BookmarkablePageLink<Void>("link", item.getModelObject());
					item.add(link);
					link.add(new Label("label", item.getModelObject().getName()));
				}
			};
		add(links);
	}
}
