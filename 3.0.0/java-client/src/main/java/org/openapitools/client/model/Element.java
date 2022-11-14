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
 * Element
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:20.933088-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Element {
  public static final String SERIALIZED_NAME_DIFFERENCE = "difference";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE)
  private String difference;

  public static final String SERIALIZED_NAME_FULL_PATH = "full_path";
  @SerializedName(SERIALIZED_NAME_FULL_PATH)
  private String fullPath;

  public static final String SERIALIZED_NAME_SHORT_PATH = "short_path";
  @SerializedName(SERIALIZED_NAME_SHORT_PATH)
  private String shortPath;

  public static final String SERIALIZED_NAME_SHOW_DIFFERENCE_PUBLIC_URL = "show_difference_public_url";
  @SerializedName(SERIALIZED_NAME_SHOW_DIFFERENCE_PUBLIC_URL)
  private String showDifferencePublicUrl;

  public static final String SERIALIZED_NAME_SHOW_DIFFERENCE_WEB_URL = "show_difference_web_url";
  @SerializedName(SERIALIZED_NAME_SHOW_DIFFERENCE_WEB_URL)
  private String showDifferenceWebUrl;

  public Element() {
  }

  public Element difference(String difference) {
    this.difference = difference;
    return this;
  }

  /**
   * Get difference
   * @return difference
   */
  @javax.annotation.Nullable
  public String getDifference() {
    return difference;
  }

  public void setDifference(String difference) {
    this.difference = difference;
  }


  public Element fullPath(String fullPath) {
    this.fullPath = fullPath;
    return this;
  }

  /**
   * Get fullPath
   * @return fullPath
   */
  @javax.annotation.Nullable
  public String getFullPath() {
    return fullPath;
  }

  public void setFullPath(String fullPath) {
    this.fullPath = fullPath;
  }


  public Element shortPath(String shortPath) {
    this.shortPath = shortPath;
    return this;
  }

  /**
   * Get shortPath
   * @return shortPath
   */
  @javax.annotation.Nullable
  public String getShortPath() {
    return shortPath;
  }

  public void setShortPath(String shortPath) {
    this.shortPath = shortPath;
  }


  public Element showDifferencePublicUrl(String showDifferencePublicUrl) {
    this.showDifferencePublicUrl = showDifferencePublicUrl;
    return this;
  }

  /**
   * Get showDifferencePublicUrl
   * @return showDifferencePublicUrl
   */
  @javax.annotation.Nullable
  public String getShowDifferencePublicUrl() {
    return showDifferencePublicUrl;
  }

  public void setShowDifferencePublicUrl(String showDifferencePublicUrl) {
    this.showDifferencePublicUrl = showDifferencePublicUrl;
  }


  public Element showDifferenceWebUrl(String showDifferenceWebUrl) {
    this.showDifferenceWebUrl = showDifferenceWebUrl;
    return this;
  }

  /**
   * Get showDifferenceWebUrl
   * @return showDifferenceWebUrl
   */
  @javax.annotation.Nullable
  public String getShowDifferenceWebUrl() {
    return showDifferenceWebUrl;
  }

  public void setShowDifferenceWebUrl(String showDifferenceWebUrl) {
    this.showDifferenceWebUrl = showDifferenceWebUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Element element = (Element) o;
    return Objects.equals(this.difference, element.difference) &&
        Objects.equals(this.fullPath, element.fullPath) &&
        Objects.equals(this.shortPath, element.shortPath) &&
        Objects.equals(this.showDifferencePublicUrl, element.showDifferencePublicUrl) &&
        Objects.equals(this.showDifferenceWebUrl, element.showDifferenceWebUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difference, fullPath, shortPath, showDifferencePublicUrl, showDifferenceWebUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Element {\n");
    sb.append("    difference: ").append(toIndentedString(difference)).append("\n");
    sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
    sb.append("    shortPath: ").append(toIndentedString(shortPath)).append("\n");
    sb.append("    showDifferencePublicUrl: ").append(toIndentedString(showDifferencePublicUrl)).append("\n");
    sb.append("    showDifferenceWebUrl: ").append(toIndentedString(showDifferenceWebUrl)).append("\n");
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
    openapiFields.add("difference");
    openapiFields.add("full_path");
    openapiFields.add("short_path");
    openapiFields.add("show_difference_public_url");
    openapiFields.add("show_difference_web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Element
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Element.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Element is not found in the empty JSON string", Element.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Element.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Element` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("difference") != null && !jsonObj.get("difference").isJsonNull()) && !jsonObj.get("difference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `difference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("difference").toString()));
      }
      if ((jsonObj.get("full_path") != null && !jsonObj.get("full_path").isJsonNull()) && !jsonObj.get("full_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_path").toString()));
      }
      if ((jsonObj.get("short_path") != null && !jsonObj.get("short_path").isJsonNull()) && !jsonObj.get("short_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_path").toString()));
      }
      if ((jsonObj.get("show_difference_public_url") != null && !jsonObj.get("show_difference_public_url").isJsonNull()) && !jsonObj.get("show_difference_public_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_difference_public_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_difference_public_url").toString()));
      }
      if ((jsonObj.get("show_difference_web_url") != null && !jsonObj.get("show_difference_web_url").isJsonNull()) && !jsonObj.get("show_difference_web_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_difference_web_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_difference_web_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Element.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Element' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Element> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Element.class));

       return (TypeAdapter<T>) new TypeAdapter<Element>() {
           @Override
           public void write(JsonWriter out, Element value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Element read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Element given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Element
   * @throws IOException if the JSON string is invalid with respect to Element
   */
  public static Element fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Element.class);
  }

  /**
   * Convert an instance of Element to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

