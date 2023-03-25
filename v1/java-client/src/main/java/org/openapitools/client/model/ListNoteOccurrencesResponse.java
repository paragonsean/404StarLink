/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Occurrence;

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
 * Response for listing occurrences for a note.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:53.550882-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListNoteOccurrencesResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_OCCURRENCES = "occurrences";
  @SerializedName(SERIALIZED_NAME_OCCURRENCES)
  private List<Occurrence> occurrences = new ArrayList<>();

  public ListNoteOccurrencesResponse() {
  }

  public ListNoteOccurrencesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token to provide to skip to a particular spot in the list.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListNoteOccurrencesResponse occurrences(List<Occurrence> occurrences) {
    this.occurrences = occurrences;
    return this;
  }

  public ListNoteOccurrencesResponse addOccurrencesItem(Occurrence occurrencesItem) {
    if (this.occurrences == null) {
      this.occurrences = new ArrayList<>();
    }
    this.occurrences.add(occurrencesItem);
    return this;
  }

  /**
   * The occurrences attached to the specified note.
   * @return occurrences
   */
  @javax.annotation.Nullable
  public List<Occurrence> getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(List<Occurrence> occurrences) {
    this.occurrences = occurrences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNoteOccurrencesResponse listNoteOccurrencesResponse = (ListNoteOccurrencesResponse) o;
    return Objects.equals(this.nextPageToken, listNoteOccurrencesResponse.nextPageToken) &&
        Objects.equals(this.occurrences, listNoteOccurrencesResponse.occurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, occurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNoteOccurrencesResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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
    openapiFields.add("nextPageToken");
    openapiFields.add("occurrences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListNoteOccurrencesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListNoteOccurrencesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListNoteOccurrencesResponse is not found in the empty JSON string", ListNoteOccurrencesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListNoteOccurrencesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListNoteOccurrencesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("occurrences") != null && !jsonObj.get("occurrences").isJsonNull()) {
        JsonArray jsonArrayoccurrences = jsonObj.getAsJsonArray("occurrences");
        if (jsonArrayoccurrences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("occurrences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `occurrences` to be an array in the JSON string but got `%s`", jsonObj.get("occurrences").toString()));
          }

          // validate the optional field `occurrences` (array)
          for (int i = 0; i < jsonArrayoccurrences.size(); i++) {
            Occurrence.validateJsonElement(jsonArrayoccurrences.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListNoteOccurrencesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListNoteOccurrencesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListNoteOccurrencesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListNoteOccurrencesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListNoteOccurrencesResponse>() {
           @Override
           public void write(JsonWriter out, ListNoteOccurrencesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListNoteOccurrencesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListNoteOccurrencesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListNoteOccurrencesResponse
   * @throws IOException if the JSON string is invalid with respect to ListNoteOccurrencesResponse
   */
  public static ListNoteOccurrencesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListNoteOccurrencesResponse.class);
  }

  /**
   * Convert an instance of ListNoteOccurrencesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

