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
import org.openapitools.client.model.PriceRecord;

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
 * A price accuracy row.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PriceAccuracyRow {
  public static final String SERIALIZED_NAME_ADULT_OCCUPANCY = "adultOccupancy";
  @SerializedName(SERIALIZED_NAME_ADULT_OCCUPANCY)
  private Integer adultOccupancy;

  public static final String SERIALIZED_NAME_AFFECTS_SCORE = "affectsScore";
  @SerializedName(SERIALIZED_NAME_AFFECTS_SCORE)
  private Boolean affectsScore;

  public static final String SERIALIZED_NAME_CACHED_PRICE_RECORD = "cachedPriceRecord";
  @SerializedName(SERIALIZED_NAME_CACHED_PRICE_RECORD)
  private PriceRecord cachedPriceRecord;

  public static final String SERIALIZED_NAME_CHECKIN_DATE = "checkinDate";
  @SerializedName(SERIALIZED_NAME_CHECKIN_DATE)
  private Date checkinDate;

  public static final String SERIALIZED_NAME_CHILD_OCCUPANCY = "childOccupancy";
  @SerializedName(SERIALIZED_NAME_CHILD_OCCUPANCY)
  private Integer childOccupancy;

  public static final String SERIALIZED_NAME_CORRECTION_TIME = "correctionTime";
  @SerializedName(SERIALIZED_NAME_CORRECTION_TIME)
  private String correctionTime;

  /**
   * The user&#39;s device type.
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

  public static final String SERIALIZED_NAME_FETCHED_PRICE_RECORD = "fetchedPriceRecord";
  @SerializedName(SERIALIZED_NAME_FETCHED_PRICE_RECORD)
  private PriceRecord fetchedPriceRecord;

  public static final String SERIALIZED_NAME_FINAL_DOMAIN = "finalDomain";
  @SerializedName(SERIALIZED_NAME_FINAL_DOMAIN)
  private String finalDomain;

  public static final String SERIALIZED_NAME_HOTEL = "hotel";
  @SerializedName(SERIALIZED_NAME_HOTEL)
  private String hotel;

  public static final String SERIALIZED_NAME_HOTEL_COUNTRY_CODE = "hotelCountryCode";
  @SerializedName(SERIALIZED_NAME_HOTEL_COUNTRY_CODE)
  private String hotelCountryCode;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY_DAYS = "lengthOfStayDays";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY_DAYS)
  private Integer lengthOfStayDays;

  /**
   * The reason why the fetched price didn&#39;t match the cached price.
   */
  @JsonAdapter(MismatchReasonEnum.Adapter.class)
  public enum MismatchReasonEnum {
    MISMATCH_REASON_UNSPECIFIED("MISMATCH_REASON_UNSPECIFIED"),
    
    MISMATCH_REASON_UNKNOWN("MISMATCH_REASON_UNKNOWN"),
    
    TAX_MISMATCH("TAX_MISMATCH"),
    
    ROOM_UNAVAILABLE("ROOM_UNAVAILABLE"),
    
    SITE_ERROR("SITE_ERROR"),
    
    PRICE_FEED_DELAYED("PRICE_FEED_DELAYED"),
    
    DISCOUNT_MISSING("DISCOUNT_MISSING"),
    
    INCORRECT_DISCOUNT_VALUE("INCORRECT_DISCOUNT_VALUE"),
    
    WRONG_ITINERARY("WRONG_ITINERARY");

    private String value;

    MismatchReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MismatchReasonEnum fromValue(String value) {
      for (MismatchReasonEnum b : MismatchReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MismatchReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MismatchReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MismatchReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MismatchReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MismatchReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MISMATCH_REASON = "mismatchReason";
  @SerializedName(SERIALIZED_NAME_MISMATCH_REASON)
  private MismatchReasonEnum mismatchReason;

  public static final String SERIALIZED_NAME_RATE_RULE_ID = "rateRuleId";
  @SerializedName(SERIALIZED_NAME_RATE_RULE_ID)
  private String rateRuleId;

  /**
   * Source of the price accuracy signal.
   */
  @JsonAdapter(SignalSourceEnum.Adapter.class)
  public enum SignalSourceEnum {
    SIGNAL_SOURCE_UNSPECIFIED("SIGNAL_SOURCE_UNSPECIFIED"),
    
    SIGNAL_SOURCE_UNKNOWN("SIGNAL_SOURCE_UNKNOWN"),
    
    FETCHED("FETCHED"),
    
    PIXEL("PIXEL");

    private String value;

    SignalSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignalSourceEnum fromValue(String value) {
      for (SignalSourceEnum b : SignalSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SignalSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignalSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignalSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignalSourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SignalSourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIGNAL_SOURCE = "signalSource";
  @SerializedName(SERIALIZED_NAME_SIGNAL_SOURCE)
  private SignalSourceEnum signalSource;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USER_REGION_CODE = "userRegionCode";
  @SerializedName(SERIALIZED_NAME_USER_REGION_CODE)
  private String userRegionCode;

  public PriceAccuracyRow() {
  }

  public PriceAccuracyRow adultOccupancy(Integer adultOccupancy) {
    this.adultOccupancy = adultOccupancy;
    return this;
  }

  /**
   * The number of adults in the occupancy details of the validation query.
   * @return adultOccupancy
   */
  @javax.annotation.Nullable
  public Integer getAdultOccupancy() {
    return adultOccupancy;
  }

  public void setAdultOccupancy(Integer adultOccupancy) {
    this.adultOccupancy = adultOccupancy;
  }


  public PriceAccuracyRow affectsScore(Boolean affectsScore) {
    this.affectsScore = affectsScore;
    return this;
  }

  /**
   * True if this row affects the placement of a price. This field has been renamed to “Affects placement” in Hotel Center.
   * @return affectsScore
   */
  @javax.annotation.Nullable
  public Boolean getAffectsScore() {
    return affectsScore;
  }

  public void setAffectsScore(Boolean affectsScore) {
    this.affectsScore = affectsScore;
  }


  public PriceAccuracyRow cachedPriceRecord(PriceRecord cachedPriceRecord) {
    this.cachedPriceRecord = cachedPriceRecord;
    return this;
  }

  /**
   * Get cachedPriceRecord
   * @return cachedPriceRecord
   */
  @javax.annotation.Nullable
  public PriceRecord getCachedPriceRecord() {
    return cachedPriceRecord;
  }

  public void setCachedPriceRecord(PriceRecord cachedPriceRecord) {
    this.cachedPriceRecord = cachedPriceRecord;
  }


  public PriceAccuracyRow checkinDate(Date checkinDate) {
    this.checkinDate = checkinDate;
    return this;
  }

  /**
   * Get checkinDate
   * @return checkinDate
   */
  @javax.annotation.Nullable
  public Date getCheckinDate() {
    return checkinDate;
  }

  public void setCheckinDate(Date checkinDate) {
    this.checkinDate = checkinDate;
  }


  public PriceAccuracyRow childOccupancy(Integer childOccupancy) {
    this.childOccupancy = childOccupancy;
    return this;
  }

  /**
   * The number of children in the occupancy details of the validation query.
   * @return childOccupancy
   */
  @javax.annotation.Nullable
  public Integer getChildOccupancy() {
    return childOccupancy;
  }

  public void setChildOccupancy(Integer childOccupancy) {
    this.childOccupancy = childOccupancy;
  }


  public PriceAccuracyRow correctionTime(String correctionTime) {
    this.correctionTime = correctionTime;
    return this;
  }

  /**
   * Time at which an incorrect price is updated to a correct price.
   * @return correctionTime
   */
  @javax.annotation.Nullable
  public String getCorrectionTime() {
    return correctionTime;
  }

  public void setCorrectionTime(String correctionTime) {
    this.correctionTime = correctionTime;
  }


  public PriceAccuracyRow deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * The user&#39;s device type.
   * @return deviceType
   */
  @javax.annotation.Nullable
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }


  public PriceAccuracyRow fetchedPriceRecord(PriceRecord fetchedPriceRecord) {
    this.fetchedPriceRecord = fetchedPriceRecord;
    return this;
  }

  /**
   * Get fetchedPriceRecord
   * @return fetchedPriceRecord
   */
  @javax.annotation.Nullable
  public PriceRecord getFetchedPriceRecord() {
    return fetchedPriceRecord;
  }

  public void setFetchedPriceRecord(PriceRecord fetchedPriceRecord) {
    this.fetchedPriceRecord = fetchedPriceRecord;
  }


  public PriceAccuracyRow finalDomain(String finalDomain) {
    this.finalDomain = finalDomain;
    return this;
  }

  /**
   * The domain of the final page from which prices are read.
   * @return finalDomain
   */
  @javax.annotation.Nullable
  public String getFinalDomain() {
    return finalDomain;
  }

  public void setFinalDomain(String finalDomain) {
    this.finalDomain = finalDomain;
  }


  public PriceAccuracyRow hotel(String hotel) {
    this.hotel = hotel;
    return this;
  }

  /**
   * Partner-defined hotel ID.
   * @return hotel
   */
  @javax.annotation.Nullable
  public String getHotel() {
    return hotel;
  }

  public void setHotel(String hotel) {
    this.hotel = hotel;
  }


  public PriceAccuracyRow hotelCountryCode(String hotelCountryCode) {
    this.hotelCountryCode = hotelCountryCode;
    return this;
  }

  /**
   * The country of the hotel (based on address).
   * @return hotelCountryCode
   */
  @javax.annotation.Nullable
  public String getHotelCountryCode() {
    return hotelCountryCode;
  }

  public void setHotelCountryCode(String hotelCountryCode) {
    this.hotelCountryCode = hotelCountryCode;
  }


  public PriceAccuracyRow lengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
    return this;
  }

  /**
   * Length of stay.
   * @return lengthOfStayDays
   */
  @javax.annotation.Nullable
  public Integer getLengthOfStayDays() {
    return lengthOfStayDays;
  }

  public void setLengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
  }


  public PriceAccuracyRow mismatchReason(MismatchReasonEnum mismatchReason) {
    this.mismatchReason = mismatchReason;
    return this;
  }

  /**
   * The reason why the fetched price didn&#39;t match the cached price.
   * @return mismatchReason
   */
  @javax.annotation.Nullable
  public MismatchReasonEnum getMismatchReason() {
    return mismatchReason;
  }

  public void setMismatchReason(MismatchReasonEnum mismatchReason) {
    this.mismatchReason = mismatchReason;
  }


  public PriceAccuracyRow rateRuleId(String rateRuleId) {
    this.rateRuleId = rateRuleId;
    return this;
  }

  /**
   * The rate rule of the advertised price for non-public rates.
   * @return rateRuleId
   */
  @javax.annotation.Nullable
  public String getRateRuleId() {
    return rateRuleId;
  }

  public void setRateRuleId(String rateRuleId) {
    this.rateRuleId = rateRuleId;
  }


  public PriceAccuracyRow signalSource(SignalSourceEnum signalSource) {
    this.signalSource = signalSource;
    return this;
  }

  /**
   * Source of the price accuracy signal.
   * @return signalSource
   */
  @javax.annotation.Nullable
  public SignalSourceEnum getSignalSource() {
    return signalSource;
  }

  public void setSignalSource(SignalSourceEnum signalSource) {
    this.signalSource = signalSource;
  }


  public PriceAccuracyRow url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Initial URL visited on the partner website.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public PriceAccuracyRow userRegionCode(String userRegionCode) {
    this.userRegionCode = userRegionCode;
    return this;
  }

  /**
   * The user&#39;s region.
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
    PriceAccuracyRow priceAccuracyRow = (PriceAccuracyRow) o;
    return Objects.equals(this.adultOccupancy, priceAccuracyRow.adultOccupancy) &&
        Objects.equals(this.affectsScore, priceAccuracyRow.affectsScore) &&
        Objects.equals(this.cachedPriceRecord, priceAccuracyRow.cachedPriceRecord) &&
        Objects.equals(this.checkinDate, priceAccuracyRow.checkinDate) &&
        Objects.equals(this.childOccupancy, priceAccuracyRow.childOccupancy) &&
        Objects.equals(this.correctionTime, priceAccuracyRow.correctionTime) &&
        Objects.equals(this.deviceType, priceAccuracyRow.deviceType) &&
        Objects.equals(this.fetchedPriceRecord, priceAccuracyRow.fetchedPriceRecord) &&
        Objects.equals(this.finalDomain, priceAccuracyRow.finalDomain) &&
        Objects.equals(this.hotel, priceAccuracyRow.hotel) &&
        Objects.equals(this.hotelCountryCode, priceAccuracyRow.hotelCountryCode) &&
        Objects.equals(this.lengthOfStayDays, priceAccuracyRow.lengthOfStayDays) &&
        Objects.equals(this.mismatchReason, priceAccuracyRow.mismatchReason) &&
        Objects.equals(this.rateRuleId, priceAccuracyRow.rateRuleId) &&
        Objects.equals(this.signalSource, priceAccuracyRow.signalSource) &&
        Objects.equals(this.url, priceAccuracyRow.url) &&
        Objects.equals(this.userRegionCode, priceAccuracyRow.userRegionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adultOccupancy, affectsScore, cachedPriceRecord, checkinDate, childOccupancy, correctionTime, deviceType, fetchedPriceRecord, finalDomain, hotel, hotelCountryCode, lengthOfStayDays, mismatchReason, rateRuleId, signalSource, url, userRegionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAccuracyRow {\n");
    sb.append("    adultOccupancy: ").append(toIndentedString(adultOccupancy)).append("\n");
    sb.append("    affectsScore: ").append(toIndentedString(affectsScore)).append("\n");
    sb.append("    cachedPriceRecord: ").append(toIndentedString(cachedPriceRecord)).append("\n");
    sb.append("    checkinDate: ").append(toIndentedString(checkinDate)).append("\n");
    sb.append("    childOccupancy: ").append(toIndentedString(childOccupancy)).append("\n");
    sb.append("    correctionTime: ").append(toIndentedString(correctionTime)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    fetchedPriceRecord: ").append(toIndentedString(fetchedPriceRecord)).append("\n");
    sb.append("    finalDomain: ").append(toIndentedString(finalDomain)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    hotelCountryCode: ").append(toIndentedString(hotelCountryCode)).append("\n");
    sb.append("    lengthOfStayDays: ").append(toIndentedString(lengthOfStayDays)).append("\n");
    sb.append("    mismatchReason: ").append(toIndentedString(mismatchReason)).append("\n");
    sb.append("    rateRuleId: ").append(toIndentedString(rateRuleId)).append("\n");
    sb.append("    signalSource: ").append(toIndentedString(signalSource)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("adultOccupancy");
    openapiFields.add("affectsScore");
    openapiFields.add("cachedPriceRecord");
    openapiFields.add("checkinDate");
    openapiFields.add("childOccupancy");
    openapiFields.add("correctionTime");
    openapiFields.add("deviceType");
    openapiFields.add("fetchedPriceRecord");
    openapiFields.add("finalDomain");
    openapiFields.add("hotel");
    openapiFields.add("hotelCountryCode");
    openapiFields.add("lengthOfStayDays");
    openapiFields.add("mismatchReason");
    openapiFields.add("rateRuleId");
    openapiFields.add("signalSource");
    openapiFields.add("url");
    openapiFields.add("userRegionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAccuracyRow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAccuracyRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAccuracyRow is not found in the empty JSON string", PriceAccuracyRow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAccuracyRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAccuracyRow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cachedPriceRecord`
      if (jsonObj.get("cachedPriceRecord") != null && !jsonObj.get("cachedPriceRecord").isJsonNull()) {
        PriceRecord.validateJsonElement(jsonObj.get("cachedPriceRecord"));
      }
      // validate the optional field `checkinDate`
      if (jsonObj.get("checkinDate") != null && !jsonObj.get("checkinDate").isJsonNull()) {
        Date.validateJsonElement(jsonObj.get("checkinDate"));
      }
      if ((jsonObj.get("correctionTime") != null && !jsonObj.get("correctionTime").isJsonNull()) && !jsonObj.get("correctionTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correctionTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correctionTime").toString()));
      }
      if ((jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) && !jsonObj.get("deviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceType").toString()));
      }
      // validate the optional field `deviceType`
      if (jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) {
        DeviceTypeEnum.validateJsonElement(jsonObj.get("deviceType"));
      }
      // validate the optional field `fetchedPriceRecord`
      if (jsonObj.get("fetchedPriceRecord") != null && !jsonObj.get("fetchedPriceRecord").isJsonNull()) {
        PriceRecord.validateJsonElement(jsonObj.get("fetchedPriceRecord"));
      }
      if ((jsonObj.get("finalDomain") != null && !jsonObj.get("finalDomain").isJsonNull()) && !jsonObj.get("finalDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finalDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finalDomain").toString()));
      }
      if ((jsonObj.get("hotel") != null && !jsonObj.get("hotel").isJsonNull()) && !jsonObj.get("hotel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotel").toString()));
      }
      if ((jsonObj.get("hotelCountryCode") != null && !jsonObj.get("hotelCountryCode").isJsonNull()) && !jsonObj.get("hotelCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotelCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotelCountryCode").toString()));
      }
      if ((jsonObj.get("mismatchReason") != null && !jsonObj.get("mismatchReason").isJsonNull()) && !jsonObj.get("mismatchReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mismatchReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mismatchReason").toString()));
      }
      // validate the optional field `mismatchReason`
      if (jsonObj.get("mismatchReason") != null && !jsonObj.get("mismatchReason").isJsonNull()) {
        MismatchReasonEnum.validateJsonElement(jsonObj.get("mismatchReason"));
      }
      if ((jsonObj.get("rateRuleId") != null && !jsonObj.get("rateRuleId").isJsonNull()) && !jsonObj.get("rateRuleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateRuleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateRuleId").toString()));
      }
      if ((jsonObj.get("signalSource") != null && !jsonObj.get("signalSource").isJsonNull()) && !jsonObj.get("signalSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signalSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signalSource").toString()));
      }
      // validate the optional field `signalSource`
      if (jsonObj.get("signalSource") != null && !jsonObj.get("signalSource").isJsonNull()) {
        SignalSourceEnum.validateJsonElement(jsonObj.get("signalSource"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("userRegionCode") != null && !jsonObj.get("userRegionCode").isJsonNull()) && !jsonObj.get("userRegionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userRegionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userRegionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAccuracyRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAccuracyRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAccuracyRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAccuracyRow.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAccuracyRow>() {
           @Override
           public void write(JsonWriter out, PriceAccuracyRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAccuracyRow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAccuracyRow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAccuracyRow
   * @throws IOException if the JSON string is invalid with respect to PriceAccuracyRow
   */
  public static PriceAccuracyRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAccuracyRow.class);
  }

  /**
   * Convert an instance of PriceAccuracyRow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

