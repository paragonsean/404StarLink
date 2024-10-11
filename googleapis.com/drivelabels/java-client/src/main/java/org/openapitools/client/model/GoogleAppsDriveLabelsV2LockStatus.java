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
 * Contains information about whether a label component should be considered locked.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:59.934987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleAppsDriveLabelsV2LockStatus {
  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public GoogleAppsDriveLabelsV2LockStatus() {
  }

  public GoogleAppsDriveLabelsV2LockStatus(
     Boolean locked
  ) {
    this();
    this.locked = locked;
  }

  /**
   * Output only. Indicates whether this label component is the (direct) target of a LabelLock. A label component can be implicitly locked even if it&#39;s not the direct target of a LabelLock, in which case this field is set to false.
   * @return locked
   */
  @javax.annotation.Nullable
  public Boolean getLocked() {
    return locked;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAppsDriveLabelsV2LockStatus googleAppsDriveLabelsV2LockStatus = (GoogleAppsDriveLabelsV2LockStatus) o;
    return Objects.equals(this.locked, googleAppsDriveLabelsV2LockStatus.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAppsDriveLabelsV2LockStatus {\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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
    openapiFields.add("locked");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleAppsDriveLabelsV2LockStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleAppsDriveLabelsV2LockStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleAppsDriveLabelsV2LockStatus is not found in the empty JSON string", GoogleAppsDriveLabelsV2LockStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleAppsDriveLabelsV2LockStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleAppsDriveLabelsV2LockStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleAppsDriveLabelsV2LockStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleAppsDriveLabelsV2LockStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleAppsDriveLabelsV2LockStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleAppsDriveLabelsV2LockStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleAppsDriveLabelsV2LockStatus>() {
           @Override
           public void write(JsonWriter out, GoogleAppsDriveLabelsV2LockStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleAppsDriveLabelsV2LockStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleAppsDriveLabelsV2LockStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleAppsDriveLabelsV2LockStatus
   * @throws IOException if the JSON string is invalid with respect to GoogleAppsDriveLabelsV2LockStatus
   */
  public static GoogleAppsDriveLabelsV2LockStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleAppsDriveLabelsV2LockStatus.class);
  }

  /**
   * Convert an instance of GoogleAppsDriveLabelsV2LockStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

