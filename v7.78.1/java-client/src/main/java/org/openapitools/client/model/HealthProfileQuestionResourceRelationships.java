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
import org.openapitools.client.model.HealthProfileQuestionResourceRelationshipsAnswer;
import org.openapitools.client.model.HealthProfileQuestionResourceRelationshipsProfile;
import org.openapitools.client.model.HealthProfileQuestionResourceRelationshipsQuestionDefinition;

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
 * HealthProfileQuestionResourceRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:14.895652-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HealthProfileQuestionResourceRelationships {
  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private HealthProfileQuestionResourceRelationshipsAnswer answer;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private HealthProfileQuestionResourceRelationshipsProfile profile;

  public static final String SERIALIZED_NAME_QUESTION_DEFINITION = "question_definition";
  @SerializedName(SERIALIZED_NAME_QUESTION_DEFINITION)
  private HealthProfileQuestionResourceRelationshipsQuestionDefinition questionDefinition;

  public HealthProfileQuestionResourceRelationships() {
  }

  public HealthProfileQuestionResourceRelationships answer(HealthProfileQuestionResourceRelationshipsAnswer answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
   */
  @javax.annotation.Nullable
  public HealthProfileQuestionResourceRelationshipsAnswer getAnswer() {
    return answer;
  }

  public void setAnswer(HealthProfileQuestionResourceRelationshipsAnswer answer) {
    this.answer = answer;
  }


  public HealthProfileQuestionResourceRelationships profile(HealthProfileQuestionResourceRelationshipsProfile profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   */
  @javax.annotation.Nullable
  public HealthProfileQuestionResourceRelationshipsProfile getProfile() {
    return profile;
  }

  public void setProfile(HealthProfileQuestionResourceRelationshipsProfile profile) {
    this.profile = profile;
  }


  public HealthProfileQuestionResourceRelationships questionDefinition(HealthProfileQuestionResourceRelationshipsQuestionDefinition questionDefinition) {
    this.questionDefinition = questionDefinition;
    return this;
  }

  /**
   * Get questionDefinition
   * @return questionDefinition
   */
  @javax.annotation.Nullable
  public HealthProfileQuestionResourceRelationshipsQuestionDefinition getQuestionDefinition() {
    return questionDefinition;
  }

  public void setQuestionDefinition(HealthProfileQuestionResourceRelationshipsQuestionDefinition questionDefinition) {
    this.questionDefinition = questionDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthProfileQuestionResourceRelationships healthProfileQuestionResourceRelationships = (HealthProfileQuestionResourceRelationships) o;
    return Objects.equals(this.answer, healthProfileQuestionResourceRelationships.answer) &&
        Objects.equals(this.profile, healthProfileQuestionResourceRelationships.profile) &&
        Objects.equals(this.questionDefinition, healthProfileQuestionResourceRelationships.questionDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, profile, questionDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthProfileQuestionResourceRelationships {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    questionDefinition: ").append(toIndentedString(questionDefinition)).append("\n");
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
    openapiFields.add("answer");
    openapiFields.add("profile");
    openapiFields.add("question_definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HealthProfileQuestionResourceRelationships
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthProfileQuestionResourceRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthProfileQuestionResourceRelationships is not found in the empty JSON string", HealthProfileQuestionResourceRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthProfileQuestionResourceRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthProfileQuestionResourceRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `answer`
      if (jsonObj.get("answer") != null && !jsonObj.get("answer").isJsonNull()) {
        HealthProfileQuestionResourceRelationshipsAnswer.validateJsonElement(jsonObj.get("answer"));
      }
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        HealthProfileQuestionResourceRelationshipsProfile.validateJsonElement(jsonObj.get("profile"));
      }
      // validate the optional field `question_definition`
      if (jsonObj.get("question_definition") != null && !jsonObj.get("question_definition").isJsonNull()) {
        HealthProfileQuestionResourceRelationshipsQuestionDefinition.validateJsonElement(jsonObj.get("question_definition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthProfileQuestionResourceRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthProfileQuestionResourceRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthProfileQuestionResourceRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthProfileQuestionResourceRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthProfileQuestionResourceRelationships>() {
           @Override
           public void write(JsonWriter out, HealthProfileQuestionResourceRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthProfileQuestionResourceRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HealthProfileQuestionResourceRelationships given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HealthProfileQuestionResourceRelationships
   * @throws IOException if the JSON string is invalid with respect to HealthProfileQuestionResourceRelationships
   */
  public static HealthProfileQuestionResourceRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthProfileQuestionResourceRelationships.class);
  }

  /**
   * Convert an instance of HealthProfileQuestionResourceRelationships to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

