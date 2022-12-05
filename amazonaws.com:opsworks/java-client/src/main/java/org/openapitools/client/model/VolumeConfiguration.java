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
 * Describes an Amazon EBS volume configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class VolumeConfiguration {
  public static final String SERIALIZED_NAME_MOUNT_POINT = "MountPoint";
  @SerializedName(SERIALIZED_NAME_MOUNT_POINT)
  private String mountPoint;

  public static final String SERIALIZED_NAME_RAID_LEVEL = "RaidLevel";
  @SerializedName(SERIALIZED_NAME_RAID_LEVEL)
  private Integer raidLevel;

  public static final String SERIALIZED_NAME_NUMBER_OF_DISKS = "NumberOfDisks";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DISKS)
  private Integer numberOfDisks;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";
  @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
  private String volumeType;

  public static final String SERIALIZED_NAME_IOPS = "Iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_ENCRYPTED = "Encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public VolumeConfiguration() {
  }

  public VolumeConfiguration mountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
    return this;
  }

  /**
   * Get mountPoint
   * @return mountPoint
   */
  @javax.annotation.Nonnull
  public String getMountPoint() {
    return mountPoint;
  }

  public void setMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
  }


  public VolumeConfiguration raidLevel(Integer raidLevel) {
    this.raidLevel = raidLevel;
    return this;
  }

  /**
   * Get raidLevel
   * @return raidLevel
   */
  @javax.annotation.Nullable
  public Integer getRaidLevel() {
    return raidLevel;
  }

  public void setRaidLevel(Integer raidLevel) {
    this.raidLevel = raidLevel;
  }


  public VolumeConfiguration numberOfDisks(Integer numberOfDisks) {
    this.numberOfDisks = numberOfDisks;
    return this;
  }

  /**
   * Get numberOfDisks
   * @return numberOfDisks
   */
  @javax.annotation.Nonnull
  public Integer getNumberOfDisks() {
    return numberOfDisks;
  }

  public void setNumberOfDisks(Integer numberOfDisks) {
    this.numberOfDisks = numberOfDisks;
  }


  public VolumeConfiguration size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nonnull
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  public VolumeConfiguration volumeType(String volumeType) {
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


  public VolumeConfiguration iops(Integer iops) {
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


  public VolumeConfiguration encrypted(Boolean encrypted) {
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
    VolumeConfiguration volumeConfiguration = (VolumeConfiguration) o;
    return Objects.equals(this.mountPoint, volumeConfiguration.mountPoint) &&
        Objects.equals(this.raidLevel, volumeConfiguration.raidLevel) &&
        Objects.equals(this.numberOfDisks, volumeConfiguration.numberOfDisks) &&
        Objects.equals(this.size, volumeConfiguration.size) &&
        Objects.equals(this.volumeType, volumeConfiguration.volumeType) &&
        Objects.equals(this.iops, volumeConfiguration.iops) &&
        Objects.equals(this.encrypted, volumeConfiguration.encrypted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPoint, raidLevel, numberOfDisks, size, volumeType, iops, encrypted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeConfiguration {\n");
    sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
    sb.append("    raidLevel: ").append(toIndentedString(raidLevel)).append("\n");
    sb.append("    numberOfDisks: ").append(toIndentedString(numberOfDisks)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("MountPoint");
    openapiFields.add("RaidLevel");
    openapiFields.add("NumberOfDisks");
    openapiFields.add("Size");
    openapiFields.add("VolumeType");
    openapiFields.add("Iops");
    openapiFields.add("Encrypted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MountPoint");
    openapiRequiredFields.add("NumberOfDisks");
    openapiRequiredFields.add("Size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VolumeConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VolumeConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VolumeConfiguration is not found in the empty JSON string", VolumeConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VolumeConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VolumeConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VolumeConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `MountPoint`
      String.validateJsonElement(jsonObj.get("MountPoint"));
      // validate the optional field `RaidLevel`
      if (jsonObj.get("RaidLevel") != null && !jsonObj.get("RaidLevel").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("RaidLevel"));
      }
      // validate the required field `NumberOfDisks`
      Integer.validateJsonElement(jsonObj.get("NumberOfDisks"));
      // validate the required field `Size`
      Integer.validateJsonElement(jsonObj.get("Size"));
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
       if (!VolumeConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VolumeConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VolumeConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VolumeConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<VolumeConfiguration>() {
           @Override
           public void write(JsonWriter out, VolumeConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VolumeConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VolumeConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VolumeConfiguration
   * @throws IOException if the JSON string is invalid with respect to VolumeConfiguration
   */
  public static VolumeConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VolumeConfiguration.class);
  }

  /**
   * Convert an instance of VolumeConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

