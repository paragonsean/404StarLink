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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ShardSequenceNumberRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:46.795436-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ShardSequenceNumberRange {
  public static final String SERIALIZED_NAME_STARTING_SEQUENCE_NUMBER = "StartingSequenceNumber";
  @SerializedName(SERIALIZED_NAME_STARTING_SEQUENCE_NUMBER)
  private String startingSequenceNumber;

  public static final String SERIALIZED_NAME_ENDING_SEQUENCE_NUMBER = "EndingSequenceNumber";
  @SerializedName(SERIALIZED_NAME_ENDING_SEQUENCE_NUMBER)
  private String endingSequenceNumber;

  public ShardSequenceNumberRange() {
  }

  public ShardSequenceNumberRange startingSequenceNumber(String startingSequenceNumber) {
    this.startingSequenceNumber = startingSequenceNumber;
    return this;
  }

  /**
   * Get startingSequenceNumber
   * @return startingSequenceNumber
   */
  @javax.annotation.Nullable
  public String getStartingSequenceNumber() {
    return startingSequenceNumber;
  }

  public void setStartingSequenceNumber(String startingSequenceNumber) {
    this.startingSequenceNumber = startingSequenceNumber;
  }


  public ShardSequenceNumberRange endingSequenceNumber(String endingSequenceNumber) {
    this.endingSequenceNumber = endingSequenceNumber;
    return this;
  }

  /**
   * Get endingSequenceNumber
   * @return endingSequenceNumber
   */
  @javax.annotation.Nullable
  public String getEndingSequenceNumber() {
    return endingSequenceNumber;
  }

  public void setEndingSequenceNumber(String endingSequenceNumber) {
    this.endingSequenceNumber = endingSequenceNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardSequenceNumberRange shardSequenceNumberRange = (ShardSequenceNumberRange) o;
    return Objects.equals(this.startingSequenceNumber, shardSequenceNumberRange.startingSequenceNumber) &&
        Objects.equals(this.endingSequenceNumber, shardSequenceNumberRange.endingSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startingSequenceNumber, endingSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardSequenceNumberRange {\n");
    sb.append("    startingSequenceNumber: ").append(toIndentedString(startingSequenceNumber)).append("\n");
    sb.append("    endingSequenceNumber: ").append(toIndentedString(endingSequenceNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("StartingSequenceNumber");
    openapiFields.add("EndingSequenceNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ShardSequenceNumberRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ShardSequenceNumberRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShardSequenceNumberRange is not found in the empty JSON string", ShardSequenceNumberRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ShardSequenceNumberRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShardSequenceNumberRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `StartingSequenceNumber`
      if (jsonObj.get("StartingSequenceNumber") != null && !jsonObj.get("StartingSequenceNumber").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StartingSequenceNumber"));
      }
      // validate the optional field `EndingSequenceNumber`
      if (jsonObj.get("EndingSequenceNumber") != null && !jsonObj.get("EndingSequenceNumber").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EndingSequenceNumber"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShardSequenceNumberRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShardSequenceNumberRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShardSequenceNumberRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShardSequenceNumberRange.class));

       return (TypeAdapter<T>) new TypeAdapter<ShardSequenceNumberRange>() {
           @Override
           public void write(JsonWriter out, ShardSequenceNumberRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShardSequenceNumberRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ShardSequenceNumberRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ShardSequenceNumberRange
   * @throws IOException if the JSON string is invalid with respect to ShardSequenceNumberRange
   */
  public static ShardSequenceNumberRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShardSequenceNumberRange.class);
  }

  /**
   * Convert an instance of ShardSequenceNumberRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

