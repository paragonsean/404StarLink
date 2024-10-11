/*
 * Google Vault API
 * Retention and eDiscovery for Google Workspace. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege. For example, to download an export, an account needs the **Manage Exports** privilege and the matter shared with them. 
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
import org.openapitools.client.model.AddHeldAccountResult;

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
 * Response for batch create held accounts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:17:41.496021-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AddHeldAccountsResponse {
  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<AddHeldAccountResult> responses = new ArrayList<>();

  public AddHeldAccountsResponse() {
  }

  public AddHeldAccountsResponse responses(List<AddHeldAccountResult> responses) {
    this.responses = responses;
    return this;
  }

  public AddHeldAccountsResponse addResponsesItem(AddHeldAccountResult responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * The list of responses, in the same order as the batch request.
   * @return responses
   */
  @javax.annotation.Nullable
  public List<AddHeldAccountResult> getResponses() {
    return responses;
  }

  public void setResponses(List<AddHeldAccountResult> responses) {
    this.responses = responses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHeldAccountsResponse addHeldAccountsResponse = (AddHeldAccountsResponse) o;
    return Objects.equals(this.responses, addHeldAccountsResponse.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHeldAccountsResponse {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
    openapiFields.add("responses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddHeldAccountsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddHeldAccountsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddHeldAccountsResponse is not found in the empty JSON string", AddHeldAccountsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddHeldAccountsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddHeldAccountsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("responses") != null && !jsonObj.get("responses").isJsonNull()) {
        JsonArray jsonArrayresponses = jsonObj.getAsJsonArray("responses");
        if (jsonArrayresponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `responses` to be an array in the JSON string but got `%s`", jsonObj.get("responses").toString()));
          }

          // validate the optional field `responses` (array)
          for (int i = 0; i < jsonArrayresponses.size(); i++) {
            AddHeldAccountResult.validateJsonElement(jsonArrayresponses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddHeldAccountsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddHeldAccountsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddHeldAccountsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddHeldAccountsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AddHeldAccountsResponse>() {
           @Override
           public void write(JsonWriter out, AddHeldAccountsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddHeldAccountsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddHeldAccountsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddHeldAccountsResponse
   * @throws IOException if the JSON string is invalid with respect to AddHeldAccountsResponse
   */
  public static AddHeldAccountsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddHeldAccountsResponse.class);
  }

  /**
   * Convert an instance of AddHeldAccountsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

