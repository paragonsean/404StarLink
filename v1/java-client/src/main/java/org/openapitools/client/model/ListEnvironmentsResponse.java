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
import org.openapitools.client.model.Environment;

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
 * Response for listing environments.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:43.451204-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListEnvironmentsResponse {
  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<Environment> environments = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_UNREACHABLE = "unreachable";
  @SerializedName(SERIALIZED_NAME_UNREACHABLE)
  private List<String> unreachable = new ArrayList<>();

  public ListEnvironmentsResponse() {
  }

  public ListEnvironmentsResponse environments(List<Environment> environments) {
    this.environments = environments;
    return this;
  }

  public ListEnvironmentsResponse addEnvironmentsItem(Environment environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * A list of returned environments.
   * @return environments
   */
  @javax.annotation.Nullable
  public List<Environment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }


  public ListEnvironmentsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A page token that can be used to continue listing from the last result in the next list call.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public ListEnvironmentsResponse unreachable(List<String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  public ListEnvironmentsResponse addUnreachableItem(String unreachableItem) {
    if (this.unreachable == null) {
      this.unreachable = new ArrayList<>();
    }
    this.unreachable.add(unreachableItem);
    return this;
  }

  /**
   * Locations that could not be reached.
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
    ListEnvironmentsResponse listEnvironmentsResponse = (ListEnvironmentsResponse) o;
    return Objects.equals(this.environments, listEnvironmentsResponse.environments) &&
        Objects.equals(this.nextPageToken, listEnvironmentsResponse.nextPageToken) &&
        Objects.equals(this.unreachable, listEnvironmentsResponse.unreachable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments, nextPageToken, unreachable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnvironmentsResponse {\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("environments");
    openapiFields.add("nextPageToken");
    openapiFields.add("unreachable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListEnvironmentsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListEnvironmentsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListEnvironmentsResponse is not found in the empty JSON string", ListEnvironmentsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListEnvironmentsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListEnvironmentsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("environments") != null && !jsonObj.get("environments").isJsonNull()) {
        JsonArray jsonArrayenvironments = jsonObj.getAsJsonArray("environments");
        if (jsonArrayenvironments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("environments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
          }

          // validate the optional field `environments` (array)
          for (int i = 0; i < jsonArrayenvironments.size(); i++) {
            Environment.validateJsonElement(jsonArrayenvironments.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
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
       if (!ListEnvironmentsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListEnvironmentsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListEnvironmentsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListEnvironmentsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListEnvironmentsResponse>() {
           @Override
           public void write(JsonWriter out, ListEnvironmentsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListEnvironmentsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListEnvironmentsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListEnvironmentsResponse
   * @throws IOException if the JSON string is invalid with respect to ListEnvironmentsResponse
   */
  public static ListEnvironmentsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListEnvironmentsResponse.class);
  }

  /**
   * Convert an instance of ListEnvironmentsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

