/*
 * Dataflow Kit Web Scraper
 * Render Javascript driven pages, while we internally manage Headless Chrome and proxies for you.   - Build a custom web scraper with our Visual point-and-click toolkit. - Scrape the most popular Search engines result pages (SERP). - Convert web pages to PDF and capture screenshots. *** ### Authentication Dataflow Kit API require you to sign up for an API key in order to use the API.   The API key can be found in the [DFK Dashboard](https://account.dataflowkit.com) after _free registration_.  Pass a secret API Key to all API requests to the server as the `api_key` query parameter.  
 *
 * The version of the OpenAPI document: 1.3
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
 * The Send Keys action simulates real user input of key by key into a given string. It mimics real user behavior, such as the inability to type into invisible or read-only DOM elements. This action is useful for cases where explicit keystroke events are required, like auto-completing combo boxes. Unlike a similar &#39;input&#39; action, which forces a specified value directly into an input selector, this action does not overwrite existing content.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:20.015134-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SendKeys {
  public static final String SERIALIZED_NAME_IGNORE_IF_NOT_PRESENT = "ignoreIfNotPresent";
  @SerializedName(SERIALIZED_NAME_IGNORE_IF_NOT_PRESENT)
  private Boolean ignoreIfNotPresent;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public SendKeys() {
  }

  public SendKeys ignoreIfNotPresent(Boolean ignoreIfNotPresent) {
    this.ignoreIfNotPresent = ignoreIfNotPresent;
    return this;
  }

  /**
   * Get ignoreIfNotPresent
   * @return ignoreIfNotPresent
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreIfNotPresent() {
    return ignoreIfNotPresent;
  }

  public void setIgnoreIfNotPresent(Boolean ignoreIfNotPresent) {
    this.ignoreIfNotPresent = ignoreIfNotPresent;
  }


  public SendKeys selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Must be a valid CSS Selector
   * @return selector
   */
  @javax.annotation.Nullable
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }


  public SendKeys value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Sequence of keys to send. Keys can include keystrokes such as ALT+A, ENTER, BACKSPACE, etc.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendKeys sendKeys = (SendKeys) o;
    return Objects.equals(this.ignoreIfNotPresent, sendKeys.ignoreIfNotPresent) &&
        Objects.equals(this.selector, sendKeys.selector) &&
        Objects.equals(this.value, sendKeys.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreIfNotPresent, selector, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendKeys {\n");
    sb.append("    ignoreIfNotPresent: ").append(toIndentedString(ignoreIfNotPresent)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("ignoreIfNotPresent");
    openapiFields.add("selector");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SendKeys
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SendKeys.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendKeys is not found in the empty JSON string", SendKeys.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SendKeys.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendKeys` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) && !jsonObj.get("selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendKeys.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendKeys' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendKeys> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendKeys.class));

       return (TypeAdapter<T>) new TypeAdapter<SendKeys>() {
           @Override
           public void write(JsonWriter out, SendKeys value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendKeys read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SendKeys given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SendKeys
   * @throws IOException if the JSON string is invalid with respect to SendKeys
   */
  public static SendKeys fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendKeys.class);
  }

  /**
   * Convert an instance of SendKeys to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

