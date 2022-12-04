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
import java.util.Map;
import org.openapitools.client.model.CloneStackRequestChefConfiguration;
import org.openapitools.client.model.CloneStackRequestCustomCookbooksSource;
import org.openapitools.client.model.CreateStackRequestConfigurationManager;
import org.openapitools.client.model.RootDeviceType;

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
 * CreateStackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:31.623912-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateStackRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map attributes;

  public static final String SERIALIZED_NAME_SERVICE_ROLE_ARN = "ServiceRoleArn";
  @SerializedName(SERIALIZED_NAME_SERVICE_ROLE_ARN)
  private String serviceRoleArn;

  public static final String SERIALIZED_NAME_DEFAULT_INSTANCE_PROFILE_ARN = "DefaultInstanceProfileArn";
  @SerializedName(SERIALIZED_NAME_DEFAULT_INSTANCE_PROFILE_ARN)
  private String defaultInstanceProfileArn;

  public static final String SERIALIZED_NAME_DEFAULT_OS = "DefaultOs";
  @SerializedName(SERIALIZED_NAME_DEFAULT_OS)
  private String defaultOs;

  public static final String SERIALIZED_NAME_HOSTNAME_THEME = "HostnameTheme";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_THEME)
  private String hostnameTheme;

  public static final String SERIALIZED_NAME_DEFAULT_AVAILABILITY_ZONE = "DefaultAvailabilityZone";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AVAILABILITY_ZONE)
  private String defaultAvailabilityZone;

  public static final String SERIALIZED_NAME_DEFAULT_SUBNET_ID = "DefaultSubnetId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SUBNET_ID)
  private String defaultSubnetId;

  public static final String SERIALIZED_NAME_CUSTOM_JSON = "CustomJson";
  @SerializedName(SERIALIZED_NAME_CUSTOM_JSON)
  private String customJson;

  public static final String SERIALIZED_NAME_CONFIGURATION_MANAGER = "ConfigurationManager";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_MANAGER)
  private CreateStackRequestConfigurationManager configurationManager;

  public static final String SERIALIZED_NAME_CHEF_CONFIGURATION = "ChefConfiguration";
  @SerializedName(SERIALIZED_NAME_CHEF_CONFIGURATION)
  private CloneStackRequestChefConfiguration chefConfiguration;

  public static final String SERIALIZED_NAME_USE_CUSTOM_COOKBOOKS = "UseCustomCookbooks";
  @SerializedName(SERIALIZED_NAME_USE_CUSTOM_COOKBOOKS)
  private Boolean useCustomCookbooks;

  public static final String SERIALIZED_NAME_USE_OPSWORKS_SECURITY_GROUPS = "UseOpsworksSecurityGroups";
  @SerializedName(SERIALIZED_NAME_USE_OPSWORKS_SECURITY_GROUPS)
  private Boolean useOpsworksSecurityGroups;

  public static final String SERIALIZED_NAME_CUSTOM_COOKBOOKS_SOURCE = "CustomCookbooksSource";
  @SerializedName(SERIALIZED_NAME_CUSTOM_COOKBOOKS_SOURCE)
  private CloneStackRequestCustomCookbooksSource customCookbooksSource;

  public static final String SERIALIZED_NAME_DEFAULT_SSH_KEY_NAME = "DefaultSshKeyName";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SSH_KEY_NAME)
  private String defaultSshKeyName;

  public static final String SERIALIZED_NAME_DEFAULT_ROOT_DEVICE_TYPE = "DefaultRootDeviceType";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROOT_DEVICE_TYPE)
  private RootDeviceType defaultRootDeviceType;

  public static final String SERIALIZED_NAME_AGENT_VERSION = "AgentVersion";
  @SerializedName(SERIALIZED_NAME_AGENT_VERSION)
  private String agentVersion;

  public CreateStackRequest() {
  }

  public CreateStackRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateStackRequest region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public CreateStackRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public CreateStackRequest attributes(Map attributes) {
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


  public CreateStackRequest serviceRoleArn(String serviceRoleArn) {
    this.serviceRoleArn = serviceRoleArn;
    return this;
  }

  /**
   * Get serviceRoleArn
   * @return serviceRoleArn
   */
  @javax.annotation.Nonnull
  public String getServiceRoleArn() {
    return serviceRoleArn;
  }

  public void setServiceRoleArn(String serviceRoleArn) {
    this.serviceRoleArn = serviceRoleArn;
  }


  public CreateStackRequest defaultInstanceProfileArn(String defaultInstanceProfileArn) {
    this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    return this;
  }

  /**
   * Get defaultInstanceProfileArn
   * @return defaultInstanceProfileArn
   */
  @javax.annotation.Nonnull
  public String getDefaultInstanceProfileArn() {
    return defaultInstanceProfileArn;
  }

  public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
    this.defaultInstanceProfileArn = defaultInstanceProfileArn;
  }


  public CreateStackRequest defaultOs(String defaultOs) {
    this.defaultOs = defaultOs;
    return this;
  }

  /**
   * Get defaultOs
   * @return defaultOs
   */
  @javax.annotation.Nullable
  public String getDefaultOs() {
    return defaultOs;
  }

  public void setDefaultOs(String defaultOs) {
    this.defaultOs = defaultOs;
  }


  public CreateStackRequest hostnameTheme(String hostnameTheme) {
    this.hostnameTheme = hostnameTheme;
    return this;
  }

  /**
   * Get hostnameTheme
   * @return hostnameTheme
   */
  @javax.annotation.Nullable
  public String getHostnameTheme() {
    return hostnameTheme;
  }

  public void setHostnameTheme(String hostnameTheme) {
    this.hostnameTheme = hostnameTheme;
  }


  public CreateStackRequest defaultAvailabilityZone(String defaultAvailabilityZone) {
    this.defaultAvailabilityZone = defaultAvailabilityZone;
    return this;
  }

  /**
   * Get defaultAvailabilityZone
   * @return defaultAvailabilityZone
   */
  @javax.annotation.Nullable
  public String getDefaultAvailabilityZone() {
    return defaultAvailabilityZone;
  }

  public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
    this.defaultAvailabilityZone = defaultAvailabilityZone;
  }


  public CreateStackRequest defaultSubnetId(String defaultSubnetId) {
    this.defaultSubnetId = defaultSubnetId;
    return this;
  }

  /**
   * Get defaultSubnetId
   * @return defaultSubnetId
   */
  @javax.annotation.Nullable
  public String getDefaultSubnetId() {
    return defaultSubnetId;
  }

  public void setDefaultSubnetId(String defaultSubnetId) {
    this.defaultSubnetId = defaultSubnetId;
  }


  public CreateStackRequest customJson(String customJson) {
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


  public CreateStackRequest configurationManager(CreateStackRequestConfigurationManager configurationManager) {
    this.configurationManager = configurationManager;
    return this;
  }

  /**
   * Get configurationManager
   * @return configurationManager
   */
  @javax.annotation.Nullable
  public CreateStackRequestConfigurationManager getConfigurationManager() {
    return configurationManager;
  }

  public void setConfigurationManager(CreateStackRequestConfigurationManager configurationManager) {
    this.configurationManager = configurationManager;
  }


  public CreateStackRequest chefConfiguration(CloneStackRequestChefConfiguration chefConfiguration) {
    this.chefConfiguration = chefConfiguration;
    return this;
  }

  /**
   * Get chefConfiguration
   * @return chefConfiguration
   */
  @javax.annotation.Nullable
  public CloneStackRequestChefConfiguration getChefConfiguration() {
    return chefConfiguration;
  }

  public void setChefConfiguration(CloneStackRequestChefConfiguration chefConfiguration) {
    this.chefConfiguration = chefConfiguration;
  }


  public CreateStackRequest useCustomCookbooks(Boolean useCustomCookbooks) {
    this.useCustomCookbooks = useCustomCookbooks;
    return this;
  }

  /**
   * Get useCustomCookbooks
   * @return useCustomCookbooks
   */
  @javax.annotation.Nullable
  public Boolean getUseCustomCookbooks() {
    return useCustomCookbooks;
  }

  public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
    this.useCustomCookbooks = useCustomCookbooks;
  }


  public CreateStackRequest useOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
    this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    return this;
  }

  /**
   * Get useOpsworksSecurityGroups
   * @return useOpsworksSecurityGroups
   */
  @javax.annotation.Nullable
  public Boolean getUseOpsworksSecurityGroups() {
    return useOpsworksSecurityGroups;
  }

  public void setUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
    this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
  }


  public CreateStackRequest customCookbooksSource(CloneStackRequestCustomCookbooksSource customCookbooksSource) {
    this.customCookbooksSource = customCookbooksSource;
    return this;
  }

  /**
   * Get customCookbooksSource
   * @return customCookbooksSource
   */
  @javax.annotation.Nullable
  public CloneStackRequestCustomCookbooksSource getCustomCookbooksSource() {
    return customCookbooksSource;
  }

  public void setCustomCookbooksSource(CloneStackRequestCustomCookbooksSource customCookbooksSource) {
    this.customCookbooksSource = customCookbooksSource;
  }


  public CreateStackRequest defaultSshKeyName(String defaultSshKeyName) {
    this.defaultSshKeyName = defaultSshKeyName;
    return this;
  }

  /**
   * Get defaultSshKeyName
   * @return defaultSshKeyName
   */
  @javax.annotation.Nullable
  public String getDefaultSshKeyName() {
    return defaultSshKeyName;
  }

  public void setDefaultSshKeyName(String defaultSshKeyName) {
    this.defaultSshKeyName = defaultSshKeyName;
  }


  public CreateStackRequest defaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
    this.defaultRootDeviceType = defaultRootDeviceType;
    return this;
  }

  /**
   * Get defaultRootDeviceType
   * @return defaultRootDeviceType
   */
  @javax.annotation.Nullable
  public RootDeviceType getDefaultRootDeviceType() {
    return defaultRootDeviceType;
  }

  public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
    this.defaultRootDeviceType = defaultRootDeviceType;
  }


  public CreateStackRequest agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Get agentVersion
   * @return agentVersion
   */
  @javax.annotation.Nullable
  public String getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStackRequest createStackRequest = (CreateStackRequest) o;
    return Objects.equals(this.name, createStackRequest.name) &&
        Objects.equals(this.region, createStackRequest.region) &&
        Objects.equals(this.vpcId, createStackRequest.vpcId) &&
        Objects.equals(this.attributes, createStackRequest.attributes) &&
        Objects.equals(this.serviceRoleArn, createStackRequest.serviceRoleArn) &&
        Objects.equals(this.defaultInstanceProfileArn, createStackRequest.defaultInstanceProfileArn) &&
        Objects.equals(this.defaultOs, createStackRequest.defaultOs) &&
        Objects.equals(this.hostnameTheme, createStackRequest.hostnameTheme) &&
        Objects.equals(this.defaultAvailabilityZone, createStackRequest.defaultAvailabilityZone) &&
        Objects.equals(this.defaultSubnetId, createStackRequest.defaultSubnetId) &&
        Objects.equals(this.customJson, createStackRequest.customJson) &&
        Objects.equals(this.configurationManager, createStackRequest.configurationManager) &&
        Objects.equals(this.chefConfiguration, createStackRequest.chefConfiguration) &&
        Objects.equals(this.useCustomCookbooks, createStackRequest.useCustomCookbooks) &&
        Objects.equals(this.useOpsworksSecurityGroups, createStackRequest.useOpsworksSecurityGroups) &&
        Objects.equals(this.customCookbooksSource, createStackRequest.customCookbooksSource) &&
        Objects.equals(this.defaultSshKeyName, createStackRequest.defaultSshKeyName) &&
        Objects.equals(this.defaultRootDeviceType, createStackRequest.defaultRootDeviceType) &&
        Objects.equals(this.agentVersion, createStackRequest.agentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, vpcId, attributes, serviceRoleArn, defaultInstanceProfileArn, defaultOs, hostnameTheme, defaultAvailabilityZone, defaultSubnetId, customJson, configurationManager, chefConfiguration, useCustomCookbooks, useOpsworksSecurityGroups, customCookbooksSource, defaultSshKeyName, defaultRootDeviceType, agentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStackRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    serviceRoleArn: ").append(toIndentedString(serviceRoleArn)).append("\n");
    sb.append("    defaultInstanceProfileArn: ").append(toIndentedString(defaultInstanceProfileArn)).append("\n");
    sb.append("    defaultOs: ").append(toIndentedString(defaultOs)).append("\n");
    sb.append("    hostnameTheme: ").append(toIndentedString(hostnameTheme)).append("\n");
    sb.append("    defaultAvailabilityZone: ").append(toIndentedString(defaultAvailabilityZone)).append("\n");
    sb.append("    defaultSubnetId: ").append(toIndentedString(defaultSubnetId)).append("\n");
    sb.append("    customJson: ").append(toIndentedString(customJson)).append("\n");
    sb.append("    configurationManager: ").append(toIndentedString(configurationManager)).append("\n");
    sb.append("    chefConfiguration: ").append(toIndentedString(chefConfiguration)).append("\n");
    sb.append("    useCustomCookbooks: ").append(toIndentedString(useCustomCookbooks)).append("\n");
    sb.append("    useOpsworksSecurityGroups: ").append(toIndentedString(useOpsworksSecurityGroups)).append("\n");
    sb.append("    customCookbooksSource: ").append(toIndentedString(customCookbooksSource)).append("\n");
    sb.append("    defaultSshKeyName: ").append(toIndentedString(defaultSshKeyName)).append("\n");
    sb.append("    defaultRootDeviceType: ").append(toIndentedString(defaultRootDeviceType)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Region");
    openapiFields.add("VpcId");
    openapiFields.add("Attributes");
    openapiFields.add("ServiceRoleArn");
    openapiFields.add("DefaultInstanceProfileArn");
    openapiFields.add("DefaultOs");
    openapiFields.add("HostnameTheme");
    openapiFields.add("DefaultAvailabilityZone");
    openapiFields.add("DefaultSubnetId");
    openapiFields.add("CustomJson");
    openapiFields.add("ConfigurationManager");
    openapiFields.add("ChefConfiguration");
    openapiFields.add("UseCustomCookbooks");
    openapiFields.add("UseOpsworksSecurityGroups");
    openapiFields.add("CustomCookbooksSource");
    openapiFields.add("DefaultSshKeyName");
    openapiFields.add("DefaultRootDeviceType");
    openapiFields.add("AgentVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Region");
    openapiRequiredFields.add("ServiceRoleArn");
    openapiRequiredFields.add("DefaultInstanceProfileArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateStackRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateStackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateStackRequest is not found in the empty JSON string", CreateStackRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateStackRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateStackRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateStackRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the required field `Region`
      String.validateJsonElement(jsonObj.get("Region"));
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `Attributes`
      if (jsonObj.get("Attributes") != null && !jsonObj.get("Attributes").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Attributes"));
      }
      // validate the required field `ServiceRoleArn`
      String.validateJsonElement(jsonObj.get("ServiceRoleArn"));
      // validate the required field `DefaultInstanceProfileArn`
      String.validateJsonElement(jsonObj.get("DefaultInstanceProfileArn"));
      // validate the optional field `DefaultOs`
      if (jsonObj.get("DefaultOs") != null && !jsonObj.get("DefaultOs").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultOs"));
      }
      // validate the optional field `HostnameTheme`
      if (jsonObj.get("HostnameTheme") != null && !jsonObj.get("HostnameTheme").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HostnameTheme"));
      }
      // validate the optional field `DefaultAvailabilityZone`
      if (jsonObj.get("DefaultAvailabilityZone") != null && !jsonObj.get("DefaultAvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultAvailabilityZone"));
      }
      // validate the optional field `DefaultSubnetId`
      if (jsonObj.get("DefaultSubnetId") != null && !jsonObj.get("DefaultSubnetId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultSubnetId"));
      }
      // validate the optional field `CustomJson`
      if (jsonObj.get("CustomJson") != null && !jsonObj.get("CustomJson").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CustomJson"));
      }
      // validate the optional field `ConfigurationManager`
      if (jsonObj.get("ConfigurationManager") != null && !jsonObj.get("ConfigurationManager").isJsonNull()) {
        CreateStackRequestConfigurationManager.validateJsonElement(jsonObj.get("ConfigurationManager"));
      }
      // validate the optional field `ChefConfiguration`
      if (jsonObj.get("ChefConfiguration") != null && !jsonObj.get("ChefConfiguration").isJsonNull()) {
        CloneStackRequestChefConfiguration.validateJsonElement(jsonObj.get("ChefConfiguration"));
      }
      // validate the optional field `UseCustomCookbooks`
      if (jsonObj.get("UseCustomCookbooks") != null && !jsonObj.get("UseCustomCookbooks").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("UseCustomCookbooks"));
      }
      // validate the optional field `UseOpsworksSecurityGroups`
      if (jsonObj.get("UseOpsworksSecurityGroups") != null && !jsonObj.get("UseOpsworksSecurityGroups").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("UseOpsworksSecurityGroups"));
      }
      // validate the optional field `CustomCookbooksSource`
      if (jsonObj.get("CustomCookbooksSource") != null && !jsonObj.get("CustomCookbooksSource").isJsonNull()) {
        CloneStackRequestCustomCookbooksSource.validateJsonElement(jsonObj.get("CustomCookbooksSource"));
      }
      // validate the optional field `DefaultSshKeyName`
      if (jsonObj.get("DefaultSshKeyName") != null && !jsonObj.get("DefaultSshKeyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DefaultSshKeyName"));
      }
      // validate the optional field `DefaultRootDeviceType`
      if (jsonObj.get("DefaultRootDeviceType") != null && !jsonObj.get("DefaultRootDeviceType").isJsonNull()) {
        RootDeviceType.validateJsonElement(jsonObj.get("DefaultRootDeviceType"));
      }
      // validate the optional field `AgentVersion`
      if (jsonObj.get("AgentVersion") != null && !jsonObj.get("AgentVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AgentVersion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStackRequest>() {
           @Override
           public void write(JsonWriter out, CreateStackRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStackRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateStackRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateStackRequest
   * @throws IOException if the JSON string is invalid with respect to CreateStackRequest
   */
  public static CreateStackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStackRequest.class);
  }

  /**
   * Convert an instance of CreateStackRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

