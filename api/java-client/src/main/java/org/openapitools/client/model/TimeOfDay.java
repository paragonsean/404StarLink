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
 * Represents a time of day. The date and time zone are either not significant or are specified elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and &#x60;google.protobuf.Timestamp&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:32.119462-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TimeOfDay {
  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Integer hours;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Integer minutes;

  public static final String SERIALIZED_NAME_NANOS = "nanos";
  @SerializedName(SERIALIZED_NAME_NANOS)
  private Integer nanos;

  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Integer seconds;

  public TimeOfDay() {
  }

  public TimeOfDay hours(Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value \&quot;24:00:00\&quot; for scenarios like business closing time.
   * @return hours
   */
  @javax.annotation.Nullable
  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }


  public TimeOfDay minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Minutes of hour of day. Must be from 0 to 59.
   * @return minutes
   */
  @javax.annotation.Nullable
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  public TimeOfDay nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * @return nanos
   */
  @javax.annotation.Nullable
  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }


  public TimeOfDay seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
   * @return seconds
   */
  @javax.annotation.Nullable
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOfDay timeOfDay = (TimeOfDay) o;
    return Objects.equals(this.hours, timeOfDay.hours) &&
        Objects.equals(this.minutes, timeOfDay.minutes) &&
        Objects.equals(this.nanos, timeOfDay.nanos) &&
        Objects.equals(this.seconds, timeOfDay.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, minutes, nanos, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOfDay {\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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
    openapiFields.add("hours");
    openapiFields.add("minutes");
    openapiFields.add("nanos");
    openapiFields.add("seconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeOfDay
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeOfDay.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOfDay is not found in the empty JSON string", TimeOfDay.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeOfDay.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeOfDay` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOfDay.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOfDay' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOfDay> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOfDay.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOfDay>() {
           @Override
           public void write(JsonWriter out, TimeOfDay value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeOfDay read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeOfDay given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeOfDay
   * @throws IOException if the JSON string is invalid with respect to TimeOfDay
   */
  public static TimeOfDay fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOfDay.class);
  }

  /**
   * Convert an instance of TimeOfDay to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

