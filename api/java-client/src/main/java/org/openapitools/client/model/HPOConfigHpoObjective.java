/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
 * HPOConfigHpoObjective
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HPOConfigHpoObjective {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private String metricName;

  public static final String SERIALIZED_NAME_METRIC_REGEX = "metricRegex";
  @SerializedName(SERIALIZED_NAME_METRIC_REGEX)
  private String metricRegex;

  public HPOConfigHpoObjective() {
  }

  public HPOConfigHpoObjective type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public HPOConfigHpoObjective metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Get metricName
   * @return metricName
   */
  @javax.annotation.Nullable
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }


  public HPOConfigHpoObjective metricRegex(String metricRegex) {
    this.metricRegex = metricRegex;
    return this;
  }

  /**
   * Get metricRegex
   * @return metricRegex
   */
  @javax.annotation.Nullable
  public String getMetricRegex() {
    return metricRegex;
  }

  public void setMetricRegex(String metricRegex) {
    this.metricRegex = metricRegex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPOConfigHpoObjective hpOConfigHpoObjective = (HPOConfigHpoObjective) o;
    return Objects.equals(this.type, hpOConfigHpoObjective.type) &&
        Objects.equals(this.metricName, hpOConfigHpoObjective.metricName) &&
        Objects.equals(this.metricRegex, hpOConfigHpoObjective.metricRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metricName, metricRegex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPOConfigHpoObjective {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricRegex: ").append(toIndentedString(metricRegex)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("metricName");
    openapiFields.add("metricRegex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HPOConfigHpoObjective
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HPOConfigHpoObjective.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HPOConfigHpoObjective is not found in the empty JSON string", HPOConfigHpoObjective.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HPOConfigHpoObjective.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HPOConfigHpoObjective` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `metricName`
      if (jsonObj.get("metricName") != null && !jsonObj.get("metricName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("metricName"));
      }
      // validate the optional field `metricRegex`
      if (jsonObj.get("metricRegex") != null && !jsonObj.get("metricRegex").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("metricRegex"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HPOConfigHpoObjective.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HPOConfigHpoObjective' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HPOConfigHpoObjective> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HPOConfigHpoObjective.class));

       return (TypeAdapter<T>) new TypeAdapter<HPOConfigHpoObjective>() {
           @Override
           public void write(JsonWriter out, HPOConfigHpoObjective value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HPOConfigHpoObjective read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HPOConfigHpoObjective given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HPOConfigHpoObjective
   * @throws IOException if the JSON string is invalid with respect to HPOConfigHpoObjective
   */
  public static HPOConfigHpoObjective fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HPOConfigHpoObjective.class);
  }

  /**
   * Convert an instance of HPOConfigHpoObjective to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

