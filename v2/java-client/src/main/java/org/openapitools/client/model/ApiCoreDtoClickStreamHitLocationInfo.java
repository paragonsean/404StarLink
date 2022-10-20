/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
 * ApiCoreDtoClickStreamHitLocationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:30.497679-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoClickStreamHitLocationInfo {
  public static final String SERIALIZED_NAME_AREACODE = "areacode";
  @SerializedName(SERIALIZED_NAME_AREACODE)
  private String areacode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_METROCODE = "metrocode";
  @SerializedName(SERIALIZED_NAME_METROCODE)
  private String metrocode;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_POSTALCODE = "postalcode";
  @SerializedName(SERIALIZED_NAME_POSTALCODE)
  private String postalcode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGION_NAME = "regionName";
  @SerializedName(SERIALIZED_NAME_REGION_NAME)
  private String regionName;

  public ApiCoreDtoClickStreamHitLocationInfo() {
  }

  public ApiCoreDtoClickStreamHitLocationInfo areacode(String areacode) {
    this.areacode = areacode;
    return this;
  }

  /**
   * Get areacode
   * @return areacode
   */
  @javax.annotation.Nullable
  public String getAreacode() {
    return areacode;
  }

  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }


  public ApiCoreDtoClickStreamHitLocationInfo city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public ApiCoreDtoClickStreamHitLocationInfo country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public ApiCoreDtoClickStreamHitLocationInfo latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public ApiCoreDtoClickStreamHitLocationInfo longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public ApiCoreDtoClickStreamHitLocationInfo metrocode(String metrocode) {
    this.metrocode = metrocode;
    return this;
  }

  /**
   * Get metrocode
   * @return metrocode
   */
  @javax.annotation.Nullable
  public String getMetrocode() {
    return metrocode;
  }

  public void setMetrocode(String metrocode) {
    this.metrocode = metrocode;
  }


  public ApiCoreDtoClickStreamHitLocationInfo organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public ApiCoreDtoClickStreamHitLocationInfo postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

  /**
   * Get postalcode
   * @return postalcode
   */
  @javax.annotation.Nullable
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }


  public ApiCoreDtoClickStreamHitLocationInfo region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCoreDtoClickStreamHitLocationInfo regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

  /**
   * Get regionName
   * @return regionName
   */
  @javax.annotation.Nullable
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoClickStreamHitLocationInfo apiCoreDtoClickStreamHitLocationInfo = (ApiCoreDtoClickStreamHitLocationInfo) o;
    return Objects.equals(this.areacode, apiCoreDtoClickStreamHitLocationInfo.areacode) &&
        Objects.equals(this.city, apiCoreDtoClickStreamHitLocationInfo.city) &&
        Objects.equals(this.country, apiCoreDtoClickStreamHitLocationInfo.country) &&
        Objects.equals(this.latitude, apiCoreDtoClickStreamHitLocationInfo.latitude) &&
        Objects.equals(this.longitude, apiCoreDtoClickStreamHitLocationInfo.longitude) &&
        Objects.equals(this.metrocode, apiCoreDtoClickStreamHitLocationInfo.metrocode) &&
        Objects.equals(this.organization, apiCoreDtoClickStreamHitLocationInfo.organization) &&
        Objects.equals(this.postalcode, apiCoreDtoClickStreamHitLocationInfo.postalcode) &&
        Objects.equals(this.region, apiCoreDtoClickStreamHitLocationInfo.region) &&
        Objects.equals(this.regionName, apiCoreDtoClickStreamHitLocationInfo.regionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areacode, city, country, latitude, longitude, metrocode, organization, postalcode, region, regionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoClickStreamHitLocationInfo {\n");
    sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    metrocode: ").append(toIndentedString(metrocode)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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
    openapiFields.add("areacode");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("metrocode");
    openapiFields.add("organization");
    openapiFields.add("postalcode");
    openapiFields.add("region");
    openapiFields.add("regionName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoClickStreamHitLocationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoClickStreamHitLocationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoClickStreamHitLocationInfo is not found in the empty JSON string", ApiCoreDtoClickStreamHitLocationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoClickStreamHitLocationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoClickStreamHitLocationInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("areacode") != null && !jsonObj.get("areacode").isJsonNull()) && !jsonObj.get("areacode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `areacode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("areacode").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("metrocode") != null && !jsonObj.get("metrocode").isJsonNull()) && !jsonObj.get("metrocode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrocode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metrocode").toString()));
      }
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("postalcode") != null && !jsonObj.get("postalcode").isJsonNull()) && !jsonObj.get("postalcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalcode").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("regionName") != null && !jsonObj.get("regionName").isJsonNull()) && !jsonObj.get("regionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoClickStreamHitLocationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoClickStreamHitLocationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoClickStreamHitLocationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoClickStreamHitLocationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoClickStreamHitLocationInfo>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoClickStreamHitLocationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoClickStreamHitLocationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoClickStreamHitLocationInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoClickStreamHitLocationInfo
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoClickStreamHitLocationInfo
   */
  public static ApiCoreDtoClickStreamHitLocationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoClickStreamHitLocationInfo.class);
  }

  /**
   * Convert an instance of ApiCoreDtoClickStreamHitLocationInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

