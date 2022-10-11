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
import java.math.BigDecimal;
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
 * Scroll a page down to load more content, simulating user interaction with infinite scrolled pages. Or specify the element&#39;s CSS Selector to click for loading more content.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:03.113982-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Scroll {
  public static final String SERIALIZED_NAME_SCROLL_BY_PIXELS = "scrollByPixels";
  @SerializedName(SERIALIZED_NAME_SCROLL_BY_PIXELS)
  private BigDecimal scrollByPixels;

  public static final String SERIALIZED_NAME_SCROLLING_ELEMENT_SELECTOR = "scrollingElementSelector";
  @SerializedName(SERIALIZED_NAME_SCROLLING_ELEMENT_SELECTOR)
  private String scrollingElementSelector;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  public static final String SERIALIZED_NAME_TIMES = "times";
  @SerializedName(SERIALIZED_NAME_TIMES)
  private Integer times;

  public Scroll() {
  }

  public Scroll scrollByPixels(BigDecimal scrollByPixels) {
    this.scrollByPixels = scrollByPixels;
    return this;
  }

  /**
   * Scrolls a web page by the number of pixels specified by &#39;scrollByPixels&#39; parameter.
   * @return scrollByPixels
   */
  @javax.annotation.Nullable
  public BigDecimal getScrollByPixels() {
    return scrollByPixels;
  }

  public void setScrollByPixels(BigDecimal scrollByPixels) {
    this.scrollByPixels = scrollByPixels;
  }


  public Scroll scrollingElementSelector(String scrollingElementSelector) {
    this.scrollingElementSelector = scrollingElementSelector;
    return this;
  }

  /**
   * Optionally specify here a valid CSS Selector of scrolling element.
   * @return scrollingElementSelector
   */
  @javax.annotation.Nullable
  public String getScrollingElementSelector() {
    return scrollingElementSelector;
  }

  public void setScrollingElementSelector(String scrollingElementSelector) {
    this.scrollingElementSelector = scrollingElementSelector;
  }


  public Scroll selector(String selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Some websites require clicking &#39;More&#39; button while scrolling a page. Put here &#39;More&#39; button valid CSS Selector.
   * @return selector
   */
  @javax.annotation.Nullable
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }


  public Scroll times(Integer times) {
    this.times = times;
    return this;
  }

  /**
   * The number of times to scroll down a web page.
   * @return times
   */
  @javax.annotation.Nullable
  public Integer getTimes() {
    return times;
  }

  public void setTimes(Integer times) {
    this.times = times;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scroll scroll = (Scroll) o;
    return Objects.equals(this.scrollByPixels, scroll.scrollByPixels) &&
        Objects.equals(this.scrollingElementSelector, scroll.scrollingElementSelector) &&
        Objects.equals(this.selector, scroll.selector) &&
        Objects.equals(this.times, scroll.times);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollByPixels, scrollingElementSelector, selector, times);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scroll {\n");
    sb.append("    scrollByPixels: ").append(toIndentedString(scrollByPixels)).append("\n");
    sb.append("    scrollingElementSelector: ").append(toIndentedString(scrollingElementSelector)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
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
    openapiFields.add("scrollByPixels");
    openapiFields.add("scrollingElementSelector");
    openapiFields.add("selector");
    openapiFields.add("times");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Scroll
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Scroll.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scroll is not found in the empty JSON string", Scroll.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Scroll.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scroll` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scrollingElementSelector") != null && !jsonObj.get("scrollingElementSelector").isJsonNull()) && !jsonObj.get("scrollingElementSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scrollingElementSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scrollingElementSelector").toString()));
      }
      if ((jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) && !jsonObj.get("selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Scroll.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scroll' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scroll> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scroll.class));

       return (TypeAdapter<T>) new TypeAdapter<Scroll>() {
           @Override
           public void write(JsonWriter out, Scroll value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scroll read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Scroll given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Scroll
   * @throws IOException if the JSON string is invalid with respect to Scroll
   */
  public static Scroll fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scroll.class);
  }

  /**
   * Convert an instance of Scroll to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

