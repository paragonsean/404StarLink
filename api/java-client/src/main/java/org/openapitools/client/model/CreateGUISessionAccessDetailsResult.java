/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
 * Contact: mike.ralphson@gmail.com
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
import java.util.List;
import org.openapitools.client.model.Status;

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
 * CreateGUISessionAccessDetailsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateGUISessionAccessDetailsResult {
  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_PERCENTAGE_COMPLETE = "percentageComplete";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_COMPLETE)
  private Integer percentageComplete;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  private List sessions;

  public CreateGUISessionAccessDetailsResult() {
  }

  public CreateGUISessionAccessDetailsResult resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   */
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public CreateGUISessionAccessDetailsResult status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }


  public CreateGUISessionAccessDetailsResult percentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }

  /**
   * Get percentageComplete
   * @return percentageComplete
   */
  @javax.annotation.Nullable
  public Integer getPercentageComplete() {
    return percentageComplete;
  }

  public void setPercentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
  }


  public CreateGUISessionAccessDetailsResult failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public CreateGUISessionAccessDetailsResult sessions(List sessions) {
    this.sessions = sessions;
    return this;
  }

  /**
   * Get sessions
   * @return sessions
   */
  @javax.annotation.Nullable
  public List getSessions() {
    return sessions;
  }

  public void setSessions(List sessions) {
    this.sessions = sessions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGUISessionAccessDetailsResult createGUISessionAccessDetailsResult = (CreateGUISessionAccessDetailsResult) o;
    return Objects.equals(this.resourceName, createGUISessionAccessDetailsResult.resourceName) &&
        Objects.equals(this.status, createGUISessionAccessDetailsResult.status) &&
        Objects.equals(this.percentageComplete, createGUISessionAccessDetailsResult.percentageComplete) &&
        Objects.equals(this.failureReason, createGUISessionAccessDetailsResult.failureReason) &&
        Objects.equals(this.sessions, createGUISessionAccessDetailsResult.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, status, percentageComplete, failureReason, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGUISessionAccessDetailsResult {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
    openapiFields.add("resourceName");
    openapiFields.add("status");
    openapiFields.add("percentageComplete");
    openapiFields.add("failureReason");
    openapiFields.add("sessions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGUISessionAccessDetailsResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGUISessionAccessDetailsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGUISessionAccessDetailsResult is not found in the empty JSON string", CreateGUISessionAccessDetailsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGUISessionAccessDetailsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGUISessionAccessDetailsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `resourceName`
      if (jsonObj.get("resourceName") != null && !jsonObj.get("resourceName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("resourceName"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Status.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `percentageComplete`
      if (jsonObj.get("percentageComplete") != null && !jsonObj.get("percentageComplete").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("percentageComplete"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `sessions`
      if (jsonObj.get("sessions") != null && !jsonObj.get("sessions").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("sessions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGUISessionAccessDetailsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGUISessionAccessDetailsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGUISessionAccessDetailsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGUISessionAccessDetailsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGUISessionAccessDetailsResult>() {
           @Override
           public void write(JsonWriter out, CreateGUISessionAccessDetailsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGUISessionAccessDetailsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGUISessionAccessDetailsResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGUISessionAccessDetailsResult
   * @throws IOException if the JSON string is invalid with respect to CreateGUISessionAccessDetailsResult
   */
  public static CreateGUISessionAccessDetailsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGUISessionAccessDetailsResult.class);
  }

  /**
   * Convert an instance of CreateGUISessionAccessDetailsResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

