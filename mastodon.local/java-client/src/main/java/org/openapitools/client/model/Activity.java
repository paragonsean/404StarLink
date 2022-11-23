/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
 * Represents a weekly bucket of instance activity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:45.133390-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Activity {
  public static final String SERIALIZED_NAME_LOGINS = "logins";
  @SerializedName(SERIALIZED_NAME_LOGINS)
  private String logins;

  public static final String SERIALIZED_NAME_REGISTRATIONS = "registrations";
  @SerializedName(SERIALIZED_NAME_REGISTRATIONS)
  private String registrations;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private String statuses;

  public static final String SERIALIZED_NAME_WEEK = "week";
  @SerializedName(SERIALIZED_NAME_WEEK)
  private String week;

  public Activity() {
  }

  public Activity logins(String logins) {
    this.logins = logins;
    return this;
  }

  /**
   * User logins since the week began, String (cast from an integer).
   * @return logins
   */
  @javax.annotation.Nullable
  public String getLogins() {
    return logins;
  }

  public void setLogins(String logins) {
    this.logins = logins;
  }


  public Activity registrations(String registrations) {
    this.registrations = registrations;
    return this;
  }

  /**
   * User registrations since the week began, String (cast from an integer).
   * @return registrations
   */
  @javax.annotation.Nullable
  public String getRegistrations() {
    return registrations;
  }

  public void setRegistrations(String registrations) {
    this.registrations = registrations;
  }


  public Activity statuses(String statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Statuses created since the week began, String (cast from an integer).
   * @return statuses
   */
  @javax.annotation.Nullable
  public String getStatuses() {
    return statuses;
  }

  public void setStatuses(String statuses) {
    this.statuses = statuses;
  }


  public Activity week(String week) {
    this.week = week;
    return this;
  }

  /**
   * Midnight at the first day of the week.  (UNIX Timestamp).
   * @return week
   */
  @javax.annotation.Nullable
  public String getWeek() {
    return week;
  }

  public void setWeek(String week) {
    this.week = week;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.logins, activity.logins) &&
        Objects.equals(this.registrations, activity.registrations) &&
        Objects.equals(this.statuses, activity.statuses) &&
        Objects.equals(this.week, activity.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logins, registrations, statuses, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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
    openapiFields.add("logins");
    openapiFields.add("registrations");
    openapiFields.add("statuses");
    openapiFields.add("week");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Activity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Activity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Activity is not found in the empty JSON string", Activity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Activity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Activity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("logins") != null && !jsonObj.get("logins").isJsonNull()) && !jsonObj.get("logins").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logins` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logins").toString()));
      }
      if ((jsonObj.get("registrations") != null && !jsonObj.get("registrations").isJsonNull()) && !jsonObj.get("registrations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrations").toString()));
      }
      if ((jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) && !jsonObj.get("statuses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }
      if ((jsonObj.get("week") != null && !jsonObj.get("week").isJsonNull()) && !jsonObj.get("week").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `week` to be a primitive type in the JSON string but got `%s`", jsonObj.get("week").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Activity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Activity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Activity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Activity.class));

       return (TypeAdapter<T>) new TypeAdapter<Activity>() {
           @Override
           public void write(JsonWriter out, Activity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Activity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Activity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Activity
   * @throws IOException if the JSON string is invalid with respect to Activity
   */
  public static Activity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Activity.class);
  }

  /**
   * Convert an instance of Activity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

