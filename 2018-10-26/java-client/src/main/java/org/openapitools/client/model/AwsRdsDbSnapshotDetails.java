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
import java.util.List;

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
 * Provides details about an Amazon RDS DB cluster snapshot.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbSnapshotDetails {
  public static final String SERIALIZED_NAME_DB_SNAPSHOT_IDENTIFIER = "DbSnapshotIdentifier";
  @SerializedName(SERIALIZED_NAME_DB_SNAPSHOT_IDENTIFIER)
  private String dbSnapshotIdentifier;

  public static final String SERIALIZED_NAME_DB_INSTANCE_IDENTIFIER = "DbInstanceIdentifier";
  @SerializedName(SERIALIZED_NAME_DB_INSTANCE_IDENTIFIER)
  private String dbInstanceIdentifier;

  public static final String SERIALIZED_NAME_SNAPSHOT_CREATE_TIME = "SnapshotCreateTime";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_CREATE_TIME)
  private String snapshotCreateTime;

  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ALLOCATED_STORAGE = "AllocatedStorage";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_STORAGE)
  private Integer allocatedStorage;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "AvailabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private String availabilityZone;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_INSTANCE_CREATE_TIME = "InstanceCreateTime";
  @SerializedName(SERIALIZED_NAME_INSTANCE_CREATE_TIME)
  private String instanceCreateTime;

  public static final String SERIALIZED_NAME_MASTER_USERNAME = "MasterUsername";
  @SerializedName(SERIALIZED_NAME_MASTER_USERNAME)
  private String masterUsername;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_LICENSE_MODEL = "LicenseModel";
  @SerializedName(SERIALIZED_NAME_LICENSE_MODEL)
  private String licenseModel;

  public static final String SERIALIZED_NAME_SNAPSHOT_TYPE = "SnapshotType";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_TYPE)
  private String snapshotType;

  public static final String SERIALIZED_NAME_IOPS = "Iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_OPTION_GROUP_NAME = "OptionGroupName";
  @SerializedName(SERIALIZED_NAME_OPTION_GROUP_NAME)
  private String optionGroupName;

  public static final String SERIALIZED_NAME_PERCENT_PROGRESS = "PercentProgress";
  @SerializedName(SERIALIZED_NAME_PERCENT_PROGRESS)
  private Integer percentProgress;

  public static final String SERIALIZED_NAME_SOURCE_REGION = "SourceRegion";
  @SerializedName(SERIALIZED_NAME_SOURCE_REGION)
  private String sourceRegion;

  public static final String SERIALIZED_NAME_SOURCE_DB_SNAPSHOT_IDENTIFIER = "SourceDbSnapshotIdentifier";
  @SerializedName(SERIALIZED_NAME_SOURCE_DB_SNAPSHOT_IDENTIFIER)
  private String sourceDbSnapshotIdentifier;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "StorageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private String storageType;

  public static final String SERIALIZED_NAME_TDE_CREDENTIAL_ARN = "TdeCredentialArn";
  @SerializedName(SERIALIZED_NAME_TDE_CREDENTIAL_ARN)
  private String tdeCredentialArn;

  public static final String SERIALIZED_NAME_ENCRYPTED = "Encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_TIMEZONE = "Timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_IAM_DATABASE_AUTHENTICATION_ENABLED = "IamDatabaseAuthenticationEnabled";
  @SerializedName(SERIALIZED_NAME_IAM_DATABASE_AUTHENTICATION_ENABLED)
  private Boolean iamDatabaseAuthenticationEnabled;

  public static final String SERIALIZED_NAME_PROCESSOR_FEATURES = "ProcessorFeatures";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_FEATURES)
  private List processorFeatures;

  public static final String SERIALIZED_NAME_DBI_RESOURCE_ID = "DbiResourceId";
  @SerializedName(SERIALIZED_NAME_DBI_RESOURCE_ID)
  private String dbiResourceId;

  public AwsRdsDbSnapshotDetails() {
  }

  public AwsRdsDbSnapshotDetails dbSnapshotIdentifier(String dbSnapshotIdentifier) {
    this.dbSnapshotIdentifier = dbSnapshotIdentifier;
    return this;
  }

  /**
   * Get dbSnapshotIdentifier
   * @return dbSnapshotIdentifier
   */
  @javax.annotation.Nullable
  public String getDbSnapshotIdentifier() {
    return dbSnapshotIdentifier;
  }

  public void setDbSnapshotIdentifier(String dbSnapshotIdentifier) {
    this.dbSnapshotIdentifier = dbSnapshotIdentifier;
  }


  public AwsRdsDbSnapshotDetails dbInstanceIdentifier(String dbInstanceIdentifier) {
    this.dbInstanceIdentifier = dbInstanceIdentifier;
    return this;
  }

  /**
   * Get dbInstanceIdentifier
   * @return dbInstanceIdentifier
   */
  @javax.annotation.Nullable
  public String getDbInstanceIdentifier() {
    return dbInstanceIdentifier;
  }

  public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
    this.dbInstanceIdentifier = dbInstanceIdentifier;
  }


  public AwsRdsDbSnapshotDetails snapshotCreateTime(String snapshotCreateTime) {
    this.snapshotCreateTime = snapshotCreateTime;
    return this;
  }

  /**
   * Get snapshotCreateTime
   * @return snapshotCreateTime
   */
  @javax.annotation.Nullable
  public String getSnapshotCreateTime() {
    return snapshotCreateTime;
  }

  public void setSnapshotCreateTime(String snapshotCreateTime) {
    this.snapshotCreateTime = snapshotCreateTime;
  }


  public AwsRdsDbSnapshotDetails engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public AwsRdsDbSnapshotDetails allocatedStorage(Integer allocatedStorage) {
    this.allocatedStorage = allocatedStorage;
    return this;
  }

  /**
   * Get allocatedStorage
   * @return allocatedStorage
   */
  @javax.annotation.Nullable
  public Integer getAllocatedStorage() {
    return allocatedStorage;
  }

  public void setAllocatedStorage(Integer allocatedStorage) {
    this.allocatedStorage = allocatedStorage;
  }


  public AwsRdsDbSnapshotDetails status(String status) {
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


  public AwsRdsDbSnapshotDetails port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public AwsRdsDbSnapshotDetails availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * Get availabilityZone
   * @return availabilityZone
   */
  @javax.annotation.Nullable
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public AwsRdsDbSnapshotDetails vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public AwsRdsDbSnapshotDetails instanceCreateTime(String instanceCreateTime) {
    this.instanceCreateTime = instanceCreateTime;
    return this;
  }

  /**
   * Get instanceCreateTime
   * @return instanceCreateTime
   */
  @javax.annotation.Nullable
  public String getInstanceCreateTime() {
    return instanceCreateTime;
  }

  public void setInstanceCreateTime(String instanceCreateTime) {
    this.instanceCreateTime = instanceCreateTime;
  }


  public AwsRdsDbSnapshotDetails masterUsername(String masterUsername) {
    this.masterUsername = masterUsername;
    return this;
  }

  /**
   * Get masterUsername
   * @return masterUsername
   */
  @javax.annotation.Nullable
  public String getMasterUsername() {
    return masterUsername;
  }

  public void setMasterUsername(String masterUsername) {
    this.masterUsername = masterUsername;
  }


  public AwsRdsDbSnapshotDetails engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
   */
  @javax.annotation.Nullable
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }


  public AwsRdsDbSnapshotDetails licenseModel(String licenseModel) {
    this.licenseModel = licenseModel;
    return this;
  }

  /**
   * Get licenseModel
   * @return licenseModel
   */
  @javax.annotation.Nullable
  public String getLicenseModel() {
    return licenseModel;
  }

  public void setLicenseModel(String licenseModel) {
    this.licenseModel = licenseModel;
  }


  public AwsRdsDbSnapshotDetails snapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
    return this;
  }

  /**
   * Get snapshotType
   * @return snapshotType
   */
  @javax.annotation.Nullable
  public String getSnapshotType() {
    return snapshotType;
  }

  public void setSnapshotType(String snapshotType) {
    this.snapshotType = snapshotType;
  }


  public AwsRdsDbSnapshotDetails iops(Integer iops) {
    this.iops = iops;
    return this;
  }

  /**
   * Get iops
   * @return iops
   */
  @javax.annotation.Nullable
  public Integer getIops() {
    return iops;
  }

  public void setIops(Integer iops) {
    this.iops = iops;
  }


  public AwsRdsDbSnapshotDetails optionGroupName(String optionGroupName) {
    this.optionGroupName = optionGroupName;
    return this;
  }

  /**
   * Get optionGroupName
   * @return optionGroupName
   */
  @javax.annotation.Nullable
  public String getOptionGroupName() {
    return optionGroupName;
  }

  public void setOptionGroupName(String optionGroupName) {
    this.optionGroupName = optionGroupName;
  }


  public AwsRdsDbSnapshotDetails percentProgress(Integer percentProgress) {
    this.percentProgress = percentProgress;
    return this;
  }

  /**
   * Get percentProgress
   * @return percentProgress
   */
  @javax.annotation.Nullable
  public Integer getPercentProgress() {
    return percentProgress;
  }

  public void setPercentProgress(Integer percentProgress) {
    this.percentProgress = percentProgress;
  }


  public AwsRdsDbSnapshotDetails sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

  /**
   * Get sourceRegion
   * @return sourceRegion
   */
  @javax.annotation.Nullable
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }


  public AwsRdsDbSnapshotDetails sourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
    this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
    return this;
  }

  /**
   * Get sourceDbSnapshotIdentifier
   * @return sourceDbSnapshotIdentifier
   */
  @javax.annotation.Nullable
  public String getSourceDbSnapshotIdentifier() {
    return sourceDbSnapshotIdentifier;
  }

  public void setSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
    this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
  }


  public AwsRdsDbSnapshotDetails storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
   */
  @javax.annotation.Nullable
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }


  public AwsRdsDbSnapshotDetails tdeCredentialArn(String tdeCredentialArn) {
    this.tdeCredentialArn = tdeCredentialArn;
    return this;
  }

  /**
   * Get tdeCredentialArn
   * @return tdeCredentialArn
   */
  @javax.annotation.Nullable
  public String getTdeCredentialArn() {
    return tdeCredentialArn;
  }

  public void setTdeCredentialArn(String tdeCredentialArn) {
    this.tdeCredentialArn = tdeCredentialArn;
  }


  public AwsRdsDbSnapshotDetails encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

  /**
   * Get encrypted
   * @return encrypted
   */
  @javax.annotation.Nullable
  public Boolean getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }


  public AwsRdsDbSnapshotDetails kmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  /**
   * Get kmsKeyId
   * @return kmsKeyId
   */
  @javax.annotation.Nullable
  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public void setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
  }


  public AwsRdsDbSnapshotDetails timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AwsRdsDbSnapshotDetails iamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
    this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
    return this;
  }

  /**
   * Get iamDatabaseAuthenticationEnabled
   * @return iamDatabaseAuthenticationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIamDatabaseAuthenticationEnabled() {
    return iamDatabaseAuthenticationEnabled;
  }

  public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
    this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
  }


  public AwsRdsDbSnapshotDetails processorFeatures(List processorFeatures) {
    this.processorFeatures = processorFeatures;
    return this;
  }

  /**
   * Get processorFeatures
   * @return processorFeatures
   */
  @javax.annotation.Nullable
  public List getProcessorFeatures() {
    return processorFeatures;
  }

  public void setProcessorFeatures(List processorFeatures) {
    this.processorFeatures = processorFeatures;
  }


  public AwsRdsDbSnapshotDetails dbiResourceId(String dbiResourceId) {
    this.dbiResourceId = dbiResourceId;
    return this;
  }

  /**
   * Get dbiResourceId
   * @return dbiResourceId
   */
  @javax.annotation.Nullable
  public String getDbiResourceId() {
    return dbiResourceId;
  }

  public void setDbiResourceId(String dbiResourceId) {
    this.dbiResourceId = dbiResourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsRdsDbSnapshotDetails awsRdsDbSnapshotDetails = (AwsRdsDbSnapshotDetails) o;
    return Objects.equals(this.dbSnapshotIdentifier, awsRdsDbSnapshotDetails.dbSnapshotIdentifier) &&
        Objects.equals(this.dbInstanceIdentifier, awsRdsDbSnapshotDetails.dbInstanceIdentifier) &&
        Objects.equals(this.snapshotCreateTime, awsRdsDbSnapshotDetails.snapshotCreateTime) &&
        Objects.equals(this.engine, awsRdsDbSnapshotDetails.engine) &&
        Objects.equals(this.allocatedStorage, awsRdsDbSnapshotDetails.allocatedStorage) &&
        Objects.equals(this.status, awsRdsDbSnapshotDetails.status) &&
        Objects.equals(this.port, awsRdsDbSnapshotDetails.port) &&
        Objects.equals(this.availabilityZone, awsRdsDbSnapshotDetails.availabilityZone) &&
        Objects.equals(this.vpcId, awsRdsDbSnapshotDetails.vpcId) &&
        Objects.equals(this.instanceCreateTime, awsRdsDbSnapshotDetails.instanceCreateTime) &&
        Objects.equals(this.masterUsername, awsRdsDbSnapshotDetails.masterUsername) &&
        Objects.equals(this.engineVersion, awsRdsDbSnapshotDetails.engineVersion) &&
        Objects.equals(this.licenseModel, awsRdsDbSnapshotDetails.licenseModel) &&
        Objects.equals(this.snapshotType, awsRdsDbSnapshotDetails.snapshotType) &&
        Objects.equals(this.iops, awsRdsDbSnapshotDetails.iops) &&
        Objects.equals(this.optionGroupName, awsRdsDbSnapshotDetails.optionGroupName) &&
        Objects.equals(this.percentProgress, awsRdsDbSnapshotDetails.percentProgress) &&
        Objects.equals(this.sourceRegion, awsRdsDbSnapshotDetails.sourceRegion) &&
        Objects.equals(this.sourceDbSnapshotIdentifier, awsRdsDbSnapshotDetails.sourceDbSnapshotIdentifier) &&
        Objects.equals(this.storageType, awsRdsDbSnapshotDetails.storageType) &&
        Objects.equals(this.tdeCredentialArn, awsRdsDbSnapshotDetails.tdeCredentialArn) &&
        Objects.equals(this.encrypted, awsRdsDbSnapshotDetails.encrypted) &&
        Objects.equals(this.kmsKeyId, awsRdsDbSnapshotDetails.kmsKeyId) &&
        Objects.equals(this.timezone, awsRdsDbSnapshotDetails.timezone) &&
        Objects.equals(this.iamDatabaseAuthenticationEnabled, awsRdsDbSnapshotDetails.iamDatabaseAuthenticationEnabled) &&
        Objects.equals(this.processorFeatures, awsRdsDbSnapshotDetails.processorFeatures) &&
        Objects.equals(this.dbiResourceId, awsRdsDbSnapshotDetails.dbiResourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbSnapshotIdentifier, dbInstanceIdentifier, snapshotCreateTime, engine, allocatedStorage, status, port, availabilityZone, vpcId, instanceCreateTime, masterUsername, engineVersion, licenseModel, snapshotType, iops, optionGroupName, percentProgress, sourceRegion, sourceDbSnapshotIdentifier, storageType, tdeCredentialArn, encrypted, kmsKeyId, timezone, iamDatabaseAuthenticationEnabled, processorFeatures, dbiResourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbSnapshotDetails {\n");
    sb.append("    dbSnapshotIdentifier: ").append(toIndentedString(dbSnapshotIdentifier)).append("\n");
    sb.append("    dbInstanceIdentifier: ").append(toIndentedString(dbInstanceIdentifier)).append("\n");
    sb.append("    snapshotCreateTime: ").append(toIndentedString(snapshotCreateTime)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    allocatedStorage: ").append(toIndentedString(allocatedStorage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    instanceCreateTime: ").append(toIndentedString(instanceCreateTime)).append("\n");
    sb.append("    masterUsername: ").append(toIndentedString(masterUsername)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    licenseModel: ").append(toIndentedString(licenseModel)).append("\n");
    sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    optionGroupName: ").append(toIndentedString(optionGroupName)).append("\n");
    sb.append("    percentProgress: ").append(toIndentedString(percentProgress)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    sourceDbSnapshotIdentifier: ").append(toIndentedString(sourceDbSnapshotIdentifier)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    tdeCredentialArn: ").append(toIndentedString(tdeCredentialArn)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    iamDatabaseAuthenticationEnabled: ").append(toIndentedString(iamDatabaseAuthenticationEnabled)).append("\n");
    sb.append("    processorFeatures: ").append(toIndentedString(processorFeatures)).append("\n");
    sb.append("    dbiResourceId: ").append(toIndentedString(dbiResourceId)).append("\n");
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
    openapiFields.add("DbSnapshotIdentifier");
    openapiFields.add("DbInstanceIdentifier");
    openapiFields.add("SnapshotCreateTime");
    openapiFields.add("Engine");
    openapiFields.add("AllocatedStorage");
    openapiFields.add("Status");
    openapiFields.add("Port");
    openapiFields.add("AvailabilityZone");
    openapiFields.add("VpcId");
    openapiFields.add("InstanceCreateTime");
    openapiFields.add("MasterUsername");
    openapiFields.add("EngineVersion");
    openapiFields.add("LicenseModel");
    openapiFields.add("SnapshotType");
    openapiFields.add("Iops");
    openapiFields.add("OptionGroupName");
    openapiFields.add("PercentProgress");
    openapiFields.add("SourceRegion");
    openapiFields.add("SourceDbSnapshotIdentifier");
    openapiFields.add("StorageType");
    openapiFields.add("TdeCredentialArn");
    openapiFields.add("Encrypted");
    openapiFields.add("KmsKeyId");
    openapiFields.add("Timezone");
    openapiFields.add("IamDatabaseAuthenticationEnabled");
    openapiFields.add("ProcessorFeatures");
    openapiFields.add("DbiResourceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbSnapshotDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbSnapshotDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbSnapshotDetails is not found in the empty JSON string", AwsRdsDbSnapshotDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbSnapshotDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbSnapshotDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DbSnapshotIdentifier`
      if (jsonObj.get("DbSnapshotIdentifier") != null && !jsonObj.get("DbSnapshotIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSnapshotIdentifier"));
      }
      // validate the optional field `DbInstanceIdentifier`
      if (jsonObj.get("DbInstanceIdentifier") != null && !jsonObj.get("DbInstanceIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbInstanceIdentifier"));
      }
      // validate the optional field `SnapshotCreateTime`
      if (jsonObj.get("SnapshotCreateTime") != null && !jsonObj.get("SnapshotCreateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotCreateTime"));
      }
      // validate the optional field `Engine`
      if (jsonObj.get("Engine") != null && !jsonObj.get("Engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Engine"));
      }
      // validate the optional field `AllocatedStorage`
      if (jsonObj.get("AllocatedStorage") != null && !jsonObj.get("AllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AllocatedStorage"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Port"));
      }
      // validate the optional field `AvailabilityZone`
      if (jsonObj.get("AvailabilityZone") != null && !jsonObj.get("AvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZone"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `InstanceCreateTime`
      if (jsonObj.get("InstanceCreateTime") != null && !jsonObj.get("InstanceCreateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceCreateTime"));
      }
      // validate the optional field `MasterUsername`
      if (jsonObj.get("MasterUsername") != null && !jsonObj.get("MasterUsername").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterUsername"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `LicenseModel`
      if (jsonObj.get("LicenseModel") != null && !jsonObj.get("LicenseModel").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LicenseModel"));
      }
      // validate the optional field `SnapshotType`
      if (jsonObj.get("SnapshotType") != null && !jsonObj.get("SnapshotType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotType"));
      }
      // validate the optional field `Iops`
      if (jsonObj.get("Iops") != null && !jsonObj.get("Iops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Iops"));
      }
      // validate the optional field `OptionGroupName`
      if (jsonObj.get("OptionGroupName") != null && !jsonObj.get("OptionGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OptionGroupName"));
      }
      // validate the optional field `PercentProgress`
      if (jsonObj.get("PercentProgress") != null && !jsonObj.get("PercentProgress").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PercentProgress"));
      }
      // validate the optional field `SourceRegion`
      if (jsonObj.get("SourceRegion") != null && !jsonObj.get("SourceRegion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceRegion"));
      }
      // validate the optional field `SourceDbSnapshotIdentifier`
      if (jsonObj.get("SourceDbSnapshotIdentifier") != null && !jsonObj.get("SourceDbSnapshotIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SourceDbSnapshotIdentifier"));
      }
      // validate the optional field `StorageType`
      if (jsonObj.get("StorageType") != null && !jsonObj.get("StorageType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StorageType"));
      }
      // validate the optional field `TdeCredentialArn`
      if (jsonObj.get("TdeCredentialArn") != null && !jsonObj.get("TdeCredentialArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TdeCredentialArn"));
      }
      // validate the optional field `Encrypted`
      if (jsonObj.get("Encrypted") != null && !jsonObj.get("Encrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Encrypted"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `Timezone`
      if (jsonObj.get("Timezone") != null && !jsonObj.get("Timezone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Timezone"));
      }
      // validate the optional field `IamDatabaseAuthenticationEnabled`
      if (jsonObj.get("IamDatabaseAuthenticationEnabled") != null && !jsonObj.get("IamDatabaseAuthenticationEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IamDatabaseAuthenticationEnabled"));
      }
      // validate the optional field `ProcessorFeatures`
      if (jsonObj.get("ProcessorFeatures") != null && !jsonObj.get("ProcessorFeatures").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProcessorFeatures"));
      }
      // validate the optional field `DbiResourceId`
      if (jsonObj.get("DbiResourceId") != null && !jsonObj.get("DbiResourceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbiResourceId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsRdsDbSnapshotDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbSnapshotDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbSnapshotDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbSnapshotDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbSnapshotDetails>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbSnapshotDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbSnapshotDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbSnapshotDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbSnapshotDetails
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbSnapshotDetails
   */
  public static AwsRdsDbSnapshotDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbSnapshotDetails.class);
  }

  /**
   * Convert an instance of AwsRdsDbSnapshotDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

