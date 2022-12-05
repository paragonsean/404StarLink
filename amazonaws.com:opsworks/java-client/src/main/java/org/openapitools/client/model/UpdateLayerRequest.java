/*
 * AWS OpsWorks
 * <fullname>AWS OpsWorks</fullname> <p>Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples for AWS OpsWorks Stacks actions and data types, including common parameters and error codes. </p> <p>AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the complete application lifecycle. For information about this product, go to the <a href=\"http://aws.amazon.com/opsworks/\">AWS OpsWorks</a> details page. </p> <p> <b>SDKs and CLI</b> </p> <p>The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using one of the AWS SDKs to implement applications in your preferred language. For more information, see:</p> <ul> <li> <p> <a href=\"https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html\">AWS CLI</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html\">AWS SDK for Java</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm\">AWS SDK for .NET</a> </p> </li> <li> <p> <a href=\"https://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html\">AWS SDK for PHP 2</a> </p> </li> <li> <p> <a href=\"http://docs.aws.amazon.com/sdkforruby/api/\">AWS SDK for Ruby</a> </p> </li> <li> <p> <a href=\"http://aws.amazon.com/documentation/sdkforjavascript/\">AWS SDK for Node.js</a> </p> </li> <li> <p> <a href=\"http://docs.pythonboto.org/en/latest/ref/opsworks.html\">AWS SDK for Python(Boto)</a> </p> </li> </ul> <p> <b>Endpoints</b> </p> <p>AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks can only be accessed or managed within the endpoint in which they are created.</p> <ul> <li> <p>opsworks.us-east-1.amazonaws.com</p> </li> <li> <p>opsworks.us-east-2.amazonaws.com</p> </li> <li> <p>opsworks.us-west-1.amazonaws.com</p> </li> <li> <p>opsworks.us-west-2.amazonaws.com</p> </li> <li> <p>opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)</p> </li> <li> <p>opsworks.eu-west-1.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-2.amazonaws.com</p> </li> <li> <p>opsworks.eu-west-3.amazonaws.com</p> </li> <li> <p>opsworks.eu-central-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-northeast-2.amazonaws.com</p> </li> <li> <p>opsworks.ap-south-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-1.amazonaws.com</p> </li> <li> <p>opsworks.ap-southeast-2.amazonaws.com</p> </li> <li> <p>opsworks.sa-east-1.amazonaws.com</p> </li> </ul> <p> <b>Chef Versions</b> </p> <p>When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a href=\"https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html\">Chef Versions</a>.</p> <note> <p>You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to Chef 12 as soon as possible.</p> </note>
 *
 * The version of the OpenAPI document: 2013-02-18
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
import java.util.Map;
import org.openapitools.client.model.CreateLayerRequestCloudWatchLogsConfiguration;
import org.openapitools.client.model.UpdateLayerRequestCustomRecipes;
import org.openapitools.client.model.UpdateLayerRequestLifecycleEventConfiguration;

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
 * UpdateLayerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateLayerRequest {
  public static final String SERIALIZED_NAME_LAYER_ID = "LayerId";
  @SerializedName(SERIALIZED_NAME_LAYER_ID)
  private String layerId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTNAME = "Shortname";
  @SerializedName(SERIALIZED_NAME_SHORTNAME)
  private String shortname;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map attributes;

  public static final String SERIALIZED_NAME_CLOUD_WATCH_LOGS_CONFIGURATION = "CloudWatchLogsConfiguration";
  @SerializedName(SERIALIZED_NAME_CLOUD_WATCH_LOGS_CONFIGURATION)
  private CreateLayerRequestCloudWatchLogsConfiguration cloudWatchLogsConfiguration;

  public static final String SERIALIZED_NAME_CUSTOM_INSTANCE_PROFILE_ARN = "CustomInstanceProfileArn";
  @SerializedName(SERIALIZED_NAME_CUSTOM_INSTANCE_PROFILE_ARN)
  private String customInstanceProfileArn;

  public static final String SERIALIZED_NAME_CUSTOM_JSON = "CustomJson";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JSON)
  private String customJson;

  public static final String SERIALIZED_NAME_CUSTOM_SECURITY_GROUP_IDS = "CustomSecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SECURITY_GROUP_IDS)
  private List customSecurityGroupIds;

  public static final String SERIALIZED_NAME_PACKAGES = "Packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List packages;

  public static final String SERIALIZED_NAME_VOLUME_CONFIGURATIONS = "VolumeConfigurations";
  @SerializedName(SERIALIZED_NAME_VOLUME_CONFIGURATIONS)
  private List volumeConfigurations;

  public static final String SERIALIZED_NAME_ENABLE_AUTO_HEALING = "EnableAutoHealing";
  @SerializedName(SERIALIZED_NAME_ENABLE_AUTO_HEALING)
  private Boolean enableAutoHealing;

  public static final String SERIALIZED_NAME_AUTO_ASSIGN_ELASTIC_IPS = "AutoAssignElasticIps";
  @SerializedName(SERIALIZED_NAME_AUTO_ASSIGN_ELASTIC_IPS)
  private Boolean autoAssignElasticIps;

  public static final String SERIALIZED_NAME_AUTO_ASSIGN_PUBLIC_IPS = "AutoAssignPublicIps";
  @SerializedName(SERIALIZED_NAME_AUTO_ASSIGN_PUBLIC_IPS)
  private Boolean autoAssignPublicIps;

  public static final String SERIALIZED_NAME_CUSTOM_RECIPES = "CustomRecipes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RECIPES)
  private UpdateLayerRequestCustomRecipes customRecipes;

  public static final String SERIALIZED_NAME_INSTALL_UPDATES_ON_BOOT = "InstallUpdatesOnBoot";
  @SerializedName(SERIALIZED_NAME_INSTALL_UPDATES_ON_BOOT)
  private Boolean installUpdatesOnBoot;

  public static final String SERIALIZED_NAME_USE_EBS_OPTIMIZED_INSTANCES = "UseEbsOptimizedInstances";
  @SerializedName(SERIALIZED_NAME_USE_EBS_OPTIMIZED_INSTANCES)
  private Boolean useEbsOptimizedInstances;

  public static final String SERIALIZED_NAME_LIFECYCLE_EVENT_CONFIGURATION = "LifecycleEventConfiguration";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_EVENT_CONFIGURATION)
  private UpdateLayerRequestLifecycleEventConfiguration lifecycleEventConfiguration;

  public UpdateLayerRequest() {
  }

  public UpdateLayerRequest layerId(String layerId) {
    this.layerId = layerId;
    return this;
  }

  /**
   * Get layerId
   * @return layerId
   */
  @javax.annotation.Nonnull
  public String getLayerId() {
    return layerId;
  }

  public void setLayerId(String layerId) {
    this.layerId = layerId;
  }


  public UpdateLayerRequest name(String name) {
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


  public UpdateLayerRequest shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

  /**
   * Get shortname
   * @return shortname
   */
  @javax.annotation.Nullable
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }


  public UpdateLayerRequest attributes(Map attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map getAttributes() {
    return attributes;
  }

  public void setAttributes(Map attributes) {
    this.attributes = attributes;
  }


  public UpdateLayerRequest cloudWatchLogsConfiguration(CreateLayerRequestCloudWatchLogsConfiguration cloudWatchLogsConfiguration) {
    this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
    return this;
  }

  /**
   * Get cloudWatchLogsConfiguration
   * @return cloudWatchLogsConfiguration
   */
  @javax.annotation.Nullable
  public CreateLayerRequestCloudWatchLogsConfiguration getCloudWatchLogsConfiguration() {
    return cloudWatchLogsConfiguration;
  }

  public void setCloudWatchLogsConfiguration(CreateLayerRequestCloudWatchLogsConfiguration cloudWatchLogsConfiguration) {
    this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
  }


  public UpdateLayerRequest customInstanceProfileArn(String customInstanceProfileArn) {
    this.customInstanceProfileArn = customInstanceProfileArn;
    return this;
  }

  /**
   * Get customInstanceProfileArn
   * @return customInstanceProfileArn
   */
  @javax.annotation.Nullable
  public String getCustomInstanceProfileArn() {
    return customInstanceProfileArn;
  }

  public void setCustomInstanceProfileArn(String customInstanceProfileArn) {
    this.customInstanceProfileArn = customInstanceProfileArn;
  }


  public UpdateLayerRequest customJson(String customJson) {
    this.customJson = customJson;
    return this;
  }

  /**
   * Get customJson
   * @return customJson
   */
  @javax.annotation.Nullable
  public String getCustomJson() {
    return customJson;
  }

  public void setCustomJson(String customJson) {
    this.customJson = customJson;
  }


  public UpdateLayerRequest customSecurityGroupIds(List customSecurityGroupIds) {
    this.customSecurityGroupIds = customSecurityGroupIds;
    return this;
  }

  /**
   * Get customSecurityGroupIds
   * @return customSecurityGroupIds
   */
  @javax.annotation.Nullable
  public List getCustomSecurityGroupIds() {
    return customSecurityGroupIds;
  }

  public void setCustomSecurityGroupIds(List customSecurityGroupIds) {
    this.customSecurityGroupIds = customSecurityGroupIds;
  }


  public UpdateLayerRequest packages(List packages) {
    this.packages = packages;
    return this;
  }

  /**
   * Get packages
   * @return packages
   */
  @javax.annotation.Nullable
  public List getPackages() {
    return packages;
  }

  public void setPackages(List packages) {
    this.packages = packages;
  }


  public UpdateLayerRequest volumeConfigurations(List volumeConfigurations) {
    this.volumeConfigurations = volumeConfigurations;
    return this;
  }

  /**
   * Get volumeConfigurations
   * @return volumeConfigurations
   */
  @javax.annotation.Nullable
  public List getVolumeConfigurations() {
    return volumeConfigurations;
  }

  public void setVolumeConfigurations(List volumeConfigurations) {
    this.volumeConfigurations = volumeConfigurations;
  }


  public UpdateLayerRequest enableAutoHealing(Boolean enableAutoHealing) {
    this.enableAutoHealing = enableAutoHealing;
    return this;
  }

  /**
   * Get enableAutoHealing
   * @return enableAutoHealing
   */
  @javax.annotation.Nullable
  public Boolean getEnableAutoHealing() {
    return enableAutoHealing;
  }

  public void setEnableAutoHealing(Boolean enableAutoHealing) {
    this.enableAutoHealing = enableAutoHealing;
  }


  public UpdateLayerRequest autoAssignElasticIps(Boolean autoAssignElasticIps) {
    this.autoAssignElasticIps = autoAssignElasticIps;
    return this;
  }

  /**
   * Get autoAssignElasticIps
   * @return autoAssignElasticIps
   */
  @javax.annotation.Nullable
  public Boolean getAutoAssignElasticIps() {
    return autoAssignElasticIps;
  }

  public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
    this.autoAssignElasticIps = autoAssignElasticIps;
  }


  public UpdateLayerRequest autoAssignPublicIps(Boolean autoAssignPublicIps) {
    this.autoAssignPublicIps = autoAssignPublicIps;
    return this;
  }

  /**
   * Get autoAssignPublicIps
   * @return autoAssignPublicIps
   */
  @javax.annotation.Nullable
  public Boolean getAutoAssignPublicIps() {
    return autoAssignPublicIps;
  }

  public void setAutoAssignPublicIps(Boolean autoAssignPublicIps) {
    this.autoAssignPublicIps = autoAssignPublicIps;
  }


  public UpdateLayerRequest customRecipes(UpdateLayerRequestCustomRecipes customRecipes) {
    this.customRecipes = customRecipes;
    return this;
  }

  /**
   * Get customRecipes
   * @return customRecipes
   */
  @javax.annotation.Nullable
  public UpdateLayerRequestCustomRecipes getCustomRecipes() {
    return customRecipes;
  }

  public void setCustomRecipes(UpdateLayerRequestCustomRecipes customRecipes) {
    this.customRecipes = customRecipes;
  }


  public UpdateLayerRequest installUpdatesOnBoot(Boolean installUpdatesOnBoot) {
    this.installUpdatesOnBoot = installUpdatesOnBoot;
    return this;
  }

  /**
   * Get installUpdatesOnBoot
   * @return installUpdatesOnBoot
   */
  @javax.annotation.Nullable
  public Boolean getInstallUpdatesOnBoot() {
    return installUpdatesOnBoot;
  }

  public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
    this.installUpdatesOnBoot = installUpdatesOnBoot;
  }


  public UpdateLayerRequest useEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
    this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    return this;
  }

  /**
   * Get useEbsOptimizedInstances
   * @return useEbsOptimizedInstances
   */
  @javax.annotation.Nullable
  public Boolean getUseEbsOptimizedInstances() {
    return useEbsOptimizedInstances;
  }

  public void setUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
    this.useEbsOptimizedInstances = useEbsOptimizedInstances;
  }


  public UpdateLayerRequest lifecycleEventConfiguration(UpdateLayerRequestLifecycleEventConfiguration lifecycleEventConfiguration) {
    this.lifecycleEventConfiguration = lifecycleEventConfiguration;
    return this;
  }

  /**
   * Get lifecycleEventConfiguration
   * @return lifecycleEventConfiguration
   */
  @javax.annotation.Nullable
  public UpdateLayerRequestLifecycleEventConfiguration getLifecycleEventConfiguration() {
    return lifecycleEventConfiguration;
  }

  public void setLifecycleEventConfiguration(UpdateLayerRequestLifecycleEventConfiguration lifecycleEventConfiguration) {
    this.lifecycleEventConfiguration = lifecycleEventConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLayerRequest updateLayerRequest = (UpdateLayerRequest) o;
    return Objects.equals(this.layerId, updateLayerRequest.layerId) &&
        Objects.equals(this.name, updateLayerRequest.name) &&
        Objects.equals(this.shortname, updateLayerRequest.shortname) &&
        Objects.equals(this.attributes, updateLayerRequest.attributes) &&
        Objects.equals(this.cloudWatchLogsConfiguration, updateLayerRequest.cloudWatchLogsConfiguration) &&
        Objects.equals(this.customInstanceProfileArn, updateLayerRequest.customInstanceProfileArn) &&
        Objects.equals(this.customJson, updateLayerRequest.customJson) &&
        Objects.equals(this.customSecurityGroupIds, updateLayerRequest.customSecurityGroupIds) &&
        Objects.equals(this.packages, updateLayerRequest.packages) &&
        Objects.equals(this.volumeConfigurations, updateLayerRequest.volumeConfigurations) &&
        Objects.equals(this.enableAutoHealing, updateLayerRequest.enableAutoHealing) &&
        Objects.equals(this.autoAssignElasticIps, updateLayerRequest.autoAssignElasticIps) &&
        Objects.equals(this.autoAssignPublicIps, updateLayerRequest.autoAssignPublicIps) &&
        Objects.equals(this.customRecipes, updateLayerRequest.customRecipes) &&
        Objects.equals(this.installUpdatesOnBoot, updateLayerRequest.installUpdatesOnBoot) &&
        Objects.equals(this.useEbsOptimizedInstances, updateLayerRequest.useEbsOptimizedInstances) &&
        Objects.equals(this.lifecycleEventConfiguration, updateLayerRequest.lifecycleEventConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerId, name, shortname, attributes, cloudWatchLogsConfiguration, customInstanceProfileArn, customJson, customSecurityGroupIds, packages, volumeConfigurations, enableAutoHealing, autoAssignElasticIps, autoAssignPublicIps, customRecipes, installUpdatesOnBoot, useEbsOptimizedInstances, lifecycleEventConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLayerRequest {\n");
    sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    cloudWatchLogsConfiguration: ").append(toIndentedString(cloudWatchLogsConfiguration)).append("\n");
    sb.append("    customInstanceProfileArn: ").append(toIndentedString(customInstanceProfileArn)).append("\n");
    sb.append("    customJson: ").append(toIndentedString(customJson)).append("\n");
    sb.append("    customSecurityGroupIds: ").append(toIndentedString(customSecurityGroupIds)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    volumeConfigurations: ").append(toIndentedString(volumeConfigurations)).append("\n");
    sb.append("    enableAutoHealing: ").append(toIndentedString(enableAutoHealing)).append("\n");
    sb.append("    autoAssignElasticIps: ").append(toIndentedString(autoAssignElasticIps)).append("\n");
    sb.append("    autoAssignPublicIps: ").append(toIndentedString(autoAssignPublicIps)).append("\n");
    sb.append("    customRecipes: ").append(toIndentedString(customRecipes)).append("\n");
    sb.append("    installUpdatesOnBoot: ").append(toIndentedString(installUpdatesOnBoot)).append("\n");
    sb.append("    useEbsOptimizedInstances: ").append(toIndentedString(useEbsOptimizedInstances)).append("\n");
    sb.append("    lifecycleEventConfiguration: ").append(toIndentedString(lifecycleEventConfiguration)).append("\n");
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
    openapiFields.add("LayerId");
    openapiFields.add("Name");
    openapiFields.add("Shortname");
    openapiFields.add("Attributes");
    openapiFields.add("CloudWatchLogsConfiguration");
    openapiFields.add("CustomInstanceProfileArn");
    openapiFields.add("CustomJson");
    openapiFields.add("CustomSecurityGroupIds");
    openapiFields.add("Packages");
    openapiFields.add("VolumeConfigurations");
    openapiFields.add("EnableAutoHealing");
    openapiFields.add("AutoAssignElasticIps");
    openapiFields.add("AutoAssignPublicIps");
    openapiFields.add("CustomRecipes");
    openapiFields.add("InstallUpdatesOnBoot");
    openapiFields.add("UseEbsOptimizedInstances");
    openapiFields.add("LifecycleEventConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LayerId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLayerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLayerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLayerRequest is not found in the empty JSON string", UpdateLayerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLayerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLayerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateLayerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `LayerId`
      String.validateJsonElement(jsonObj.get("LayerId"));
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Shortname`
      if (jsonObj.get("Shortname") != null && !jsonObj.get("Shortname").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Shortname"));
      }
      // validate the optional field `Attributes`
      if (jsonObj.get("Attributes") != null && !jsonObj.get("Attributes").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Attributes"));
      }
      // validate the optional field `CloudWatchLogsConfiguration`
      if (jsonObj.get("CloudWatchLogsConfiguration") != null && !jsonObj.get("CloudWatchLogsConfiguration").isJsonNull()) {
        CreateLayerRequestCloudWatchLogsConfiguration.validateJsonElement(jsonObj.get("CloudWatchLogsConfiguration"));
      }
      // validate the optional field `CustomInstanceProfileArn`
      if (jsonObj.get("CustomInstanceProfileArn") != null && !jsonObj.get("CustomInstanceProfileArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomInstanceProfileArn"));
      }
      // validate the optional field `CustomJson`
      if (jsonObj.get("CustomJson") != null && !jsonObj.get("CustomJson").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomJson"));
      }
      // validate the optional field `CustomSecurityGroupIds`
      if (jsonObj.get("CustomSecurityGroupIds") != null && !jsonObj.get("CustomSecurityGroupIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("CustomSecurityGroupIds"));
      }
      // validate the optional field `Packages`
      if (jsonObj.get("Packages") != null && !jsonObj.get("Packages").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Packages"));
      }
      // validate the optional field `VolumeConfigurations`
      if (jsonObj.get("VolumeConfigurations") != null && !jsonObj.get("VolumeConfigurations").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("VolumeConfigurations"));
      }
      // validate the optional field `EnableAutoHealing`
      if (jsonObj.get("EnableAutoHealing") != null && !jsonObj.get("EnableAutoHealing").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EnableAutoHealing"));
      }
      // validate the optional field `AutoAssignElasticIps`
      if (jsonObj.get("AutoAssignElasticIps") != null && !jsonObj.get("AutoAssignElasticIps").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoAssignElasticIps"));
      }
      // validate the optional field `AutoAssignPublicIps`
      if (jsonObj.get("AutoAssignPublicIps") != null && !jsonObj.get("AutoAssignPublicIps").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AutoAssignPublicIps"));
      }
      // validate the optional field `CustomRecipes`
      if (jsonObj.get("CustomRecipes") != null && !jsonObj.get("CustomRecipes").isJsonNull()) {
        UpdateLayerRequestCustomRecipes.validateJsonElement(jsonObj.get("CustomRecipes"));
      }
      // validate the optional field `InstallUpdatesOnBoot`
      if (jsonObj.get("InstallUpdatesOnBoot") != null && !jsonObj.get("InstallUpdatesOnBoot").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("InstallUpdatesOnBoot"));
      }
      // validate the optional field `UseEbsOptimizedInstances`
      if (jsonObj.get("UseEbsOptimizedInstances") != null && !jsonObj.get("UseEbsOptimizedInstances").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("UseEbsOptimizedInstances"));
      }
      // validate the optional field `LifecycleEventConfiguration`
      if (jsonObj.get("LifecycleEventConfiguration") != null && !jsonObj.get("LifecycleEventConfiguration").isJsonNull()) {
        UpdateLayerRequestLifecycleEventConfiguration.validateJsonElement(jsonObj.get("LifecycleEventConfiguration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLayerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLayerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLayerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLayerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLayerRequest>() {
           @Override
           public void write(JsonWriter out, UpdateLayerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLayerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateLayerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLayerRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateLayerRequest
   */
  public static UpdateLayerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLayerRequest.class);
  }

  /**
   * Convert an instance of UpdateLayerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

