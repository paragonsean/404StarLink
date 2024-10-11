/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
import org.openapitools.client.model.ApiCoreDtoClickStreamHit;

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
 * ApiCoreDtoClickStreamHitListPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:52.389256-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreDtoClickStreamHitListPage {
  public static final String SERIALIZED_NAME_HITS = "hits";
  @SerializedName(SERIALIZED_NAME_HITS)
  private List<ApiCoreDtoClickStreamHit> hits = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_KEY = "lastKey";
  @SerializedName(SERIALIZED_NAME_LAST_KEY)
  private String lastKey;

  public ApiCoreDtoClickStreamHitListPage() {
  }

  public ApiCoreDtoClickStreamHitListPage hits(List<ApiCoreDtoClickStreamHit> hits) {
    this.hits = hits;
    return this;
  }

  public ApiCoreDtoClickStreamHitListPage addHitsItem(ApiCoreDtoClickStreamHit hitsItem) {
    if (this.hits == null) {
      this.hits = new ArrayList<>();
    }
    this.hits.add(hitsItem);
    return this;
  }

  /**
   * Get hits
   * @return hits
   */
  @javax.annotation.Nullable
  public List<ApiCoreDtoClickStreamHit> getHits() {
    return hits;
  }

  public void setHits(List<ApiCoreDtoClickStreamHit> hits) {
    this.hits = hits;
  }


  public ApiCoreDtoClickStreamHitListPage lastKey(String lastKey) {
    this.lastKey = lastKey;
    return this;
  }

  /**
   * Get lastKey
   * @return lastKey
   */
  @javax.annotation.Nullable
  public String getLastKey() {
    return lastKey;
  }

  public void setLastKey(String lastKey) {
    this.lastKey = lastKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreDtoClickStreamHitListPage apiCoreDtoClickStreamHitListPage = (ApiCoreDtoClickStreamHitListPage) o;
    return Objects.equals(this.hits, apiCoreDtoClickStreamHitListPage.hits) &&
        Objects.equals(this.lastKey, apiCoreDtoClickStreamHitListPage.lastKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hits, lastKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreDtoClickStreamHitListPage {\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    lastKey: ").append(toIndentedString(lastKey)).append("\n");
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
    openapiFields.add("hits");
    openapiFields.add("lastKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreDtoClickStreamHitListPage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreDtoClickStreamHitListPage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreDtoClickStreamHitListPage is not found in the empty JSON string", ApiCoreDtoClickStreamHitListPage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreDtoClickStreamHitListPage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreDtoClickStreamHitListPage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("hits") != null && !jsonObj.get("hits").isJsonNull()) {
        JsonArray jsonArrayhits = jsonObj.getAsJsonArray("hits");
        if (jsonArrayhits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hits` to be an array in the JSON string but got `%s`", jsonObj.get("hits").toString()));
          }

          // validate the optional field `hits` (array)
          for (int i = 0; i < jsonArrayhits.size(); i++) {
            ApiCoreDtoClickStreamHit.validateJsonElement(jsonArrayhits.get(i));
          };
        }
      }
      if ((jsonObj.get("lastKey") != null && !jsonObj.get("lastKey").isJsonNull()) && !jsonObj.get("lastKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreDtoClickStreamHitListPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreDtoClickStreamHitListPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreDtoClickStreamHitListPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreDtoClickStreamHitListPage.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreDtoClickStreamHitListPage>() {
           @Override
           public void write(JsonWriter out, ApiCoreDtoClickStreamHitListPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreDtoClickStreamHitListPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreDtoClickStreamHitListPage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreDtoClickStreamHitListPage
   * @throws IOException if the JSON string is invalid with respect to ApiCoreDtoClickStreamHitListPage
   */
  public static ApiCoreDtoClickStreamHitListPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreDtoClickStreamHitListPage.class);
  }

  /**
   * Convert an instance of ApiCoreDtoClickStreamHitListPage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

