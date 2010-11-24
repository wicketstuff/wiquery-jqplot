package nl.topicus.wiqueryjqplot.options;

import java.io.Serializable;

public class PlotTick implements Serializable {
	private static final long serialVersionUID = 1L;
	private String val;
	private String label;

	public PlotTick(String val) {
		this.val = val;
		this.label = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
