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
 * Click on an element with the specified CSS Selector. JS Click internally invokes a script (Javascript) that clicks the element.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:03.113982-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Jsclick {
  public static final String SERIALIZED_NAME_IGNORE_IF_NOT_PRESENT = "ignoreIfNotPresent";
  @SerializedName(SERIALIZED_NAME_IGNORE_IF_NOT_PRESENT)
  private Boolean ignoreIfNotPresent;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  public static final String SERIALIZED_NAME_SKIP_LAST_ITERATION = "skipLastIteration";
  @SerializedName(SERIALIZED_NAME_SKIP_LAST_ITERATION)
  private Boolean skipLastIteration;

  public Jsclick() {
  }

  public Jsclick ignoreIfNotPresent(Boolean ignoreIfNotPresent) {
    this.ignoreIfNotPresent = ignoreIfNotPresent;
    return this;
  }

  /**
   * This optional parameter is useful when the target element occasionally may not be present in the DOM.
   * @return ignoreIfNotPresent
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreIfNotPresent() {
    return ignoreIfNotPresent;
  }

  public void setIgnoreIfNotPresent(Boolean ignoreIfNotPresent) {
    this.ignoreIfNotPresent = ignoreIfNotPresent;
  }


  public Jsclick selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Must be a valid CSS Selector for the target element.
   * @return selector
   */
  @javax.annotation.Nullable
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }


  public Jsclick skipLastIteration(Boolean skipLastIteration) {
    this.skipLastIteration = skipLastIteration;
    return this;
  }

  /**
   * It is only used for click action inside a loop only. Skips the last iteration.
   * @return skipLastIteration
   */
  @javax.annotation.Nullable
  public Boolean getSkipLastIteration() {
    return skipLastIteration;
  }

  public void setSkipLastIteration(Boolean skipLastIteration) {
    this.skipLastIteration = skipLastIteration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jsclick jsclick = (Jsclick) o;
    return Objects.equals(this.ignoreIfNotPresent, jsclick.ignoreIfNotPresent) &&
        Objects.equals(this.selector, jsclick.selector) &&
        Objects.equals(this.skipLastIteration, jsclick.skipLastIteration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreIfNotPresent, selector, skipLastIteration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jsclick {\n");
    sb.append("    ignoreIfNotPresent: ").append(toIndentedString(ignoreIfNotPresent)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    skipLastIteration: ").append(toIndentedString(skipLastIteration)).append("\n");
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
    openapiFields.add("skipLastIteration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Jsclick
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jsclick.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jsclick is not found in the empty JSON string", Jsclick.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jsclick.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jsclick` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) && !jsonObj.get("selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jsclick.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jsclick' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jsclick> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jsclick.class));

       return (TypeAdapter<T>) new TypeAdapter<Jsclick>() {
           @Override
           public void write(JsonWriter out, Jsclick value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jsclick read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Jsclick given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Jsclick
   * @throws IOException if the JSON string is invalid with respect to Jsclick
   */
  public static Jsclick fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jsclick.class);
  }

  /**
   * Convert an instance of Jsclick to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

