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
import org.openapitools.client.model.AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate;
import org.openapitools.client.model.AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy;

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
 * Provides details about an auto scaling group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsAutoScalingAutoScalingGroupDetails {
  public static final String SERIALIZED_NAME_LAUNCH_CONFIGURATION_NAME = "LaunchConfigurationName";
  @SerializedName(SERIALIZED_NAME_LAUNCH_CONFIGURATION_NAME)
  private String launchConfigurationName;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAMES = "LoadBalancerNames";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAMES)
  private List loadBalancerNames;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_TYPE = "HealthCheckType";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_TYPE)
  private String healthCheckType;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_GRACE_PERIOD = "HealthCheckGracePeriod";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_GRACE_PERIOD)
  private Integer healthCheckGracePeriod;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_MIXED_INSTANCES_POLICY = "MixedInstancesPolicy";
  @SerializedName(SERIALIZED_NAME_MIXED_INSTANCES_POLICY)
  private AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy mixedInstancesPolicy;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_LAUNCH_TEMPLATE = "LaunchTemplate";
  @SerializedName(SERIALIZED_NAME_LAUNCH_TEMPLATE)
  private AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate launchTemplate;

  public static final String SERIALIZED_NAME_CAPACITY_REBALANCE = "CapacityRebalance";
  @SerializedName(SERIALIZED_NAME_CAPACITY_REBALANCE)
  private Boolean capacityRebalance;

  public AwsAutoScalingAutoScalingGroupDetails() {
  }

  public AwsAutoScalingAutoScalingGroupDetails launchConfigurationName(String launchConfigurationName) {
    this.launchConfigurationName = launchConfigurationName;
    return this;
  }

  /**
   * Get launchConfigurationName
   * @return launchConfigurationName
   */
  @javax.annotation.Nullable
  public String getLaunchConfigurationName() {
    return launchConfigurationName;
  }

  public void setLaunchConfigurationName(String launchConfigurationName) {
    this.launchConfigurationName = launchConfigurationName;
  }


  public AwsAutoScalingAutoScalingGroupDetails loadBalancerNames(List loadBalancerNames) {
    this.loadBalancerNames = loadBalancerNames;
    return this;
  }

  /**
   * Get loadBalancerNames
   * @return loadBalancerNames
   */
  @javax.annotation.Nullable
  public List getLoadBalancerNames() {
    return loadBalancerNames;
  }

  public void setLoadBalancerNames(List loadBalancerNames) {
    this.loadBalancerNames = loadBalancerNames;
  }


  public AwsAutoScalingAutoScalingGroupDetails healthCheckType(String healthCheckType) {
    this.healthCheckType = healthCheckType;
    return this;
  }

  /**
   * Get healthCheckType
   * @return healthCheckType
   */
  @javax.annotation.Nullable
  public String getHealthCheckType() {
    return healthCheckType;
  }

  public void setHealthCheckType(String healthCheckType) {
    this.healthCheckType = healthCheckType;
  }


  public AwsAutoScalingAutoScalingGroupDetails healthCheckGracePeriod(Integer healthCheckGracePeriod) {
    this.healthCheckGracePeriod = healthCheckGracePeriod;
    return this;
  }

  /**
   * Get healthCheckGracePeriod
   * @return healthCheckGracePeriod
   */
  @javax.annotation.Nullable
  public Integer getHealthCheckGracePeriod() {
    return healthCheckGracePeriod;
  }

  public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
    this.healthCheckGracePeriod = healthCheckGracePeriod;
  }


  public AwsAutoScalingAutoScalingGroupDetails createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @javax.annotation.Nullable
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  public AwsAutoScalingAutoScalingGroupDetails mixedInstancesPolicy(AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy mixedInstancesPolicy) {
    this.mixedInstancesPolicy = mixedInstancesPolicy;
    return this;
  }

  /**
   * Get mixedInstancesPolicy
   * @return mixedInstancesPolicy
   */
  @javax.annotation.Nullable
  public AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy getMixedInstancesPolicy() {
    return mixedInstancesPolicy;
  }

  public void setMixedInstancesPolicy(AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy mixedInstancesPolicy) {
    this.mixedInstancesPolicy = mixedInstancesPolicy;
  }


  public AwsAutoScalingAutoScalingGroupDetails availabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
    return this;
  }

  /**
   * Get availabilityZones
   * @return availabilityZones
   */
  @javax.annotation.Nullable
  public List getAvailabilityZones() {
    return availabilityZones;
  }

  public void setAvailabilityZones(List availabilityZones) {
    this.availabilityZones = availabilityZones;
  }


  public AwsAutoScalingAutoScalingGroupDetails launchTemplate(AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate launchTemplate) {
    this.launchTemplate = launchTemplate;
    return this;
  }

  /**
   * Get launchTemplate
   * @return launchTemplate
   */
  @javax.annotation.Nullable
  public AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate getLaunchTemplate() {
    return launchTemplate;
  }

  public void setLaunchTemplate(AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate launchTemplate) {
    this.launchTemplate = launchTemplate;
  }


  public AwsAutoScalingAutoScalingGroupDetails capacityRebalance(Boolean capacityRebalance) {
    this.capacityRebalance = capacityRebalance;
    return this;
  }

  /**
   * Get capacityRebalance
   * @return capacityRebalance
   */
  @javax.annotation.Nullable
  public Boolean getCapacityRebalance() {
    return capacityRebalance;
  }

  public void setCapacityRebalance(Boolean capacityRebalance) {
    this.capacityRebalance = capacityRebalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAutoScalingAutoScalingGroupDetails awsAutoScalingAutoScalingGroupDetails = (AwsAutoScalingAutoScalingGroupDetails) o;
    return Objects.equals(this.launchConfigurationName, awsAutoScalingAutoScalingGroupDetails.launchConfigurationName) &&
        Objects.equals(this.loadBalancerNames, awsAutoScalingAutoScalingGroupDetails.loadBalancerNames) &&
        Objects.equals(this.healthCheckType, awsAutoScalingAutoScalingGroupDetails.healthCheckType) &&
        Objects.equals(this.healthCheckGracePeriod, awsAutoScalingAutoScalingGroupDetails.healthCheckGracePeriod) &&
        Objects.equals(this.createdTime, awsAutoScalingAutoScalingGroupDetails.createdTime) &&
        Objects.equals(this.mixedInstancesPolicy, awsAutoScalingAutoScalingGroupDetails.mixedInstancesPolicy) &&
        Objects.equals(this.availabilityZones, awsAutoScalingAutoScalingGroupDetails.availabilityZones) &&
        Objects.equals(this.launchTemplate, awsAutoScalingAutoScalingGroupDetails.launchTemplate) &&
        Objects.equals(this.capacityRebalance, awsAutoScalingAutoScalingGroupDetails.capacityRebalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchConfigurationName, loadBalancerNames, healthCheckType, healthCheckGracePeriod, createdTime, mixedInstancesPolicy, availabilityZones, launchTemplate, capacityRebalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAutoScalingAutoScalingGroupDetails {\n");
    sb.append("    launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
    sb.append("    loadBalancerNames: ").append(toIndentedString(loadBalancerNames)).append("\n");
    sb.append("    healthCheckType: ").append(toIndentedString(healthCheckType)).append("\n");
    sb.append("    healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    mixedInstancesPolicy: ").append(toIndentedString(mixedInstancesPolicy)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    launchTemplate: ").append(toIndentedString(launchTemplate)).append("\n");
    sb.append("    capacityRebalance: ").append(toIndentedString(capacityRebalance)).append("\n");
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
    openapiFields.add("LaunchConfigurationName");
    openapiFields.add("LoadBalancerNames");
    openapiFields.add("HealthCheckType");
    openapiFields.add("HealthCheckGracePeriod");
    openapiFields.add("CreatedTime");
    openapiFields.add("MixedInstancesPolicy");
    openapiFields.add("AvailabilityZones");
    openapiFields.add("LaunchTemplate");
    openapiFields.add("CapacityRebalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsAutoScalingAutoScalingGroupDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsAutoScalingAutoScalingGroupDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsAutoScalingAutoScalingGroupDetails is not found in the empty JSON string", AwsAutoScalingAutoScalingGroupDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsAutoScalingAutoScalingGroupDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsAutoScalingAutoScalingGroupDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LaunchConfigurationName`
      if (jsonObj.get("LaunchConfigurationName") != null && !jsonObj.get("LaunchConfigurationName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("LaunchConfigurationName"));
      }
      // validate the optional field `LoadBalancerNames`
      if (jsonObj.get("LoadBalancerNames") != null && !jsonObj.get("LoadBalancerNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LoadBalancerNames"));
      }
      // validate the optional field `HealthCheckType`
      if (jsonObj.get("HealthCheckType") != null && !jsonObj.get("HealthCheckType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HealthCheckType"));
      }
      // validate the optional field `HealthCheckGracePeriod`
      if (jsonObj.get("HealthCheckGracePeriod") != null && !jsonObj.get("HealthCheckGracePeriod").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HealthCheckGracePeriod"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `MixedInstancesPolicy`
      if (jsonObj.get("MixedInstancesPolicy") != null && !jsonObj.get("MixedInstancesPolicy").isJsonNull()) {
        AwsAutoScalingAutoScalingGroupDetailsMixedInstancesPolicy.validateJsonElement(jsonObj.get("MixedInstancesPolicy"));
      }
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `LaunchTemplate`
      if (jsonObj.get("LaunchTemplate") != null && !jsonObj.get("LaunchTemplate").isJsonNull()) {
        AwsAutoScalingAutoScalingGroupDetailsLaunchTemplate.validateJsonElement(jsonObj.get("LaunchTemplate"));
      }
      // validate the optional field `CapacityRebalance`
      if (jsonObj.get("CapacityRebalance") != null && !jsonObj.get("CapacityRebalance").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CapacityRebalance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsAutoScalingAutoScalingGroupDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsAutoScalingAutoScalingGroupDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsAutoScalingAutoScalingGroupDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsAutoScalingAutoScalingGroupDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsAutoScalingAutoScalingGroupDetails>() {
           @Override
           public void write(JsonWriter out, AwsAutoScalingAutoScalingGroupDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsAutoScalingAutoScalingGroupDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsAutoScalingAutoScalingGroupDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsAutoScalingAutoScalingGroupDetails
   * @throws IOException if the JSON string is invalid with respect to AwsAutoScalingAutoScalingGroupDetails
   */
  public static AwsAutoScalingAutoScalingGroupDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsAutoScalingAutoScalingGroupDetails.class);
  }

  /**
   * Convert an instance of AwsAutoScalingAutoScalingGroupDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

