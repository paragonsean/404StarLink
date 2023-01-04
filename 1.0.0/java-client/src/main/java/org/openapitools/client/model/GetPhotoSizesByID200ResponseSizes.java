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
import org.openapitools.client.model.Size;

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
 * GetPhotoSizesByID200ResponseSizes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:51.881402-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetPhotoSizesByID200ResponseSizes {
  public static final String SERIALIZED_NAME_CANBLOG = "canblog";
  @SerializedName(SERIALIZED_NAME_CANBLOG)
  private BigDecimal canblog;

  public static final String SERIALIZED_NAME_CANDOWNLOAD = "candownload";
  @SerializedName(SERIALIZED_NAME_CANDOWNLOAD)
  private BigDecimal candownload;

  public static final String SERIALIZED_NAME_CANPRINT = "canprint";
  @SerializedName(SERIALIZED_NAME_CANPRINT)
  private BigDecimal canprint;

  public static final String SERIALIZED_NAME_SIZES = "sizes";
  @SerializedName(SERIALIZED_NAME_SIZES)
  private List<Size> sizes = new ArrayList<>();

  public GetPhotoSizesByID200ResponseSizes() {
  }

  public GetPhotoSizesByID200ResponseSizes canblog(BigDecimal canblog) {
    this.canblog = canblog;
    return this;
  }

  /**
   * Get canblog
   * @return canblog
   */
  @javax.annotation.Nullable
  public BigDecimal getCanblog() {
    return canblog;
  }

  public void setCanblog(BigDecimal canblog) {
    this.canblog = canblog;
  }


  public GetPhotoSizesByID200ResponseSizes candownload(BigDecimal candownload) {
    this.candownload = candownload;
    return this;
  }

  /**
   * Get candownload
   * @return candownload
   */
  @javax.annotation.Nullable
  public BigDecimal getCandownload() {
    return candownload;
  }

  public void setCandownload(BigDecimal candownload) {
    this.candownload = candownload;
  }


  public GetPhotoSizesByID200ResponseSizes canprint(BigDecimal canprint) {
    this.canprint = canprint;
    return this;
  }

  /**
   * Get canprint
   * @return canprint
   */
  @javax.annotation.Nullable
  public BigDecimal getCanprint() {
    return canprint;
  }

  public void setCanprint(BigDecimal canprint) {
    this.canprint = canprint;
  }


  public GetPhotoSizesByID200ResponseSizes sizes(List<Size> sizes) {
    this.sizes = sizes;
    return this;
  }

  public GetPhotoSizesByID200ResponseSizes addSizesItem(Size sizesItem) {
    if (this.sizes == null) {
      this.sizes = new ArrayList<>();
    }
    this.sizes.add(sizesItem);
    return this;
  }

  /**
   * Get sizes
   * @return sizes
   */
  @javax.annotation.Nullable
  public List<Size> getSizes() {
    return sizes;
  }

  public void setSizes(List<Size> sizes) {
    this.sizes = sizes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPhotoSizesByID200ResponseSizes getPhotoSizesByID200ResponseSizes = (GetPhotoSizesByID200ResponseSizes) o;
    return Objects.equals(this.canblog, getPhotoSizesByID200ResponseSizes.canblog) &&
        Objects.equals(this.candownload, getPhotoSizesByID200ResponseSizes.candownload) &&
        Objects.equals(this.canprint, getPhotoSizesByID200ResponseSizes.canprint) &&
        Objects.equals(this.sizes, getPhotoSizesByID200ResponseSizes.sizes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canblog, candownload, canprint, sizes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPhotoSizesByID200ResponseSizes {\n");
    sb.append("    canblog: ").append(toIndentedString(canblog)).append("\n");
    sb.append("    candownload: ").append(toIndentedString(candownload)).append("\n");
    sb.append("    canprint: ").append(toIndentedString(canprint)).append("\n");
    sb.append("    sizes: ").append(toIndentedString(sizes)).append("\n");
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
    openapiFields.add("canblog");
    openapiFields.add("candownload");
    openapiFields.add("canprint");
    openapiFields.add("sizes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPhotoSizesByID200ResponseSizes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPhotoSizesByID200ResponseSizes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPhotoSizesByID200ResponseSizes is not found in the empty JSON string", GetPhotoSizesByID200ResponseSizes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPhotoSizesByID200ResponseSizes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPhotoSizesByID200ResponseSizes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sizes") != null && !jsonObj.get("sizes").isJsonNull()) {
        JsonArray jsonArraysizes = jsonObj.getAsJsonArray("sizes");
        if (jsonArraysizes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sizes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sizes` to be an array in the JSON string but got `%s`", jsonObj.get("sizes").toString()));
          }

          // validate the optional field `sizes` (array)
          for (int i = 0; i < jsonArraysizes.size(); i++) {
            Size.validateJsonElement(jsonArraysizes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPhotoSizesByID200ResponseSizes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPhotoSizesByID200ResponseSizes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPhotoSizesByID200ResponseSizes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPhotoSizesByID200ResponseSizes.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPhotoSizesByID200ResponseSizes>() {
           @Override
           public void write(JsonWriter out, GetPhotoSizesByID200ResponseSizes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPhotoSizesByID200ResponseSizes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPhotoSizesByID200ResponseSizes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPhotoSizesByID200ResponseSizes
   * @throws IOException if the JSON string is invalid with respect to GetPhotoSizesByID200ResponseSizes
   */
  public static GetPhotoSizesByID200ResponseSizes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPhotoSizesByID200ResponseSizes.class);
  }

  /**
   * Convert an instance of GetPhotoSizesByID200ResponseSizes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

