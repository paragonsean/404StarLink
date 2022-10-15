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
import java.util.List;

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
 * ListMetricAttributionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListMetricAttributionsResponse {
  public static final String SERIALIZED_NAME_METRIC_ATTRIBUTIONS = "metricAttributions";
  @SerializedName(SERIALIZED_NAME_METRIC_ATTRIBUTIONS)
  private List metricAttributions;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListMetricAttributionsResponse() {
  }

  public ListMetricAttributionsResponse metricAttributions(List metricAttributions) {
    this.metricAttributions = metricAttributions;
    return this;
  }

  /**
   * Get metricAttributions
   * @return metricAttributions
   */
  @javax.annotation.Nullable
  public List getMetricAttributions() {
    return metricAttributions;
  }

  public void setMetricAttributions(List metricAttributions) {
    this.metricAttributions = metricAttributions;
  }


  public ListMetricAttributionsResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMetricAttributionsResponse listMetricAttributionsResponse = (ListMetricAttributionsResponse) o;
    return Objects.equals(this.metricAttributions, listMetricAttributionsResponse.metricAttributions) &&
        Objects.equals(this.nextToken, listMetricAttributionsResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricAttributions, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMetricAttributionsResponse {\n");
    sb.append("    metricAttributions: ").append(toIndentedString(metricAttributions)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("metricAttributions");
    openapiFields.add("nextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListMetricAttributionsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListMetricAttributionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMetricAttributionsResponse is not found in the empty JSON string", ListMetricAttributionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListMetricAttributionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListMetricAttributionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `metricAttributions`
      if (jsonObj.get("metricAttributions") != null && !jsonObj.get("metricAttributions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("metricAttributions"));
      }
      // validate the optional field `nextToken`
      if (jsonObj.get("nextToken") != null && !jsonObj.get("nextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("nextToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMetricAttributionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMetricAttributionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMetricAttributionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMetricAttributionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMetricAttributionsResponse>() {
           @Override
           public void write(JsonWriter out, ListMetricAttributionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMetricAttributionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListMetricAttributionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListMetricAttributionsResponse
   * @throws IOException if the JSON string is invalid with respect to ListMetricAttributionsResponse
   */
  public static ListMetricAttributionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMetricAttributionsResponse.class);
  }

  /**
   * Convert an instance of ListMetricAttributionsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

