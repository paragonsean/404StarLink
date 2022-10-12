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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Action;
import org.openapitools.client.model.InitialCookie;

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
 * Url2screenshotrequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:05.617687-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Url2screenshotrequest {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIP_SELECTOR = "clipSelector";
  @SerializedName(SERIALIZED_NAME_CLIP_SELECTOR)
  private String clipSelector;

  /**
   * Sets the Format of output image
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    PNG("png"),
    
    JPEG("jpeg");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format = FormatEnum.PNG;

  public static final String SERIALIZED_NAME_FULL_PAGE = "fullPage";
  @SerializedName(SERIALIZED_NAME_FULL_PAGE)
  private Boolean fullPage = false;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height = 600;

  public static final String SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES = "ignoreHTTPStatusErrCodes";
  @SerializedName(SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES)
  private Boolean ignoreHTTPStatusErrCodes;

  public static final String SERIALIZED_NAME_INITIAL_COOKIES = "initialCookies";
  @SerializedName(SERIALIZED_NAME_INITIAL_COOKIES)
  private List<InitialCookie> initialCookies = new ArrayList<>();

  public static final String SERIALIZED_NAME_OFFSETX = "offsetx";
  @SerializedName(SERIALIZED_NAME_OFFSETX)
  private Integer offsetx = 0;

  public static final String SERIALIZED_NAME_OFFSETY = "offsety";
  @SerializedName(SERIALIZED_NAME_OFFSETY)
  private Integer offsety = 0;

  /**
   * If set to _file_, the resulted screenshot is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, web site screenshot is returned in the response body.
   */
  @JsonAdapter(OutputEnum.Adapter.class)
  public enum OutputEnum {
    BUFFER("buffer"),
    
    FILE("file");

    private String value;

    OutputEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputEnum fromValue(String value) {
      for (OutputEnum b : OutputEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutputEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutputEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OutputEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private OutputEnum output = OutputEnum.BUFFER;

  public static final String SERIALIZED_NAME_PRINT_BACKGROUND = "printBackground";
  @SerializedName(SERIALIZED_NAME_PRINT_BACKGROUND)
  private Boolean printBackground = false;

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private String proxy;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality = 80;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private BigDecimal scale = new BigDecimal("1");

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WAIT_DELAY = "waitDelay";
  @SerializedName(SERIALIZED_NAME_WAIT_DELAY)
  private BigDecimal waitDelay = new BigDecimal("0.5");

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width = 800;

  public Url2screenshotrequest() {
  }

  public Url2screenshotrequest actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Url2screenshotrequest addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Use actions to automate manual workflows while rendering web pages. They simulate real-world human interaction with pages.
   * @return actions
   */
  @javax.annotation.Nullable
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }


  public Url2screenshotrequest clipSelector(String clipSelector) {
    this.clipSelector = clipSelector;
    return this;
  }

  /**
   * Captures a screenshot of specified CSS element on a web page.
   * @return clipSelector
   */
  @javax.annotation.Nullable
  public String getClipSelector() {
    return clipSelector;
  }

  public void setClipSelector(String clipSelector) {
    this.clipSelector = clipSelector;
  }


  public Url2screenshotrequest format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Sets the Format of output image
   * @return format
   */
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public Url2screenshotrequest fullPage(Boolean fullPage) {
    this.fullPage = fullPage;
    return this;
  }

  /**
   * takes a screenshot of a full web page. It ignores offsetX, offsety, width and height argument values.
   * @return fullPage
   */
  @javax.annotation.Nullable
  public Boolean getFullPage() {
    return fullPage;
  }

  public void setFullPage(Boolean fullPage) {
    this.fullPage = fullPage;
  }


  public Url2screenshotrequest height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Rectangle height in device independent pixels (dip).
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  public Url2screenshotrequest ignoreHTTPStatusErrCodes(Boolean ignoreHTTPStatusErrCodes) {
    this.ignoreHTTPStatusErrCodes = ignoreHTTPStatusErrCodes;
    return this;
  }

  /**
   * The HTTP 200 OK success status response code indicates that the request has succeeded. Sometimes a server returns normal HTML content even with an erroneous Non-200 HTTP response status code. The IgnoreHTTPStatusCode option is useful when you need to force the return of HTML content. Defaults to \&quot;false.\&quot;
   * @return ignoreHTTPStatusErrCodes
   */
  @javax.annotation.Nullable
  public Boolean getIgnoreHTTPStatusErrCodes() {
    return ignoreHTTPStatusErrCodes;
  }

  public void setIgnoreHTTPStatusErrCodes(Boolean ignoreHTTPStatusErrCodes) {
    this.ignoreHTTPStatusErrCodes = ignoreHTTPStatusErrCodes;
  }


  public Url2screenshotrequest initialCookies(List<InitialCookie> initialCookies) {
    this.initialCookies = initialCookies;
    return this;
  }

  public Url2screenshotrequest addInitialCookiesItem(InitialCookie initialCookiesItem) {
    if (this.initialCookies == null) {
      this.initialCookies = new ArrayList<>();
    }
    this.initialCookies.add(initialCookiesItem);
    return this;
  }

  /**
   * The \&quot;Initial Cookies\&quot; option is useful for crawling websites that require a login. The simplest solution to get an array of cookies for specific websites is to use a web browser \&quot;EditThisCookie\&quot; extension. Copy a cookie array with \&quot;EditThisCookie\&quot; and paste it into the \&quot;Initial cookie\&quot; field.
   * @return initialCookies
   */
  @javax.annotation.Nullable
  public List<InitialCookie> getInitialCookies() {
    return initialCookies;
  }

  public void setInitialCookies(List<InitialCookie> initialCookies) {
    this.initialCookies = initialCookies;
  }


  public Url2screenshotrequest offsetx(Integer offsetx) {
    this.offsetx = offsetx;
    return this;
  }

  /**
   * X offset in device independent pixels (dip).
   * @return offsetx
   */
  @javax.annotation.Nullable
  public Integer getOffsetx() {
    return offsetx;
  }

  public void setOffsetx(Integer offsetx) {
    this.offsetx = offsetx;
  }


  public Url2screenshotrequest offsety(Integer offsety) {
    this.offsety = offsety;
    return this;
  }

  /**
   * Y offset in device independent pixels (dip).
   * @return offsety
   */
  @javax.annotation.Nullable
  public Integer getOffsety() {
    return offsety;
  }

  public void setOffsety(Integer offsety) {
    this.offsety = offsety;
  }


  public Url2screenshotrequest output(OutputEnum output) {
    this.output = output;
    return this;
  }

  /**
   * If set to _file_, the resulted screenshot is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, web site screenshot is returned in the response body.
   * @return output
   */
  @javax.annotation.Nullable
  public OutputEnum getOutput() {
    return output;
  }

  public void setOutput(OutputEnum output) {
    this.output = output;
  }


  public Url2screenshotrequest printBackground(Boolean printBackground) {
    this.printBackground = printBackground;
    return this;
  }

  /**
   * Print background graphics in the PDF.
   * @return printBackground
   */
  @javax.annotation.Nullable
  public Boolean getPrintBackground() {
    return printBackground;
  }

  public void setPrintBackground(Boolean printBackground) {
    this.printBackground = printBackground;
  }


  public Url2screenshotrequest proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }

  /**
   * Specify proxy by adding [country ISO code](https://en.wikipedia.org/wiki/ISO_3166-2) to &#x60;country-&#x60; value to send requests through a proxy in the specified country. Use &#x60;country-any&#x60; to use random geo-targets.
   * @return proxy
   */
  @javax.annotation.Nullable
  public String getProxy() {
    return proxy;
  }

  public void setProxy(String proxy) {
    this.proxy = proxy;
  }


  public Url2screenshotrequest quality(Integer quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Sets the Quality of output image. Compression quality from range [0..100] (jpeg only).
   * @return quality
   */
  @javax.annotation.Nullable
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public Url2screenshotrequest scale(BigDecimal scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Image scale factor. range [0.1 .. 3]
   * @return scale
   */
  @javax.annotation.Nullable
  public BigDecimal getScale() {
    return scale;
  }

  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }


  public Url2screenshotrequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The full URL address (including HTTP/HTTPS) of a web page that you want to capture
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Url2screenshotrequest waitDelay(BigDecimal waitDelay) {
    this.waitDelay = waitDelay;
    return this;
  }

  /**
   * Specify a wait delay (in seconds). This may be useful if certain elements of the web site need to be rendered after the initial page load.
   * @return waitDelay
   */
  @javax.annotation.Nullable
  public BigDecimal getWaitDelay() {
    return waitDelay;
  }

  public void setWaitDelay(BigDecimal waitDelay) {
    this.waitDelay = waitDelay;
  }


  public Url2screenshotrequest width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Rectangle width in device independent pixels (dip).
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Url2screenshotrequest url2screenshotrequest = (Url2screenshotrequest) o;
    return Objects.equals(this.actions, url2screenshotrequest.actions) &&
        Objects.equals(this.clipSelector, url2screenshotrequest.clipSelector) &&
        Objects.equals(this.format, url2screenshotrequest.format) &&
        Objects.equals(this.fullPage, url2screenshotrequest.fullPage) &&
        Objects.equals(this.height, url2screenshotrequest.height) &&
        Objects.equals(this.ignoreHTTPStatusErrCodes, url2screenshotrequest.ignoreHTTPStatusErrCodes) &&
        Objects.equals(this.initialCookies, url2screenshotrequest.initialCookies) &&
        Objects.equals(this.offsetx, url2screenshotrequest.offsetx) &&
        Objects.equals(this.offsety, url2screenshotrequest.offsety) &&
        Objects.equals(this.output, url2screenshotrequest.output) &&
        Objects.equals(this.printBackground, url2screenshotrequest.printBackground) &&
        Objects.equals(this.proxy, url2screenshotrequest.proxy) &&
        Objects.equals(this.quality, url2screenshotrequest.quality) &&
        Objects.equals(this.scale, url2screenshotrequest.scale) &&
        Objects.equals(this.url, url2screenshotrequest.url) &&
        Objects.equals(this.waitDelay, url2screenshotrequest.waitDelay) &&
        Objects.equals(this.width, url2screenshotrequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, clipSelector, format, fullPage, height, ignoreHTTPStatusErrCodes, initialCookies, offsetx, offsety, output, printBackground, proxy, quality, scale, url, waitDelay, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url2screenshotrequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    clipSelector: ").append(toIndentedString(clipSelector)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    fullPage: ").append(toIndentedString(fullPage)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    ignoreHTTPStatusErrCodes: ").append(toIndentedString(ignoreHTTPStatusErrCodes)).append("\n");
    sb.append("    initialCookies: ").append(toIndentedString(initialCookies)).append("\n");
    sb.append("    offsetx: ").append(toIndentedString(offsetx)).append("\n");
    sb.append("    offsety: ").append(toIndentedString(offsety)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    printBackground: ").append(toIndentedString(printBackground)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    waitDelay: ").append(toIndentedString(waitDelay)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("clipSelector");
    openapiFields.add("format");
    openapiFields.add("fullPage");
    openapiFields.add("height");
    openapiFields.add("ignoreHTTPStatusErrCodes");
    openapiFields.add("initialCookies");
    openapiFields.add("offsetx");
    openapiFields.add("offsety");
    openapiFields.add("output");
    openapiFields.add("printBackground");
    openapiFields.add("proxy");
    openapiFields.add("quality");
    openapiFields.add("scale");
    openapiFields.add("url");
    openapiFields.add("waitDelay");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Url2screenshotrequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Url2screenshotrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Url2screenshotrequest is not found in the empty JSON string", Url2screenshotrequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Url2screenshotrequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Url2screenshotrequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Url2screenshotrequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            Action.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      if ((jsonObj.get("clipSelector") != null && !jsonObj.get("clipSelector").isJsonNull()) && !jsonObj.get("clipSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clipSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clipSelector").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      if (jsonObj.get("initialCookies") != null && !jsonObj.get("initialCookies").isJsonNull()) {
        JsonArray jsonArrayinitialCookies = jsonObj.getAsJsonArray("initialCookies");
        if (jsonArrayinitialCookies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("initialCookies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `initialCookies` to be an array in the JSON string but got `%s`", jsonObj.get("initialCookies").toString()));
          }

          // validate the optional field `initialCookies` (array)
          for (int i = 0; i < jsonArrayinitialCookies.size(); i++) {
            InitialCookie.validateJsonElement(jsonArrayinitialCookies.get(i));
          };
        }
      }
      if ((jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull()) && !jsonObj.get("output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
      // validate the optional field `output`
      if (jsonObj.get("output") != null && !jsonObj.get("output").isJsonNull()) {
        OutputEnum.validateJsonElement(jsonObj.get("output"));
      }
      if ((jsonObj.get("proxy") != null && !jsonObj.get("proxy").isJsonNull()) && !jsonObj.get("proxy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxy").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Url2screenshotrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Url2screenshotrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Url2screenshotrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Url2screenshotrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Url2screenshotrequest>() {
           @Override
           public void write(JsonWriter out, Url2screenshotrequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Url2screenshotrequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Url2screenshotrequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Url2screenshotrequest
   * @throws IOException if the JSON string is invalid with respect to Url2screenshotrequest
   */
  public static Url2screenshotrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Url2screenshotrequest.class);
  }

  /**
   * Convert an instance of Url2screenshotrequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

