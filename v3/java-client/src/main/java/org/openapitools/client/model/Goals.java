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
import org.openapitools.client.model.Goal;

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
 * A goal collection lists Analytics goals to which the user has access. Each view (profile) can have a set of goals. Each resource in the Goal collection corresponds to a single Analytics goal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Goals {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Goal> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "itemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "analytics#goals";

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

  public Goals() {
  }

  public Goals items(List<Goal> items) {
    this.items = items;
    return this;
  }

  public Goals addItemsItem(Goal itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of goals.
   * @return items
   */
  @javax.annotation.Nullable
  public List<Goal> getItems() {
    return items;
  }

  public void setItems(List<Goal> items) {
    this.items = items;
  }


  public Goals itemsPerPage(Integer itemsPerPage) {
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


  public Goals kind(String kind) {
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


  public Goals nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Link to next page for this goal collection.
   * @return nextLink
   */
  @javax.annotation.Nullable
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  public Goals previousLink(String previousLink) {
    this.previousLink = previousLink;
    return this;
  }

  /**
   * Link to previous page for this goal collection.
   * @return previousLink
   */
  @javax.annotation.Nullable
  public String getPreviousLink() {
    return previousLink;
  }

  public void setPreviousLink(String previousLink) {
    this.previousLink = previousLink;
  }


  public Goals startIndex(Integer startIndex) {
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


  public Goals totalResults(Integer totalResults) {
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


  public Goals username(String username) {
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
    Goals goals = (Goals) o;
    return Objects.equals(this.items, goals.items) &&
        Objects.equals(this.itemsPerPage, goals.itemsPerPage) &&
        Objects.equals(this.kind, goals.kind) &&
        Objects.equals(this.nextLink, goals.nextLink) &&
        Objects.equals(this.previousLink, goals.previousLink) &&
        Objects.equals(this.startIndex, goals.startIndex) &&
        Objects.equals(this.totalResults, goals.totalResults) &&
        Objects.equals(this.username, goals.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, itemsPerPage, kind, nextLink, previousLink, startIndex, totalResults, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Goals {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Goals
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Goals.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Goals is not found in the empty JSON string", Goals.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Goals.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Goals` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Goal.validateJsonElement(jsonArrayitems.get(i));
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
       if (!Goals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Goals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Goals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Goals.class));

       return (TypeAdapter<T>) new TypeAdapter<Goals>() {
           @Override
           public void write(JsonWriter out, Goals value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Goals read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Goals given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Goals
   * @throws IOException if the JSON string is invalid with respect to Goals
   */
  public static Goals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Goals.class);
  }

  /**
   * Convert an instance of Goals to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

