/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import org.openapitools.client.model.ReplicationTaskAssessmentRunAssessmentProgress;

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
 * StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_ASSESSMENT_RUN_ARN = "ReplicationTaskAssessmentRunArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ASSESSMENT_RUN_ARN)
  private String replicationTaskAssessmentRunArn;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_ASSESSMENT_RUN_CREATION_DATE = "ReplicationTaskAssessmentRunCreationDate";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ASSESSMENT_RUN_CREATION_DATE)
  private OffsetDateTime replicationTaskAssessmentRunCreationDate;

  public static final String SERIALIZED_NAME_ASSESSMENT_PROGRESS = "AssessmentProgress";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_PROGRESS)
  private ReplicationTaskAssessmentRunAssessmentProgress assessmentProgress;

  public static final String SERIALIZED_NAME_LAST_FAILURE_MESSAGE = "LastFailureMessage";
  @SerializedName(SERIALIZED_NAME_LAST_FAILURE_MESSAGE)
  private String lastFailureMessage;

  public static final String SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN = "ServiceAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCESS_ROLE_ARN)
  private String serviceAccessRoleArn;

  public static final String SERIALIZED_NAME_RESULT_LOCATION_BUCKET = "ResultLocationBucket";
  @SerializedName(SERIALIZED_NAME_RESULT_LOCATION_BUCKET)
  private String resultLocationBucket;

  public static final String SERIALIZED_NAME_RESULT_LOCATION_FOLDER = "ResultLocationFolder";
  @SerializedName(SERIALIZED_NAME_RESULT_LOCATION_FOLDER)
  private String resultLocationFolder;

  public static final String SERIALIZED_NAME_RESULT_ENCRYPTION_MODE = "ResultEncryptionMode";
  @SerializedName(SERIALIZED_NAME_RESULT_ENCRYPTION_MODE)
  private String resultEncryptionMode;

  public static final String SERIALIZED_NAME_RESULT_KMS_KEY_ARN = "ResultKmsKeyArn";
  @SerializedName(SERIALIZED_NAME_RESULT_KMS_KEY_ARN)
  private String resultKmsKeyArn;

  public static final String SERIALIZED_NAME_ASSESSMENT_RUN_NAME = "AssessmentRunName";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_RUN_NAME)
  private String assessmentRunName;

  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun() {
  }

  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun replicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
    this.replicationTaskAssessmentRunArn = replicationTaskAssessmentRunArn;
    return this;
  }

  /**
   * Get replicationTaskAssessmentRunArn
   * @return replicationTaskAssessmentRunArn
   */
  @javax.annotation.Nullable
  public String getReplicationTaskAssessmentRunArn() {
    return replicationTaskAssessmentRunArn;
  }

  public void setReplicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
    this.replicationTaskAssessmentRunArn = replicationTaskAssessmentRunArn;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun replicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
    return this;
  }

  /**
   * Get replicationTaskArn
   * @return replicationTaskArn
   */
  @javax.annotation.Nullable
  public String getReplicationTaskArn() {
    return replicationTaskArn;
  }

  public void setReplicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun status(String status) {
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


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun replicationTaskAssessmentRunCreationDate(OffsetDateTime replicationTaskAssessmentRunCreationDate) {
    this.replicationTaskAssessmentRunCreationDate = replicationTaskAssessmentRunCreationDate;
    return this;
  }

  /**
   * Get replicationTaskAssessmentRunCreationDate
   * @return replicationTaskAssessmentRunCreationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReplicationTaskAssessmentRunCreationDate() {
    return replicationTaskAssessmentRunCreationDate;
  }

  public void setReplicationTaskAssessmentRunCreationDate(OffsetDateTime replicationTaskAssessmentRunCreationDate) {
    this.replicationTaskAssessmentRunCreationDate = replicationTaskAssessmentRunCreationDate;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun assessmentProgress(ReplicationTaskAssessmentRunAssessmentProgress assessmentProgress) {
    this.assessmentProgress = assessmentProgress;
    return this;
  }

  /**
   * Get assessmentProgress
   * @return assessmentProgress
   */
  @javax.annotation.Nullable
  public ReplicationTaskAssessmentRunAssessmentProgress getAssessmentProgress() {
    return assessmentProgress;
  }

  public void setAssessmentProgress(ReplicationTaskAssessmentRunAssessmentProgress assessmentProgress) {
    this.assessmentProgress = assessmentProgress;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun lastFailureMessage(String lastFailureMessage) {
    this.lastFailureMessage = lastFailureMessage;
    return this;
  }

  /**
   * Get lastFailureMessage
   * @return lastFailureMessage
   */
  @javax.annotation.Nullable
  public String getLastFailureMessage() {
    return lastFailureMessage;
  }

  public void setLastFailureMessage(String lastFailureMessage) {
    this.lastFailureMessage = lastFailureMessage;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun serviceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
    return this;
  }

  /**
   * Get serviceAccessRoleArn
   * @return serviceAccessRoleArn
   */
  @javax.annotation.Nullable
  public String getServiceAccessRoleArn() {
    return serviceAccessRoleArn;
  }

  public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
    this.serviceAccessRoleArn = serviceAccessRoleArn;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun resultLocationBucket(String resultLocationBucket) {
    this.resultLocationBucket = resultLocationBucket;
    return this;
  }

  /**
   * Get resultLocationBucket
   * @return resultLocationBucket
   */
  @javax.annotation.Nullable
  public String getResultLocationBucket() {
    return resultLocationBucket;
  }

  public void setResultLocationBucket(String resultLocationBucket) {
    this.resultLocationBucket = resultLocationBucket;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun resultLocationFolder(String resultLocationFolder) {
    this.resultLocationFolder = resultLocationFolder;
    return this;
  }

  /**
   * Get resultLocationFolder
   * @return resultLocationFolder
   */
  @javax.annotation.Nullable
  public String getResultLocationFolder() {
    return resultLocationFolder;
  }

  public void setResultLocationFolder(String resultLocationFolder) {
    this.resultLocationFolder = resultLocationFolder;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun resultEncryptionMode(String resultEncryptionMode) {
    this.resultEncryptionMode = resultEncryptionMode;
    return this;
  }

  /**
   * Get resultEncryptionMode
   * @return resultEncryptionMode
   */
  @javax.annotation.Nullable
  public String getResultEncryptionMode() {
    return resultEncryptionMode;
  }

  public void setResultEncryptionMode(String resultEncryptionMode) {
    this.resultEncryptionMode = resultEncryptionMode;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun resultKmsKeyArn(String resultKmsKeyArn) {
    this.resultKmsKeyArn = resultKmsKeyArn;
    return this;
  }

  /**
   * Get resultKmsKeyArn
   * @return resultKmsKeyArn
   */
  @javax.annotation.Nullable
  public String getResultKmsKeyArn() {
    return resultKmsKeyArn;
  }

  public void setResultKmsKeyArn(String resultKmsKeyArn) {
    this.resultKmsKeyArn = resultKmsKeyArn;
  }


  public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun assessmentRunName(String assessmentRunName) {
    this.assessmentRunName = assessmentRunName;
    return this;
  }

  /**
   * Get assessmentRunName
   * @return assessmentRunName
   */
  @javax.annotation.Nullable
  public String getAssessmentRunName() {
    return assessmentRunName;
  }

  public void setAssessmentRunName(String assessmentRunName) {
    this.assessmentRunName = assessmentRunName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun = (StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun) o;
    return Objects.equals(this.replicationTaskAssessmentRunArn, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.replicationTaskAssessmentRunArn) &&
        Objects.equals(this.replicationTaskArn, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.replicationTaskArn) &&
        Objects.equals(this.status, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.status) &&
        Objects.equals(this.replicationTaskAssessmentRunCreationDate, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.replicationTaskAssessmentRunCreationDate) &&
        Objects.equals(this.assessmentProgress, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.assessmentProgress) &&
        Objects.equals(this.lastFailureMessage, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.lastFailureMessage) &&
        Objects.equals(this.serviceAccessRoleArn, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.serviceAccessRoleArn) &&
        Objects.equals(this.resultLocationBucket, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.resultLocationBucket) &&
        Objects.equals(this.resultLocationFolder, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.resultLocationFolder) &&
        Objects.equals(this.resultEncryptionMode, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.resultEncryptionMode) &&
        Objects.equals(this.resultKmsKeyArn, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.resultKmsKeyArn) &&
        Objects.equals(this.assessmentRunName, startReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.assessmentRunName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskAssessmentRunArn, replicationTaskArn, status, replicationTaskAssessmentRunCreationDate, assessmentProgress, lastFailureMessage, serviceAccessRoleArn, resultLocationBucket, resultLocationFolder, resultEncryptionMode, resultKmsKeyArn, assessmentRunName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun {\n");
    sb.append("    replicationTaskAssessmentRunArn: ").append(toIndentedString(replicationTaskAssessmentRunArn)).append("\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    replicationTaskAssessmentRunCreationDate: ").append(toIndentedString(replicationTaskAssessmentRunCreationDate)).append("\n");
    sb.append("    assessmentProgress: ").append(toIndentedString(assessmentProgress)).append("\n");
    sb.append("    lastFailureMessage: ").append(toIndentedString(lastFailureMessage)).append("\n");
    sb.append("    serviceAccessRoleArn: ").append(toIndentedString(serviceAccessRoleArn)).append("\n");
    sb.append("    resultLocationBucket: ").append(toIndentedString(resultLocationBucket)).append("\n");
    sb.append("    resultLocationFolder: ").append(toIndentedString(resultLocationFolder)).append("\n");
    sb.append("    resultEncryptionMode: ").append(toIndentedString(resultEncryptionMode)).append("\n");
    sb.append("    resultKmsKeyArn: ").append(toIndentedString(resultKmsKeyArn)).append("\n");
    sb.append("    assessmentRunName: ").append(toIndentedString(assessmentRunName)).append("\n");
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
    openapiFields.add("ReplicationTaskAssessmentRunArn");
    openapiFields.add("ReplicationTaskArn");
    openapiFields.add("Status");
    openapiFields.add("ReplicationTaskAssessmentRunCreationDate");
    openapiFields.add("AssessmentProgress");
    openapiFields.add("LastFailureMessage");
    openapiFields.add("ServiceAccessRoleArn");
    openapiFields.add("ResultLocationBucket");
    openapiFields.add("ResultLocationFolder");
    openapiFields.add("ResultEncryptionMode");
    openapiFields.add("ResultKmsKeyArn");
    openapiFields.add("AssessmentRunName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun is not found in the empty JSON string", StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationTaskAssessmentRunArn`
      if (jsonObj.get("ReplicationTaskAssessmentRunArn") != null && !jsonObj.get("ReplicationTaskAssessmentRunArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskAssessmentRunArn"));
      }
      // validate the optional field `ReplicationTaskArn`
      if (jsonObj.get("ReplicationTaskArn") != null && !jsonObj.get("ReplicationTaskArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `ReplicationTaskAssessmentRunCreationDate`
      if (jsonObj.get("ReplicationTaskAssessmentRunCreationDate") != null && !jsonObj.get("ReplicationTaskAssessmentRunCreationDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ReplicationTaskAssessmentRunCreationDate"));
      }
      // validate the optional field `AssessmentProgress`
      if (jsonObj.get("AssessmentProgress") != null && !jsonObj.get("AssessmentProgress").isJsonNull()) {
        ReplicationTaskAssessmentRunAssessmentProgress.validateJsonElement(jsonObj.get("AssessmentProgress"));
      }
      // validate the optional field `LastFailureMessage`
      if (jsonObj.get("LastFailureMessage") != null && !jsonObj.get("LastFailureMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastFailureMessage"));
      }
      // validate the optional field `ServiceAccessRoleArn`
      if (jsonObj.get("ServiceAccessRoleArn") != null && !jsonObj.get("ServiceAccessRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceAccessRoleArn"));
      }
      // validate the optional field `ResultLocationBucket`
      if (jsonObj.get("ResultLocationBucket") != null && !jsonObj.get("ResultLocationBucket").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResultLocationBucket"));
      }
      // validate the optional field `ResultLocationFolder`
      if (jsonObj.get("ResultLocationFolder") != null && !jsonObj.get("ResultLocationFolder").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResultLocationFolder"));
      }
      // validate the optional field `ResultEncryptionMode`
      if (jsonObj.get("ResultEncryptionMode") != null && !jsonObj.get("ResultEncryptionMode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResultEncryptionMode"));
      }
      // validate the optional field `ResultKmsKeyArn`
      if (jsonObj.get("ResultKmsKeyArn") != null && !jsonObj.get("ResultKmsKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResultKmsKeyArn"));
      }
      // validate the optional field `AssessmentRunName`
      if (jsonObj.get("AssessmentRunName") != null && !jsonObj.get("AssessmentRunName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AssessmentRunName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.class));

       return (TypeAdapter<T>) new TypeAdapter<StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun>() {
           @Override
           public void write(JsonWriter out, StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun
   * @throws IOException if the JSON string is invalid with respect to StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun
   */
  public static StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun.class);
  }

  /**
   * Convert an instance of StartReplicationTaskAssessmentRunResponseReplicationTaskAssessmentRun to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

