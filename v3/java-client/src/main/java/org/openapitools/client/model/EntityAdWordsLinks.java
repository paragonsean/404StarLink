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
import org.openapitools.client.model.EntityAdWordsLink;

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
 * An entity Google Ads link collection provides a list of GA-Google Ads links Each resource in this collection corresponds to a single link.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EntityAdWordsLinks {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<EntityAdWordsLink> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "itemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind = "analytics#entityAdWordsLinks";

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

  public EntityAdWordsLinks() {
  }

  public EntityAdWordsLinks items(List<EntityAdWordsLink> items) {
    this.items = items;
    return this;
  }

  public EntityAdWordsLinks addItemsItem(EntityAdWordsLink itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of entity Google Ads links.
   * @return items
   */
  @javax.annotation.Nullable
  public List<EntityAdWordsLink> getItems() {
    return items;
  }

  public void setItems(List<EntityAdWordsLink> items) {
    this.items = items;
  }


  public EntityAdWordsLinks itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter.
   * @return itemsPerPage
   */
  @javax.annotation.Nullable
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public EntityAdWordsLinks kind(String kind) {
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


  public EntityAdWordsLinks nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Next link for this Google Ads link collection.
   * @return nextLink
   */
  @javax.annotation.Nullable
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  public EntityAdWordsLinks previousLink(String previousLink) {
    this.previousLink = previousLink;
    return this;
  }

  /**
   * Previous link for this Google Ads link collection.
   * @return previousLink
   */
  @javax.annotation.Nullable
  public String getPreviousLink() {
    return previousLink;
  }

  public void setPreviousLink(String previousLink) {
    this.previousLink = previousLink;
  }


  public EntityAdWordsLinks startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter.
   * @return startIndex
   */
  @javax.annotation.Nullable
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public EntityAdWordsLinks totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * The total number of results for the query, regardless of the number of results in the response.
   * @return totalResults
   */
  @javax.annotation.Nullable
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityAdWordsLinks entityAdWordsLinks = (EntityAdWordsLinks) o;
    return Objects.equals(this.items, entityAdWordsLinks.items) &&
        Objects.equals(this.itemsPerPage, entityAdWordsLinks.itemsPerPage) &&
        Objects.equals(this.kind, entityAdWordsLinks.kind) &&
        Objects.equals(this.nextLink, entityAdWordsLinks.nextLink) &&
        Objects.equals(this.previousLink, entityAdWordsLinks.previousLink) &&
        Objects.equals(this.startIndex, entityAdWordsLinks.startIndex) &&
        Objects.equals(this.totalResults, entityAdWordsLinks.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, itemsPerPage, kind, nextLink, previousLink, startIndex, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityAdWordsLinks {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    previousLink: ").append(toIndentedString(previousLink)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EntityAdWordsLinks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EntityAdWordsLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntityAdWordsLinks is not found in the empty JSON string", EntityAdWordsLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EntityAdWordsLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntityAdWordsLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            EntityAdWordsLink.validateJsonElement(jsonArrayitems.get(i));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntityAdWordsLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntityAdWordsLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntityAdWordsLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntityAdWordsLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<EntityAdWordsLinks>() {
           @Override
           public void write(JsonWriter out, EntityAdWordsLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntityAdWordsLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EntityAdWordsLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EntityAdWordsLinks
   * @throws IOException if the JSON string is invalid with respect to EntityAdWordsLinks
   */
  public static EntityAdWordsLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntityAdWordsLinks.class);
  }

  /**
   * Convert an instance of EntityAdWordsLinks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

