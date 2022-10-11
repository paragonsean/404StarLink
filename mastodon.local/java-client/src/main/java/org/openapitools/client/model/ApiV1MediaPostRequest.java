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
import java.io.File;
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
 * ApiV1MediaPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:27.813212-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1MediaPostRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_FOCUS = "focus";
  @SerializedName(SERIALIZED_NAME_FOCUS)
  private String focus;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private File thumbnail;

  public ApiV1MediaPostRequest() {
  }

  public ApiV1MediaPostRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A plain-text description of the media, for accessibility purposes.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ApiV1MediaPostRequest _file(File _file) {
    this._file = _file;
    return this;
  }

  /**
   * The file to be attached, using multipart form data.
   * @return _file
   */
  @javax.annotation.Nonnull
  public File getFile() {
    return _file;
  }

  public void setFile(File _file) {
    this._file = _file;
  }


  public ApiV1MediaPostRequest focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Two floating points (x,y), comma-delimited, ranging from -1.0 to 1.0 (see “Focal points” below)
   * @return focus
   */
  @javax.annotation.Nullable
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }


  public ApiV1MediaPostRequest thumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * The custom thumbnail of the media to be attached, using multipart form data.
   * @return thumbnail
   */
  @javax.annotation.Nullable
  public File getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1MediaPostRequest apiV1MediaPostRequest = (ApiV1MediaPostRequest) o;
    return Objects.equals(this.description, apiV1MediaPostRequest.description) &&
        Objects.equals(this._file, apiV1MediaPostRequest._file) &&
        Objects.equals(this.focus, apiV1MediaPostRequest.focus) &&
        Objects.equals(this.thumbnail, apiV1MediaPostRequest.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, _file, focus, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1MediaPostRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("file");
    openapiFields.add("focus");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1MediaPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1MediaPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1MediaPostRequest is not found in the empty JSON string", ApiV1MediaPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1MediaPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1MediaPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV1MediaPostRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("focus") != null && !jsonObj.get("focus").isJsonNull()) && !jsonObj.get("focus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `focus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("focus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1MediaPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1MediaPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1MediaPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1MediaPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1MediaPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1MediaPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1MediaPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1MediaPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1MediaPostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1MediaPostRequest
   */
  public static ApiV1MediaPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1MediaPostRequest.class);
  }

  /**
   * Convert an instance of ApiV1MediaPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

