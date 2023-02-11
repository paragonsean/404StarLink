/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.InstanceHardware;
import org.openapitools.client.model.InstanceLocation;
import org.openapitools.client.model.InstanceMetadataOptions;
import org.openapitools.client.model.InstanceNetworking;
import org.openapitools.client.model.InstanceState;
import org.openapitools.client.model.IpAddressType;
import org.openapitools.client.model.ResourceType;

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
 * GetInstanceResultInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetInstanceResultInstance {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_SUPPORT_CODE = "supportCode";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CODE)
  private String supportCode;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private InstanceLocation location;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceType resourceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_BLUEPRINT_ID = "blueprintId";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_ID)
  private String blueprintId;

  public static final String SERIALIZED_NAME_BLUEPRINT_NAME = "blueprintName";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_NAME)
  private String blueprintName;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_ADD_ONS = "addOns";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private List addOns;

  public static final String SERIALIZED_NAME_IS_STATIC_IP = "isStaticIp";
  @SerializedName(SERIALIZED_NAME_IS_STATIC_IP)
  private Boolean isStaticIp;

  public static final String SERIALIZED_NAME_PRIVATE_IP_ADDRESS = "privateIpAddress";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP_ADDRESS)
  private String privateIpAddress;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ADDRESS = "publicIpAddress";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ADDRESS)
  private String publicIpAddress;

  public static final String SERIALIZED_NAME_IPV6_ADDRESSES = "ipv6Addresses";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESSES)
  private List ipv6Addresses;

  public static final String SERIALIZED_NAME_IP_ADDRESS_TYPE = "ipAddressType";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_TYPE)
  private IpAddressType ipAddressType;

  public static final String SERIALIZED_NAME_HARDWARE = "hardware";
  @SerializedName(SERIALIZED_NAME_HARDWARE)
  private InstanceHardware hardware;

  public static final String SERIALIZED_NAME_NETWORKING = "networking";
  @SerializedName(SERIALIZED_NAME_NETWORKING)
  private InstanceNetworking networking;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private InstanceState state;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SSH_KEY_NAME = "sshKeyName";
  @SerializedName(SERIALIZED_NAME_SSH_KEY_NAME)
  private String sshKeyName;

  public static final String SERIALIZED_NAME_METADATA_OPTIONS = "metadataOptions";
  @SerializedName(SERIALIZED_NAME_METADATA_OPTIONS)
  private InstanceMetadataOptions metadataOptions;

  public GetInstanceResultInstance() {
  }

  public GetInstanceResultInstance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetInstanceResultInstance arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public GetInstanceResultInstance supportCode(String supportCode) {
    this.supportCode = supportCode;
    return this;
  }

  /**
   * Get supportCode
   * @return supportCode
   */
  @javax.annotation.Nullable
  public String getSupportCode() {
    return supportCode;
  }

  public void setSupportCode(String supportCode) {
    this.supportCode = supportCode;
  }


  public GetInstanceResultInstance createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetInstanceResultInstance location(InstanceLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public InstanceLocation getLocation() {
    return location;
  }

  public void setLocation(InstanceLocation location) {
    this.location = location;
  }


  public GetInstanceResultInstance resourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  @javax.annotation.Nullable
  public ResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public GetInstanceResultInstance tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }


  public GetInstanceResultInstance blueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
    return this;
  }

  /**
   * Get blueprintId
   * @return blueprintId
   */
  @javax.annotation.Nullable
  public String getBlueprintId() {
    return blueprintId;
  }

  public void setBlueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
  }


  public GetInstanceResultInstance blueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
    return this;
  }

  /**
   * Get blueprintName
   * @return blueprintName
   */
  @javax.annotation.Nullable
  public String getBlueprintName() {
    return blueprintName;
  }

  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
  }


  public GetInstanceResultInstance bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
   */
  @javax.annotation.Nullable
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public GetInstanceResultInstance addOns(List addOns) {
    this.addOns = addOns;
    return this;
  }

  /**
   * Get addOns
   * @return addOns
   */
  @javax.annotation.Nullable
  public List getAddOns() {
    return addOns;
  }

  public void setAddOns(List addOns) {
    this.addOns = addOns;
  }


  public GetInstanceResultInstance isStaticIp(Boolean isStaticIp) {
    this.isStaticIp = isStaticIp;
    return this;
  }

  /**
   * Get isStaticIp
   * @return isStaticIp
   */
  @javax.annotation.Nullable
  public Boolean getIsStaticIp() {
    return isStaticIp;
  }

  public void setIsStaticIp(Boolean isStaticIp) {
    this.isStaticIp = isStaticIp;
  }


  public GetInstanceResultInstance privateIpAddress(String privateIpAddress) {
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


  public GetInstanceResultInstance publicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
    return this;
  }

  /**
   * Get publicIpAddress
   * @return publicIpAddress
   */
  @javax.annotation.Nullable
  public String getPublicIpAddress() {
    return publicIpAddress;
  }

  public void setPublicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
  }


  public GetInstanceResultInstance ipv6Addresses(List ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
    return this;
  }

  /**
   * Get ipv6Addresses
   * @return ipv6Addresses
   */
  @javax.annotation.Nullable
  public List getIpv6Addresses() {
    return ipv6Addresses;
  }

  public void setIpv6Addresses(List ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
  }


  public GetInstanceResultInstance ipAddressType(IpAddressType ipAddressType) {
    this.ipAddressType = ipAddressType;
    return this;
  }

  /**
   * Get ipAddressType
   * @return ipAddressType
   */
  @javax.annotation.Nullable
  public IpAddressType getIpAddressType() {
    return ipAddressType;
  }

  public void setIpAddressType(IpAddressType ipAddressType) {
    this.ipAddressType = ipAddressType;
  }


  public GetInstanceResultInstance hardware(InstanceHardware hardware) {
    this.hardware = hardware;
    return this;
  }

  /**
   * Get hardware
   * @return hardware
   */
  @javax.annotation.Nullable
  public InstanceHardware getHardware() {
    return hardware;
  }

  public void setHardware(InstanceHardware hardware) {
    this.hardware = hardware;
  }


  public GetInstanceResultInstance networking(InstanceNetworking networking) {
    this.networking = networking;
    return this;
  }

  /**
   * Get networking
   * @return networking
   */
  @javax.annotation.Nullable
  public InstanceNetworking getNetworking() {
    return networking;
  }

  public void setNetworking(InstanceNetworking networking) {
    this.networking = networking;
  }


  public GetInstanceResultInstance state(InstanceState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public InstanceState getState() {
    return state;
  }

  public void setState(InstanceState state) {
    this.state = state;
  }


  public GetInstanceResultInstance username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public GetInstanceResultInstance sshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
    return this;
  }

  /**
   * Get sshKeyName
   * @return sshKeyName
   */
  @javax.annotation.Nullable
  public String getSshKeyName() {
    return sshKeyName;
  }

  public void setSshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
  }


  public GetInstanceResultInstance metadataOptions(InstanceMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
    return this;
  }

  /**
   * Get metadataOptions
   * @return metadataOptions
   */
  @javax.annotation.Nullable
  public InstanceMetadataOptions getMetadataOptions() {
    return metadataOptions;
  }

  public void setMetadataOptions(InstanceMetadataOptions metadataOptions) {
    this.metadataOptions = metadataOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstanceResultInstance getInstanceResultInstance = (GetInstanceResultInstance) o;
    return Objects.equals(this.name, getInstanceResultInstance.name) &&
        Objects.equals(this.arn, getInstanceResultInstance.arn) &&
        Objects.equals(this.supportCode, getInstanceResultInstance.supportCode) &&
        Objects.equals(this.createdAt, getInstanceResultInstance.createdAt) &&
        Objects.equals(this.location, getInstanceResultInstance.location) &&
        Objects.equals(this.resourceType, getInstanceResultInstance.resourceType) &&
        Objects.equals(this.tags, getInstanceResultInstance.tags) &&
        Objects.equals(this.blueprintId, getInstanceResultInstance.blueprintId) &&
        Objects.equals(this.blueprintName, getInstanceResultInstance.blueprintName) &&
        Objects.equals(this.bundleId, getInstanceResultInstance.bundleId) &&
        Objects.equals(this.addOns, getInstanceResultInstance.addOns) &&
        Objects.equals(this.isStaticIp, getInstanceResultInstance.isStaticIp) &&
        Objects.equals(this.privateIpAddress, getInstanceResultInstance.privateIpAddress) &&
        Objects.equals(this.publicIpAddress, getInstanceResultInstance.publicIpAddress) &&
        Objects.equals(this.ipv6Addresses, getInstanceResultInstance.ipv6Addresses) &&
        Objects.equals(this.ipAddressType, getInstanceResultInstance.ipAddressType) &&
        Objects.equals(this.hardware, getInstanceResultInstance.hardware) &&
        Objects.equals(this.networking, getInstanceResultInstance.networking) &&
        Objects.equals(this.state, getInstanceResultInstance.state) &&
        Objects.equals(this.username, getInstanceResultInstance.username) &&
        Objects.equals(this.sshKeyName, getInstanceResultInstance.sshKeyName) &&
        Objects.equals(this.metadataOptions, getInstanceResultInstance.metadataOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, supportCode, createdAt, location, resourceType, tags, blueprintId, blueprintName, bundleId, addOns, isStaticIp, privateIpAddress, publicIpAddress, ipv6Addresses, ipAddressType, hardware, networking, state, username, sshKeyName, metadataOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstanceResultInstance {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    supportCode: ").append(toIndentedString(supportCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    isStaticIp: ").append(toIndentedString(isStaticIp)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
    sb.append("    ipv6Addresses: ").append(toIndentedString(ipv6Addresses)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    networking: ").append(toIndentedString(networking)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sshKeyName: ").append(toIndentedString(sshKeyName)).append("\n");
    sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("arn");
    openapiFields.add("supportCode");
    openapiFields.add("createdAt");
    openapiFields.add("location");
    openapiFields.add("resourceType");
    openapiFields.add("tags");
    openapiFields.add("blueprintId");
    openapiFields.add("blueprintName");
    openapiFields.add("bundleId");
    openapiFields.add("addOns");
    openapiFields.add("isStaticIp");
    openapiFields.add("privateIpAddress");
    openapiFields.add("publicIpAddress");
    openapiFields.add("ipv6Addresses");
    openapiFields.add("ipAddressType");
    openapiFields.add("hardware");
    openapiFields.add("networking");
    openapiFields.add("state");
    openapiFields.add("username");
    openapiFields.add("sshKeyName");
    openapiFields.add("metadataOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetInstanceResultInstance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInstanceResultInstance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInstanceResultInstance is not found in the empty JSON string", GetInstanceResultInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInstanceResultInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInstanceResultInstance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `supportCode`
      if (jsonObj.get("supportCode") != null && !jsonObj.get("supportCode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("supportCode"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        InstanceLocation.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `resourceType`
      if (jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) {
        ResourceType.validateJsonElement(jsonObj.get("resourceType"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `blueprintId`
      if (jsonObj.get("blueprintId") != null && !jsonObj.get("blueprintId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("blueprintId"));
      }
      // validate the optional field `blueprintName`
      if (jsonObj.get("blueprintName") != null && !jsonObj.get("blueprintName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("blueprintName"));
      }
      // validate the optional field `bundleId`
      if (jsonObj.get("bundleId") != null && !jsonObj.get("bundleId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("bundleId"));
      }
      // validate the optional field `addOns`
      if (jsonObj.get("addOns") != null && !jsonObj.get("addOns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("addOns"));
      }
      // validate the optional field `isStaticIp`
      if (jsonObj.get("isStaticIp") != null && !jsonObj.get("isStaticIp").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isStaticIp"));
      }
      // validate the optional field `privateIpAddress`
      if (jsonObj.get("privateIpAddress") != null && !jsonObj.get("privateIpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("privateIpAddress"));
      }
      // validate the optional field `publicIpAddress`
      if (jsonObj.get("publicIpAddress") != null && !jsonObj.get("publicIpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("publicIpAddress"));
      }
      // validate the optional field `ipv6Addresses`
      if (jsonObj.get("ipv6Addresses") != null && !jsonObj.get("ipv6Addresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ipv6Addresses"));
      }
      // validate the optional field `ipAddressType`
      if (jsonObj.get("ipAddressType") != null && !jsonObj.get("ipAddressType").isJsonNull()) {
        IpAddressType.validateJsonElement(jsonObj.get("ipAddressType"));
      }
      // validate the optional field `hardware`
      if (jsonObj.get("hardware") != null && !jsonObj.get("hardware").isJsonNull()) {
        InstanceHardware.validateJsonElement(jsonObj.get("hardware"));
      }
      // validate the optional field `networking`
      if (jsonObj.get("networking") != null && !jsonObj.get("networking").isJsonNull()) {
        InstanceNetworking.validateJsonElement(jsonObj.get("networking"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        InstanceState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `username`
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("username"));
      }
      // validate the optional field `sshKeyName`
      if (jsonObj.get("sshKeyName") != null && !jsonObj.get("sshKeyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("sshKeyName"));
      }
      // validate the optional field `metadataOptions`
      if (jsonObj.get("metadataOptions") != null && !jsonObj.get("metadataOptions").isJsonNull()) {
        InstanceMetadataOptions.validateJsonElement(jsonObj.get("metadataOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInstanceResultInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInstanceResultInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInstanceResultInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInstanceResultInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInstanceResultInstance>() {
           @Override
           public void write(JsonWriter out, GetInstanceResultInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInstanceResultInstance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetInstanceResultInstance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetInstanceResultInstance
   * @throws IOException if the JSON string is invalid with respect to GetInstanceResultInstance
   */
  public static GetInstanceResultInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInstanceResultInstance.class);
  }

  /**
   * Convert an instance of GetInstanceResultInstance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

