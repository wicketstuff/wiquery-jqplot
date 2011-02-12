package nl.topicus.wqplot.components;

import org.odlabs.wiquery.core.events.EventLabel;

public enum JQPlotEvent implements EventLabel
{
	DATA_HIGHLIGHT("jqplotDataHighlight"),
	DATA_UNHIGHLIGHT("jqplotDataUnhighlight"),
	DATA_CLICK("jqplotDataClick"),
	DATA_RIGHTCLICK("jqplotDataRightClick");

	private String label;

	private JQPlotEvent(String label)
	{
		this.label = label;
	}

	@Override
	public String getEventLabel()
	{
		return label;
	}
}
