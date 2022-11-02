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
 * Update action that has failed to be processed for the corresponding apply/stop request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UnprocessedUpdateAction {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_ID = "CacheClusterId";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_ID)
  private String cacheClusterId;

  public static final String SERIALIZED_NAME_SERVICE_UPDATE_NAME = "ServiceUpdateName";
  @SerializedName(SERIALIZED_NAME_SERVICE_UPDATE_NAME)
  private String serviceUpdateName;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "ErrorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public UnprocessedUpdateAction() {
  }

  public UnprocessedUpdateAction replicationGroupId(String replicationGroupId) {
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


  public UnprocessedUpdateAction cacheClusterId(String cacheClusterId) {
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


  public UnprocessedUpdateAction serviceUpdateName(String serviceUpdateName) {
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


  public UnprocessedUpdateAction errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType
   * @return errorType
   */
  @javax.annotation.Nullable
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public UnprocessedUpdateAction errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnprocessedUpdateAction unprocessedUpdateAction = (UnprocessedUpdateAction) o;
    return Objects.equals(this.replicationGroupId, unprocessedUpdateAction.replicationGroupId) &&
        Objects.equals(this.cacheClusterId, unprocessedUpdateAction.cacheClusterId) &&
        Objects.equals(this.serviceUpdateName, unprocessedUpdateAction.serviceUpdateName) &&
        Objects.equals(this.errorType, unprocessedUpdateAction.errorType) &&
        Objects.equals(this.errorMessage, unprocessedUpdateAction.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, cacheClusterId, serviceUpdateName, errorType, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnprocessedUpdateAction {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    cacheClusterId: ").append(toIndentedString(cacheClusterId)).append("\n");
    sb.append("    serviceUpdateName: ").append(toIndentedString(serviceUpdateName)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("ErrorType");
    openapiFields.add("ErrorMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UnprocessedUpdateAction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnprocessedUpdateAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnprocessedUpdateAction is not found in the empty JSON string", UnprocessedUpdateAction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnprocessedUpdateAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnprocessedUpdateAction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `ErrorType`
      if (jsonObj.get("ErrorType") != null && !jsonObj.get("ErrorType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ErrorType"));
      }
      // validate the optional field `ErrorMessage`
      if (jsonObj.get("ErrorMessage") != null && !jsonObj.get("ErrorMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ErrorMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnprocessedUpdateAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnprocessedUpdateAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnprocessedUpdateAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnprocessedUpdateAction.class));

       return (TypeAdapter<T>) new TypeAdapter<UnprocessedUpdateAction>() {
           @Override
           public void write(JsonWriter out, UnprocessedUpdateAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnprocessedUpdateAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UnprocessedUpdateAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnprocessedUpdateAction
   * @throws IOException if the JSON string is invalid with respect to UnprocessedUpdateAction
   */
  public static UnprocessedUpdateAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnprocessedUpdateAction.class);
  }

  /**
   * Convert an instance of UnprocessedUpdateAction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

