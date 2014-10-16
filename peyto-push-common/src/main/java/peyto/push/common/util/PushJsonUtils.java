package peyto.push.common.util;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.JsonNodeFactory;

public class PushJsonUtils {

	public static final JsonNode		NULL_IMMUTABLE_JSON	= JsonNodeFactory.instance.nullNode();
	public static final ObjectMapper	MAPPER				=  new ObjectMapper();
	
}
