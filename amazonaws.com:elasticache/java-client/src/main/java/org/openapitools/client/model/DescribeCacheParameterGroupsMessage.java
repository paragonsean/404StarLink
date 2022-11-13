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
 * Represents the input of a &lt;code&gt;DescribeCacheParameterGroups&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeCacheParameterGroupsMessage {
  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME = "CacheParameterGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME)
  private String cacheParameterGroupName;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public DescribeCacheParameterGroupsMessage() {
  }

  public DescribeCacheParameterGroupsMessage cacheParameterGroupName(String cacheParameterGroupName) {
    this.cacheParameterGroupName = cacheParameterGroupName;
    return this;
  }

  /**
   * Get cacheParameterGroupName
   * @return cacheParameterGroupName
   */
  @javax.annotation.Nullable
  public String getCacheParameterGroupName() {
    return cacheParameterGroupName;
  }

  public void setCacheParameterGroupName(String cacheParameterGroupName) {
    this.cacheParameterGroupName = cacheParameterGroupName;
  }


  public DescribeCacheParameterGroupsMessage maxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
    return this;
  }

  /**
   * Get maxRecords
   * @return maxRecords
   */
  @javax.annotation.Nullable
  public Integer getMaxRecords() {
    return maxRecords;
  }

  public void setMaxRecords(Integer maxRecords) {
    this.maxRecords = maxRecords;
  }


  public DescribeCacheParameterGroupsMessage marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
   */
  @javax.annotation.Nullable
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCacheParameterGroupsMessage describeCacheParameterGroupsMessage = (DescribeCacheParameterGroupsMessage) o;
    return Objects.equals(this.cacheParameterGroupName, describeCacheParameterGroupsMessage.cacheParameterGroupName) &&
        Objects.equals(this.maxRecords, describeCacheParameterGroupsMessage.maxRecords) &&
        Objects.equals(this.marker, describeCacheParameterGroupsMessage.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheParameterGroupName, maxRecords, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCacheParameterGroupsMessage {\n");
    sb.append("    cacheParameterGroupName: ").append(toIndentedString(cacheParameterGroupName)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
    openapiFields.add("CacheParameterGroupName");
    openapiFields.add("MaxRecords");
    openapiFields.add("Marker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeCacheParameterGroupsMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeCacheParameterGroupsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeCacheParameterGroupsMessage is not found in the empty JSON string", DescribeCacheParameterGroupsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeCacheParameterGroupsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeCacheParameterGroupsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheParameterGroupName`
      if (jsonObj.get("CacheParameterGroupName") != null && !jsonObj.get("CacheParameterGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheParameterGroupName"));
      }
      // validate the optional field `MaxRecords`
      if (jsonObj.get("MaxRecords") != null && !jsonObj.get("MaxRecords").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxRecords"));
      }
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeCacheParameterGroupsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeCacheParameterGroupsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeCacheParameterGroupsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeCacheParameterGroupsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeCacheParameterGroupsMessage>() {
           @Override
           public void write(JsonWriter out, DescribeCacheParameterGroupsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeCacheParameterGroupsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeCacheParameterGroupsMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeCacheParameterGroupsMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeCacheParameterGroupsMessage
   */
  public static DescribeCacheParameterGroupsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeCacheParameterGroupsMessage.class);
  }

  /**
   * Convert an instance of DescribeCacheParameterGroupsMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

