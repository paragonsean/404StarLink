/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
 *
 * The version of the OpenAPI document: v3
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
 * Details for the filter of the type SEARCH_AND_REPLACE.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:26.696972-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FilterSearchAndReplaceDetails {
  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "caseSensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_FIELD_INDEX = "fieldIndex";
  @SerializedName(SERIALIZED_NAME_FIELD_INDEX)
  private Integer fieldIndex;

  public static final String SERIALIZED_NAME_REPLACE_STRING = "replaceString";
  @SerializedName(SERIALIZED_NAME_REPLACE_STRING)
  private String replaceString;

  public static final String SERIALIZED_NAME_SEARCH_STRING = "searchString";
  @SerializedName(SERIALIZED_NAME_SEARCH_STRING)
  private String searchString;

  public FilterSearchAndReplaceDetails() {
  }

  public FilterSearchAndReplaceDetails caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Determines if the filter is case sensitive.
   * @return caseSensitive
   */
  @javax.annotation.Nullable
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public FilterSearchAndReplaceDetails field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Field to use in the filter.
   * @return field
   */
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  public FilterSearchAndReplaceDetails fieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
    return this;
  }

  /**
   * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
   * @return fieldIndex
   */
  @javax.annotation.Nullable
  public Integer getFieldIndex() {
    return fieldIndex;
  }

  public void setFieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
  }


  public FilterSearchAndReplaceDetails replaceString(String replaceString) {
    this.replaceString = replaceString;
    return this;
  }

  /**
   * Term to replace the search term with.
   * @return replaceString
   */
  @javax.annotation.Nullable
  public String getReplaceString() {
    return replaceString;
  }

  public void setReplaceString(String replaceString) {
    this.replaceString = replaceString;
  }


  public FilterSearchAndReplaceDetails searchString(String searchString) {
    this.searchString = searchString;
    return this;
  }

  /**
   * Term to search.
   * @return searchString
   */
  @javax.annotation.Nullable
  public String getSearchString() {
    return searchString;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSearchAndReplaceDetails filterSearchAndReplaceDetails = (FilterSearchAndReplaceDetails) o;
    return Objects.equals(this.caseSensitive, filterSearchAndReplaceDetails.caseSensitive) &&
        Objects.equals(this.field, filterSearchAndReplaceDetails.field) &&
        Objects.equals(this.fieldIndex, filterSearchAndReplaceDetails.fieldIndex) &&
        Objects.equals(this.replaceString, filterSearchAndReplaceDetails.replaceString) &&
        Objects.equals(this.searchString, filterSearchAndReplaceDetails.searchString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, field, fieldIndex, replaceString, searchString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSearchAndReplaceDetails {\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldIndex: ").append(toIndentedString(fieldIndex)).append("\n");
    sb.append("    replaceString: ").append(toIndentedString(replaceString)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
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
    openapiFields.add("caseSensitive");
    openapiFields.add("field");
    openapiFields.add("fieldIndex");
    openapiFields.add("replaceString");
    openapiFields.add("searchString");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FilterSearchAndReplaceDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FilterSearchAndReplaceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterSearchAndReplaceDetails is not found in the empty JSON string", FilterSearchAndReplaceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FilterSearchAndReplaceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterSearchAndReplaceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("replaceString") != null && !jsonObj.get("replaceString").isJsonNull()) && !jsonObj.get("replaceString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replaceString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replaceString").toString()));
      }
      if ((jsonObj.get("searchString") != null && !jsonObj.get("searchString").isJsonNull()) && !jsonObj.get("searchString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchString").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterSearchAndReplaceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterSearchAndReplaceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterSearchAndReplaceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterSearchAndReplaceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterSearchAndReplaceDetails>() {
           @Override
           public void write(JsonWriter out, FilterSearchAndReplaceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterSearchAndReplaceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FilterSearchAndReplaceDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FilterSearchAndReplaceDetails
   * @throws IOException if the JSON string is invalid with respect to FilterSearchAndReplaceDetails
   */
  public static FilterSearchAndReplaceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterSearchAndReplaceDetails.class);
  }

  /**
   * Convert an instance of FilterSearchAndReplaceDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

