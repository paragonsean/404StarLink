/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
 * 
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
import java.util.Date;

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
 * **DEPRECATED:** Use &#x60;PropertyPerformanceResult&#x60; with &#x60;PropertyPerformanceReportService&#x60; instead. Represents a result from querying for free booking link stats for an account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:47.882086-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FreeBookingLinksResult {
  public static final String SERIALIZED_NAME_CLICK_COUNT = "clickCount";
  @SerializedName(SERIALIZED_NAME_CLICK_COUNT)
  private String clickCount;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Date date;

  /**
   * The user’s device type. Only present if &#x60;deviceType&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    DEVICE_UNSPECIFIED("DEVICE_UNSPECIFIED"),
    
    DEVICE_UNKNOWN("DEVICE_UNKNOWN"),
    
    DESKTOP("DESKTOP"),
    
    MOBILE("MOBILE"),
    
    TABLET("TABLET");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String value) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeviceTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DeviceTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "deviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private DeviceTypeEnum deviceType;

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME = "partnerHotelDisplayName";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME)
  private String partnerHotelDisplayName;

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_ID = "partnerHotelId";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_ID)
  private String partnerHotelId;

  public static final String SERIALIZED_NAME_USER_REGION_CODE = "userRegionCode";
  @SerializedName(SERIALIZED_NAME_USER_REGION_CODE)
  private String userRegionCode;

  public FreeBookingLinksResult() {
  }

  public FreeBookingLinksResult clickCount(String clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  /**
   * The total number of clicks that were recorded for this result.
   * @return clickCount
   */
  @javax.annotation.Nullable
  public String getClickCount() {
    return clickCount;
  }

  public void setClickCount(String clickCount) {
    this.clickCount = clickCount;
  }


  public FreeBookingLinksResult date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }


  public FreeBookingLinksResult deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * The user’s device type. Only present if &#x60;deviceType&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return deviceType
   */
  @javax.annotation.Nullable
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }


  public FreeBookingLinksResult partnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
    return this;
  }

  /**
   * Partner&#39;s hotel name. Only present if &#x60;partnerHotelDisplayName&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return partnerHotelDisplayName
   */
  @javax.annotation.Nullable
  public String getPartnerHotelDisplayName() {
    return partnerHotelDisplayName;
  }

  public void setPartnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
  }


  public FreeBookingLinksResult partnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
    return this;
  }

  /**
   * Partner&#39;s hotel ID. Only present if &#x60;partnerHotelId&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return partnerHotelId
   */
  @javax.annotation.Nullable
  public String getPartnerHotelId() {
    return partnerHotelId;
  }

  public void setPartnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
  }


  public FreeBookingLinksResult userRegionCode(String userRegionCode) {
    this.userRegionCode = userRegionCode;
    return this;
  }

  /**
   * ISO 3116 region code of the country/region of the user. Only present if &#x60;userRegionCode&#x60; is specified in &#x60;aggregateBy&#x60; in the request
   * @return userRegionCode
   */
  @javax.annotation.Nullable
  public String getUserRegionCode() {
    return userRegionCode;
  }

  public void setUserRegionCode(String userRegionCode) {
    this.userRegionCode = userRegionCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeBookingLinksResult freeBookingLinksResult = (FreeBookingLinksResult) o;
    return Objects.equals(this.clickCount, freeBookingLinksResult.clickCount) &&
        Objects.equals(this.date, freeBookingLinksResult.date) &&
        Objects.equals(this.deviceType, freeBookingLinksResult.deviceType) &&
        Objects.equals(this.partnerHotelDisplayName, freeBookingLinksResult.partnerHotelDisplayName) &&
        Objects.equals(this.partnerHotelId, freeBookingLinksResult.partnerHotelId) &&
        Objects.equals(this.userRegionCode, freeBookingLinksResult.userRegionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCount, date, deviceType, partnerHotelDisplayName, partnerHotelId, userRegionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeBookingLinksResult {\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    partnerHotelDisplayName: ").append(toIndentedString(partnerHotelDisplayName)).append("\n");
    sb.append("    partnerHotelId: ").append(toIndentedString(partnerHotelId)).append("\n");
    sb.append("    userRegionCode: ").append(toIndentedString(userRegionCode)).append("\n");
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
    openapiFields.add("clickCount");
    openapiFields.add("date");
    openapiFields.add("deviceType");
    openapiFields.add("partnerHotelDisplayName");
    openapiFields.add("partnerHotelId");
    openapiFields.add("userRegionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreeBookingLinksResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreeBookingLinksResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreeBookingLinksResult is not found in the empty JSON string", FreeBookingLinksResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreeBookingLinksResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreeBookingLinksResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("clickCount") != null && !jsonObj.get("clickCount").isJsonNull()) && !jsonObj.get("clickCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickCount").toString()));
      }
      // validate the optional field `date`
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) {
        Date.validateJsonElement(jsonObj.get("date"));
      }
      if ((jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) && !jsonObj.get("deviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceType").toString()));
      }
      // validate the optional field `deviceType`
      if (jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) {
        DeviceTypeEnum.validateJsonElement(jsonObj.get("deviceType"));
      }
      if ((jsonObj.get("partnerHotelDisplayName") != null && !jsonObj.get("partnerHotelDisplayName").isJsonNull()) && !jsonObj.get("partnerHotelDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerHotelDisplayName").toString()));
      }
      if ((jsonObj.get("partnerHotelId") != null && !jsonObj.get("partnerHotelId").isJsonNull()) && !jsonObj.get("partnerHotelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerHotelId").toString()));
      }
      if ((jsonObj.get("userRegionCode") != null && !jsonObj.get("userRegionCode").isJsonNull()) && !jsonObj.get("userRegionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userRegionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userRegionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreeBookingLinksResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreeBookingLinksResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreeBookingLinksResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreeBookingLinksResult.class));

       return (TypeAdapter<T>) new TypeAdapter<FreeBookingLinksResult>() {
           @Override
           public void write(JsonWriter out, FreeBookingLinksResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreeBookingLinksResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreeBookingLinksResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreeBookingLinksResult
   * @throws IOException if the JSON string is invalid with respect to FreeBookingLinksResult
   */
  public static FreeBookingLinksResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreeBookingLinksResult.class);
  }

  /**
   * Convert an instance of FreeBookingLinksResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

