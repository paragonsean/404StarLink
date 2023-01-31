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
 * Contains samples of memory status reports. * This field is telemetry information and this will change over time as the device is utilized. * Data for this field is controlled via policy: [ReportDeviceMemoryInfo](https://chromeenterprise.google/policies/#ReportDeviceMemoryInfo) * Data Collection Frequency: Only at upload, SystemRamFreeByes is collected every 10 minutes * Default Data Reporting Frequency: Every 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:08.888155-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1MemoryStatusReport {
  public static final String SERIALIZED_NAME_PAGE_FAULTS = "pageFaults";
  @SerializedName(SERIALIZED_NAME_PAGE_FAULTS)
  private Integer pageFaults;

  public static final String SERIALIZED_NAME_REPORT_TIME = "reportTime";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime;

  public static final String SERIALIZED_NAME_SAMPLE_FREQUENCY = "sampleFrequency";
  @SerializedName(SERIALIZED_NAME_SAMPLE_FREQUENCY)
  private String sampleFrequency;

  public static final String SERIALIZED_NAME_SYSTEM_RAM_FREE_BYTES = "systemRamFreeBytes";
  @SerializedName(SERIALIZED_NAME_SYSTEM_RAM_FREE_BYTES)
  private String systemRamFreeBytes;

  public GoogleChromeManagementV1MemoryStatusReport() {
  }

  public GoogleChromeManagementV1MemoryStatusReport(
     Integer pageFaults, 
     String reportTime, 
     String sampleFrequency, 
     String systemRamFreeBytes
  ) {
    this();
    this.pageFaults = pageFaults;
    this.reportTime = reportTime;
    this.sampleFrequency = sampleFrequency;
    this.systemRamFreeBytes = systemRamFreeBytes;
  }

  /**
   * Output only. Number of page faults during this collection
   * @return pageFaults
   */
  @javax.annotation.Nullable
  public Integer getPageFaults() {
    return pageFaults;
  }



  /**
   * Output only. The timestamp in milliseconds representing time at which this report was sampled.
   * @return reportTime
   */
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }



  /**
   * Output only. Frequency the report is sampled.
   * @return sampleFrequency
   */
  @javax.annotation.Nullable
  public String getSampleFrequency() {
    return sampleFrequency;
  }



  /**
   * Output only. Amount of free RAM in bytes (unreliable due to Garbage Collection).
   * @return systemRamFreeBytes
   */
  @javax.annotation.Nullable
  public String getSystemRamFreeBytes() {
    return systemRamFreeBytes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1MemoryStatusReport googleChromeManagementV1MemoryStatusReport = (GoogleChromeManagementV1MemoryStatusReport) o;
    return Objects.equals(this.pageFaults, googleChromeManagementV1MemoryStatusReport.pageFaults) &&
        Objects.equals(this.reportTime, googleChromeManagementV1MemoryStatusReport.reportTime) &&
        Objects.equals(this.sampleFrequency, googleChromeManagementV1MemoryStatusReport.sampleFrequency) &&
        Objects.equals(this.systemRamFreeBytes, googleChromeManagementV1MemoryStatusReport.systemRamFreeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageFaults, reportTime, sampleFrequency, systemRamFreeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1MemoryStatusReport {\n");
    sb.append("    pageFaults: ").append(toIndentedString(pageFaults)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    sampleFrequency: ").append(toIndentedString(sampleFrequency)).append("\n");
    sb.append("    systemRamFreeBytes: ").append(toIndentedString(systemRamFreeBytes)).append("\n");
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
    openapiFields.add("pageFaults");
    openapiFields.add("reportTime");
    openapiFields.add("sampleFrequency");
    openapiFields.add("systemRamFreeBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1MemoryStatusReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1MemoryStatusReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1MemoryStatusReport is not found in the empty JSON string", GoogleChromeManagementV1MemoryStatusReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1MemoryStatusReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1MemoryStatusReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reportTime") != null && !jsonObj.get("reportTime").isJsonNull()) && !jsonObj.get("reportTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportTime").toString()));
      }
      if ((jsonObj.get("sampleFrequency") != null && !jsonObj.get("sampleFrequency").isJsonNull()) && !jsonObj.get("sampleFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sampleFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sampleFrequency").toString()));
      }
      if ((jsonObj.get("systemRamFreeBytes") != null && !jsonObj.get("systemRamFreeBytes").isJsonNull()) && !jsonObj.get("systemRamFreeBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemRamFreeBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemRamFreeBytes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1MemoryStatusReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1MemoryStatusReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1MemoryStatusReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1MemoryStatusReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1MemoryStatusReport>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1MemoryStatusReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1MemoryStatusReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1MemoryStatusReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1MemoryStatusReport
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1MemoryStatusReport
   */
  public static GoogleChromeManagementV1MemoryStatusReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1MemoryStatusReport.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1MemoryStatusReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

