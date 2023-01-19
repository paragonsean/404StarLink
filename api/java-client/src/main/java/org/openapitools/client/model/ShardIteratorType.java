/*
 * Amazon DynamoDB Streams
 * <fullname>Amazon DynamoDB</fullname> <p>Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about application development with Streams, see <a href=\"https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html\">Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.</p>
 *
 * The version of the OpenAPI document: 2012-08-10
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
 * Gets or Sets ShardIteratorType
 */
@JsonAdapter(ShardIteratorType.Adapter.class)
public enum ShardIteratorType {
  
  TRIM_HORIZON("TRIM_HORIZON"),
  
  LATEST("LATEST"),
  
  AT_SEQUENCE_NUMBER("AT_SEQUENCE_NUMBER"),
  
  AFTER_SEQUENCE_NUMBER("AFTER_SEQUENCE_NUMBER");

  private String value;

  ShardIteratorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShardIteratorType fromValue(String value) {
    for (ShardIteratorType b : ShardIteratorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShardIteratorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShardIteratorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShardIteratorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShardIteratorType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ShardIteratorType.fromValue(value);
  }
}

