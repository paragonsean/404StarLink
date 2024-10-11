/*
 * Elastic Load Balancing
 * <fullname>Elastic Load Balancing</fullname> <p>A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase the availability of your application. The load balancer also monitors the health of its registered targets and ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic by specifying one or more listeners, which are configured with a protocol and port number for connections from clients to the load balancer. You configure a target group with a protocol and port number for connections from the load balancer to the targets, and with health check settings to be used when checking the health status of the targets.</p> <p>Elastic Load Balancing supports the following types of load balancers: Application Load Balancers, Network Load Balancers, Gateway Load Balancers, and Classic Load Balancers. This reference covers the following load balancer types:</p> <ul> <li> <p>Application Load Balancer - Operates at the application layer (layer 7) and supports HTTP and HTTPS.</p> </li> <li> <p>Network Load Balancer - Operates at the transport layer (layer 4) and supports TCP, TLS, and UDP.</p> </li> <li> <p>Gateway Load Balancer - Operates at the network layer (layer 3).</p> </li> </ul> <p>For more information, see the <a href=\"https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/\">Elastic Load Balancing User Guide</a>.</p> <p>All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat an operation, it succeeds.</p>
 *
 * The version of the OpenAPI document: 2015-12-01
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
 * Information about a static IP address for a load balancer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:07.748801-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LoadBalancerAddress {
  public static final String SERIALIZED_NAME_IP_ADDRESS = "IpAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_ALLOCATION_ID = "AllocationId";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_ID)
  private String allocationId;

  public static final String SERIALIZED_NAME_PRIVATE_I_PV4_ADDRESS = "PrivateIPv4Address";
  @SerializedName(SERIALIZED_NAME_PRIVATE_I_PV4_ADDRESS)
  private String privateIPv4Address;

  public static final String SERIALIZED_NAME_IPV6_ADDRESS = "IPv6Address";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESS)
  private String ipv6Address;

  public LoadBalancerAddress() {
  }

  public LoadBalancerAddress ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
   */
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public LoadBalancerAddress allocationId(String allocationId) {
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


  public LoadBalancerAddress privateIPv4Address(String privateIPv4Address) {
    this.privateIPv4Address = privateIPv4Address;
    return this;
  }

  /**
   * Get privateIPv4Address
   * @return privateIPv4Address
   */
  @javax.annotation.Nullable
  public String getPrivateIPv4Address() {
    return privateIPv4Address;
  }

  public void setPrivateIPv4Address(String privateIPv4Address) {
    this.privateIPv4Address = privateIPv4Address;
  }


  public LoadBalancerAddress ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
   */
  @javax.annotation.Nullable
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerAddress loadBalancerAddress = (LoadBalancerAddress) o;
    return Objects.equals(this.ipAddress, loadBalancerAddress.ipAddress) &&
        Objects.equals(this.allocationId, loadBalancerAddress.allocationId) &&
        Objects.equals(this.privateIPv4Address, loadBalancerAddress.privateIPv4Address) &&
        Objects.equals(this.ipv6Address, loadBalancerAddress.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, allocationId, privateIPv4Address, ipv6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerAddress {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    privateIPv4Address: ").append(toIndentedString(privateIPv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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
    openapiFields.add("IpAddress");
    openapiFields.add("AllocationId");
    openapiFields.add("PrivateIPv4Address");
    openapiFields.add("IPv6Address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoadBalancerAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancerAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancerAddress is not found in the empty JSON string", LoadBalancerAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancerAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancerAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `IpAddress`
      if (jsonObj.get("IpAddress") != null && !jsonObj.get("IpAddress").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IpAddress"));
      }
      // validate the optional field `AllocationId`
      if (jsonObj.get("AllocationId") != null && !jsonObj.get("AllocationId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AllocationId"));
      }
      // validate the optional field `PrivateIPv4Address`
      if (jsonObj.get("PrivateIPv4Address") != null && !jsonObj.get("PrivateIPv4Address").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrivateIPv4Address"));
      }
      // validate the optional field `IPv6Address`
      if (jsonObj.get("IPv6Address") != null && !jsonObj.get("IPv6Address").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("IPv6Address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancerAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancerAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancerAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancerAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancerAddress>() {
           @Override
           public void write(JsonWriter out, LoadBalancerAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancerAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoadBalancerAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoadBalancerAddress
   * @throws IOException if the JSON string is invalid with respect to LoadBalancerAddress
   */
  public static LoadBalancerAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancerAddress.class);
  }

  /**
   * Convert an instance of LoadBalancerAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

