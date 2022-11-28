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
import org.openapitools.client.model.AwsElbv2LoadBalancerDetailsState;

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
 * ResourceDetailsAwsElbv2LoadBalancer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:47.881442-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsElbv2LoadBalancer {
  public static final String SERIALIZED_NAME_AVAILABILITY_ZONES = "AvailabilityZones";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONES)
  private List availabilityZones;

  public static final String SERIALIZED_NAME_CANONICAL_HOSTED_ZONE_ID = "CanonicalHostedZoneId";
  @SerializedName(SERIALIZED_NAME_CANONICAL_HOSTED_ZONE_ID)
  private String canonicalHostedZoneId;

  public static final String SERIALIZED_NAME_CREATED_TIME = "CreatedTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_DN_S_NAME = "DNSName";
  @SerializedName(SERIALIZED_NAME_DN_S_NAME)
  private String dnSName;

  public static final String SERIALIZED_NAME_IP_ADDRESS_TYPE = "IpAddressType";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_TYPE)
  private String ipAddressType;

  public static final String SERIALIZED_NAME_SCHEME = "Scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "SecurityGroups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List securityGroups;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private AwsElbv2LoadBalancerDetailsState state;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VPC_ID = "VpcId";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_ATTRIBUTES = "LoadBalancerAttributes";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_ATTRIBUTES)
  private List loadBalancerAttributes;

  public ResourceDetailsAwsElbv2LoadBalancer() {
  }

  public ResourceDetailsAwsElbv2LoadBalancer availabilityZones(List availabilityZones) {
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


  public ResourceDetailsAwsElbv2LoadBalancer canonicalHostedZoneId(String canonicalHostedZoneId) {
    this.canonicalHostedZoneId = canonicalHostedZoneId;
    return this;
  }

  /**
   * Get canonicalHostedZoneId
   * @return canonicalHostedZoneId
   */
  @javax.annotation.Nullable
  public String getCanonicalHostedZoneId() {
    return canonicalHostedZoneId;
  }

  public void setCanonicalHostedZoneId(String canonicalHostedZoneId) {
    this.canonicalHostedZoneId = canonicalHostedZoneId;
  }


  public ResourceDetailsAwsElbv2LoadBalancer createdTime(String createdTime) {
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


  public ResourceDetailsAwsElbv2LoadBalancer dnSName(String dnSName) {
    this.dnSName = dnSName;
    return this;
  }

  /**
   * Get dnSName
   * @return dnSName
   */
  @javax.annotation.Nullable
  public String getDnSName() {
    return dnSName;
  }

  public void setDnSName(String dnSName) {
    this.dnSName = dnSName;
  }


  public ResourceDetailsAwsElbv2LoadBalancer ipAddressType(String ipAddressType) {
    this.ipAddressType = ipAddressType;
    return this;
  }

  /**
   * Get ipAddressType
   * @return ipAddressType
   */
  @javax.annotation.Nullable
  public String getIpAddressType() {
    return ipAddressType;
  }

  public void setIpAddressType(String ipAddressType) {
    this.ipAddressType = ipAddressType;
  }


  public ResourceDetailsAwsElbv2LoadBalancer scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Get scheme
   * @return scheme
   */
  @javax.annotation.Nullable
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ResourceDetailsAwsElbv2LoadBalancer securityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  /**
   * Get securityGroups
   * @return securityGroups
   */
  @javax.annotation.Nullable
  public List getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List securityGroups) {
    this.securityGroups = securityGroups;
  }


  public ResourceDetailsAwsElbv2LoadBalancer state(AwsElbv2LoadBalancerDetailsState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public AwsElbv2LoadBalancerDetailsState getState() {
    return state;
  }

  public void setState(AwsElbv2LoadBalancerDetailsState state) {
    this.state = state;
  }


  public ResourceDetailsAwsElbv2LoadBalancer type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public ResourceDetailsAwsElbv2LoadBalancer vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * Get vpcId
   * @return vpcId
   */
  @javax.annotation.Nullable
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public ResourceDetailsAwsElbv2LoadBalancer loadBalancerAttributes(List loadBalancerAttributes) {
    this.loadBalancerAttributes = loadBalancerAttributes;
    return this;
  }

  /**
   * Get loadBalancerAttributes
   * @return loadBalancerAttributes
   */
  @javax.annotation.Nullable
  public List getLoadBalancerAttributes() {
    return loadBalancerAttributes;
  }

  public void setLoadBalancerAttributes(List loadBalancerAttributes) {
    this.loadBalancerAttributes = loadBalancerAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsElbv2LoadBalancer resourceDetailsAwsElbv2LoadBalancer = (ResourceDetailsAwsElbv2LoadBalancer) o;
    return Objects.equals(this.availabilityZones, resourceDetailsAwsElbv2LoadBalancer.availabilityZones) &&
        Objects.equals(this.canonicalHostedZoneId, resourceDetailsAwsElbv2LoadBalancer.canonicalHostedZoneId) &&
        Objects.equals(this.createdTime, resourceDetailsAwsElbv2LoadBalancer.createdTime) &&
        Objects.equals(this.dnSName, resourceDetailsAwsElbv2LoadBalancer.dnSName) &&
        Objects.equals(this.ipAddressType, resourceDetailsAwsElbv2LoadBalancer.ipAddressType) &&
        Objects.equals(this.scheme, resourceDetailsAwsElbv2LoadBalancer.scheme) &&
        Objects.equals(this.securityGroups, resourceDetailsAwsElbv2LoadBalancer.securityGroups) &&
        Objects.equals(this.state, resourceDetailsAwsElbv2LoadBalancer.state) &&
        Objects.equals(this.type, resourceDetailsAwsElbv2LoadBalancer.type) &&
        Objects.equals(this.vpcId, resourceDetailsAwsElbv2LoadBalancer.vpcId) &&
        Objects.equals(this.loadBalancerAttributes, resourceDetailsAwsElbv2LoadBalancer.loadBalancerAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZones, canonicalHostedZoneId, createdTime, dnSName, ipAddressType, scheme, securityGroups, state, type, vpcId, loadBalancerAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsElbv2LoadBalancer {\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    canonicalHostedZoneId: ").append(toIndentedString(canonicalHostedZoneId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    dnSName: ").append(toIndentedString(dnSName)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    loadBalancerAttributes: ").append(toIndentedString(loadBalancerAttributes)).append("\n");
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
    openapiFields.add("AvailabilityZones");
    openapiFields.add("CanonicalHostedZoneId");
    openapiFields.add("CreatedTime");
    openapiFields.add("DNSName");
    openapiFields.add("IpAddressType");
    openapiFields.add("Scheme");
    openapiFields.add("SecurityGroups");
    openapiFields.add("State");
    openapiFields.add("Type");
    openapiFields.add("VpcId");
    openapiFields.add("LoadBalancerAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsElbv2LoadBalancer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsElbv2LoadBalancer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsElbv2LoadBalancer is not found in the empty JSON string", ResourceDetailsAwsElbv2LoadBalancer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsElbv2LoadBalancer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsElbv2LoadBalancer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AvailabilityZones`
      if (jsonObj.get("AvailabilityZones") != null && !jsonObj.get("AvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("AvailabilityZones"));
      }
      // validate the optional field `CanonicalHostedZoneId`
      if (jsonObj.get("CanonicalHostedZoneId") != null && !jsonObj.get("CanonicalHostedZoneId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CanonicalHostedZoneId"));
      }
      // validate the optional field `CreatedTime`
      if (jsonObj.get("CreatedTime") != null && !jsonObj.get("CreatedTime").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CreatedTime"));
      }
      // validate the optional field `DNSName`
      if (jsonObj.get("DNSName") != null && !jsonObj.get("DNSName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DNSName"));
      }
      // validate the optional field `IpAddressType`
      if (jsonObj.get("IpAddressType") != null && !jsonObj.get("IpAddressType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IpAddressType"));
      }
      // validate the optional field `Scheme`
      if (jsonObj.get("Scheme") != null && !jsonObj.get("Scheme").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Scheme"));
      }
      // validate the optional field `SecurityGroups`
      if (jsonObj.get("SecurityGroups") != null && !jsonObj.get("SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroups"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        AwsElbv2LoadBalancerDetailsState.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `Type`
      if (jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Type"));
      }
      // validate the optional field `VpcId`
      if (jsonObj.get("VpcId") != null && !jsonObj.get("VpcId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("VpcId"));
      }
      // validate the optional field `LoadBalancerAttributes`
      if (jsonObj.get("LoadBalancerAttributes") != null && !jsonObj.get("LoadBalancerAttributes").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("LoadBalancerAttributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsElbv2LoadBalancer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsElbv2LoadBalancer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsElbv2LoadBalancer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsElbv2LoadBalancer.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsElbv2LoadBalancer>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsElbv2LoadBalancer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsElbv2LoadBalancer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsElbv2LoadBalancer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsElbv2LoadBalancer
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsElbv2LoadBalancer
   */
  public static ResourceDetailsAwsElbv2LoadBalancer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsElbv2LoadBalancer.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsElbv2LoadBalancer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

