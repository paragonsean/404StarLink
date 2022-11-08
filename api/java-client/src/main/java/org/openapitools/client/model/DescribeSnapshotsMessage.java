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
 * Represents the input of a &lt;code&gt;DescribeSnapshotsMessage&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:41.807787-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeSnapshotsMessage {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_ID = "CacheClusterId";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_ID)
  private String cacheClusterId;

  public static final String SERIALIZED_NAME_SNAPSHOT_NAME = "SnapshotName";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NAME)
  private String snapshotName;

  public static final String SERIALIZED_NAME_SNAPSHOT_SOURCE = "SnapshotSource";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_SOURCE)
  private String snapshotSource;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_SHOW_NODE_GROUP_CONFIG = "ShowNodeGroupConfig";
  @SerializedName(SERIALIZED_NAME_SHOW_NODE_GROUP_CONFIG)
  private Boolean showNodeGroupConfig;

  public DescribeSnapshotsMessage() {
  }

  public DescribeSnapshotsMessage replicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
    return this;
  }

  /**
   * Get replicationGroupId
   * @return replicationGroupId
   */
  @javax.annotation.Nullable
  public String getReplicationGroupId() {
    return replicationGroupId;
  }

  public void setReplicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
  }


  public DescribeSnapshotsMessage cacheClusterId(String cacheClusterId) {
    this.cacheClusterId = cacheClusterId;
    return this;
  }

  /**
   * Get cacheClusterId
   * @return cacheClusterId
   */
  @javax.annotation.Nullable
  public String getCacheClusterId() {
    return cacheClusterId;
  }

  public void setCacheClusterId(String cacheClusterId) {
    this.cacheClusterId = cacheClusterId;
  }


  public DescribeSnapshotsMessage snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * Get snapshotName
   * @return snapshotName
   */
  @javax.annotation.Nullable
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  public DescribeSnapshotsMessage snapshotSource(String snapshotSource) {
    this.snapshotSource = snapshotSource;
    return this;
  }

  /**
   * Get snapshotSource
   * @return snapshotSource
   */
  @javax.annotation.Nullable
  public String getSnapshotSource() {
    return snapshotSource;
  }

  public void setSnapshotSource(String snapshotSource) {
    this.snapshotSource = snapshotSource;
  }


  public DescribeSnapshotsMessage marker(String marker) {
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


  public DescribeSnapshotsMessage maxRecords(Integer maxRecords) {
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


  public DescribeSnapshotsMessage showNodeGroupConfig(Boolean showNodeGroupConfig) {
    this.showNodeGroupConfig = showNodeGroupConfig;
    return this;
  }

  /**
   * Get showNodeGroupConfig
   * @return showNodeGroupConfig
   */
  @javax.annotation.Nullable
  public Boolean getShowNodeGroupConfig() {
    return showNodeGroupConfig;
  }

  public void setShowNodeGroupConfig(Boolean showNodeGroupConfig) {
    this.showNodeGroupConfig = showNodeGroupConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSnapshotsMessage describeSnapshotsMessage = (DescribeSnapshotsMessage) o;
    return Objects.equals(this.replicationGroupId, describeSnapshotsMessage.replicationGroupId) &&
        Objects.equals(this.cacheClusterId, describeSnapshotsMessage.cacheClusterId) &&
        Objects.equals(this.snapshotName, describeSnapshotsMessage.snapshotName) &&
        Objects.equals(this.snapshotSource, describeSnapshotsMessage.snapshotSource) &&
        Objects.equals(this.marker, describeSnapshotsMessage.marker) &&
        Objects.equals(this.maxRecords, describeSnapshotsMessage.maxRecords) &&
        Objects.equals(this.showNodeGroupConfig, describeSnapshotsMessage.showNodeGroupConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, cacheClusterId, snapshotName, snapshotSource, marker, maxRecords, showNodeGroupConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnapshotsMessage {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    cacheClusterId: ").append(toIndentedString(cacheClusterId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotSource: ").append(toIndentedString(snapshotSource)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    showNodeGroupConfig: ").append(toIndentedString(showNodeGroupConfig)).append("\n");
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
    openapiFields.add("ReplicationGroupId");
    openapiFields.add("CacheClusterId");
    openapiFields.add("SnapshotName");
    openapiFields.add("SnapshotSource");
    openapiFields.add("Marker");
    openapiFields.add("MaxRecords");
    openapiFields.add("ShowNodeGroupConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeSnapshotsMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeSnapshotsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeSnapshotsMessage is not found in the empty JSON string", DescribeSnapshotsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeSnapshotsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeSnapshotsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationGroupId`
      if (jsonObj.get("ReplicationGroupId") != null && !jsonObj.get("ReplicationGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationGroupId"));
      }
      // validate the optional field `CacheClusterId`
      if (jsonObj.get("CacheClusterId") != null && !jsonObj.get("CacheClusterId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheClusterId"));
      }
      // validate the optional field `SnapshotName`
      if (jsonObj.get("SnapshotName") != null && !jsonObj.get("SnapshotName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotName"));
      }
      // validate the optional field `SnapshotSource`
      if (jsonObj.get("SnapshotSource") != null && !jsonObj.get("SnapshotSource").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotSource"));
      }
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
      // validate the optional field `MaxRecords`
      if (jsonObj.get("MaxRecords") != null && !jsonObj.get("MaxRecords").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxRecords"));
      }
      // validate the optional field `ShowNodeGroupConfig`
      if (jsonObj.get("ShowNodeGroupConfig") != null && !jsonObj.get("ShowNodeGroupConfig").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ShowNodeGroupConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeSnapshotsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeSnapshotsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeSnapshotsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeSnapshotsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeSnapshotsMessage>() {
           @Override
           public void write(JsonWriter out, DescribeSnapshotsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeSnapshotsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeSnapshotsMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeSnapshotsMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeSnapshotsMessage
   */
  public static DescribeSnapshotsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeSnapshotsMessage.class);
  }

  /**
   * Convert an instance of DescribeSnapshotsMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

