/*
 * AWS Global Accelerator
 * <fullname>Global Accelerator</fullname> <p>This is the <i>Global Accelerator API Reference</i>. This guide is for developers who need detailed information about Global Accelerator API actions, data types, and errors. For more information about Global Accelerator features, see the <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html\">Global Accelerator Developer Guide</a>.</p> <p>Global Accelerator is a service in which you create <i>accelerators</i> to improve the performance of your applications for local and global users. Depending on the type of accelerator you choose, you can gain additional benefits. </p> <ul> <li> <p>By using a standard accelerator, you can improve availability of your internet applications that are used by a global audience. With a standard accelerator, Global Accelerator directs traffic to optimal endpoints over the Amazon Web Services global network. </p> </li> <li> <p>For other scenarios, you might choose a custom routing accelerator. With a custom routing accelerator, you can use application logic to directly map one or more users to a specific endpoint among many endpoints.</p> </li> </ul> <important> <p>Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example, specify <code>--region us-west-2</code> on AWS CLI commands.</p> </important> <p>By default, Global Accelerator provides you with static IP addresses that you associate with your accelerator. The static IP addresses are anycast from the Amazon Web Services edge network. For IPv4, Global Accelerator provides two static IPv4 addresses. For dual-stack, Global Accelerator provides a total of four addresses: two static IPv4 addresses and two static IPv6 addresses. With a standard accelerator for IPv4, instead of using the addresses that Global Accelerator provides, you can configure these entry points to be IPv4 addresses from your own IP address ranges that you bring toGlobal Accelerator (BYOIP). </p> <p>For a standard accelerator, they distribute incoming application traffic across multiple endpoint resources in multiple Amazon Web Services Regions , which increases the availability of your applications. Endpoints for standard accelerators can be Network Load Balancers, Application Load Balancers, Amazon EC2 instances, or Elastic IP addresses that are located in one Amazon Web Services Region or multiple Amazon Web Services Regions. For custom routing accelerators, you map traffic that arrives to the static IP addresses to specific Amazon EC2 servers in endpoints that are virtual private cloud (VPC) subnets.</p> <important> <p>The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM policies like tag-based permissions with Global Accelerator to limit the users who have permissions to delete an accelerator. For more information, see <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/access-control-manage-access-tag-policies.html\">Tag-based policies</a>.</p> </important> <p>For standard accelerators, Global Accelerator uses the Amazon Web Services global network to route traffic to the optimal regional endpoint based on health, client location, and policies that you configure. The service reacts instantly to changes in health or configuration to ensure that internet traffic from clients is always directed to healthy endpoints.</p> <p>For more information about understanding and using Global Accelerator, see the <a href=\"https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html\">Global Accelerator Developer Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2018-08-08
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
 * AllowCustomRoutingTrafficRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:24.229578-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AllowCustomRoutingTrafficRequest {
  public static final String SERIALIZED_NAME_ENDPOINT_GROUP_ARN = "EndpointGroupArn";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_GROUP_ARN)
  private String endpointGroupArn;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "EndpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_DESTINATION_ADDRESSES = "DestinationAddresses";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ADDRESSES)
  private List destinationAddresses;

  public static final String SERIALIZED_NAME_DESTINATION_PORTS = "DestinationPorts";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PORTS)
  private List destinationPorts;

  public static final String SERIALIZED_NAME_ALLOW_ALL_TRAFFIC_TO_ENDPOINT = "AllowAllTrafficToEndpoint";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_TRAFFIC_TO_ENDPOINT)
  private Boolean allowAllTrafficToEndpoint;

  public AllowCustomRoutingTrafficRequest() {
  }

  public AllowCustomRoutingTrafficRequest endpointGroupArn(String endpointGroupArn) {
    this.endpointGroupArn = endpointGroupArn;
    return this;
  }

  /**
   * Get endpointGroupArn
   * @return endpointGroupArn
   */
  @javax.annotation.Nonnull
  public String getEndpointGroupArn() {
    return endpointGroupArn;
  }

  public void setEndpointGroupArn(String endpointGroupArn) {
    this.endpointGroupArn = endpointGroupArn;
  }


  public AllowCustomRoutingTrafficRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  /**
   * Get endpointId
   * @return endpointId
   */
  @javax.annotation.Nonnull
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public AllowCustomRoutingTrafficRequest destinationAddresses(List destinationAddresses) {
    this.destinationAddresses = destinationAddresses;
    return this;
  }

  /**
   * Get destinationAddresses
   * @return destinationAddresses
   */
  @javax.annotation.Nullable
  public List getDestinationAddresses() {
    return destinationAddresses;
  }

  public void setDestinationAddresses(List destinationAddresses) {
    this.destinationAddresses = destinationAddresses;
  }


  public AllowCustomRoutingTrafficRequest destinationPorts(List destinationPorts) {
    this.destinationPorts = destinationPorts;
    return this;
  }

  /**
   * Get destinationPorts
   * @return destinationPorts
   */
  @javax.annotation.Nullable
  public List getDestinationPorts() {
    return destinationPorts;
  }

  public void setDestinationPorts(List destinationPorts) {
    this.destinationPorts = destinationPorts;
  }


  public AllowCustomRoutingTrafficRequest allowAllTrafficToEndpoint(Boolean allowAllTrafficToEndpoint) {
    this.allowAllTrafficToEndpoint = allowAllTrafficToEndpoint;
    return this;
  }

  /**
   * Get allowAllTrafficToEndpoint
   * @return allowAllTrafficToEndpoint
   */
  @javax.annotation.Nullable
  public Boolean getAllowAllTrafficToEndpoint() {
    return allowAllTrafficToEndpoint;
  }

  public void setAllowAllTrafficToEndpoint(Boolean allowAllTrafficToEndpoint) {
    this.allowAllTrafficToEndpoint = allowAllTrafficToEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest = (AllowCustomRoutingTrafficRequest) o;
    return Objects.equals(this.endpointGroupArn, allowCustomRoutingTrafficRequest.endpointGroupArn) &&
        Objects.equals(this.endpointId, allowCustomRoutingTrafficRequest.endpointId) &&
        Objects.equals(this.destinationAddresses, allowCustomRoutingTrafficRequest.destinationAddresses) &&
        Objects.equals(this.destinationPorts, allowCustomRoutingTrafficRequest.destinationPorts) &&
        Objects.equals(this.allowAllTrafficToEndpoint, allowCustomRoutingTrafficRequest.allowAllTrafficToEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointGroupArn, endpointId, destinationAddresses, destinationPorts, allowAllTrafficToEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowCustomRoutingTrafficRequest {\n");
    sb.append("    endpointGroupArn: ").append(toIndentedString(endpointGroupArn)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    destinationAddresses: ").append(toIndentedString(destinationAddresses)).append("\n");
    sb.append("    destinationPorts: ").append(toIndentedString(destinationPorts)).append("\n");
    sb.append("    allowAllTrafficToEndpoint: ").append(toIndentedString(allowAllTrafficToEndpoint)).append("\n");
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
    openapiFields.add("EndpointGroupArn");
    openapiFields.add("EndpointId");
    openapiFields.add("DestinationAddresses");
    openapiFields.add("DestinationPorts");
    openapiFields.add("AllowAllTrafficToEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("EndpointGroupArn");
    openapiRequiredFields.add("EndpointId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AllowCustomRoutingTrafficRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AllowCustomRoutingTrafficRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllowCustomRoutingTrafficRequest is not found in the empty JSON string", AllowCustomRoutingTrafficRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AllowCustomRoutingTrafficRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllowCustomRoutingTrafficRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AllowCustomRoutingTrafficRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `EndpointGroupArn`
      String.validateJsonElement(jsonObj.get("EndpointGroupArn"));
      // validate the required field `EndpointId`
      String.validateJsonElement(jsonObj.get("EndpointId"));
      // validate the optional field `DestinationAddresses`
      if (jsonObj.get("DestinationAddresses") != null && !jsonObj.get("DestinationAddresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("DestinationAddresses"));
      }
      // validate the optional field `DestinationPorts`
      if (jsonObj.get("DestinationPorts") != null && !jsonObj.get("DestinationPorts").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("DestinationPorts"));
      }
      // validate the optional field `AllowAllTrafficToEndpoint`
      if (jsonObj.get("AllowAllTrafficToEndpoint") != null && !jsonObj.get("AllowAllTrafficToEndpoint").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AllowAllTrafficToEndpoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllowCustomRoutingTrafficRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllowCustomRoutingTrafficRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllowCustomRoutingTrafficRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllowCustomRoutingTrafficRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AllowCustomRoutingTrafficRequest>() {
           @Override
           public void write(JsonWriter out, AllowCustomRoutingTrafficRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllowCustomRoutingTrafficRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AllowCustomRoutingTrafficRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AllowCustomRoutingTrafficRequest
   * @throws IOException if the JSON string is invalid with respect to AllowCustomRoutingTrafficRequest
   */
  public static AllowCustomRoutingTrafficRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllowCustomRoutingTrafficRequest.class);
  }

  /**
   * Convert an instance of AllowCustomRoutingTrafficRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

