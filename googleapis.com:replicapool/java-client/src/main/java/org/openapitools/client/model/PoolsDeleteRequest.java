/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
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
 * PoolsDeleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:07:17.760215-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PoolsDeleteRequest {
  public static final String SERIALIZED_NAME_ABANDON_INSTANCES = "abandonInstances";
  @SerializedName(SERIALIZED_NAME_ABANDON_INSTANCES)
  private List<String> abandonInstances = new ArrayList<>();

  public PoolsDeleteRequest() {
  }

  public PoolsDeleteRequest abandonInstances(List<String> abandonInstances) {
    this.abandonInstances = abandonInstances;
    return this;
  }

  public PoolsDeleteRequest addAbandonInstancesItem(String abandonInstancesItem) {
    if (this.abandonInstances == null) {
      this.abandonInstances = new ArrayList<>();
    }
    this.abandonInstances.add(abandonInstancesItem);
    return this;
  }

  /**
   * If there are instances you would like to keep, you can specify them here. These instances won&#39;t be deleted, but the associated replica objects will be removed.
   * @return abandonInstances
   */
  @javax.annotation.Nullable
  public List<String> getAbandonInstances() {
    return abandonInstances;
  }

  public void setAbandonInstances(List<String> abandonInstances) {
    this.abandonInstances = abandonInstances;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsDeleteRequest poolsDeleteRequest = (PoolsDeleteRequest) o;
    return Objects.equals(this.abandonInstances, poolsDeleteRequest.abandonInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsDeleteRequest {\n");
    sb.append("    abandonInstances: ").append(toIndentedString(abandonInstances)).append("\n");
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
    openapiFields.add("abandonInstances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PoolsDeleteRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PoolsDeleteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PoolsDeleteRequest is not found in the empty JSON string", PoolsDeleteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PoolsDeleteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PoolsDeleteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("abandonInstances") != null && !jsonObj.get("abandonInstances").isJsonNull() && !jsonObj.get("abandonInstances").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `abandonInstances` to be an array in the JSON string but got `%s`", jsonObj.get("abandonInstances").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PoolsDeleteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PoolsDeleteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PoolsDeleteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PoolsDeleteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PoolsDeleteRequest>() {
           @Override
           public void write(JsonWriter out, PoolsDeleteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PoolsDeleteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PoolsDeleteRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PoolsDeleteRequest
   * @throws IOException if the JSON string is invalid with respect to PoolsDeleteRequest
   */
  public static PoolsDeleteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PoolsDeleteRequest.class);
  }

  /**
   * Convert an instance of PoolsDeleteRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

