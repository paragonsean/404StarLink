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
 * Provides information about an event tracker.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:12.718856-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EventTracker {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_TRACKER_ARN = "eventTrackerArn";
  @SerializedName(SERIALIZED_NAME_EVENT_TRACKER_ARN)
  private String eventTrackerArn;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "trackingId";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public EventTracker() {
  }

  public EventTracker name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EventTracker eventTrackerArn(String eventTrackerArn) {
    this.eventTrackerArn = eventTrackerArn;
    return this;
  }

  /**
   * Get eventTrackerArn
   * @return eventTrackerArn
   */
  @javax.annotation.Nullable
  public String getEventTrackerArn() {
    return eventTrackerArn;
  }

  public void setEventTrackerArn(String eventTrackerArn) {
    this.eventTrackerArn = eventTrackerArn;
  }


  public EventTracker accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EventTracker trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
   */
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public EventTracker datasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
    return this;
  }

  /**
   * Get datasetGroupArn
   * @return datasetGroupArn
   */
  @javax.annotation.Nullable
  public String getDatasetGroupArn() {
    return datasetGroupArn;
  }

  public void setDatasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
  }


  public EventTracker status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public EventTracker creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public EventTracker lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTracker eventTracker = (EventTracker) o;
    return Objects.equals(this.name, eventTracker.name) &&
        Objects.equals(this.eventTrackerArn, eventTracker.eventTrackerArn) &&
        Objects.equals(this.accountId, eventTracker.accountId) &&
        Objects.equals(this.trackingId, eventTracker.trackingId) &&
        Objects.equals(this.datasetGroupArn, eventTracker.datasetGroupArn) &&
        Objects.equals(this.status, eventTracker.status) &&
        Objects.equals(this.creationDateTime, eventTracker.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, eventTracker.lastUpdatedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, eventTrackerArn, accountId, trackingId, datasetGroupArn, status, creationDateTime, lastUpdatedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTracker {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventTrackerArn: ").append(toIndentedString(eventTrackerArn)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("eventTrackerArn");
    openapiFields.add("accountId");
    openapiFields.add("trackingId");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("status");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventTracker
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventTracker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventTracker is not found in the empty JSON string", EventTracker.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventTracker.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventTracker` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `eventTrackerArn`
      if (jsonObj.get("eventTrackerArn") != null && !jsonObj.get("eventTrackerArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eventTrackerArn"));
      }
      // validate the optional field `accountId`
      if (jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("accountId"));
      }
      // validate the optional field `trackingId`
      if (jsonObj.get("trackingId") != null && !jsonObj.get("trackingId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("trackingId"));
      }
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventTracker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventTracker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventTracker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventTracker.class));

       return (TypeAdapter<T>) new TypeAdapter<EventTracker>() {
           @Override
           public void write(JsonWriter out, EventTracker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventTracker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventTracker given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventTracker
   * @throws IOException if the JSON string is invalid with respect to EventTracker
   */
  public static EventTracker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventTracker.class);
  }

  /**
   * Convert an instance of EventTracker to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

