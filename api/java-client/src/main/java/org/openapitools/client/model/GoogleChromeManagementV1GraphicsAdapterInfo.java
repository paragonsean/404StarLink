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
 * Information of a graphics adapter (GPU).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:12.047255-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1GraphicsAdapterInfo {
  public static final String SERIALIZED_NAME_ADAPTER = "adapter";
  @SerializedName(SERIALIZED_NAME_ADAPTER)
  private String adapter;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_DRIVER_VERSION = "driverVersion";
  @SerializedName(SERIALIZED_NAME_DRIVER_VERSION)
  private String driverVersion;

  public GoogleChromeManagementV1GraphicsAdapterInfo() {
  }

  public GoogleChromeManagementV1GraphicsAdapterInfo(
     String adapter, 
     String deviceId, 
     String driverVersion
  ) {
    this();
    this.adapter = adapter;
    this.deviceId = deviceId;
    this.driverVersion = driverVersion;
  }

  /**
   * Output only. Adapter name. Example: Mesa DRI Intel(R) UHD Graphics 620 (Kabylake GT2).
   * @return adapter
   */
  @javax.annotation.Nullable
  public String getAdapter() {
    return adapter;
  }



  /**
   * Output only. Represents the graphics card device id.
   * @return deviceId
   */
  @javax.annotation.Nullable
  public String getDeviceId() {
    return deviceId;
  }



  /**
   * Output only. Version of the GPU driver.
   * @return driverVersion
   */
  @javax.annotation.Nullable
  public String getDriverVersion() {
    return driverVersion;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1GraphicsAdapterInfo googleChromeManagementV1GraphicsAdapterInfo = (GoogleChromeManagementV1GraphicsAdapterInfo) o;
    return Objects.equals(this.adapter, googleChromeManagementV1GraphicsAdapterInfo.adapter) &&
        Objects.equals(this.deviceId, googleChromeManagementV1GraphicsAdapterInfo.deviceId) &&
        Objects.equals(this.driverVersion, googleChromeManagementV1GraphicsAdapterInfo.driverVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapter, deviceId, driverVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1GraphicsAdapterInfo {\n");
    sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
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
    openapiFields.add("adapter");
    openapiFields.add("deviceId");
    openapiFields.add("driverVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1GraphicsAdapterInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1GraphicsAdapterInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1GraphicsAdapterInfo is not found in the empty JSON string", GoogleChromeManagementV1GraphicsAdapterInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1GraphicsAdapterInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1GraphicsAdapterInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("adapter") != null && !jsonObj.get("adapter").isJsonNull()) && !jsonObj.get("adapter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adapter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adapter").toString()));
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("driverVersion") != null && !jsonObj.get("driverVersion").isJsonNull()) && !jsonObj.get("driverVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1GraphicsAdapterInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1GraphicsAdapterInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1GraphicsAdapterInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1GraphicsAdapterInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1GraphicsAdapterInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1GraphicsAdapterInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1GraphicsAdapterInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1GraphicsAdapterInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1GraphicsAdapterInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1GraphicsAdapterInfo
   */
  public static GoogleChromeManagementV1GraphicsAdapterInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1GraphicsAdapterInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1GraphicsAdapterInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

