/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
 * Gets or Sets StackSetOperationType
 */
@JsonAdapter(StackSetOperationType.Adapter.class)
public enum StackSetOperationType {
  
  CREATE("CREATE"),
  
  UPDATE("UPDATE"),
  
  DELETE("DELETE");

  private String value;

  StackSetOperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StackSetOperationType fromValue(String value) {
    for (StackSetOperationType b : StackSetOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StackSetOperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StackSetOperationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StackSetOperationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StackSetOperationType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    StackSetOperationType.fromValue(value);
  }
}

