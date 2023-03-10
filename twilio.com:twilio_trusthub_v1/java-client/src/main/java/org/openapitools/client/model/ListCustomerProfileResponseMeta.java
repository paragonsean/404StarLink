/*
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ListCustomerProfileResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:03.855054-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListCustomerProfileResponseMeta {
  public static final String SERIALIZED_NAME_FIRST_PAGE_URL = "first_page_url";
  @SerializedName(SERIALIZED_NAME_FIRST_PAGE_URL)
  private URI firstPageUrl;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NEXT_PAGE_URL = "next_page_url";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_URL)
  private URI nextPageUrl;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE_URL = "previous_page_url";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE_URL)
  private URI previousPageUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public ListCustomerProfileResponseMeta() {
  }

  public ListCustomerProfileResponseMeta firstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
    return this;
  }

  /**
   * Get firstPageUrl
   * @return firstPageUrl
   */
  @javax.annotation.Nullable
  public URI getFirstPageUrl() {
    return firstPageUrl;
  }

  public void setFirstPageUrl(URI firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
  }


  public ListCustomerProfileResponseMeta key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public ListCustomerProfileResponseMeta nextPageUrl(URI nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
    return this;
  }

  /**
   * Get nextPageUrl
   * @return nextPageUrl
   */
  @javax.annotation.Nullable
  public URI getNextPageUrl() {
    return nextPageUrl;
  }

  public void setNextPageUrl(URI nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }


  public ListCustomerProfileResponseMeta page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public ListCustomerProfileResponseMeta pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ListCustomerProfileResponseMeta previousPageUrl(URI previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
    return this;
  }

  /**
   * Get previousPageUrl
   * @return previousPageUrl
   */
  @javax.annotation.Nullable
  public URI getPreviousPageUrl() {
    return previousPageUrl;
  }

  public void setPreviousPageUrl(URI previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  public ListCustomerProfileResponseMeta url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomerProfileResponseMeta listCustomerProfileResponseMeta = (ListCustomerProfileResponseMeta) o;
    return Objects.equals(this.firstPageUrl, listCustomerProfileResponseMeta.firstPageUrl) &&
        Objects.equals(this.key, listCustomerProfileResponseMeta.key) &&
        Objects.equals(this.nextPageUrl, listCustomerProfileResponseMeta.nextPageUrl) &&
        Objects.equals(this.page, listCustomerProfileResponseMeta.page) &&
        Objects.equals(this.pageSize, listCustomerProfileResponseMeta.pageSize) &&
        Objects.equals(this.previousPageUrl, listCustomerProfileResponseMeta.previousPageUrl) &&
        Objects.equals(this.url, listCustomerProfileResponseMeta.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPageUrl, key, nextPageUrl, page, pageSize, previousPageUrl, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomerProfileResponseMeta {\n");
    sb.append("    firstPageUrl: ").append(toIndentedString(firstPageUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    nextPageUrl: ").append(toIndentedString(nextPageUrl)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    previousPageUrl: ").append(toIndentedString(previousPageUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("first_page_url");
    openapiFields.add("key");
    openapiFields.add("next_page_url");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("previous_page_url");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListCustomerProfileResponseMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCustomerProfileResponseMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCustomerProfileResponseMeta is not found in the empty JSON string", ListCustomerProfileResponseMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCustomerProfileResponseMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCustomerProfileResponseMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("first_page_url") != null && !jsonObj.get("first_page_url").isJsonNull()) && !jsonObj.get("first_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_page_url").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("next_page_url") != null && !jsonObj.get("next_page_url").isJsonNull()) && !jsonObj.get("next_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page_url").toString()));
      }
      if ((jsonObj.get("previous_page_url") != null && !jsonObj.get("previous_page_url").isJsonNull()) && !jsonObj.get("previous_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_page_url").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCustomerProfileResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCustomerProfileResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCustomerProfileResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCustomerProfileResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCustomerProfileResponseMeta>() {
           @Override
           public void write(JsonWriter out, ListCustomerProfileResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCustomerProfileResponseMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListCustomerProfileResponseMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCustomerProfileResponseMeta
   * @throws IOException if the JSON string is invalid with respect to ListCustomerProfileResponseMeta
   */
  public static ListCustomerProfileResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCustomerProfileResponseMeta.class);
  }

  /**
   * Convert an instance of ListCustomerProfileResponseMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

