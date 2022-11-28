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
 * ResourceDetailsAwsCloudTrailTrail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsCloudTrailTrail {
  public static final String SERIALIZED_NAME_CLOUD_WATCH_LOGS_LOG_GROUP_ARN = "CloudWatchLogsLogGroupArn";
  @SerializedName(SERIALIZED_NAME_CLOUD_WATCH_LOGS_LOG_GROUP_ARN)
  private String cloudWatchLogsLogGroupArn;

  public static final String SERIALIZED_NAME_CLOUD_WATCH_LOGS_ROLE_ARN = "CloudWatchLogsRoleArn";
  @SerializedName(SERIALIZED_NAME_CLOUD_WATCH_LOGS_ROLE_ARN)
  private String cloudWatchLogsRoleArn;

  public static final String SERIALIZED_NAME_HAS_CUSTOM_EVENT_SELECTORS = "HasCustomEventSelectors";
  @SerializedName(SERIALIZED_NAME_HAS_CUSTOM_EVENT_SELECTORS)
  private Boolean hasCustomEventSelectors;

  public static final String SERIALIZED_NAME_HOME_REGION = "HomeRegion";
  @SerializedName(SERIALIZED_NAME_HOME_REGION)
  private String homeRegion;

  public static final String SERIALIZED_NAME_INCLUDE_GLOBAL_SERVICE_EVENTS = "IncludeGlobalServiceEvents";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GLOBAL_SERVICE_EVENTS)
  private Boolean includeGlobalServiceEvents;

  public static final String SERIALIZED_NAME_IS_MULTI_REGION_TRAIL = "IsMultiRegionTrail";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_REGION_TRAIL)
  private Boolean isMultiRegionTrail;

  public static final String SERIALIZED_NAME_IS_ORGANIZATION_TRAIL = "IsOrganizationTrail";
  @SerializedName(SERIALIZED_NAME_IS_ORGANIZATION_TRAIL)
  private Boolean isOrganizationTrail;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_LOG_FILE_VALIDATION_ENABLED = "LogFileValidationEnabled";
  @SerializedName(SERIALIZED_NAME_LOG_FILE_VALIDATION_ENABLED)
  private Boolean logFileValidationEnabled;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_S3_BUCKET_NAME = "S3BucketName";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_NAME)
  private String s3BucketName;

  public static final String SERIALIZED_NAME_S3_KEY_PREFIX = "S3KeyPrefix";
  @SerializedName(SERIALIZED_NAME_S3_KEY_PREFIX)
  private String s3KeyPrefix;

  public static final String SERIALIZED_NAME_SNS_TOPIC_ARN = "SnsTopicArn";
  @SerializedName(SERIALIZED_NAME_SNS_TOPIC_ARN)
  private String snsTopicArn;

  public static final String SERIALIZED_NAME_SNS_TOPIC_NAME = "SnsTopicName";
  @SerializedName(SERIALIZED_NAME_SNS_TOPIC_NAME)
  private String snsTopicName;

  public static final String SERIALIZED_NAME_TRAIL_ARN = "TrailArn";
  @SerializedName(SERIALIZED_NAME_TRAIL_ARN)
  private String trailArn;

  public ResourceDetailsAwsCloudTrailTrail() {
  }

  public ResourceDetailsAwsCloudTrailTrail cloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
    this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    return this;
  }

  /**
   * Get cloudWatchLogsLogGroupArn
   * @return cloudWatchLogsLogGroupArn
   */
  @javax.annotation.Nullable
  public String getCloudWatchLogsLogGroupArn() {
    return cloudWatchLogsLogGroupArn;
  }

  public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
    this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
  }


  public ResourceDetailsAwsCloudTrailTrail cloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
    this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    return this;
  }

  /**
   * Get cloudWatchLogsRoleArn
   * @return cloudWatchLogsRoleArn
   */
  @javax.annotation.Nullable
  public String getCloudWatchLogsRoleArn() {
    return cloudWatchLogsRoleArn;
  }

  public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
    this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
  }


  public ResourceDetailsAwsCloudTrailTrail hasCustomEventSelectors(Boolean hasCustomEventSelectors) {
    this.hasCustomEventSelectors = hasCustomEventSelectors;
    return this;
  }

  /**
   * Get hasCustomEventSelectors
   * @return hasCustomEventSelectors
   */
  @javax.annotation.Nullable
  public Boolean getHasCustomEventSelectors() {
    return hasCustomEventSelectors;
  }

  public void setHasCustomEventSelectors(Boolean hasCustomEventSelectors) {
    this.hasCustomEventSelectors = hasCustomEventSelectors;
  }


  public ResourceDetailsAwsCloudTrailTrail homeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
    return this;
  }

  /**
   * Get homeRegion
   * @return homeRegion
   */
  @javax.annotation.Nullable
  public String getHomeRegion() {
    return homeRegion;
  }

  public void setHomeRegion(String homeRegion) {
    this.homeRegion = homeRegion;
  }


  public ResourceDetailsAwsCloudTrailTrail includeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
    this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    return this;
  }

  /**
   * Get includeGlobalServiceEvents
   * @return includeGlobalServiceEvents
   */
  @javax.annotation.Nullable
  public Boolean getIncludeGlobalServiceEvents() {
    return includeGlobalServiceEvents;
  }

  public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
    this.includeGlobalServiceEvents = includeGlobalServiceEvents;
  }


  public ResourceDetailsAwsCloudTrailTrail isMultiRegionTrail(Boolean isMultiRegionTrail) {
    this.isMultiRegionTrail = isMultiRegionTrail;
    return this;
  }

  /**
   * Get isMultiRegionTrail
   * @return isMultiRegionTrail
   */
  @javax.annotation.Nullable
  public Boolean getIsMultiRegionTrail() {
    return isMultiRegionTrail;
  }

  public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
    this.isMultiRegionTrail = isMultiRegionTrail;
  }


  public ResourceDetailsAwsCloudTrailTrail isOrganizationTrail(Boolean isOrganizationTrail) {
    this.isOrganizationTrail = isOrganizationTrail;
    return this;
  }

  /**
   * Get isOrganizationTrail
   * @return isOrganizationTrail
   */
  @javax.annotation.Nullable
  public Boolean getIsOrganizationTrail() {
    return isOrganizationTrail;
  }

  public void setIsOrganizationTrail(Boolean isOrganizationTrail) {
    this.isOrganizationTrail = isOrganizationTrail;
  }


  public ResourceDetailsAwsCloudTrailTrail kmsKeyId(String kmsKeyId) {
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


  public ResourceDetailsAwsCloudTrailTrail logFileValidationEnabled(Boolean logFileValidationEnabled) {
    this.logFileValidationEnabled = logFileValidationEnabled;
    return this;
  }

  /**
   * Get logFileValidationEnabled
   * @return logFileValidationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getLogFileValidationEnabled() {
    return logFileValidationEnabled;
  }

  public void setLogFileValidationEnabled(Boolean logFileValidationEnabled) {
    this.logFileValidationEnabled = logFileValidationEnabled;
  }


  public ResourceDetailsAwsCloudTrailTrail name(String name) {
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


  public ResourceDetailsAwsCloudTrailTrail s3BucketName(String s3BucketName) {
    this.s3BucketName = s3BucketName;
    return this;
  }

  /**
   * Get s3BucketName
   * @return s3BucketName
   */
  @javax.annotation.Nullable
  public String getS3BucketName() {
    return s3BucketName;
  }

  public void setS3BucketName(String s3BucketName) {
    this.s3BucketName = s3BucketName;
  }


  public ResourceDetailsAwsCloudTrailTrail s3KeyPrefix(String s3KeyPrefix) {
    this.s3KeyPrefix = s3KeyPrefix;
    return this;
  }

  /**
   * Get s3KeyPrefix
   * @return s3KeyPrefix
   */
  @javax.annotation.Nullable
  public String getS3KeyPrefix() {
    return s3KeyPrefix;
  }

  public void setS3KeyPrefix(String s3KeyPrefix) {
    this.s3KeyPrefix = s3KeyPrefix;
  }


  public ResourceDetailsAwsCloudTrailTrail snsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
    return this;
  }

  /**
   * Get snsTopicArn
   * @return snsTopicArn
   */
  @javax.annotation.Nullable
  public String getSnsTopicArn() {
    return snsTopicArn;
  }

  public void setSnsTopicArn(String snsTopicArn) {
    this.snsTopicArn = snsTopicArn;
  }


  public ResourceDetailsAwsCloudTrailTrail snsTopicName(String snsTopicName) {
    this.snsTopicName = snsTopicName;
    return this;
  }

  /**
   * Get snsTopicName
   * @return snsTopicName
   */
  @javax.annotation.Nullable
  public String getSnsTopicName() {
    return snsTopicName;
  }

  public void setSnsTopicName(String snsTopicName) {
    this.snsTopicName = snsTopicName;
  }


  public ResourceDetailsAwsCloudTrailTrail trailArn(String trailArn) {
    this.trailArn = trailArn;
    return this;
  }

  /**
   * Get trailArn
   * @return trailArn
   */
  @javax.annotation.Nullable
  public String getTrailArn() {
    return trailArn;
  }

  public void setTrailArn(String trailArn) {
    this.trailArn = trailArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsCloudTrailTrail resourceDetailsAwsCloudTrailTrail = (ResourceDetailsAwsCloudTrailTrail) o;
    return Objects.equals(this.cloudWatchLogsLogGroupArn, resourceDetailsAwsCloudTrailTrail.cloudWatchLogsLogGroupArn) &&
        Objects.equals(this.cloudWatchLogsRoleArn, resourceDetailsAwsCloudTrailTrail.cloudWatchLogsRoleArn) &&
        Objects.equals(this.hasCustomEventSelectors, resourceDetailsAwsCloudTrailTrail.hasCustomEventSelectors) &&
        Objects.equals(this.homeRegion, resourceDetailsAwsCloudTrailTrail.homeRegion) &&
        Objects.equals(this.includeGlobalServiceEvents, resourceDetailsAwsCloudTrailTrail.includeGlobalServiceEvents) &&
        Objects.equals(this.isMultiRegionTrail, resourceDetailsAwsCloudTrailTrail.isMultiRegionTrail) &&
        Objects.equals(this.isOrganizationTrail, resourceDetailsAwsCloudTrailTrail.isOrganizationTrail) &&
        Objects.equals(this.kmsKeyId, resourceDetailsAwsCloudTrailTrail.kmsKeyId) &&
        Objects.equals(this.logFileValidationEnabled, resourceDetailsAwsCloudTrailTrail.logFileValidationEnabled) &&
        Objects.equals(this.name, resourceDetailsAwsCloudTrailTrail.name) &&
        Objects.equals(this.s3BucketName, resourceDetailsAwsCloudTrailTrail.s3BucketName) &&
        Objects.equals(this.s3KeyPrefix, resourceDetailsAwsCloudTrailTrail.s3KeyPrefix) &&
        Objects.equals(this.snsTopicArn, resourceDetailsAwsCloudTrailTrail.snsTopicArn) &&
        Objects.equals(this.snsTopicName, resourceDetailsAwsCloudTrailTrail.snsTopicName) &&
        Objects.equals(this.trailArn, resourceDetailsAwsCloudTrailTrail.trailArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudWatchLogsLogGroupArn, cloudWatchLogsRoleArn, hasCustomEventSelectors, homeRegion, includeGlobalServiceEvents, isMultiRegionTrail, isOrganizationTrail, kmsKeyId, logFileValidationEnabled, name, s3BucketName, s3KeyPrefix, snsTopicArn, snsTopicName, trailArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsCloudTrailTrail {\n");
    sb.append("    cloudWatchLogsLogGroupArn: ").append(toIndentedString(cloudWatchLogsLogGroupArn)).append("\n");
    sb.append("    cloudWatchLogsRoleArn: ").append(toIndentedString(cloudWatchLogsRoleArn)).append("\n");
    sb.append("    hasCustomEventSelectors: ").append(toIndentedString(hasCustomEventSelectors)).append("\n");
    sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
    sb.append("    includeGlobalServiceEvents: ").append(toIndentedString(includeGlobalServiceEvents)).append("\n");
    sb.append("    isMultiRegionTrail: ").append(toIndentedString(isMultiRegionTrail)).append("\n");
    sb.append("    isOrganizationTrail: ").append(toIndentedString(isOrganizationTrail)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    logFileValidationEnabled: ").append(toIndentedString(logFileValidationEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    s3BucketName: ").append(toIndentedString(s3BucketName)).append("\n");
    sb.append("    s3KeyPrefix: ").append(toIndentedString(s3KeyPrefix)).append("\n");
    sb.append("    snsTopicArn: ").append(toIndentedString(snsTopicArn)).append("\n");
    sb.append("    snsTopicName: ").append(toIndentedString(snsTopicName)).append("\n");
    sb.append("    trailArn: ").append(toIndentedString(trailArn)).append("\n");
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
    openapiFields.add("CloudWatchLogsLogGroupArn");
    openapiFields.add("CloudWatchLogsRoleArn");
    openapiFields.add("HasCustomEventSelectors");
    openapiFields.add("HomeRegion");
    openapiFields.add("IncludeGlobalServiceEvents");
    openapiFields.add("IsMultiRegionTrail");
    openapiFields.add("IsOrganizationTrail");
    openapiFields.add("KmsKeyId");
    openapiFields.add("LogFileValidationEnabled");
    openapiFields.add("Name");
    openapiFields.add("S3BucketName");
    openapiFields.add("S3KeyPrefix");
    openapiFields.add("SnsTopicArn");
    openapiFields.add("SnsTopicName");
    openapiFields.add("TrailArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsCloudTrailTrail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsCloudTrailTrail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsCloudTrailTrail is not found in the empty JSON string", ResourceDetailsAwsCloudTrailTrail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsCloudTrailTrail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsCloudTrailTrail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CloudWatchLogsLogGroupArn`
      if (jsonObj.get("CloudWatchLogsLogGroupArn") != null && !jsonObj.get("CloudWatchLogsLogGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CloudWatchLogsLogGroupArn"));
      }
      // validate the optional field `CloudWatchLogsRoleArn`
      if (jsonObj.get("CloudWatchLogsRoleArn") != null && !jsonObj.get("CloudWatchLogsRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CloudWatchLogsRoleArn"));
      }
      // validate the optional field `HasCustomEventSelectors`
      if (jsonObj.get("HasCustomEventSelectors") != null && !jsonObj.get("HasCustomEventSelectors").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("HasCustomEventSelectors"));
      }
      // validate the optional field `HomeRegion`
      if (jsonObj.get("HomeRegion") != null && !jsonObj.get("HomeRegion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HomeRegion"));
      }
      // validate the optional field `IncludeGlobalServiceEvents`
      if (jsonObj.get("IncludeGlobalServiceEvents") != null && !jsonObj.get("IncludeGlobalServiceEvents").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludeGlobalServiceEvents"));
      }
      // validate the optional field `IsMultiRegionTrail`
      if (jsonObj.get("IsMultiRegionTrail") != null && !jsonObj.get("IsMultiRegionTrail").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsMultiRegionTrail"));
      }
      // validate the optional field `IsOrganizationTrail`
      if (jsonObj.get("IsOrganizationTrail") != null && !jsonObj.get("IsOrganizationTrail").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsOrganizationTrail"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `LogFileValidationEnabled`
      if (jsonObj.get("LogFileValidationEnabled") != null && !jsonObj.get("LogFileValidationEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("LogFileValidationEnabled"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `S3BucketName`
      if (jsonObj.get("S3BucketName") != null && !jsonObj.get("S3BucketName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3BucketName"));
      }
      // validate the optional field `S3KeyPrefix`
      if (jsonObj.get("S3KeyPrefix") != null && !jsonObj.get("S3KeyPrefix").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3KeyPrefix"));
      }
      // validate the optional field `SnsTopicArn`
      if (jsonObj.get("SnsTopicArn") != null && !jsonObj.get("SnsTopicArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnsTopicArn"));
      }
      // validate the optional field `SnsTopicName`
      if (jsonObj.get("SnsTopicName") != null && !jsonObj.get("SnsTopicName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SnsTopicName"));
      }
      // validate the optional field `TrailArn`
      if (jsonObj.get("TrailArn") != null && !jsonObj.get("TrailArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("TrailArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsCloudTrailTrail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsCloudTrailTrail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsCloudTrailTrail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsCloudTrailTrail.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsCloudTrailTrail>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsCloudTrailTrail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsCloudTrailTrail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsCloudTrailTrail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsCloudTrailTrail
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsCloudTrailTrail
   */
  public static ResourceDetailsAwsCloudTrailTrail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsCloudTrailTrail.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsCloudTrailTrail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

