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
import org.openapitools.client.model.BlockDeviceMappingEbs;

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
 * Describes a block device mapping. This data type maps directly to the Amazon EC2 &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html\&quot;&gt;BlockDeviceMapping&lt;/a&gt; data type. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:36.435440-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BlockDeviceMapping {
  public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_NO_DEVICE = "NoDevice";
  @SerializedName(SERIALIZED_NAME_NO_DEVICE)
  private String noDevice;

  public static final String SERIALIZED_NAME_VIRTUAL_NAME = "VirtualName";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NAME)
  private String virtualName;

  public static final String SERIALIZED_NAME_EBS = "Ebs";
  @SerializedName(SERIALIZED_NAME_EBS)
  private BlockDeviceMappingEbs ebs;

  public BlockDeviceMapping() {
  }

  public BlockDeviceMapping deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Get deviceName
   * @return deviceName
   */
  @javax.annotation.Nullable
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public BlockDeviceMapping noDevice(String noDevice) {
    this.noDevice = noDevice;
    return this;
  }

  /**
   * Get noDevice
   * @return noDevice
   */
  @javax.annotation.Nullable
  public String getNoDevice() {
    return noDevice;
  }

  public void setNoDevice(String noDevice) {
    this.noDevice = noDevice;
  }


  public BlockDeviceMapping virtualName(String virtualName) {
    this.virtualName = virtualName;
    return this;
  }

  /**
   * Get virtualName
   * @return virtualName
   */
  @javax.annotation.Nullable
  public String getVirtualName() {
    return virtualName;
  }

  public void setVirtualName(String virtualName) {
    this.virtualName = virtualName;
  }


  public BlockDeviceMapping ebs(BlockDeviceMappingEbs ebs) {
    this.ebs = ebs;
    return this;
  }

  /**
   * Get ebs
   * @return ebs
   */
  @javax.annotation.Nullable
  public BlockDeviceMappingEbs getEbs() {
    return ebs;
  }

  public void setEbs(BlockDeviceMappingEbs ebs) {
    this.ebs = ebs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockDeviceMapping blockDeviceMapping = (BlockDeviceMapping) o;
    return Objects.equals(this.deviceName, blockDeviceMapping.deviceName) &&
        Objects.equals(this.noDevice, blockDeviceMapping.noDevice) &&
        Objects.equals(this.virtualName, blockDeviceMapping.virtualName) &&
        Objects.equals(this.ebs, blockDeviceMapping.ebs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, noDevice, virtualName, ebs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockDeviceMapping {\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    noDevice: ").append(toIndentedString(noDevice)).append("\n");
    sb.append("    virtualName: ").append(toIndentedString(virtualName)).append("\n");
    sb.append("    ebs: ").append(toIndentedString(ebs)).append("\n");
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
    openapiFields.add("DeviceName");
    openapiFields.add("NoDevice");
    openapiFields.add("VirtualName");
    openapiFields.add("Ebs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BlockDeviceMapping
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BlockDeviceMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockDeviceMapping is not found in the empty JSON string", BlockDeviceMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BlockDeviceMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockDeviceMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DeviceName`
      if (jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DeviceName"));
      }
      // validate the optional field `NoDevice`
      if (jsonObj.get("NoDevice") != null && !jsonObj.get("NoDevice").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NoDevice"));
      }
      // validate the optional field `VirtualName`
      if (jsonObj.get("VirtualName") != null && !jsonObj.get("VirtualName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VirtualName"));
      }
      // validate the optional field `Ebs`
      if (jsonObj.get("Ebs") != null && !jsonObj.get("Ebs").isJsonNull()) {
        BlockDeviceMappingEbs.validateJsonElement(jsonObj.get("Ebs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockDeviceMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockDeviceMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockDeviceMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockDeviceMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockDeviceMapping>() {
           @Override
           public void write(JsonWriter out, BlockDeviceMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockDeviceMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BlockDeviceMapping given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BlockDeviceMapping
   * @throws IOException if the JSON string is invalid with respect to BlockDeviceMapping
   */
  public static BlockDeviceMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockDeviceMapping.class);
  }

  /**
   * Convert an instance of BlockDeviceMapping to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

