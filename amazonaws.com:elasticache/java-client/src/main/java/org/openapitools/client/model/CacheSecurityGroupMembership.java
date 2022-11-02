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
 * Represents a cluster&#39;s status within a particular cache security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CacheSecurityGroupMembership {
  public static final String SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME = "CacheSecurityGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SECURITY_GROUP_NAME)
  private String cacheSecurityGroupName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public CacheSecurityGroupMembership() {
  }

  public CacheSecurityGroupMembership cacheSecurityGroupName(String cacheSecurityGroupName) {
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


  public CacheSecurityGroupMembership status(String status) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheSecurityGroupMembership cacheSecurityGroupMembership = (CacheSecurityGroupMembership) o;
    return Objects.equals(this.cacheSecurityGroupName, cacheSecurityGroupMembership.cacheSecurityGroupName) &&
        Objects.equals(this.status, cacheSecurityGroupMembership.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSecurityGroupName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheSecurityGroupMembership {\n");
    sb.append("    cacheSecurityGroupName: ").append(toIndentedString(cacheSecurityGroupName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CacheSecurityGroupMembership
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheSecurityGroupMembership.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheSecurityGroupMembership is not found in the empty JSON string", CacheSecurityGroupMembership.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheSecurityGroupMembership.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheSecurityGroupMembership` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CacheSecurityGroupName`
      if (jsonObj.get("CacheSecurityGroupName") != null && !jsonObj.get("CacheSecurityGroupName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSecurityGroupName"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheSecurityGroupMembership.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheSecurityGroupMembership' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheSecurityGroupMembership> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheSecurityGroupMembership.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheSecurityGroupMembership>() {
           @Override
           public void write(JsonWriter out, CacheSecurityGroupMembership value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheSecurityGroupMembership read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CacheSecurityGroupMembership given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CacheSecurityGroupMembership
   * @throws IOException if the JSON string is invalid with respect to CacheSecurityGroupMembership
   */
  public static CacheSecurityGroupMembership fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheSecurityGroupMembership.class);
  }

  /**
   * Convert an instance of CacheSecurityGroupMembership to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

