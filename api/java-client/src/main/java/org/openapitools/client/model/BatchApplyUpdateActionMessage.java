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
 * BatchApplyUpdateActionMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchApplyUpdateActionMessage {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_IDS = "ReplicationGroupIds";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_IDS)
  private List replicationGroupIds;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_IDS = "CacheClusterIds";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_IDS)
  private List cacheClusterIds;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_NAME = "ServiceUpdateName";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_NAME)
  private String serviceUpdateName;

  public BatchApplyUpdateActionMessage() {
  }

  public BatchApplyUpdateActionMessage replicationGroupIds(List replicationGroupIds) {
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


  public BatchApplyUpdateActionMessage cacheClusterIds(List cacheClusterIds) {
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


  public BatchApplyUpdateActionMessage serviceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
    return this;
  }

  /**
   * Get serviceUpdateName
   * @return serviceUpdateName
   */
  @javax.annotation.Nonnull
  public String getServiceUpdateName() {
    return serviceUpdateName;
  }

  public void setServiceUpdateName(String serviceUpdateName) {
    this.serviceUpdateName = serviceUpdateName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchApplyUpdateActionMessage batchApplyUpdateActionMessage = (BatchApplyUpdateActionMessage) o;
    return Objects.equals(this.replicationGroupIds, batchApplyUpdateActionMessage.replicationGroupIds) &&
        Objects.equals(this.cacheClusterIds, batchApplyUpdateActionMessage.cacheClusterIds) &&
        Objects.equals(this.serviceUpdateName, batchApplyUpdateActionMessage.serviceUpdateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupIds, cacheClusterIds, serviceUpdateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchApplyUpdateActionMessage {\n");
    sb.append("    replicationGroupIds: ").append(toIndentedString(replicationGroupIds)).append("\n");
    sb.append("    cacheClusterIds: ").append(toIndentedString(cacheClusterIds)).append("\n");
    sb.append("    serviceUpdateName: ").append(toIndentedString(serviceUpdateName)).append("\n");
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
    openapiFields.add("ReplicationGroupIds");
    openapiFields.add("CacheClusterIds");
    openapiFields.add("ServiceUpdateName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ServiceUpdateName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchApplyUpdateActionMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchApplyUpdateActionMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchApplyUpdateActionMessage is not found in the empty JSON string", BatchApplyUpdateActionMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchApplyUpdateActionMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchApplyUpdateActionMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchApplyUpdateActionMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationGroupIds`
      if (jsonObj.get("ReplicationGroupIds") != null && !jsonObj.get("ReplicationGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicationGroupIds"));
      }
      // validate the optional field `CacheClusterIds`
      if (jsonObj.get("CacheClusterIds") != null && !jsonObj.get("CacheClusterIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CacheClusterIds"));
      }
      // validate the required field `ServiceUpdateName`
      String.validateJsonElement(jsonObj.get("ServiceUpdateName"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchApplyUpdateActionMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchApplyUpdateActionMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchApplyUpdateActionMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchApplyUpdateActionMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchApplyUpdateActionMessage>() {
           @Override
           public void write(JsonWriter out, BatchApplyUpdateActionMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchApplyUpdateActionMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchApplyUpdateActionMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchApplyUpdateActionMessage
   * @throws IOException if the JSON string is invalid with respect to BatchApplyUpdateActionMessage
   */
  public static BatchApplyUpdateActionMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchApplyUpdateActionMessage.class);
  }

  /**
   * Convert an instance of BatchApplyUpdateActionMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

