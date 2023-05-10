/*
 * Fitbit Plus API
 * # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 
 *
 * The version of the OpenAPI document: v7.78.1
 * Contact: apiteam@twinehealth.com
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
 * CalendarEventResourceAttributesAttendeesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:19.610481-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CalendarEventResourceAttributesAttendeesInner {
  /**
   * Status of responses from attendees
   */
  @JsonAdapter(ResponseStatusEnum.Adapter.class)
  public enum ResponseStatusEnum {
    NEEDS_ACTION("needsAction"),
    
    DECLINED("declined"),
    
    TENTATIVE("tentative"),
    
    ACCEPTED("accepted");

    private String value;

    ResponseStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseStatusEnum fromValue(String value) {
      for (ResponseStatusEnum b : ResponseStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResponseStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "response_status";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private ResponseStatusEnum responseStatus;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public CalendarEventResourceAttributesAttendeesInner() {
  }

  public CalendarEventResourceAttributesAttendeesInner responseStatus(ResponseStatusEnum responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

  /**
   * Status of responses from attendees
   * @return responseStatus
   */
  @javax.annotation.Nullable
  public ResponseStatusEnum getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(ResponseStatusEnum responseStatus) {
    this.responseStatus = responseStatus;
  }


  public CalendarEventResourceAttributesAttendeesInner user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEventResourceAttributesAttendeesInner calendarEventResourceAttributesAttendeesInner = (CalendarEventResourceAttributesAttendeesInner) o;
    return Objects.equals(this.responseStatus, calendarEventResourceAttributesAttendeesInner.responseStatus) &&
        Objects.equals(this.user, calendarEventResourceAttributesAttendeesInner.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventResourceAttributesAttendeesInner {\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("response_status");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CalendarEventResourceAttributesAttendeesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalendarEventResourceAttributesAttendeesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalendarEventResourceAttributesAttendeesInner is not found in the empty JSON string", CalendarEventResourceAttributesAttendeesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalendarEventResourceAttributesAttendeesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalendarEventResourceAttributesAttendeesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("response_status") != null && !jsonObj.get("response_status").isJsonNull()) && !jsonObj.get("response_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_status").toString()));
      }
      // validate the optional field `response_status`
      if (jsonObj.get("response_status") != null && !jsonObj.get("response_status").isJsonNull()) {
        ResponseStatusEnum.validateJsonElement(jsonObj.get("response_status"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalendarEventResourceAttributesAttendeesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalendarEventResourceAttributesAttendeesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalendarEventResourceAttributesAttendeesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalendarEventResourceAttributesAttendeesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CalendarEventResourceAttributesAttendeesInner>() {
           @Override
           public void write(JsonWriter out, CalendarEventResourceAttributesAttendeesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalendarEventResourceAttributesAttendeesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CalendarEventResourceAttributesAttendeesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CalendarEventResourceAttributesAttendeesInner
   * @throws IOException if the JSON string is invalid with respect to CalendarEventResourceAttributesAttendeesInner
   */
  public static CalendarEventResourceAttributesAttendeesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalendarEventResourceAttributesAttendeesInner.class);
  }

  /**
   * Convert an instance of CalendarEventResourceAttributesAttendeesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

