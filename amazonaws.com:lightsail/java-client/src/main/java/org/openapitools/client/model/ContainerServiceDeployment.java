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
import java.util.Map;
import org.openapitools.client.model.ContainerServiceDeploymentPublicEndpoint;
import org.openapitools.client.model.ContainerServiceDeploymentState;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:53.071508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainerServiceDeployment {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ContainerServiceDeploymentState state;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map containers;

  public static final String SERIALIZED_NAME_PUBLIC_ENDPOINT = "publicEndpoint";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ENDPOINT)
  private ContainerServiceDeploymentPublicEndpoint publicEndpoint;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public ContainerServiceDeployment() {
  }

  public ContainerServiceDeployment version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  public ContainerServiceDeployment state(ContainerServiceDeploymentState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public ContainerServiceDeploymentState getState() {
    return state;
  }

  public void setState(ContainerServiceDeploymentState state) {
    this.state = state;
  }


  public ContainerServiceDeployment containers(Map containers) {
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


  public ContainerServiceDeployment publicEndpoint(ContainerServiceDeploymentPublicEndpoint publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
    return this;
  }

  /**
   * Get publicEndpoint
   * @return publicEndpoint
   */
  @javax.annotation.Nullable
  public ContainerServiceDeploymentPublicEndpoint getPublicEndpoint() {
    return publicEndpoint;
  }

  public void setPublicEndpoint(ContainerServiceDeploymentPublicEndpoint publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
  }


  public ContainerServiceDeployment createdAt(OffsetDateTime createdAt) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerServiceDeployment containerServiceDeployment = (ContainerServiceDeployment) o;
    return Objects.equals(this.version, containerServiceDeployment.version) &&
        Objects.equals(this.state, containerServiceDeployment.state) &&
        Objects.equals(this.containers, containerServiceDeployment.containers) &&
        Objects.equals(this.publicEndpoint, containerServiceDeployment.publicEndpoint) &&
        Objects.equals(this.createdAt, containerServiceDeployment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, state, containers, publicEndpoint, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerServiceDeployment {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("state");
    openapiFields.add("containers");
    openapiFields.add("publicEndpoint");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerServiceDeployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerServiceDeployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerServiceDeployment is not found in the empty JSON string", ContainerServiceDeployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerServiceDeployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerServiceDeployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("version"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        ContainerServiceDeploymentState.validateJsonElement(jsonObj.get("state"));
      }
      // validate the optional field `containers`
      if (jsonObj.get("containers") != null && !jsonObj.get("containers").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("containers"));
      }
      // validate the optional field `publicEndpoint`
      if (jsonObj.get("publicEndpoint") != null && !jsonObj.get("publicEndpoint").isJsonNull()) {
        ContainerServiceDeploymentPublicEndpoint.validateJsonElement(jsonObj.get("publicEndpoint"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerServiceDeployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerServiceDeployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerServiceDeployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerServiceDeployment.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerServiceDeployment>() {
           @Override
           public void write(JsonWriter out, ContainerServiceDeployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerServiceDeployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerServiceDeployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerServiceDeployment
   * @throws IOException if the JSON string is invalid with respect to ContainerServiceDeployment
   */
  public static ContainerServiceDeployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerServiceDeployment.class);
  }

  /**
   * Convert an instance of ContainerServiceDeployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

