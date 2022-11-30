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
 * ResourceDetailsAwsEc2VpcEndpointService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:07.848040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2VpcEndpointService {
  public static final String SERIALIZED_NAME_ACCEPTANCE_REQUIRED = "AcceptanceRequired";
  @SerializedName(SERIALIZED_NAME_ACCEPTANCE_REQUIRED)
  private Boolean acceptanceRequired;

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_BASE_ENDPOINT_DNS_NAMES = "BaseEndpointDnsNames";
  @SerializedName(SERIALIZED_NAME_BASE_ENDPOINT_DNS_NAMES)
  private List baseEndpointDnsNames;

  public static final String SERIALIZED_NAME_MANAGES_VPC_ENDPOINTS = "ManagesVpcEndpoints";
  @SerializedName(SERIALIZED_NAME_MANAGES_VPC_ENDPOINTS)
  private Boolean managesVpcEndpoints;

  public static final String SERIALIZED_NAME_GATEWAY_LOAD_BALANCER_ARNS = "GatewayLoadBalancerArns";
  @SerializedName(SERIALIZED_NAME_GATEWAY_LOAD_BALANCER_ARNS)
  private List gatewayLoadBalancerArns;

  public static final String SERIALIZED_NAME_NETWORK_LOAD_BALANCER_ARNS = "NetworkLoadBalancerArns";
  @SerializedName(SERIALIZED_NAME_NETWORK_LOAD_BALANCER_ARNS)
  private List networkLoadBalancerArns;

  public static final String SERIALIZED_NAME_PRIVATE_DNS_NAME = "PrivateDnsName";
  @SerializedName(SERIALIZED_NAME_PRIVATE_DNS_NAME)
  private String privateDnsName;

  public static final String SERIALIZED_NAME_SERVICE_ID = "ServiceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "ServiceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_STATE = "ServiceState";
  @SerializedName(SERIALIZED_NAME_SERVICE_STATE)
  private String serviceState;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "ServiceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private List serviceType;

  public ResourceDetailsAwsEc2VpcEndpointService() {
  }

  public ResourceDetailsAwsEc2VpcEndpointService acceptanceRequired(Boolean acceptanceRequired) {
    this.acceptanceRequired = acceptanceRequired;
    return this;
  }

  /**
   * Get acceptanceRequired
   * @return acceptanceRequired
   */
  @javax.annotation.Nullable
  public Boolean getAcceptanceRequired() {
    return acceptanceRequired;
  }

  public void setAcceptanceRequired(Boolean acceptanceRequired) {
    this.acceptanceRequired = acceptanceRequired;
  }


  public ResourceDetailsAwsEc2VpcEndpointService availabilityZones(List availabilityZones) {
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


  public ResourceDetailsAwsEc2VpcEndpointService baseEndpointDnsNames(List baseEndpointDnsNames) {
    this.baseEndpointDnsNames = baseEndpointDnsNames;
    return this;
  }

  /**
   * Get baseEndpointDnsNames
   * @return baseEndpointDnsNames
   */
  @javax.annotation.Nullable
  public List getBaseEndpointDnsNames() {
    return baseEndpointDnsNames;
  }

  public void setBaseEndpointDnsNames(List baseEndpointDnsNames) {
    this.baseEndpointDnsNames = baseEndpointDnsNames;
  }


  public ResourceDetailsAwsEc2VpcEndpointService managesVpcEndpoints(Boolean managesVpcEndpoints) {
    this.managesVpcEndpoints = managesVpcEndpoints;
    return this;
  }

  /**
   * Get managesVpcEndpoints
   * @return managesVpcEndpoints
   */
  @javax.annotation.Nullable
  public Boolean getManagesVpcEndpoints() {
    return managesVpcEndpoints;
  }

  public void setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
    this.managesVpcEndpoints = managesVpcEndpoints;
  }


  public ResourceDetailsAwsEc2VpcEndpointService gatewayLoadBalancerArns(List gatewayLoadBalancerArns) {
    this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
    return this;
  }

  /**
   * Get gatewayLoadBalancerArns
   * @return gatewayLoadBalancerArns
   */
  @javax.annotation.Nullable
  public List getGatewayLoadBalancerArns() {
    return gatewayLoadBalancerArns;
  }

  public void setGatewayLoadBalancerArns(List gatewayLoadBalancerArns) {
    this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
  }


  public ResourceDetailsAwsEc2VpcEndpointService networkLoadBalancerArns(List networkLoadBalancerArns) {
    this.networkLoadBalancerArns = networkLoadBalancerArns;
    return this;
  }

  /**
   * Get networkLoadBalancerArns
   * @return networkLoadBalancerArns
   */
  @javax.annotation.Nullable
  public List getNetworkLoadBalancerArns() {
    return networkLoadBalancerArns;
  }

  public void setNetworkLoadBalancerArns(List networkLoadBalancerArns) {
    this.networkLoadBalancerArns = networkLoadBalancerArns;
  }


  public ResourceDetailsAwsEc2VpcEndpointService privateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
    return this;
  }

  /**
   * Get privateDnsName
   * @return privateDnsName
   */
  @javax.annotation.Nullable
  public String getPrivateDnsName() {
    return privateDnsName;
  }

  public void setPrivateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
  }


  public ResourceDetailsAwsEc2VpcEndpointService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   */
  @javax.annotation.Nullable
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public ResourceDetailsAwsEc2VpcEndpointService serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @javax.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public ResourceDetailsAwsEc2VpcEndpointService serviceState(String serviceState) {
    this.serviceState = serviceState;
    return this;
  }

  /**
   * Get serviceState
   * @return serviceState
   */
  @javax.annotation.Nullable
  public String getServiceState() {
    return serviceState;
  }

  public void setServiceState(String serviceState) {
    this.serviceState = serviceState;
  }


  public ResourceDetailsAwsEc2VpcEndpointService serviceType(List serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
   */
  @javax.annotation.Nullable
  public List getServiceType() {
    return serviceType;
  }

  public void setServiceType(List serviceType) {
    this.serviceType = serviceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2VpcEndpointService resourceDetailsAwsEc2VpcEndpointService = (ResourceDetailsAwsEc2VpcEndpointService) o;
    return Objects.equals(this.acceptanceRequired, resourceDetailsAwsEc2VpcEndpointService.acceptanceRequired) &&
        Objects.equals(this.availabilityZones, resourceDetailsAwsEc2VpcEndpointService.availabilityZones) &&
        Objects.equals(this.baseEndpointDnsNames, resourceDetailsAwsEc2VpcEndpointService.baseEndpointDnsNames) &&
        Objects.equals(this.managesVpcEndpoints, resourceDetailsAwsEc2VpcEndpointService.managesVpcEndpoints) &&
        Objects.equals(this.gatewayLoadBalancerArns, resourceDetailsAwsEc2VpcEndpointService.gatewayLoadBalancerArns) &&
        Objects.equals(this.networkLoadBalancerArns, resourceDetailsAwsEc2VpcEndpointService.networkLoadBalancerArns) &&
        Objects.equals(this.privateDnsName, resourceDetailsAwsEc2VpcEndpointService.privateDnsName) &&
        Objects.equals(this.serviceId, resourceDetailsAwsEc2VpcEndpointService.serviceId) &&
        Objects.equals(this.serviceName, resourceDetailsAwsEc2VpcEndpointService.serviceName) &&
        Objects.equals(this.serviceState, resourceDetailsAwsEc2VpcEndpointService.serviceState) &&
        Objects.equals(this.serviceType, resourceDetailsAwsEc2VpcEndpointService.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceRequired, availabilityZones, baseEndpointDnsNames, managesVpcEndpoints, gatewayLoadBalancerArns, networkLoadBalancerArns, privateDnsName, serviceId, serviceName, serviceState, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2VpcEndpointService {\n");
    sb.append("    acceptanceRequired: ").append(toIndentedString(acceptanceRequired)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    baseEndpointDnsNames: ").append(toIndentedString(baseEndpointDnsNames)).append("\n");
    sb.append("    managesVpcEndpoints: ").append(toIndentedString(managesVpcEndpoints)).append("\n");
    sb.append("    gatewayLoadBalancerArns: ").append(toIndentedString(gatewayLoadBalancerArns)).append("\n");
    sb.append("    networkLoadBalancerArns: ").append(toIndentedString(networkLoadBalancerArns)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceState: ").append(toIndentedString(serviceState)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
    openapiFields.add("AcceptanceRequired");
    openapiFields.add("AvailabilityZones");
    openapiFields.add("BaseEndpointDnsNames");
    openapiFields.add("ManagesVpcEndpoints");
    openapiFields.add("GatewayLoadBalancerArns");
    openapiFields.add("NetworkLoadBalancerArns");
    openapiFields.add("PrivateDnsName");
    openapiFields.add("ServiceId");
    openapiFields.add("ServiceName");
    openapiFields.add("ServiceState");
    openapiFields.add("ServiceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2VpcEndpointService
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2VpcEndpointService.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2VpcEndpointService is not found in the empty JSON string", ResourceDetailsAwsEc2VpcEndpointService.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2VpcEndpointService.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2VpcEndpointService` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptanceRequired`
      if (jsonObj.get("AcceptanceRequired") != null && !jsonObj.get("AcceptanceRequired").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AcceptanceRequired"));
      }
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `BaseEndpointDnsNames`
      if (jsonObj.get("BaseEndpointDnsNames") != null && !jsonObj.get("BaseEndpointDnsNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("BaseEndpointDnsNames"));
      }
      // validate the optional field `ManagesVpcEndpoints`
      if (jsonObj.get("ManagesVpcEndpoints") != null && !jsonObj.get("ManagesVpcEndpoints").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ManagesVpcEndpoints"));
      }
      // validate the optional field `GatewayLoadBalancerArns`
      if (jsonObj.get("GatewayLoadBalancerArns") != null && !jsonObj.get("GatewayLoadBalancerArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("GatewayLoadBalancerArns"));
      }
      // validate the optional field `NetworkLoadBalancerArns`
      if (jsonObj.get("NetworkLoadBalancerArns") != null && !jsonObj.get("NetworkLoadBalancerArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("NetworkLoadBalancerArns"));
      }
      // validate the optional field `PrivateDnsName`
      if (jsonObj.get("PrivateDnsName") != null && !jsonObj.get("PrivateDnsName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrivateDnsName"));
      }
      // validate the optional field `ServiceId`
      if (jsonObj.get("ServiceId") != null && !jsonObj.get("ServiceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceId"));
      }
      // validate the optional field `ServiceName`
      if (jsonObj.get("ServiceName") != null && !jsonObj.get("ServiceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceName"));
      }
      // validate the optional field `ServiceState`
      if (jsonObj.get("ServiceState") != null && !jsonObj.get("ServiceState").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServiceState"));
      }
      // validate the optional field `ServiceType`
      if (jsonObj.get("ServiceType") != null && !jsonObj.get("ServiceType").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ServiceType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2VpcEndpointService.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2VpcEndpointService' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2VpcEndpointService> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2VpcEndpointService.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2VpcEndpointService>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2VpcEndpointService value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2VpcEndpointService read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2VpcEndpointService given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2VpcEndpointService
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2VpcEndpointService
   */
  public static ResourceDetailsAwsEc2VpcEndpointService fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2VpcEndpointService.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2VpcEndpointService to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

