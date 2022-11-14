/*
 * Crossbrowsertesting.com Screenshot Comparisons API
 * What's in this version:   1. Compare two screenshots for layout differences   2. Compare a full screenshot test of browsers to a single baseline browser for layout differences.   3. Compare a screenshot test version to another test version - good for regression tests.   4. Get links to the Comparison UI for visual representation of layout differences
 *
 * The version of the OpenAPI document: 3.0.0
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
 * Screenshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:20.933088-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Screenshot {
  public static final String SERIALIZED_NAME_SCREENSHOT_ID = "screenshot_id";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT_ID)
  private Integer screenshotId;

  public Screenshot() {
  }

  public Screenshot screenshotId(Integer screenshotId) {
    this.screenshotId = screenshotId;
    return this;
  }

  /**
   * Get screenshotId
   * @return screenshotId
   */
  @javax.annotation.Nullable
  public Integer getScreenshotId() {
    return screenshotId;
  }

  public void setScreenshotId(Integer screenshotId) {
    this.screenshotId = screenshotId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Screenshot screenshot = (Screenshot) o;
    return Objects.equals(this.screenshotId, screenshot.screenshotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenshotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Screenshot {\n");
    sb.append("    screenshotId: ").append(toIndentedString(screenshotId)).append("\n");
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
    openapiFields.add("screenshot_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Screenshot
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Screenshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Screenshot is not found in the empty JSON string", Screenshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Screenshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Screenshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Screenshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Screenshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Screenshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Screenshot.class));

       return (TypeAdapter<T>) new TypeAdapter<Screenshot>() {
           @Override
           public void write(JsonWriter out, Screenshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Screenshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Screenshot given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Screenshot
   * @throws IOException if the JSON string is invalid with respect to Screenshot
   */
  public static Screenshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Screenshot.class);
  }

  /**
   * Convert an instance of Screenshot to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

