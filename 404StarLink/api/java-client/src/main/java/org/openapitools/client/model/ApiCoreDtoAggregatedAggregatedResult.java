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
import java.util.HashMap;
import java.util.Map;

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
 * ApiCoreDtoAggregatedAggregatedResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:52.389256-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoAggregatedAggregatedResult {
  public static final String SERIALIZED_NAME_ACTIVITY_DAY = "activityDay";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DAY)
  private String activityDay;

  public static final String SERIALIZED_NAME_COMMISSIONS_COST = "commissionsCost";
  @SerializedName(SERIALIZED_NAME_COMMISSIONS_COST)
  private Double commissionsCost;

  public static final String SERIALIZED_NAME_CONVERSIONS_COST = "conversionsCost";
  @SerializedName(SERIALIZED_NAME_CONVERSIONS_COST)
  private Double conversionsCost;

  public static final String SERIALIZED_NAME_CONVERSIONS_VALUE = "conversionsValue";
  @SerializedName(SERIALIZED_NAME_CONVERSIONS_VALUE)
  private Double conversionsValue;

  public static final String SERIALIZED_NAME_CONVERTED_CLICKS = "convertedClicks";
  @SerializedName(SERIALIZED_NAME_CONVERTED_CLICKS)
  private Long convertedClicks;

  public static final String SERIALIZED_NAME_ENTITY_DATA = "entityData";
  @SerializedName(SERIALIZED_NAME_ENTITY_DATA)
  private Object entityData;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_FROM_DAY = "fromDay";
  @SerializedName(SERIALIZED_NAME_FROM_DAY)
  private String fromDay;

  public static final String SERIALIZED_NAME_HOURLY_BREAK_DOWN = "hourlyBreakDown";
  @SerializedName(SERIALIZED_NAME_HOURLY_BREAK_DOWN)
  private Map<String, ApiCoreDtoAggregatedAggregatedResult> hourlyBreakDown = new HashMap<>();

  public static final String SERIALIZED_NAME_LAST_HIT_DATE = "lastHitDate";
  @SerializedName(SERIALIZED_NAME_LAST_HIT_DATE)
  private String lastHitDate;

  public static final String SERIALIZED_NAME_SPIDER_HITS_COUNT = "spiderHitsCount";
  @SerializedName(SERIALIZED_NAME_SPIDER_HITS_COUNT)
  private Long spiderHitsCount;

  public static final String SERIALIZED_NAME_TO_DAY = "toDay";
  @SerializedName(SERIALIZED_NAME_TO_DAY)
  private String toDay;

  public static final String SERIALIZED_NAME_TOTAL_CLICKS = "totalClicks";
  @SerializedName(SERIALIZED_NAME_TOTAL_CLICKS)
  private Long totalClicks;

  public static final String SERIALIZED_NAME_TOTAL_VIEWS = "totalViews";
  @SerializedName(SERIALIZED_NAME_TOTAL_VIEWS)
  private Long totalViews;

  public static final String SERIALIZED_NAME_UNIQUE_CLICKS = "uniqueClicks";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CLICKS)
  private Long uniqueClicks;

  public static final String SERIALIZED_NAME_UNIQUE_CONVERSIONS = "uniqueConversions";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CONVERSIONS)
  private Long uniqueConversions;

  public static final String SERIALIZED_NAME_UNIQUE_VIEWS = "uniqueViews";
  @SerializedName(SERIALIZED_NAME_UNIQUE_VIEWS)
  private Long uniqueViews;

  public ApiCoreDtoAggregatedAggregatedResult() {
  }

  public ApiCoreDtoAggregatedAggregatedResult activityDay(String activityDay) {
    this.activityDay = activityDay;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return activityDay
   */
  @javax.annotation.Nullable
  public String getActivityDay() {
    return activityDay;
  }

  public void setActivityDay(String activityDay) {
    this.activityDay = activityDay;
  }


  public ApiCoreDtoAggregatedAggregatedResult commissionsCost(Double commissionsCost) {
    this.commissionsCost = commissionsCost;
    return this;
  }

  /**
   * Get commissionsCost
   * @return commissionsCost
   */
  @javax.annotation.Nullable
  public Double getCommissionsCost() {
    return commissionsCost;
  }

  public void setCommissionsCost(Double commissionsCost) {
    this.commissionsCost = commissionsCost;
  }


  public ApiCoreDtoAggregatedAggregatedResult conversionsCost(Double conversionsCost) {
    this.conversionsCost = conversionsCost;
    return this;
  }

  /**
   * Get conversionsCost
   * @return conversionsCost
   */
  @javax.annotation.Nullable
  public Double getConversionsCost() {
    return conversionsCost;
  }

  public void setConversionsCost(Double conversionsCost) {
    this.conversionsCost = conversionsCost;
  }


  public ApiCoreDtoAggregatedAggregatedResult conversionsValue(Double conversionsValue) {
    this.conversionsValue = conversionsValue;
    return this;
  }

  /**
   * Get conversionsValue
   * @return conversionsValue
   */
  @javax.annotation.Nullable
  public Double getConversionsValue() {
    return conversionsValue;
  }

  public void setConversionsValue(Double conversionsValue) {
    this.conversionsValue = conversionsValue;
  }


  public ApiCoreDtoAggregatedAggregatedResult convertedClicks(Long convertedClicks) {
    this.convertedClicks = convertedClicks;
    return this;
  }

  /**
   * Get convertedClicks
   * @return convertedClicks
   */
  @javax.annotation.Nullable
  public Long getConvertedClicks() {
    return convertedClicks;
  }

  public void setConvertedClicks(Long convertedClicks) {
    this.convertedClicks = convertedClicks;
  }


  public ApiCoreDtoAggregatedAggregatedResult entityData(Object entityData) {
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


  public ApiCoreDtoAggregatedAggregatedResult entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public ApiCoreDtoAggregatedAggregatedResult fromDay(String fromDay) {
    this.fromDay = fromDay;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return fromDay
   */
  @javax.annotation.Nullable
  public String getFromDay() {
    return fromDay;
  }

  public void setFromDay(String fromDay) {
    this.fromDay = fromDay;
  }


  public ApiCoreDtoAggregatedAggregatedResult hourlyBreakDown(Map<String, ApiCoreDtoAggregatedAggregatedResult> hourlyBreakDown) {
    this.hourlyBreakDown = hourlyBreakDown;
    return this;
  }

  public ApiCoreDtoAggregatedAggregatedResult putHourlyBreakDownItem(String key, ApiCoreDtoAggregatedAggregatedResult hourlyBreakDownItem) {
    if (this.hourlyBreakDown == null) {
      this.hourlyBreakDown = new HashMap<>();
    }
    this.hourlyBreakDown.put(key, hourlyBreakDownItem);
    return this;
  }

  /**
   * Get hourlyBreakDown
   * @return hourlyBreakDown
   */
  @javax.annotation.Nullable
  public Map<String, ApiCoreDtoAggregatedAggregatedResult> getHourlyBreakDown() {
    return hourlyBreakDown;
  }

  public void setHourlyBreakDown(Map<String, ApiCoreDtoAggregatedAggregatedResult> hourlyBreakDown) {
    this.hourlyBreakDown = hourlyBreakDown;
  }


  public ApiCoreDtoAggregatedAggregatedResult lastHitDate(String lastHitDate) {
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


  public ApiCoreDtoAggregatedAggregatedResult spiderHitsCount(Long spiderHitsCount) {
    this.spiderHitsCount = spiderHitsCount;
    return this;
  }

  /**
   * Get spiderHitsCount
   * @return spiderHitsCount
   */
  @javax.annotation.Nullable
  public Long getSpiderHitsCount() {
    return spiderHitsCount;
  }

  public void setSpiderHitsCount(Long spiderHitsCount) {
    this.spiderHitsCount = spiderHitsCount;
  }


  public ApiCoreDtoAggregatedAggregatedResult toDay(String toDay) {
    this.toDay = toDay;
    return this;
  }

  /**
   *  (A date in \&quot;YmdHis\&quot; format)
   * @return toDay
   */
  @javax.annotation.Nullable
  public String getToDay() {
    return toDay;
  }

  public void setToDay(String toDay) {
    this.toDay = toDay;
  }


  public ApiCoreDtoAggregatedAggregatedResult totalClicks(Long totalClicks) {
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


  public ApiCoreDtoAggregatedAggregatedResult totalViews(Long totalViews) {
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


  public ApiCoreDtoAggregatedAggregatedResult uniqueClicks(Long uniqueClicks) {
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


  public ApiCoreDtoAggregatedAggregatedResult uniqueConversions(Long uniqueConversions) {
    this.uniqueConversions = uniqueConversions;
    return this;
  }

  /**
   * Get uniqueConversions
   * @return uniqueConversions
   */
  @javax.annotation.Nullable
  public Long getUniqueConversions() {
    return uniqueConversions;
  }

  public void setUniqueConversions(Long uniqueConversions) {
    this.uniqueConversions = uniqueConversions;
  }


  public ApiCoreDtoAggregatedAggregatedResult uniqueViews(Long uniqueViews) {
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
    ApiCoreDtoAggregatedAggregatedResult apiCoreDtoAggregatedAggregatedResult = (ApiCoreDtoAggregatedAggregatedResult) o;
    return Objects.equals(this.activityDay, apiCoreDtoAggregatedAggregatedResult.activityDay) &&
        Objects.equals(this.commissionsCost, apiCoreDtoAggregatedAggregatedResult.commissionsCost) &&
        Objects.equals(this.conversionsCost, apiCoreDtoAggregatedAggregatedResult.conversionsCost) &&
        Objects.equals(this.conversionsValue, apiCoreDtoAggregatedAggregatedResult.conversionsValue) &&
        Objects.equals(this.convertedClicks, apiCoreDtoAggregatedAggregatedResult.convertedClicks) &&
        Objects.equals(this.entityData, apiCoreDtoAggregatedAggregatedResult.entityData) &&
        Objects.equals(this.entityId, apiCoreDtoAggregatedAggregatedResult.entityId) &&
        Objects.equals(this.fromDay, apiCoreDtoAggregatedAggregatedResult.fromDay) &&
        Objects.equals(this.hourlyBreakDown, apiCoreDtoAggregatedAggregatedResult.hourlyBreakDown) &&
        Objects.equals(this.lastHitDate, apiCoreDtoAggregatedAggregatedResult.lastHitDate) &&
        Objects.equals(this.spiderHitsCount, apiCoreDtoAggregatedAggregatedResult.spiderHitsCount) &&
        Objects.equals(this.toDay, apiCoreDtoAggregatedAggregatedResult.toDay) &&
        Objects.equals(this.totalClicks, apiCoreDtoAggregatedAggregatedResult.totalClicks) &&
        Objects.equals(this.totalViews, apiCoreDtoAggregatedAggregatedResult.totalViews) &&
        Objects.equals(this.uniqueClicks, apiCoreDtoAggregatedAggregatedResult.uniqueClicks) &&
        Objects.equals(this.uniqueConversions, apiCoreDtoAggregatedAggregatedResult.uniqueConversions) &&
        Objects.equals(this.uniqueViews, apiCoreDtoAggregatedAggregatedResult.uniqueViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDay, commissionsCost, conversionsCost, conversionsValue, convertedClicks, entityData, entityId, fromDay, hourlyBreakDown, lastHitDate, spiderHitsCount, toDay, totalClicks, totalViews, uniqueClicks, uniqueConversions, uniqueViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoAggregatedAggregatedResult {\n");
    sb.append("    activityDay: ").append(toIndentedString(activityDay)).append("\n");
    sb.append("    commissionsCost: ").append(toIndentedString(commissionsCost)).append("\n");
    sb.append("    conversionsCost: ").append(toIndentedString(conversionsCost)).append("\n");
    sb.append("    conversionsValue: ").append(toIndentedString(conversionsValue)).append("\n");
    sb.append("    convertedClicks: ").append(toIndentedString(convertedClicks)).append("\n");
    sb.append("    entityData: ").append(toIndentedString(entityData)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    fromDay: ").append(toIndentedString(fromDay)).append("\n");
    sb.append("    hourlyBreakDown: ").append(toIndentedString(hourlyBreakDown)).append("\n");
    sb.append("    lastHitDate: ").append(toIndentedString(lastHitDate)).append("\n");
    sb.append("    spiderHitsCount: ").append(toIndentedString(spiderHitsCount)).append("\n");
    sb.append("    toDay: ").append(toIndentedString(toDay)).append("\n");
    sb.append("    totalClicks: ").append(toIndentedString(totalClicks)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    uniqueConversions: ").append(toIndentedString(uniqueConversions)).append("\n");
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
    openapiFields.add("activityDay");
    openapiFields.add("commissionsCost");
    openapiFields.add("conversionsCost");
    openapiFields.add("conversionsValue");
    openapiFields.add("convertedClicks");
    openapiFields.add("entityData");
    openapiFields.add("entityId");
    openapiFields.add("fromDay");
    openapiFields.add("hourlyBreakDown");
    openapiFields.add("lastHitDate");
    openapiFields.add("spiderHitsCount");
    openapiFields.add("toDay");
    openapiFields.add("totalClicks");
    openapiFields.add("totalViews");
    openapiFields.add("uniqueClicks");
    openapiFields.add("uniqueConversions");
    openapiFields.add("uniqueViews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoAggregatedAggregatedResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoAggregatedAggregatedResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoAggregatedAggregatedResult is not found in the empty JSON string", ApiCoreDtoAggregatedAggregatedResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoAggregatedAggregatedResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoAggregatedAggregatedResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("activityDay") != null && !jsonObj.get("activityDay").isJsonNull()) && !jsonObj.get("activityDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activityDay").toString()));
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      if ((jsonObj.get("fromDay") != null && !jsonObj.get("fromDay").isJsonNull()) && !jsonObj.get("fromDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromDay").toString()));
      }
      if ((jsonObj.get("lastHitDate") != null && !jsonObj.get("lastHitDate").isJsonNull()) && !jsonObj.get("lastHitDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastHitDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastHitDate").toString()));
      }
      if ((jsonObj.get("toDay") != null && !jsonObj.get("toDay").isJsonNull()) && !jsonObj.get("toDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toDay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoAggregatedAggregatedResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoAggregatedAggregatedResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoAggregatedAggregatedResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoAggregatedAggregatedResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoAggregatedAggregatedResult>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoAggregatedAggregatedResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoAggregatedAggregatedResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoAggregatedAggregatedResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoAggregatedAggregatedResult
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoAggregatedAggregatedResult
   */
  public static ApiCoreDtoAggregatedAggregatedResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoAggregatedAggregatedResult.class);
  }

  /**
   * Convert an instance of ApiCoreDtoAggregatedAggregatedResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

