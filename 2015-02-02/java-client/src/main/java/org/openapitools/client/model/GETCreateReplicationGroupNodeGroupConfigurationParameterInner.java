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
 * GETCreateReplicationGroupNodeGroupConfigurationParameterInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:10.865581-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GETCreateReplicationGroupNodeGroupConfigurationParameterInner {
  public static final String SERIALIZED_NAME_NODE_GROUP_ID = "NodeGroupId";
  @SerializedName(SERIALIZED_NAME_NODE_GROUP_ID)
  private String nodeGroupId;

  public static final String SERIALIZED_NAME_SLOTS = "Slots";
  @SerializedName(SERIALIZED_NAME_SLOTS)
  private String slots;

  public static final String SERIALIZED_NAME_REPLICA_COUNT = "ReplicaCount";
  @SerializedName(SERIALIZED_NAME_REPLICA_COUNT)
  private Integer replicaCount;

  public static final String SERIALIZED_NAME_PRIMARY_AVAILABILITY_ZONE = "PrimaryAvailabilityZone";
  @SerializedName(SERIALIZED_NAME_PRIMARY_AVAILABILITY_ZONE)
  private String primaryAvailabilityZone;

  public static final String SERIALIZED_NAME_REPLICA_AVAILABILITY_ZONES = "ReplicaAvailabilityZones";
  @SerializedName(SERIALIZED_NAME_REPLICA_AVAILABILITY_ZONES)
  private List replicaAvailabilityZones;

  public static final String SERIALIZED_NAME_PRIMARY_OUTPOST_ARN = "PrimaryOutpostArn";
  @SerializedName(SERIALIZED_NAME_PRIMARY_OUTPOST_ARN)
  private String primaryOutpostArn;

  public static final String SERIALIZED_NAME_REPLICA_OUTPOST_ARNS = "ReplicaOutpostArns";
  @SerializedName(SERIALIZED_NAME_REPLICA_OUTPOST_ARNS)
  private List replicaOutpostArns;

  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner() {
  }

  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner nodeGroupId(String nodeGroupId) {
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


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner slots(String slots) {
    this.slots = slots;
    return this;
  }

  /**
   * Get slots
   * @return slots
   */
  @javax.annotation.Nullable
  public String getSlots() {
    return slots;
  }

  public void setSlots(String slots) {
    this.slots = slots;
  }


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner replicaCount(Integer replicaCount) {
    this.replicaCount = replicaCount;
    return this;
  }

  /**
   * Get replicaCount
   * @return replicaCount
   */
  @javax.annotation.Nullable
  public Integer getReplicaCount() {
    return replicaCount;
  }

  public void setReplicaCount(Integer replicaCount) {
    this.replicaCount = replicaCount;
  }


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner primaryAvailabilityZone(String primaryAvailabilityZone) {
    this.primaryAvailabilityZone = primaryAvailabilityZone;
    return this;
  }

  /**
   * Get primaryAvailabilityZone
   * @return primaryAvailabilityZone
   */
  @javax.annotation.Nullable
  public String getPrimaryAvailabilityZone() {
    return primaryAvailabilityZone;
  }

  public void setPrimaryAvailabilityZone(String primaryAvailabilityZone) {
    this.primaryAvailabilityZone = primaryAvailabilityZone;
  }


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner replicaAvailabilityZones(List replicaAvailabilityZones) {
    this.replicaAvailabilityZones = replicaAvailabilityZones;
    return this;
  }

  /**
   * Get replicaAvailabilityZones
   * @return replicaAvailabilityZones
   */
  @javax.annotation.Nullable
  public List getReplicaAvailabilityZones() {
    return replicaAvailabilityZones;
  }

  public void setReplicaAvailabilityZones(List replicaAvailabilityZones) {
    this.replicaAvailabilityZones = replicaAvailabilityZones;
  }


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner primaryOutpostArn(String primaryOutpostArn) {
    this.primaryOutpostArn = primaryOutpostArn;
    return this;
  }

  /**
   * Get primaryOutpostArn
   * @return primaryOutpostArn
   */
  @javax.annotation.Nullable
  public String getPrimaryOutpostArn() {
    return primaryOutpostArn;
  }

  public void setPrimaryOutpostArn(String primaryOutpostArn) {
    this.primaryOutpostArn = primaryOutpostArn;
  }


  public GETCreateReplicationGroupNodeGroupConfigurationParameterInner replicaOutpostArns(List replicaOutpostArns) {
    this.replicaOutpostArns = replicaOutpostArns;
    return this;
  }

  /**
   * Get replicaOutpostArns
   * @return replicaOutpostArns
   */
  @javax.annotation.Nullable
  public List getReplicaOutpostArns() {
    return replicaOutpostArns;
  }

  public void setReplicaOutpostArns(List replicaOutpostArns) {
    this.replicaOutpostArns = replicaOutpostArns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETCreateReplicationGroupNodeGroupConfigurationParameterInner geTCreateReplicationGroupNodeGroupConfigurationParameterInner = (GETCreateReplicationGroupNodeGroupConfigurationParameterInner) o;
    return Objects.equals(this.nodeGroupId, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.nodeGroupId) &&
        Objects.equals(this.slots, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.slots) &&
        Objects.equals(this.replicaCount, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.replicaCount) &&
        Objects.equals(this.primaryAvailabilityZone, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.primaryAvailabilityZone) &&
        Objects.equals(this.replicaAvailabilityZones, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.replicaAvailabilityZones) &&
        Objects.equals(this.primaryOutpostArn, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.primaryOutpostArn) &&
        Objects.equals(this.replicaOutpostArns, geTCreateReplicationGroupNodeGroupConfigurationParameterInner.replicaOutpostArns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeGroupId, slots, replicaCount, primaryAvailabilityZone, replicaAvailabilityZones, primaryOutpostArn, replicaOutpostArns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETCreateReplicationGroupNodeGroupConfigurationParameterInner {\n");
    sb.append("    nodeGroupId: ").append(toIndentedString(nodeGroupId)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    replicaCount: ").append(toIndentedString(replicaCount)).append("\n");
    sb.append("    primaryAvailabilityZone: ").append(toIndentedString(primaryAvailabilityZone)).append("\n");
    sb.append("    replicaAvailabilityZones: ").append(toIndentedString(replicaAvailabilityZones)).append("\n");
    sb.append("    primaryOutpostArn: ").append(toIndentedString(primaryOutpostArn)).append("\n");
    sb.append("    replicaOutpostArns: ").append(toIndentedString(replicaOutpostArns)).append("\n");
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
    openapiFields.add("Slots");
    openapiFields.add("ReplicaCount");
    openapiFields.add("PrimaryAvailabilityZone");
    openapiFields.add("ReplicaAvailabilityZones");
    openapiFields.add("PrimaryOutpostArn");
    openapiFields.add("ReplicaOutpostArns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GETCreateReplicationGroupNodeGroupConfigurationParameterInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GETCreateReplicationGroupNodeGroupConfigurationParameterInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GETCreateReplicationGroupNodeGroupConfigurationParameterInner is not found in the empty JSON string", GETCreateReplicationGroupNodeGroupConfigurationParameterInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GETCreateReplicationGroupNodeGroupConfigurationParameterInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GETCreateReplicationGroupNodeGroupConfigurationParameterInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `NodeGroupId`
      if (jsonObj.get("NodeGroupId") != null && !jsonObj.get("NodeGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NodeGroupId"));
      }
      // validate the optional field `Slots`
      if (jsonObj.get("Slots") != null && !jsonObj.get("Slots").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Slots"));
      }
      // validate the optional field `ReplicaCount`
      if (jsonObj.get("ReplicaCount") != null && !jsonObj.get("ReplicaCount").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ReplicaCount"));
      }
      // validate the optional field `PrimaryAvailabilityZone`
      if (jsonObj.get("PrimaryAvailabilityZone") != null && !jsonObj.get("PrimaryAvailabilityZone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrimaryAvailabilityZone"));
      }
      // validate the optional field `ReplicaAvailabilityZones`
      if (jsonObj.get("ReplicaAvailabilityZones") != null && !jsonObj.get("ReplicaAvailabilityZones").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicaAvailabilityZones"));
      }
      // validate the optional field `PrimaryOutpostArn`
      if (jsonObj.get("PrimaryOutpostArn") != null && !jsonObj.get("PrimaryOutpostArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PrimaryOutpostArn"));
      }
      // validate the optional field `ReplicaOutpostArns`
      if (jsonObj.get("ReplicaOutpostArns") != null && !jsonObj.get("ReplicaOutpostArns").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("ReplicaOutpostArns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GETCreateReplicationGroupNodeGroupConfigurationParameterInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GETCreateReplicationGroupNodeGroupConfigurationParameterInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GETCreateReplicationGroupNodeGroupConfigurationParameterInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GETCreateReplicationGroupNodeGroupConfigurationParameterInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GETCreateReplicationGroupNodeGroupConfigurationParameterInner>() {
           @Override
           public void write(JsonWriter out, GETCreateReplicationGroupNodeGroupConfigurationParameterInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GETCreateReplicationGroupNodeGroupConfigurationParameterInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GETCreateReplicationGroupNodeGroupConfigurationParameterInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GETCreateReplicationGroupNodeGroupConfigurationParameterInner
   * @throws IOException if the JSON string is invalid with respect to GETCreateReplicationGroupNodeGroupConfigurationParameterInner
   */
  public static GETCreateReplicationGroupNodeGroupConfigurationParameterInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GETCreateReplicationGroupNodeGroupConfigurationParameterInner.class);
  }

  /**
   * Convert an instance of GETCreateReplicationGroupNodeGroupConfigurationParameterInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

