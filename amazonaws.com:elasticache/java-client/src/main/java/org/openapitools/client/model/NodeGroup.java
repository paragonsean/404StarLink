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
import org.openapitools.client.model.NodeGroupPrimaryEndpoint;
import org.openapitools.client.model.NodeGroupReaderEndpoint;

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
 * Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NodeGroup {
  public static final String SERIALIZED_NAME_NODE_GROUP_ID = "NodeGroupId";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_ID)
  private String nodeGroupId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PRIMARY_ENDPOINT = "PrimaryEndpoint";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ENDPOINT)
  private NodeGroupPrimaryEndpoint primaryEndpoint;

  public static final String SERIALIZED_NAME_READER_ENDPOINT = "ReaderEndpoint";
  @SerializedName(SERIALIZED_NAME_READER_ENDPOINT)
  private NodeGroupReaderEndpoint readerEndpoint;

  public static final String SERIALIZED_NAME_SLOTS = "Slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private String slots;

  public static final String SERIALIZED_NAME_NODE_GROUP_MEMBERS = "NodeGroupMembers";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_MEMBERS)
  private List nodeGroupMembers;

  public NodeGroup() {
  }

  public NodeGroup nodeGroupId(String nodeGroupId) {
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


  public NodeGroup status(String status) {
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


  public NodeGroup primaryEndpoint(NodeGroupPrimaryEndpoint primaryEndpoint) {
    this.primaryEndpoint = primaryEndpoint;
    return this;
  }

  /**
   * Get primaryEndpoint
   * @return primaryEndpoint
   */
  @javax.annotation.Nullable
  public NodeGroupPrimaryEndpoint getPrimaryEndpoint() {
    return primaryEndpoint;
  }

  public void setPrimaryEndpoint(NodeGroupPrimaryEndpoint primaryEndpoint) {
    this.primaryEndpoint = primaryEndpoint;
  }


  public NodeGroup readerEndpoint(NodeGroupReaderEndpoint readerEndpoint) {
    this.readerEndpoint = readerEndpoint;
    return this;
  }

  /**
   * Get readerEndpoint
   * @return readerEndpoint
   */
  @javax.annotation.Nullable
  public NodeGroupReaderEndpoint getReaderEndpoint() {
    return readerEndpoint;
  }

  public void setReaderEndpoint(NodeGroupReaderEndpoint readerEndpoint) {
    this.readerEndpoint = readerEndpoint;
  }


  public NodeGroup slots(String slots) {
    this.slots = slots;
    return this;
  }

  /**
   * Get slots
   * @return slots
   */
  @javax.annotation.Nullable
  public String getSlots() {
    return slots;
  }

  public void setSlots(String slots) {
    this.slots = slots;
  }


  public NodeGroup nodeGroupMembers(List nodeGroupMembers) {
    this.nodeGroupMembers = nodeGroupMembers;
    return this;
  }

  /**
   * Get nodeGroupMembers
   * @return nodeGroupMembers
   */
  @javax.annotation.Nullable
  public List getNodeGroupMembers() {
    return nodeGroupMembers;
  }

  public void setNodeGroupMembers(List nodeGroupMembers) {
    this.nodeGroupMembers = nodeGroupMembers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeGroup nodeGroup = (NodeGroup) o;
    return Objects.equals(this.nodeGroupId, nodeGroup.nodeGroupId) &&
        Objects.equals(this.status, nodeGroup.status) &&
        Objects.equals(this.primaryEndpoint, nodeGroup.primaryEndpoint) &&
        Objects.equals(this.readerEndpoint, nodeGroup.readerEndpoint) &&
        Objects.equals(this.slots, nodeGroup.slots) &&
        Objects.equals(this.nodeGroupMembers, nodeGroup.nodeGroupMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeGroupId, status, primaryEndpoint, readerEndpoint, slots, nodeGroupMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeGroup {\n");
    sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    primaryEndpoint: ").append(toIndentedString(primaryEndpoint)).append("\n");
    sb.append("    readerEndpoint: ").append(toIndentedString(readerEndpoint)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    nodeGroupMembers: ").append(toIndentedString(nodeGroupMembers)).append("\n");
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
    openapiFields.add("NodeGroupId");
    openapiFields.add("Status");
    openapiFields.add("PrimaryEndpoint");
    openapiFields.add("ReaderEndpoint");
    openapiFields.add("Slots");
    openapiFields.add("NodeGroupMembers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NodeGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NodeGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeGroup is not found in the empty JSON string", NodeGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NodeGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NodeGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `NodeGroupId`
      if (jsonObj.get("NodeGroupId") != null && !jsonObj.get("NodeGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NodeGroupId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `PrimaryEndpoint`
      if (jsonObj.get("PrimaryEndpoint") != null && !jsonObj.get("PrimaryEndpoint").isJsonNull()) {
        NodeGroupPrimaryEndpoint.validateJsonElement(jsonObj.get("PrimaryEndpoint"));
      }
      // validate the optional field `ReaderEndpoint`
      if (jsonObj.get("ReaderEndpoint") != null && !jsonObj.get("ReaderEndpoint").isJsonNull()) {
        NodeGroupReaderEndpoint.validateJsonElement(jsonObj.get("ReaderEndpoint"));
      }
      // validate the optional field `Slots`
      if (jsonObj.get("Slots") != null && !jsonObj.get("Slots").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Slots"));
      }
      // validate the optional field `NodeGroupMembers`
      if (jsonObj.get("NodeGroupMembers") != null && !jsonObj.get("NodeGroupMembers").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NodeGroupMembers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeGroup>() {
           @Override
           public void write(JsonWriter out, NodeGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NodeGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NodeGroup
   * @throws IOException if the JSON string is invalid with respect to NodeGroup
   */
  public static NodeGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeGroup.class);
  }

  /**
   * Convert an instance of NodeGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

