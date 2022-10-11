/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
import org.openapitools.client.model.Status;

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
 * Represents the tree around a given status. Used for reconstructing threads of statuses.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:27.813212-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Context {
  public static final String SERIALIZED_NAME_ANCESTORS = "ancestors";
  @SerializedName(SERIALIZED_NAME_ANCESTORS)
  private List<Status> ancestors = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCENDANTS = "descendants";
  @SerializedName(SERIALIZED_NAME_DESCENDANTS)
  private List<Status> descendants = new ArrayList<>();

  public Context() {
  }

  public Context ancestors(List<Status> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public Context addAncestorsItem(Status ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

  /**
   * Parents in the thread.
   * @return ancestors
   */
  @javax.annotation.Nonnull
  public List<Status> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<Status> ancestors) {
    this.ancestors = ancestors;
  }


  public Context descendants(List<Status> descendants) {
    this.descendants = descendants;
    return this;
  }

  public Context addDescendantsItem(Status descendantsItem) {
    if (this.descendants == null) {
      this.descendants = new ArrayList<>();
    }
    this.descendants.add(descendantsItem);
    return this;
  }

  /**
   * Children in the thread.
   * @return descendants
   */
  @javax.annotation.Nonnull
  public List<Status> getDescendants() {
    return descendants;
  }

  public void setDescendants(List<Status> descendants) {
    this.descendants = descendants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.ancestors, context.ancestors) &&
        Objects.equals(this.descendants, context.descendants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, descendants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
    sb.append("    descendants: ").append(toIndentedString(descendants)).append("\n");
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
    openapiFields.add("ancestors");
    openapiFields.add("descendants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ancestors");
    openapiRequiredFields.add("descendants");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Context
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Context.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Context is not found in the empty JSON string", Context.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Context.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Context` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Context.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("ancestors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ancestors` to be an array in the JSON string but got `%s`", jsonObj.get("ancestors").toString()));
      }

      JsonArray jsonArrayancestors = jsonObj.getAsJsonArray("ancestors");
      // validate the required field `ancestors` (array)
      for (int i = 0; i < jsonArrayancestors.size(); i++) {
        Status.validateJsonElement(jsonArrayancestors.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("descendants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `descendants` to be an array in the JSON string but got `%s`", jsonObj.get("descendants").toString()));
      }

      JsonArray jsonArraydescendants = jsonObj.getAsJsonArray("descendants");
      // validate the required field `descendants` (array)
      for (int i = 0; i < jsonArraydescendants.size(); i++) {
        Status.validateJsonElement(jsonArraydescendants.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Context.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Context' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Context> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Context.class));

       return (TypeAdapter<T>) new TypeAdapter<Context>() {
           @Override
           public void write(JsonWriter out, Context value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Context read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Context given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Context
   * @throws IOException if the JSON string is invalid with respect to Context
   */
  public static Context fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Context.class);
  }

  /**
   * Convert an instance of Context to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

