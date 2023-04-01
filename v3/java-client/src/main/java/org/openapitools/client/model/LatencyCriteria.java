/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
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
 * Parameters for a latency threshold SLI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LatencyCriteria {
  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private String threshold;

  public LatencyCriteria() {
  }

  public LatencyCriteria threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Good service is defined to be the count of requests made to this service that return in no more than threshold.
   * @return threshold
   */
  @javax.annotation.Nullable
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatencyCriteria latencyCriteria = (LatencyCriteria) o;
    return Objects.equals(this.threshold, latencyCriteria.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatencyCriteria {\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
    openapiFields.add("threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LatencyCriteria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LatencyCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LatencyCriteria is not found in the empty JSON string", LatencyCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LatencyCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LatencyCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("threshold") != null && !jsonObj.get("threshold").isJsonNull()) && !jsonObj.get("threshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threshold").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LatencyCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LatencyCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LatencyCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LatencyCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<LatencyCriteria>() {
           @Override
           public void write(JsonWriter out, LatencyCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LatencyCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LatencyCriteria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LatencyCriteria
   * @throws IOException if the JSON string is invalid with respect to LatencyCriteria
   */
  public static LatencyCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LatencyCriteria.class);
  }

  /**
   * Convert an instance of LatencyCriteria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

