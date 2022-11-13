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
 * Provides all of the details about a particular cache engine version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheEngineVersion {
  public static final String SERIALIZED_NAME_ENGINE = "Engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_ENGINE_VERSION = "EngineVersion";
  @SerializedName(SERIALIZED_NAME_ENGINE_VERSION)
  private String engineVersion;

  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY = "CacheParameterGroupFamily";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY)
  private String cacheParameterGroupFamily;

  public static final String SERIALIZED_NAME_CACHE_ENGINE_DESCRIPTION = "CacheEngineDescription";
  @SerializedName(SERIALIZED_NAME_CACHE_ENGINE_DESCRIPTION)
  private String cacheEngineDescription;

  public static final String SERIALIZED_NAME_CACHE_ENGINE_VERSION_DESCRIPTION = "CacheEngineVersionDescription";
  @SerializedName(SERIALIZED_NAME_CACHE_ENGINE_VERSION_DESCRIPTION)
  private String cacheEngineVersionDescription;

  public CacheEngineVersion() {
  }

  public CacheEngineVersion engine(String engine) {
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


  public CacheEngineVersion engineVersion(String engineVersion) {
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


  public CacheEngineVersion cacheParameterGroupFamily(String cacheParameterGroupFamily) {
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


  public CacheEngineVersion cacheEngineDescription(String cacheEngineDescription) {
    this.cacheEngineDescription = cacheEngineDescription;
    return this;
  }

  /**
   * Get cacheEngineDescription
   * @return cacheEngineDescription
   */
  @javax.annotation.Nullable
  public String getCacheEngineDescription() {
    return cacheEngineDescription;
  }

  public void setCacheEngineDescription(String cacheEngineDescription) {
    this.cacheEngineDescription = cacheEngineDescription;
  }


  public CacheEngineVersion cacheEngineVersionDescription(String cacheEngineVersionDescription) {
    this.cacheEngineVersionDescription = cacheEngineVersionDescription;
    return this;
  }

  /**
   * Get cacheEngineVersionDescription
   * @return cacheEngineVersionDescription
   */
  @javax.annotation.Nullable
  public String getCacheEngineVersionDescription() {
    return cacheEngineVersionDescription;
  }

  public void setCacheEngineVersionDescription(String cacheEngineVersionDescription) {
    this.cacheEngineVersionDescription = cacheEngineVersionDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheEngineVersion cacheEngineVersion = (CacheEngineVersion) o;
    return Objects.equals(this.engine, cacheEngineVersion.engine) &&
        Objects.equals(this.engineVersion, cacheEngineVersion.engineVersion) &&
        Objects.equals(this.cacheParameterGroupFamily, cacheEngineVersion.cacheParameterGroupFamily) &&
        Objects.equals(this.cacheEngineDescription, cacheEngineVersion.cacheEngineDescription) &&
        Objects.equals(this.cacheEngineVersionDescription, cacheEngineVersion.cacheEngineVersionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, engineVersion, cacheParameterGroupFamily, cacheEngineDescription, cacheEngineVersionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheEngineVersion {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    cacheParameterGroupFamily: ").append(toIndentedString(cacheParameterGroupFamily)).append("\n");
    sb.append("    cacheEngineDescription: ").append(toIndentedString(cacheEngineDescription)).append("\n");
    sb.append("    cacheEngineVersionDescription: ").append(toIndentedString(cacheEngineVersionDescription)).append("\n");
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
    openapiFields.add("CacheEngineDescription");
    openapiFields.add("CacheEngineVersionDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheEngineVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheEngineVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheEngineVersion is not found in the empty JSON string", CacheEngineVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheEngineVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheEngineVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `CacheEngineDescription`
      if (jsonObj.get("CacheEngineDescription") != null && !jsonObj.get("CacheEngineDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheEngineDescription"));
      }
      // validate the optional field `CacheEngineVersionDescription`
      if (jsonObj.get("CacheEngineVersionDescription") != null && !jsonObj.get("CacheEngineVersionDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheEngineVersionDescription"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheEngineVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheEngineVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheEngineVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheEngineVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheEngineVersion>() {
           @Override
           public void write(JsonWriter out, CacheEngineVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheEngineVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheEngineVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheEngineVersion
   * @throws IOException if the JSON string is invalid with respect to CacheEngineVersion
   */
  public static CacheEngineVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheEngineVersion.class);
  }

  /**
   * Convert an instance of CacheEngineVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

