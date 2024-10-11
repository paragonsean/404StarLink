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
import org.openapitools.client.model.NoPriceCountDetails;
import org.openapitools.client.model.PriceMissingCountDetails;
import org.openapitools.client.model.PriceProblemCountDetails;
import org.openapitools.client.model.PriceUnavailableCountDetails;

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
 * Missed participation count broken down by reason.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:51.108833-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MissedParticipationCountDetails {
  public static final String SERIALIZED_NAME_HOTEL_SUSPENDED_COUNT = "hotelSuspendedCount";
  @SerializedName(SERIALIZED_NAME_HOTEL_SUSPENDED_COUNT)
  private String hotelSuspendedCount;

  public static final String SERIALIZED_NAME_NO_AVAILABILITY_COUNT = "noAvailabilityCount";
  @SerializedName(SERIALIZED_NAME_NO_AVAILABILITY_COUNT)
  private String noAvailabilityCount;

  public static final String SERIALIZED_NAME_NO_LANDING_PAGE_COUNT = "noLandingPageCount";
  @SerializedName(SERIALIZED_NAME_NO_LANDING_PAGE_COUNT)
  private String noLandingPageCount;

  public static final String SERIALIZED_NAME_NO_PRICE_COUNT = "noPriceCount";
  @SerializedName(SERIALIZED_NAME_NO_PRICE_COUNT)
  private String noPriceCount;

  public static final String SERIALIZED_NAME_NO_PRICE_COUNT_DETAILS = "noPriceCountDetails";
  @SerializedName(SERIALIZED_NAME_NO_PRICE_COUNT_DETAILS)
  private NoPriceCountDetails noPriceCountDetails;

  public static final String SERIALIZED_NAME_NO_TAX_BREAKDOWN_COUNT = "noTaxBreakdownCount";
  @SerializedName(SERIALIZED_NAME_NO_TAX_BREAKDOWN_COUNT)
  private String noTaxBreakdownCount;

  public static final String SERIALIZED_NAME_OTHER_REASON_COUNT = "otherReasonCount";
  @SerializedName(SERIALIZED_NAME_OTHER_REASON_COUNT)
  private String otherReasonCount;

  public static final String SERIALIZED_NAME_PRICE_MISSING_COUNT = "priceMissingCount";
  @SerializedName(SERIALIZED_NAME_PRICE_MISSING_COUNT)
  private String priceMissingCount;

  public static final String SERIALIZED_NAME_PRICE_MISSING_COUNT_DETAILS = "priceMissingCountDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_MISSING_COUNT_DETAILS)
  private PriceMissingCountDetails priceMissingCountDetails;

  public static final String SERIALIZED_NAME_PRICE_PROBLEM_COUNT = "priceProblemCount";
  @SerializedName(SERIALIZED_NAME_PRICE_PROBLEM_COUNT)
  private String priceProblemCount;

  public static final String SERIALIZED_NAME_PRICE_PROBLEM_COUNT_DETAILS = "priceProblemCountDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PROBLEM_COUNT_DETAILS)
  private PriceProblemCountDetails priceProblemCountDetails;

  public static final String SERIALIZED_NAME_PRICE_UNAVAILABLE_COUNT = "priceUnavailableCount";
  @SerializedName(SERIALIZED_NAME_PRICE_UNAVAILABLE_COUNT)
  private String priceUnavailableCount;

  public static final String SERIALIZED_NAME_PRICE_UNAVAILABLE_COUNT_DETAILS = "priceUnavailableCountDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_UNAVAILABLE_COUNT_DETAILS)
  private PriceUnavailableCountDetails priceUnavailableCountDetails;

  public MissedParticipationCountDetails() {
  }

  public MissedParticipationCountDetails hotelSuspendedCount(String hotelSuspendedCount) {
    this.hotelSuspendedCount = hotelSuspendedCount;
    return this;
  }

  /**
   * The total number of missed participations due to one or more of your hotels being suspended due to price accuracy violations.
   * @return hotelSuspendedCount
   */
  @javax.annotation.Nullable
  public String getHotelSuspendedCount() {
    return hotelSuspendedCount;
  }

  public void setHotelSuspendedCount(String hotelSuspendedCount) {
    this.hotelSuspendedCount = hotelSuspendedCount;
  }


  public MissedParticipationCountDetails noAvailabilityCount(String noAvailabilityCount) {
    this.noAvailabilityCount = noAvailabilityCount;
    return this;
  }

  /**
   * The total number of missed participation due to the hotel/itinerary combination being unavailable, or the traveler was ineligible for the rates. To participate in these auctions, you may need to provide more pricing information.
   * @return noAvailabilityCount
   */
  @javax.annotation.Nullable
  public String getNoAvailabilityCount() {
    return noAvailabilityCount;
  }

  public void setNoAvailabilityCount(String noAvailabilityCount) {
    this.noAvailabilityCount = noAvailabilityCount;
  }


  public MissedParticipationCountDetails noLandingPageCount(String noLandingPageCount) {
    this.noLandingPageCount = noLandingPageCount;
    return this;
  }

  /**
   * No landing page matched the user.
   * @return noLandingPageCount
   */
  @javax.annotation.Nullable
  public String getNoLandingPageCount() {
    return noLandingPageCount;
  }

  public void setNoLandingPageCount(String noLandingPageCount) {
    this.noLandingPageCount = noLandingPageCount;
  }


  public MissedParticipationCountDetails noPriceCount(String noPriceCount) {
    this.noPriceCount = noPriceCount;
    return this;
  }

  /**
   * The total number of missed participations due to a price not being offered for the requested itinerary.
   * @return noPriceCount
   */
  @javax.annotation.Nullable
  public String getNoPriceCount() {
    return noPriceCount;
  }

  public void setNoPriceCount(String noPriceCount) {
    this.noPriceCount = noPriceCount;
  }


  public MissedParticipationCountDetails noPriceCountDetails(NoPriceCountDetails noPriceCountDetails) {
    this.noPriceCountDetails = noPriceCountDetails;
    return this;
  }

  /**
   * Get noPriceCountDetails
   * @return noPriceCountDetails
   */
  @javax.annotation.Nullable
  public NoPriceCountDetails getNoPriceCountDetails() {
    return noPriceCountDetails;
  }

  public void setNoPriceCountDetails(NoPriceCountDetails noPriceCountDetails) {
    this.noPriceCountDetails = noPriceCountDetails;
  }


  public MissedParticipationCountDetails noTaxBreakdownCount(String noTaxBreakdownCount) {
    this.noTaxBreakdownCount = noTaxBreakdownCount;
    return this;
  }

  /**
   * The total number of missed participation due to one or more of your hotels not specifying taxes and fees separately.
   * @return noTaxBreakdownCount
   */
  @javax.annotation.Nullable
  public String getNoTaxBreakdownCount() {
    return noTaxBreakdownCount;
  }

  public void setNoTaxBreakdownCount(String noTaxBreakdownCount) {
    this.noTaxBreakdownCount = noTaxBreakdownCount;
  }


  public MissedParticipationCountDetails otherReasonCount(String otherReasonCount) {
    this.otherReasonCount = otherReasonCount;
    return this;
  }

  /**
   * Hotel did not participate for an unknown reason.
   * @return otherReasonCount
   */
  @javax.annotation.Nullable
  public String getOtherReasonCount() {
    return otherReasonCount;
  }

  public void setOtherReasonCount(String otherReasonCount) {
    this.otherReasonCount = otherReasonCount;
  }


  public MissedParticipationCountDetails priceMissingCount(String priceMissingCount) {
    this.priceMissingCount = priceMissingCount;
    return this;
  }

  /**
   * The total number of missed participations due to either a price not being present in Google&#39;s cache or failing to successfully respond to live pricing. Comprised of the following: * Bandwidth depleted * Cache rate missing * Itinerary blocked * Live pricing not set up * Live pricing timeout * Live pricing error
   * @return priceMissingCount
   */
  @javax.annotation.Nullable
  public String getPriceMissingCount() {
    return priceMissingCount;
  }

  public void setPriceMissingCount(String priceMissingCount) {
    this.priceMissingCount = priceMissingCount;
  }


  public MissedParticipationCountDetails priceMissingCountDetails(PriceMissingCountDetails priceMissingCountDetails) {
    this.priceMissingCountDetails = priceMissingCountDetails;
    return this;
  }

  /**
   * Get priceMissingCountDetails
   * @return priceMissingCountDetails
   */
  @javax.annotation.Nullable
  public PriceMissingCountDetails getPriceMissingCountDetails() {
    return priceMissingCountDetails;
  }

  public void setPriceMissingCountDetails(PriceMissingCountDetails priceMissingCountDetails) {
    this.priceMissingCountDetails = priceMissingCountDetails;
  }


  public MissedParticipationCountDetails priceProblemCount(String priceProblemCount) {
    this.priceProblemCount = priceProblemCount;
    return this;
  }

  /**
   * The total number of missed participation due to an issue with the accuracy of the price provided for the itinerary. Comprised of the following: * Hotel suspended * Price unusually high * Price unusually low * Taxes and feeds missing
   * @return priceProblemCount
   */
  @javax.annotation.Nullable
  public String getPriceProblemCount() {
    return priceProblemCount;
  }

  public void setPriceProblemCount(String priceProblemCount) {
    this.priceProblemCount = priceProblemCount;
  }


  public MissedParticipationCountDetails priceProblemCountDetails(PriceProblemCountDetails priceProblemCountDetails) {
    this.priceProblemCountDetails = priceProblemCountDetails;
    return this;
  }

  /**
   * Get priceProblemCountDetails
   * @return priceProblemCountDetails
   */
  @javax.annotation.Nullable
  public PriceProblemCountDetails getPriceProblemCountDetails() {
    return priceProblemCountDetails;
  }

  public void setPriceProblemCountDetails(PriceProblemCountDetails priceProblemCountDetails) {
    this.priceProblemCountDetails = priceProblemCountDetails;
  }


  public MissedParticipationCountDetails priceUnavailableCount(String priceUnavailableCount) {
    this.priceUnavailableCount = priceUnavailableCount;
    return this;
  }

  /**
   * The total number of missed participation due to price listed as unavailable (-1) for the requested itinerary. Comprised of the following: * Price unavailable * Participation not likely * Other
   * @return priceUnavailableCount
   */
  @javax.annotation.Nullable
  public String getPriceUnavailableCount() {
    return priceUnavailableCount;
  }

  public void setPriceUnavailableCount(String priceUnavailableCount) {
    this.priceUnavailableCount = priceUnavailableCount;
  }


  public MissedParticipationCountDetails priceUnavailableCountDetails(PriceUnavailableCountDetails priceUnavailableCountDetails) {
    this.priceUnavailableCountDetails = priceUnavailableCountDetails;
    return this;
  }

  /**
   * Get priceUnavailableCountDetails
   * @return priceUnavailableCountDetails
   */
  @javax.annotation.Nullable
  public PriceUnavailableCountDetails getPriceUnavailableCountDetails() {
    return priceUnavailableCountDetails;
  }

  public void setPriceUnavailableCountDetails(PriceUnavailableCountDetails priceUnavailableCountDetails) {
    this.priceUnavailableCountDetails = priceUnavailableCountDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissedParticipationCountDetails missedParticipationCountDetails = (MissedParticipationCountDetails) o;
    return Objects.equals(this.hotelSuspendedCount, missedParticipationCountDetails.hotelSuspendedCount) &&
        Objects.equals(this.noAvailabilityCount, missedParticipationCountDetails.noAvailabilityCount) &&
        Objects.equals(this.noLandingPageCount, missedParticipationCountDetails.noLandingPageCount) &&
        Objects.equals(this.noPriceCount, missedParticipationCountDetails.noPriceCount) &&
        Objects.equals(this.noPriceCountDetails, missedParticipationCountDetails.noPriceCountDetails) &&
        Objects.equals(this.noTaxBreakdownCount, missedParticipationCountDetails.noTaxBreakdownCount) &&
        Objects.equals(this.otherReasonCount, missedParticipationCountDetails.otherReasonCount) &&
        Objects.equals(this.priceMissingCount, missedParticipationCountDetails.priceMissingCount) &&
        Objects.equals(this.priceMissingCountDetails, missedParticipationCountDetails.priceMissingCountDetails) &&
        Objects.equals(this.priceProblemCount, missedParticipationCountDetails.priceProblemCount) &&
        Objects.equals(this.priceProblemCountDetails, missedParticipationCountDetails.priceProblemCountDetails) &&
        Objects.equals(this.priceUnavailableCount, missedParticipationCountDetails.priceUnavailableCount) &&
        Objects.equals(this.priceUnavailableCountDetails, missedParticipationCountDetails.priceUnavailableCountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelSuspendedCount, noAvailabilityCount, noLandingPageCount, noPriceCount, noPriceCountDetails, noTaxBreakdownCount, otherReasonCount, priceMissingCount, priceMissingCountDetails, priceProblemCount, priceProblemCountDetails, priceUnavailableCount, priceUnavailableCountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissedParticipationCountDetails {\n");
    sb.append("    hotelSuspendedCount: ").append(toIndentedString(hotelSuspendedCount)).append("\n");
    sb.append("    noAvailabilityCount: ").append(toIndentedString(noAvailabilityCount)).append("\n");
    sb.append("    noLandingPageCount: ").append(toIndentedString(noLandingPageCount)).append("\n");
    sb.append("    noPriceCount: ").append(toIndentedString(noPriceCount)).append("\n");
    sb.append("    noPriceCountDetails: ").append(toIndentedString(noPriceCountDetails)).append("\n");
    sb.append("    noTaxBreakdownCount: ").append(toIndentedString(noTaxBreakdownCount)).append("\n");
    sb.append("    otherReasonCount: ").append(toIndentedString(otherReasonCount)).append("\n");
    sb.append("    priceMissingCount: ").append(toIndentedString(priceMissingCount)).append("\n");
    sb.append("    priceMissingCountDetails: ").append(toIndentedString(priceMissingCountDetails)).append("\n");
    sb.append("    priceProblemCount: ").append(toIndentedString(priceProblemCount)).append("\n");
    sb.append("    priceProblemCountDetails: ").append(toIndentedString(priceProblemCountDetails)).append("\n");
    sb.append("    priceUnavailableCount: ").append(toIndentedString(priceUnavailableCount)).append("\n");
    sb.append("    priceUnavailableCountDetails: ").append(toIndentedString(priceUnavailableCountDetails)).append("\n");
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
    openapiFields.add("hotelSuspendedCount");
    openapiFields.add("noAvailabilityCount");
    openapiFields.add("noLandingPageCount");
    openapiFields.add("noPriceCount");
    openapiFields.add("noPriceCountDetails");
    openapiFields.add("noTaxBreakdownCount");
    openapiFields.add("otherReasonCount");
    openapiFields.add("priceMissingCount");
    openapiFields.add("priceMissingCountDetails");
    openapiFields.add("priceProblemCount");
    openapiFields.add("priceProblemCountDetails");
    openapiFields.add("priceUnavailableCount");
    openapiFields.add("priceUnavailableCountDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MissedParticipationCountDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MissedParticipationCountDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MissedParticipationCountDetails is not found in the empty JSON string", MissedParticipationCountDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MissedParticipationCountDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MissedParticipationCountDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hotelSuspendedCount") != null && !jsonObj.get("hotelSuspendedCount").isJsonNull()) && !jsonObj.get("hotelSuspendedCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotelSuspendedCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotelSuspendedCount").toString()));
      }
      if ((jsonObj.get("noAvailabilityCount") != null && !jsonObj.get("noAvailabilityCount").isJsonNull()) && !jsonObj.get("noAvailabilityCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noAvailabilityCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noAvailabilityCount").toString()));
      }
      if ((jsonObj.get("noLandingPageCount") != null && !jsonObj.get("noLandingPageCount").isJsonNull()) && !jsonObj.get("noLandingPageCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noLandingPageCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noLandingPageCount").toString()));
      }
      if ((jsonObj.get("noPriceCount") != null && !jsonObj.get("noPriceCount").isJsonNull()) && !jsonObj.get("noPriceCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noPriceCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noPriceCount").toString()));
      }
      // validate the optional field `noPriceCountDetails`
      if (jsonObj.get("noPriceCountDetails") != null && !jsonObj.get("noPriceCountDetails").isJsonNull()) {
        NoPriceCountDetails.validateJsonElement(jsonObj.get("noPriceCountDetails"));
      }
      if ((jsonObj.get("noTaxBreakdownCount") != null && !jsonObj.get("noTaxBreakdownCount").isJsonNull()) && !jsonObj.get("noTaxBreakdownCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noTaxBreakdownCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noTaxBreakdownCount").toString()));
      }
      if ((jsonObj.get("otherReasonCount") != null && !jsonObj.get("otherReasonCount").isJsonNull()) && !jsonObj.get("otherReasonCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherReasonCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otherReasonCount").toString()));
      }
      if ((jsonObj.get("priceMissingCount") != null && !jsonObj.get("priceMissingCount").isJsonNull()) && !jsonObj.get("priceMissingCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceMissingCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceMissingCount").toString()));
      }
      // validate the optional field `priceMissingCountDetails`
      if (jsonObj.get("priceMissingCountDetails") != null && !jsonObj.get("priceMissingCountDetails").isJsonNull()) {
        PriceMissingCountDetails.validateJsonElement(jsonObj.get("priceMissingCountDetails"));
      }
      if ((jsonObj.get("priceProblemCount") != null && !jsonObj.get("priceProblemCount").isJsonNull()) && !jsonObj.get("priceProblemCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceProblemCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceProblemCount").toString()));
      }
      // validate the optional field `priceProblemCountDetails`
      if (jsonObj.get("priceProblemCountDetails") != null && !jsonObj.get("priceProblemCountDetails").isJsonNull()) {
        PriceProblemCountDetails.validateJsonElement(jsonObj.get("priceProblemCountDetails"));
      }
      if ((jsonObj.get("priceUnavailableCount") != null && !jsonObj.get("priceUnavailableCount").isJsonNull()) && !jsonObj.get("priceUnavailableCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceUnavailableCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceUnavailableCount").toString()));
      }
      // validate the optional field `priceUnavailableCountDetails`
      if (jsonObj.get("priceUnavailableCountDetails") != null && !jsonObj.get("priceUnavailableCountDetails").isJsonNull()) {
        PriceUnavailableCountDetails.validateJsonElement(jsonObj.get("priceUnavailableCountDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MissedParticipationCountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MissedParticipationCountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MissedParticipationCountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MissedParticipationCountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<MissedParticipationCountDetails>() {
           @Override
           public void write(JsonWriter out, MissedParticipationCountDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MissedParticipationCountDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MissedParticipationCountDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MissedParticipationCountDetails
   * @throws IOException if the JSON string is invalid with respect to MissedParticipationCountDetails
   */
  public static MissedParticipationCountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MissedParticipationCountDetails.class);
  }

  /**
   * Convert an instance of MissedParticipationCountDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

