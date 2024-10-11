/*
 * Container Analysis API
 * An implementation of the Grafeas API, which stores, and enables querying and retrieval of critical metadata about all of your software artifacts.
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
import org.openapitools.client.model.Note;

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
 * Response for creating notes in batch.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:49.449403-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchCreateNotesResponse {
  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<Note> notes = new ArrayList<>();

  public BatchCreateNotesResponse() {
  }

  public BatchCreateNotesResponse notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public BatchCreateNotesResponse addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * The notes that were created.
   * @return notes
   */
  @javax.annotation.Nullable
  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchCreateNotesResponse batchCreateNotesResponse = (BatchCreateNotesResponse) o;
    return Objects.equals(this.notes, batchCreateNotesResponse.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchCreateNotesResponse {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchCreateNotesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchCreateNotesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchCreateNotesResponse is not found in the empty JSON string", BatchCreateNotesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchCreateNotesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchCreateNotesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
        if (jsonArraynotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
          }

          // validate the optional field `notes` (array)
          for (int i = 0; i < jsonArraynotes.size(); i++) {
            Note.validateJsonElement(jsonArraynotes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchCreateNotesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchCreateNotesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchCreateNotesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchCreateNotesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchCreateNotesResponse>() {
           @Override
           public void write(JsonWriter out, BatchCreateNotesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchCreateNotesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchCreateNotesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchCreateNotesResponse
   * @throws IOException if the JSON string is invalid with respect to BatchCreateNotesResponse
   */
  public static BatchCreateNotesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchCreateNotesResponse.class);
  }

  /**
   * Convert an instance of BatchCreateNotesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

