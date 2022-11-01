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
 * FailoverGlobalReplicationGroupMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:01.012361-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FailoverGlobalReplicationGroupMessage {
  public static final String SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_ID = "GlobalReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP_ID)
  private String globalReplicationGroupId;

  public static final String SERIALIZED_NAME_PRIMARY_REGION = "PrimaryRegion";
  @SerializedName(SERIALIZED_NAME_PRIMARY_REGION)
  private String primaryRegion;

  public static final String SERIALIZED_NAME_PRIMARY_REPLICATION_GROUP_ID = "PrimaryReplicationGroupId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_REPLICATION_GROUP_ID)
  private String primaryReplicationGroupId;

  public FailoverGlobalReplicationGroupMessage() {
  }

  public FailoverGlobalReplicationGroupMessage globalReplicationGroupId(String globalReplicationGroupId) {
    this.globalReplicationGroupId = globalReplicationGroupId;
    return this;
  }

  /**
   * Get globalReplicationGroupId
   * @return globalReplicationGroupId
   */
  @javax.annotation.Nonnull
  public String getGlobalReplicationGroupId() {
    return globalReplicationGroupId;
  }

  public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
    this.globalReplicationGroupId = globalReplicationGroupId;
  }


  public FailoverGlobalReplicationGroupMessage primaryRegion(String primaryRegion) {
    this.primaryRegion = primaryRegion;
    return this;
  }

  /**
   * Get primaryRegion
   * @return primaryRegion
   */
  @javax.annotation.Nonnull
  public String getPrimaryRegion() {
    return primaryRegion;
  }

  public void setPrimaryRegion(String primaryRegion) {
    this.primaryRegion = primaryRegion;
  }


  public FailoverGlobalReplicationGroupMessage primaryReplicationGroupId(String primaryReplicationGroupId) {
    this.primaryReplicationGroupId = primaryReplicationGroupId;
    return this;
  }

  /**
   * Get primaryReplicationGroupId
   * @return primaryReplicationGroupId
   */
  @javax.annotation.Nonnull
  public String getPrimaryReplicationGroupId() {
    return primaryReplicationGroupId;
  }

  public void setPrimaryReplicationGroupId(String primaryReplicationGroupId) {
    this.primaryReplicationGroupId = primaryReplicationGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailoverGlobalReplicationGroupMessage failoverGlobalReplicationGroupMessage = (FailoverGlobalReplicationGroupMessage) o;
    return Objects.equals(this.globalReplicationGroupId, failoverGlobalReplicationGroupMessage.globalReplicationGroupId) &&
        Objects.equals(this.primaryRegion, failoverGlobalReplicationGroupMessage.primaryRegion) &&
        Objects.equals(this.primaryReplicationGroupId, failoverGlobalReplicationGroupMessage.primaryReplicationGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalReplicationGroupId, primaryRegion, primaryReplicationGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailoverGlobalReplicationGroupMessage {\n");
    sb.append("    globalReplicationGroupId: ").append(toIndentedString(globalReplicationGroupId)).append("\n");
    sb.append("    primaryRegion: ").append(toIndentedString(primaryRegion)).append("\n");
    sb.append("    primaryReplicationGroupId: ").append(toIndentedString(primaryReplicationGroupId)).append("\n");
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
    openapiFields.add("PrimaryRegion");
    openapiFields.add("PrimaryReplicationGroupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GlobalReplicationGroupId");
    openapiRequiredFields.add("PrimaryRegion");
    openapiRequiredFields.add("PrimaryReplicationGroupId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FailoverGlobalReplicationGroupMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FailoverGlobalReplicationGroupMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailoverGlobalReplicationGroupMessage is not found in the empty JSON string", FailoverGlobalReplicationGroupMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FailoverGlobalReplicationGroupMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FailoverGlobalReplicationGroupMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FailoverGlobalReplicationGroupMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `GlobalReplicationGroupId`
      String.validateJsonElement(jsonObj.get("GlobalReplicationGroupId"));
      // validate the required field `PrimaryRegion`
      String.validateJsonElement(jsonObj.get("PrimaryRegion"));
      // validate the required field `PrimaryReplicationGroupId`
      String.validateJsonElement(jsonObj.get("PrimaryReplicationGroupId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailoverGlobalReplicationGroupMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailoverGlobalReplicationGroupMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailoverGlobalReplicationGroupMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailoverGlobalReplicationGroupMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<FailoverGlobalReplicationGroupMessage>() {
           @Override
           public void write(JsonWriter out, FailoverGlobalReplicationGroupMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FailoverGlobalReplicationGroupMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FailoverGlobalReplicationGroupMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FailoverGlobalReplicationGroupMessage
   * @throws IOException if the JSON string is invalid with respect to FailoverGlobalReplicationGroupMessage
   */
  public static FailoverGlobalReplicationGroupMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailoverGlobalReplicationGroupMessage.class);
  }

  /**
   * Convert an instance of FailoverGlobalReplicationGroupMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

