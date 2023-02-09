/*
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets channel_enum_channel_type
 */
@JsonAdapter(ChannelEnumChannelType.Adapter.class)
public enum ChannelEnumChannelType {
  
  PUBLIC("public"),
  
  PRIVATE("private");

  private String value;

  ChannelEnumChannelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChannelEnumChannelType fromValue(String value) {
    for (ChannelEnumChannelType b : ChannelEnumChannelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChannelEnumChannelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChannelEnumChannelType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChannelEnumChannelType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChannelEnumChannelType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ChannelEnumChannelType.fromValue(value);
  }
}

