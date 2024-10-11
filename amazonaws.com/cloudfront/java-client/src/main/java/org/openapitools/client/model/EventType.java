/*
 * Amazon CloudFront
 * <fullname>Amazon CloudFront</fullname> <p>This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon CloudFront Developer Guide</i>.</p>
 *
 * The version of the OpenAPI document: 2018-11-05
 * Contact: mike.ralphson@gmail.com
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
 * Gets or Sets EventType
 */
@JsonAdapter(EventType.Adapter.class)
public enum EventType {
  
  VIEWER_REQUEST("viewer-request"),
  
  VIEWER_RESPONSE("viewer-response"),
  
  ORIGIN_REQUEST("origin-request"),
  
  ORIGIN_RESPONSE("origin-response");

  private String value;

  EventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventType fromValue(String value) {
    for (EventType b : EventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    EventType.fromValue(value);
  }
}

