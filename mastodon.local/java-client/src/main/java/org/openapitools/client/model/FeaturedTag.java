/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
import java.time.OffsetDateTime;
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
 * Represents a hashtag that is featured on a profile.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FeaturedTag {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_STATUS_AT = "last_status_at";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_AT)
  private OffsetDateTime lastStatusAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUSES_COUNT = "statuses_count";
  @SerializedName(SERIALIZED_NAME_STATUSES_COUNT)
  private Integer statusesCount;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public FeaturedTag() {
  }

  public FeaturedTag id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The internal ID of the featured tag in the database. Cast from integer but not guaranteed to be a number
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FeaturedTag lastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
    return this;
  }

  /**
   * The timestamp of the last authored status containing this hashtag. ISO 8601 Datetime.
   * @return lastStatusAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastStatusAt() {
    return lastStatusAt;
  }

  public void setLastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
  }


  public FeaturedTag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the hashtag being featured.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FeaturedTag statusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
    return this;
  }

  /**
   * The number of authored statuses containing this hashtag.
   * @return statusesCount
   */
  @javax.annotation.Nullable
  public Integer getStatusesCount() {
    return statusesCount;
  }

  public void setStatusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
  }


  public FeaturedTag url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to all statuses by a user that contain this hashtag.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedTag featuredTag = (FeaturedTag) o;
    return Objects.equals(this.id, featuredTag.id) &&
        Objects.equals(this.lastStatusAt, featuredTag.lastStatusAt) &&
        Objects.equals(this.name, featuredTag.name) &&
        Objects.equals(this.statusesCount, featuredTag.statusesCount) &&
        Objects.equals(this.url, featuredTag.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastStatusAt, name, statusesCount, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedTag {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatusAt: ").append(toIndentedString(lastStatusAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusesCount: ").append(toIndentedString(statusesCount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("last_status_at");
    openapiFields.add("name");
    openapiFields.add("statuses_count");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FeaturedTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FeaturedTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeaturedTag is not found in the empty JSON string", FeaturedTag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FeaturedTag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeaturedTag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeaturedTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturedTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturedTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturedTag.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturedTag>() {
           @Override
           public void write(JsonWriter out, FeaturedTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturedTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FeaturedTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FeaturedTag
   * @throws IOException if the JSON string is invalid with respect to FeaturedTag
   */
  public static FeaturedTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturedTag.class);
  }

  /**
   * Convert an instance of FeaturedTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

