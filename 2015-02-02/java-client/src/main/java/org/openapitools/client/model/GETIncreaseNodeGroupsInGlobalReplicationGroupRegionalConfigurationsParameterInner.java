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
 * GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:47.534295-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_REPLICATION_GROUP_REGION = "ReplicationGroupRegion";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_REGION)
  private String replicationGroupRegion;

  public static final String SERIALIZED_NAME_RESHARDING_CONFIGURATION = "ReshardingConfiguration";
  @SerializedName(SERIALIZED_NAME_RESHARDING_CONFIGURATION)
  private List reshardingConfiguration;

  public GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner() {
  }

  public GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner replicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
    return this;
  }

  /**
   * Get replicationGroupId
   * @return replicationGroupId
   */
  @javax.annotation.Nonnull
  public String getReplicationGroupId() {
    return replicationGroupId;
  }

  public void setReplicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
  }


  public GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner replicationGroupRegion(String replicationGroupRegion) {
    this.replicationGroupRegion = replicationGroupRegion;
    return this;
  }

  /**
   * Get replicationGroupRegion
   * @return replicationGroupRegion
   */
  @javax.annotation.Nonnull
  public String getReplicationGroupRegion() {
    return replicationGroupRegion;
  }

  public void setReplicationGroupRegion(String replicationGroupRegion) {
    this.replicationGroupRegion = replicationGroupRegion;
  }


  public GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner reshardingConfiguration(List reshardingConfiguration) {
    this.reshardingConfiguration = reshardingConfiguration;
    return this;
  }

  /**
   * Get reshardingConfiguration
   * @return reshardingConfiguration
   */
  @javax.annotation.Nonnull
  public List getReshardingConfiguration() {
    return reshardingConfiguration;
  }

  public void setReshardingConfiguration(List reshardingConfiguration) {
    this.reshardingConfiguration = reshardingConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner geTIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner = (GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner) o;
    return Objects.equals(this.replicationGroupId, geTIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.replicationGroupId) &&
        Objects.equals(this.replicationGroupRegion, geTIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.replicationGroupRegion) &&
        Objects.equals(this.reshardingConfiguration, geTIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.reshardingConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, replicationGroupRegion, reshardingConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    replicationGroupRegion: ").append(toIndentedString(replicationGroupRegion)).append("\n");
    sb.append("    reshardingConfiguration: ").append(toIndentedString(reshardingConfiguration)).append("\n");
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
    openapiFields.add("ReplicationGroupId");
    openapiFields.add("ReplicationGroupRegion");
    openapiFields.add("ReshardingConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationGroupId");
    openapiRequiredFields.add("ReplicationGroupRegion");
    openapiRequiredFields.add("ReshardingConfiguration");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner is not found in the empty JSON string", GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationGroupId`
      String.validateJsonElement(jsonObj.get("ReplicationGroupId"));
      // validate the required field `ReplicationGroupRegion`
      String.validateJsonElement(jsonObj.get("ReplicationGroupRegion"));
      // validate the required field `ReshardingConfiguration`
      List.validateJsonElement(jsonObj.get("ReshardingConfiguration"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner>() {
           @Override
           public void write(JsonWriter out, GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner
   * @throws IOException if the JSON string is invalid with respect to GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner
   */
  public static GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner.class);
  }

  /**
   * Convert an instance of GETIncreaseNodeGroupsInGlobalReplicationGroupRegionalConfigurationsParameterInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

