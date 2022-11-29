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
 * ResourceDetailsAwsEc2Eip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:58.462265-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2Eip {
  public static final String SERIALIZED_NAME_INSTANCE_ID = "InstanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_ALLOCATION_ID = "AllocationId";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_ID)
  private String allocationId;

  public static final String SERIALIZED_NAME_ASSOCIATION_ID = "AssociationId";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_ID)
  private String associationId;

  public static final String SERIALIZED_NAME_DOMAIN = "Domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_PUBLIC_IPV4_POOL = "PublicIpv4Pool";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IPV4_POOL)
  private String publicIpv4Pool;

  public static final String SERIALIZED_NAME_NETWORK_BORDER_GROUP = "NetworkBorderGroup";
  @SerializedName(SERIALIZED_NAME_NETWORK_BORDER_GROUP)
  private String networkBorderGroup;

  public static final String SERIALIZED_NAME_NETWORK_INTERFACE_ID = "NetworkInterfaceId";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACE_ID)
  private String networkInterfaceId;

  public static final String SERIALIZED_NAME_NETWORK_INTERFACE_OWNER_ID = "NetworkInterfaceOwnerId";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACE_OWNER_ID)
  private String networkInterfaceOwnerId;

  public static final String SERIALIZED_NAME_PRIVATE_IP_ADDRESS = "PrivateIpAddress";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP_ADDRESS)
  private String privateIpAddress;

  public ResourceDetailsAwsEc2Eip() {
  }

  public ResourceDetailsAwsEc2Eip instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId
   * @return instanceId
   */
  @javax.annotation.Nullable
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public ResourceDetailsAwsEc2Eip publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

  /**
   * Get publicIp
   * @return publicIp
   */
  @javax.annotation.Nullable
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public ResourceDetailsAwsEc2Eip allocationId(String allocationId) {
    this.allocationId = allocationId;
    return this;
  }

  /**
   * Get allocationId
   * @return allocationId
   */
  @javax.annotation.Nullable
  public String getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(String allocationId) {
    this.allocationId = allocationId;
  }


  public ResourceDetailsAwsEc2Eip associationId(String associationId) {
    this.associationId = associationId;
    return this;
  }

  /**
   * Get associationId
   * @return associationId
   */
  @javax.annotation.Nullable
  public String getAssociationId() {
    return associationId;
  }

  public void setAssociationId(String associationId) {
    this.associationId = associationId;
  }


  public ResourceDetailsAwsEc2Eip domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
   */
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public ResourceDetailsAwsEc2Eip publicIpv4Pool(String publicIpv4Pool) {
    this.publicIpv4Pool = publicIpv4Pool;
    return this;
  }

  /**
   * Get publicIpv4Pool
   * @return publicIpv4Pool
   */
  @javax.annotation.Nullable
  public String getPublicIpv4Pool() {
    return publicIpv4Pool;
  }

  public void setPublicIpv4Pool(String publicIpv4Pool) {
    this.publicIpv4Pool = publicIpv4Pool;
  }


  public ResourceDetailsAwsEc2Eip networkBorderGroup(String networkBorderGroup) {
    this.networkBorderGroup = networkBorderGroup;
    return this;
  }

  /**
   * Get networkBorderGroup
   * @return networkBorderGroup
   */
  @javax.annotation.Nullable
  public String getNetworkBorderGroup() {
    return networkBorderGroup;
  }

  public void setNetworkBorderGroup(String networkBorderGroup) {
    this.networkBorderGroup = networkBorderGroup;
  }


  public ResourceDetailsAwsEc2Eip networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

  /**
   * Get networkInterfaceId
   * @return networkInterfaceId
   */
  @javax.annotation.Nullable
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }


  public ResourceDetailsAwsEc2Eip networkInterfaceOwnerId(String networkInterfaceOwnerId) {
    this.networkInterfaceOwnerId = networkInterfaceOwnerId;
    return this;
  }

  /**
   * Get networkInterfaceOwnerId
   * @return networkInterfaceOwnerId
   */
  @javax.annotation.Nullable
  public String getNetworkInterfaceOwnerId() {
    return networkInterfaceOwnerId;
  }

  public void setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
    this.networkInterfaceOwnerId = networkInterfaceOwnerId;
  }


  public ResourceDetailsAwsEc2Eip privateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

  /**
   * Get privateIpAddress
   * @return privateIpAddress
   */
  @javax.annotation.Nullable
  public String getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2Eip resourceDetailsAwsEc2Eip = (ResourceDetailsAwsEc2Eip) o;
    return Objects.equals(this.instanceId, resourceDetailsAwsEc2Eip.instanceId) &&
        Objects.equals(this.publicIp, resourceDetailsAwsEc2Eip.publicIp) &&
        Objects.equals(this.allocationId, resourceDetailsAwsEc2Eip.allocationId) &&
        Objects.equals(this.associationId, resourceDetailsAwsEc2Eip.associationId) &&
        Objects.equals(this.domain, resourceDetailsAwsEc2Eip.domain) &&
        Objects.equals(this.publicIpv4Pool, resourceDetailsAwsEc2Eip.publicIpv4Pool) &&
        Objects.equals(this.networkBorderGroup, resourceDetailsAwsEc2Eip.networkBorderGroup) &&
        Objects.equals(this.networkInterfaceId, resourceDetailsAwsEc2Eip.networkInterfaceId) &&
        Objects.equals(this.networkInterfaceOwnerId, resourceDetailsAwsEc2Eip.networkInterfaceOwnerId) &&
        Objects.equals(this.privateIpAddress, resourceDetailsAwsEc2Eip.privateIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, publicIp, allocationId, associationId, domain, publicIpv4Pool, networkBorderGroup, networkInterfaceId, networkInterfaceOwnerId, privateIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2Eip {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    publicIpv4Pool: ").append(toIndentedString(publicIpv4Pool)).append("\n");
    sb.append("    networkBorderGroup: ").append(toIndentedString(networkBorderGroup)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfaceOwnerId: ").append(toIndentedString(networkInterfaceOwnerId)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
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
    openapiFields.add("InstanceId");
    openapiFields.add("PublicIp");
    openapiFields.add("AllocationId");
    openapiFields.add("AssociationId");
    openapiFields.add("Domain");
    openapiFields.add("PublicIpv4Pool");
    openapiFields.add("NetworkBorderGroup");
    openapiFields.add("NetworkInterfaceId");
    openapiFields.add("NetworkInterfaceOwnerId");
    openapiFields.add("PrivateIpAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2Eip
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2Eip.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2Eip is not found in the empty JSON string", ResourceDetailsAwsEc2Eip.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2Eip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2Eip` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `InstanceId`
      if (jsonObj.get("InstanceId") != null && !jsonObj.get("InstanceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InstanceId"));
      }
      // validate the optional field `PublicIp`
      if (jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PublicIp"));
      }
      // validate the optional field `AllocationId`
      if (jsonObj.get("AllocationId") != null && !jsonObj.get("AllocationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AllocationId"));
      }
      // validate the optional field `AssociationId`
      if (jsonObj.get("AssociationId") != null && !jsonObj.get("AssociationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AssociationId"));
      }
      // validate the optional field `Domain`
      if (jsonObj.get("Domain") != null && !jsonObj.get("Domain").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Domain"));
      }
      // validate the optional field `PublicIpv4Pool`
      if (jsonObj.get("PublicIpv4Pool") != null && !jsonObj.get("PublicIpv4Pool").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PublicIpv4Pool"));
      }
      // validate the optional field `NetworkBorderGroup`
      if (jsonObj.get("NetworkBorderGroup") != null && !jsonObj.get("NetworkBorderGroup").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkBorderGroup"));
      }
      // validate the optional field `NetworkInterfaceId`
      if (jsonObj.get("NetworkInterfaceId") != null && !jsonObj.get("NetworkInterfaceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkInterfaceId"));
      }
      // validate the optional field `NetworkInterfaceOwnerId`
      if (jsonObj.get("NetworkInterfaceOwnerId") != null && !jsonObj.get("NetworkInterfaceOwnerId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkInterfaceOwnerId"));
      }
      // validate the optional field `PrivateIpAddress`
      if (jsonObj.get("PrivateIpAddress") != null && !jsonObj.get("PrivateIpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrivateIpAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2Eip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2Eip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2Eip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2Eip.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2Eip>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2Eip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2Eip read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2Eip given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2Eip
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2Eip
   */
  public static ResourceDetailsAwsEc2Eip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2Eip.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2Eip to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

