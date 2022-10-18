/*
 * Location Score
 * Before using this API, we recommend you read our **[Authorization Guide](https://developers.amadeus.com/self-service/apis-docs/guides/authorization-262)** for more information on how to generate an access token.     Please also be aware that our test environment is based on a subset of the production, this API in test only returns a few selected cities. You can find the list in our **[data collection](https://github.com/amadeus4dev/data-collection)**.
 *
 * The version of the OpenAPI document: 1.0.2
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
 * Geographic coordinates describing the position of any location on the surface of Earth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:44.497939-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GeoCode {
  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Float latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Float longitude;

  public GeoCode() {
  }

  public GeoCode latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude of the position expressed in decimal degrees (WSG 84), e.g. 6.244203. A positive value denotes northern hemisphere or the equator, and a negative value denotes southern hemisphere. The number of digits to represent the precision of the coordinate.
   * minimum: -90
   * maximum: 90
   * @return latitude
   */
  @javax.annotation.Nullable
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }


  public GeoCode longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude of the position expressed in decimal degrees (WSG 84), e.g. -75.581211. A positive value denotes east longitude or the prime meridian, and a negative value denotes west longitude.  The number of digits to represent the precision of the coordinate.
   * minimum: -180
   * maximum: 180
   * @return longitude
   */
  @javax.annotation.Nullable
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCode geoCode = (GeoCode) o;
    return Objects.equals(this.latitude, geoCode.latitude) &&
        Objects.equals(this.longitude, geoCode.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCode {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
    openapiFields.add("latitude");
    openapiFields.add("longitude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GeoCode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GeoCode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeoCode is not found in the empty JSON string", GeoCode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GeoCode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GeoCode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeoCode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeoCode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeoCode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeoCode.class));

       return (TypeAdapter<T>) new TypeAdapter<GeoCode>() {
           @Override
           public void write(JsonWriter out, GeoCode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeoCode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GeoCode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GeoCode
   * @throws IOException if the JSON string is invalid with respect to GeoCode
   */
  public static GeoCode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeoCode.class);
  }

  /**
   * Convert an instance of GeoCode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

