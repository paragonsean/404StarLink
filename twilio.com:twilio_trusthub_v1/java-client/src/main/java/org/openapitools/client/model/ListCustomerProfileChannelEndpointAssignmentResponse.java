/*
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.42.0
 * Contact: support@twilio.com
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
import org.openapitools.client.model.ListCustomerProfileResponseMeta;
import org.openapitools.client.model.TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment;

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
 * ListCustomerProfileChannelEndpointAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:26.050357-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListCustomerProfileChannelEndpointAssignmentResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListCustomerProfileResponseMeta meta;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment> results = new ArrayList<>();

  public ListCustomerProfileChannelEndpointAssignmentResponse() {
  }

  public ListCustomerProfileChannelEndpointAssignmentResponse meta(ListCustomerProfileResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public ListCustomerProfileResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCustomerProfileResponseMeta meta) {
    this.meta = meta;
  }


  public ListCustomerProfileChannelEndpointAssignmentResponse results(List<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment> results) {
    this.results = results;
    return this;
  }

  public ListCustomerProfileChannelEndpointAssignmentResponse addResultsItem(TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @javax.annotation.Nullable
  public List<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment> getResults() {
    return results;
  }

  public void setResults(List<TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomerProfileChannelEndpointAssignmentResponse listCustomerProfileChannelEndpointAssignmentResponse = (ListCustomerProfileChannelEndpointAssignmentResponse) o;
    return Objects.equals(this.meta, listCustomerProfileChannelEndpointAssignmentResponse.meta) &&
        Objects.equals(this.results, listCustomerProfileChannelEndpointAssignmentResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomerProfileChannelEndpointAssignmentResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListCustomerProfileChannelEndpointAssignmentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCustomerProfileChannelEndpointAssignmentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCustomerProfileChannelEndpointAssignmentResponse is not found in the empty JSON string", ListCustomerProfileChannelEndpointAssignmentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCustomerProfileChannelEndpointAssignmentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCustomerProfileChannelEndpointAssignmentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        ListCustomerProfileResponseMeta.validateJsonElement(jsonObj.get("meta"));
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCustomerProfileChannelEndpointAssignmentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCustomerProfileChannelEndpointAssignmentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCustomerProfileChannelEndpointAssignmentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCustomerProfileChannelEndpointAssignmentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCustomerProfileChannelEndpointAssignmentResponse>() {
           @Override
           public void write(JsonWriter out, ListCustomerProfileChannelEndpointAssignmentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCustomerProfileChannelEndpointAssignmentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListCustomerProfileChannelEndpointAssignmentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCustomerProfileChannelEndpointAssignmentResponse
   * @throws IOException if the JSON string is invalid with respect to ListCustomerProfileChannelEndpointAssignmentResponse
   */
  public static ListCustomerProfileChannelEndpointAssignmentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCustomerProfileChannelEndpointAssignmentResponse.class);
  }

  /**
   * Convert an instance of ListCustomerProfileChannelEndpointAssignmentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

