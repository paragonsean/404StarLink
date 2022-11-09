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
 * Represents the input of a &lt;code&gt;DescribeReservedCacheNodes&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeReservedCacheNodesMessage {
  public static final String SERIALIZED_NAME_RESERVED_CACHE_NODE_ID = "ReservedCacheNodeId";
  @SerializedName(SERIALIZED_NAME_RESERVED_CACHE_NODE_ID)
  private String reservedCacheNodeId;

  public static final String SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID = "ReservedCacheNodesOfferingId";
  @SerializedName(SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID)
  private String reservedCacheNodesOfferingId;

  public static final String SERIALIZED_NAME_CACHE_NODE_TYPE = "CacheNodeType";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_TYPE)
  private String cacheNodeType;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "ProductDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_OFFERING_TYPE = "OfferingType";
  @SerializedName(SERIALIZED_NAME_OFFERING_TYPE)
  private String offeringType;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public DescribeReservedCacheNodesMessage() {
  }

  public DescribeReservedCacheNodesMessage reservedCacheNodeId(String reservedCacheNodeId) {
    this.reservedCacheNodeId = reservedCacheNodeId;
    return this;
  }

  /**
   * Get reservedCacheNodeId
   * @return reservedCacheNodeId
   */
  @javax.annotation.Nullable
  public String getReservedCacheNodeId() {
    return reservedCacheNodeId;
  }

  public void setReservedCacheNodeId(String reservedCacheNodeId) {
    this.reservedCacheNodeId = reservedCacheNodeId;
  }


  public DescribeReservedCacheNodesMessage reservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
    this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    return this;
  }

  /**
   * Get reservedCacheNodesOfferingId
   * @return reservedCacheNodesOfferingId
   */
  @javax.annotation.Nullable
  public String getReservedCacheNodesOfferingId() {
    return reservedCacheNodesOfferingId;
  }

  public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
    this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
  }


  public DescribeReservedCacheNodesMessage cacheNodeType(String cacheNodeType) {
    this.cacheNodeType = cacheNodeType;
    return this;
  }

  /**
   * Get cacheNodeType
   * @return cacheNodeType
   */
  @javax.annotation.Nullable
  public String getCacheNodeType() {
    return cacheNodeType;
  }

  public void setCacheNodeType(String cacheNodeType) {
    this.cacheNodeType = cacheNodeType;
  }


  public DescribeReservedCacheNodesMessage duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public DescribeReservedCacheNodesMessage productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
   */
  @javax.annotation.Nullable
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public DescribeReservedCacheNodesMessage offeringType(String offeringType) {
    this.offeringType = offeringType;
    return this;
  }

  /**
   * Get offeringType
   * @return offeringType
   */
  @javax.annotation.Nullable
  public String getOfferingType() {
    return offeringType;
  }

  public void setOfferingType(String offeringType) {
    this.offeringType = offeringType;
  }


  public DescribeReservedCacheNodesMessage maxRecords(Integer maxRecords) {
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


  public DescribeReservedCacheNodesMessage marker(String marker) {
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
    DescribeReservedCacheNodesMessage describeReservedCacheNodesMessage = (DescribeReservedCacheNodesMessage) o;
    return Objects.equals(this.reservedCacheNodeId, describeReservedCacheNodesMessage.reservedCacheNodeId) &&
        Objects.equals(this.reservedCacheNodesOfferingId, describeReservedCacheNodesMessage.reservedCacheNodesOfferingId) &&
        Objects.equals(this.cacheNodeType, describeReservedCacheNodesMessage.cacheNodeType) &&
        Objects.equals(this.duration, describeReservedCacheNodesMessage.duration) &&
        Objects.equals(this.productDescription, describeReservedCacheNodesMessage.productDescription) &&
        Objects.equals(this.offeringType, describeReservedCacheNodesMessage.offeringType) &&
        Objects.equals(this.maxRecords, describeReservedCacheNodesMessage.maxRecords) &&
        Objects.equals(this.marker, describeReservedCacheNodesMessage.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedCacheNodeId, reservedCacheNodesOfferingId, cacheNodeType, duration, productDescription, offeringType, maxRecords, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeReservedCacheNodesMessage {\n");
    sb.append("    reservedCacheNodeId: ").append(toIndentedString(reservedCacheNodeId)).append("\n");
    sb.append("    reservedCacheNodesOfferingId: ").append(toIndentedString(reservedCacheNodesOfferingId)).append("\n");
    sb.append("    cacheNodeType: ").append(toIndentedString(cacheNodeType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    offeringType: ").append(toIndentedString(offeringType)).append("\n");
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
    openapiFields.add("ReservedCacheNodeId");
    openapiFields.add("ReservedCacheNodesOfferingId");
    openapiFields.add("CacheNodeType");
    openapiFields.add("Duration");
    openapiFields.add("ProductDescription");
    openapiFields.add("OfferingType");
    openapiFields.add("MaxRecords");
    openapiFields.add("Marker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeReservedCacheNodesMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeReservedCacheNodesMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeReservedCacheNodesMessage is not found in the empty JSON string", DescribeReservedCacheNodesMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeReservedCacheNodesMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeReservedCacheNodesMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReservedCacheNodeId`
      if (jsonObj.get("ReservedCacheNodeId") != null && !jsonObj.get("ReservedCacheNodeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReservedCacheNodeId"));
      }
      // validate the optional field `ReservedCacheNodesOfferingId`
      if (jsonObj.get("ReservedCacheNodesOfferingId") != null && !jsonObj.get("ReservedCacheNodesOfferingId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReservedCacheNodesOfferingId"));
      }
      // validate the optional field `CacheNodeType`
      if (jsonObj.get("CacheNodeType") != null && !jsonObj.get("CacheNodeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeType"));
      }
      // validate the optional field `Duration`
      if (jsonObj.get("Duration") != null && !jsonObj.get("Duration").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Duration"));
      }
      // validate the optional field `ProductDescription`
      if (jsonObj.get("ProductDescription") != null && !jsonObj.get("ProductDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductDescription"));
      }
      // validate the optional field `OfferingType`
      if (jsonObj.get("OfferingType") != null && !jsonObj.get("OfferingType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OfferingType"));
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
       if (!DescribeReservedCacheNodesMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeReservedCacheNodesMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeReservedCacheNodesMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeReservedCacheNodesMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeReservedCacheNodesMessage>() {
           @Override
           public void write(JsonWriter out, DescribeReservedCacheNodesMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeReservedCacheNodesMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeReservedCacheNodesMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeReservedCacheNodesMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeReservedCacheNodesMessage
   */
  public static DescribeReservedCacheNodesMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeReservedCacheNodesMessage.class);
  }

  /**
   * Convert an instance of DescribeReservedCacheNodesMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

