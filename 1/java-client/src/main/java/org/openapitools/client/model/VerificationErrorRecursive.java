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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RemediatingAction;

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
 * VerificationErrorRecursive
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:53.572384-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VerificationErrorRecursive {
  /**
   * Gets or Sets capabilities
   */
  @JsonAdapter(CapabilitiesEnum.Adapter.class)
  public enum CapabilitiesEnum {
    ACCEPT_EXTERNAL_FUNDING("acceptExternalFunding"),
    
    ACCEPT_PSP_FUNDING("acceptPspFunding"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_COUNTRIES("acceptTransactionInRestrictedCountries"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_COUNTRIES_COMMERCIAL("acceptTransactionInRestrictedCountriesCommercial"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_COUNTRIES_CONSUMER("acceptTransactionInRestrictedCountriesConsumer"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_INDUSTRIES("acceptTransactionInRestrictedIndustries"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_INDUSTRIES_COMMERCIAL("acceptTransactionInRestrictedIndustriesCommercial"),
    
    ACCEPT_TRANSACTION_IN_RESTRICTED_INDUSTRIES_CONSUMER("acceptTransactionInRestrictedIndustriesConsumer"),
    
    ACQUIRING("acquiring"),
    
    ATM_WITHDRAWAL("atmWithdrawal"),
    
    ATM_WITHDRAWAL_COMMERCIAL("atmWithdrawalCommercial"),
    
    ATM_WITHDRAWAL_CONSUMER("atmWithdrawalConsumer"),
    
    ATM_WITHDRAWAL_IN_RESTRICTED_COUNTRIES("atmWithdrawalInRestrictedCountries"),
    
    ATM_WITHDRAWAL_IN_RESTRICTED_COUNTRIES_COMMERCIAL("atmWithdrawalInRestrictedCountriesCommercial"),
    
    ATM_WITHDRAWAL_IN_RESTRICTED_COUNTRIES_CONSUMER("atmWithdrawalInRestrictedCountriesConsumer"),
    
    AUTHORISED_PAYMENT_INSTRUMENT_USER("authorisedPaymentInstrumentUser"),
    
    GET_GRANT_OFFERS("getGrantOffers"),
    
    ISSUE_BANK_ACCOUNT("issueBankAccount"),
    
    ISSUE_CARD("issueCard"),
    
    ISSUE_CARD_COMMERCIAL("issueCardCommercial"),
    
    ISSUE_CARD_CONSUMER("issueCardConsumer"),
    
    LOCAL_ACCEPTANCE("localAcceptance"),
    
    PAYOUT("payout"),
    
    PAYOUT_TO_TRANSFER_INSTRUMENT("payoutToTransferInstrument"),
    
    PROCESSING("processing"),
    
    RECEIVE_FROM_BALANCE_ACCOUNT("receiveFromBalanceAccount"),
    
    RECEIVE_FROM_PLATFORM_PAYMENTS("receiveFromPlatformPayments"),
    
    RECEIVE_FROM_THIRD_PARTY("receiveFromThirdParty"),
    
    RECEIVE_FROM_TRANSFER_INSTRUMENT("receiveFromTransferInstrument"),
    
    RECEIVE_GRANTS("receiveGrants"),
    
    RECEIVE_PAYMENTS("receivePayments"),
    
    SEND_TO_BALANCE_ACCOUNT("sendToBalanceAccount"),
    
    SEND_TO_THIRD_PARTY("sendToThirdParty"),
    
    SEND_TO_TRANSFER_INSTRUMENT("sendToTransferInstrument"),
    
    THIRD_PARTY_FUNDING("thirdPartyFunding"),
    
    USE_CARD("useCard"),
    
    USE_CARD_COMMERCIAL("useCardCommercial"),
    
    USE_CARD_CONSUMER("useCardConsumer"),
    
    USE_CARD_IN_RESTRICTED_COUNTRIES("useCardInRestrictedCountries"),
    
    USE_CARD_IN_RESTRICTED_COUNTRIES_COMMERCIAL("useCardInRestrictedCountriesCommercial"),
    
    USE_CARD_IN_RESTRICTED_COUNTRIES_CONSUMER("useCardInRestrictedCountriesConsumer"),
    
    USE_CARD_IN_RESTRICTED_INDUSTRIES("useCardInRestrictedIndustries"),
    
    USE_CARD_IN_RESTRICTED_INDUSTRIES_COMMERCIAL("useCardInRestrictedIndustriesCommercial"),
    
    USE_CARD_IN_RESTRICTED_INDUSTRIES_CONSUMER("useCardInRestrictedIndustriesConsumer"),
    
    WITHDRAW_FROM_ATM("withdrawFromAtm"),
    
    WITHDRAW_FROM_ATM_COMMERCIAL("withdrawFromAtmCommercial"),
    
    WITHDRAW_FROM_ATM_CONSUMER("withdrawFromAtmConsumer"),
    
    WITHDRAW_FROM_ATM_IN_RESTRICTED_COUNTRIES("withdrawFromAtmInRestrictedCountries"),
    
    WITHDRAW_FROM_ATM_IN_RESTRICTED_COUNTRIES_COMMERCIAL("withdrawFromAtmInRestrictedCountriesCommercial"),
    
    WITHDRAW_FROM_ATM_IN_RESTRICTED_COUNTRIES_CONSUMER("withdrawFromAtmInRestrictedCountriesConsumer");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapabilitiesEnum fromValue(String value) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CapabilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapabilitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapabilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CapabilitiesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CapabilitiesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<CapabilitiesEnum> capabilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REMEDIATING_ACTIONS = "remediatingActions";
  @SerializedName(SERIALIZED_NAME_REMEDIATING_ACTIONS)
  private List<RemediatingAction> remediatingActions = new ArrayList<>();

  /**
   * The type of error.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DATA_MISSING("dataMissing"),
    
    INVALID_INPUT("invalidInput"),
    
    PENDING_STATUS("pendingStatus");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public VerificationErrorRecursive() {
  }

  public VerificationErrorRecursive capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public VerificationErrorRecursive addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
   */
  @javax.annotation.Nullable
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }


  public VerificationErrorRecursive code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The general error code.
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public VerificationErrorRecursive message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The general error message.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public VerificationErrorRecursive remediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
    return this;
  }

  public VerificationErrorRecursive addRemediatingActionsItem(RemediatingAction remediatingActionsItem) {
    if (this.remediatingActions == null) {
      this.remediatingActions = new ArrayList<>();
    }
    this.remediatingActions.add(remediatingActionsItem);
    return this;
  }

  /**
   * An object containing possible solutions to fix a verification error.
   * @return remediatingActions
   */
  @javax.annotation.Nullable
  public List<RemediatingAction> getRemediatingActions() {
    return remediatingActions;
  }

  public void setRemediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
  }


  public VerificationErrorRecursive type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationErrorRecursive verificationErrorRecursive = (VerificationErrorRecursive) o;
    return Objects.equals(this.capabilities, verificationErrorRecursive.capabilities) &&
        Objects.equals(this.code, verificationErrorRecursive.code) &&
        Objects.equals(this.message, verificationErrorRecursive.message) &&
        Objects.equals(this.remediatingActions, verificationErrorRecursive.remediatingActions) &&
        Objects.equals(this.type, verificationErrorRecursive.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, code, message, remediatingActions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationErrorRecursive {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    remediatingActions: ").append(toIndentedString(remediatingActions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("capabilities");
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("remediatingActions");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VerificationErrorRecursive
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerificationErrorRecursive.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationErrorRecursive is not found in the empty JSON string", VerificationErrorRecursive.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VerificationErrorRecursive.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerificationErrorRecursive` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull() && !jsonObj.get("capabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("capabilities").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("remediatingActions") != null && !jsonObj.get("remediatingActions").isJsonNull()) {
        JsonArray jsonArrayremediatingActions = jsonObj.getAsJsonArray("remediatingActions");
        if (jsonArrayremediatingActions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("remediatingActions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `remediatingActions` to be an array in the JSON string but got `%s`", jsonObj.get("remediatingActions").toString()));
          }

          // validate the optional field `remediatingActions` (array)
          for (int i = 0; i < jsonArrayremediatingActions.size(); i++) {
            RemediatingAction.validateJsonElement(jsonArrayremediatingActions.get(i));
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationErrorRecursive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationErrorRecursive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationErrorRecursive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationErrorRecursive.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationErrorRecursive>() {
           @Override
           public void write(JsonWriter out, VerificationErrorRecursive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerificationErrorRecursive read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VerificationErrorRecursive given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationErrorRecursive
   * @throws IOException if the JSON string is invalid with respect to VerificationErrorRecursive
   */
  public static VerificationErrorRecursive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationErrorRecursive.class);
  }

  /**
   * Convert an instance of VerificationErrorRecursive to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

