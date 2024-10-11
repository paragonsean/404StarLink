/*
 * Playable Locations API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationList;

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
 *  Response for the SamplePlayableLocations method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:48.084666-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse {
  public static final String SERIALIZED_NAME_LOCATIONS_PER_GAME_OBJECT_TYPE = "locationsPerGameObjectType";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_PER_GAME_OBJECT_TYPE)
  private Map<String, GoogleMapsPlayablelocationsV3SamplePlayableLocationList> locationsPerGameObjectType = new HashMap<>();

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse() {
  }

  public GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse locationsPerGameObjectType(Map<String, GoogleMapsPlayablelocationsV3SamplePlayableLocationList> locationsPerGameObjectType) {
    this.locationsPerGameObjectType = locationsPerGameObjectType;
    return this;
  }

  public GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse putLocationsPerGameObjectTypeItem(String key, GoogleMapsPlayablelocationsV3SamplePlayableLocationList locationsPerGameObjectTypeItem) {
    if (this.locationsPerGameObjectType == null) {
      this.locationsPerGameObjectType = new HashMap<>();
    }
    this.locationsPerGameObjectType.put(key, locationsPerGameObjectTypeItem);
    return this;
  }

  /**
   * Each PlayableLocation object corresponds to a game_object_type specified in the request.
   * @return locationsPerGameObjectType
   */
  @javax.annotation.Nullable
  public Map<String, GoogleMapsPlayablelocationsV3SamplePlayableLocationList> getLocationsPerGameObjectType() {
    return locationsPerGameObjectType;
  }

  public void setLocationsPerGameObjectType(Map<String, GoogleMapsPlayablelocationsV3SamplePlayableLocationList> locationsPerGameObjectType) {
    this.locationsPerGameObjectType = locationsPerGameObjectType;
  }


  public GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Required. Specifies the \&quot;time-to-live\&quot; for the set of playable locations. You can use this value to determine how long to cache the set of playable locations. After this length of time, your back-end game server should issue a new SamplePlayableLocations request to get a fresh set of playable locations (because for example, they might have been removed, a park might have closed for the day, a business might have closed permanently).
   * @return ttl
   */
  @javax.annotation.Nullable
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse googleMapsPlayablelocationsV3SamplePlayableLocationsResponse = (GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse) o;
    return Objects.equals(this.locationsPerGameObjectType, googleMapsPlayablelocationsV3SamplePlayableLocationsResponse.locationsPerGameObjectType) &&
        Objects.equals(this.ttl, googleMapsPlayablelocationsV3SamplePlayableLocationsResponse.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationsPerGameObjectType, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse {\n");
    sb.append("    locationsPerGameObjectType: ").append(toIndentedString(locationsPerGameObjectType)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("locationsPerGameObjectType");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse is not found in the empty JSON string", GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse
   */
  public static GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.class);
  }

  /**
   * Convert an instance of GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

