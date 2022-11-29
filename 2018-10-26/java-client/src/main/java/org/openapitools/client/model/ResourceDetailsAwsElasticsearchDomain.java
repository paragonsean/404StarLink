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
import org.openapitools.client.model.AwsElasticsearchDomainDetailsDomainEndpointOptions;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsElasticsearchClusterConfig;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsEncryptionAtRestOptions;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsLogPublishingOptions;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsServiceSoftwareOptions;
import org.openapitools.client.model.AwsElasticsearchDomainDetailsVPCOptions;

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
 * ResourceDetailsAwsElasticsearchDomain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsElasticsearchDomain {
  public static final String SERIALIZED_NAME_ACCESS_POLICIES = "AccessPolicies";
  @SerializedName(SERIALIZED_NAME_ACCESS_POLICIES)
  private String accessPolicies;

  public static final String SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS = "DomainEndpointOptions";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS)
  private AwsElasticsearchDomainDetailsDomainEndpointOptions domainEndpointOptions;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "DomainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_ENDPOINTS = "Endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private Map endpoints;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_VERSION = "ElasticsearchVersion";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_VERSION)
  private String elasticsearchVersion;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_CLUSTER_CONFIG = "ElasticsearchClusterConfig";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_CLUSTER_CONFIG)
  private AwsElasticsearchDomainDetailsElasticsearchClusterConfig elasticsearchClusterConfig;

  public static final String SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS = "EncryptionAtRestOptions";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS)
  private AwsElasticsearchDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions;

  public static final String SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS = "LogPublishingOptions";
  @SerializedName(SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS)
  private AwsElasticsearchDomainDetailsLogPublishingOptions logPublishingOptions;

  public static final String SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS = "NodeToNodeEncryptionOptions";
  @SerializedName(SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS)
  private AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

  public static final String SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS = "ServiceSoftwareOptions";
  @SerializedName(SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS)
  private AwsElasticsearchDomainDetailsServiceSoftwareOptions serviceSoftwareOptions;

  public static final String SERIALIZED_NAME_VP_C_OPTIONS = "VPCOptions";
  @SerializedName(SERIALIZED_NAME_VP_C_OPTIONS)
  private AwsElasticsearchDomainDetailsVPCOptions vpCOptions;

  public ResourceDetailsAwsElasticsearchDomain() {
  }

  public ResourceDetailsAwsElasticsearchDomain accessPolicies(String accessPolicies) {
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


  public ResourceDetailsAwsElasticsearchDomain domainEndpointOptions(AwsElasticsearchDomainDetailsDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
    return this;
  }

  /**
   * Get domainEndpointOptions
   * @return domainEndpointOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsDomainEndpointOptions getDomainEndpointOptions() {
    return domainEndpointOptions;
  }

  public void setDomainEndpointOptions(AwsElasticsearchDomainDetailsDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
  }


  public ResourceDetailsAwsElasticsearchDomain domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
   */
  @javax.annotation.Nullable
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  public ResourceDetailsAwsElasticsearchDomain domainName(String domainName) {
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


  public ResourceDetailsAwsElasticsearchDomain endpoint(String endpoint) {
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


  public ResourceDetailsAwsElasticsearchDomain endpoints(Map endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * Get endpoints
   * @return endpoints
   */
  @javax.annotation.Nullable
  public Map getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(Map endpoints) {
    this.endpoints = endpoints;
  }


  public ResourceDetailsAwsElasticsearchDomain elasticsearchVersion(String elasticsearchVersion) {
    this.elasticsearchVersion = elasticsearchVersion;
    return this;
  }

  /**
   * Get elasticsearchVersion
   * @return elasticsearchVersion
   */
  @javax.annotation.Nullable
  public String getElasticsearchVersion() {
    return elasticsearchVersion;
  }

  public void setElasticsearchVersion(String elasticsearchVersion) {
    this.elasticsearchVersion = elasticsearchVersion;
  }


  public ResourceDetailsAwsElasticsearchDomain elasticsearchClusterConfig(AwsElasticsearchDomainDetailsElasticsearchClusterConfig elasticsearchClusterConfig) {
    this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    return this;
  }

  /**
   * Get elasticsearchClusterConfig
   * @return elasticsearchClusterConfig
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsElasticsearchClusterConfig getElasticsearchClusterConfig() {
    return elasticsearchClusterConfig;
  }

  public void setElasticsearchClusterConfig(AwsElasticsearchDomainDetailsElasticsearchClusterConfig elasticsearchClusterConfig) {
    this.elasticsearchClusterConfig = elasticsearchClusterConfig;
  }


  public ResourceDetailsAwsElasticsearchDomain encryptionAtRestOptions(AwsElasticsearchDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
    return this;
  }

  /**
   * Get encryptionAtRestOptions
   * @return encryptionAtRestOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsEncryptionAtRestOptions getEncryptionAtRestOptions() {
    return encryptionAtRestOptions;
  }

  public void setEncryptionAtRestOptions(AwsElasticsearchDomainDetailsEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
  }


  public ResourceDetailsAwsElasticsearchDomain logPublishingOptions(AwsElasticsearchDomainDetailsLogPublishingOptions logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
    return this;
  }

  /**
   * Get logPublishingOptions
   * @return logPublishingOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsLogPublishingOptions getLogPublishingOptions() {
    return logPublishingOptions;
  }

  public void setLogPublishingOptions(AwsElasticsearchDomainDetailsLogPublishingOptions logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
  }


  public ResourceDetailsAwsElasticsearchDomain nodeToNodeEncryptionOptions(AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    return this;
  }

  /**
   * Get nodeToNodeEncryptionOptions
   * @return nodeToNodeEncryptionOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
    return nodeToNodeEncryptionOptions;
  }

  public void setNodeToNodeEncryptionOptions(AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
  }


  public ResourceDetailsAwsElasticsearchDomain serviceSoftwareOptions(AwsElasticsearchDomainDetailsServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
    return this;
  }

  /**
   * Get serviceSoftwareOptions
   * @return serviceSoftwareOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsServiceSoftwareOptions getServiceSoftwareOptions() {
    return serviceSoftwareOptions;
  }

  public void setServiceSoftwareOptions(AwsElasticsearchDomainDetailsServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
  }


  public ResourceDetailsAwsElasticsearchDomain vpCOptions(AwsElasticsearchDomainDetailsVPCOptions vpCOptions) {
    this.vpCOptions = vpCOptions;
    return this;
  }

  /**
   * Get vpCOptions
   * @return vpCOptions
   */
  @javax.annotation.Nullable
  public AwsElasticsearchDomainDetailsVPCOptions getVpCOptions() {
    return vpCOptions;
  }

  public void setVpCOptions(AwsElasticsearchDomainDetailsVPCOptions vpCOptions) {
    this.vpCOptions = vpCOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsElasticsearchDomain resourceDetailsAwsElasticsearchDomain = (ResourceDetailsAwsElasticsearchDomain) o;
    return Objects.equals(this.accessPolicies, resourceDetailsAwsElasticsearchDomain.accessPolicies) &&
        Objects.equals(this.domainEndpointOptions, resourceDetailsAwsElasticsearchDomain.domainEndpointOptions) &&
        Objects.equals(this.domainId, resourceDetailsAwsElasticsearchDomain.domainId) &&
        Objects.equals(this.domainName, resourceDetailsAwsElasticsearchDomain.domainName) &&
        Objects.equals(this.endpoint, resourceDetailsAwsElasticsearchDomain.endpoint) &&
        Objects.equals(this.endpoints, resourceDetailsAwsElasticsearchDomain.endpoints) &&
        Objects.equals(this.elasticsearchVersion, resourceDetailsAwsElasticsearchDomain.elasticsearchVersion) &&
        Objects.equals(this.elasticsearchClusterConfig, resourceDetailsAwsElasticsearchDomain.elasticsearchClusterConfig) &&
        Objects.equals(this.encryptionAtRestOptions, resourceDetailsAwsElasticsearchDomain.encryptionAtRestOptions) &&
        Objects.equals(this.logPublishingOptions, resourceDetailsAwsElasticsearchDomain.logPublishingOptions) &&
        Objects.equals(this.nodeToNodeEncryptionOptions, resourceDetailsAwsElasticsearchDomain.nodeToNodeEncryptionOptions) &&
        Objects.equals(this.serviceSoftwareOptions, resourceDetailsAwsElasticsearchDomain.serviceSoftwareOptions) &&
        Objects.equals(this.vpCOptions, resourceDetailsAwsElasticsearchDomain.vpCOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicies, domainEndpointOptions, domainId, domainName, endpoint, endpoints, elasticsearchVersion, elasticsearchClusterConfig, encryptionAtRestOptions, logPublishingOptions, nodeToNodeEncryptionOptions, serviceSoftwareOptions, vpCOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsElasticsearchDomain {\n");
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    domainEndpointOptions: ").append(toIndentedString(domainEndpointOptions)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    elasticsearchVersion: ").append(toIndentedString(elasticsearchVersion)).append("\n");
    sb.append("    elasticsearchClusterConfig: ").append(toIndentedString(elasticsearchClusterConfig)).append("\n");
    sb.append("    encryptionAtRestOptions: ").append(toIndentedString(encryptionAtRestOptions)).append("\n");
    sb.append("    logPublishingOptions: ").append(toIndentedString(logPublishingOptions)).append("\n");
    sb.append("    nodeToNodeEncryptionOptions: ").append(toIndentedString(nodeToNodeEncryptionOptions)).append("\n");
    sb.append("    serviceSoftwareOptions: ").append(toIndentedString(serviceSoftwareOptions)).append("\n");
    sb.append("    vpCOptions: ").append(toIndentedString(vpCOptions)).append("\n");
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
    openapiFields.add("AccessPolicies");
    openapiFields.add("DomainEndpointOptions");
    openapiFields.add("DomainId");
    openapiFields.add("DomainName");
    openapiFields.add("Endpoint");
    openapiFields.add("Endpoints");
    openapiFields.add("ElasticsearchVersion");
    openapiFields.add("ElasticsearchClusterConfig");
    openapiFields.add("EncryptionAtRestOptions");
    openapiFields.add("LogPublishingOptions");
    openapiFields.add("NodeToNodeEncryptionOptions");
    openapiFields.add("ServiceSoftwareOptions");
    openapiFields.add("VPCOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsElasticsearchDomain
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsElasticsearchDomain.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsElasticsearchDomain is not found in the empty JSON string", ResourceDetailsAwsElasticsearchDomain.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsElasticsearchDomain.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsElasticsearchDomain` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccessPolicies`
      if (jsonObj.get("AccessPolicies") != null && !jsonObj.get("AccessPolicies").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessPolicies"));
      }
      // validate the optional field `DomainEndpointOptions`
      if (jsonObj.get("DomainEndpointOptions") != null && !jsonObj.get("DomainEndpointOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsDomainEndpointOptions.validateJsonElement(jsonObj.get("DomainEndpointOptions"));
      }
      // validate the optional field `DomainId`
      if (jsonObj.get("DomainId") != null && !jsonObj.get("DomainId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainId"));
      }
      // validate the optional field `DomainName`
      if (jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DomainName"));
      }
      // validate the optional field `Endpoint`
      if (jsonObj.get("Endpoint") != null && !jsonObj.get("Endpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Endpoint"));
      }
      // validate the optional field `Endpoints`
      if (jsonObj.get("Endpoints") != null && !jsonObj.get("Endpoints").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Endpoints"));
      }
      // validate the optional field `ElasticsearchVersion`
      if (jsonObj.get("ElasticsearchVersion") != null && !jsonObj.get("ElasticsearchVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ElasticsearchVersion"));
      }
      // validate the optional field `ElasticsearchClusterConfig`
      if (jsonObj.get("ElasticsearchClusterConfig") != null && !jsonObj.get("ElasticsearchClusterConfig").isJsonNull()) {
        AwsElasticsearchDomainDetailsElasticsearchClusterConfig.validateJsonElement(jsonObj.get("ElasticsearchClusterConfig"));
      }
      // validate the optional field `EncryptionAtRestOptions`
      if (jsonObj.get("EncryptionAtRestOptions") != null && !jsonObj.get("EncryptionAtRestOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsEncryptionAtRestOptions.validateJsonElement(jsonObj.get("EncryptionAtRestOptions"));
      }
      // validate the optional field `LogPublishingOptions`
      if (jsonObj.get("LogPublishingOptions") != null && !jsonObj.get("LogPublishingOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsLogPublishingOptions.validateJsonElement(jsonObj.get("LogPublishingOptions"));
      }
      // validate the optional field `NodeToNodeEncryptionOptions`
      if (jsonObj.get("NodeToNodeEncryptionOptions") != null && !jsonObj.get("NodeToNodeEncryptionOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsNodeToNodeEncryptionOptions.validateJsonElement(jsonObj.get("NodeToNodeEncryptionOptions"));
      }
      // validate the optional field `ServiceSoftwareOptions`
      if (jsonObj.get("ServiceSoftwareOptions") != null && !jsonObj.get("ServiceSoftwareOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsServiceSoftwareOptions.validateJsonElement(jsonObj.get("ServiceSoftwareOptions"));
      }
      // validate the optional field `VPCOptions`
      if (jsonObj.get("VPCOptions") != null && !jsonObj.get("VPCOptions").isJsonNull()) {
        AwsElasticsearchDomainDetailsVPCOptions.validateJsonElement(jsonObj.get("VPCOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsElasticsearchDomain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsElasticsearchDomain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsElasticsearchDomain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsElasticsearchDomain.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsElasticsearchDomain>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsElasticsearchDomain value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsElasticsearchDomain read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsElasticsearchDomain given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsElasticsearchDomain
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsElasticsearchDomain
   */
  public static ResourceDetailsAwsElasticsearchDomain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsElasticsearchDomain.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsElasticsearchDomain to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

