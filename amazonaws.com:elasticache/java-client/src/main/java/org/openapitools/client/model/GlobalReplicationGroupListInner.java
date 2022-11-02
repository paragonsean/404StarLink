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
 * GlobalReplicationGroupListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GlobalReplicationGroupListInner {
  public static final String SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_ID = "GlobalReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_ID)
  private String globalReplicationGroupId;

  public static final String SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_DESCRIPTION = "GlobalReplicationGroupDescription";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_DESCRIPTION)
  private String globalReplicationGroupDescription;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CACHE_NODE_TYPE = "CacheNodeType";
  @SerializedName(SERIALIZED_NAME_CACHE_NODE_TYPE)
  private String cacheNodeType;

  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_MEMBERS = "Members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List members;

  public static final String SERIALIZED_NAME_CLUSTER_ENABLED = "ClusterEnabled";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ENABLED)
  private Boolean clusterEnabled;

  public static final String SERIALIZED_NAME_GLOBAL_NODE_GROUPS = "GlobalNodeGroups";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NODE_GROUPS)
  private List globalNodeGroups;

  public static final String SERIALIZED_NAME_AUTH_TOKEN_ENABLED = "AuthTokenEnabled";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN_ENABLED)
  private Boolean authTokenEnabled;

  public static final String SERIALIZED_NAME_TRANSIT_ENCRYPTION_ENABLED = "TransitEncryptionEnabled";
  @SerializedName(SERIALIZED_NAME_TRANSIT_ENCRYPTION_ENABLED)
  private Boolean transitEncryptionEnabled;

  public static final String SERIALIZED_NAME_AT_REST_ENCRYPTION_ENABLED = "AtRestEncryptionEnabled";
  @SerializedName(SERIALIZED_NAME_AT_REST_ENCRYPTION_ENABLED)
  private Boolean atRestEncryptionEnabled;

  public static final String SERIALIZED_NAME_A_R_N = "ARN";
  @SerializedName(SERIALIZED_NAME_A_R_N)
  private String ARN;

  public GlobalReplicationGroupListInner() {
  }

  public GlobalReplicationGroupListInner globalReplicationGroupId(String globalReplicationGroupId) {
    this.globalReplicationGroupId = globalReplicationGroupId;
    return this;
  }

  /**
   * Get globalReplicationGroupId
   * @return globalReplicationGroupId
   */
  @javax.annotation.Nullable
  public String getGlobalReplicationGroupId() {
    return globalReplicationGroupId;
  }

  public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
    this.globalReplicationGroupId = globalReplicationGroupId;
  }


  public GlobalReplicationGroupListInner globalReplicationGroupDescription(String globalReplicationGroupDescription) {
    this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    return this;
  }

  /**
   * Get globalReplicationGroupDescription
   * @return globalReplicationGroupDescription
   */
  @javax.annotation.Nullable
  public String getGlobalReplicationGroupDescription() {
    return globalReplicationGroupDescription;
  }

  public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
    this.globalReplicationGroupDescription = globalReplicationGroupDescription;
  }


  public GlobalReplicationGroupListInner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public GlobalReplicationGroupListInner cacheNodeType(String cacheNodeType) {
    this.cacheNodeType = cacheNodeType;
    return this;
  }

  /**
   * Get cacheNodeType
   * @return cacheNodeType
   */
  @javax.annotation.Nullable
  public String getCacheNodeType() {
    return cacheNodeType;
  }

  public void setCacheNodeType(String cacheNodeType) {
    this.cacheNodeType = cacheNodeType;
  }


  public GlobalReplicationGroupListInner engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public GlobalReplicationGroupListInner engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
   */
  @javax.annotation.Nullable
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }


  public GlobalReplicationGroupListInner members(List members) {
    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
   */
  @javax.annotation.Nullable
  public List getMembers() {
    return members;
  }

  public void setMembers(List members) {
    this.members = members;
  }


  public GlobalReplicationGroupListInner clusterEnabled(Boolean clusterEnabled) {
    this.clusterEnabled = clusterEnabled;
    return this;
  }

  /**
   * Get clusterEnabled
   * @return clusterEnabled
   */
  @javax.annotation.Nullable
  public Boolean getClusterEnabled() {
    return clusterEnabled;
  }

  public void setClusterEnabled(Boolean clusterEnabled) {
    this.clusterEnabled = clusterEnabled;
  }


  public GlobalReplicationGroupListInner globalNodeGroups(List globalNodeGroups) {
    this.globalNodeGroups = globalNodeGroups;
    return this;
  }

  /**
   * Get globalNodeGroups
   * @return globalNodeGroups
   */
  @javax.annotation.Nullable
  public List getGlobalNodeGroups() {
    return globalNodeGroups;
  }

  public void setGlobalNodeGroups(List globalNodeGroups) {
    this.globalNodeGroups = globalNodeGroups;
  }


  public GlobalReplicationGroupListInner authTokenEnabled(Boolean authTokenEnabled) {
    this.authTokenEnabled = authTokenEnabled;
    return this;
  }

  /**
   * Get authTokenEnabled
   * @return authTokenEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAuthTokenEnabled() {
    return authTokenEnabled;
  }

  public void setAuthTokenEnabled(Boolean authTokenEnabled) {
    this.authTokenEnabled = authTokenEnabled;
  }


  public GlobalReplicationGroupListInner transitEncryptionEnabled(Boolean transitEncryptionEnabled) {
    this.transitEncryptionEnabled = transitEncryptionEnabled;
    return this;
  }

  /**
   * Get transitEncryptionEnabled
   * @return transitEncryptionEnabled
   */
  @javax.annotation.Nullable
  public Boolean getTransitEncryptionEnabled() {
    return transitEncryptionEnabled;
  }

  public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
    this.transitEncryptionEnabled = transitEncryptionEnabled;
  }


  public GlobalReplicationGroupListInner atRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
    this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    return this;
  }

  /**
   * Get atRestEncryptionEnabled
   * @return atRestEncryptionEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAtRestEncryptionEnabled() {
    return atRestEncryptionEnabled;
  }

  public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
    this.atRestEncryptionEnabled = atRestEncryptionEnabled;
  }


  public GlobalReplicationGroupListInner ARN(String ARN) {
    this.ARN = ARN;
    return this;
  }

  /**
   * Get ARN
   * @return ARN
   */
  @javax.annotation.Nullable
  public String getARN() {
    return ARN;
  }

  public void setARN(String ARN) {
    this.ARN = ARN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalReplicationGroupListInner globalReplicationGroupListInner = (GlobalReplicationGroupListInner) o;
    return Objects.equals(this.globalReplicationGroupId, globalReplicationGroupListInner.globalReplicationGroupId) &&
        Objects.equals(this.globalReplicationGroupDescription, globalReplicationGroupListInner.globalReplicationGroupDescription) &&
        Objects.equals(this.status, globalReplicationGroupListInner.status) &&
        Objects.equals(this.cacheNodeType, globalReplicationGroupListInner.cacheNodeType) &&
        Objects.equals(this.engine, globalReplicationGroupListInner.engine) &&
        Objects.equals(this.engineVersion, globalReplicationGroupListInner.engineVersion) &&
        Objects.equals(this.members, globalReplicationGroupListInner.members) &&
        Objects.equals(this.clusterEnabled, globalReplicationGroupListInner.clusterEnabled) &&
        Objects.equals(this.globalNodeGroups, globalReplicationGroupListInner.globalNodeGroups) &&
        Objects.equals(this.authTokenEnabled, globalReplicationGroupListInner.authTokenEnabled) &&
        Objects.equals(this.transitEncryptionEnabled, globalReplicationGroupListInner.transitEncryptionEnabled) &&
        Objects.equals(this.atRestEncryptionEnabled, globalReplicationGroupListInner.atRestEncryptionEnabled) &&
        Objects.equals(this.ARN, globalReplicationGroupListInner.ARN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalReplicationGroupId, globalReplicationGroupDescription, status, cacheNodeType, engine, engineVersion, members, clusterEnabled, globalNodeGroups, authTokenEnabled, transitEncryptionEnabled, atRestEncryptionEnabled, ARN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalReplicationGroupListInner {\n");
    sb.append("    globalReplicationGroupId: ").append(toIndentedString(globalReplicationGroupId)).append("\n");
    sb.append("    globalReplicationGroupDescription: ").append(toIndentedString(globalReplicationGroupDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cacheNodeType: ").append(toIndentedString(cacheNodeType)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    clusterEnabled: ").append(toIndentedString(clusterEnabled)).append("\n");
    sb.append("    globalNodeGroups: ").append(toIndentedString(globalNodeGroups)).append("\n");
    sb.append("    authTokenEnabled: ").append(toIndentedString(authTokenEnabled)).append("\n");
    sb.append("    transitEncryptionEnabled: ").append(toIndentedString(transitEncryptionEnabled)).append("\n");
    sb.append("    atRestEncryptionEnabled: ").append(toIndentedString(atRestEncryptionEnabled)).append("\n");
    sb.append("    ARN: ").append(toIndentedString(ARN)).append("\n");
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
    openapiFields.add("GlobalReplicationGroupId");
    openapiFields.add("GlobalReplicationGroupDescription");
    openapiFields.add("Status");
    openapiFields.add("CacheNodeType");
    openapiFields.add("Engine");
    openapiFields.add("EngineVersion");
    openapiFields.add("Members");
    openapiFields.add("ClusterEnabled");
    openapiFields.add("GlobalNodeGroups");
    openapiFields.add("AuthTokenEnabled");
    openapiFields.add("TransitEncryptionEnabled");
    openapiFields.add("AtRestEncryptionEnabled");
    openapiFields.add("ARN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GlobalReplicationGroupListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalReplicationGroupListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalReplicationGroupListInner is not found in the empty JSON string", GlobalReplicationGroupListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalReplicationGroupListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalReplicationGroupListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `GlobalReplicationGroupId`
      if (jsonObj.get("GlobalReplicationGroupId") != null && !jsonObj.get("GlobalReplicationGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GlobalReplicationGroupId"));
      }
      // validate the optional field `GlobalReplicationGroupDescription`
      if (jsonObj.get("GlobalReplicationGroupDescription") != null && !jsonObj.get("GlobalReplicationGroupDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("GlobalReplicationGroupDescription"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `CacheNodeType`
      if (jsonObj.get("CacheNodeType") != null && !jsonObj.get("CacheNodeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheNodeType"));
      }
      // validate the optional field `Engine`
      if (jsonObj.get("Engine") != null && !jsonObj.get("Engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Engine"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `Members`
      if (jsonObj.get("Members") != null && !jsonObj.get("Members").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Members"));
      }
      // validate the optional field `ClusterEnabled`
      if (jsonObj.get("ClusterEnabled") != null && !jsonObj.get("ClusterEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("ClusterEnabled"));
      }
      // validate the optional field `GlobalNodeGroups`
      if (jsonObj.get("GlobalNodeGroups") != null && !jsonObj.get("GlobalNodeGroups").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("GlobalNodeGroups"));
      }
      // validate the optional field `AuthTokenEnabled`
      if (jsonObj.get("AuthTokenEnabled") != null && !jsonObj.get("AuthTokenEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AuthTokenEnabled"));
      }
      // validate the optional field `TransitEncryptionEnabled`
      if (jsonObj.get("TransitEncryptionEnabled") != null && !jsonObj.get("TransitEncryptionEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("TransitEncryptionEnabled"));
      }
      // validate the optional field `AtRestEncryptionEnabled`
      if (jsonObj.get("AtRestEncryptionEnabled") != null && !jsonObj.get("AtRestEncryptionEnabled").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("AtRestEncryptionEnabled"));
      }
      // validate the optional field `ARN`
      if (jsonObj.get("ARN") != null && !jsonObj.get("ARN").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ARN"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalReplicationGroupListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalReplicationGroupListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalReplicationGroupListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalReplicationGroupListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalReplicationGroupListInner>() {
           @Override
           public void write(JsonWriter out, GlobalReplicationGroupListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalReplicationGroupListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GlobalReplicationGroupListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GlobalReplicationGroupListInner
   * @throws IOException if the JSON string is invalid with respect to GlobalReplicationGroupListInner
   */
  public static GlobalReplicationGroupListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalReplicationGroupListInner.class);
  }

  /**
   * Convert an instance of GlobalReplicationGroupListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

