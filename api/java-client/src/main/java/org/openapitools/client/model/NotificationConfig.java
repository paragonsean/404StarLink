/*
 * Storage Transfer API
 * Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
 *
 * The version of the OpenAPI document: v1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Specification to configure notifications published to Pub/Sub. Notifications are published to the customer-provided topic using the following &#x60;PubsubMessage.attributes&#x60;: * &#x60;\&quot;eventType\&quot;&#x60;: one of the EventType values * &#x60;\&quot;payloadFormat\&quot;&#x60;: one of the PayloadFormat values * &#x60;\&quot;projectId\&quot;&#x60;: the project_id of the &#x60;TransferOperation&#x60; * &#x60;\&quot;transferJobName\&quot;&#x60;: the transfer_job_name of the &#x60;TransferOperation&#x60; * &#x60;\&quot;transferOperationName\&quot;&#x60;: the name of the &#x60;TransferOperation&#x60; The &#x60;PubsubMessage.data&#x60; contains a TransferOperation resource formatted according to the specified &#x60;PayloadFormat&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:32.119462-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class NotificationConfig {
  /**
   * Gets or Sets eventTypes
   */
  @JsonAdapter(EventTypesEnum.Adapter.class)
  public enum EventTypesEnum {
    EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED"),
    
    TRANSFER_OPERATION_SUCCESS("TRANSFER_OPERATION_SUCCESS"),
    
    TRANSFER_OPERATION_FAILED("TRANSFER_OPERATION_FAILED"),
    
    TRANSFER_OPERATION_ABORTED("TRANSFER_OPERATION_ABORTED");

    private String value;

    EventTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypesEnum fromValue(String value) {
      for (EventTypesEnum b : EventTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EventTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPES = "eventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<EventTypesEnum> eventTypes = new ArrayList<>();

  /**
   * Required. The desired format of the notification message payloads.
   */
  @JsonAdapter(PayloadFormatEnum.Adapter.class)
  public enum PayloadFormatEnum {
    PAYLOAD_FORMAT_UNSPECIFIED("PAYLOAD_FORMAT_UNSPECIFIED"),
    
    NONE("NONE"),
    
    JSON("JSON");

    private String value;

    PayloadFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayloadFormatEnum fromValue(String value) {
      for (PayloadFormatEnum b : PayloadFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayloadFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayloadFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayloadFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayloadFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PayloadFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYLOAD_FORMAT = "payloadFormat";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_FORMAT)
  private PayloadFormatEnum payloadFormat;

  public static final String SERIALIZED_NAME_PUBSUB_TOPIC = "pubsubTopic";
  @SerializedName(SERIALIZED_NAME_PUBSUB_TOPIC)
  private String pubsubTopic;

  public NotificationConfig() {
  }

  public NotificationConfig eventTypes(List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public NotificationConfig addEventTypesItem(EventTypesEnum eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Event types for which a notification is desired. If empty, send notifications for all event types.
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public List<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public NotificationConfig payloadFormat(PayloadFormatEnum payloadFormat) {
    this.payloadFormat = payloadFormat;
    return this;
  }

  /**
   * Required. The desired format of the notification message payloads.
   * @return payloadFormat
   */
  @javax.annotation.Nullable
  public PayloadFormatEnum getPayloadFormat() {
    return payloadFormat;
  }

  public void setPayloadFormat(PayloadFormatEnum payloadFormat) {
    this.payloadFormat = payloadFormat;
  }


  public NotificationConfig pubsubTopic(String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  /**
   * Required. The &#x60;Topic.name&#x60; of the Pub/Sub topic to which to publish notifications. Must be of the format: &#x60;projects/{project}/topics/{topic}&#x60;. Not matching this format results in an INVALID_ARGUMENT error.
   * @return pubsubTopic
   */
  @javax.annotation.Nullable
  public String getPubsubTopic() {
    return pubsubTopic;
  }

  public void setPubsubTopic(String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationConfig notificationConfig = (NotificationConfig) o;
    return Objects.equals(this.eventTypes, notificationConfig.eventTypes) &&
        Objects.equals(this.payloadFormat, notificationConfig.payloadFormat) &&
        Objects.equals(this.pubsubTopic, notificationConfig.pubsubTopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTypes, payloadFormat, pubsubTopic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationConfig {\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    payloadFormat: ").append(toIndentedString(payloadFormat)).append("\n");
    sb.append("    pubsubTopic: ").append(toIndentedString(pubsubTopic)).append("\n");
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
    openapiFields.add("eventTypes");
    openapiFields.add("payloadFormat");
    openapiFields.add("pubsubTopic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotificationConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationConfig is not found in the empty JSON string", NotificationConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("eventTypes") != null && !jsonObj.get("eventTypes").isJsonNull() && !jsonObj.get("eventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("eventTypes").toString()));
      }
      if ((jsonObj.get("payloadFormat") != null && !jsonObj.get("payloadFormat").isJsonNull()) && !jsonObj.get("payloadFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payloadFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payloadFormat").toString()));
      }
      // validate the optional field `payloadFormat`
      if (jsonObj.get("payloadFormat") != null && !jsonObj.get("payloadFormat").isJsonNull()) {
        PayloadFormatEnum.validateJsonElement(jsonObj.get("payloadFormat"));
      }
      if ((jsonObj.get("pubsubTopic") != null && !jsonObj.get("pubsubTopic").isJsonNull()) && !jsonObj.get("pubsubTopic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pubsubTopic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pubsubTopic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationConfig>() {
           @Override
           public void write(JsonWriter out, NotificationConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotificationConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationConfig
   * @throws IOException if the JSON string is invalid with respect to NotificationConfig
   */
  public static NotificationConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationConfig.class);
  }

  /**
   * Convert an instance of NotificationConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

