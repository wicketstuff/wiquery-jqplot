package nl.topicus.wiqueryjqplot.options;

import java.io.IOException;
import java.lang.reflect.Type;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.SerializerBase;

public class RawSerializer extends SerializerBase<Object>
{
	/**
	 * Singleton instance to use.
	 */
	public final static RawSerializer instance = new RawSerializer();

	public RawSerializer()
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
