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
import org.openapitools.client.model.MigrationTypeValue;
import org.openapitools.client.model.ReplicationTaskReplicationTaskStats;

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
 * Provides information that describes a replication task created by the &lt;code&gt;CreateReplicationTask&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReplicationTask {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_IDENTIFIER = "ReplicationTaskIdentifier";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_IDENTIFIER)
  private String replicationTaskIdentifier;

  public static final String SERIALIZED_NAME_SOURCE_ENDPOINT_ARN = "SourceEndpointArn";
  @SerializedName(SERIALIZED_NAME_SOURCE_ENDPOINT_ARN)
  private String sourceEndpointArn;

  public static final String SERIALIZED_NAME_TARGET_ENDPOINT_ARN = "TargetEndpointArn";
  @SerializedName(SERIALIZED_NAME_TARGET_ENDPOINT_ARN)
  private String targetEndpointArn;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_ARN = "ReplicationInstanceArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_ARN)
  private String replicationInstanceArn;

  public static final String SERIALIZED_NAME_MIGRATION_TYPE = "MigrationType";
  @SerializedName(SERIALIZED_NAME_MIGRATION_TYPE)
  private MigrationTypeValue migrationType;

  public static final String SERIALIZED_NAME_TABLE_MAPPINGS = "TableMappings";
  @SerializedName(SERIALIZED_NAME_TABLE_MAPPINGS)
  private String tableMappings;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_SETTINGS = "ReplicationTaskSettings";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_SETTINGS)
  private String replicationTaskSettings;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LAST_FAILURE_MESSAGE = "LastFailureMessage";
  @SerializedName(SERIALIZED_NAME_LAST_FAILURE_MESSAGE)
  private String lastFailureMessage;

  public static final String SERIALIZED_NAME_STOP_REASON = "StopReason";
  @SerializedName(SERIALIZED_NAME_STOP_REASON)
  private String stopReason;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_CREATION_DATE = "ReplicationTaskCreationDate";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_CREATION_DATE)
  private OffsetDateTime replicationTaskCreationDate;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_START_DATE = "ReplicationTaskStartDate";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_START_DATE)
  private OffsetDateTime replicationTaskStartDate;

  public static final String SERIALIZED_NAME_CDC_START_POSITION = "CdcStartPosition";
  @SerializedName(SERIALIZED_NAME_CDC_START_POSITION)
  private String cdcStartPosition;

  public static final String SERIALIZED_NAME_CDC_STOP_POSITION = "CdcStopPosition";
  @SerializedName(SERIALIZED_NAME_CDC_STOP_POSITION)
  private String cdcStopPosition;

  public static final String SERIALIZED_NAME_RECOVERY_CHECKPOINT = "RecoveryCheckpoint";
  @SerializedName(SERIALIZED_NAME_RECOVERY_CHECKPOINT)
  private String recoveryCheckpoint;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public static final String SERIALIZED_NAME_REPLICATION_TASK_STATS = "ReplicationTaskStats";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_STATS)
  private ReplicationTaskReplicationTaskStats replicationTaskStats;

  public static final String SERIALIZED_NAME_TASK_DATA = "TaskData";
  @SerializedName(SERIALIZED_NAME_TASK_DATA)
  private String taskData;

  public static final String SERIALIZED_NAME_TARGET_REPLICATION_INSTANCE_ARN = "TargetReplicationInstanceArn";
  @SerializedName(SERIALIZED_NAME_TARGET_REPLICATION_INSTANCE_ARN)
  private String targetReplicationInstanceArn;

  public ReplicationTask() {
  }

  public ReplicationTask replicationTaskIdentifier(String replicationTaskIdentifier) {
    this.replicationTaskIdentifier = replicationTaskIdentifier;
    return this;
  }

  /**
   * Get replicationTaskIdentifier
   * @return replicationTaskIdentifier
   */
  @javax.annotation.Nullable
  public String getReplicationTaskIdentifier() {
    return replicationTaskIdentifier;
  }

  public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
    this.replicationTaskIdentifier = replicationTaskIdentifier;
  }


  public ReplicationTask sourceEndpointArn(String sourceEndpointArn) {
    this.sourceEndpointArn = sourceEndpointArn;
    return this;
  }

  /**
   * Get sourceEndpointArn
   * @return sourceEndpointArn
   */
  @javax.annotation.Nullable
  public String getSourceEndpointArn() {
    return sourceEndpointArn;
  }

  public void setSourceEndpointArn(String sourceEndpointArn) {
    this.sourceEndpointArn = sourceEndpointArn;
  }


  public ReplicationTask targetEndpointArn(String targetEndpointArn) {
    this.targetEndpointArn = targetEndpointArn;
    return this;
  }

  /**
   * Get targetEndpointArn
   * @return targetEndpointArn
   */
  @javax.annotation.Nullable
  public String getTargetEndpointArn() {
    return targetEndpointArn;
  }

  public void setTargetEndpointArn(String targetEndpointArn) {
    this.targetEndpointArn = targetEndpointArn;
  }


  public ReplicationTask replicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
    return this;
  }

  /**
   * Get replicationInstanceArn
   * @return replicationInstanceArn
   */
  @javax.annotation.Nullable
  public String getReplicationInstanceArn() {
    return replicationInstanceArn;
  }

  public void setReplicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
  }


  public ReplicationTask migrationType(MigrationTypeValue migrationType) {
    this.migrationType = migrationType;
    return this;
  }

  /**
   * Get migrationType
   * @return migrationType
   */
  @javax.annotation.Nullable
  public MigrationTypeValue getMigrationType() {
    return migrationType;
  }

  public void setMigrationType(MigrationTypeValue migrationType) {
    this.migrationType = migrationType;
  }


  public ReplicationTask tableMappings(String tableMappings) {
    this.tableMappings = tableMappings;
    return this;
  }

  /**
   * Get tableMappings
   * @return tableMappings
   */
  @javax.annotation.Nullable
  public String getTableMappings() {
    return tableMappings;
  }

  public void setTableMappings(String tableMappings) {
    this.tableMappings = tableMappings;
  }


  public ReplicationTask replicationTaskSettings(String replicationTaskSettings) {
    this.replicationTaskSettings = replicationTaskSettings;
    return this;
  }

  /**
   * Get replicationTaskSettings
   * @return replicationTaskSettings
   */
  @javax.annotation.Nullable
  public String getReplicationTaskSettings() {
    return replicationTaskSettings;
  }

  public void setReplicationTaskSettings(String replicationTaskSettings) {
    this.replicationTaskSettings = replicationTaskSettings;
  }


  public ReplicationTask status(String status) {
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


  public ReplicationTask lastFailureMessage(String lastFailureMessage) {
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


  public ReplicationTask stopReason(String stopReason) {
    this.stopReason = stopReason;
    return this;
  }

  /**
   * Get stopReason
   * @return stopReason
   */
  @javax.annotation.Nullable
  public String getStopReason() {
    return stopReason;
  }

  public void setStopReason(String stopReason) {
    this.stopReason = stopReason;
  }


  public ReplicationTask replicationTaskCreationDate(OffsetDateTime replicationTaskCreationDate) {
    this.replicationTaskCreationDate = replicationTaskCreationDate;
    return this;
  }

  /**
   * Get replicationTaskCreationDate
   * @return replicationTaskCreationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReplicationTaskCreationDate() {
    return replicationTaskCreationDate;
  }

  public void setReplicationTaskCreationDate(OffsetDateTime replicationTaskCreationDate) {
    this.replicationTaskCreationDate = replicationTaskCreationDate;
  }


  public ReplicationTask replicationTaskStartDate(OffsetDateTime replicationTaskStartDate) {
    this.replicationTaskStartDate = replicationTaskStartDate;
    return this;
  }

  /**
   * Get replicationTaskStartDate
   * @return replicationTaskStartDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReplicationTaskStartDate() {
    return replicationTaskStartDate;
  }

  public void setReplicationTaskStartDate(OffsetDateTime replicationTaskStartDate) {
    this.replicationTaskStartDate = replicationTaskStartDate;
  }


  public ReplicationTask cdcStartPosition(String cdcStartPosition) {
    this.cdcStartPosition = cdcStartPosition;
    return this;
  }

  /**
   * Get cdcStartPosition
   * @return cdcStartPosition
   */
  @javax.annotation.Nullable
  public String getCdcStartPosition() {
    return cdcStartPosition;
  }

  public void setCdcStartPosition(String cdcStartPosition) {
    this.cdcStartPosition = cdcStartPosition;
  }


  public ReplicationTask cdcStopPosition(String cdcStopPosition) {
    this.cdcStopPosition = cdcStopPosition;
    return this;
  }

  /**
   * Get cdcStopPosition
   * @return cdcStopPosition
   */
  @javax.annotation.Nullable
  public String getCdcStopPosition() {
    return cdcStopPosition;
  }

  public void setCdcStopPosition(String cdcStopPosition) {
    this.cdcStopPosition = cdcStopPosition;
  }


  public ReplicationTask recoveryCheckpoint(String recoveryCheckpoint) {
    this.recoveryCheckpoint = recoveryCheckpoint;
    return this;
  }

  /**
   * Get recoveryCheckpoint
   * @return recoveryCheckpoint
   */
  @javax.annotation.Nullable
  public String getRecoveryCheckpoint() {
    return recoveryCheckpoint;
  }

  public void setRecoveryCheckpoint(String recoveryCheckpoint) {
    this.recoveryCheckpoint = recoveryCheckpoint;
  }


  public ReplicationTask replicationTaskArn(String replicationTaskArn) {
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


  public ReplicationTask replicationTaskStats(ReplicationTaskReplicationTaskStats replicationTaskStats) {
    this.replicationTaskStats = replicationTaskStats;
    return this;
  }

  /**
   * Get replicationTaskStats
   * @return replicationTaskStats
   */
  @javax.annotation.Nullable
  public ReplicationTaskReplicationTaskStats getReplicationTaskStats() {
    return replicationTaskStats;
  }

  public void setReplicationTaskStats(ReplicationTaskReplicationTaskStats replicationTaskStats) {
    this.replicationTaskStats = replicationTaskStats;
  }


  public ReplicationTask taskData(String taskData) {
    this.taskData = taskData;
    return this;
  }

  /**
   * Get taskData
   * @return taskData
   */
  @javax.annotation.Nullable
  public String getTaskData() {
    return taskData;
  }

  public void setTaskData(String taskData) {
    this.taskData = taskData;
  }


  public ReplicationTask targetReplicationInstanceArn(String targetReplicationInstanceArn) {
    this.targetReplicationInstanceArn = targetReplicationInstanceArn;
    return this;
  }

  /**
   * Get targetReplicationInstanceArn
   * @return targetReplicationInstanceArn
   */
  @javax.annotation.Nullable
  public String getTargetReplicationInstanceArn() {
    return targetReplicationInstanceArn;
  }

  public void setTargetReplicationInstanceArn(String targetReplicationInstanceArn) {
    this.targetReplicationInstanceArn = targetReplicationInstanceArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationTask replicationTask = (ReplicationTask) o;
    return Objects.equals(this.replicationTaskIdentifier, replicationTask.replicationTaskIdentifier) &&
        Objects.equals(this.sourceEndpointArn, replicationTask.sourceEndpointArn) &&
        Objects.equals(this.targetEndpointArn, replicationTask.targetEndpointArn) &&
        Objects.equals(this.replicationInstanceArn, replicationTask.replicationInstanceArn) &&
        Objects.equals(this.migrationType, replicationTask.migrationType) &&
        Objects.equals(this.tableMappings, replicationTask.tableMappings) &&
        Objects.equals(this.replicationTaskSettings, replicationTask.replicationTaskSettings) &&
        Objects.equals(this.status, replicationTask.status) &&
        Objects.equals(this.lastFailureMessage, replicationTask.lastFailureMessage) &&
        Objects.equals(this.stopReason, replicationTask.stopReason) &&
        Objects.equals(this.replicationTaskCreationDate, replicationTask.replicationTaskCreationDate) &&
        Objects.equals(this.replicationTaskStartDate, replicationTask.replicationTaskStartDate) &&
        Objects.equals(this.cdcStartPosition, replicationTask.cdcStartPosition) &&
        Objects.equals(this.cdcStopPosition, replicationTask.cdcStopPosition) &&
        Objects.equals(this.recoveryCheckpoint, replicationTask.recoveryCheckpoint) &&
        Objects.equals(this.replicationTaskArn, replicationTask.replicationTaskArn) &&
        Objects.equals(this.replicationTaskStats, replicationTask.replicationTaskStats) &&
        Objects.equals(this.taskData, replicationTask.taskData) &&
        Objects.equals(this.targetReplicationInstanceArn, replicationTask.targetReplicationInstanceArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskIdentifier, sourceEndpointArn, targetEndpointArn, replicationInstanceArn, migrationType, tableMappings, replicationTaskSettings, status, lastFailureMessage, stopReason, replicationTaskCreationDate, replicationTaskStartDate, cdcStartPosition, cdcStopPosition, recoveryCheckpoint, replicationTaskArn, replicationTaskStats, taskData, targetReplicationInstanceArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationTask {\n");
    sb.append("    replicationTaskIdentifier: ").append(toIndentedString(replicationTaskIdentifier)).append("\n");
    sb.append("    sourceEndpointArn: ").append(toIndentedString(sourceEndpointArn)).append("\n");
    sb.append("    targetEndpointArn: ").append(toIndentedString(targetEndpointArn)).append("\n");
    sb.append("    replicationInstanceArn: ").append(toIndentedString(replicationInstanceArn)).append("\n");
    sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
    sb.append("    tableMappings: ").append(toIndentedString(tableMappings)).append("\n");
    sb.append("    replicationTaskSettings: ").append(toIndentedString(replicationTaskSettings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastFailureMessage: ").append(toIndentedString(lastFailureMessage)).append("\n");
    sb.append("    stopReason: ").append(toIndentedString(stopReason)).append("\n");
    sb.append("    replicationTaskCreationDate: ").append(toIndentedString(replicationTaskCreationDate)).append("\n");
    sb.append("    replicationTaskStartDate: ").append(toIndentedString(replicationTaskStartDate)).append("\n");
    sb.append("    cdcStartPosition: ").append(toIndentedString(cdcStartPosition)).append("\n");
    sb.append("    cdcStopPosition: ").append(toIndentedString(cdcStopPosition)).append("\n");
    sb.append("    recoveryCheckpoint: ").append(toIndentedString(recoveryCheckpoint)).append("\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
    sb.append("    replicationTaskStats: ").append(toIndentedString(replicationTaskStats)).append("\n");
    sb.append("    taskData: ").append(toIndentedString(taskData)).append("\n");
    sb.append("    targetReplicationInstanceArn: ").append(toIndentedString(targetReplicationInstanceArn)).append("\n");
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
    openapiFields.add("ReplicationTaskIdentifier");
    openapiFields.add("SourceEndpointArn");
    openapiFields.add("TargetEndpointArn");
    openapiFields.add("ReplicationInstanceArn");
    openapiFields.add("MigrationType");
    openapiFields.add("TableMappings");
    openapiFields.add("ReplicationTaskSettings");
    openapiFields.add("Status");
    openapiFields.add("LastFailureMessage");
    openapiFields.add("StopReason");
    openapiFields.add("ReplicationTaskCreationDate");
    openapiFields.add("ReplicationTaskStartDate");
    openapiFields.add("CdcStartPosition");
    openapiFields.add("CdcStopPosition");
    openapiFields.add("RecoveryCheckpoint");
    openapiFields.add("ReplicationTaskArn");
    openapiFields.add("ReplicationTaskStats");
    openapiFields.add("TaskData");
    openapiFields.add("TargetReplicationInstanceArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReplicationTask
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReplicationTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicationTask is not found in the empty JSON string", ReplicationTask.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReplicationTask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplicationTask` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationTaskIdentifier`
      if (jsonObj.get("ReplicationTaskIdentifier") != null && !jsonObj.get("ReplicationTaskIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskIdentifier"));
      }
      // validate the optional field `SourceEndpointArn`
      if (jsonObj.get("SourceEndpointArn") != null && !jsonObj.get("SourceEndpointArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceEndpointArn"));
      }
      // validate the optional field `TargetEndpointArn`
      if (jsonObj.get("TargetEndpointArn") != null && !jsonObj.get("TargetEndpointArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TargetEndpointArn"));
      }
      // validate the optional field `ReplicationInstanceArn`
      if (jsonObj.get("ReplicationInstanceArn") != null && !jsonObj.get("ReplicationInstanceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationInstanceArn"));
      }
      // validate the optional field `MigrationType`
      if (jsonObj.get("MigrationType") != null && !jsonObj.get("MigrationType").isJsonNull()) {
        MigrationTypeValue.validateJsonElement(jsonObj.get("MigrationType"));
      }
      // validate the optional field `TableMappings`
      if (jsonObj.get("TableMappings") != null && !jsonObj.get("TableMappings").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TableMappings"));
      }
      // validate the optional field `ReplicationTaskSettings`
      if (jsonObj.get("ReplicationTaskSettings") != null && !jsonObj.get("ReplicationTaskSettings").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskSettings"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `LastFailureMessage`
      if (jsonObj.get("LastFailureMessage") != null && !jsonObj.get("LastFailureMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastFailureMessage"));
      }
      // validate the optional field `StopReason`
      if (jsonObj.get("StopReason") != null && !jsonObj.get("StopReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StopReason"));
      }
      // validate the optional field `ReplicationTaskCreationDate`
      if (jsonObj.get("ReplicationTaskCreationDate") != null && !jsonObj.get("ReplicationTaskCreationDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ReplicationTaskCreationDate"));
      }
      // validate the optional field `ReplicationTaskStartDate`
      if (jsonObj.get("ReplicationTaskStartDate") != null && !jsonObj.get("ReplicationTaskStartDate").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ReplicationTaskStartDate"));
      }
      // validate the optional field `CdcStartPosition`
      if (jsonObj.get("CdcStartPosition") != null && !jsonObj.get("CdcStartPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStartPosition"));
      }
      // validate the optional field `CdcStopPosition`
      if (jsonObj.get("CdcStopPosition") != null && !jsonObj.get("CdcStopPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStopPosition"));
      }
      // validate the optional field `RecoveryCheckpoint`
      if (jsonObj.get("RecoveryCheckpoint") != null && !jsonObj.get("RecoveryCheckpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecoveryCheckpoint"));
      }
      // validate the optional field `ReplicationTaskArn`
      if (jsonObj.get("ReplicationTaskArn") != null && !jsonObj.get("ReplicationTaskArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      }
      // validate the optional field `ReplicationTaskStats`
      if (jsonObj.get("ReplicationTaskStats") != null && !jsonObj.get("ReplicationTaskStats").isJsonNull()) {
        ReplicationTaskReplicationTaskStats.validateJsonElement(jsonObj.get("ReplicationTaskStats"));
      }
      // validate the optional field `TaskData`
      if (jsonObj.get("TaskData") != null && !jsonObj.get("TaskData").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TaskData"));
      }
      // validate the optional field `TargetReplicationInstanceArn`
      if (jsonObj.get("TargetReplicationInstanceArn") != null && !jsonObj.get("TargetReplicationInstanceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TargetReplicationInstanceArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicationTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicationTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicationTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicationTask.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicationTask>() {
           @Override
           public void write(JsonWriter out, ReplicationTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplicationTask read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReplicationTask given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReplicationTask
   * @throws IOException if the JSON string is invalid with respect to ReplicationTask
   */
  public static ReplicationTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicationTask.class);
  }

  /**
   * Convert an instance of ReplicationTask to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

