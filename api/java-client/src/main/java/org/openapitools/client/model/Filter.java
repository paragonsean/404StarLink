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
 * Represents a user-defined filter for determining which statuses should not be shown to the user.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:27.417956-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Filter {
  /**
   * Gets or Sets context
   */
  @JsonAdapter(ContextEnum.Adapter.class)
  public enum ContextEnum {
    HOME("home"),
    
    NOTIFICATIONS("notifications"),
    
    PUBLIC("public"),
    
    THREAD("thread");

    private String value;

    ContextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContextEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContextEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ContextEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private List<ContextEnum> context = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IRREVERSIBLE = "irreversible";
  @SerializedName(SERIALIZED_NAME_IRREVERSIBLE)
  private Boolean irreversible;

  public static final String SERIALIZED_NAME_PHRASE = "phrase";
  @SerializedName(SERIALIZED_NAME_PHRASE)
  private String phrase;

  public static final String SERIALIZED_NAME_WHOLE_WORD = "whole_word";
  @SerializedName(SERIALIZED_NAME_WHOLE_WORD)
  private Boolean wholeWord;

  public Filter() {
  }

  public Filter context(List<ContextEnum> context) {
    this.context = context;
    return this;
  }

  public Filter addContextItem(ContextEnum contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

  /**
   * The contexts in which the filter should be applied.
   * @return context
   */
  @javax.annotation.Nullable
  public List<ContextEnum> getContext() {
    return context;
  }

  public void setContext(List<ContextEnum> context) {
    this.context = context;
  }


  public Filter expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the filter should no longer be applied. ISO 8601 Datetime, or null if the filter does not expire
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Filter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the filter in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Filter irreversible(Boolean irreversible) {
    this.irreversible = irreversible;
    return this;
  }

  /**
   * Should matching entities in home and notifications be dropped by the server?
   * @return irreversible
   */
  @javax.annotation.Nullable
  public Boolean getIrreversible() {
    return irreversible;
  }

  public void setIrreversible(Boolean irreversible) {
    this.irreversible = irreversible;
  }


  public Filter phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * The text to be filtered.
   * @return phrase
   */
  @javax.annotation.Nullable
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }


  public Filter wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Should the filter consider word boundaries?
   * @return wholeWord
   */
  @javax.annotation.Nullable
  public Boolean getWholeWord() {
    return wholeWord;
  }

  public void setWholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.context, filter.context) &&
        Objects.equals(this.expiresAt, filter.expiresAt) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.irreversible, filter.irreversible) &&
        Objects.equals(this.phrase, filter.phrase) &&
        Objects.equals(this.wholeWord, filter.wholeWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expiresAt, id, irreversible, phrase, wholeWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    irreversible: ").append(toIndentedString(irreversible)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    wholeWord: ").append(toIndentedString(wholeWord)).append("\n");
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
    openapiFields.add("context");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("irreversible");
    openapiFields.add("phrase");
    openapiFields.add("whole_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Filter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Filter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Filter is not found in the empty JSON string", Filter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Filter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Filter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull() && !jsonObj.get("context").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be an array in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("phrase") != null && !jsonObj.get("phrase").isJsonNull()) && !jsonObj.get("phrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phrase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<Filter>() {
           @Override
           public void write(JsonWriter out, Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Filter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Filter
   * @throws IOException if the JSON string is invalid with respect to Filter
   */
  public static Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Filter.class);
  }

  /**
   * Convert an instance of Filter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

