/*
 * Notebooks API
 * Notebooks API is used to manage notebook resources in Google Cloud.
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * The definition of an Event for a managed / semi-managed notebook instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:43.451204-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Event {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Map<String, String> details = new HashMap<>();

  public static final String SERIALIZED_NAME_REPORT_TIME = "reportTime";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime;

  /**
   * Event type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED"),
    
    IDLE("IDLE"),
    
    HEARTBEAT("HEARTBEAT"),
    
    HEALTH("HEALTH"),
    
    MAINTENANCE("MAINTENANCE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public Event() {
  }

  public Event details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public Event putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Optional. Event details. This field is used to pass event information.
   * @return details
   */
  @javax.annotation.Nullable
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }


  public Event reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * Event report time.
   * @return reportTime
   */
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }

  public void setReportTime(String reportTime) {
    this.reportTime = reportTime;
  }


  public Event type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Event type.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.details, event.details) &&
        Objects.equals(this.reportTime, event.reportTime) &&
        Objects.equals(this.type, event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, reportTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("reportTime");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Event
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Event` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reportTime") != null && !jsonObj.get("reportTime").isJsonNull()) && !jsonObj.get("reportTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportTime").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Event read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Event given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Event
   * @throws IOException if the JSON string is invalid with respect to Event
   */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

  /**
   * Convert an instance of Event to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

