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
 * GroupBlast
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:44.951610-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GroupBlast {
  public static final String SERIALIZED_NAME_CONTENT = "_content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DATE_BLAST_ADDED = "date_blast_added";
  @SerializedName(SERIALIZED_NAME_DATE_BLAST_ADDED)
  private String dateBlastAdded;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public GroupBlast() {
  }

  public GroupBlast content(String content) {
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


  public GroupBlast dateBlastAdded(String dateBlastAdded) {
    this.dateBlastAdded = dateBlastAdded;
    return this;
  }

  /**
   * Get dateBlastAdded
   * @return dateBlastAdded
   */
  @javax.annotation.Nullable
  public String getDateBlastAdded() {
    return dateBlastAdded;
  }

  public void setDateBlastAdded(String dateBlastAdded) {
    this.dateBlastAdded = dateBlastAdded;
  }


  public GroupBlast userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupBlast groupBlast = (GroupBlast) o;
    return Objects.equals(this.content, groupBlast.content) &&
        Objects.equals(this.dateBlastAdded, groupBlast.dateBlastAdded) &&
        Objects.equals(this.userId, groupBlast.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, dateBlastAdded, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBlast {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dateBlastAdded: ").append(toIndentedString(dateBlastAdded)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("date_blast_added");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupBlast
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupBlast.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupBlast is not found in the empty JSON string", GroupBlast.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupBlast.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupBlast` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("_content") != null && !jsonObj.get("_content").isJsonNull()) && !jsonObj.get("_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_content").toString()));
      }
      if ((jsonObj.get("date_blast_added") != null && !jsonObj.get("date_blast_added").isJsonNull()) && !jsonObj.get("date_blast_added").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_blast_added` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_blast_added").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupBlast.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupBlast' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupBlast> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupBlast.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupBlast>() {
           @Override
           public void write(JsonWriter out, GroupBlast value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupBlast read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupBlast given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupBlast
   * @throws IOException if the JSON string is invalid with respect to GroupBlast
   */
  public static GroupBlast fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupBlast.class);
  }

  /**
   * Convert an instance of GroupBlast to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

