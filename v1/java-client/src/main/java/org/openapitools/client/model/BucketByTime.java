/*
 * Fitness API
 * The Fitness API for managing users' fitness tracking data.
 *
 * The version of the OpenAPI document: v1
 * 
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
import org.openapitools.client.model.BucketByTimePeriod;

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
 * BucketByTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:57.575543-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BucketByTime {
  public static final String SERIALIZED_NAME_DURATION_MILLIS = "durationMillis";
  @SerializedName(SERIALIZED_NAME_DURATION_MILLIS)
  private String durationMillis;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private BucketByTimePeriod period;

  public BucketByTime() {
  }

  public BucketByTime durationMillis(String durationMillis) {
    this.durationMillis = durationMillis;
    return this;
  }

  /**
   * Specifies that result buckets aggregate data by exactly durationMillis time frames. Time frames that contain no data will be included in the response with an empty dataset.
   * @return durationMillis
   */
  @javax.annotation.Nullable
  public String getDurationMillis() {
    return durationMillis;
  }

  public void setDurationMillis(String durationMillis) {
    this.durationMillis = durationMillis;
  }


  public BucketByTime period(BucketByTimePeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @javax.annotation.Nullable
  public BucketByTimePeriod getPeriod() {
    return period;
  }

  public void setPeriod(BucketByTimePeriod period) {
    this.period = period;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketByTime bucketByTime = (BucketByTime) o;
    return Objects.equals(this.durationMillis, bucketByTime.durationMillis) &&
        Objects.equals(this.period, bucketByTime.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMillis, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketByTime {\n");
    sb.append("    durationMillis: ").append(toIndentedString(durationMillis)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
    openapiFields.add("durationMillis");
    openapiFields.add("period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BucketByTime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BucketByTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BucketByTime is not found in the empty JSON string", BucketByTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BucketByTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BucketByTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("durationMillis") != null && !jsonObj.get("durationMillis").isJsonNull()) && !jsonObj.get("durationMillis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `durationMillis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("durationMillis").toString()));
      }
      // validate the optional field `period`
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) {
        BucketByTimePeriod.validateJsonElement(jsonObj.get("period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BucketByTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BucketByTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BucketByTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BucketByTime.class));

       return (TypeAdapter<T>) new TypeAdapter<BucketByTime>() {
           @Override
           public void write(JsonWriter out, BucketByTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BucketByTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BucketByTime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BucketByTime
   * @throws IOException if the JSON string is invalid with respect to BucketByTime
   */
  public static BucketByTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BucketByTime.class);
  }

  /**
   * Convert an instance of BucketByTime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

