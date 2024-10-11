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
import java.util.List;
import org.openapitools.client.model.IpAddressType;

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
 * SetSubnetsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:07.748801-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SetSubnetsInput {
  public static final String SERIALIZED_NAME_LOAD_BALANCER_ARN = "LoadBalancerArn";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_ARN)
  private String loadBalancerArn;

  public static final String SERIALIZED_NAME_SUBNETS = "Subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List subnets;

  public static final String SERIALIZED_NAME_SUBNET_MAPPINGS = "SubnetMappings";
  @SerializedName(SERIALIZED_NAME_SUBNET_MAPPINGS)
  private List subnetMappings;

  public static final String SERIALIZED_NAME_IP_ADDRESS_TYPE = "IpAddressType";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_TYPE)
  private IpAddressType ipAddressType;

  public SetSubnetsInput() {
  }

  public SetSubnetsInput loadBalancerArn(String loadBalancerArn) {
    this.loadBalancerArn = loadBalancerArn;
    return this;
  }

  /**
   * Get loadBalancerArn
   * @return loadBalancerArn
   */
  @javax.annotation.Nonnull
  public String getLoadBalancerArn() {
    return loadBalancerArn;
  }

  public void setLoadBalancerArn(String loadBalancerArn) {
    this.loadBalancerArn = loadBalancerArn;
  }


  public SetSubnetsInput subnets(List subnets) {
    this.subnets = subnets;
    return this;
  }

  /**
   * Get subnets
   * @return subnets
   */
  @javax.annotation.Nullable
  public List getSubnets() {
    return subnets;
  }

  public void setSubnets(List subnets) {
    this.subnets = subnets;
  }


  public SetSubnetsInput subnetMappings(List subnetMappings) {
    this.subnetMappings = subnetMappings;
    return this;
  }

  /**
   * Get subnetMappings
   * @return subnetMappings
   */
  @javax.annotation.Nullable
  public List getSubnetMappings() {
    return subnetMappings;
  }

  public void setSubnetMappings(List subnetMappings) {
    this.subnetMappings = subnetMappings;
  }


  public SetSubnetsInput ipAddressType(IpAddressType ipAddressType) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSubnetsInput setSubnetsInput = (SetSubnetsInput) o;
    return Objects.equals(this.loadBalancerArn, setSubnetsInput.loadBalancerArn) &&
        Objects.equals(this.subnets, setSubnetsInput.subnets) &&
        Objects.equals(this.subnetMappings, setSubnetsInput.subnetMappings) &&
        Objects.equals(this.ipAddressType, setSubnetsInput.ipAddressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerArn, subnets, subnetMappings, ipAddressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSubnetsInput {\n");
    sb.append("    loadBalancerArn: ").append(toIndentedString(loadBalancerArn)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    subnetMappings: ").append(toIndentedString(subnetMappings)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
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
    openapiFields.add("LoadBalancerArn");
    openapiFields.add("Subnets");
    openapiFields.add("SubnetMappings");
    openapiFields.add("IpAddressType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LoadBalancerArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SetSubnetsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetSubnetsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetSubnetsInput is not found in the empty JSON string", SetSubnetsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetSubnetsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetSubnetsInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SetSubnetsInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `LoadBalancerArn`
      String.validateJsonElement(jsonObj.get("LoadBalancerArn"));
      // validate the optional field `Subnets`
      if (jsonObj.get("Subnets") != null && !jsonObj.get("Subnets").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Subnets"));
      }
      // validate the optional field `SubnetMappings`
      if (jsonObj.get("SubnetMappings") != null && !jsonObj.get("SubnetMappings").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubnetMappings"));
      }
      // validate the optional field `IpAddressType`
      if (jsonObj.get("IpAddressType") != null && !jsonObj.get("IpAddressType").isJsonNull()) {
        IpAddressType.validateJsonElement(jsonObj.get("IpAddressType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetSubnetsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetSubnetsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetSubnetsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetSubnetsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<SetSubnetsInput>() {
           @Override
           public void write(JsonWriter out, SetSubnetsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetSubnetsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SetSubnetsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SetSubnetsInput
   * @throws IOException if the JSON string is invalid with respect to SetSubnetsInput
   */
  public static SetSubnetsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetSubnetsInput.class);
  }

  /**
   * Convert an instance of SetSubnetsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

