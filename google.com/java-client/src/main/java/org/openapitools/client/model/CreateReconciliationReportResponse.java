/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ReconciliationReport;
import org.openapitools.client.model.ReconciliationReportValidationIssue;

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
 * Response message for ReconciliationReportService.CreateReconciliationReport.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateReconciliationReportResponse {
  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<ReconciliationReportValidationIssue> issues = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECONCILIATION_REPORT = "reconciliationReport";
  @SerializedName(SERIALIZED_NAME_RECONCILIATION_REPORT)
  private ReconciliationReport reconciliationReport;

  public static final String SERIALIZED_NAME_SUCCESSFUL_RECORD_COUNT = "successfulRecordCount";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_RECORD_COUNT)
  private Integer successfulRecordCount;

  public CreateReconciliationReportResponse() {
  }

  public CreateReconciliationReportResponse issues(List<ReconciliationReportValidationIssue> issues) {
    this.issues = issues;
    return this;
  }

  public CreateReconciliationReportResponse addIssuesItem(ReconciliationReportValidationIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * Issues that were encountered when validating the file.
   * @return issues
   */
  @javax.annotation.Nullable
  public List<ReconciliationReportValidationIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<ReconciliationReportValidationIssue> issues) {
    this.issues = issues;
  }


  public CreateReconciliationReportResponse reconciliationReport(ReconciliationReport reconciliationReport) {
    this.reconciliationReport = reconciliationReport;
    return this;
  }

  /**
   * Get reconciliationReport
   * @return reconciliationReport
   */
  @javax.annotation.Nullable
  public ReconciliationReport getReconciliationReport() {
    return reconciliationReport;
  }

  public void setReconciliationReport(ReconciliationReport reconciliationReport) {
    this.reconciliationReport = reconciliationReport;
  }


  public CreateReconciliationReportResponse successfulRecordCount(Integer successfulRecordCount) {
    this.successfulRecordCount = successfulRecordCount;
    return this;
  }

  /**
   * The number of commission records that were successfully saved.
   * @return successfulRecordCount
   */
  @javax.annotation.Nullable
  public Integer getSuccessfulRecordCount() {
    return successfulRecordCount;
  }

  public void setSuccessfulRecordCount(Integer successfulRecordCount) {
    this.successfulRecordCount = successfulRecordCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReconciliationReportResponse createReconciliationReportResponse = (CreateReconciliationReportResponse) o;
    return Objects.equals(this.issues, createReconciliationReportResponse.issues) &&
        Objects.equals(this.reconciliationReport, createReconciliationReportResponse.reconciliationReport) &&
        Objects.equals(this.successfulRecordCount, createReconciliationReportResponse.successfulRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, reconciliationReport, successfulRecordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReconciliationReportResponse {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    reconciliationReport: ").append(toIndentedString(reconciliationReport)).append("\n");
    sb.append("    successfulRecordCount: ").append(toIndentedString(successfulRecordCount)).append("\n");
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
    openapiFields.add("issues");
    openapiFields.add("reconciliationReport");
    openapiFields.add("successfulRecordCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateReconciliationReportResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateReconciliationReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReconciliationReportResponse is not found in the empty JSON string", CreateReconciliationReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateReconciliationReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateReconciliationReportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JsonArray jsonArrayissues = jsonObj.getAsJsonArray("issues");
        if (jsonArrayissues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issues` to be an array in the JSON string but got `%s`", jsonObj.get("issues").toString()));
          }

          // validate the optional field `issues` (array)
          for (int i = 0; i < jsonArrayissues.size(); i++) {
            ReconciliationReportValidationIssue.validateJsonElement(jsonArrayissues.get(i));
          };
        }
      }
      // validate the optional field `reconciliationReport`
      if (jsonObj.get("reconciliationReport") != null && !jsonObj.get("reconciliationReport").isJsonNull()) {
        ReconciliationReport.validateJsonElement(jsonObj.get("reconciliationReport"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReconciliationReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReconciliationReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReconciliationReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReconciliationReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReconciliationReportResponse>() {
           @Override
           public void write(JsonWriter out, CreateReconciliationReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReconciliationReportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateReconciliationReportResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateReconciliationReportResponse
   * @throws IOException if the JSON string is invalid with respect to CreateReconciliationReportResponse
   */
  public static CreateReconciliationReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReconciliationReportResponse.class);
  }

  /**
   * Convert an instance of CreateReconciliationReportResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

