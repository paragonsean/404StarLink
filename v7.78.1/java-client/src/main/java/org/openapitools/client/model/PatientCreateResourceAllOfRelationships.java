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
import org.openapitools.client.model.PatientCreateResourceAllOfRelationshipsCoaches;
import org.openapitools.client.model.PatientCreateResourceAllOfRelationshipsGroups;

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
 * PatientCreateResourceAllOfRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:14.895652-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class PatientCreateResourceAllOfRelationships {
  public static final String SERIALIZED_NAME_COACHES = "coaches";
  @SerializedName(SERIALIZED_NAME_COACHES)
  private PatientCreateResourceAllOfRelationshipsCoaches coaches;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private PatientCreateResourceAllOfRelationshipsGroups groups;

  public PatientCreateResourceAllOfRelationships() {
  }

  public PatientCreateResourceAllOfRelationships coaches(PatientCreateResourceAllOfRelationshipsCoaches coaches) {
    this.coaches = coaches;
    return this;
  }

  /**
   * Get coaches
   * @return coaches
   */
  @javax.annotation.Nullable
  public PatientCreateResourceAllOfRelationshipsCoaches getCoaches() {
    return coaches;
  }

  public void setCoaches(PatientCreateResourceAllOfRelationshipsCoaches coaches) {
    this.coaches = coaches;
  }


  public PatientCreateResourceAllOfRelationships groups(PatientCreateResourceAllOfRelationshipsGroups groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @javax.annotation.Nonnull
  public PatientCreateResourceAllOfRelationshipsGroups getGroups() {
    return groups;
  }

  public void setGroups(PatientCreateResourceAllOfRelationshipsGroups groups) {
    this.groups = groups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientCreateResourceAllOfRelationships patientCreateResourceAllOfRelationships = (PatientCreateResourceAllOfRelationships) o;
    return Objects.equals(this.coaches, patientCreateResourceAllOfRelationships.coaches) &&
        Objects.equals(this.groups, patientCreateResourceAllOfRelationships.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coaches, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientCreateResourceAllOfRelationships {\n");
    sb.append("    coaches: ").append(toIndentedString(coaches)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("coaches");
    openapiFields.add("groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatientCreateResourceAllOfRelationships
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatientCreateResourceAllOfRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatientCreateResourceAllOfRelationships is not found in the empty JSON string", PatientCreateResourceAllOfRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatientCreateResourceAllOfRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatientCreateResourceAllOfRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PatientCreateResourceAllOfRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `coaches`
      if (jsonObj.get("coaches") != null && !jsonObj.get("coaches").isJsonNull()) {
        PatientCreateResourceAllOfRelationshipsCoaches.validateJsonElement(jsonObj.get("coaches"));
      }
      // validate the required field `groups`
      PatientCreateResourceAllOfRelationshipsGroups.validateJsonElement(jsonObj.get("groups"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatientCreateResourceAllOfRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatientCreateResourceAllOfRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatientCreateResourceAllOfRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatientCreateResourceAllOfRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<PatientCreateResourceAllOfRelationships>() {
           @Override
           public void write(JsonWriter out, PatientCreateResourceAllOfRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatientCreateResourceAllOfRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatientCreateResourceAllOfRelationships given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatientCreateResourceAllOfRelationships
   * @throws IOException if the JSON string is invalid with respect to PatientCreateResourceAllOfRelationships
   */
  public static PatientCreateResourceAllOfRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatientCreateResourceAllOfRelationships.class);
  }

  /**
   * Convert an instance of PatientCreateResourceAllOfRelationships to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

