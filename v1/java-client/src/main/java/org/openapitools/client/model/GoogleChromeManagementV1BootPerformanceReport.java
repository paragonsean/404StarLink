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
 * Boot performance report of a device. * This field is telemetry information and this will change over time as the device is utilized. * Data for this field is controlled via policy: [ReportDeviceBootMode](https://chromeenterprise.google/policies/#ReportDeviceBootMode) * Data Collection Frequency: On every boot up event * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: Yes * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:08.888155-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1BootPerformanceReport {
  public static final String SERIALIZED_NAME_BOOT_UP_DURATION = "bootUpDuration";
  @SerializedName(SERIALIZED_NAME_BOOT_UP_DURATION)
  private String bootUpDuration;

  public static final String SERIALIZED_NAME_BOOT_UP_TIME = "bootUpTime";
  @SerializedName(SERIALIZED_NAME_BOOT_UP_TIME)
  private String bootUpTime;

  public static final String SERIALIZED_NAME_REPORT_TIME = "reportTime";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime;

  public static final String SERIALIZED_NAME_SHUTDOWN_DURATION = "shutdownDuration";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_DURATION)
  private String shutdownDuration;

  /**
   * The shutdown reason.
   */
  @JsonAdapter(ShutdownReasonEnum.Adapter.class)
  public enum ShutdownReasonEnum {
    SHUTDOWN_REASON_UNSPECIFIED("SHUTDOWN_REASON_UNSPECIFIED"),
    
    USER_REQUEST("USER_REQUEST"),
    
    SYSTEM_UPDATE("SYSTEM_UPDATE"),
    
    LOW_BATTERY("LOW_BATTERY"),
    
    OTHER("OTHER");

    private String value;

    ShutdownReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShutdownReasonEnum fromValue(String value) {
      for (ShutdownReasonEnum b : ShutdownReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShutdownReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShutdownReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShutdownReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShutdownReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ShutdownReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SHUTDOWN_REASON = "shutdownReason";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_REASON)
  private ShutdownReasonEnum shutdownReason;

  public static final String SERIALIZED_NAME_SHUTDOWN_TIME = "shutdownTime";
  @SerializedName(SERIALIZED_NAME_SHUTDOWN_TIME)
  private String shutdownTime;

  public GoogleChromeManagementV1BootPerformanceReport() {
  }

  public GoogleChromeManagementV1BootPerformanceReport bootUpDuration(String bootUpDuration) {
    this.bootUpDuration = bootUpDuration;
    return this;
  }

  /**
   * Total time to boot up.
   * @return bootUpDuration
   */
  @javax.annotation.Nullable
  public String getBootUpDuration() {
    return bootUpDuration;
  }

  public void setBootUpDuration(String bootUpDuration) {
    this.bootUpDuration = bootUpDuration;
  }


  public GoogleChromeManagementV1BootPerformanceReport bootUpTime(String bootUpTime) {
    this.bootUpTime = bootUpTime;
    return this;
  }

  /**
   * The timestamp when power came on.
   * @return bootUpTime
   */
  @javax.annotation.Nullable
  public String getBootUpTime() {
    return bootUpTime;
  }

  public void setBootUpTime(String bootUpTime) {
    this.bootUpTime = bootUpTime;
  }


  public GoogleChromeManagementV1BootPerformanceReport reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * Timestamp when the report was collected.
   * @return reportTime
   */
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }

  public void setReportTime(String reportTime) {
    this.reportTime = reportTime;
  }


  public GoogleChromeManagementV1BootPerformanceReport shutdownDuration(String shutdownDuration) {
    this.shutdownDuration = shutdownDuration;
    return this;
  }

  /**
   * Total time since shutdown start to power off.
   * @return shutdownDuration
   */
  @javax.annotation.Nullable
  public String getShutdownDuration() {
    return shutdownDuration;
  }

  public void setShutdownDuration(String shutdownDuration) {
    this.shutdownDuration = shutdownDuration;
  }


  public GoogleChromeManagementV1BootPerformanceReport shutdownReason(ShutdownReasonEnum shutdownReason) {
    this.shutdownReason = shutdownReason;
    return this;
  }

  /**
   * The shutdown reason.
   * @return shutdownReason
   */
  @javax.annotation.Nullable
  public ShutdownReasonEnum getShutdownReason() {
    return shutdownReason;
  }

  public void setShutdownReason(ShutdownReasonEnum shutdownReason) {
    this.shutdownReason = shutdownReason;
  }


  public GoogleChromeManagementV1BootPerformanceReport shutdownTime(String shutdownTime) {
    this.shutdownTime = shutdownTime;
    return this;
  }

  /**
   * The timestamp when shutdown.
   * @return shutdownTime
   */
  @javax.annotation.Nullable
  public String getShutdownTime() {
    return shutdownTime;
  }

  public void setShutdownTime(String shutdownTime) {
    this.shutdownTime = shutdownTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1BootPerformanceReport googleChromeManagementV1BootPerformanceReport = (GoogleChromeManagementV1BootPerformanceReport) o;
    return Objects.equals(this.bootUpDuration, googleChromeManagementV1BootPerformanceReport.bootUpDuration) &&
        Objects.equals(this.bootUpTime, googleChromeManagementV1BootPerformanceReport.bootUpTime) &&
        Objects.equals(this.reportTime, googleChromeManagementV1BootPerformanceReport.reportTime) &&
        Objects.equals(this.shutdownDuration, googleChromeManagementV1BootPerformanceReport.shutdownDuration) &&
        Objects.equals(this.shutdownReason, googleChromeManagementV1BootPerformanceReport.shutdownReason) &&
        Objects.equals(this.shutdownTime, googleChromeManagementV1BootPerformanceReport.shutdownTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootUpDuration, bootUpTime, reportTime, shutdownDuration, shutdownReason, shutdownTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1BootPerformanceReport {\n");
    sb.append("    bootUpDuration: ").append(toIndentedString(bootUpDuration)).append("\n");
    sb.append("    bootUpTime: ").append(toIndentedString(bootUpTime)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    shutdownDuration: ").append(toIndentedString(shutdownDuration)).append("\n");
    sb.append("    shutdownReason: ").append(toIndentedString(shutdownReason)).append("\n");
    sb.append("    shutdownTime: ").append(toIndentedString(shutdownTime)).append("\n");
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
    openapiFields.add("bootUpDuration");
    openapiFields.add("bootUpTime");
    openapiFields.add("reportTime");
    openapiFields.add("shutdownDuration");
    openapiFields.add("shutdownReason");
    openapiFields.add("shutdownTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1BootPerformanceReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1BootPerformanceReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1BootPerformanceReport is not found in the empty JSON string", GoogleChromeManagementV1BootPerformanceReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1BootPerformanceReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1BootPerformanceReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bootUpDuration") != null && !jsonObj.get("bootUpDuration").isJsonNull()) && !jsonObj.get("bootUpDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootUpDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootUpDuration").toString()));
      }
      if ((jsonObj.get("bootUpTime") != null && !jsonObj.get("bootUpTime").isJsonNull()) && !jsonObj.get("bootUpTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootUpTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootUpTime").toString()));
      }
      if ((jsonObj.get("reportTime") != null && !jsonObj.get("reportTime").isJsonNull()) && !jsonObj.get("reportTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportTime").toString()));
      }
      if ((jsonObj.get("shutdownDuration") != null && !jsonObj.get("shutdownDuration").isJsonNull()) && !jsonObj.get("shutdownDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shutdownDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shutdownDuration").toString()));
      }
      if ((jsonObj.get("shutdownReason") != null && !jsonObj.get("shutdownReason").isJsonNull()) && !jsonObj.get("shutdownReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shutdownReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shutdownReason").toString()));
      }
      // validate the optional field `shutdownReason`
      if (jsonObj.get("shutdownReason") != null && !jsonObj.get("shutdownReason").isJsonNull()) {
        ShutdownReasonEnum.validateJsonElement(jsonObj.get("shutdownReason"));
      }
      if ((jsonObj.get("shutdownTime") != null && !jsonObj.get("shutdownTime").isJsonNull()) && !jsonObj.get("shutdownTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shutdownTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shutdownTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1BootPerformanceReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1BootPerformanceReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1BootPerformanceReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1BootPerformanceReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1BootPerformanceReport>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1BootPerformanceReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1BootPerformanceReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1BootPerformanceReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1BootPerformanceReport
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1BootPerformanceReport
   */
  public static GoogleChromeManagementV1BootPerformanceReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1BootPerformanceReport.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1BootPerformanceReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

