/*
 * reverb
 * reverb
 *
 * The version of the OpenAPI document: 3.0
 * Contact: integrations@reverb.com
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
 * ConversationsConversationIdOfferPostRequestPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:18.245876-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConversationsConversationIdOfferPostRequestPrice {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  /**
   * The currency the money will be expressed in
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
  public enum CurrencyEnum {
    USD("USD"),
    
    CAD("CAD"),
    
    EUR("EUR"),
    
    GBP("GBP"),
    
    AUD("AUD"),
    
    JPY("JPY"),
    
    NZD("NZD"),
    
    MXN("MXN");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CurrencyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyEnum currency;

  public ConversationsConversationIdOfferPostRequestPrice() {
  }

  public ConversationsConversationIdOfferPostRequestPrice amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of money being expressed, as a POSIX-compliant decimal number
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ConversationsConversationIdOfferPostRequestPrice currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency the money will be expressed in
   * @return currency
   */
  @javax.annotation.Nonnull
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsConversationIdOfferPostRequestPrice conversationsConversationIdOfferPostRequestPrice = (ConversationsConversationIdOfferPostRequestPrice) o;
    return Objects.equals(this.amount, conversationsConversationIdOfferPostRequestPrice.amount) &&
        Objects.equals(this.currency, conversationsConversationIdOfferPostRequestPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsConversationIdOfferPostRequestPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConversationsConversationIdOfferPostRequestPrice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConversationsConversationIdOfferPostRequestPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsConversationIdOfferPostRequestPrice is not found in the empty JSON string", ConversationsConversationIdOfferPostRequestPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConversationsConversationIdOfferPostRequestPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationsConversationIdOfferPostRequestPrice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConversationsConversationIdOfferPostRequestPrice.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `currency`
      CurrencyEnum.validateJsonElement(jsonObj.get("currency"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationsConversationIdOfferPostRequestPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsConversationIdOfferPostRequestPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsConversationIdOfferPostRequestPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsConversationIdOfferPostRequestPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsConversationIdOfferPostRequestPrice>() {
           @Override
           public void write(JsonWriter out, ConversationsConversationIdOfferPostRequestPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationsConversationIdOfferPostRequestPrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConversationsConversationIdOfferPostRequestPrice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConversationsConversationIdOfferPostRequestPrice
   * @throws IOException if the JSON string is invalid with respect to ConversationsConversationIdOfferPostRequestPrice
   */
  public static ConversationsConversationIdOfferPostRequestPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsConversationIdOfferPostRequestPrice.class);
  }

  /**
   * Convert an instance of ConversationsConversationIdOfferPostRequestPrice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

