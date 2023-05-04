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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ConversationSearchResultItem;

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
 * ConversationSearchResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:59.136525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConversationSearchResult {
  public static final String SERIALIZED_NAME_MATCHING_CONVERSATIONS = "matchingConversations";
  @SerializedName(SERIALIZED_NAME_MATCHING_CONVERSATIONS)
  private List<ConversationSearchResultItem> matchingConversations = new ArrayList<>();

  public ConversationSearchResult() {
  }

  public ConversationSearchResult matchingConversations(List<ConversationSearchResultItem> matchingConversations) {
    this.matchingConversations = matchingConversations;
    return this;
  }

  public ConversationSearchResult addMatchingConversationsItem(ConversationSearchResultItem matchingConversationsItem) {
    if (this.matchingConversations == null) {
      this.matchingConversations = new ArrayList<>();
    }
    this.matchingConversations.add(matchingConversationsItem);
    return this;
  }

  /**
   * A list of result items for conversations that match the search term.
   * @return matchingConversations
   */
  @javax.annotation.Nullable
  public List<ConversationSearchResultItem> getMatchingConversations() {
    return matchingConversations;
  }

  public void setMatchingConversations(List<ConversationSearchResultItem> matchingConversations) {
    this.matchingConversations = matchingConversations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSearchResult conversationSearchResult = (ConversationSearchResult) o;
    return Objects.equals(this.matchingConversations, conversationSearchResult.matchingConversations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchingConversations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSearchResult {\n");
    sb.append("    matchingConversations: ").append(toIndentedString(matchingConversations)).append("\n");
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
    openapiFields.add("matchingConversations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConversationSearchResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConversationSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationSearchResult is not found in the empty JSON string", ConversationSearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConversationSearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationSearchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("matchingConversations") != null && !jsonObj.get("matchingConversations").isJsonNull()) {
        JsonArray jsonArraymatchingConversations = jsonObj.getAsJsonArray("matchingConversations");
        if (jsonArraymatchingConversations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchingConversations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchingConversations` to be an array in the JSON string but got `%s`", jsonObj.get("matchingConversations").toString()));
          }

          // validate the optional field `matchingConversations` (array)
          for (int i = 0; i < jsonArraymatchingConversations.size(); i++) {
            ConversationSearchResultItem.validateJsonElement(jsonArraymatchingConversations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationSearchResult>() {
           @Override
           public void write(JsonWriter out, ConversationSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationSearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConversationSearchResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConversationSearchResult
   * @throws IOException if the JSON string is invalid with respect to ConversationSearchResult
   */
  public static ConversationSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationSearchResult.class);
  }

  /**
   * Convert an instance of ConversationSearchResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

