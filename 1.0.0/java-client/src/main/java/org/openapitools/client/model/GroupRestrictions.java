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
 * GroupRestrictions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:51.881402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GroupRestrictions {
  public static final String SERIALIZED_NAME_ART_OK = "art_ok";
  @SerializedName(SERIALIZED_NAME_ART_OK)
  private Boolean artOk;

  public static final String SERIALIZED_NAME_HAS_GEO = "has_geo";
  @SerializedName(SERIALIZED_NAME_HAS_GEO)
  private Boolean hasGeo;

  public static final String SERIALIZED_NAME_IMAGES_OK = "images_ok";
  @SerializedName(SERIALIZED_NAME_IMAGES_OK)
  private Boolean imagesOk;

  public static final String SERIALIZED_NAME_MODERATE_OK = "moderate_ok";
  @SerializedName(SERIALIZED_NAME_MODERATE_OK)
  private Boolean moderateOk;

  public static final String SERIALIZED_NAME_PHOTOS_OK = "photos_ok";
  @SerializedName(SERIALIZED_NAME_PHOTOS_OK)
  private Boolean photosOk;

  public static final String SERIALIZED_NAME_RESTRICTED_OK = "restricted_ok";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_OK)
  private Boolean restrictedOk;

  public static final String SERIALIZED_NAME_SAFE_OK = "safe_ok";
  @SerializedName(SERIALIZED_NAME_SAFE_OK)
  private Boolean safeOk;

  public static final String SERIALIZED_NAME_SCREENS_OK = "screens_ok";
  @SerializedName(SERIALIZED_NAME_SCREENS_OK)
  private Boolean screensOk;

  public static final String SERIALIZED_NAME_VIDEOS_OK = "videos_ok";
  @SerializedName(SERIALIZED_NAME_VIDEOS_OK)
  private Boolean videosOk;

  public GroupRestrictions() {
  }

  public GroupRestrictions artOk(Boolean artOk) {
    this.artOk = artOk;
    return this;
  }

  /**
   * Get artOk
   * @return artOk
   */
  @javax.annotation.Nullable
  public Boolean getArtOk() {
    return artOk;
  }

  public void setArtOk(Boolean artOk) {
    this.artOk = artOk;
  }


  public GroupRestrictions hasGeo(Boolean hasGeo) {
    this.hasGeo = hasGeo;
    return this;
  }

  /**
   * Get hasGeo
   * @return hasGeo
   */
  @javax.annotation.Nullable
  public Boolean getHasGeo() {
    return hasGeo;
  }

  public void setHasGeo(Boolean hasGeo) {
    this.hasGeo = hasGeo;
  }


  public GroupRestrictions imagesOk(Boolean imagesOk) {
    this.imagesOk = imagesOk;
    return this;
  }

  /**
   * Get imagesOk
   * @return imagesOk
   */
  @javax.annotation.Nullable
  public Boolean getImagesOk() {
    return imagesOk;
  }

  public void setImagesOk(Boolean imagesOk) {
    this.imagesOk = imagesOk;
  }


  public GroupRestrictions moderateOk(Boolean moderateOk) {
    this.moderateOk = moderateOk;
    return this;
  }

  /**
   * Get moderateOk
   * @return moderateOk
   */
  @javax.annotation.Nullable
  public Boolean getModerateOk() {
    return moderateOk;
  }

  public void setModerateOk(Boolean moderateOk) {
    this.moderateOk = moderateOk;
  }


  public GroupRestrictions photosOk(Boolean photosOk) {
    this.photosOk = photosOk;
    return this;
  }

  /**
   * Get photosOk
   * @return photosOk
   */
  @javax.annotation.Nullable
  public Boolean getPhotosOk() {
    return photosOk;
  }

  public void setPhotosOk(Boolean photosOk) {
    this.photosOk = photosOk;
  }


  public GroupRestrictions restrictedOk(Boolean restrictedOk) {
    this.restrictedOk = restrictedOk;
    return this;
  }

  /**
   * Get restrictedOk
   * @return restrictedOk
   */
  @javax.annotation.Nullable
  public Boolean getRestrictedOk() {
    return restrictedOk;
  }

  public void setRestrictedOk(Boolean restrictedOk) {
    this.restrictedOk = restrictedOk;
  }


  public GroupRestrictions safeOk(Boolean safeOk) {
    this.safeOk = safeOk;
    return this;
  }

  /**
   * Get safeOk
   * @return safeOk
   */
  @javax.annotation.Nullable
  public Boolean getSafeOk() {
    return safeOk;
  }

  public void setSafeOk(Boolean safeOk) {
    this.safeOk = safeOk;
  }


  public GroupRestrictions screensOk(Boolean screensOk) {
    this.screensOk = screensOk;
    return this;
  }

  /**
   * Get screensOk
   * @return screensOk
   */
  @javax.annotation.Nullable
  public Boolean getScreensOk() {
    return screensOk;
  }

  public void setScreensOk(Boolean screensOk) {
    this.screensOk = screensOk;
  }


  public GroupRestrictions videosOk(Boolean videosOk) {
    this.videosOk = videosOk;
    return this;
  }

  /**
   * Get videosOk
   * @return videosOk
   */
  @javax.annotation.Nullable
  public Boolean getVideosOk() {
    return videosOk;
  }

  public void setVideosOk(Boolean videosOk) {
    this.videosOk = videosOk;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRestrictions groupRestrictions = (GroupRestrictions) o;
    return Objects.equals(this.artOk, groupRestrictions.artOk) &&
        Objects.equals(this.hasGeo, groupRestrictions.hasGeo) &&
        Objects.equals(this.imagesOk, groupRestrictions.imagesOk) &&
        Objects.equals(this.moderateOk, groupRestrictions.moderateOk) &&
        Objects.equals(this.photosOk, groupRestrictions.photosOk) &&
        Objects.equals(this.restrictedOk, groupRestrictions.restrictedOk) &&
        Objects.equals(this.safeOk, groupRestrictions.safeOk) &&
        Objects.equals(this.screensOk, groupRestrictions.screensOk) &&
        Objects.equals(this.videosOk, groupRestrictions.videosOk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artOk, hasGeo, imagesOk, moderateOk, photosOk, restrictedOk, safeOk, screensOk, videosOk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRestrictions {\n");
    sb.append("    artOk: ").append(toIndentedString(artOk)).append("\n");
    sb.append("    hasGeo: ").append(toIndentedString(hasGeo)).append("\n");
    sb.append("    imagesOk: ").append(toIndentedString(imagesOk)).append("\n");
    sb.append("    moderateOk: ").append(toIndentedString(moderateOk)).append("\n");
    sb.append("    photosOk: ").append(toIndentedString(photosOk)).append("\n");
    sb.append("    restrictedOk: ").append(toIndentedString(restrictedOk)).append("\n");
    sb.append("    safeOk: ").append(toIndentedString(safeOk)).append("\n");
    sb.append("    screensOk: ").append(toIndentedString(screensOk)).append("\n");
    sb.append("    videosOk: ").append(toIndentedString(videosOk)).append("\n");
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
    openapiFields.add("art_ok");
    openapiFields.add("has_geo");
    openapiFields.add("images_ok");
    openapiFields.add("moderate_ok");
    openapiFields.add("photos_ok");
    openapiFields.add("restricted_ok");
    openapiFields.add("safe_ok");
    openapiFields.add("screens_ok");
    openapiFields.add("videos_ok");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupRestrictions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupRestrictions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupRestrictions is not found in the empty JSON string", GroupRestrictions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupRestrictions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupRestrictions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupRestrictions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupRestrictions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupRestrictions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupRestrictions.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupRestrictions>() {
           @Override
           public void write(JsonWriter out, GroupRestrictions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupRestrictions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupRestrictions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupRestrictions
   * @throws IOException if the JSON string is invalid with respect to GroupRestrictions
   */
  public static GroupRestrictions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupRestrictions.class);
  }

  /**
   * Convert an instance of GroupRestrictions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

