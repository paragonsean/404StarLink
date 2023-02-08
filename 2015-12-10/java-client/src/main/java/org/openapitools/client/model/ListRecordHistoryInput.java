/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
import org.openapitools.client.model.ListProvisionedProductPlansInputAccessLevelFilter;
import org.openapitools.client.model.ListRecordHistoryInputSearchFilter;

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
 * ListRecordHistoryInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:38.024008-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListRecordHistoryInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_ACCESS_LEVEL_FILTER = "AccessLevelFilter";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL_FILTER)
  private ListProvisionedProductPlansInputAccessLevelFilter accessLevelFilter;

  public static final String SERIALIZED_NAME_SEARCH_FILTER = "SearchFilter";
  @SerializedName(SERIALIZED_NAME_SEARCH_FILTER)
  private ListRecordHistoryInputSearchFilter searchFilter;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "PageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "PageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public ListRecordHistoryInput() {
  }

  public ListRecordHistoryInput acceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
    return this;
  }

  /**
   * Get acceptLanguage
   * @return acceptLanguage
   */
  @javax.annotation.Nullable
  public String getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(String acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }


  public ListRecordHistoryInput accessLevelFilter(ListProvisionedProductPlansInputAccessLevelFilter accessLevelFilter) {
    this.accessLevelFilter = accessLevelFilter;
    return this;
  }

  /**
   * Get accessLevelFilter
   * @return accessLevelFilter
   */
  @javax.annotation.Nullable
  public ListProvisionedProductPlansInputAccessLevelFilter getAccessLevelFilter() {
    return accessLevelFilter;
  }

  public void setAccessLevelFilter(ListProvisionedProductPlansInputAccessLevelFilter accessLevelFilter) {
    this.accessLevelFilter = accessLevelFilter;
  }


  public ListRecordHistoryInput searchFilter(ListRecordHistoryInputSearchFilter searchFilter) {
    this.searchFilter = searchFilter;
    return this;
  }

  /**
   * Get searchFilter
   * @return searchFilter
   */
  @javax.annotation.Nullable
  public ListRecordHistoryInputSearchFilter getSearchFilter() {
    return searchFilter;
  }

  public void setSearchFilter(ListRecordHistoryInputSearchFilter searchFilter) {
    this.searchFilter = searchFilter;
  }


  public ListRecordHistoryInput pageSize(Integer pageSize) {
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


  public ListRecordHistoryInput pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRecordHistoryInput listRecordHistoryInput = (ListRecordHistoryInput) o;
    return Objects.equals(this.acceptLanguage, listRecordHistoryInput.acceptLanguage) &&
        Objects.equals(this.accessLevelFilter, listRecordHistoryInput.accessLevelFilter) &&
        Objects.equals(this.searchFilter, listRecordHistoryInput.searchFilter) &&
        Objects.equals(this.pageSize, listRecordHistoryInput.pageSize) &&
        Objects.equals(this.pageToken, listRecordHistoryInput.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, accessLevelFilter, searchFilter, pageSize, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRecordHistoryInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    accessLevelFilter: ").append(toIndentedString(accessLevelFilter)).append("\n");
    sb.append("    searchFilter: ").append(toIndentedString(searchFilter)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
    openapiFields.add("AcceptLanguage");
    openapiFields.add("AccessLevelFilter");
    openapiFields.add("SearchFilter");
    openapiFields.add("PageSize");
    openapiFields.add("PageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRecordHistoryInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRecordHistoryInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRecordHistoryInput is not found in the empty JSON string", ListRecordHistoryInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListRecordHistoryInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListRecordHistoryInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AcceptLanguage`
      if (jsonObj.get("AcceptLanguage") != null && !jsonObj.get("AcceptLanguage").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AcceptLanguage"));
      }
      // validate the optional field `AccessLevelFilter`
      if (jsonObj.get("AccessLevelFilter") != null && !jsonObj.get("AccessLevelFilter").isJsonNull()) {
        ListProvisionedProductPlansInputAccessLevelFilter.validateJsonElement(jsonObj.get("AccessLevelFilter"));
      }
      // validate the optional field `SearchFilter`
      if (jsonObj.get("SearchFilter") != null && !jsonObj.get("SearchFilter").isJsonNull()) {
        ListRecordHistoryInputSearchFilter.validateJsonElement(jsonObj.get("SearchFilter"));
      }
      // validate the optional field `PageSize`
      if (jsonObj.get("PageSize") != null && !jsonObj.get("PageSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("PageSize"));
      }
      // validate the optional field `PageToken`
      if (jsonObj.get("PageToken") != null && !jsonObj.get("PageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("PageToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRecordHistoryInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRecordHistoryInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRecordHistoryInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRecordHistoryInput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRecordHistoryInput>() {
           @Override
           public void write(JsonWriter out, ListRecordHistoryInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRecordHistoryInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRecordHistoryInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRecordHistoryInput
   * @throws IOException if the JSON string is invalid with respect to ListRecordHistoryInput
   */
  public static ListRecordHistoryInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRecordHistoryInput.class);
  }

  /**
   * Convert an instance of ListRecordHistoryInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

