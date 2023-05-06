/*
 * Fund API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Fund API provides endpoints for managing the funds in the accounts on your platform. These management operations include, for example, the transfer of funds from one account to another, the payout of funds to an account holder, and the retrieval of balances in an account.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Fund API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Fund/v6/accountHolderBalance ```
 *
 * The version of the OpenAPI document: 6
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
import org.openapitools.client.model.ErrorFieldType;

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
 * RefundNotPaidOutTransfersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:05.796601-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RefundNotPaidOutTransfersResponse {
  public static final String SERIALIZED_NAME_INVALID_FIELDS = "invalidFields";
  @SerializedName(SERIALIZED_NAME_INVALID_FIELDS)
  private List<ErrorFieldType> invalidFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public RefundNotPaidOutTransfersResponse() {
  }

  public RefundNotPaidOutTransfersResponse invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public RefundNotPaidOutTransfersResponse addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

  /**
   * Contains field validation errors that would prevent requests from being processed.
   * @return invalidFields
   */
  @javax.annotation.Nullable
  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }

  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public RefundNotPaidOutTransfersResponse pspReference(String pspReference) {
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


  public RefundNotPaidOutTransfersResponse resultCode(String resultCode) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundNotPaidOutTransfersResponse refundNotPaidOutTransfersResponse = (RefundNotPaidOutTransfersResponse) o;
    return Objects.equals(this.invalidFields, refundNotPaidOutTransfersResponse.invalidFields) &&
        Objects.equals(this.pspReference, refundNotPaidOutTransfersResponse.pspReference) &&
        Objects.equals(this.resultCode, refundNotPaidOutTransfersResponse.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidFields, pspReference, resultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundNotPaidOutTransfersResponse {\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
    openapiFields.add("invalidFields");
    openapiFields.add("pspReference");
    openapiFields.add("resultCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RefundNotPaidOutTransfersResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RefundNotPaidOutTransfersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundNotPaidOutTransfersResponse is not found in the empty JSON string", RefundNotPaidOutTransfersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RefundNotPaidOutTransfersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RefundNotPaidOutTransfersResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("invalidFields") != null && !jsonObj.get("invalidFields").isJsonNull()) {
        JsonArray jsonArrayinvalidFields = jsonObj.getAsJsonArray("invalidFields");
        if (jsonArrayinvalidFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("invalidFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `invalidFields` to be an array in the JSON string but got `%s`", jsonObj.get("invalidFields").toString()));
          }

          // validate the optional field `invalidFields` (array)
          for (int i = 0; i < jsonArrayinvalidFields.size(); i++) {
            ErrorFieldType.validateJsonElement(jsonArrayinvalidFields.get(i));
          };
        }
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
       if (!RefundNotPaidOutTransfersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundNotPaidOutTransfersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundNotPaidOutTransfersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundNotPaidOutTransfersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundNotPaidOutTransfersResponse>() {
           @Override
           public void write(JsonWriter out, RefundNotPaidOutTransfersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundNotPaidOutTransfersResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RefundNotPaidOutTransfersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RefundNotPaidOutTransfersResponse
   * @throws IOException if the JSON string is invalid with respect to RefundNotPaidOutTransfersResponse
   */
  public static RefundNotPaidOutTransfersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundNotPaidOutTransfersResponse.class);
  }

  /**
   * Convert an instance of RefundNotPaidOutTransfersResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

