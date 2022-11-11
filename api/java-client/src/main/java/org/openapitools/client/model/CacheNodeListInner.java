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
import org.openapitools.client.model.CacheNodeEndpoint;

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
 * CacheNodeListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheNodeListInner {
  public static final String SERIALIZED_NAME_CACHE_NODE_ID = "CacheNodeId";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_ID)
  private String cacheNodeId;

  public static final String SERIALIZED_NAME_CACHE_NODE_STATUS = "CacheNodeStatus";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_STATUS)
  private String cacheNodeStatus;

  public static final String SERIALIZED_NAME_CACHE_NODE_CREATE_TIME = "CacheNodeCreateTime";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_CREATE_TIME)
  private OffsetDateTime cacheNodeCreateTime;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private CacheNodeEndpoint endpoint;

  public static final String SERIALIZED_NAME_PARAMETER_GROUP_STATUS = "ParameterGroupStatus";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUP_STATUS)
  private String parameterGroupStatus;

  public static final String SERIALIZED_NAME_SOURCE_CACHE_NODE_ID = "SourceCacheNodeId";
  @SerializedName(SERIALIZED_NAME_SOURCE_CACHE_NODE_ID)
  private String sourceCacheNodeId;

  public static final String SERIALIZED_NAME_CUSTOMER_AVAILABILITY_ZONE = "CustomerAvailabilityZone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_AVAILABILITY_ZONE)
  private String customerAvailabilityZone;

  public static final String SERIALIZED_NAME_CUSTOMER_OUTPOST_ARN = "CustomerOutpostArn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_OUTPOST_ARN)
  private String customerOutpostArn;

  public CacheNodeListInner() {
  }

  public CacheNodeListInner cacheNodeId(String cacheNodeId) {
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


  public CacheNodeListInner cacheNodeStatus(String cacheNodeStatus) {
    this.cacheNodeStatus = cacheNodeStatus;
    return this;
  }

  /**
   * Get cacheNodeStatus
   * @return cacheNodeStatus
   */
  @javax.annotation.Nullable
  public String getCacheNodeStatus() {
    return cacheNodeStatus;
  }

  public void setCacheNodeStatus(String cacheNodeStatus) {
    this.cacheNodeStatus = cacheNodeStatus;
  }


  public CacheNodeListInner cacheNodeCreateTime(OffsetDateTime cacheNodeCreateTime) {
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


  public CacheNodeListInner endpoint(CacheNodeEndpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @javax.annotation.Nullable
  public CacheNodeEndpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(CacheNodeEndpoint endpoint) {
    this.endpoint = endpoint;
  }


  public CacheNodeListInner parameterGroupStatus(String parameterGroupStatus) {
    this.parameterGroupStatus = parameterGroupStatus;
    return this;
  }

  /**
   * Get parameterGroupStatus
   * @return parameterGroupStatus
   */
  @javax.annotation.Nullable
  public String getParameterGroupStatus() {
    return parameterGroupStatus;
  }

  public void setParameterGroupStatus(String parameterGroupStatus) {
    this.parameterGroupStatus = parameterGroupStatus;
  }


  public CacheNodeListInner sourceCacheNodeId(String sourceCacheNodeId) {
    this.sourceCacheNodeId = sourceCacheNodeId;
    return this;
  }

  /**
   * Get sourceCacheNodeId
   * @return sourceCacheNodeId
   */
  @javax.annotation.Nullable
  public String getSourceCacheNodeId() {
    return sourceCacheNodeId;
  }

  public void setSourceCacheNodeId(String sourceCacheNodeId) {
    this.sourceCacheNodeId = sourceCacheNodeId;
  }


  public CacheNodeListInner customerAvailabilityZone(String customerAvailabilityZone) {
    this.customerAvailabilityZone = customerAvailabilityZone;
    return this;
  }

  /**
   * Get customerAvailabilityZone
   * @return customerAvailabilityZone
   */
  @javax.annotation.Nullable
  public String getCustomerAvailabilityZone() {
    return customerAvailabilityZone;
  }

  public void setCustomerAvailabilityZone(String customerAvailabilityZone) {
    this.customerAvailabilityZone = customerAvailabilityZone;
  }


  public CacheNodeListInner customerOutpostArn(String customerOutpostArn) {
    this.customerOutpostArn = customerOutpostArn;
    return this;
  }

  /**
   * Get customerOutpostArn
   * @return customerOutpostArn
   */
  @javax.annotation.Nullable
  public String getCustomerOutpostArn() {
    return customerOutpostArn;
  }

  public void setCustomerOutpostArn(String customerOutpostArn) {
    this.customerOutpostArn = customerOutpostArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheNodeListInner cacheNodeListInner = (CacheNodeListInner) o;
    return Objects.equals(this.cacheNodeId, cacheNodeListInner.cacheNodeId) &&
        Objects.equals(this.cacheNodeStatus, cacheNodeListInner.cacheNodeStatus) &&
        Objects.equals(this.cacheNodeCreateTime, cacheNodeListInner.cacheNodeCreateTime) &&
        Objects.equals(this.endpoint, cacheNodeListInner.endpoint) &&
        Objects.equals(this.parameterGroupStatus, cacheNodeListInner.parameterGroupStatus) &&
        Objects.equals(this.sourceCacheNodeId, cacheNodeListInner.sourceCacheNodeId) &&
        Objects.equals(this.customerAvailabilityZone, cacheNodeListInner.customerAvailabilityZone) &&
        Objects.equals(this.customerOutpostArn, cacheNodeListInner.customerOutpostArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheNodeId, cacheNodeStatus, cacheNodeCreateTime, endpoint, parameterGroupStatus, sourceCacheNodeId, customerAvailabilityZone, customerOutpostArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheNodeListInner {\n");
    sb.append("    cacheNodeId: ").append(toIndentedString(cacheNodeId)).append("\n");
    sb.append("    cacheNodeStatus: ").append(toIndentedString(cacheNodeStatus)).append("\n");
    sb.append("    cacheNodeCreateTime: ").append(toIndentedString(cacheNodeCreateTime)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    parameterGroupStatus: ").append(toIndentedString(parameterGroupStatus)).append("\n");
    sb.append("    sourceCacheNodeId: ").append(toIndentedString(sourceCacheNodeId)).append("\n");
    sb.append("    customerAvailabilityZone: ").append(toIndentedString(customerAvailabilityZone)).append("\n");
    sb.append("    customerOutpostArn: ").append(toIndentedString(customerOutpostArn)).append("\n");
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
    openapiFields.add("CacheNodeStatus");
    openapiFields.add("CacheNodeCreateTime");
    openapiFields.add("Endpoint");
    openapiFields.add("ParameterGroupStatus");
    openapiFields.add("SourceCacheNodeId");
    openapiFields.add("CustomerAvailabilityZone");
    openapiFields.add("CustomerOutpostArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheNodeListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheNodeListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheNodeListInner is not found in the empty JSON string", CacheNodeListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheNodeListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheNodeListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheNodeId`
      if (jsonObj.get("CacheNodeId") != null && !jsonObj.get("CacheNodeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeId"));
      }
      // validate the optional field `CacheNodeStatus`
      if (jsonObj.get("CacheNodeStatus") != null && !jsonObj.get("CacheNodeStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeStatus"));
      }
      // validate the optional field `CacheNodeCreateTime`
      if (jsonObj.get("CacheNodeCreateTime") != null && !jsonObj.get("CacheNodeCreateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CacheNodeCreateTime"));
      }
      // validate the optional field `Endpoint`
      if (jsonObj.get("Endpoint") != null && !jsonObj.get("Endpoint").isJsonNull()) {
        CacheNodeEndpoint.validateJsonElement(jsonObj.get("Endpoint"));
      }
      // validate the optional field `ParameterGroupStatus`
      if (jsonObj.get("ParameterGroupStatus") != null && !jsonObj.get("ParameterGroupStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ParameterGroupStatus"));
      }
      // validate the optional field `SourceCacheNodeId`
      if (jsonObj.get("SourceCacheNodeId") != null && !jsonObj.get("SourceCacheNodeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceCacheNodeId"));
      }
      // validate the optional field `CustomerAvailabilityZone`
      if (jsonObj.get("CustomerAvailabilityZone") != null && !jsonObj.get("CustomerAvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomerAvailabilityZone"));
      }
      // validate the optional field `CustomerOutpostArn`
      if (jsonObj.get("CustomerOutpostArn") != null && !jsonObj.get("CustomerOutpostArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomerOutpostArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheNodeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheNodeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheNodeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheNodeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheNodeListInner>() {
           @Override
           public void write(JsonWriter out, CacheNodeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheNodeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheNodeListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheNodeListInner
   * @throws IOException if the JSON string is invalid with respect to CacheNodeListInner
   */
  public static CacheNodeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheNodeListInner.class);
  }

  /**
   * Convert an instance of CacheNodeListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

