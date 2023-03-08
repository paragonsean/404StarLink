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
import org.openapitools.client.model.TrusthubV1TrustProductTrustProductChannelEndpointAssignment;

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
 * ListTrustProductChannelEndpointAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:57.920103-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ListTrustProductChannelEndpointAssignmentResponse {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListCustomerProfileResponseMeta meta;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<TrusthubV1TrustProductTrustProductChannelEndpointAssignment> results = new ArrayList<>();

  public ListTrustProductChannelEndpointAssignmentResponse() {
  }

  public ListTrustProductChannelEndpointAssignmentResponse meta(ListCustomerProfileResponseMeta meta) {
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


  public ListTrustProductChannelEndpointAssignmentResponse results(List<TrusthubV1TrustProductTrustProductChannelEndpointAssignment> results) {
    this.results = results;
    return this;
  }

  public ListTrustProductChannelEndpointAssignmentResponse addResultsItem(TrusthubV1TrustProductTrustProductChannelEndpointAssignment resultsItem) {
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
  public List<TrusthubV1TrustProductTrustProductChannelEndpointAssignment> getResults() {
    return results;
  }

  public void setResults(List<TrusthubV1TrustProductTrustProductChannelEndpointAssignment> results) {
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
    ListTrustProductChannelEndpointAssignmentResponse listTrustProductChannelEndpointAssignmentResponse = (ListTrustProductChannelEndpointAssignmentResponse) o;
    return Objects.equals(this.meta, listTrustProductChannelEndpointAssignmentResponse.meta) &&
        Objects.equals(this.results, listTrustProductChannelEndpointAssignmentResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTrustProductChannelEndpointAssignmentResponse {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ListTrustProductChannelEndpointAssignmentResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListTrustProductChannelEndpointAssignmentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTrustProductChannelEndpointAssignmentResponse is not found in the empty JSON string", ListTrustProductChannelEndpointAssignmentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListTrustProductChannelEndpointAssignmentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTrustProductChannelEndpointAssignmentResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            TrusthubV1TrustProductTrustProductChannelEndpointAssignment.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTrustProductChannelEndpointAssignmentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTrustProductChannelEndpointAssignmentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTrustProductChannelEndpointAssignmentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTrustProductChannelEndpointAssignmentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTrustProductChannelEndpointAssignmentResponse>() {
           @Override
           public void write(JsonWriter out, ListTrustProductChannelEndpointAssignmentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTrustProductChannelEndpointAssignmentResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListTrustProductChannelEndpointAssignmentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListTrustProductChannelEndpointAssignmentResponse
   * @throws IOException if the JSON string is invalid with respect to ListTrustProductChannelEndpointAssignmentResponse
   */
  public static ListTrustProductChannelEndpointAssignmentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTrustProductChannelEndpointAssignmentResponse.class);
  }

  /**
   * Convert an instance of ListTrustProductChannelEndpointAssignmentResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

