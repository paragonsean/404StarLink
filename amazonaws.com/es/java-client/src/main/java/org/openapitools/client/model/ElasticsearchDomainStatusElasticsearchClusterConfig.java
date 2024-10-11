/*
 * Amazon Elasticsearch Service
 * <fullname>Amazon Elasticsearch Configuration Service</fullname> <p>Use the Amazon Elasticsearch Configuration API to create, configure, and manage Elasticsearch domains.</p> <p>For sample code that uses the Configuration API, see the <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html\">Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a href=\"https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html\">sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.</p> <p>The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a href=\"http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions\" target=\"_blank\">Regions and Endpoints</a>.</p>
 *
 * The version of the OpenAPI document: 2015-01-01
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
import org.openapitools.client.model.CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions;
import org.openapitools.client.model.CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig;
import org.openapitools.client.model.ESPartitionInstanceType;
import org.openapitools.client.model.ESWarmPartitionInstanceType;

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
 * ElasticsearchDomainStatusElasticsearchClusterConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ElasticsearchDomainStatusElasticsearchClusterConfig {
  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "InstanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private ESPartitionInstanceType instanceType;

  public static final String SERIALIZED_NAME_INSTANCE_COUNT = "InstanceCount";
  @SerializedName(SERIALIZED_NAME_INSTANCE_COUNT)
  private Integer instanceCount;

  public static final String SERIALIZED_NAME_DEDICATED_MASTER_ENABLED = "DedicatedMasterEnabled";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_ENABLED)
  private Boolean dedicatedMasterEnabled;

  public static final String SERIALIZED_NAME_ZONE_AWARENESS_ENABLED = "ZoneAwarenessEnabled";
  @SerializedName(SERIALIZED_NAME_ZONE_AWARENESS_ENABLED)
  private Boolean zoneAwarenessEnabled;

  public static final String SERIALIZED_NAME_ZONE_AWARENESS_CONFIG = "ZoneAwarenessConfig";
  @SerializedName(SERIALIZED_NAME_ZONE_AWARENESS_CONFIG)
  private CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig zoneAwarenessConfig;

  public static final String SERIALIZED_NAME_DEDICATED_MASTER_TYPE = "DedicatedMasterType";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_TYPE)
  private ESPartitionInstanceType dedicatedMasterType;

  public static final String SERIALIZED_NAME_DEDICATED_MASTER_COUNT = "DedicatedMasterCount";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_COUNT)
  private Integer dedicatedMasterCount;

  public static final String SERIALIZED_NAME_WARM_ENABLED = "WarmEnabled";
  @SerializedName(SERIALIZED_NAME_WARM_ENABLED)
  private Boolean warmEnabled;

  public static final String SERIALIZED_NAME_WARM_TYPE = "WarmType";
  @SerializedName(SERIALIZED_NAME_WARM_TYPE)
  private ESWarmPartitionInstanceType warmType;

  public static final String SERIALIZED_NAME_WARM_COUNT = "WarmCount";
  @SerializedName(SERIALIZED_NAME_WARM_COUNT)
  private Integer warmCount;

  public static final String SERIALIZED_NAME_COLD_STORAGE_OPTIONS = "ColdStorageOptions";
  @SerializedName(SERIALIZED_NAME_COLD_STORAGE_OPTIONS)
  private CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions coldStorageOptions;

  public ElasticsearchDomainStatusElasticsearchClusterConfig() {
  }

  public ElasticsearchDomainStatusElasticsearchClusterConfig instanceType(ESPartitionInstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * Get instanceType
   * @return instanceType
   */
  @javax.annotation.Nullable
  public ESPartitionInstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(ESPartitionInstanceType instanceType) {
    this.instanceType = instanceType;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Get instanceCount
   * @return instanceCount
   */
  @javax.annotation.Nullable
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig dedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
    this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    return this;
  }

  /**
   * Get dedicatedMasterEnabled
   * @return dedicatedMasterEnabled
   */
  @javax.annotation.Nullable
  public Boolean getDedicatedMasterEnabled() {
    return dedicatedMasterEnabled;
  }

  public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
    this.dedicatedMasterEnabled = dedicatedMasterEnabled;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig zoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
    this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    return this;
  }

  /**
   * Get zoneAwarenessEnabled
   * @return zoneAwarenessEnabled
   */
  @javax.annotation.Nullable
  public Boolean getZoneAwarenessEnabled() {
    return zoneAwarenessEnabled;
  }

  public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
    this.zoneAwarenessEnabled = zoneAwarenessEnabled;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig zoneAwarenessConfig(CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig zoneAwarenessConfig) {
    this.zoneAwarenessConfig = zoneAwarenessConfig;
    return this;
  }

  /**
   * Get zoneAwarenessConfig
   * @return zoneAwarenessConfig
   */
  @javax.annotation.Nullable
  public CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig getZoneAwarenessConfig() {
    return zoneAwarenessConfig;
  }

  public void setZoneAwarenessConfig(CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig zoneAwarenessConfig) {
    this.zoneAwarenessConfig = zoneAwarenessConfig;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig dedicatedMasterType(ESPartitionInstanceType dedicatedMasterType) {
    this.dedicatedMasterType = dedicatedMasterType;
    return this;
  }

  /**
   * Get dedicatedMasterType
   * @return dedicatedMasterType
   */
  @javax.annotation.Nullable
  public ESPartitionInstanceType getDedicatedMasterType() {
    return dedicatedMasterType;
  }

  public void setDedicatedMasterType(ESPartitionInstanceType dedicatedMasterType) {
    this.dedicatedMasterType = dedicatedMasterType;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig dedicatedMasterCount(Integer dedicatedMasterCount) {
    this.dedicatedMasterCount = dedicatedMasterCount;
    return this;
  }

  /**
   * Get dedicatedMasterCount
   * @return dedicatedMasterCount
   */
  @javax.annotation.Nullable
  public Integer getDedicatedMasterCount() {
    return dedicatedMasterCount;
  }

  public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
    this.dedicatedMasterCount = dedicatedMasterCount;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig warmEnabled(Boolean warmEnabled) {
    this.warmEnabled = warmEnabled;
    return this;
  }

  /**
   * Get warmEnabled
   * @return warmEnabled
   */
  @javax.annotation.Nullable
  public Boolean getWarmEnabled() {
    return warmEnabled;
  }

  public void setWarmEnabled(Boolean warmEnabled) {
    this.warmEnabled = warmEnabled;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig warmType(ESWarmPartitionInstanceType warmType) {
    this.warmType = warmType;
    return this;
  }

  /**
   * Get warmType
   * @return warmType
   */
  @javax.annotation.Nullable
  public ESWarmPartitionInstanceType getWarmType() {
    return warmType;
  }

  public void setWarmType(ESWarmPartitionInstanceType warmType) {
    this.warmType = warmType;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig warmCount(Integer warmCount) {
    this.warmCount = warmCount;
    return this;
  }

  /**
   * Get warmCount
   * @return warmCount
   */
  @javax.annotation.Nullable
  public Integer getWarmCount() {
    return warmCount;
  }

  public void setWarmCount(Integer warmCount) {
    this.warmCount = warmCount;
  }


  public ElasticsearchDomainStatusElasticsearchClusterConfig coldStorageOptions(CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions coldStorageOptions) {
    this.coldStorageOptions = coldStorageOptions;
    return this;
  }

  /**
   * Get coldStorageOptions
   * @return coldStorageOptions
   */
  @javax.annotation.Nullable
  public CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions getColdStorageOptions() {
    return coldStorageOptions;
  }

  public void setColdStorageOptions(CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions coldStorageOptions) {
    this.coldStorageOptions = coldStorageOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchDomainStatusElasticsearchClusterConfig elasticsearchDomainStatusElasticsearchClusterConfig = (ElasticsearchDomainStatusElasticsearchClusterConfig) o;
    return Objects.equals(this.instanceType, elasticsearchDomainStatusElasticsearchClusterConfig.instanceType) &&
        Objects.equals(this.instanceCount, elasticsearchDomainStatusElasticsearchClusterConfig.instanceCount) &&
        Objects.equals(this.dedicatedMasterEnabled, elasticsearchDomainStatusElasticsearchClusterConfig.dedicatedMasterEnabled) &&
        Objects.equals(this.zoneAwarenessEnabled, elasticsearchDomainStatusElasticsearchClusterConfig.zoneAwarenessEnabled) &&
        Objects.equals(this.zoneAwarenessConfig, elasticsearchDomainStatusElasticsearchClusterConfig.zoneAwarenessConfig) &&
        Objects.equals(this.dedicatedMasterType, elasticsearchDomainStatusElasticsearchClusterConfig.dedicatedMasterType) &&
        Objects.equals(this.dedicatedMasterCount, elasticsearchDomainStatusElasticsearchClusterConfig.dedicatedMasterCount) &&
        Objects.equals(this.warmEnabled, elasticsearchDomainStatusElasticsearchClusterConfig.warmEnabled) &&
        Objects.equals(this.warmType, elasticsearchDomainStatusElasticsearchClusterConfig.warmType) &&
        Objects.equals(this.warmCount, elasticsearchDomainStatusElasticsearchClusterConfig.warmCount) &&
        Objects.equals(this.coldStorageOptions, elasticsearchDomainStatusElasticsearchClusterConfig.coldStorageOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, instanceCount, dedicatedMasterEnabled, zoneAwarenessEnabled, zoneAwarenessConfig, dedicatedMasterType, dedicatedMasterCount, warmEnabled, warmType, warmCount, coldStorageOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchDomainStatusElasticsearchClusterConfig {\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    dedicatedMasterEnabled: ").append(toIndentedString(dedicatedMasterEnabled)).append("\n");
    sb.append("    zoneAwarenessEnabled: ").append(toIndentedString(zoneAwarenessEnabled)).append("\n");
    sb.append("    zoneAwarenessConfig: ").append(toIndentedString(zoneAwarenessConfig)).append("\n");
    sb.append("    dedicatedMasterType: ").append(toIndentedString(dedicatedMasterType)).append("\n");
    sb.append("    dedicatedMasterCount: ").append(toIndentedString(dedicatedMasterCount)).append("\n");
    sb.append("    warmEnabled: ").append(toIndentedString(warmEnabled)).append("\n");
    sb.append("    warmType: ").append(toIndentedString(warmType)).append("\n");
    sb.append("    warmCount: ").append(toIndentedString(warmCount)).append("\n");
    sb.append("    coldStorageOptions: ").append(toIndentedString(coldStorageOptions)).append("\n");
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
    openapiFields.add("InstanceType");
    openapiFields.add("InstanceCount");
    openapiFields.add("DedicatedMasterEnabled");
    openapiFields.add("ZoneAwarenessEnabled");
    openapiFields.add("ZoneAwarenessConfig");
    openapiFields.add("DedicatedMasterType");
    openapiFields.add("DedicatedMasterCount");
    openapiFields.add("WarmEnabled");
    openapiFields.add("WarmType");
    openapiFields.add("WarmCount");
    openapiFields.add("ColdStorageOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ElasticsearchDomainStatusElasticsearchClusterConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticsearchDomainStatusElasticsearchClusterConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticsearchDomainStatusElasticsearchClusterConfig is not found in the empty JSON string", ElasticsearchDomainStatusElasticsearchClusterConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticsearchDomainStatusElasticsearchClusterConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticsearchDomainStatusElasticsearchClusterConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `InstanceType`
      if (jsonObj.get("InstanceType") != null && !jsonObj.get("InstanceType").isJsonNull()) {
        ESPartitionInstanceType.validateJsonElement(jsonObj.get("InstanceType"));
      }
      // validate the optional field `InstanceCount`
      if (jsonObj.get("InstanceCount") != null && !jsonObj.get("InstanceCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstanceCount"));
      }
      // validate the optional field `DedicatedMasterEnabled`
      if (jsonObj.get("DedicatedMasterEnabled") != null && !jsonObj.get("DedicatedMasterEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DedicatedMasterEnabled"));
      }
      // validate the optional field `ZoneAwarenessEnabled`
      if (jsonObj.get("ZoneAwarenessEnabled") != null && !jsonObj.get("ZoneAwarenessEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ZoneAwarenessEnabled"));
      }
      // validate the optional field `ZoneAwarenessConfig`
      if (jsonObj.get("ZoneAwarenessConfig") != null && !jsonObj.get("ZoneAwarenessConfig").isJsonNull()) {
        CreateElasticsearchDomainRequestElasticsearchClusterConfigZoneAwarenessConfig.validateJsonElement(jsonObj.get("ZoneAwarenessConfig"));
      }
      // validate the optional field `DedicatedMasterType`
      if (jsonObj.get("DedicatedMasterType") != null && !jsonObj.get("DedicatedMasterType").isJsonNull()) {
        ESPartitionInstanceType.validateJsonElement(jsonObj.get("DedicatedMasterType"));
      }
      // validate the optional field `DedicatedMasterCount`
      if (jsonObj.get("DedicatedMasterCount") != null && !jsonObj.get("DedicatedMasterCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DedicatedMasterCount"));
      }
      // validate the optional field `WarmEnabled`
      if (jsonObj.get("WarmEnabled") != null && !jsonObj.get("WarmEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("WarmEnabled"));
      }
      // validate the optional field `WarmType`
      if (jsonObj.get("WarmType") != null && !jsonObj.get("WarmType").isJsonNull()) {
        ESWarmPartitionInstanceType.validateJsonElement(jsonObj.get("WarmType"));
      }
      // validate the optional field `WarmCount`
      if (jsonObj.get("WarmCount") != null && !jsonObj.get("WarmCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("WarmCount"));
      }
      // validate the optional field `ColdStorageOptions`
      if (jsonObj.get("ColdStorageOptions") != null && !jsonObj.get("ColdStorageOptions").isJsonNull()) {
        CreateElasticsearchDomainRequestElasticsearchClusterConfigColdStorageOptions.validateJsonElement(jsonObj.get("ColdStorageOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticsearchDomainStatusElasticsearchClusterConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticsearchDomainStatusElasticsearchClusterConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticsearchDomainStatusElasticsearchClusterConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticsearchDomainStatusElasticsearchClusterConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticsearchDomainStatusElasticsearchClusterConfig>() {
           @Override
           public void write(JsonWriter out, ElasticsearchDomainStatusElasticsearchClusterConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticsearchDomainStatusElasticsearchClusterConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ElasticsearchDomainStatusElasticsearchClusterConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ElasticsearchDomainStatusElasticsearchClusterConfig
   * @throws IOException if the JSON string is invalid with respect to ElasticsearchDomainStatusElasticsearchClusterConfig
   */
  public static ElasticsearchDomainStatusElasticsearchClusterConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticsearchDomainStatusElasticsearchClusterConfig.class);
  }

  /**
   * Convert an instance of ElasticsearchDomainStatusElasticsearchClusterConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

