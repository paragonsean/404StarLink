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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MetricDescriptor;

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
 * The ListMetricDescriptors response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListMetricDescriptorsResponse {
  public static final String SERIALIZED_NAME_METRIC_DESCRIPTORS = "metricDescriptors";
  @SerializedName(SERIALIZED_NAME_METRIC_DESCRIPTORS)
  private List<MetricDescriptor> metricDescriptors = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public ListMetricDescriptorsResponse() {
  }

  public ListMetricDescriptorsResponse metricDescriptors(List<MetricDescriptor> metricDescriptors) {
    this.metricDescriptors = metricDescriptors;
    return this;
  }

  public ListMetricDescriptorsResponse addMetricDescriptorsItem(MetricDescriptor metricDescriptorsItem) {
    if (this.metricDescriptors == null) {
      this.metricDescriptors = new ArrayList<>();
    }
    this.metricDescriptors.add(metricDescriptorsItem);
    return this;
  }

  /**
   * The metric descriptors that are available to the project and that match the value of filter, if present.
   * @return metricDescriptors
   */
  @javax.annotation.Nullable
  public List<MetricDescriptor> getMetricDescriptors() {
    return metricDescriptors;
  }

  public void setMetricDescriptors(List<MetricDescriptor> metricDescriptors) {
    this.metricDescriptors = metricDescriptors;
  }


  public ListMetricDescriptorsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMetricDescriptorsResponse listMetricDescriptorsResponse = (ListMetricDescriptorsResponse) o;
    return Objects.equals(this.metricDescriptors, listMetricDescriptorsResponse.metricDescriptors) &&
        Objects.equals(this.nextPageToken, listMetricDescriptorsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricDescriptors, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMetricDescriptorsResponse {\n");
    sb.append("    metricDescriptors: ").append(toIndentedString(metricDescriptors)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("metricDescriptors");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListMetricDescriptorsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListMetricDescriptorsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMetricDescriptorsResponse is not found in the empty JSON string", ListMetricDescriptorsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListMetricDescriptorsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListMetricDescriptorsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("metricDescriptors") != null && !jsonObj.get("metricDescriptors").isJsonNull()) {
        JsonArray jsonArraymetricDescriptors = jsonObj.getAsJsonArray("metricDescriptors");
        if (jsonArraymetricDescriptors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metricDescriptors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metricDescriptors` to be an array in the JSON string but got `%s`", jsonObj.get("metricDescriptors").toString()));
          }

          // validate the optional field `metricDescriptors` (array)
          for (int i = 0; i < jsonArraymetricDescriptors.size(); i++) {
            MetricDescriptor.validateJsonElement(jsonArraymetricDescriptors.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMetricDescriptorsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMetricDescriptorsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMetricDescriptorsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMetricDescriptorsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMetricDescriptorsResponse>() {
           @Override
           public void write(JsonWriter out, ListMetricDescriptorsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMetricDescriptorsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListMetricDescriptorsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListMetricDescriptorsResponse
   * @throws IOException if the JSON string is invalid with respect to ListMetricDescriptorsResponse
   */
  public static ListMetricDescriptorsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMetricDescriptorsResponse.class);
  }

  /**
   * Convert an instance of ListMetricDescriptorsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

