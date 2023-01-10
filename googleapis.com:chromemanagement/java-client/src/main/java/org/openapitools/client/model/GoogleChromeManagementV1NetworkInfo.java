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
import org.openapitools.client.model.GoogleChromeManagementV1NetworkDevice;

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
 * Network device information. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportNetworkDeviceConfiguration](https://chromeenterprise.google/policies/#ReportNetworkDeviceConfiguration) * Data Collection Frequency: At device startup * Default Data Reporting Frequency: At device startup - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: Yes * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1NetworkInfo {
  public static final String SERIALIZED_NAME_NETWORK_DEVICES = "networkDevices";
  @SerializedName(SERIALIZED_NAME_NETWORK_DEVICES)
  private List<GoogleChromeManagementV1NetworkDevice> networkDevices = new ArrayList<>();

  public GoogleChromeManagementV1NetworkInfo() {
  }

  public GoogleChromeManagementV1NetworkInfo(
     List<GoogleChromeManagementV1NetworkDevice> networkDevices
  ) {
    this();
    this.networkDevices = networkDevices;
  }

  /**
   * Output only. List of network devices.
   * @return networkDevices
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1NetworkDevice> getNetworkDevices() {
    return networkDevices;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1NetworkInfo googleChromeManagementV1NetworkInfo = (GoogleChromeManagementV1NetworkInfo) o;
    return Objects.equals(this.networkDevices, googleChromeManagementV1NetworkInfo.networkDevices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkDevices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1NetworkInfo {\n");
    sb.append("    networkDevices: ").append(toIndentedString(networkDevices)).append("\n");
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
    openapiFields.add("networkDevices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1NetworkInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1NetworkInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1NetworkInfo is not found in the empty JSON string", GoogleChromeManagementV1NetworkInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1NetworkInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1NetworkInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("networkDevices") != null && !jsonObj.get("networkDevices").isJsonNull()) {
        JsonArray jsonArraynetworkDevices = jsonObj.getAsJsonArray("networkDevices");
        if (jsonArraynetworkDevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("networkDevices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `networkDevices` to be an array in the JSON string but got `%s`", jsonObj.get("networkDevices").toString()));
          }

          // validate the optional field `networkDevices` (array)
          for (int i = 0; i < jsonArraynetworkDevices.size(); i++) {
            GoogleChromeManagementV1NetworkDevice.validateJsonElement(jsonArraynetworkDevices.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1NetworkInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1NetworkInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1NetworkInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1NetworkInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1NetworkInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1NetworkInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1NetworkInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1NetworkInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1NetworkInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1NetworkInfo
   */
  public static GoogleChromeManagementV1NetworkInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1NetworkInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1NetworkInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

