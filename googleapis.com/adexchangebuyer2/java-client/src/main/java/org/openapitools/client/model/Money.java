/*
 * Ad Exchange Buyer API II
 * Accesses the latest features for managing Authorized Buyers accounts, Real-Time Bidding configurations and auction metrics, and Marketplace programmatic deals.
 *
 * The version of the OpenAPI document: v2beta1
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
 * Represents an amount of money with its currency type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:26.835335-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Money {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_NANOS = "nanos";
  @SerializedName(SERIALIZED_NAME_NANOS)
  private Integer nanos;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public Money() {
  }

  public Money currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The three-letter currency code defined in ISO 4217.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Money nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If &#x60;units&#x60; is positive, &#x60;nanos&#x60; must be positive or zero. If &#x60;units&#x60; is zero, &#x60;nanos&#x60; can be positive, zero, or negative. If &#x60;units&#x60; is negative, &#x60;nanos&#x60; must be negative or zero. For example $-1.75 is represented as &#x60;units&#x60;&#x3D;-1 and &#x60;nanos&#x60;&#x3D;-750,000,000.
   * @return nanos
   */
  @javax.annotation.Nullable
  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }


  public Money units(String units) {
    this.units = units;
    return this;
  }

  /**
   * The whole units of the amount. For example if &#x60;currencyCode&#x60; is &#x60;\&quot;USD\&quot;&#x60;, then 1 unit is one US dollar.
   * @return units
   */
  @javax.annotation.Nullable
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(this.currencyCode, money.currencyCode) &&
        Objects.equals(this.nanos, money.nanos) &&
        Objects.equals(this.units, money.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, nanos, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("nanos");
    openapiFields.add("units");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Money
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Money.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Money is not found in the empty JSON string", Money.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Money.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Money` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Money.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Money' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Money> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Money.class));

       return (TypeAdapter<T>) new TypeAdapter<Money>() {
           @Override
           public void write(JsonWriter out, Money value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Money read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Money given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Money
   * @throws IOException if the JSON string is invalid with respect to Money
   */
  public static Money fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Money.class);
  }

  /**
   * Convert an instance of Money to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

