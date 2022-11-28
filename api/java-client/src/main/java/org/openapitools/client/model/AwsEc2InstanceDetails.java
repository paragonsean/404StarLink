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
import org.openapitools.client.model.AwsEc2InstanceDetailsMetadataOptions;
import org.openapitools.client.model.AwsEc2InstanceDetailsMonitoring;

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
 * The details of an Amazon EC2 instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2InstanceDetails {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_IP_V4_ADDRESSES = "IpV4Addresses";
  @SerializedName(SERIALIZED_NAME_IP_V4_ADDRESSES)
  private List ipV4Addresses;

  public static final String SERIALIZED_NAME_IP_V6_ADDRESSES = "IpV6Addresses";
  @SerializedName(SERIALIZED_NAME_IP_V6_ADDRESSES)
  private List ipV6Addresses;

  public static final String SERIALIZED_NAME_KEY_NAME = "KeyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_IAM_INSTANCE_PROFILE_ARN = "IamInstanceProfileArn";
  @SerializedName(SERIALIZED_NAME_IAM_INSTANCE_PROFILE_ARN)
  private String iamInstanceProfileArn;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";
  @SerializedName(SERIALIZED_NAME_SUBNET_ID)
  private String subnetId;

  public static final String SERIALIZED_NAME_LAUNCHED_AT = "LaunchedAt";
  @SerializedName(SERIALIZED_NAME_LAUNCHED_AT)
  private String launchedAt;

  public static final String SERIALIZED_NAME_NETWORK_INTERFACES = "NetworkInterfaces";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACES)
  private List networkInterfaces;

  public static final String SERIALIZED_NAME_VIRTUALIZATION_TYPE = "VirtualizationType";
  @SerializedName(SERIALIZED_NAME_VIRTUALIZATION_TYPE)
  private String virtualizationType;

  public static final String SERIALIZED_NAME_METADATA_OPTIONS = "MetadataOptions";
  @SerializedName(SERIALIZED_NAME_METADATA_OPTIONS)
  private AwsEc2InstanceDetailsMetadataOptions metadataOptions;

  public static final String SERIALIZED_NAME_MONITORING = "Monitoring";
  @SerializedName(SERIALIZED_NAME_MONITORING)
  private AwsEc2InstanceDetailsMonitoring monitoring;

  public AwsEc2InstanceDetails() {
  }

  public AwsEc2InstanceDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public AwsEc2InstanceDetails imageId(String imageId) {
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


  public AwsEc2InstanceDetails ipV4Addresses(List ipV4Addresses) {
    this.ipV4Addresses = ipV4Addresses;
    return this;
  }

  /**
   * Get ipV4Addresses
   * @return ipV4Addresses
   */
  @javax.annotation.Nullable
  public List getIpV4Addresses() {
    return ipV4Addresses;
  }

  public void setIpV4Addresses(List ipV4Addresses) {
    this.ipV4Addresses = ipV4Addresses;
  }


  public AwsEc2InstanceDetails ipV6Addresses(List ipV6Addresses) {
    this.ipV6Addresses = ipV6Addresses;
    return this;
  }

  /**
   * Get ipV6Addresses
   * @return ipV6Addresses
   */
  @javax.annotation.Nullable
  public List getIpV6Addresses() {
    return ipV6Addresses;
  }

  public void setIpV6Addresses(List ipV6Addresses) {
    this.ipV6Addresses = ipV6Addresses;
  }


  public AwsEc2InstanceDetails keyName(String keyName) {
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


  public AwsEc2InstanceDetails iamInstanceProfileArn(String iamInstanceProfileArn) {
    this.iamInstanceProfileArn = iamInstanceProfileArn;
    return this;
  }

  /**
   * Get iamInstanceProfileArn
   * @return iamInstanceProfileArn
   */
  @javax.annotation.Nullable
  public String getIamInstanceProfileArn() {
    return iamInstanceProfileArn;
  }

  public void setIamInstanceProfileArn(String iamInstanceProfileArn) {
    this.iamInstanceProfileArn = iamInstanceProfileArn;
  }


  public AwsEc2InstanceDetails vpcId(String vpcId) {
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


  public AwsEc2InstanceDetails subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * Get subnetId
   * @return subnetId
   */
  @javax.annotation.Nullable
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  public AwsEc2InstanceDetails launchedAt(String launchedAt) {
    this.launchedAt = launchedAt;
    return this;
  }

  /**
   * Get launchedAt
   * @return launchedAt
   */
  @javax.annotation.Nullable
  public String getLaunchedAt() {
    return launchedAt;
  }

  public void setLaunchedAt(String launchedAt) {
    this.launchedAt = launchedAt;
  }


  public AwsEc2InstanceDetails networkInterfaces(List networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  /**
   * Get networkInterfaces
   * @return networkInterfaces
   */
  @javax.annotation.Nullable
  public List getNetworkInterfaces() {
    return networkInterfaces;
  }

  public void setNetworkInterfaces(List networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
  }


  public AwsEc2InstanceDetails virtualizationType(String virtualizationType) {
    this.virtualizationType = virtualizationType;
    return this;
  }

  /**
   * Get virtualizationType
   * @return virtualizationType
   */
  @javax.annotation.Nullable
  public String getVirtualizationType() {
    return virtualizationType;
  }

  public void setVirtualizationType(String virtualizationType) {
    this.virtualizationType = virtualizationType;
  }


  public AwsEc2InstanceDetails metadataOptions(AwsEc2InstanceDetailsMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * Get metadataOptions
   * @return metadataOptions
   */
  @javax.annotation.Nullable
  public AwsEc2InstanceDetailsMetadataOptions getMetadataOptions() {
    return metadataOptions;
  }

  public void setMetadataOptions(AwsEc2InstanceDetailsMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
  }


  public AwsEc2InstanceDetails monitoring(AwsEc2InstanceDetailsMonitoring monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * Get monitoring
   * @return monitoring
   */
  @javax.annotation.Nullable
  public AwsEc2InstanceDetailsMonitoring getMonitoring() {
    return monitoring;
  }

  public void setMonitoring(AwsEc2InstanceDetailsMonitoring monitoring) {
    this.monitoring = monitoring;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2InstanceDetails awsEc2InstanceDetails = (AwsEc2InstanceDetails) o;
    return Objects.equals(this.type, awsEc2InstanceDetails.type) &&
        Objects.equals(this.imageId, awsEc2InstanceDetails.imageId) &&
        Objects.equals(this.ipV4Addresses, awsEc2InstanceDetails.ipV4Addresses) &&
        Objects.equals(this.ipV6Addresses, awsEc2InstanceDetails.ipV6Addresses) &&
        Objects.equals(this.keyName, awsEc2InstanceDetails.keyName) &&
        Objects.equals(this.iamInstanceProfileArn, awsEc2InstanceDetails.iamInstanceProfileArn) &&
        Objects.equals(this.vpcId, awsEc2InstanceDetails.vpcId) &&
        Objects.equals(this.subnetId, awsEc2InstanceDetails.subnetId) &&
        Objects.equals(this.launchedAt, awsEc2InstanceDetails.launchedAt) &&
        Objects.equals(this.networkInterfaces, awsEc2InstanceDetails.networkInterfaces) &&
        Objects.equals(this.virtualizationType, awsEc2InstanceDetails.virtualizationType) &&
        Objects.equals(this.metadataOptions, awsEc2InstanceDetails.metadataOptions) &&
        Objects.equals(this.monitoring, awsEc2InstanceDetails.monitoring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageId, ipV4Addresses, ipV6Addresses, keyName, iamInstanceProfileArn, vpcId, subnetId, launchedAt, networkInterfaces, virtualizationType, metadataOptions, monitoring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2InstanceDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    ipV4Addresses: ").append(toIndentedString(ipV4Addresses)).append("\n");
    sb.append("    ipV6Addresses: ").append(toIndentedString(ipV6Addresses)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    iamInstanceProfileArn: ").append(toIndentedString(iamInstanceProfileArn)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    launchedAt: ").append(toIndentedString(launchedAt)).append("\n");
    sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
    sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
    sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("ImageId");
    openapiFields.add("IpV4Addresses");
    openapiFields.add("IpV6Addresses");
    openapiFields.add("KeyName");
    openapiFields.add("IamInstanceProfileArn");
    openapiFields.add("VpcId");
    openapiFields.add("SubnetId");
    openapiFields.add("LaunchedAt");
    openapiFields.add("NetworkInterfaces");
    openapiFields.add("VirtualizationType");
    openapiFields.add("MetadataOptions");
    openapiFields.add("Monitoring");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2InstanceDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2InstanceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2InstanceDetails is not found in the empty JSON string", AwsEc2InstanceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2InstanceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2InstanceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `ImageId`
      if (jsonObj.get("ImageId") != null && !jsonObj.get("ImageId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ImageId"));
      }
      // validate the optional field `IpV4Addresses`
      if (jsonObj.get("IpV4Addresses") != null && !jsonObj.get("IpV4Addresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpV4Addresses"));
      }
      // validate the optional field `IpV6Addresses`
      if (jsonObj.get("IpV6Addresses") != null && !jsonObj.get("IpV6Addresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpV6Addresses"));
      }
      // validate the optional field `KeyName`
      if (jsonObj.get("KeyName") != null && !jsonObj.get("KeyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KeyName"));
      }
      // validate the optional field `IamInstanceProfileArn`
      if (jsonObj.get("IamInstanceProfileArn") != null && !jsonObj.get("IamInstanceProfileArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IamInstanceProfileArn"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `SubnetId`
      if (jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetId"));
      }
      // validate the optional field `LaunchedAt`
      if (jsonObj.get("LaunchedAt") != null && !jsonObj.get("LaunchedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchedAt"));
      }
      // validate the optional field `NetworkInterfaces`
      if (jsonObj.get("NetworkInterfaces") != null && !jsonObj.get("NetworkInterfaces").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NetworkInterfaces"));
      }
      // validate the optional field `VirtualizationType`
      if (jsonObj.get("VirtualizationType") != null && !jsonObj.get("VirtualizationType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VirtualizationType"));
      }
      // validate the optional field `MetadataOptions`
      if (jsonObj.get("MetadataOptions") != null && !jsonObj.get("MetadataOptions").isJsonNull()) {
        AwsEc2InstanceDetailsMetadataOptions.validateJsonElement(jsonObj.get("MetadataOptions"));
      }
      // validate the optional field `Monitoring`
      if (jsonObj.get("Monitoring") != null && !jsonObj.get("Monitoring").isJsonNull()) {
        AwsEc2InstanceDetailsMonitoring.validateJsonElement(jsonObj.get("Monitoring"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2InstanceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2InstanceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2InstanceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2InstanceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2InstanceDetails>() {
           @Override
           public void write(JsonWriter out, AwsEc2InstanceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2InstanceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2InstanceDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2InstanceDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEc2InstanceDetails
   */
  public static AwsEc2InstanceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2InstanceDetails.class);
  }

  /**
   * Convert an instance of AwsEc2InstanceDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

