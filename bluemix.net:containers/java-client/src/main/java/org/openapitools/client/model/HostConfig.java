/*
 * IBM Containers API
 * Containers are virtual software objects that include all the elements that an app needs to run. A container has the benefits of resource isolation and allocation but is more portable and efficient than, for example, a virtual machine.   This documentation describes the IBM Containers API, which is based on the Docker Remote API. The API provides endpoints that you can use to create and manage your single containers and container groups in Bluemix. Endpoints are summarized under the following tags:   - **Authentication**: Retrieve and refresh your TLS certificates.  - **Private Docker images registry**: Create your own private Docker images registry in Bluemix by setting a namespace for your organization.  - **Images**: View, build, and push your images to your private Bluemix registry so you can use them with IBM Containers. You can also scan your container images with the Vulnerability Advisor against standard policies set by the organization manager and a database of known Ubuntu issues.  - **Single Containers**: Create and manage single containers in Bluemix. Use a single container to implement short-lived processes or to run simple tests as you develop an app or service. To make your single container available from the internet, review the `Public IP addresses` endpoints.  - **Container Groups**: Create and manage your container groups in Bluemix. A container group consists of multiple single containers that are all created from the same container image and as a consequence are configured in the same way. Container groups offer further options at no cost to make your app highly available. These options include in-built load balancing, auto-recovery of unhealthy container instances, and auto-scaling of container instances based on CPU and memory usage. Map a public route to your container group to make your app accessible from the internet.   - **Public IP addresses**: Use these endpoints to request public IP addresses for your space. You can bind this IP address to your container to make your container accessible from the internet.  - **File shares**: Create, list and delete file shares in a space. A file share is a NFS storage system that hosts Docker volumes.   - **Volumes**: Create and manage container volumes in your space to persist the data of your containers.      Each API request requires an HTTP header that includes the 'X-Auth-Token’ and 'X-Auth-Project-Id’ parameter.   - **X-Auth-Token**: The JSON web token (JWT) that you receive when logging into the Bluemix platform. It allows you to use the IBM Containers REST API, access services, and resources. Run `cf oauth-token` to retrieve your access token information. - **X-Auth-Project-Id**: The unique ID of your organization space where you want to create or work with your containers. Run `cf space <space_name> --guid`, where `<space_name>` is the name of your space, to retrieve your space ID.    For further information about how containers work in the IBM Containers service, review the documentation under https://new-console.ng.bluemix.net/docs/containers/container_index.html. 
 *
 * The version of the OpenAPI document: 3.0.0
 * 
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
import java.util.ArrayList;
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
 * HostConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:24.379574-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HostConfig {
  public static final String SERIALIZED_NAME_BINDS = "Binds";
  @SerializedName(SERIALIZED_NAME_BINDS)
  private List<String> binds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTRA_HOSTS = "ExtraHosts";
  @SerializedName(SERIALIZED_NAME_EXTRA_HOSTS)
  private List<String> extraHosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_PORT_BINDINGS = "PortBindings";
  @SerializedName(SERIALIZED_NAME_PORT_BINDINGS)
  private List<String> portBindings = new ArrayList<>();

  public HostConfig() {
  }

  public HostConfig binds(List<String> binds) {
    this.binds = binds;
    return this;
  }

  public HostConfig addBindsItem(String bindsItem) {
    if (this.binds == null) {
      this.binds = new ArrayList<>();
    }
    this.binds.add(bindsItem);
    return this;
  }

  /**
   * A list of volumes to be bound to the container. Each volume must be listed in the following format: VOLNAME:/CONTAINER_PATH:rw [ro]. 
   * @return binds
   */
  @javax.annotation.Nullable
  public List<String> getBinds() {
    return binds;
  }

  public void setBinds(List<String> binds) {
    this.binds = binds;
  }


  public HostConfig extraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
    return this;
  }

  public HostConfig addExtraHostsItem(String extraHostsItem) {
    if (this.extraHosts == null) {
      this.extraHosts = new ArrayList<>();
    }
    this.extraHosts.add(extraHostsItem);
    return this;
  }

  /**
   * A list of hostnames/IP mappings to be added to the container’s /etc/hosts file. Specified in the form [\&quot;hostname:IP\&quot;] 
   * @return extraHosts
   */
  @javax.annotation.Nullable
  public List<String> getExtraHosts() {
    return extraHosts;
  }

  public void setExtraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
  }


  public HostConfig links(List<String> links) {
    this.links = links;
    return this;
  }

  public HostConfig addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * A list of containers that need to be linked.
   * @return links
   */
  @javax.annotation.Nullable
  public List<String> getLinks() {
    return links;
  }

  public void setLinks(List<String> links) {
    this.links = links;
  }


  public HostConfig portBindings(List<String> portBindings) {
    this.portBindings = portBindings;
    return this;
  }

  public HostConfig addPortBindingsItem(String portBindingsItem) {
    if (this.portBindings == null) {
      this.portBindings = new ArrayList<>();
    }
    this.portBindings.add(portBindingsItem);
    return this;
  }

  /**
   * The container ports that you want to expose to the public. Ports need to be specified in the form of &amp;lt;port&amp;gt;/&amp;lt;protocol&amp;gt;: [{ \&quot;HostIp\&quot;: \&quot;&amp;lt;IP&amp;gt;\&quot;, \&quot;HostPort\&quot;: \&quot;&amp;lt;port&amp;gt;\&quot; }] 
   * @return portBindings
   */
  @javax.annotation.Nullable
  public List<String> getPortBindings() {
    return portBindings;
  }

  public void setPortBindings(List<String> portBindings) {
    this.portBindings = portBindings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostConfig hostConfig = (HostConfig) o;
    return Objects.equals(this.binds, hostConfig.binds) &&
        Objects.equals(this.extraHosts, hostConfig.extraHosts) &&
        Objects.equals(this.links, hostConfig.links) &&
        Objects.equals(this.portBindings, hostConfig.portBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binds, extraHosts, links, portBindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostConfig {\n");
    sb.append("    binds: ").append(toIndentedString(binds)).append("\n");
    sb.append("    extraHosts: ").append(toIndentedString(extraHosts)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    portBindings: ").append(toIndentedString(portBindings)).append("\n");
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
    openapiFields.add("Binds");
    openapiFields.add("ExtraHosts");
    openapiFields.add("Links");
    openapiFields.add("PortBindings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HostConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HostConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HostConfig is not found in the empty JSON string", HostConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HostConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HostConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Binds") != null && !jsonObj.get("Binds").isJsonNull() && !jsonObj.get("Binds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Binds` to be an array in the JSON string but got `%s`", jsonObj.get("Binds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ExtraHosts") != null && !jsonObj.get("ExtraHosts").isJsonNull() && !jsonObj.get("ExtraHosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtraHosts` to be an array in the JSON string but got `%s`", jsonObj.get("ExtraHosts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Links") != null && !jsonObj.get("Links").isJsonNull() && !jsonObj.get("Links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Links` to be an array in the JSON string but got `%s`", jsonObj.get("Links").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("PortBindings") != null && !jsonObj.get("PortBindings").isJsonNull() && !jsonObj.get("PortBindings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PortBindings` to be an array in the JSON string but got `%s`", jsonObj.get("PortBindings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HostConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HostConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HostConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HostConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<HostConfig>() {
           @Override
           public void write(JsonWriter out, HostConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HostConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HostConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HostConfig
   * @throws IOException if the JSON string is invalid with respect to HostConfig
   */
  public static HostConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HostConfig.class);
  }

  /**
   * Convert an instance of HostConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

