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
 * AwsElbLoadBalancerDetailsHealthCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsElbLoadBalancerDetailsHealthCheck {
  public static final String SERIALIZED_NAME_HEALTHY_THRESHOLD = "HealthyThreshold";
  @SerializedName(SERIALIZED_NAME_HEALTHY_THRESHOLD)
  private Integer healthyThreshold;

  public static final String SERIALIZED_NAME_INTERVAL = "Interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Integer interval;

  public static final String SERIALIZED_NAME_TARGET = "Target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_UNHEALTHY_THRESHOLD = "UnhealthyThreshold";
  @SerializedName(SERIALIZED_NAME_UNHEALTHY_THRESHOLD)
  private Integer unhealthyThreshold;

  public AwsElbLoadBalancerDetailsHealthCheck() {
  }

  public AwsElbLoadBalancerDetailsHealthCheck healthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

  /**
   * Get healthyThreshold
   * @return healthyThreshold
   */
  @javax.annotation.Nullable
  public Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }


  public AwsElbLoadBalancerDetailsHealthCheck interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @javax.annotation.Nullable
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  public AwsElbLoadBalancerDetailsHealthCheck target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public AwsElbLoadBalancerDetailsHealthCheck timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
   */
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public AwsElbLoadBalancerDetailsHealthCheck unhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
    return this;
  }

  /**
   * Get unhealthyThreshold
   * @return unhealthyThreshold
   */
  @javax.annotation.Nullable
  public Integer getUnhealthyThreshold() {
    return unhealthyThreshold;
  }

  public void setUnhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsElbLoadBalancerDetailsHealthCheck awsElbLoadBalancerDetailsHealthCheck = (AwsElbLoadBalancerDetailsHealthCheck) o;
    return Objects.equals(this.healthyThreshold, awsElbLoadBalancerDetailsHealthCheck.healthyThreshold) &&
        Objects.equals(this.interval, awsElbLoadBalancerDetailsHealthCheck.interval) &&
        Objects.equals(this.target, awsElbLoadBalancerDetailsHealthCheck.target) &&
        Objects.equals(this.timeout, awsElbLoadBalancerDetailsHealthCheck.timeout) &&
        Objects.equals(this.unhealthyThreshold, awsElbLoadBalancerDetailsHealthCheck.unhealthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthyThreshold, interval, target, timeout, unhealthyThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsElbLoadBalancerDetailsHealthCheck {\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    unhealthyThreshold: ").append(toIndentedString(unhealthyThreshold)).append("\n");
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
    openapiFields.add("HealthyThreshold");
    openapiFields.add("Interval");
    openapiFields.add("Target");
    openapiFields.add("Timeout");
    openapiFields.add("UnhealthyThreshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsElbLoadBalancerDetailsHealthCheck
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsElbLoadBalancerDetailsHealthCheck.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsElbLoadBalancerDetailsHealthCheck is not found in the empty JSON string", AwsElbLoadBalancerDetailsHealthCheck.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsElbLoadBalancerDetailsHealthCheck.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsElbLoadBalancerDetailsHealthCheck` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `HealthyThreshold`
      if (jsonObj.get("HealthyThreshold") != null && !jsonObj.get("HealthyThreshold").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HealthyThreshold"));
      }
      // validate the optional field `Interval`
      if (jsonObj.get("Interval") != null && !jsonObj.get("Interval").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Interval"));
      }
      // validate the optional field `Target`
      if (jsonObj.get("Target") != null && !jsonObj.get("Target").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Target"));
      }
      // validate the optional field `Timeout`
      if (jsonObj.get("Timeout") != null && !jsonObj.get("Timeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Timeout"));
      }
      // validate the optional field `UnhealthyThreshold`
      if (jsonObj.get("UnhealthyThreshold") != null && !jsonObj.get("UnhealthyThreshold").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("UnhealthyThreshold"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsElbLoadBalancerDetailsHealthCheck.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsElbLoadBalancerDetailsHealthCheck' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsElbLoadBalancerDetailsHealthCheck> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsElbLoadBalancerDetailsHealthCheck.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsElbLoadBalancerDetailsHealthCheck>() {
           @Override
           public void write(JsonWriter out, AwsElbLoadBalancerDetailsHealthCheck value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsElbLoadBalancerDetailsHealthCheck read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsElbLoadBalancerDetailsHealthCheck given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsElbLoadBalancerDetailsHealthCheck
   * @throws IOException if the JSON string is invalid with respect to AwsElbLoadBalancerDetailsHealthCheck
   */
  public static AwsElbLoadBalancerDetailsHealthCheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsElbLoadBalancerDetailsHealthCheck.class);
  }

  /**
   * Convert an instance of AwsElbLoadBalancerDetailsHealthCheck to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

