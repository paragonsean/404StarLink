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
 * Represents the output of a &lt;code&gt;PurchaseReservedCacheNodesOffering&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReservedCacheNode {
  public static final String SERIALIZED_NAME_RESERVED_CACHE_NODE_ID = "ReservedCacheNodeId";
  @SerializedName(SERIALIZED_NAME_RESERVED_CACHE_NODE_ID)
  private String reservedCacheNodeId;

  public static final String SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID = "ReservedCacheNodesOfferingId";
  @SerializedName(SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID)
  private String reservedCacheNodesOfferingId;

  public static final String SERIALIZED_NAME_CACHE_NODE_TYPE = "CacheNodeType";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_TYPE)
  private String cacheNodeType;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "FixedPrice";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  private Double fixedPrice;

  public static final String SERIALIZED_NAME_USAGE_PRICE = "UsagePrice";
  @SerializedName(SERIALIZED_NAME_USAGE_PRICE)
  private Double usagePrice;

  public static final String SERIALIZED_NAME_CACHE_NODE_COUNT = "CacheNodeCount";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_COUNT)
  private Integer cacheNodeCount;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "ProductDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_OFFERING_TYPE = "OfferingType";
  @SerializedName(SERIALIZED_NAME_OFFERING_TYPE)
  private String offeringType;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_RECURRING_CHARGES = "RecurringCharges";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGES)
  private List recurringCharges;

  public static final String SERIALIZED_NAME_RESERVATION_A_R_N = "ReservationARN";
  @SerializedName(SERIALIZED_NAME_RESERVATION_A_R_N)
  private String reservationARN;

  public ReservedCacheNode() {
  }

  public ReservedCacheNode reservedCacheNodeId(String reservedCacheNodeId) {
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


  public ReservedCacheNode reservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
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


  public ReservedCacheNode cacheNodeType(String cacheNodeType) {
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


  public ReservedCacheNode startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ReservedCacheNode duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ReservedCacheNode fixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

  /**
   * Get fixedPrice
   * @return fixedPrice
   */
  @javax.annotation.Nullable
  public Double getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
  }


  public ReservedCacheNode usagePrice(Double usagePrice) {
    this.usagePrice = usagePrice;
    return this;
  }

  /**
   * Get usagePrice
   * @return usagePrice
   */
  @javax.annotation.Nullable
  public Double getUsagePrice() {
    return usagePrice;
  }

  public void setUsagePrice(Double usagePrice) {
    this.usagePrice = usagePrice;
  }


  public ReservedCacheNode cacheNodeCount(Integer cacheNodeCount) {
    this.cacheNodeCount = cacheNodeCount;
    return this;
  }

  /**
   * Get cacheNodeCount
   * @return cacheNodeCount
   */
  @javax.annotation.Nullable
  public Integer getCacheNodeCount() {
    return cacheNodeCount;
  }

  public void setCacheNodeCount(Integer cacheNodeCount) {
    this.cacheNodeCount = cacheNodeCount;
  }


  public ReservedCacheNode productDescription(String productDescription) {
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


  public ReservedCacheNode offeringType(String offeringType) {
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


  public ReservedCacheNode state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public ReservedCacheNode recurringCharges(List recurringCharges) {
    this.recurringCharges = recurringCharges;
    return this;
  }

  /**
   * Get recurringCharges
   * @return recurringCharges
   */
  @javax.annotation.Nullable
  public List getRecurringCharges() {
    return recurringCharges;
  }

  public void setRecurringCharges(List recurringCharges) {
    this.recurringCharges = recurringCharges;
  }


  public ReservedCacheNode reservationARN(String reservationARN) {
    this.reservationARN = reservationARN;
    return this;
  }

  /**
   * Get reservationARN
   * @return reservationARN
   */
  @javax.annotation.Nullable
  public String getReservationARN() {
    return reservationARN;
  }

  public void setReservationARN(String reservationARN) {
    this.reservationARN = reservationARN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedCacheNode reservedCacheNode = (ReservedCacheNode) o;
    return Objects.equals(this.reservedCacheNodeId, reservedCacheNode.reservedCacheNodeId) &&
        Objects.equals(this.reservedCacheNodesOfferingId, reservedCacheNode.reservedCacheNodesOfferingId) &&
        Objects.equals(this.cacheNodeType, reservedCacheNode.cacheNodeType) &&
        Objects.equals(this.startTime, reservedCacheNode.startTime) &&
        Objects.equals(this.duration, reservedCacheNode.duration) &&
        Objects.equals(this.fixedPrice, reservedCacheNode.fixedPrice) &&
        Objects.equals(this.usagePrice, reservedCacheNode.usagePrice) &&
        Objects.equals(this.cacheNodeCount, reservedCacheNode.cacheNodeCount) &&
        Objects.equals(this.productDescription, reservedCacheNode.productDescription) &&
        Objects.equals(this.offeringType, reservedCacheNode.offeringType) &&
        Objects.equals(this.state, reservedCacheNode.state) &&
        Objects.equals(this.recurringCharges, reservedCacheNode.recurringCharges) &&
        Objects.equals(this.reservationARN, reservedCacheNode.reservationARN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedCacheNodeId, reservedCacheNodesOfferingId, cacheNodeType, startTime, duration, fixedPrice, usagePrice, cacheNodeCount, productDescription, offeringType, state, recurringCharges, reservationARN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedCacheNode {\n");
    sb.append("    reservedCacheNodeId: ").append(toIndentedString(reservedCacheNodeId)).append("\n");
    sb.append("    reservedCacheNodesOfferingId: ").append(toIndentedString(reservedCacheNodesOfferingId)).append("\n");
    sb.append("    cacheNodeType: ").append(toIndentedString(cacheNodeType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    usagePrice: ").append(toIndentedString(usagePrice)).append("\n");
    sb.append("    cacheNodeCount: ").append(toIndentedString(cacheNodeCount)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    offeringType: ").append(toIndentedString(offeringType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recurringCharges: ").append(toIndentedString(recurringCharges)).append("\n");
    sb.append("    reservationARN: ").append(toIndentedString(reservationARN)).append("\n");
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
    openapiFields.add("StartTime");
    openapiFields.add("Duration");
    openapiFields.add("FixedPrice");
    openapiFields.add("UsagePrice");
    openapiFields.add("CacheNodeCount");
    openapiFields.add("ProductDescription");
    openapiFields.add("OfferingType");
    openapiFields.add("State");
    openapiFields.add("RecurringCharges");
    openapiFields.add("ReservationARN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReservedCacheNode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReservedCacheNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReservedCacheNode is not found in the empty JSON string", ReservedCacheNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReservedCacheNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReservedCacheNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `StartTime`
      if (jsonObj.get("StartTime") != null && !jsonObj.get("StartTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("StartTime"));
      }
      // validate the optional field `Duration`
      if (jsonObj.get("Duration") != null && !jsonObj.get("Duration").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Duration"));
      }
      // validate the optional field `FixedPrice`
      if (jsonObj.get("FixedPrice") != null && !jsonObj.get("FixedPrice").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("FixedPrice"));
      }
      // validate the optional field `UsagePrice`
      if (jsonObj.get("UsagePrice") != null && !jsonObj.get("UsagePrice").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("UsagePrice"));
      }
      // validate the optional field `CacheNodeCount`
      if (jsonObj.get("CacheNodeCount") != null && !jsonObj.get("CacheNodeCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CacheNodeCount"));
      }
      // validate the optional field `ProductDescription`
      if (jsonObj.get("ProductDescription") != null && !jsonObj.get("ProductDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductDescription"));
      }
      // validate the optional field `OfferingType`
      if (jsonObj.get("OfferingType") != null && !jsonObj.get("OfferingType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OfferingType"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `RecurringCharges`
      if (jsonObj.get("RecurringCharges") != null && !jsonObj.get("RecurringCharges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RecurringCharges"));
      }
      // validate the optional field `ReservationARN`
      if (jsonObj.get("ReservationARN") != null && !jsonObj.get("ReservationARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReservationARN"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReservedCacheNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReservedCacheNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReservedCacheNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReservedCacheNode.class));

       return (TypeAdapter<T>) new TypeAdapter<ReservedCacheNode>() {
           @Override
           public void write(JsonWriter out, ReservedCacheNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReservedCacheNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReservedCacheNode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReservedCacheNode
   * @throws IOException if the JSON string is invalid with respect to ReservedCacheNode
   */
  public static ReservedCacheNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReservedCacheNode.class);
  }

  /**
   * Convert an instance of ReservedCacheNode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

