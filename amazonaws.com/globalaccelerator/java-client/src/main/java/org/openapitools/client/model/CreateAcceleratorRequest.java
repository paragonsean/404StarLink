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
 * CreateAcceleratorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:24.229578-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateAcceleratorRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IP_ADDRESS_TYPE = "IpAddressType";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_TYPE)
  private IpAddressType ipAddressType;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "IpAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List ipAddresses;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_TOKEN = "IdempotencyToken";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_TOKEN)
  private String idempotencyToken;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateAcceleratorRequest() {
  }

  public CreateAcceleratorRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateAcceleratorRequest ipAddressType(IpAddressType ipAddressType) {
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


  public CreateAcceleratorRequest ipAddresses(List ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * Get ipAddresses
   * @return ipAddresses
   */
  @javax.annotation.Nullable
  public List getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public CreateAcceleratorRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CreateAcceleratorRequest idempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  /**
   * Get idempotencyToken
   * @return idempotencyToken
   */
  @javax.annotation.Nonnull
  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public void setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
  }


  public CreateAcceleratorRequest tags(List tags) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAcceleratorRequest createAcceleratorRequest = (CreateAcceleratorRequest) o;
    return Objects.equals(this.name, createAcceleratorRequest.name) &&
        Objects.equals(this.ipAddressType, createAcceleratorRequest.ipAddressType) &&
        Objects.equals(this.ipAddresses, createAcceleratorRequest.ipAddresses) &&
        Objects.equals(this.enabled, createAcceleratorRequest.enabled) &&
        Objects.equals(this.idempotencyToken, createAcceleratorRequest.idempotencyToken) &&
        Objects.equals(this.tags, createAcceleratorRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ipAddressType, ipAddresses, enabled, idempotencyToken, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAcceleratorRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    idempotencyToken: ").append(toIndentedString(idempotencyToken)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("IpAddressType");
    openapiFields.add("IpAddresses");
    openapiFields.add("Enabled");
    openapiFields.add("IdempotencyToken");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("IdempotencyToken");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAcceleratorRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAcceleratorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAcceleratorRequest is not found in the empty JSON string", CreateAcceleratorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAcceleratorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAcceleratorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAcceleratorRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Name`
      String.validateJsonElement(jsonObj.get("Name"));
      // validate the optional field `IpAddressType`
      if (jsonObj.get("IpAddressType") != null && !jsonObj.get("IpAddressType").isJsonNull()) {
        IpAddressType.validateJsonElement(jsonObj.get("IpAddressType"));
      }
      // validate the optional field `IpAddresses`
      if (jsonObj.get("IpAddresses") != null && !jsonObj.get("IpAddresses").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("IpAddresses"));
      }
      // validate the optional field `Enabled`
      if (jsonObj.get("Enabled") != null && !jsonObj.get("Enabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Enabled"));
      }
      // validate the required field `IdempotencyToken`
      String.validateJsonElement(jsonObj.get("IdempotencyToken"));
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAcceleratorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAcceleratorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAcceleratorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAcceleratorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAcceleratorRequest>() {
           @Override
           public void write(JsonWriter out, CreateAcceleratorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAcceleratorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAcceleratorRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAcceleratorRequest
   * @throws IOException if the JSON string is invalid with respect to CreateAcceleratorRequest
   */
  public static CreateAcceleratorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAcceleratorRequest.class);
  }

  /**
   * Convert an instance of CreateAcceleratorRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

