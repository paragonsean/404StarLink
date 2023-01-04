/*
 * Flickr API Schema
 * A subset of Flickr's API defined in Swagger format.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
 * Tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:51.881402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Tag {
  public static final String SERIALIZED_NAME_CONTENT = "_content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_AUTHORNAME = "authorname";
  @SerializedName(SERIALIZED_NAME_AUTHORNAME)
  private String authorname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MACHINE_TAG = "machine_tag";
  @SerializedName(SERIALIZED_NAME_MACHINE_TAG)
  private Boolean machineTag;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private String raw;

  public Tag() {
  }

  public Tag content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Tag author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @javax.annotation.Nullable
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public Tag authorname(String authorname) {
    this.authorname = authorname;
    return this;
  }

  /**
   * Get authorname
   * @return authorname
   */
  @javax.annotation.Nullable
  public String getAuthorname() {
    return authorname;
  }

  public void setAuthorname(String authorname) {
    this.authorname = authorname;
  }


  public Tag id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Tag machineTag(Boolean machineTag) {
    this.machineTag = machineTag;
    return this;
  }

  /**
   * Get machineTag
   * @return machineTag
   */
  @javax.annotation.Nullable
  public Boolean getMachineTag() {
    return machineTag;
  }

  public void setMachineTag(Boolean machineTag) {
    this.machineTag = machineTag;
  }


  public Tag raw(String raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
   */
  @javax.annotation.Nullable
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.content, tag.content) &&
        Objects.equals(this.author, tag.author) &&
        Objects.equals(this.authorname, tag.authorname) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.machineTag, tag.machineTag) &&
        Objects.equals(this.raw, tag.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, author, authorname, id, machineTag, raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorname: ").append(toIndentedString(authorname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machineTag: ").append(toIndentedString(machineTag)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
    openapiFields.add("_content");
    openapiFields.add("author");
    openapiFields.add("authorname");
    openapiFields.add("id");
    openapiFields.add("machine_tag");
    openapiFields.add("raw");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Tag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tag is not found in the empty JSON string", Tag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("_content") != null && !jsonObj.get("_content").isJsonNull()) && !jsonObj.get("_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_content").toString()));
      }
      if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if ((jsonObj.get("authorname") != null && !jsonObj.get("authorname").isJsonNull()) && !jsonObj.get("authorname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorname").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("raw") != null && !jsonObj.get("raw").isJsonNull()) && !jsonObj.get("raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

       return (TypeAdapter<T>) new TypeAdapter<Tag>() {
           @Override
           public void write(JsonWriter out, Tag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Tag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Tag
   * @throws IOException if the JSON string is invalid with respect to Tag
   */
  public static Tag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tag.class);
  }

  /**
   * Convert an instance of Tag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

