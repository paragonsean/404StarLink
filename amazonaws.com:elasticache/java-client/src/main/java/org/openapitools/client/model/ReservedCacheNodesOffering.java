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
 * Describes all of the attributes of a reserved cache node offering.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReservedCacheNodesOffering {
  public static final String SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID = "ReservedCacheNodesOfferingId";
  @SerializedName(SERIALIZED_NAME_RESERVED_CACHE_NODES_OFFERING_ID)
  private String reservedCacheNodesOfferingId;

  public static final String SERIALIZED_NAME_CACHE_NODE_TYPE = "CacheNodeType";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_TYPE)
  private String cacheNodeType;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "FixedPrice";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  private Double fixedPrice;

  public static final String SERIALIZED_NAME_USAGE_PRICE = "UsagePrice";
  @SerializedName(SERIALIZED_NAME_USAGE_PRICE)
  private Double usagePrice;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "ProductDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_OFFERING_TYPE = "OfferingType";
  @SerializedName(SERIALIZED_NAME_OFFERING_TYPE)
  private String offeringType;

  public static final String SERIALIZED_NAME_RECURRING_CHARGES = "RecurringCharges";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGES)
  private List recurringCharges;

  public ReservedCacheNodesOffering() {
  }

  public ReservedCacheNodesOffering reservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
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


  public ReservedCacheNodesOffering cacheNodeType(String cacheNodeType) {
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


  public ReservedCacheNodesOffering duration(Integer duration) {
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


  public ReservedCacheNodesOffering fixedPrice(Double fixedPrice) {
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


  public ReservedCacheNodesOffering usagePrice(Double usagePrice) {
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


  public ReservedCacheNodesOffering productDescription(String productDescription) {
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


  public ReservedCacheNodesOffering offeringType(String offeringType) {
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


  public ReservedCacheNodesOffering recurringCharges(List recurringCharges) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedCacheNodesOffering reservedCacheNodesOffering = (ReservedCacheNodesOffering) o;
    return Objects.equals(this.reservedCacheNodesOfferingId, reservedCacheNodesOffering.reservedCacheNodesOfferingId) &&
        Objects.equals(this.cacheNodeType, reservedCacheNodesOffering.cacheNodeType) &&
        Objects.equals(this.duration, reservedCacheNodesOffering.duration) &&
        Objects.equals(this.fixedPrice, reservedCacheNodesOffering.fixedPrice) &&
        Objects.equals(this.usagePrice, reservedCacheNodesOffering.usagePrice) &&
        Objects.equals(this.productDescription, reservedCacheNodesOffering.productDescription) &&
        Objects.equals(this.offeringType, reservedCacheNodesOffering.offeringType) &&
        Objects.equals(this.recurringCharges, reservedCacheNodesOffering.recurringCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedCacheNodesOfferingId, cacheNodeType, duration, fixedPrice, usagePrice, productDescription, offeringType, recurringCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedCacheNodesOffering {\n");
    sb.append("    reservedCacheNodesOfferingId: ").append(toIndentedString(reservedCacheNodesOfferingId)).append("\n");
    sb.append("    cacheNodeType: ").append(toIndentedString(cacheNodeType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    usagePrice: ").append(toIndentedString(usagePrice)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    offeringType: ").append(toIndentedString(offeringType)).append("\n");
    sb.append("    recurringCharges: ").append(toIndentedString(recurringCharges)).append("\n");
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
    openapiFields.add("ReservedCacheNodesOfferingId");
    openapiFields.add("CacheNodeType");
    openapiFields.add("Duration");
    openapiFields.add("FixedPrice");
    openapiFields.add("UsagePrice");
    openapiFields.add("ProductDescription");
    openapiFields.add("OfferingType");
    openapiFields.add("RecurringCharges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReservedCacheNodesOffering
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReservedCacheNodesOffering.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReservedCacheNodesOffering is not found in the empty JSON string", ReservedCacheNodesOffering.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReservedCacheNodesOffering.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReservedCacheNodesOffering` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the optional field `ProductDescription`
      if (jsonObj.get("ProductDescription") != null && !jsonObj.get("ProductDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ProductDescription"));
      }
      // validate the optional field `OfferingType`
      if (jsonObj.get("OfferingType") != null && !jsonObj.get("OfferingType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OfferingType"));
      }
      // validate the optional field `RecurringCharges`
      if (jsonObj.get("RecurringCharges") != null && !jsonObj.get("RecurringCharges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("RecurringCharges"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReservedCacheNodesOffering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReservedCacheNodesOffering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReservedCacheNodesOffering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReservedCacheNodesOffering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReservedCacheNodesOffering>() {
           @Override
           public void write(JsonWriter out, ReservedCacheNodesOffering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReservedCacheNodesOffering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReservedCacheNodesOffering given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReservedCacheNodesOffering
   * @throws IOException if the JSON string is invalid with respect to ReservedCacheNodesOffering
   */
  public static ReservedCacheNodesOffering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReservedCacheNodesOffering.class);
  }

  /**
   * Convert an instance of ReservedCacheNodesOffering to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

