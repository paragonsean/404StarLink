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
import org.openapitools.client.model.AwsS3BucketDetailsBucketLifecycleConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsBucketLoggingConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsBucketNotificationConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsBucketVersioningConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsBucketWebsiteConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsObjectLockConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsPublicAccessBlockConfiguration;
import org.openapitools.client.model.AwsS3BucketDetailsServerSideEncryptionConfiguration;

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
 * ResourceDetailsAwsS3Bucket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsS3Bucket {
  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_NAME = "OwnerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_OWNER_ACCOUNT_ID = "OwnerAccountId";
  @SerializedName(SERIALIZED_NAME_OWNER_ACCOUNT_ID)
  private String ownerAccountId;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_SERVER_SIDE_ENCRYPTION_CONFIGURATION = "ServerSideEncryptionConfiguration";
  @SerializedName(SERIALIZED_NAME_SERVER_SIDE_ENCRYPTION_CONFIGURATION)
  private AwsS3BucketDetailsServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

  public static final String SERIALIZED_NAME_BUCKET_LIFECYCLE_CONFIGURATION = "BucketLifecycleConfiguration";
  @SerializedName(SERIALIZED_NAME_BUCKET_LIFECYCLE_CONFIGURATION)
  private AwsS3BucketDetailsBucketLifecycleConfiguration bucketLifecycleConfiguration;

  public static final String SERIALIZED_NAME_PUBLIC_ACCESS_BLOCK_CONFIGURATION = "PublicAccessBlockConfiguration";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ACCESS_BLOCK_CONFIGURATION)
  private AwsS3BucketDetailsPublicAccessBlockConfiguration publicAccessBlockConfiguration;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_LIST = "AccessControlList";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_LIST)
  private String accessControlList;

  public static final String SERIALIZED_NAME_BUCKET_LOGGING_CONFIGURATION = "BucketLoggingConfiguration";
  @SerializedName(SERIALIZED_NAME_BUCKET_LOGGING_CONFIGURATION)
  private AwsS3BucketDetailsBucketLoggingConfiguration bucketLoggingConfiguration;

  public static final String SERIALIZED_NAME_BUCKET_WEBSITE_CONFIGURATION = "BucketWebsiteConfiguration";
  @SerializedName(SERIALIZED_NAME_BUCKET_WEBSITE_CONFIGURATION)
  private AwsS3BucketDetailsBucketWebsiteConfiguration bucketWebsiteConfiguration;

  public static final String SERIALIZED_NAME_BUCKET_NOTIFICATION_CONFIGURATION = "BucketNotificationConfiguration";
  @SerializedName(SERIALIZED_NAME_BUCKET_NOTIFICATION_CONFIGURATION)
  private AwsS3BucketDetailsBucketNotificationConfiguration bucketNotificationConfiguration;

  public static final String SERIALIZED_NAME_BUCKET_VERSIONING_CONFIGURATION = "BucketVersioningConfiguration";
  @SerializedName(SERIALIZED_NAME_BUCKET_VERSIONING_CONFIGURATION)
  private AwsS3BucketDetailsBucketVersioningConfiguration bucketVersioningConfiguration;

  public static final String SERIALIZED_NAME_OBJECT_LOCK_CONFIGURATION = "ObjectLockConfiguration";
  @SerializedName(SERIALIZED_NAME_OBJECT_LOCK_CONFIGURATION)
  private AwsS3BucketDetailsObjectLockConfiguration objectLockConfiguration;

  public ResourceDetailsAwsS3Bucket() {
  }

  public ResourceDetailsAwsS3Bucket ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public ResourceDetailsAwsS3Bucket ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Get ownerName
   * @return ownerName
   */
  @javax.annotation.Nullable
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public ResourceDetailsAwsS3Bucket ownerAccountId(String ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
    return this;
  }

  /**
   * Get ownerAccountId
   * @return ownerAccountId
   */
  @javax.annotation.Nullable
  public String getOwnerAccountId() {
    return ownerAccountId;
  }

  public void setOwnerAccountId(String ownerAccountId) {
    this.ownerAccountId = ownerAccountId;
  }


  public ResourceDetailsAwsS3Bucket createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ResourceDetailsAwsS3Bucket serverSideEncryptionConfiguration(AwsS3BucketDetailsServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
    this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    return this;
  }

  /**
   * Get serverSideEncryptionConfiguration
   * @return serverSideEncryptionConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
    return serverSideEncryptionConfiguration;
  }

  public void setServerSideEncryptionConfiguration(AwsS3BucketDetailsServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
    this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
  }


  public ResourceDetailsAwsS3Bucket bucketLifecycleConfiguration(AwsS3BucketDetailsBucketLifecycleConfiguration bucketLifecycleConfiguration) {
    this.bucketLifecycleConfiguration = bucketLifecycleConfiguration;
    return this;
  }

  /**
   * Get bucketLifecycleConfiguration
   * @return bucketLifecycleConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsBucketLifecycleConfiguration getBucketLifecycleConfiguration() {
    return bucketLifecycleConfiguration;
  }

  public void setBucketLifecycleConfiguration(AwsS3BucketDetailsBucketLifecycleConfiguration bucketLifecycleConfiguration) {
    this.bucketLifecycleConfiguration = bucketLifecycleConfiguration;
  }


  public ResourceDetailsAwsS3Bucket publicAccessBlockConfiguration(AwsS3BucketDetailsPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
    this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    return this;
  }

  /**
   * Get publicAccessBlockConfiguration
   * @return publicAccessBlockConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsPublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
    return publicAccessBlockConfiguration;
  }

  public void setPublicAccessBlockConfiguration(AwsS3BucketDetailsPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
    this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
  }


  public ResourceDetailsAwsS3Bucket accessControlList(String accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  /**
   * Get accessControlList
   * @return accessControlList
   */
  @javax.annotation.Nullable
  public String getAccessControlList() {
    return accessControlList;
  }

  public void setAccessControlList(String accessControlList) {
    this.accessControlList = accessControlList;
  }


  public ResourceDetailsAwsS3Bucket bucketLoggingConfiguration(AwsS3BucketDetailsBucketLoggingConfiguration bucketLoggingConfiguration) {
    this.bucketLoggingConfiguration = bucketLoggingConfiguration;
    return this;
  }

  /**
   * Get bucketLoggingConfiguration
   * @return bucketLoggingConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsBucketLoggingConfiguration getBucketLoggingConfiguration() {
    return bucketLoggingConfiguration;
  }

  public void setBucketLoggingConfiguration(AwsS3BucketDetailsBucketLoggingConfiguration bucketLoggingConfiguration) {
    this.bucketLoggingConfiguration = bucketLoggingConfiguration;
  }


  public ResourceDetailsAwsS3Bucket bucketWebsiteConfiguration(AwsS3BucketDetailsBucketWebsiteConfiguration bucketWebsiteConfiguration) {
    this.bucketWebsiteConfiguration = bucketWebsiteConfiguration;
    return this;
  }

  /**
   * Get bucketWebsiteConfiguration
   * @return bucketWebsiteConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsBucketWebsiteConfiguration getBucketWebsiteConfiguration() {
    return bucketWebsiteConfiguration;
  }

  public void setBucketWebsiteConfiguration(AwsS3BucketDetailsBucketWebsiteConfiguration bucketWebsiteConfiguration) {
    this.bucketWebsiteConfiguration = bucketWebsiteConfiguration;
  }


  public ResourceDetailsAwsS3Bucket bucketNotificationConfiguration(AwsS3BucketDetailsBucketNotificationConfiguration bucketNotificationConfiguration) {
    this.bucketNotificationConfiguration = bucketNotificationConfiguration;
    return this;
  }

  /**
   * Get bucketNotificationConfiguration
   * @return bucketNotificationConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsBucketNotificationConfiguration getBucketNotificationConfiguration() {
    return bucketNotificationConfiguration;
  }

  public void setBucketNotificationConfiguration(AwsS3BucketDetailsBucketNotificationConfiguration bucketNotificationConfiguration) {
    this.bucketNotificationConfiguration = bucketNotificationConfiguration;
  }


  public ResourceDetailsAwsS3Bucket bucketVersioningConfiguration(AwsS3BucketDetailsBucketVersioningConfiguration bucketVersioningConfiguration) {
    this.bucketVersioningConfiguration = bucketVersioningConfiguration;
    return this;
  }

  /**
   * Get bucketVersioningConfiguration
   * @return bucketVersioningConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsBucketVersioningConfiguration getBucketVersioningConfiguration() {
    return bucketVersioningConfiguration;
  }

  public void setBucketVersioningConfiguration(AwsS3BucketDetailsBucketVersioningConfiguration bucketVersioningConfiguration) {
    this.bucketVersioningConfiguration = bucketVersioningConfiguration;
  }


  public ResourceDetailsAwsS3Bucket objectLockConfiguration(AwsS3BucketDetailsObjectLockConfiguration objectLockConfiguration) {
    this.objectLockConfiguration = objectLockConfiguration;
    return this;
  }

  /**
   * Get objectLockConfiguration
   * @return objectLockConfiguration
   */
  @javax.annotation.Nullable
  public AwsS3BucketDetailsObjectLockConfiguration getObjectLockConfiguration() {
    return objectLockConfiguration;
  }

  public void setObjectLockConfiguration(AwsS3BucketDetailsObjectLockConfiguration objectLockConfiguration) {
    this.objectLockConfiguration = objectLockConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsS3Bucket resourceDetailsAwsS3Bucket = (ResourceDetailsAwsS3Bucket) o;
    return Objects.equals(this.ownerId, resourceDetailsAwsS3Bucket.ownerId) &&
        Objects.equals(this.ownerName, resourceDetailsAwsS3Bucket.ownerName) &&
        Objects.equals(this.ownerAccountId, resourceDetailsAwsS3Bucket.ownerAccountId) &&
        Objects.equals(this.createdAt, resourceDetailsAwsS3Bucket.createdAt) &&
        Objects.equals(this.serverSideEncryptionConfiguration, resourceDetailsAwsS3Bucket.serverSideEncryptionConfiguration) &&
        Objects.equals(this.bucketLifecycleConfiguration, resourceDetailsAwsS3Bucket.bucketLifecycleConfiguration) &&
        Objects.equals(this.publicAccessBlockConfiguration, resourceDetailsAwsS3Bucket.publicAccessBlockConfiguration) &&
        Objects.equals(this.accessControlList, resourceDetailsAwsS3Bucket.accessControlList) &&
        Objects.equals(this.bucketLoggingConfiguration, resourceDetailsAwsS3Bucket.bucketLoggingConfiguration) &&
        Objects.equals(this.bucketWebsiteConfiguration, resourceDetailsAwsS3Bucket.bucketWebsiteConfiguration) &&
        Objects.equals(this.bucketNotificationConfiguration, resourceDetailsAwsS3Bucket.bucketNotificationConfiguration) &&
        Objects.equals(this.bucketVersioningConfiguration, resourceDetailsAwsS3Bucket.bucketVersioningConfiguration) &&
        Objects.equals(this.objectLockConfiguration, resourceDetailsAwsS3Bucket.objectLockConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, ownerName, ownerAccountId, createdAt, serverSideEncryptionConfiguration, bucketLifecycleConfiguration, publicAccessBlockConfiguration, accessControlList, bucketLoggingConfiguration, bucketWebsiteConfiguration, bucketNotificationConfiguration, bucketVersioningConfiguration, objectLockConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsS3Bucket {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAccountId: ").append(toIndentedString(ownerAccountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    serverSideEncryptionConfiguration: ").append(toIndentedString(serverSideEncryptionConfiguration)).append("\n");
    sb.append("    bucketLifecycleConfiguration: ").append(toIndentedString(bucketLifecycleConfiguration)).append("\n");
    sb.append("    publicAccessBlockConfiguration: ").append(toIndentedString(publicAccessBlockConfiguration)).append("\n");
    sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
    sb.append("    bucketLoggingConfiguration: ").append(toIndentedString(bucketLoggingConfiguration)).append("\n");
    sb.append("    bucketWebsiteConfiguration: ").append(toIndentedString(bucketWebsiteConfiguration)).append("\n");
    sb.append("    bucketNotificationConfiguration: ").append(toIndentedString(bucketNotificationConfiguration)).append("\n");
    sb.append("    bucketVersioningConfiguration: ").append(toIndentedString(bucketVersioningConfiguration)).append("\n");
    sb.append("    objectLockConfiguration: ").append(toIndentedString(objectLockConfiguration)).append("\n");
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
    openapiFields.add("OwnerId");
    openapiFields.add("OwnerName");
    openapiFields.add("OwnerAccountId");
    openapiFields.add("CreatedAt");
    openapiFields.add("ServerSideEncryptionConfiguration");
    openapiFields.add("BucketLifecycleConfiguration");
    openapiFields.add("PublicAccessBlockConfiguration");
    openapiFields.add("AccessControlList");
    openapiFields.add("BucketLoggingConfiguration");
    openapiFields.add("BucketWebsiteConfiguration");
    openapiFields.add("BucketNotificationConfiguration");
    openapiFields.add("BucketVersioningConfiguration");
    openapiFields.add("ObjectLockConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsS3Bucket
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsS3Bucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsS3Bucket is not found in the empty JSON string", ResourceDetailsAwsS3Bucket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsS3Bucket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsS3Bucket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OwnerId`
      if (jsonObj.get("OwnerId") != null && !jsonObj.get("OwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerId"));
      }
      // validate the optional field `OwnerName`
      if (jsonObj.get("OwnerName") != null && !jsonObj.get("OwnerName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerName"));
      }
      // validate the optional field `OwnerAccountId`
      if (jsonObj.get("OwnerAccountId") != null && !jsonObj.get("OwnerAccountId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OwnerAccountId"));
      }
      // validate the optional field `CreatedAt`
      if (jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedAt"));
      }
      // validate the optional field `ServerSideEncryptionConfiguration`
      if (jsonObj.get("ServerSideEncryptionConfiguration") != null && !jsonObj.get("ServerSideEncryptionConfiguration").isJsonNull()) {
        AwsS3BucketDetailsServerSideEncryptionConfiguration.validateJsonElement(jsonObj.get("ServerSideEncryptionConfiguration"));
      }
      // validate the optional field `BucketLifecycleConfiguration`
      if (jsonObj.get("BucketLifecycleConfiguration") != null && !jsonObj.get("BucketLifecycleConfiguration").isJsonNull()) {
        AwsS3BucketDetailsBucketLifecycleConfiguration.validateJsonElement(jsonObj.get("BucketLifecycleConfiguration"));
      }
      // validate the optional field `PublicAccessBlockConfiguration`
      if (jsonObj.get("PublicAccessBlockConfiguration") != null && !jsonObj.get("PublicAccessBlockConfiguration").isJsonNull()) {
        AwsS3BucketDetailsPublicAccessBlockConfiguration.validateJsonElement(jsonObj.get("PublicAccessBlockConfiguration"));
      }
      // validate the optional field `AccessControlList`
      if (jsonObj.get("AccessControlList") != null && !jsonObj.get("AccessControlList").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessControlList"));
      }
      // validate the optional field `BucketLoggingConfiguration`
      if (jsonObj.get("BucketLoggingConfiguration") != null && !jsonObj.get("BucketLoggingConfiguration").isJsonNull()) {
        AwsS3BucketDetailsBucketLoggingConfiguration.validateJsonElement(jsonObj.get("BucketLoggingConfiguration"));
      }
      // validate the optional field `BucketWebsiteConfiguration`
      if (jsonObj.get("BucketWebsiteConfiguration") != null && !jsonObj.get("BucketWebsiteConfiguration").isJsonNull()) {
        AwsS3BucketDetailsBucketWebsiteConfiguration.validateJsonElement(jsonObj.get("BucketWebsiteConfiguration"));
      }
      // validate the optional field `BucketNotificationConfiguration`
      if (jsonObj.get("BucketNotificationConfiguration") != null && !jsonObj.get("BucketNotificationConfiguration").isJsonNull()) {
        AwsS3BucketDetailsBucketNotificationConfiguration.validateJsonElement(jsonObj.get("BucketNotificationConfiguration"));
      }
      // validate the optional field `BucketVersioningConfiguration`
      if (jsonObj.get("BucketVersioningConfiguration") != null && !jsonObj.get("BucketVersioningConfiguration").isJsonNull()) {
        AwsS3BucketDetailsBucketVersioningConfiguration.validateJsonElement(jsonObj.get("BucketVersioningConfiguration"));
      }
      // validate the optional field `ObjectLockConfiguration`
      if (jsonObj.get("ObjectLockConfiguration") != null && !jsonObj.get("ObjectLockConfiguration").isJsonNull()) {
        AwsS3BucketDetailsObjectLockConfiguration.validateJsonElement(jsonObj.get("ObjectLockConfiguration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsS3Bucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsS3Bucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsS3Bucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsS3Bucket.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsS3Bucket>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsS3Bucket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsS3Bucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsS3Bucket given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsS3Bucket
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsS3Bucket
   */
  public static ResourceDetailsAwsS3Bucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsS3Bucket.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsS3Bucket to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

