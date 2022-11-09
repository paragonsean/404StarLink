/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import org.openapitools.client.model.DescribeUpdateActionsMessageServiceUpdateTimeRange;

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
 * DescribeUpdateActionsMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeUpdateActionsMessage {
  public static final String SERIALIZED_NAME_SERVICE_UPDATE_NAME = "ServiceUpdateName";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_NAME)
  private String serviceUpdateName;

  public static final String SERIALIZED_NAME_REPLICATION_GROUP_IDS = "ReplicationGroupIds";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_IDS)
  private List replicationGroupIds;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_IDS = "CacheClusterIds";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_IDS)
  private List cacheClusterIds;

  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_STATUS = "ServiceUpdateStatus";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_STATUS)
  private List serviceUpdateStatus;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_TIME_RANGE = "ServiceUpdateTimeRange";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_TIME_RANGE)
  private DescribeUpdateActionsMessageServiceUpdateTimeRange serviceUpdateTimeRange;

  public static final String SERIALIZED_NAME_UPDATE_ACTION_STATUS = "UpdateActionStatus";
  @SerializedName(SERIALIZED_NAME_UPDATE_ACTION_STATUS)
  private List updateActionStatus;

  public static final String SERIALIZED_NAME_SHOW_NODE_LEVEL_UPDATE_STATUS = "ShowNodeLevelUpdateStatus";
  @SerializedName(SERIALIZED_NAME_SHOW_NODE_LEVEL_UPDATE_STATUS)
  private Boolean showNodeLevelUpdateStatus;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public DescribeUpdateActionsMessage() {
  }

  public DescribeUpdateActionsMessage serviceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
    return this;
  }

  /**
   * Get serviceUpdateName
   * @return serviceUpdateName
   */
  @javax.annotation.Nullable
  public String getServiceUpdateName() {
    return serviceUpdateName;
  }

  public void setServiceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
  }


  public DescribeUpdateActionsMessage replicationGroupIds(List replicationGroupIds) {
    this.replicationGroupIds = replicationGroupIds;
    return this;
  }

  /**
   * Get replicationGroupIds
   * @return replicationGroupIds
   */
  @javax.annotation.Nullable
  public List getReplicationGroupIds() {
    return replicationGroupIds;
  }

  public void setReplicationGroupIds(List replicationGroupIds) {
    this.replicationGroupIds = replicationGroupIds;
  }


  public DescribeUpdateActionsMessage cacheClusterIds(List cacheClusterIds) {
    this.cacheClusterIds = cacheClusterIds;
    return this;
  }

  /**
   * Get cacheClusterIds
   * @return cacheClusterIds
   */
  @javax.annotation.Nullable
  public List getCacheClusterIds() {
    return cacheClusterIds;
  }

  public void setCacheClusterIds(List cacheClusterIds) {
    this.cacheClusterIds = cacheClusterIds;
  }


  public DescribeUpdateActionsMessage engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public DescribeUpdateActionsMessage serviceUpdateStatus(List serviceUpdateStatus) {
    this.serviceUpdateStatus = serviceUpdateStatus;
    return this;
  }

  /**
   * Get serviceUpdateStatus
   * @return serviceUpdateStatus
   */
  @javax.annotation.Nullable
  public List getServiceUpdateStatus() {
    return serviceUpdateStatus;
  }

  public void setServiceUpdateStatus(List serviceUpdateStatus) {
    this.serviceUpdateStatus = serviceUpdateStatus;
  }


  public DescribeUpdateActionsMessage serviceUpdateTimeRange(DescribeUpdateActionsMessageServiceUpdateTimeRange serviceUpdateTimeRange) {
    this.serviceUpdateTimeRange = serviceUpdateTimeRange;
    return this;
  }

  /**
   * Get serviceUpdateTimeRange
   * @return serviceUpdateTimeRange
   */
  @javax.annotation.Nullable
  public DescribeUpdateActionsMessageServiceUpdateTimeRange getServiceUpdateTimeRange() {
    return serviceUpdateTimeRange;
  }

  public void setServiceUpdateTimeRange(DescribeUpdateActionsMessageServiceUpdateTimeRange serviceUpdateTimeRange) {
    this.serviceUpdateTimeRange = serviceUpdateTimeRange;
  }


  public DescribeUpdateActionsMessage updateActionStatus(List updateActionStatus) {
    this.updateActionStatus = updateActionStatus;
    return this;
  }

  /**
   * Get updateActionStatus
   * @return updateActionStatus
   */
  @javax.annotation.Nullable
  public List getUpdateActionStatus() {
    return updateActionStatus;
  }

  public void setUpdateActionStatus(List updateActionStatus) {
    this.updateActionStatus = updateActionStatus;
  }


  public DescribeUpdateActionsMessage showNodeLevelUpdateStatus(Boolean showNodeLevelUpdateStatus) {
    this.showNodeLevelUpdateStatus = showNodeLevelUpdateStatus;
    return this;
  }

  /**
   * Get showNodeLevelUpdateStatus
   * @return showNodeLevelUpdateStatus
   */
  @javax.annotation.Nullable
  public Boolean getShowNodeLevelUpdateStatus() {
    return showNodeLevelUpdateStatus;
  }

  public void setShowNodeLevelUpdateStatus(Boolean showNodeLevelUpdateStatus) {
    this.showNodeLevelUpdateStatus = showNodeLevelUpdateStatus;
  }


  public DescribeUpdateActionsMessage maxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
    return this;
  }

  /**
   * Get maxRecords
   * @return maxRecords
   */
  @javax.annotation.Nullable
  public Integer getMaxRecords() {
    return maxRecords;
  }

  public void setMaxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
  }


  public DescribeUpdateActionsMessage marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
   */
  @javax.annotation.Nullable
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeUpdateActionsMessage describeUpdateActionsMessage = (DescribeUpdateActionsMessage) o;
    return Objects.equals(this.serviceUpdateName, describeUpdateActionsMessage.serviceUpdateName) &&
        Objects.equals(this.replicationGroupIds, describeUpdateActionsMessage.replicationGroupIds) &&
        Objects.equals(this.cacheClusterIds, describeUpdateActionsMessage.cacheClusterIds) &&
        Objects.equals(this.engine, describeUpdateActionsMessage.engine) &&
        Objects.equals(this.serviceUpdateStatus, describeUpdateActionsMessage.serviceUpdateStatus) &&
        Objects.equals(this.serviceUpdateTimeRange, describeUpdateActionsMessage.serviceUpdateTimeRange) &&
        Objects.equals(this.updateActionStatus, describeUpdateActionsMessage.updateActionStatus) &&
        Objects.equals(this.showNodeLevelUpdateStatus, describeUpdateActionsMessage.showNodeLevelUpdateStatus) &&
        Objects.equals(this.maxRecords, describeUpdateActionsMessage.maxRecords) &&
        Objects.equals(this.marker, describeUpdateActionsMessage.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceUpdateName, replicationGroupIds, cacheClusterIds, engine, serviceUpdateStatus, serviceUpdateTimeRange, updateActionStatus, showNodeLevelUpdateStatus, maxRecords, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeUpdateActionsMessage {\n");
    sb.append("    serviceUpdateName: ").append(toIndentedString(serviceUpdateName)).append("\n");
    sb.append("    replicationGroupIds: ").append(toIndentedString(replicationGroupIds)).append("\n");
    sb.append("    cacheClusterIds: ").append(toIndentedString(cacheClusterIds)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    serviceUpdateStatus: ").append(toIndentedString(serviceUpdateStatus)).append("\n");
    sb.append("    serviceUpdateTimeRange: ").append(toIndentedString(serviceUpdateTimeRange)).append("\n");
    sb.append("    updateActionStatus: ").append(toIndentedString(updateActionStatus)).append("\n");
    sb.append("    showNodeLevelUpdateStatus: ").append(toIndentedString(showNodeLevelUpdateStatus)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
    openapiFields.add("ServiceUpdateName");
    openapiFields.add("ReplicationGroupIds");
    openapiFields.add("CacheClusterIds");
    openapiFields.add("Engine");
    openapiFields.add("ServiceUpdateStatus");
    openapiFields.add("ServiceUpdateTimeRange");
    openapiFields.add("UpdateActionStatus");
    openapiFields.add("ShowNodeLevelUpdateStatus");
    openapiFields.add("MaxRecords");
    openapiFields.add("Marker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeUpdateActionsMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeUpdateActionsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeUpdateActionsMessage is not found in the empty JSON string", DescribeUpdateActionsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeUpdateActionsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeUpdateActionsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ServiceUpdateName`
      if (jsonObj.get("ServiceUpdateName") != null && !jsonObj.get("ServiceUpdateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceUpdateName"));
      }
      // validate the optional field `ReplicationGroupIds`
      if (jsonObj.get("ReplicationGroupIds") != null && !jsonObj.get("ReplicationGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicationGroupIds"));
      }
      // validate the optional field `CacheClusterIds`
      if (jsonObj.get("CacheClusterIds") != null && !jsonObj.get("CacheClusterIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CacheClusterIds"));
      }
      // validate the optional field `Engine`
      if (jsonObj.get("Engine") != null && !jsonObj.get("Engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Engine"));
      }
      // validate the optional field `ServiceUpdateStatus`
      if (jsonObj.get("ServiceUpdateStatus") != null && !jsonObj.get("ServiceUpdateStatus").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ServiceUpdateStatus"));
      }
      // validate the optional field `ServiceUpdateTimeRange`
      if (jsonObj.get("ServiceUpdateTimeRange") != null && !jsonObj.get("ServiceUpdateTimeRange").isJsonNull()) {
        DescribeUpdateActionsMessageServiceUpdateTimeRange.validateJsonElement(jsonObj.get("ServiceUpdateTimeRange"));
      }
      // validate the optional field `UpdateActionStatus`
      if (jsonObj.get("UpdateActionStatus") != null && !jsonObj.get("UpdateActionStatus").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("UpdateActionStatus"));
      }
      // validate the optional field `ShowNodeLevelUpdateStatus`
      if (jsonObj.get("ShowNodeLevelUpdateStatus") != null && !jsonObj.get("ShowNodeLevelUpdateStatus").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ShowNodeLevelUpdateStatus"));
      }
      // validate the optional field `MaxRecords`
      if (jsonObj.get("MaxRecords") != null && !jsonObj.get("MaxRecords").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxRecords"));
      }
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeUpdateActionsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeUpdateActionsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeUpdateActionsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeUpdateActionsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeUpdateActionsMessage>() {
           @Override
           public void write(JsonWriter out, DescribeUpdateActionsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeUpdateActionsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeUpdateActionsMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeUpdateActionsMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeUpdateActionsMessage
   */
  public static DescribeUpdateActionsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeUpdateActionsMessage.class);
  }

  /**
   * Convert an instance of DescribeUpdateActionsMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

