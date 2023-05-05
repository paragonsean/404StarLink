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
 * RefundNotPaidOutTransfersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:02.768054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RefundNotPaidOutTransfersRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_CODE = "accountCode";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CODE)
  private String accountCode;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_CODE)
  private String accountHolderCode;

  public RefundNotPaidOutTransfersRequest() {
  }

  public RefundNotPaidOutTransfersRequest accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * The code of the account from which to perform the refund(s).
   * @return accountCode
   */
  @javax.annotation.Nonnull
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }


  public RefundNotPaidOutTransfersRequest accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

  /**
   * The code of the Account Holder which owns the account from which to perform the refund(s).
   * @return accountHolderCode
   */
  @javax.annotation.Nonnull
  public String getAccountHolderCode() {
    return accountHolderCode;
  }

  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundNotPaidOutTransfersRequest refundNotPaidOutTransfersRequest = (RefundNotPaidOutTransfersRequest) o;
    return Objects.equals(this.accountCode, refundNotPaidOutTransfersRequest.accountCode) &&
        Objects.equals(this.accountHolderCode, refundNotPaidOutTransfersRequest.accountHolderCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, accountHolderCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundNotPaidOutTransfersRequest {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
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
    openapiFields.add("accountCode");
    openapiFields.add("accountHolderCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountCode");
    openapiRequiredFields.add("accountHolderCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RefundNotPaidOutTransfersRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RefundNotPaidOutTransfersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundNotPaidOutTransfersRequest is not found in the empty JSON string", RefundNotPaidOutTransfersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RefundNotPaidOutTransfersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RefundNotPaidOutTransfersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RefundNotPaidOutTransfersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountCode").toString()));
      }
      if (!jsonObj.get("accountHolderCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountHolderCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountHolderCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundNotPaidOutTransfersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundNotPaidOutTransfersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundNotPaidOutTransfersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundNotPaidOutTransfersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundNotPaidOutTransfersRequest>() {
           @Override
           public void write(JsonWriter out, RefundNotPaidOutTransfersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundNotPaidOutTransfersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RefundNotPaidOutTransfersRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RefundNotPaidOutTransfersRequest
   * @throws IOException if the JSON string is invalid with respect to RefundNotPaidOutTransfersRequest
   */
  public static RefundNotPaidOutTransfersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundNotPaidOutTransfersRequest.class);
  }

  /**
   * Convert an instance of RefundNotPaidOutTransfersRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

