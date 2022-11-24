/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
 * ApiV1AccountsIdFollowPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:48.626423-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1AccountsIdFollowPostRequest {
  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private Boolean notify = false;

  public static final String SERIALIZED_NAME_REBLOGS = "reblogs";
  @SerializedName(SERIALIZED_NAME_REBLOGS)
  private Boolean reblogs = true;

  public ApiV1AccountsIdFollowPostRequest() {
  }

  public ApiV1AccountsIdFollowPostRequest notify(Boolean notify) {
    this.notify = notify;
    return this;
  }

  /**
   * Receive notifications when this account posts a status? Defaults to false.
   * @return notify
   */
  @javax.annotation.Nullable
  public Boolean getNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }


  public ApiV1AccountsIdFollowPostRequest reblogs(Boolean reblogs) {
    this.reblogs = reblogs;
    return this;
  }

  /**
   * Receive this account&#39;s reblogs in home timeline? Defaults to true.
   * @return reblogs
   */
  @javax.annotation.Nullable
  public Boolean getReblogs() {
    return reblogs;
  }

  public void setReblogs(Boolean reblogs) {
    this.reblogs = reblogs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsIdFollowPostRequest apiV1AccountsIdFollowPostRequest = (ApiV1AccountsIdFollowPostRequest) o;
    return Objects.equals(this.notify, apiV1AccountsIdFollowPostRequest.notify) &&
        Objects.equals(this.reblogs, apiV1AccountsIdFollowPostRequest.reblogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notify, reblogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsIdFollowPostRequest {\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    reblogs: ").append(toIndentedString(reblogs)).append("\n");
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
    openapiFields.add("notify");
    openapiFields.add("reblogs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1AccountsIdFollowPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1AccountsIdFollowPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1AccountsIdFollowPostRequest is not found in the empty JSON string", ApiV1AccountsIdFollowPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1AccountsIdFollowPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1AccountsIdFollowPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1AccountsIdFollowPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1AccountsIdFollowPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1AccountsIdFollowPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1AccountsIdFollowPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1AccountsIdFollowPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1AccountsIdFollowPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1AccountsIdFollowPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1AccountsIdFollowPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1AccountsIdFollowPostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1AccountsIdFollowPostRequest
   */
  public static ApiV1AccountsIdFollowPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1AccountsIdFollowPostRequest.class);
  }

  /**
   * Convert an instance of ApiV1AccountsIdFollowPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

