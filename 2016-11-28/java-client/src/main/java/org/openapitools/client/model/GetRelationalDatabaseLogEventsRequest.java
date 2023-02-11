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
import java.time.OffsetDateTime;
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
 * GetRelationalDatabaseLogEventsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetRelationalDatabaseLogEventsRequest {
  public static final String SERIALIZED_NAME_RELATIONAL_DATABASE_NAME = "relationalDatabaseName";
  @SerializedName(SERIALIZED_NAME_RELATIONAL_DATABASE_NAME)
  private String relationalDatabaseName;

  public static final String SERIALIZED_NAME_LOG_STREAM_NAME = "logStreamName";
  @SerializedName(SERIALIZED_NAME_LOG_STREAM_NAME)
  private String logStreamName;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_START_FROM_HEAD = "startFromHead";
  @SerializedName(SERIALIZED_NAME_START_FROM_HEAD)
  private Boolean startFromHead;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public GetRelationalDatabaseLogEventsRequest() {
  }

  public GetRelationalDatabaseLogEventsRequest relationalDatabaseName(String relationalDatabaseName) {
    this.relationalDatabaseName = relationalDatabaseName;
    return this;
  }

  /**
   * Get relationalDatabaseName
   * @return relationalDatabaseName
   */
  @javax.annotation.Nonnull
  public String getRelationalDatabaseName() {
    return relationalDatabaseName;
  }

  public void setRelationalDatabaseName(String relationalDatabaseName) {
    this.relationalDatabaseName = relationalDatabaseName;
  }


  public GetRelationalDatabaseLogEventsRequest logStreamName(String logStreamName) {
    this.logStreamName = logStreamName;
    return this;
  }

  /**
   * Get logStreamName
   * @return logStreamName
   */
  @javax.annotation.Nonnull
  public String getLogStreamName() {
    return logStreamName;
  }

  public void setLogStreamName(String logStreamName) {
    this.logStreamName = logStreamName;
  }


  public GetRelationalDatabaseLogEventsRequest startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public GetRelationalDatabaseLogEventsRequest endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public GetRelationalDatabaseLogEventsRequest startFromHead(Boolean startFromHead) {
    this.startFromHead = startFromHead;
    return this;
  }

  /**
   * Get startFromHead
   * @return startFromHead
   */
  @javax.annotation.Nullable
  public Boolean getStartFromHead() {
    return startFromHead;
  }

  public void setStartFromHead(Boolean startFromHead) {
    this.startFromHead = startFromHead;
  }


  public GetRelationalDatabaseLogEventsRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest = (GetRelationalDatabaseLogEventsRequest) o;
    return Objects.equals(this.relationalDatabaseName, getRelationalDatabaseLogEventsRequest.relationalDatabaseName) &&
        Objects.equals(this.logStreamName, getRelationalDatabaseLogEventsRequest.logStreamName) &&
        Objects.equals(this.startTime, getRelationalDatabaseLogEventsRequest.startTime) &&
        Objects.equals(this.endTime, getRelationalDatabaseLogEventsRequest.endTime) &&
        Objects.equals(this.startFromHead, getRelationalDatabaseLogEventsRequest.startFromHead) &&
        Objects.equals(this.pageToken, getRelationalDatabaseLogEventsRequest.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationalDatabaseName, logStreamName, startTime, endTime, startFromHead, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRelationalDatabaseLogEventsRequest {\n");
    sb.append("    relationalDatabaseName: ").append(toIndentedString(relationalDatabaseName)).append("\n");
    sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startFromHead: ").append(toIndentedString(startFromHead)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
    openapiFields.add("relationalDatabaseName");
    openapiFields.add("logStreamName");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("startFromHead");
    openapiFields.add("pageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("relationalDatabaseName");
    openapiRequiredFields.add("logStreamName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRelationalDatabaseLogEventsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRelationalDatabaseLogEventsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRelationalDatabaseLogEventsRequest is not found in the empty JSON string", GetRelationalDatabaseLogEventsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRelationalDatabaseLogEventsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRelationalDatabaseLogEventsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetRelationalDatabaseLogEventsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `relationalDatabaseName`
      String.validateJsonElement(jsonObj.get("relationalDatabaseName"));
      // validate the required field `logStreamName`
      String.validateJsonElement(jsonObj.get("logStreamName"));
      // validate the optional field `startTime`
      if (jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("startTime"));
      }
      // validate the optional field `endTime`
      if (jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("endTime"));
      }
      // validate the optional field `startFromHead`
      if (jsonObj.get("startFromHead") != null && !jsonObj.get("startFromHead").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("startFromHead"));
      }
      // validate the optional field `pageToken`
      if (jsonObj.get("pageToken") != null && !jsonObj.get("pageToken").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("pageToken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRelationalDatabaseLogEventsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRelationalDatabaseLogEventsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRelationalDatabaseLogEventsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRelationalDatabaseLogEventsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRelationalDatabaseLogEventsRequest>() {
           @Override
           public void write(JsonWriter out, GetRelationalDatabaseLogEventsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRelationalDatabaseLogEventsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRelationalDatabaseLogEventsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRelationalDatabaseLogEventsRequest
   * @throws IOException if the JSON string is invalid with respect to GetRelationalDatabaseLogEventsRequest
   */
  public static GetRelationalDatabaseLogEventsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRelationalDatabaseLogEventsRequest.class);
  }

  /**
   * Convert an instance of GetRelationalDatabaseLogEventsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

