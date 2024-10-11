/*
 * Drive Labels API
 * An API for managing Drive Labels
 *
 * The version of the OpenAPI document: v2
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
 * The capabilities related to this field on applied metadata.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:59.934987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleAppsDriveLabelsV2FieldAppliedCapabilities {
  public static final String SERIALIZED_NAME_CAN_READ = "canRead";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;

  public static final String SERIALIZED_NAME_CAN_SEARCH = "canSearch";
  @SerializedName(SERIALIZED_NAME_CAN_SEARCH)
  private Boolean canSearch;

  public static final String SERIALIZED_NAME_CAN_WRITE = "canWrite";
  @SerializedName(SERIALIZED_NAME_CAN_WRITE)
  private Boolean canWrite;

  public GoogleAppsDriveLabelsV2FieldAppliedCapabilities() {
  }

  public GoogleAppsDriveLabelsV2FieldAppliedCapabilities canRead(Boolean canRead) {
    this.canRead = canRead;
    return this;
  }

  /**
   * Whether the user can read related applied metadata on items.
   * @return canRead
   */
  @javax.annotation.Nullable
  public Boolean getCanRead() {
    return canRead;
  }

  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }


  public GoogleAppsDriveLabelsV2FieldAppliedCapabilities canSearch(Boolean canSearch) {
    this.canSearch = canSearch;
    return this;
  }

  /**
   * Whether the user can search for Drive items referencing this field.
   * @return canSearch
   */
  @javax.annotation.Nullable
  public Boolean getCanSearch() {
    return canSearch;
  }

  public void setCanSearch(Boolean canSearch) {
    this.canSearch = canSearch;
  }


  public GoogleAppsDriveLabelsV2FieldAppliedCapabilities canWrite(Boolean canWrite) {
    this.canWrite = canWrite;
    return this;
  }

  /**
   * Whether the user can set this field on Drive items.
   * @return canWrite
   */
  @javax.annotation.Nullable
  public Boolean getCanWrite() {
    return canWrite;
  }

  public void setCanWrite(Boolean canWrite) {
    this.canWrite = canWrite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAppsDriveLabelsV2FieldAppliedCapabilities googleAppsDriveLabelsV2FieldAppliedCapabilities = (GoogleAppsDriveLabelsV2FieldAppliedCapabilities) o;
    return Objects.equals(this.canRead, googleAppsDriveLabelsV2FieldAppliedCapabilities.canRead) &&
        Objects.equals(this.canSearch, googleAppsDriveLabelsV2FieldAppliedCapabilities.canSearch) &&
        Objects.equals(this.canWrite, googleAppsDriveLabelsV2FieldAppliedCapabilities.canWrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRead, canSearch, canWrite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAppsDriveLabelsV2FieldAppliedCapabilities {\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canSearch: ").append(toIndentedString(canSearch)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
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
    openapiFields.add("canRead");
    openapiFields.add("canSearch");
    openapiFields.add("canWrite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleAppsDriveLabelsV2FieldAppliedCapabilities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleAppsDriveLabelsV2FieldAppliedCapabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleAppsDriveLabelsV2FieldAppliedCapabilities is not found in the empty JSON string", GoogleAppsDriveLabelsV2FieldAppliedCapabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleAppsDriveLabelsV2FieldAppliedCapabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleAppsDriveLabelsV2FieldAppliedCapabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleAppsDriveLabelsV2FieldAppliedCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleAppsDriveLabelsV2FieldAppliedCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleAppsDriveLabelsV2FieldAppliedCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleAppsDriveLabelsV2FieldAppliedCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleAppsDriveLabelsV2FieldAppliedCapabilities>() {
           @Override
           public void write(JsonWriter out, GoogleAppsDriveLabelsV2FieldAppliedCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleAppsDriveLabelsV2FieldAppliedCapabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleAppsDriveLabelsV2FieldAppliedCapabilities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleAppsDriveLabelsV2FieldAppliedCapabilities
   * @throws IOException if the JSON string is invalid with respect to GoogleAppsDriveLabelsV2FieldAppliedCapabilities
   */
  public static GoogleAppsDriveLabelsV2FieldAppliedCapabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleAppsDriveLabelsV2FieldAppliedCapabilities.class);
  }

  /**
   * Convert an instance of GoogleAppsDriveLabelsV2FieldAppliedCapabilities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

