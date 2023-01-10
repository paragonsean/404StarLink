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
 * Information about a device associated with telemetry data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1TelemetryDeviceInfo {
  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_ORG_UNIT_ID = "orgUnitId";
  @SerializedName(SERIALIZED_NAME_ORG_UNIT_ID)
  private String orgUnitId;

  public GoogleChromeManagementV1TelemetryDeviceInfo() {
  }

  public GoogleChromeManagementV1TelemetryDeviceInfo(
     String deviceId, 
     String orgUnitId
  ) {
    this();
    this.deviceId = deviceId;
    this.orgUnitId = orgUnitId;
  }

  /**
   * Output only. The unique Directory API ID of the device. This value is the same as the Admin Console&#39;s Directory API ID in the ChromeOS Devices tab.
   * @return deviceId
   */
  @javax.annotation.Nullable
  public String getDeviceId() {
    return deviceId;
  }



  /**
   * Output only. Organization unit ID of the device.
   * @return orgUnitId
   */
  @javax.annotation.Nullable
  public String getOrgUnitId() {
    return orgUnitId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1TelemetryDeviceInfo googleChromeManagementV1TelemetryDeviceInfo = (GoogleChromeManagementV1TelemetryDeviceInfo) o;
    return Objects.equals(this.deviceId, googleChromeManagementV1TelemetryDeviceInfo.deviceId) &&
        Objects.equals(this.orgUnitId, googleChromeManagementV1TelemetryDeviceInfo.orgUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, orgUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1TelemetryDeviceInfo {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
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
    openapiFields.add("deviceId");
    openapiFields.add("orgUnitId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1TelemetryDeviceInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1TelemetryDeviceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1TelemetryDeviceInfo is not found in the empty JSON string", GoogleChromeManagementV1TelemetryDeviceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1TelemetryDeviceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1TelemetryDeviceInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("orgUnitId") != null && !jsonObj.get("orgUnitId").isJsonNull()) && !jsonObj.get("orgUnitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgUnitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgUnitId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1TelemetryDeviceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1TelemetryDeviceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1TelemetryDeviceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1TelemetryDeviceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1TelemetryDeviceInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1TelemetryDeviceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1TelemetryDeviceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1TelemetryDeviceInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1TelemetryDeviceInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1TelemetryDeviceInfo
   */
  public static GoogleChromeManagementV1TelemetryDeviceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1TelemetryDeviceInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1TelemetryDeviceInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

