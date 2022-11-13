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
 * Represents the input of a &lt;code&gt;CreateSnapshot&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateSnapshotMessage {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_CACHE_CLUSTER_ID = "CacheClusterId";
  @SerializedName(SERIALIZED_NAME_CACHE_CLUSTER_ID)
  private String cacheClusterId;

  public static final String SERIALIZED_NAME_SNAPSHOT_NAME = "SnapshotName";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NAME)
  private String snapshotName;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateSnapshotMessage() {
  }

  public CreateSnapshotMessage replicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
    return this;
  }

  /**
   * Get replicationGroupId
   * @return replicationGroupId
   */
  @javax.annotation.Nullable
  public String getReplicationGroupId() {
    return replicationGroupId;
  }

  public void setReplicationGroupId(String replicationGroupId) {
    this.replicationGroupId = replicationGroupId;
  }


  public CreateSnapshotMessage cacheClusterId(String cacheClusterId) {
    this.cacheClusterId = cacheClusterId;
    return this;
  }

  /**
   * Get cacheClusterId
   * @return cacheClusterId
   */
  @javax.annotation.Nullable
  public String getCacheClusterId() {
    return cacheClusterId;
  }

  public void setCacheClusterId(String cacheClusterId) {
    this.cacheClusterId = cacheClusterId;
  }


  public CreateSnapshotMessage snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * Get snapshotName
   * @return snapshotName
   */
  @javax.annotation.Nonnull
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  public CreateSnapshotMessage kmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  /**
   * Get kmsKeyId
   * @return kmsKeyId
   */
  @javax.annotation.Nullable
  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public void setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
  }


  public CreateSnapshotMessage tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnapshotMessage createSnapshotMessage = (CreateSnapshotMessage) o;
    return Objects.equals(this.replicationGroupId, createSnapshotMessage.replicationGroupId) &&
        Objects.equals(this.cacheClusterId, createSnapshotMessage.cacheClusterId) &&
        Objects.equals(this.snapshotName, createSnapshotMessage.snapshotName) &&
        Objects.equals(this.kmsKeyId, createSnapshotMessage.kmsKeyId) &&
        Objects.equals(this.tags, createSnapshotMessage.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, cacheClusterId, snapshotName, kmsKeyId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotMessage {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    cacheClusterId: ").append(toIndentedString(cacheClusterId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("CacheClusterId");
    openapiFields.add("SnapshotName");
    openapiFields.add("KmsKeyId");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SnapshotName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateSnapshotMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSnapshotMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSnapshotMessage is not found in the empty JSON string", CreateSnapshotMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSnapshotMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSnapshotMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSnapshotMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ReplicationGroupId`
      if (jsonObj.get("ReplicationGroupId") != null && !jsonObj.get("ReplicationGroupId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ReplicationGroupId"));
      }
      // validate the optional field `CacheClusterId`
      if (jsonObj.get("CacheClusterId") != null && !jsonObj.get("CacheClusterId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheClusterId"));
      }
      // validate the required field `SnapshotName`
      String.validateJsonElement(jsonObj.get("SnapshotName"));
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
      }
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSnapshotMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSnapshotMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSnapshotMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSnapshotMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSnapshotMessage>() {
           @Override
           public void write(JsonWriter out, CreateSnapshotMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSnapshotMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateSnapshotMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateSnapshotMessage
   * @throws IOException if the JSON string is invalid with respect to CreateSnapshotMessage
   */
  public static CreateSnapshotMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSnapshotMessage.class);
  }

  /**
   * Convert an instance of CreateSnapshotMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

