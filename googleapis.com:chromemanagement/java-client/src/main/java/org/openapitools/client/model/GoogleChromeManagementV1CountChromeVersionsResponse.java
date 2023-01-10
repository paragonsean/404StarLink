/*
 * Chrome Management API
 * The Chrome Management API is a suite of services that allows Chrome administrators to view, manage and gain insights on their Chrome OS and Chrome Browser devices.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GoogleChromeManagementV1BrowserVersion;

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
 * Response containing requested browser versions details and counts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1CountChromeVersionsResponse {
  public static final String SERIALIZED_NAME_BROWSER_VERSIONS = "browserVersions";
  @SerializedName(SERIALIZED_NAME_BROWSER_VERSIONS)
  private List<GoogleChromeManagementV1BrowserVersion> browserVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public GoogleChromeManagementV1CountChromeVersionsResponse() {
  }

  public GoogleChromeManagementV1CountChromeVersionsResponse browserVersions(List<GoogleChromeManagementV1BrowserVersion> browserVersions) {
    this.browserVersions = browserVersions;
    return this;
  }

  public GoogleChromeManagementV1CountChromeVersionsResponse addBrowserVersionsItem(GoogleChromeManagementV1BrowserVersion browserVersionsItem) {
    if (this.browserVersions == null) {
      this.browserVersions = new ArrayList<>();
    }
    this.browserVersions.add(browserVersionsItem);
    return this;
  }

  /**
   * List of all browser versions and their install counts.
   * @return browserVersions
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1BrowserVersion> getBrowserVersions() {
    return browserVersions;
  }

  public void setBrowserVersions(List<GoogleChromeManagementV1BrowserVersion> browserVersions) {
    this.browserVersions = browserVersions;
  }


  public GoogleChromeManagementV1CountChromeVersionsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token to specify the next page of the request.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GoogleChromeManagementV1CountChromeVersionsResponse totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Total number browser versions matching request.
   * @return totalSize
   */
  @javax.annotation.Nullable
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1CountChromeVersionsResponse googleChromeManagementV1CountChromeVersionsResponse = (GoogleChromeManagementV1CountChromeVersionsResponse) o;
    return Objects.equals(this.browserVersions, googleChromeManagementV1CountChromeVersionsResponse.browserVersions) &&
        Objects.equals(this.nextPageToken, googleChromeManagementV1CountChromeVersionsResponse.nextPageToken) &&
        Objects.equals(this.totalSize, googleChromeManagementV1CountChromeVersionsResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserVersions, nextPageToken, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1CountChromeVersionsResponse {\n");
    sb.append("    browserVersions: ").append(toIndentedString(browserVersions)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("browserVersions");
    openapiFields.add("nextPageToken");
    openapiFields.add("totalSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1CountChromeVersionsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1CountChromeVersionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1CountChromeVersionsResponse is not found in the empty JSON string", GoogleChromeManagementV1CountChromeVersionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1CountChromeVersionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1CountChromeVersionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("browserVersions") != null && !jsonObj.get("browserVersions").isJsonNull()) {
        JsonArray jsonArraybrowserVersions = jsonObj.getAsJsonArray("browserVersions");
        if (jsonArraybrowserVersions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("browserVersions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `browserVersions` to be an array in the JSON string but got `%s`", jsonObj.get("browserVersions").toString()));
          }

          // validate the optional field `browserVersions` (array)
          for (int i = 0; i < jsonArraybrowserVersions.size(); i++) {
            GoogleChromeManagementV1BrowserVersion.validateJsonElement(jsonArraybrowserVersions.get(i));
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
       if (!GoogleChromeManagementV1CountChromeVersionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1CountChromeVersionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1CountChromeVersionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1CountChromeVersionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1CountChromeVersionsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1CountChromeVersionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1CountChromeVersionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1CountChromeVersionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1CountChromeVersionsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1CountChromeVersionsResponse
   */
  public static GoogleChromeManagementV1CountChromeVersionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1CountChromeVersionsResponse.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1CountChromeVersionsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

