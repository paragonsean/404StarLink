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
import org.openapitools.client.model.SpacesSearchTerm;

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
 * SpacesSearchTermResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:59.136525-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SpacesSearchTermResult {
  public static final String SERIALIZED_NAME_RES_LIST = "resList";
  @SerializedName(SERIALIZED_NAME_RES_LIST)
  private List<SpacesSearchTerm> resList = new ArrayList<>();

  public SpacesSearchTermResult() {
  }

  public SpacesSearchTermResult resList(List<SpacesSearchTerm> resList) {
    this.resList = resList;
    return this;
  }

  public SpacesSearchTermResult addResListItem(SpacesSearchTerm resListItem) {
    if (this.resList == null) {
      this.resList = new ArrayList<>();
    }
    this.resList.add(resListItem);
    return this;
  }

  /**
   * A list of space search terms.
   * @return resList
   */
  @javax.annotation.Nullable
  public List<SpacesSearchTerm> getResList() {
    return resList;
  }

  public void setResList(List<SpacesSearchTerm> resList) {
    this.resList = resList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpacesSearchTermResult spacesSearchTermResult = (SpacesSearchTermResult) o;
    return Objects.equals(this.resList, spacesSearchTermResult.resList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpacesSearchTermResult {\n");
    sb.append("    resList: ").append(toIndentedString(resList)).append("\n");
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
    openapiFields.add("resList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SpacesSearchTermResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SpacesSearchTermResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpacesSearchTermResult is not found in the empty JSON string", SpacesSearchTermResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SpacesSearchTermResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpacesSearchTermResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("resList") != null && !jsonObj.get("resList").isJsonNull()) {
        JsonArray jsonArrayresList = jsonObj.getAsJsonArray("resList");
        if (jsonArrayresList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resList` to be an array in the JSON string but got `%s`", jsonObj.get("resList").toString()));
          }

          // validate the optional field `resList` (array)
          for (int i = 0; i < jsonArrayresList.size(); i++) {
            SpacesSearchTerm.validateJsonElement(jsonArrayresList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpacesSearchTermResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpacesSearchTermResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpacesSearchTermResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpacesSearchTermResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SpacesSearchTermResult>() {
           @Override
           public void write(JsonWriter out, SpacesSearchTermResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpacesSearchTermResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SpacesSearchTermResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SpacesSearchTermResult
   * @throws IOException if the JSON string is invalid with respect to SpacesSearchTermResult
   */
  public static SpacesSearchTermResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpacesSearchTermResult.class);
  }

  /**
   * Convert an instance of SpacesSearchTermResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

