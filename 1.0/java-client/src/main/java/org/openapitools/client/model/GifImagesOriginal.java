/*
 * Giphy API
 * Giphy API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@giphy.com
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
 * GifImagesOriginal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:04.658451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GifImagesOriginal {
  public static final String SERIALIZED_NAME_FRAMES = "frames";
  @SerializedName(SERIALIZED_NAME_FRAMES)
  private String frames;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_MP4 = "mp4";
  @SerializedName(SERIALIZED_NAME_MP4)
  private String mp4;

  public static final String SERIALIZED_NAME_MP4_SIZE = "mp4_size";
  @SerializedName(SERIALIZED_NAME_MP4_SIZE)
  private String mp4Size;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WEBP = "webp";
  @SerializedName(SERIALIZED_NAME_WEBP)
  private String webp;

  public static final String SERIALIZED_NAME_WEBP_SIZE = "webp_size";
  @SerializedName(SERIALIZED_NAME_WEBP_SIZE)
  private String webpSize;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;

  public GifImagesOriginal() {
  }

  public GifImagesOriginal frames(String frames) {
    this.frames = frames;
    return this;
  }

  /**
   * The number of frames in this GIF.
   * @return frames
   */
  @javax.annotation.Nullable
  public String getFrames() {
    return frames;
  }

  public void setFrames(String frames) {
    this.frames = frames;
  }


  public GifImagesOriginal height(String height) {
    this.height = height;
    return this;
  }

  /**
   * The height of this GIF in pixels.
   * @return height
   */
  @javax.annotation.Nullable
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }


  public GifImagesOriginal mp4(String mp4) {
    this.mp4 = mp4;
    return this;
  }

  /**
   * The URL for this GIF in .MP4 format.
   * @return mp4
   */
  @javax.annotation.Nullable
  public String getMp4() {
    return mp4;
  }

  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }


  public GifImagesOriginal mp4Size(String mp4Size) {
    this.mp4Size = mp4Size;
    return this;
  }

  /**
   * The size in bytes of the .MP4 file corresponding to this GIF.
   * @return mp4Size
   */
  @javax.annotation.Nullable
  public String getMp4Size() {
    return mp4Size;
  }

  public void setMp4Size(String mp4Size) {
    this.mp4Size = mp4Size;
  }


  public GifImagesOriginal size(String size) {
    this.size = size;
    return this;
  }

  /**
   * The size of this GIF in bytes.
   * @return size
   */
  @javax.annotation.Nullable
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public GifImagesOriginal url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The publicly-accessible direct URL for this GIF.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public GifImagesOriginal webp(String webp) {
    this.webp = webp;
    return this;
  }

  /**
   * The URL for this GIF in .webp format.
   * @return webp
   */
  @javax.annotation.Nullable
  public String getWebp() {
    return webp;
  }

  public void setWebp(String webp) {
    this.webp = webp;
  }


  public GifImagesOriginal webpSize(String webpSize) {
    this.webpSize = webpSize;
    return this;
  }

  /**
   * The size in bytes of the .webp file corresponding to this GIF.
   * @return webpSize
   */
  @javax.annotation.Nullable
  public String getWebpSize() {
    return webpSize;
  }

  public void setWebpSize(String webpSize) {
    this.webpSize = webpSize;
  }


  public GifImagesOriginal width(String width) {
    this.width = width;
    return this;
  }

  /**
   * The width of this GIF in pixels.
   * @return width
   */
  @javax.annotation.Nullable
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GifImagesOriginal gifImagesOriginal = (GifImagesOriginal) o;
    return Objects.equals(this.frames, gifImagesOriginal.frames) &&
        Objects.equals(this.height, gifImagesOriginal.height) &&
        Objects.equals(this.mp4, gifImagesOriginal.mp4) &&
        Objects.equals(this.mp4Size, gifImagesOriginal.mp4Size) &&
        Objects.equals(this.size, gifImagesOriginal.size) &&
        Objects.equals(this.url, gifImagesOriginal.url) &&
        Objects.equals(this.webp, gifImagesOriginal.webp) &&
        Objects.equals(this.webpSize, gifImagesOriginal.webpSize) &&
        Objects.equals(this.width, gifImagesOriginal.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frames, height, mp4, mp4Size, size, url, webp, webpSize, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifImagesOriginal {\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mp4: ").append(toIndentedString(mp4)).append("\n");
    sb.append("    mp4Size: ").append(toIndentedString(mp4Size)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    webp: ").append(toIndentedString(webp)).append("\n");
    sb.append("    webpSize: ").append(toIndentedString(webpSize)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("frames");
    openapiFields.add("height");
    openapiFields.add("mp4");
    openapiFields.add("mp4_size");
    openapiFields.add("size");
    openapiFields.add("url");
    openapiFields.add("webp");
    openapiFields.add("webp_size");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GifImagesOriginal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GifImagesOriginal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GifImagesOriginal is not found in the empty JSON string", GifImagesOriginal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GifImagesOriginal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GifImagesOriginal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("frames") != null && !jsonObj.get("frames").isJsonNull()) && !jsonObj.get("frames").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frames` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frames").toString()));
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if ((jsonObj.get("mp4") != null && !jsonObj.get("mp4").isJsonNull()) && !jsonObj.get("mp4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mp4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mp4").toString()));
      }
      if ((jsonObj.get("mp4_size") != null && !jsonObj.get("mp4_size").isJsonNull()) && !jsonObj.get("mp4_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mp4_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mp4_size").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("webp") != null && !jsonObj.get("webp").isJsonNull()) && !jsonObj.get("webp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webp").toString()));
      }
      if ((jsonObj.get("webp_size") != null && !jsonObj.get("webp_size").isJsonNull()) && !jsonObj.get("webp_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webp_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webp_size").toString()));
      }
      if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull()) && !jsonObj.get("width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GifImagesOriginal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GifImagesOriginal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GifImagesOriginal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GifImagesOriginal.class));

       return (TypeAdapter<T>) new TypeAdapter<GifImagesOriginal>() {
           @Override
           public void write(JsonWriter out, GifImagesOriginal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GifImagesOriginal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GifImagesOriginal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GifImagesOriginal
   * @throws IOException if the JSON string is invalid with respect to GifImagesOriginal
   */
  public static GifImagesOriginal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GifImagesOriginal.class);
  }

  /**
   * Convert an instance of GifImagesOriginal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

