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
import org.openapitools.client.model.ReleaseStatusValues;

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
 * In response to the &lt;code&gt;DescribeOrderableReplicationInstances&lt;/code&gt; operation, this object describes an available replication instance. This description includes the replication instance&#39;s type, engine version, and allocated storage.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class OrderableReplicationInstance {
  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_REPLICATION_INSTANCE_CLASS = "ReplicationInstanceClass";
  @SerializedName(SERIALIZED_NAME_REPLICATION_INSTANCE_CLASS)
  private String replicationInstanceClass;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "StorageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private String storageType;

  public static final String SERIALIZED_NAME_MIN_ALLOCATED_STORAGE = "MinAllocatedStorage";
  @SerializedName(SERIALIZED_NAME_MIN_ALLOCATED_STORAGE)
  private Integer minAllocatedStorage;

  public static final String SERIALIZED_NAME_MAX_ALLOCATED_STORAGE = "MaxAllocatedStorage";
  @SerializedName(SERIALIZED_NAME_MAX_ALLOCATED_STORAGE)
  private Integer maxAllocatedStorage;

  public static final String SERIALIZED_NAME_DEFAULT_ALLOCATED_STORAGE = "DefaultAllocatedStorage";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ALLOCATED_STORAGE)
  private Integer defaultAllocatedStorage;

  public static final String SERIALIZED_NAME_INCLUDED_ALLOCATED_STORAGE = "IncludedAllocatedStorage";
  @SerializedName(SERIALIZED_NAME_INCLUDED_ALLOCATED_STORAGE)
  private Integer includedAllocatedStorage;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "ReleaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatusValues releaseStatus;

  public OrderableReplicationInstance() {
  }

  public OrderableReplicationInstance engineVersion(String engineVersion) {
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


  public OrderableReplicationInstance replicationInstanceClass(String replicationInstanceClass) {
    this.replicationInstanceClass = replicationInstanceClass;
    return this;
  }

  /**
   * Get replicationInstanceClass
   * @return replicationInstanceClass
   */
  @javax.annotation.Nullable
  public String getReplicationInstanceClass() {
    return replicationInstanceClass;
  }

  public void setReplicationInstanceClass(String replicationInstanceClass) {
    this.replicationInstanceClass = replicationInstanceClass;
  }


  public OrderableReplicationInstance storageType(String storageType) {
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


  public OrderableReplicationInstance minAllocatedStorage(Integer minAllocatedStorage) {
    this.minAllocatedStorage = minAllocatedStorage;
    return this;
  }

  /**
   * Get minAllocatedStorage
   * @return minAllocatedStorage
   */
  @javax.annotation.Nullable
  public Integer getMinAllocatedStorage() {
    return minAllocatedStorage;
  }

  public void setMinAllocatedStorage(Integer minAllocatedStorage) {
    this.minAllocatedStorage = minAllocatedStorage;
  }


  public OrderableReplicationInstance maxAllocatedStorage(Integer maxAllocatedStorage) {
    this.maxAllocatedStorage = maxAllocatedStorage;
    return this;
  }

  /**
   * Get maxAllocatedStorage
   * @return maxAllocatedStorage
   */
  @javax.annotation.Nullable
  public Integer getMaxAllocatedStorage() {
    return maxAllocatedStorage;
  }

  public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
    this.maxAllocatedStorage = maxAllocatedStorage;
  }


  public OrderableReplicationInstance defaultAllocatedStorage(Integer defaultAllocatedStorage) {
    this.defaultAllocatedStorage = defaultAllocatedStorage;
    return this;
  }

  /**
   * Get defaultAllocatedStorage
   * @return defaultAllocatedStorage
   */
  @javax.annotation.Nullable
  public Integer getDefaultAllocatedStorage() {
    return defaultAllocatedStorage;
  }

  public void setDefaultAllocatedStorage(Integer defaultAllocatedStorage) {
    this.defaultAllocatedStorage = defaultAllocatedStorage;
  }


  public OrderableReplicationInstance includedAllocatedStorage(Integer includedAllocatedStorage) {
    this.includedAllocatedStorage = includedAllocatedStorage;
    return this;
  }

  /**
   * Get includedAllocatedStorage
   * @return includedAllocatedStorage
   */
  @javax.annotation.Nullable
  public Integer getIncludedAllocatedStorage() {
    return includedAllocatedStorage;
  }

  public void setIncludedAllocatedStorage(Integer includedAllocatedStorage) {
    this.includedAllocatedStorage = includedAllocatedStorage;
  }


  public OrderableReplicationInstance availabilityZones(List availabilityZones) {
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


  public OrderableReplicationInstance releaseStatus(ReleaseStatusValues releaseStatus) {
    this.releaseStatus = releaseStatus;
    return this;
  }

  /**
   * Get releaseStatus
   * @return releaseStatus
   */
  @javax.annotation.Nullable
  public ReleaseStatusValues getReleaseStatus() {
    return releaseStatus;
  }

  public void setReleaseStatus(ReleaseStatusValues releaseStatus) {
    this.releaseStatus = releaseStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderableReplicationInstance orderableReplicationInstance = (OrderableReplicationInstance) o;
    return Objects.equals(this.engineVersion, orderableReplicationInstance.engineVersion) &&
        Objects.equals(this.replicationInstanceClass, orderableReplicationInstance.replicationInstanceClass) &&
        Objects.equals(this.storageType, orderableReplicationInstance.storageType) &&
        Objects.equals(this.minAllocatedStorage, orderableReplicationInstance.minAllocatedStorage) &&
        Objects.equals(this.maxAllocatedStorage, orderableReplicationInstance.maxAllocatedStorage) &&
        Objects.equals(this.defaultAllocatedStorage, orderableReplicationInstance.defaultAllocatedStorage) &&
        Objects.equals(this.includedAllocatedStorage, orderableReplicationInstance.includedAllocatedStorage) &&
        Objects.equals(this.availabilityZones, orderableReplicationInstance.availabilityZones) &&
        Objects.equals(this.releaseStatus, orderableReplicationInstance.releaseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineVersion, replicationInstanceClass, storageType, minAllocatedStorage, maxAllocatedStorage, defaultAllocatedStorage, includedAllocatedStorage, availabilityZones, releaseStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderableReplicationInstance {\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    replicationInstanceClass: ").append(toIndentedString(replicationInstanceClass)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    minAllocatedStorage: ").append(toIndentedString(minAllocatedStorage)).append("\n");
    sb.append("    maxAllocatedStorage: ").append(toIndentedString(maxAllocatedStorage)).append("\n");
    sb.append("    defaultAllocatedStorage: ").append(toIndentedString(defaultAllocatedStorage)).append("\n");
    sb.append("    includedAllocatedStorage: ").append(toIndentedString(includedAllocatedStorage)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
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
    openapiFields.add("EngineVersion");
    openapiFields.add("ReplicationInstanceClass");
    openapiFields.add("StorageType");
    openapiFields.add("MinAllocatedStorage");
    openapiFields.add("MaxAllocatedStorage");
    openapiFields.add("DefaultAllocatedStorage");
    openapiFields.add("IncludedAllocatedStorage");
    openapiFields.add("AvailabilityZones");
    openapiFields.add("ReleaseStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderableReplicationInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderableReplicationInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderableReplicationInstance is not found in the empty JSON string", OrderableReplicationInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderableReplicationInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderableReplicationInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `ReplicationInstanceClass`
      if (jsonObj.get("ReplicationInstanceClass") != null && !jsonObj.get("ReplicationInstanceClass").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationInstanceClass"));
      }
      // validate the optional field `StorageType`
      if (jsonObj.get("StorageType") != null && !jsonObj.get("StorageType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StorageType"));
      }
      // validate the optional field `MinAllocatedStorage`
      if (jsonObj.get("MinAllocatedStorage") != null && !jsonObj.get("MinAllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MinAllocatedStorage"));
      }
      // validate the optional field `MaxAllocatedStorage`
      if (jsonObj.get("MaxAllocatedStorage") != null && !jsonObj.get("MaxAllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxAllocatedStorage"));
      }
      // validate the optional field `DefaultAllocatedStorage`
      if (jsonObj.get("DefaultAllocatedStorage") != null && !jsonObj.get("DefaultAllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DefaultAllocatedStorage"));
      }
      // validate the optional field `IncludedAllocatedStorage`
      if (jsonObj.get("IncludedAllocatedStorage") != null && !jsonObj.get("IncludedAllocatedStorage").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("IncludedAllocatedStorage"));
      }
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `ReleaseStatus`
      if (jsonObj.get("ReleaseStatus") != null && !jsonObj.get("ReleaseStatus").isJsonNull()) {
        ReleaseStatusValues.validateJsonElement(jsonObj.get("ReleaseStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderableReplicationInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderableReplicationInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderableReplicationInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderableReplicationInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderableReplicationInstance>() {
           @Override
           public void write(JsonWriter out, OrderableReplicationInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderableReplicationInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderableReplicationInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderableReplicationInstance
   * @throws IOException if the JSON string is invalid with respect to OrderableReplicationInstance
   */
  public static OrderableReplicationInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderableReplicationInstance.class);
  }

  /**
   * Convert an instance of OrderableReplicationInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

