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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.NodeSnapshotNodeGroupConfiguration;

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
 * NodeSnapshotListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:41.807787-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NodeSnapshotListInner {
  public static final String SERIALIZED_NAME_CACHE_CLUSTER_ID = "CacheClusterId";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_ID)
  private String cacheClusterId;

  public static final String SERIALIZED_NAME_NODE_GROUP_ID = "NodeGroupId";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_ID)
  private String nodeGroupId;

  public static final String SERIALIZED_NAME_CACHE_NODE_ID = "CacheNodeId";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_ID)
  private String cacheNodeId;

  public static final String SERIALIZED_NAME_NODE_GROUP_CONFIGURATION = "NodeGroupConfiguration";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_CONFIGURATION)
  private NodeSnapshotNodeGroupConfiguration nodeGroupConfiguration;

  public static final String SERIALIZED_NAME_CACHE_SIZE = "CacheSize";
  @SerializedName(SERIALIZED_NAME_CACHE_SIZE)
  private String cacheSize;

  public static final String SERIALIZED_NAME_CACHE_NODE_CREATE_TIME = "CacheNodeCreateTime";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_CREATE_TIME)
  private OffsetDateTime cacheNodeCreateTime;

  public static final String SERIALIZED_NAME_SNAPSHOT_CREATE_TIME = "SnapshotCreateTime";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_CREATE_TIME)
  private OffsetDateTime snapshotCreateTime;

  public NodeSnapshotListInner() {
  }

  public NodeSnapshotListInner cacheClusterId(String cacheClusterId) {
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


  public NodeSnapshotListInner nodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
    return this;
  }

  /**
   * Get nodeGroupId
   * @return nodeGroupId
   */
  @javax.annotation.Nullable
  public String getNodeGroupId() {
    return nodeGroupId;
  }

  public void setNodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
  }


  public NodeSnapshotListInner cacheNodeId(String cacheNodeId) {
    this.cacheNodeId = cacheNodeId;
    return this;
  }

  /**
   * Get cacheNodeId
   * @return cacheNodeId
   */
  @javax.annotation.Nullable
  public String getCacheNodeId() {
    return cacheNodeId;
  }

  public void setCacheNodeId(String cacheNodeId) {
    this.cacheNodeId = cacheNodeId;
  }


  public NodeSnapshotListInner nodeGroupConfiguration(NodeSnapshotNodeGroupConfiguration nodeGroupConfiguration) {
    this.nodeGroupConfiguration = nodeGroupConfiguration;
    return this;
  }

  /**
   * Get nodeGroupConfiguration
   * @return nodeGroupConfiguration
   */
  @javax.annotation.Nullable
  public NodeSnapshotNodeGroupConfiguration getNodeGroupConfiguration() {
    return nodeGroupConfiguration;
  }

  public void setNodeGroupConfiguration(NodeSnapshotNodeGroupConfiguration nodeGroupConfiguration) {
    this.nodeGroupConfiguration = nodeGroupConfiguration;
  }


  public NodeSnapshotListInner cacheSize(String cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

  /**
   * Get cacheSize
   * @return cacheSize
   */
  @javax.annotation.Nullable
  public String getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(String cacheSize) {
    this.cacheSize = cacheSize;
  }


  public NodeSnapshotListInner cacheNodeCreateTime(OffsetDateTime cacheNodeCreateTime) {
    this.cacheNodeCreateTime = cacheNodeCreateTime;
    return this;
  }

  /**
   * Get cacheNodeCreateTime
   * @return cacheNodeCreateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCacheNodeCreateTime() {
    return cacheNodeCreateTime;
  }

  public void setCacheNodeCreateTime(OffsetDateTime cacheNodeCreateTime) {
    this.cacheNodeCreateTime = cacheNodeCreateTime;
  }


  public NodeSnapshotListInner snapshotCreateTime(OffsetDateTime snapshotCreateTime) {
    this.snapshotCreateTime = snapshotCreateTime;
    return this;
  }

  /**
   * Get snapshotCreateTime
   * @return snapshotCreateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSnapshotCreateTime() {
    return snapshotCreateTime;
  }

  public void setSnapshotCreateTime(OffsetDateTime snapshotCreateTime) {
    this.snapshotCreateTime = snapshotCreateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSnapshotListInner nodeSnapshotListInner = (NodeSnapshotListInner) o;
    return Objects.equals(this.cacheClusterId, nodeSnapshotListInner.cacheClusterId) &&
        Objects.equals(this.nodeGroupId, nodeSnapshotListInner.nodeGroupId) &&
        Objects.equals(this.cacheNodeId, nodeSnapshotListInner.cacheNodeId) &&
        Objects.equals(this.nodeGroupConfiguration, nodeSnapshotListInner.nodeGroupConfiguration) &&
        Objects.equals(this.cacheSize, nodeSnapshotListInner.cacheSize) &&
        Objects.equals(this.cacheNodeCreateTime, nodeSnapshotListInner.cacheNodeCreateTime) &&
        Objects.equals(this.snapshotCreateTime, nodeSnapshotListInner.snapshotCreateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheClusterId, nodeGroupId, cacheNodeId, nodeGroupConfiguration, cacheSize, cacheNodeCreateTime, snapshotCreateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSnapshotListInner {\n");
    sb.append("    cacheClusterId: ").append(toIndentedString(cacheClusterId)).append("\n");
    sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
    sb.append("    cacheNodeId: ").append(toIndentedString(cacheNodeId)).append("\n");
    sb.append("    nodeGroupConfiguration: ").append(toIndentedString(nodeGroupConfiguration)).append("\n");
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
    sb.append("    cacheNodeCreateTime: ").append(toIndentedString(cacheNodeCreateTime)).append("\n");
    sb.append("    snapshotCreateTime: ").append(toIndentedString(snapshotCreateTime)).append("\n");
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
    openapiFields.add("CacheClusterId");
    openapiFields.add("NodeGroupId");
    openapiFields.add("CacheNodeId");
    openapiFields.add("NodeGroupConfiguration");
    openapiFields.add("CacheSize");
    openapiFields.add("CacheNodeCreateTime");
    openapiFields.add("SnapshotCreateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NodeSnapshotListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NodeSnapshotListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeSnapshotListInner is not found in the empty JSON string", NodeSnapshotListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NodeSnapshotListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NodeSnapshotListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheClusterId`
      if (jsonObj.get("CacheClusterId") != null && !jsonObj.get("CacheClusterId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheClusterId"));
      }
      // validate the optional field `NodeGroupId`
      if (jsonObj.get("NodeGroupId") != null && !jsonObj.get("NodeGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NodeGroupId"));
      }
      // validate the optional field `CacheNodeId`
      if (jsonObj.get("CacheNodeId") != null && !jsonObj.get("CacheNodeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeId"));
      }
      // validate the optional field `NodeGroupConfiguration`
      if (jsonObj.get("NodeGroupConfiguration") != null && !jsonObj.get("NodeGroupConfiguration").isJsonNull()) {
        NodeSnapshotNodeGroupConfiguration.validateJsonElement(jsonObj.get("NodeGroupConfiguration"));
      }
      // validate the optional field `CacheSize`
      if (jsonObj.get("CacheSize") != null && !jsonObj.get("CacheSize").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSize"));
      }
      // validate the optional field `CacheNodeCreateTime`
      if (jsonObj.get("CacheNodeCreateTime") != null && !jsonObj.get("CacheNodeCreateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CacheNodeCreateTime"));
      }
      // validate the optional field `SnapshotCreateTime`
      if (jsonObj.get("SnapshotCreateTime") != null && !jsonObj.get("SnapshotCreateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("SnapshotCreateTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeSnapshotListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeSnapshotListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeSnapshotListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeSnapshotListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeSnapshotListInner>() {
           @Override
           public void write(JsonWriter out, NodeSnapshotListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeSnapshotListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NodeSnapshotListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NodeSnapshotListInner
   * @throws IOException if the JSON string is invalid with respect to NodeSnapshotListInner
   */
  public static NodeSnapshotListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeSnapshotListInner.class);
  }

  /**
   * Convert an instance of NodeSnapshotListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

