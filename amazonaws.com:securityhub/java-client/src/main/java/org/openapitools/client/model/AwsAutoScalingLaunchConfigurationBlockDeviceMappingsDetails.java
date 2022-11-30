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
import org.openapitools.client.model.AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs;

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
 * A block device for the instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails {
  public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_EBS = "Ebs";
  @SerializedName(SERIALIZED_NAME_EBS)
  private AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs ebs;

  public static final String SERIALIZED_NAME_NO_DEVICE = "NoDevice";
  @SerializedName(SERIALIZED_NAME_NO_DEVICE)
  private Boolean noDevice;

  public static final String SERIALIZED_NAME_VIRTUAL_NAME = "VirtualName";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NAME)
  private String virtualName;

  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails() {
  }

  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails deviceName(String deviceName) {
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


  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails ebs(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs ebs) {
    this.ebs = ebs;
    return this;
  }

  /**
   * Get ebs
   * @return ebs
   */
  @javax.annotation.Nullable
  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs getEbs() {
    return ebs;
  }

  public void setEbs(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs ebs) {
    this.ebs = ebs;
  }


  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails noDevice(Boolean noDevice) {
    this.noDevice = noDevice;
    return this;
  }

  /**
   * Get noDevice
   * @return noDevice
   */
  @javax.annotation.Nullable
  public Boolean getNoDevice() {
    return noDevice;
  }

  public void setNoDevice(Boolean noDevice) {
    this.noDevice = noDevice;
  }


  public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails virtualName(String virtualName) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails awsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails = (AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails) o;
    return Objects.equals(this.deviceName, awsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.deviceName) &&
        Objects.equals(this.ebs, awsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.ebs) &&
        Objects.equals(this.noDevice, awsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.noDevice) &&
        Objects.equals(this.virtualName, awsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.virtualName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, ebs, noDevice, virtualName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails {\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    ebs: ").append(toIndentedString(ebs)).append("\n");
    sb.append("    noDevice: ").append(toIndentedString(noDevice)).append("\n");
    sb.append("    virtualName: ").append(toIndentedString(virtualName)).append("\n");
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
    openapiFields.add("Ebs");
    openapiFields.add("NoDevice");
    openapiFields.add("VirtualName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails is not found in the empty JSON string", AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DeviceName`
      if (jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DeviceName"));
      }
      // validate the optional field `Ebs`
      if (jsonObj.get("Ebs") != null && !jsonObj.get("Ebs").isJsonNull()) {
        AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsEbs.validateJsonElement(jsonObj.get("Ebs"));
      }
      // validate the optional field `NoDevice`
      if (jsonObj.get("NoDevice") != null && !jsonObj.get("NoDevice").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("NoDevice"));
      }
      // validate the optional field `VirtualName`
      if (jsonObj.get("VirtualName") != null && !jsonObj.get("VirtualName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VirtualName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails>() {
           @Override
           public void write(JsonWriter out, AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails
   * @throws IOException if the JSON string is invalid with respect to AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails
   */
  public static AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails.class);
  }

  /**
   * Convert an instance of AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

