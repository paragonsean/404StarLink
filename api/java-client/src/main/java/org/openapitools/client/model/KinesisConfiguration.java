/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
 * The configuration settings of the Amazon Kinesis Data Streams destination for an Amazon QLDB journal stream.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:48.114688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class KinesisConfiguration {
  public static final String SERIALIZED_NAME_STREAM_ARN = "StreamArn";
  @SerializedName(SERIALIZED_NAME_STREAM_ARN)
  private String streamArn;

  public static final String SERIALIZED_NAME_AGGREGATION_ENABLED = "AggregationEnabled";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_ENABLED)
  private Boolean aggregationEnabled;

  public KinesisConfiguration() {
  }

  public KinesisConfiguration streamArn(String streamArn) {
    this.streamArn = streamArn;
    return this;
  }

  /**
   * Get streamArn
   * @return streamArn
   */
  @javax.annotation.Nonnull
  public String getStreamArn() {
    return streamArn;
  }

  public void setStreamArn(String streamArn) {
    this.streamArn = streamArn;
  }


  public KinesisConfiguration aggregationEnabled(Boolean aggregationEnabled) {
    this.aggregationEnabled = aggregationEnabled;
    return this;
  }

  /**
   * Get aggregationEnabled
   * @return aggregationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAggregationEnabled() {
    return aggregationEnabled;
  }

  public void setAggregationEnabled(Boolean aggregationEnabled) {
    this.aggregationEnabled = aggregationEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KinesisConfiguration kinesisConfiguration = (KinesisConfiguration) o;
    return Objects.equals(this.streamArn, kinesisConfiguration.streamArn) &&
        Objects.equals(this.aggregationEnabled, kinesisConfiguration.aggregationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamArn, aggregationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KinesisConfiguration {\n");
    sb.append("    streamArn: ").append(toIndentedString(streamArn)).append("\n");
    sb.append("    aggregationEnabled: ").append(toIndentedString(aggregationEnabled)).append("\n");
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
    openapiFields.add("StreamArn");
    openapiFields.add("AggregationEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("StreamArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KinesisConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KinesisConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KinesisConfiguration is not found in the empty JSON string", KinesisConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KinesisConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KinesisConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KinesisConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `StreamArn`
      String.validateJsonElement(jsonObj.get("StreamArn"));
      // validate the optional field `AggregationEnabled`
      if (jsonObj.get("AggregationEnabled") != null && !jsonObj.get("AggregationEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AggregationEnabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KinesisConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KinesisConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KinesisConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KinesisConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<KinesisConfiguration>() {
           @Override
           public void write(JsonWriter out, KinesisConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KinesisConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KinesisConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KinesisConfiguration
   * @throws IOException if the JSON string is invalid with respect to KinesisConfiguration
   */
  public static KinesisConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KinesisConfiguration.class);
  }

  /**
   * Convert an instance of KinesisConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

