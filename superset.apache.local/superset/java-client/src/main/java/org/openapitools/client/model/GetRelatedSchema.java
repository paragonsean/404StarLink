/*
 * Superset
 * Superset
 *
 * The version of the OpenAPI document: v1
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
 * GetRelatedSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRelatedSchema {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_INCLUDE_IDS = "include_ids";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IDS)
  private List<Integer> includeIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public GetRelatedSchema() {
  }

  public GetRelatedSchema filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public GetRelatedSchema includeIds(List<Integer> includeIds) {
    this.includeIds = includeIds;
    return this;
  }

  public GetRelatedSchema addIncludeIdsItem(Integer includeIdsItem) {
    if (this.includeIds == null) {
      this.includeIds = new ArrayList<>();
    }
    this.includeIds.add(includeIdsItem);
    return this;
  }

  /**
   * Get includeIds
   * @return includeIds
   */
  @javax.annotation.Nullable
  public List<Integer> getIncludeIds() {
    return includeIds;
  }

  public void setIncludeIds(List<Integer> includeIds) {
    this.includeIds = includeIds;
  }


  public GetRelatedSchema page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public GetRelatedSchema pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelatedSchema getRelatedSchema = (GetRelatedSchema) o;
    return Objects.equals(this.filter, getRelatedSchema.filter) &&
        Objects.equals(this.includeIds, getRelatedSchema.includeIds) &&
        Objects.equals(this.page, getRelatedSchema.page) &&
        Objects.equals(this.pageSize, getRelatedSchema.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includeIds, page, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRelatedSchema {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeIds: ").append(toIndentedString(includeIds)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("include_ids");
    openapiFields.add("page");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRelatedSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRelatedSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRelatedSchema is not found in the empty JSON string", GetRelatedSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRelatedSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRelatedSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("include_ids") != null && !jsonObj.get("include_ids").isJsonNull() && !jsonObj.get("include_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `include_ids` to be an array in the JSON string but got `%s`", jsonObj.get("include_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRelatedSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRelatedSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRelatedSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRelatedSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRelatedSchema>() {
           @Override
           public void write(JsonWriter out, GetRelatedSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRelatedSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRelatedSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRelatedSchema
   * @throws IOException if the JSON string is invalid with respect to GetRelatedSchema
   */
  public static GetRelatedSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRelatedSchema.class);
  }

  /**
   * Convert an instance of GetRelatedSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

