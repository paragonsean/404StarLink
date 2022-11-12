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
import org.openapitools.client.model.GlobalReplicationGroup;

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
 * RebalanceSlotsInGlobalReplicationGroupResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:10.865581-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RebalanceSlotsInGlobalReplicationGroupResult {
  public static final String SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP = "GlobalReplicationGroup";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REPLICATION_GROUP)
  private GlobalReplicationGroup globalReplicationGroup;

  public RebalanceSlotsInGlobalReplicationGroupResult() {
  }

  public RebalanceSlotsInGlobalReplicationGroupResult globalReplicationGroup(GlobalReplicationGroup globalReplicationGroup) {
    this.globalReplicationGroup = globalReplicationGroup;
    return this;
  }

  /**
   * Get globalReplicationGroup
   * @return globalReplicationGroup
   */
  @javax.annotation.Nullable
  public GlobalReplicationGroup getGlobalReplicationGroup() {
    return globalReplicationGroup;
  }

  public void setGlobalReplicationGroup(GlobalReplicationGroup globalReplicationGroup) {
    this.globalReplicationGroup = globalReplicationGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebalanceSlotsInGlobalReplicationGroupResult rebalanceSlotsInGlobalReplicationGroupResult = (RebalanceSlotsInGlobalReplicationGroupResult) o;
    return Objects.equals(this.globalReplicationGroup, rebalanceSlotsInGlobalReplicationGroupResult.globalReplicationGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalReplicationGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebalanceSlotsInGlobalReplicationGroupResult {\n");
    sb.append("    globalReplicationGroup: ").append(toIndentedString(globalReplicationGroup)).append("\n");
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
    openapiFields.add("GlobalReplicationGroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RebalanceSlotsInGlobalReplicationGroupResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RebalanceSlotsInGlobalReplicationGroupResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RebalanceSlotsInGlobalReplicationGroupResult is not found in the empty JSON string", RebalanceSlotsInGlobalReplicationGroupResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RebalanceSlotsInGlobalReplicationGroupResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RebalanceSlotsInGlobalReplicationGroupResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `GlobalReplicationGroup`
      if (jsonObj.get("GlobalReplicationGroup") != null && !jsonObj.get("GlobalReplicationGroup").isJsonNull()) {
        GlobalReplicationGroup.validateJsonElement(jsonObj.get("GlobalReplicationGroup"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RebalanceSlotsInGlobalReplicationGroupResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RebalanceSlotsInGlobalReplicationGroupResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RebalanceSlotsInGlobalReplicationGroupResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RebalanceSlotsInGlobalReplicationGroupResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RebalanceSlotsInGlobalReplicationGroupResult>() {
           @Override
           public void write(JsonWriter out, RebalanceSlotsInGlobalReplicationGroupResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RebalanceSlotsInGlobalReplicationGroupResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RebalanceSlotsInGlobalReplicationGroupResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RebalanceSlotsInGlobalReplicationGroupResult
   * @throws IOException if the JSON string is invalid with respect to RebalanceSlotsInGlobalReplicationGroupResult
   */
  public static RebalanceSlotsInGlobalReplicationGroupResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RebalanceSlotsInGlobalReplicationGroupResult.class);
  }

  /**
   * Convert an instance of RebalanceSlotsInGlobalReplicationGroupResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

