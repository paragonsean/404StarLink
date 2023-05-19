/*
 * Configuration API
 * The Configuration API enables you to create a platform where you can onboard your users as account holders and create balance accounts, cards, and business accounts.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Versioning The Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/bcl/v1/accountHolders ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://balanceplatform-api-live.adyen.com/bcl/v1`.
 *
 * The version of the OpenAPI document: 1
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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.SweepConfiguration;

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
 * BalanceAccountUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:53.572384-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BalanceAccountUpdateRequest {
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

  /**
   * The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **Active**.  Possible values: **Active**, **Inactive**, **Closed**, **Suspended**.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SWEEP_CONFIGURATIONS = "sweepConfigurations";
  @SerializedName(SERIALIZED_NAME_SWEEP_CONFIGURATIONS)
  private Map<String, SweepConfiguration> sweepConfigurations = new HashMap<>();

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public BalanceAccountUpdateRequest() {
  }

  public BalanceAccountUpdateRequest accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

  /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
   */
  @javax.annotation.Nullable
  public String getAccountHolderId() {
    return accountHolderId;
  }

  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccountUpdateRequest defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

  /**
   * The default currency code of this balance account, in three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) format.  The default value is **EUR**.
   * @return defaultCurrencyCode
   */
  @javax.annotation.Nullable
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }


  public BalanceAccountUpdateRequest description(String description) {
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


  public BalanceAccountUpdateRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference to the balance account, maximum 150 characters.
   * @return reference
   */
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccountUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **Active**.  Possible values: **Active**, **Inactive**, **Closed**, **Suspended**.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BalanceAccountUpdateRequest sweepConfigurations(Map<String, SweepConfiguration> sweepConfigurations) {
    this.sweepConfigurations = sweepConfigurations;
    return this;
  }

  public BalanceAccountUpdateRequest putSweepConfigurationsItem(String key, SweepConfiguration sweepConfigurationsItem) {
    if (this.sweepConfigurations == null) {
      this.sweepConfigurations = new HashMap<>();
    }
    this.sweepConfigurations.put(key, sweepConfigurationsItem);
    return this;
  }

  /**
   * Contains key-value pairs that specify [balance sweep per currency code](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__reqParam_sweepConfigurations).  You can update the balance account to add, update, or delete sweeps.  * To add a sweep, send the currency code as a key and the configuration as the object.   * To update a sweep, send the whole configuration with your updates.  * To delete a sweep, set the value to **null**. For example, &#x60;\&quot;EUR\&quot;: null&#x60;.
   * @return sweepConfigurations
   */
  @javax.annotation.Nullable
  public Map<String, SweepConfiguration> getSweepConfigurations() {
    return sweepConfigurations;
  }

  public void setSweepConfigurations(Map<String, SweepConfiguration> sweepConfigurations) {
    this.sweepConfigurations = sweepConfigurations;
  }


  public BalanceAccountUpdateRequest timeZone(String timeZone) {
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
    BalanceAccountUpdateRequest balanceAccountUpdateRequest = (BalanceAccountUpdateRequest) o;
    return Objects.equals(this.accountHolderId, balanceAccountUpdateRequest.accountHolderId) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccountUpdateRequest.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccountUpdateRequest.description) &&
        Objects.equals(this.reference, balanceAccountUpdateRequest.reference) &&
        Objects.equals(this.status, balanceAccountUpdateRequest.status) &&
        Objects.equals(this.sweepConfigurations, balanceAccountUpdateRequest.sweepConfigurations) &&
        Objects.equals(this.timeZone, balanceAccountUpdateRequest.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, defaultCurrencyCode, description, reference, status, sweepConfigurations, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountUpdateRequest {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepConfigurations: ").append(toIndentedString(sweepConfigurations)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("sweepConfigurations");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BalanceAccountUpdateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BalanceAccountUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceAccountUpdateRequest is not found in the empty JSON string", BalanceAccountUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BalanceAccountUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceAccountUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountHolderId") != null && !jsonObj.get("accountHolderId").isJsonNull()) && !jsonObj.get("accountHolderId").isJsonPrimitive()) {
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
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceAccountUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceAccountUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceAccountUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceAccountUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceAccountUpdateRequest>() {
           @Override
           public void write(JsonWriter out, BalanceAccountUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceAccountUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BalanceAccountUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountUpdateRequest
   * @throws IOException if the JSON string is invalid with respect to BalanceAccountUpdateRequest
   */
  public static BalanceAccountUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceAccountUpdateRequest.class);
  }

  /**
   * Convert an instance of BalanceAccountUpdateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

