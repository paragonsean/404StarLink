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
 * &lt;p&gt;Represents an individual cache node within a cluster. Each cache node runs its own instance of the cluster&#39;s protocol-compliant caching software - either Memcached or Redis.&lt;/p&gt; &lt;p&gt;The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;General purpose:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Current generation: &lt;/p&gt; &lt;p&gt; &lt;b&gt;M6g node types&lt;/b&gt; (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward): &lt;code&gt;cache.m6g.large&lt;/code&gt;, &lt;code&gt;cache.m6g.xlarge&lt;/code&gt;, &lt;code&gt;cache.m6g.2xlarge&lt;/code&gt;, &lt;code&gt;cache.m6g.4xlarge&lt;/code&gt;, &lt;code&gt;cache.m6g.8xlarge&lt;/code&gt;, &lt;code&gt;cache.m6g.12xlarge&lt;/code&gt;, &lt;code&gt;cache.m6g.16xlarge&lt;/code&gt; &lt;/p&gt; &lt;note&gt; &lt;p&gt;For region availability, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion\&quot;&gt;Supported Node Types&lt;/a&gt; &lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;M5 node types:&lt;/b&gt; &lt;code&gt;cache.m5.large&lt;/code&gt;, &lt;code&gt;cache.m5.xlarge&lt;/code&gt;, &lt;code&gt;cache.m5.2xlarge&lt;/code&gt;, &lt;code&gt;cache.m5.4xlarge&lt;/code&gt;, &lt;code&gt;cache.m5.12xlarge&lt;/code&gt;, &lt;code&gt;cache.m5.24xlarge&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;M4 node types:&lt;/b&gt; &lt;code&gt;cache.m4.large&lt;/code&gt;, &lt;code&gt;cache.m4.xlarge&lt;/code&gt;, &lt;code&gt;cache.m4.2xlarge&lt;/code&gt;, &lt;code&gt;cache.m4.4xlarge&lt;/code&gt;, &lt;code&gt;cache.m4.10xlarge&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;T4g node types&lt;/b&gt; (available only for Redis engine version 5.0.6 onward and Memcached engine version 1.5.16 onward): &lt;code&gt;cache.t4g.micro&lt;/code&gt;, &lt;code&gt;cache.t4g.small&lt;/code&gt;, &lt;code&gt;cache.t4g.medium&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;T3 node types:&lt;/b&gt; &lt;code&gt;cache.t3.micro&lt;/code&gt;, &lt;code&gt;cache.t3.small&lt;/code&gt;, &lt;code&gt;cache.t3.medium&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;T2 node types:&lt;/b&gt; &lt;code&gt;cache.t2.micro&lt;/code&gt;, &lt;code&gt;cache.t2.small&lt;/code&gt;, &lt;code&gt;cache.t2.medium&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)&lt;/p&gt; &lt;p&gt; &lt;b&gt;T1 node types:&lt;/b&gt; &lt;code&gt;cache.t1.micro&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;M1 node types:&lt;/b&gt; &lt;code&gt;cache.m1.small&lt;/code&gt;, &lt;code&gt;cache.m1.medium&lt;/code&gt;, &lt;code&gt;cache.m1.large&lt;/code&gt;, &lt;code&gt;cache.m1.xlarge&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;M3 node types:&lt;/b&gt; &lt;code&gt;cache.m3.medium&lt;/code&gt;, &lt;code&gt;cache.m3.large&lt;/code&gt;, &lt;code&gt;cache.m3.xlarge&lt;/code&gt;, &lt;code&gt;cache.m3.2xlarge&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Compute optimized:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)&lt;/p&gt; &lt;p&gt; &lt;b&gt;C1 node types:&lt;/b&gt; &lt;code&gt;cache.c1.xlarge&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Memory optimized:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Current generation: &lt;/p&gt; &lt;p&gt; &lt;b&gt;R6g node types&lt;/b&gt; (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).&lt;/p&gt; &lt;p&gt; &lt;code&gt;cache.r6g.large&lt;/code&gt;, &lt;code&gt;cache.r6g.xlarge&lt;/code&gt;, &lt;code&gt;cache.r6g.2xlarge&lt;/code&gt;, &lt;code&gt;cache.r6g.4xlarge&lt;/code&gt;, &lt;code&gt;cache.r6g.8xlarge&lt;/code&gt;, &lt;code&gt;cache.r6g.12xlarge&lt;/code&gt;, &lt;code&gt;cache.r6g.16xlarge&lt;/code&gt; &lt;/p&gt; &lt;note&gt; &lt;p&gt;For region availability, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion\&quot;&gt;Supported Node Types&lt;/a&gt; &lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;R5 node types:&lt;/b&gt; &lt;code&gt;cache.r5.large&lt;/code&gt;, &lt;code&gt;cache.r5.xlarge&lt;/code&gt;, &lt;code&gt;cache.r5.2xlarge&lt;/code&gt;, &lt;code&gt;cache.r5.4xlarge&lt;/code&gt;, &lt;code&gt;cache.r5.12xlarge&lt;/code&gt;, &lt;code&gt;cache.r5.24xlarge&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;R4 node types:&lt;/b&gt; &lt;code&gt;cache.r4.large&lt;/code&gt;, &lt;code&gt;cache.r4.xlarge&lt;/code&gt;, &lt;code&gt;cache.r4.2xlarge&lt;/code&gt;, &lt;code&gt;cache.r4.4xlarge&lt;/code&gt;, &lt;code&gt;cache.r4.8xlarge&lt;/code&gt;, &lt;code&gt;cache.r4.16xlarge&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Previous generation: (not recommended. Existing clusters are still supported but creation of new clusters is not supported for these types.)&lt;/p&gt; &lt;p&gt; &lt;b&gt;M2 node types:&lt;/b&gt; &lt;code&gt;cache.m2.xlarge&lt;/code&gt;, &lt;code&gt;cache.m2.2xlarge&lt;/code&gt;, &lt;code&gt;cache.m2.4xlarge&lt;/code&gt; &lt;/p&gt; &lt;p&gt; &lt;b&gt;R3 node types:&lt;/b&gt; &lt;code&gt;cache.r3.large&lt;/code&gt;, &lt;code&gt;cache.r3.xlarge&lt;/code&gt;, &lt;code&gt;cache.r3.2xlarge&lt;/code&gt;, &lt;code&gt;cache.r3.4xlarge&lt;/code&gt;, &lt;code&gt;cache.r3.8xlarge&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Additional node type info&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;All current generation instance types are created in Amazon VPC by default.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Redis append-only files (AOF) are not supported for T1 or T2 instances.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Redis Multi-AZ with automatic failover is not supported on T1 instances.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Redis configuration variables &lt;code&gt;appendonly&lt;/code&gt; and &lt;code&gt;appendfsync&lt;/code&gt; are not supported on Redis version 2.8.22 and later.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheNode {
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

  public CacheNode() {
  }

  public CacheNode cacheNodeId(String cacheNodeId) {
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


  public CacheNode cacheNodeStatus(String cacheNodeStatus) {
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


  public CacheNode cacheNodeCreateTime(OffsetDateTime cacheNodeCreateTime) {
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


  public CacheNode endpoint(CacheNodeEndpoint endpoint) {
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


  public CacheNode parameterGroupStatus(String parameterGroupStatus) {
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


  public CacheNode sourceCacheNodeId(String sourceCacheNodeId) {
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


  public CacheNode customerAvailabilityZone(String customerAvailabilityZone) {
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


  public CacheNode customerOutpostArn(String customerOutpostArn) {
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
    CacheNode cacheNode = (CacheNode) o;
    return Objects.equals(this.cacheNodeId, cacheNode.cacheNodeId) &&
        Objects.equals(this.cacheNodeStatus, cacheNode.cacheNodeStatus) &&
        Objects.equals(this.cacheNodeCreateTime, cacheNode.cacheNodeCreateTime) &&
        Objects.equals(this.endpoint, cacheNode.endpoint) &&
        Objects.equals(this.parameterGroupStatus, cacheNode.parameterGroupStatus) &&
        Objects.equals(this.sourceCacheNodeId, cacheNode.sourceCacheNodeId) &&
        Objects.equals(this.customerAvailabilityZone, cacheNode.customerAvailabilityZone) &&
        Objects.equals(this.customerOutpostArn, cacheNode.customerOutpostArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheNodeId, cacheNodeStatus, cacheNodeCreateTime, endpoint, parameterGroupStatus, sourceCacheNodeId, customerAvailabilityZone, customerOutpostArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheNode {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CacheNode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheNode is not found in the empty JSON string", CacheNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!CacheNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheNode.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheNode>() {
           @Override
           public void write(JsonWriter out, CacheNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheNode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheNode
   * @throws IOException if the JSON string is invalid with respect to CacheNode
   */
  public static CacheNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheNode.class);
  }

  /**
   * Convert an instance of CacheNode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

