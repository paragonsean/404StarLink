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
 * A price record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:57.375310-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PriceRecord {
  public static final String SERIALIZED_NAME_BASE_PRICE = "basePrice";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private Float basePrice;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TAXES_AND_FEES = "taxesAndFees";
  @SerializedName(SERIALIZED_NAME_TAXES_AND_FEES)
  private Float taxesAndFees;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public PriceRecord() {
  }

  public PriceRecord basePrice(Float basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * Base price.
   * @return basePrice
   */
  @javax.annotation.Nullable
  public Float getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(Float basePrice) {
    this.basePrice = basePrice;
  }


  public PriceRecord currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * ISO 4217 currency code.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PriceRecord taxesAndFees(Float taxesAndFees) {
    this.taxesAndFees = taxesAndFees;
    return this;
  }

  /**
   * Taxes and fees.
   * @return taxesAndFees
   */
  @javax.annotation.Nullable
  public Float getTaxesAndFees() {
    return taxesAndFees;
  }

  public void setTaxesAndFees(Float taxesAndFees) {
    this.taxesAndFees = taxesAndFees;
  }


  public PriceRecord time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of this price record.
   * @return time
   */
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceRecord priceRecord = (PriceRecord) o;
    return Objects.equals(this.basePrice, priceRecord.basePrice) &&
        Objects.equals(this.currencyCode, priceRecord.currencyCode) &&
        Objects.equals(this.taxesAndFees, priceRecord.taxesAndFees) &&
        Objects.equals(this.time, priceRecord.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePrice, currencyCode, taxesAndFees, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRecord {\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    taxesAndFees: ").append(toIndentedString(taxesAndFees)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("basePrice");
    openapiFields.add("currencyCode");
    openapiFields.add("taxesAndFees");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceRecord
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceRecord is not found in the empty JSON string", PriceRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("time") != null && !jsonObj.get("time").isJsonNull()) && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceRecord>() {
           @Override
           public void write(JsonWriter out, PriceRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceRecord given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceRecord
   * @throws IOException if the JSON string is invalid with respect to PriceRecord
   */
  public static PriceRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceRecord.class);
  }

  /**
   * Convert an instance of PriceRecord to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

