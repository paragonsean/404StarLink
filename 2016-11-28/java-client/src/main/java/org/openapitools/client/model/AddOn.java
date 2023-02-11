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
 * Describes an add-on that is enabled for an Amazon Lightsail resource.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:38.220643-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AddOn {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SNAPSHOT_TIME_OF_DAY = "snapshotTimeOfDay";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_TIME_OF_DAY)
  private String snapshotTimeOfDay;

  public static final String SERIALIZED_NAME_NEXT_SNAPSHOT_TIME_OF_DAY = "nextSnapshotTimeOfDay";
  @SerializedName(SERIALIZED_NAME_NEXT_SNAPSHOT_TIME_OF_DAY)
  private String nextSnapshotTimeOfDay;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private String threshold;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public AddOn() {
  }

  public AddOn name(String name) {
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


  public AddOn status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public AddOn snapshotTimeOfDay(String snapshotTimeOfDay) {
    this.snapshotTimeOfDay = snapshotTimeOfDay;
    return this;
  }

  /**
   * Get snapshotTimeOfDay
   * @return snapshotTimeOfDay
   */
  @javax.annotation.Nullable
  public String getSnapshotTimeOfDay() {
    return snapshotTimeOfDay;
  }

  public void setSnapshotTimeOfDay(String snapshotTimeOfDay) {
    this.snapshotTimeOfDay = snapshotTimeOfDay;
  }


  public AddOn nextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
    this.nextSnapshotTimeOfDay = nextSnapshotTimeOfDay;
    return this;
  }

  /**
   * Get nextSnapshotTimeOfDay
   * @return nextSnapshotTimeOfDay
   */
  @javax.annotation.Nullable
  public String getNextSnapshotTimeOfDay() {
    return nextSnapshotTimeOfDay;
  }

  public void setNextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
    this.nextSnapshotTimeOfDay = nextSnapshotTimeOfDay;
  }


  public AddOn threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @javax.annotation.Nullable
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }


  public AddOn duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOn addOn = (AddOn) o;
    return Objects.equals(this.name, addOn.name) &&
        Objects.equals(this.status, addOn.status) &&
        Objects.equals(this.snapshotTimeOfDay, addOn.snapshotTimeOfDay) &&
        Objects.equals(this.nextSnapshotTimeOfDay, addOn.nextSnapshotTimeOfDay) &&
        Objects.equals(this.threshold, addOn.threshold) &&
        Objects.equals(this.duration, addOn.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, snapshotTimeOfDay, nextSnapshotTimeOfDay, threshold, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOn {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    snapshotTimeOfDay: ").append(toIndentedString(snapshotTimeOfDay)).append("\n");
    sb.append("    nextSnapshotTimeOfDay: ").append(toIndentedString(nextSnapshotTimeOfDay)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("snapshotTimeOfDay");
    openapiFields.add("nextSnapshotTimeOfDay");
    openapiFields.add("threshold");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddOn
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddOn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddOn is not found in the empty JSON string", AddOn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddOn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddOn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `snapshotTimeOfDay`
      if (jsonObj.get("snapshotTimeOfDay") != null && !jsonObj.get("snapshotTimeOfDay").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("snapshotTimeOfDay"));
      }
      // validate the optional field `nextSnapshotTimeOfDay`
      if (jsonObj.get("nextSnapshotTimeOfDay") != null && !jsonObj.get("nextSnapshotTimeOfDay").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("nextSnapshotTimeOfDay"));
      }
      // validate the optional field `threshold`
      if (jsonObj.get("threshold") != null && !jsonObj.get("threshold").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("threshold"));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("duration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddOn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddOn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddOn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddOn.class));

       return (TypeAdapter<T>) new TypeAdapter<AddOn>() {
           @Override
           public void write(JsonWriter out, AddOn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddOn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddOn given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddOn
   * @throws IOException if the JSON string is invalid with respect to AddOn
   */
  public static AddOn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddOn.class);
  }

  /**
   * Convert an instance of AddOn to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

