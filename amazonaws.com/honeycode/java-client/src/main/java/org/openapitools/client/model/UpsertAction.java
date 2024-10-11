/*
 * Amazon Honeycode
 *  Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals, resources, and even your team. 
 *
 * The version of the OpenAPI document: 2020-03-01
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
 * Gets or Sets UpsertAction
 */
@JsonAdapter(UpsertAction.Adapter.class)
public enum UpsertAction {
  
  UPDATED("UPDATED"),
  
  APPENDED("APPENDED");

  private String value;

  UpsertAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UpsertAction fromValue(String value) {
    for (UpsertAction b : UpsertAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UpsertAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final UpsertAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UpsertAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UpsertAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    UpsertAction.fromValue(value);
  }
}

