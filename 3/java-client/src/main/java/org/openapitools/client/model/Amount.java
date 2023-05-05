/*
 * Fund API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Fund API provides endpoints for managing the funds in the accounts on your platform. These management operations include, for example, the transfer of funds from one account to another, the payout of funds to an account holder, and the retrieval of balances in an account.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Fund API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Fund/v3/accountHolderBalance ```
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
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
 * Amount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:02.768054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Amount {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public Amount() {
  }

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Amount value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return value
   */
  @javax.annotation.Nonnull
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.value, amount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Amount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Amount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Amount is not found in the empty JSON string", Amount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Amount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Amount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Amount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Amount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Amount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Amount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Amount.class));

       return (TypeAdapter<T>) new TypeAdapter<Amount>() {
           @Override
           public void write(JsonWriter out, Amount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Amount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Amount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Amount
   * @throws IOException if the JSON string is invalid with respect to Amount
   */
  public static Amount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Amount.class);
  }

  /**
   * Convert an instance of Amount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

