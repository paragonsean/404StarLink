/*
 * Transport Department, Daman & Diu
 * Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.
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
 * DrivingLicenseSchemaCertificateDataDrivingLicense
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:27.520622-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DrivingLicenseSchemaCertificateDataDrivingLicense {
  public static final String SERIALIZED_NAME_ABBREVIATION = "abbreviation";
  @SerializedName(SERIALIZED_NAME_ABBREVIATION)
  private String abbreviation;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENDORSE_DATE = "endorseDate";
  @SerializedName(SERIALIZED_NAME_ENDORSE_DATE)
  private String endorseDate;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public DrivingLicenseSchemaCertificateDataDrivingLicense() {
  }

  public DrivingLicenseSchemaCertificateDataDrivingLicense abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
   */
  @javax.annotation.Nonnull
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }


  public DrivingLicenseSchemaCertificateDataDrivingLicense code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public DrivingLicenseSchemaCertificateDataDrivingLicense description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DrivingLicenseSchemaCertificateDataDrivingLicense endorseDate(String endorseDate) {
    this.endorseDate = endorseDate;
    return this;
  }

  /**
   * Get endorseDate
   * @return endorseDate
   */
  @javax.annotation.Nonnull
  public String getEndorseDate() {
    return endorseDate;
  }

  public void setEndorseDate(String endorseDate) {
    this.endorseDate = endorseDate;
  }


  public DrivingLicenseSchemaCertificateDataDrivingLicense issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   */
  @javax.annotation.Nonnull
  public String getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivingLicenseSchemaCertificateDataDrivingLicense drivingLicenseSchemaCertificateDataDrivingLicense = (DrivingLicenseSchemaCertificateDataDrivingLicense) o;
    return Objects.equals(this.abbreviation, drivingLicenseSchemaCertificateDataDrivingLicense.abbreviation) &&
        Objects.equals(this.code, drivingLicenseSchemaCertificateDataDrivingLicense.code) &&
        Objects.equals(this.description, drivingLicenseSchemaCertificateDataDrivingLicense.description) &&
        Objects.equals(this.endorseDate, drivingLicenseSchemaCertificateDataDrivingLicense.endorseDate) &&
        Objects.equals(this.issueDate, drivingLicenseSchemaCertificateDataDrivingLicense.issueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, code, description, endorseDate, issueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivingLicenseSchemaCertificateDataDrivingLicense {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endorseDate: ").append(toIndentedString(endorseDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
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
    openapiFields.add("abbreviation");
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("endorseDate");
    openapiFields.add("issueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("abbreviation");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("endorseDate");
    openapiRequiredFields.add("issueDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DrivingLicenseSchemaCertificateDataDrivingLicense
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DrivingLicenseSchemaCertificateDataDrivingLicense.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DrivingLicenseSchemaCertificateDataDrivingLicense is not found in the empty JSON string", DrivingLicenseSchemaCertificateDataDrivingLicense.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DrivingLicenseSchemaCertificateDataDrivingLicense.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DrivingLicenseSchemaCertificateDataDrivingLicense` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DrivingLicenseSchemaCertificateDataDrivingLicense.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("abbreviation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abbreviation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abbreviation").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("endorseDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endorseDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endorseDate").toString()));
      }
      if (!jsonObj.get("issueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DrivingLicenseSchemaCertificateDataDrivingLicense.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DrivingLicenseSchemaCertificateDataDrivingLicense' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DrivingLicenseSchemaCertificateDataDrivingLicense> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DrivingLicenseSchemaCertificateDataDrivingLicense.class));

       return (TypeAdapter<T>) new TypeAdapter<DrivingLicenseSchemaCertificateDataDrivingLicense>() {
           @Override
           public void write(JsonWriter out, DrivingLicenseSchemaCertificateDataDrivingLicense value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DrivingLicenseSchemaCertificateDataDrivingLicense read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DrivingLicenseSchemaCertificateDataDrivingLicense given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DrivingLicenseSchemaCertificateDataDrivingLicense
   * @throws IOException if the JSON string is invalid with respect to DrivingLicenseSchemaCertificateDataDrivingLicense
   */
  public static DrivingLicenseSchemaCertificateDataDrivingLicense fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DrivingLicenseSchemaCertificateDataDrivingLicense.class);
  }

  /**
   * Convert an instance of DrivingLicenseSchemaCertificateDataDrivingLicense to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

