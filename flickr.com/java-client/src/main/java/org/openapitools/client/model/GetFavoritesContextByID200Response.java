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
import org.openapitools.client.model.ContextPhoto;
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
 * GetFavoritesContextByID200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:54.658141-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetFavoritesContextByID200Response {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private GetFavoritesContextByID200ResponseCount count;

  public static final String SERIALIZED_NAME_NEXTPHOTO = "nextphoto";
  @SerializedName(SERIALIZED_NAME_NEXTPHOTO)
  private ContextPhoto nextphoto;

  public static final String SERIALIZED_NAME_PREVPHOTO = "prevphoto";
  @SerializedName(SERIALIZED_NAME_PREVPHOTO)
  private ContextPhoto prevphoto;

  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private String stat;

  public GetFavoritesContextByID200Response() {
  }

  public GetFavoritesContextByID200Response count(GetFavoritesContextByID200ResponseCount count) {
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


  public GetFavoritesContextByID200Response nextphoto(ContextPhoto nextphoto) {
    this.nextphoto = nextphoto;
    return this;
  }

  /**
   * Get nextphoto
   * @return nextphoto
   */
  @javax.annotation.Nullable
  public ContextPhoto getNextphoto() {
    return nextphoto;
  }

  public void setNextphoto(ContextPhoto nextphoto) {
    this.nextphoto = nextphoto;
  }


  public GetFavoritesContextByID200Response prevphoto(ContextPhoto prevphoto) {
    this.prevphoto = prevphoto;
    return this;
  }

  /**
   * Get prevphoto
   * @return prevphoto
   */
  @javax.annotation.Nullable
  public ContextPhoto getPrevphoto() {
    return prevphoto;
  }

  public void setPrevphoto(ContextPhoto prevphoto) {
    this.prevphoto = prevphoto;
  }


  public GetFavoritesContextByID200Response stat(String stat) {
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
    GetFavoritesContextByID200Response getFavoritesContextByID200Response = (GetFavoritesContextByID200Response) o;
    return Objects.equals(this.count, getFavoritesContextByID200Response.count) &&
        Objects.equals(this.nextphoto, getFavoritesContextByID200Response.nextphoto) &&
        Objects.equals(this.prevphoto, getFavoritesContextByID200Response.prevphoto) &&
        Objects.equals(this.stat, getFavoritesContextByID200Response.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, nextphoto, prevphoto, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFavoritesContextByID200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    nextphoto: ").append(toIndentedString(nextphoto)).append("\n");
    sb.append("    prevphoto: ").append(toIndentedString(prevphoto)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("nextphoto");
    openapiFields.add("prevphoto");
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFavoritesContextByID200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFavoritesContextByID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFavoritesContextByID200Response is not found in the empty JSON string", GetFavoritesContextByID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFavoritesContextByID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFavoritesContextByID200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `count`
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonNull()) {
        GetFavoritesContextByID200ResponseCount.validateJsonElement(jsonObj.get("count"));
      }
      // validate the optional field `nextphoto`
      if (jsonObj.get("nextphoto") != null && !jsonObj.get("nextphoto").isJsonNull()) {
        ContextPhoto.validateJsonElement(jsonObj.get("nextphoto"));
      }
      // validate the optional field `prevphoto`
      if (jsonObj.get("prevphoto") != null && !jsonObj.get("prevphoto").isJsonNull()) {
        ContextPhoto.validateJsonElement(jsonObj.get("prevphoto"));
      }
      if ((jsonObj.get("stat") != null && !jsonObj.get("stat").isJsonNull()) && !jsonObj.get("stat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFavoritesContextByID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFavoritesContextByID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFavoritesContextByID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFavoritesContextByID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFavoritesContextByID200Response>() {
           @Override
           public void write(JsonWriter out, GetFavoritesContextByID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFavoritesContextByID200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFavoritesContextByID200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFavoritesContextByID200Response
   * @throws IOException if the JSON string is invalid with respect to GetFavoritesContextByID200Response
   */
  public static GetFavoritesContextByID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFavoritesContextByID200Response.class);
  }

  /**
   * Convert an instance of GetFavoritesContextByID200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

