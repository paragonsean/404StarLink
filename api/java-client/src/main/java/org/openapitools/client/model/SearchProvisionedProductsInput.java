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
import java.util.Map;
import org.openapitools.client.model.ListProvisionedProductPlansInputAccessLevelFilter;
import org.openapitools.client.model.SortOrder;

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
 * SearchProvisionedProductsInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:19.886360-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SearchProvisionedProductsInput {
  public static final String SERIALIZED_NAME_ACCEPT_LANGUAGE = "AcceptLanguage";
  @SerializedName(SERIALIZED_NAME_ACCEPT_LANGUAGE)
  private String acceptLanguage;

  public static final String SERIALIZED_NAME_ACCESS_LEVEL_FILTER = "AccessLevelFilter";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL_FILTER)
  private ListProvisionedProductPlansInputAccessLevelFilter accessLevelFilter;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map filters;

  public static final String SERIALIZED_NAME_SORT_BY = "SortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrder sortOrder;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "PageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "PageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public SearchProvisionedProductsInput() {
  }

  public SearchProvisionedProductsInput acceptLanguage(String acceptLanguage) {
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


  public SearchProvisionedProductsInput accessLevelFilter(ListProvisionedProductPlansInputAccessLevelFilter accessLevelFilter) {
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


  public SearchProvisionedProductsInput filters(Map filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @javax.annotation.Nullable
  public Map getFilters() {
    return filters;
  }

  public void setFilters(Map filters) {
    this.filters = filters;
  }


  public SearchProvisionedProductsInput sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
   */
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public SearchProvisionedProductsInput sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
   */
  @javax.annotation.Nullable
  public SortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }


  public SearchProvisionedProductsInput pageSize(Integer pageSize) {
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


  public SearchProvisionedProductsInput pageToken(String pageToken) {
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
    SearchProvisionedProductsInput searchProvisionedProductsInput = (SearchProvisionedProductsInput) o;
    return Objects.equals(this.acceptLanguage, searchProvisionedProductsInput.acceptLanguage) &&
        Objects.equals(this.accessLevelFilter, searchProvisionedProductsInput.accessLevelFilter) &&
        Objects.equals(this.filters, searchProvisionedProductsInput.filters) &&
        Objects.equals(this.sortBy, searchProvisionedProductsInput.sortBy) &&
        Objects.equals(this.sortOrder, searchProvisionedProductsInput.sortOrder) &&
        Objects.equals(this.pageSize, searchProvisionedProductsInput.pageSize) &&
        Objects.equals(this.pageToken, searchProvisionedProductsInput.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptLanguage, accessLevelFilter, filters, sortBy, sortOrder, pageSize, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchProvisionedProductsInput {\n");
    sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
    sb.append("    accessLevelFilter: ").append(toIndentedString(accessLevelFilter)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
    openapiFields.add("Filters");
    openapiFields.add("SortBy");
    openapiFields.add("SortOrder");
    openapiFields.add("PageSize");
    openapiFields.add("PageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchProvisionedProductsInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchProvisionedProductsInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchProvisionedProductsInput is not found in the empty JSON string", SearchProvisionedProductsInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchProvisionedProductsInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchProvisionedProductsInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `Filters`
      if (jsonObj.get("Filters") != null && !jsonObj.get("Filters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("Filters"));
      }
      // validate the optional field `SortBy`
      if (jsonObj.get("SortBy") != null && !jsonObj.get("SortBy").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SortBy"));
      }
      // validate the optional field `SortOrder`
      if (jsonObj.get("SortOrder") != null && !jsonObj.get("SortOrder").isJsonNull()) {
        SortOrder.validateJsonElement(jsonObj.get("SortOrder"));
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
       if (!SearchProvisionedProductsInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchProvisionedProductsInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchProvisionedProductsInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchProvisionedProductsInput.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchProvisionedProductsInput>() {
           @Override
           public void write(JsonWriter out, SearchProvisionedProductsInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchProvisionedProductsInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchProvisionedProductsInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchProvisionedProductsInput
   * @throws IOException if the JSON string is invalid with respect to SearchProvisionedProductsInput
   */
  public static SearchProvisionedProductsInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchProvisionedProductsInput.class);
  }

  /**
   * Convert an instance of SearchProvisionedProductsInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

