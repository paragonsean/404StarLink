/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.4
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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EndpointCreatedEventData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:51.491731-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EndpointCreatedEventData {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_UID = "appUid";
  @SerializedName(SERIALIZED_NAME_APP_UID)
  private String appUid;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_ENDPOINT_UID = "endpointUid";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_UID)
  private String endpointUid;

  public EndpointCreatedEventData() {
  }

  public EndpointCreatedEventData appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
   */
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  public EndpointCreatedEventData appUid(String appUid) {
    this.appUid = appUid;
    return this;
  }

  /**
   * Optional unique identifier for the application
   * @return appUid
   */
  @javax.annotation.Nullable
  public String getAppUid() {
    return appUid;
  }

  public void setAppUid(String appUid) {
    this.appUid = appUid;
  }


  public EndpointCreatedEventData endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  /**
   * Get endpointId
   * @return endpointId
   */
  @javax.annotation.Nonnull
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public EndpointCreatedEventData endpointUid(String endpointUid) {
    this.endpointUid = endpointUid;
    return this;
  }

  /**
   * Optional unique identifier for the endpoint
   * @return endpointUid
   */
  @javax.annotation.Nullable
  public String getEndpointUid() {
    return endpointUid;
  }

  public void setEndpointUid(String endpointUid) {
    this.endpointUid = endpointUid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointCreatedEventData endpointCreatedEventData = (EndpointCreatedEventData) o;
    return Objects.equals(this.appId, endpointCreatedEventData.appId) &&
        Objects.equals(this.appUid, endpointCreatedEventData.appUid) &&
        Objects.equals(this.endpointId, endpointCreatedEventData.endpointId) &&
        Objects.equals(this.endpointUid, endpointCreatedEventData.endpointUid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appUid, endpointId, endpointUid);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointCreatedEventData {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    endpointUid: ").append(toIndentedString(endpointUid)).append("\n");
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
    openapiFields.add("appId");
    openapiFields.add("appUid");
    openapiFields.add("endpointId");
    openapiFields.add("endpointUid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appId");
    openapiRequiredFields.add("endpointId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointCreatedEventData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointCreatedEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointCreatedEventData is not found in the empty JSON string", EndpointCreatedEventData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointCreatedEventData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointCreatedEventData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointCreatedEventData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      if ((jsonObj.get("appUid") != null && !jsonObj.get("appUid").isJsonNull()) && !jsonObj.get("appUid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appUid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appUid").toString()));
      }
      if (!jsonObj.get("endpointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointId").toString()));
      }
      if ((jsonObj.get("endpointUid") != null && !jsonObj.get("endpointUid").isJsonNull()) && !jsonObj.get("endpointUid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointUid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointUid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointCreatedEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointCreatedEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointCreatedEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointCreatedEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointCreatedEventData>() {
           @Override
           public void write(JsonWriter out, EndpointCreatedEventData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointCreatedEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointCreatedEventData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointCreatedEventData
   * @throws IOException if the JSON string is invalid with respect to EndpointCreatedEventData
   */
  public static EndpointCreatedEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointCreatedEventData.class);
  }

  /**
   * Convert an instance of EndpointCreatedEventData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

