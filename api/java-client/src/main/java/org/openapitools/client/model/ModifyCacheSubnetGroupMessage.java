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
 * Represents the input of a &lt;code&gt;ModifyCacheSubnetGroup&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:41.807787-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModifyCacheSubnetGroupMessage {
  public static final String SERIALIZED_NAME_CACHE_SUBNET_GROUP_NAME = "CacheSubnetGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_SUBNET_GROUP_NAME)
  private String cacheSubnetGroupName;

  public static final String SERIALIZED_NAME_CACHE_SUBNET_GROUP_DESCRIPTION = "CacheSubnetGroupDescription";
  @SerializedName(SERIALIZED_NAME_CACHE_SUBNET_GROUP_DESCRIPTION)
  private String cacheSubnetGroupDescription;

  public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
  private List subnetIds;

  public ModifyCacheSubnetGroupMessage() {
  }

  public ModifyCacheSubnetGroupMessage cacheSubnetGroupName(String cacheSubnetGroupName) {
    this.cacheSubnetGroupName = cacheSubnetGroupName;
    return this;
  }

  /**
   * Get cacheSubnetGroupName
   * @return cacheSubnetGroupName
   */
  @javax.annotation.Nonnull
  public String getCacheSubnetGroupName() {
    return cacheSubnetGroupName;
  }

  public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
    this.cacheSubnetGroupName = cacheSubnetGroupName;
  }


  public ModifyCacheSubnetGroupMessage cacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
    this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    return this;
  }

  /**
   * Get cacheSubnetGroupDescription
   * @return cacheSubnetGroupDescription
   */
  @javax.annotation.Nullable
  public String getCacheSubnetGroupDescription() {
    return cacheSubnetGroupDescription;
  }

  public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
    this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
  }


  public ModifyCacheSubnetGroupMessage subnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  /**
   * Get subnetIds
   * @return subnetIds
   */
  @javax.annotation.Nullable
  public List getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List subnetIds) {
    this.subnetIds = subnetIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCacheSubnetGroupMessage modifyCacheSubnetGroupMessage = (ModifyCacheSubnetGroupMessage) o;
    return Objects.equals(this.cacheSubnetGroupName, modifyCacheSubnetGroupMessage.cacheSubnetGroupName) &&
        Objects.equals(this.cacheSubnetGroupDescription, modifyCacheSubnetGroupMessage.cacheSubnetGroupDescription) &&
        Objects.equals(this.subnetIds, modifyCacheSubnetGroupMessage.subnetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheSubnetGroupName, cacheSubnetGroupDescription, subnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCacheSubnetGroupMessage {\n");
    sb.append("    cacheSubnetGroupName: ").append(toIndentedString(cacheSubnetGroupName)).append("\n");
    sb.append("    cacheSubnetGroupDescription: ").append(toIndentedString(cacheSubnetGroupDescription)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
    openapiFields.add("CacheSubnetGroupName");
    openapiFields.add("CacheSubnetGroupDescription");
    openapiFields.add("SubnetIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CacheSubnetGroupName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyCacheSubnetGroupMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyCacheSubnetGroupMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyCacheSubnetGroupMessage is not found in the empty JSON string", ModifyCacheSubnetGroupMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyCacheSubnetGroupMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyCacheSubnetGroupMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyCacheSubnetGroupMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CacheSubnetGroupName`
      String.validateJsonElement(jsonObj.get("CacheSubnetGroupName"));
      // validate the optional field `CacheSubnetGroupDescription`
      if (jsonObj.get("CacheSubnetGroupDescription") != null && !jsonObj.get("CacheSubnetGroupDescription").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CacheSubnetGroupDescription"));
      }
      // validate the optional field `SubnetIds`
      if (jsonObj.get("SubnetIds") != null && !jsonObj.get("SubnetIds").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("SubnetIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyCacheSubnetGroupMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyCacheSubnetGroupMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyCacheSubnetGroupMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyCacheSubnetGroupMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyCacheSubnetGroupMessage>() {
           @Override
           public void write(JsonWriter out, ModifyCacheSubnetGroupMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyCacheSubnetGroupMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyCacheSubnetGroupMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyCacheSubnetGroupMessage
   * @throws IOException if the JSON string is invalid with respect to ModifyCacheSubnetGroupMessage
   */
  public static ModifyCacheSubnetGroupMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyCacheSubnetGroupMessage.class);
  }

  /**
   * Convert an instance of ModifyCacheSubnetGroupMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

