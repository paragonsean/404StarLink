/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
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
 * Istio service scoped to a single Kubernetes cluster. Learn more at https://istio.io. Clusters running OSS Istio will have their services ingested as this type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ClusterIstio {
  public static final String SERIALIZED_NAME_CLUSTER_NAME = "clusterName";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  private String clusterName;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_NAMESPACE = "serviceNamespace";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAMESPACE)
  private String serviceNamespace;

  public ClusterIstio() {
  }

  public ClusterIstio clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the cluster_name resource label in k8s_cluster resources.
   * @return clusterName
   */
  @javax.annotation.Nullable
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }


  public ClusterIstio location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to the location resource label in k8s_cluster resources.
   * @return location
   */
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public ClusterIstio serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
   * @return serviceName
   */
  @javax.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public ClusterIstio serviceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

  /**
   * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
   * @return serviceNamespace
   */
  @javax.annotation.Nullable
  public String getServiceNamespace() {
    return serviceNamespace;
  }

  public void setServiceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterIstio clusterIstio = (ClusterIstio) o;
    return Objects.equals(this.clusterName, clusterIstio.clusterName) &&
        Objects.equals(this.location, clusterIstio.location) &&
        Objects.equals(this.serviceName, clusterIstio.serviceName) &&
        Objects.equals(this.serviceNamespace, clusterIstio.serviceNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, location, serviceName, serviceNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterIstio {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
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
    openapiFields.add("clusterName");
    openapiFields.add("location");
    openapiFields.add("serviceName");
    openapiFields.add("serviceNamespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClusterIstio
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClusterIstio.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClusterIstio is not found in the empty JSON string", ClusterIstio.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClusterIstio.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClusterIstio` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("clusterName") != null && !jsonObj.get("clusterName").isJsonNull()) && !jsonObj.get("clusterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterName").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("serviceName") != null && !jsonObj.get("serviceName").isJsonNull()) && !jsonObj.get("serviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceName").toString()));
      }
      if ((jsonObj.get("serviceNamespace") != null && !jsonObj.get("serviceNamespace").isJsonNull()) && !jsonObj.get("serviceNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceNamespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClusterIstio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClusterIstio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClusterIstio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClusterIstio.class));

       return (TypeAdapter<T>) new TypeAdapter<ClusterIstio>() {
           @Override
           public void write(JsonWriter out, ClusterIstio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClusterIstio read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClusterIstio given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClusterIstio
   * @throws IOException if the JSON string is invalid with respect to ClusterIstio
   */
  public static ClusterIstio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClusterIstio.class);
  }

  /**
   * Convert an instance of ClusterIstio to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

