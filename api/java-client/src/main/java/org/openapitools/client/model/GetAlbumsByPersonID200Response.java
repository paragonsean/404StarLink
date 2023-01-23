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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Album;

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
 * GetAlbumsByPersonID200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:44.951610-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetAlbumsByPersonID200Response {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private BigDecimal page;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private BigDecimal pages;

  public static final String SERIALIZED_NAME_PERPAGE = "perpage";
  @SerializedName(SERIALIZED_NAME_PERPAGE)
  private BigDecimal perpage;

  public static final String SERIALIZED_NAME_PHOTOSETS = "photosets";
  @SerializedName(SERIALIZED_NAME_PHOTOSETS)
  private List<Album> photosets = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public GetAlbumsByPersonID200Response() {
  }

  public GetAlbumsByPersonID200Response page(BigDecimal page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nullable
  public BigDecimal getPage() {
    return page;
  }

  public void setPage(BigDecimal page) {
    this.page = page;
  }


  public GetAlbumsByPersonID200Response pages(BigDecimal pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  public BigDecimal getPages() {
    return pages;
  }

  public void setPages(BigDecimal pages) {
    this.pages = pages;
  }


  public GetAlbumsByPersonID200Response perpage(BigDecimal perpage) {
    this.perpage = perpage;
    return this;
  }

  /**
   * Get perpage
   * @return perpage
   */
  @javax.annotation.Nullable
  public BigDecimal getPerpage() {
    return perpage;
  }

  public void setPerpage(BigDecimal perpage) {
    this.perpage = perpage;
  }


  public GetAlbumsByPersonID200Response photosets(List<Album> photosets) {
    this.photosets = photosets;
    return this;
  }

  public GetAlbumsByPersonID200Response addPhotosetsItem(Album photosetsItem) {
    if (this.photosets == null) {
      this.photosets = new ArrayList<>();
    }
    this.photosets.add(photosetsItem);
    return this;
  }

  /**
   * Get photosets
   * @return photosets
   */
  @javax.annotation.Nullable
  public List<Album> getPhotosets() {
    return photosets;
  }

  public void setPhotosets(List<Album> photosets) {
    this.photosets = photosets;
  }


  public GetAlbumsByPersonID200Response total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlbumsByPersonID200Response getAlbumsByPersonID200Response = (GetAlbumsByPersonID200Response) o;
    return Objects.equals(this.page, getAlbumsByPersonID200Response.page) &&
        Objects.equals(this.pages, getAlbumsByPersonID200Response.pages) &&
        Objects.equals(this.perpage, getAlbumsByPersonID200Response.perpage) &&
        Objects.equals(this.photosets, getAlbumsByPersonID200Response.photosets) &&
        Objects.equals(this.total, getAlbumsByPersonID200Response.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pages, perpage, photosets, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlbumsByPersonID200Response {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perpage: ").append(toIndentedString(perpage)).append("\n");
    sb.append("    photosets: ").append(toIndentedString(photosets)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("pages");
    openapiFields.add("perpage");
    openapiFields.add("photosets");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAlbumsByPersonID200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAlbumsByPersonID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAlbumsByPersonID200Response is not found in the empty JSON string", GetAlbumsByPersonID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAlbumsByPersonID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAlbumsByPersonID200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("photosets") != null && !jsonObj.get("photosets").isJsonNull()) {
        JsonArray jsonArrayphotosets = jsonObj.getAsJsonArray("photosets");
        if (jsonArrayphotosets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("photosets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `photosets` to be an array in the JSON string but got `%s`", jsonObj.get("photosets").toString()));
          }

          // validate the optional field `photosets` (array)
          for (int i = 0; i < jsonArrayphotosets.size(); i++) {
            Album.validateJsonElement(jsonArrayphotosets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAlbumsByPersonID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAlbumsByPersonID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAlbumsByPersonID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAlbumsByPersonID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAlbumsByPersonID200Response>() {
           @Override
           public void write(JsonWriter out, GetAlbumsByPersonID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAlbumsByPersonID200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAlbumsByPersonID200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAlbumsByPersonID200Response
   * @throws IOException if the JSON string is invalid with respect to GetAlbumsByPersonID200Response
   */
  public static GetAlbumsByPersonID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAlbumsByPersonID200Response.class);
  }

  /**
   * Convert an instance of GetAlbumsByPersonID200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

