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
import org.openapitools.client.model.DescribeMetricAttributionResponseMetricAttribution;

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
 * DescribeMetricAttributionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeMetricAttributionResponse {
  public static final String SERIALIZED_NAME_METRIC_ATTRIBUTION = "metricAttribution";
  @SerializedName(SERIALIZED_NAME_METRIC_ATTRIBUTION)
  private DescribeMetricAttributionResponseMetricAttribution metricAttribution;

  public DescribeMetricAttributionResponse() {
  }

  public DescribeMetricAttributionResponse metricAttribution(DescribeMetricAttributionResponseMetricAttribution metricAttribution) {
    this.metricAttribution = metricAttribution;
    return this;
  }

  /**
   * Get metricAttribution
   * @return metricAttribution
   */
  @javax.annotation.Nullable
  public DescribeMetricAttributionResponseMetricAttribution getMetricAttribution() {
    return metricAttribution;
  }

  public void setMetricAttribution(DescribeMetricAttributionResponseMetricAttribution metricAttribution) {
    this.metricAttribution = metricAttribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeMetricAttributionResponse describeMetricAttributionResponse = (DescribeMetricAttributionResponse) o;
    return Objects.equals(this.metricAttribution, describeMetricAttributionResponse.metricAttribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricAttribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeMetricAttributionResponse {\n");
    sb.append("    metricAttribution: ").append(toIndentedString(metricAttribution)).append("\n");
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
    openapiFields.add("metricAttribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeMetricAttributionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeMetricAttributionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeMetricAttributionResponse is not found in the empty JSON string", DescribeMetricAttributionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeMetricAttributionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeMetricAttributionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `metricAttribution`
      if (jsonObj.get("metricAttribution") != null && !jsonObj.get("metricAttribution").isJsonNull()) {
        DescribeMetricAttributionResponseMetricAttribution.validateJsonElement(jsonObj.get("metricAttribution"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeMetricAttributionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeMetricAttributionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeMetricAttributionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeMetricAttributionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeMetricAttributionResponse>() {
           @Override
           public void write(JsonWriter out, DescribeMetricAttributionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeMetricAttributionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeMetricAttributionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeMetricAttributionResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeMetricAttributionResponse
   */
  public static DescribeMetricAttributionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeMetricAttributionResponse.class);
  }

  /**
   * Convert an instance of DescribeMetricAttributionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

