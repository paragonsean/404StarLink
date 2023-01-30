/*
 * Chrome Management API
 * The Chrome Management API is a suite of services that allows Chrome administrators to view, manage and gain insights on their Chrome OS and Chrome Browser devices.
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
import org.openapitools.client.model.GoogleChromeManagementV1AudioStatusReport;
import org.openapitools.client.model.GoogleChromeManagementV1PeripheralsReport;

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
 * Telemetry data collected for a managed user and device.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:05.864903-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1TelemetryUserDevice {
  public static final String SERIALIZED_NAME_AUDIO_STATUS_REPORT = "audioStatusReport";
  @SerializedName(SERIALIZED_NAME_AUDIO_STATUS_REPORT)
  private List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_PERIPHERALS_REPORT = "peripheralsReport";
  @SerializedName(SERIALIZED_NAME_PERIPHERALS_REPORT)
  private List<GoogleChromeManagementV1PeripheralsReport> peripheralsReport = new ArrayList<>();

  public GoogleChromeManagementV1TelemetryUserDevice() {
  }

  public GoogleChromeManagementV1TelemetryUserDevice(
     List<GoogleChromeManagementV1AudioStatusReport> audioStatusReport, 
     List<GoogleChromeManagementV1PeripheralsReport> peripheralsReport
  ) {
    this();
    this.audioStatusReport = audioStatusReport;
    this.peripheralsReport = peripheralsReport;
  }

  /**
   * Output only. Audio reports collected periodically sorted in a decreasing order of report_time.
   * @return audioStatusReport
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1AudioStatusReport> getAudioStatusReport() {
    return audioStatusReport;
  }



  public GoogleChromeManagementV1TelemetryUserDevice deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The unique Directory API ID of the device. This value is the same as the Admin Console&#39;s Directory API ID in the ChromeOS Devices tab.
   * @return deviceId
   */
  @javax.annotation.Nullable
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  /**
   * Output only. Peripherals reports collected periodically sorted in a decreasing order of report_time.
   * @return peripheralsReport
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1PeripheralsReport> getPeripheralsReport() {
    return peripheralsReport;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1TelemetryUserDevice googleChromeManagementV1TelemetryUserDevice = (GoogleChromeManagementV1TelemetryUserDevice) o;
    return Objects.equals(this.audioStatusReport, googleChromeManagementV1TelemetryUserDevice.audioStatusReport) &&
        Objects.equals(this.deviceId, googleChromeManagementV1TelemetryUserDevice.deviceId) &&
        Objects.equals(this.peripheralsReport, googleChromeManagementV1TelemetryUserDevice.peripheralsReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioStatusReport, deviceId, peripheralsReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1TelemetryUserDevice {\n");
    sb.append("    audioStatusReport: ").append(toIndentedString(audioStatusReport)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    peripheralsReport: ").append(toIndentedString(peripheralsReport)).append("\n");
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
    openapiFields.add("audioStatusReport");
    openapiFields.add("deviceId");
    openapiFields.add("peripheralsReport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1TelemetryUserDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1TelemetryUserDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1TelemetryUserDevice is not found in the empty JSON string", GoogleChromeManagementV1TelemetryUserDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1TelemetryUserDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1TelemetryUserDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("audioStatusReport") != null && !jsonObj.get("audioStatusReport").isJsonNull()) {
        JsonArray jsonArrayaudioStatusReport = jsonObj.getAsJsonArray("audioStatusReport");
        if (jsonArrayaudioStatusReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("audioStatusReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `audioStatusReport` to be an array in the JSON string but got `%s`", jsonObj.get("audioStatusReport").toString()));
          }

          // validate the optional field `audioStatusReport` (array)
          for (int i = 0; i < jsonArrayaudioStatusReport.size(); i++) {
            GoogleChromeManagementV1AudioStatusReport.validateJsonElement(jsonArrayaudioStatusReport.get(i));
          };
        }
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if (jsonObj.get("peripheralsReport") != null && !jsonObj.get("peripheralsReport").isJsonNull()) {
        JsonArray jsonArrayperipheralsReport = jsonObj.getAsJsonArray("peripheralsReport");
        if (jsonArrayperipheralsReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("peripheralsReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `peripheralsReport` to be an array in the JSON string but got `%s`", jsonObj.get("peripheralsReport").toString()));
          }

          // validate the optional field `peripheralsReport` (array)
          for (int i = 0; i < jsonArrayperipheralsReport.size(); i++) {
            GoogleChromeManagementV1PeripheralsReport.validateJsonElement(jsonArrayperipheralsReport.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1TelemetryUserDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1TelemetryUserDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1TelemetryUserDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1TelemetryUserDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1TelemetryUserDevice>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1TelemetryUserDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1TelemetryUserDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1TelemetryUserDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1TelemetryUserDevice
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1TelemetryUserDevice
   */
  public static GoogleChromeManagementV1TelemetryUserDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1TelemetryUserDevice.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1TelemetryUserDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

