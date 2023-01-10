/*
 * Department of Empowerment of Persons with Disabilities
 * Department of Empowerment of Persons with Disabilities is issuing Unique Disability ID through DigiLocker. These can be pulled by beneficiaries into their DigiLocker accounts.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner;

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
 * AcademicCertificateSchemaCertificateDataPerformance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:09.881505-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AcademicCertificateSchemaCertificateDataPerformance {
  public static final String SERIALIZED_NAME_SUBJECTS = "Subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private List<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner> subjects = new ArrayList<>();

  public static final String SERIALIZED_NAME_CGPA = "cgpa";
  @SerializedName(SERIALIZED_NAME_CGPA)
  private String cgpa;

  public static final String SERIALIZED_NAME_CGPA_MAX = "cgpaMax";
  @SerializedName(SERIALIZED_NAME_CGPA_MAX)
  private String cgpaMax;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_MARKS_MAX = "marksMax";
  @SerializedName(SERIALIZED_NAME_MARKS_MAX)
  private String marksMax;

  public static final String SERIALIZED_NAME_MARKS_TOTAL = "marksTotal";
  @SerializedName(SERIALIZED_NAME_MARKS_TOTAL)
  private String marksTotal;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private String percentage;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RESULT_DATE = "resultDate";
  @SerializedName(SERIALIZED_NAME_RESULT_DATE)
  private String resultDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private String updateDate;

  public AcademicCertificateSchemaCertificateDataPerformance() {
  }

  public AcademicCertificateSchemaCertificateDataPerformance subjects(List<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner> subjects) {
    this.subjects = subjects;
    return this;
  }

  public AcademicCertificateSchemaCertificateDataPerformance addSubjectsItem(AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * Get subjects
   * @return subjects
   */
  @javax.annotation.Nonnull
  public List<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner> subjects) {
    this.subjects = subjects;
  }


  public AcademicCertificateSchemaCertificateDataPerformance cgpa(String cgpa) {
    this.cgpa = cgpa;
    return this;
  }

  /**
   * Get cgpa
   * @return cgpa
   */
  @javax.annotation.Nonnull
  public String getCgpa() {
    return cgpa;
  }

  public void setCgpa(String cgpa) {
    this.cgpa = cgpa;
  }


  public AcademicCertificateSchemaCertificateDataPerformance cgpaMax(String cgpaMax) {
    this.cgpaMax = cgpaMax;
    return this;
  }

  /**
   * Get cgpaMax
   * @return cgpaMax
   */
  @javax.annotation.Nonnull
  public String getCgpaMax() {
    return cgpaMax;
  }

  public void setCgpaMax(String cgpaMax) {
    this.cgpaMax = cgpaMax;
  }


  public AcademicCertificateSchemaCertificateDataPerformance grade(String grade) {
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


  public AcademicCertificateSchemaCertificateDataPerformance marksMax(String marksMax) {
    this.marksMax = marksMax;
    return this;
  }

  /**
   * Get marksMax
   * @return marksMax
   */
  @javax.annotation.Nonnull
  public String getMarksMax() {
    return marksMax;
  }

  public void setMarksMax(String marksMax) {
    this.marksMax = marksMax;
  }


  public AcademicCertificateSchemaCertificateDataPerformance marksTotal(String marksTotal) {
    this.marksTotal = marksTotal;
    return this;
  }

  /**
   * Get marksTotal
   * @return marksTotal
   */
  @javax.annotation.Nonnull
  public String getMarksTotal() {
    return marksTotal;
  }

  public void setMarksTotal(String marksTotal) {
    this.marksTotal = marksTotal;
  }


  public AcademicCertificateSchemaCertificateDataPerformance percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
   */
  @javax.annotation.Nonnull
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  public AcademicCertificateSchemaCertificateDataPerformance result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nonnull
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public AcademicCertificateSchemaCertificateDataPerformance resultDate(String resultDate) {
    this.resultDate = resultDate;
    return this;
  }

  /**
   * Get resultDate
   * @return resultDate
   */
  @javax.annotation.Nonnull
  public String getResultDate() {
    return resultDate;
  }

  public void setResultDate(String resultDate) {
    this.resultDate = resultDate;
  }


  public AcademicCertificateSchemaCertificateDataPerformance updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   */
  @javax.annotation.Nonnull
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicCertificateSchemaCertificateDataPerformance academicCertificateSchemaCertificateDataPerformance = (AcademicCertificateSchemaCertificateDataPerformance) o;
    return Objects.equals(this.subjects, academicCertificateSchemaCertificateDataPerformance.subjects) &&
        Objects.equals(this.cgpa, academicCertificateSchemaCertificateDataPerformance.cgpa) &&
        Objects.equals(this.cgpaMax, academicCertificateSchemaCertificateDataPerformance.cgpaMax) &&
        Objects.equals(this.grade, academicCertificateSchemaCertificateDataPerformance.grade) &&
        Objects.equals(this.marksMax, academicCertificateSchemaCertificateDataPerformance.marksMax) &&
        Objects.equals(this.marksTotal, academicCertificateSchemaCertificateDataPerformance.marksTotal) &&
        Objects.equals(this.percentage, academicCertificateSchemaCertificateDataPerformance.percentage) &&
        Objects.equals(this.result, academicCertificateSchemaCertificateDataPerformance.result) &&
        Objects.equals(this.resultDate, academicCertificateSchemaCertificateDataPerformance.resultDate) &&
        Objects.equals(this.updateDate, academicCertificateSchemaCertificateDataPerformance.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjects, cgpa, cgpaMax, grade, marksMax, marksTotal, percentage, result, resultDate, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicCertificateSchemaCertificateDataPerformance {\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    cgpa: ").append(toIndentedString(cgpa)).append("\n");
    sb.append("    cgpaMax: ").append(toIndentedString(cgpaMax)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    marksMax: ").append(toIndentedString(marksMax)).append("\n");
    sb.append("    marksTotal: ").append(toIndentedString(marksTotal)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
    openapiFields.add("Subjects");
    openapiFields.add("cgpa");
    openapiFields.add("cgpaMax");
    openapiFields.add("grade");
    openapiFields.add("marksMax");
    openapiFields.add("marksTotal");
    openapiFields.add("percentage");
    openapiFields.add("result");
    openapiFields.add("resultDate");
    openapiFields.add("updateDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Subjects");
    openapiRequiredFields.add("cgpa");
    openapiRequiredFields.add("cgpaMax");
    openapiRequiredFields.add("grade");
    openapiRequiredFields.add("marksMax");
    openapiRequiredFields.add("marksTotal");
    openapiRequiredFields.add("percentage");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("resultDate");
    openapiRequiredFields.add("updateDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcademicCertificateSchemaCertificateDataPerformance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcademicCertificateSchemaCertificateDataPerformance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcademicCertificateSchemaCertificateDataPerformance is not found in the empty JSON string", AcademicCertificateSchemaCertificateDataPerformance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AcademicCertificateSchemaCertificateDataPerformance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AcademicCertificateSchemaCertificateDataPerformance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcademicCertificateSchemaCertificateDataPerformance.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("Subjects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subjects` to be an array in the JSON string but got `%s`", jsonObj.get("Subjects").toString()));
      }

      JsonArray jsonArraysubjects = jsonObj.getAsJsonArray("Subjects");
      // validate the required field `Subjects` (array)
      for (int i = 0; i < jsonArraysubjects.size(); i++) {
        AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner.validateJsonElement(jsonArraysubjects.get(i));
      };
      if (!jsonObj.get("cgpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cgpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cgpa").toString()));
      }
      if (!jsonObj.get("cgpaMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cgpaMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cgpaMax").toString()));
      }
      if (!jsonObj.get("grade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grade").toString()));
      }
      if (!jsonObj.get("marksMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marksMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marksMax").toString()));
      }
      if (!jsonObj.get("marksTotal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marksTotal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marksTotal").toString()));
      }
      if (!jsonObj.get("percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentage").toString()));
      }
      if (!jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (!jsonObj.get("resultDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultDate").toString()));
      }
      if (!jsonObj.get("updateDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcademicCertificateSchemaCertificateDataPerformance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcademicCertificateSchemaCertificateDataPerformance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcademicCertificateSchemaCertificateDataPerformance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcademicCertificateSchemaCertificateDataPerformance.class));

       return (TypeAdapter<T>) new TypeAdapter<AcademicCertificateSchemaCertificateDataPerformance>() {
           @Override
           public void write(JsonWriter out, AcademicCertificateSchemaCertificateDataPerformance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AcademicCertificateSchemaCertificateDataPerformance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AcademicCertificateSchemaCertificateDataPerformance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcademicCertificateSchemaCertificateDataPerformance
   * @throws IOException if the JSON string is invalid with respect to AcademicCertificateSchemaCertificateDataPerformance
   */
  public static AcademicCertificateSchemaCertificateDataPerformance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcademicCertificateSchemaCertificateDataPerformance.class);
  }

  /**
   * Convert an instance of AcademicCertificateSchemaCertificateDataPerformance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

