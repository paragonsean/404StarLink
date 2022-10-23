/*
 * ClickMeter API
 * Api dashboard for ClickMeter API
 *
 * The version of the OpenAPI document: v2
 * Contact: api@clickmeter.com
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
import org.openapitools.client.model.ApiCoreDtoAccountingIpBlacklistEntry;

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
 * ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:16.082688-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry {
  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<ApiCoreDtoAccountingIpBlacklistEntry> entities = new ArrayList<>();

  public ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry() {
  }

  public ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry entities(List<ApiCoreDtoAccountingIpBlacklistEntry> entities) {
    this.entities = entities;
    return this;
  }

  public ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry addEntitiesItem(ApiCoreDtoAccountingIpBlacklistEntry entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Get entities
   * @return entities
   */
  @javax.annotation.Nullable
  public List<ApiCoreDtoAccountingIpBlacklistEntry> getEntities() {
    return entities;
  }

  public void setEntities(List<ApiCoreDtoAccountingIpBlacklistEntry> entities) {
    this.entities = entities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry apiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry = (ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry) o;
    return Objects.equals(this.entities, apiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
    openapiFields.add("entities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry is not found in the empty JSON string", ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("entities") != null && !jsonObj.get("entities").isJsonNull()) {
        JsonArray jsonArrayentities = jsonObj.getAsJsonArray("entities");
        if (jsonArrayentities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entities` to be an array in the JSON string but got `%s`", jsonObj.get("entities").toString()));
          }

          // validate the optional field `entities` (array)
          for (int i = 0; i < jsonArrayentities.size(); i++) {
            ApiCoreDtoAccountingIpBlacklistEntry.validateJsonElement(jsonArrayentities.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry>() {
           @Override
           public void write(JsonWriter out, ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry
   * @throws IOException if the JSON string is invalid with respect to ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry
   */
  public static ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry.class);
  }

  /**
   * Convert an instance of ApiCoreResponsesEntitiesResponseApiCoreDtoAccountingIpBlacklistEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

