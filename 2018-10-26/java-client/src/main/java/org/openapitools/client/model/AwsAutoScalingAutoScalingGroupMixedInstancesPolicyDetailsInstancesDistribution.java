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
 * AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution {
  public static final String SERIALIZED_NAME_ON_DEMAND_ALLOCATION_STRATEGY = "OnDemandAllocationStrategy";
  @SerializedName(SERIALIZED_NAME_ON_DEMAND_ALLOCATION_STRATEGY)
  private String onDemandAllocationStrategy;

  public static final String SERIALIZED_NAME_ON_DEMAND_BASE_CAPACITY = "OnDemandBaseCapacity";
  @SerializedName(SERIALIZED_NAME_ON_DEMAND_BASE_CAPACITY)
  private Integer onDemandBaseCapacity;

  public static final String SERIALIZED_NAME_ON_DEMAND_PERCENTAGE_ABOVE_BASE_CAPACITY = "OnDemandPercentageAboveBaseCapacity";
  @SerializedName(SERIALIZED_NAME_ON_DEMAND_PERCENTAGE_ABOVE_BASE_CAPACITY)
  private Integer onDemandPercentageAboveBaseCapacity;

  public static final String SERIALIZED_NAME_SPOT_ALLOCATION_STRATEGY = "SpotAllocationStrategy";
  @SerializedName(SERIALIZED_NAME_SPOT_ALLOCATION_STRATEGY)
  private String spotAllocationStrategy;

  public static final String SERIALIZED_NAME_SPOT_INSTANCE_POOLS = "SpotInstancePools";
  @SerializedName(SERIALIZED_NAME_SPOT_INSTANCE_POOLS)
  private Integer spotInstancePools;

  public static final String SERIALIZED_NAME_SPOT_MAX_PRICE = "SpotMaxPrice";
  @SerializedName(SERIALIZED_NAME_SPOT_MAX_PRICE)
  private String spotMaxPrice;

  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution() {
  }

  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution onDemandAllocationStrategy(String onDemandAllocationStrategy) {
    this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    return this;
  }

  /**
   * Get onDemandAllocationStrategy
   * @return onDemandAllocationStrategy
   */
  @javax.annotation.Nullable
  public String getOnDemandAllocationStrategy() {
    return onDemandAllocationStrategy;
  }

  public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
    this.onDemandAllocationStrategy = onDemandAllocationStrategy;
  }


  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution onDemandBaseCapacity(Integer onDemandBaseCapacity) {
    this.onDemandBaseCapacity = onDemandBaseCapacity;
    return this;
  }

  /**
   * Get onDemandBaseCapacity
   * @return onDemandBaseCapacity
   */
  @javax.annotation.Nullable
  public Integer getOnDemandBaseCapacity() {
    return onDemandBaseCapacity;
  }

  public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
    this.onDemandBaseCapacity = onDemandBaseCapacity;
  }


  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
    this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    return this;
  }

  /**
   * Get onDemandPercentageAboveBaseCapacity
   * @return onDemandPercentageAboveBaseCapacity
   */
  @javax.annotation.Nullable
  public Integer getOnDemandPercentageAboveBaseCapacity() {
    return onDemandPercentageAboveBaseCapacity;
  }

  public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
    this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
  }


  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution spotAllocationStrategy(String spotAllocationStrategy) {
    this.spotAllocationStrategy = spotAllocationStrategy;
    return this;
  }

  /**
   * Get spotAllocationStrategy
   * @return spotAllocationStrategy
   */
  @javax.annotation.Nullable
  public String getSpotAllocationStrategy() {
    return spotAllocationStrategy;
  }

  public void setSpotAllocationStrategy(String spotAllocationStrategy) {
    this.spotAllocationStrategy = spotAllocationStrategy;
  }


  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution spotInstancePools(Integer spotInstancePools) {
    this.spotInstancePools = spotInstancePools;
    return this;
  }

  /**
   * Get spotInstancePools
   * @return spotInstancePools
   */
  @javax.annotation.Nullable
  public Integer getSpotInstancePools() {
    return spotInstancePools;
  }

  public void setSpotInstancePools(Integer spotInstancePools) {
    this.spotInstancePools = spotInstancePools;
  }


  public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution spotMaxPrice(String spotMaxPrice) {
    this.spotMaxPrice = spotMaxPrice;
    return this;
  }

  /**
   * Get spotMaxPrice
   * @return spotMaxPrice
   */
  @javax.annotation.Nullable
  public String getSpotMaxPrice() {
    return spotMaxPrice;
  }

  public void setSpotMaxPrice(String spotMaxPrice) {
    this.spotMaxPrice = spotMaxPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution = (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution) o;
    return Objects.equals(this.onDemandAllocationStrategy, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.onDemandAllocationStrategy) &&
        Objects.equals(this.onDemandBaseCapacity, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.onDemandBaseCapacity) &&
        Objects.equals(this.onDemandPercentageAboveBaseCapacity, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.onDemandPercentageAboveBaseCapacity) &&
        Objects.equals(this.spotAllocationStrategy, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.spotAllocationStrategy) &&
        Objects.equals(this.spotInstancePools, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.spotInstancePools) &&
        Objects.equals(this.spotMaxPrice, awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.spotMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onDemandAllocationStrategy, onDemandBaseCapacity, onDemandPercentageAboveBaseCapacity, spotAllocationStrategy, spotInstancePools, spotMaxPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution {\n");
    sb.append("    onDemandAllocationStrategy: ").append(toIndentedString(onDemandAllocationStrategy)).append("\n");
    sb.append("    onDemandBaseCapacity: ").append(toIndentedString(onDemandBaseCapacity)).append("\n");
    sb.append("    onDemandPercentageAboveBaseCapacity: ").append(toIndentedString(onDemandPercentageAboveBaseCapacity)).append("\n");
    sb.append("    spotAllocationStrategy: ").append(toIndentedString(spotAllocationStrategy)).append("\n");
    sb.append("    spotInstancePools: ").append(toIndentedString(spotInstancePools)).append("\n");
    sb.append("    spotMaxPrice: ").append(toIndentedString(spotMaxPrice)).append("\n");
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
    openapiFields.add("OnDemandAllocationStrategy");
    openapiFields.add("OnDemandBaseCapacity");
    openapiFields.add("OnDemandPercentageAboveBaseCapacity");
    openapiFields.add("SpotAllocationStrategy");
    openapiFields.add("SpotInstancePools");
    openapiFields.add("SpotMaxPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution is not found in the empty JSON string", AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OnDemandAllocationStrategy`
      if (jsonObj.get("OnDemandAllocationStrategy") != null && !jsonObj.get("OnDemandAllocationStrategy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OnDemandAllocationStrategy"));
      }
      // validate the optional field `OnDemandBaseCapacity`
      if (jsonObj.get("OnDemandBaseCapacity") != null && !jsonObj.get("OnDemandBaseCapacity").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OnDemandBaseCapacity"));
      }
      // validate the optional field `OnDemandPercentageAboveBaseCapacity`
      if (jsonObj.get("OnDemandPercentageAboveBaseCapacity") != null && !jsonObj.get("OnDemandPercentageAboveBaseCapacity").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("OnDemandPercentageAboveBaseCapacity"));
      }
      // validate the optional field `SpotAllocationStrategy`
      if (jsonObj.get("SpotAllocationStrategy") != null && !jsonObj.get("SpotAllocationStrategy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SpotAllocationStrategy"));
      }
      // validate the optional field `SpotInstancePools`
      if (jsonObj.get("SpotInstancePools") != null && !jsonObj.get("SpotInstancePools").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("SpotInstancePools"));
      }
      // validate the optional field `SpotMaxPrice`
      if (jsonObj.get("SpotMaxPrice") != null && !jsonObj.get("SpotMaxPrice").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SpotMaxPrice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution>() {
           @Override
           public void write(JsonWriter out, AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution
   * @throws IOException if the JSON string is invalid with respect to AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution
   */
  public static AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution.class);
  }

  /**
   * Convert an instance of AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsInstancesDistribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

