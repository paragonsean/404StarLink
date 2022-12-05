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
 * Describes an instance&#39;s Amazon EBS volume.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Volume {
  public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";
  @SerializedName(SERIALIZED_NAME_VOLUME_ID)
  private String volumeId;

  public static final String SERIALIZED_NAME_EC2_VOLUME_ID = "Ec2VolumeId";
  @SerializedName(SERIALIZED_NAME_EC2_VOLUME_ID)
  private String ec2VolumeId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RAID_ARRAY_ID = "RaidArrayId";
  @SerializedName(SERIALIZED_NAME_RAID_ARRAY_ID)
  private String raidArrayId;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "InstanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_DEVICE = "Device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_MOUNT_POINT = "MountPoint";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "AvailabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private String availabilityZone;

  public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";
  @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
  private String volumeType;

  public static final String SERIALIZED_NAME_IOPS = "Iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_ENCRYPTED = "Encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public Volume() {
  }

  public Volume volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * Get volumeId
   * @return volumeId
   */
  @javax.annotation.Nullable
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  public Volume ec2VolumeId(String ec2VolumeId) {
    this.ec2VolumeId = ec2VolumeId;
    return this;
  }

  /**
   * Get ec2VolumeId
   * @return ec2VolumeId
   */
  @javax.annotation.Nullable
  public String getEc2VolumeId() {
    return ec2VolumeId;
  }

  public void setEc2VolumeId(String ec2VolumeId) {
    this.ec2VolumeId = ec2VolumeId;
  }


  public Volume name(String name) {
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


  public Volume raidArrayId(String raidArrayId) {
    this.raidArrayId = raidArrayId;
    return this;
  }

  /**
   * Get raidArrayId
   * @return raidArrayId
   */
  @javax.annotation.Nullable
  public String getRaidArrayId() {
    return raidArrayId;
  }

  public void setRaidArrayId(String raidArrayId) {
    this.raidArrayId = raidArrayId;
  }


  public Volume instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
   */
  @javax.annotation.Nullable
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public Volume status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Volume size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  public Volume device(String device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @javax.annotation.Nullable
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public Volume mountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
    return this;
  }

  /**
   * Get mountPoint
   * @return mountPoint
   */
  @javax.annotation.Nullable
  public String getMountPoint() {
    return mountPoint;
  }

  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public Volume region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public Volume availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * Get availabilityZone
   * @return availabilityZone
   */
  @javax.annotation.Nullable
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public Volume volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  /**
   * Get volumeType
   * @return volumeType
   */
  @javax.annotation.Nullable
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }


  public Volume iops(Integer iops) {
    this.iops = iops;
    return this;
  }

  /**
   * Get iops
   * @return iops
   */
  @javax.annotation.Nullable
  public Integer getIops() {
    return iops;
  }

  public void setIops(Integer iops) {
    this.iops = iops;
  }


  public Volume encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

  /**
   * Get encrypted
   * @return encrypted
   */
  @javax.annotation.Nullable
  public Boolean getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.volumeId, volume.volumeId) &&
        Objects.equals(this.ec2VolumeId, volume.ec2VolumeId) &&
        Objects.equals(this.name, volume.name) &&
        Objects.equals(this.raidArrayId, volume.raidArrayId) &&
        Objects.equals(this.instanceId, volume.instanceId) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.size, volume.size) &&
        Objects.equals(this.device, volume.device) &&
        Objects.equals(this.mountPoint, volume.mountPoint) &&
        Objects.equals(this.region, volume.region) &&
        Objects.equals(this.availabilityZone, volume.availabilityZone) &&
        Objects.equals(this.volumeType, volume.volumeType) &&
        Objects.equals(this.iops, volume.iops) &&
        Objects.equals(this.encrypted, volume.encrypted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId, ec2VolumeId, name, raidArrayId, instanceId, status, size, device, mountPoint, region, availabilityZone, volumeType, iops, encrypted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    ec2VolumeId: ").append(toIndentedString(ec2VolumeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    raidArrayId: ").append(toIndentedString(raidArrayId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
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
    openapiFields.add("VolumeId");
    openapiFields.add("Ec2VolumeId");
    openapiFields.add("Name");
    openapiFields.add("RaidArrayId");
    openapiFields.add("InstanceId");
    openapiFields.add("Status");
    openapiFields.add("Size");
    openapiFields.add("Device");
    openapiFields.add("MountPoint");
    openapiFields.add("Region");
    openapiFields.add("AvailabilityZone");
    openapiFields.add("VolumeType");
    openapiFields.add("Iops");
    openapiFields.add("Encrypted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Volume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Volume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Volume is not found in the empty JSON string", Volume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Volume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Volume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `VolumeId`
      if (jsonObj.get("VolumeId") != null && !jsonObj.get("VolumeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeId"));
      }
      // validate the optional field `Ec2VolumeId`
      if (jsonObj.get("Ec2VolumeId") != null && !jsonObj.get("Ec2VolumeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ec2VolumeId"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `RaidArrayId`
      if (jsonObj.get("RaidArrayId") != null && !jsonObj.get("RaidArrayId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("RaidArrayId"));
      }
      // validate the optional field `InstanceId`
      if (jsonObj.get("InstanceId") != null && !jsonObj.get("InstanceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Size`
      if (jsonObj.get("Size") != null && !jsonObj.get("Size").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Size"));
      }
      // validate the optional field `Device`
      if (jsonObj.get("Device") != null && !jsonObj.get("Device").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Device"));
      }
      // validate the optional field `MountPoint`
      if (jsonObj.get("MountPoint") != null && !jsonObj.get("MountPoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("MountPoint"));
      }
      // validate the optional field `Region`
      if (jsonObj.get("Region") != null && !jsonObj.get("Region").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Region"));
      }
      // validate the optional field `AvailabilityZone`
      if (jsonObj.get("AvailabilityZone") != null && !jsonObj.get("AvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AvailabilityZone"));
      }
      // validate the optional field `VolumeType`
      if (jsonObj.get("VolumeType") != null && !jsonObj.get("VolumeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeType"));
      }
      // validate the optional field `Iops`
      if (jsonObj.get("Iops") != null && !jsonObj.get("Iops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Iops"));
      }
      // validate the optional field `Encrypted`
      if (jsonObj.get("Encrypted") != null && !jsonObj.get("Encrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Encrypted"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Volume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Volume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Volume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Volume.class));

       return (TypeAdapter<T>) new TypeAdapter<Volume>() {
           @Override
           public void write(JsonWriter out, Volume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Volume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Volume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Volume
   * @throws IOException if the JSON string is invalid with respect to Volume
   */
  public static Volume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Volume.class);
  }

  /**
   * Convert an instance of Volume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

