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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ContextPhoto;

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
 * ContextPhotos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:39.005803-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ContextPhotos {
  public static final String SERIALIZED_NAME_PHOTOS = "photos";
  @SerializedName(SERIALIZED_NAME_PHOTOS)
  private List<ContextPhoto> photos = new ArrayList<>();

  public ContextPhotos() {
  }

  public ContextPhotos photos(List<ContextPhoto> photos) {
    this.photos = photos;
    return this;
  }

  public ContextPhotos addPhotosItem(ContextPhoto photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
   */
  @javax.annotation.Nullable
  public List<ContextPhoto> getPhotos() {
    return photos;
  }

  public void setPhotos(List<ContextPhoto> photos) {
    this.photos = photos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextPhotos contextPhotos = (ContextPhotos) o;
    return Objects.equals(this.photos, contextPhotos.photos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextPhotos {\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
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
    openapiFields.add("photos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContextPhotos
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContextPhotos.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContextPhotos is not found in the empty JSON string", ContextPhotos.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContextPhotos.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContextPhotos` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("photos") != null && !jsonObj.get("photos").isJsonNull()) {
        JsonArray jsonArrayphotos = jsonObj.getAsJsonArray("photos");
        if (jsonArrayphotos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("photos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `photos` to be an array in the JSON string but got `%s`", jsonObj.get("photos").toString()));
          }

          // validate the optional field `photos` (array)
          for (int i = 0; i < jsonArrayphotos.size(); i++) {
            ContextPhoto.validateJsonElement(jsonArrayphotos.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContextPhotos.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContextPhotos' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContextPhotos> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContextPhotos.class));

       return (TypeAdapter<T>) new TypeAdapter<ContextPhotos>() {
           @Override
           public void write(JsonWriter out, ContextPhotos value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContextPhotos read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContextPhotos given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContextPhotos
   * @throws IOException if the JSON string is invalid with respect to ContextPhotos
   */
  public static ContextPhotos fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContextPhotos.class);
  }

  /**
   * Convert an instance of ContextPhotos to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

