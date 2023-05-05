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
import org.openapitools.client.model.Amount;

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
 * TransferFundsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:02.768054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TransferFundsRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_DESTINATION_ACCOUNT_CODE = "destinationAccountCode";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ACCOUNT_CODE)
  private String destinationAccountCode;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE = "merchantReference";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE)
  private String merchantReference;

  public static final String SERIALIZED_NAME_SOURCE_ACCOUNT_CODE = "sourceAccountCode";
  @SerializedName(SERIALIZED_NAME_SOURCE_ACCOUNT_CODE)
  private String sourceAccountCode;

  public static final String SERIALIZED_NAME_TRANSFER_CODE = "transferCode";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CODE)
  private String transferCode;

  public TransferFundsRequest() {
  }

  public TransferFundsRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to be transferred.
   * @return amount
   */
  @javax.annotation.Nonnull
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public TransferFundsRequest destinationAccountCode(String destinationAccountCode) {
    this.destinationAccountCode = destinationAccountCode;
    return this;
  }

  /**
   * The code of the account to which the funds are to be credited. &gt;The state of the Account Holder of this account must be Active.
   * @return destinationAccountCode
   */
  @javax.annotation.Nonnull
  public String getDestinationAccountCode() {
    return destinationAccountCode;
  }

  public void setDestinationAccountCode(String destinationAccountCode) {
    this.destinationAccountCode = destinationAccountCode;
  }


  public TransferFundsRequest merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * A value that can be supplied at the discretion of the executing user in order to link multiple transactions to one another.
   * @return merchantReference
   */
  @javax.annotation.Nullable
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public TransferFundsRequest sourceAccountCode(String sourceAccountCode) {
    this.sourceAccountCode = sourceAccountCode;
    return this;
  }

  /**
   * The code of the account from which the funds are to be debited. &gt;The state of the Account Holder of this account must be Active and allow payouts.
   * @return sourceAccountCode
   */
  @javax.annotation.Nonnull
  public String getSourceAccountCode() {
    return sourceAccountCode;
  }

  public void setSourceAccountCode(String sourceAccountCode) {
    this.sourceAccountCode = sourceAccountCode;
  }


  public TransferFundsRequest transferCode(String transferCode) {
    this.transferCode = transferCode;
    return this;
  }

  /**
   * The code related to the type of transfer being performed. &gt;The permitted codes differ for each platform account and are defined in their service level agreement.
   * @return transferCode
   */
  @javax.annotation.Nonnull
  public String getTransferCode() {
    return transferCode;
  }

  public void setTransferCode(String transferCode) {
    this.transferCode = transferCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferFundsRequest transferFundsRequest = (TransferFundsRequest) o;
    return Objects.equals(this.amount, transferFundsRequest.amount) &&
        Objects.equals(this.destinationAccountCode, transferFundsRequest.destinationAccountCode) &&
        Objects.equals(this.merchantReference, transferFundsRequest.merchantReference) &&
        Objects.equals(this.sourceAccountCode, transferFundsRequest.sourceAccountCode) &&
        Objects.equals(this.transferCode, transferFundsRequest.transferCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, destinationAccountCode, merchantReference, sourceAccountCode, transferCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferFundsRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    destinationAccountCode: ").append(toIndentedString(destinationAccountCode)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    sourceAccountCode: ").append(toIndentedString(sourceAccountCode)).append("\n");
    sb.append("    transferCode: ").append(toIndentedString(transferCode)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("destinationAccountCode");
    openapiFields.add("merchantReference");
    openapiFields.add("sourceAccountCode");
    openapiFields.add("transferCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("destinationAccountCode");
    openapiRequiredFields.add("sourceAccountCode");
    openapiRequiredFields.add("transferCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransferFundsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransferFundsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferFundsRequest is not found in the empty JSON string", TransferFundsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransferFundsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferFundsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferFundsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `amount`
      Amount.validateJsonElement(jsonObj.get("amount"));
      if (!jsonObj.get("destinationAccountCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationAccountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationAccountCode").toString()));
      }
      if ((jsonObj.get("merchantReference") != null && !jsonObj.get("merchantReference").isJsonNull()) && !jsonObj.get("merchantReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantReference").toString()));
      }
      if (!jsonObj.get("sourceAccountCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceAccountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceAccountCode").toString()));
      }
      if (!jsonObj.get("transferCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferFundsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferFundsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferFundsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferFundsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferFundsRequest>() {
           @Override
           public void write(JsonWriter out, TransferFundsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferFundsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransferFundsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferFundsRequest
   * @throws IOException if the JSON string is invalid with respect to TransferFundsRequest
   */
  public static TransferFundsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferFundsRequest.class);
  }

  /**
   * Convert an instance of TransferFundsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

