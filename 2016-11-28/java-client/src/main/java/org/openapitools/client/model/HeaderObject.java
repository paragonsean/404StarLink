/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
 * Contact: mike.ralphson@gmail.com
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
import java.util.List;
import org.openapitools.client.model.ForwardValues;

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
 * &lt;p&gt;Describes the request headers that a Lightsail distribution bases caching on.&lt;/p&gt; &lt;p&gt;For the headers that you specify, your distribution caches separate versions of the specified content based on the header values in viewer requests. For example, suppose viewer requests for &lt;code&gt;logo.jpg&lt;/code&gt; contain a custom &lt;code&gt;product&lt;/code&gt; header that has a value of either &lt;code&gt;acme&lt;/code&gt; or &lt;code&gt;apex&lt;/code&gt;, and you configure your distribution to cache your content based on values in the &lt;code&gt;product&lt;/code&gt; header. Your distribution forwards the &lt;code&gt;product&lt;/code&gt; header to the origin and caches the response from the origin once for each header value. &lt;/p&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HeaderObject {
  public static final String SERIALIZED_NAME_OPTION = "option";
  @SerializedName(SERIALIZED_NAME_OPTION)
  private ForwardValues option;

  public static final String SERIALIZED_NAME_HEADERS_ALLOW_LIST = "headersAllowList";
  @SerializedName(SERIALIZED_NAME_HEADERS_ALLOW_LIST)
  private List headersAllowList;

  public HeaderObject() {
  }

  public HeaderObject option(ForwardValues option) {
    this.option = option;
    return this;
  }

  /**
   * Get option
   * @return option
   */
  @javax.annotation.Nullable
  public ForwardValues getOption() {
    return option;
  }

  public void setOption(ForwardValues option) {
    this.option = option;
  }


  public HeaderObject headersAllowList(List headersAllowList) {
    this.headersAllowList = headersAllowList;
    return this;
  }

  /**
   * Get headersAllowList
   * @return headersAllowList
   */
  @javax.annotation.Nullable
  public List getHeadersAllowList() {
    return headersAllowList;
  }

  public void setHeadersAllowList(List headersAllowList) {
    this.headersAllowList = headersAllowList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderObject headerObject = (HeaderObject) o;
    return Objects.equals(this.option, headerObject.option) &&
        Objects.equals(this.headersAllowList, headerObject.headersAllowList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, headersAllowList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderObject {\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    headersAllowList: ").append(toIndentedString(headersAllowList)).append("\n");
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
    openapiFields.add("option");
    openapiFields.add("headersAllowList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HeaderObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HeaderObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HeaderObject is not found in the empty JSON string", HeaderObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HeaderObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HeaderObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `option`
      if (jsonObj.get("option") != null && !jsonObj.get("option").isJsonNull()) {
        ForwardValues.validateJsonElement(jsonObj.get("option"));
      }
      // validate the optional field `headersAllowList`
      if (jsonObj.get("headersAllowList") != null && !jsonObj.get("headersAllowList").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("headersAllowList"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HeaderObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HeaderObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HeaderObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HeaderObject.class));

       return (TypeAdapter<T>) new TypeAdapter<HeaderObject>() {
           @Override
           public void write(JsonWriter out, HeaderObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HeaderObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HeaderObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HeaderObject
   * @throws IOException if the JSON string is invalid with respect to HeaderObject
   */
  public static HeaderObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HeaderObject.class);
  }

  /**
   * Convert an instance of HeaderObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

