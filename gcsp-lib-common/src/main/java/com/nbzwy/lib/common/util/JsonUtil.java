package com.nbzwy.lib.common.util;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class JsonUtil {

    private static Logger logger = Logger.getLogger(JsonUtil.class);

    public static String writeValueAsString(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        // 序列化时将null过滤成""
		mapper.getSerializerProvider().setNullValueSerializer(
			new JsonSerializer<Object>() {
				@Override
				public void serialize(Object value, JsonGenerator gen,
						SerializerProvider serializers) throws IOException,
						JsonProcessingException {
					gen.writeString("");
				}
		});
        try {
            return mapper.writeValueAsString(o);
        } catch (IOException e) {
            logger.error("json序列化错误", e);
        }
        return null;
    }

    public static <T> T readObject(String json, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            logger.error("json反序列化错误", e);
        }
        return null;
    }
}
