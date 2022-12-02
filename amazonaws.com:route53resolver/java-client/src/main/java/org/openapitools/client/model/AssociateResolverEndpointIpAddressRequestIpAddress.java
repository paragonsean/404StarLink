/*
 * Amazon Route 53 Resolver
 * <p>When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver. By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or Elastic Load Balancing load balancers. Resolver performs recursive lookups against public name servers for all other domain names.</p> <p>You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:</p> <p> <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b> </p> <p>DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers to easily resolve domain names for Amazon Web Services resources such as EC2 instances or records in a Route 53 private hosted zone. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc\">How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p> <b>Conditionally forward queries from a VPC to resolvers on your network</b> </p> <p>You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you specified in that rule. For more information, see <a href=\"https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network\">How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p>Like Amazon VPC, Resolver is Regional. In each Region where you have VPCs, you can choose whether to forward queries from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.</p>
 *
 * The version of the OpenAPI document: 2018-04-01
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
 * AssociateResolverEndpointIpAddressRequestIpAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:05:22.281937-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AssociateResolverEndpointIpAddressRequestIpAddress {
  public static final String SERIALIZED_NAME_IP_ID = "IpId";
  @SerializedName(SERIALIZED_NAME_IP_ID)
  private String ipId;

  public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";
  @SerializedName(SERIALIZED_NAME_SUBNET_ID)
  private String subnetId;

  public static final String SERIALIZED_NAME_IP = "Ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IPV6 = "Ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private String ipv6;

  public AssociateResolverEndpointIpAddressRequestIpAddress() {
  }

  public AssociateResolverEndpointIpAddressRequestIpAddress ipId(String ipId) {
    this.ipId = ipId;
    return this;
  }

  /**
   * Get ipId
   * @return ipId
   */
  @javax.annotation.Nullable
  public String getIpId() {
    return ipId;
  }

  public void setIpId(String ipId) {
    this.ipId = ipId;
  }


  public AssociateResolverEndpointIpAddressRequestIpAddress subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * Get subnetId
   * @return subnetId
   */
  @javax.annotation.Nullable
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  public AssociateResolverEndpointIpAddressRequestIpAddress ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public AssociateResolverEndpointIpAddressRequestIpAddress ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

  /**
   * Get ipv6
   * @return ipv6
   */
  @javax.annotation.Nullable
  public String getIpv6() {
    return ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateResolverEndpointIpAddressRequestIpAddress associateResolverEndpointIpAddressRequestIpAddress = (AssociateResolverEndpointIpAddressRequestIpAddress) o;
    return Objects.equals(this.ipId, associateResolverEndpointIpAddressRequestIpAddress.ipId) &&
        Objects.equals(this.subnetId, associateResolverEndpointIpAddressRequestIpAddress.subnetId) &&
        Objects.equals(this.ip, associateResolverEndpointIpAddressRequestIpAddress.ip) &&
        Objects.equals(this.ipv6, associateResolverEndpointIpAddressRequestIpAddress.ipv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipId, subnetId, ip, ipv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateResolverEndpointIpAddressRequestIpAddress {\n");
    sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
    openapiFields.add("IpId");
    openapiFields.add("SubnetId");
    openapiFields.add("Ip");
    openapiFields.add("Ipv6");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssociateResolverEndpointIpAddressRequestIpAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssociateResolverEndpointIpAddressRequestIpAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociateResolverEndpointIpAddressRequestIpAddress is not found in the empty JSON string", AssociateResolverEndpointIpAddressRequestIpAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssociateResolverEndpointIpAddressRequestIpAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssociateResolverEndpointIpAddressRequestIpAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IpId`
      if (jsonObj.get("IpId") != null && !jsonObj.get("IpId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IpId"));
      }
      // validate the optional field `SubnetId`
      if (jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SubnetId"));
      }
      // validate the optional field `Ip`
      if (jsonObj.get("Ip") != null && !jsonObj.get("Ip").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ip"));
      }
      // validate the optional field `Ipv6`
      if (jsonObj.get("Ipv6") != null && !jsonObj.get("Ipv6").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Ipv6"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociateResolverEndpointIpAddressRequestIpAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociateResolverEndpointIpAddressRequestIpAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociateResolverEndpointIpAddressRequestIpAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociateResolverEndpointIpAddressRequestIpAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociateResolverEndpointIpAddressRequestIpAddress>() {
           @Override
           public void write(JsonWriter out, AssociateResolverEndpointIpAddressRequestIpAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssociateResolverEndpointIpAddressRequestIpAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssociateResolverEndpointIpAddressRequestIpAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssociateResolverEndpointIpAddressRequestIpAddress
   * @throws IOException if the JSON string is invalid with respect to AssociateResolverEndpointIpAddressRequestIpAddress
   */
  public static AssociateResolverEndpointIpAddressRequestIpAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociateResolverEndpointIpAddressRequestIpAddress.class);
  }

  /**
   * Convert an instance of AssociateResolverEndpointIpAddressRequestIpAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

