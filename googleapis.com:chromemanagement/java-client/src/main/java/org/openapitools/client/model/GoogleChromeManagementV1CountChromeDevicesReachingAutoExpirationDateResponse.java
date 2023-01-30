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
import org.openapitools.client.model.GoogleChromeManagementV1DeviceAueCountReport;

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
 * Response containing a list of devices expiring in each month of a selected time frame. Counts are grouped by model and Auto Update Expiration date.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:05.864903-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse {
  public static final String SERIALIZED_NAME_DEVICE_AUE_COUNT_REPORTS = "deviceAueCountReports";
  @SerializedName(SERIALIZED_NAME_DEVICE_AUE_COUNT_REPORTS)
  private List<GoogleChromeManagementV1DeviceAueCountReport> deviceAueCountReports = new ArrayList<>();

  public GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse() {
  }

  public GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse deviceAueCountReports(List<GoogleChromeManagementV1DeviceAueCountReport> deviceAueCountReports) {
    this.deviceAueCountReports = deviceAueCountReports;
    return this;
  }

  public GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse addDeviceAueCountReportsItem(GoogleChromeManagementV1DeviceAueCountReport deviceAueCountReportsItem) {
    if (this.deviceAueCountReports == null) {
      this.deviceAueCountReports = new ArrayList<>();
    }
    this.deviceAueCountReports.add(deviceAueCountReportsItem);
    return this;
  }

  /**
   * The list of reports sorted by auto update expiration date in ascending order.
   * @return deviceAueCountReports
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1DeviceAueCountReport> getDeviceAueCountReports() {
    return deviceAueCountReports;
  }

  public void setDeviceAueCountReports(List<GoogleChromeManagementV1DeviceAueCountReport> deviceAueCountReports) {
    this.deviceAueCountReports = deviceAueCountReports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse googleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse = (GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse) o;
    return Objects.equals(this.deviceAueCountReports, googleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.deviceAueCountReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAueCountReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse {\n");
    sb.append("    deviceAueCountReports: ").append(toIndentedString(deviceAueCountReports)).append("\n");
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
    openapiFields.add("deviceAueCountReports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse is not found in the empty JSON string", GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("deviceAueCountReports") != null && !jsonObj.get("deviceAueCountReports").isJsonNull()) {
        JsonArray jsonArraydeviceAueCountReports = jsonObj.getAsJsonArray("deviceAueCountReports");
        if (jsonArraydeviceAueCountReports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deviceAueCountReports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deviceAueCountReports` to be an array in the JSON string but got `%s`", jsonObj.get("deviceAueCountReports").toString()));
          }

          // validate the optional field `deviceAueCountReports` (array)
          for (int i = 0; i < jsonArraydeviceAueCountReports.size(); i++) {
            GoogleChromeManagementV1DeviceAueCountReport.validateJsonElement(jsonArraydeviceAueCountReports.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse
   */
  public static GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

