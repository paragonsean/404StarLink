/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
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
import org.openapitools.client.model.AccessConfig;

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
 * A Compute Engine NetworkInterface resource. Identical to the NetworkInterface on the corresponding Compute Engine resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:37.514463-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NetworkInterface {
  public static final String SERIALIZED_NAME_ACCESS_CONFIGS = "accessConfigs";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONFIGS)
  private List<AccessConfig> accessConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_NETWORK_IP = "networkIp";
  @SerializedName(SERIALIZED_NAME_NETWORK_IP)
  private String networkIp;

  public NetworkInterface() {
  }

  public NetworkInterface accessConfigs(List<AccessConfig> accessConfigs) {
    this.accessConfigs = accessConfigs;
    return this;
  }

  public NetworkInterface addAccessConfigsItem(AccessConfig accessConfigsItem) {
    if (this.accessConfigs == null) {
      this.accessConfigs = new ArrayList<>();
    }
    this.accessConfigs.add(accessConfigsItem);
    return this;
  }

  /**
   * An array of configurations for this interface. This specifies how this interface is configured to interact with other network services.
   * @return accessConfigs
   */
  @javax.annotation.Nullable
  public List<AccessConfig> getAccessConfigs() {
    return accessConfigs;
  }

  public void setAccessConfigs(List<AccessConfig> accessConfigs) {
    this.accessConfigs = accessConfigs;
  }


  public NetworkInterface network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Name the Network resource to which this interface applies.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public NetworkInterface networkIp(String networkIp) {
    this.networkIp = networkIp;
    return this;
  }

  /**
   * An optional IPV4 internal network address to assign to the instance for this network interface.
   * @return networkIp
   */
  @javax.annotation.Nullable
  public String getNetworkIp() {
    return networkIp;
  }

  public void setNetworkIp(String networkIp) {
    this.networkIp = networkIp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInterface networkInterface = (NetworkInterface) o;
    return Objects.equals(this.accessConfigs, networkInterface.accessConfigs) &&
        Objects.equals(this.network, networkInterface.network) &&
        Objects.equals(this.networkIp, networkInterface.networkIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessConfigs, network, networkIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterface {\n");
    sb.append("    accessConfigs: ").append(toIndentedString(accessConfigs)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    networkIp: ").append(toIndentedString(networkIp)).append("\n");
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
    openapiFields.add("accessConfigs");
    openapiFields.add("network");
    openapiFields.add("networkIp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NetworkInterface
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkInterface.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkInterface is not found in the empty JSON string", NetworkInterface.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkInterface.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkInterface` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("accessConfigs") != null && !jsonObj.get("accessConfigs").isJsonNull()) {
        JsonArray jsonArrayaccessConfigs = jsonObj.getAsJsonArray("accessConfigs");
        if (jsonArrayaccessConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accessConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accessConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("accessConfigs").toString()));
          }

          // validate the optional field `accessConfigs` (array)
          for (int i = 0; i < jsonArrayaccessConfigs.size(); i++) {
            AccessConfig.validateJsonElement(jsonArrayaccessConfigs.get(i));
          };
        }
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("networkIp") != null && !jsonObj.get("networkIp").isJsonNull()) && !jsonObj.get("networkIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkIp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkInterface.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkInterface' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkInterface> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkInterface.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkInterface>() {
           @Override
           public void write(JsonWriter out, NetworkInterface value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkInterface read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NetworkInterface given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkInterface
   * @throws IOException if the JSON string is invalid with respect to NetworkInterface
   */
  public static NetworkInterface fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkInterface.class);
  }

  /**
   * Convert an instance of NetworkInterface to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

