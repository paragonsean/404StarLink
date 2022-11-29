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
 * AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs {
  public static final String SERIALIZED_NAME_DELETE_ON_TERMINATION = "DeleteOnTermination";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_TERMINATION)
  private Boolean deleteOnTermination;

  public static final String SERIALIZED_NAME_ENCRYPTED = "Encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_IOPS = "Iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Integer iops;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private String snapshotId;

  public static final String SERIALIZED_NAME_THROUGHPUT = "Throughput";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT)
  private Integer throughput;

  public static final String SERIALIZED_NAME_VOLUME_SIZE = "VolumeSize";
  @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
  private Integer volumeSize;

  public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";
  @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
  private String volumeType;

  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs() {
  }

  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs deleteOnTermination(Boolean deleteOnTermination) {
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


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs encrypted(Boolean encrypted) {
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


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs iops(Integer iops) {
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


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs kmsKeyId(String kmsKeyId) {
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


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs snapshotId(String snapshotId) {
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


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs throughput(Integer throughput) {
    this.throughput = throughput;
    return this;
  }

  /**
   * Get throughput
   * @return throughput
   */
  @javax.annotation.Nullable
  public Integer getThroughput() {
    return throughput;
  }

  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs volumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

  /**
   * Get volumeSize
   * @return volumeSize
   */
  @javax.annotation.Nullable
  public Integer getVolumeSize() {
    return volumeSize;
  }

  public void setVolumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
  }


  public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs volumeType(String volumeType) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs = (AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs) o;
    return Objects.equals(this.deleteOnTermination, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.deleteOnTermination) &&
        Objects.equals(this.encrypted, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.encrypted) &&
        Objects.equals(this.iops, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.iops) &&
        Objects.equals(this.kmsKeyId, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.kmsKeyId) &&
        Objects.equals(this.snapshotId, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.snapshotId) &&
        Objects.equals(this.throughput, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.throughput) &&
        Objects.equals(this.volumeSize, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.volumeSize) &&
        Objects.equals(this.volumeType, awsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.volumeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, throughput, volumeSize, volumeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs {\n");
    sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
    openapiFields.add("DeleteOnTermination");
    openapiFields.add("Encrypted");
    openapiFields.add("Iops");
    openapiFields.add("KmsKeyId");
    openapiFields.add("SnapshotId");
    openapiFields.add("Throughput");
    openapiFields.add("VolumeSize");
    openapiFields.add("VolumeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs is not found in the empty JSON string", AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DeleteOnTermination`
      if (jsonObj.get("DeleteOnTermination") != null && !jsonObj.get("DeleteOnTermination").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DeleteOnTermination"));
      }
      // validate the optional field `Encrypted`
      if (jsonObj.get("Encrypted") != null && !jsonObj.get("Encrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Encrypted"));
      }
      // validate the optional field `Iops`
      if (jsonObj.get("Iops") != null && !jsonObj.get("Iops").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Iops"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `SnapshotId`
      if (jsonObj.get("SnapshotId") != null && !jsonObj.get("SnapshotId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnapshotId"));
      }
      // validate the optional field `Throughput`
      if (jsonObj.get("Throughput") != null && !jsonObj.get("Throughput").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Throughput"));
      }
      // validate the optional field `VolumeSize`
      if (jsonObj.get("VolumeSize") != null && !jsonObj.get("VolumeSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("VolumeSize"));
      }
      // validate the optional field `VolumeType`
      if (jsonObj.get("VolumeType") != null && !jsonObj.get("VolumeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VolumeType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs>() {
           @Override
           public void write(JsonWriter out, AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs
   * @throws IOException if the JSON string is invalid with respect to AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs
   */
  public static AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs.class);
  }

  /**
   * Convert an instance of AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsEbs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

