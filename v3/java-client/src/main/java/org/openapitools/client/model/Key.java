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
 * Key of a result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:47.882086-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Key {
  public static final String SERIALIZED_NAME_ADVANCE_BOOKING_WINDOW = "advanceBookingWindow";
  @SerializedName(SERIALIZED_NAME_ADVANCE_BOOKING_WINDOW)
  private Integer advanceBookingWindow;

  public static final String SERIALIZED_NAME_CHECKIN_DATE = "checkinDate";
  @SerializedName(SERIALIZED_NAME_CHECKIN_DATE)
  private Date checkinDate;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Date date;

  /**
   * The user’s device type. If &#x60;deviceType&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;deviceType&#x60; field is not returned in the &#x60;Key&#x60;.
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

  public static final String SERIALIZED_NAME_HOTEL_REGION_CODE = "hotelRegionCode";
  @SerializedName(SERIALIZED_NAME_HOTEL_REGION_CODE)
  private String hotelRegionCode;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY_DAYS = "lengthOfStayDays";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY_DAYS)
  private Integer lengthOfStayDays;

  public static final String SERIALIZED_NAME_OCCUPANCY = "occupancy";
  @SerializedName(SERIALIZED_NAME_OCCUPANCY)
  private Integer occupancy;

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_ID = "partnerHotelId";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_ID)
  private String partnerHotelId;

  public static final String SERIALIZED_NAME_USER_REGION_CODE = "userRegionCode";
  @SerializedName(SERIALIZED_NAME_USER_REGION_CODE)
  private String userRegionCode;

  public Key() {
  }

  public Key advanceBookingWindow(Integer advanceBookingWindow) {
    this.advanceBookingWindow = advanceBookingWindow;
    return this;
  }

  /**
   * The number of days in advance the user wants to book the itinerary. If &#x60;advanceBookingWindow&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;advanceBookingWindow&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return advanceBookingWindow
   */
  @javax.annotation.Nullable
  public Integer getAdvanceBookingWindow() {
    return advanceBookingWindow;
  }

  public void setAdvanceBookingWindow(Integer advanceBookingWindow) {
    this.advanceBookingWindow = advanceBookingWindow;
  }


  public Key checkinDate(Date checkinDate) {
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


  public Key date(Date date) {
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


  public Key deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * The user’s device type. If &#x60;deviceType&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;deviceType&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return deviceType
   */
  @javax.annotation.Nullable
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }


  public Key hotelRegionCode(String hotelRegionCode) {
    this.hotelRegionCode = hotelRegionCode;
    return this;
  }

  /**
   * CLDR region code of the country/region of the hotel. If &#x60;hotelRegionCode&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;hotelRegionCode&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return hotelRegionCode
   */
  @javax.annotation.Nullable
  public String getHotelRegionCode() {
    return hotelRegionCode;
  }

  public void setHotelRegionCode(String hotelRegionCode) {
    this.hotelRegionCode = hotelRegionCode;
  }


  public Key lengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
    return this;
  }

  /**
   * The number of nights for the itinerary. If &#x60;lengthOfStayDays&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;lengthOfStayDays&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return lengthOfStayDays
   */
  @javax.annotation.Nullable
  public Integer getLengthOfStayDays() {
    return lengthOfStayDays;
  }

  public void setLengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
  }


  public Key occupancy(Integer occupancy) {
    this.occupancy = occupancy;
    return this;
  }

  /**
   * The total occupancy of the itinerary. If &#x60;occupancy&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;occupancy&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return occupancy
   */
  @javax.annotation.Nullable
  public Integer getOccupancy() {
    return occupancy;
  }

  public void setOccupancy(Integer occupancy) {
    this.occupancy = occupancy;
  }


  public Key partnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
    return this;
  }

  /**
   * Partner&#39;s hotel ID. If &#x60;partnerHotelId&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;partnerHotelId&#x60; field is not returned in the &#x60;Key&#x60;.
   * @return partnerHotelId
   */
  @javax.annotation.Nullable
  public String getPartnerHotelId() {
    return partnerHotelId;
  }

  public void setPartnerHotelId(String partnerHotelId) {
    this.partnerHotelId = partnerHotelId;
  }


  public Key userRegionCode(String userRegionCode) {
    this.userRegionCode = userRegionCode;
    return this;
  }

  /**
   * ISO 3116 region code of the country/region of the user. If &#x60;userRegionCode&#x60; is not a value of the &#x60;aggregateBy&#x60; parameter in the request call, then the &#x60;userRegionCode&#x60; field is not returned in the &#x60;Key&#x60;.
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
    Key key = (Key) o;
    return Objects.equals(this.advanceBookingWindow, key.advanceBookingWindow) &&
        Objects.equals(this.checkinDate, key.checkinDate) &&
        Objects.equals(this.date, key.date) &&
        Objects.equals(this.deviceType, key.deviceType) &&
        Objects.equals(this.hotelRegionCode, key.hotelRegionCode) &&
        Objects.equals(this.lengthOfStayDays, key.lengthOfStayDays) &&
        Objects.equals(this.occupancy, key.occupancy) &&
        Objects.equals(this.partnerHotelId, key.partnerHotelId) &&
        Objects.equals(this.userRegionCode, key.userRegionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advanceBookingWindow, checkinDate, date, deviceType, hotelRegionCode, lengthOfStayDays, occupancy, partnerHotelId, userRegionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Key {\n");
    sb.append("    advanceBookingWindow: ").append(toIndentedString(advanceBookingWindow)).append("\n");
    sb.append("    checkinDate: ").append(toIndentedString(checkinDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    hotelRegionCode: ").append(toIndentedString(hotelRegionCode)).append("\n");
    sb.append("    lengthOfStayDays: ").append(toIndentedString(lengthOfStayDays)).append("\n");
    sb.append("    occupancy: ").append(toIndentedString(occupancy)).append("\n");
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
    openapiFields.add("advanceBookingWindow");
    openapiFields.add("checkinDate");
    openapiFields.add("date");
    openapiFields.add("deviceType");
    openapiFields.add("hotelRegionCode");
    openapiFields.add("lengthOfStayDays");
    openapiFields.add("occupancy");
    openapiFields.add("partnerHotelId");
    openapiFields.add("userRegionCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Key
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Key.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Key is not found in the empty JSON string", Key.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Key.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Key` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `checkinDate`
      if (jsonObj.get("checkinDate") != null && !jsonObj.get("checkinDate").isJsonNull()) {
        Date.validateJsonElement(jsonObj.get("checkinDate"));
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
      if ((jsonObj.get("hotelRegionCode") != null && !jsonObj.get("hotelRegionCode").isJsonNull()) && !jsonObj.get("hotelRegionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotelRegionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotelRegionCode").toString()));
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
       if (!Key.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Key' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Key> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Key.class));

       return (TypeAdapter<T>) new TypeAdapter<Key>() {
           @Override
           public void write(JsonWriter out, Key value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Key read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Key given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Key
   * @throws IOException if the JSON string is invalid with respect to Key
   */
  public static Key fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Key.class);
  }

  /**
   * Convert an instance of Key to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

