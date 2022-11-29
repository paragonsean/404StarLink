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
 * The log configuration for the results of the run command actions.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails {
  public static final String SERIALIZED_NAME_CLOUD_WATCH_ENCRYPTION_ENABLED = "CloudWatchEncryptionEnabled";
  @SerializedName(SERIALIZED_NAME_CLOUD_WATCH_ENCRYPTION_ENABLED)
  private Boolean cloudWatchEncryptionEnabled;

  public static final String SERIALIZED_NAME_CLOUD_WATCH_LOG_GROUP_NAME = "CloudWatchLogGroupName";
  @SerializedName(SERIALIZED_NAME_CLOUD_WATCH_LOG_GROUP_NAME)
  private String cloudWatchLogGroupName;

  public static final String SERIALIZED_NAME_S3_BUCKET_NAME = "S3BucketName";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_NAME)
  private String s3BucketName;

  public static final String SERIALIZED_NAME_S3_ENCRYPTION_ENABLED = "S3EncryptionEnabled";
  @SerializedName(SERIALIZED_NAME_S3_ENCRYPTION_ENABLED)
  private Boolean s3EncryptionEnabled;

  public static final String SERIALIZED_NAME_S3_KEY_PREFIX = "S3KeyPrefix";
  @SerializedName(SERIALIZED_NAME_S3_KEY_PREFIX)
  private String s3KeyPrefix;

  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails() {
  }

  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails cloudWatchEncryptionEnabled(Boolean cloudWatchEncryptionEnabled) {
    this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
    return this;
  }

  /**
   * Get cloudWatchEncryptionEnabled
   * @return cloudWatchEncryptionEnabled
   */
  @javax.annotation.Nullable
  public Boolean getCloudWatchEncryptionEnabled() {
    return cloudWatchEncryptionEnabled;
  }

  public void setCloudWatchEncryptionEnabled(Boolean cloudWatchEncryptionEnabled) {
    this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
  }


  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails cloudWatchLogGroupName(String cloudWatchLogGroupName) {
    this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    return this;
  }

  /**
   * Get cloudWatchLogGroupName
   * @return cloudWatchLogGroupName
   */
  @javax.annotation.Nullable
  public String getCloudWatchLogGroupName() {
    return cloudWatchLogGroupName;
  }

  public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
    this.cloudWatchLogGroupName = cloudWatchLogGroupName;
  }


  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails s3BucketName(String s3BucketName) {
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


  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails s3EncryptionEnabled(Boolean s3EncryptionEnabled) {
    this.s3EncryptionEnabled = s3EncryptionEnabled;
    return this;
  }

  /**
   * Get s3EncryptionEnabled
   * @return s3EncryptionEnabled
   */
  @javax.annotation.Nullable
  public Boolean getS3EncryptionEnabled() {
    return s3EncryptionEnabled;
  }

  public void setS3EncryptionEnabled(Boolean s3EncryptionEnabled) {
    this.s3EncryptionEnabled = s3EncryptionEnabled;
  }


  public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails s3KeyPrefix(String s3KeyPrefix) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails = (AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails) o;
    return Objects.equals(this.cloudWatchEncryptionEnabled, awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.cloudWatchEncryptionEnabled) &&
        Objects.equals(this.cloudWatchLogGroupName, awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.cloudWatchLogGroupName) &&
        Objects.equals(this.s3BucketName, awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.s3BucketName) &&
        Objects.equals(this.s3EncryptionEnabled, awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.s3EncryptionEnabled) &&
        Objects.equals(this.s3KeyPrefix, awsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.s3KeyPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudWatchEncryptionEnabled, cloudWatchLogGroupName, s3BucketName, s3EncryptionEnabled, s3KeyPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails {\n");
    sb.append("    cloudWatchEncryptionEnabled: ").append(toIndentedString(cloudWatchEncryptionEnabled)).append("\n");
    sb.append("    cloudWatchLogGroupName: ").append(toIndentedString(cloudWatchLogGroupName)).append("\n");
    sb.append("    s3BucketName: ").append(toIndentedString(s3BucketName)).append("\n");
    sb.append("    s3EncryptionEnabled: ").append(toIndentedString(s3EncryptionEnabled)).append("\n");
    sb.append("    s3KeyPrefix: ").append(toIndentedString(s3KeyPrefix)).append("\n");
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
    openapiFields.add("CloudWatchEncryptionEnabled");
    openapiFields.add("CloudWatchLogGroupName");
    openapiFields.add("S3BucketName");
    openapiFields.add("S3EncryptionEnabled");
    openapiFields.add("S3KeyPrefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails is not found in the empty JSON string", AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CloudWatchEncryptionEnabled`
      if (jsonObj.get("CloudWatchEncryptionEnabled") != null && !jsonObj.get("CloudWatchEncryptionEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CloudWatchEncryptionEnabled"));
      }
      // validate the optional field `CloudWatchLogGroupName`
      if (jsonObj.get("CloudWatchLogGroupName") != null && !jsonObj.get("CloudWatchLogGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CloudWatchLogGroupName"));
      }
      // validate the optional field `S3BucketName`
      if (jsonObj.get("S3BucketName") != null && !jsonObj.get("S3BucketName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3BucketName"));
      }
      // validate the optional field `S3EncryptionEnabled`
      if (jsonObj.get("S3EncryptionEnabled") != null && !jsonObj.get("S3EncryptionEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("S3EncryptionEnabled"));
      }
      // validate the optional field `S3KeyPrefix`
      if (jsonObj.get("S3KeyPrefix") != null && !jsonObj.get("S3KeyPrefix").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3KeyPrefix"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails>() {
           @Override
           public void write(JsonWriter out, AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails
   * @throws IOException if the JSON string is invalid with respect to AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails
   */
  public static AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails.class);
  }

  /**
   * Convert an instance of AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

