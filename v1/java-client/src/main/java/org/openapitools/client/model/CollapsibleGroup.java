/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v1
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
 * A widget that groups the other widgets. All widgets that are within the area spanned by the grouping widget are considered member widgets.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:16.300251-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CollapsibleGroup {
  public static final String SERIALIZED_NAME_COLLAPSED = "collapsed";
  @SerializedName(SERIALIZED_NAME_COLLAPSED)
  private Boolean collapsed;

  public CollapsibleGroup() {
  }

  public CollapsibleGroup collapsed(Boolean collapsed) {
    this.collapsed = collapsed;
    return this;
  }

  /**
   * The collapsed state of the widget on first page load.
   * @return collapsed
   */
  @javax.annotation.Nullable
  public Boolean getCollapsed() {
    return collapsed;
  }

  public void setCollapsed(Boolean collapsed) {
    this.collapsed = collapsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollapsibleGroup collapsibleGroup = (CollapsibleGroup) o;
    return Objects.equals(this.collapsed, collapsibleGroup.collapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collapsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollapsibleGroup {\n");
    sb.append("    collapsed: ").append(toIndentedString(collapsed)).append("\n");
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
    openapiFields.add("collapsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CollapsibleGroup
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CollapsibleGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollapsibleGroup is not found in the empty JSON string", CollapsibleGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CollapsibleGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollapsibleGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollapsibleGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollapsibleGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollapsibleGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollapsibleGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CollapsibleGroup>() {
           @Override
           public void write(JsonWriter out, CollapsibleGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollapsibleGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CollapsibleGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CollapsibleGroup
   * @throws IOException if the JSON string is invalid with respect to CollapsibleGroup
   */
  public static CollapsibleGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollapsibleGroup.class);
  }

  /**
   * Convert an instance of CollapsibleGroup to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

