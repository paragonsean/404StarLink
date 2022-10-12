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
 * Url2pdfrequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:22.777626-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Url2pdfrequest {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES = "ignoreHTTPStatusErrCodes";
  @SerializedName(SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES)
  private Boolean ignoreHTTPStatusErrCodes;

  public static final String SERIALIZED_NAME_INITIAL_COOKIES = "initialCookies";
  @SerializedName(SERIALIZED_NAME_INITIAL_COOKIES)
  private List<InitialCookie> initialCookies = new ArrayList<>();

  public static final String SERIALIZED_NAME_LANDSCAPE = "landscape";
  @SerializedName(SERIALIZED_NAME_LANDSCAPE)
  private Boolean landscape = false;

  public static final String SERIALIZED_NAME_MARGIN_BOTTOM = "marginBottom";
  @SerializedName(SERIALIZED_NAME_MARGIN_BOTTOM)
  private BigDecimal marginBottom = new BigDecimal("0.4");

  public static final String SERIALIZED_NAME_MARGIN_LEFT = "marginLeft";
  @SerializedName(SERIALIZED_NAME_MARGIN_LEFT)
  private BigDecimal marginLeft = new BigDecimal("0.4");

  public static final String SERIALIZED_NAME_MARGIN_RIGHT = "marginRight";
  @SerializedName(SERIALIZED_NAME_MARGIN_RIGHT)
  private BigDecimal marginRight = new BigDecimal("0.4");

  public static final String SERIALIZED_NAME_MARGIN_TOP = "marginTop";
  @SerializedName(SERIALIZED_NAME_MARGIN_TOP)
  private BigDecimal marginTop = new BigDecimal("0.4");

  /**
   * If set to _file_, the resulted PDF is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, PDF content is returned in the response body.
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

  public static final String SERIALIZED_NAME_PAGE_RANGES = "pageRanges";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGES)
  private String pageRanges;

  /**
   * Page size parameter consists of the most popular page formats.
   */
  @JsonAdapter(PaperSizeEnum.Adapter.class)
  public enum PaperSizeEnum {
    A3("A3"),
    
    A4("A4"),
    
    A5("A5"),
    
    A6("A6"),
    
    LETTER("Letter"),
    
    LEGAL("Legal"),
    
    TABLOID("Tabloid");

    private String value;

    PaperSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaperSizeEnum fromValue(String value) {
      for (PaperSizeEnum b : PaperSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaperSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaperSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaperSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaperSizeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PaperSizeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAPER_SIZE = "paperSize";
  @SerializedName(SERIALIZED_NAME_PAPER_SIZE)
  private PaperSizeEnum paperSize = PaperSizeEnum.A4;

  public static final String SERIALIZED_NAME_PRINT_BACKGROUND = "printBackground";
  @SerializedName(SERIALIZED_NAME_PRINT_BACKGROUND)
  private Boolean printBackground = false;

  public static final String SERIALIZED_NAME_PRINT_HEADER_FOOTER = "printHeaderFooter";
  @SerializedName(SERIALIZED_NAME_PRINT_HEADER_FOOTER)
  private Boolean printHeaderFooter = false;

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private String proxy;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private BigDecimal scale = new BigDecimal("1");

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WAIT_DELAY = "waitDelay";
  @SerializedName(SERIALIZED_NAME_WAIT_DELAY)
  private BigDecimal waitDelay = new BigDecimal("0.5");

  public Url2pdfrequest() {
  }

  public Url2pdfrequest actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Url2pdfrequest addActionsItem(Action actionsItem) {
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


  public Url2pdfrequest ignoreHTTPStatusErrCodes(Boolean ignoreHTTPStatusErrCodes) {
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


  public Url2pdfrequest initialCookies(List<InitialCookie> initialCookies) {
    this.initialCookies = initialCookies;
    return this;
  }

  public Url2pdfrequest addInitialCookiesItem(InitialCookie initialCookiesItem) {
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


  public Url2pdfrequest landscape(Boolean landscape) {
    this.landscape = landscape;
    return this;
  }

  /**
   * Paper orientation. Parameter landscape &#x3D; false means portrait orientation. Set landscape to true for landscape page oriantation.
   * @return landscape
   */
  @javax.annotation.Nullable
  public Boolean getLandscape() {
    return landscape;
  }

  public void setLandscape(Boolean landscape) {
    this.landscape = landscape;
  }


  public Url2pdfrequest marginBottom(BigDecimal marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  /**
   * Bottom Margin of the PDF (in inches)
   * @return marginBottom
   */
  @javax.annotation.Nullable
  public BigDecimal getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(BigDecimal marginBottom) {
    this.marginBottom = marginBottom;
  }


  public Url2pdfrequest marginLeft(BigDecimal marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

  /**
   * Left Margin of the PDF (in inches)
   * @return marginLeft
   */
  @javax.annotation.Nullable
  public BigDecimal getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(BigDecimal marginLeft) {
    this.marginLeft = marginLeft;
  }


  public Url2pdfrequest marginRight(BigDecimal marginRight) {
    this.marginRight = marginRight;
    return this;
  }

  /**
   * Right Margin of the PDF (in inches)
   * @return marginRight
   */
  @javax.annotation.Nullable
  public BigDecimal getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(BigDecimal marginRight) {
    this.marginRight = marginRight;
  }


  public Url2pdfrequest marginTop(BigDecimal marginTop) {
    this.marginTop = marginTop;
    return this;
  }

  /**
   * Top Margin of the PDF (in inches)
   * @return marginTop
   */
  @javax.annotation.Nullable
  public BigDecimal getMarginTop() {
    return marginTop;
  }

  public void setMarginTop(BigDecimal marginTop) {
    this.marginTop = marginTop;
  }


  public Url2pdfrequest output(OutputEnum output) {
    this.output = output;
    return this;
  }

  /**
   * If set to _file_, the resulted PDF is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, PDF content is returned in the response body.
   * @return output
   */
  @javax.annotation.Nullable
  public OutputEnum getOutput() {
    return output;
  }

  public void setOutput(OutputEnum output) {
    this.output = output;
  }


  public Url2pdfrequest pageRanges(String pageRanges) {
    this.pageRanges = pageRanges;
    return this;
  }

  /**
   * Specify page ranges to convert. Defaults to the empty value, which means convert all pages.
   * @return pageRanges
   */
  @javax.annotation.Nullable
  public String getPageRanges() {
    return pageRanges;
  }

  public void setPageRanges(String pageRanges) {
    this.pageRanges = pageRanges;
  }


  public Url2pdfrequest paperSize(PaperSizeEnum paperSize) {
    this.paperSize = paperSize;
    return this;
  }

  /**
   * Page size parameter consists of the most popular page formats.
   * @return paperSize
   */
  @javax.annotation.Nullable
  public PaperSizeEnum getPaperSize() {
    return paperSize;
  }

  public void setPaperSize(PaperSizeEnum paperSize) {
    this.paperSize = paperSize;
  }


  public Url2pdfrequest printBackground(Boolean printBackground) {
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


  public Url2pdfrequest printHeaderFooter(Boolean printHeaderFooter) {
    this.printHeaderFooter = printHeaderFooter;
    return this;
  }

  /**
   * printHeaderFooter  parameter consists of the date, name of the web page, the page URL, and how many pages the document you are printing.
   * @return printHeaderFooter
   */
  @javax.annotation.Nullable
  public Boolean getPrintHeaderFooter() {
    return printHeaderFooter;
  }

  public void setPrintHeaderFooter(Boolean printHeaderFooter) {
    this.printHeaderFooter = printHeaderFooter;
  }


  public Url2pdfrequest proxy(String proxy) {
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


  public Url2pdfrequest scale(BigDecimal scale) {
    this.scale = scale;
    return this;
  }

  /**
   * By default, PDF document content is generated according to dimensions of the original web page content. Using the &#x60;scale&#x60; parameter, you can specify a custom zoom factor from 0.1 to 5.0 of the webpage rendering.
   * @return scale
   */
  @javax.annotation.Nullable
  public BigDecimal getScale() {
    return scale;
  }

  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }


  public Url2pdfrequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The full URL address (including HTTP/HTTPS) of a web page that you want to save as PDF
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Url2pdfrequest waitDelay(BigDecimal waitDelay) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Url2pdfrequest url2pdfrequest = (Url2pdfrequest) o;
    return Objects.equals(this.actions, url2pdfrequest.actions) &&
        Objects.equals(this.ignoreHTTPStatusErrCodes, url2pdfrequest.ignoreHTTPStatusErrCodes) &&
        Objects.equals(this.initialCookies, url2pdfrequest.initialCookies) &&
        Objects.equals(this.landscape, url2pdfrequest.landscape) &&
        Objects.equals(this.marginBottom, url2pdfrequest.marginBottom) &&
        Objects.equals(this.marginLeft, url2pdfrequest.marginLeft) &&
        Objects.equals(this.marginRight, url2pdfrequest.marginRight) &&
        Objects.equals(this.marginTop, url2pdfrequest.marginTop) &&
        Objects.equals(this.output, url2pdfrequest.output) &&
        Objects.equals(this.pageRanges, url2pdfrequest.pageRanges) &&
        Objects.equals(this.paperSize, url2pdfrequest.paperSize) &&
        Objects.equals(this.printBackground, url2pdfrequest.printBackground) &&
        Objects.equals(this.printHeaderFooter, url2pdfrequest.printHeaderFooter) &&
        Objects.equals(this.proxy, url2pdfrequest.proxy) &&
        Objects.equals(this.scale, url2pdfrequest.scale) &&
        Objects.equals(this.url, url2pdfrequest.url) &&
        Objects.equals(this.waitDelay, url2pdfrequest.waitDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, ignoreHTTPStatusErrCodes, initialCookies, landscape, marginBottom, marginLeft, marginRight, marginTop, output, pageRanges, paperSize, printBackground, printHeaderFooter, proxy, scale, url, waitDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url2pdfrequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    ignoreHTTPStatusErrCodes: ").append(toIndentedString(ignoreHTTPStatusErrCodes)).append("\n");
    sb.append("    initialCookies: ").append(toIndentedString(initialCookies)).append("\n");
    sb.append("    landscape: ").append(toIndentedString(landscape)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    pageRanges: ").append(toIndentedString(pageRanges)).append("\n");
    sb.append("    paperSize: ").append(toIndentedString(paperSize)).append("\n");
    sb.append("    printBackground: ").append(toIndentedString(printBackground)).append("\n");
    sb.append("    printHeaderFooter: ").append(toIndentedString(printHeaderFooter)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    waitDelay: ").append(toIndentedString(waitDelay)).append("\n");
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
    openapiFields.add("ignoreHTTPStatusErrCodes");
    openapiFields.add("initialCookies");
    openapiFields.add("landscape");
    openapiFields.add("marginBottom");
    openapiFields.add("marginLeft");
    openapiFields.add("marginRight");
    openapiFields.add("marginTop");
    openapiFields.add("output");
    openapiFields.add("pageRanges");
    openapiFields.add("paperSize");
    openapiFields.add("printBackground");
    openapiFields.add("printHeaderFooter");
    openapiFields.add("proxy");
    openapiFields.add("scale");
    openapiFields.add("url");
    openapiFields.add("waitDelay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Url2pdfrequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Url2pdfrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Url2pdfrequest is not found in the empty JSON string", Url2pdfrequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Url2pdfrequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Url2pdfrequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Url2pdfrequest.openapiRequiredFields) {
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
      if ((jsonObj.get("pageRanges") != null && !jsonObj.get("pageRanges").isJsonNull()) && !jsonObj.get("pageRanges").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageRanges` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageRanges").toString()));
      }
      if ((jsonObj.get("paperSize") != null && !jsonObj.get("paperSize").isJsonNull()) && !jsonObj.get("paperSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paperSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paperSize").toString()));
      }
      // validate the optional field `paperSize`
      if (jsonObj.get("paperSize") != null && !jsonObj.get("paperSize").isJsonNull()) {
        PaperSizeEnum.validateJsonElement(jsonObj.get("paperSize"));
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
       if (!Url2pdfrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Url2pdfrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Url2pdfrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Url2pdfrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Url2pdfrequest>() {
           @Override
           public void write(JsonWriter out, Url2pdfrequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Url2pdfrequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Url2pdfrequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Url2pdfrequest
   * @throws IOException if the JSON string is invalid with respect to Url2pdfrequest
   */
  public static Url2pdfrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Url2pdfrequest.class);
  }

  /**
   * Convert an instance of Url2pdfrequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

