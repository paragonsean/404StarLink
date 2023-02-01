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
import org.openapitools.client.model.GoogleChromeManagementV1TotalMemoryEncryptionInfo;

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
 * Memory information of a device. * This field has both telemetry and device information: - &#x60;totalRamBytes&#x60; - Device information - &#x60;availableRamBytes&#x60; - Telemetry information - &#x60;totalMemoryEncryption&#x60; - Device information * Data for this field is controlled via policy: [ReportDeviceMemoryInfo](https://chromeenterprise.google/policies/#ReportDeviceMemoryInfo) * Data Collection Frequency: - &#x60;totalRamBytes&#x60; - Only at upload - &#x60;availableRamBytes&#x60; - Every 10 minutes - &#x60;totalMemoryEncryption&#x60; - at device startup * Default Data Reporting Frequency: - &#x60;totalRamBytes&#x60; - 3 hours - &#x60;availableRamBytes&#x60; - 3 hours - &#x60;totalMemoryEncryption&#x60; - at device startup - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: only for &#x60;totalMemoryEncryption&#x60; * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:12.047255-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1MemoryInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_RAM_BYTES = "availableRamBytes";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_RAM_BYTES)
  private String availableRamBytes;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_ENCRYPTION = "totalMemoryEncryption";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_ENCRYPTION)
  private GoogleChromeManagementV1TotalMemoryEncryptionInfo totalMemoryEncryption;

  public static final String SERIALIZED_NAME_TOTAL_RAM_BYTES = "totalRamBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_RAM_BYTES)
  private String totalRamBytes;

  public GoogleChromeManagementV1MemoryInfo() {
  }

  public GoogleChromeManagementV1MemoryInfo(
     String availableRamBytes, 
     String totalRamBytes
  ) {
    this();
    this.availableRamBytes = availableRamBytes;
    this.totalRamBytes = totalRamBytes;
  }

  /**
   * Output only. Amount of available RAM in bytes.
   * @return availableRamBytes
   */
  @javax.annotation.Nullable
  public String getAvailableRamBytes() {
    return availableRamBytes;
  }



  public GoogleChromeManagementV1MemoryInfo totalMemoryEncryption(GoogleChromeManagementV1TotalMemoryEncryptionInfo totalMemoryEncryption) {
    this.totalMemoryEncryption = totalMemoryEncryption;
    return this;
  }

  /**
   * Get totalMemoryEncryption
   * @return totalMemoryEncryption
   */
  @javax.annotation.Nullable
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo getTotalMemoryEncryption() {
    return totalMemoryEncryption;
  }

  public void setTotalMemoryEncryption(GoogleChromeManagementV1TotalMemoryEncryptionInfo totalMemoryEncryption) {
    this.totalMemoryEncryption = totalMemoryEncryption;
  }


  /**
   * Output only. Total RAM in bytes.
   * @return totalRamBytes
   */
  @javax.annotation.Nullable
  public String getTotalRamBytes() {
    return totalRamBytes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1MemoryInfo googleChromeManagementV1MemoryInfo = (GoogleChromeManagementV1MemoryInfo) o;
    return Objects.equals(this.availableRamBytes, googleChromeManagementV1MemoryInfo.availableRamBytes) &&
        Objects.equals(this.totalMemoryEncryption, googleChromeManagementV1MemoryInfo.totalMemoryEncryption) &&
        Objects.equals(this.totalRamBytes, googleChromeManagementV1MemoryInfo.totalRamBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableRamBytes, totalMemoryEncryption, totalRamBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1MemoryInfo {\n");
    sb.append("    availableRamBytes: ").append(toIndentedString(availableRamBytes)).append("\n");
    sb.append("    totalMemoryEncryption: ").append(toIndentedString(totalMemoryEncryption)).append("\n");
    sb.append("    totalRamBytes: ").append(toIndentedString(totalRamBytes)).append("\n");
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
    openapiFields.add("availableRamBytes");
    openapiFields.add("totalMemoryEncryption");
    openapiFields.add("totalRamBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1MemoryInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1MemoryInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1MemoryInfo is not found in the empty JSON string", GoogleChromeManagementV1MemoryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1MemoryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1MemoryInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("availableRamBytes") != null && !jsonObj.get("availableRamBytes").isJsonNull()) && !jsonObj.get("availableRamBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableRamBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableRamBytes").toString()));
      }
      // validate the optional field `totalMemoryEncryption`
      if (jsonObj.get("totalMemoryEncryption") != null && !jsonObj.get("totalMemoryEncryption").isJsonNull()) {
        GoogleChromeManagementV1TotalMemoryEncryptionInfo.validateJsonElement(jsonObj.get("totalMemoryEncryption"));
      }
      if ((jsonObj.get("totalRamBytes") != null && !jsonObj.get("totalRamBytes").isJsonNull()) && !jsonObj.get("totalRamBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalRamBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalRamBytes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1MemoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1MemoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1MemoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1MemoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1MemoryInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1MemoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1MemoryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1MemoryInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1MemoryInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1MemoryInfo
   */
  public static GoogleChromeManagementV1MemoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1MemoryInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1MemoryInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

