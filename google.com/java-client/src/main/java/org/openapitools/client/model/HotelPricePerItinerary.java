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
 * Hotel price for a given itinerary.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:51.108833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HotelPricePerItinerary {
  public static final String SERIALIZED_NAME_CHECKIN_DATE = "checkinDate";
  @SerializedName(SERIALIZED_NAME_CHECKIN_DATE)
  private Date checkinDate;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Float fees;

  public static final String SERIALIZED_NAME_LENGTH_OF_STAY_DAYS = "lengthOfStayDays";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_STAY_DAYS)
  private Integer lengthOfStayDays;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private Float taxes;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public HotelPricePerItinerary() {
  }

  public HotelPricePerItinerary checkinDate(Date checkinDate) {
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


  public HotelPricePerItinerary currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency for &#x60;price&#x60;, &#x60;taxes&#x60;, and &#x60;fees&#x60;.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public HotelPricePerItinerary fees(Float fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Fees for this itinerary.
   * @return fees
   */
  @javax.annotation.Nullable
  public Float getFees() {
    return fees;
  }

  public void setFees(Float fees) {
    this.fees = fees;
  }


  public HotelPricePerItinerary lengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
    return this;
  }

  /**
   * Number of nights for the itinerary.
   * @return lengthOfStayDays
   */
  @javax.annotation.Nullable
  public Integer getLengthOfStayDays() {
    return lengthOfStayDays;
  }

  public void setLengthOfStayDays(Integer lengthOfStayDays) {
    this.lengthOfStayDays = lengthOfStayDays;
  }


  public HotelPricePerItinerary price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Hotel price for this itinerary.
   * @return price
   */
  @javax.annotation.Nullable
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }


  public HotelPricePerItinerary taxes(Float taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Taxes for this itinerary.
   * @return taxes
   */
  @javax.annotation.Nullable
  public Float getTaxes() {
    return taxes;
  }

  public void setTaxes(Float taxes) {
    this.taxes = taxes;
  }


  public HotelPricePerItinerary updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Update timestamp for this hotel price.
   * @return updateTime
   */
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelPricePerItinerary hotelPricePerItinerary = (HotelPricePerItinerary) o;
    return Objects.equals(this.checkinDate, hotelPricePerItinerary.checkinDate) &&
        Objects.equals(this.currencyCode, hotelPricePerItinerary.currencyCode) &&
        Objects.equals(this.fees, hotelPricePerItinerary.fees) &&
        Objects.equals(this.lengthOfStayDays, hotelPricePerItinerary.lengthOfStayDays) &&
        Objects.equals(this.price, hotelPricePerItinerary.price) &&
        Objects.equals(this.taxes, hotelPricePerItinerary.taxes) &&
        Objects.equals(this.updateTime, hotelPricePerItinerary.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkinDate, currencyCode, fees, lengthOfStayDays, price, taxes, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelPricePerItinerary {\n");
    sb.append("    checkinDate: ").append(toIndentedString(checkinDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    lengthOfStayDays: ").append(toIndentedString(lengthOfStayDays)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("checkinDate");
    openapiFields.add("currencyCode");
    openapiFields.add("fees");
    openapiFields.add("lengthOfStayDays");
    openapiFields.add("price");
    openapiFields.add("taxes");
    openapiFields.add("updateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HotelPricePerItinerary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HotelPricePerItinerary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelPricePerItinerary is not found in the empty JSON string", HotelPricePerItinerary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HotelPricePerItinerary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelPricePerItinerary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `checkinDate`
      if (jsonObj.get("checkinDate") != null && !jsonObj.get("checkinDate").isJsonNull()) {
        Date.validateJsonElement(jsonObj.get("checkinDate"));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("updateTime") != null && !jsonObj.get("updateTime").isJsonNull()) && !jsonObj.get("updateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelPricePerItinerary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelPricePerItinerary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelPricePerItinerary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelPricePerItinerary.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelPricePerItinerary>() {
           @Override
           public void write(JsonWriter out, HotelPricePerItinerary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelPricePerItinerary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HotelPricePerItinerary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HotelPricePerItinerary
   * @throws IOException if the JSON string is invalid with respect to HotelPricePerItinerary
   */
  public static HotelPricePerItinerary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelPricePerItinerary.class);
  }

  /**
   * Convert an instance of HotelPricePerItinerary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

