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
 * Contains route settings for a stage.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsApiGatewayV2RouteSettings {
  public static final String SERIALIZED_NAME_DETAILED_METRICS_ENABLED = "DetailedMetricsEnabled";
  @SerializedName(SERIALIZED_NAME_DETAILED_METRICS_ENABLED)
  private Boolean detailedMetricsEnabled;

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

  public AwsApiGatewayV2RouteSettings() {
  }

  public AwsApiGatewayV2RouteSettings detailedMetricsEnabled(Boolean detailedMetricsEnabled) {
    this.detailedMetricsEnabled = detailedMetricsEnabled;
    return this;
  }

  /**
   * Get detailedMetricsEnabled
   * @return detailedMetricsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getDetailedMetricsEnabled() {
    return detailedMetricsEnabled;
  }

  public void setDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
    this.detailedMetricsEnabled = detailedMetricsEnabled;
  }


  public AwsApiGatewayV2RouteSettings loggingLevel(String loggingLevel) {
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


  public AwsApiGatewayV2RouteSettings dataTraceEnabled(Boolean dataTraceEnabled) {
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


  public AwsApiGatewayV2RouteSettings throttlingBurstLimit(Integer throttlingBurstLimit) {
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


  public AwsApiGatewayV2RouteSettings throttlingRateLimit(Double throttlingRateLimit) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsApiGatewayV2RouteSettings awsApiGatewayV2RouteSettings = (AwsApiGatewayV2RouteSettings) o;
    return Objects.equals(this.detailedMetricsEnabled, awsApiGatewayV2RouteSettings.detailedMetricsEnabled) &&
        Objects.equals(this.loggingLevel, awsApiGatewayV2RouteSettings.loggingLevel) &&
        Objects.equals(this.dataTraceEnabled, awsApiGatewayV2RouteSettings.dataTraceEnabled) &&
        Objects.equals(this.throttlingBurstLimit, awsApiGatewayV2RouteSettings.throttlingBurstLimit) &&
        Objects.equals(this.throttlingRateLimit, awsApiGatewayV2RouteSettings.throttlingRateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedMetricsEnabled, loggingLevel, dataTraceEnabled, throttlingBurstLimit, throttlingRateLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsApiGatewayV2RouteSettings {\n");
    sb.append("    detailedMetricsEnabled: ").append(toIndentedString(detailedMetricsEnabled)).append("\n");
    sb.append("    loggingLevel: ").append(toIndentedString(loggingLevel)).append("\n");
    sb.append("    dataTraceEnabled: ").append(toIndentedString(dataTraceEnabled)).append("\n");
    sb.append("    throttlingBurstLimit: ").append(toIndentedString(throttlingBurstLimit)).append("\n");
    sb.append("    throttlingRateLimit: ").append(toIndentedString(throttlingRateLimit)).append("\n");
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
    openapiFields.add("DetailedMetricsEnabled");
    openapiFields.add("LoggingLevel");
    openapiFields.add("DataTraceEnabled");
    openapiFields.add("ThrottlingBurstLimit");
    openapiFields.add("ThrottlingRateLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsApiGatewayV2RouteSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsApiGatewayV2RouteSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsApiGatewayV2RouteSettings is not found in the empty JSON string", AwsApiGatewayV2RouteSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsApiGatewayV2RouteSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsApiGatewayV2RouteSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DetailedMetricsEnabled`
      if (jsonObj.get("DetailedMetricsEnabled") != null && !jsonObj.get("DetailedMetricsEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DetailedMetricsEnabled"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsApiGatewayV2RouteSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsApiGatewayV2RouteSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsApiGatewayV2RouteSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsApiGatewayV2RouteSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsApiGatewayV2RouteSettings>() {
           @Override
           public void write(JsonWriter out, AwsApiGatewayV2RouteSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsApiGatewayV2RouteSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsApiGatewayV2RouteSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsApiGatewayV2RouteSettings
   * @throws IOException if the JSON string is invalid with respect to AwsApiGatewayV2RouteSettings
   */
  public static AwsApiGatewayV2RouteSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsApiGatewayV2RouteSettings.class);
  }

  /**
   * Convert an instance of AwsApiGatewayV2RouteSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

