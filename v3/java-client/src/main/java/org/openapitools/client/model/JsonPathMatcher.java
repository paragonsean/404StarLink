/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
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
 * Information needed to perform a JSONPath content match. Used for ContentMatcherOption::MATCHES_JSON_PATH and ContentMatcherOption::NOT_MATCHES_JSON_PATH.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class JsonPathMatcher {
  /**
   * The type of JSONPath match that will be applied to the JSON output (ContentMatcher.content)
   */
  @JsonAdapter(JsonMatcherEnum.Adapter.class)
  public enum JsonMatcherEnum {
    JSON_PATH_MATCHER_OPTION_UNSPECIFIED("JSON_PATH_MATCHER_OPTION_UNSPECIFIED"),
    
    EXACT_MATCH("EXACT_MATCH"),
    
    REGEX_MATCH("REGEX_MATCH");

    private String value;

    JsonMatcherEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JsonMatcherEnum fromValue(String value) {
      for (JsonMatcherEnum b : JsonMatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JsonMatcherEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JsonMatcherEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JsonMatcherEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JsonMatcherEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      JsonMatcherEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_JSON_MATCHER = "jsonMatcher";
  @SerializedName(SERIALIZED_NAME_JSON_MATCHER)
  private JsonMatcherEnum jsonMatcher;

  public static final String SERIALIZED_NAME_JSON_PATH = "jsonPath";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private String jsonPath;

  public JsonPathMatcher() {
  }

  public JsonPathMatcher jsonMatcher(JsonMatcherEnum jsonMatcher) {
    this.jsonMatcher = jsonMatcher;
    return this;
  }

  /**
   * The type of JSONPath match that will be applied to the JSON output (ContentMatcher.content)
   * @return jsonMatcher
   */
  @javax.annotation.Nullable
  public JsonMatcherEnum getJsonMatcher() {
    return jsonMatcher;
  }

  public void setJsonMatcher(JsonMatcherEnum jsonMatcher) {
    this.jsonMatcher = jsonMatcher;
  }


  public JsonPathMatcher jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

  /**
   * JSONPath within the response output pointing to the expected ContentMatcher::content to match against.
   * @return jsonPath
   */
  @javax.annotation.Nullable
  public String getJsonPath() {
    return jsonPath;
  }

  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPathMatcher jsonPathMatcher = (JsonPathMatcher) o;
    return Objects.equals(this.jsonMatcher, jsonPathMatcher.jsonMatcher) &&
        Objects.equals(this.jsonPath, jsonPathMatcher.jsonPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonMatcher, jsonPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPathMatcher {\n");
    sb.append("    jsonMatcher: ").append(toIndentedString(jsonMatcher)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
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
    openapiFields.add("jsonMatcher");
    openapiFields.add("jsonPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JsonPathMatcher
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonPathMatcher.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonPathMatcher is not found in the empty JSON string", JsonPathMatcher.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JsonPathMatcher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonPathMatcher` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("jsonMatcher") != null && !jsonObj.get("jsonMatcher").isJsonNull()) && !jsonObj.get("jsonMatcher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonMatcher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonMatcher").toString()));
      }
      // validate the optional field `jsonMatcher`
      if (jsonObj.get("jsonMatcher") != null && !jsonObj.get("jsonMatcher").isJsonNull()) {
        JsonMatcherEnum.validateJsonElement(jsonObj.get("jsonMatcher"));
      }
      if ((jsonObj.get("jsonPath") != null && !jsonObj.get("jsonPath").isJsonNull()) && !jsonObj.get("jsonPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonPathMatcher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonPathMatcher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonPathMatcher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonPathMatcher.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonPathMatcher>() {
           @Override
           public void write(JsonWriter out, JsonPathMatcher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonPathMatcher read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JsonPathMatcher given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JsonPathMatcher
   * @throws IOException if the JSON string is invalid with respect to JsonPathMatcher
   */
  public static JsonPathMatcher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonPathMatcher.class);
  }

  /**
   * Convert an instance of JsonPathMatcher to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

