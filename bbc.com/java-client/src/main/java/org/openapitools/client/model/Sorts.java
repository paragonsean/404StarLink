/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import org.openapitools.client.model.Sort;
import org.openapitools.client.model.UnstableSorts;

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
 * Sorts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Sorts {
  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<Sort> sort = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNSTABLE_SORTS = "unstable_sorts";
  @SerializedName(SERIALIZED_NAME_UNSTABLE_SORTS)
  private UnstableSorts unstableSorts;

  public Sorts() {
  }

  public Sorts sort(List<Sort> sort) {
    this.sort = sort;
    return this;
  }

  public Sorts addSortItem(Sort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Get sort
   * @return sort
   */
  @javax.annotation.Nullable
  public List<Sort> getSort() {
    return sort;
  }

  public void setSort(List<Sort> sort) {
    this.sort = sort;
  }


  public Sorts unstableSorts(UnstableSorts unstableSorts) {
    this.unstableSorts = unstableSorts;
    return this;
  }

  /**
   * Get unstableSorts
   * @return unstableSorts
   */
  @javax.annotation.Nullable
  public UnstableSorts getUnstableSorts() {
    return unstableSorts;
  }

  public void setUnstableSorts(UnstableSorts unstableSorts) {
    this.unstableSorts = unstableSorts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sorts sorts = (Sorts) o;
    return Objects.equals(this.sort, sorts.sort) &&
        Objects.equals(this.unstableSorts, sorts.unstableSorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, unstableSorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sorts {\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    unstableSorts: ").append(toIndentedString(unstableSorts)).append("\n");
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
    openapiFields.add("sort");
    openapiFields.add("unstable_sorts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Sorts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Sorts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sorts is not found in the empty JSON string", Sorts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Sorts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Sorts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull()) {
        JsonArray jsonArraysort = jsonObj.getAsJsonArray("sort");
        if (jsonArraysort != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sort").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sort` to be an array in the JSON string but got `%s`", jsonObj.get("sort").toString()));
          }

          // validate the optional field `sort` (array)
          for (int i = 0; i < jsonArraysort.size(); i++) {
            Sort.validateJsonElement(jsonArraysort.get(i));
          };
        }
      }
      // validate the optional field `unstable_sorts`
      if (jsonObj.get("unstable_sorts") != null && !jsonObj.get("unstable_sorts").isJsonNull()) {
        UnstableSorts.validateJsonElement(jsonObj.get("unstable_sorts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Sorts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sorts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sorts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sorts.class));

       return (TypeAdapter<T>) new TypeAdapter<Sorts>() {
           @Override
           public void write(JsonWriter out, Sorts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Sorts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Sorts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Sorts
   * @throws IOException if the JSON string is invalid with respect to Sorts
   */
  public static Sorts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sorts.class);
  }

  /**
   * Convert an instance of Sorts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

