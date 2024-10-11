/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
import org.openapitools.client.model.ImpressionMetricsRow;

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
 * Response message for listing the metrics that are measured in number of impressions.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListImpressionMetricsResponse {
  public static final String SERIALIZED_NAME_IMPRESSION_METRICS_ROWS = "impressionMetricsRows";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_METRICS_ROWS)
  private List<ImpressionMetricsRow> impressionMetricsRows = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public ListImpressionMetricsResponse() {
  }

  public ListImpressionMetricsResponse impressionMetricsRows(List<ImpressionMetricsRow> impressionMetricsRows) {
    this.impressionMetricsRows = impressionMetricsRows;
    return this;
  }

  public ListImpressionMetricsResponse addImpressionMetricsRowsItem(ImpressionMetricsRow impressionMetricsRowsItem) {
    if (this.impressionMetricsRows == null) {
      this.impressionMetricsRows = new ArrayList<>();
    }
    this.impressionMetricsRows.add(impressionMetricsRowsItem);
    return this;
  }

  /**
   * List of rows, each containing a set of impression metrics.
   * @return impressionMetricsRows
   */
  @javax.annotation.Nullable
  public List<ImpressionMetricsRow> getImpressionMetricsRows() {
    return impressionMetricsRows;
  }

  public void setImpressionMetricsRows(List<ImpressionMetricsRow> impressionMetricsRows) {
    this.impressionMetricsRows = impressionMetricsRows;
  }


  public ListImpressionMetricsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the ListImpressionMetricsRequest.pageToken field in the subsequent call to the impressionMetrics.list method to retrieve the next page of results.
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
    ListImpressionMetricsResponse listImpressionMetricsResponse = (ListImpressionMetricsResponse) o;
    return Objects.equals(this.impressionMetricsRows, listImpressionMetricsResponse.impressionMetricsRows) &&
        Objects.equals(this.nextPageToken, listImpressionMetricsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressionMetricsRows, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListImpressionMetricsResponse {\n");
    sb.append("    impressionMetricsRows: ").append(toIndentedString(impressionMetricsRows)).append("\n");
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
    openapiFields.add("impressionMetricsRows");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListImpressionMetricsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListImpressionMetricsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListImpressionMetricsResponse is not found in the empty JSON string", ListImpressionMetricsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListImpressionMetricsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListImpressionMetricsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("impressionMetricsRows") != null && !jsonObj.get("impressionMetricsRows").isJsonNull()) {
        JsonArray jsonArrayimpressionMetricsRows = jsonObj.getAsJsonArray("impressionMetricsRows");
        if (jsonArrayimpressionMetricsRows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("impressionMetricsRows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `impressionMetricsRows` to be an array in the JSON string but got `%s`", jsonObj.get("impressionMetricsRows").toString()));
          }

          // validate the optional field `impressionMetricsRows` (array)
          for (int i = 0; i < jsonArrayimpressionMetricsRows.size(); i++) {
            ImpressionMetricsRow.validateJsonElement(jsonArrayimpressionMetricsRows.get(i));
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
       if (!ListImpressionMetricsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListImpressionMetricsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListImpressionMetricsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListImpressionMetricsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListImpressionMetricsResponse>() {
           @Override
           public void write(JsonWriter out, ListImpressionMetricsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListImpressionMetricsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListImpressionMetricsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListImpressionMetricsResponse
   * @throws IOException if the JSON string is invalid with respect to ListImpressionMetricsResponse
   */
  public static ListImpressionMetricsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListImpressionMetricsResponse.class);
  }

  /**
   * Convert an instance of ListImpressionMetricsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

