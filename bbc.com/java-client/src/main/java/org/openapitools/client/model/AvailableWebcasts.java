/*
 * BBC Nitro API
 * BBC Nitro is the BBC's application programming interface (API) for BBC Programmes Metadata.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nitro@bbc.co.uk
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
import org.openapitools.client.model.AvailableVersionsElement;

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
 * AvailableWebcasts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:42.974015-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AvailableWebcasts {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_AVAILABLE_VERSIONS_ELEMENT = "available_versions_element";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VERSIONS_ELEMENT)
  private AvailableVersionsElement availableVersionsElement;

  public AvailableWebcasts() {
  }

  public AvailableWebcasts available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
   */
  @javax.annotation.Nonnull
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }


  public AvailableWebcasts availableVersionsElement(AvailableVersionsElement availableVersionsElement) {
    this.availableVersionsElement = availableVersionsElement;
    return this;
  }

  /**
   * Get availableVersionsElement
   * @return availableVersionsElement
   */
  @javax.annotation.Nonnull
  public AvailableVersionsElement getAvailableVersionsElement() {
    return availableVersionsElement;
  }

  public void setAvailableVersionsElement(AvailableVersionsElement availableVersionsElement) {
    this.availableVersionsElement = availableVersionsElement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableWebcasts availableWebcasts = (AvailableWebcasts) o;
    return Objects.equals(this.available, availableWebcasts.available) &&
        Objects.equals(this.availableVersionsElement, availableWebcasts.availableVersionsElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, availableVersionsElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableWebcasts {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    availableVersionsElement: ").append(toIndentedString(availableVersionsElement)).append("\n");
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
    openapiFields.add("available");
    openapiFields.add("available_versions_element");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("available");
    openapiRequiredFields.add("available_versions_element");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailableWebcasts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableWebcasts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableWebcasts is not found in the empty JSON string", AvailableWebcasts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailableWebcasts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailableWebcasts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailableWebcasts.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `available_versions_element`
      AvailableVersionsElement.validateJsonElement(jsonObj.get("available_versions_element"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableWebcasts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableWebcasts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableWebcasts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableWebcasts.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableWebcasts>() {
           @Override
           public void write(JsonWriter out, AvailableWebcasts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableWebcasts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailableWebcasts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailableWebcasts
   * @throws IOException if the JSON string is invalid with respect to AvailableWebcasts
   */
  public static AvailableWebcasts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableWebcasts.class);
  }

  /**
   * Convert an instance of AvailableWebcasts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

