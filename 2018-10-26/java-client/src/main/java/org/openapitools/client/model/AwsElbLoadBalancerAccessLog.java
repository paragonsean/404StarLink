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
 * Contains information about the access log configuration for the load balancer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsElbLoadBalancerAccessLog {
  public static final String SERIALIZED_NAME_EMIT_INTERVAL = "EmitInterval";
  @SerializedName(SERIALIZED_NAME_EMIT_INTERVAL)
  private Integer emitInterval;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_S3_BUCKET_NAME = "S3BucketName";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_NAME)
  private String s3BucketName;

  public static final String SERIALIZED_NAME_S3_BUCKET_PREFIX = "S3BucketPrefix";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET_PREFIX)
  private String s3BucketPrefix;

  public AwsElbLoadBalancerAccessLog() {
  }

  public AwsElbLoadBalancerAccessLog emitInterval(Integer emitInterval) {
    this.emitInterval = emitInterval;
    return this;
  }

  /**
   * Get emitInterval
   * @return emitInterval
   */
  @javax.annotation.Nullable
  public Integer getEmitInterval() {
    return emitInterval;
  }

  public void setEmitInterval(Integer emitInterval) {
    this.emitInterval = emitInterval;
  }


  public AwsElbLoadBalancerAccessLog enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AwsElbLoadBalancerAccessLog s3BucketName(String s3BucketName) {
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


  public AwsElbLoadBalancerAccessLog s3BucketPrefix(String s3BucketPrefix) {
    this.s3BucketPrefix = s3BucketPrefix;
    return this;
  }

  /**
   * Get s3BucketPrefix
   * @return s3BucketPrefix
   */
  @javax.annotation.Nullable
  public String getS3BucketPrefix() {
    return s3BucketPrefix;
  }

  public void setS3BucketPrefix(String s3BucketPrefix) {
    this.s3BucketPrefix = s3BucketPrefix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsElbLoadBalancerAccessLog awsElbLoadBalancerAccessLog = (AwsElbLoadBalancerAccessLog) o;
    return Objects.equals(this.emitInterval, awsElbLoadBalancerAccessLog.emitInterval) &&
        Objects.equals(this.enabled, awsElbLoadBalancerAccessLog.enabled) &&
        Objects.equals(this.s3BucketName, awsElbLoadBalancerAccessLog.s3BucketName) &&
        Objects.equals(this.s3BucketPrefix, awsElbLoadBalancerAccessLog.s3BucketPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emitInterval, enabled, s3BucketName, s3BucketPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsElbLoadBalancerAccessLog {\n");
    sb.append("    emitInterval: ").append(toIndentedString(emitInterval)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    s3BucketName: ").append(toIndentedString(s3BucketName)).append("\n");
    sb.append("    s3BucketPrefix: ").append(toIndentedString(s3BucketPrefix)).append("\n");
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
    openapiFields.add("EmitInterval");
    openapiFields.add("Enabled");
    openapiFields.add("S3BucketName");
    openapiFields.add("S3BucketPrefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsElbLoadBalancerAccessLog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsElbLoadBalancerAccessLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsElbLoadBalancerAccessLog is not found in the empty JSON string", AwsElbLoadBalancerAccessLog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsElbLoadBalancerAccessLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsElbLoadBalancerAccessLog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EmitInterval`
      if (jsonObj.get("EmitInterval") != null && !jsonObj.get("EmitInterval").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("EmitInterval"));
      }
      // validate the optional field `Enabled`
      if (jsonObj.get("Enabled") != null && !jsonObj.get("Enabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Enabled"));
      }
      // validate the optional field `S3BucketName`
      if (jsonObj.get("S3BucketName") != null && !jsonObj.get("S3BucketName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3BucketName"));
      }
      // validate the optional field `S3BucketPrefix`
      if (jsonObj.get("S3BucketPrefix") != null && !jsonObj.get("S3BucketPrefix").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("S3BucketPrefix"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsElbLoadBalancerAccessLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsElbLoadBalancerAccessLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsElbLoadBalancerAccessLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsElbLoadBalancerAccessLog.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsElbLoadBalancerAccessLog>() {
           @Override
           public void write(JsonWriter out, AwsElbLoadBalancerAccessLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsElbLoadBalancerAccessLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsElbLoadBalancerAccessLog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsElbLoadBalancerAccessLog
   * @throws IOException if the JSON string is invalid with respect to AwsElbLoadBalancerAccessLog
   */
  public static AwsElbLoadBalancerAccessLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsElbLoadBalancerAccessLog.class);
  }

  /**
   * Convert an instance of AwsElbLoadBalancerAccessLog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

