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
import org.openapitools.client.model.GoogleChromeManagementV1UsbPeripheralReport;

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
 * &#x60;TelemetryUsbPeripheralsEvent&#x60; is triggered USB devices are either added or removed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1TelemetryUsbPeripheralsEvent {
  public static final String SERIALIZED_NAME_USB_PERIPHERAL_REPORT = "usbPeripheralReport";
  @SerializedName(SERIALIZED_NAME_USB_PERIPHERAL_REPORT)
  private List<GoogleChromeManagementV1UsbPeripheralReport> usbPeripheralReport = new ArrayList<>();

  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent() {
  }

  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent usbPeripheralReport(List<GoogleChromeManagementV1UsbPeripheralReport> usbPeripheralReport) {
    this.usbPeripheralReport = usbPeripheralReport;
    return this;
  }

  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent addUsbPeripheralReportItem(GoogleChromeManagementV1UsbPeripheralReport usbPeripheralReportItem) {
    if (this.usbPeripheralReport == null) {
      this.usbPeripheralReport = new ArrayList<>();
    }
    this.usbPeripheralReport.add(usbPeripheralReportItem);
    return this;
  }

  /**
   * List of usb devices that were either added or removed.
   * @return usbPeripheralReport
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1UsbPeripheralReport> getUsbPeripheralReport() {
    return usbPeripheralReport;
  }

  public void setUsbPeripheralReport(List<GoogleChromeManagementV1UsbPeripheralReport> usbPeripheralReport) {
    this.usbPeripheralReport = usbPeripheralReport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1TelemetryUsbPeripheralsEvent googleChromeManagementV1TelemetryUsbPeripheralsEvent = (GoogleChromeManagementV1TelemetryUsbPeripheralsEvent) o;
    return Objects.equals(this.usbPeripheralReport, googleChromeManagementV1TelemetryUsbPeripheralsEvent.usbPeripheralReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usbPeripheralReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1TelemetryUsbPeripheralsEvent {\n");
    sb.append("    usbPeripheralReport: ").append(toIndentedString(usbPeripheralReport)).append("\n");
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
    openapiFields.add("usbPeripheralReport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1TelemetryUsbPeripheralsEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1TelemetryUsbPeripheralsEvent is not found in the empty JSON string", GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1TelemetryUsbPeripheralsEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("usbPeripheralReport") != null && !jsonObj.get("usbPeripheralReport").isJsonNull()) {
        JsonArray jsonArrayusbPeripheralReport = jsonObj.getAsJsonArray("usbPeripheralReport");
        if (jsonArrayusbPeripheralReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usbPeripheralReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usbPeripheralReport` to be an array in the JSON string but got `%s`", jsonObj.get("usbPeripheralReport").toString()));
          }

          // validate the optional field `usbPeripheralReport` (array)
          for (int i = 0; i < jsonArrayusbPeripheralReport.size(); i++) {
            GoogleChromeManagementV1UsbPeripheralReport.validateJsonElement(jsonArrayusbPeripheralReport.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1TelemetryUsbPeripheralsEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1TelemetryUsbPeripheralsEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1TelemetryUsbPeripheralsEvent>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1TelemetryUsbPeripheralsEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1TelemetryUsbPeripheralsEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1TelemetryUsbPeripheralsEvent
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1TelemetryUsbPeripheralsEvent
   */
  public static GoogleChromeManagementV1TelemetryUsbPeripheralsEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1TelemetryUsbPeripheralsEvent.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1TelemetryUsbPeripheralsEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

