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
 * Represents the input of a &lt;code&gt;CreateCacheParameterGroup&lt;/code&gt; operation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:06.397774-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateCacheParameterGroupMessage {
  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME = "CacheParameterGroupName";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_NAME)
  private String cacheParameterGroupName;

  public static final String SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY = "CacheParameterGroupFamily";
  @SerializedName(SERIALIZED_NAME_CACHE_PARAMETER_GROUP_FAMILY)
  private String cacheParameterGroupFamily;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateCacheParameterGroupMessage() {
  }

  public CreateCacheParameterGroupMessage cacheParameterGroupName(String cacheParameterGroupName) {
    this.cacheParameterGroupName = cacheParameterGroupName;
    return this;
  }

  /**
   * Get cacheParameterGroupName
   * @return cacheParameterGroupName
   */
  @javax.annotation.Nonnull
  public String getCacheParameterGroupName() {
    return cacheParameterGroupName;
  }

  public void setCacheParameterGroupName(String cacheParameterGroupName) {
    this.cacheParameterGroupName = cacheParameterGroupName;
  }


  public CreateCacheParameterGroupMessage cacheParameterGroupFamily(String cacheParameterGroupFamily) {
    this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    return this;
  }

  /**
   * Get cacheParameterGroupFamily
   * @return cacheParameterGroupFamily
   */
  @javax.annotation.Nonnull
  public String getCacheParameterGroupFamily() {
    return cacheParameterGroupFamily;
  }

  public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
    this.cacheParameterGroupFamily = cacheParameterGroupFamily;
  }


  public CreateCacheParameterGroupMessage description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCacheParameterGroupMessage tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCacheParameterGroupMessage createCacheParameterGroupMessage = (CreateCacheParameterGroupMessage) o;
    return Objects.equals(this.cacheParameterGroupName, createCacheParameterGroupMessage.cacheParameterGroupName) &&
        Objects.equals(this.cacheParameterGroupFamily, createCacheParameterGroupMessage.cacheParameterGroupFamily) &&
        Objects.equals(this.description, createCacheParameterGroupMessage.description) &&
        Objects.equals(this.tags, createCacheParameterGroupMessage.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheParameterGroupName, cacheParameterGroupFamily, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCacheParameterGroupMessage {\n");
    sb.append("    cacheParameterGroupName: ").append(toIndentedString(cacheParameterGroupName)).append("\n");
    sb.append("    cacheParameterGroupFamily: ").append(toIndentedString(cacheParameterGroupFamily)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CacheParameterGroupName");
    openapiRequiredFields.add("CacheParameterGroupFamily");
    openapiRequiredFields.add("Description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCacheParameterGroupMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCacheParameterGroupMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCacheParameterGroupMessage is not found in the empty JSON string", CreateCacheParameterGroupMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCacheParameterGroupMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCacheParameterGroupMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCacheParameterGroupMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `CacheParameterGroupName`
      String.validateJsonElement(jsonObj.get("CacheParameterGroupName"));
      // validate the required field `CacheParameterGroupFamily`
      String.validateJsonElement(jsonObj.get("CacheParameterGroupFamily"));
      // validate the required field `Description`
      String.validateJsonElement(jsonObj.get("Description"));
      // validate the optional field `Tags`
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCacheParameterGroupMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCacheParameterGroupMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCacheParameterGroupMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCacheParameterGroupMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCacheParameterGroupMessage>() {
           @Override
           public void write(JsonWriter out, CreateCacheParameterGroupMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCacheParameterGroupMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCacheParameterGroupMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCacheParameterGroupMessage
   * @throws IOException if the JSON string is invalid with respect to CreateCacheParameterGroupMessage
   */
  public static CreateCacheParameterGroupMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCacheParameterGroupMessage.class);
  }

  /**
   * Convert an instance of CreateCacheParameterGroupMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

