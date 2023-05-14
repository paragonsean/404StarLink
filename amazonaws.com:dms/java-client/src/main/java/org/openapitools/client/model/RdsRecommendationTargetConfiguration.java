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
 * RdsRecommendationTargetConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RdsRecommendationTargetConfiguration {
  public static final String SERIALIZED_NAME_ENGINE_EDITION = "EngineEdition";
  @SerializedName(SERIALIZED_NAME_ENGINE_EDITION)
  private String engineEdition;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "InstanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_INSTANCE_VCPU = "InstanceVcpu";
  @SerializedName(SERIALIZED_NAME_INSTANCE_VCPU)
  private Double instanceVcpu;

  public static final String SERIALIZED_NAME_INSTANCE_MEMORY = "InstanceMemory";
  @SerializedName(SERIALIZED_NAME_INSTANCE_MEMORY)
  private Double instanceMemory;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "StorageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private String storageType;

  public static final String SERIALIZED_NAME_STORAGE_SIZE = "StorageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;

  public static final String SERIALIZED_NAME_STORAGE_IOPS = "StorageIops";
  @SerializedName(SERIALIZED_NAME_STORAGE_IOPS)
  private Integer storageIops;

  public static final String SERIALIZED_NAME_DEPLOYMENT_OPTION = "DeploymentOption";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_OPTION)
  private String deploymentOption;

  public RdsRecommendationTargetConfiguration() {
  }

  public RdsRecommendationTargetConfiguration engineEdition(String engineEdition) {
    this.engineEdition = engineEdition;
    return this;
  }

  /**
   * Get engineEdition
   * @return engineEdition
   */
  @javax.annotation.Nullable
  public String getEngineEdition() {
    return engineEdition;
  }

  public void setEngineEdition(String engineEdition) {
    this.engineEdition = engineEdition;
  }


  public RdsRecommendationTargetConfiguration instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
   */
  @javax.annotation.Nullable
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  public RdsRecommendationTargetConfiguration instanceVcpu(Double instanceVcpu) {
    this.instanceVcpu = instanceVcpu;
    return this;
  }

  /**
   * Get instanceVcpu
   * @return instanceVcpu
   */
  @javax.annotation.Nullable
  public Double getInstanceVcpu() {
    return instanceVcpu;
  }

  public void setInstanceVcpu(Double instanceVcpu) {
    this.instanceVcpu = instanceVcpu;
  }


  public RdsRecommendationTargetConfiguration instanceMemory(Double instanceMemory) {
    this.instanceMemory = instanceMemory;
    return this;
  }

  /**
   * Get instanceMemory
   * @return instanceMemory
   */
  @javax.annotation.Nullable
  public Double getInstanceMemory() {
    return instanceMemory;
  }

  public void setInstanceMemory(Double instanceMemory) {
    this.instanceMemory = instanceMemory;
  }


  public RdsRecommendationTargetConfiguration storageType(String storageType) {
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


  public RdsRecommendationTargetConfiguration storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

  /**
   * Get storageSize
   * @return storageSize
   */
  @javax.annotation.Nullable
  public Integer getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }


  public RdsRecommendationTargetConfiguration storageIops(Integer storageIops) {
    this.storageIops = storageIops;
    return this;
  }

  /**
   * Get storageIops
   * @return storageIops
   */
  @javax.annotation.Nullable
  public Integer getStorageIops() {
    return storageIops;
  }

  public void setStorageIops(Integer storageIops) {
    this.storageIops = storageIops;
  }


  public RdsRecommendationTargetConfiguration deploymentOption(String deploymentOption) {
    this.deploymentOption = deploymentOption;
    return this;
  }

  /**
   * Get deploymentOption
   * @return deploymentOption
   */
  @javax.annotation.Nullable
  public String getDeploymentOption() {
    return deploymentOption;
  }

  public void setDeploymentOption(String deploymentOption) {
    this.deploymentOption = deploymentOption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RdsRecommendationTargetConfiguration rdsRecommendationTargetConfiguration = (RdsRecommendationTargetConfiguration) o;
    return Objects.equals(this.engineEdition, rdsRecommendationTargetConfiguration.engineEdition) &&
        Objects.equals(this.instanceType, rdsRecommendationTargetConfiguration.instanceType) &&
        Objects.equals(this.instanceVcpu, rdsRecommendationTargetConfiguration.instanceVcpu) &&
        Objects.equals(this.instanceMemory, rdsRecommendationTargetConfiguration.instanceMemory) &&
        Objects.equals(this.storageType, rdsRecommendationTargetConfiguration.storageType) &&
        Objects.equals(this.storageSize, rdsRecommendationTargetConfiguration.storageSize) &&
        Objects.equals(this.storageIops, rdsRecommendationTargetConfiguration.storageIops) &&
        Objects.equals(this.deploymentOption, rdsRecommendationTargetConfiguration.deploymentOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineEdition, instanceType, instanceVcpu, instanceMemory, storageType, storageSize, storageIops, deploymentOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RdsRecommendationTargetConfiguration {\n");
    sb.append("    engineEdition: ").append(toIndentedString(engineEdition)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceVcpu: ").append(toIndentedString(instanceVcpu)).append("\n");
    sb.append("    instanceMemory: ").append(toIndentedString(instanceMemory)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    storageIops: ").append(toIndentedString(storageIops)).append("\n");
    sb.append("    deploymentOption: ").append(toIndentedString(deploymentOption)).append("\n");
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
    openapiFields.add("EngineEdition");
    openapiFields.add("InstanceType");
    openapiFields.add("InstanceVcpu");
    openapiFields.add("InstanceMemory");
    openapiFields.add("StorageType");
    openapiFields.add("StorageSize");
    openapiFields.add("StorageIops");
    openapiFields.add("DeploymentOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RdsRecommendationTargetConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RdsRecommendationTargetConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RdsRecommendationTargetConfiguration is not found in the empty JSON string", RdsRecommendationTargetConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RdsRecommendationTargetConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RdsRecommendationTargetConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EngineEdition`
      if (jsonObj.get("EngineEdition") != null && !jsonObj.get("EngineEdition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineEdition"));
      }
      // validate the optional field `InstanceType`
      if (jsonObj.get("InstanceType") != null && !jsonObj.get("InstanceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceType"));
      }
      // validate the optional field `InstanceVcpu`
      if (jsonObj.get("InstanceVcpu") != null && !jsonObj.get("InstanceVcpu").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("InstanceVcpu"));
      }
      // validate the optional field `InstanceMemory`
      if (jsonObj.get("InstanceMemory") != null && !jsonObj.get("InstanceMemory").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("InstanceMemory"));
      }
      // validate the optional field `StorageType`
      if (jsonObj.get("StorageType") != null && !jsonObj.get("StorageType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("StorageType"));
      }
      // validate the optional field `StorageSize`
      if (jsonObj.get("StorageSize") != null && !jsonObj.get("StorageSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StorageSize"));
      }
      // validate the optional field `StorageIops`
      if (jsonObj.get("StorageIops") != null && !jsonObj.get("StorageIops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("StorageIops"));
      }
      // validate the optional field `DeploymentOption`
      if (jsonObj.get("DeploymentOption") != null && !jsonObj.get("DeploymentOption").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DeploymentOption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RdsRecommendationTargetConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RdsRecommendationTargetConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RdsRecommendationTargetConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RdsRecommendationTargetConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<RdsRecommendationTargetConfiguration>() {
           @Override
           public void write(JsonWriter out, RdsRecommendationTargetConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RdsRecommendationTargetConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RdsRecommendationTargetConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RdsRecommendationTargetConfiguration
   * @throws IOException if the JSON string is invalid with respect to RdsRecommendationTargetConfiguration
   */
  public static RdsRecommendationTargetConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RdsRecommendationTargetConfiguration.class);
  }

  /**
   * Convert an instance of RdsRecommendationTargetConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

