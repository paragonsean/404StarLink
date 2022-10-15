/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
 * Contact: mike.ralphson@gmail.com
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CreateDatasetImportJobRequestDataSource;
import org.openapitools.client.model.ImportMode;

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
 * DescribeDatasetImportJobResponseDatasetImportJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:35.017884-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeDatasetImportJobResponseDatasetImportJob {
  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_DATASET_IMPORT_JOB_ARN = "datasetImportJobArn";
  @SerializedName(SERIALIZED_NAME_DATASET_IMPORT_JOB_ARN)
  private String datasetImportJobArn;

  public static final String SERIALIZED_NAME_DATASET_ARN = "datasetArn";
  @SerializedName(SERIALIZED_NAME_DATASET_ARN)
  private String datasetArn;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private CreateDatasetImportJobRequestDataSource dataSource;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_IMPORT_MODE = "importMode";
  @SerializedName(SERIALIZED_NAME_IMPORT_MODE)
  private ImportMode importMode;

  public static final String SERIALIZED_NAME_PUBLISH_ATTRIBUTION_METRICS_TO_S3 = "publishAttributionMetricsToS3";
  @SerializedName(SERIALIZED_NAME_PUBLISH_ATTRIBUTION_METRICS_TO_S3)
  private Boolean publishAttributionMetricsToS3;

  public DescribeDatasetImportJobResponseDatasetImportJob() {
  }

  public DescribeDatasetImportJobResponseDatasetImportJob jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Get jobName
   * @return jobName
   */
  @javax.annotation.Nullable
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob datasetImportJobArn(String datasetImportJobArn) {
    this.datasetImportJobArn = datasetImportJobArn;
    return this;
  }

  /**
   * Get datasetImportJobArn
   * @return datasetImportJobArn
   */
  @javax.annotation.Nullable
  public String getDatasetImportJobArn() {
    return datasetImportJobArn;
  }

  public void setDatasetImportJobArn(String datasetImportJobArn) {
    this.datasetImportJobArn = datasetImportJobArn;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob datasetArn(String datasetArn) {
    this.datasetArn = datasetArn;
    return this;
  }

  /**
   * Get datasetArn
   * @return datasetArn
   */
  @javax.annotation.Nullable
  public String getDatasetArn() {
    return datasetArn;
  }

  public void setDatasetArn(String datasetArn) {
    this.datasetArn = datasetArn;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob dataSource(CreateDatasetImportJobRequestDataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   * @return dataSource
   */
  @javax.annotation.Nullable
  public CreateDatasetImportJobRequestDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(CreateDatasetImportJobRequestDataSource dataSource) {
    this.dataSource = dataSource;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nullable
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob importMode(ImportMode importMode) {
    this.importMode = importMode;
    return this;
  }

  /**
   * Get importMode
   * @return importMode
   */
  @javax.annotation.Nullable
  public ImportMode getImportMode() {
    return importMode;
  }

  public void setImportMode(ImportMode importMode) {
    this.importMode = importMode;
  }


  public DescribeDatasetImportJobResponseDatasetImportJob publishAttributionMetricsToS3(Boolean publishAttributionMetricsToS3) {
    this.publishAttributionMetricsToS3 = publishAttributionMetricsToS3;
    return this;
  }

  /**
   * Get publishAttributionMetricsToS3
   * @return publishAttributionMetricsToS3
   */
  @javax.annotation.Nullable
  public Boolean getPublishAttributionMetricsToS3() {
    return publishAttributionMetricsToS3;
  }

  public void setPublishAttributionMetricsToS3(Boolean publishAttributionMetricsToS3) {
    this.publishAttributionMetricsToS3 = publishAttributionMetricsToS3;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDatasetImportJobResponseDatasetImportJob describeDatasetImportJobResponseDatasetImportJob = (DescribeDatasetImportJobResponseDatasetImportJob) o;
    return Objects.equals(this.jobName, describeDatasetImportJobResponseDatasetImportJob.jobName) &&
        Objects.equals(this.datasetImportJobArn, describeDatasetImportJobResponseDatasetImportJob.datasetImportJobArn) &&
        Objects.equals(this.datasetArn, describeDatasetImportJobResponseDatasetImportJob.datasetArn) &&
        Objects.equals(this.dataSource, describeDatasetImportJobResponseDatasetImportJob.dataSource) &&
        Objects.equals(this.roleArn, describeDatasetImportJobResponseDatasetImportJob.roleArn) &&
        Objects.equals(this.status, describeDatasetImportJobResponseDatasetImportJob.status) &&
        Objects.equals(this.creationDateTime, describeDatasetImportJobResponseDatasetImportJob.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeDatasetImportJobResponseDatasetImportJob.lastUpdatedDateTime) &&
        Objects.equals(this.failureReason, describeDatasetImportJobResponseDatasetImportJob.failureReason) &&
        Objects.equals(this.importMode, describeDatasetImportJobResponseDatasetImportJob.importMode) &&
        Objects.equals(this.publishAttributionMetricsToS3, describeDatasetImportJobResponseDatasetImportJob.publishAttributionMetricsToS3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, datasetImportJobArn, datasetArn, dataSource, roleArn, status, creationDateTime, lastUpdatedDateTime, failureReason, importMode, publishAttributionMetricsToS3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDatasetImportJobResponseDatasetImportJob {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    datasetImportJobArn: ").append(toIndentedString(datasetImportJobArn)).append("\n");
    sb.append("    datasetArn: ").append(toIndentedString(datasetArn)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
    sb.append("    publishAttributionMetricsToS3: ").append(toIndentedString(publishAttributionMetricsToS3)).append("\n");
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
    openapiFields.add("jobName");
    openapiFields.add("datasetImportJobArn");
    openapiFields.add("datasetArn");
    openapiFields.add("dataSource");
    openapiFields.add("roleArn");
    openapiFields.add("status");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("failureReason");
    openapiFields.add("importMode");
    openapiFields.add("publishAttributionMetricsToS3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeDatasetImportJobResponseDatasetImportJob
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeDatasetImportJobResponseDatasetImportJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeDatasetImportJobResponseDatasetImportJob is not found in the empty JSON string", DescribeDatasetImportJobResponseDatasetImportJob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeDatasetImportJobResponseDatasetImportJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeDatasetImportJobResponseDatasetImportJob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `jobName`
      if (jsonObj.get("jobName") != null && !jsonObj.get("jobName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("jobName"));
      }
      // validate the optional field `datasetImportJobArn`
      if (jsonObj.get("datasetImportJobArn") != null && !jsonObj.get("datasetImportJobArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetImportJobArn"));
      }
      // validate the optional field `datasetArn`
      if (jsonObj.get("datasetArn") != null && !jsonObj.get("datasetArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetArn"));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        CreateDatasetImportJobRequestDataSource.validateJsonElement(jsonObj.get("dataSource"));
      }
      // validate the optional field `roleArn`
      if (jsonObj.get("roleArn") != null && !jsonObj.get("roleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("roleArn"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `importMode`
      if (jsonObj.get("importMode") != null && !jsonObj.get("importMode").isJsonNull()) {
        ImportMode.validateJsonElement(jsonObj.get("importMode"));
      }
      // validate the optional field `publishAttributionMetricsToS3`
      if (jsonObj.get("publishAttributionMetricsToS3") != null && !jsonObj.get("publishAttributionMetricsToS3").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("publishAttributionMetricsToS3"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeDatasetImportJobResponseDatasetImportJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeDatasetImportJobResponseDatasetImportJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeDatasetImportJobResponseDatasetImportJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeDatasetImportJobResponseDatasetImportJob.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeDatasetImportJobResponseDatasetImportJob>() {
           @Override
           public void write(JsonWriter out, DescribeDatasetImportJobResponseDatasetImportJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeDatasetImportJobResponseDatasetImportJob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeDatasetImportJobResponseDatasetImportJob given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeDatasetImportJobResponseDatasetImportJob
   * @throws IOException if the JSON string is invalid with respect to DescribeDatasetImportJobResponseDatasetImportJob
   */
  public static DescribeDatasetImportJobResponseDatasetImportJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeDatasetImportJobResponseDatasetImportJob.class);
  }

  /**
   * Convert an instance of DescribeDatasetImportJobResponseDatasetImportJob to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

