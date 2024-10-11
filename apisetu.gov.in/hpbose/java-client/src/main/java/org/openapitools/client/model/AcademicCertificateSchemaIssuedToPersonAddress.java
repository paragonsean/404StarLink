/*
 * Himachal Pradesh Board of School Education, Himachal Pradesh
 * Himachal Pradesh Board of School Education, Dharamshala (http://hpbose.org/) has made available Class X (2012-18) & Class XII (2012-18) provisional certificates, which can be pulled by students into their accounts.
 *
 * The version of the OpenAPI document: 3.0.0
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
 * AcademicCertificateSchemaIssuedToPersonAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:36.074043-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchemaIssuedToPersonAddress {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district;

  public static final String SERIALIZED_NAME_HOUSE = "house";
  @SerializedName(SERIALIZED_NAME_HOUSE)
  private String house;

  public static final String SERIALIZED_NAME_LANDMARK = "landmark";
  @SerializedName(SERIALIZED_NAME_LANDMARK)
  private String landmark;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VTC = "vtc";
  @SerializedName(SERIALIZED_NAME_VTC)
  private String vtc;

  public AcademicCertificateSchemaIssuedToPersonAddress() {
  }

  public AcademicCertificateSchemaIssuedToPersonAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
   */
  @javax.annotation.Nonnull
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress house(String house) {
    this.house = house;
    return this;
  }

  /**
   * Get house
   * @return house
   */
  @javax.annotation.Nonnull
  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
   */
  @javax.annotation.Nonnull
  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
   */
  @javax.annotation.Nonnull
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
   */
  @javax.annotation.Nonnull
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Get locality
   * @return locality
   */
  @javax.annotation.Nonnull
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress pin(String pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
   */
  @javax.annotation.Nonnull
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public AcademicCertificateSchemaIssuedToPersonAddress vtc(String vtc) {
    this.vtc = vtc;
    return this;
  }

  /**
   * Get vtc
   * @return vtc
   */
  @javax.annotation.Nonnull
  public String getVtc() {
    return vtc;
  }

  public void setVtc(String vtc) {
    this.vtc = vtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchemaIssuedToPersonAddress academicCertificateSchemaIssuedToPersonAddress = (AcademicCertificateSchemaIssuedToPersonAddress) o;
    return Objects.equals(this.country, academicCertificateSchemaIssuedToPersonAddress.country) &&
        Objects.equals(this.district, academicCertificateSchemaIssuedToPersonAddress.district) &&
        Objects.equals(this.house, academicCertificateSchemaIssuedToPersonAddress.house) &&
        Objects.equals(this.landmark, academicCertificateSchemaIssuedToPersonAddress.landmark) &&
        Objects.equals(this.line1, academicCertificateSchemaIssuedToPersonAddress.line1) &&
        Objects.equals(this.line2, academicCertificateSchemaIssuedToPersonAddress.line2) &&
        Objects.equals(this.locality, academicCertificateSchemaIssuedToPersonAddress.locality) &&
        Objects.equals(this.pin, academicCertificateSchemaIssuedToPersonAddress.pin) &&
        Objects.equals(this.state, academicCertificateSchemaIssuedToPersonAddress.state) &&
        Objects.equals(this.type, academicCertificateSchemaIssuedToPersonAddress.type) &&
        Objects.equals(this.vtc, academicCertificateSchemaIssuedToPersonAddress.vtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, district, house, landmark, line1, line2, locality, pin, state, type, vtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchemaIssuedToPersonAddress {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vtc: ").append(toIndentedString(vtc)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("district");
    openapiFields.add("house");
    openapiFields.add("landmark");
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("locality");
    openapiFields.add("pin");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("vtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("district");
    openapiRequiredFields.add("house");
    openapiRequiredFields.add("landmark");
    openapiRequiredFields.add("line1");
    openapiRequiredFields.add("line2");
    openapiRequiredFields.add("locality");
    openapiRequiredFields.add("pin");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("vtc");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchemaIssuedToPersonAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchemaIssuedToPersonAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchemaIssuedToPersonAddress is not found in the empty JSON string", AcademicCertificateSchemaIssuedToPersonAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchemaIssuedToPersonAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchemaIssuedToPersonAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchemaIssuedToPersonAddress.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("district").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district").toString()));
      }
      if (!jsonObj.get("house").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `house` to be a primitive type in the JSON string but got `%s`", jsonObj.get("house").toString()));
      }
      if (!jsonObj.get("landmark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landmark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landmark").toString()));
      }
      if (!jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      if (!jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      if (!jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if (!jsonObj.get("pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("vtc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vtc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vtc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchemaIssuedToPersonAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchemaIssuedToPersonAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchemaIssuedToPersonAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchemaIssuedToPersonAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchemaIssuedToPersonAddress>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchemaIssuedToPersonAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchemaIssuedToPersonAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchemaIssuedToPersonAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchemaIssuedToPersonAddress
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchemaIssuedToPersonAddress
   */
  public static AcademicCertificateSchemaIssuedToPersonAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchemaIssuedToPersonAddress.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchemaIssuedToPersonAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

