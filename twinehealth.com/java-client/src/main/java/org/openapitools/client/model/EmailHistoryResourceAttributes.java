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
import org.openapitools.client.model.EmailHistoryResourceAttributesStatusTimes;

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
 * EmailHistoryResourceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:19.610481-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EmailHistoryResourceAttributes {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_TYPE = "email_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_TYPE)
  private String emailType;

  public static final String SERIALIZED_NAME_SEND_TIME = "send_time";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private String sendTime;

  public static final String SERIALIZED_NAME_STATUS_TIMES = "status_times";
  @SerializedName(SERIALIZED_NAME_STATUS_TIMES)
  private EmailHistoryResourceAttributesStatusTimes statusTimes;

  public static final String SERIALIZED_NAME_TWINE_EMAIL_ID = "twine_email_id";
  @SerializedName(SERIALIZED_NAME_TWINE_EMAIL_ID)
  private String twineEmailId;

  public EmailHistoryResourceAttributes() {
  }

  public EmailHistoryResourceAttributes emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Address email was sent to.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public EmailHistoryResourceAttributes emailType(String emailType) {
    this.emailType = emailType;
    return this;
  }

  /**
   * Type of email.
   * @return emailType
   */
  @javax.annotation.Nullable
  public String getEmailType() {
    return emailType;
  }

  public void setEmailType(String emailType) {
    this.emailType = emailType;
  }


  public EmailHistoryResourceAttributes sendTime(String sendTime) {
    this.sendTime = sendTime;
    return this;
  }

  /**
   * Time email was sent.
   * @return sendTime
   */
  @javax.annotation.Nullable
  public String getSendTime() {
    return sendTime;
  }

  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }


  public EmailHistoryResourceAttributes statusTimes(EmailHistoryResourceAttributesStatusTimes statusTimes) {
    this.statusTimes = statusTimes;
    return this;
  }

  /**
   * Get statusTimes
   * @return statusTimes
   */
  @javax.annotation.Nullable
  public EmailHistoryResourceAttributesStatusTimes getStatusTimes() {
    return statusTimes;
  }

  public void setStatusTimes(EmailHistoryResourceAttributesStatusTimes statusTimes) {
    this.statusTimes = statusTimes;
  }


  public EmailHistoryResourceAttributes twineEmailId(String twineEmailId) {
    this.twineEmailId = twineEmailId;
    return this;
  }

  /**
   * Unique identifier for this email.
   * @return twineEmailId
   */
  @javax.annotation.Nullable
  public String getTwineEmailId() {
    return twineEmailId;
  }

  public void setTwineEmailId(String twineEmailId) {
    this.twineEmailId = twineEmailId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailHistoryResourceAttributes emailHistoryResourceAttributes = (EmailHistoryResourceAttributes) o;
    return Objects.equals(this.emailAddress, emailHistoryResourceAttributes.emailAddress) &&
        Objects.equals(this.emailType, emailHistoryResourceAttributes.emailType) &&
        Objects.equals(this.sendTime, emailHistoryResourceAttributes.sendTime) &&
        Objects.equals(this.statusTimes, emailHistoryResourceAttributes.statusTimes) &&
        Objects.equals(this.twineEmailId, emailHistoryResourceAttributes.twineEmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailType, sendTime, statusTimes, twineEmailId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailHistoryResourceAttributes {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    statusTimes: ").append(toIndentedString(statusTimes)).append("\n");
    sb.append("    twineEmailId: ").append(toIndentedString(twineEmailId)).append("\n");
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
    openapiFields.add("email_address");
    openapiFields.add("email_type");
    openapiFields.add("send_time");
    openapiFields.add("status_times");
    openapiFields.add("twine_email_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailHistoryResourceAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailHistoryResourceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailHistoryResourceAttributes is not found in the empty JSON string", EmailHistoryResourceAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailHistoryResourceAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailHistoryResourceAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("email_type") != null && !jsonObj.get("email_type").isJsonNull()) && !jsonObj.get("email_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_type").toString()));
      }
      if ((jsonObj.get("send_time") != null && !jsonObj.get("send_time").isJsonNull()) && !jsonObj.get("send_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_time").toString()));
      }
      // validate the optional field `status_times`
      if (jsonObj.get("status_times") != null && !jsonObj.get("status_times").isJsonNull()) {
        EmailHistoryResourceAttributesStatusTimes.validateJsonElement(jsonObj.get("status_times"));
      }
      if ((jsonObj.get("twine_email_id") != null && !jsonObj.get("twine_email_id").isJsonNull()) && !jsonObj.get("twine_email_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twine_email_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twine_email_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailHistoryResourceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailHistoryResourceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailHistoryResourceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailHistoryResourceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailHistoryResourceAttributes>() {
           @Override
           public void write(JsonWriter out, EmailHistoryResourceAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailHistoryResourceAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailHistoryResourceAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailHistoryResourceAttributes
   * @throws IOException if the JSON string is invalid with respect to EmailHistoryResourceAttributes
   */
  public static EmailHistoryResourceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailHistoryResourceAttributes.class);
  }

  /**
   * Convert an instance of EmailHistoryResourceAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

