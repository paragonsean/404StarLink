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
 * ApiV1AccountsIdMutePostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:27.813212-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1AccountsIdMutePostRequest {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration = 0;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private Boolean notifications = true;

  public ApiV1AccountsIdMutePostRequest() {
  }

  public ApiV1AccountsIdMutePostRequest duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * How long the mute should last, in seconds. Defaults to 0 (indefinite).
   * @return duration
   */
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ApiV1AccountsIdMutePostRequest notifications(Boolean notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Mute notifications in addition to statuses? Defaults to true.
   * @return notifications
   */
  @javax.annotation.Nullable
  public Boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(Boolean notifications) {
    this.notifications = notifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsIdMutePostRequest apiV1AccountsIdMutePostRequest = (ApiV1AccountsIdMutePostRequest) o;
    return Objects.equals(this.duration, apiV1AccountsIdMutePostRequest.duration) &&
        Objects.equals(this.notifications, apiV1AccountsIdMutePostRequest.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsIdMutePostRequest {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("notifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1AccountsIdMutePostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1AccountsIdMutePostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1AccountsIdMutePostRequest is not found in the empty JSON string", ApiV1AccountsIdMutePostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1AccountsIdMutePostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1AccountsIdMutePostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1AccountsIdMutePostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1AccountsIdMutePostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1AccountsIdMutePostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1AccountsIdMutePostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1AccountsIdMutePostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1AccountsIdMutePostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1AccountsIdMutePostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1AccountsIdMutePostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1AccountsIdMutePostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1AccountsIdMutePostRequest
   */
  public static ApiV1AccountsIdMutePostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1AccountsIdMutePostRequest.class);
  }

  /**
   * Convert an instance of ApiV1AccountsIdMutePostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

