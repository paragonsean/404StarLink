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
 * CreateLoadBalancerTlsCertificateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateLoadBalancerTlsCertificateRequest {
  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "loadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;

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

  public CreateLoadBalancerTlsCertificateRequest() {
  }

  public CreateLoadBalancerTlsCertificateRequest loadBalancerName(String loadBalancerName) {
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


  public CreateLoadBalancerTlsCertificateRequest certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

  /**
   * Get certificateName
   * @return certificateName
   */
  @javax.annotation.Nonnull
  public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }


  public CreateLoadBalancerTlsCertificateRequest certificateDomainName(String certificateDomainName) {
    this.certificateDomainName = certificateDomainName;
    return this;
  }

  /**
   * Get certificateDomainName
   * @return certificateDomainName
   */
  @javax.annotation.Nonnull
  public String getCertificateDomainName() {
    return certificateDomainName;
  }

  public void setCertificateDomainName(String certificateDomainName) {
    this.certificateDomainName = certificateDomainName;
  }


  public CreateLoadBalancerTlsCertificateRequest certificateAlternativeNames(List certificateAlternativeNames) {
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


  public CreateLoadBalancerTlsCertificateRequest tags(List tags) {
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
    CreateLoadBalancerTlsCertificateRequest createLoadBalancerTlsCertificateRequest = (CreateLoadBalancerTlsCertificateRequest) o;
    return Objects.equals(this.loadBalancerName, createLoadBalancerTlsCertificateRequest.loadBalancerName) &&
        Objects.equals(this.certificateName, createLoadBalancerTlsCertificateRequest.certificateName) &&
        Objects.equals(this.certificateDomainName, createLoadBalancerTlsCertificateRequest.certificateDomainName) &&
        Objects.equals(this.certificateAlternativeNames, createLoadBalancerTlsCertificateRequest.certificateAlternativeNames) &&
        Objects.equals(this.tags, createLoadBalancerTlsCertificateRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerName, certificateName, certificateDomainName, certificateAlternativeNames, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoadBalancerTlsCertificateRequest {\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateDomainName: ").append(toIndentedString(certificateDomainName)).append("\n");
    sb.append("    certificateAlternativeNames: ").append(toIndentedString(certificateAlternativeNames)).append("\n");
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
    openapiFields.add("loadBalancerName");
    openapiFields.add("certificateName");
    openapiFields.add("certificateDomainName");
    openapiFields.add("certificateAlternativeNames");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("loadBalancerName");
    openapiRequiredFields.add("certificateName");
    openapiRequiredFields.add("certificateDomainName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateLoadBalancerTlsCertificateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLoadBalancerTlsCertificateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLoadBalancerTlsCertificateRequest is not found in the empty JSON string", CreateLoadBalancerTlsCertificateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateLoadBalancerTlsCertificateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLoadBalancerTlsCertificateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLoadBalancerTlsCertificateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `loadBalancerName`
      String.validateJsonElement(jsonObj.get("loadBalancerName"));
      // validate the required field `certificateName`
      String.validateJsonElement(jsonObj.get("certificateName"));
      // validate the required field `certificateDomainName`
      String.validateJsonElement(jsonObj.get("certificateDomainName"));
      // validate the optional field `certificateAlternativeNames`
      if (jsonObj.get("certificateAlternativeNames") != null && !jsonObj.get("certificateAlternativeNames").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("certificateAlternativeNames"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLoadBalancerTlsCertificateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLoadBalancerTlsCertificateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLoadBalancerTlsCertificateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLoadBalancerTlsCertificateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLoadBalancerTlsCertificateRequest>() {
           @Override
           public void write(JsonWriter out, CreateLoadBalancerTlsCertificateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLoadBalancerTlsCertificateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateLoadBalancerTlsCertificateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateLoadBalancerTlsCertificateRequest
   * @throws IOException if the JSON string is invalid with respect to CreateLoadBalancerTlsCertificateRequest
   */
  public static CreateLoadBalancerTlsCertificateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLoadBalancerTlsCertificateRequest.class);
  }

  /**
   * Convert an instance of CreateLoadBalancerTlsCertificateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

