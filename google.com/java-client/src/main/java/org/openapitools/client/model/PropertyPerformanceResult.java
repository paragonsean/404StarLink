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
 * Represents a result from querying for the property performance report for an account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PropertyPerformanceResult {
  public static final String SERIALIZED_NAME_ADS_CLICK_COUNT = "adsClickCount";
  @SerializedName(SERIALIZED_NAME_ADS_CLICK_COUNT)
  private String adsClickCount;

  public static final String SERIALIZED_NAME_ADS_CLICKTHROUGH_RATE = "adsClickthroughRate";
  @SerializedName(SERIALIZED_NAME_ADS_CLICKTHROUGH_RATE)
  private Double adsClickthroughRate;

  public static final String SERIALIZED_NAME_ADS_IMPRESSION_COUNT = "adsImpressionCount";
  @SerializedName(SERIALIZED_NAME_ADS_IMPRESSION_COUNT)
  private String adsImpressionCount;

  /**
   * Difference in days between query date and check-in date in property&#39;s local timezone. Only present if &#x60;advanceBookingWindow&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   */
  @JsonAdapter(AdvanceBookingWindowEnum.Adapter.class)
  public enum AdvanceBookingWindowEnum {
    UNSPECIFIED("ADVANCE_BOOKING_WINDOW_UNSPECIFIED"),
    
    SAME_DAY("ADVANCE_BOOKING_WINDOW_SAME_DAY"),
    
    NEXT_DAY("ADVANCE_BOOKING_WINDOW_NEXT_DAY"),
    
    DAYS_2_TO_7("ADVANCE_BOOKING_WINDOW_DAYS_2_TO_7"),
    
    DAYS_8_TO_14("ADVANCE_BOOKING_WINDOW_DAYS_8_TO_14"),
    
    DAYS_15_TO_30("ADVANCE_BOOKING_WINDOW_DAYS_15_TO_30"),
    
    DAYS_31_TO_60("ADVANCE_BOOKING_WINDOW_DAYS_31_TO_60"),
    
    DAYS_61_TO_90("ADVANCE_BOOKING_WINDOW_DAYS_61_TO_90"),
    
    DAYS_91_TO_120("ADVANCE_BOOKING_WINDOW_DAYS_91_TO_120"),
    
    DAYS_121_TO_150("ADVANCE_BOOKING_WINDOW_DAYS_121_TO_150"),
    
    DAYS_151_TO_180("ADVANCE_BOOKING_WINDOW_DAYS_151_TO_180"),
    
    DAYS_OVER_180("ADVANCE_BOOKING_WINDOW_DAYS_OVER_180");

    private String value;

    AdvanceBookingWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdvanceBookingWindowEnum fromValue(String value) {
      for (AdvanceBookingWindowEnum b : AdvanceBookingWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AdvanceBookingWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdvanceBookingWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdvanceBookingWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AdvanceBookingWindowEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AdvanceBookingWindowEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ADVANCE_BOOKING_WINDOW = "advanceBookingWindow";
  @SerializedName(SERIALIZED_NAME_ADVANCE_BOOKING_WINDOW)
  private AdvanceBookingWindowEnum advanceBookingWindow;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CLICK_COUNT = "clickCount";
  @SerializedName(SERIALIZED_NAME_CLICK_COUNT)
  private String clickCount;

  public static final String SERIALIZED_NAME_CLICKTHROUGH_RATE = "clickthroughRate";
  @SerializedName(SERIALIZED_NAME_CLICKTHROUGH_RATE)
  private Double clickthroughRate;

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

  public static final String SERIALIZED_NAME_HIGH_INTENT_USERS = "highIntentUsers";
  @SerializedName(SERIALIZED_NAME_HIGH_INTENT_USERS)
  private Boolean highIntentUsers;

  public static final String SERIALIZED_NAME_IMPRESSION_COUNT = "impressionCount";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_COUNT)
  private String impressionCount;

  /**
   * Number of nights between check-in and check-out dates specified by user. Only present if &#x60;lengthOfStay&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   */
  @JsonAdapter(LengthOfStayEnum.Adapter.class)
  public enum LengthOfStayEnum {
    UNSPECIFIED("LENGTH_OF_STAY_UNSPECIFIED"),
    
    NIGHTS_1("LENGTH_OF_STAY_NIGHTS_1"),
    
    NIGHTS_2("LENGTH_OF_STAY_NIGHTS_2"),
    
    NIGHTS_3("LENGTH_OF_STAY_NIGHTS_3"),
    
    NIGHTS_4_TO_7("LENGTH_OF_STAY_NIGHTS_4_TO_7"),
    
    NIGHTS_8_TO_14("LENGTH_OF_STAY_NIGHTS_8_TO_14"),
    
    NIGHTS_15_TO_21("LENGTH_OF_STAY_NIGHTS_15_TO_21"),
    
    NIGHTS_22_TO_30("LENGTH_OF_STAY_NIGHTS_22_TO_30"),
    
    NIGHTS_OVER_30("LENGTH_OF_STAY_NIGHTS_OVER_30");

    private String value;

    LengthOfStayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LengthOfStayEnum fromValue(String value) {
      for (LengthOfStayEnum b : LengthOfStayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LengthOfStayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LengthOfStayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LengthOfStayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LengthOfStayEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LengthOfStayEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY = "lengthOfStay";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY)
  private LengthOfStayEnum lengthOfStay;

  /**
   * Requested number of people staying at the property. Only present if &#x60;partnerPropertyId&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   */
  @JsonAdapter(OccupancyEnum.Adapter.class)
  public enum OccupancyEnum {
    UNSPECIFIED("OCCUPANCY_UNSPECIFIED"),
    
    _1("OCCUPANCY_1"),
    
    _2("OCCUPANCY_2"),
    
    _3("OCCUPANCY_3"),
    
    _4("OCCUPANCY_4"),
    
    OVER_4("OCCUPANCY_OVER_4");

    private String value;

    OccupancyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OccupancyEnum fromValue(String value) {
      for (OccupancyEnum b : OccupancyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OccupancyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OccupancyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OccupancyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OccupancyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OccupancyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OCCUPANCY = "occupancy";
  @SerializedName(SERIALIZED_NAME_OCCUPANCY)
  private OccupancyEnum occupancy;

  public static final String SERIALIZED_NAME_PARTNER_PROPERTY_DISPLAY_NAME = "partnerPropertyDisplayName";
  @SerializedName(SERIALIZED_NAME_PARTNER_PROPERTY_DISPLAY_NAME)
  private String partnerPropertyDisplayName;

  public static final String SERIALIZED_NAME_PARTNER_PROPERTY_ID = "partnerPropertyId";
  @SerializedName(SERIALIZED_NAME_PARTNER_PROPERTY_ID)
  private String partnerPropertyId;

  public static final String SERIALIZED_NAME_PROPERTY_REGION_CODE = "propertyRegionCode";
  @SerializedName(SERIALIZED_NAME_PROPERTY_REGION_CODE)
  private String propertyRegionCode;

  public static final String SERIALIZED_NAME_USER_REGION_CODE = "userRegionCode";
  @SerializedName(SERIALIZED_NAME_USER_REGION_CODE)
  private String userRegionCode;

  public PropertyPerformanceResult() {
  }

  public PropertyPerformanceResult adsClickCount(String adsClickCount) {
    this.adsClickCount = adsClickCount;
    return this;
  }

  /**
   * The total number of ad clicks that were recorded for this result.
   * @return adsClickCount
   */
  @javax.annotation.Nullable
  public String getAdsClickCount() {
    return adsClickCount;
  }

  public void setAdsClickCount(String adsClickCount) {
    this.adsClickCount = adsClickCount;
  }


  public PropertyPerformanceResult adsClickthroughRate(Double adsClickthroughRate) {
    this.adsClickthroughRate = adsClickthroughRate;
    return this;
  }

  /**
   * Equal to &#x60;ads_click_count&#x60; divided by &#x60;ads_impression_count&#x60;.
   * @return adsClickthroughRate
   */
  @javax.annotation.Nullable
  public Double getAdsClickthroughRate() {
    return adsClickthroughRate;
  }

  public void setAdsClickthroughRate(Double adsClickthroughRate) {
    this.adsClickthroughRate = adsClickthroughRate;
  }


  public PropertyPerformanceResult adsImpressionCount(String adsImpressionCount) {
    this.adsImpressionCount = adsImpressionCount;
    return this;
  }

  /**
   * The total number of ad impressions that were recorded for this result.
   * @return adsImpressionCount
   */
  @javax.annotation.Nullable
  public String getAdsImpressionCount() {
    return adsImpressionCount;
  }

  public void setAdsImpressionCount(String adsImpressionCount) {
    this.adsImpressionCount = adsImpressionCount;
  }


  public PropertyPerformanceResult advanceBookingWindow(AdvanceBookingWindowEnum advanceBookingWindow) {
    this.advanceBookingWindow = advanceBookingWindow;
    return this;
  }

  /**
   * Difference in days between query date and check-in date in property&#39;s local timezone. Only present if &#x60;advanceBookingWindow&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return advanceBookingWindow
   */
  @javax.annotation.Nullable
  public AdvanceBookingWindowEnum getAdvanceBookingWindow() {
    return advanceBookingWindow;
  }

  public void setAdvanceBookingWindow(AdvanceBookingWindowEnum advanceBookingWindow) {
    this.advanceBookingWindow = advanceBookingWindow;
  }


  public PropertyPerformanceResult brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Partner-specified brand for the property. Only present if &#x60;brand&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return brand
   */
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PropertyPerformanceResult clickCount(String clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  /**
   * The total number of free booking link clicks that were recorded for this result.
   * @return clickCount
   */
  @javax.annotation.Nullable
  public String getClickCount() {
    return clickCount;
  }

  public void setClickCount(String clickCount) {
    this.clickCount = clickCount;
  }


  public PropertyPerformanceResult clickthroughRate(Double clickthroughRate) {
    this.clickthroughRate = clickthroughRate;
    return this;
  }

  /**
   * Equal to &#x60;click_count&#x60; divided by &#x60;impression_count&#x60;.
   * @return clickthroughRate
   */
  @javax.annotation.Nullable
  public Double getClickthroughRate() {
    return clickthroughRate;
  }

  public void setClickthroughRate(Double clickthroughRate) {
    this.clickthroughRate = clickthroughRate;
  }


  public PropertyPerformanceResult date(Date date) {
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


  public PropertyPerformanceResult deviceType(DeviceTypeEnum deviceType) {
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


  public PropertyPerformanceResult highIntentUsers(Boolean highIntentUsers) {
    this.highIntentUsers = highIntentUsers;
    return this;
  }

  /**
   * Whether the user’s query indicated a strong interest in booking. Only present if &#x60;highIntentUsers&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return highIntentUsers
   */
  @javax.annotation.Nullable
  public Boolean getHighIntentUsers() {
    return highIntentUsers;
  }

  public void setHighIntentUsers(Boolean highIntentUsers) {
    this.highIntentUsers = highIntentUsers;
  }


  public PropertyPerformanceResult impressionCount(String impressionCount) {
    this.impressionCount = impressionCount;
    return this;
  }

  /**
   * The total number of free booking link impressions that were recorded for this result. This value is rounded to preserve user privacy.
   * @return impressionCount
   */
  @javax.annotation.Nullable
  public String getImpressionCount() {
    return impressionCount;
  }

  public void setImpressionCount(String impressionCount) {
    this.impressionCount = impressionCount;
  }


  public PropertyPerformanceResult lengthOfStay(LengthOfStayEnum lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
    return this;
  }

  /**
   * Number of nights between check-in and check-out dates specified by user. Only present if &#x60;lengthOfStay&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return lengthOfStay
   */
  @javax.annotation.Nullable
  public LengthOfStayEnum getLengthOfStay() {
    return lengthOfStay;
  }

  public void setLengthOfStay(LengthOfStayEnum lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
  }


  public PropertyPerformanceResult occupancy(OccupancyEnum occupancy) {
    this.occupancy = occupancy;
    return this;
  }

  /**
   * Requested number of people staying at the property. Only present if &#x60;partnerPropertyId&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return occupancy
   */
  @javax.annotation.Nullable
  public OccupancyEnum getOccupancy() {
    return occupancy;
  }

  public void setOccupancy(OccupancyEnum occupancy) {
    this.occupancy = occupancy;
  }


  public PropertyPerformanceResult partnerPropertyDisplayName(String partnerPropertyDisplayName) {
    this.partnerPropertyDisplayName = partnerPropertyDisplayName;
    return this;
  }

  /**
   * Partner&#39;s property name. Only present if &#x60;partnerPropertyDisplayName&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return partnerPropertyDisplayName
   */
  @javax.annotation.Nullable
  public String getPartnerPropertyDisplayName() {
    return partnerPropertyDisplayName;
  }

  public void setPartnerPropertyDisplayName(String partnerPropertyDisplayName) {
    this.partnerPropertyDisplayName = partnerPropertyDisplayName;
  }


  public PropertyPerformanceResult partnerPropertyId(String partnerPropertyId) {
    this.partnerPropertyId = partnerPropertyId;
    return this;
  }

  /**
   * Partner&#39;s property ID. Only present if &#x60;partnerPropertyId&#x60; is specified in &#x60;aggregateBy&#x60; in the request.
   * @return partnerPropertyId
   */
  @javax.annotation.Nullable
  public String getPartnerPropertyId() {
    return partnerPropertyId;
  }

  public void setPartnerPropertyId(String partnerPropertyId) {
    this.partnerPropertyId = partnerPropertyId;
  }


  public PropertyPerformanceResult propertyRegionCode(String propertyRegionCode) {
    this.propertyRegionCode = propertyRegionCode;
    return this;
  }

  /**
   * ISO 3116 region code of the country/region of the property. Only present if &#x60;propertyRegionCode&#x60; is specified in &#x60;aggregateBy&#x60; in the request
   * @return propertyRegionCode
   */
  @javax.annotation.Nullable
  public String getPropertyRegionCode() {
    return propertyRegionCode;
  }

  public void setPropertyRegionCode(String propertyRegionCode) {
    this.propertyRegionCode = propertyRegionCode;
  }


  public PropertyPerformanceResult userRegionCode(String userRegionCode) {
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
    PropertyPerformanceResult propertyPerformanceResult = (PropertyPerformanceResult) o;
    return Objects.equals(this.adsClickCount, propertyPerformanceResult.adsClickCount) &&
        Objects.equals(this.adsClickthroughRate, propertyPerformanceResult.adsClickthroughRate) &&
        Objects.equals(this.adsImpressionCount, propertyPerformanceResult.adsImpressionCount) &&
        Objects.equals(this.advanceBookingWindow, propertyPerformanceResult.advanceBookingWindow) &&
        Objects.equals(this.brand, propertyPerformanceResult.brand) &&
        Objects.equals(this.clickCount, propertyPerformanceResult.clickCount) &&
        Objects.equals(this.clickthroughRate, propertyPerformanceResult.clickthroughRate) &&
        Objects.equals(this.date, propertyPerformanceResult.date) &&
        Objects.equals(this.deviceType, propertyPerformanceResult.deviceType) &&
        Objects.equals(this.highIntentUsers, propertyPerformanceResult.highIntentUsers) &&
        Objects.equals(this.impressionCount, propertyPerformanceResult.impressionCount) &&
        Objects.equals(this.lengthOfStay, propertyPerformanceResult.lengthOfStay) &&
        Objects.equals(this.occupancy, propertyPerformanceResult.occupancy) &&
        Objects.equals(this.partnerPropertyDisplayName, propertyPerformanceResult.partnerPropertyDisplayName) &&
        Objects.equals(this.partnerPropertyId, propertyPerformanceResult.partnerPropertyId) &&
        Objects.equals(this.propertyRegionCode, propertyPerformanceResult.propertyRegionCode) &&
        Objects.equals(this.userRegionCode, propertyPerformanceResult.userRegionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsClickCount, adsClickthroughRate, adsImpressionCount, advanceBookingWindow, brand, clickCount, clickthroughRate, date, deviceType, highIntentUsers, impressionCount, lengthOfStay, occupancy, partnerPropertyDisplayName, partnerPropertyId, propertyRegionCode, userRegionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyPerformanceResult {\n");
    sb.append("    adsClickCount: ").append(toIndentedString(adsClickCount)).append("\n");
    sb.append("    adsClickthroughRate: ").append(toIndentedString(adsClickthroughRate)).append("\n");
    sb.append("    adsImpressionCount: ").append(toIndentedString(adsImpressionCount)).append("\n");
    sb.append("    advanceBookingWindow: ").append(toIndentedString(advanceBookingWindow)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    clickthroughRate: ").append(toIndentedString(clickthroughRate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    highIntentUsers: ").append(toIndentedString(highIntentUsers)).append("\n");
    sb.append("    impressionCount: ").append(toIndentedString(impressionCount)).append("\n");
    sb.append("    lengthOfStay: ").append(toIndentedString(lengthOfStay)).append("\n");
    sb.append("    occupancy: ").append(toIndentedString(occupancy)).append("\n");
    sb.append("    partnerPropertyDisplayName: ").append(toIndentedString(partnerPropertyDisplayName)).append("\n");
    sb.append("    partnerPropertyId: ").append(toIndentedString(partnerPropertyId)).append("\n");
    sb.append("    propertyRegionCode: ").append(toIndentedString(propertyRegionCode)).append("\n");
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
    openapiFields.add("adsClickCount");
    openapiFields.add("adsClickthroughRate");
    openapiFields.add("adsImpressionCount");
    openapiFields.add("advanceBookingWindow");
    openapiFields.add("brand");
    openapiFields.add("clickCount");
    openapiFields.add("clickthroughRate");
    openapiFields.add("date");
    openapiFields.add("deviceType");
    openapiFields.add("highIntentUsers");
    openapiFields.add("impressionCount");
    openapiFields.add("lengthOfStay");
    openapiFields.add("occupancy");
    openapiFields.add("partnerPropertyDisplayName");
    openapiFields.add("partnerPropertyId");
    openapiFields.add("propertyRegionCode");
    openapiFields.add("userRegionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PropertyPerformanceResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropertyPerformanceResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertyPerformanceResult is not found in the empty JSON string", PropertyPerformanceResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PropertyPerformanceResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertyPerformanceResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("adsClickCount") != null && !jsonObj.get("adsClickCount").isJsonNull()) && !jsonObj.get("adsClickCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adsClickCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adsClickCount").toString()));
      }
      if ((jsonObj.get("adsImpressionCount") != null && !jsonObj.get("adsImpressionCount").isJsonNull()) && !jsonObj.get("adsImpressionCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adsImpressionCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adsImpressionCount").toString()));
      }
      if ((jsonObj.get("advanceBookingWindow") != null && !jsonObj.get("advanceBookingWindow").isJsonNull()) && !jsonObj.get("advanceBookingWindow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advanceBookingWindow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advanceBookingWindow").toString()));
      }
      // validate the optional field `advanceBookingWindow`
      if (jsonObj.get("advanceBookingWindow") != null && !jsonObj.get("advanceBookingWindow").isJsonNull()) {
        AdvanceBookingWindowEnum.validateJsonElement(jsonObj.get("advanceBookingWindow"));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
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
      if ((jsonObj.get("impressionCount") != null && !jsonObj.get("impressionCount").isJsonNull()) && !jsonObj.get("impressionCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `impressionCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("impressionCount").toString()));
      }
      if ((jsonObj.get("lengthOfStay") != null && !jsonObj.get("lengthOfStay").isJsonNull()) && !jsonObj.get("lengthOfStay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lengthOfStay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lengthOfStay").toString()));
      }
      // validate the optional field `lengthOfStay`
      if (jsonObj.get("lengthOfStay") != null && !jsonObj.get("lengthOfStay").isJsonNull()) {
        LengthOfStayEnum.validateJsonElement(jsonObj.get("lengthOfStay"));
      }
      if ((jsonObj.get("occupancy") != null && !jsonObj.get("occupancy").isJsonNull()) && !jsonObj.get("occupancy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occupancy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occupancy").toString()));
      }
      // validate the optional field `occupancy`
      if (jsonObj.get("occupancy") != null && !jsonObj.get("occupancy").isJsonNull()) {
        OccupancyEnum.validateJsonElement(jsonObj.get("occupancy"));
      }
      if ((jsonObj.get("partnerPropertyDisplayName") != null && !jsonObj.get("partnerPropertyDisplayName").isJsonNull()) && !jsonObj.get("partnerPropertyDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerPropertyDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerPropertyDisplayName").toString()));
      }
      if ((jsonObj.get("partnerPropertyId") != null && !jsonObj.get("partnerPropertyId").isJsonNull()) && !jsonObj.get("partnerPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerPropertyId").toString()));
      }
      if ((jsonObj.get("propertyRegionCode") != null && !jsonObj.get("propertyRegionCode").isJsonNull()) && !jsonObj.get("propertyRegionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyRegionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyRegionCode").toString()));
      }
      if ((jsonObj.get("userRegionCode") != null && !jsonObj.get("userRegionCode").isJsonNull()) && !jsonObj.get("userRegionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userRegionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userRegionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertyPerformanceResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertyPerformanceResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertyPerformanceResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertyPerformanceResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertyPerformanceResult>() {
           @Override
           public void write(JsonWriter out, PropertyPerformanceResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertyPerformanceResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PropertyPerformanceResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PropertyPerformanceResult
   * @throws IOException if the JSON string is invalid with respect to PropertyPerformanceResult
   */
  public static PropertyPerformanceResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertyPerformanceResult.class);
  }

  /**
   * Convert an instance of PropertyPerformanceResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

