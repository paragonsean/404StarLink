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
import org.openapitools.client.model.AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports;

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
 * AwsRdsDbInstanceDetailsPendingModifiedValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsRdsDbInstanceDetailsPendingModifiedValues {
  public static final String SERIALIZED_NAME_DB_INSTANCE_CLASS = "DbInstanceClass";
  @SerializedName(SERIALIZED_NAME_DB_INSTANCE_CLASS)
  private String dbInstanceClass;

  public static final String SERIALIZED_NAME_ALLOCATED_STORAGE = "AllocatedStorage";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_STORAGE)
  private Integer allocatedStorage;

  public static final String SERIALIZED_NAME_MASTER_USER_PASSWORD = "MasterUserPassword";
  @SerializedName(SERIALIZED_NAME_MASTER_USER_PASSWORD)
  private String masterUserPassword;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_BACKUP_RETENTION_PERIOD = "BackupRetentionPeriod";
  @SerializedName(SERIALIZED_NAME_BACKUP_RETENTION_PERIOD)
  private Integer backupRetentionPeriod;

  public static final String SERIALIZED_NAME_MULTI_A_Z = "MultiAZ";
  @SerializedName(SERIALIZED_NAME_MULTI_A_Z)
  private Boolean multiAZ;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_LICENSE_MODEL = "LicenseModel";
  @SerializedName(SERIALIZED_NAME_LICENSE_MODEL)
  private String licenseModel;

  public static final String SERIALIZED_NAME_IOPS = "Iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_DB_INSTANCE_IDENTIFIER = "DbInstanceIdentifier";
  @SerializedName(SERIALIZED_NAME_DB_INSTANCE_IDENTIFIER)
  private String dbInstanceIdentifier;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "StorageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private String storageType;

  public static final String SERIALIZED_NAME_CA_CERTIFICATE_IDENTIFIER = "CaCertificateIdentifier";
  @SerializedName(SERIALIZED_NAME_CA_CERTIFICATE_IDENTIFIER)
  private String caCertificateIdentifier;

  public static final String SERIALIZED_NAME_DB_SUBNET_GROUP_NAME = "DbSubnetGroupName";
  @SerializedName(SERIALIZED_NAME_DB_SUBNET_GROUP_NAME)
  private String dbSubnetGroupName;

  public static final String SERIALIZED_NAME_PENDING_CLOUD_WATCH_LOGS_EXPORTS = "PendingCloudWatchLogsExports";
  @SerializedName(SERIALIZED_NAME_PENDING_CLOUD_WATCH_LOGS_EXPORTS)
  private AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports pendingCloudWatchLogsExports;

  public static final String SERIALIZED_NAME_PROCESSOR_FEATURES = "ProcessorFeatures";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_FEATURES)
  private List processorFeatures;

  public AwsRdsDbInstanceDetailsPendingModifiedValues() {
  }

  public AwsRdsDbInstanceDetailsPendingModifiedValues dbInstanceClass(String dbInstanceClass) {
    this.dbInstanceClass = dbInstanceClass;
    return this;
  }

  /**
   * Get dbInstanceClass
   * @return dbInstanceClass
   */
  @javax.annotation.Nullable
  public String getDbInstanceClass() {
    return dbInstanceClass;
  }

  public void setDbInstanceClass(String dbInstanceClass) {
    this.dbInstanceClass = dbInstanceClass;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues allocatedStorage(Integer allocatedStorage) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues masterUserPassword(String masterUserPassword) {
    this.masterUserPassword = masterUserPassword;
    return this;
  }

  /**
   * Get masterUserPassword
   * @return masterUserPassword
   */
  @javax.annotation.Nullable
  public String getMasterUserPassword() {
    return masterUserPassword;
  }

  public void setMasterUserPassword(String masterUserPassword) {
    this.masterUserPassword = masterUserPassword;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues port(Integer port) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues backupRetentionPeriod(Integer backupRetentionPeriod) {
    this.backupRetentionPeriod = backupRetentionPeriod;
    return this;
  }

  /**
   * Get backupRetentionPeriod
   * @return backupRetentionPeriod
   */
  @javax.annotation.Nullable
  public Integer getBackupRetentionPeriod() {
    return backupRetentionPeriod;
  }

  public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
    this.backupRetentionPeriod = backupRetentionPeriod;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues multiAZ(Boolean multiAZ) {
    this.multiAZ = multiAZ;
    return this;
  }

  /**
   * Get multiAZ
   * @return multiAZ
   */
  @javax.annotation.Nullable
  public Boolean getMultiAZ() {
    return multiAZ;
  }

  public void setMultiAZ(Boolean multiAZ) {
    this.multiAZ = multiAZ;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues engineVersion(String engineVersion) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues licenseModel(String licenseModel) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues iops(Integer iops) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues dbInstanceIdentifier(String dbInstanceIdentifier) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues storageType(String storageType) {
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


  public AwsRdsDbInstanceDetailsPendingModifiedValues caCertificateIdentifier(String caCertificateIdentifier) {
    this.caCertificateIdentifier = caCertificateIdentifier;
    return this;
  }

  /**
   * Get caCertificateIdentifier
   * @return caCertificateIdentifier
   */
  @javax.annotation.Nullable
  public String getCaCertificateIdentifier() {
    return caCertificateIdentifier;
  }

  public void setCaCertificateIdentifier(String caCertificateIdentifier) {
    this.caCertificateIdentifier = caCertificateIdentifier;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues dbSubnetGroupName(String dbSubnetGroupName) {
    this.dbSubnetGroupName = dbSubnetGroupName;
    return this;
  }

  /**
   * Get dbSubnetGroupName
   * @return dbSubnetGroupName
   */
  @javax.annotation.Nullable
  public String getDbSubnetGroupName() {
    return dbSubnetGroupName;
  }

  public void setDbSubnetGroupName(String dbSubnetGroupName) {
    this.dbSubnetGroupName = dbSubnetGroupName;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues pendingCloudWatchLogsExports(AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
    this.pendingCloudWatchLogsExports = pendingCloudWatchLogsExports;
    return this;
  }

  /**
   * Get pendingCloudWatchLogsExports
   * @return pendingCloudWatchLogsExports
   */
  @javax.annotation.Nullable
  public AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports getPendingCloudWatchLogsExports() {
    return pendingCloudWatchLogsExports;
  }

  public void setPendingCloudWatchLogsExports(AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports pendingCloudWatchLogsExports) {
    this.pendingCloudWatchLogsExports = pendingCloudWatchLogsExports;
  }


  public AwsRdsDbInstanceDetailsPendingModifiedValues processorFeatures(List processorFeatures) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsRdsDbInstanceDetailsPendingModifiedValues awsRdsDbInstanceDetailsPendingModifiedValues = (AwsRdsDbInstanceDetailsPendingModifiedValues) o;
    return Objects.equals(this.dbInstanceClass, awsRdsDbInstanceDetailsPendingModifiedValues.dbInstanceClass) &&
        Objects.equals(this.allocatedStorage, awsRdsDbInstanceDetailsPendingModifiedValues.allocatedStorage) &&
        Objects.equals(this.masterUserPassword, awsRdsDbInstanceDetailsPendingModifiedValues.masterUserPassword) &&
        Objects.equals(this.port, awsRdsDbInstanceDetailsPendingModifiedValues.port) &&
        Objects.equals(this.backupRetentionPeriod, awsRdsDbInstanceDetailsPendingModifiedValues.backupRetentionPeriod) &&
        Objects.equals(this.multiAZ, awsRdsDbInstanceDetailsPendingModifiedValues.multiAZ) &&
        Objects.equals(this.engineVersion, awsRdsDbInstanceDetailsPendingModifiedValues.engineVersion) &&
        Objects.equals(this.licenseModel, awsRdsDbInstanceDetailsPendingModifiedValues.licenseModel) &&
        Objects.equals(this.iops, awsRdsDbInstanceDetailsPendingModifiedValues.iops) &&
        Objects.equals(this.dbInstanceIdentifier, awsRdsDbInstanceDetailsPendingModifiedValues.dbInstanceIdentifier) &&
        Objects.equals(this.storageType, awsRdsDbInstanceDetailsPendingModifiedValues.storageType) &&
        Objects.equals(this.caCertificateIdentifier, awsRdsDbInstanceDetailsPendingModifiedValues.caCertificateIdentifier) &&
        Objects.equals(this.dbSubnetGroupName, awsRdsDbInstanceDetailsPendingModifiedValues.dbSubnetGroupName) &&
        Objects.equals(this.pendingCloudWatchLogsExports, awsRdsDbInstanceDetailsPendingModifiedValues.pendingCloudWatchLogsExports) &&
        Objects.equals(this.processorFeatures, awsRdsDbInstanceDetailsPendingModifiedValues.processorFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbInstanceClass, allocatedStorage, masterUserPassword, port, backupRetentionPeriod, multiAZ, engineVersion, licenseModel, iops, dbInstanceIdentifier, storageType, caCertificateIdentifier, dbSubnetGroupName, pendingCloudWatchLogsExports, processorFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsRdsDbInstanceDetailsPendingModifiedValues {\n");
    sb.append("    dbInstanceClass: ").append(toIndentedString(dbInstanceClass)).append("\n");
    sb.append("    allocatedStorage: ").append(toIndentedString(allocatedStorage)).append("\n");
    sb.append("    masterUserPassword: ").append(toIndentedString(masterUserPassword)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    backupRetentionPeriod: ").append(toIndentedString(backupRetentionPeriod)).append("\n");
    sb.append("    multiAZ: ").append(toIndentedString(multiAZ)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    licenseModel: ").append(toIndentedString(licenseModel)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    dbInstanceIdentifier: ").append(toIndentedString(dbInstanceIdentifier)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    caCertificateIdentifier: ").append(toIndentedString(caCertificateIdentifier)).append("\n");
    sb.append("    dbSubnetGroupName: ").append(toIndentedString(dbSubnetGroupName)).append("\n");
    sb.append("    pendingCloudWatchLogsExports: ").append(toIndentedString(pendingCloudWatchLogsExports)).append("\n");
    sb.append("    processorFeatures: ").append(toIndentedString(processorFeatures)).append("\n");
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
    openapiFields.add("DbInstanceClass");
    openapiFields.add("AllocatedStorage");
    openapiFields.add("MasterUserPassword");
    openapiFields.add("Port");
    openapiFields.add("BackupRetentionPeriod");
    openapiFields.add("MultiAZ");
    openapiFields.add("EngineVersion");
    openapiFields.add("LicenseModel");
    openapiFields.add("Iops");
    openapiFields.add("DbInstanceIdentifier");
    openapiFields.add("StorageType");
    openapiFields.add("CaCertificateIdentifier");
    openapiFields.add("DbSubnetGroupName");
    openapiFields.add("PendingCloudWatchLogsExports");
    openapiFields.add("ProcessorFeatures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsRdsDbInstanceDetailsPendingModifiedValues
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsRdsDbInstanceDetailsPendingModifiedValues.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsRdsDbInstanceDetailsPendingModifiedValues is not found in the empty JSON string", AwsRdsDbInstanceDetailsPendingModifiedValues.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsRdsDbInstanceDetailsPendingModifiedValues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsRdsDbInstanceDetailsPendingModifiedValues` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DbInstanceClass`
      if (jsonObj.get("DbInstanceClass") != null && !jsonObj.get("DbInstanceClass").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbInstanceClass"));
      }
      // validate the optional field `AllocatedStorage`
      if (jsonObj.get("AllocatedStorage") != null && !jsonObj.get("AllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AllocatedStorage"));
      }
      // validate the optional field `MasterUserPassword`
      if (jsonObj.get("MasterUserPassword") != null && !jsonObj.get("MasterUserPassword").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MasterUserPassword"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Port"));
      }
      // validate the optional field `BackupRetentionPeriod`
      if (jsonObj.get("BackupRetentionPeriod") != null && !jsonObj.get("BackupRetentionPeriod").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("BackupRetentionPeriod"));
      }
      // validate the optional field `MultiAZ`
      if (jsonObj.get("MultiAZ") != null && !jsonObj.get("MultiAZ").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("MultiAZ"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `LicenseModel`
      if (jsonObj.get("LicenseModel") != null && !jsonObj.get("LicenseModel").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LicenseModel"));
      }
      // validate the optional field `Iops`
      if (jsonObj.get("Iops") != null && !jsonObj.get("Iops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Iops"));
      }
      // validate the optional field `DbInstanceIdentifier`
      if (jsonObj.get("DbInstanceIdentifier") != null && !jsonObj.get("DbInstanceIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbInstanceIdentifier"));
      }
      // validate the optional field `StorageType`
      if (jsonObj.get("StorageType") != null && !jsonObj.get("StorageType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StorageType"));
      }
      // validate the optional field `CaCertificateIdentifier`
      if (jsonObj.get("CaCertificateIdentifier") != null && !jsonObj.get("CaCertificateIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CaCertificateIdentifier"));
      }
      // validate the optional field `DbSubnetGroupName`
      if (jsonObj.get("DbSubnetGroupName") != null && !jsonObj.get("DbSubnetGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DbSubnetGroupName"));
      }
      // validate the optional field `PendingCloudWatchLogsExports`
      if (jsonObj.get("PendingCloudWatchLogsExports") != null && !jsonObj.get("PendingCloudWatchLogsExports").isJsonNull()) {
        AwsRdsDbPendingModifiedValuesPendingCloudWatchLogsExports.validateJsonElement(jsonObj.get("PendingCloudWatchLogsExports"));
      }
      // validate the optional field `ProcessorFeatures`
      if (jsonObj.get("ProcessorFeatures") != null && !jsonObj.get("ProcessorFeatures").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ProcessorFeatures"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsRdsDbInstanceDetailsPendingModifiedValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsRdsDbInstanceDetailsPendingModifiedValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsRdsDbInstanceDetailsPendingModifiedValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsRdsDbInstanceDetailsPendingModifiedValues.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsRdsDbInstanceDetailsPendingModifiedValues>() {
           @Override
           public void write(JsonWriter out, AwsRdsDbInstanceDetailsPendingModifiedValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsRdsDbInstanceDetailsPendingModifiedValues read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsRdsDbInstanceDetailsPendingModifiedValues given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsRdsDbInstanceDetailsPendingModifiedValues
   * @throws IOException if the JSON string is invalid with respect to AwsRdsDbInstanceDetailsPendingModifiedValues
   */
  public static AwsRdsDbInstanceDetailsPendingModifiedValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsRdsDbInstanceDetailsPendingModifiedValues.class);
  }

  /**
   * Convert an instance of AwsRdsDbInstanceDetailsPendingModifiedValues to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

