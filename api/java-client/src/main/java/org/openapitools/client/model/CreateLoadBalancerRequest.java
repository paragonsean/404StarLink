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
 * CreateLoadBalancerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateLoadBalancerRequest {
  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "loadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;

  public static final String SERIALIZED_NAME_INSTANCE_PORT = "instancePort";
  @SerializedName(SERIALIZED_NAME_INSTANCE_PORT)
  private Integer instancePort;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_PATH = "healthCheckPath";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_PATH)
  private String healthCheckPath;

  public static final String SERIALIZED_NAME_CERTIFICATE_NAME = "certificateName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NAME)
  private String certificateName;

  public static final String SERIALIZED_NAME_CERTIFICATE_DOMAIN_NAME = "certificateDomainName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DOMAIN_NAME)
  private String certificateDomainName;

  public static final String SERIALIZED_NAME_CERTIFICATE_ALTERNATIVE_NAMES = "certificateAlternativeNames";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ALTERNATIVE_NAMES)
  private List certificateAlternativeNames;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public static final String SERIALIZED_NAME_IP_ADDRESS_TYPE = "ipAddressType";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_TYPE)
  private IpAddressType ipAddressType;

  public static final String SERIALIZED_NAME_TLS_POLICY_NAME = "tlsPolicyName";
  @SerializedName(SERIALIZED_NAME_TLS_POLICY_NAME)
  private String tlsPolicyName;

  public CreateLoadBalancerRequest() {
  }

  public CreateLoadBalancerRequest loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

  /**
   * Get loadBalancerName
   * @return loadBalancerName
   */
  @javax.annotation.Nonnull
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }


  public CreateLoadBalancerRequest instancePort(Integer instancePort) {
    this.instancePort = instancePort;
    return this;
  }

  /**
   * Get instancePort
   * @return instancePort
   */
  @javax.annotation.Nonnull
  public Integer getInstancePort() {
    return instancePort;
  }

  public void setInstancePort(Integer instancePort) {
    this.instancePort = instancePort;
  }


  public CreateLoadBalancerRequest healthCheckPath(String healthCheckPath) {
    this.healthCheckPath = healthCheckPath;
    return this;
  }

  /**
   * Get healthCheckPath
   * @return healthCheckPath
   */
  @javax.annotation.Nullable
  public String getHealthCheckPath() {
    return healthCheckPath;
  }

  public void setHealthCheckPath(String healthCheckPath) {
    this.healthCheckPath = healthCheckPath;
  }


  public CreateLoadBalancerRequest certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

  /**
   * Get certificateName
   * @return certificateName
   */
  @javax.annotation.Nullable
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }


  public CreateLoadBalancerRequest certificateDomainName(String certificateDomainName) {
    this.certificateDomainName = certificateDomainName;
    return this;
  }

  /**
   * Get certificateDomainName
   * @return certificateDomainName
   */
  @javax.annotation.Nullable
  public String getCertificateDomainName() {
    return certificateDomainName;
  }

  public void setCertificateDomainName(String certificateDomainName) {
    this.certificateDomainName = certificateDomainName;
  }


  public CreateLoadBalancerRequest certificateAlternativeNames(List certificateAlternativeNames) {
    this.certificateAlternativeNames = certificateAlternativeNames;
    return this;
  }

  /**
   * Get certificateAlternativeNames
   * @return certificateAlternativeNames
   */
  @javax.annotation.Nullable
  public List getCertificateAlternativeNames() {
    return certificateAlternativeNames;
  }

  public void setCertificateAlternativeNames(List certificateAlternativeNames) {
    this.certificateAlternativeNames = certificateAlternativeNames;
  }


  public CreateLoadBalancerRequest tags(List tags) {
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


  public CreateLoadBalancerRequest ipAddressType(IpAddressType ipAddressType) {
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


  public CreateLoadBalancerRequest tlsPolicyName(String tlsPolicyName) {
    this.tlsPolicyName = tlsPolicyName;
    return this;
  }

  /**
   * Get tlsPolicyName
   * @return tlsPolicyName
   */
  @javax.annotation.Nullable
  public String getTlsPolicyName() {
    return tlsPolicyName;
  }

  public void setTlsPolicyName(String tlsPolicyName) {
    this.tlsPolicyName = tlsPolicyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoadBalancerRequest createLoadBalancerRequest = (CreateLoadBalancerRequest) o;
    return Objects.equals(this.loadBalancerName, createLoadBalancerRequest.loadBalancerName) &&
        Objects.equals(this.instancePort, createLoadBalancerRequest.instancePort) &&
        Objects.equals(this.healthCheckPath, createLoadBalancerRequest.healthCheckPath) &&
        Objects.equals(this.certificateName, createLoadBalancerRequest.certificateName) &&
        Objects.equals(this.certificateDomainName, createLoadBalancerRequest.certificateDomainName) &&
        Objects.equals(this.certificateAlternativeNames, createLoadBalancerRequest.certificateAlternativeNames) &&
        Objects.equals(this.tags, createLoadBalancerRequest.tags) &&
        Objects.equals(this.ipAddressType, createLoadBalancerRequest.ipAddressType) &&
        Objects.equals(this.tlsPolicyName, createLoadBalancerRequest.tlsPolicyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerName, instancePort, healthCheckPath, certificateName, certificateDomainName, certificateAlternativeNames, tags, ipAddressType, tlsPolicyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoadBalancerRequest {\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    instancePort: ").append(toIndentedString(instancePort)).append("\n");
    sb.append("    healthCheckPath: ").append(toIndentedString(healthCheckPath)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateDomainName: ").append(toIndentedString(certificateDomainName)).append("\n");
    sb.append("    certificateAlternativeNames: ").append(toIndentedString(certificateAlternativeNames)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ipAddressType: ").append(toIndentedString(ipAddressType)).append("\n");
    sb.append("    tlsPolicyName: ").append(toIndentedString(tlsPolicyName)).append("\n");
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
    openapiFields.add("loadBalancerName");
    openapiFields.add("instancePort");
    openapiFields.add("healthCheckPath");
    openapiFields.add("certificateName");
    openapiFields.add("certificateDomainName");
    openapiFields.add("certificateAlternativeNames");
    openapiFields.add("tags");
    openapiFields.add("ipAddressType");
    openapiFields.add("tlsPolicyName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("loadBalancerName");
    openapiRequiredFields.add("instancePort");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateLoadBalancerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLoadBalancerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLoadBalancerRequest is not found in the empty JSON string", CreateLoadBalancerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateLoadBalancerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLoadBalancerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLoadBalancerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `loadBalancerName`
      String.validateJsonElement(jsonObj.get("loadBalancerName"));
      // validate the required field `instancePort`
      Integer.validateJsonElement(jsonObj.get("instancePort"));
      // validate the optional field `healthCheckPath`
      if (jsonObj.get("healthCheckPath") != null && !jsonObj.get("healthCheckPath").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("healthCheckPath"));
      }
      // validate the optional field `certificateName`
      if (jsonObj.get("certificateName") != null && !jsonObj.get("certificateName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("certificateName"));
      }
      // validate the optional field `certificateDomainName`
      if (jsonObj.get("certificateDomainName") != null && !jsonObj.get("certificateDomainName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("certificateDomainName"));
      }
      // validate the optional field `certificateAlternativeNames`
      if (jsonObj.get("certificateAlternativeNames") != null && !jsonObj.get("certificateAlternativeNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("certificateAlternativeNames"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `ipAddressType`
      if (jsonObj.get("ipAddressType") != null && !jsonObj.get("ipAddressType").isJsonNull()) {
        IpAddressType.validateJsonElement(jsonObj.get("ipAddressType"));
      }
      // validate the optional field `tlsPolicyName`
      if (jsonObj.get("tlsPolicyName") != null && !jsonObj.get("tlsPolicyName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("tlsPolicyName"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLoadBalancerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLoadBalancerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLoadBalancerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLoadBalancerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLoadBalancerRequest>() {
           @Override
           public void write(JsonWriter out, CreateLoadBalancerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLoadBalancerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateLoadBalancerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateLoadBalancerRequest
   * @throws IOException if the JSON string is invalid with respect to CreateLoadBalancerRequest
   */
  public static CreateLoadBalancerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLoadBalancerRequest.class);
  }

  /**
   * Convert an instance of CreateLoadBalancerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

