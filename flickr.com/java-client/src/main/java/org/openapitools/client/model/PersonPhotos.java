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
import org.openapitools.client.model.GetFavoritesContextByID200ResponseCount;

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
 * PersonPhotos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:42.002778-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PersonPhotos {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private GetFavoritesContextByID200ResponseCount count;

  public static final String SERIALIZED_NAME_FIRSTDATE = "firstdate";
  @SerializedName(SERIALIZED_NAME_FIRSTDATE)
  private GetFavoritesContextByID200ResponseCount firstdate;

  public static final String SERIALIZED_NAME_FIRSTDATETAKEN = "firstdatetaken";
  @SerializedName(SERIALIZED_NAME_FIRSTDATETAKEN)
  private GetFavoritesContextByID200ResponseCount firstdatetaken;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private GetFavoritesContextByID200ResponseCount views;

  public PersonPhotos() {
  }

  public PersonPhotos count(GetFavoritesContextByID200ResponseCount count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getCount() {
    return count;
  }

  public void setCount(GetFavoritesContextByID200ResponseCount count) {
    this.count = count;
  }


  public PersonPhotos firstdate(GetFavoritesContextByID200ResponseCount firstdate) {
    this.firstdate = firstdate;
    return this;
  }

  /**
   * Get firstdate
   * @return firstdate
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getFirstdate() {
    return firstdate;
  }

  public void setFirstdate(GetFavoritesContextByID200ResponseCount firstdate) {
    this.firstdate = firstdate;
  }


  public PersonPhotos firstdatetaken(GetFavoritesContextByID200ResponseCount firstdatetaken) {
    this.firstdatetaken = firstdatetaken;
    return this;
  }

  /**
   * Get firstdatetaken
   * @return firstdatetaken
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getFirstdatetaken() {
    return firstdatetaken;
  }

  public void setFirstdatetaken(GetFavoritesContextByID200ResponseCount firstdatetaken) {
    this.firstdatetaken = firstdatetaken;
  }


  public PersonPhotos views(GetFavoritesContextByID200ResponseCount views) {
    this.views = views;
    return this;
  }

  /**
   * Get views
   * @return views
   */
  @javax.annotation.Nullable
  public GetFavoritesContextByID200ResponseCount getViews() {
    return views;
  }

  public void setViews(GetFavoritesContextByID200ResponseCount views) {
    this.views = views;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonPhotos personPhotos = (PersonPhotos) o;
    return Objects.equals(this.count, personPhotos.count) &&
        Objects.equals(this.firstdate, personPhotos.firstdate) &&
        Objects.equals(this.firstdatetaken, personPhotos.firstdatetaken) &&
        Objects.equals(this.views, personPhotos.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, firstdate, firstdatetaken, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPhotos {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    firstdate: ").append(toIndentedString(firstdate)).append("\n");
    sb.append("    firstdatetaken: ").append(toIndentedString(firstdatetaken)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("firstdate");
    openapiFields.add("firstdatetaken");
    openapiFields.add("views");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PersonPhotos
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PersonPhotos.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonPhotos is not found in the empty JSON string", PersonPhotos.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PersonPhotos.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonPhotos` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `count`
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("count"));
      }
      // validate the optional field `firstdate`
      if (jsonObj.get("firstdate") != null && !jsonObj.get("firstdate").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("firstdate"));
      }
      // validate the optional field `firstdatetaken`
      if (jsonObj.get("firstdatetaken") != null && !jsonObj.get("firstdatetaken").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("firstdatetaken"));
      }
      // validate the optional field `views`
      if (jsonObj.get("views") != null && !jsonObj.get("views").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("views"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonPhotos.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonPhotos' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonPhotos> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonPhotos.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonPhotos>() {
           @Override
           public void write(JsonWriter out, PersonPhotos value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonPhotos read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PersonPhotos given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PersonPhotos
   * @throws IOException if the JSON string is invalid with respect to PersonPhotos
   */
  public static PersonPhotos fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonPhotos.class);
  }

  /**
   * Convert an instance of PersonPhotos to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

