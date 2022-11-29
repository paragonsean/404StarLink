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
 * Information about an Amazon RDS DB cluster snapshot.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbClusterSnapshotDetails {
  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

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

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_CLUSTER_CREATE_TIME = "ClusterCreateTime";
  @SerializedName(SERIALIZED_NAME_CLUSTER_CREATE_TIME)
  private String clusterCreateTime;

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

  public static final String SERIALIZED_NAME_PERCENT_PROGRESS = "PercentProgress";
  @SerializedName(SERIALIZED_NAME_PERCENT_PROGRESS)
  private Integer percentProgress;

  public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "StorageEncrypted";
  @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
  private Boolean storageEncrypted;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_DB_CLUSTER_IDENTIFIER = "DbClusterIdentifier";
  @SerializedName(SERIALIZED_NAME_DB_CLUSTER_IDENTIFIER)
  private String dbClusterIdentifier;

  public static final String SERIALIZED_NAME_DB_CLUSTER_SNAPSHOT_IDENTIFIER = "DbClusterSnapshotIdentifier";
  @SerializedName(SERIALIZED_NAME_DB_CLUSTER_SNAPSHOT_IDENTIFIER)
  private String dbClusterSnapshotIdentifier;

  public static final String SERIALIZED_NAME_IAM_DATABASE_AUTHENTICATION_ENABLED = "IamDatabaseAuthenticationEnabled";
  @SerializedName(SERIALIZED_NAME_IAM_DATABASE_AUTHENTICATION_ENABLED)
  private Boolean iamDatabaseAuthenticationEnabled;

  public AwsRdsDbClusterSnapshotDetails() {
  }

  public AwsRdsDbClusterSnapshotDetails availabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
    return this;
  }

  /**
   * Get availabilityZones
   * @return availabilityZones
   */
  @javax.annotation.Nullable
  public List getAvailabilityZones() {
    return availabilityZones;
  }

  public void setAvailabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
  }


  public AwsRdsDbClusterSnapshotDetails snapshotCreateTime(String snapshotCreateTime) {
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


  public AwsRdsDbClusterSnapshotDetails engine(String engine) {
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


  public AwsRdsDbClusterSnapshotDetails allocatedStorage(Integer allocatedStorage) {
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


  public AwsRdsDbClusterSnapshotDetails status(String status) {
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


  public AwsRdsDbClusterSnapshotDetails port(Integer port) {
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


  public AwsRdsDbClusterSnapshotDetails vpcId(String vpcId) {
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


  public AwsRdsDbClusterSnapshotDetails clusterCreateTime(String clusterCreateTime) {
    this.clusterCreateTime = clusterCreateTime;
    return this;
  }

  /**
   * Get clusterCreateTime
   * @return clusterCreateTime
   */
  @javax.annotation.Nullable
  public String getClusterCreateTime() {
    return clusterCreateTime;
  }

  public void setClusterCreateTime(String clusterCreateTime) {
    this.clusterCreateTime = clusterCreateTime;
  }


  public AwsRdsDbClusterSnapshotDetails masterUsername(String masterUsername) {
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


  public AwsRdsDbClusterSnapshotDetails engineVersion(String engineVersion) {
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


  public AwsRdsDbClusterSnapshotDetails licenseModel(String licenseModel) {
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


  public AwsRdsDbClusterSnapshotDetails snapshotType(String snapshotType) {
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


  public AwsRdsDbClusterSnapshotDetails percentProgress(Integer percentProgress) {
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


  public AwsRdsDbClusterSnapshotDetails storageEncrypted(Boolean storageEncrypted) {
    this.storageEncrypted = storageEncrypted;
    return this;
  }

  /**
   * Get storageEncrypted
   * @return storageEncrypted
   */
  @javax.annotation.Nullable
  public Boolean getStorageEncrypted() {
    return storageEncrypted;
  }

  public void setStorageEncrypted(Boolean storageEncrypted) {
    this.storageEncrypted = storageEncrypted;
  }


  public AwsRdsDbClusterSnapshotDetails kmsKeyId(String kmsKeyId) {
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


  public AwsRdsDbClusterSnapshotDetails dbClusterIdentifier(String dbClusterIdentifier) {
    this.dbClusterIdentifier = dbClusterIdentifier;
    return this;
  }

  /**
   * Get dbClusterIdentifier
   * @return dbClusterIdentifier
   */
  @javax.annotation.Nullable
  public String getDbClusterIdentifier() {
    return dbClusterIdentifier;
  }

  public void setDbClusterIdentifier(String dbClusterIdentifier) {
    this.dbClusterIdentifier = dbClusterIdentifier;
  }


  public AwsRdsDbClusterSnapshotDetails dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
    this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
    return this;
  }

  /**
   * Get dbClusterSnapshotIdentifier
   * @return dbClusterSnapshotIdentifier
   */
  @javax.annotation.Nullable
  public String getDbClusterSnapshotIdentifier() {
    return dbClusterSnapshotIdentifier;
  }

  public void setDbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
    this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
  }


  public AwsRdsDbClusterSnapshotDetails iamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshotDetails = (AwsRdsDbClusterSnapshotDetails) o;
    return Objects.equals(this.availabilityZones, awsRdsDbClusterSnapshotDetails.availabilityZones) &&
        Objects.equals(this.snapshotCreateTime, awsRdsDbClusterSnapshotDetails.snapshotCreateTime) &&
        Objects.equals(this.engine, awsRdsDbClusterSnapshotDetails.engine) &&
        Objects.equals(this.allocatedStorage, awsRdsDbClusterSnapshotDetails.allocatedStorage) &&
        Objects.equals(this.status, awsRdsDbClusterSnapshotDetails.status) &&
        Objects.equals(this.port, awsRdsDbClusterSnapshotDetails.port) &&
        Objects.equals(this.vpcId, awsRdsDbClusterSnapshotDetails.vpcId) &&
        Objects.equals(this.clusterCreateTime, awsRdsDbClusterSnapshotDetails.clusterCreateTime) &&
        Objects.equals(this.masterUsername, awsRdsDbClusterSnapshotDetails.masterUsername) &&
        Objects.equals(this.engineVersion, awsRdsDbClusterSnapshotDetails.engineVersion) &&
        Objects.equals(this.licenseModel, awsRdsDbClusterSnapshotDetails.licenseModel) &&
        Objects.equals(this.snapshotType, awsRdsDbClusterSnapshotDetails.snapshotType) &&
        Objects.equals(this.percentProgress, awsRdsDbClusterSnapshotDetails.percentProgress) &&
        Objects.equals(this.storageEncrypted, awsRdsDbClusterSnapshotDetails.storageEncrypted) &&
        Objects.equals(this.kmsKeyId, awsRdsDbClusterSnapshotDetails.kmsKeyId) &&
        Objects.equals(this.dbClusterIdentifier, awsRdsDbClusterSnapshotDetails.dbClusterIdentifier) &&
        Objects.equals(this.dbClusterSnapshotIdentifier, awsRdsDbClusterSnapshotDetails.dbClusterSnapshotIdentifier) &&
        Objects.equals(this.iamDatabaseAuthenticationEnabled, awsRdsDbClusterSnapshotDetails.iamDatabaseAuthenticationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZones, snapshotCreateTime, engine, allocatedStorage, status, port, vpcId, clusterCreateTime, masterUsername, engineVersion, licenseModel, snapshotType, percentProgress, storageEncrypted, kmsKeyId, dbClusterIdentifier, dbClusterSnapshotIdentifier, iamDatabaseAuthenticationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbClusterSnapshotDetails {\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    snapshotCreateTime: ").append(toIndentedString(snapshotCreateTime)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    allocatedStorage: ").append(toIndentedString(allocatedStorage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    clusterCreateTime: ").append(toIndentedString(clusterCreateTime)).append("\n");
    sb.append("    masterUsername: ").append(toIndentedString(masterUsername)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    licenseModel: ").append(toIndentedString(licenseModel)).append("\n");
    sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
    sb.append("    percentProgress: ").append(toIndentedString(percentProgress)).append("\n");
    sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    dbClusterIdentifier: ").append(toIndentedString(dbClusterIdentifier)).append("\n");
    sb.append("    dbClusterSnapshotIdentifier: ").append(toIndentedString(dbClusterSnapshotIdentifier)).append("\n");
    sb.append("    iamDatabaseAuthenticationEnabled: ").append(toIndentedString(iamDatabaseAuthenticationEnabled)).append("\n");
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
    openapiFields.add("AvailabilityZones");
    openapiFields.add("SnapshotCreateTime");
    openapiFields.add("Engine");
    openapiFields.add("AllocatedStorage");
    openapiFields.add("Status");
    openapiFields.add("Port");
    openapiFields.add("VpcId");
    openapiFields.add("ClusterCreateTime");
    openapiFields.add("MasterUsername");
    openapiFields.add("EngineVersion");
    openapiFields.add("LicenseModel");
    openapiFields.add("SnapshotType");
    openapiFields.add("PercentProgress");
    openapiFields.add("StorageEncrypted");
    openapiFields.add("KmsKeyId");
    openapiFields.add("DbClusterIdentifier");
    openapiFields.add("DbClusterSnapshotIdentifier");
    openapiFields.add("IamDatabaseAuthenticationEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbClusterSnapshotDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbClusterSnapshotDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbClusterSnapshotDetails is not found in the empty JSON string", AwsRdsDbClusterSnapshotDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbClusterSnapshotDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbClusterSnapshotDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
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
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `ClusterCreateTime`
      if (jsonObj.get("ClusterCreateTime") != null && !jsonObj.get("ClusterCreateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClusterCreateTime"));
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
      // validate the optional field `PercentProgress`
      if (jsonObj.get("PercentProgress") != null && !jsonObj.get("PercentProgress").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PercentProgress"));
      }
      // validate the optional field `StorageEncrypted`
      if (jsonObj.get("StorageEncrypted") != null && !jsonObj.get("StorageEncrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("StorageEncrypted"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `DbClusterIdentifier`
      if (jsonObj.get("DbClusterIdentifier") != null && !jsonObj.get("DbClusterIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbClusterIdentifier"));
      }
      // validate the optional field `DbClusterSnapshotIdentifier`
      if (jsonObj.get("DbClusterSnapshotIdentifier") != null && !jsonObj.get("DbClusterSnapshotIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbClusterSnapshotIdentifier"));
      }
      // validate the optional field `IamDatabaseAuthenticationEnabled`
      if (jsonObj.get("IamDatabaseAuthenticationEnabled") != null && !jsonObj.get("IamDatabaseAuthenticationEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IamDatabaseAuthenticationEnabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsRdsDbClusterSnapshotDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbClusterSnapshotDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbClusterSnapshotDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbClusterSnapshotDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbClusterSnapshotDetails>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbClusterSnapshotDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbClusterSnapshotDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbClusterSnapshotDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbClusterSnapshotDetails
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbClusterSnapshotDetails
   */
  public static AwsRdsDbClusterSnapshotDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbClusterSnapshotDetails.class);
  }

  /**
   * Convert an instance of AwsRdsDbClusterSnapshotDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

