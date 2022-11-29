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
 * Defines settings for a method for the stage.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsApiGatewayMethodSettings {
  public static final String SERIALIZED_NAME_METRICS_ENABLED = "MetricsEnabled";
  @SerializedName(SERIALIZED_NAME_METRICS_ENABLED)
  private Boolean metricsEnabled;

  public static final String SERIALIZED_NAME_LOGGING_LEVEL = "LoggingLevel";
  @SerializedName(SERIALIZED_NAME_LOGGING_LEVEL)
  private String loggingLevel;

  public static final String SERIALIZED_NAME_DATA_TRACE_ENABLED = "DataTraceEnabled";
  @SerializedName(SERIALIZED_NAME_DATA_TRACE_ENABLED)
  private Boolean dataTraceEnabled;

  public static final String SERIALIZED_NAME_THROTTLING_BURST_LIMIT = "ThrottlingBurstLimit";
  @SerializedName(SERIALIZED_NAME_THROTTLING_BURST_LIMIT)
  private Integer throttlingBurstLimit;

  public static final String SERIALIZED_NAME_THROTTLING_RATE_LIMIT = "ThrottlingRateLimit";
  @SerializedName(SERIALIZED_NAME_THROTTLING_RATE_LIMIT)
  private Double throttlingRateLimit;

  public static final String SERIALIZED_NAME_CACHING_ENABLED = "CachingEnabled";
  @SerializedName(SERIALIZED_NAME_CACHING_ENABLED)
  private Boolean cachingEnabled;

  public static final String SERIALIZED_NAME_CACHE_TTL_IN_SECONDS = "CacheTtlInSeconds";
  @SerializedName(SERIALIZED_NAME_CACHE_TTL_IN_SECONDS)
  private Integer cacheTtlInSeconds;

  public static final String SERIALIZED_NAME_CACHE_DATA_ENCRYPTED = "CacheDataEncrypted";
  @SerializedName(SERIALIZED_NAME_CACHE_DATA_ENCRYPTED)
  private Boolean cacheDataEncrypted;

  public static final String SERIALIZED_NAME_REQUIRE_AUTHORIZATION_FOR_CACHE_CONTROL = "RequireAuthorizationForCacheControl";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTHORIZATION_FOR_CACHE_CONTROL)
  private Boolean requireAuthorizationForCacheControl;

  public static final String SERIALIZED_NAME_UNAUTHORIZED_CACHE_CONTROL_HEADER_STRATEGY = "UnauthorizedCacheControlHeaderStrategy";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_CACHE_CONTROL_HEADER_STRATEGY)
  private String unauthorizedCacheControlHeaderStrategy;

  public static final String SERIALIZED_NAME_HTTP_METHOD = "HttpMethod";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private String httpMethod;

  public static final String SERIALIZED_NAME_RESOURCE_PATH = "ResourcePath";
  @SerializedName(SERIALIZED_NAME_RESOURCE_PATH)
  private String resourcePath;

  public AwsApiGatewayMethodSettings() {
  }

  public AwsApiGatewayMethodSettings metricsEnabled(Boolean metricsEnabled) {
    this.metricsEnabled = metricsEnabled;
    return this;
  }

  /**
   * Get metricsEnabled
   * @return metricsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getMetricsEnabled() {
    return metricsEnabled;
  }

  public void setMetricsEnabled(Boolean metricsEnabled) {
    this.metricsEnabled = metricsEnabled;
  }


  public AwsApiGatewayMethodSettings loggingLevel(String loggingLevel) {
    this.loggingLevel = loggingLevel;
    return this;
  }

  /**
   * Get loggingLevel
   * @return loggingLevel
   */
  @javax.annotation.Nullable
  public String getLoggingLevel() {
    return loggingLevel;
  }

  public void setLoggingLevel(String loggingLevel) {
    this.loggingLevel = loggingLevel;
  }


  public AwsApiGatewayMethodSettings dataTraceEnabled(Boolean dataTraceEnabled) {
    this.dataTraceEnabled = dataTraceEnabled;
    return this;
  }

  /**
   * Get dataTraceEnabled
   * @return dataTraceEnabled
   */
  @javax.annotation.Nullable
  public Boolean getDataTraceEnabled() {
    return dataTraceEnabled;
  }

  public void setDataTraceEnabled(Boolean dataTraceEnabled) {
    this.dataTraceEnabled = dataTraceEnabled;
  }


  public AwsApiGatewayMethodSettings throttlingBurstLimit(Integer throttlingBurstLimit) {
    this.throttlingBurstLimit = throttlingBurstLimit;
    return this;
  }

  /**
   * Get throttlingBurstLimit
   * @return throttlingBurstLimit
   */
  @javax.annotation.Nullable
  public Integer getThrottlingBurstLimit() {
    return throttlingBurstLimit;
  }

  public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
    this.throttlingBurstLimit = throttlingBurstLimit;
  }


  public AwsApiGatewayMethodSettings throttlingRateLimit(Double throttlingRateLimit) {
    this.throttlingRateLimit = throttlingRateLimit;
    return this;
  }

  /**
   * Get throttlingRateLimit
   * @return throttlingRateLimit
   */
  @javax.annotation.Nullable
  public Double getThrottlingRateLimit() {
    return throttlingRateLimit;
  }

  public void setThrottlingRateLimit(Double throttlingRateLimit) {
    this.throttlingRateLimit = throttlingRateLimit;
  }


  public AwsApiGatewayMethodSettings cachingEnabled(Boolean cachingEnabled) {
    this.cachingEnabled = cachingEnabled;
    return this;
  }

  /**
   * Get cachingEnabled
   * @return cachingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getCachingEnabled() {
    return cachingEnabled;
  }

  public void setCachingEnabled(Boolean cachingEnabled) {
    this.cachingEnabled = cachingEnabled;
  }


  public AwsApiGatewayMethodSettings cacheTtlInSeconds(Integer cacheTtlInSeconds) {
    this.cacheTtlInSeconds = cacheTtlInSeconds;
    return this;
  }

  /**
   * Get cacheTtlInSeconds
   * @return cacheTtlInSeconds
   */
  @javax.annotation.Nullable
  public Integer getCacheTtlInSeconds() {
    return cacheTtlInSeconds;
  }

  public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
    this.cacheTtlInSeconds = cacheTtlInSeconds;
  }


  public AwsApiGatewayMethodSettings cacheDataEncrypted(Boolean cacheDataEncrypted) {
    this.cacheDataEncrypted = cacheDataEncrypted;
    return this;
  }

  /**
   * Get cacheDataEncrypted
   * @return cacheDataEncrypted
   */
  @javax.annotation.Nullable
  public Boolean getCacheDataEncrypted() {
    return cacheDataEncrypted;
  }

  public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
    this.cacheDataEncrypted = cacheDataEncrypted;
  }


  public AwsApiGatewayMethodSettings requireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
    this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
    return this;
  }

  /**
   * Get requireAuthorizationForCacheControl
   * @return requireAuthorizationForCacheControl
   */
  @javax.annotation.Nullable
  public Boolean getRequireAuthorizationForCacheControl() {
    return requireAuthorizationForCacheControl;
  }

  public void setRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
    this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
  }


  public AwsApiGatewayMethodSettings unauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
    this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
    return this;
  }

  /**
   * Get unauthorizedCacheControlHeaderStrategy
   * @return unauthorizedCacheControlHeaderStrategy
   */
  @javax.annotation.Nullable
  public String getUnauthorizedCacheControlHeaderStrategy() {
    return unauthorizedCacheControlHeaderStrategy;
  }

  public void setUnauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
    this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
  }


  public AwsApiGatewayMethodSettings httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * Get httpMethod
   * @return httpMethod
   */
  @javax.annotation.Nullable
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  public AwsApiGatewayMethodSettings resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

  /**
   * Get resourcePath
   * @return resourcePath
   */
  @javax.annotation.Nullable
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsApiGatewayMethodSettings awsApiGatewayMethodSettings = (AwsApiGatewayMethodSettings) o;
    return Objects.equals(this.metricsEnabled, awsApiGatewayMethodSettings.metricsEnabled) &&
        Objects.equals(this.loggingLevel, awsApiGatewayMethodSettings.loggingLevel) &&
        Objects.equals(this.dataTraceEnabled, awsApiGatewayMethodSettings.dataTraceEnabled) &&
        Objects.equals(this.throttlingBurstLimit, awsApiGatewayMethodSettings.throttlingBurstLimit) &&
        Objects.equals(this.throttlingRateLimit, awsApiGatewayMethodSettings.throttlingRateLimit) &&
        Objects.equals(this.cachingEnabled, awsApiGatewayMethodSettings.cachingEnabled) &&
        Objects.equals(this.cacheTtlInSeconds, awsApiGatewayMethodSettings.cacheTtlInSeconds) &&
        Objects.equals(this.cacheDataEncrypted, awsApiGatewayMethodSettings.cacheDataEncrypted) &&
        Objects.equals(this.requireAuthorizationForCacheControl, awsApiGatewayMethodSettings.requireAuthorizationForCacheControl) &&
        Objects.equals(this.unauthorizedCacheControlHeaderStrategy, awsApiGatewayMethodSettings.unauthorizedCacheControlHeaderStrategy) &&
        Objects.equals(this.httpMethod, awsApiGatewayMethodSettings.httpMethod) &&
        Objects.equals(this.resourcePath, awsApiGatewayMethodSettings.resourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricsEnabled, loggingLevel, dataTraceEnabled, throttlingBurstLimit, throttlingRateLimit, cachingEnabled, cacheTtlInSeconds, cacheDataEncrypted, requireAuthorizationForCacheControl, unauthorizedCacheControlHeaderStrategy, httpMethod, resourcePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsApiGatewayMethodSettings {\n");
    sb.append("    metricsEnabled: ").append(toIndentedString(metricsEnabled)).append("\n");
    sb.append("    loggingLevel: ").append(toIndentedString(loggingLevel)).append("\n");
    sb.append("    dataTraceEnabled: ").append(toIndentedString(dataTraceEnabled)).append("\n");
    sb.append("    throttlingBurstLimit: ").append(toIndentedString(throttlingBurstLimit)).append("\n");
    sb.append("    throttlingRateLimit: ").append(toIndentedString(throttlingRateLimit)).append("\n");
    sb.append("    cachingEnabled: ").append(toIndentedString(cachingEnabled)).append("\n");
    sb.append("    cacheTtlInSeconds: ").append(toIndentedString(cacheTtlInSeconds)).append("\n");
    sb.append("    cacheDataEncrypted: ").append(toIndentedString(cacheDataEncrypted)).append("\n");
    sb.append("    requireAuthorizationForCacheControl: ").append(toIndentedString(requireAuthorizationForCacheControl)).append("\n");
    sb.append("    unauthorizedCacheControlHeaderStrategy: ").append(toIndentedString(unauthorizedCacheControlHeaderStrategy)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
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
    openapiFields.add("MetricsEnabled");
    openapiFields.add("LoggingLevel");
    openapiFields.add("DataTraceEnabled");
    openapiFields.add("ThrottlingBurstLimit");
    openapiFields.add("ThrottlingRateLimit");
    openapiFields.add("CachingEnabled");
    openapiFields.add("CacheTtlInSeconds");
    openapiFields.add("CacheDataEncrypted");
    openapiFields.add("RequireAuthorizationForCacheControl");
    openapiFields.add("UnauthorizedCacheControlHeaderStrategy");
    openapiFields.add("HttpMethod");
    openapiFields.add("ResourcePath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsApiGatewayMethodSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsApiGatewayMethodSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsApiGatewayMethodSettings is not found in the empty JSON string", AwsApiGatewayMethodSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsApiGatewayMethodSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsApiGatewayMethodSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `MetricsEnabled`
      if (jsonObj.get("MetricsEnabled") != null && !jsonObj.get("MetricsEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("MetricsEnabled"));
      }
      // validate the optional field `LoggingLevel`
      if (jsonObj.get("LoggingLevel") != null && !jsonObj.get("LoggingLevel").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LoggingLevel"));
      }
      // validate the optional field `DataTraceEnabled`
      if (jsonObj.get("DataTraceEnabled") != null && !jsonObj.get("DataTraceEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DataTraceEnabled"));
      }
      // validate the optional field `ThrottlingBurstLimit`
      if (jsonObj.get("ThrottlingBurstLimit") != null && !jsonObj.get("ThrottlingBurstLimit").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ThrottlingBurstLimit"));
      }
      // validate the optional field `ThrottlingRateLimit`
      if (jsonObj.get("ThrottlingRateLimit") != null && !jsonObj.get("ThrottlingRateLimit").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("ThrottlingRateLimit"));
      }
      // validate the optional field `CachingEnabled`
      if (jsonObj.get("CachingEnabled") != null && !jsonObj.get("CachingEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CachingEnabled"));
      }
      // validate the optional field `CacheTtlInSeconds`
      if (jsonObj.get("CacheTtlInSeconds") != null && !jsonObj.get("CacheTtlInSeconds").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("CacheTtlInSeconds"));
      }
      // validate the optional field `CacheDataEncrypted`
      if (jsonObj.get("CacheDataEncrypted") != null && !jsonObj.get("CacheDataEncrypted").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CacheDataEncrypted"));
      }
      // validate the optional field `RequireAuthorizationForCacheControl`
      if (jsonObj.get("RequireAuthorizationForCacheControl") != null && !jsonObj.get("RequireAuthorizationForCacheControl").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("RequireAuthorizationForCacheControl"));
      }
      // validate the optional field `UnauthorizedCacheControlHeaderStrategy`
      if (jsonObj.get("UnauthorizedCacheControlHeaderStrategy") != null && !jsonObj.get("UnauthorizedCacheControlHeaderStrategy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("UnauthorizedCacheControlHeaderStrategy"));
      }
      // validate the optional field `HttpMethod`
      if (jsonObj.get("HttpMethod") != null && !jsonObj.get("HttpMethod").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HttpMethod"));
      }
      // validate the optional field `ResourcePath`
      if (jsonObj.get("ResourcePath") != null && !jsonObj.get("ResourcePath").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ResourcePath"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsApiGatewayMethodSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsApiGatewayMethodSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsApiGatewayMethodSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsApiGatewayMethodSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsApiGatewayMethodSettings>() {
           @Override
           public void write(JsonWriter out, AwsApiGatewayMethodSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsApiGatewayMethodSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsApiGatewayMethodSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsApiGatewayMethodSettings
   * @throws IOException if the JSON string is invalid with respect to AwsApiGatewayMethodSettings
   */
  public static AwsApiGatewayMethodSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsApiGatewayMethodSettings.class);
  }

  /**
   * Convert an instance of AwsApiGatewayMethodSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

