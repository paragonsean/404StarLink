/*
 * Notebooks API
 * Notebooks API is used to manage notebook resources in Google Cloud.
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
import org.openapitools.client.model.Runtime;

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
 * Response for listing Managed Notebook Runtimes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:43.451204-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListRuntimesResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_RUNTIMES = "runtimes";
  @SerializedName(SERIALIZED_NAME_RUNTIMES)
  private List<Runtime> runtimes = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNREACHABLE = "unreachable";
  @SerializedName(SERIALIZED_NAME_UNREACHABLE)
  private List<String> unreachable = new ArrayList<>();

  public ListRuntimesResponse() {
  }

  public ListRuntimesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Page token that can be used to continue listing from the last result in the next list call.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListRuntimesResponse runtimes(List<Runtime> runtimes) {
    this.runtimes = runtimes;
    return this;
  }

  public ListRuntimesResponse addRuntimesItem(Runtime runtimesItem) {
    if (this.runtimes == null) {
      this.runtimes = new ArrayList<>();
    }
    this.runtimes.add(runtimesItem);
    return this;
  }

  /**
   * A list of returned Runtimes.
   * @return runtimes
   */
  @javax.annotation.Nullable
  public List<Runtime> getRuntimes() {
    return runtimes;
  }

  public void setRuntimes(List<Runtime> runtimes) {
    this.runtimes = runtimes;
  }


  public ListRuntimesResponse unreachable(List<String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  public ListRuntimesResponse addUnreachableItem(String unreachableItem) {
    if (this.unreachable == null) {
      this.unreachable = new ArrayList<>();
    }
    this.unreachable.add(unreachableItem);
    return this;
  }

  /**
   * Locations that could not be reached. For example, &#x60;[&#39;us-west1&#39;, &#39;us-central1&#39;]&#x60;. A ListRuntimesResponse will only contain either runtimes or unreachables,
   * @return unreachable
   */
  @javax.annotation.Nullable
  public List<String> getUnreachable() {
    return unreachable;
  }

  public void setUnreachable(List<String> unreachable) {
    this.unreachable = unreachable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRuntimesResponse listRuntimesResponse = (ListRuntimesResponse) o;
    return Objects.equals(this.nextPageToken, listRuntimesResponse.nextPageToken) &&
        Objects.equals(this.runtimes, listRuntimesResponse.runtimes) &&
        Objects.equals(this.unreachable, listRuntimesResponse.unreachable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runtimes, unreachable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRuntimesResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    runtimes: ").append(toIndentedString(runtimes)).append("\n");
    sb.append("    unreachable: ").append(toIndentedString(unreachable)).append("\n");
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
    openapiFields.add("runtimes");
    openapiFields.add("unreachable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRuntimesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRuntimesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRuntimesResponse is not found in the empty JSON string", ListRuntimesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListRuntimesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListRuntimesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("runtimes") != null && !jsonObj.get("runtimes").isJsonNull()) {
        JsonArray jsonArrayruntimes = jsonObj.getAsJsonArray("runtimes");
        if (jsonArrayruntimes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runtimes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runtimes` to be an array in the JSON string but got `%s`", jsonObj.get("runtimes").toString()));
          }

          // validate the optional field `runtimes` (array)
          for (int i = 0; i < jsonArrayruntimes.size(); i++) {
            Runtime.validateJsonElement(jsonArrayruntimes.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unreachable") != null && !jsonObj.get("unreachable").isJsonNull() && !jsonObj.get("unreachable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unreachable` to be an array in the JSON string but got `%s`", jsonObj.get("unreachable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRuntimesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRuntimesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRuntimesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRuntimesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRuntimesResponse>() {
           @Override
           public void write(JsonWriter out, ListRuntimesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRuntimesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRuntimesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRuntimesResponse
   * @throws IOException if the JSON string is invalid with respect to ListRuntimesResponse
   */
  public static ListRuntimesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRuntimesResponse.class);
  }

  /**
   * Convert an instance of ListRuntimesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

