/*
 * Traccar
 * Open Source GPS Tracking Platform
 *
 * The version of the OpenAPI document: 5.6
 * Contact: support@traccar.org
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
import java.math.BigDecimal;
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
 * ReportSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:39.223395-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReportSummary {
  public static final String SERIALIZED_NAME_AVERAGE_SPEED = "averageSpeed";
  @SerializedName(SERIALIZED_NAME_AVERAGE_SPEED)
  private BigDecimal averageSpeed;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private Integer deviceId;

  public static final String SERIALIZED_NAME_DEVICE_NAME = "deviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_ENGINE_HOURS = "engineHours";
  @SerializedName(SERIALIZED_NAME_ENGINE_HOURS)
  private Integer engineHours;

  public static final String SERIALIZED_NAME_MAX_SPEED = "maxSpeed";
  @SerializedName(SERIALIZED_NAME_MAX_SPEED)
  private BigDecimal maxSpeed;

  public static final String SERIALIZED_NAME_SPENT_FUEL = "spentFuel";
  @SerializedName(SERIALIZED_NAME_SPENT_FUEL)
  private BigDecimal spentFuel;

  public ReportSummary() {
  }

  public ReportSummary averageSpeed(BigDecimal averageSpeed) {
    this.averageSpeed = averageSpeed;
    return this;
  }

  /**
   * in knots
   * @return averageSpeed
   */
  @javax.annotation.Nullable
  public BigDecimal getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(BigDecimal averageSpeed) {
    this.averageSpeed = averageSpeed;
  }


  public ReportSummary deviceId(Integer deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  @javax.annotation.Nullable
  public Integer getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }


  public ReportSummary deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Get deviceName
   * @return deviceName
   */
  @javax.annotation.Nullable
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public ReportSummary distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

  /**
   * in meters
   * @return distance
   */
  @javax.annotation.Nullable
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public ReportSummary engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  /**
   * Get engineHours
   * @return engineHours
   */
  @javax.annotation.Nullable
  public Integer getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }


  public ReportSummary maxSpeed(BigDecimal maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * in knots
   * @return maxSpeed
   */
  @javax.annotation.Nullable
  public BigDecimal getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(BigDecimal maxSpeed) {
    this.maxSpeed = maxSpeed;
  }


  public ReportSummary spentFuel(BigDecimal spentFuel) {
    this.spentFuel = spentFuel;
    return this;
  }

  /**
   * in liters
   * @return spentFuel
   */
  @javax.annotation.Nullable
  public BigDecimal getSpentFuel() {
    return spentFuel;
  }

  public void setSpentFuel(BigDecimal spentFuel) {
    this.spentFuel = spentFuel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSummary reportSummary = (ReportSummary) o;
    return Objects.equals(this.averageSpeed, reportSummary.averageSpeed) &&
        Objects.equals(this.deviceId, reportSummary.deviceId) &&
        Objects.equals(this.deviceName, reportSummary.deviceName) &&
        Objects.equals(this.distance, reportSummary.distance) &&
        Objects.equals(this.engineHours, reportSummary.engineHours) &&
        Objects.equals(this.maxSpeed, reportSummary.maxSpeed) &&
        Objects.equals(this.spentFuel, reportSummary.spentFuel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageSpeed, deviceId, deviceName, distance, engineHours, maxSpeed, spentFuel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummary {\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    spentFuel: ").append(toIndentedString(spentFuel)).append("\n");
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
    openapiFields.add("averageSpeed");
    openapiFields.add("deviceId");
    openapiFields.add("deviceName");
    openapiFields.add("distance");
    openapiFields.add("engineHours");
    openapiFields.add("maxSpeed");
    openapiFields.add("spentFuel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportSummary is not found in the empty JSON string", ReportSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deviceName") != null && !jsonObj.get("deviceName").isJsonNull()) && !jsonObj.get("deviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportSummary>() {
           @Override
           public void write(JsonWriter out, ReportSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportSummary
   * @throws IOException if the JSON string is invalid with respect to ReportSummary
   */
  public static ReportSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportSummary.class);
  }

  /**
   * Convert an instance of ReportSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

