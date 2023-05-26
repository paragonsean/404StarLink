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
import org.openapitools.client.model.ConnectionState;

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
 * DeauthorizeConnectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:12.954271-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DeauthorizeConnectionResponse {
  public static final String SERIALIZED_NAME_CONNECTION_ARN = "ConnectionArn";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ARN)
  private String connectionArn;

  public static final String SERIALIZED_NAME_CONNECTION_STATE = "ConnectionState";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATE)
  private ConnectionState connectionState;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_TIME = "LastModifiedTime";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_TIME)
  private OffsetDateTime lastModifiedTime;

  public static final String SERIALIZED_NAME_LAST_AUTHORIZED_TIME = "LastAuthorizedTime";
  @SerializedName(SERIALIZED_NAME_LAST_AUTHORIZED_TIME)
  private OffsetDateTime lastAuthorizedTime;

  public DeauthorizeConnectionResponse() {
  }

  public DeauthorizeConnectionResponse connectionArn(String connectionArn) {
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


  public DeauthorizeConnectionResponse connectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  /**
   * Get connectionState
   * @return connectionState
   */
  @javax.annotation.Nullable
  public ConnectionState getConnectionState() {
    return connectionState;
  }

  public void setConnectionState(ConnectionState connectionState) {
    this.connectionState = connectionState;
  }


  public DeauthorizeConnectionResponse creationTime(OffsetDateTime creationTime) {
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


  public DeauthorizeConnectionResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
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


  public DeauthorizeConnectionResponse lastAuthorizedTime(OffsetDateTime lastAuthorizedTime) {
    this.lastAuthorizedTime = lastAuthorizedTime;
    return this;
  }

  /**
   * Get lastAuthorizedTime
   * @return lastAuthorizedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastAuthorizedTime() {
    return lastAuthorizedTime;
  }

  public void setLastAuthorizedTime(OffsetDateTime lastAuthorizedTime) {
    this.lastAuthorizedTime = lastAuthorizedTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeauthorizeConnectionResponse deauthorizeConnectionResponse = (DeauthorizeConnectionResponse) o;
    return Objects.equals(this.connectionArn, deauthorizeConnectionResponse.connectionArn) &&
        Objects.equals(this.connectionState, deauthorizeConnectionResponse.connectionState) &&
        Objects.equals(this.creationTime, deauthorizeConnectionResponse.creationTime) &&
        Objects.equals(this.lastModifiedTime, deauthorizeConnectionResponse.lastModifiedTime) &&
        Objects.equals(this.lastAuthorizedTime, deauthorizeConnectionResponse.lastAuthorizedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionArn, connectionState, creationTime, lastModifiedTime, lastAuthorizedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeauthorizeConnectionResponse {\n");
    sb.append("    connectionArn: ").append(toIndentedString(connectionArn)).append("\n");
    sb.append("    connectionState: ").append(toIndentedString(connectionState)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    lastAuthorizedTime: ").append(toIndentedString(lastAuthorizedTime)).append("\n");
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
    openapiFields.add("ConnectionArn");
    openapiFields.add("ConnectionState");
    openapiFields.add("CreationTime");
    openapiFields.add("LastModifiedTime");
    openapiFields.add("LastAuthorizedTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeauthorizeConnectionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeauthorizeConnectionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeauthorizeConnectionResponse is not found in the empty JSON string", DeauthorizeConnectionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeauthorizeConnectionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeauthorizeConnectionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ConnectionArn`
      if (jsonObj.get("ConnectionArn") != null && !jsonObj.get("ConnectionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ConnectionArn"));
      }
      // validate the optional field `ConnectionState`
      if (jsonObj.get("ConnectionState") != null && !jsonObj.get("ConnectionState").isJsonNull()) {
        ConnectionState.validateJsonElement(jsonObj.get("ConnectionState"));
      }
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreationTime"));
      }
      // validate the optional field `LastModifiedTime`
      if (jsonObj.get("LastModifiedTime") != null && !jsonObj.get("LastModifiedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastModifiedTime"));
      }
      // validate the optional field `LastAuthorizedTime`
      if (jsonObj.get("LastAuthorizedTime") != null && !jsonObj.get("LastAuthorizedTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("LastAuthorizedTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeauthorizeConnectionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeauthorizeConnectionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeauthorizeConnectionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeauthorizeConnectionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeauthorizeConnectionResponse>() {
           @Override
           public void write(JsonWriter out, DeauthorizeConnectionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeauthorizeConnectionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeauthorizeConnectionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeauthorizeConnectionResponse
   * @throws IOException if the JSON string is invalid with respect to DeauthorizeConnectionResponse
   */
  public static DeauthorizeConnectionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeauthorizeConnectionResponse.class);
  }

  /**
   * Convert an instance of DeauthorizeConnectionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

