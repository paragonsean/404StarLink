/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.LocalizedText;

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
 * A single image in a VR Listing. Title and gallery URL are stored per locale. NEXT ID: 4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:54.390975-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Image {
  public static final String SERIALIZED_NAME_GALLERY_URI = "galleryUri";
  @SerializedName(SERIALIZED_NAME_GALLERY_URI)
  private List<LocalizedText> galleryUri = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private List<LocalizedText> title = new ArrayList<>();

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public Image() {
  }

  public Image galleryUri(List<LocalizedText> galleryUri) {
    this.galleryUri = galleryUri;
    return this;
  }

  public Image addGalleryUriItem(LocalizedText galleryUriItem) {
    if (this.galleryUri == null) {
      this.galleryUri = new ArrayList<>();
    }
    this.galleryUri.add(galleryUriItem);
    return this;
  }

  /**
   * URL that is deeplink to the image in a gallery (or a webpage).
   * @return galleryUri
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getGalleryUri() {
    return galleryUri;
  }

  public void setGalleryUri(List<LocalizedText> galleryUri) {
    this.galleryUri = galleryUri;
  }


  public Image title(List<LocalizedText> title) {
    this.title = title;
    return this;
  }

  public Image addTitleItem(LocalizedText titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<>();
    }
    this.title.add(titleItem);
    return this;
  }

  /**
   * Title of the image.
   * @return title
   */
  @javax.annotation.Nullable
  public List<LocalizedText> getTitle() {
    return title;
  }

  public void setTitle(List<LocalizedText> title) {
    this.title = title;
  }


  public Image uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * URL that points to the binary image content directly.
   * @return uri
   */
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.galleryUri, image.galleryUri) &&
        Objects.equals(this.title, image.title) &&
        Objects.equals(this.uri, image.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(galleryUri, title, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    galleryUri: ").append(toIndentedString(galleryUri)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("galleryUri");
    openapiFields.add("title");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Image
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Image.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Image is not found in the empty JSON string", Image.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Image.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Image` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("galleryUri") != null && !jsonObj.get("galleryUri").isJsonNull()) {
        JsonArray jsonArraygalleryUri = jsonObj.getAsJsonArray("galleryUri");
        if (jsonArraygalleryUri != null) {
          // ensure the json data is an array
          if (!jsonObj.get("galleryUri").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `galleryUri` to be an array in the JSON string but got `%s`", jsonObj.get("galleryUri").toString()));
          }

          // validate the optional field `galleryUri` (array)
          for (int i = 0; i < jsonArraygalleryUri.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraygalleryUri.get(i));
          };
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        JsonArray jsonArraytitle = jsonObj.getAsJsonArray("title");
        if (jsonArraytitle != null) {
          // ensure the json data is an array
          if (!jsonObj.get("title").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `title` to be an array in the JSON string but got `%s`", jsonObj.get("title").toString()));
          }

          // validate the optional field `title` (array)
          for (int i = 0; i < jsonArraytitle.size(); i++) {
            LocalizedText.validateJsonElement(jsonArraytitle.get(i));
          };
        }
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Image.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Image' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Image> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Image.class));

       return (TypeAdapter<T>) new TypeAdapter<Image>() {
           @Override
           public void write(JsonWriter out, Image value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Image read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Image given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Image
   * @throws IOException if the JSON string is invalid with respect to Image
   */
  public static Image fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Image.class);
  }

  /**
   * Convert an instance of Image to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

