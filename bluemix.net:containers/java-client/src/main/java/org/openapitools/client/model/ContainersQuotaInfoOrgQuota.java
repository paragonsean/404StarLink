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
 * ContainersQuotaInfoOrgQuota
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:24.379574-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainersQuotaInfoOrgQuota {
  public static final String SERIALIZED_NAME_FLOATING_IPS_MAX = "floating_ips_max";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_MAX)
  private String floatingIpsMax;

  public static final String SERIALIZED_NAME_FLOATING_IPS_SPACE_DEFAULT = "floating_ips_space_default";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_SPACE_DEFAULT)
  private String floatingIpsSpaceDefault;

  public static final String SERIALIZED_NAME_FLOATING_IPS_USAGE = "floating_ips_usage";
  @SerializedName(SERIALIZED_NAME_FLOATING_IPS_USAGE)
  private Integer floatingIpsUsage;

  public static final String SERIALIZED_NAME_RAM_MAX = "ram_max";
  @SerializedName(SERIALIZED_NAME_RAM_MAX)
  private Integer ramMax;

  public static final String SERIALIZED_NAME_RAM_SPACE_DEFAULT = "ram_space_default";
  @SerializedName(SERIALIZED_NAME_RAM_SPACE_DEFAULT)
  private Integer ramSpaceDefault;

  public static final String SERIALIZED_NAME_RAM_USAGE = "ram_usage";
  @SerializedName(SERIALIZED_NAME_RAM_USAGE)
  private Integer ramUsage;

  public static final String SERIALIZED_NAME_SUBNET_USAGE = "subnet_usage";
  @SerializedName(SERIALIZED_NAME_SUBNET_USAGE)
  private Integer subnetUsage;

  public static final String SERIALIZED_NAME_SUBNETS_DEFAULT = "subnets_default";
  @SerializedName(SERIALIZED_NAME_SUBNETS_DEFAULT)
  private Integer subnetsDefault;

  public static final String SERIALIZED_NAME_SUBNETS_MAX = "subnets_max";
  @SerializedName(SERIALIZED_NAME_SUBNETS_MAX)
  private Integer subnetsMax;

  public ContainersQuotaInfoOrgQuota() {
  }

  public ContainersQuotaInfoOrgQuota floatingIpsMax(String floatingIpsMax) {
    this.floatingIpsMax = floatingIpsMax;
    return this;
  }

  /**
   * The number of public IP addresses that can be assigned across all spaces of the organization.
   * @return floatingIpsMax
   */
  @javax.annotation.Nullable
  public String getFloatingIpsMax() {
    return floatingIpsMax;
  }

  public void setFloatingIpsMax(String floatingIpsMax) {
    this.floatingIpsMax = floatingIpsMax;
  }


  public ContainersQuotaInfoOrgQuota floatingIpsSpaceDefault(String floatingIpsSpaceDefault) {
    this.floatingIpsSpaceDefault = floatingIpsSpaceDefault;
    return this;
  }

  /**
   * The number of public IP addresses that are required for one space. If the number of public IP addresses is not available, then a new space cannot be created to be used with IBM Containers. 
   * @return floatingIpsSpaceDefault
   */
  @javax.annotation.Nullable
  public String getFloatingIpsSpaceDefault() {
    return floatingIpsSpaceDefault;
  }

  public void setFloatingIpsSpaceDefault(String floatingIpsSpaceDefault) {
    this.floatingIpsSpaceDefault = floatingIpsSpaceDefault;
  }


  public ContainersQuotaInfoOrgQuota floatingIpsUsage(Integer floatingIpsUsage) {
    this.floatingIpsUsage = floatingIpsUsage;
    return this;
  }

  /**
   * The number of public IP addresses that are currently assigned to the spaces of the organization.
   * @return floatingIpsUsage
   */
  @javax.annotation.Nullable
  public Integer getFloatingIpsUsage() {
    return floatingIpsUsage;
  }

  public void setFloatingIpsUsage(Integer floatingIpsUsage) {
    this.floatingIpsUsage = floatingIpsUsage;
  }


  public ContainersQuotaInfoOrgQuota ramMax(Integer ramMax) {
    this.ramMax = ramMax;
    return this;
  }

  /**
   * The maximum amount of container memory on the compute host that can be assigned across the spaces of the organization.
   * @return ramMax
   */
  @javax.annotation.Nullable
  public Integer getRamMax() {
    return ramMax;
  }

  public void setRamMax(Integer ramMax) {
    this.ramMax = ramMax;
  }


  public ContainersQuotaInfoOrgQuota ramSpaceDefault(Integer ramSpaceDefault) {
    this.ramSpaceDefault = ramSpaceDefault;
    return this;
  }

  /**
   * The amount of container memory that is required to be used for one space. If this amount is not available, then a new space cannot be created to be used with IBM Containers. 
   * @return ramSpaceDefault
   */
  @javax.annotation.Nullable
  public Integer getRamSpaceDefault() {
    return ramSpaceDefault;
  }

  public void setRamSpaceDefault(Integer ramSpaceDefault) {
    this.ramSpaceDefault = ramSpaceDefault;
  }


  public ContainersQuotaInfoOrgQuota ramUsage(Integer ramUsage) {
    this.ramUsage = ramUsage;
    return this;
  }

  /**
   * The amount of container memory that is currently used across all spaces of the organization.
   * @return ramUsage
   */
  @javax.annotation.Nullable
  public Integer getRamUsage() {
    return ramUsage;
  }

  public void setRamUsage(Integer ramUsage) {
    this.ramUsage = ramUsage;
  }


  public ContainersQuotaInfoOrgQuota subnetUsage(Integer subnetUsage) {
    this.subnetUsage = subnetUsage;
    return this;
  }

  /**
   * The number of subnets that were created across all spaces of the organization.
   * @return subnetUsage
   */
  @javax.annotation.Nullable
  public Integer getSubnetUsage() {
    return subnetUsage;
  }

  public void setSubnetUsage(Integer subnetUsage) {
    this.subnetUsage = subnetUsage;
  }


  public ContainersQuotaInfoOrgQuota subnetsDefault(Integer subnetsDefault) {
    this.subnetsDefault = subnetsDefault;
    return this;
  }

  /**
   * The number of subnets that is required to create a new space. If this number is not available, then a new space cannot be created to be used with IBM Containers.
   * @return subnetsDefault
   */
  @javax.annotation.Nullable
  public Integer getSubnetsDefault() {
    return subnetsDefault;
  }

  public void setSubnetsDefault(Integer subnetsDefault) {
    this.subnetsDefault = subnetsDefault;
  }


  public ContainersQuotaInfoOrgQuota subnetsMax(Integer subnetsMax) {
    this.subnetsMax = subnetsMax;
    return this;
  }

  /**
   * The maximum number of container private subnet that can be created across all spaces of the organization.
   * @return subnetsMax
   */
  @javax.annotation.Nullable
  public Integer getSubnetsMax() {
    return subnetsMax;
  }

  public void setSubnetsMax(Integer subnetsMax) {
    this.subnetsMax = subnetsMax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersQuotaInfoOrgQuota containersQuotaInfoOrgQuota = (ContainersQuotaInfoOrgQuota) o;
    return Objects.equals(this.floatingIpsMax, containersQuotaInfoOrgQuota.floatingIpsMax) &&
        Objects.equals(this.floatingIpsSpaceDefault, containersQuotaInfoOrgQuota.floatingIpsSpaceDefault) &&
        Objects.equals(this.floatingIpsUsage, containersQuotaInfoOrgQuota.floatingIpsUsage) &&
        Objects.equals(this.ramMax, containersQuotaInfoOrgQuota.ramMax) &&
        Objects.equals(this.ramSpaceDefault, containersQuotaInfoOrgQuota.ramSpaceDefault) &&
        Objects.equals(this.ramUsage, containersQuotaInfoOrgQuota.ramUsage) &&
        Objects.equals(this.subnetUsage, containersQuotaInfoOrgQuota.subnetUsage) &&
        Objects.equals(this.subnetsDefault, containersQuotaInfoOrgQuota.subnetsDefault) &&
        Objects.equals(this.subnetsMax, containersQuotaInfoOrgQuota.subnetsMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floatingIpsMax, floatingIpsSpaceDefault, floatingIpsUsage, ramMax, ramSpaceDefault, ramUsage, subnetUsage, subnetsDefault, subnetsMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersQuotaInfoOrgQuota {\n");
    sb.append("    floatingIpsMax: ").append(toIndentedString(floatingIpsMax)).append("\n");
    sb.append("    floatingIpsSpaceDefault: ").append(toIndentedString(floatingIpsSpaceDefault)).append("\n");
    sb.append("    floatingIpsUsage: ").append(toIndentedString(floatingIpsUsage)).append("\n");
    sb.append("    ramMax: ").append(toIndentedString(ramMax)).append("\n");
    sb.append("    ramSpaceDefault: ").append(toIndentedString(ramSpaceDefault)).append("\n");
    sb.append("    ramUsage: ").append(toIndentedString(ramUsage)).append("\n");
    sb.append("    subnetUsage: ").append(toIndentedString(subnetUsage)).append("\n");
    sb.append("    subnetsDefault: ").append(toIndentedString(subnetsDefault)).append("\n");
    sb.append("    subnetsMax: ").append(toIndentedString(subnetsMax)).append("\n");
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
    openapiFields.add("floating_ips_max");
    openapiFields.add("floating_ips_space_default");
    openapiFields.add("floating_ips_usage");
    openapiFields.add("ram_max");
    openapiFields.add("ram_space_default");
    openapiFields.add("ram_usage");
    openapiFields.add("subnet_usage");
    openapiFields.add("subnets_default");
    openapiFields.add("subnets_max");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainersQuotaInfoOrgQuota
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainersQuotaInfoOrgQuota.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainersQuotaInfoOrgQuota is not found in the empty JSON string", ContainersQuotaInfoOrgQuota.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainersQuotaInfoOrgQuota.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainersQuotaInfoOrgQuota` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("floating_ips_max") != null && !jsonObj.get("floating_ips_max").isJsonNull()) && !jsonObj.get("floating_ips_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floating_ips_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floating_ips_max").toString()));
      }
      if ((jsonObj.get("floating_ips_space_default") != null && !jsonObj.get("floating_ips_space_default").isJsonNull()) && !jsonObj.get("floating_ips_space_default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floating_ips_space_default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floating_ips_space_default").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainersQuotaInfoOrgQuota.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainersQuotaInfoOrgQuota' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainersQuotaInfoOrgQuota> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainersQuotaInfoOrgQuota.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainersQuotaInfoOrgQuota>() {
           @Override
           public void write(JsonWriter out, ContainersQuotaInfoOrgQuota value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainersQuotaInfoOrgQuota read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainersQuotaInfoOrgQuota given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainersQuotaInfoOrgQuota
   * @throws IOException if the JSON string is invalid with respect to ContainersQuotaInfoOrgQuota
   */
  public static ContainersQuotaInfoOrgQuota fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainersQuotaInfoOrgQuota.class);
  }

  /**
   * Convert an instance of ContainersQuotaInfoOrgQuota to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

