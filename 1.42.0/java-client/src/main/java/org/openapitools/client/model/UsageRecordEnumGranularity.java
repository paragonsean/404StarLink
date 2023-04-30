/*
 * Twilio - Supersim
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
 * Gets or Sets usage_record_enum_granularity
 */
@JsonAdapter(UsageRecordEnumGranularity.Adapter.class)
public enum UsageRecordEnumGranularity {
  
  HOUR("hour"),
  
  DAY("day"),
  
  ALL("all");

  private String value;

  UsageRecordEnumGranularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UsageRecordEnumGranularity fromValue(String value) {
    for (UsageRecordEnumGranularity b : UsageRecordEnumGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UsageRecordEnumGranularity> {
    @Override
    public void write(final JsonWriter jsonWriter, final UsageRecordEnumGranularity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UsageRecordEnumGranularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UsageRecordEnumGranularity.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    UsageRecordEnumGranularity.fromValue(value);
  }
}

