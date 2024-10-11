/*
 * Service Control API
 * Provides admission control and telemetry reporting for services integrated with Service Infrastructure. 
 *
 * The version of the OpenAPI document: v2
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
 * Additional information about the source code location that produced the log entry.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:54.152517-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class V2LogEntrySourceLocation {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private String function;

  public static final String SERIALIZED_NAME_LINE = "line";
  @SerializedName(SERIALIZED_NAME_LINE)
  private String line;

  public V2LogEntrySourceLocation() {
  }

  public V2LogEntrySourceLocation _file(String _file) {
    this._file = _file;
    return this;
  }

  /**
   * Optional. Source file name. Depending on the runtime environment, this might be a simple name or a fully-qualified name.
   * @return _file
   */
  @javax.annotation.Nullable
  public String getFile() {
    return _file;
  }

  public void setFile(String _file) {
    this._file = _file;
  }


  public V2LogEntrySourceLocation function(String function) {
    this.function = function;
    return this;
  }

  /**
   * Optional. Human-readable name of the function or method being invoked, with optional context such as the class or package name. This information may be used in contexts such as the logs viewer, where a file and line number are less meaningful. The format can vary by language. For example: &#x60;qual.if.ied.Class.method&#x60; (Java), &#x60;dir/package.func&#x60; (Go), &#x60;function&#x60; (Python).
   * @return function
   */
  @javax.annotation.Nullable
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }


  public V2LogEntrySourceLocation line(String line) {
    this.line = line;
    return this;
  }

  /**
   * Optional. Line within the source file. 1-based; 0 indicates no line number available.
   * @return line
   */
  @javax.annotation.Nullable
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2LogEntrySourceLocation v2LogEntrySourceLocation = (V2LogEntrySourceLocation) o;
    return Objects.equals(this._file, v2LogEntrySourceLocation._file) &&
        Objects.equals(this.function, v2LogEntrySourceLocation.function) &&
        Objects.equals(this.line, v2LogEntrySourceLocation.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, function, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2LogEntrySourceLocation {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
    openapiFields.add("file");
    openapiFields.add("function");
    openapiFields.add("line");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2LogEntrySourceLocation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2LogEntrySourceLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2LogEntrySourceLocation is not found in the empty JSON string", V2LogEntrySourceLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2LogEntrySourceLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2LogEntrySourceLocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("file") != null && !jsonObj.get("file").isJsonNull()) && !jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if ((jsonObj.get("function") != null && !jsonObj.get("function").isJsonNull()) && !jsonObj.get("function").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function").toString()));
      }
      if ((jsonObj.get("line") != null && !jsonObj.get("line").isJsonNull()) && !jsonObj.get("line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2LogEntrySourceLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2LogEntrySourceLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2LogEntrySourceLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2LogEntrySourceLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<V2LogEntrySourceLocation>() {
           @Override
           public void write(JsonWriter out, V2LogEntrySourceLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2LogEntrySourceLocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2LogEntrySourceLocation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2LogEntrySourceLocation
   * @throws IOException if the JSON string is invalid with respect to V2LogEntrySourceLocation
   */
  public static V2LogEntrySourceLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2LogEntrySourceLocation.class);
  }

  /**
   * Convert an instance of V2LogEntrySourceLocation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

