package nl.topicus.wqplot.web.pages;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.wqplot.web.pages.examples.AutoScalingPage;
import nl.topicus.wqplot.web.pages.examples.AxisLabelPage;
import nl.topicus.wqplot.web.pages.examples.CorePage;
import nl.topicus.wqplot.web.pages.examples.ZoomTestPage;
import nl.topicus.wqplot.web.pages.examples.dist.AreaPage;
import nl.topicus.wqplot.web.pages.examples.dist.AxisLabelsRotatedText2Page;
import nl.topicus.wqplot.web.pages.examples.dist.BarLinePieStackPage;
import nl.topicus.wqplot.web.pages.examples.dist.BubbleChart2Page;
import nl.topicus.wqplot.web.pages.examples.dist.MissingValuesPage;

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

		/*
		 * Web examples
		 */
		pages.add(CorePage.class);
		pages.add(AutoScalingPage.class);
		pages.add(AxisLabelPage.class);
		pages.add(ZoomTestPage.class);

		/*
		 * Dist examples
		 */
		pages.add(AreaPage.class);
		pages.add(AxisLabelsRotatedText2Page.class);
		pages.add(BarLinePieStackPage.class);
		pages.add(BubbleChart2Page.class);
		pages.add(MissingValuesPage.class);

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
