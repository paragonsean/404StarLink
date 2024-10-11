/*
 * Search Ads 360 API
 * The Search Ads 360 API allows developers to automate uploading conversions and downloading reports from Search Ads 360.
 *
 * The version of the OpenAPI document: v2
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
 * A message containing availability data relevant to DoubleClick Search.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:51.374984-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Availability {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_AGENCY_ID = "agencyId";
  @SerializedName(SERIALIZED_NAME_AGENCY_ID)
  private String agencyId;

  public static final String SERIALIZED_NAME_AVAILABILITY_TIMESTAMP = "availabilityTimestamp";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_TIMESTAMP)
  private String availabilityTimestamp;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_SEGMENTATION_ID = "segmentationId";
  @SerializedName(SERIALIZED_NAME_SEGMENTATION_ID)
  private String segmentationId;

  public static final String SERIALIZED_NAME_SEGMENTATION_NAME = "segmentationName";
  @SerializedName(SERIALIZED_NAME_SEGMENTATION_NAME)
  private String segmentationName;

  public static final String SERIALIZED_NAME_SEGMENTATION_TYPE = "segmentationType";
  @SerializedName(SERIALIZED_NAME_SEGMENTATION_TYPE)
  private String segmentationType;

  public Availability() {
  }

  public Availability advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * DS advertiser ID.
   * @return advertiserId
   */
  @javax.annotation.Nullable
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public Availability agencyId(String agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * DS agency ID.
   * @return agencyId
   */
  @javax.annotation.Nullable
  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }


  public Availability availabilityTimestamp(String availabilityTimestamp) {
    this.availabilityTimestamp = availabilityTimestamp;
    return this;
  }

  /**
   * The time by which all conversions have been uploaded, in epoch millis UTC.
   * @return availabilityTimestamp
   */
  @javax.annotation.Nullable
  public String getAvailabilityTimestamp() {
    return availabilityTimestamp;
  }

  public void setAvailabilityTimestamp(String availabilityTimestamp) {
    this.availabilityTimestamp = availabilityTimestamp;
  }


  public Availability customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer ID of a client account in the new Search Ads 360 experience.
   * @return customerId
   */
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public Availability segmentationId(String segmentationId) {
    this.segmentationId = segmentationId;
    return this;
  }

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * @return segmentationId
   */
  @javax.annotation.Nullable
  public String getSegmentationId() {
    return segmentationId;
  }

  public void setSegmentationId(String segmentationId) {
    this.segmentationId = segmentationId;
  }


  public Availability segmentationName(String segmentationName) {
    this.segmentationName = segmentationName;
    return this;
  }

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name).
   * @return segmentationName
   */
  @javax.annotation.Nullable
  public String getSegmentationName() {
    return segmentationName;
  }

  public void setSegmentationName(String segmentationName) {
    this.segmentationName = segmentationName;
  }


  public Availability segmentationType(String segmentationType) {
    this.segmentationType = segmentationType;
    return this;
  }

  /**
   * The segmentation type that this availability is for (its default value is &#x60;FLOODLIGHT&#x60;).
   * @return segmentationType
   */
  @javax.annotation.Nullable
  public String getSegmentationType() {
    return segmentationType;
  }

  public void setSegmentationType(String segmentationType) {
    this.segmentationType = segmentationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Availability availability = (Availability) o;
    return Objects.equals(this.advertiserId, availability.advertiserId) &&
        Objects.equals(this.agencyId, availability.agencyId) &&
        Objects.equals(this.availabilityTimestamp, availability.availabilityTimestamp) &&
        Objects.equals(this.customerId, availability.customerId) &&
        Objects.equals(this.segmentationId, availability.segmentationId) &&
        Objects.equals(this.segmentationName, availability.segmentationName) &&
        Objects.equals(this.segmentationType, availability.segmentationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, agencyId, availabilityTimestamp, customerId, segmentationId, segmentationName, segmentationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Availability {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
    sb.append("    availabilityTimestamp: ").append(toIndentedString(availabilityTimestamp)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    segmentationId: ").append(toIndentedString(segmentationId)).append("\n");
    sb.append("    segmentationName: ").append(toIndentedString(segmentationName)).append("\n");
    sb.append("    segmentationType: ").append(toIndentedString(segmentationType)).append("\n");
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
    openapiFields.add("advertiserId");
    openapiFields.add("agencyId");
    openapiFields.add("availabilityTimestamp");
    openapiFields.add("customerId");
    openapiFields.add("segmentationId");
    openapiFields.add("segmentationName");
    openapiFields.add("segmentationType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Availability
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Availability.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Availability is not found in the empty JSON string", Availability.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Availability.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Availability` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("advertiserId") != null && !jsonObj.get("advertiserId").isJsonNull()) && !jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      if ((jsonObj.get("agencyId") != null && !jsonObj.get("agencyId").isJsonNull()) && !jsonObj.get("agencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agencyId").toString()));
      }
      if ((jsonObj.get("availabilityTimestamp") != null && !jsonObj.get("availabilityTimestamp").isJsonNull()) && !jsonObj.get("availabilityTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availabilityTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availabilityTimestamp").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("segmentationId") != null && !jsonObj.get("segmentationId").isJsonNull()) && !jsonObj.get("segmentationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentationId").toString()));
      }
      if ((jsonObj.get("segmentationName") != null && !jsonObj.get("segmentationName").isJsonNull()) && !jsonObj.get("segmentationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentationName").toString()));
      }
      if ((jsonObj.get("segmentationType") != null && !jsonObj.get("segmentationType").isJsonNull()) && !jsonObj.get("segmentationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentationType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Availability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Availability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Availability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Availability.class));

       return (TypeAdapter<T>) new TypeAdapter<Availability>() {
           @Override
           public void write(JsonWriter out, Availability value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Availability read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Availability given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Availability
   * @throws IOException if the JSON string is invalid with respect to Availability
   */
  public static Availability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Availability.class);
  }

  /**
   * Convert an instance of Availability to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

