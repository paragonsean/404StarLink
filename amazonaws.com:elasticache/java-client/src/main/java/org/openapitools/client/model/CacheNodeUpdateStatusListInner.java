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
import org.openapitools.client.model.NodeUpdateInitiatedBy;
import org.openapitools.client.model.NodeUpdateStatus;

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
 * CacheNodeUpdateStatusListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheNodeUpdateStatusListInner {
  public static final String SERIALIZED_NAME_CACHE_NODE_ID = "CacheNodeId";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_ID)
  private String cacheNodeId;

  public static final String SERIALIZED_NAME_NODE_UPDATE_STATUS = "NodeUpdateStatus";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_STATUS)
  private NodeUpdateStatus nodeUpdateStatus;

  public static final String SERIALIZED_NAME_NODE_DELETION_DATE = "NodeDeletionDate";
  @SerializedName(SERIALIZED_NAME_NODE_DELETION_DATE)
  private OffsetDateTime nodeDeletionDate;

  public static final String SERIALIZED_NAME_NODE_UPDATE_START_DATE = "NodeUpdateStartDate";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_START_DATE)
  private OffsetDateTime nodeUpdateStartDate;

  public static final String SERIALIZED_NAME_NODE_UPDATE_END_DATE = "NodeUpdateEndDate";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_END_DATE)
  private OffsetDateTime nodeUpdateEndDate;

  public static final String SERIALIZED_NAME_NODE_UPDATE_INITIATED_BY = "NodeUpdateInitiatedBy";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_INITIATED_BY)
  private NodeUpdateInitiatedBy nodeUpdateInitiatedBy;

  public static final String SERIALIZED_NAME_NODE_UPDATE_INITIATED_DATE = "NodeUpdateInitiatedDate";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_INITIATED_DATE)
  private OffsetDateTime nodeUpdateInitiatedDate;

  public static final String SERIALIZED_NAME_NODE_UPDATE_STATUS_MODIFIED_DATE = "NodeUpdateStatusModifiedDate";
  @SerializedName(SERIALIZED_NAME_NODE_UPDATE_STATUS_MODIFIED_DATE)
  private OffsetDateTime nodeUpdateStatusModifiedDate;

  public CacheNodeUpdateStatusListInner() {
  }

  public CacheNodeUpdateStatusListInner cacheNodeId(String cacheNodeId) {
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


  public CacheNodeUpdateStatusListInner nodeUpdateStatus(NodeUpdateStatus nodeUpdateStatus) {
    this.nodeUpdateStatus = nodeUpdateStatus;
    return this;
  }

  /**
   * Get nodeUpdateStatus
   * @return nodeUpdateStatus
   */
  @javax.annotation.Nullable
  public NodeUpdateStatus getNodeUpdateStatus() {
    return nodeUpdateStatus;
  }

  public void setNodeUpdateStatus(NodeUpdateStatus nodeUpdateStatus) {
    this.nodeUpdateStatus = nodeUpdateStatus;
  }


  public CacheNodeUpdateStatusListInner nodeDeletionDate(OffsetDateTime nodeDeletionDate) {
    this.nodeDeletionDate = nodeDeletionDate;
    return this;
  }

  /**
   * Get nodeDeletionDate
   * @return nodeDeletionDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNodeDeletionDate() {
    return nodeDeletionDate;
  }

  public void setNodeDeletionDate(OffsetDateTime nodeDeletionDate) {
    this.nodeDeletionDate = nodeDeletionDate;
  }


  public CacheNodeUpdateStatusListInner nodeUpdateStartDate(OffsetDateTime nodeUpdateStartDate) {
    this.nodeUpdateStartDate = nodeUpdateStartDate;
    return this;
  }

  /**
   * Get nodeUpdateStartDate
   * @return nodeUpdateStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNodeUpdateStartDate() {
    return nodeUpdateStartDate;
  }

  public void setNodeUpdateStartDate(OffsetDateTime nodeUpdateStartDate) {
    this.nodeUpdateStartDate = nodeUpdateStartDate;
  }


  public CacheNodeUpdateStatusListInner nodeUpdateEndDate(OffsetDateTime nodeUpdateEndDate) {
    this.nodeUpdateEndDate = nodeUpdateEndDate;
    return this;
  }

  /**
   * Get nodeUpdateEndDate
   * @return nodeUpdateEndDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNodeUpdateEndDate() {
    return nodeUpdateEndDate;
  }

  public void setNodeUpdateEndDate(OffsetDateTime nodeUpdateEndDate) {
    this.nodeUpdateEndDate = nodeUpdateEndDate;
  }


  public CacheNodeUpdateStatusListInner nodeUpdateInitiatedBy(NodeUpdateInitiatedBy nodeUpdateInitiatedBy) {
    this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy;
    return this;
  }

  /**
   * Get nodeUpdateInitiatedBy
   * @return nodeUpdateInitiatedBy
   */
  @javax.annotation.Nullable
  public NodeUpdateInitiatedBy getNodeUpdateInitiatedBy() {
    return nodeUpdateInitiatedBy;
  }

  public void setNodeUpdateInitiatedBy(NodeUpdateInitiatedBy nodeUpdateInitiatedBy) {
    this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy;
  }


  public CacheNodeUpdateStatusListInner nodeUpdateInitiatedDate(OffsetDateTime nodeUpdateInitiatedDate) {
    this.nodeUpdateInitiatedDate = nodeUpdateInitiatedDate;
    return this;
  }

  /**
   * Get nodeUpdateInitiatedDate
   * @return nodeUpdateInitiatedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNodeUpdateInitiatedDate() {
    return nodeUpdateInitiatedDate;
  }

  public void setNodeUpdateInitiatedDate(OffsetDateTime nodeUpdateInitiatedDate) {
    this.nodeUpdateInitiatedDate = nodeUpdateInitiatedDate;
  }


  public CacheNodeUpdateStatusListInner nodeUpdateStatusModifiedDate(OffsetDateTime nodeUpdateStatusModifiedDate) {
    this.nodeUpdateStatusModifiedDate = nodeUpdateStatusModifiedDate;
    return this;
  }

  /**
   * Get nodeUpdateStatusModifiedDate
   * @return nodeUpdateStatusModifiedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNodeUpdateStatusModifiedDate() {
    return nodeUpdateStatusModifiedDate;
  }

  public void setNodeUpdateStatusModifiedDate(OffsetDateTime nodeUpdateStatusModifiedDate) {
    this.nodeUpdateStatusModifiedDate = nodeUpdateStatusModifiedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheNodeUpdateStatusListInner cacheNodeUpdateStatusListInner = (CacheNodeUpdateStatusListInner) o;
    return Objects.equals(this.cacheNodeId, cacheNodeUpdateStatusListInner.cacheNodeId) &&
        Objects.equals(this.nodeUpdateStatus, cacheNodeUpdateStatusListInner.nodeUpdateStatus) &&
        Objects.equals(this.nodeDeletionDate, cacheNodeUpdateStatusListInner.nodeDeletionDate) &&
        Objects.equals(this.nodeUpdateStartDate, cacheNodeUpdateStatusListInner.nodeUpdateStartDate) &&
        Objects.equals(this.nodeUpdateEndDate, cacheNodeUpdateStatusListInner.nodeUpdateEndDate) &&
        Objects.equals(this.nodeUpdateInitiatedBy, cacheNodeUpdateStatusListInner.nodeUpdateInitiatedBy) &&
        Objects.equals(this.nodeUpdateInitiatedDate, cacheNodeUpdateStatusListInner.nodeUpdateInitiatedDate) &&
        Objects.equals(this.nodeUpdateStatusModifiedDate, cacheNodeUpdateStatusListInner.nodeUpdateStatusModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheNodeId, nodeUpdateStatus, nodeDeletionDate, nodeUpdateStartDate, nodeUpdateEndDate, nodeUpdateInitiatedBy, nodeUpdateInitiatedDate, nodeUpdateStatusModifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheNodeUpdateStatusListInner {\n");
    sb.append("    cacheNodeId: ").append(toIndentedString(cacheNodeId)).append("\n");
    sb.append("    nodeUpdateStatus: ").append(toIndentedString(nodeUpdateStatus)).append("\n");
    sb.append("    nodeDeletionDate: ").append(toIndentedString(nodeDeletionDate)).append("\n");
    sb.append("    nodeUpdateStartDate: ").append(toIndentedString(nodeUpdateStartDate)).append("\n");
    sb.append("    nodeUpdateEndDate: ").append(toIndentedString(nodeUpdateEndDate)).append("\n");
    sb.append("    nodeUpdateInitiatedBy: ").append(toIndentedString(nodeUpdateInitiatedBy)).append("\n");
    sb.append("    nodeUpdateInitiatedDate: ").append(toIndentedString(nodeUpdateInitiatedDate)).append("\n");
    sb.append("    nodeUpdateStatusModifiedDate: ").append(toIndentedString(nodeUpdateStatusModifiedDate)).append("\n");
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
    openapiFields.add("CacheNodeId");
    openapiFields.add("NodeUpdateStatus");
    openapiFields.add("NodeDeletionDate");
    openapiFields.add("NodeUpdateStartDate");
    openapiFields.add("NodeUpdateEndDate");
    openapiFields.add("NodeUpdateInitiatedBy");
    openapiFields.add("NodeUpdateInitiatedDate");
    openapiFields.add("NodeUpdateStatusModifiedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheNodeUpdateStatusListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheNodeUpdateStatusListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheNodeUpdateStatusListInner is not found in the empty JSON string", CacheNodeUpdateStatusListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheNodeUpdateStatusListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheNodeUpdateStatusListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheNodeId`
      if (jsonObj.get("CacheNodeId") != null && !jsonObj.get("CacheNodeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeId"));
      }
      // validate the optional field `NodeUpdateStatus`
      if (jsonObj.get("NodeUpdateStatus") != null && !jsonObj.get("NodeUpdateStatus").isJsonNull()) {
        NodeUpdateStatus.validateJsonElement(jsonObj.get("NodeUpdateStatus"));
      }
      // validate the optional field `NodeDeletionDate`
      if (jsonObj.get("NodeDeletionDate") != null && !jsonObj.get("NodeDeletionDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("NodeDeletionDate"));
      }
      // validate the optional field `NodeUpdateStartDate`
      if (jsonObj.get("NodeUpdateStartDate") != null && !jsonObj.get("NodeUpdateStartDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("NodeUpdateStartDate"));
      }
      // validate the optional field `NodeUpdateEndDate`
      if (jsonObj.get("NodeUpdateEndDate") != null && !jsonObj.get("NodeUpdateEndDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("NodeUpdateEndDate"));
      }
      // validate the optional field `NodeUpdateInitiatedBy`
      if (jsonObj.get("NodeUpdateInitiatedBy") != null && !jsonObj.get("NodeUpdateInitiatedBy").isJsonNull()) {
        NodeUpdateInitiatedBy.validateJsonElement(jsonObj.get("NodeUpdateInitiatedBy"));
      }
      // validate the optional field `NodeUpdateInitiatedDate`
      if (jsonObj.get("NodeUpdateInitiatedDate") != null && !jsonObj.get("NodeUpdateInitiatedDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("NodeUpdateInitiatedDate"));
      }
      // validate the optional field `NodeUpdateStatusModifiedDate`
      if (jsonObj.get("NodeUpdateStatusModifiedDate") != null && !jsonObj.get("NodeUpdateStatusModifiedDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("NodeUpdateStatusModifiedDate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheNodeUpdateStatusListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheNodeUpdateStatusListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheNodeUpdateStatusListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheNodeUpdateStatusListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheNodeUpdateStatusListInner>() {
           @Override
           public void write(JsonWriter out, CacheNodeUpdateStatusListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheNodeUpdateStatusListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheNodeUpdateStatusListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheNodeUpdateStatusListInner
   * @throws IOException if the JSON string is invalid with respect to CacheNodeUpdateStatusListInner
   */
  public static CacheNodeUpdateStatusListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheNodeUpdateStatusListInner.class);
  }

  /**
   * Convert an instance of CacheNodeUpdateStatusListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

