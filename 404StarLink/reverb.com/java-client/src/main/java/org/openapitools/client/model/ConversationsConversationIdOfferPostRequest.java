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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ConversationsConversationIdOfferPostRequestOfferItemsInner;
import org.openapitools.client.model.ConversationsConversationIdOfferPostRequestPrice;
import org.openapitools.client.model.ConversationsConversationIdOfferPostRequestShippingPrice;

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
 * ConversationsConversationIdOfferPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:18.245876-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConversationsConversationIdOfferPostRequest {
  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LAYAWAY_TERMS_SLUG = "layaway_terms_slug";
  @SerializedName(SERIALIZED_NAME_LAYAWAY_TERMS_SLUG)
  private String layawayTermsSlug;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OFFER_ITEMS = "offer_items";
  @SerializedName(SERIALIZED_NAME_OFFER_ITEMS)
  private List<ConversationsConversationIdOfferPostRequestOfferItemsInner> offerItems = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private ConversationsConversationIdOfferPostRequestPrice price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REGION_CODE = "region_code";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_SHIPPING_PRICE = "shipping_price";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PRICE)
  private ConversationsConversationIdOfferPostRequestShippingPrice shippingPrice;

  public ConversationsConversationIdOfferPostRequest() {
  }

  public ConversationsConversationIdOfferPostRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ConversationsConversationIdOfferPostRequest layawayTermsSlug(String layawayTermsSlug) {
    this.layawayTermsSlug = layawayTermsSlug;
    return this;
  }

  /**
   * Get layawayTermsSlug
   * @return layawayTermsSlug
   */
  @javax.annotation.Nullable
  public String getLayawayTermsSlug() {
    return layawayTermsSlug;
  }

  public void setLayawayTermsSlug(String layawayTermsSlug) {
    this.layawayTermsSlug = layawayTermsSlug;
  }


  public ConversationsConversationIdOfferPostRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message to include with counter offer
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public ConversationsConversationIdOfferPostRequest offerItems(List<ConversationsConversationIdOfferPostRequestOfferItemsInner> offerItems) {
    this.offerItems = offerItems;
    return this;
  }

  public ConversationsConversationIdOfferPostRequest addOfferItemsItem(ConversationsConversationIdOfferPostRequestOfferItemsInner offerItemsItem) {
    if (this.offerItems == null) {
      this.offerItems = new ArrayList<>();
    }
    this.offerItems.add(offerItemsItem);
    return this;
  }

  /**
   * Get offerItems
   * @return offerItems
   */
  @javax.annotation.Nullable
  public List<ConversationsConversationIdOfferPostRequestOfferItemsInner> getOfferItems() {
    return offerItems;
  }

  public void setOfferItems(List<ConversationsConversationIdOfferPostRequestOfferItemsInner> offerItems) {
    this.offerItems = offerItems;
  }


  public ConversationsConversationIdOfferPostRequest price(ConversationsConversationIdOfferPostRequestPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public ConversationsConversationIdOfferPostRequestPrice getPrice() {
    return price;
  }

  public void setPrice(ConversationsConversationIdOfferPostRequestPrice price) {
    this.price = price;
  }


  public ConversationsConversationIdOfferPostRequest quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public ConversationsConversationIdOfferPostRequest recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * ID of the recipient of the offer. Required if you are the seller pushing an offer to a buyer.
   * @return recipientId
   */
  @javax.annotation.Nullable
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public ConversationsConversationIdOfferPostRequest regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Get regionCode
   * @return regionCode
   */
  @javax.annotation.Nullable
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public ConversationsConversationIdOfferPostRequest shippingPrice(ConversationsConversationIdOfferPostRequestShippingPrice shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

  /**
   * Get shippingPrice
   * @return shippingPrice
   */
  @javax.annotation.Nullable
  public ConversationsConversationIdOfferPostRequestShippingPrice getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(ConversationsConversationIdOfferPostRequestShippingPrice shippingPrice) {
    this.shippingPrice = shippingPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsConversationIdOfferPostRequest conversationsConversationIdOfferPostRequest = (ConversationsConversationIdOfferPostRequest) o;
    return Objects.equals(this.countryCode, conversationsConversationIdOfferPostRequest.countryCode) &&
        Objects.equals(this.layawayTermsSlug, conversationsConversationIdOfferPostRequest.layawayTermsSlug) &&
        Objects.equals(this.message, conversationsConversationIdOfferPostRequest.message) &&
        Objects.equals(this.offerItems, conversationsConversationIdOfferPostRequest.offerItems) &&
        Objects.equals(this.price, conversationsConversationIdOfferPostRequest.price) &&
        Objects.equals(this.quantity, conversationsConversationIdOfferPostRequest.quantity) &&
        Objects.equals(this.recipientId, conversationsConversationIdOfferPostRequest.recipientId) &&
        Objects.equals(this.regionCode, conversationsConversationIdOfferPostRequest.regionCode) &&
        Objects.equals(this.shippingPrice, conversationsConversationIdOfferPostRequest.shippingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, layawayTermsSlug, message, offerItems, price, quantity, recipientId, regionCode, shippingPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsConversationIdOfferPostRequest {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    layawayTermsSlug: ").append(toIndentedString(layawayTermsSlug)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    offerItems: ").append(toIndentedString(offerItems)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
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
    openapiFields.add("country_code");
    openapiFields.add("layaway_terms_slug");
    openapiFields.add("message");
    openapiFields.add("offer_items");
    openapiFields.add("price");
    openapiFields.add("quantity");
    openapiFields.add("recipient_id");
    openapiFields.add("region_code");
    openapiFields.add("shipping_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConversationsConversationIdOfferPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConversationsConversationIdOfferPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsConversationIdOfferPostRequest is not found in the empty JSON string", ConversationsConversationIdOfferPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConversationsConversationIdOfferPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationsConversationIdOfferPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("layaway_terms_slug") != null && !jsonObj.get("layaway_terms_slug").isJsonNull()) && !jsonObj.get("layaway_terms_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `layaway_terms_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("layaway_terms_slug").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("offer_items") != null && !jsonObj.get("offer_items").isJsonNull()) {
        JsonArray jsonArrayofferItems = jsonObj.getAsJsonArray("offer_items");
        if (jsonArrayofferItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("offer_items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `offer_items` to be an array in the JSON string but got `%s`", jsonObj.get("offer_items").toString()));
          }

          // validate the optional field `offer_items` (array)
          for (int i = 0; i < jsonArrayofferItems.size(); i++) {
            ConversationsConversationIdOfferPostRequestOfferItemsInner.validateJsonElement(jsonArrayofferItems.get(i));
          };
        }
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        ConversationsConversationIdOfferPostRequestPrice.validateJsonElement(jsonObj.get("price"));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("recipient_id") != null && !jsonObj.get("recipient_id").isJsonNull()) && !jsonObj.get("recipient_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_id").toString()));
      }
      if ((jsonObj.get("region_code") != null && !jsonObj.get("region_code").isJsonNull()) && !jsonObj.get("region_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_code").toString()));
      }
      // validate the optional field `shipping_price`
      if (jsonObj.get("shipping_price") != null && !jsonObj.get("shipping_price").isJsonNull()) {
        ConversationsConversationIdOfferPostRequestShippingPrice.validateJsonElement(jsonObj.get("shipping_price"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationsConversationIdOfferPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsConversationIdOfferPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsConversationIdOfferPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsConversationIdOfferPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsConversationIdOfferPostRequest>() {
           @Override
           public void write(JsonWriter out, ConversationsConversationIdOfferPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationsConversationIdOfferPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConversationsConversationIdOfferPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConversationsConversationIdOfferPostRequest
   * @throws IOException if the JSON string is invalid with respect to ConversationsConversationIdOfferPostRequest
   */
  public static ConversationsConversationIdOfferPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsConversationIdOfferPostRequest.class);
  }

  /**
   * Convert an instance of ConversationsConversationIdOfferPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

