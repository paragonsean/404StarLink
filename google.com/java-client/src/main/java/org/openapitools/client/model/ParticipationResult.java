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
import org.openapitools.client.model.Key;
import org.openapitools.client.model.MissedParticipationCountDetails;

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
 * Represents a result from querying for participation stats for an account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ParticipationResult {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Key key;

  public static final String SERIALIZED_NAME_MISSED_PARTICIPATION_COUNT = "missedParticipationCount";
  @SerializedName(SERIALIZED_NAME_MISSED_PARTICIPATION_COUNT)
  private String missedParticipationCount;

  public static final String SERIALIZED_NAME_MISSED_PARTICIPATION_COUNT_DETAILS = "missedParticipationCountDetails";
  @SerializedName(SERIALIZED_NAME_MISSED_PARTICIPATION_COUNT_DETAILS)
  private MissedParticipationCountDetails missedParticipationCountDetails;

  public static final String SERIALIZED_NAME_OPPORTUNITY_COUNT = "opportunityCount";
  @SerializedName(SERIALIZED_NAME_OPPORTUNITY_COUNT)
  private String opportunityCount;

  public static final String SERIALIZED_NAME_PARTICIPATION_COUNT = "participationCount";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION_COUNT)
  private String participationCount;

  public static final String SERIALIZED_NAME_PARTICIPATION_PERCENT = "participationPercent";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION_PERCENT)
  private Double participationPercent;

  public static final String SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME = "partnerHotelDisplayName";
  @SerializedName(SERIALIZED_NAME_PARTNER_HOTEL_DISPLAY_NAME)
  private String partnerHotelDisplayName;

  public ParticipationResult() {
  }

  public ParticipationResult key(Key key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public Key getKey() {
    return key;
  }

  public void setKey(Key key) {
    this.key = key;
  }


  public ParticipationResult missedParticipationCount(String missedParticipationCount) {
    this.missedParticipationCount = missedParticipationCount;
    return this;
  }

  /**
   * The total number of opportunities **not** eligible for the Google Ads auction process. Comprised of the following: * Landing page missing * Price missing * Price problem * Price unavailable * Other
   * @return missedParticipationCount
   */
  @javax.annotation.Nullable
  public String getMissedParticipationCount() {
    return missedParticipationCount;
  }

  public void setMissedParticipationCount(String missedParticipationCount) {
    this.missedParticipationCount = missedParticipationCount;
  }


  public ParticipationResult missedParticipationCountDetails(MissedParticipationCountDetails missedParticipationCountDetails) {
    this.missedParticipationCountDetails = missedParticipationCountDetails;
    return this;
  }

  /**
   * Get missedParticipationCountDetails
   * @return missedParticipationCountDetails
   */
  @javax.annotation.Nullable
  public MissedParticipationCountDetails getMissedParticipationCountDetails() {
    return missedParticipationCountDetails;
  }

  public void setMissedParticipationCountDetails(MissedParticipationCountDetails missedParticipationCountDetails) {
    this.missedParticipationCountDetails = missedParticipationCountDetails;
  }


  public ParticipationResult opportunityCount(String opportunityCount) {
    this.opportunityCount = opportunityCount;
    return this;
  }

  /**
   * For a specific hotel, the total number of opportunities that were available. Opportunities are the total number of instances when a hotel ad could have been displayed to a user.
   * @return opportunityCount
   */
  @javax.annotation.Nullable
  public String getOpportunityCount() {
    return opportunityCount;
  }

  public void setOpportunityCount(String opportunityCount) {
    this.opportunityCount = opportunityCount;
  }


  public ParticipationResult participationCount(String participationCount) {
    this.participationCount = participationCount;
    return this;
  }

  /**
   * The total number of opportunities for which you were eligible to enter in the Google Ads auction process.
   * @return participationCount
   */
  @javax.annotation.Nullable
  public String getParticipationCount() {
    return participationCount;
  }

  public void setParticipationCount(String participationCount) {
    this.participationCount = participationCount;
  }


  public ParticipationResult participationPercent(Double participationPercent) {
    this.participationPercent = participationPercent;
    return this;
  }

  /**
   * The percentage rate of participation where the number of successfully participated opportunities is divided by the total number of opportunities. For example, if a property was eligible to enter the Google Ads auction 90 times out of 100 opportunities, the participation rate is 90%.
   * @return participationPercent
   */
  @javax.annotation.Nullable
  public Double getParticipationPercent() {
    return participationPercent;
  }

  public void setParticipationPercent(Double participationPercent) {
    this.participationPercent = participationPercent;
  }


  public ParticipationResult partnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
    return this;
  }

  /**
   * Partner&#39;s hotel display name. This field is only populated when the result is aggregated by &#x60;partnerHotelId&#x60;.
   * @return partnerHotelDisplayName
   */
  @javax.annotation.Nullable
  public String getPartnerHotelDisplayName() {
    return partnerHotelDisplayName;
  }

  public void setPartnerHotelDisplayName(String partnerHotelDisplayName) {
    this.partnerHotelDisplayName = partnerHotelDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipationResult participationResult = (ParticipationResult) o;
    return Objects.equals(this.key, participationResult.key) &&
        Objects.equals(this.missedParticipationCount, participationResult.missedParticipationCount) &&
        Objects.equals(this.missedParticipationCountDetails, participationResult.missedParticipationCountDetails) &&
        Objects.equals(this.opportunityCount, participationResult.opportunityCount) &&
        Objects.equals(this.participationCount, participationResult.participationCount) &&
        Objects.equals(this.participationPercent, participationResult.participationPercent) &&
        Objects.equals(this.partnerHotelDisplayName, participationResult.partnerHotelDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, missedParticipationCount, missedParticipationCountDetails, opportunityCount, participationCount, participationPercent, partnerHotelDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipationResult {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    missedParticipationCount: ").append(toIndentedString(missedParticipationCount)).append("\n");
    sb.append("    missedParticipationCountDetails: ").append(toIndentedString(missedParticipationCountDetails)).append("\n");
    sb.append("    opportunityCount: ").append(toIndentedString(opportunityCount)).append("\n");
    sb.append("    participationCount: ").append(toIndentedString(participationCount)).append("\n");
    sb.append("    participationPercent: ").append(toIndentedString(participationPercent)).append("\n");
    sb.append("    partnerHotelDisplayName: ").append(toIndentedString(partnerHotelDisplayName)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("missedParticipationCount");
    openapiFields.add("missedParticipationCountDetails");
    openapiFields.add("opportunityCount");
    openapiFields.add("participationCount");
    openapiFields.add("participationPercent");
    openapiFields.add("partnerHotelDisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ParticipationResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParticipationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParticipationResult is not found in the empty JSON string", ParticipationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParticipationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParticipationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `key`
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) {
        Key.validateJsonElement(jsonObj.get("key"));
      }
      if ((jsonObj.get("missedParticipationCount") != null && !jsonObj.get("missedParticipationCount").isJsonNull()) && !jsonObj.get("missedParticipationCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `missedParticipationCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("missedParticipationCount").toString()));
      }
      // validate the optional field `missedParticipationCountDetails`
      if (jsonObj.get("missedParticipationCountDetails") != null && !jsonObj.get("missedParticipationCountDetails").isJsonNull()) {
        MissedParticipationCountDetails.validateJsonElement(jsonObj.get("missedParticipationCountDetails"));
      }
      if ((jsonObj.get("opportunityCount") != null && !jsonObj.get("opportunityCount").isJsonNull()) && !jsonObj.get("opportunityCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `opportunityCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("opportunityCount").toString()));
      }
      if ((jsonObj.get("participationCount") != null && !jsonObj.get("participationCount").isJsonNull()) && !jsonObj.get("participationCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participationCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participationCount").toString()));
      }
      if ((jsonObj.get("partnerHotelDisplayName") != null && !jsonObj.get("partnerHotelDisplayName").isJsonNull()) && !jsonObj.get("partnerHotelDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerHotelDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerHotelDisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParticipationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParticipationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParticipationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParticipationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ParticipationResult>() {
           @Override
           public void write(JsonWriter out, ParticipationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParticipationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ParticipationResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ParticipationResult
   * @throws IOException if the JSON string is invalid with respect to ParticipationResult
   */
  public static ParticipationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParticipationResult.class);
  }

  /**
   * Convert an instance of ParticipationResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

