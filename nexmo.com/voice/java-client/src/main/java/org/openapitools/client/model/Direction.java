/*
 * Voice API
 * The Voice API lets you create outbound calls, control in-progress calls and get information about historical calls. More information about the Voice API can be found at <https://developer.nexmo.com/voice/voice-api/overview>.
 *
 * The version of the OpenAPI document: 1.3.10
 * Contact: devrel@vonage.com
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
 * Possible values are &#x60;outbound&#x60; or &#x60;inbound&#x60;
 */
@JsonAdapter(Direction.Adapter.class)
public enum Direction {
  
  OUTBOUND("outbound"),
  
  INBOUND("inbound");

  private String value;

  Direction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Direction fromValue(String value) {
    for (Direction b : Direction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Direction> {
    @Override
    public void write(final JsonWriter jsonWriter, final Direction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Direction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Direction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Direction.fromValue(value);
  }
}

