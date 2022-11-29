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
import org.openapitools.client.model.AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols;

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
 * A custom origin. A custom origin is any origin that is not an Amazon S3 bucket, with one exception. An Amazon S3 bucket that is &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html\&quot;&gt;configured with static website hosting&lt;/a&gt; is a custom origin. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:02.717661-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsCloudFrontDistributionOriginCustomOriginConfig {
  public static final String SERIALIZED_NAME_HTTP_PORT = "HttpPort";
  @SerializedName(SERIALIZED_NAME_HTTP_PORT)
  private Integer httpPort;

  public static final String SERIALIZED_NAME_HTTPS_PORT = "HttpsPort";
  @SerializedName(SERIALIZED_NAME_HTTPS_PORT)
  private Integer httpsPort;

  public static final String SERIALIZED_NAME_ORIGIN_KEEPALIVE_TIMEOUT = "OriginKeepaliveTimeout";
  @SerializedName(SERIALIZED_NAME_ORIGIN_KEEPALIVE_TIMEOUT)
  private Integer originKeepaliveTimeout;

  public static final String SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY = "OriginProtocolPolicy";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY)
  private String originProtocolPolicy;

  public static final String SERIALIZED_NAME_ORIGIN_READ_TIMEOUT = "OriginReadTimeout";
  @SerializedName(SERIALIZED_NAME_ORIGIN_READ_TIMEOUT)
  private Integer originReadTimeout;

  public static final String SERIALIZED_NAME_ORIGIN_SSL_PROTOCOLS = "OriginSslProtocols";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SSL_PROTOCOLS)
  private AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols originSslProtocols;

  public AwsCloudFrontDistributionOriginCustomOriginConfig() {
  }

  public AwsCloudFrontDistributionOriginCustomOriginConfig httpPort(Integer httpPort) {
    this.httpPort = httpPort;
    return this;
  }

  /**
   * Get httpPort
   * @return httpPort
   */
  @javax.annotation.Nullable
  public Integer getHttpPort() {
    return httpPort;
  }

  public void setHttpPort(Integer httpPort) {
    this.httpPort = httpPort;
  }


  public AwsCloudFrontDistributionOriginCustomOriginConfig httpsPort(Integer httpsPort) {
    this.httpsPort = httpsPort;
    return this;
  }

  /**
   * Get httpsPort
   * @return httpsPort
   */
  @javax.annotation.Nullable
  public Integer getHttpsPort() {
    return httpsPort;
  }

  public void setHttpsPort(Integer httpsPort) {
    this.httpsPort = httpsPort;
  }


  public AwsCloudFrontDistributionOriginCustomOriginConfig originKeepaliveTimeout(Integer originKeepaliveTimeout) {
    this.originKeepaliveTimeout = originKeepaliveTimeout;
    return this;
  }

  /**
   * Get originKeepaliveTimeout
   * @return originKeepaliveTimeout
   */
  @javax.annotation.Nullable
  public Integer getOriginKeepaliveTimeout() {
    return originKeepaliveTimeout;
  }

  public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
    this.originKeepaliveTimeout = originKeepaliveTimeout;
  }


  public AwsCloudFrontDistributionOriginCustomOriginConfig originProtocolPolicy(String originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
    return this;
  }

  /**
   * Get originProtocolPolicy
   * @return originProtocolPolicy
   */
  @javax.annotation.Nullable
  public String getOriginProtocolPolicy() {
    return originProtocolPolicy;
  }

  public void setOriginProtocolPolicy(String originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
  }


  public AwsCloudFrontDistributionOriginCustomOriginConfig originReadTimeout(Integer originReadTimeout) {
    this.originReadTimeout = originReadTimeout;
    return this;
  }

  /**
   * Get originReadTimeout
   * @return originReadTimeout
   */
  @javax.annotation.Nullable
  public Integer getOriginReadTimeout() {
    return originReadTimeout;
  }

  public void setOriginReadTimeout(Integer originReadTimeout) {
    this.originReadTimeout = originReadTimeout;
  }


  public AwsCloudFrontDistributionOriginCustomOriginConfig originSslProtocols(AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols originSslProtocols) {
    this.originSslProtocols = originSslProtocols;
    return this;
  }

  /**
   * Get originSslProtocols
   * @return originSslProtocols
   */
  @javax.annotation.Nullable
  public AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols getOriginSslProtocols() {
    return originSslProtocols;
  }

  public void setOriginSslProtocols(AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols originSslProtocols) {
    this.originSslProtocols = originSslProtocols;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCloudFrontDistributionOriginCustomOriginConfig awsCloudFrontDistributionOriginCustomOriginConfig = (AwsCloudFrontDistributionOriginCustomOriginConfig) o;
    return Objects.equals(this.httpPort, awsCloudFrontDistributionOriginCustomOriginConfig.httpPort) &&
        Objects.equals(this.httpsPort, awsCloudFrontDistributionOriginCustomOriginConfig.httpsPort) &&
        Objects.equals(this.originKeepaliveTimeout, awsCloudFrontDistributionOriginCustomOriginConfig.originKeepaliveTimeout) &&
        Objects.equals(this.originProtocolPolicy, awsCloudFrontDistributionOriginCustomOriginConfig.originProtocolPolicy) &&
        Objects.equals(this.originReadTimeout, awsCloudFrontDistributionOriginCustomOriginConfig.originReadTimeout) &&
        Objects.equals(this.originSslProtocols, awsCloudFrontDistributionOriginCustomOriginConfig.originSslProtocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpPort, httpsPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSslProtocols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCloudFrontDistributionOriginCustomOriginConfig {\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    originKeepaliveTimeout: ").append(toIndentedString(originKeepaliveTimeout)).append("\n");
    sb.append("    originProtocolPolicy: ").append(toIndentedString(originProtocolPolicy)).append("\n");
    sb.append("    originReadTimeout: ").append(toIndentedString(originReadTimeout)).append("\n");
    sb.append("    originSslProtocols: ").append(toIndentedString(originSslProtocols)).append("\n");
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
    openapiFields.add("HttpPort");
    openapiFields.add("HttpsPort");
    openapiFields.add("OriginKeepaliveTimeout");
    openapiFields.add("OriginProtocolPolicy");
    openapiFields.add("OriginReadTimeout");
    openapiFields.add("OriginSslProtocols");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsCloudFrontDistributionOriginCustomOriginConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsCloudFrontDistributionOriginCustomOriginConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsCloudFrontDistributionOriginCustomOriginConfig is not found in the empty JSON string", AwsCloudFrontDistributionOriginCustomOriginConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsCloudFrontDistributionOriginCustomOriginConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsCloudFrontDistributionOriginCustomOriginConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `HttpPort`
      if (jsonObj.get("HttpPort") != null && !jsonObj.get("HttpPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HttpPort"));
      }
      // validate the optional field `HttpsPort`
      if (jsonObj.get("HttpsPort") != null && !jsonObj.get("HttpsPort").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HttpsPort"));
      }
      // validate the optional field `OriginKeepaliveTimeout`
      if (jsonObj.get("OriginKeepaliveTimeout") != null && !jsonObj.get("OriginKeepaliveTimeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OriginKeepaliveTimeout"));
      }
      // validate the optional field `OriginProtocolPolicy`
      if (jsonObj.get("OriginProtocolPolicy") != null && !jsonObj.get("OriginProtocolPolicy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OriginProtocolPolicy"));
      }
      // validate the optional field `OriginReadTimeout`
      if (jsonObj.get("OriginReadTimeout") != null && !jsonObj.get("OriginReadTimeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OriginReadTimeout"));
      }
      // validate the optional field `OriginSslProtocols`
      if (jsonObj.get("OriginSslProtocols") != null && !jsonObj.get("OriginSslProtocols").isJsonNull()) {
        AwsCloudFrontDistributionOriginCustomOriginConfigOriginSslProtocols.validateJsonElement(jsonObj.get("OriginSslProtocols"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsCloudFrontDistributionOriginCustomOriginConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsCloudFrontDistributionOriginCustomOriginConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsCloudFrontDistributionOriginCustomOriginConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsCloudFrontDistributionOriginCustomOriginConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsCloudFrontDistributionOriginCustomOriginConfig>() {
           @Override
           public void write(JsonWriter out, AwsCloudFrontDistributionOriginCustomOriginConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsCloudFrontDistributionOriginCustomOriginConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsCloudFrontDistributionOriginCustomOriginConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsCloudFrontDistributionOriginCustomOriginConfig
   * @throws IOException if the JSON string is invalid with respect to AwsCloudFrontDistributionOriginCustomOriginConfig
   */
  public static AwsCloudFrontDistributionOriginCustomOriginConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsCloudFrontDistributionOriginCustomOriginConfig.class);
  }

  /**
   * Convert an instance of AwsCloudFrontDistributionOriginCustomOriginConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

