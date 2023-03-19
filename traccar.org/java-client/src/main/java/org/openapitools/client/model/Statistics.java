/*
 * Traccar
 * Open Source GPS Tracking Platform
 *
 * The version of the OpenAPI document: 5.6
 * Contact: support@traccar.org
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
import java.time.OffsetDateTime;
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
 * Statistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:36.387265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Statistics {
  public static final String SERIALIZED_NAME_ACTIVE_DEVICES = "activeDevices";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEVICES)
  private Integer activeDevices;

  public static final String SERIALIZED_NAME_ACTIVE_USERS = "activeUsers";
  @SerializedName(SERIALIZED_NAME_ACTIVE_USERS)
  private Integer activeUsers;

  public static final String SERIALIZED_NAME_CAPTURE_TIME = "captureTime";
  @SerializedName(SERIALIZED_NAME_CAPTURE_TIME)
  private OffsetDateTime captureTime;

  public static final String SERIALIZED_NAME_MESSAGES_RECEIVED = "messagesReceived";
  @SerializedName(SERIALIZED_NAME_MESSAGES_RECEIVED)
  private Integer messagesReceived;

  public static final String SERIALIZED_NAME_MESSAGES_STORED = "messagesStored";
  @SerializedName(SERIALIZED_NAME_MESSAGES_STORED)
  private Integer messagesStored;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Integer requests;

  public Statistics() {
  }

  public Statistics activeDevices(Integer activeDevices) {
    this.activeDevices = activeDevices;
    return this;
  }

  /**
   * Get activeDevices
   * @return activeDevices
   */
  @javax.annotation.Nullable
  public Integer getActiveDevices() {
    return activeDevices;
  }

  public void setActiveDevices(Integer activeDevices) {
    this.activeDevices = activeDevices;
  }


  public Statistics activeUsers(Integer activeUsers) {
    this.activeUsers = activeUsers;
    return this;
  }

  /**
   * Get activeUsers
   * @return activeUsers
   */
  @javax.annotation.Nullable
  public Integer getActiveUsers() {
    return activeUsers;
  }

  public void setActiveUsers(Integer activeUsers) {
    this.activeUsers = activeUsers;
  }


  public Statistics captureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
    return this;
  }

  /**
   * in IS0 8601 format. eg. &#x60;1963-11-22T18:30:00Z&#x60;
   * @return captureTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCaptureTime() {
    return captureTime;
  }

  public void setCaptureTime(OffsetDateTime captureTime) {
    this.captureTime = captureTime;
  }


  public Statistics messagesReceived(Integer messagesReceived) {
    this.messagesReceived = messagesReceived;
    return this;
  }

  /**
   * Get messagesReceived
   * @return messagesReceived
   */
  @javax.annotation.Nullable
  public Integer getMessagesReceived() {
    return messagesReceived;
  }

  public void setMessagesReceived(Integer messagesReceived) {
    this.messagesReceived = messagesReceived;
  }


  public Statistics messagesStored(Integer messagesStored) {
    this.messagesStored = messagesStored;
    return this;
  }

  /**
   * Get messagesStored
   * @return messagesStored
   */
  @javax.annotation.Nullable
  public Integer getMessagesStored() {
    return messagesStored;
  }

  public void setMessagesStored(Integer messagesStored) {
    this.messagesStored = messagesStored;
  }


  public Statistics requests(Integer requests) {
    this.requests = requests;
    return this;
  }

  /**
   * Get requests
   * @return requests
   */
  @javax.annotation.Nullable
  public Integer getRequests() {
    return requests;
  }

  public void setRequests(Integer requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics statistics = (Statistics) o;
    return Objects.equals(this.activeDevices, statistics.activeDevices) &&
        Objects.equals(this.activeUsers, statistics.activeUsers) &&
        Objects.equals(this.captureTime, statistics.captureTime) &&
        Objects.equals(this.messagesReceived, statistics.messagesReceived) &&
        Objects.equals(this.messagesStored, statistics.messagesStored) &&
        Objects.equals(this.requests, statistics.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDevices, activeUsers, captureTime, messagesReceived, messagesStored, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics {\n");
    sb.append("    activeDevices: ").append(toIndentedString(activeDevices)).append("\n");
    sb.append("    activeUsers: ").append(toIndentedString(activeUsers)).append("\n");
    sb.append("    captureTime: ").append(toIndentedString(captureTime)).append("\n");
    sb.append("    messagesReceived: ").append(toIndentedString(messagesReceived)).append("\n");
    sb.append("    messagesStored: ").append(toIndentedString(messagesStored)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("activeDevices");
    openapiFields.add("activeUsers");
    openapiFields.add("captureTime");
    openapiFields.add("messagesReceived");
    openapiFields.add("messagesStored");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Statistics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Statistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Statistics is not found in the empty JSON string", Statistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Statistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Statistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Statistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Statistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Statistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Statistics.class));

       return (TypeAdapter<T>) new TypeAdapter<Statistics>() {
           @Override
           public void write(JsonWriter out, Statistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Statistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Statistics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Statistics
   * @throws IOException if the JSON string is invalid with respect to Statistics
   */
  public static Statistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Statistics.class);
  }

  /**
   * Convert an instance of Statistics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

