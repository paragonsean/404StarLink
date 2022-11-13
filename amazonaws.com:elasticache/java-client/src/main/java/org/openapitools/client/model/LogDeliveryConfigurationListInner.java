/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import org.openapitools.client.model.DestinationType;
import org.openapitools.client.model.LogDeliveryConfigurationRequestDestinationDetails;
import org.openapitools.client.model.LogDeliveryConfigurationStatus;
import org.openapitools.client.model.LogFormat;
import org.openapitools.client.model.LogType;

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
 * LogDeliveryConfigurationListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LogDeliveryConfigurationListInner {
  public static final String SERIALIZED_NAME_LOG_TYPE = "LogType";
  @SerializedName(SERIALIZED_NAME_LOG_TYPE)
  private LogType logType;

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "DestinationType";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationType destinationType;

  public static final String SERIALIZED_NAME_DESTINATION_DETAILS = "DestinationDetails";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DETAILS)
  private LogDeliveryConfigurationRequestDestinationDetails destinationDetails;

  public static final String SERIALIZED_NAME_LOG_FORMAT = "LogFormat";
  @SerializedName(SERIALIZED_NAME_LOG_FORMAT)
  private LogFormat logFormat;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LogDeliveryConfigurationStatus status;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public LogDeliveryConfigurationListInner() {
  }

  public LogDeliveryConfigurationListInner logType(LogType logType) {
    this.logType = logType;
    return this;
  }

  /**
   * Get logType
   * @return logType
   */
  @javax.annotation.Nullable
  public LogType getLogType() {
    return logType;
  }

  public void setLogType(LogType logType) {
    this.logType = logType;
  }


  public LogDeliveryConfigurationListInner destinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  /**
   * Get destinationType
   * @return destinationType
   */
  @javax.annotation.Nullable
  public DestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public LogDeliveryConfigurationListInner destinationDetails(LogDeliveryConfigurationRequestDestinationDetails destinationDetails) {
    this.destinationDetails = destinationDetails;
    return this;
  }

  /**
   * Get destinationDetails
   * @return destinationDetails
   */
  @javax.annotation.Nullable
  public LogDeliveryConfigurationRequestDestinationDetails getDestinationDetails() {
    return destinationDetails;
  }

  public void setDestinationDetails(LogDeliveryConfigurationRequestDestinationDetails destinationDetails) {
    this.destinationDetails = destinationDetails;
  }


  public LogDeliveryConfigurationListInner logFormat(LogFormat logFormat) {
    this.logFormat = logFormat;
    return this;
  }

  /**
   * Get logFormat
   * @return logFormat
   */
  @javax.annotation.Nullable
  public LogFormat getLogFormat() {
    return logFormat;
  }

  public void setLogFormat(LogFormat logFormat) {
    this.logFormat = logFormat;
  }


  public LogDeliveryConfigurationListInner status(LogDeliveryConfigurationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public LogDeliveryConfigurationStatus getStatus() {
    return status;
  }

  public void setStatus(LogDeliveryConfigurationStatus status) {
    this.status = status;
  }


  public LogDeliveryConfigurationListInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogDeliveryConfigurationListInner logDeliveryConfigurationListInner = (LogDeliveryConfigurationListInner) o;
    return Objects.equals(this.logType, logDeliveryConfigurationListInner.logType) &&
        Objects.equals(this.destinationType, logDeliveryConfigurationListInner.destinationType) &&
        Objects.equals(this.destinationDetails, logDeliveryConfigurationListInner.destinationDetails) &&
        Objects.equals(this.logFormat, logDeliveryConfigurationListInner.logFormat) &&
        Objects.equals(this.status, logDeliveryConfigurationListInner.status) &&
        Objects.equals(this.message, logDeliveryConfigurationListInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logType, destinationType, destinationDetails, logFormat, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogDeliveryConfigurationListInner {\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destinationDetails: ").append(toIndentedString(destinationDetails)).append("\n");
    sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("LogType");
    openapiFields.add("DestinationType");
    openapiFields.add("DestinationDetails");
    openapiFields.add("LogFormat");
    openapiFields.add("Status");
    openapiFields.add("Message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LogDeliveryConfigurationListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogDeliveryConfigurationListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogDeliveryConfigurationListInner is not found in the empty JSON string", LogDeliveryConfigurationListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LogDeliveryConfigurationListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogDeliveryConfigurationListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `LogType`
      if (jsonObj.get("LogType") != null && !jsonObj.get("LogType").isJsonNull()) {
        LogType.validateJsonElement(jsonObj.get("LogType"));
      }
      // validate the optional field `DestinationType`
      if (jsonObj.get("DestinationType") != null && !jsonObj.get("DestinationType").isJsonNull()) {
        DestinationType.validateJsonElement(jsonObj.get("DestinationType"));
      }
      // validate the optional field `DestinationDetails`
      if (jsonObj.get("DestinationDetails") != null && !jsonObj.get("DestinationDetails").isJsonNull()) {
        LogDeliveryConfigurationRequestDestinationDetails.validateJsonElement(jsonObj.get("DestinationDetails"));
      }
      // validate the optional field `LogFormat`
      if (jsonObj.get("LogFormat") != null && !jsonObj.get("LogFormat").isJsonNull()) {
        LogFormat.validateJsonElement(jsonObj.get("LogFormat"));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        LogDeliveryConfigurationStatus.validateJsonElement(jsonObj.get("Status"));
      }
      // validate the optional field `Message`
      if (jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Message"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogDeliveryConfigurationListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogDeliveryConfigurationListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogDeliveryConfigurationListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogDeliveryConfigurationListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LogDeliveryConfigurationListInner>() {
           @Override
           public void write(JsonWriter out, LogDeliveryConfigurationListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogDeliveryConfigurationListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LogDeliveryConfigurationListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LogDeliveryConfigurationListInner
   * @throws IOException if the JSON string is invalid with respect to LogDeliveryConfigurationListInner
   */
  public static LogDeliveryConfigurationListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogDeliveryConfigurationListInner.class);
  }

  /**
   * Convert an instance of LogDeliveryConfigurationListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

