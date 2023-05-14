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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateReplicationInstanceMessage {
  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_IDENTIFIER = "ReplicationInstanceIdentifier";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_IDENTIFIER)
  private String replicationInstanceIdentifier;

  public static final String SERIALIZED_NAME_ALLOCATED_STORAGE = "AllocatedStorage";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_STORAGE)
  private Integer allocatedStorage;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_CLASS = "ReplicationInstanceClass";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_CLASS)
  private String replicationInstanceClass;

  public static final String SERIALIZED_NAME_VPC_SECURITY_GROUP_IDS = "VpcSecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_VPC_SECURITY_GROUP_IDS)
  private List vpcSecurityGroupIds;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "AvailabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private String availabilityZone;

  public static final String SERIALIZED_NAME_REPLICATION_SUBNET_GROUP_IDENTIFIER = "ReplicationSubnetGroupIdentifier";
  @SerializedName(SERIALIZED_NAME_REPLICATION_SUBNET_GROUP_IDENTIFIER)
  private String replicationSubnetGroupIdentifier;

  public static final String SERIALIZED_NAME_PREFERRED_MAINTENANCE_WINDOW = "PreferredMaintenanceWindow";
  @SerializedName(SERIALIZED_NAME_PREFERRED_MAINTENANCE_WINDOW)
  private String preferredMaintenanceWindow;

  public static final String SERIALIZED_NAME_MULTI_A_Z = "MultiAZ";
  @SerializedName(SERIALIZED_NAME_MULTI_A_Z)
  private Boolean multiAZ;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_AUTO_MINOR_VERSION_UPGRADE = "AutoMinorVersionUpgrade";
  @SerializedName(SERIALIZED_NAME_AUTO_MINOR_VERSION_UPGRADE)
  private Boolean autoMinorVersionUpgrade;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_PUBLICLY_ACCESSIBLE = "PubliclyAccessible";
  @SerializedName(SERIALIZED_NAME_PUBLICLY_ACCESSIBLE)
  private Boolean publiclyAccessible;

  public static final String SERIALIZED_NAME_DNS_NAME_SERVERS = "DnsNameServers";
  @SerializedName(SERIALIZED_NAME_DNS_NAME_SERVERS)
  private String dnsNameServers;

  public static final String SERIALIZED_NAME_RESOURCE_IDENTIFIER = "ResourceIdentifier";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDENTIFIER)
  private String resourceIdentifier;

  public static final String SERIALIZED_NAME_NETWORK_TYPE = "NetworkType";
  @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
  private String networkType;

  public CreateReplicationInstanceMessage() {
  }

  public CreateReplicationInstanceMessage replicationInstanceIdentifier(String replicationInstanceIdentifier) {
    this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    return this;
  }

  /**
   * Get replicationInstanceIdentifier
   * @return replicationInstanceIdentifier
   */
  @javax.annotation.Nonnull
  public String getReplicationInstanceIdentifier() {
    return replicationInstanceIdentifier;
  }

  public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
    this.replicationInstanceIdentifier = replicationInstanceIdentifier;
  }


  public CreateReplicationInstanceMessage allocatedStorage(Integer allocatedStorage) {
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


  public CreateReplicationInstanceMessage replicationInstanceClass(String replicationInstanceClass) {
    this.replicationInstanceClass = replicationInstanceClass;
    return this;
  }

  /**
   * Get replicationInstanceClass
   * @return replicationInstanceClass
   */
  @javax.annotation.Nonnull
  public String getReplicationInstanceClass() {
    return replicationInstanceClass;
  }

  public void setReplicationInstanceClass(String replicationInstanceClass) {
    this.replicationInstanceClass = replicationInstanceClass;
  }


  public CreateReplicationInstanceMessage vpcSecurityGroupIds(List vpcSecurityGroupIds) {
    this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    return this;
  }

  /**
   * Get vpcSecurityGroupIds
   * @return vpcSecurityGroupIds
   */
  @javax.annotation.Nullable
  public List getVpcSecurityGroupIds() {
    return vpcSecurityGroupIds;
  }

  public void setVpcSecurityGroupIds(List vpcSecurityGroupIds) {
    this.vpcSecurityGroupIds = vpcSecurityGroupIds;
  }


  public CreateReplicationInstanceMessage availabilityZone(String availabilityZone) {
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


  public CreateReplicationInstanceMessage replicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
    this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    return this;
  }

  /**
   * Get replicationSubnetGroupIdentifier
   * @return replicationSubnetGroupIdentifier
   */
  @javax.annotation.Nullable
  public String getReplicationSubnetGroupIdentifier() {
    return replicationSubnetGroupIdentifier;
  }

  public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
    this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
  }


  public CreateReplicationInstanceMessage preferredMaintenanceWindow(String preferredMaintenanceWindow) {
    this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    return this;
  }

  /**
   * Get preferredMaintenanceWindow
   * @return preferredMaintenanceWindow
   */
  @javax.annotation.Nullable
  public String getPreferredMaintenanceWindow() {
    return preferredMaintenanceWindow;
  }

  public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
    this.preferredMaintenanceWindow = preferredMaintenanceWindow;
  }


  public CreateReplicationInstanceMessage multiAZ(Boolean multiAZ) {
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


  public CreateReplicationInstanceMessage engineVersion(String engineVersion) {
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


  public CreateReplicationInstanceMessage autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
    this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    return this;
  }

  /**
   * Get autoMinorVersionUpgrade
   * @return autoMinorVersionUpgrade
   */
  @javax.annotation.Nullable
  public Boolean getAutoMinorVersionUpgrade() {
    return autoMinorVersionUpgrade;
  }

  public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
    this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
  }


  public CreateReplicationInstanceMessage tags(List tags) {
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


  public CreateReplicationInstanceMessage kmsKeyId(String kmsKeyId) {
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


  public CreateReplicationInstanceMessage publiclyAccessible(Boolean publiclyAccessible) {
    this.publiclyAccessible = publiclyAccessible;
    return this;
  }

  /**
   * Get publiclyAccessible
   * @return publiclyAccessible
   */
  @javax.annotation.Nullable
  public Boolean getPubliclyAccessible() {
    return publiclyAccessible;
  }

  public void setPubliclyAccessible(Boolean publiclyAccessible) {
    this.publiclyAccessible = publiclyAccessible;
  }


  public CreateReplicationInstanceMessage dnsNameServers(String dnsNameServers) {
    this.dnsNameServers = dnsNameServers;
    return this;
  }

  /**
   * Get dnsNameServers
   * @return dnsNameServers
   */
  @javax.annotation.Nullable
  public String getDnsNameServers() {
    return dnsNameServers;
  }

  public void setDnsNameServers(String dnsNameServers) {
    this.dnsNameServers = dnsNameServers;
  }


  public CreateReplicationInstanceMessage resourceIdentifier(String resourceIdentifier) {
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


  public CreateReplicationInstanceMessage networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * Get networkType
   * @return networkType
   */
  @javax.annotation.Nullable
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReplicationInstanceMessage createReplicationInstanceMessage = (CreateReplicationInstanceMessage) o;
    return Objects.equals(this.replicationInstanceIdentifier, createReplicationInstanceMessage.replicationInstanceIdentifier) &&
        Objects.equals(this.allocatedStorage, createReplicationInstanceMessage.allocatedStorage) &&
        Objects.equals(this.replicationInstanceClass, createReplicationInstanceMessage.replicationInstanceClass) &&
        Objects.equals(this.vpcSecurityGroupIds, createReplicationInstanceMessage.vpcSecurityGroupIds) &&
        Objects.equals(this.availabilityZone, createReplicationInstanceMessage.availabilityZone) &&
        Objects.equals(this.replicationSubnetGroupIdentifier, createReplicationInstanceMessage.replicationSubnetGroupIdentifier) &&
        Objects.equals(this.preferredMaintenanceWindow, createReplicationInstanceMessage.preferredMaintenanceWindow) &&
        Objects.equals(this.multiAZ, createReplicationInstanceMessage.multiAZ) &&
        Objects.equals(this.engineVersion, createReplicationInstanceMessage.engineVersion) &&
        Objects.equals(this.autoMinorVersionUpgrade, createReplicationInstanceMessage.autoMinorVersionUpgrade) &&
        Objects.equals(this.tags, createReplicationInstanceMessage.tags) &&
        Objects.equals(this.kmsKeyId, createReplicationInstanceMessage.kmsKeyId) &&
        Objects.equals(this.publiclyAccessible, createReplicationInstanceMessage.publiclyAccessible) &&
        Objects.equals(this.dnsNameServers, createReplicationInstanceMessage.dnsNameServers) &&
        Objects.equals(this.resourceIdentifier, createReplicationInstanceMessage.resourceIdentifier) &&
        Objects.equals(this.networkType, createReplicationInstanceMessage.networkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationInstanceIdentifier, allocatedStorage, replicationInstanceClass, vpcSecurityGroupIds, availabilityZone, replicationSubnetGroupIdentifier, preferredMaintenanceWindow, multiAZ, engineVersion, autoMinorVersionUpgrade, tags, kmsKeyId, publiclyAccessible, dnsNameServers, resourceIdentifier, networkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReplicationInstanceMessage {\n");
    sb.append("    replicationInstanceIdentifier: ").append(toIndentedString(replicationInstanceIdentifier)).append("\n");
    sb.append("    allocatedStorage: ").append(toIndentedString(allocatedStorage)).append("\n");
    sb.append("    replicationInstanceClass: ").append(toIndentedString(replicationInstanceClass)).append("\n");
    sb.append("    vpcSecurityGroupIds: ").append(toIndentedString(vpcSecurityGroupIds)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    replicationSubnetGroupIdentifier: ").append(toIndentedString(replicationSubnetGroupIdentifier)).append("\n");
    sb.append("    preferredMaintenanceWindow: ").append(toIndentedString(preferredMaintenanceWindow)).append("\n");
    sb.append("    multiAZ: ").append(toIndentedString(multiAZ)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    autoMinorVersionUpgrade: ").append(toIndentedString(autoMinorVersionUpgrade)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    publiclyAccessible: ").append(toIndentedString(publiclyAccessible)).append("\n");
    sb.append("    dnsNameServers: ").append(toIndentedString(dnsNameServers)).append("\n");
    sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
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
    openapiFields.add("ReplicationInstanceIdentifier");
    openapiFields.add("AllocatedStorage");
    openapiFields.add("ReplicationInstanceClass");
    openapiFields.add("VpcSecurityGroupIds");
    openapiFields.add("AvailabilityZone");
    openapiFields.add("ReplicationSubnetGroupIdentifier");
    openapiFields.add("PreferredMaintenanceWindow");
    openapiFields.add("MultiAZ");
    openapiFields.add("EngineVersion");
    openapiFields.add("AutoMinorVersionUpgrade");
    openapiFields.add("Tags");
    openapiFields.add("KmsKeyId");
    openapiFields.add("PubliclyAccessible");
    openapiFields.add("DnsNameServers");
    openapiFields.add("ResourceIdentifier");
    openapiFields.add("NetworkType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationInstanceIdentifier");
    openapiRequiredFields.add("ReplicationInstanceClass");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateReplicationInstanceMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateReplicationInstanceMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReplicationInstanceMessage is not found in the empty JSON string", CreateReplicationInstanceMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateReplicationInstanceMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateReplicationInstanceMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateReplicationInstanceMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationInstanceIdentifier`
      String.validateJsonElement(jsonObj.get("ReplicationInstanceIdentifier"));
      // validate the optional field `AllocatedStorage`
      if (jsonObj.get("AllocatedStorage") != null && !jsonObj.get("AllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("AllocatedStorage"));
      }
      // validate the required field `ReplicationInstanceClass`
      String.validateJsonElement(jsonObj.get("ReplicationInstanceClass"));
      // validate the optional field `VpcSecurityGroupIds`
      if (jsonObj.get("VpcSecurityGroupIds") != null && !jsonObj.get("VpcSecurityGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("VpcSecurityGroupIds"));
      }
      // validate the optional field `AvailabilityZone`
      if (jsonObj.get("AvailabilityZone") != null && !jsonObj.get("AvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZone"));
      }
      // validate the optional field `ReplicationSubnetGroupIdentifier`
      if (jsonObj.get("ReplicationSubnetGroupIdentifier") != null && !jsonObj.get("ReplicationSubnetGroupIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationSubnetGroupIdentifier"));
      }
      // validate the optional field `PreferredMaintenanceWindow`
      if (jsonObj.get("PreferredMaintenanceWindow") != null && !jsonObj.get("PreferredMaintenanceWindow").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PreferredMaintenanceWindow"));
      }
      // validate the optional field `MultiAZ`
      if (jsonObj.get("MultiAZ") != null && !jsonObj.get("MultiAZ").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("MultiAZ"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `AutoMinorVersionUpgrade`
      if (jsonObj.get("AutoMinorVersionUpgrade") != null && !jsonObj.get("AutoMinorVersionUpgrade").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoMinorVersionUpgrade"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `PubliclyAccessible`
      if (jsonObj.get("PubliclyAccessible") != null && !jsonObj.get("PubliclyAccessible").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("PubliclyAccessible"));
      }
      // validate the optional field `DnsNameServers`
      if (jsonObj.get("DnsNameServers") != null && !jsonObj.get("DnsNameServers").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DnsNameServers"));
      }
      // validate the optional field `ResourceIdentifier`
      if (jsonObj.get("ResourceIdentifier") != null && !jsonObj.get("ResourceIdentifier").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourceIdentifier"));
      }
      // validate the optional field `NetworkType`
      if (jsonObj.get("NetworkType") != null && !jsonObj.get("NetworkType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReplicationInstanceMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReplicationInstanceMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReplicationInstanceMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReplicationInstanceMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReplicationInstanceMessage>() {
           @Override
           public void write(JsonWriter out, CreateReplicationInstanceMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReplicationInstanceMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateReplicationInstanceMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateReplicationInstanceMessage
   * @throws IOException if the JSON string is invalid with respect to CreateReplicationInstanceMessage
   */
  public static CreateReplicationInstanceMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReplicationInstanceMessage.class);
  }

  /**
   * Convert an instance of CreateReplicationInstanceMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

