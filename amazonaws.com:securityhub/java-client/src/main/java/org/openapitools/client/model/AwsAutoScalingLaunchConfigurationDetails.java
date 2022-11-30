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
import java.util.List;
import org.openapitools.client.model.AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring;
import org.openapitools.client.model.AwsAutoScalingLaunchConfigurationDetailsMetadataOptions;

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
 * Details about a launch configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsAutoScalingLaunchConfigurationDetails {
  public static final String SERIALIZED_NAME_ASSOCIATE_PUBLIC_IP_ADDRESS = "AssociatePublicIpAddress";
  @SerializedName(SERIALIZED_NAME_ASSOCIATE_PUBLIC_IP_ADDRESS)
  private Boolean associatePublicIpAddress;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS = "BlockDeviceMappings";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS)
  private List blockDeviceMappings;

  public static final String SERIALIZED_NAME_CLASSIC_LINK_VPC_ID = "ClassicLinkVpcId";
  @SerializedName(SERIALIZED_NAME_CLASSIC_LINK_VPC_ID)
  private String classicLinkVpcId;

  public static final String SERIALIZED_NAME_CLASSIC_LINK_VPC_SECURITY_GROUPS = "ClassicLinkVpcSecurityGroups";
  @SerializedName(SERIALIZED_NAME_CLASSIC_LINK_VPC_SECURITY_GROUPS)
  private List classicLinkVpcSecurityGroups;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_EBS_OPTIMIZED = "EbsOptimized";
  @SerializedName(SERIALIZED_NAME_EBS_OPTIMIZED)
  private Boolean ebsOptimized;

  public static final String SERIALIZED_NAME_IAM_INSTANCE_PROFILE = "IamInstanceProfile";
  @SerializedName(SERIALIZED_NAME_IAM_INSTANCE_PROFILE)
  private String iamInstanceProfile;

  public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_INSTANCE_MONITORING = "InstanceMonitoring";
  @SerializedName(SERIALIZED_NAME_INSTANCE_MONITORING)
  private AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring instanceMonitoring;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "InstanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_KERNEL_ID = "KernelId";
  @SerializedName(SERIALIZED_NAME_KERNEL_ID)
  private String kernelId;

  public static final String SERIALIZED_NAME_KEY_NAME = "KeyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_LAUNCH_CONFIGURATION_NAME = "LaunchConfigurationName";
  @SerializedName(SERIALIZED_NAME_LAUNCH_CONFIGURATION_NAME)
  private String launchConfigurationName;

  public static final String SERIALIZED_NAME_PLACEMENT_TENANCY = "PlacementTenancy";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_TENANCY)
  private String placementTenancy;

  public static final String SERIALIZED_NAME_RAMDISK_ID = "RamdiskId";
  @SerializedName(SERIALIZED_NAME_RAMDISK_ID)
  private String ramdiskId;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "SecurityGroups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List securityGroups;

  public static final String SERIALIZED_NAME_SPOT_PRICE = "SpotPrice";
  @SerializedName(SERIALIZED_NAME_SPOT_PRICE)
  private String spotPrice;

  public static final String SERIALIZED_NAME_USER_DATA = "UserData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public static final String SERIALIZED_NAME_METADATA_OPTIONS = "MetadataOptions";
  @SerializedName(SERIALIZED_NAME_METADATA_OPTIONS)
  private AwsAutoScalingLaunchConfigurationDetailsMetadataOptions metadataOptions;

  public AwsAutoScalingLaunchConfigurationDetails() {
  }

  public AwsAutoScalingLaunchConfigurationDetails associatePublicIpAddress(Boolean associatePublicIpAddress) {
    this.associatePublicIpAddress = associatePublicIpAddress;
    return this;
  }

  /**
   * Get associatePublicIpAddress
   * @return associatePublicIpAddress
   */
  @javax.annotation.Nullable
  public Boolean getAssociatePublicIpAddress() {
    return associatePublicIpAddress;
  }

  public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
    this.associatePublicIpAddress = associatePublicIpAddress;
  }


  public AwsAutoScalingLaunchConfigurationDetails blockDeviceMappings(List blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
    return this;
  }

  /**
   * Get blockDeviceMappings
   * @return blockDeviceMappings
   */
  @javax.annotation.Nullable
  public List getBlockDeviceMappings() {
    return blockDeviceMappings;
  }

  public void setBlockDeviceMappings(List blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
  }


  public AwsAutoScalingLaunchConfigurationDetails classicLinkVpcId(String classicLinkVpcId) {
    this.classicLinkVpcId = classicLinkVpcId;
    return this;
  }

  /**
   * Get classicLinkVpcId
   * @return classicLinkVpcId
   */
  @javax.annotation.Nullable
  public String getClassicLinkVpcId() {
    return classicLinkVpcId;
  }

  public void setClassicLinkVpcId(String classicLinkVpcId) {
    this.classicLinkVpcId = classicLinkVpcId;
  }


  public AwsAutoScalingLaunchConfigurationDetails classicLinkVpcSecurityGroups(List classicLinkVpcSecurityGroups) {
    this.classicLinkVpcSecurityGroups = classicLinkVpcSecurityGroups;
    return this;
  }

  /**
   * Get classicLinkVpcSecurityGroups
   * @return classicLinkVpcSecurityGroups
   */
  @javax.annotation.Nullable
  public List getClassicLinkVpcSecurityGroups() {
    return classicLinkVpcSecurityGroups;
  }

  public void setClassicLinkVpcSecurityGroups(List classicLinkVpcSecurityGroups) {
    this.classicLinkVpcSecurityGroups = classicLinkVpcSecurityGroups;
  }


  public AwsAutoScalingLaunchConfigurationDetails createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  public AwsAutoScalingLaunchConfigurationDetails ebsOptimized(Boolean ebsOptimized) {
    this.ebsOptimized = ebsOptimized;
    return this;
  }

  /**
   * Get ebsOptimized
   * @return ebsOptimized
   */
  @javax.annotation.Nullable
  public Boolean getEbsOptimized() {
    return ebsOptimized;
  }

  public void setEbsOptimized(Boolean ebsOptimized) {
    this.ebsOptimized = ebsOptimized;
  }


  public AwsAutoScalingLaunchConfigurationDetails iamInstanceProfile(String iamInstanceProfile) {
    this.iamInstanceProfile = iamInstanceProfile;
    return this;
  }

  /**
   * Get iamInstanceProfile
   * @return iamInstanceProfile
   */
  @javax.annotation.Nullable
  public String getIamInstanceProfile() {
    return iamInstanceProfile;
  }

  public void setIamInstanceProfile(String iamInstanceProfile) {
    this.iamInstanceProfile = iamInstanceProfile;
  }


  public AwsAutoScalingLaunchConfigurationDetails imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   * @return imageId
   */
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public AwsAutoScalingLaunchConfigurationDetails instanceMonitoring(AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring instanceMonitoring) {
    this.instanceMonitoring = instanceMonitoring;
    return this;
  }

  /**
   * Get instanceMonitoring
   * @return instanceMonitoring
   */
  @javax.annotation.Nullable
  public AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring getInstanceMonitoring() {
    return instanceMonitoring;
  }

  public void setInstanceMonitoring(AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring instanceMonitoring) {
    this.instanceMonitoring = instanceMonitoring;
  }


  public AwsAutoScalingLaunchConfigurationDetails instanceType(String instanceType) {
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


  public AwsAutoScalingLaunchConfigurationDetails kernelId(String kernelId) {
    this.kernelId = kernelId;
    return this;
  }

  /**
   * Get kernelId
   * @return kernelId
   */
  @javax.annotation.Nullable
  public String getKernelId() {
    return kernelId;
  }

  public void setKernelId(String kernelId) {
    this.kernelId = kernelId;
  }


  public AwsAutoScalingLaunchConfigurationDetails keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Get keyName
   * @return keyName
   */
  @javax.annotation.Nullable
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public AwsAutoScalingLaunchConfigurationDetails launchConfigurationName(String launchConfigurationName) {
    this.launchConfigurationName = launchConfigurationName;
    return this;
  }

  /**
   * Get launchConfigurationName
   * @return launchConfigurationName
   */
  @javax.annotation.Nullable
  public String getLaunchConfigurationName() {
    return launchConfigurationName;
  }

  public void setLaunchConfigurationName(String launchConfigurationName) {
    this.launchConfigurationName = launchConfigurationName;
  }


  public AwsAutoScalingLaunchConfigurationDetails placementTenancy(String placementTenancy) {
    this.placementTenancy = placementTenancy;
    return this;
  }

  /**
   * Get placementTenancy
   * @return placementTenancy
   */
  @javax.annotation.Nullable
  public String getPlacementTenancy() {
    return placementTenancy;
  }

  public void setPlacementTenancy(String placementTenancy) {
    this.placementTenancy = placementTenancy;
  }


  public AwsAutoScalingLaunchConfigurationDetails ramdiskId(String ramdiskId) {
    this.ramdiskId = ramdiskId;
    return this;
  }

  /**
   * Get ramdiskId
   * @return ramdiskId
   */
  @javax.annotation.Nullable
  public String getRamdiskId() {
    return ramdiskId;
  }

  public void setRamdiskId(String ramdiskId) {
    this.ramdiskId = ramdiskId;
  }


  public AwsAutoScalingLaunchConfigurationDetails securityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  /**
   * Get securityGroups
   * @return securityGroups
   */
  @javax.annotation.Nullable
  public List getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
  }


  public AwsAutoScalingLaunchConfigurationDetails spotPrice(String spotPrice) {
    this.spotPrice = spotPrice;
    return this;
  }

  /**
   * Get spotPrice
   * @return spotPrice
   */
  @javax.annotation.Nullable
  public String getSpotPrice() {
    return spotPrice;
  }

  public void setSpotPrice(String spotPrice) {
    this.spotPrice = spotPrice;
  }


  public AwsAutoScalingLaunchConfigurationDetails userData(String userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Get userData
   * @return userData
   */
  @javax.annotation.Nullable
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }


  public AwsAutoScalingLaunchConfigurationDetails metadataOptions(AwsAutoScalingLaunchConfigurationDetailsMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * Get metadataOptions
   * @return metadataOptions
   */
  @javax.annotation.Nullable
  public AwsAutoScalingLaunchConfigurationDetailsMetadataOptions getMetadataOptions() {
    return metadataOptions;
  }

  public void setMetadataOptions(AwsAutoScalingLaunchConfigurationDetailsMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfigurationDetails = (AwsAutoScalingLaunchConfigurationDetails) o;
    return Objects.equals(this.associatePublicIpAddress, awsAutoScalingLaunchConfigurationDetails.associatePublicIpAddress) &&
        Objects.equals(this.blockDeviceMappings, awsAutoScalingLaunchConfigurationDetails.blockDeviceMappings) &&
        Objects.equals(this.classicLinkVpcId, awsAutoScalingLaunchConfigurationDetails.classicLinkVpcId) &&
        Objects.equals(this.classicLinkVpcSecurityGroups, awsAutoScalingLaunchConfigurationDetails.classicLinkVpcSecurityGroups) &&
        Objects.equals(this.createdTime, awsAutoScalingLaunchConfigurationDetails.createdTime) &&
        Objects.equals(this.ebsOptimized, awsAutoScalingLaunchConfigurationDetails.ebsOptimized) &&
        Objects.equals(this.iamInstanceProfile, awsAutoScalingLaunchConfigurationDetails.iamInstanceProfile) &&
        Objects.equals(this.imageId, awsAutoScalingLaunchConfigurationDetails.imageId) &&
        Objects.equals(this.instanceMonitoring, awsAutoScalingLaunchConfigurationDetails.instanceMonitoring) &&
        Objects.equals(this.instanceType, awsAutoScalingLaunchConfigurationDetails.instanceType) &&
        Objects.equals(this.kernelId, awsAutoScalingLaunchConfigurationDetails.kernelId) &&
        Objects.equals(this.keyName, awsAutoScalingLaunchConfigurationDetails.keyName) &&
        Objects.equals(this.launchConfigurationName, awsAutoScalingLaunchConfigurationDetails.launchConfigurationName) &&
        Objects.equals(this.placementTenancy, awsAutoScalingLaunchConfigurationDetails.placementTenancy) &&
        Objects.equals(this.ramdiskId, awsAutoScalingLaunchConfigurationDetails.ramdiskId) &&
        Objects.equals(this.securityGroups, awsAutoScalingLaunchConfigurationDetails.securityGroups) &&
        Objects.equals(this.spotPrice, awsAutoScalingLaunchConfigurationDetails.spotPrice) &&
        Objects.equals(this.userData, awsAutoScalingLaunchConfigurationDetails.userData) &&
        Objects.equals(this.metadataOptions, awsAutoScalingLaunchConfigurationDetails.metadataOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatePublicIpAddress, blockDeviceMappings, classicLinkVpcId, classicLinkVpcSecurityGroups, createdTime, ebsOptimized, iamInstanceProfile, imageId, instanceMonitoring, instanceType, kernelId, keyName, launchConfigurationName, placementTenancy, ramdiskId, securityGroups, spotPrice, userData, metadataOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAutoScalingLaunchConfigurationDetails {\n");
    sb.append("    associatePublicIpAddress: ").append(toIndentedString(associatePublicIpAddress)).append("\n");
    sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
    sb.append("    classicLinkVpcId: ").append(toIndentedString(classicLinkVpcId)).append("\n");
    sb.append("    classicLinkVpcSecurityGroups: ").append(toIndentedString(classicLinkVpcSecurityGroups)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    ebsOptimized: ").append(toIndentedString(ebsOptimized)).append("\n");
    sb.append("    iamInstanceProfile: ").append(toIndentedString(iamInstanceProfile)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceMonitoring: ").append(toIndentedString(instanceMonitoring)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    kernelId: ").append(toIndentedString(kernelId)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
    sb.append("    placementTenancy: ").append(toIndentedString(placementTenancy)).append("\n");
    sb.append("    ramdiskId: ").append(toIndentedString(ramdiskId)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
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
    openapiFields.add("AssociatePublicIpAddress");
    openapiFields.add("BlockDeviceMappings");
    openapiFields.add("ClassicLinkVpcId");
    openapiFields.add("ClassicLinkVpcSecurityGroups");
    openapiFields.add("CreatedTime");
    openapiFields.add("EbsOptimized");
    openapiFields.add("IamInstanceProfile");
    openapiFields.add("ImageId");
    openapiFields.add("InstanceMonitoring");
    openapiFields.add("InstanceType");
    openapiFields.add("KernelId");
    openapiFields.add("KeyName");
    openapiFields.add("LaunchConfigurationName");
    openapiFields.add("PlacementTenancy");
    openapiFields.add("RamdiskId");
    openapiFields.add("SecurityGroups");
    openapiFields.add("SpotPrice");
    openapiFields.add("UserData");
    openapiFields.add("MetadataOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsAutoScalingLaunchConfigurationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsAutoScalingLaunchConfigurationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsAutoScalingLaunchConfigurationDetails is not found in the empty JSON string", AwsAutoScalingLaunchConfigurationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsAutoScalingLaunchConfigurationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsAutoScalingLaunchConfigurationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AssociatePublicIpAddress`
      if (jsonObj.get("AssociatePublicIpAddress") != null && !jsonObj.get("AssociatePublicIpAddress").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AssociatePublicIpAddress"));
      }
      // validate the optional field `BlockDeviceMappings`
      if (jsonObj.get("BlockDeviceMappings") != null && !jsonObj.get("BlockDeviceMappings").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("BlockDeviceMappings"));
      }
      // validate the optional field `ClassicLinkVpcId`
      if (jsonObj.get("ClassicLinkVpcId") != null && !jsonObj.get("ClassicLinkVpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ClassicLinkVpcId"));
      }
      // validate the optional field `ClassicLinkVpcSecurityGroups`
      if (jsonObj.get("ClassicLinkVpcSecurityGroups") != null && !jsonObj.get("ClassicLinkVpcSecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ClassicLinkVpcSecurityGroups"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `EbsOptimized`
      if (jsonObj.get("EbsOptimized") != null && !jsonObj.get("EbsOptimized").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("EbsOptimized"));
      }
      // validate the optional field `IamInstanceProfile`
      if (jsonObj.get("IamInstanceProfile") != null && !jsonObj.get("IamInstanceProfile").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IamInstanceProfile"));
      }
      // validate the optional field `ImageId`
      if (jsonObj.get("ImageId") != null && !jsonObj.get("ImageId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImageId"));
      }
      // validate the optional field `InstanceMonitoring`
      if (jsonObj.get("InstanceMonitoring") != null && !jsonObj.get("InstanceMonitoring").isJsonNull()) {
        AwsAutoScalingLaunchConfigurationDetailsInstanceMonitoring.validateJsonElement(jsonObj.get("InstanceMonitoring"));
      }
      // validate the optional field `InstanceType`
      if (jsonObj.get("InstanceType") != null && !jsonObj.get("InstanceType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceType"));
      }
      // validate the optional field `KernelId`
      if (jsonObj.get("KernelId") != null && !jsonObj.get("KernelId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KernelId"));
      }
      // validate the optional field `KeyName`
      if (jsonObj.get("KeyName") != null && !jsonObj.get("KeyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyName"));
      }
      // validate the optional field `LaunchConfigurationName`
      if (jsonObj.get("LaunchConfigurationName") != null && !jsonObj.get("LaunchConfigurationName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchConfigurationName"));
      }
      // validate the optional field `PlacementTenancy`
      if (jsonObj.get("PlacementTenancy") != null && !jsonObj.get("PlacementTenancy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PlacementTenancy"));
      }
      // validate the optional field `RamdiskId`
      if (jsonObj.get("RamdiskId") != null && !jsonObj.get("RamdiskId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RamdiskId"));
      }
      // validate the optional field `SecurityGroups`
      if (jsonObj.get("SecurityGroups") != null && !jsonObj.get("SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroups"));
      }
      // validate the optional field `SpotPrice`
      if (jsonObj.get("SpotPrice") != null && !jsonObj.get("SpotPrice").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SpotPrice"));
      }
      // validate the optional field `UserData`
      if (jsonObj.get("UserData") != null && !jsonObj.get("UserData").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UserData"));
      }
      // validate the optional field `MetadataOptions`
      if (jsonObj.get("MetadataOptions") != null && !jsonObj.get("MetadataOptions").isJsonNull()) {
        AwsAutoScalingLaunchConfigurationDetailsMetadataOptions.validateJsonElement(jsonObj.get("MetadataOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsAutoScalingLaunchConfigurationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsAutoScalingLaunchConfigurationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsAutoScalingLaunchConfigurationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsAutoScalingLaunchConfigurationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsAutoScalingLaunchConfigurationDetails>() {
           @Override
           public void write(JsonWriter out, AwsAutoScalingLaunchConfigurationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsAutoScalingLaunchConfigurationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsAutoScalingLaunchConfigurationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsAutoScalingLaunchConfigurationDetails
   * @throws IOException if the JSON string is invalid with respect to AwsAutoScalingLaunchConfigurationDetails
   */
  public static AwsAutoScalingLaunchConfigurationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsAutoScalingLaunchConfigurationDetails.class);
  }

  /**
   * Convert an instance of AwsAutoScalingLaunchConfigurationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

