/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
 * A list of &lt;code&gt;PreferredAvailabilityZones&lt;/code&gt; objects that specifies the configuration of a node group in the resharded cluster.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReshardingConfiguration {
  public static final String SERIALIZED_NAME_NODE_GROUP_ID = "NodeGroupId";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_ID)
  private String nodeGroupId;

  public static final String SERIALIZED_NAME_PREFERRED_AVAILABILITY_ZONES = "PreferredAvailabilityZones";
  @SerializedName(SERIALIZED_NAME_PREFERRED_AVAILABILITY_ZONES)
  private List preferredAvailabilityZones;

  public ReshardingConfiguration() {
  }

  public ReshardingConfiguration nodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
    return this;
  }

  /**
   * Get nodeGroupId
   * @return nodeGroupId
   */
  @javax.annotation.Nullable
  public String getNodeGroupId() {
    return nodeGroupId;
  }

  public void setNodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
  }


  public ReshardingConfiguration preferredAvailabilityZones(List preferredAvailabilityZones) {
    this.preferredAvailabilityZones = preferredAvailabilityZones;
    return this;
  }

  /**
   * Get preferredAvailabilityZones
   * @return preferredAvailabilityZones
   */
  @javax.annotation.Nullable
  public List getPreferredAvailabilityZones() {
    return preferredAvailabilityZones;
  }

  public void setPreferredAvailabilityZones(List preferredAvailabilityZones) {
    this.preferredAvailabilityZones = preferredAvailabilityZones;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReshardingConfiguration reshardingConfiguration = (ReshardingConfiguration) o;
    return Objects.equals(this.nodeGroupId, reshardingConfiguration.nodeGroupId) &&
        Objects.equals(this.preferredAvailabilityZones, reshardingConfiguration.preferredAvailabilityZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeGroupId, preferredAvailabilityZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReshardingConfiguration {\n");
    sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
    sb.append("    preferredAvailabilityZones: ").append(toIndentedString(preferredAvailabilityZones)).append("\n");
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
    openapiFields.add("NodeGroupId");
    openapiFields.add("PreferredAvailabilityZones");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReshardingConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReshardingConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReshardingConfiguration is not found in the empty JSON string", ReshardingConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReshardingConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReshardingConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `NodeGroupId`
      if (jsonObj.get("NodeGroupId") != null && !jsonObj.get("NodeGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NodeGroupId"));
      }
      // validate the optional field `PreferredAvailabilityZones`
      if (jsonObj.get("PreferredAvailabilityZones") != null && !jsonObj.get("PreferredAvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PreferredAvailabilityZones"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReshardingConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReshardingConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReshardingConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReshardingConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ReshardingConfiguration>() {
           @Override
           public void write(JsonWriter out, ReshardingConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReshardingConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReshardingConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReshardingConfiguration
   * @throws IOException if the JSON string is invalid with respect to ReshardingConfiguration
   */
  public static ReshardingConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReshardingConfiguration.class);
  }

  /**
   * Convert an instance of ReshardingConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

