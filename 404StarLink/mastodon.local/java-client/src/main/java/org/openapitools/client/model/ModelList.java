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
 * Represents a list of some users that the authenticated user follows.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModelList {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The user-defined title of the list.
   */
  @JsonAdapter(RepliesPolicyEnum.Adapter.class)
  public enum RepliesPolicyEnum {
    FOLLOWED("followed"),
    
    LIST("list"),
    
    NONE("none");

    private String value;

    RepliesPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepliesPolicyEnum fromValue(String value) {
      for (RepliesPolicyEnum b : RepliesPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepliesPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepliesPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepliesPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepliesPolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RepliesPolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REPLIES_POLICY = "replies_policy";
  @SerializedName(SERIALIZED_NAME_REPLIES_POLICY)
  private RepliesPolicyEnum repliesPolicy;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public ModelList() {
  }

  public ModelList id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The internal database ID of the list. Cast from an integer, but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ModelList repliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
    return this;
  }

  /**
   * The user-defined title of the list.
   * @return repliesPolicy
   */
  @javax.annotation.Nonnull
  public RepliesPolicyEnum getRepliesPolicy() {
    return repliesPolicy;
  }

  public void setRepliesPolicy(RepliesPolicyEnum repliesPolicy) {
    this.repliesPolicy = repliesPolicy;
  }


  public ModelList title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The user-defined title of the list.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this.id, _list.id) &&
        Objects.equals(this.repliesPolicy, _list.repliesPolicy) &&
        Objects.equals(this.title, _list.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repliesPolicy, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repliesPolicy: ").append(toIndentedString(repliesPolicy)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("replies_policy");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("replies_policy");
    openapiRequiredFields.add("title");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelList is not found in the empty JSON string", ModelList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("replies_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replies_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replies_policy").toString()));
      }
      // validate the required field `replies_policy`
      RepliesPolicyEnum.validateJsonElement(jsonObj.get("replies_policy"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelList.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelList>() {
           @Override
           public void write(JsonWriter out, ModelList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelList
   * @throws IOException if the JSON string is invalid with respect to ModelList
   */
  public static ModelList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelList.class);
  }

  /**
   * Convert an instance of ModelList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

