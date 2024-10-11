/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
 * ApiCoreDtoTopsTopItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:16.082688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoTopsTopItem {
  public static final String SERIALIZED_NAME_ENTITY_DATA = "entityData";
  @SerializedName(SERIALIZED_NAME_ENTITY_DATA)
  private Object entityData;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_HIT_DATE = "lastHitDate";
  @SerializedName(SERIALIZED_NAME_LAST_HIT_DATE)
  private String lastHitDate;

  public static final String SERIALIZED_NAME_SPIDER_CLICKS = "spiderClicks";
  @SerializedName(SERIALIZED_NAME_SPIDER_CLICKS)
  private Long spiderClicks;

  public static final String SERIALIZED_NAME_SPIDER_HITS = "spiderHits";
  @SerializedName(SERIALIZED_NAME_SPIDER_HITS)
  private Long spiderHits;

  public static final String SERIALIZED_NAME_SPIDER_VIEWS = "spiderViews";
  @SerializedName(SERIALIZED_NAME_SPIDER_VIEWS)
  private Long spiderViews;

  public static final String SERIALIZED_NAME_TOTAL_CLICKS = "totalClicks";
  @SerializedName(SERIALIZED_NAME_TOTAL_CLICKS)
  private Long totalClicks;

  public static final String SERIALIZED_NAME_TOTAL_COMMISSIONS_COST = "totalCommissionsCost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COMMISSIONS_COST)
  private Double totalCommissionsCost;

  public static final String SERIALIZED_NAME_TOTAL_CONVERSIONS = "totalConversions";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONVERSIONS)
  private Long totalConversions;

  public static final String SERIALIZED_NAME_TOTAL_CONVERSIONS_COST = "totalConversionsCost";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONVERSIONS_COST)
  private Double totalConversionsCost;

  public static final String SERIALIZED_NAME_TOTAL_CONVERSIONS_VALUE = "totalConversionsValue";
  @SerializedName(SERIALIZED_NAME_TOTAL_CONVERSIONS_VALUE)
  private Double totalConversionsValue;

  public static final String SERIALIZED_NAME_TOTAL_HITS = "totalHits";
  @SerializedName(SERIALIZED_NAME_TOTAL_HITS)
  private Long totalHits;

  public static final String SERIALIZED_NAME_TOTAL_VIEWS = "totalViews";
  @SerializedName(SERIALIZED_NAME_TOTAL_VIEWS)
  private Long totalViews;

  public static final String SERIALIZED_NAME_UNIQUE_CLICKS = "uniqueClicks";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CLICKS)
  private Long uniqueClicks;

  public static final String SERIALIZED_NAME_UNIQUE_HITS = "uniqueHits";
  @SerializedName(SERIALIZED_NAME_UNIQUE_HITS)
  private Long uniqueHits;

  public static final String SERIALIZED_NAME_UNIQUE_VIEWS = "uniqueViews";
  @SerializedName(SERIALIZED_NAME_UNIQUE_VIEWS)
  private Long uniqueViews;

  public ApiCoreDtoTopsTopItem() {
  }

  public ApiCoreDtoTopsTopItem entityData(Object entityData) {
    this.entityData = entityData;
    return this;
  }

  /**
   * Get entityData
   * @return entityData
   */
  @javax.annotation.Nullable
  public Object getEntityData() {
    return entityData;
  }

  public void setEntityData(Object entityData) {
    this.entityData = entityData;
  }


  public ApiCoreDtoTopsTopItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ApiCoreDtoTopsTopItem lastHitDate(String lastHitDate) {
    this.lastHitDate = lastHitDate;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return lastHitDate
   */
  @javax.annotation.Nullable
  public String getLastHitDate() {
    return lastHitDate;
  }

  public void setLastHitDate(String lastHitDate) {
    this.lastHitDate = lastHitDate;
  }


  public ApiCoreDtoTopsTopItem spiderClicks(Long spiderClicks) {
    this.spiderClicks = spiderClicks;
    return this;
  }

  /**
   * Get spiderClicks
   * @return spiderClicks
   */
  @javax.annotation.Nullable
  public Long getSpiderClicks() {
    return spiderClicks;
  }

  public void setSpiderClicks(Long spiderClicks) {
    this.spiderClicks = spiderClicks;
  }


  public ApiCoreDtoTopsTopItem spiderHits(Long spiderHits) {
    this.spiderHits = spiderHits;
    return this;
  }

  /**
   * Get spiderHits
   * @return spiderHits
   */
  @javax.annotation.Nullable
  public Long getSpiderHits() {
    return spiderHits;
  }

  public void setSpiderHits(Long spiderHits) {
    this.spiderHits = spiderHits;
  }


  public ApiCoreDtoTopsTopItem spiderViews(Long spiderViews) {
    this.spiderViews = spiderViews;
    return this;
  }

  /**
   * Get spiderViews
   * @return spiderViews
   */
  @javax.annotation.Nullable
  public Long getSpiderViews() {
    return spiderViews;
  }

  public void setSpiderViews(Long spiderViews) {
    this.spiderViews = spiderViews;
  }


  public ApiCoreDtoTopsTopItem totalClicks(Long totalClicks) {
    this.totalClicks = totalClicks;
    return this;
  }

  /**
   * Get totalClicks
   * @return totalClicks
   */
  @javax.annotation.Nullable
  public Long getTotalClicks() {
    return totalClicks;
  }

  public void setTotalClicks(Long totalClicks) {
    this.totalClicks = totalClicks;
  }


  public ApiCoreDtoTopsTopItem totalCommissionsCost(Double totalCommissionsCost) {
    this.totalCommissionsCost = totalCommissionsCost;
    return this;
  }

  /**
   * Get totalCommissionsCost
   * @return totalCommissionsCost
   */
  @javax.annotation.Nullable
  public Double getTotalCommissionsCost() {
    return totalCommissionsCost;
  }

  public void setTotalCommissionsCost(Double totalCommissionsCost) {
    this.totalCommissionsCost = totalCommissionsCost;
  }


  public ApiCoreDtoTopsTopItem totalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
    return this;
  }

  /**
   * Get totalConversions
   * @return totalConversions
   */
  @javax.annotation.Nullable
  public Long getTotalConversions() {
    return totalConversions;
  }

  public void setTotalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
  }


  public ApiCoreDtoTopsTopItem totalConversionsCost(Double totalConversionsCost) {
    this.totalConversionsCost = totalConversionsCost;
    return this;
  }

  /**
   * Get totalConversionsCost
   * @return totalConversionsCost
   */
  @javax.annotation.Nullable
  public Double getTotalConversionsCost() {
    return totalConversionsCost;
  }

  public void setTotalConversionsCost(Double totalConversionsCost) {
    this.totalConversionsCost = totalConversionsCost;
  }


  public ApiCoreDtoTopsTopItem totalConversionsValue(Double totalConversionsValue) {
    this.totalConversionsValue = totalConversionsValue;
    return this;
  }

  /**
   * Get totalConversionsValue
   * @return totalConversionsValue
   */
  @javax.annotation.Nullable
  public Double getTotalConversionsValue() {
    return totalConversionsValue;
  }

  public void setTotalConversionsValue(Double totalConversionsValue) {
    this.totalConversionsValue = totalConversionsValue;
  }


  public ApiCoreDtoTopsTopItem totalHits(Long totalHits) {
    this.totalHits = totalHits;
    return this;
  }

  /**
   * Get totalHits
   * @return totalHits
   */
  @javax.annotation.Nullable
  public Long getTotalHits() {
    return totalHits;
  }

  public void setTotalHits(Long totalHits) {
    this.totalHits = totalHits;
  }


  public ApiCoreDtoTopsTopItem totalViews(Long totalViews) {
    this.totalViews = totalViews;
    return this;
  }

  /**
   * Get totalViews
   * @return totalViews
   */
  @javax.annotation.Nullable
  public Long getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(Long totalViews) {
    this.totalViews = totalViews;
  }


  public ApiCoreDtoTopsTopItem uniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
    return this;
  }

  /**
   * Get uniqueClicks
   * @return uniqueClicks
   */
  @javax.annotation.Nullable
  public Long getUniqueClicks() {
    return uniqueClicks;
  }

  public void setUniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }


  public ApiCoreDtoTopsTopItem uniqueHits(Long uniqueHits) {
    this.uniqueHits = uniqueHits;
    return this;
  }

  /**
   * Get uniqueHits
   * @return uniqueHits
   */
  @javax.annotation.Nullable
  public Long getUniqueHits() {
    return uniqueHits;
  }

  public void setUniqueHits(Long uniqueHits) {
    this.uniqueHits = uniqueHits;
  }


  public ApiCoreDtoTopsTopItem uniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
    return this;
  }

  /**
   * Get uniqueViews
   * @return uniqueViews
   */
  @javax.annotation.Nullable
  public Long getUniqueViews() {
    return uniqueViews;
  }

  public void setUniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoTopsTopItem apiCoreDtoTopsTopItem = (ApiCoreDtoTopsTopItem) o;
    return Objects.equals(this.entityData, apiCoreDtoTopsTopItem.entityData) &&
        Objects.equals(this.id, apiCoreDtoTopsTopItem.id) &&
        Objects.equals(this.lastHitDate, apiCoreDtoTopsTopItem.lastHitDate) &&
        Objects.equals(this.spiderClicks, apiCoreDtoTopsTopItem.spiderClicks) &&
        Objects.equals(this.spiderHits, apiCoreDtoTopsTopItem.spiderHits) &&
        Objects.equals(this.spiderViews, apiCoreDtoTopsTopItem.spiderViews) &&
        Objects.equals(this.totalClicks, apiCoreDtoTopsTopItem.totalClicks) &&
        Objects.equals(this.totalCommissionsCost, apiCoreDtoTopsTopItem.totalCommissionsCost) &&
        Objects.equals(this.totalConversions, apiCoreDtoTopsTopItem.totalConversions) &&
        Objects.equals(this.totalConversionsCost, apiCoreDtoTopsTopItem.totalConversionsCost) &&
        Objects.equals(this.totalConversionsValue, apiCoreDtoTopsTopItem.totalConversionsValue) &&
        Objects.equals(this.totalHits, apiCoreDtoTopsTopItem.totalHits) &&
        Objects.equals(this.totalViews, apiCoreDtoTopsTopItem.totalViews) &&
        Objects.equals(this.uniqueClicks, apiCoreDtoTopsTopItem.uniqueClicks) &&
        Objects.equals(this.uniqueHits, apiCoreDtoTopsTopItem.uniqueHits) &&
        Objects.equals(this.uniqueViews, apiCoreDtoTopsTopItem.uniqueViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityData, id, lastHitDate, spiderClicks, spiderHits, spiderViews, totalClicks, totalCommissionsCost, totalConversions, totalConversionsCost, totalConversionsValue, totalHits, totalViews, uniqueClicks, uniqueHits, uniqueViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoTopsTopItem {\n");
    sb.append("    entityData: ").append(toIndentedString(entityData)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastHitDate: ").append(toIndentedString(lastHitDate)).append("\n");
    sb.append("    spiderClicks: ").append(toIndentedString(spiderClicks)).append("\n");
    sb.append("    spiderHits: ").append(toIndentedString(spiderHits)).append("\n");
    sb.append("    spiderViews: ").append(toIndentedString(spiderViews)).append("\n");
    sb.append("    totalClicks: ").append(toIndentedString(totalClicks)).append("\n");
    sb.append("    totalCommissionsCost: ").append(toIndentedString(totalCommissionsCost)).append("\n");
    sb.append("    totalConversions: ").append(toIndentedString(totalConversions)).append("\n");
    sb.append("    totalConversionsCost: ").append(toIndentedString(totalConversionsCost)).append("\n");
    sb.append("    totalConversionsValue: ").append(toIndentedString(totalConversionsValue)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    uniqueHits: ").append(toIndentedString(uniqueHits)).append("\n");
    sb.append("    uniqueViews: ").append(toIndentedString(uniqueViews)).append("\n");
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
    openapiFields.add("entityData");
    openapiFields.add("id");
    openapiFields.add("lastHitDate");
    openapiFields.add("spiderClicks");
    openapiFields.add("spiderHits");
    openapiFields.add("spiderViews");
    openapiFields.add("totalClicks");
    openapiFields.add("totalCommissionsCost");
    openapiFields.add("totalConversions");
    openapiFields.add("totalConversionsCost");
    openapiFields.add("totalConversionsValue");
    openapiFields.add("totalHits");
    openapiFields.add("totalViews");
    openapiFields.add("uniqueClicks");
    openapiFields.add("uniqueHits");
    openapiFields.add("uniqueViews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoTopsTopItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoTopsTopItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoTopsTopItem is not found in the empty JSON string", ApiCoreDtoTopsTopItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoTopsTopItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoTopsTopItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("lastHitDate") != null && !jsonObj.get("lastHitDate").isJsonNull()) && !jsonObj.get("lastHitDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastHitDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastHitDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoTopsTopItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoTopsTopItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoTopsTopItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoTopsTopItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoTopsTopItem>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoTopsTopItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoTopsTopItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoTopsTopItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoTopsTopItem
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoTopsTopItem
   */
  public static ApiCoreDtoTopsTopItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoTopsTopItem.class);
  }

  /**
   * Convert an instance of ApiCoreDtoTopsTopItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

