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
import org.openapitools.client.model.GoogleChromeManagementV1DiskInfo;

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
 * Status data for storage. * This field is telemetry information and this will change over time as the device is utilized. * Data for this field is controlled via policy: [ReportDeviceStorageStatus](https://chromeenterprise.google/policies/#ReportDeviceStorageStatus) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:05.864903-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1StorageStatusReport {
  public static final String SERIALIZED_NAME_DISK = "disk";
  @SerializedName(SERIALIZED_NAME_DISK)
  private List<GoogleChromeManagementV1DiskInfo> disk = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_TIME = "reportTime";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime;

  public GoogleChromeManagementV1StorageStatusReport() {
  }

  public GoogleChromeManagementV1StorageStatusReport(
     List<GoogleChromeManagementV1DiskInfo> disk, 
     String reportTime
  ) {
    this();
    this.disk = disk;
    this.reportTime = reportTime;
  }

  /**
   * Output only. Reports on disk.
   * @return disk
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1DiskInfo> getDisk() {
    return disk;
  }



  /**
   * Output only. Timestamp of when the sample was collected on device
   * @return reportTime
   */
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1StorageStatusReport googleChromeManagementV1StorageStatusReport = (GoogleChromeManagementV1StorageStatusReport) o;
    return Objects.equals(this.disk, googleChromeManagementV1StorageStatusReport.disk) &&
        Objects.equals(this.reportTime, googleChromeManagementV1StorageStatusReport.reportTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disk, reportTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1StorageStatusReport {\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
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
    openapiFields.add("disk");
    openapiFields.add("reportTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1StorageStatusReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1StorageStatusReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1StorageStatusReport is not found in the empty JSON string", GoogleChromeManagementV1StorageStatusReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1StorageStatusReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1StorageStatusReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("disk") != null && !jsonObj.get("disk").isJsonNull()) {
        JsonArray jsonArraydisk = jsonObj.getAsJsonArray("disk");
        if (jsonArraydisk != null) {
          // ensure the json data is an array
          if (!jsonObj.get("disk").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `disk` to be an array in the JSON string but got `%s`", jsonObj.get("disk").toString()));
          }

          // validate the optional field `disk` (array)
          for (int i = 0; i < jsonArraydisk.size(); i++) {
            GoogleChromeManagementV1DiskInfo.validateJsonElement(jsonArraydisk.get(i));
          };
        }
      }
      if ((jsonObj.get("reportTime") != null && !jsonObj.get("reportTime").isJsonNull()) && !jsonObj.get("reportTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1StorageStatusReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1StorageStatusReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1StorageStatusReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1StorageStatusReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1StorageStatusReport>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1StorageStatusReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1StorageStatusReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1StorageStatusReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1StorageStatusReport
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1StorageStatusReport
   */
  public static GoogleChromeManagementV1StorageStatusReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1StorageStatusReport.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1StorageStatusReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

