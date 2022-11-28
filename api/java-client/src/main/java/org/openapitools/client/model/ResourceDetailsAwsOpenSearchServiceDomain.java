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
import java.util.Map;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsClusterConfig;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsDomainEndpointOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsLogPublishingOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions;
import org.openapitools.client.model.AwsOpenSearchServiceDomainDetailsVpcOptions;

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
 * ResourceDetailsAwsOpenSearchServiceDomain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsOpenSearchServiceDomain {
  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_ACCESS_POLICIES = "AccessPolicies";
  @SerializedName(SERIALIZED_NAME_ACCESS_POLICIES)
  private String accessPolicies;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DOMAIN_ENDPOINT = "DomainEndpoint";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ENDPOINT)
  private String domainEndpoint;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS = "EncryptionAtRestOptions";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions;

  public static final String SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS = "NodeToNodeEncryptionOptions";
  @SerializedName(SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

  public static final String SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS = "ServiceSoftwareOptions";
  @SerializedName(SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions serviceSoftwareOptions;

  public static final String SERIALIZED_NAME_CLUSTER_CONFIG = "ClusterConfig";
  @SerializedName(SERIALIZED_NAME_CLUSTER_CONFIG)
  private AwsOpenSearchServiceDomainDetailsClusterConfig clusterConfig;

  public static final String SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS = "DomainEndpointOptions";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsDomainEndpointOptions domainEndpointOptions;

  public static final String SERIALIZED_NAME_VPC_OPTIONS = "VpcOptions";
  @SerializedName(SERIALIZED_NAME_VPC_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsVpcOptions vpcOptions;

  public static final String SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS = "LogPublishingOptions";
  @SerializedName(SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsLogPublishingOptions logPublishingOptions;

  public static final String SERIALIZED_NAME_DOMAIN_ENDPOINTS = "DomainEndpoints";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ENDPOINTS)
  private Map domainEndpoints;

  public static final String SERIALIZED_NAME_ADVANCED_SECURITY_OPTIONS = "AdvancedSecurityOptions";
  @SerializedName(SERIALIZED_NAME_ADVANCED_SECURITY_OPTIONS)
  private AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions advancedSecurityOptions;

  public ResourceDetailsAwsOpenSearchServiceDomain() {
  }

  public ResourceDetailsAwsOpenSearchServiceDomain arn(String arn) {
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


  public ResourceDetailsAwsOpenSearchServiceDomain accessPolicies(String accessPolicies) {
    this.accessPolicies = accessPolicies;
    return this;
  }

  /**
   * Get accessPolicies
   * @return accessPolicies
   */
  @javax.annotation.Nullable
  public String getAccessPolicies() {
    return accessPolicies;
  }

  public void setAccessPolicies(String accessPolicies) {
    this.accessPolicies = accessPolicies;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain domainEndpoint(String domainEndpoint) {
    this.domainEndpoint = domainEndpoint;
    return this;
  }

  /**
   * Get domainEndpoint
   * @return domainEndpoint
   */
  @javax.annotation.Nullable
  public String getDomainEndpoint() {
    return domainEndpoint;
  }

  public void setDomainEndpoint(String domainEndpoint) {
    this.domainEndpoint = domainEndpoint;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain engineVersion(String engineVersion) {
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


  public ResourceDetailsAwsOpenSearchServiceDomain encryptionAtRestOptions(AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
    return this;
  }

  /**
   * Get encryptionAtRestOptions
   * @return encryptionAtRestOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions getEncryptionAtRestOptions() {
    return encryptionAtRestOptions;
  }

  public void setEncryptionAtRestOptions(AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain nodeToNodeEncryptionOptions(AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    return this;
  }

  /**
   * Get nodeToNodeEncryptionOptions
   * @return nodeToNodeEncryptionOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
    return nodeToNodeEncryptionOptions;
  }

  public void setNodeToNodeEncryptionOptions(AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain serviceSoftwareOptions(AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
    return this;
  }

  /**
   * Get serviceSoftwareOptions
   * @return serviceSoftwareOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions getServiceSoftwareOptions() {
    return serviceSoftwareOptions;
  }

  public void setServiceSoftwareOptions(AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain clusterConfig(AwsOpenSearchServiceDomainDetailsClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

  /**
   * Get clusterConfig
   * @return clusterConfig
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(AwsOpenSearchServiceDomainDetailsClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain domainEndpointOptions(AwsOpenSearchServiceDomainDetailsDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
    return this;
  }

  /**
   * Get domainEndpointOptions
   * @return domainEndpointOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsDomainEndpointOptions getDomainEndpointOptions() {
    return domainEndpointOptions;
  }

  public void setDomainEndpointOptions(AwsOpenSearchServiceDomainDetailsDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain vpcOptions(AwsOpenSearchServiceDomainDetailsVpcOptions vpcOptions) {
    this.vpcOptions = vpcOptions;
    return this;
  }

  /**
   * Get vpcOptions
   * @return vpcOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsVpcOptions getVpcOptions() {
    return vpcOptions;
  }

  public void setVpcOptions(AwsOpenSearchServiceDomainDetailsVpcOptions vpcOptions) {
    this.vpcOptions = vpcOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain logPublishingOptions(AwsOpenSearchServiceDomainDetailsLogPublishingOptions logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
    return this;
  }

  /**
   * Get logPublishingOptions
   * @return logPublishingOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsLogPublishingOptions getLogPublishingOptions() {
    return logPublishingOptions;
  }

  public void setLogPublishingOptions(AwsOpenSearchServiceDomainDetailsLogPublishingOptions logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain domainEndpoints(Map domainEndpoints) {
    this.domainEndpoints = domainEndpoints;
    return this;
  }

  /**
   * Get domainEndpoints
   * @return domainEndpoints
   */
  @javax.annotation.Nullable
  public Map getDomainEndpoints() {
    return domainEndpoints;
  }

  public void setDomainEndpoints(Map domainEndpoints) {
    this.domainEndpoints = domainEndpoints;
  }


  public ResourceDetailsAwsOpenSearchServiceDomain advancedSecurityOptions(AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions advancedSecurityOptions) {
    this.advancedSecurityOptions = advancedSecurityOptions;
    return this;
  }

  /**
   * Get advancedSecurityOptions
   * @return advancedSecurityOptions
   */
  @javax.annotation.Nullable
  public AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions getAdvancedSecurityOptions() {
    return advancedSecurityOptions;
  }

  public void setAdvancedSecurityOptions(AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions advancedSecurityOptions) {
    this.advancedSecurityOptions = advancedSecurityOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsOpenSearchServiceDomain resourceDetailsAwsOpenSearchServiceDomain = (ResourceDetailsAwsOpenSearchServiceDomain) o;
    return Objects.equals(this.arn, resourceDetailsAwsOpenSearchServiceDomain.arn) &&
        Objects.equals(this.accessPolicies, resourceDetailsAwsOpenSearchServiceDomain.accessPolicies) &&
        Objects.equals(this.domainName, resourceDetailsAwsOpenSearchServiceDomain.domainName) &&
        Objects.equals(this.id, resourceDetailsAwsOpenSearchServiceDomain.id) &&
        Objects.equals(this.domainEndpoint, resourceDetailsAwsOpenSearchServiceDomain.domainEndpoint) &&
        Objects.equals(this.engineVersion, resourceDetailsAwsOpenSearchServiceDomain.engineVersion) &&
        Objects.equals(this.encryptionAtRestOptions, resourceDetailsAwsOpenSearchServiceDomain.encryptionAtRestOptions) &&
        Objects.equals(this.nodeToNodeEncryptionOptions, resourceDetailsAwsOpenSearchServiceDomain.nodeToNodeEncryptionOptions) &&
        Objects.equals(this.serviceSoftwareOptions, resourceDetailsAwsOpenSearchServiceDomain.serviceSoftwareOptions) &&
        Objects.equals(this.clusterConfig, resourceDetailsAwsOpenSearchServiceDomain.clusterConfig) &&
        Objects.equals(this.domainEndpointOptions, resourceDetailsAwsOpenSearchServiceDomain.domainEndpointOptions) &&
        Objects.equals(this.vpcOptions, resourceDetailsAwsOpenSearchServiceDomain.vpcOptions) &&
        Objects.equals(this.logPublishingOptions, resourceDetailsAwsOpenSearchServiceDomain.logPublishingOptions) &&
        Objects.equals(this.domainEndpoints, resourceDetailsAwsOpenSearchServiceDomain.domainEndpoints) &&
        Objects.equals(this.advancedSecurityOptions, resourceDetailsAwsOpenSearchServiceDomain.advancedSecurityOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, accessPolicies, domainName, id, domainEndpoint, engineVersion, encryptionAtRestOptions, nodeToNodeEncryptionOptions, serviceSoftwareOptions, clusterConfig, domainEndpointOptions, vpcOptions, logPublishingOptions, domainEndpoints, advancedSecurityOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsOpenSearchServiceDomain {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainEndpoint: ").append(toIndentedString(domainEndpoint)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    encryptionAtRestOptions: ").append(toIndentedString(encryptionAtRestOptions)).append("\n");
    sb.append("    nodeToNodeEncryptionOptions: ").append(toIndentedString(nodeToNodeEncryptionOptions)).append("\n");
    sb.append("    serviceSoftwareOptions: ").append(toIndentedString(serviceSoftwareOptions)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    domainEndpointOptions: ").append(toIndentedString(domainEndpointOptions)).append("\n");
    sb.append("    vpcOptions: ").append(toIndentedString(vpcOptions)).append("\n");
    sb.append("    logPublishingOptions: ").append(toIndentedString(logPublishingOptions)).append("\n");
    sb.append("    domainEndpoints: ").append(toIndentedString(domainEndpoints)).append("\n");
    sb.append("    advancedSecurityOptions: ").append(toIndentedString(advancedSecurityOptions)).append("\n");
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
    openapiFields.add("AccessPolicies");
    openapiFields.add("DomainName");
    openapiFields.add("Id");
    openapiFields.add("DomainEndpoint");
    openapiFields.add("EngineVersion");
    openapiFields.add("EncryptionAtRestOptions");
    openapiFields.add("NodeToNodeEncryptionOptions");
    openapiFields.add("ServiceSoftwareOptions");
    openapiFields.add("ClusterConfig");
    openapiFields.add("DomainEndpointOptions");
    openapiFields.add("VpcOptions");
    openapiFields.add("LogPublishingOptions");
    openapiFields.add("DomainEndpoints");
    openapiFields.add("AdvancedSecurityOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsOpenSearchServiceDomain
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsOpenSearchServiceDomain.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsOpenSearchServiceDomain is not found in the empty JSON string", ResourceDetailsAwsOpenSearchServiceDomain.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsOpenSearchServiceDomain.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsOpenSearchServiceDomain` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `AccessPolicies`
      if (jsonObj.get("AccessPolicies") != null && !jsonObj.get("AccessPolicies").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessPolicies"));
      }
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `Id`
      if (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Id"));
      }
      // validate the optional field `DomainEndpoint`
      if (jsonObj.get("DomainEndpoint") != null && !jsonObj.get("DomainEndpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainEndpoint"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `EncryptionAtRestOptions`
      if (jsonObj.get("EncryptionAtRestOptions") != null && !jsonObj.get("EncryptionAtRestOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsEncryptionAtRestOptions.validateJsonElement(jsonObj.get("EncryptionAtRestOptions"));
      }
      // validate the optional field `NodeToNodeEncryptionOptions`
      if (jsonObj.get("NodeToNodeEncryptionOptions") != null && !jsonObj.get("NodeToNodeEncryptionOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsNodeToNodeEncryptionOptions.validateJsonElement(jsonObj.get("NodeToNodeEncryptionOptions"));
      }
      // validate the optional field `ServiceSoftwareOptions`
      if (jsonObj.get("ServiceSoftwareOptions") != null && !jsonObj.get("ServiceSoftwareOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsServiceSoftwareOptions.validateJsonElement(jsonObj.get("ServiceSoftwareOptions"));
      }
      // validate the optional field `ClusterConfig`
      if (jsonObj.get("ClusterConfig") != null && !jsonObj.get("ClusterConfig").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsClusterConfig.validateJsonElement(jsonObj.get("ClusterConfig"));
      }
      // validate the optional field `DomainEndpointOptions`
      if (jsonObj.get("DomainEndpointOptions") != null && !jsonObj.get("DomainEndpointOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsDomainEndpointOptions.validateJsonElement(jsonObj.get("DomainEndpointOptions"));
      }
      // validate the optional field `VpcOptions`
      if (jsonObj.get("VpcOptions") != null && !jsonObj.get("VpcOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsVpcOptions.validateJsonElement(jsonObj.get("VpcOptions"));
      }
      // validate the optional field `LogPublishingOptions`
      if (jsonObj.get("LogPublishingOptions") != null && !jsonObj.get("LogPublishingOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsLogPublishingOptions.validateJsonElement(jsonObj.get("LogPublishingOptions"));
      }
      // validate the optional field `DomainEndpoints`
      if (jsonObj.get("DomainEndpoints") != null && !jsonObj.get("DomainEndpoints").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("DomainEndpoints"));
      }
      // validate the optional field `AdvancedSecurityOptions`
      if (jsonObj.get("AdvancedSecurityOptions") != null && !jsonObj.get("AdvancedSecurityOptions").isJsonNull()) {
        AwsOpenSearchServiceDomainDetailsAdvancedSecurityOptions.validateJsonElement(jsonObj.get("AdvancedSecurityOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsOpenSearchServiceDomain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsOpenSearchServiceDomain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsOpenSearchServiceDomain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsOpenSearchServiceDomain.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsOpenSearchServiceDomain>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsOpenSearchServiceDomain value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsOpenSearchServiceDomain read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsOpenSearchServiceDomain given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsOpenSearchServiceDomain
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsOpenSearchServiceDomain
   */
  public static ResourceDetailsAwsOpenSearchServiceDomain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsOpenSearchServiceDomain.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsOpenSearchServiceDomain to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

