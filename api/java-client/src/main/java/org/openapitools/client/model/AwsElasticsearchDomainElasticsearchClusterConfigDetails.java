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
import org.openapitools.client.model.AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig;

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
 * details about the configuration of an OpenSearch cluster.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsElasticsearchDomainElasticsearchClusterConfigDetails {
  public static final String SERIALIZED_NAME_DEDICATED_MASTER_COUNT = "DedicatedMasterCount";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_COUNT)
  private Integer dedicatedMasterCount;

  public static final String SERIALIZED_NAME_DEDICATED_MASTER_ENABLED = "DedicatedMasterEnabled";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_ENABLED)
  private Boolean dedicatedMasterEnabled;

  public static final String SERIALIZED_NAME_DEDICATED_MASTER_TYPE = "DedicatedMasterType";
  @SerializedName(SERIALIZED_NAME_DEDICATED_MASTER_TYPE)
  private String dedicatedMasterType;

  public static final String SERIALIZED_NAME_INSTANCE_COUNT = "InstanceCount";
  @SerializedName(SERIALIZED_NAME_INSTANCE_COUNT)
  private Integer instanceCount;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "InstanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_ZONE_AWARENESS_CONFIG = "ZoneAwarenessConfig";
  @SerializedName(SERIALIZED_NAME_ZONE_AWARENESS_CONFIG)
  private AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig zoneAwarenessConfig;

  public static final String SERIALIZED_NAME_ZONE_AWARENESS_ENABLED = "ZoneAwarenessEnabled";
  @SerializedName(SERIALIZED_NAME_ZONE_AWARENESS_ENABLED)
  private Boolean zoneAwarenessEnabled;

  public AwsElasticsearchDomainElasticsearchClusterConfigDetails() {
  }

  public AwsElasticsearchDomainElasticsearchClusterConfigDetails dedicatedMasterCount(Integer dedicatedMasterCount) {
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


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails dedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
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


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails dedicatedMasterType(String dedicatedMasterType) {
    this.dedicatedMasterType = dedicatedMasterType;
    return this;
  }

  /**
   * Get dedicatedMasterType
   * @return dedicatedMasterType
   */
  @javax.annotation.Nullable
  public String getDedicatedMasterType() {
    return dedicatedMasterType;
  }

  public void setDedicatedMasterType(String dedicatedMasterType) {
    this.dedicatedMasterType = dedicatedMasterType;
  }


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails instanceCount(Integer instanceCount) {
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


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails instanceType(String instanceType) {
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


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails zoneAwarenessConfig(AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig zoneAwarenessConfig) {
    this.zoneAwarenessConfig = zoneAwarenessConfig;
    return this;
  }

  /**
   * Get zoneAwarenessConfig
   * @return zoneAwarenessConfig
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig getZoneAwarenessConfig() {
    return zoneAwarenessConfig;
  }

  public void setZoneAwarenessConfig(AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig zoneAwarenessConfig) {
    this.zoneAwarenessConfig = zoneAwarenessConfig;
  }


  public AwsElasticsearchDomainElasticsearchClusterConfigDetails zoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsElasticsearchDomainElasticsearchClusterConfigDetails awsElasticsearchDomainElasticsearchClusterConfigDetails = (AwsElasticsearchDomainElasticsearchClusterConfigDetails) o;
    return Objects.equals(this.dedicatedMasterCount, awsElasticsearchDomainElasticsearchClusterConfigDetails.dedicatedMasterCount) &&
        Objects.equals(this.dedicatedMasterEnabled, awsElasticsearchDomainElasticsearchClusterConfigDetails.dedicatedMasterEnabled) &&
        Objects.equals(this.dedicatedMasterType, awsElasticsearchDomainElasticsearchClusterConfigDetails.dedicatedMasterType) &&
        Objects.equals(this.instanceCount, awsElasticsearchDomainElasticsearchClusterConfigDetails.instanceCount) &&
        Objects.equals(this.instanceType, awsElasticsearchDomainElasticsearchClusterConfigDetails.instanceType) &&
        Objects.equals(this.zoneAwarenessConfig, awsElasticsearchDomainElasticsearchClusterConfigDetails.zoneAwarenessConfig) &&
        Objects.equals(this.zoneAwarenessEnabled, awsElasticsearchDomainElasticsearchClusterConfigDetails.zoneAwarenessEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, zoneAwarenessConfig, zoneAwarenessEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsElasticsearchDomainElasticsearchClusterConfigDetails {\n");
    sb.append("    dedicatedMasterCount: ").append(toIndentedString(dedicatedMasterCount)).append("\n");
    sb.append("    dedicatedMasterEnabled: ").append(toIndentedString(dedicatedMasterEnabled)).append("\n");
    sb.append("    dedicatedMasterType: ").append(toIndentedString(dedicatedMasterType)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    zoneAwarenessConfig: ").append(toIndentedString(zoneAwarenessConfig)).append("\n");
    sb.append("    zoneAwarenessEnabled: ").append(toIndentedString(zoneAwarenessEnabled)).append("\n");
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
    openapiFields.add("DedicatedMasterCount");
    openapiFields.add("DedicatedMasterEnabled");
    openapiFields.add("DedicatedMasterType");
    openapiFields.add("InstanceCount");
    openapiFields.add("InstanceType");
    openapiFields.add("ZoneAwarenessConfig");
    openapiFields.add("ZoneAwarenessEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsElasticsearchDomainElasticsearchClusterConfigDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsElasticsearchDomainElasticsearchClusterConfigDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsElasticsearchDomainElasticsearchClusterConfigDetails is not found in the empty JSON string", AwsElasticsearchDomainElasticsearchClusterConfigDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsElasticsearchDomainElasticsearchClusterConfigDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsElasticsearchDomainElasticsearchClusterConfigDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DedicatedMasterCount`
      if (jsonObj.get("DedicatedMasterCount") != null && !jsonObj.get("DedicatedMasterCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DedicatedMasterCount"));
      }
      // validate the optional field `DedicatedMasterEnabled`
      if (jsonObj.get("DedicatedMasterEnabled") != null && !jsonObj.get("DedicatedMasterEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DedicatedMasterEnabled"));
      }
      // validate the optional field `DedicatedMasterType`
      if (jsonObj.get("DedicatedMasterType") != null && !jsonObj.get("DedicatedMasterType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DedicatedMasterType"));
      }
      // validate the optional field `InstanceCount`
      if (jsonObj.get("InstanceCount") != null && !jsonObj.get("InstanceCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InstanceCount"));
      }
      // validate the optional field `InstanceType`
      if (jsonObj.get("InstanceType") != null && !jsonObj.get("InstanceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceType"));
      }
      // validate the optional field `ZoneAwarenessConfig`
      if (jsonObj.get("ZoneAwarenessConfig") != null && !jsonObj.get("ZoneAwarenessConfig").isJsonNull()) {
        AwsElasticsearchDomainElasticsearchClusterConfigDetailsZoneAwarenessConfig.validateJsonElement(jsonObj.get("ZoneAwarenessConfig"));
      }
      // validate the optional field `ZoneAwarenessEnabled`
      if (jsonObj.get("ZoneAwarenessEnabled") != null && !jsonObj.get("ZoneAwarenessEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ZoneAwarenessEnabled"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsElasticsearchDomainElasticsearchClusterConfigDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsElasticsearchDomainElasticsearchClusterConfigDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsElasticsearchDomainElasticsearchClusterConfigDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsElasticsearchDomainElasticsearchClusterConfigDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsElasticsearchDomainElasticsearchClusterConfigDetails>() {
           @Override
           public void write(JsonWriter out, AwsElasticsearchDomainElasticsearchClusterConfigDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsElasticsearchDomainElasticsearchClusterConfigDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsElasticsearchDomainElasticsearchClusterConfigDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsElasticsearchDomainElasticsearchClusterConfigDetails
   * @throws IOException if the JSON string is invalid with respect to AwsElasticsearchDomainElasticsearchClusterConfigDetails
   */
  public static AwsElasticsearchDomainElasticsearchClusterConfigDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsElasticsearchDomainElasticsearchClusterConfigDetails.class);
  }

  /**
   * Convert an instance of AwsElasticsearchDomainElasticsearchClusterConfigDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

