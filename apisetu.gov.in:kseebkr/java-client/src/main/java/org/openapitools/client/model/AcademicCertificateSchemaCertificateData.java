/*
 * Karnataka Secondary Education Examination Board, Karnataka
 * Karnataka Secondary Education Examination Board (http://kseeb.kar.nic.in) is providing passing certificates of  SSLC(10th Std) of April and June-2018 Examinations.
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
import org.openapitools.client.model.AcademicCertificateSchemaCertificateDataExamination;
import org.openapitools.client.model.AcademicCertificateSchemaCertificateDataPerformance;
import org.openapitools.client.model.AcademicCertificateSchemaCertificateDataSchool;

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
 * AcademicCertificateSchemaCertificateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:51.171889-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchemaCertificateData {
  public static final String SERIALIZED_NAME_EXAMINATION = "Examination";
  @SerializedName(SERIALIZED_NAME_EXAMINATION)
  private AcademicCertificateSchemaCertificateDataExamination examination;

  public static final String SERIALIZED_NAME_PERFORMANCE = "Performance";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE)
  private AcademicCertificateSchemaCertificateDataPerformance performance;

  public static final String SERIALIZED_NAME_SCHOOL = "School";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private AcademicCertificateSchemaCertificateDataSchool school;

  public AcademicCertificateSchemaCertificateData() {
  }

  public AcademicCertificateSchemaCertificateData examination(AcademicCertificateSchemaCertificateDataExamination examination) {
    this.examination = examination;
    return this;
  }

  /**
   * Get examination
   * @return examination
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaCertificateDataExamination getExamination() {
    return examination;
  }

  public void setExamination(AcademicCertificateSchemaCertificateDataExamination examination) {
    this.examination = examination;
  }


  public AcademicCertificateSchemaCertificateData performance(AcademicCertificateSchemaCertificateDataPerformance performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaCertificateDataPerformance getPerformance() {
    return performance;
  }

  public void setPerformance(AcademicCertificateSchemaCertificateDataPerformance performance) {
    this.performance = performance;
  }


  public AcademicCertificateSchemaCertificateData school(AcademicCertificateSchemaCertificateDataSchool school) {
    this.school = school;
    return this;
  }

  /**
   * Get school
   * @return school
   */
  @javax.annotation.Nonnull
  public AcademicCertificateSchemaCertificateDataSchool getSchool() {
    return school;
  }

  public void setSchool(AcademicCertificateSchemaCertificateDataSchool school) {
    this.school = school;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchemaCertificateData academicCertificateSchemaCertificateData = (AcademicCertificateSchemaCertificateData) o;
    return Objects.equals(this.examination, academicCertificateSchemaCertificateData.examination) &&
        Objects.equals(this.performance, academicCertificateSchemaCertificateData.performance) &&
        Objects.equals(this.school, academicCertificateSchemaCertificateData.school);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examination, performance, school);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchemaCertificateData {\n");
    sb.append("    examination: ").append(toIndentedString(examination)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
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
    openapiFields.add("Examination");
    openapiFields.add("Performance");
    openapiFields.add("School");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Examination");
    openapiRequiredFields.add("Performance");
    openapiRequiredFields.add("School");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchemaCertificateData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchemaCertificateData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchemaCertificateData is not found in the empty JSON string", AcademicCertificateSchemaCertificateData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchemaCertificateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchemaCertificateData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchemaCertificateData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Examination`
      AcademicCertificateSchemaCertificateDataExamination.validateJsonElement(jsonObj.get("Examination"));
      // validate the required field `Performance`
      AcademicCertificateSchemaCertificateDataPerformance.validateJsonElement(jsonObj.get("Performance"));
      // validate the required field `School`
      AcademicCertificateSchemaCertificateDataSchool.validateJsonElement(jsonObj.get("School"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchemaCertificateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchemaCertificateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchemaCertificateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchemaCertificateData.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchemaCertificateData>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchemaCertificateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchemaCertificateData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchemaCertificateData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchemaCertificateData
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchemaCertificateData
   */
  public static AcademicCertificateSchemaCertificateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchemaCertificateData.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchemaCertificateData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

