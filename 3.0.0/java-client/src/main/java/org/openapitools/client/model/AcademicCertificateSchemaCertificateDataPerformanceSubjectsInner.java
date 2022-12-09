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
 * AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:48.787077-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GP = "gp";
  @SerializedName(SERIALIZED_NAME_GP)
  private String gp;

  public static final String SERIALIZED_NAME_GP_MAX = "gpMax";
  @SerializedName(SERIALIZED_NAME_GP_MAX)
  private String gpMax;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_MARKS_MAX = "marksMax";
  @SerializedName(SERIALIZED_NAME_MARKS_MAX)
  private Integer marksMax;

  public static final String SERIALIZED_NAME_MARKS_MAX_PRACTICAL = "marksMaxPractical";
  @SerializedName(SERIALIZED_NAME_MARKS_MAX_PRACTICAL)
  private Integer marksMaxPractical;

  public static final String SERIALIZED_NAME_MARKS_MAX_THEORY = "marksMaxTheory";
  @SerializedName(SERIALIZED_NAME_MARKS_MAX_THEORY)
  private Integer marksMaxTheory;

  public static final String SERIALIZED_NAME_MARKS_PRACTICAL = "marksPractical";
  @SerializedName(SERIALIZED_NAME_MARKS_PRACTICAL)
  private Integer marksPractical;

  public static final String SERIALIZED_NAME_MARKS_THEORY = "marksTheory";
  @SerializedName(SERIALIZED_NAME_MARKS_THEORY)
  private Integer marksTheory;

  public static final String SERIALIZED_NAME_MARKS_TOTAL = "marksTotal";
  @SerializedName(SERIALIZED_NAME_MARKS_TOTAL)
  private Integer marksTotal;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner() {
  }

  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner code(String code) {
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


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner gp(String gp) {
    this.gp = gp;
    return this;
  }

  /**
   * Get gp
   * @return gp
   */
  @javax.annotation.Nonnull
  public String getGp() {
    return gp;
  }

  public void setGp(String gp) {
    this.gp = gp;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner gpMax(String gpMax) {
    this.gpMax = gpMax;
    return this;
  }

  /**
   * Get gpMax
   * @return gpMax
   */
  @javax.annotation.Nonnull
  public String getGpMax() {
    return gpMax;
  }

  public void setGpMax(String gpMax) {
    this.gpMax = gpMax;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
   */
  @javax.annotation.Nonnull
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksMax(Integer marksMax) {
    this.marksMax = marksMax;
    return this;
  }

  /**
   * Get marksMax
   * @return marksMax
   */
  @javax.annotation.Nonnull
  public Integer getMarksMax() {
    return marksMax;
  }

  public void setMarksMax(Integer marksMax) {
    this.marksMax = marksMax;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksMaxPractical(Integer marksMaxPractical) {
    this.marksMaxPractical = marksMaxPractical;
    return this;
  }

  /**
   * Get marksMaxPractical
   * @return marksMaxPractical
   */
  @javax.annotation.Nonnull
  public Integer getMarksMaxPractical() {
    return marksMaxPractical;
  }

  public void setMarksMaxPractical(Integer marksMaxPractical) {
    this.marksMaxPractical = marksMaxPractical;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksMaxTheory(Integer marksMaxTheory) {
    this.marksMaxTheory = marksMaxTheory;
    return this;
  }

  /**
   * Get marksMaxTheory
   * @return marksMaxTheory
   */
  @javax.annotation.Nonnull
  public Integer getMarksMaxTheory() {
    return marksMaxTheory;
  }

  public void setMarksMaxTheory(Integer marksMaxTheory) {
    this.marksMaxTheory = marksMaxTheory;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksPractical(Integer marksPractical) {
    this.marksPractical = marksPractical;
    return this;
  }

  /**
   * Get marksPractical
   * @return marksPractical
   */
  @javax.annotation.Nonnull
  public Integer getMarksPractical() {
    return marksPractical;
  }

  public void setMarksPractical(Integer marksPractical) {
    this.marksPractical = marksPractical;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksTheory(Integer marksTheory) {
    this.marksTheory = marksTheory;
    return this;
  }

  /**
   * Get marksTheory
   * @return marksTheory
   */
  @javax.annotation.Nonnull
  public Integer getMarksTheory() {
    return marksTheory;
  }

  public void setMarksTheory(Integer marksTheory) {
    this.marksTheory = marksTheory;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner marksTotal(Integer marksTotal) {
    this.marksTotal = marksTotal;
    return this;
  }

  /**
   * Get marksTotal
   * @return marksTotal
   */
  @javax.annotation.Nonnull
  public Integer getMarksTotal() {
    return marksTotal;
  }

  public void setMarksTotal(Integer marksTotal) {
    this.marksTotal = marksTotal;
  }


  public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner academicCertificateSchemaCertificateDataPerformanceSubjectsInner = (AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner) o;
    return Objects.equals(this.code, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.code) &&
        Objects.equals(this.gp, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.gp) &&
        Objects.equals(this.gpMax, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.gpMax) &&
        Objects.equals(this.grade, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.grade) &&
        Objects.equals(this.marksMax, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksMax) &&
        Objects.equals(this.marksMaxPractical, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksMaxPractical) &&
        Objects.equals(this.marksMaxTheory, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksMaxTheory) &&
        Objects.equals(this.marksPractical, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksPractical) &&
        Objects.equals(this.marksTheory, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksTheory) &&
        Objects.equals(this.marksTotal, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.marksTotal) &&
        Objects.equals(this.name, academicCertificateSchemaCertificateDataPerformanceSubjectsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, gp, gpMax, grade, marksMax, marksMaxPractical, marksMaxTheory, marksPractical, marksTheory, marksTotal, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    gp: ").append(toIndentedString(gp)).append("\n");
    sb.append("    gpMax: ").append(toIndentedString(gpMax)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    marksMax: ").append(toIndentedString(marksMax)).append("\n");
    sb.append("    marksMaxPractical: ").append(toIndentedString(marksMaxPractical)).append("\n");
    sb.append("    marksMaxTheory: ").append(toIndentedString(marksMaxTheory)).append("\n");
    sb.append("    marksPractical: ").append(toIndentedString(marksPractical)).append("\n");
    sb.append("    marksTheory: ").append(toIndentedString(marksTheory)).append("\n");
    sb.append("    marksTotal: ").append(toIndentedString(marksTotal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("gp");
    openapiFields.add("gpMax");
    openapiFields.add("grade");
    openapiFields.add("marksMax");
    openapiFields.add("marksMaxPractical");
    openapiFields.add("marksMaxTheory");
    openapiFields.add("marksPractical");
    openapiFields.add("marksTheory");
    openapiFields.add("marksTotal");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("gp");
    openapiRequiredFields.add("gpMax");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("marksMax");
    openapiRequiredFields.add("marksMaxPractical");
    openapiRequiredFields.add("marksMaxTheory");
    openapiRequiredFields.add("marksPractical");
    openapiRequiredFields.add("marksTheory");
    openapiRequiredFields.add("marksTotal");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner is not found in the empty JSON string", AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("gp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gp").toString()));
      }
      if (!jsonObj.get("gpMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpMax").toString()));
      }
      if (!jsonObj.get("grade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grade").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
   */
  public static AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

