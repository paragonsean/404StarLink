/*
 * Amazon CloudWatch Events
 * <p>Amazon EventBridge helps you to respond to state changes in your Amazon Web Services resources. When your resources change state, they automatically send events to an event stream. You can create rules that match selected events in the stream and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For example, you can configure rules to:</p> <ul> <li> <p>Automatically invoke an Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance enters the running state.</p> </li> <li> <p>Direct specific API records from CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential security or availability risks.</p> </li> <li> <p>Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume.</p> </li> </ul> <p>For more information about the features of Amazon EventBridge, see the <a href=\"https://docs.aws.amazon.com/eventbridge/latest/userguide\">Amazon EventBridge User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2015-10-07
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
import org.openapitools.client.model.ApiDestinationHttpMethod;
import org.openapitools.client.model.ApiDestinationState;

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
 * Contains details about an API destination.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiDestination {
  public static final String SERIALIZED_NAME_API_DESTINATION_ARN = "ApiDestinationArn";
  @SerializedName(SERIALIZED_NAME_API_DESTINATION_ARN)
  private String apiDestinationArn;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_API_DESTINATION_STATE = "ApiDestinationState";
  @SerializedName(SERIALIZED_NAME_API_DESTINATION_STATE)
  private ApiDestinationState apiDestinationState;

  public static final String SERIALIZED_NAME_CONNECTION_ARN = "ConnectionArn";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ARN)
  private String connectionArn;

  public static final String SERIALIZED_NAME_INVOCATION_ENDPOINT = "InvocationEndpoint";
  @SerializedName(SERIALIZED_NAME_INVOCATION_ENDPOINT)
  private String invocationEndpoint;

  public static final String SERIALIZED_NAME_HTTP_METHOD = "HttpMethod";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private ApiDestinationHttpMethod httpMethod;

  public static final String SERIALIZED_NAME_INVOCATION_RATE_LIMIT_PER_SECOND = "InvocationRateLimitPerSecond";
  @SerializedName(SERIALIZED_NAME_INVOCATION_RATE_LIMIT_PER_SECOND)
  private Integer invocationRateLimitPerSecond;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "LastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private OffsetDateTime lastModifiedTime;

  public ApiDestination() {
  }

  public ApiDestination apiDestinationArn(String apiDestinationArn) {
    this.apiDestinationArn = apiDestinationArn;
    return this;
  }

  /**
   * Get apiDestinationArn
   * @return apiDestinationArn
   */
  @javax.annotation.Nullable
  public String getApiDestinationArn() {
    return apiDestinationArn;
  }

  public void setApiDestinationArn(String apiDestinationArn) {
    this.apiDestinationArn = apiDestinationArn;
  }


  public ApiDestination name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ApiDestination apiDestinationState(ApiDestinationState apiDestinationState) {
    this.apiDestinationState = apiDestinationState;
    return this;
  }

  /**
   * Get apiDestinationState
   * @return apiDestinationState
   */
  @javax.annotation.Nullable
  public ApiDestinationState getApiDestinationState() {
    return apiDestinationState;
  }

  public void setApiDestinationState(ApiDestinationState apiDestinationState) {
    this.apiDestinationState = apiDestinationState;
  }


  public ApiDestination connectionArn(String connectionArn) {
    this.connectionArn = connectionArn;
    return this;
  }

  /**
   * Get connectionArn
   * @return connectionArn
   */
  @javax.annotation.Nullable
  public String getConnectionArn() {
    return connectionArn;
  }

  public void setConnectionArn(String connectionArn) {
    this.connectionArn = connectionArn;
  }


  public ApiDestination invocationEndpoint(String invocationEndpoint) {
    this.invocationEndpoint = invocationEndpoint;
    return this;
  }

  /**
   * Get invocationEndpoint
   * @return invocationEndpoint
   */
  @javax.annotation.Nullable
  public String getInvocationEndpoint() {
    return invocationEndpoint;
  }

  public void setInvocationEndpoint(String invocationEndpoint) {
    this.invocationEndpoint = invocationEndpoint;
  }


  public ApiDestination httpMethod(ApiDestinationHttpMethod httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * Get httpMethod
   * @return httpMethod
   */
  @javax.annotation.Nullable
  public ApiDestinationHttpMethod getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(ApiDestinationHttpMethod httpMethod) {
    this.httpMethod = httpMethod;
  }


  public ApiDestination invocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
    this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
    return this;
  }

  /**
   * Get invocationRateLimitPerSecond
   * @return invocationRateLimitPerSecond
   */
  @javax.annotation.Nullable
  public Integer getInvocationRateLimitPerSecond() {
    return invocationRateLimitPerSecond;
  }

  public void setInvocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
    this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
  }


  public ApiDestination creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public ApiDestination lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   * @return lastModifiedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDestination apiDestination = (ApiDestination) o;
    return Objects.equals(this.apiDestinationArn, apiDestination.apiDestinationArn) &&
        Objects.equals(this.name, apiDestination.name) &&
        Objects.equals(this.apiDestinationState, apiDestination.apiDestinationState) &&
        Objects.equals(this.connectionArn, apiDestination.connectionArn) &&
        Objects.equals(this.invocationEndpoint, apiDestination.invocationEndpoint) &&
        Objects.equals(this.httpMethod, apiDestination.httpMethod) &&
        Objects.equals(this.invocationRateLimitPerSecond, apiDestination.invocationRateLimitPerSecond) &&
        Objects.equals(this.creationTime, apiDestination.creationTime) &&
        Objects.equals(this.lastModifiedTime, apiDestination.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiDestinationArn, name, apiDestinationState, connectionArn, invocationEndpoint, httpMethod, invocationRateLimitPerSecond, creationTime, lastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDestination {\n");
    sb.append("    apiDestinationArn: ").append(toIndentedString(apiDestinationArn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiDestinationState: ").append(toIndentedString(apiDestinationState)).append("\n");
    sb.append("    connectionArn: ").append(toIndentedString(connectionArn)).append("\n");
    sb.append("    invocationEndpoint: ").append(toIndentedString(invocationEndpoint)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    invocationRateLimitPerSecond: ").append(toIndentedString(invocationRateLimitPerSecond)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
    openapiFields.add("ApiDestinationArn");
    openapiFields.add("Name");
    openapiFields.add("ApiDestinationState");
    openapiFields.add("ConnectionArn");
    openapiFields.add("InvocationEndpoint");
    openapiFields.add("HttpMethod");
    openapiFields.add("InvocationRateLimitPerSecond");
    openapiFields.add("CreationTime");
    openapiFields.add("LastModifiedTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiDestination
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiDestination is not found in the empty JSON string", ApiDestination.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiDestination.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiDestination` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ApiDestinationArn`
      if (jsonObj.get("ApiDestinationArn") != null && !jsonObj.get("ApiDestinationArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ApiDestinationArn"));
      }
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `ApiDestinationState`
      if (jsonObj.get("ApiDestinationState") != null && !jsonObj.get("ApiDestinationState").isJsonNull()) {
        ApiDestinationState.validateJsonElement(jsonObj.get("ApiDestinationState"));
      }
      // validate the optional field `ConnectionArn`
      if (jsonObj.get("ConnectionArn") != null && !jsonObj.get("ConnectionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ConnectionArn"));
      }
      // validate the optional field `InvocationEndpoint`
      if (jsonObj.get("InvocationEndpoint") != null && !jsonObj.get("InvocationEndpoint").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("InvocationEndpoint"));
      }
      // validate the optional field `HttpMethod`
      if (jsonObj.get("HttpMethod") != null && !jsonObj.get("HttpMethod").isJsonNull()) {
        ApiDestinationHttpMethod.validateJsonElement(jsonObj.get("HttpMethod"));
      }
      // validate the optional field `InvocationRateLimitPerSecond`
      if (jsonObj.get("InvocationRateLimitPerSecond") != null && !jsonObj.get("InvocationRateLimitPerSecond").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("InvocationRateLimitPerSecond"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreationTime"));
      }
      // validate the optional field `LastModifiedTime`
      if (jsonObj.get("LastModifiedTime") != null && !jsonObj.get("LastModifiedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastModifiedTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiDestination>() {
           @Override
           public void write(JsonWriter out, ApiDestination value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiDestination given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiDestination
   * @throws IOException if the JSON string is invalid with respect to ApiDestination
   */
  public static ApiDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiDestination.class);
  }

  /**
   * Convert an instance of ApiDestination to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

