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
 * AwsEc2NetworkInterfaceDetailsAttachment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2NetworkInterfaceDetailsAttachment {
  public static final String SERIALIZED_NAME_ATTACH_TIME = "AttachTime";
  @SerializedName(SERIALIZED_NAME_ATTACH_TIME)
  private String attachTime;

  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "AttachmentId";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId;

  public static final String SERIALIZED_NAME_DELETE_ON_TERMINATION = "DeleteOnTermination";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_TERMINATION)
  private Boolean deleteOnTermination;

  public static final String SERIALIZED_NAME_DEVICE_INDEX = "DeviceIndex";
  @SerializedName(SERIALIZED_NAME_DEVICE_INDEX)
  private Integer deviceIndex;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "InstanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_INSTANCE_OWNER_ID = "InstanceOwnerId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_OWNER_ID)
  private String instanceOwnerId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AwsEc2NetworkInterfaceDetailsAttachment() {
  }

  public AwsEc2NetworkInterfaceDetailsAttachment attachTime(String attachTime) {
    this.attachTime = attachTime;
    return this;
  }

  /**
   * Get attachTime
   * @return attachTime
   */
  @javax.annotation.Nullable
  public String getAttachTime() {
    return attachTime;
  }

  public void setAttachTime(String attachTime) {
    this.attachTime = attachTime;
  }


  public AwsEc2NetworkInterfaceDetailsAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * Get attachmentId
   * @return attachmentId
   */
  @javax.annotation.Nullable
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AwsEc2NetworkInterfaceDetailsAttachment deleteOnTermination(Boolean deleteOnTermination) {
    this.deleteOnTermination = deleteOnTermination;
    return this;
  }

  /**
   * Get deleteOnTermination
   * @return deleteOnTermination
   */
  @javax.annotation.Nullable
  public Boolean getDeleteOnTermination() {
    return deleteOnTermination;
  }

  public void setDeleteOnTermination(Boolean deleteOnTermination) {
    this.deleteOnTermination = deleteOnTermination;
  }


  public AwsEc2NetworkInterfaceDetailsAttachment deviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
    return this;
  }

  /**
   * Get deviceIndex
   * @return deviceIndex
   */
  @javax.annotation.Nullable
  public Integer getDeviceIndex() {
    return deviceIndex;
  }

  public void setDeviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
  }


  public AwsEc2NetworkInterfaceDetailsAttachment instanceId(String instanceId) {
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


  public AwsEc2NetworkInterfaceDetailsAttachment instanceOwnerId(String instanceOwnerId) {
    this.instanceOwnerId = instanceOwnerId;
    return this;
  }

  /**
   * Get instanceOwnerId
   * @return instanceOwnerId
   */
  @javax.annotation.Nullable
  public String getInstanceOwnerId() {
    return instanceOwnerId;
  }

  public void setInstanceOwnerId(String instanceOwnerId) {
    this.instanceOwnerId = instanceOwnerId;
  }


  public AwsEc2NetworkInterfaceDetailsAttachment status(String status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2NetworkInterfaceDetailsAttachment awsEc2NetworkInterfaceDetailsAttachment = (AwsEc2NetworkInterfaceDetailsAttachment) o;
    return Objects.equals(this.attachTime, awsEc2NetworkInterfaceDetailsAttachment.attachTime) &&
        Objects.equals(this.attachmentId, awsEc2NetworkInterfaceDetailsAttachment.attachmentId) &&
        Objects.equals(this.deleteOnTermination, awsEc2NetworkInterfaceDetailsAttachment.deleteOnTermination) &&
        Objects.equals(this.deviceIndex, awsEc2NetworkInterfaceDetailsAttachment.deviceIndex) &&
        Objects.equals(this.instanceId, awsEc2NetworkInterfaceDetailsAttachment.instanceId) &&
        Objects.equals(this.instanceOwnerId, awsEc2NetworkInterfaceDetailsAttachment.instanceOwnerId) &&
        Objects.equals(this.status, awsEc2NetworkInterfaceDetailsAttachment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachTime, attachmentId, deleteOnTermination, deviceIndex, instanceId, instanceOwnerId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2NetworkInterfaceDetailsAttachment {\n");
    sb.append("    attachTime: ").append(toIndentedString(attachTime)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    deviceIndex: ").append(toIndentedString(deviceIndex)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceOwnerId: ").append(toIndentedString(instanceOwnerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("AttachTime");
    openapiFields.add("AttachmentId");
    openapiFields.add("DeleteOnTermination");
    openapiFields.add("DeviceIndex");
    openapiFields.add("InstanceId");
    openapiFields.add("InstanceOwnerId");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2NetworkInterfaceDetailsAttachment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2NetworkInterfaceDetailsAttachment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2NetworkInterfaceDetailsAttachment is not found in the empty JSON string", AwsEc2NetworkInterfaceDetailsAttachment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2NetworkInterfaceDetailsAttachment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2NetworkInterfaceDetailsAttachment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AttachTime`
      if (jsonObj.get("AttachTime") != null && !jsonObj.get("AttachTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AttachTime"));
      }
      // validate the optional field `AttachmentId`
      if (jsonObj.get("AttachmentId") != null && !jsonObj.get("AttachmentId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AttachmentId"));
      }
      // validate the optional field `DeleteOnTermination`
      if (jsonObj.get("DeleteOnTermination") != null && !jsonObj.get("DeleteOnTermination").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DeleteOnTermination"));
      }
      // validate the optional field `DeviceIndex`
      if (jsonObj.get("DeviceIndex") != null && !jsonObj.get("DeviceIndex").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("DeviceIndex"));
      }
      // validate the optional field `InstanceId`
      if (jsonObj.get("InstanceId") != null && !jsonObj.get("InstanceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceId"));
      }
      // validate the optional field `InstanceOwnerId`
      if (jsonObj.get("InstanceOwnerId") != null && !jsonObj.get("InstanceOwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceOwnerId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2NetworkInterfaceDetailsAttachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2NetworkInterfaceDetailsAttachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2NetworkInterfaceDetailsAttachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2NetworkInterfaceDetailsAttachment.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2NetworkInterfaceDetailsAttachment>() {
           @Override
           public void write(JsonWriter out, AwsEc2NetworkInterfaceDetailsAttachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2NetworkInterfaceDetailsAttachment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2NetworkInterfaceDetailsAttachment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2NetworkInterfaceDetailsAttachment
   * @throws IOException if the JSON string is invalid with respect to AwsEc2NetworkInterfaceDetailsAttachment
   */
  public static AwsEc2NetworkInterfaceDetailsAttachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2NetworkInterfaceDetailsAttachment.class);
  }

  /**
   * Convert an instance of AwsEc2NetworkInterfaceDetailsAttachment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

