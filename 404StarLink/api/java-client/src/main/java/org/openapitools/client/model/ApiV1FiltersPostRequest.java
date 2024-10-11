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
 * ApiV1FiltersPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:27.417956-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1FiltersPostRequest {
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

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_IRREVERSIBLE = "irreversible";
  @SerializedName(SERIALIZED_NAME_IRREVERSIBLE)
  private Boolean irreversible;

  public static final String SERIALIZED_NAME_PHRASE = "phrase";
  @SerializedName(SERIALIZED_NAME_PHRASE)
  private String phrase;

  public static final String SERIALIZED_NAME_WHOLE_WORD = "whole_word";
  @SerializedName(SERIALIZED_NAME_WHOLE_WORD)
  private Boolean wholeWord;

  public ApiV1FiltersPostRequest() {
  }

  public ApiV1FiltersPostRequest context(List<ContextEnum> context) {
    this.context = context;
    return this;
  }

  public ApiV1FiltersPostRequest addContextItem(ContextEnum contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

  /**
   * Array of enumerable strings &#x60;home&#x60;, &#x60;notifications&#x60;, &#x60;public&#x60;, &#x60;thread&#x60;. At least one context must be specified.
   * @return context
   */
  @javax.annotation.Nonnull
  public List<ContextEnum> getContext() {
    return context;
  }

  public void setContext(List<ContextEnum> context) {
    this.context = context;
  }


  public ApiV1FiltersPostRequest expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Number of seconds from now the filter should expire. Otherwise, null for a filter that doesn&#39;t expire.
   * @return expiresIn
   */
  @javax.annotation.Nullable
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public ApiV1FiltersPostRequest irreversible(Boolean irreversible) {
    this.irreversible = irreversible;
    return this;
  }

  /**
   * Should the server irreversibly drop matching entities from home and notifications?
   * @return irreversible
   */
  @javax.annotation.Nullable
  public Boolean getIrreversible() {
    return irreversible;
  }

  public void setIrreversible(Boolean irreversible) {
    this.irreversible = irreversible;
  }


  public ApiV1FiltersPostRequest phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * Text to be filtered.
   * @return phrase
   */
  @javax.annotation.Nonnull
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }


  public ApiV1FiltersPostRequest wholeWord(Boolean wholeWord) {
    this.wholeWord = wholeWord;
    return this;
  }

  /**
   * Consider word boundaries?
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
    ApiV1FiltersPostRequest apiV1FiltersPostRequest = (ApiV1FiltersPostRequest) o;
    return Objects.equals(this.context, apiV1FiltersPostRequest.context) &&
        Objects.equals(this.expiresIn, apiV1FiltersPostRequest.expiresIn) &&
        Objects.equals(this.irreversible, apiV1FiltersPostRequest.irreversible) &&
        Objects.equals(this.phrase, apiV1FiltersPostRequest.phrase) &&
        Objects.equals(this.wholeWord, apiV1FiltersPostRequest.wholeWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expiresIn, irreversible, phrase, wholeWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1FiltersPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
    openapiFields.add("expires_in");
    openapiFields.add("irreversible");
    openapiFields.add("phrase");
    openapiFields.add("whole_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("phrase");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1FiltersPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1FiltersPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1FiltersPostRequest is not found in the empty JSON string", ApiV1FiltersPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1FiltersPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1FiltersPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV1FiltersPostRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("context") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("context").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be an array in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if (!jsonObj.get("phrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phrase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1FiltersPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1FiltersPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1FiltersPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1FiltersPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1FiltersPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1FiltersPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1FiltersPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1FiltersPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1FiltersPostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1FiltersPostRequest
   */
  public static ApiV1FiltersPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1FiltersPostRequest.class);
  }

  /**
   * Convert an instance of ApiV1FiltersPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

