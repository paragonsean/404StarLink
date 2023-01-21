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
import org.openapitools.client.model.GetPhotoExifByID200ResponsePhoto;

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
 * GetPhotoExifByID200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:39.005803-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetPhotoExifByID200Response {
  public static final String SERIALIZED_NAME_PHOTO = "photo";
  @SerializedName(SERIALIZED_NAME_PHOTO)
  private GetPhotoExifByID200ResponsePhoto photo;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public GetPhotoExifByID200Response() {
  }

  public GetPhotoExifByID200Response photo(GetPhotoExifByID200ResponsePhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
   */
  @javax.annotation.Nullable
  public GetPhotoExifByID200ResponsePhoto getPhoto() {
    return photo;
  }

  public void setPhoto(GetPhotoExifByID200ResponsePhoto photo) {
    this.photo = photo;
  }


  public GetPhotoExifByID200Response stat(String stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   */
  @javax.annotation.Nullable
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPhotoExifByID200Response getPhotoExifByID200Response = (GetPhotoExifByID200Response) o;
    return Objects.equals(this.photo, getPhotoExifByID200Response.photo) &&
        Objects.equals(this.stat, getPhotoExifByID200Response.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photo, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPhotoExifByID200Response {\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
    openapiFields.add("photo");
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPhotoExifByID200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPhotoExifByID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPhotoExifByID200Response is not found in the empty JSON string", GetPhotoExifByID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPhotoExifByID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPhotoExifByID200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `photo`
      if (jsonObj.get("photo") != null && !jsonObj.get("photo").isJsonNull()) {
        GetPhotoExifByID200ResponsePhoto.validateJsonElement(jsonObj.get("photo"));
      }
      if ((jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) && !jsonObj.get("stat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPhotoExifByID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPhotoExifByID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPhotoExifByID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPhotoExifByID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPhotoExifByID200Response>() {
           @Override
           public void write(JsonWriter out, GetPhotoExifByID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPhotoExifByID200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPhotoExifByID200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPhotoExifByID200Response
   * @throws IOException if the JSON string is invalid with respect to GetPhotoExifByID200Response
   */
  public static GetPhotoExifByID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPhotoExifByID200Response.class);
  }

  /**
   * Convert an instance of GetPhotoExifByID200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

