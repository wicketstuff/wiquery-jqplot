package nl.topicus.wqplot.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PlotLabelOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean show;

	public PlotLabelOptions()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotLabelOptions setShow(Boolean show)
	{
		this.show = show;
		return this;
	}
}
