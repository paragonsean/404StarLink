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
 * Represents the input of a &lt;code&gt;DescribeCacheSecurityGroups&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:05.565321-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeCacheSecurityGroupsMessage {
  public static final String SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME = "CacheSecurityGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME)
  private String cacheSecurityGroupName;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public DescribeCacheSecurityGroupsMessage() {
  }

  public DescribeCacheSecurityGroupsMessage cacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
    return this;
  }

  /**
   * Get cacheSecurityGroupName
   * @return cacheSecurityGroupName
   */
  @javax.annotation.Nullable
  public String getCacheSecurityGroupName() {
    return cacheSecurityGroupName;
  }

  public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
    this.cacheSecurityGroupName = cacheSecurityGroupName;
  }


  public DescribeCacheSecurityGroupsMessage maxRecords(Integer maxRecords) {
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


  public DescribeCacheSecurityGroupsMessage marker(String marker) {
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
    DescribeCacheSecurityGroupsMessage describeCacheSecurityGroupsMessage = (DescribeCacheSecurityGroupsMessage) o;
    return Objects.equals(this.cacheSecurityGroupName, describeCacheSecurityGroupsMessage.cacheSecurityGroupName) &&
        Objects.equals(this.maxRecords, describeCacheSecurityGroupsMessage.maxRecords) &&
        Objects.equals(this.marker, describeCacheSecurityGroupsMessage.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSecurityGroupName, maxRecords, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCacheSecurityGroupsMessage {\n");
    sb.append("    cacheSecurityGroupName: ").append(toIndentedString(cacheSecurityGroupName)).append("\n");
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
    openapiFields.add("CacheSecurityGroupName");
    openapiFields.add("MaxRecords");
    openapiFields.add("Marker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeCacheSecurityGroupsMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeCacheSecurityGroupsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeCacheSecurityGroupsMessage is not found in the empty JSON string", DescribeCacheSecurityGroupsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeCacheSecurityGroupsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeCacheSecurityGroupsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheSecurityGroupName`
      if (jsonObj.get("CacheSecurityGroupName") != null && !jsonObj.get("CacheSecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSecurityGroupName"));
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
       if (!DescribeCacheSecurityGroupsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeCacheSecurityGroupsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeCacheSecurityGroupsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeCacheSecurityGroupsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeCacheSecurityGroupsMessage>() {
           @Override
           public void write(JsonWriter out, DescribeCacheSecurityGroupsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeCacheSecurityGroupsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeCacheSecurityGroupsMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeCacheSecurityGroupsMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeCacheSecurityGroupsMessage
   */
  public static DescribeCacheSecurityGroupsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeCacheSecurityGroupsMessage.class);
  }

  /**
   * Convert an instance of DescribeCacheSecurityGroupsMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

