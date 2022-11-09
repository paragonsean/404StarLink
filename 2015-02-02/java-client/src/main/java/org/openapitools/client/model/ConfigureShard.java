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
 * Node group (shard) configuration options when adding or removing replicas. Each node group (shard) configuration has the following members: NodeGroupId, NewReplicaCount, and PreferredAvailabilityZones. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConfigureShard {
  public static final String SERIALIZED_NAME_NODE_GROUP_ID = "NodeGroupId";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_ID)
  private String nodeGroupId;

  public static final String SERIALIZED_NAME_NEW_REPLICA_COUNT = "NewReplicaCount";
  @SerializedName(SERIALIZED_NAME_NEW_REPLICA_COUNT)
  private Integer newReplicaCount;

  public static final String SERIALIZED_NAME_PREFERRED_AVAILABILITY_ZONES = "PreferredAvailabilityZones";
  @SerializedName(SERIALIZED_NAME_PREFERRED_AVAILABILITY_ZONES)
  private List preferredAvailabilityZones;

  public static final String SERIALIZED_NAME_PREFERRED_OUTPOST_ARNS = "PreferredOutpostArns";
  @SerializedName(SERIALIZED_NAME_PREFERRED_OUTPOST_ARNS)
  private List preferredOutpostArns;

  public ConfigureShard() {
  }

  public ConfigureShard nodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
    return this;
  }

  /**
   * Get nodeGroupId
   * @return nodeGroupId
   */
  @javax.annotation.Nonnull
  public String getNodeGroupId() {
    return nodeGroupId;
  }

  public void setNodeGroupId(String nodeGroupId) {
    this.nodeGroupId = nodeGroupId;
  }


  public ConfigureShard newReplicaCount(Integer newReplicaCount) {
    this.newReplicaCount = newReplicaCount;
    return this;
  }

  /**
   * Get newReplicaCount
   * @return newReplicaCount
   */
  @javax.annotation.Nonnull
  public Integer getNewReplicaCount() {
    return newReplicaCount;
  }

  public void setNewReplicaCount(Integer newReplicaCount) {
    this.newReplicaCount = newReplicaCount;
  }


  public ConfigureShard preferredAvailabilityZones(List preferredAvailabilityZones) {
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


  public ConfigureShard preferredOutpostArns(List preferredOutpostArns) {
    this.preferredOutpostArns = preferredOutpostArns;
    return this;
  }

  /**
   * Get preferredOutpostArns
   * @return preferredOutpostArns
   */
  @javax.annotation.Nullable
  public List getPreferredOutpostArns() {
    return preferredOutpostArns;
  }

  public void setPreferredOutpostArns(List preferredOutpostArns) {
    this.preferredOutpostArns = preferredOutpostArns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureShard configureShard = (ConfigureShard) o;
    return Objects.equals(this.nodeGroupId, configureShard.nodeGroupId) &&
        Objects.equals(this.newReplicaCount, configureShard.newReplicaCount) &&
        Objects.equals(this.preferredAvailabilityZones, configureShard.preferredAvailabilityZones) &&
        Objects.equals(this.preferredOutpostArns, configureShard.preferredOutpostArns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeGroupId, newReplicaCount, preferredAvailabilityZones, preferredOutpostArns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureShard {\n");
    sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
    sb.append("    newReplicaCount: ").append(toIndentedString(newReplicaCount)).append("\n");
    sb.append("    preferredAvailabilityZones: ").append(toIndentedString(preferredAvailabilityZones)).append("\n");
    sb.append("    preferredOutpostArns: ").append(toIndentedString(preferredOutpostArns)).append("\n");
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
    openapiFields.add("NewReplicaCount");
    openapiFields.add("PreferredAvailabilityZones");
    openapiFields.add("PreferredOutpostArns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("NodeGroupId");
    openapiRequiredFields.add("NewReplicaCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigureShard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigureShard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigureShard is not found in the empty JSON string", ConfigureShard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigureShard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigureShard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigureShard.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `NodeGroupId`
      String.validateJsonElement(jsonObj.get("NodeGroupId"));
      // validate the required field `NewReplicaCount`
      Integer.validateJsonElement(jsonObj.get("NewReplicaCount"));
      // validate the optional field `PreferredAvailabilityZones`
      if (jsonObj.get("PreferredAvailabilityZones") != null && !jsonObj.get("PreferredAvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PreferredAvailabilityZones"));
      }
      // validate the optional field `PreferredOutpostArns`
      if (jsonObj.get("PreferredOutpostArns") != null && !jsonObj.get("PreferredOutpostArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("PreferredOutpostArns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigureShard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigureShard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigureShard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigureShard.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigureShard>() {
           @Override
           public void write(JsonWriter out, ConfigureShard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigureShard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigureShard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigureShard
   * @throws IOException if the JSON string is invalid with respect to ConfigureShard
   */
  public static ConfigureShard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigureShard.class);
  }

  /**
   * Convert an instance of ConfigureShard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

