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
import org.openapitools.client.model.NotificationChannel;

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
 * The ListNotificationChannels response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListNotificationChannelsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_NOTIFICATION_CHANNELS = "notificationChannels";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_CHANNELS)
  private List<NotificationChannel> notificationChannels = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "totalSize";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  public ListNotificationChannelsResponse() {
  }

  public ListNotificationChannelsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * If not empty, indicates that there may be more results that match the request. Use the value in the page_token field in a subsequent request to fetch the next set of results. If empty, all results have been returned.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListNotificationChannelsResponse notificationChannels(List<NotificationChannel> notificationChannels) {
    this.notificationChannels = notificationChannels;
    return this;
  }

  public ListNotificationChannelsResponse addNotificationChannelsItem(NotificationChannel notificationChannelsItem) {
    if (this.notificationChannels == null) {
      this.notificationChannels = new ArrayList<>();
    }
    this.notificationChannels.add(notificationChannelsItem);
    return this;
  }

  /**
   * The notification channels defined for the specified project.
   * @return notificationChannels
   */
  @javax.annotation.Nullable
  public List<NotificationChannel> getNotificationChannels() {
    return notificationChannels;
  }

  public void setNotificationChannels(List<NotificationChannel> notificationChannels) {
    this.notificationChannels = notificationChannels;
  }


  public ListNotificationChannelsResponse totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * The total number of notification channels in all pages. This number is only an estimate, and may change in subsequent pages. https://aip.dev/158
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
    ListNotificationChannelsResponse listNotificationChannelsResponse = (ListNotificationChannelsResponse) o;
    return Objects.equals(this.nextPageToken, listNotificationChannelsResponse.nextPageToken) &&
        Objects.equals(this.notificationChannels, listNotificationChannelsResponse.notificationChannels) &&
        Objects.equals(this.totalSize, listNotificationChannelsResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, notificationChannels, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNotificationChannelsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    notificationChannels: ").append(toIndentedString(notificationChannels)).append("\n");
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
    openapiFields.add("nextPageToken");
    openapiFields.add("notificationChannels");
    openapiFields.add("totalSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListNotificationChannelsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListNotificationChannelsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListNotificationChannelsResponse is not found in the empty JSON string", ListNotificationChannelsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListNotificationChannelsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListNotificationChannelsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("notificationChannels") != null && !jsonObj.get("notificationChannels").isJsonNull()) {
        JsonArray jsonArraynotificationChannels = jsonObj.getAsJsonArray("notificationChannels");
        if (jsonArraynotificationChannels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notificationChannels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notificationChannels` to be an array in the JSON string but got `%s`", jsonObj.get("notificationChannels").toString()));
          }

          // validate the optional field `notificationChannels` (array)
          for (int i = 0; i < jsonArraynotificationChannels.size(); i++) {
            NotificationChannel.validateJsonElement(jsonArraynotificationChannels.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListNotificationChannelsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListNotificationChannelsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListNotificationChannelsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListNotificationChannelsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListNotificationChannelsResponse>() {
           @Override
           public void write(JsonWriter out, ListNotificationChannelsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListNotificationChannelsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListNotificationChannelsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListNotificationChannelsResponse
   * @throws IOException if the JSON string is invalid with respect to ListNotificationChannelsResponse
   */
  public static ListNotificationChannelsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListNotificationChannelsResponse.class);
  }

  /**
   * Convert an instance of ListNotificationChannelsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

