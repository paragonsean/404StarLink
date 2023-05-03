/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
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
import java.util.Arrays;
import org.openapitools.client.model.SpaceItem;

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
 * FlaggedItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:55.210987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FlaggedItem {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private SpaceItem item;

  public static final String SERIALIZED_NAME_PARENT_ITEM = "parentItem";
  @SerializedName(SERIALIZED_NAME_PARENT_ITEM)
  private SpaceItem parentItem;

  public FlaggedItem() {
  }

  public FlaggedItem item(SpaceItem item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  @javax.annotation.Nullable
  public SpaceItem getItem() {
    return item;
  }

  public void setItem(SpaceItem item) {
    this.item = item;
  }


  public FlaggedItem parentItem(SpaceItem parentItem) {
    this.parentItem = parentItem;
    return this;
  }

  /**
   * Get parentItem
   * @return parentItem
   */
  @javax.annotation.Nullable
  public SpaceItem getParentItem() {
    return parentItem;
  }

  public void setParentItem(SpaceItem parentItem) {
    this.parentItem = parentItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlaggedItem flaggedItem = (FlaggedItem) o;
    return Objects.equals(this.item, flaggedItem.item) &&
        Objects.equals(this.parentItem, flaggedItem.parentItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, parentItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlaggedItem {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    parentItem: ").append(toIndentedString(parentItem)).append("\n");
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
    openapiFields.add("item");
    openapiFields.add("parentItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FlaggedItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FlaggedItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FlaggedItem is not found in the empty JSON string", FlaggedItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FlaggedItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FlaggedItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `item`
      if (jsonObj.get("item") != null && !jsonObj.get("item").isJsonNull()) {
        SpaceItem.validateJsonElement(jsonObj.get("item"));
      }
      // validate the optional field `parentItem`
      if (jsonObj.get("parentItem") != null && !jsonObj.get("parentItem").isJsonNull()) {
        SpaceItem.validateJsonElement(jsonObj.get("parentItem"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FlaggedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FlaggedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FlaggedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FlaggedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<FlaggedItem>() {
           @Override
           public void write(JsonWriter out, FlaggedItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FlaggedItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FlaggedItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FlaggedItem
   * @throws IOException if the JSON string is invalid with respect to FlaggedItem
   */
  public static FlaggedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FlaggedItem.class);
  }

  /**
   * Convert an instance of FlaggedItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

