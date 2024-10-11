/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
 * The reasons that contributed to the price missing count and the total count for each reason.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:51.108833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PriceMissingCountDetails {
  public static final String SERIALIZED_NAME_BANDWIDTH_DEPLETED_COUNT = "bandwidthDepletedCount";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_DEPLETED_COUNT)
  private String bandwidthDepletedCount;

  public static final String SERIALIZED_NAME_CACHE_RATE_MISSING_COUNT = "cacheRateMissingCount";
  @SerializedName(SERIALIZED_NAME_CACHE_RATE_MISSING_COUNT)
  private String cacheRateMissingCount;

  public static final String SERIALIZED_NAME_ITINERARY_BLOCKED_COUNT = "itineraryBlockedCount";
  @SerializedName(SERIALIZED_NAME_ITINERARY_BLOCKED_COUNT)
  private String itineraryBlockedCount;

  public static final String SERIALIZED_NAME_LIVE_PRICING_ERROR_COUNT = "livePricingErrorCount";
  @SerializedName(SERIALIZED_NAME_LIVE_PRICING_ERROR_COUNT)
  private String livePricingErrorCount;

  public static final String SERIALIZED_NAME_LIVE_PRICING_NOT_SETUP_COUNT = "livePricingNotSetupCount";
  @SerializedName(SERIALIZED_NAME_LIVE_PRICING_NOT_SETUP_COUNT)
  private String livePricingNotSetupCount;

  public static final String SERIALIZED_NAME_LIVE_PRICING_TIMEOUT_COUNT = "livePricingTimeoutCount";
  @SerializedName(SERIALIZED_NAME_LIVE_PRICING_TIMEOUT_COUNT)
  private String livePricingTimeoutCount;

  public PriceMissingCountDetails() {
  }

  public PriceMissingCountDetails bandwidthDepletedCount(String bandwidthDepletedCount) {
    this.bandwidthDepletedCount = bandwidthDepletedCount;
    return this;
  }

  /**
   * No price was cached for this itinerary, and there was no live query quota remaining.
   * @return bandwidthDepletedCount
   */
  @javax.annotation.Nullable
  public String getBandwidthDepletedCount() {
    return bandwidthDepletedCount;
  }

  public void setBandwidthDepletedCount(String bandwidthDepletedCount) {
    this.bandwidthDepletedCount = bandwidthDepletedCount;
  }


  public PriceMissingCountDetails cacheRateMissingCount(String cacheRateMissingCount) {
    this.cacheRateMissingCount = cacheRateMissingCount;
    return this;
  }

  /**
   * No price exists in the cache for this itinerary. A live query was not done due to page constraints.
   * @return cacheRateMissingCount
   */
  @javax.annotation.Nullable
  public String getCacheRateMissingCount() {
    return cacheRateMissingCount;
  }

  public void setCacheRateMissingCount(String cacheRateMissingCount) {
    this.cacheRateMissingCount = cacheRateMissingCount;
  }


  public PriceMissingCountDetails itineraryBlockedCount(String itineraryBlockedCount) {
    this.itineraryBlockedCount = itineraryBlockedCount;
    return this;
  }

  /**
   * The itinerary was outside of your basic parameters, so no price was pulled for the itinerary from either live query or cache fill.
   * @return itineraryBlockedCount
   */
  @javax.annotation.Nullable
  public String getItineraryBlockedCount() {
    return itineraryBlockedCount;
  }

  public void setItineraryBlockedCount(String itineraryBlockedCount) {
    this.itineraryBlockedCount = itineraryBlockedCount;
  }


  public PriceMissingCountDetails livePricingErrorCount(String livePricingErrorCount) {
    this.livePricingErrorCount = livePricingErrorCount;
    return this;
  }

  /**
   * No price was cached for this itinerary. A live query did not time out, but your system returned an error.
   * @return livePricingErrorCount
   */
  @javax.annotation.Nullable
  public String getLivePricingErrorCount() {
    return livePricingErrorCount;
  }

  public void setLivePricingErrorCount(String livePricingErrorCount) {
    this.livePricingErrorCount = livePricingErrorCount;
  }


  public PriceMissingCountDetails livePricingNotSetupCount(String livePricingNotSetupCount) {
    this.livePricingNotSetupCount = livePricingNotSetupCount;
    return this;
  }

  /**
   * No price was cached for this itinerary, and live query was not configured for this account.
   * @return livePricingNotSetupCount
   */
  @javax.annotation.Nullable
  public String getLivePricingNotSetupCount() {
    return livePricingNotSetupCount;
  }

  public void setLivePricingNotSetupCount(String livePricingNotSetupCount) {
    this.livePricingNotSetupCount = livePricingNotSetupCount;
  }


  public PriceMissingCountDetails livePricingTimeoutCount(String livePricingTimeoutCount) {
    this.livePricingTimeoutCount = livePricingTimeoutCount;
    return this;
  }

  /**
   * No price was cached for this itinerary, and a live query sent to your system timed out.
   * @return livePricingTimeoutCount
   */
  @javax.annotation.Nullable
  public String getLivePricingTimeoutCount() {
    return livePricingTimeoutCount;
  }

  public void setLivePricingTimeoutCount(String livePricingTimeoutCount) {
    this.livePricingTimeoutCount = livePricingTimeoutCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceMissingCountDetails priceMissingCountDetails = (PriceMissingCountDetails) o;
    return Objects.equals(this.bandwidthDepletedCount, priceMissingCountDetails.bandwidthDepletedCount) &&
        Objects.equals(this.cacheRateMissingCount, priceMissingCountDetails.cacheRateMissingCount) &&
        Objects.equals(this.itineraryBlockedCount, priceMissingCountDetails.itineraryBlockedCount) &&
        Objects.equals(this.livePricingErrorCount, priceMissingCountDetails.livePricingErrorCount) &&
        Objects.equals(this.livePricingNotSetupCount, priceMissingCountDetails.livePricingNotSetupCount) &&
        Objects.equals(this.livePricingTimeoutCount, priceMissingCountDetails.livePricingTimeoutCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthDepletedCount, cacheRateMissingCount, itineraryBlockedCount, livePricingErrorCount, livePricingNotSetupCount, livePricingTimeoutCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceMissingCountDetails {\n");
    sb.append("    bandwidthDepletedCount: ").append(toIndentedString(bandwidthDepletedCount)).append("\n");
    sb.append("    cacheRateMissingCount: ").append(toIndentedString(cacheRateMissingCount)).append("\n");
    sb.append("    itineraryBlockedCount: ").append(toIndentedString(itineraryBlockedCount)).append("\n");
    sb.append("    livePricingErrorCount: ").append(toIndentedString(livePricingErrorCount)).append("\n");
    sb.append("    livePricingNotSetupCount: ").append(toIndentedString(livePricingNotSetupCount)).append("\n");
    sb.append("    livePricingTimeoutCount: ").append(toIndentedString(livePricingTimeoutCount)).append("\n");
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
    openapiFields.add("bandwidthDepletedCount");
    openapiFields.add("cacheRateMissingCount");
    openapiFields.add("itineraryBlockedCount");
    openapiFields.add("livePricingErrorCount");
    openapiFields.add("livePricingNotSetupCount");
    openapiFields.add("livePricingTimeoutCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceMissingCountDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceMissingCountDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceMissingCountDetails is not found in the empty JSON string", PriceMissingCountDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceMissingCountDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceMissingCountDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bandwidthDepletedCount") != null && !jsonObj.get("bandwidthDepletedCount").isJsonNull()) && !jsonObj.get("bandwidthDepletedCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bandwidthDepletedCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bandwidthDepletedCount").toString()));
      }
      if ((jsonObj.get("cacheRateMissingCount") != null && !jsonObj.get("cacheRateMissingCount").isJsonNull()) && !jsonObj.get("cacheRateMissingCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cacheRateMissingCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cacheRateMissingCount").toString()));
      }
      if ((jsonObj.get("itineraryBlockedCount") != null && !jsonObj.get("itineraryBlockedCount").isJsonNull()) && !jsonObj.get("itineraryBlockedCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itineraryBlockedCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itineraryBlockedCount").toString()));
      }
      if ((jsonObj.get("livePricingErrorCount") != null && !jsonObj.get("livePricingErrorCount").isJsonNull()) && !jsonObj.get("livePricingErrorCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `livePricingErrorCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("livePricingErrorCount").toString()));
      }
      if ((jsonObj.get("livePricingNotSetupCount") != null && !jsonObj.get("livePricingNotSetupCount").isJsonNull()) && !jsonObj.get("livePricingNotSetupCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `livePricingNotSetupCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("livePricingNotSetupCount").toString()));
      }
      if ((jsonObj.get("livePricingTimeoutCount") != null && !jsonObj.get("livePricingTimeoutCount").isJsonNull()) && !jsonObj.get("livePricingTimeoutCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `livePricingTimeoutCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("livePricingTimeoutCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceMissingCountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceMissingCountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceMissingCountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceMissingCountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceMissingCountDetails>() {
           @Override
           public void write(JsonWriter out, PriceMissingCountDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceMissingCountDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceMissingCountDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceMissingCountDetails
   * @throws IOException if the JSON string is invalid with respect to PriceMissingCountDetails
   */
  public static PriceMissingCountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceMissingCountDetails.class);
  }

  /**
   * Convert an instance of PriceMissingCountDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

