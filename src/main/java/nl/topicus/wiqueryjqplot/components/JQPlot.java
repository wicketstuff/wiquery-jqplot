package nl.topicus.wiqueryjqplot.components;

import java.io.IOException;

import nl.topicus.wiqueryjqplot.options.PlotOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class JQPlot extends WebMarkupContainer implements IWiQueryPlugin {
	private static final long serialVersionUID = 1L;

	private PlotOptions options = new PlotOptions();

	public JQPlot(String id) {
		super(id);
		setOutputMarkupId(true);
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager) {
		wiQueryResourceManager
				.addJavaScriptResource(JQPlotJavaScriptResourceReference.get());
		wiQueryResourceManager
				.addCssResource(JQPlot.class, "jquery.jqplot.css");
	}

	@Override
	public JsStatement statement() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializationConfig().setSerializationInclusion(
				Inclusion.NON_NULL);
		String optionsStr = "{}";
		try {
			optionsStr = mapper.writeValueAsString(options);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new JsStatement().append("$.jqplot('" + getMarkupId()
				+ "', [[34,-21,13,-8,5,-3,2,-1,1,0,1,1,2,3,5,8,13,21,34]], "
				+ optionsStr + ")");
	}
}
