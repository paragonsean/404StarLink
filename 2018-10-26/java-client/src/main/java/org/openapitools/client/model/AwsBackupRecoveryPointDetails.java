/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
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
import java.util.Arrays;
import org.openapitools.client.model.AwsBackupRecoveryPointDetailsCalculatedLifecycle;
import org.openapitools.client.model.AwsBackupRecoveryPointDetailsCreatedBy;
import org.openapitools.client.model.AwsBackupRecoveryPointDetailsLifecycle;

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
 * Contains detailed information about the recovery points stored in an Backup backup vault. A backup, or recovery point, represents the content of a resource at a specified time. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsBackupRecoveryPointDetails {
  public static final String SERIALIZED_NAME_BACKUP_SIZE_IN_BYTES = "BackupSizeInBytes";
  @SerializedName(SERIALIZED_NAME_BACKUP_SIZE_IN_BYTES)
  private Integer backupSizeInBytes;

  public static final String SERIALIZED_NAME_BACKUP_VAULT_ARN = "BackupVaultArn";
  @SerializedName(SERIALIZED_NAME_BACKUP_VAULT_ARN)
  private String backupVaultArn;

  public static final String SERIALIZED_NAME_BACKUP_VAULT_NAME = "BackupVaultName";
  @SerializedName(SERIALIZED_NAME_BACKUP_VAULT_NAME)
  private String backupVaultName;

  public static final String SERIALIZED_NAME_CALCULATED_LIFECYCLE = "CalculatedLifecycle";
  @SerializedName(SERIALIZED_NAME_CALCULATED_LIFECYCLE)
  private AwsBackupRecoveryPointDetailsCalculatedLifecycle calculatedLifecycle;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "CompletionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private String completionDate;

  public static final String SERIALIZED_NAME_CREATED_BY = "CreatedBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private AwsBackupRecoveryPointDetailsCreatedBy createdBy;

  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY_ARN = "EncryptionKeyArn";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY_ARN)
  private String encryptionKeyArn;

  public static final String SERIALIZED_NAME_IAM_ROLE_ARN = "IamRoleArn";
  @SerializedName(SERIALIZED_NAME_IAM_ROLE_ARN)
  private String iamRoleArn;

  public static final String SERIALIZED_NAME_IS_ENCRYPTED = "IsEncrypted";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPTED)
  private Boolean isEncrypted;

  public static final String SERIALIZED_NAME_LAST_RESTORE_TIME = "LastRestoreTime";
  @SerializedName(SERIALIZED_NAME_LAST_RESTORE_TIME)
  private String lastRestoreTime;

  public static final String SERIALIZED_NAME_LIFECYCLE = "Lifecycle";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  private AwsBackupRecoveryPointDetailsLifecycle lifecycle;

  public static final String SERIALIZED_NAME_RECOVERY_POINT_ARN = "RecoveryPointArn";
  @SerializedName(SERIALIZED_NAME_RECOVERY_POINT_ARN)
  private String recoveryPointArn;

  public static final String SERIALIZED_NAME_RESOURCE_ARN = "ResourceArn";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ARN)
  private String resourceArn;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "ResourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_SOURCE_BACKUP_VAULT_ARN = "SourceBackupVaultArn";
  @SerializedName(SERIALIZED_NAME_SOURCE_BACKUP_VAULT_ARN)
  private String sourceBackupVaultArn;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "StatusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_STORAGE_CLASS = "StorageClass";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS)
  private String storageClass;

  public AwsBackupRecoveryPointDetails() {
  }

  public AwsBackupRecoveryPointDetails backupSizeInBytes(Integer backupSizeInBytes) {
    this.backupSizeInBytes = backupSizeInBytes;
    return this;
  }

  /**
   * Get backupSizeInBytes
   * @return backupSizeInBytes
   */
  @javax.annotation.Nullable
  public Integer getBackupSizeInBytes() {
    return backupSizeInBytes;
  }

  public void setBackupSizeInBytes(Integer backupSizeInBytes) {
    this.backupSizeInBytes = backupSizeInBytes;
  }


  public AwsBackupRecoveryPointDetails backupVaultArn(String backupVaultArn) {
    this.backupVaultArn = backupVaultArn;
    return this;
  }

  /**
   * Get backupVaultArn
   * @return backupVaultArn
   */
  @javax.annotation.Nullable
  public String getBackupVaultArn() {
    return backupVaultArn;
  }

  public void setBackupVaultArn(String backupVaultArn) {
    this.backupVaultArn = backupVaultArn;
  }


  public AwsBackupRecoveryPointDetails backupVaultName(String backupVaultName) {
    this.backupVaultName = backupVaultName;
    return this;
  }

  /**
   * Get backupVaultName
   * @return backupVaultName
   */
  @javax.annotation.Nullable
  public String getBackupVaultName() {
    return backupVaultName;
  }

  public void setBackupVaultName(String backupVaultName) {
    this.backupVaultName = backupVaultName;
  }


  public AwsBackupRecoveryPointDetails calculatedLifecycle(AwsBackupRecoveryPointDetailsCalculatedLifecycle calculatedLifecycle) {
    this.calculatedLifecycle = calculatedLifecycle;
    return this;
  }

  /**
   * Get calculatedLifecycle
   * @return calculatedLifecycle
   */
  @javax.annotation.Nullable
  public AwsBackupRecoveryPointDetailsCalculatedLifecycle getCalculatedLifecycle() {
    return calculatedLifecycle;
  }

  public void setCalculatedLifecycle(AwsBackupRecoveryPointDetailsCalculatedLifecycle calculatedLifecycle) {
    this.calculatedLifecycle = calculatedLifecycle;
  }


  public AwsBackupRecoveryPointDetails completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
   */
  @javax.annotation.Nullable
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }


  public AwsBackupRecoveryPointDetails createdBy(AwsBackupRecoveryPointDetailsCreatedBy createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  public AwsBackupRecoveryPointDetailsCreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AwsBackupRecoveryPointDetailsCreatedBy createdBy) {
    this.createdBy = createdBy;
  }


  public AwsBackupRecoveryPointDetails creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public AwsBackupRecoveryPointDetails encryptionKeyArn(String encryptionKeyArn) {
    this.encryptionKeyArn = encryptionKeyArn;
    return this;
  }

  /**
   * Get encryptionKeyArn
   * @return encryptionKeyArn
   */
  @javax.annotation.Nullable
  public String getEncryptionKeyArn() {
    return encryptionKeyArn;
  }

  public void setEncryptionKeyArn(String encryptionKeyArn) {
    this.encryptionKeyArn = encryptionKeyArn;
  }


  public AwsBackupRecoveryPointDetails iamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
    return this;
  }

  /**
   * Get iamRoleArn
   * @return iamRoleArn
   */
  @javax.annotation.Nullable
  public String getIamRoleArn() {
    return iamRoleArn;
  }

  public void setIamRoleArn(String iamRoleArn) {
    this.iamRoleArn = iamRoleArn;
  }


  public AwsBackupRecoveryPointDetails isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Get isEncrypted
   * @return isEncrypted
   */
  @javax.annotation.Nullable
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  public AwsBackupRecoveryPointDetails lastRestoreTime(String lastRestoreTime) {
    this.lastRestoreTime = lastRestoreTime;
    return this;
  }

  /**
   * Get lastRestoreTime
   * @return lastRestoreTime
   */
  @javax.annotation.Nullable
  public String getLastRestoreTime() {
    return lastRestoreTime;
  }

  public void setLastRestoreTime(String lastRestoreTime) {
    this.lastRestoreTime = lastRestoreTime;
  }


  public AwsBackupRecoveryPointDetails lifecycle(AwsBackupRecoveryPointDetailsLifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * Get lifecycle
   * @return lifecycle
   */
  @javax.annotation.Nullable
  public AwsBackupRecoveryPointDetailsLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(AwsBackupRecoveryPointDetailsLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public AwsBackupRecoveryPointDetails recoveryPointArn(String recoveryPointArn) {
    this.recoveryPointArn = recoveryPointArn;
    return this;
  }

  /**
   * Get recoveryPointArn
   * @return recoveryPointArn
   */
  @javax.annotation.Nullable
  public String getRecoveryPointArn() {
    return recoveryPointArn;
  }

  public void setRecoveryPointArn(String recoveryPointArn) {
    this.recoveryPointArn = recoveryPointArn;
  }


  public AwsBackupRecoveryPointDetails resourceArn(String resourceArn) {
    this.resourceArn = resourceArn;
    return this;
  }

  /**
   * Get resourceArn
   * @return resourceArn
   */
  @javax.annotation.Nullable
  public String getResourceArn() {
    return resourceArn;
  }

  public void setResourceArn(String resourceArn) {
    this.resourceArn = resourceArn;
  }


  public AwsBackupRecoveryPointDetails resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public AwsBackupRecoveryPointDetails sourceBackupVaultArn(String sourceBackupVaultArn) {
    this.sourceBackupVaultArn = sourceBackupVaultArn;
    return this;
  }

  /**
   * Get sourceBackupVaultArn
   * @return sourceBackupVaultArn
   */
  @javax.annotation.Nullable
  public String getSourceBackupVaultArn() {
    return sourceBackupVaultArn;
  }

  public void setSourceBackupVaultArn(String sourceBackupVaultArn) {
    this.sourceBackupVaultArn = sourceBackupVaultArn;
  }


  public AwsBackupRecoveryPointDetails status(String status) {
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


  public AwsBackupRecoveryPointDetails statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public AwsBackupRecoveryPointDetails storageClass(String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

  /**
   * Get storageClass
   * @return storageClass
   */
  @javax.annotation.Nullable
  public String getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsBackupRecoveryPointDetails awsBackupRecoveryPointDetails = (AwsBackupRecoveryPointDetails) o;
    return Objects.equals(this.backupSizeInBytes, awsBackupRecoveryPointDetails.backupSizeInBytes) &&
        Objects.equals(this.backupVaultArn, awsBackupRecoveryPointDetails.backupVaultArn) &&
        Objects.equals(this.backupVaultName, awsBackupRecoveryPointDetails.backupVaultName) &&
        Objects.equals(this.calculatedLifecycle, awsBackupRecoveryPointDetails.calculatedLifecycle) &&
        Objects.equals(this.completionDate, awsBackupRecoveryPointDetails.completionDate) &&
        Objects.equals(this.createdBy, awsBackupRecoveryPointDetails.createdBy) &&
        Objects.equals(this.creationDate, awsBackupRecoveryPointDetails.creationDate) &&
        Objects.equals(this.encryptionKeyArn, awsBackupRecoveryPointDetails.encryptionKeyArn) &&
        Objects.equals(this.iamRoleArn, awsBackupRecoveryPointDetails.iamRoleArn) &&
        Objects.equals(this.isEncrypted, awsBackupRecoveryPointDetails.isEncrypted) &&
        Objects.equals(this.lastRestoreTime, awsBackupRecoveryPointDetails.lastRestoreTime) &&
        Objects.equals(this.lifecycle, awsBackupRecoveryPointDetails.lifecycle) &&
        Objects.equals(this.recoveryPointArn, awsBackupRecoveryPointDetails.recoveryPointArn) &&
        Objects.equals(this.resourceArn, awsBackupRecoveryPointDetails.resourceArn) &&
        Objects.equals(this.resourceType, awsBackupRecoveryPointDetails.resourceType) &&
        Objects.equals(this.sourceBackupVaultArn, awsBackupRecoveryPointDetails.sourceBackupVaultArn) &&
        Objects.equals(this.status, awsBackupRecoveryPointDetails.status) &&
        Objects.equals(this.statusMessage, awsBackupRecoveryPointDetails.statusMessage) &&
        Objects.equals(this.storageClass, awsBackupRecoveryPointDetails.storageClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupSizeInBytes, backupVaultArn, backupVaultName, calculatedLifecycle, completionDate, createdBy, creationDate, encryptionKeyArn, iamRoleArn, isEncrypted, lastRestoreTime, lifecycle, recoveryPointArn, resourceArn, resourceType, sourceBackupVaultArn, status, statusMessage, storageClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsBackupRecoveryPointDetails {\n");
    sb.append("    backupSizeInBytes: ").append(toIndentedString(backupSizeInBytes)).append("\n");
    sb.append("    backupVaultArn: ").append(toIndentedString(backupVaultArn)).append("\n");
    sb.append("    backupVaultName: ").append(toIndentedString(backupVaultName)).append("\n");
    sb.append("    calculatedLifecycle: ").append(toIndentedString(calculatedLifecycle)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    encryptionKeyArn: ").append(toIndentedString(encryptionKeyArn)).append("\n");
    sb.append("    iamRoleArn: ").append(toIndentedString(iamRoleArn)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    lastRestoreTime: ").append(toIndentedString(lastRestoreTime)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    recoveryPointArn: ").append(toIndentedString(recoveryPointArn)).append("\n");
    sb.append("    resourceArn: ").append(toIndentedString(resourceArn)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    sourceBackupVaultArn: ").append(toIndentedString(sourceBackupVaultArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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
    openapiFields.add("BackupSizeInBytes");
    openapiFields.add("BackupVaultArn");
    openapiFields.add("BackupVaultName");
    openapiFields.add("CalculatedLifecycle");
    openapiFields.add("CompletionDate");
    openapiFields.add("CreatedBy");
    openapiFields.add("CreationDate");
    openapiFields.add("EncryptionKeyArn");
    openapiFields.add("IamRoleArn");
    openapiFields.add("IsEncrypted");
    openapiFields.add("LastRestoreTime");
    openapiFields.add("Lifecycle");
    openapiFields.add("RecoveryPointArn");
    openapiFields.add("ResourceArn");
    openapiFields.add("ResourceType");
    openapiFields.add("SourceBackupVaultArn");
    openapiFields.add("Status");
    openapiFields.add("StatusMessage");
    openapiFields.add("StorageClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsBackupRecoveryPointDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsBackupRecoveryPointDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsBackupRecoveryPointDetails is not found in the empty JSON string", AwsBackupRecoveryPointDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsBackupRecoveryPointDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsBackupRecoveryPointDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `BackupSizeInBytes`
      if (jsonObj.get("BackupSizeInBytes") != null && !jsonObj.get("BackupSizeInBytes").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BackupSizeInBytes"));
      }
      // validate the optional field `BackupVaultArn`
      if (jsonObj.get("BackupVaultArn") != null && !jsonObj.get("BackupVaultArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupVaultArn"));
      }
      // validate the optional field `BackupVaultName`
      if (jsonObj.get("BackupVaultName") != null && !jsonObj.get("BackupVaultName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("BackupVaultName"));
      }
      // validate the optional field `CalculatedLifecycle`
      if (jsonObj.get("CalculatedLifecycle") != null && !jsonObj.get("CalculatedLifecycle").isJsonNull()) {
        AwsBackupRecoveryPointDetailsCalculatedLifecycle.validateJsonElement(jsonObj.get("CalculatedLifecycle"));
      }
      // validate the optional field `CompletionDate`
      if (jsonObj.get("CompletionDate") != null && !jsonObj.get("CompletionDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CompletionDate"));
      }
      // validate the optional field `CreatedBy`
      if (jsonObj.get("CreatedBy") != null && !jsonObj.get("CreatedBy").isJsonNull()) {
        AwsBackupRecoveryPointDetailsCreatedBy.validateJsonElement(jsonObj.get("CreatedBy"));
      }
      // validate the optional field `CreationDate`
      if (jsonObj.get("CreationDate") != null && !jsonObj.get("CreationDate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreationDate"));
      }
      // validate the optional field `EncryptionKeyArn`
      if (jsonObj.get("EncryptionKeyArn") != null && !jsonObj.get("EncryptionKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EncryptionKeyArn"));
      }
      // validate the optional field `IamRoleArn`
      if (jsonObj.get("IamRoleArn") != null && !jsonObj.get("IamRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IamRoleArn"));
      }
      // validate the optional field `IsEncrypted`
      if (jsonObj.get("IsEncrypted") != null && !jsonObj.get("IsEncrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsEncrypted"));
      }
      // validate the optional field `LastRestoreTime`
      if (jsonObj.get("LastRestoreTime") != null && !jsonObj.get("LastRestoreTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LastRestoreTime"));
      }
      // validate the optional field `Lifecycle`
      if (jsonObj.get("Lifecycle") != null && !jsonObj.get("Lifecycle").isJsonNull()) {
        AwsBackupRecoveryPointDetailsLifecycle.validateJsonElement(jsonObj.get("Lifecycle"));
      }
      // validate the optional field `RecoveryPointArn`
      if (jsonObj.get("RecoveryPointArn") != null && !jsonObj.get("RecoveryPointArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RecoveryPointArn"));
      }
      // validate the optional field `ResourceArn`
      if (jsonObj.get("ResourceArn") != null && !jsonObj.get("ResourceArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceArn"));
      }
      // validate the optional field `ResourceType`
      if (jsonObj.get("ResourceType") != null && !jsonObj.get("ResourceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceType"));
      }
      // validate the optional field `SourceBackupVaultArn`
      if (jsonObj.get("SourceBackupVaultArn") != null && !jsonObj.get("SourceBackupVaultArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceBackupVaultArn"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `StatusMessage`
      if (jsonObj.get("StatusMessage") != null && !jsonObj.get("StatusMessage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StatusMessage"));
      }
      // validate the optional field `StorageClass`
      if (jsonObj.get("StorageClass") != null && !jsonObj.get("StorageClass").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StorageClass"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsBackupRecoveryPointDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsBackupRecoveryPointDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsBackupRecoveryPointDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsBackupRecoveryPointDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsBackupRecoveryPointDetails>() {
           @Override
           public void write(JsonWriter out, AwsBackupRecoveryPointDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsBackupRecoveryPointDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsBackupRecoveryPointDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsBackupRecoveryPointDetails
   * @throws IOException if the JSON string is invalid with respect to AwsBackupRecoveryPointDetails
   */
  public static AwsBackupRecoveryPointDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsBackupRecoveryPointDetails.class);
  }

  /**
   * Convert an instance of AwsBackupRecoveryPointDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

