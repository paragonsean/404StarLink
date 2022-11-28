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
 * ResourceDetailsAwsEc2Volume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2Volume {
  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_ENCRYPTED = "Encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private String snapshotId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "Attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List attachments;

  public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";
  @SerializedName(SERIALIZED_NAME_VOLUME_ID)
  private String volumeId;

  public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";
  @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
  private String volumeType;

  public static final String SERIALIZED_NAME_VOLUME_SCAN_STATUS = "VolumeScanStatus";
  @SerializedName(SERIALIZED_NAME_VOLUME_SCAN_STATUS)
  private String volumeScanStatus;

  public ResourceDetailsAwsEc2Volume() {
  }

  public ResourceDetailsAwsEc2Volume createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
   */
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ResourceDetailsAwsEc2Volume deviceName(String deviceName) {
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


  public ResourceDetailsAwsEc2Volume encrypted(Boolean encrypted) {
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


  public ResourceDetailsAwsEc2Volume size(Integer size) {
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


  public ResourceDetailsAwsEc2Volume snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Get snapshotId
   * @return snapshotId
   */
  @javax.annotation.Nullable
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }


  public ResourceDetailsAwsEc2Volume status(String status) {
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


  public ResourceDetailsAwsEc2Volume kmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  /**
   * Get kmsKeyId
   * @return kmsKeyId
   */
  @javax.annotation.Nullable
  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public void setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
  }


  public ResourceDetailsAwsEc2Volume attachments(List attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nullable
  public List getAttachments() {
    return attachments;
  }

  public void setAttachments(List attachments) {
    this.attachments = attachments;
  }


  public ResourceDetailsAwsEc2Volume volumeId(String volumeId) {
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


  public ResourceDetailsAwsEc2Volume volumeType(String volumeType) {
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


  public ResourceDetailsAwsEc2Volume volumeScanStatus(String volumeScanStatus) {
    this.volumeScanStatus = volumeScanStatus;
    return this;
  }

  /**
   * Get volumeScanStatus
   * @return volumeScanStatus
   */
  @javax.annotation.Nullable
  public String getVolumeScanStatus() {
    return volumeScanStatus;
  }

  public void setVolumeScanStatus(String volumeScanStatus) {
    this.volumeScanStatus = volumeScanStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2Volume resourceDetailsAwsEc2Volume = (ResourceDetailsAwsEc2Volume) o;
    return Objects.equals(this.createTime, resourceDetailsAwsEc2Volume.createTime) &&
        Objects.equals(this.deviceName, resourceDetailsAwsEc2Volume.deviceName) &&
        Objects.equals(this.encrypted, resourceDetailsAwsEc2Volume.encrypted) &&
        Objects.equals(this.size, resourceDetailsAwsEc2Volume.size) &&
        Objects.equals(this.snapshotId, resourceDetailsAwsEc2Volume.snapshotId) &&
        Objects.equals(this.status, resourceDetailsAwsEc2Volume.status) &&
        Objects.equals(this.kmsKeyId, resourceDetailsAwsEc2Volume.kmsKeyId) &&
        Objects.equals(this.attachments, resourceDetailsAwsEc2Volume.attachments) &&
        Objects.equals(this.volumeId, resourceDetailsAwsEc2Volume.volumeId) &&
        Objects.equals(this.volumeType, resourceDetailsAwsEc2Volume.volumeType) &&
        Objects.equals(this.volumeScanStatus, resourceDetailsAwsEc2Volume.volumeScanStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, deviceName, encrypted, size, snapshotId, status, kmsKeyId, attachments, volumeId, volumeType, volumeScanStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2Volume {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    volumeScanStatus: ").append(toIndentedString(volumeScanStatus)).append("\n");
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
    openapiFields.add("CreateTime");
    openapiFields.add("DeviceName");
    openapiFields.add("Encrypted");
    openapiFields.add("Size");
    openapiFields.add("SnapshotId");
    openapiFields.add("Status");
    openapiFields.add("KmsKeyId");
    openapiFields.add("Attachments");
    openapiFields.add("VolumeId");
    openapiFields.add("VolumeType");
    openapiFields.add("VolumeScanStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2Volume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2Volume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2Volume is not found in the empty JSON string", ResourceDetailsAwsEc2Volume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2Volume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2Volume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CreateTime`
      if (jsonObj.get("CreateTime") != null && !jsonObj.get("CreateTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreateTime"));
      }
      // validate the optional field `DeviceName`
      if (jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DeviceName"));
      }
      // validate the optional field `Encrypted`
      if (jsonObj.get("Encrypted") != null && !jsonObj.get("Encrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Encrypted"));
      }
      // validate the optional field `Size`
      if (jsonObj.get("Size") != null && !jsonObj.get("Size").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Size"));
      }
      // validate the optional field `SnapshotId`
      if (jsonObj.get("SnapshotId") != null && !jsonObj.get("SnapshotId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotId"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `Attachments`
      if (jsonObj.get("Attachments") != null && !jsonObj.get("Attachments").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Attachments"));
      }
      // validate the optional field `VolumeId`
      if (jsonObj.get("VolumeId") != null && !jsonObj.get("VolumeId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeId"));
      }
      // validate the optional field `VolumeType`
      if (jsonObj.get("VolumeType") != null && !jsonObj.get("VolumeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeType"));
      }
      // validate the optional field `VolumeScanStatus`
      if (jsonObj.get("VolumeScanStatus") != null && !jsonObj.get("VolumeScanStatus").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeScanStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2Volume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2Volume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2Volume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2Volume.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2Volume>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2Volume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2Volume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2Volume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2Volume
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2Volume
   */
  public static ResourceDetailsAwsEc2Volume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2Volume.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2Volume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

