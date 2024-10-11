/*
 * Debian Code Search
 * OpenAPI for https://codesearch.debian.net/
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: stapelberg@debian.org
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
 * A search result matching the specified query. You can use sources.debian.org to view the file contents. See https://github.com/Debian/dcs/blob/master/cmd/dcs-web/show/show.go for how to construct a sources.debian.org URL from a search result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:33.355508-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SearchResult {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_CONTEXT_AFTER = "context_after";
  @SerializedName(SERIALIZED_NAME_CONTEXT_AFTER)
  private List<String> contextAfter = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXT_BEFORE = "context_before";
  @SerializedName(SERIALIZED_NAME_CONTEXT_BEFORE)
  private List<String> contextBefore = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private Integer line;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public SearchResult() {
  }

  public SearchResult context(String context) {
    this.context = context;
    return this;
  }

  /**
   * The full line containing the search result.
   * @return context
   */
  @javax.annotation.Nonnull
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public SearchResult contextAfter(List<String> contextAfter) {
    this.contextAfter = contextAfter;
    return this;
  }

  public SearchResult addContextAfterItem(String contextAfterItem) {
    if (this.contextAfter == null) {
      this.contextAfter = new ArrayList<>();
    }
    this.contextAfter.add(contextAfterItem);
    return this;
  }

  /**
   * Up to 2 full lines after the search result (see &#x60;context&#x60;).
   * @return contextAfter
   */
  @javax.annotation.Nullable
  public List<String> getContextAfter() {
    return contextAfter;
  }

  public void setContextAfter(List<String> contextAfter) {
    this.contextAfter = contextAfter;
  }


  public SearchResult contextBefore(List<String> contextBefore) {
    this.contextBefore = contextBefore;
    return this;
  }

  public SearchResult addContextBeforeItem(String contextBeforeItem) {
    if (this.contextBefore == null) {
      this.contextBefore = new ArrayList<>();
    }
    this.contextBefore.add(contextBeforeItem);
    return this;
  }

  /**
   * Up to 2 full lines before the search result (see &#x60;context&#x60;).
   * @return contextBefore
   */
  @javax.annotation.Nullable
  public List<String> getContextBefore() {
    return contextBefore;
  }

  public void setContextBefore(List<String> contextBefore) {
    this.contextBefore = contextBefore;
  }


  public SearchResult line(Integer line) {
    this.line = line;
    return this;
  }

  /**
   * Line number containing the search result.
   * @return line
   */
  @javax.annotation.Nonnull
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }


  public SearchResult _package(String _package) {
    this._package = _package;
    return this;
  }

  /**
   * The Debian source package containing this search result, including the full Debian version number.
   * @return _package
   */
  @javax.annotation.Nonnull
  public String getPackage() {
    return _package;
  }

  public void setPackage(String _package) {
    this._package = _package;
  }


  public SearchResult path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to the file containing the this search result, starting with &#x60;package&#x60;.
   * @return path
   */
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.context, searchResult.context) &&
        Objects.equals(this.contextAfter, searchResult.contextAfter) &&
        Objects.equals(this.contextBefore, searchResult.contextBefore) &&
        Objects.equals(this.line, searchResult.line) &&
        Objects.equals(this._package, searchResult._package) &&
        Objects.equals(this.path, searchResult.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, contextAfter, contextBefore, line, _package, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextAfter: ").append(toIndentedString(contextAfter)).append("\n");
    sb.append("    contextBefore: ").append(toIndentedString(contextBefore)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("context_after");
    openapiFields.add("context_before");
    openapiFields.add("line");
    openapiFields.add("package");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("line");
    openapiRequiredFields.add("package");
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResult is not found in the empty JSON string", SearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("context_after") != null && !jsonObj.get("context_after").isJsonNull() && !jsonObj.get("context_after").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_after` to be an array in the JSON string but got `%s`", jsonObj.get("context_after").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("context_before") != null && !jsonObj.get("context_before").isJsonNull() && !jsonObj.get("context_before").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_before` to be an array in the JSON string but got `%s`", jsonObj.get("context_before").toString()));
      }
      if (!jsonObj.get("package").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResult>() {
           @Override
           public void write(JsonWriter out, SearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchResult
   * @throws IOException if the JSON string is invalid with respect to SearchResult
   */
  public static SearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResult.class);
  }

  /**
   * Convert an instance of SearchResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

