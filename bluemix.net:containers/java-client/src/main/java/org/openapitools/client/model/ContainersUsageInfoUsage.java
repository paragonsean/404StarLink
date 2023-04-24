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
 * ContainersUsageInfoUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:24.379574-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainersUsageInfoUsage {
  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Integer containers;

  public static final String SERIALIZED_NAME_FLOATING_IPS = "floating_ips";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS)
  private Integer floatingIps;

  public static final String SERIALIZED_NAME_FLOATING_IPS_BOUND = "floating_ips_bound";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_BOUND)
  private Integer floatingIpsBound;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private Integer images;

  public static final String SERIALIZED_NAME_MEMORY_M_B = "memory_MB";
  @SerializedName(SERIALIZED_NAME_MEMORY_M_B)
  private Integer memoryMB;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Integer running;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public ContainersUsageInfoUsage() {
  }

  public ContainersUsageInfoUsage containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * The number of containers that were created in the space. All containers that count towards the quota limit are listed independent on their current state.
   * @return containers
   */
  @javax.annotation.Nullable
  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }


  public ContainersUsageInfoUsage floatingIps(Integer floatingIps) {
    this.floatingIps = floatingIps;
    return this;
  }

  /**
   * The number of public IP addresses that are allocated to the space.
   * @return floatingIps
   */
  @javax.annotation.Nullable
  public Integer getFloatingIps() {
    return floatingIps;
  }

  public void setFloatingIps(Integer floatingIps) {
    this.floatingIps = floatingIps;
  }


  public ContainersUsageInfoUsage floatingIpsBound(Integer floatingIpsBound) {
    this.floatingIpsBound = floatingIpsBound;
    return this;
  }

  /**
   * The number of public IP addresses that are bound to a container in the space.
   * @return floatingIpsBound
   */
  @javax.annotation.Nullable
  public Integer getFloatingIpsBound() {
    return floatingIpsBound;
  }

  public void setFloatingIpsBound(Integer floatingIpsBound) {
    this.floatingIpsBound = floatingIpsBound;
  }


  public ContainersUsageInfoUsage images(Integer images) {
    this.images = images;
    return this;
  }

  /**
   * The number of private images that were added to the private Bluemix registry.
   * @return images
   */
  @javax.annotation.Nullable
  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }


  public ContainersUsageInfoUsage memoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
    return this;
  }

  /**
   * The amount of container memory that is already used by the containers that were created in the space in megabyte.
   * @return memoryMB
   */
  @javax.annotation.Nullable
  public Integer getMemoryMB() {
    return memoryMB;
  }

  public void setMemoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
  }


  public ContainersUsageInfoUsage running(Integer running) {
    this.running = running;
    return this;
  }

  /**
   * The number of containers that are currently in a running state.
   * @return running
   */
  @javax.annotation.Nullable
  public Integer getRunning() {
    return running;
  }

  public void setRunning(Integer running) {
    this.running = running;
  }


  public ContainersUsageInfoUsage vcpu(Integer vcpu) {
    this.vcpu = vcpu;
    return this;
  }

  /**
   * The number of virtual CPUs that are allocated to the space.
   * @return vcpu
   */
  @javax.annotation.Nullable
  public Integer getVcpu() {
    return vcpu;
  }

  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersUsageInfoUsage containersUsageInfoUsage = (ContainersUsageInfoUsage) o;
    return Objects.equals(this.containers, containersUsageInfoUsage.containers) &&
        Objects.equals(this.floatingIps, containersUsageInfoUsage.floatingIps) &&
        Objects.equals(this.floatingIpsBound, containersUsageInfoUsage.floatingIpsBound) &&
        Objects.equals(this.images, containersUsageInfoUsage.images) &&
        Objects.equals(this.memoryMB, containersUsageInfoUsage.memoryMB) &&
        Objects.equals(this.running, containersUsageInfoUsage.running) &&
        Objects.equals(this.vcpu, containersUsageInfoUsage.vcpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, floatingIps, floatingIpsBound, images, memoryMB, running, vcpu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersUsageInfoUsage {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    floatingIps: ").append(toIndentedString(floatingIps)).append("\n");
    sb.append("    floatingIpsBound: ").append(toIndentedString(floatingIpsBound)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
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
    openapiFields.add("floating_ips");
    openapiFields.add("floating_ips_bound");
    openapiFields.add("images");
    openapiFields.add("memory_MB");
    openapiFields.add("running");
    openapiFields.add("vcpu");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainersUsageInfoUsage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainersUsageInfoUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainersUsageInfoUsage is not found in the empty JSON string", ContainersUsageInfoUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainersUsageInfoUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainersUsageInfoUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainersUsageInfoUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainersUsageInfoUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainersUsageInfoUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainersUsageInfoUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainersUsageInfoUsage>() {
           @Override
           public void write(JsonWriter out, ContainersUsageInfoUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainersUsageInfoUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainersUsageInfoUsage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainersUsageInfoUsage
   * @throws IOException if the JSON string is invalid with respect to ContainersUsageInfoUsage
   */
  public static ContainersUsageInfoUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainersUsageInfoUsage.class);
  }

  /**
   * Convert an instance of ContainersUsageInfoUsage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

