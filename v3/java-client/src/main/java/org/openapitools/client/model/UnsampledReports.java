/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
 *
 * The version of the OpenAPI document: v3
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UnsampledReport;

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
 * An unsampled report collection lists Analytics unsampled reports to which the user has access. Each view (profile) can have a set of unsampled reports. Each resource in the unsampled report collection corresponds to a single Analytics unsampled report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:26.696972-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UnsampledReports {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<UnsampledReport> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "itemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "analytics#unsampledReports";

  public static final String SERIALIZED_NAME_NEXT_LINK = "nextLink";
  @SerializedName(SERIALIZED_NAME_NEXT_LINK)
  private String nextLink;

  public static final String SERIALIZED_NAME_PREVIOUS_LINK = "previousLink";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_LINK)
  private String previousLink;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "totalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS)
  private Integer totalResults;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public UnsampledReports() {
  }

  public UnsampledReports items(List<UnsampledReport> items) {
    this.items = items;
    return this;
  }

  public UnsampledReports addItemsItem(UnsampledReport itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of unsampled reports.
   * @return items
   */
  @javax.annotation.Nullable
  public List<UnsampledReport> getItems() {
    return items;
  }

  public void setItems(List<UnsampledReport> items) {
    this.items = items;
  }


  public UnsampledReports itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter.
   * @return itemsPerPage
   */
  @javax.annotation.Nullable
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public UnsampledReports kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Collection type.
   * @return kind
   */
  @javax.annotation.Nullable
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public UnsampledReports nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Link to next page for this unsampled report collection.
   * @return nextLink
   */
  @javax.annotation.Nullable
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  public UnsampledReports previousLink(String previousLink) {
    this.previousLink = previousLink;
    return this;
  }

  /**
   * Link to previous page for this unsampled report collection.
   * @return previousLink
   */
  @javax.annotation.Nullable
  public String getPreviousLink() {
    return previousLink;
  }

  public void setPreviousLink(String previousLink) {
    this.previousLink = previousLink;
  }


  public UnsampledReports startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter.
   * @return startIndex
   */
  @javax.annotation.Nullable
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public UnsampledReports totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * The total number of results for the query, regardless of the number of resources in the result.
   * @return totalResults
   */
  @javax.annotation.Nullable
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public UnsampledReports username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Email ID of the authenticated user
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsampledReports unsampledReports = (UnsampledReports) o;
    return Objects.equals(this.items, unsampledReports.items) &&
        Objects.equals(this.itemsPerPage, unsampledReports.itemsPerPage) &&
        Objects.equals(this.kind, unsampledReports.kind) &&
        Objects.equals(this.nextLink, unsampledReports.nextLink) &&
        Objects.equals(this.previousLink, unsampledReports.previousLink) &&
        Objects.equals(this.startIndex, unsampledReports.startIndex) &&
        Objects.equals(this.totalResults, unsampledReports.totalResults) &&
        Objects.equals(this.username, unsampledReports.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, itemsPerPage, kind, nextLink, previousLink, startIndex, totalResults, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsampledReports {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    previousLink: ").append(toIndentedString(previousLink)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("itemsPerPage");
    openapiFields.add("kind");
    openapiFields.add("nextLink");
    openapiFields.add("previousLink");
    openapiFields.add("startIndex");
    openapiFields.add("totalResults");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UnsampledReports
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnsampledReports.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnsampledReports is not found in the empty JSON string", UnsampledReports.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnsampledReports.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnsampledReports` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            UnsampledReport.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("nextLink") != null && !jsonObj.get("nextLink").isJsonNull()) && !jsonObj.get("nextLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextLink").toString()));
      }
      if ((jsonObj.get("previousLink") != null && !jsonObj.get("previousLink").isJsonNull()) && !jsonObj.get("previousLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousLink").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnsampledReports.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnsampledReports' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnsampledReports> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnsampledReports.class));

       return (TypeAdapter<T>) new TypeAdapter<UnsampledReports>() {
           @Override
           public void write(JsonWriter out, UnsampledReports value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnsampledReports read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UnsampledReports given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnsampledReports
   * @throws IOException if the JSON string is invalid with respect to UnsampledReports
   */
  public static UnsampledReports fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnsampledReports.class);
  }

  /**
   * Convert an instance of UnsampledReports to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

