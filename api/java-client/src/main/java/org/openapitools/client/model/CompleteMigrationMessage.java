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
 * CompleteMigrationMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CompleteMigrationMessage {
  public static final String SERIALIZED_NAME_REPLICATION_GROUP_ID = "ReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_REPLICATION_GROUP_ID)
  private String replicationGroupId;

  public static final String SERIALIZED_NAME_FORCE = "Force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public CompleteMigrationMessage() {
  }

  public CompleteMigrationMessage replicationGroupId(String replicationGroupId) {
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


  public CompleteMigrationMessage force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Get force
   * @return force
   */
  @javax.annotation.Nullable
  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteMigrationMessage completeMigrationMessage = (CompleteMigrationMessage) o;
    return Objects.equals(this.replicationGroupId, completeMigrationMessage.replicationGroupId) &&
        Objects.equals(this.force, completeMigrationMessage.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationGroupId, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteMigrationMessage {\n");
    sb.append("    replicationGroupId: ").append(toIndentedString(replicationGroupId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
    openapiFields.add("Force");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationGroupId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompleteMigrationMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompleteMigrationMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompleteMigrationMessage is not found in the empty JSON string", CompleteMigrationMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompleteMigrationMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompleteMigrationMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompleteMigrationMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationGroupId`
      String.validateJsonElement(jsonObj.get("ReplicationGroupId"));
      // validate the optional field `Force`
      if (jsonObj.get("Force") != null && !jsonObj.get("Force").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("Force"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompleteMigrationMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompleteMigrationMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompleteMigrationMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompleteMigrationMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CompleteMigrationMessage>() {
           @Override
           public void write(JsonWriter out, CompleteMigrationMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompleteMigrationMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompleteMigrationMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompleteMigrationMessage
   * @throws IOException if the JSON string is invalid with respect to CompleteMigrationMessage
   */
  public static CompleteMigrationMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompleteMigrationMessage.class);
  }

  /**
   * Convert an instance of CompleteMigrationMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

