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
 * Represents the input of a &lt;code&gt;DescribeCacheEngineVersions&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeCacheEngineVersionsMessage {
  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY = "CacheParameterGroupFamily";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY)
  private String cacheParameterGroupFamily;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "MaxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private Integer maxRecords;

  public static final String SERIALIZED_NAME_MARKER = "Marker";
  @SerializedName(SERIALIZED_NAME_MARKER)
  private String marker;

  public static final String SERIALIZED_NAME_DEFAULT_ONLY = "DefaultOnly";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ONLY)
  private Boolean defaultOnly;

  public DescribeCacheEngineVersionsMessage() {
  }

  public DescribeCacheEngineVersionsMessage engine(String engine) {
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


  public DescribeCacheEngineVersionsMessage engineVersion(String engineVersion) {
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


  public DescribeCacheEngineVersionsMessage cacheParameterGroupFamily(String cacheParameterGroupFamily) {
    this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    return this;
  }

  /**
   * Get cacheParameterGroupFamily
   * @return cacheParameterGroupFamily
   */
  @javax.annotation.Nullable
  public String getCacheParameterGroupFamily() {
    return cacheParameterGroupFamily;
  }

  public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
    this.cacheParameterGroupFamily = cacheParameterGroupFamily;
  }


  public DescribeCacheEngineVersionsMessage maxRecords(Integer maxRecords) {
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


  public DescribeCacheEngineVersionsMessage marker(String marker) {
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


  public DescribeCacheEngineVersionsMessage defaultOnly(Boolean defaultOnly) {
    this.defaultOnly = defaultOnly;
    return this;
  }

  /**
   * Get defaultOnly
   * @return defaultOnly
   */
  @javax.annotation.Nullable
  public Boolean getDefaultOnly() {
    return defaultOnly;
  }

  public void setDefaultOnly(Boolean defaultOnly) {
    this.defaultOnly = defaultOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCacheEngineVersionsMessage describeCacheEngineVersionsMessage = (DescribeCacheEngineVersionsMessage) o;
    return Objects.equals(this.engine, describeCacheEngineVersionsMessage.engine) &&
        Objects.equals(this.engineVersion, describeCacheEngineVersionsMessage.engineVersion) &&
        Objects.equals(this.cacheParameterGroupFamily, describeCacheEngineVersionsMessage.cacheParameterGroupFamily) &&
        Objects.equals(this.maxRecords, describeCacheEngineVersionsMessage.maxRecords) &&
        Objects.equals(this.marker, describeCacheEngineVersionsMessage.marker) &&
        Objects.equals(this.defaultOnly, describeCacheEngineVersionsMessage.defaultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, engineVersion, cacheParameterGroupFamily, maxRecords, marker, defaultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCacheEngineVersionsMessage {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    cacheParameterGroupFamily: ").append(toIndentedString(cacheParameterGroupFamily)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    defaultOnly: ").append(toIndentedString(defaultOnly)).append("\n");
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
    openapiFields.add("Engine");
    openapiFields.add("EngineVersion");
    openapiFields.add("CacheParameterGroupFamily");
    openapiFields.add("MaxRecords");
    openapiFields.add("Marker");
    openapiFields.add("DefaultOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeCacheEngineVersionsMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeCacheEngineVersionsMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeCacheEngineVersionsMessage is not found in the empty JSON string", DescribeCacheEngineVersionsMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeCacheEngineVersionsMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeCacheEngineVersionsMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Engine`
      if (jsonObj.get("Engine") != null && !jsonObj.get("Engine").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Engine"));
      }
      // validate the optional field `EngineVersion`
      if (jsonObj.get("EngineVersion") != null && !jsonObj.get("EngineVersion").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("EngineVersion"));
      }
      // validate the optional field `CacheParameterGroupFamily`
      if (jsonObj.get("CacheParameterGroupFamily") != null && !jsonObj.get("CacheParameterGroupFamily").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheParameterGroupFamily"));
      }
      // validate the optional field `MaxRecords`
      if (jsonObj.get("MaxRecords") != null && !jsonObj.get("MaxRecords").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxRecords"));
      }
      // validate the optional field `Marker`
      if (jsonObj.get("Marker") != null && !jsonObj.get("Marker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Marker"));
      }
      // validate the optional field `DefaultOnly`
      if (jsonObj.get("DefaultOnly") != null && !jsonObj.get("DefaultOnly").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DefaultOnly"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeCacheEngineVersionsMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeCacheEngineVersionsMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeCacheEngineVersionsMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeCacheEngineVersionsMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeCacheEngineVersionsMessage>() {
           @Override
           public void write(JsonWriter out, DescribeCacheEngineVersionsMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeCacheEngineVersionsMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeCacheEngineVersionsMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeCacheEngineVersionsMessage
   * @throws IOException if the JSON string is invalid with respect to DescribeCacheEngineVersionsMessage
   */
  public static DescribeCacheEngineVersionsMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeCacheEngineVersionsMessage.class);
  }

  /**
   * Convert an instance of DescribeCacheEngineVersionsMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

