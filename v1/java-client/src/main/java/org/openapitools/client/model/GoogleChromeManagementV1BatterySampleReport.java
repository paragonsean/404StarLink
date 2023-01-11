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
 * Sampling data for battery. * This field is telemetry information and this will change over time as the device is utilized. * Data for this field is controlled via policy: [ReportDevicePowerStatus](https://chromeenterprise.google/policies/#ReportDevicePowerStatus) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:11.322773-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1BatterySampleReport {
  public static final String SERIALIZED_NAME_CHARGE_RATE = "chargeRate";
  @SerializedName(SERIALIZED_NAME_CHARGE_RATE)
  private Integer chargeRate;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private String current;

  public static final String SERIALIZED_NAME_DISCHARGE_RATE = "dischargeRate";
  @SerializedName(SERIALIZED_NAME_DISCHARGE_RATE)
  private Integer dischargeRate;

  public static final String SERIALIZED_NAME_REMAINING_CAPACITY = "remainingCapacity";
  @SerializedName(SERIALIZED_NAME_REMAINING_CAPACITY)
  private String remainingCapacity;

  public static final String SERIALIZED_NAME_REPORT_TIME = "reportTime";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Integer temperature;

  public static final String SERIALIZED_NAME_VOLTAGE = "voltage";
  @SerializedName(SERIALIZED_NAME_VOLTAGE)
  private String voltage;

  public GoogleChromeManagementV1BatterySampleReport() {
  }

  public GoogleChromeManagementV1BatterySampleReport(
     Integer chargeRate, 
     String current, 
     Integer dischargeRate, 
     String remainingCapacity, 
     String reportTime, 
     String status, 
     Integer temperature, 
     String voltage
  ) {
    this();
    this.chargeRate = chargeRate;
    this.current = current;
    this.dischargeRate = dischargeRate;
    this.remainingCapacity = remainingCapacity;
    this.reportTime = reportTime;
    this.status = status;
    this.temperature = temperature;
    this.voltage = voltage;
  }

  /**
   * Output only. Battery charge percentage.
   * @return chargeRate
   */
  @javax.annotation.Nullable
  public Integer getChargeRate() {
    return chargeRate;
  }



  /**
   * Output only. Battery current (mA).
   * @return current
   */
  @javax.annotation.Nullable
  public String getCurrent() {
    return current;
  }



  /**
   * Output only. The battery discharge rate measured in mW. Positive if the battery is being discharged, negative if it&#39;s being charged.
   * @return dischargeRate
   */
  @javax.annotation.Nullable
  public Integer getDischargeRate() {
    return dischargeRate;
  }



  /**
   * Output only. Battery remaining capacity (mAmpere-hours).
   * @return remainingCapacity
   */
  @javax.annotation.Nullable
  public String getRemainingCapacity() {
    return remainingCapacity;
  }



  /**
   * Output only. Timestamp of when the sample was collected on device
   * @return reportTime
   */
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }



  /**
   * Output only. Battery status read from sysfs. Example: Discharging
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }



  /**
   * Output only. Temperature in Celsius degrees.
   * @return temperature
   */
  @javax.annotation.Nullable
  public Integer getTemperature() {
    return temperature;
  }



  /**
   * Output only. Battery voltage (millivolt).
   * @return voltage
   */
  @javax.annotation.Nullable
  public String getVoltage() {
    return voltage;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1BatterySampleReport googleChromeManagementV1BatterySampleReport = (GoogleChromeManagementV1BatterySampleReport) o;
    return Objects.equals(this.chargeRate, googleChromeManagementV1BatterySampleReport.chargeRate) &&
        Objects.equals(this.current, googleChromeManagementV1BatterySampleReport.current) &&
        Objects.equals(this.dischargeRate, googleChromeManagementV1BatterySampleReport.dischargeRate) &&
        Objects.equals(this.remainingCapacity, googleChromeManagementV1BatterySampleReport.remainingCapacity) &&
        Objects.equals(this.reportTime, googleChromeManagementV1BatterySampleReport.reportTime) &&
        Objects.equals(this.status, googleChromeManagementV1BatterySampleReport.status) &&
        Objects.equals(this.temperature, googleChromeManagementV1BatterySampleReport.temperature) &&
        Objects.equals(this.voltage, googleChromeManagementV1BatterySampleReport.voltage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeRate, current, dischargeRate, remainingCapacity, reportTime, status, temperature, voltage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1BatterySampleReport {\n");
    sb.append("    chargeRate: ").append(toIndentedString(chargeRate)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    dischargeRate: ").append(toIndentedString(dischargeRate)).append("\n");
    sb.append("    remainingCapacity: ").append(toIndentedString(remainingCapacity)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
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
    openapiFields.add("chargeRate");
    openapiFields.add("current");
    openapiFields.add("dischargeRate");
    openapiFields.add("remainingCapacity");
    openapiFields.add("reportTime");
    openapiFields.add("status");
    openapiFields.add("temperature");
    openapiFields.add("voltage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1BatterySampleReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1BatterySampleReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1BatterySampleReport is not found in the empty JSON string", GoogleChromeManagementV1BatterySampleReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1BatterySampleReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1BatterySampleReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("current") != null && !jsonObj.get("current").isJsonNull()) && !jsonObj.get("current").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current").toString()));
      }
      if ((jsonObj.get("remainingCapacity") != null && !jsonObj.get("remainingCapacity").isJsonNull()) && !jsonObj.get("remainingCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remainingCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remainingCapacity").toString()));
      }
      if ((jsonObj.get("reportTime") != null && !jsonObj.get("reportTime").isJsonNull()) && !jsonObj.get("reportTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportTime").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("voltage") != null && !jsonObj.get("voltage").isJsonNull()) && !jsonObj.get("voltage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voltage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voltage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1BatterySampleReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1BatterySampleReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1BatterySampleReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1BatterySampleReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1BatterySampleReport>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1BatterySampleReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1BatterySampleReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1BatterySampleReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1BatterySampleReport
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1BatterySampleReport
   */
  public static GoogleChromeManagementV1BatterySampleReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1BatterySampleReport.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1BatterySampleReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

