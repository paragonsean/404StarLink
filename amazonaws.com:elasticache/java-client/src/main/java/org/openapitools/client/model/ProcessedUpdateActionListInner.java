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
import org.openapitools.client.model.UpdateActionStatus;

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
 * ProcessedUpdateActionListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProcessedUpdateActionListInner {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_ID = "CacheClusterId";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_ID)
  private String cacheClusterId;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_NAME = "ServiceUpdateName";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_NAME)
  private String serviceUpdateName;

  public static final String SERIALIZED_NAME_UPDATE_ACTION_STATUS = "UpdateActionStatus";
  @SerializedName(SERIALIZED_NAME_UPDATE_ACTION_STATUS)
  private UpdateActionStatus updateActionStatus;

  public ProcessedUpdateActionListInner() {
  }

  public ProcessedUpdateActionListInner replicationGroupId(String replicationGroupId) {
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


  public ProcessedUpdateActionListInner cacheClusterId(String cacheClusterId) {
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


  public ProcessedUpdateActionListInner serviceUpdateName(String serviceUpdateName) {
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


  public ProcessedUpdateActionListInner updateActionStatus(UpdateActionStatus updateActionStatus) {
    this.updateActionStatus = updateActionStatus;
    return this;
  }

  /**
   * Get updateActionStatus
   * @return updateActionStatus
   */
  @javax.annotation.Nullable
  public UpdateActionStatus getUpdateActionStatus() {
    return updateActionStatus;
  }

  public void setUpdateActionStatus(UpdateActionStatus updateActionStatus) {
    this.updateActionStatus = updateActionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessedUpdateActionListInner processedUpdateActionListInner = (ProcessedUpdateActionListInner) o;
    return Objects.equals(this.replicationGroupId, processedUpdateActionListInner.replicationGroupId) &&
        Objects.equals(this.cacheClusterId, processedUpdateActionListInner.cacheClusterId) &&
        Objects.equals(this.serviceUpdateName, processedUpdateActionListInner.serviceUpdateName) &&
        Objects.equals(this.updateActionStatus, processedUpdateActionListInner.updateActionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, cacheClusterId, serviceUpdateName, updateActionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessedUpdateActionListInner {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    cacheClusterId: ").append(toIndentedString(cacheClusterId)).append("\n");
    sb.append("    serviceUpdateName: ").append(toIndentedString(serviceUpdateName)).append("\n");
    sb.append("    updateActionStatus: ").append(toIndentedString(updateActionStatus)).append("\n");
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
    openapiFields.add("ServiceUpdateName");
    openapiFields.add("UpdateActionStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProcessedUpdateActionListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProcessedUpdateActionListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessedUpdateActionListInner is not found in the empty JSON string", ProcessedUpdateActionListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProcessedUpdateActionListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProcessedUpdateActionListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `ServiceUpdateName`
      if (jsonObj.get("ServiceUpdateName") != null && !jsonObj.get("ServiceUpdateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceUpdateName"));
      }
      // validate the optional field `UpdateActionStatus`
      if (jsonObj.get("UpdateActionStatus") != null && !jsonObj.get("UpdateActionStatus").isJsonNull()) {
        UpdateActionStatus.validateJsonElement(jsonObj.get("UpdateActionStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessedUpdateActionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessedUpdateActionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessedUpdateActionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessedUpdateActionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessedUpdateActionListInner>() {
           @Override
           public void write(JsonWriter out, ProcessedUpdateActionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProcessedUpdateActionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProcessedUpdateActionListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProcessedUpdateActionListInner
   * @throws IOException if the JSON string is invalid with respect to ProcessedUpdateActionListInner
   */
  public static ProcessedUpdateActionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessedUpdateActionListInner.class);
  }

  /**
   * Convert an instance of ProcessedUpdateActionListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

