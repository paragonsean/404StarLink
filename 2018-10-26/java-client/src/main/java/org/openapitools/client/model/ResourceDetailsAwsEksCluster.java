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
import org.openapitools.client.model.AwsEksClusterDetailsLogging;
import org.openapitools.client.model.AwsEksClusterDetailsResourcesVpcConfig;

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
 * ResourceDetailsAwsEksCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEksCluster {
  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_DATA = "CertificateAuthorityData";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_DATA)
  private String certificateAuthorityData;

  public static final String SERIALIZED_NAME_CLUSTER_STATUS = "ClusterStatus";
  @SerializedName(SERIALIZED_NAME_CLUSTER_STATUS)
  private String clusterStatus;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCES_VPC_CONFIG = "ResourcesVpcConfig";
  @SerializedName(SERIALIZED_NAME_RESOURCES_VPC_CONFIG)
  private AwsEksClusterDetailsResourcesVpcConfig resourcesVpcConfig;

  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LOGGING = "Logging";
  @SerializedName(SERIALIZED_NAME_LOGGING)
  private AwsEksClusterDetailsLogging logging;

  public ResourceDetailsAwsEksCluster() {
  }

  public ResourceDetailsAwsEksCluster arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public ResourceDetailsAwsEksCluster certificateAuthorityData(String certificateAuthorityData) {
    this.certificateAuthorityData = certificateAuthorityData;
    return this;
  }

  /**
   * Get certificateAuthorityData
   * @return certificateAuthorityData
   */
  @javax.annotation.Nullable
  public String getCertificateAuthorityData() {
    return certificateAuthorityData;
  }

  public void setCertificateAuthorityData(String certificateAuthorityData) {
    this.certificateAuthorityData = certificateAuthorityData;
  }


  public ResourceDetailsAwsEksCluster clusterStatus(String clusterStatus) {
    this.clusterStatus = clusterStatus;
    return this;
  }

  /**
   * Get clusterStatus
   * @return clusterStatus
   */
  @javax.annotation.Nullable
  public String getClusterStatus() {
    return clusterStatus;
  }

  public void setClusterStatus(String clusterStatus) {
    this.clusterStatus = clusterStatus;
  }


  public ResourceDetailsAwsEksCluster endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public ResourceDetailsAwsEksCluster name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ResourceDetailsAwsEksCluster resourcesVpcConfig(AwsEksClusterDetailsResourcesVpcConfig resourcesVpcConfig) {
    this.resourcesVpcConfig = resourcesVpcConfig;
    return this;
  }

  /**
   * Get resourcesVpcConfig
   * @return resourcesVpcConfig
   */
  @javax.annotation.Nullable
  public AwsEksClusterDetailsResourcesVpcConfig getResourcesVpcConfig() {
    return resourcesVpcConfig;
  }

  public void setResourcesVpcConfig(AwsEksClusterDetailsResourcesVpcConfig resourcesVpcConfig) {
    this.resourcesVpcConfig = resourcesVpcConfig;
  }


  public ResourceDetailsAwsEksCluster roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nullable
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public ResourceDetailsAwsEksCluster version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public ResourceDetailsAwsEksCluster logging(AwsEksClusterDetailsLogging logging) {
    this.logging = logging;
    return this;
  }

  /**
   * Get logging
   * @return logging
   */
  @javax.annotation.Nullable
  public AwsEksClusterDetailsLogging getLogging() {
    return logging;
  }

  public void setLogging(AwsEksClusterDetailsLogging logging) {
    this.logging = logging;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEksCluster resourceDetailsAwsEksCluster = (ResourceDetailsAwsEksCluster) o;
    return Objects.equals(this.arn, resourceDetailsAwsEksCluster.arn) &&
        Objects.equals(this.certificateAuthorityData, resourceDetailsAwsEksCluster.certificateAuthorityData) &&
        Objects.equals(this.clusterStatus, resourceDetailsAwsEksCluster.clusterStatus) &&
        Objects.equals(this.endpoint, resourceDetailsAwsEksCluster.endpoint) &&
        Objects.equals(this.name, resourceDetailsAwsEksCluster.name) &&
        Objects.equals(this.resourcesVpcConfig, resourceDetailsAwsEksCluster.resourcesVpcConfig) &&
        Objects.equals(this.roleArn, resourceDetailsAwsEksCluster.roleArn) &&
        Objects.equals(this.version, resourceDetailsAwsEksCluster.version) &&
        Objects.equals(this.logging, resourceDetailsAwsEksCluster.logging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, certificateAuthorityData, clusterStatus, endpoint, name, resourcesVpcConfig, roleArn, version, logging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEksCluster {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    certificateAuthorityData: ").append(toIndentedString(certificateAuthorityData)).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourcesVpcConfig: ").append(toIndentedString(resourcesVpcConfig)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
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
    openapiFields.add("Arn");
    openapiFields.add("CertificateAuthorityData");
    openapiFields.add("ClusterStatus");
    openapiFields.add("Endpoint");
    openapiFields.add("Name");
    openapiFields.add("ResourcesVpcConfig");
    openapiFields.add("RoleArn");
    openapiFields.add("Version");
    openapiFields.add("Logging");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEksCluster
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEksCluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEksCluster is not found in the empty JSON string", ResourceDetailsAwsEksCluster.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEksCluster.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEksCluster` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `CertificateAuthorityData`
      if (jsonObj.get("CertificateAuthorityData") != null && !jsonObj.get("CertificateAuthorityData").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CertificateAuthorityData"));
      }
      // validate the optional field `ClusterStatus`
      if (jsonObj.get("ClusterStatus") != null && !jsonObj.get("ClusterStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClusterStatus"));
      }
      // validate the optional field `Endpoint`
      if (jsonObj.get("Endpoint") != null && !jsonObj.get("Endpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Endpoint"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `ResourcesVpcConfig`
      if (jsonObj.get("ResourcesVpcConfig") != null && !jsonObj.get("ResourcesVpcConfig").isJsonNull()) {
        AwsEksClusterDetailsResourcesVpcConfig.validateJsonElement(jsonObj.get("ResourcesVpcConfig"));
      }
      // validate the optional field `RoleArn`
      if (jsonObj.get("RoleArn") != null && !jsonObj.get("RoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RoleArn"));
      }
      // validate the optional field `Version`
      if (jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Version"));
      }
      // validate the optional field `Logging`
      if (jsonObj.get("Logging") != null && !jsonObj.get("Logging").isJsonNull()) {
        AwsEksClusterDetailsLogging.validateJsonElement(jsonObj.get("Logging"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEksCluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEksCluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEksCluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEksCluster.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEksCluster>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEksCluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEksCluster read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEksCluster given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEksCluster
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEksCluster
   */
  public static ResourceDetailsAwsEksCluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEksCluster.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEksCluster to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

