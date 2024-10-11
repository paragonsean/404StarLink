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
 * Fetchrequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:20.015134-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Fetchrequest {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES = "ignoreHTTPStatusErrCodes";
  @SerializedName(SERIALIZED_NAME_IGNORE_H_T_T_P_STATUS_ERR_CODES)
  private Boolean ignoreHTTPStatusErrCodes;

  public static final String SERIALIZED_NAME_INITIAL_COOKIES = "initialCookies";
  @SerializedName(SERIALIZED_NAME_INITIAL_COOKIES)
  private List<InitialCookie> initialCookies = new ArrayList<>();

  /**
   * If set to _file_, the content of downloaded HTML is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, downloaded content is returned in the response body.
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

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private String proxy;

  /**
   * If set to &#x60;base&#x60;, the Base fetcher is used for downloading web page content. Use &#x60;chrome&#x60; for fetching content with a Headless chrome browser. If omitted &#x60;base&#x60; fetcher is used by default.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BASE("base"),
    
    CHROME("chrome");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WAIT_DELAY = "waitDelay";
  @SerializedName(SERIALIZED_NAME_WAIT_DELAY)
  private BigDecimal waitDelay;

  public Fetchrequest() {
  }

  public Fetchrequest actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public Fetchrequest addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Use actions to automate manual workflows while rendering web pages. They simulate real-world human interaction with pages. _(Chrome fetcher type only)_
   * @return actions
   */
  @javax.annotation.Nullable
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }


  public Fetchrequest ignoreHTTPStatusErrCodes(Boolean ignoreHTTPStatusErrCodes) {
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


  public Fetchrequest initialCookies(List<InitialCookie> initialCookies) {
    this.initialCookies = initialCookies;
    return this;
  }

  public Fetchrequest addInitialCookiesItem(InitialCookie initialCookiesItem) {
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


  public Fetchrequest output(OutputEnum output) {
    this.output = output;
    return this;
  }

  /**
   * If set to _file_, the content of downloaded HTML is uploaded to Dataflow Kit Storage first. Then the link to this file is returned. Overwise, downloaded content is returned in the response body.
   * @return output
   */
  @javax.annotation.Nullable
  public OutputEnum getOutput() {
    return output;
  }

  public void setOutput(OutputEnum output) {
    this.output = output;
  }


  public Fetchrequest proxy(String proxy) {
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


  public Fetchrequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * If set to &#x60;base&#x60;, the Base fetcher is used for downloading web page content. Use &#x60;chrome&#x60; for fetching content with a Headless chrome browser. If omitted &#x60;base&#x60; fetcher is used by default.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Fetchrequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Specify URL to download.
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Fetchrequest waitDelay(BigDecimal waitDelay) {
    this.waitDelay = waitDelay;
    return this;
  }

  /**
   * Specify a wait delay (in seconds). This may be useful if certain elements of the web site need to be rendered after the initial page load. _(Chrome fetcher type only)_
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
    Fetchrequest fetchrequest = (Fetchrequest) o;
    return Objects.equals(this.actions, fetchrequest.actions) &&
        Objects.equals(this.ignoreHTTPStatusErrCodes, fetchrequest.ignoreHTTPStatusErrCodes) &&
        Objects.equals(this.initialCookies, fetchrequest.initialCookies) &&
        Objects.equals(this.output, fetchrequest.output) &&
        Objects.equals(this.proxy, fetchrequest.proxy) &&
        Objects.equals(this.type, fetchrequest.type) &&
        Objects.equals(this.url, fetchrequest.url) &&
        Objects.equals(this.waitDelay, fetchrequest.waitDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, ignoreHTTPStatusErrCodes, initialCookies, output, proxy, type, url, waitDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fetchrequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    ignoreHTTPStatusErrCodes: ").append(toIndentedString(ignoreHTTPStatusErrCodes)).append("\n");
    sb.append("    initialCookies: ").append(toIndentedString(initialCookies)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("output");
    openapiFields.add("proxy");
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("waitDelay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Fetchrequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Fetchrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Fetchrequest is not found in the empty JSON string", Fetchrequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Fetchrequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Fetchrequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Fetchrequest.openapiRequiredFields) {
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
      if ((jsonObj.get("proxy") != null && !jsonObj.get("proxy").isJsonNull()) && !jsonObj.get("proxy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxy").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Fetchrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Fetchrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Fetchrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Fetchrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Fetchrequest>() {
           @Override
           public void write(JsonWriter out, Fetchrequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Fetchrequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Fetchrequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Fetchrequest
   * @throws IOException if the JSON string is invalid with respect to Fetchrequest
   */
  public static Fetchrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Fetchrequest.class);
  }

  /**
   * Convert an instance of Fetchrequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

