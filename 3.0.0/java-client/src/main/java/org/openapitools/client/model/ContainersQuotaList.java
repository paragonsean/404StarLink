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
 * ContainersQuotaList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:21.112823-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainersQuotaList {
  public static final String SERIALIZED_NAME_FLOATING_IPS = "floating_ips";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS)
  private Integer floatingIps;

  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;

  public ContainersQuotaList() {
  }

  public ContainersQuotaList floatingIps(Integer floatingIps) {
    this.floatingIps = floatingIps;
    return this;
  }

  /**
   * The new number of public IP addresses that you want to assign to your space.
   * @return floatingIps
   */
  @javax.annotation.Nullable
  public Integer getFloatingIps() {
    return floatingIps;
  }

  public void setFloatingIps(Integer floatingIps) {
    this.floatingIps = floatingIps;
  }


  public ContainersQuotaList ram(Integer ram) {
    this.ram = ram;
    return this;
  }

  /**
   * The amount of container memory that you want to assign to your space.
   * @return ram
   */
  @javax.annotation.Nullable
  public Integer getRam() {
    return ram;
  }

  public void setRam(Integer ram) {
    this.ram = ram;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersQuotaList containersQuotaList = (ContainersQuotaList) o;
    return Objects.equals(this.floatingIps, containersQuotaList.floatingIps) &&
        Objects.equals(this.ram, containersQuotaList.ram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floatingIps, ram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersQuotaList {\n");
    sb.append("    floatingIps: ").append(toIndentedString(floatingIps)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
    openapiFields.add("floating_ips");
    openapiFields.add("ram");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainersQuotaList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainersQuotaList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainersQuotaList is not found in the empty JSON string", ContainersQuotaList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainersQuotaList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainersQuotaList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainersQuotaList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainersQuotaList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainersQuotaList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainersQuotaList.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainersQuotaList>() {
           @Override
           public void write(JsonWriter out, ContainersQuotaList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainersQuotaList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainersQuotaList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainersQuotaList
   * @throws IOException if the JSON string is invalid with respect to ContainersQuotaList
   */
  public static ContainersQuotaList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainersQuotaList.class);
  }

  /**
   * Convert an instance of ContainersQuotaList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

