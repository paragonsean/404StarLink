/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
 *
 * The version of the OpenAPI document: v1
 * 
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
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1TransactionDataAddress;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1TransactionDataItem;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1TransactionDataUser;

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
 * Transaction data associated with a payment protected by reCAPTCHA Enterprise. All fields are optional.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:37.006704-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1TransactionData {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private GoogleCloudRecaptchaenterpriseV1TransactionDataAddress billingAddress;

  public static final String SERIALIZED_NAME_CARD_BIN = "cardBin";
  @SerializedName(SERIALIZED_NAME_CARD_BIN)
  private String cardBin;

  public static final String SERIALIZED_NAME_CARD_LAST_FOUR = "cardLastFour";
  @SerializedName(SERIALIZED_NAME_CARD_LAST_FOUR)
  private String cardLastFour;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_GATEWAY_INFO = "gatewayInfo";
  @SerializedName(SERIALIZED_NAME_GATEWAY_INFO)
  private GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo gatewayInfo;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<GoogleCloudRecaptchaenterpriseV1TransactionDataItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private List<GoogleCloudRecaptchaenterpriseV1TransactionDataUser> merchants = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private GoogleCloudRecaptchaenterpriseV1TransactionDataAddress shippingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_VALUE = "shippingValue";
  @SerializedName(SERIALIZED_NAME_SHIPPING_VALUE)
  private Double shippingValue;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private GoogleCloudRecaptchaenterpriseV1TransactionDataUser user;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public GoogleCloudRecaptchaenterpriseV1TransactionData() {
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionData billingAddress(GoogleCloudRecaptchaenterpriseV1TransactionDataAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(GoogleCloudRecaptchaenterpriseV1TransactionDataAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData cardBin(String cardBin) {
    this.cardBin = cardBin;
    return this;
  }

  /**
   * The Bank Identification Number - generally the first 6 or 8 digits of the card.
   * @return cardBin
   */
  @javax.annotation.Nullable
  public String getCardBin() {
    return cardBin;
  }

  public void setCardBin(String cardBin) {
    this.cardBin = cardBin;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData cardLastFour(String cardLastFour) {
    this.cardLastFour = cardLastFour;
    return this;
  }

  /**
   * The last four digits of the card.
   * @return cardLastFour
   */
  @javax.annotation.Nullable
  public String getCardLastFour() {
    return cardLastFour;
  }

  public void setCardLastFour(String cardLastFour) {
    this.cardLastFour = cardLastFour;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code in ISO-4217 format.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData gatewayInfo(GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo gatewayInfo) {
    this.gatewayInfo = gatewayInfo;
    return this;
  }

  /**
   * Get gatewayInfo
   * @return gatewayInfo
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo getGatewayInfo() {
    return gatewayInfo;
  }

  public void setGatewayInfo(GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo gatewayInfo) {
    this.gatewayInfo = gatewayInfo;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData items(List<GoogleCloudRecaptchaenterpriseV1TransactionDataItem> items) {
    this.items = items;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionData addItemsItem(GoogleCloudRecaptchaenterpriseV1TransactionDataItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items purchased in this transaction.
   * @return items
   */
  @javax.annotation.Nullable
  public List<GoogleCloudRecaptchaenterpriseV1TransactionDataItem> getItems() {
    return items;
  }

  public void setItems(List<GoogleCloudRecaptchaenterpriseV1TransactionDataItem> items) {
    this.items = items;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData merchants(List<GoogleCloudRecaptchaenterpriseV1TransactionDataUser> merchants) {
    this.merchants = merchants;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionData addMerchantsItem(GoogleCloudRecaptchaenterpriseV1TransactionDataUser merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * Information about the user or users fulfilling the transaction.
   * @return merchants
   */
  @javax.annotation.Nullable
  public List<GoogleCloudRecaptchaenterpriseV1TransactionDataUser> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<GoogleCloudRecaptchaenterpriseV1TransactionDataUser> merchants) {
    this.merchants = merchants;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method for the transaction. The allowed values are: * credit-card * debit-card * gift-card * processor-{name} (If a third-party is used, for example, processor-paypal) * custom-{name} (If an alternative method is used, for example, custom-crypto)
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData shippingAddress(GoogleCloudRecaptchaenterpriseV1TransactionDataAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1TransactionDataAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(GoogleCloudRecaptchaenterpriseV1TransactionDataAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData shippingValue(Double shippingValue) {
    this.shippingValue = shippingValue;
    return this;
  }

  /**
   * The value of shipping in the specified currency. 0 for free or no shipping.
   * @return shippingValue
   */
  @javax.annotation.Nullable
  public Double getShippingValue() {
    return shippingValue;
  }

  public void setShippingValue(Double shippingValue) {
    this.shippingValue = shippingValue;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction. This custom identifier can be used to reference this transaction in the future, for example, labeling a refund or chargeback event. Two attempts at the same transaction should use the same transaction id.
   * @return transactionId
   */
  @javax.annotation.Nullable
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData user(GoogleCloudRecaptchaenterpriseV1TransactionDataUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser getUser() {
    return user;
  }

  public void setUser(GoogleCloudRecaptchaenterpriseV1TransactionDataUser user) {
    this.user = user;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionData value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The decimal value of the transaction in the specified currency.
   * @return value
   */
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
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
    GoogleCloudRecaptchaenterpriseV1TransactionData googleCloudRecaptchaenterpriseV1TransactionData = (GoogleCloudRecaptchaenterpriseV1TransactionData) o;
    return Objects.equals(this.billingAddress, googleCloudRecaptchaenterpriseV1TransactionData.billingAddress) &&
        Objects.equals(this.cardBin, googleCloudRecaptchaenterpriseV1TransactionData.cardBin) &&
        Objects.equals(this.cardLastFour, googleCloudRecaptchaenterpriseV1TransactionData.cardLastFour) &&
        Objects.equals(this.currencyCode, googleCloudRecaptchaenterpriseV1TransactionData.currencyCode) &&
        Objects.equals(this.gatewayInfo, googleCloudRecaptchaenterpriseV1TransactionData.gatewayInfo) &&
        Objects.equals(this.items, googleCloudRecaptchaenterpriseV1TransactionData.items) &&
        Objects.equals(this.merchants, googleCloudRecaptchaenterpriseV1TransactionData.merchants) &&
        Objects.equals(this.paymentMethod, googleCloudRecaptchaenterpriseV1TransactionData.paymentMethod) &&
        Objects.equals(this.shippingAddress, googleCloudRecaptchaenterpriseV1TransactionData.shippingAddress) &&
        Objects.equals(this.shippingValue, googleCloudRecaptchaenterpriseV1TransactionData.shippingValue) &&
        Objects.equals(this.transactionId, googleCloudRecaptchaenterpriseV1TransactionData.transactionId) &&
        Objects.equals(this.user, googleCloudRecaptchaenterpriseV1TransactionData.user) &&
        Objects.equals(this.value, googleCloudRecaptchaenterpriseV1TransactionData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, cardBin, cardLastFour, currencyCode, gatewayInfo, items, merchants, paymentMethod, shippingAddress, shippingValue, transactionId, user, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1TransactionData {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    cardBin: ").append(toIndentedString(cardBin)).append("\n");
    sb.append("    cardLastFour: ").append(toIndentedString(cardLastFour)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    gatewayInfo: ").append(toIndentedString(gatewayInfo)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingValue: ").append(toIndentedString(shippingValue)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("billingAddress");
    openapiFields.add("cardBin");
    openapiFields.add("cardLastFour");
    openapiFields.add("currencyCode");
    openapiFields.add("gatewayInfo");
    openapiFields.add("items");
    openapiFields.add("merchants");
    openapiFields.add("paymentMethod");
    openapiFields.add("shippingAddress");
    openapiFields.add("shippingValue");
    openapiFields.add("transactionId");
    openapiFields.add("user");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1TransactionData is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1TransactionData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1TransactionData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `billingAddress`
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.validateJsonElement(jsonObj.get("billingAddress"));
      }
      if ((jsonObj.get("cardBin") != null && !jsonObj.get("cardBin").isJsonNull()) && !jsonObj.get("cardBin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardBin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBin").toString()));
      }
      if ((jsonObj.get("cardLastFour") != null && !jsonObj.get("cardLastFour").isJsonNull()) && !jsonObj.get("cardLastFour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardLastFour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardLastFour").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      // validate the optional field `gatewayInfo`
      if (jsonObj.get("gatewayInfo") != null && !jsonObj.get("gatewayInfo").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1TransactionDataGatewayInfo.validateJsonElement(jsonObj.get("gatewayInfo"));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            GoogleCloudRecaptchaenterpriseV1TransactionDataItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if (jsonObj.get("merchants") != null && !jsonObj.get("merchants").isJsonNull()) {
        JsonArray jsonArraymerchants = jsonObj.getAsJsonArray("merchants");
        if (jsonArraymerchants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("merchants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
          }

          // validate the optional field `merchants` (array)
          for (int i = 0; i < jsonArraymerchants.size(); i++) {
            GoogleCloudRecaptchaenterpriseV1TransactionDataUser.validateJsonElement(jsonArraymerchants.get(i));
          };
        }
      }
      if ((jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) && !jsonObj.get("paymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
      // validate the optional field `shippingAddress`
      if (jsonObj.get("shippingAddress") != null && !jsonObj.get("shippingAddress").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1TransactionDataAddress.validateJsonElement(jsonObj.get("shippingAddress"));
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1TransactionDataUser.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1TransactionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1TransactionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1TransactionData.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionData>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1TransactionData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1TransactionData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1TransactionData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1TransactionData
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionData
   */
  public static GoogleCloudRecaptchaenterpriseV1TransactionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1TransactionData.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1TransactionData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

