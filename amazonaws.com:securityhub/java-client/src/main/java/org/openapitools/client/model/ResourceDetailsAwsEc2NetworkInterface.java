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
import org.openapitools.client.model.AwsEc2NetworkInterfaceDetailsAttachment;

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
 * ResourceDetailsAwsEc2NetworkInterface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:13.081466-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ResourceDetailsAwsEc2NetworkInterface {
  public static final String SERIALIZED_NAME_ATTACHMENT = "Attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private AwsEc2NetworkInterfaceDetailsAttachment attachment;

  public static final String SERIALIZED_NAME_NETWORK_INTERFACE_ID = "NetworkInterfaceId";
  @SerializedName(SERIALIZED_NAME_NETWORK_INTERFACE_ID)
  private String networkInterfaceId;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "SecurityGroups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List securityGroups;

  public static final String SERIALIZED_NAME_SOURCE_DEST_CHECK = "SourceDestCheck";
  @SerializedName(SERIALIZED_NAME_SOURCE_DEST_CHECK)
  private Boolean sourceDestCheck;

  public static final String SERIALIZED_NAME_IP_V6_ADDRESSES = "IpV6Addresses";
  @SerializedName(SERIALIZED_NAME_IP_V6_ADDRESSES)
  private List ipV6Addresses;

  public static final String SERIALIZED_NAME_PRIVATE_IP_ADDRESSES = "PrivateIpAddresses";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP_ADDRESSES)
  private List privateIpAddresses;

  public static final String SERIALIZED_NAME_PUBLIC_DNS_NAME = "PublicDnsName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DNS_NAME)
  private String publicDnsName;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public ResourceDetailsAwsEc2NetworkInterface() {
  }

  public ResourceDetailsAwsEc2NetworkInterface attachment(AwsEc2NetworkInterfaceDetailsAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public AwsEc2NetworkInterfaceDetailsAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(AwsEc2NetworkInterfaceDetailsAttachment attachment) {
    this.attachment = attachment;
  }


  public ResourceDetailsAwsEc2NetworkInterface networkInterfaceId(String networkInterfaceId) {
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


  public ResourceDetailsAwsEc2NetworkInterface securityGroups(List securityGroups) {
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


  public ResourceDetailsAwsEc2NetworkInterface sourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
    return this;
  }

  /**
   * Get sourceDestCheck
   * @return sourceDestCheck
   */
  @javax.annotation.Nullable
  public Boolean getSourceDestCheck() {
    return sourceDestCheck;
  }

  public void setSourceDestCheck(Boolean sourceDestCheck) {
    this.sourceDestCheck = sourceDestCheck;
  }


  public ResourceDetailsAwsEc2NetworkInterface ipV6Addresses(List ipV6Addresses) {
    this.ipV6Addresses = ipV6Addresses;
    return this;
  }

  /**
   * Get ipV6Addresses
   * @return ipV6Addresses
   */
  @javax.annotation.Nullable
  public List getIpV6Addresses() {
    return ipV6Addresses;
  }

  public void setIpV6Addresses(List ipV6Addresses) {
    this.ipV6Addresses = ipV6Addresses;
  }


  public ResourceDetailsAwsEc2NetworkInterface privateIpAddresses(List privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  /**
   * Get privateIpAddresses
   * @return privateIpAddresses
   */
  @javax.annotation.Nullable
  public List getPrivateIpAddresses() {
    return privateIpAddresses;
  }

  public void setPrivateIpAddresses(List privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
  }


  public ResourceDetailsAwsEc2NetworkInterface publicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
    return this;
  }

  /**
   * Get publicDnsName
   * @return publicDnsName
   */
  @javax.annotation.Nullable
  public String getPublicDnsName() {
    return publicDnsName;
  }

  public void setPublicDnsName(String publicDnsName) {
    this.publicDnsName = publicDnsName;
  }


  public ResourceDetailsAwsEc2NetworkInterface publicIp(String publicIp) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetailsAwsEc2NetworkInterface resourceDetailsAwsEc2NetworkInterface = (ResourceDetailsAwsEc2NetworkInterface) o;
    return Objects.equals(this.attachment, resourceDetailsAwsEc2NetworkInterface.attachment) &&
        Objects.equals(this.networkInterfaceId, resourceDetailsAwsEc2NetworkInterface.networkInterfaceId) &&
        Objects.equals(this.securityGroups, resourceDetailsAwsEc2NetworkInterface.securityGroups) &&
        Objects.equals(this.sourceDestCheck, resourceDetailsAwsEc2NetworkInterface.sourceDestCheck) &&
        Objects.equals(this.ipV6Addresses, resourceDetailsAwsEc2NetworkInterface.ipV6Addresses) &&
        Objects.equals(this.privateIpAddresses, resourceDetailsAwsEc2NetworkInterface.privateIpAddresses) &&
        Objects.equals(this.publicDnsName, resourceDetailsAwsEc2NetworkInterface.publicDnsName) &&
        Objects.equals(this.publicIp, resourceDetailsAwsEc2NetworkInterface.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, networkInterfaceId, securityGroups, sourceDestCheck, ipV6Addresses, privateIpAddresses, publicDnsName, publicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetailsAwsEc2NetworkInterface {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    sourceDestCheck: ").append(toIndentedString(sourceDestCheck)).append("\n");
    sb.append("    ipV6Addresses: ").append(toIndentedString(ipV6Addresses)).append("\n");
    sb.append("    privateIpAddresses: ").append(toIndentedString(privateIpAddresses)).append("\n");
    sb.append("    publicDnsName: ").append(toIndentedString(publicDnsName)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
    openapiFields.add("Attachment");
    openapiFields.add("NetworkInterfaceId");
    openapiFields.add("SecurityGroups");
    openapiFields.add("SourceDestCheck");
    openapiFields.add("IpV6Addresses");
    openapiFields.add("PrivateIpAddresses");
    openapiFields.add("PublicDnsName");
    openapiFields.add("PublicIp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResourceDetailsAwsEc2NetworkInterface
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceDetailsAwsEc2NetworkInterface.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceDetailsAwsEc2NetworkInterface is not found in the empty JSON string", ResourceDetailsAwsEc2NetworkInterface.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResourceDetailsAwsEc2NetworkInterface.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceDetailsAwsEc2NetworkInterface` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Attachment`
      if (jsonObj.get("Attachment") != null && !jsonObj.get("Attachment").isJsonNull()) {
        AwsEc2NetworkInterfaceDetailsAttachment.validateJsonElement(jsonObj.get("Attachment"));
      }
      // validate the optional field `NetworkInterfaceId`
      if (jsonObj.get("NetworkInterfaceId") != null && !jsonObj.get("NetworkInterfaceId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NetworkInterfaceId"));
      }
      // validate the optional field `SecurityGroups`
      if (jsonObj.get("SecurityGroups") != null && !jsonObj.get("SecurityGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SecurityGroups"));
      }
      // validate the optional field `SourceDestCheck`
      if (jsonObj.get("SourceDestCheck") != null && !jsonObj.get("SourceDestCheck").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("SourceDestCheck"));
      }
      // validate the optional field `IpV6Addresses`
      if (jsonObj.get("IpV6Addresses") != null && !jsonObj.get("IpV6Addresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpV6Addresses"));
      }
      // validate the optional field `PrivateIpAddresses`
      if (jsonObj.get("PrivateIpAddresses") != null && !jsonObj.get("PrivateIpAddresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PrivateIpAddresses"));
      }
      // validate the optional field `PublicDnsName`
      if (jsonObj.get("PublicDnsName") != null && !jsonObj.get("PublicDnsName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PublicDnsName"));
      }
      // validate the optional field `PublicIp`
      if (jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PublicIp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceDetailsAwsEc2NetworkInterface.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceDetailsAwsEc2NetworkInterface' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceDetailsAwsEc2NetworkInterface> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceDetailsAwsEc2NetworkInterface.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceDetailsAwsEc2NetworkInterface>() {
           @Override
           public void write(JsonWriter out, ResourceDetailsAwsEc2NetworkInterface value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceDetailsAwsEc2NetworkInterface read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResourceDetailsAwsEc2NetworkInterface given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResourceDetailsAwsEc2NetworkInterface
   * @throws IOException if the JSON string is invalid with respect to ResourceDetailsAwsEc2NetworkInterface
   */
  public static ResourceDetailsAwsEc2NetworkInterface fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceDetailsAwsEc2NetworkInterface.class);
  }

  /**
   * Convert an instance of ResourceDetailsAwsEc2NetworkInterface to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

