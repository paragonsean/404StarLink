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
import java.util.Map;
import org.openapitools.client.model.ElasticsearchDomainStatusAdvancedSecurityOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusAutoTuneOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusChangeProgressDetails;
import org.openapitools.client.model.ElasticsearchDomainStatusCognitoOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusDomainEndpointOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusEBSOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusElasticsearchClusterConfig;
import org.openapitools.client.model.ElasticsearchDomainStatusEncryptionAtRestOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusNodeToNodeEncryptionOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusServiceSoftwareOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusSnapshotOptions;
import org.openapitools.client.model.ElasticsearchDomainStatusVPCOptions;

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
 * DeleteElasticsearchDomainResponseDomainStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:43.502419-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeleteElasticsearchDomainResponseDomainStatus {
  public static final String SERIALIZED_NAME_DOMAIN_ID = "DomainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_A_R_N = "ARN";
  @SerializedName(SERIALIZED_NAME_A_R_N)
  private String ARN;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Boolean created;

  public static final String SERIALIZED_NAME_DELETED = "Deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_ENDPOINTS = "Endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private Map endpoints;

  public static final String SERIALIZED_NAME_PROCESSING = "Processing";
  @SerializedName(SERIALIZED_NAME_PROCESSING)
  private Boolean processing;

  public static final String SERIALIZED_NAME_UPGRADE_PROCESSING = "UpgradeProcessing";
  @SerializedName(SERIALIZED_NAME_UPGRADE_PROCESSING)
  private Boolean upgradeProcessing;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_VERSION = "ElasticsearchVersion";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_VERSION)
  private String elasticsearchVersion;

  public static final String SERIALIZED_NAME_ELASTICSEARCH_CLUSTER_CONFIG = "ElasticsearchClusterConfig";
  @SerializedName(SERIALIZED_NAME_ELASTICSEARCH_CLUSTER_CONFIG)
  private ElasticsearchDomainStatusElasticsearchClusterConfig elasticsearchClusterConfig;

  public static final String SERIALIZED_NAME_EB_S_OPTIONS = "EBSOptions";
  @SerializedName(SERIALIZED_NAME_EB_S_OPTIONS)
  private ElasticsearchDomainStatusEBSOptions ebSOptions;

  public static final String SERIALIZED_NAME_ACCESS_POLICIES = "AccessPolicies";
  @SerializedName(SERIALIZED_NAME_ACCESS_POLICIES)
  private String accessPolicies;

  public static final String SERIALIZED_NAME_SNAPSHOT_OPTIONS = "SnapshotOptions";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_OPTIONS)
  private ElasticsearchDomainStatusSnapshotOptions snapshotOptions;

  public static final String SERIALIZED_NAME_VP_C_OPTIONS = "VPCOptions";
  @SerializedName(SERIALIZED_NAME_VP_C_OPTIONS)
  private ElasticsearchDomainStatusVPCOptions vpCOptions;

  public static final String SERIALIZED_NAME_COGNITO_OPTIONS = "CognitoOptions";
  @SerializedName(SERIALIZED_NAME_COGNITO_OPTIONS)
  private ElasticsearchDomainStatusCognitoOptions cognitoOptions;

  public static final String SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS = "EncryptionAtRestOptions";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_AT_REST_OPTIONS)
  private ElasticsearchDomainStatusEncryptionAtRestOptions encryptionAtRestOptions;

  public static final String SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS = "NodeToNodeEncryptionOptions";
  @SerializedName(SERIALIZED_NAME_NODE_TO_NODE_ENCRYPTION_OPTIONS)
  private ElasticsearchDomainStatusNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

  public static final String SERIALIZED_NAME_ADVANCED_OPTIONS = "AdvancedOptions";
  @SerializedName(SERIALIZED_NAME_ADVANCED_OPTIONS)
  private Map advancedOptions;

  public static final String SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS = "LogPublishingOptions";
  @SerializedName(SERIALIZED_NAME_LOG_PUBLISHING_OPTIONS)
  private Map logPublishingOptions;

  public static final String SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS = "ServiceSoftwareOptions";
  @SerializedName(SERIALIZED_NAME_SERVICE_SOFTWARE_OPTIONS)
  private ElasticsearchDomainStatusServiceSoftwareOptions serviceSoftwareOptions;

  public static final String SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS = "DomainEndpointOptions";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ENDPOINT_OPTIONS)
  private ElasticsearchDomainStatusDomainEndpointOptions domainEndpointOptions;

  public static final String SERIALIZED_NAME_ADVANCED_SECURITY_OPTIONS = "AdvancedSecurityOptions";
  @SerializedName(SERIALIZED_NAME_ADVANCED_SECURITY_OPTIONS)
  private ElasticsearchDomainStatusAdvancedSecurityOptions advancedSecurityOptions;

  public static final String SERIALIZED_NAME_AUTO_TUNE_OPTIONS = "AutoTuneOptions";
  @SerializedName(SERIALIZED_NAME_AUTO_TUNE_OPTIONS)
  private ElasticsearchDomainStatusAutoTuneOptions autoTuneOptions;

  public static final String SERIALIZED_NAME_CHANGE_PROGRESS_DETAILS = "ChangeProgressDetails";
  @SerializedName(SERIALIZED_NAME_CHANGE_PROGRESS_DETAILS)
  private ElasticsearchDomainStatusChangeProgressDetails changeProgressDetails;

  public DeleteElasticsearchDomainResponseDomainStatus() {
  }

  public DeleteElasticsearchDomainResponseDomainStatus domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
   */
  @javax.annotation.Nonnull
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  public DeleteElasticsearchDomainResponseDomainStatus domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Get domainName
   * @return domainName
   */
  @javax.annotation.Nonnull
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public DeleteElasticsearchDomainResponseDomainStatus ARN(String ARN) {
    this.ARN = ARN;
    return this;
  }

  /**
   * Get ARN
   * @return ARN
   */
  @javax.annotation.Nonnull
  public String getARN() {
    return ARN;
  }

  public void setARN(String ARN) {
    this.ARN = ARN;
  }


  public DeleteElasticsearchDomainResponseDomainStatus created(Boolean created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  public Boolean getCreated() {
    return created;
  }

  public void setCreated(Boolean created) {
    this.created = created;
  }


  public DeleteElasticsearchDomainResponseDomainStatus deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public DeleteElasticsearchDomainResponseDomainStatus endpoint(String endpoint) {
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


  public DeleteElasticsearchDomainResponseDomainStatus endpoints(Map endpoints) {
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


  public DeleteElasticsearchDomainResponseDomainStatus processing(Boolean processing) {
    this.processing = processing;
    return this;
  }

  /**
   * Get processing
   * @return processing
   */
  @javax.annotation.Nullable
  public Boolean getProcessing() {
    return processing;
  }

  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }


  public DeleteElasticsearchDomainResponseDomainStatus upgradeProcessing(Boolean upgradeProcessing) {
    this.upgradeProcessing = upgradeProcessing;
    return this;
  }

  /**
   * Get upgradeProcessing
   * @return upgradeProcessing
   */
  @javax.annotation.Nullable
  public Boolean getUpgradeProcessing() {
    return upgradeProcessing;
  }

  public void setUpgradeProcessing(Boolean upgradeProcessing) {
    this.upgradeProcessing = upgradeProcessing;
  }


  public DeleteElasticsearchDomainResponseDomainStatus elasticsearchVersion(String elasticsearchVersion) {
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


  public DeleteElasticsearchDomainResponseDomainStatus elasticsearchClusterConfig(ElasticsearchDomainStatusElasticsearchClusterConfig elasticsearchClusterConfig) {
    this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    return this;
  }

  /**
   * Get elasticsearchClusterConfig
   * @return elasticsearchClusterConfig
   */
  @javax.annotation.Nonnull
  public ElasticsearchDomainStatusElasticsearchClusterConfig getElasticsearchClusterConfig() {
    return elasticsearchClusterConfig;
  }

  public void setElasticsearchClusterConfig(ElasticsearchDomainStatusElasticsearchClusterConfig elasticsearchClusterConfig) {
    this.elasticsearchClusterConfig = elasticsearchClusterConfig;
  }


  public DeleteElasticsearchDomainResponseDomainStatus ebSOptions(ElasticsearchDomainStatusEBSOptions ebSOptions) {
    this.ebSOptions = ebSOptions;
    return this;
  }

  /**
   * Get ebSOptions
   * @return ebSOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusEBSOptions getEbSOptions() {
    return ebSOptions;
  }

  public void setEbSOptions(ElasticsearchDomainStatusEBSOptions ebSOptions) {
    this.ebSOptions = ebSOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus accessPolicies(String accessPolicies) {
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


  public DeleteElasticsearchDomainResponseDomainStatus snapshotOptions(ElasticsearchDomainStatusSnapshotOptions snapshotOptions) {
    this.snapshotOptions = snapshotOptions;
    return this;
  }

  /**
   * Get snapshotOptions
   * @return snapshotOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusSnapshotOptions getSnapshotOptions() {
    return snapshotOptions;
  }

  public void setSnapshotOptions(ElasticsearchDomainStatusSnapshotOptions snapshotOptions) {
    this.snapshotOptions = snapshotOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus vpCOptions(ElasticsearchDomainStatusVPCOptions vpCOptions) {
    this.vpCOptions = vpCOptions;
    return this;
  }

  /**
   * Get vpCOptions
   * @return vpCOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusVPCOptions getVpCOptions() {
    return vpCOptions;
  }

  public void setVpCOptions(ElasticsearchDomainStatusVPCOptions vpCOptions) {
    this.vpCOptions = vpCOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus cognitoOptions(ElasticsearchDomainStatusCognitoOptions cognitoOptions) {
    this.cognitoOptions = cognitoOptions;
    return this;
  }

  /**
   * Get cognitoOptions
   * @return cognitoOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusCognitoOptions getCognitoOptions() {
    return cognitoOptions;
  }

  public void setCognitoOptions(ElasticsearchDomainStatusCognitoOptions cognitoOptions) {
    this.cognitoOptions = cognitoOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus encryptionAtRestOptions(ElasticsearchDomainStatusEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
    return this;
  }

  /**
   * Get encryptionAtRestOptions
   * @return encryptionAtRestOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusEncryptionAtRestOptions getEncryptionAtRestOptions() {
    return encryptionAtRestOptions;
  }

  public void setEncryptionAtRestOptions(ElasticsearchDomainStatusEncryptionAtRestOptions encryptionAtRestOptions) {
    this.encryptionAtRestOptions = encryptionAtRestOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus nodeToNodeEncryptionOptions(ElasticsearchDomainStatusNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    return this;
  }

  /**
   * Get nodeToNodeEncryptionOptions
   * @return nodeToNodeEncryptionOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusNodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
    return nodeToNodeEncryptionOptions;
  }

  public void setNodeToNodeEncryptionOptions(ElasticsearchDomainStatusNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
    this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus advancedOptions(Map advancedOptions) {
    this.advancedOptions = advancedOptions;
    return this;
  }

  /**
   * Get advancedOptions
   * @return advancedOptions
   */
  @javax.annotation.Nullable
  public Map getAdvancedOptions() {
    return advancedOptions;
  }

  public void setAdvancedOptions(Map advancedOptions) {
    this.advancedOptions = advancedOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus logPublishingOptions(Map logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
    return this;
  }

  /**
   * Get logPublishingOptions
   * @return logPublishingOptions
   */
  @javax.annotation.Nullable
  public Map getLogPublishingOptions() {
    return logPublishingOptions;
  }

  public void setLogPublishingOptions(Map logPublishingOptions) {
    this.logPublishingOptions = logPublishingOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus serviceSoftwareOptions(ElasticsearchDomainStatusServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
    return this;
  }

  /**
   * Get serviceSoftwareOptions
   * @return serviceSoftwareOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusServiceSoftwareOptions getServiceSoftwareOptions() {
    return serviceSoftwareOptions;
  }

  public void setServiceSoftwareOptions(ElasticsearchDomainStatusServiceSoftwareOptions serviceSoftwareOptions) {
    this.serviceSoftwareOptions = serviceSoftwareOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus domainEndpointOptions(ElasticsearchDomainStatusDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
    return this;
  }

  /**
   * Get domainEndpointOptions
   * @return domainEndpointOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusDomainEndpointOptions getDomainEndpointOptions() {
    return domainEndpointOptions;
  }

  public void setDomainEndpointOptions(ElasticsearchDomainStatusDomainEndpointOptions domainEndpointOptions) {
    this.domainEndpointOptions = domainEndpointOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus advancedSecurityOptions(ElasticsearchDomainStatusAdvancedSecurityOptions advancedSecurityOptions) {
    this.advancedSecurityOptions = advancedSecurityOptions;
    return this;
  }

  /**
   * Get advancedSecurityOptions
   * @return advancedSecurityOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusAdvancedSecurityOptions getAdvancedSecurityOptions() {
    return advancedSecurityOptions;
  }

  public void setAdvancedSecurityOptions(ElasticsearchDomainStatusAdvancedSecurityOptions advancedSecurityOptions) {
    this.advancedSecurityOptions = advancedSecurityOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus autoTuneOptions(ElasticsearchDomainStatusAutoTuneOptions autoTuneOptions) {
    this.autoTuneOptions = autoTuneOptions;
    return this;
  }

  /**
   * Get autoTuneOptions
   * @return autoTuneOptions
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusAutoTuneOptions getAutoTuneOptions() {
    return autoTuneOptions;
  }

  public void setAutoTuneOptions(ElasticsearchDomainStatusAutoTuneOptions autoTuneOptions) {
    this.autoTuneOptions = autoTuneOptions;
  }


  public DeleteElasticsearchDomainResponseDomainStatus changeProgressDetails(ElasticsearchDomainStatusChangeProgressDetails changeProgressDetails) {
    this.changeProgressDetails = changeProgressDetails;
    return this;
  }

  /**
   * Get changeProgressDetails
   * @return changeProgressDetails
   */
  @javax.annotation.Nullable
  public ElasticsearchDomainStatusChangeProgressDetails getChangeProgressDetails() {
    return changeProgressDetails;
  }

  public void setChangeProgressDetails(ElasticsearchDomainStatusChangeProgressDetails changeProgressDetails) {
    this.changeProgressDetails = changeProgressDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteElasticsearchDomainResponseDomainStatus deleteElasticsearchDomainResponseDomainStatus = (DeleteElasticsearchDomainResponseDomainStatus) o;
    return Objects.equals(this.domainId, deleteElasticsearchDomainResponseDomainStatus.domainId) &&
        Objects.equals(this.domainName, deleteElasticsearchDomainResponseDomainStatus.domainName) &&
        Objects.equals(this.ARN, deleteElasticsearchDomainResponseDomainStatus.ARN) &&
        Objects.equals(this.created, deleteElasticsearchDomainResponseDomainStatus.created) &&
        Objects.equals(this.deleted, deleteElasticsearchDomainResponseDomainStatus.deleted) &&
        Objects.equals(this.endpoint, deleteElasticsearchDomainResponseDomainStatus.endpoint) &&
        Objects.equals(this.endpoints, deleteElasticsearchDomainResponseDomainStatus.endpoints) &&
        Objects.equals(this.processing, deleteElasticsearchDomainResponseDomainStatus.processing) &&
        Objects.equals(this.upgradeProcessing, deleteElasticsearchDomainResponseDomainStatus.upgradeProcessing) &&
        Objects.equals(this.elasticsearchVersion, deleteElasticsearchDomainResponseDomainStatus.elasticsearchVersion) &&
        Objects.equals(this.elasticsearchClusterConfig, deleteElasticsearchDomainResponseDomainStatus.elasticsearchClusterConfig) &&
        Objects.equals(this.ebSOptions, deleteElasticsearchDomainResponseDomainStatus.ebSOptions) &&
        Objects.equals(this.accessPolicies, deleteElasticsearchDomainResponseDomainStatus.accessPolicies) &&
        Objects.equals(this.snapshotOptions, deleteElasticsearchDomainResponseDomainStatus.snapshotOptions) &&
        Objects.equals(this.vpCOptions, deleteElasticsearchDomainResponseDomainStatus.vpCOptions) &&
        Objects.equals(this.cognitoOptions, deleteElasticsearchDomainResponseDomainStatus.cognitoOptions) &&
        Objects.equals(this.encryptionAtRestOptions, deleteElasticsearchDomainResponseDomainStatus.encryptionAtRestOptions) &&
        Objects.equals(this.nodeToNodeEncryptionOptions, deleteElasticsearchDomainResponseDomainStatus.nodeToNodeEncryptionOptions) &&
        Objects.equals(this.advancedOptions, deleteElasticsearchDomainResponseDomainStatus.advancedOptions) &&
        Objects.equals(this.logPublishingOptions, deleteElasticsearchDomainResponseDomainStatus.logPublishingOptions) &&
        Objects.equals(this.serviceSoftwareOptions, deleteElasticsearchDomainResponseDomainStatus.serviceSoftwareOptions) &&
        Objects.equals(this.domainEndpointOptions, deleteElasticsearchDomainResponseDomainStatus.domainEndpointOptions) &&
        Objects.equals(this.advancedSecurityOptions, deleteElasticsearchDomainResponseDomainStatus.advancedSecurityOptions) &&
        Objects.equals(this.autoTuneOptions, deleteElasticsearchDomainResponseDomainStatus.autoTuneOptions) &&
        Objects.equals(this.changeProgressDetails, deleteElasticsearchDomainResponseDomainStatus.changeProgressDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, domainName, ARN, created, deleted, endpoint, endpoints, processing, upgradeProcessing, elasticsearchVersion, elasticsearchClusterConfig, ebSOptions, accessPolicies, snapshotOptions, vpCOptions, cognitoOptions, encryptionAtRestOptions, nodeToNodeEncryptionOptions, advancedOptions, logPublishingOptions, serviceSoftwareOptions, domainEndpointOptions, advancedSecurityOptions, autoTuneOptions, changeProgressDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteElasticsearchDomainResponseDomainStatus {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    ARN: ").append(toIndentedString(ARN)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    upgradeProcessing: ").append(toIndentedString(upgradeProcessing)).append("\n");
    sb.append("    elasticsearchVersion: ").append(toIndentedString(elasticsearchVersion)).append("\n");
    sb.append("    elasticsearchClusterConfig: ").append(toIndentedString(elasticsearchClusterConfig)).append("\n");
    sb.append("    ebSOptions: ").append(toIndentedString(ebSOptions)).append("\n");
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    snapshotOptions: ").append(toIndentedString(snapshotOptions)).append("\n");
    sb.append("    vpCOptions: ").append(toIndentedString(vpCOptions)).append("\n");
    sb.append("    cognitoOptions: ").append(toIndentedString(cognitoOptions)).append("\n");
    sb.append("    encryptionAtRestOptions: ").append(toIndentedString(encryptionAtRestOptions)).append("\n");
    sb.append("    nodeToNodeEncryptionOptions: ").append(toIndentedString(nodeToNodeEncryptionOptions)).append("\n");
    sb.append("    advancedOptions: ").append(toIndentedString(advancedOptions)).append("\n");
    sb.append("    logPublishingOptions: ").append(toIndentedString(logPublishingOptions)).append("\n");
    sb.append("    serviceSoftwareOptions: ").append(toIndentedString(serviceSoftwareOptions)).append("\n");
    sb.append("    domainEndpointOptions: ").append(toIndentedString(domainEndpointOptions)).append("\n");
    sb.append("    advancedSecurityOptions: ").append(toIndentedString(advancedSecurityOptions)).append("\n");
    sb.append("    autoTuneOptions: ").append(toIndentedString(autoTuneOptions)).append("\n");
    sb.append("    changeProgressDetails: ").append(toIndentedString(changeProgressDetails)).append("\n");
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
    openapiFields.add("DomainId");
    openapiFields.add("DomainName");
    openapiFields.add("ARN");
    openapiFields.add("Created");
    openapiFields.add("Deleted");
    openapiFields.add("Endpoint");
    openapiFields.add("Endpoints");
    openapiFields.add("Processing");
    openapiFields.add("UpgradeProcessing");
    openapiFields.add("ElasticsearchVersion");
    openapiFields.add("ElasticsearchClusterConfig");
    openapiFields.add("EBSOptions");
    openapiFields.add("AccessPolicies");
    openapiFields.add("SnapshotOptions");
    openapiFields.add("VPCOptions");
    openapiFields.add("CognitoOptions");
    openapiFields.add("EncryptionAtRestOptions");
    openapiFields.add("NodeToNodeEncryptionOptions");
    openapiFields.add("AdvancedOptions");
    openapiFields.add("LogPublishingOptions");
    openapiFields.add("ServiceSoftwareOptions");
    openapiFields.add("DomainEndpointOptions");
    openapiFields.add("AdvancedSecurityOptions");
    openapiFields.add("AutoTuneOptions");
    openapiFields.add("ChangeProgressDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DomainId");
    openapiRequiredFields.add("DomainName");
    openapiRequiredFields.add("ARN");
    openapiRequiredFields.add("ElasticsearchClusterConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteElasticsearchDomainResponseDomainStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteElasticsearchDomainResponseDomainStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteElasticsearchDomainResponseDomainStatus is not found in the empty JSON string", DeleteElasticsearchDomainResponseDomainStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteElasticsearchDomainResponseDomainStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteElasticsearchDomainResponseDomainStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteElasticsearchDomainResponseDomainStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `DomainId`
      String.validateJsonElement(jsonObj.get("DomainId"));
      // validate the required field `DomainName`
      String.validateJsonElement(jsonObj.get("DomainName"));
      // validate the required field `ARN`
      String.validateJsonElement(jsonObj.get("ARN"));
      // validate the optional field `Created`
      if (jsonObj.get("Created") != null && !jsonObj.get("Created").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Created"));
      }
      // validate the optional field `Deleted`
      if (jsonObj.get("Deleted") != null && !jsonObj.get("Deleted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Deleted"));
      }
      // validate the optional field `Endpoint`
      if (jsonObj.get("Endpoint") != null && !jsonObj.get("Endpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Endpoint"));
      }
      // validate the optional field `Endpoints`
      if (jsonObj.get("Endpoints") != null && !jsonObj.get("Endpoints").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Endpoints"));
      }
      // validate the optional field `Processing`
      if (jsonObj.get("Processing") != null && !jsonObj.get("Processing").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Processing"));
      }
      // validate the optional field `UpgradeProcessing`
      if (jsonObj.get("UpgradeProcessing") != null && !jsonObj.get("UpgradeProcessing").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("UpgradeProcessing"));
      }
      if ((jsonObj.get("ElasticsearchVersion") != null && !jsonObj.get("ElasticsearchVersion").isJsonNull()) && !jsonObj.get("ElasticsearchVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ElasticsearchVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ElasticsearchVersion").toString()));
      }
      // validate the required field `ElasticsearchClusterConfig`
      ElasticsearchDomainStatusElasticsearchClusterConfig.validateJsonElement(jsonObj.get("ElasticsearchClusterConfig"));
      // validate the optional field `EBSOptions`
      if (jsonObj.get("EBSOptions") != null && !jsonObj.get("EBSOptions").isJsonNull()) {
        ElasticsearchDomainStatusEBSOptions.validateJsonElement(jsonObj.get("EBSOptions"));
      }
      // validate the optional field `AccessPolicies`
      if (jsonObj.get("AccessPolicies") != null && !jsonObj.get("AccessPolicies").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessPolicies"));
      }
      // validate the optional field `SnapshotOptions`
      if (jsonObj.get("SnapshotOptions") != null && !jsonObj.get("SnapshotOptions").isJsonNull()) {
        ElasticsearchDomainStatusSnapshotOptions.validateJsonElement(jsonObj.get("SnapshotOptions"));
      }
      // validate the optional field `VPCOptions`
      if (jsonObj.get("VPCOptions") != null && !jsonObj.get("VPCOptions").isJsonNull()) {
        ElasticsearchDomainStatusVPCOptions.validateJsonElement(jsonObj.get("VPCOptions"));
      }
      // validate the optional field `CognitoOptions`
      if (jsonObj.get("CognitoOptions") != null && !jsonObj.get("CognitoOptions").isJsonNull()) {
        ElasticsearchDomainStatusCognitoOptions.validateJsonElement(jsonObj.get("CognitoOptions"));
      }
      // validate the optional field `EncryptionAtRestOptions`
      if (jsonObj.get("EncryptionAtRestOptions") != null && !jsonObj.get("EncryptionAtRestOptions").isJsonNull()) {
        ElasticsearchDomainStatusEncryptionAtRestOptions.validateJsonElement(jsonObj.get("EncryptionAtRestOptions"));
      }
      // validate the optional field `NodeToNodeEncryptionOptions`
      if (jsonObj.get("NodeToNodeEncryptionOptions") != null && !jsonObj.get("NodeToNodeEncryptionOptions").isJsonNull()) {
        ElasticsearchDomainStatusNodeToNodeEncryptionOptions.validateJsonElement(jsonObj.get("NodeToNodeEncryptionOptions"));
      }
      // validate the optional field `AdvancedOptions`
      if (jsonObj.get("AdvancedOptions") != null && !jsonObj.get("AdvancedOptions").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("AdvancedOptions"));
      }
      // validate the optional field `LogPublishingOptions`
      if (jsonObj.get("LogPublishingOptions") != null && !jsonObj.get("LogPublishingOptions").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("LogPublishingOptions"));
      }
      // validate the optional field `ServiceSoftwareOptions`
      if (jsonObj.get("ServiceSoftwareOptions") != null && !jsonObj.get("ServiceSoftwareOptions").isJsonNull()) {
        ElasticsearchDomainStatusServiceSoftwareOptions.validateJsonElement(jsonObj.get("ServiceSoftwareOptions"));
      }
      // validate the optional field `DomainEndpointOptions`
      if (jsonObj.get("DomainEndpointOptions") != null && !jsonObj.get("DomainEndpointOptions").isJsonNull()) {
        ElasticsearchDomainStatusDomainEndpointOptions.validateJsonElement(jsonObj.get("DomainEndpointOptions"));
      }
      // validate the optional field `AdvancedSecurityOptions`
      if (jsonObj.get("AdvancedSecurityOptions") != null && !jsonObj.get("AdvancedSecurityOptions").isJsonNull()) {
        ElasticsearchDomainStatusAdvancedSecurityOptions.validateJsonElement(jsonObj.get("AdvancedSecurityOptions"));
      }
      // validate the optional field `AutoTuneOptions`
      if (jsonObj.get("AutoTuneOptions") != null && !jsonObj.get("AutoTuneOptions").isJsonNull()) {
        ElasticsearchDomainStatusAutoTuneOptions.validateJsonElement(jsonObj.get("AutoTuneOptions"));
      }
      // validate the optional field `ChangeProgressDetails`
      if (jsonObj.get("ChangeProgressDetails") != null && !jsonObj.get("ChangeProgressDetails").isJsonNull()) {
        ElasticsearchDomainStatusChangeProgressDetails.validateJsonElement(jsonObj.get("ChangeProgressDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteElasticsearchDomainResponseDomainStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteElasticsearchDomainResponseDomainStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteElasticsearchDomainResponseDomainStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteElasticsearchDomainResponseDomainStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteElasticsearchDomainResponseDomainStatus>() {
           @Override
           public void write(JsonWriter out, DeleteElasticsearchDomainResponseDomainStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteElasticsearchDomainResponseDomainStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteElasticsearchDomainResponseDomainStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteElasticsearchDomainResponseDomainStatus
   * @throws IOException if the JSON string is invalid with respect to DeleteElasticsearchDomainResponseDomainStatus
   */
  public static DeleteElasticsearchDomainResponseDomainStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteElasticsearchDomainResponseDomainStatus.class);
  }

  /**
   * Convert an instance of DeleteElasticsearchDomainResponseDomainStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

