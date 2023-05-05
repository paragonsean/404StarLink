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
 * RefundFundsTransferResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:02.768054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RefundFundsTransferResponse {
  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE = "merchantReference";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE)
  private String merchantReference;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ORIGINAL_REFERENCE = "originalReference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REFERENCE)
  private String originalReference;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_SUBMITTED_ASYNC = "submittedAsync";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ASYNC)
  private Boolean submittedAsync;

  public RefundFundsTransferResponse() {
  }

  public RefundFundsTransferResponse merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * The value supplied by the executing user when initiating the transfer refund; may be used to link multiple transactions.
   * @return merchantReference
   */
  @javax.annotation.Nullable
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public RefundFundsTransferResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message of the response.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public RefundFundsTransferResponse originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

  /**
   * A PSP reference of the original fund transfer.
   * @return originalReference
   */
  @javax.annotation.Nullable
  public String getOriginalReference() {
    return originalReference;
  }

  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public RefundFundsTransferResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * The reference of a request. Can be used to uniquely identify the request.
   * @return pspReference
   */
  @javax.annotation.Nullable
  public String getPspReference() {
    return pspReference;
  }

  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public RefundFundsTransferResponse resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  /**
   * The result code.
   * @return resultCode
   */
  @javax.annotation.Nullable
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public RefundFundsTransferResponse submittedAsync(Boolean submittedAsync) {
    this.submittedAsync = submittedAsync;
    return this;
  }

  /**
   * Indicates whether the request is processed asynchronously. Depending on the request&#39;s platform settings, the following scenarios may be applied: * **true**: The request is queued and will be executed when the providing service is available in the order in which the requests are received. * **false**: The processing of the request is immediately attempted; it may result in an error if the providing service is unavailable.
   * @return submittedAsync
   */
  @javax.annotation.Nullable
  public Boolean getSubmittedAsync() {
    return submittedAsync;
  }

  public void setSubmittedAsync(Boolean submittedAsync) {
    this.submittedAsync = submittedAsync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundFundsTransferResponse refundFundsTransferResponse = (RefundFundsTransferResponse) o;
    return Objects.equals(this.merchantReference, refundFundsTransferResponse.merchantReference) &&
        Objects.equals(this.message, refundFundsTransferResponse.message) &&
        Objects.equals(this.originalReference, refundFundsTransferResponse.originalReference) &&
        Objects.equals(this.pspReference, refundFundsTransferResponse.pspReference) &&
        Objects.equals(this.resultCode, refundFundsTransferResponse.resultCode) &&
        Objects.equals(this.submittedAsync, refundFundsTransferResponse.submittedAsync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReference, message, originalReference, pspReference, resultCode, submittedAsync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundFundsTransferResponse {\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    submittedAsync: ").append(toIndentedString(submittedAsync)).append("\n");
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
    openapiFields.add("merchantReference");
    openapiFields.add("message");
    openapiFields.add("originalReference");
    openapiFields.add("pspReference");
    openapiFields.add("resultCode");
    openapiFields.add("submittedAsync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RefundFundsTransferResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RefundFundsTransferResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundFundsTransferResponse is not found in the empty JSON string", RefundFundsTransferResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RefundFundsTransferResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RefundFundsTransferResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchantReference") != null && !jsonObj.get("merchantReference").isJsonNull()) && !jsonObj.get("merchantReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantReference").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("originalReference") != null && !jsonObj.get("originalReference").isJsonNull()) && !jsonObj.get("originalReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalReference").toString()));
      }
      if ((jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonNull()) && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      if ((jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonNull()) && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundFundsTransferResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundFundsTransferResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundFundsTransferResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundFundsTransferResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundFundsTransferResponse>() {
           @Override
           public void write(JsonWriter out, RefundFundsTransferResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundFundsTransferResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RefundFundsTransferResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RefundFundsTransferResponse
   * @throws IOException if the JSON string is invalid with respect to RefundFundsTransferResponse
   */
  public static RefundFundsTransferResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundFundsTransferResponse.class);
  }

  /**
   * Convert an instance of RefundFundsTransferResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

