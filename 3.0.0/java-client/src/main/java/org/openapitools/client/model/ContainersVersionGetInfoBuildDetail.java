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
 * ContainersVersionGetInfoBuildDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:21.112823-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContainersVersionGetInfoBuildDetail {
  public static final String SERIALIZED_NAME_API = "api";
  @SerializedName(SERIALIZED_NAME_API)
  private String api;

  public static final String SERIALIZED_NAME_AUTOMOUNT = "automount";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT)
  private String automount;

  public static final String SERIALIZED_NAME_GRUPDATER = "grupdater";
  @SerializedName(SERIALIZED_NAME_GRUPDATER)
  private String grupdater;

  public static final String SERIALIZED_NAME_HARMONY = "harmony";
  @SerializedName(SERIALIZED_NAME_HARMONY)
  private String harmony;

  public static final String SERIALIZED_NAME_HEALTH_MONITOR = "health-monitor";
  @SerializedName(SERIALIZED_NAME_HEALTH_MONITOR)
  private String healthMonitor;

  public static final String SERIALIZED_NAME_HIJACK = "hijack";
  @SerializedName(SERIALIZED_NAME_HIJACK)
  private String hijack;

  public static final String SERIALIZED_NAME_LDAP = "ldap";
  @SerializedName(SERIALIZED_NAME_LDAP)
  private String ldap;

  public static final String SERIALIZED_NAME_LOGMET = "logmet";
  @SerializedName(SERIALIZED_NAME_LOGMET)
  private String logmet;

  public static final String SERIALIZED_NAME_LUMBERJACK = "lumberjack";
  @SerializedName(SERIALIZED_NAME_LUMBERJACK)
  private String lumberjack;

  public static final String SERIALIZED_NAME_REDIS_CLUSTER = "redis-cluster";
  @SerializedName(SERIALIZED_NAME_REDIS_CLUSTER)
  private String redisCluster;

  public static final String SERIALIZED_NAME_SGWATCHER = "sgwatcher";
  @SerializedName(SERIALIZED_NAME_SGWATCHER)
  private String sgwatcher;

  public static final String SERIALIZED_NAME_VOLMGR = "volmgr";
  @SerializedName(SERIALIZED_NAME_VOLMGR)
  private String volmgr;

  public ContainersVersionGetInfoBuildDetail() {
  }

  public ContainersVersionGetInfoBuildDetail api(String api) {
    this.api = api;
    return this;
  }

  /**
   * The build ID of the current API version.
   * @return api
   */
  @javax.annotation.Nullable
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }


  public ContainersVersionGetInfoBuildDetail automount(String automount) {
    this.automount = automount;
    return this;
  }

  /**
   * The build ID of the current automount microservice version.
   * @return automount
   */
  @javax.annotation.Nullable
  public String getAutomount() {
    return automount;
  }

  public void setAutomount(String automount) {
    this.automount = automount;
  }


  public ContainersVersionGetInfoBuildDetail grupdater(String grupdater) {
    this.grupdater = grupdater;
    return this;
  }

  /**
   * The build ID of the current grupdater microservice version.
   * @return grupdater
   */
  @javax.annotation.Nullable
  public String getGrupdater() {
    return grupdater;
  }

  public void setGrupdater(String grupdater) {
    this.grupdater = grupdater;
  }


  public ContainersVersionGetInfoBuildDetail harmony(String harmony) {
    this.harmony = harmony;
    return this;
  }

  /**
   * The build ID of the current harmony microservice version.
   * @return harmony
   */
  @javax.annotation.Nullable
  public String getHarmony() {
    return harmony;
  }

  public void setHarmony(String harmony) {
    this.harmony = harmony;
  }


  public ContainersVersionGetInfoBuildDetail healthMonitor(String healthMonitor) {
    this.healthMonitor = healthMonitor;
    return this;
  }

  /**
   * The build ID of the current health-monitor microservice version.
   * @return healthMonitor
   */
  @javax.annotation.Nullable
  public String getHealthMonitor() {
    return healthMonitor;
  }

  public void setHealthMonitor(String healthMonitor) {
    this.healthMonitor = healthMonitor;
  }


  public ContainersVersionGetInfoBuildDetail hijack(String hijack) {
    this.hijack = hijack;
    return this;
  }

  /**
   * The build ID of the current hijack microservice version.
   * @return hijack
   */
  @javax.annotation.Nullable
  public String getHijack() {
    return hijack;
  }

  public void setHijack(String hijack) {
    this.hijack = hijack;
  }


  public ContainersVersionGetInfoBuildDetail ldap(String ldap) {
    this.ldap = ldap;
    return this;
  }

  /**
   * The build ID of the current ldap microservice version.
   * @return ldap
   */
  @javax.annotation.Nullable
  public String getLdap() {
    return ldap;
  }

  public void setLdap(String ldap) {
    this.ldap = ldap;
  }


  public ContainersVersionGetInfoBuildDetail logmet(String logmet) {
    this.logmet = logmet;
    return this;
  }

  /**
   * The build ID of the current logmet microservice version.
   * @return logmet
   */
  @javax.annotation.Nullable
  public String getLogmet() {
    return logmet;
  }

  public void setLogmet(String logmet) {
    this.logmet = logmet;
  }


  public ContainersVersionGetInfoBuildDetail lumberjack(String lumberjack) {
    this.lumberjack = lumberjack;
    return this;
  }

  /**
   * The build ID of the current lumberjack microservice version.
   * @return lumberjack
   */
  @javax.annotation.Nullable
  public String getLumberjack() {
    return lumberjack;
  }

  public void setLumberjack(String lumberjack) {
    this.lumberjack = lumberjack;
  }


  public ContainersVersionGetInfoBuildDetail redisCluster(String redisCluster) {
    this.redisCluster = redisCluster;
    return this;
  }

  /**
   * The build ID of the current redis-cluster version.
   * @return redisCluster
   */
  @javax.annotation.Nullable
  public String getRedisCluster() {
    return redisCluster;
  }

  public void setRedisCluster(String redisCluster) {
    this.redisCluster = redisCluster;
  }


  public ContainersVersionGetInfoBuildDetail sgwatcher(String sgwatcher) {
    this.sgwatcher = sgwatcher;
    return this;
  }

  /**
   * The build ID of the current sgwatcher microservice version.
   * @return sgwatcher
   */
  @javax.annotation.Nullable
  public String getSgwatcher() {
    return sgwatcher;
  }

  public void setSgwatcher(String sgwatcher) {
    this.sgwatcher = sgwatcher;
  }


  public ContainersVersionGetInfoBuildDetail volmgr(String volmgr) {
    this.volmgr = volmgr;
    return this;
  }

  /**
   * The build ID of the current volumes manager microservice version.
   * @return volmgr
   */
  @javax.annotation.Nullable
  public String getVolmgr() {
    return volmgr;
  }

  public void setVolmgr(String volmgr) {
    this.volmgr = volmgr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainersVersionGetInfoBuildDetail containersVersionGetInfoBuildDetail = (ContainersVersionGetInfoBuildDetail) o;
    return Objects.equals(this.api, containersVersionGetInfoBuildDetail.api) &&
        Objects.equals(this.automount, containersVersionGetInfoBuildDetail.automount) &&
        Objects.equals(this.grupdater, containersVersionGetInfoBuildDetail.grupdater) &&
        Objects.equals(this.harmony, containersVersionGetInfoBuildDetail.harmony) &&
        Objects.equals(this.healthMonitor, containersVersionGetInfoBuildDetail.healthMonitor) &&
        Objects.equals(this.hijack, containersVersionGetInfoBuildDetail.hijack) &&
        Objects.equals(this.ldap, containersVersionGetInfoBuildDetail.ldap) &&
        Objects.equals(this.logmet, containersVersionGetInfoBuildDetail.logmet) &&
        Objects.equals(this.lumberjack, containersVersionGetInfoBuildDetail.lumberjack) &&
        Objects.equals(this.redisCluster, containersVersionGetInfoBuildDetail.redisCluster) &&
        Objects.equals(this.sgwatcher, containersVersionGetInfoBuildDetail.sgwatcher) &&
        Objects.equals(this.volmgr, containersVersionGetInfoBuildDetail.volmgr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, automount, grupdater, harmony, healthMonitor, hijack, ldap, logmet, lumberjack, redisCluster, sgwatcher, volmgr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainersVersionGetInfoBuildDetail {\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    automount: ").append(toIndentedString(automount)).append("\n");
    sb.append("    grupdater: ").append(toIndentedString(grupdater)).append("\n");
    sb.append("    harmony: ").append(toIndentedString(harmony)).append("\n");
    sb.append("    healthMonitor: ").append(toIndentedString(healthMonitor)).append("\n");
    sb.append("    hijack: ").append(toIndentedString(hijack)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    logmet: ").append(toIndentedString(logmet)).append("\n");
    sb.append("    lumberjack: ").append(toIndentedString(lumberjack)).append("\n");
    sb.append("    redisCluster: ").append(toIndentedString(redisCluster)).append("\n");
    sb.append("    sgwatcher: ").append(toIndentedString(sgwatcher)).append("\n");
    sb.append("    volmgr: ").append(toIndentedString(volmgr)).append("\n");
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
    openapiFields.add("api");
    openapiFields.add("automount");
    openapiFields.add("grupdater");
    openapiFields.add("harmony");
    openapiFields.add("health-monitor");
    openapiFields.add("hijack");
    openapiFields.add("ldap");
    openapiFields.add("logmet");
    openapiFields.add("lumberjack");
    openapiFields.add("redis-cluster");
    openapiFields.add("sgwatcher");
    openapiFields.add("volmgr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainersVersionGetInfoBuildDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainersVersionGetInfoBuildDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainersVersionGetInfoBuildDetail is not found in the empty JSON string", ContainersVersionGetInfoBuildDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainersVersionGetInfoBuildDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainersVersionGetInfoBuildDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api") != null && !jsonObj.get("api").isJsonNull()) && !jsonObj.get("api").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api").toString()));
      }
      if ((jsonObj.get("automount") != null && !jsonObj.get("automount").isJsonNull()) && !jsonObj.get("automount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `automount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("automount").toString()));
      }
      if ((jsonObj.get("grupdater") != null && !jsonObj.get("grupdater").isJsonNull()) && !jsonObj.get("grupdater").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grupdater` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grupdater").toString()));
      }
      if ((jsonObj.get("harmony") != null && !jsonObj.get("harmony").isJsonNull()) && !jsonObj.get("harmony").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `harmony` to be a primitive type in the JSON string but got `%s`", jsonObj.get("harmony").toString()));
      }
      if ((jsonObj.get("health-monitor") != null && !jsonObj.get("health-monitor").isJsonNull()) && !jsonObj.get("health-monitor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health-monitor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health-monitor").toString()));
      }
      if ((jsonObj.get("hijack") != null && !jsonObj.get("hijack").isJsonNull()) && !jsonObj.get("hijack").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hijack` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hijack").toString()));
      }
      if ((jsonObj.get("ldap") != null && !jsonObj.get("ldap").isJsonNull()) && !jsonObj.get("ldap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ldap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ldap").toString()));
      }
      if ((jsonObj.get("logmet") != null && !jsonObj.get("logmet").isJsonNull()) && !jsonObj.get("logmet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logmet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logmet").toString()));
      }
      if ((jsonObj.get("lumberjack") != null && !jsonObj.get("lumberjack").isJsonNull()) && !jsonObj.get("lumberjack").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lumberjack` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lumberjack").toString()));
      }
      if ((jsonObj.get("redis-cluster") != null && !jsonObj.get("redis-cluster").isJsonNull()) && !jsonObj.get("redis-cluster").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redis-cluster` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redis-cluster").toString()));
      }
      if ((jsonObj.get("sgwatcher") != null && !jsonObj.get("sgwatcher").isJsonNull()) && !jsonObj.get("sgwatcher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sgwatcher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sgwatcher").toString()));
      }
      if ((jsonObj.get("volmgr") != null && !jsonObj.get("volmgr").isJsonNull()) && !jsonObj.get("volmgr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volmgr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volmgr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainersVersionGetInfoBuildDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainersVersionGetInfoBuildDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainersVersionGetInfoBuildDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainersVersionGetInfoBuildDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainersVersionGetInfoBuildDetail>() {
           @Override
           public void write(JsonWriter out, ContainersVersionGetInfoBuildDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainersVersionGetInfoBuildDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainersVersionGetInfoBuildDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainersVersionGetInfoBuildDetail
   * @throws IOException if the JSON string is invalid with respect to ContainersVersionGetInfoBuildDetail
   */
  public static ContainersVersionGetInfoBuildDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainersVersionGetInfoBuildDetail.class);
  }

  /**
   * Convert an instance of ContainersVersionGetInfoBuildDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

