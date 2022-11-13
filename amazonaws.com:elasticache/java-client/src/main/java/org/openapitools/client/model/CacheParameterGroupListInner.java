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
 * CacheParameterGroupListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheParameterGroupListInner {
  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME = "CacheParameterGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME)
  private String cacheParameterGroupName;

  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY = "CacheParameterGroupFamily";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY)
  private String cacheParameterGroupFamily;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "IsGlobal";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_NAME_A_R_N = "ARN";
  @SerializedName(SERIALIZED_NAME_A_R_N)
  private String ARN;

  public CacheParameterGroupListInner() {
  }

  public CacheParameterGroupListInner cacheParameterGroupName(String cacheParameterGroupName) {
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


  public CacheParameterGroupListInner cacheParameterGroupFamily(String cacheParameterGroupFamily) {
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


  public CacheParameterGroupListInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CacheParameterGroupListInner isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

  /**
   * Get isGlobal
   * @return isGlobal
   */
  @javax.annotation.Nullable
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public CacheParameterGroupListInner ARN(String ARN) {
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
    CacheParameterGroupListInner cacheParameterGroupListInner = (CacheParameterGroupListInner) o;
    return Objects.equals(this.cacheParameterGroupName, cacheParameterGroupListInner.cacheParameterGroupName) &&
        Objects.equals(this.cacheParameterGroupFamily, cacheParameterGroupListInner.cacheParameterGroupFamily) &&
        Objects.equals(this.description, cacheParameterGroupListInner.description) &&
        Objects.equals(this.isGlobal, cacheParameterGroupListInner.isGlobal) &&
        Objects.equals(this.ARN, cacheParameterGroupListInner.ARN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheParameterGroupName, cacheParameterGroupFamily, description, isGlobal, ARN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheParameterGroupListInner {\n");
    sb.append("    cacheParameterGroupName: ").append(toIndentedString(cacheParameterGroupName)).append("\n");
    sb.append("    cacheParameterGroupFamily: ").append(toIndentedString(cacheParameterGroupFamily)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
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
    openapiFields.add("CacheParameterGroupName");
    openapiFields.add("CacheParameterGroupFamily");
    openapiFields.add("Description");
    openapiFields.add("IsGlobal");
    openapiFields.add("ARN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheParameterGroupListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheParameterGroupListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheParameterGroupListInner is not found in the empty JSON string", CacheParameterGroupListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheParameterGroupListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheParameterGroupListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheParameterGroupName`
      if (jsonObj.get("CacheParameterGroupName") != null && !jsonObj.get("CacheParameterGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheParameterGroupName"));
      }
      // validate the optional field `CacheParameterGroupFamily`
      if (jsonObj.get("CacheParameterGroupFamily") != null && !jsonObj.get("CacheParameterGroupFamily").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheParameterGroupFamily"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
      // validate the optional field `IsGlobal`
      if (jsonObj.get("IsGlobal") != null && !jsonObj.get("IsGlobal").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IsGlobal"));
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
       if (!CacheParameterGroupListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheParameterGroupListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheParameterGroupListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheParameterGroupListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheParameterGroupListInner>() {
           @Override
           public void write(JsonWriter out, CacheParameterGroupListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheParameterGroupListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheParameterGroupListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheParameterGroupListInner
   * @throws IOException if the JSON string is invalid with respect to CacheParameterGroupListInner
   */
  public static CacheParameterGroupListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheParameterGroupListInner.class);
  }

  /**
   * Convert an instance of CacheParameterGroupListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

