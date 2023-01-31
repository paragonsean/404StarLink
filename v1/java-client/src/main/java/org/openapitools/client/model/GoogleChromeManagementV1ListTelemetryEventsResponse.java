/*
 * Chrome Management API
 * The Chrome Management API is a suite of services that allows Chrome administrators to view, manage and gain insights on their Chrome OS and Chrome Browser devices.
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
import org.openapitools.client.model.GoogleChromeManagementV1TelemetryEvent;

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
 * Response message for listing telemetry events for a customer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:08.888155-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1ListTelemetryEventsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_TELEMETRY_EVENTS = "telemetryEvents";
  @SerializedName(SERIALIZED_NAME_TELEMETRY_EVENTS)
  private List<GoogleChromeManagementV1TelemetryEvent> telemetryEvents = new ArrayList<>();

  public GoogleChromeManagementV1ListTelemetryEventsResponse() {
  }

  public GoogleChromeManagementV1ListTelemetryEventsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token to specify next page in the list.
   * @return nextPageToken
   */
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GoogleChromeManagementV1ListTelemetryEventsResponse telemetryEvents(List<GoogleChromeManagementV1TelemetryEvent> telemetryEvents) {
    this.telemetryEvents = telemetryEvents;
    return this;
  }

  public GoogleChromeManagementV1ListTelemetryEventsResponse addTelemetryEventsItem(GoogleChromeManagementV1TelemetryEvent telemetryEventsItem) {
    if (this.telemetryEvents == null) {
      this.telemetryEvents = new ArrayList<>();
    }
    this.telemetryEvents.add(telemetryEventsItem);
    return this;
  }

  /**
   * Telemetry events returned in the response.
   * @return telemetryEvents
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1TelemetryEvent> getTelemetryEvents() {
    return telemetryEvents;
  }

  public void setTelemetryEvents(List<GoogleChromeManagementV1TelemetryEvent> telemetryEvents) {
    this.telemetryEvents = telemetryEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1ListTelemetryEventsResponse googleChromeManagementV1ListTelemetryEventsResponse = (GoogleChromeManagementV1ListTelemetryEventsResponse) o;
    return Objects.equals(this.nextPageToken, googleChromeManagementV1ListTelemetryEventsResponse.nextPageToken) &&
        Objects.equals(this.telemetryEvents, googleChromeManagementV1ListTelemetryEventsResponse.telemetryEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, telemetryEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1ListTelemetryEventsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    telemetryEvents: ").append(toIndentedString(telemetryEvents)).append("\n");
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
    openapiFields.add("telemetryEvents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1ListTelemetryEventsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1ListTelemetryEventsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1ListTelemetryEventsResponse is not found in the empty JSON string", GoogleChromeManagementV1ListTelemetryEventsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1ListTelemetryEventsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1ListTelemetryEventsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
      if (jsonObj.get("telemetryEvents") != null && !jsonObj.get("telemetryEvents").isJsonNull()) {
        JsonArray jsonArraytelemetryEvents = jsonObj.getAsJsonArray("telemetryEvents");
        if (jsonArraytelemetryEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("telemetryEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `telemetryEvents` to be an array in the JSON string but got `%s`", jsonObj.get("telemetryEvents").toString()));
          }

          // validate the optional field `telemetryEvents` (array)
          for (int i = 0; i < jsonArraytelemetryEvents.size(); i++) {
            GoogleChromeManagementV1TelemetryEvent.validateJsonElement(jsonArraytelemetryEvents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1ListTelemetryEventsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1ListTelemetryEventsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1ListTelemetryEventsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1ListTelemetryEventsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1ListTelemetryEventsResponse>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1ListTelemetryEventsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1ListTelemetryEventsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1ListTelemetryEventsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1ListTelemetryEventsResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1ListTelemetryEventsResponse
   */
  public static GoogleChromeManagementV1ListTelemetryEventsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1ListTelemetryEventsResponse.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1ListTelemetryEventsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

