package org.superlamer.windowsupdate.model;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using=UpdateStatusEnumSerializer.Serializer.class)
@JsonDeserialize(using=UpdateStatusEnumSerializer.Deserializer.class)
public enum UpdateStatusEnum {
	IN_PROGRESS ("IN_PROGRESS"),
	COMPLTED ("COMPLETED");
	
	private final String status;
	
	private UpdateStatusEnum(String status) {
		this.status = status;
	}
	
	public String toString() {
		return this.name();
	}
	
	private static Map<String, UpdateStatusEnum> VALUES_BY_NAME = 
			Arrays.stream(values())
					.collect(Collectors.toMap(UpdateStatusEnum::getStatus, Function.identity()));
	
	public String getStatus() {
		return status;
	}
	
	public static UpdateStatusEnum fromString(String status) {
		return VALUES_BY_NAME.getOrDefault(status, IN_PROGRESS);
	}
}

class UpdateStatusEnumSerializer {
	public static class Serializer extends JsonSerializer<UpdateStatusEnum> {

		@Override
		public void serialize(UpdateStatusEnum value, JsonGenerator gen, SerializerProvider serializers)
				throws IOException, JsonProcessingException {
			gen.writeString(value.getStatus());
		}
	}
	
	public static class Deserializer extends JsonDeserializer<UpdateStatusEnum> {

		@Override
		public UpdateStatusEnum deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {
			return UpdateStatusEnum.fromString(p.getValueAsString());
		}
		
	}
	
}
