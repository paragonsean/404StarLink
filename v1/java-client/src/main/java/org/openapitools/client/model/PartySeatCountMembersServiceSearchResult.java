/*
 * Members API
 * An API which retrieves Members data.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
import org.openapitools.client.model.Link;
import org.openapitools.client.model.PartySeatCountItem;
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
 * PartySeatCountMembersServiceSearchResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:52.015048-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PartySeatCountMembersServiceSearchResult {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PartySeatCountItem> items;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public static final String SERIALIZED_NAME_RESULT_CONTEXT = "resultContext";
  @SerializedName(SERIALIZED_NAME_RESULT_CONTEXT)
  private String resultContext;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip;

  public static final String SERIALIZED_NAME_TAKE = "take";
  @SerializedName(SERIALIZED_NAME_TAKE)
  private Integer take;

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "totalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS)
  private Integer totalResults;

  public PartySeatCountMembersServiceSearchResult() {
  }

  public PartySeatCountMembersServiceSearchResult items(List<PartySeatCountItem> items) {
    this.items = items;
    return this;
  }

  public PartySeatCountMembersServiceSearchResult addItemsItem(PartySeatCountItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nullable
  public List<PartySeatCountItem> getItems() {
    return items;
  }

  public void setItems(List<PartySeatCountItem> items) {
    this.items = items;
  }


  public PartySeatCountMembersServiceSearchResult links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PartySeatCountMembersServiceSearchResult addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  public PartySeatCountMembersServiceSearchResult resultContext(String resultContext) {
    this.resultContext = resultContext;
    return this;
  }

  /**
   * Get resultContext
   * @return resultContext
   */
  @javax.annotation.Nullable
  public String getResultContext() {
    return resultContext;
  }

  public void setResultContext(String resultContext) {
    this.resultContext = resultContext;
  }


  public PartySeatCountMembersServiceSearchResult skip(Integer skip) {
    this.skip = skip;
    return this;
  }

  /**
   * Get skip
   * @return skip
   */
  @javax.annotation.Nullable
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public PartySeatCountMembersServiceSearchResult take(Integer take) {
    this.take = take;
    return this;
  }

  /**
   * Get take
   * @return take
   */
  @javax.annotation.Nullable
  public Integer getTake() {
    return take;
  }

  public void setTake(Integer take) {
    this.take = take;
  }


  public PartySeatCountMembersServiceSearchResult totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
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
    PartySeatCountMembersServiceSearchResult partySeatCountMembersServiceSearchResult = (PartySeatCountMembersServiceSearchResult) o;
    return Objects.equals(this.items, partySeatCountMembersServiceSearchResult.items) &&
        Objects.equals(this.links, partySeatCountMembersServiceSearchResult.links) &&
        Objects.equals(this.resultContext, partySeatCountMembersServiceSearchResult.resultContext) &&
        Objects.equals(this.skip, partySeatCountMembersServiceSearchResult.skip) &&
        Objects.equals(this.take, partySeatCountMembersServiceSearchResult.take) &&
        Objects.equals(this.totalResults, partySeatCountMembersServiceSearchResult.totalResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, links, resultContext, skip, take, totalResults);
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
    sb.append("class PartySeatCountMembersServiceSearchResult {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    resultContext: ").append(toIndentedString(resultContext)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
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
    openapiFields.add("links");
    openapiFields.add("resultContext");
    openapiFields.add("skip");
    openapiFields.add("take");
    openapiFields.add("totalResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PartySeatCountMembersServiceSearchResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartySeatCountMembersServiceSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartySeatCountMembersServiceSearchResult is not found in the empty JSON string", PartySeatCountMembersServiceSearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartySeatCountMembersServiceSearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartySeatCountMembersServiceSearchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            PartySeatCountItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
      if ((jsonObj.get("resultContext") != null && !jsonObj.get("resultContext").isJsonNull()) && !jsonObj.get("resultContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultContext").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartySeatCountMembersServiceSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartySeatCountMembersServiceSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartySeatCountMembersServiceSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartySeatCountMembersServiceSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PartySeatCountMembersServiceSearchResult>() {
           @Override
           public void write(JsonWriter out, PartySeatCountMembersServiceSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartySeatCountMembersServiceSearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PartySeatCountMembersServiceSearchResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartySeatCountMembersServiceSearchResult
   * @throws IOException if the JSON string is invalid with respect to PartySeatCountMembersServiceSearchResult
   */
  public static PartySeatCountMembersServiceSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartySeatCountMembersServiceSearchResult.class);
  }

  /**
   * Convert an instance of PartySeatCountMembersServiceSearchResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

