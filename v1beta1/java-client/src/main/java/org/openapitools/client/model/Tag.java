/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
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
 * A Compute Engine Instance tag, identical to the tags on the corresponding Compute Engine Instance resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:39.942530-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Tag {
  public static final String SERIALIZED_NAME_FINGER_PRINT = "fingerPrint";
  @SerializedName(SERIALIZED_NAME_FINGER_PRINT)
  private String fingerPrint;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<String> items = new ArrayList<>();

  public Tag() {
  }

  public Tag fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

  /**
   * The fingerprint of the tag. Required for updating the list of tags.
   * @return fingerPrint
   */
  @javax.annotation.Nullable
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }


  public Tag items(List<String> items) {
    this.items = items;
    return this;
  }

  public Tag addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items contained in this tag.
   * @return items
   */
  @javax.annotation.Nullable
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.fingerPrint, tag.fingerPrint) &&
        Objects.equals(this.items, tag.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerPrint, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("fingerPrint");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Tag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tag is not found in the empty JSON string", Tag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fingerPrint") != null && !jsonObj.get("fingerPrint").isJsonNull()) && !jsonObj.get("fingerPrint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerPrint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerPrint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull() && !jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

       return (TypeAdapter<T>) new TypeAdapter<Tag>() {
           @Override
           public void write(JsonWriter out, Tag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Tag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Tag
   * @throws IOException if the JSON string is invalid with respect to Tag
   */
  public static Tag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tag.class);
  }

  /**
   * Convert an instance of Tag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

