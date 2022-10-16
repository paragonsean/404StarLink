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
import org.openapitools.client.model.DatasetExportJobJobOutput;
import org.openapitools.client.model.IngestionMode;

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
 * DescribeDatasetExportJobResponseDatasetExportJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeDatasetExportJobResponseDatasetExportJob {
  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_DATASET_EXPORT_JOB_ARN = "datasetExportJobArn";
  @SerializedName(SERIALIZED_NAME_DATASET_EXPORT_JOB_ARN)
  private String datasetExportJobArn;

  public static final String SERIALIZED_NAME_DATASET_ARN = "datasetArn";
  @SerializedName(SERIALIZED_NAME_DATASET_ARN)
  private String datasetArn;

  public static final String SERIALIZED_NAME_INGESTION_MODE = "ingestionMode";
  @SerializedName(SERIALIZED_NAME_INGESTION_MODE)
  private IngestionMode ingestionMode;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_JOB_OUTPUT = "jobOutput";
  @SerializedName(SERIALIZED_NAME_JOB_OUTPUT)
  private DatasetExportJobJobOutput jobOutput;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public DescribeDatasetExportJobResponseDatasetExportJob() {
  }

  public DescribeDatasetExportJobResponseDatasetExportJob jobName(String jobName) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob datasetExportJobArn(String datasetExportJobArn) {
    this.datasetExportJobArn = datasetExportJobArn;
    return this;
  }

  /**
   * Get datasetExportJobArn
   * @return datasetExportJobArn
   */
  @javax.annotation.Nullable
  public String getDatasetExportJobArn() {
    return datasetExportJobArn;
  }

  public void setDatasetExportJobArn(String datasetExportJobArn) {
    this.datasetExportJobArn = datasetExportJobArn;
  }


  public DescribeDatasetExportJobResponseDatasetExportJob datasetArn(String datasetArn) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob ingestionMode(IngestionMode ingestionMode) {
    this.ingestionMode = ingestionMode;
    return this;
  }

  /**
   * Get ingestionMode
   * @return ingestionMode
   */
  @javax.annotation.Nullable
  public IngestionMode getIngestionMode() {
    return ingestionMode;
  }

  public void setIngestionMode(IngestionMode ingestionMode) {
    this.ingestionMode = ingestionMode;
  }


  public DescribeDatasetExportJobResponseDatasetExportJob roleArn(String roleArn) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob status(String status) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob jobOutput(DatasetExportJobJobOutput jobOutput) {
    this.jobOutput = jobOutput;
    return this;
  }

  /**
   * Get jobOutput
   * @return jobOutput
   */
  @javax.annotation.Nullable
  public DatasetExportJobJobOutput getJobOutput() {
    return jobOutput;
  }

  public void setJobOutput(DatasetExportJobJobOutput jobOutput) {
    this.jobOutput = jobOutput;
  }


  public DescribeDatasetExportJobResponseDatasetExportJob creationDateTime(OffsetDateTime creationDateTime) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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


  public DescribeDatasetExportJobResponseDatasetExportJob failureReason(String failureReason) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDatasetExportJobResponseDatasetExportJob describeDatasetExportJobResponseDatasetExportJob = (DescribeDatasetExportJobResponseDatasetExportJob) o;
    return Objects.equals(this.jobName, describeDatasetExportJobResponseDatasetExportJob.jobName) &&
        Objects.equals(this.datasetExportJobArn, describeDatasetExportJobResponseDatasetExportJob.datasetExportJobArn) &&
        Objects.equals(this.datasetArn, describeDatasetExportJobResponseDatasetExportJob.datasetArn) &&
        Objects.equals(this.ingestionMode, describeDatasetExportJobResponseDatasetExportJob.ingestionMode) &&
        Objects.equals(this.roleArn, describeDatasetExportJobResponseDatasetExportJob.roleArn) &&
        Objects.equals(this.status, describeDatasetExportJobResponseDatasetExportJob.status) &&
        Objects.equals(this.jobOutput, describeDatasetExportJobResponseDatasetExportJob.jobOutput) &&
        Objects.equals(this.creationDateTime, describeDatasetExportJobResponseDatasetExportJob.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeDatasetExportJobResponseDatasetExportJob.lastUpdatedDateTime) &&
        Objects.equals(this.failureReason, describeDatasetExportJobResponseDatasetExportJob.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, datasetExportJobArn, datasetArn, ingestionMode, roleArn, status, jobOutput, creationDateTime, lastUpdatedDateTime, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDatasetExportJobResponseDatasetExportJob {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    datasetExportJobArn: ").append(toIndentedString(datasetExportJobArn)).append("\n");
    sb.append("    datasetArn: ").append(toIndentedString(datasetArn)).append("\n");
    sb.append("    ingestionMode: ").append(toIndentedString(ingestionMode)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobOutput: ").append(toIndentedString(jobOutput)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
    openapiFields.add("datasetExportJobArn");
    openapiFields.add("datasetArn");
    openapiFields.add("ingestionMode");
    openapiFields.add("roleArn");
    openapiFields.add("status");
    openapiFields.add("jobOutput");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("failureReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeDatasetExportJobResponseDatasetExportJob
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeDatasetExportJobResponseDatasetExportJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeDatasetExportJobResponseDatasetExportJob is not found in the empty JSON string", DescribeDatasetExportJobResponseDatasetExportJob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeDatasetExportJobResponseDatasetExportJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeDatasetExportJobResponseDatasetExportJob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `jobName`
      if (jsonObj.get("jobName") != null && !jsonObj.get("jobName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("jobName"));
      }
      // validate the optional field `datasetExportJobArn`
      if (jsonObj.get("datasetExportJobArn") != null && !jsonObj.get("datasetExportJobArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetExportJobArn"));
      }
      // validate the optional field `datasetArn`
      if (jsonObj.get("datasetArn") != null && !jsonObj.get("datasetArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetArn"));
      }
      // validate the optional field `ingestionMode`
      if (jsonObj.get("ingestionMode") != null && !jsonObj.get("ingestionMode").isJsonNull()) {
        IngestionMode.validateJsonElement(jsonObj.get("ingestionMode"));
      }
      // validate the optional field `roleArn`
      if (jsonObj.get("roleArn") != null && !jsonObj.get("roleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("roleArn"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `jobOutput`
      if (jsonObj.get("jobOutput") != null && !jsonObj.get("jobOutput").isJsonNull()) {
        DatasetExportJobJobOutput.validateJsonElement(jsonObj.get("jobOutput"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeDatasetExportJobResponseDatasetExportJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeDatasetExportJobResponseDatasetExportJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeDatasetExportJobResponseDatasetExportJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeDatasetExportJobResponseDatasetExportJob.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeDatasetExportJobResponseDatasetExportJob>() {
           @Override
           public void write(JsonWriter out, DescribeDatasetExportJobResponseDatasetExportJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeDatasetExportJobResponseDatasetExportJob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeDatasetExportJobResponseDatasetExportJob given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeDatasetExportJobResponseDatasetExportJob
   * @throws IOException if the JSON string is invalid with respect to DescribeDatasetExportJobResponseDatasetExportJob
   */
  public static DescribeDatasetExportJobResponseDatasetExportJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeDatasetExportJobResponseDatasetExportJob.class);
  }

  /**
   * Convert an instance of DescribeDatasetExportJobResponseDatasetExportJob to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

