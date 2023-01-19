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
import java.util.Map;
import org.openapitools.client.model.ContainerServiceDeploymentRequestPublicEndpoint;

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
 * &lt;p&gt;Describes a container deployment configuration of an Amazon Lightsail container service.&lt;/p&gt; &lt;p&gt;A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to your container service.&lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:36.256697-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainerServiceDeploymentRequest {
  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map containers;

  public static final String SERIALIZED_NAME_PUBLIC_ENDPOINT = "publicEndpoint";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ENDPOINT)
  private ContainerServiceDeploymentRequestPublicEndpoint publicEndpoint;

  public ContainerServiceDeploymentRequest() {
  }

  public ContainerServiceDeploymentRequest containers(Map containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @javax.annotation.Nullable
  public Map getContainers() {
    return containers;
  }

  public void setContainers(Map containers) {
    this.containers = containers;
  }


  public ContainerServiceDeploymentRequest publicEndpoint(ContainerServiceDeploymentRequestPublicEndpoint publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
    return this;
  }

  /**
   * Get publicEndpoint
   * @return publicEndpoint
   */
  @javax.annotation.Nullable
  public ContainerServiceDeploymentRequestPublicEndpoint getPublicEndpoint() {
    return publicEndpoint;
  }

  public void setPublicEndpoint(ContainerServiceDeploymentRequestPublicEndpoint publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerServiceDeploymentRequest containerServiceDeploymentRequest = (ContainerServiceDeploymentRequest) o;
    return Objects.equals(this.containers, containerServiceDeploymentRequest.containers) &&
        Objects.equals(this.publicEndpoint, containerServiceDeploymentRequest.publicEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, publicEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerServiceDeploymentRequest {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
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
    openapiFields.add("containers");
    openapiFields.add("publicEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerServiceDeploymentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerServiceDeploymentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerServiceDeploymentRequest is not found in the empty JSON string", ContainerServiceDeploymentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerServiceDeploymentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerServiceDeploymentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `containers`
      if (jsonObj.get("containers") != null && !jsonObj.get("containers").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("containers"));
      }
      // validate the optional field `publicEndpoint`
      if (jsonObj.get("publicEndpoint") != null && !jsonObj.get("publicEndpoint").isJsonNull()) {
        ContainerServiceDeploymentRequestPublicEndpoint.validateJsonElement(jsonObj.get("publicEndpoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerServiceDeploymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerServiceDeploymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerServiceDeploymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerServiceDeploymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerServiceDeploymentRequest>() {
           @Override
           public void write(JsonWriter out, ContainerServiceDeploymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerServiceDeploymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerServiceDeploymentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerServiceDeploymentRequest
   * @throws IOException if the JSON string is invalid with respect to ContainerServiceDeploymentRequest
   */
  public static ContainerServiceDeploymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerServiceDeploymentRequest.class);
  }

  /**
   * Convert an instance of ContainerServiceDeploymentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

