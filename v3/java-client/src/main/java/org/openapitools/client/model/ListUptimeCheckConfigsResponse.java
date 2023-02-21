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
import org.openapitools.client.model.UptimeCheckConfig;

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
 * The protocol for the ListUptimeCheckConfigs response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:22.830819-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListUptimeCheckConfigsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public static final String SERIALIZED_NAME_UPTIME_CHECK_CONFIGS = "uptimeCheckConfigs";
  @SerializedName(SERIALIZED_NAME_UPTIME_CHECK_CONFIGS)
  private List<UptimeCheckConfig> uptimeCheckConfigs = new ArrayList<>();

  public ListUptimeCheckConfigsResponse() {
  }

  public ListUptimeCheckConfigsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * This field represents the pagination token to retrieve the next page of results. If the value is empty, it means no further results for the request. To retrieve the next page of results, the value of the next_page_token is passed to the subsequent List method call (in the request message&#39;s page_token field).
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListUptimeCheckConfigsResponse totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * The total number of Uptime check configurations for the project, irrespective of any pagination.
   * @return totalSize
   */
  @javax.annotation.Nullable
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }


  public ListUptimeCheckConfigsResponse uptimeCheckConfigs(List<UptimeCheckConfig> uptimeCheckConfigs) {
    this.uptimeCheckConfigs = uptimeCheckConfigs;
    return this;
  }

  public ListUptimeCheckConfigsResponse addUptimeCheckConfigsItem(UptimeCheckConfig uptimeCheckConfigsItem) {
    if (this.uptimeCheckConfigs == null) {
      this.uptimeCheckConfigs = new ArrayList<>();
    }
    this.uptimeCheckConfigs.add(uptimeCheckConfigsItem);
    return this;
  }

  /**
   * The returned Uptime check configurations.
   * @return uptimeCheckConfigs
   */
  @javax.annotation.Nullable
  public List<UptimeCheckConfig> getUptimeCheckConfigs() {
    return uptimeCheckConfigs;
  }

  public void setUptimeCheckConfigs(List<UptimeCheckConfig> uptimeCheckConfigs) {
    this.uptimeCheckConfigs = uptimeCheckConfigs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUptimeCheckConfigsResponse listUptimeCheckConfigsResponse = (ListUptimeCheckConfigsResponse) o;
    return Objects.equals(this.nextPageToken, listUptimeCheckConfigsResponse.nextPageToken) &&
        Objects.equals(this.totalSize, listUptimeCheckConfigsResponse.totalSize) &&
        Objects.equals(this.uptimeCheckConfigs, listUptimeCheckConfigsResponse.uptimeCheckConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, totalSize, uptimeCheckConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUptimeCheckConfigsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    uptimeCheckConfigs: ").append(toIndentedString(uptimeCheckConfigs)).append("\n");
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
    openapiFields.add("nextPageToken");
    openapiFields.add("totalSize");
    openapiFields.add("uptimeCheckConfigs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListUptimeCheckConfigsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListUptimeCheckConfigsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListUptimeCheckConfigsResponse is not found in the empty JSON string", ListUptimeCheckConfigsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListUptimeCheckConfigsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListUptimeCheckConfigsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("uptimeCheckConfigs") != null && !jsonObj.get("uptimeCheckConfigs").isJsonNull()) {
        JsonArray jsonArrayuptimeCheckConfigs = jsonObj.getAsJsonArray("uptimeCheckConfigs");
        if (jsonArrayuptimeCheckConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("uptimeCheckConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `uptimeCheckConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("uptimeCheckConfigs").toString()));
          }

          // validate the optional field `uptimeCheckConfigs` (array)
          for (int i = 0; i < jsonArrayuptimeCheckConfigs.size(); i++) {
            UptimeCheckConfig.validateJsonElement(jsonArrayuptimeCheckConfigs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListUptimeCheckConfigsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListUptimeCheckConfigsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListUptimeCheckConfigsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListUptimeCheckConfigsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListUptimeCheckConfigsResponse>() {
           @Override
           public void write(JsonWriter out, ListUptimeCheckConfigsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListUptimeCheckConfigsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListUptimeCheckConfigsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListUptimeCheckConfigsResponse
   * @throws IOException if the JSON string is invalid with respect to ListUptimeCheckConfigsResponse
   */
  public static ListUptimeCheckConfigsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListUptimeCheckConfigsResponse.class);
  }

  /**
   * Convert an instance of ListUptimeCheckConfigsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

