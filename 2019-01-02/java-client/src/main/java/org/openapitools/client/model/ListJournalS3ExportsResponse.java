/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
 * Contact: mike.ralphson@gmail.com
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
 * ListJournalS3ExportsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:45.268682-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListJournalS3ExportsResponse {
  public static final String SERIALIZED_NAME_JOURNAL_S3_EXPORTS = "JournalS3Exports";
  @SerializedName(SERIALIZED_NAME_JOURNAL_S3_EXPORTS)
  private List journalS3Exports;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public ListJournalS3ExportsResponse() {
  }

  public ListJournalS3ExportsResponse journalS3Exports(List journalS3Exports) {
    this.journalS3Exports = journalS3Exports;
    return this;
  }

  /**
   * Get journalS3Exports
   * @return journalS3Exports
   */
  @javax.annotation.Nullable
  public List getJournalS3Exports() {
    return journalS3Exports;
  }

  public void setJournalS3Exports(List journalS3Exports) {
    this.journalS3Exports = journalS3Exports;
  }


  public ListJournalS3ExportsResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

  /**
   * Get nextToken
   * @return nextToken
   */
  @javax.annotation.Nullable
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListJournalS3ExportsResponse listJournalS3ExportsResponse = (ListJournalS3ExportsResponse) o;
    return Objects.equals(this.journalS3Exports, listJournalS3ExportsResponse.journalS3Exports) &&
        Objects.equals(this.nextToken, listJournalS3ExportsResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journalS3Exports, nextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListJournalS3ExportsResponse {\n");
    sb.append("    journalS3Exports: ").append(toIndentedString(journalS3Exports)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
    openapiFields.add("JournalS3Exports");
    openapiFields.add("NextToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListJournalS3ExportsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListJournalS3ExportsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListJournalS3ExportsResponse is not found in the empty JSON string", ListJournalS3ExportsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListJournalS3ExportsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListJournalS3ExportsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `JournalS3Exports`
      if (jsonObj.get("JournalS3Exports") != null && !jsonObj.get("JournalS3Exports").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("JournalS3Exports"));
      }
      // validate the optional field `NextToken`
      if (jsonObj.get("NextToken") != null && !jsonObj.get("NextToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("NextToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListJournalS3ExportsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListJournalS3ExportsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListJournalS3ExportsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListJournalS3ExportsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListJournalS3ExportsResponse>() {
           @Override
           public void write(JsonWriter out, ListJournalS3ExportsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListJournalS3ExportsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListJournalS3ExportsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListJournalS3ExportsResponse
   * @throws IOException if the JSON string is invalid with respect to ListJournalS3ExportsResponse
   */
  public static ListJournalS3ExportsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListJournalS3ExportsResponse.class);
  }

  /**
   * Convert an instance of ListJournalS3ExportsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

