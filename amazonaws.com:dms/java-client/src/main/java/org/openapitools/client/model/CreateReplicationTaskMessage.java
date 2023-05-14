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
import java.util.List;
import org.openapitools.client.model.MigrationTypeValue;

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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateReplicationTaskMessage {
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

  public static final String SERIALIZED_NAME_CDC_START_TIME = "CdcStartTime";
  @SerializedName(SERIALIZED_NAME_CDC_START_TIME)
  private OffsetDateTime cdcStartTime;

  public static final String SERIALIZED_NAME_CDC_START_POSITION = "CdcStartPosition";
  @SerializedName(SERIALIZED_NAME_CDC_START_POSITION)
  private String cdcStartPosition;

  public static final String SERIALIZED_NAME_CDC_STOP_POSITION = "CdcStopPosition";
  @SerializedName(SERIALIZED_NAME_CDC_STOP_POSITION)
  private String cdcStopPosition;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_TASK_DATA = "TaskData";
  @SerializedName(SERIALIZED_NAME_TASK_DATA)
  private String taskData;

  public static final String SERIALIZED_NAME_RESOURCE_IDENTIFIER = "ResourceIdentifier";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDENTIFIER)
  private String resourceIdentifier;

  public CreateReplicationTaskMessage() {
  }

  public CreateReplicationTaskMessage replicationTaskIdentifier(String replicationTaskIdentifier) {
    this.replicationTaskIdentifier = replicationTaskIdentifier;
    return this;
  }

  /**
   * Get replicationTaskIdentifier
   * @return replicationTaskIdentifier
   */
  @javax.annotation.Nonnull
  public String getReplicationTaskIdentifier() {
    return replicationTaskIdentifier;
  }

  public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
    this.replicationTaskIdentifier = replicationTaskIdentifier;
  }


  public CreateReplicationTaskMessage sourceEndpointArn(String sourceEndpointArn) {
    this.sourceEndpointArn = sourceEndpointArn;
    return this;
  }

  /**
   * Get sourceEndpointArn
   * @return sourceEndpointArn
   */
  @javax.annotation.Nonnull
  public String getSourceEndpointArn() {
    return sourceEndpointArn;
  }

  public void setSourceEndpointArn(String sourceEndpointArn) {
    this.sourceEndpointArn = sourceEndpointArn;
  }


  public CreateReplicationTaskMessage targetEndpointArn(String targetEndpointArn) {
    this.targetEndpointArn = targetEndpointArn;
    return this;
  }

  /**
   * Get targetEndpointArn
   * @return targetEndpointArn
   */
  @javax.annotation.Nonnull
  public String getTargetEndpointArn() {
    return targetEndpointArn;
  }

  public void setTargetEndpointArn(String targetEndpointArn) {
    this.targetEndpointArn = targetEndpointArn;
  }


  public CreateReplicationTaskMessage replicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
    return this;
  }

  /**
   * Get replicationInstanceArn
   * @return replicationInstanceArn
   */
  @javax.annotation.Nonnull
  public String getReplicationInstanceArn() {
    return replicationInstanceArn;
  }

  public void setReplicationInstanceArn(String replicationInstanceArn) {
    this.replicationInstanceArn = replicationInstanceArn;
  }


  public CreateReplicationTaskMessage migrationType(MigrationTypeValue migrationType) {
    this.migrationType = migrationType;
    return this;
  }

  /**
   * Get migrationType
   * @return migrationType
   */
  @javax.annotation.Nonnull
  public MigrationTypeValue getMigrationType() {
    return migrationType;
  }

  public void setMigrationType(MigrationTypeValue migrationType) {
    this.migrationType = migrationType;
  }


  public CreateReplicationTaskMessage tableMappings(String tableMappings) {
    this.tableMappings = tableMappings;
    return this;
  }

  /**
   * Get tableMappings
   * @return tableMappings
   */
  @javax.annotation.Nonnull
  public String getTableMappings() {
    return tableMappings;
  }

  public void setTableMappings(String tableMappings) {
    this.tableMappings = tableMappings;
  }


  public CreateReplicationTaskMessage replicationTaskSettings(String replicationTaskSettings) {
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


  public CreateReplicationTaskMessage cdcStartTime(OffsetDateTime cdcStartTime) {
    this.cdcStartTime = cdcStartTime;
    return this;
  }

  /**
   * Get cdcStartTime
   * @return cdcStartTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCdcStartTime() {
    return cdcStartTime;
  }

  public void setCdcStartTime(OffsetDateTime cdcStartTime) {
    this.cdcStartTime = cdcStartTime;
  }


  public CreateReplicationTaskMessage cdcStartPosition(String cdcStartPosition) {
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


  public CreateReplicationTaskMessage cdcStopPosition(String cdcStopPosition) {
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


  public CreateReplicationTaskMessage tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public CreateReplicationTaskMessage taskData(String taskData) {
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


  public CreateReplicationTaskMessage resourceIdentifier(String resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
    return this;
  }

  /**
   * Get resourceIdentifier
   * @return resourceIdentifier
   */
  @javax.annotation.Nullable
  public String getResourceIdentifier() {
    return resourceIdentifier;
  }

  public void setResourceIdentifier(String resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReplicationTaskMessage createReplicationTaskMessage = (CreateReplicationTaskMessage) o;
    return Objects.equals(this.replicationTaskIdentifier, createReplicationTaskMessage.replicationTaskIdentifier) &&
        Objects.equals(this.sourceEndpointArn, createReplicationTaskMessage.sourceEndpointArn) &&
        Objects.equals(this.targetEndpointArn, createReplicationTaskMessage.targetEndpointArn) &&
        Objects.equals(this.replicationInstanceArn, createReplicationTaskMessage.replicationInstanceArn) &&
        Objects.equals(this.migrationType, createReplicationTaskMessage.migrationType) &&
        Objects.equals(this.tableMappings, createReplicationTaskMessage.tableMappings) &&
        Objects.equals(this.replicationTaskSettings, createReplicationTaskMessage.replicationTaskSettings) &&
        Objects.equals(this.cdcStartTime, createReplicationTaskMessage.cdcStartTime) &&
        Objects.equals(this.cdcStartPosition, createReplicationTaskMessage.cdcStartPosition) &&
        Objects.equals(this.cdcStopPosition, createReplicationTaskMessage.cdcStopPosition) &&
        Objects.equals(this.tags, createReplicationTaskMessage.tags) &&
        Objects.equals(this.taskData, createReplicationTaskMessage.taskData) &&
        Objects.equals(this.resourceIdentifier, createReplicationTaskMessage.resourceIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskIdentifier, sourceEndpointArn, targetEndpointArn, replicationInstanceArn, migrationType, tableMappings, replicationTaskSettings, cdcStartTime, cdcStartPosition, cdcStopPosition, tags, taskData, resourceIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReplicationTaskMessage {\n");
    sb.append("    replicationTaskIdentifier: ").append(toIndentedString(replicationTaskIdentifier)).append("\n");
    sb.append("    sourceEndpointArn: ").append(toIndentedString(sourceEndpointArn)).append("\n");
    sb.append("    targetEndpointArn: ").append(toIndentedString(targetEndpointArn)).append("\n");
    sb.append("    replicationInstanceArn: ").append(toIndentedString(replicationInstanceArn)).append("\n");
    sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
    sb.append("    tableMappings: ").append(toIndentedString(tableMappings)).append("\n");
    sb.append("    replicationTaskSettings: ").append(toIndentedString(replicationTaskSettings)).append("\n");
    sb.append("    cdcStartTime: ").append(toIndentedString(cdcStartTime)).append("\n");
    sb.append("    cdcStartPosition: ").append(toIndentedString(cdcStartPosition)).append("\n");
    sb.append("    cdcStopPosition: ").append(toIndentedString(cdcStopPosition)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    taskData: ").append(toIndentedString(taskData)).append("\n");
    sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
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
    openapiFields.add("CdcStartTime");
    openapiFields.add("CdcStartPosition");
    openapiFields.add("CdcStopPosition");
    openapiFields.add("Tags");
    openapiFields.add("TaskData");
    openapiFields.add("ResourceIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationTaskIdentifier");
    openapiRequiredFields.add("SourceEndpointArn");
    openapiRequiredFields.add("TargetEndpointArn");
    openapiRequiredFields.add("ReplicationInstanceArn");
    openapiRequiredFields.add("MigrationType");
    openapiRequiredFields.add("TableMappings");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateReplicationTaskMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateReplicationTaskMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReplicationTaskMessage is not found in the empty JSON string", CreateReplicationTaskMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateReplicationTaskMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateReplicationTaskMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateReplicationTaskMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationTaskIdentifier`
      String.validateJsonElement(jsonObj.get("ReplicationTaskIdentifier"));
      // validate the required field `SourceEndpointArn`
      String.validateJsonElement(jsonObj.get("SourceEndpointArn"));
      // validate the required field `TargetEndpointArn`
      String.validateJsonElement(jsonObj.get("TargetEndpointArn"));
      // validate the required field `ReplicationInstanceArn`
      String.validateJsonElement(jsonObj.get("ReplicationInstanceArn"));
      // validate the required field `MigrationType`
      MigrationTypeValue.validateJsonElement(jsonObj.get("MigrationType"));
      // validate the required field `TableMappings`
      String.validateJsonElement(jsonObj.get("TableMappings"));
      // validate the optional field `ReplicationTaskSettings`
      if (jsonObj.get("ReplicationTaskSettings") != null && !jsonObj.get("ReplicationTaskSettings").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationTaskSettings"));
      }
      // validate the optional field `CdcStartTime`
      if (jsonObj.get("CdcStartTime") != null && !jsonObj.get("CdcStartTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CdcStartTime"));
      }
      // validate the optional field `CdcStartPosition`
      if (jsonObj.get("CdcStartPosition") != null && !jsonObj.get("CdcStartPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStartPosition"));
      }
      // validate the optional field `CdcStopPosition`
      if (jsonObj.get("CdcStopPosition") != null && !jsonObj.get("CdcStopPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStopPosition"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `TaskData`
      if (jsonObj.get("TaskData") != null && !jsonObj.get("TaskData").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TaskData"));
      }
      // validate the optional field `ResourceIdentifier`
      if (jsonObj.get("ResourceIdentifier") != null && !jsonObj.get("ResourceIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceIdentifier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReplicationTaskMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReplicationTaskMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReplicationTaskMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReplicationTaskMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReplicationTaskMessage>() {
           @Override
           public void write(JsonWriter out, CreateReplicationTaskMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReplicationTaskMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateReplicationTaskMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateReplicationTaskMessage
   * @throws IOException if the JSON string is invalid with respect to CreateReplicationTaskMessage
   */
  public static CreateReplicationTaskMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReplicationTaskMessage.class);
  }

  /**
   * Convert an instance of CreateReplicationTaskMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

