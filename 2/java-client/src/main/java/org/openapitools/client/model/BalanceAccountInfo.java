/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v2/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v2`.
 *
 * The version of the OpenAPI document: 2
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
 * BalanceAccountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:45.438014-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BalanceAccountInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_ID = "accountHolderId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_ID)
  private String accountHolderId;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY_CODE)
  private String defaultCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public BalanceAccountInfo() {
  }

  public BalanceAccountInfo accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

  /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
   */
  @javax.annotation.Nonnull
  public String getAccountHolderId() {
    return accountHolderId;
  }

  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccountInfo defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

  /**
   * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**.
   * @return defaultCurrencyCode
   */
  @javax.annotation.Nullable
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }


  public BalanceAccountInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceAccountInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the balance account, maximum 150 characters.
   * @return reference
   */
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccountInfo timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
   */
  @javax.annotation.Nullable
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) o;
    return Objects.equals(this.accountHolderId, balanceAccountInfo.accountHolderId) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccountInfo.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccountInfo.description) &&
        Objects.equals(this.reference, balanceAccountInfo.reference) &&
        Objects.equals(this.timeZone, balanceAccountInfo.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, defaultCurrencyCode, description, reference, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountInfo {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("accountHolderId");
    openapiFields.add("defaultCurrencyCode");
    openapiFields.add("description");
    openapiFields.add("reference");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountHolderId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BalanceAccountInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BalanceAccountInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceAccountInfo is not found in the empty JSON string", BalanceAccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BalanceAccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceAccountInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BalanceAccountInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountHolderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountHolderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountHolderId").toString()));
      }
      if ((jsonObj.get("defaultCurrencyCode") != null && !jsonObj.get("defaultCurrencyCode").isJsonNull()) && !jsonObj.get("defaultCurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultCurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultCurrencyCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceAccountInfo>() {
           @Override
           public void write(JsonWriter out, BalanceAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BalanceAccountInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountInfo
   * @throws IOException if the JSON string is invalid with respect to BalanceAccountInfo
   */
  public static BalanceAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceAccountInfo.class);
  }

  /**
   * Convert an instance of BalanceAccountInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

