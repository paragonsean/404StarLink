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
import org.openapitools.client.model.AcademicCertificateSchemaCertificateData;
import org.openapitools.client.model.AcademicCertificateSchemaIssuedBy;
import org.openapitools.client.model.AcademicCertificateSchemaIssuedTo;

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
 * AcademicCertificateSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:27.520622-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchema {
  public static final String SERIALIZED_NAME_CERTIFICATE_DATA = "CertificateData";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA)
  private AcademicCertificateSchemaCertificateData certificateData;

  public static final String SERIALIZED_NAME_ISSUED_BY = "IssuedBy";
  @SerializedName(SERIALIZED_NAME_ISSUED_BY)
  private AcademicCertificateSchemaIssuedBy issuedBy;

  public static final String SERIALIZED_NAME_ISSUED_TO = "IssuedTo";
  @SerializedName(SERIALIZED_NAME_ISSUED_TO)
  private AcademicCertificateSchemaIssuedTo issuedTo;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issuedAt";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private String issuedAt;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALID_FROM_DATE = "validFromDate";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_DATE)
  private String validFromDate;

  public AcademicCertificateSchema() {
  }

  public AcademicCertificateSchema certificateData(AcademicCertificateSchemaCertificateData certificateData) {
    this.certificateData = certificateData;
    return this;
  }

  /**
   * Get certificateData
   * @return certificateData
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaCertificateData getCertificateData() {
    return certificateData;
  }

  public void setCertificateData(AcademicCertificateSchemaCertificateData certificateData) {
    this.certificateData = certificateData;
  }


  public AcademicCertificateSchema issuedBy(AcademicCertificateSchemaIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

  /**
   * Get issuedBy
   * @return issuedBy
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaIssuedBy getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(AcademicCertificateSchemaIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
  }


  public AcademicCertificateSchema issuedTo(AcademicCertificateSchemaIssuedTo issuedTo) {
    this.issuedTo = issuedTo;
    return this;
  }

  /**
   * Get issuedTo
   * @return issuedTo
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaIssuedTo getIssuedTo() {
    return issuedTo;
  }

  public void setIssuedTo(AcademicCertificateSchemaIssuedTo issuedTo) {
    this.issuedTo = issuedTo;
  }


  public AcademicCertificateSchema issueDate(String issueDate) {
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


  public AcademicCertificateSchema issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nonnull
  public String getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }


  public AcademicCertificateSchema language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public AcademicCertificateSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AcademicCertificateSchema number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nonnull
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public AcademicCertificateSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public AcademicCertificateSchema type(String type) {
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


  public AcademicCertificateSchema validFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
    return this;
  }

  /**
   * Get validFromDate
   * @return validFromDate
   */
  @javax.annotation.Nonnull
  public String getValidFromDate() {
    return validFromDate;
  }

  public void setValidFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchema academicCertificateSchema = (AcademicCertificateSchema) o;
    return Objects.equals(this.certificateData, academicCertificateSchema.certificateData) &&
        Objects.equals(this.issuedBy, academicCertificateSchema.issuedBy) &&
        Objects.equals(this.issuedTo, academicCertificateSchema.issuedTo) &&
        Objects.equals(this.issueDate, academicCertificateSchema.issueDate) &&
        Objects.equals(this.issuedAt, academicCertificateSchema.issuedAt) &&
        Objects.equals(this.language, academicCertificateSchema.language) &&
        Objects.equals(this.name, academicCertificateSchema.name) &&
        Objects.equals(this.number, academicCertificateSchema.number) &&
        Objects.equals(this.status, academicCertificateSchema.status) &&
        Objects.equals(this.type, academicCertificateSchema.type) &&
        Objects.equals(this.validFromDate, academicCertificateSchema.validFromDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateData, issuedBy, issuedTo, issueDate, issuedAt, language, name, number, status, type, validFromDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchema {\n");
    sb.append("    certificateData: ").append(toIndentedString(certificateData)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
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
    openapiFields.add("CertificateData");
    openapiFields.add("IssuedBy");
    openapiFields.add("IssuedTo");
    openapiFields.add("issueDate");
    openapiFields.add("issuedAt");
    openapiFields.add("language");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("validFromDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CertificateData");
    openapiRequiredFields.add("IssuedBy");
    openapiRequiredFields.add("IssuedTo");
    openapiRequiredFields.add("issueDate");
    openapiRequiredFields.add("issuedAt");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("validFromDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchema is not found in the empty JSON string", AcademicCertificateSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CertificateData`
      AcademicCertificateSchemaCertificateData.validateJsonElement(jsonObj.get("CertificateData"));
      // validate the required field `IssuedBy`
      AcademicCertificateSchemaIssuedBy.validateJsonElement(jsonObj.get("IssuedBy"));
      // validate the required field `IssuedTo`
      AcademicCertificateSchemaIssuedTo.validateJsonElement(jsonObj.get("IssuedTo"));
      if (!jsonObj.get("issueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueDate").toString()));
      }
      if (!jsonObj.get("issuedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuedAt").toString()));
      }
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("validFromDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validFromDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validFromDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchema>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchema
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchema
   */
  public static AcademicCertificateSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchema.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

