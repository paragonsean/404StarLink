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
import org.openapitools.client.model.ContainersVersionGetInfoBuildDetail;

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
 * ContainersVersionGetInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:21.112823-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainersVersionGetInfo {
  public static final String SERIALIZED_NAME_API_VERSION = "ApiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_ARCH = "Arch";
  @SerializedName(SERIALIZED_NAME_ARCH)
  private String arch;

  public static final String SERIALIZED_NAME_BUILD_DETAIL = "BuildDetail";
  @SerializedName(SERIALIZED_NAME_BUILD_DETAIL)
  private ContainersVersionGetInfoBuildDetail buildDetail;

  public static final String SERIALIZED_NAME_BUILD_I_D = "BuildID";
  @SerializedName(SERIALIZED_NAME_BUILD_I_D)
  private String buildID;

  public static final String SERIALIZED_NAME_BUILD_NUMBER = "BuildNumber";
  @SerializedName(SERIALIZED_NAME_BUILD_NUMBER)
  private String buildNumber;

  public static final String SERIALIZED_NAME_BUILD_TIME = "BuildTime";
  @SerializedName(SERIALIZED_NAME_BUILD_TIME)
  private String buildTime;

  public static final String SERIALIZED_NAME_GIT_COMMIT = "GitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
  private String gitCommit;

  public static final String SERIALIZED_NAME_GO_VERSION = "GoVersion";
  @SerializedName(SERIALIZED_NAME_GO_VERSION)
  private String goVersion;

  public static final String SERIALIZED_NAME_KERNEL_VERSION = "KernelVersion";
  @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
  private String kernelVersion;

  public static final String SERIALIZED_NAME_OS = "Os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ContainersVersionGetInfo() {
  }

  public ContainersVersionGetInfo apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The current API version.
   * @return apiVersion
   */
  @javax.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ContainersVersionGetInfo arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * The current Arch version.
   * @return arch
   */
  @javax.annotation.Nullable
  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }


  public ContainersVersionGetInfo buildDetail(ContainersVersionGetInfoBuildDetail buildDetail) {
    this.buildDetail = buildDetail;
    return this;
  }

  /**
   * Get buildDetail
   * @return buildDetail
   */
  @javax.annotation.Nullable
  public ContainersVersionGetInfoBuildDetail getBuildDetail() {
    return buildDetail;
  }

  public void setBuildDetail(ContainersVersionGetInfoBuildDetail buildDetail) {
    this.buildDetail = buildDetail;
  }


  public ContainersVersionGetInfo buildID(String buildID) {
    this.buildID = buildID;
    return this;
  }

  /**
   * 
   * @return buildID
   */
  @javax.annotation.Nullable
  public String getBuildID() {
    return buildID;
  }

  public void setBuildID(String buildID) {
    this.buildID = buildID;
  }


  public ContainersVersionGetInfo buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * 
   * @return buildNumber
   */
  @javax.annotation.Nullable
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }


  public ContainersVersionGetInfo buildTime(String buildTime) {
    this.buildTime = buildTime;
    return this;
  }

  /**
   * Timestamp when the API version and all attached microservices were built.
   * @return buildTime
   */
  @javax.annotation.Nullable
  public String getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }


  public ContainersVersionGetInfo gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * 
   * @return gitCommit
   */
  @javax.annotation.Nullable
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }


  public ContainersVersionGetInfo goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * The latest Go version.
   * @return goVersion
   */
  @javax.annotation.Nullable
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }


  public ContainersVersionGetInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * The latest Kernel version.
   * @return kernelVersion
   */
  @javax.annotation.Nullable
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }


  public ContainersVersionGetInfo os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Bluemix Containers
   * @return os
   */
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public ContainersVersionGetInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The latest API version.
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersVersionGetInfo containersVersionGetInfo = (ContainersVersionGetInfo) o;
    return Objects.equals(this.apiVersion, containersVersionGetInfo.apiVersion) &&
        Objects.equals(this.arch, containersVersionGetInfo.arch) &&
        Objects.equals(this.buildDetail, containersVersionGetInfo.buildDetail) &&
        Objects.equals(this.buildID, containersVersionGetInfo.buildID) &&
        Objects.equals(this.buildNumber, containersVersionGetInfo.buildNumber) &&
        Objects.equals(this.buildTime, containersVersionGetInfo.buildTime) &&
        Objects.equals(this.gitCommit, containersVersionGetInfo.gitCommit) &&
        Objects.equals(this.goVersion, containersVersionGetInfo.goVersion) &&
        Objects.equals(this.kernelVersion, containersVersionGetInfo.kernelVersion) &&
        Objects.equals(this.os, containersVersionGetInfo.os) &&
        Objects.equals(this.version, containersVersionGetInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, arch, buildDetail, buildID, buildNumber, buildTime, gitCommit, goVersion, kernelVersion, os, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersVersionGetInfo {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    buildDetail: ").append(toIndentedString(buildDetail)).append("\n");
    sb.append("    buildID: ").append(toIndentedString(buildID)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("ApiVersion");
    openapiFields.add("Arch");
    openapiFields.add("BuildDetail");
    openapiFields.add("BuildID");
    openapiFields.add("BuildNumber");
    openapiFields.add("BuildTime");
    openapiFields.add("GitCommit");
    openapiFields.add("GoVersion");
    openapiFields.add("KernelVersion");
    openapiFields.add("Os");
    openapiFields.add("Version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainersVersionGetInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainersVersionGetInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainersVersionGetInfo is not found in the empty JSON string", ContainersVersionGetInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainersVersionGetInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainersVersionGetInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ApiVersion") != null && !jsonObj.get("ApiVersion").isJsonNull()) && !jsonObj.get("ApiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ApiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ApiVersion").toString()));
      }
      if ((jsonObj.get("Arch") != null && !jsonObj.get("Arch").isJsonNull()) && !jsonObj.get("Arch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Arch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Arch").toString()));
      }
      // validate the optional field `BuildDetail`
      if (jsonObj.get("BuildDetail") != null && !jsonObj.get("BuildDetail").isJsonNull()) {
        ContainersVersionGetInfoBuildDetail.validateJsonElement(jsonObj.get("BuildDetail"));
      }
      if ((jsonObj.get("BuildID") != null && !jsonObj.get("BuildID").isJsonNull()) && !jsonObj.get("BuildID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildID").toString()));
      }
      if ((jsonObj.get("BuildNumber") != null && !jsonObj.get("BuildNumber").isJsonNull()) && !jsonObj.get("BuildNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildNumber").toString()));
      }
      if ((jsonObj.get("BuildTime") != null && !jsonObj.get("BuildTime").isJsonNull()) && !jsonObj.get("BuildTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BuildTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BuildTime").toString()));
      }
      if ((jsonObj.get("GitCommit") != null && !jsonObj.get("GitCommit").isJsonNull()) && !jsonObj.get("GitCommit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GitCommit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GitCommit").toString()));
      }
      if ((jsonObj.get("GoVersion") != null && !jsonObj.get("GoVersion").isJsonNull()) && !jsonObj.get("GoVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GoVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GoVersion").toString()));
      }
      if ((jsonObj.get("KernelVersion") != null && !jsonObj.get("KernelVersion").isJsonNull()) && !jsonObj.get("KernelVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KernelVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KernelVersion").toString()));
      }
      if ((jsonObj.get("Os") != null && !jsonObj.get("Os").isJsonNull()) && !jsonObj.get("Os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Os").toString()));
      }
      if ((jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) && !jsonObj.get("Version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainersVersionGetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainersVersionGetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainersVersionGetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainersVersionGetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainersVersionGetInfo>() {
           @Override
           public void write(JsonWriter out, ContainersVersionGetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainersVersionGetInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainersVersionGetInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainersVersionGetInfo
   * @throws IOException if the JSON string is invalid with respect to ContainersVersionGetInfo
   */
  public static ContainersVersionGetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainersVersionGetInfo.class);
  }

  /**
   * Convert an instance of ContainersVersionGetInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

