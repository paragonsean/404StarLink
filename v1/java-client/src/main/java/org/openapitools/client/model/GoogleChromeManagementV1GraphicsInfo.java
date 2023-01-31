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
import org.openapitools.client.model.GoogleChromeManagementV1DisplayDevice;
import org.openapitools.client.model.GoogleChromeManagementV1GraphicsAdapterInfo;
import org.openapitools.client.model.GoogleChromeManagementV1TouchScreenInfo;

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
 * Information of the graphics subsystem. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDeviceGraphicsStatus](https://chromeenterprise.google/policies/#ReportDeviceGraphicsStatus) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:08.888155-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1GraphicsInfo {
  public static final String SERIALIZED_NAME_ADAPTER_INFO = "adapterInfo";
  @SerializedName(SERIALIZED_NAME_ADAPTER_INFO)
  private GoogleChromeManagementV1GraphicsAdapterInfo adapterInfo;

  public static final String SERIALIZED_NAME_DISPLAY_DEVICES = "displayDevices";
  @SerializedName(SERIALIZED_NAME_DISPLAY_DEVICES)
  private List<GoogleChromeManagementV1DisplayDevice> displayDevices = new ArrayList<>();

  public static final String SERIALIZED_NAME_EPRIVACY_SUPPORTED = "eprivacySupported";
  @SerializedName(SERIALIZED_NAME_EPRIVACY_SUPPORTED)
  private Boolean eprivacySupported;

  public static final String SERIALIZED_NAME_TOUCH_SCREEN_INFO = "touchScreenInfo";
  @SerializedName(SERIALIZED_NAME_TOUCH_SCREEN_INFO)
  private GoogleChromeManagementV1TouchScreenInfo touchScreenInfo;

  public GoogleChromeManagementV1GraphicsInfo() {
  }

  public GoogleChromeManagementV1GraphicsInfo(
     List<GoogleChromeManagementV1DisplayDevice> displayDevices, 
     Boolean eprivacySupported
  ) {
    this();
    this.displayDevices = displayDevices;
    this.eprivacySupported = eprivacySupported;
  }

  public GoogleChromeManagementV1GraphicsInfo adapterInfo(GoogleChromeManagementV1GraphicsAdapterInfo adapterInfo) {
    this.adapterInfo = adapterInfo;
    return this;
  }

  /**
   * Get adapterInfo
   * @return adapterInfo
   */
  @javax.annotation.Nullable
  public GoogleChromeManagementV1GraphicsAdapterInfo getAdapterInfo() {
    return adapterInfo;
  }

  public void setAdapterInfo(GoogleChromeManagementV1GraphicsAdapterInfo adapterInfo) {
    this.adapterInfo = adapterInfo;
  }


  /**
   * Output only. Information about the display(s) of the device.
   * @return displayDevices
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1DisplayDevice> getDisplayDevices() {
    return displayDevices;
  }



  /**
   * Output only. Is ePrivacy screen supported or not.
   * @return eprivacySupported
   */
  @javax.annotation.Nullable
  public Boolean getEprivacySupported() {
    return eprivacySupported;
  }



  public GoogleChromeManagementV1GraphicsInfo touchScreenInfo(GoogleChromeManagementV1TouchScreenInfo touchScreenInfo) {
    this.touchScreenInfo = touchScreenInfo;
    return this;
  }

  /**
   * Get touchScreenInfo
   * @return touchScreenInfo
   */
  @javax.annotation.Nullable
  public GoogleChromeManagementV1TouchScreenInfo getTouchScreenInfo() {
    return touchScreenInfo;
  }

  public void setTouchScreenInfo(GoogleChromeManagementV1TouchScreenInfo touchScreenInfo) {
    this.touchScreenInfo = touchScreenInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1GraphicsInfo googleChromeManagementV1GraphicsInfo = (GoogleChromeManagementV1GraphicsInfo) o;
    return Objects.equals(this.adapterInfo, googleChromeManagementV1GraphicsInfo.adapterInfo) &&
        Objects.equals(this.displayDevices, googleChromeManagementV1GraphicsInfo.displayDevices) &&
        Objects.equals(this.eprivacySupported, googleChromeManagementV1GraphicsInfo.eprivacySupported) &&
        Objects.equals(this.touchScreenInfo, googleChromeManagementV1GraphicsInfo.touchScreenInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterInfo, displayDevices, eprivacySupported, touchScreenInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1GraphicsInfo {\n");
    sb.append("    adapterInfo: ").append(toIndentedString(adapterInfo)).append("\n");
    sb.append("    displayDevices: ").append(toIndentedString(displayDevices)).append("\n");
    sb.append("    eprivacySupported: ").append(toIndentedString(eprivacySupported)).append("\n");
    sb.append("    touchScreenInfo: ").append(toIndentedString(touchScreenInfo)).append("\n");
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
    openapiFields.add("adapterInfo");
    openapiFields.add("displayDevices");
    openapiFields.add("eprivacySupported");
    openapiFields.add("touchScreenInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1GraphicsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1GraphicsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1GraphicsInfo is not found in the empty JSON string", GoogleChromeManagementV1GraphicsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1GraphicsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1GraphicsInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `adapterInfo`
      if (jsonObj.get("adapterInfo") != null && !jsonObj.get("adapterInfo").isJsonNull()) {
        GoogleChromeManagementV1GraphicsAdapterInfo.validateJsonElement(jsonObj.get("adapterInfo"));
      }
      if (jsonObj.get("displayDevices") != null && !jsonObj.get("displayDevices").isJsonNull()) {
        JsonArray jsonArraydisplayDevices = jsonObj.getAsJsonArray("displayDevices");
        if (jsonArraydisplayDevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("displayDevices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `displayDevices` to be an array in the JSON string but got `%s`", jsonObj.get("displayDevices").toString()));
          }

          // validate the optional field `displayDevices` (array)
          for (int i = 0; i < jsonArraydisplayDevices.size(); i++) {
            GoogleChromeManagementV1DisplayDevice.validateJsonElement(jsonArraydisplayDevices.get(i));
          };
        }
      }
      // validate the optional field `touchScreenInfo`
      if (jsonObj.get("touchScreenInfo") != null && !jsonObj.get("touchScreenInfo").isJsonNull()) {
        GoogleChromeManagementV1TouchScreenInfo.validateJsonElement(jsonObj.get("touchScreenInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1GraphicsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1GraphicsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1GraphicsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1GraphicsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1GraphicsInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1GraphicsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1GraphicsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1GraphicsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1GraphicsInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1GraphicsInfo
   */
  public static GoogleChromeManagementV1GraphicsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1GraphicsInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1GraphicsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

