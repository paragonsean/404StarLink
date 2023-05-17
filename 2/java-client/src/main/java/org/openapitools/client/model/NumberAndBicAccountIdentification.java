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
import org.openapitools.client.model.AdditionalBankIdentification;

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
 * NumberAndBicAccountIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:45.438014-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NumberAndBicAccountIdentification {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ADDITIONAL_BANK_IDENTIFICATION = "additionalBankIdentification";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_BANK_IDENTIFICATION)
  private AdditionalBankIdentification additionalBankIdentification;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  /**
   * **numberAndBic**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_AND_BIC("numberAndBic");

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
  private TypeEnum type = TypeEnum.NUMBER_AND_BIC;

  public NumberAndBicAccountIdentification() {
  }

  public NumberAndBicAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The bank account number, without separators or whitespace. The length and format depends on the bank or country.
   * @return accountNumber
   */
  @javax.annotation.Nonnull
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public NumberAndBicAccountIdentification additionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    this.additionalBankIdentification = additionalBankIdentification;
    return this;
  }

  /**
   * Additional identification codes of the bank. Some banks may require these identifiers for cross-border transfers.
   * @return additionalBankIdentification
   */
  @javax.annotation.Nullable
  public AdditionalBankIdentification getAdditionalBankIdentification() {
    return additionalBankIdentification;
  }

  public void setAdditionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    this.additionalBankIdentification = additionalBankIdentification;
  }


  public NumberAndBicAccountIdentification bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * The bank&#39;s 8- or 11-character BIC or SWIFT code.
   * @return bic
   */
  @javax.annotation.Nonnull
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  public NumberAndBicAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **numberAndBic**
   * @return type
   */
  @javax.annotation.Nonnull
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
    NumberAndBicAccountIdentification numberAndBicAccountIdentification = (NumberAndBicAccountIdentification) o;
    return Objects.equals(this.accountNumber, numberAndBicAccountIdentification.accountNumber) &&
        Objects.equals(this.additionalBankIdentification, numberAndBicAccountIdentification.additionalBankIdentification) &&
        Objects.equals(this.bic, numberAndBicAccountIdentification.bic) &&
        Objects.equals(this.type, numberAndBicAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, additionalBankIdentification, bic, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberAndBicAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    additionalBankIdentification: ").append(toIndentedString(additionalBankIdentification)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
    openapiFields.add("accountNumber");
    openapiFields.add("additionalBankIdentification");
    openapiFields.add("bic");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("bic");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NumberAndBicAccountIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NumberAndBicAccountIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumberAndBicAccountIdentification is not found in the empty JSON string", NumberAndBicAccountIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NumberAndBicAccountIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumberAndBicAccountIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumberAndBicAccountIdentification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      // validate the optional field `additionalBankIdentification`
      if (jsonObj.get("additionalBankIdentification") != null && !jsonObj.get("additionalBankIdentification").isJsonNull()) {
        AdditionalBankIdentification.validateJsonElement(jsonObj.get("additionalBankIdentification"));
      }
      if (!jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumberAndBicAccountIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumberAndBicAccountIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumberAndBicAccountIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumberAndBicAccountIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<NumberAndBicAccountIdentification>() {
           @Override
           public void write(JsonWriter out, NumberAndBicAccountIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumberAndBicAccountIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NumberAndBicAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NumberAndBicAccountIdentification
   * @throws IOException if the JSON string is invalid with respect to NumberAndBicAccountIdentification
   */
  public static NumberAndBicAccountIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumberAndBicAccountIdentification.class);
  }

  /**
   * Convert an instance of NumberAndBicAccountIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

