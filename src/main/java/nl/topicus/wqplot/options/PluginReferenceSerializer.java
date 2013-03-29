package nl.topicus.wqplot.options;

import java.io.IOException;
import java.lang.reflect.Type;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.SerializerBase;

public class PluginReferenceSerializer extends SerializerBase<Object>
{
	/**
	 * Singleton instance to use.
	 */
	public final static PluginReferenceSerializer instance = new PluginReferenceSerializer();

	public PluginReferenceSerializer()
	{
		super(Object.class);
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("any", true);
	}

	@Override
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeRawValue(value.toString());
	}
}
