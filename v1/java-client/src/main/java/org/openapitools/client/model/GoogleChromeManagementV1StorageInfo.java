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
import org.openapitools.client.model.GoogleChromeManagementV1StorageInfoDiskVolume;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:11.322773-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1StorageInfo {
  public static final String SERIALIZED_NAME_AVAILABLE_DISK_BYTES = "availableDiskBytes";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_DISK_BYTES)
  private String availableDiskBytes;

  public static final String SERIALIZED_NAME_TOTAL_DISK_BYTES = "totalDiskBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISK_BYTES)
  private String totalDiskBytes;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private List<GoogleChromeManagementV1StorageInfoDiskVolume> volume = new ArrayList<>();

  public GoogleChromeManagementV1StorageInfo() {
  }

  public GoogleChromeManagementV1StorageInfo availableDiskBytes(String availableDiskBytes) {
    this.availableDiskBytes = availableDiskBytes;
    return this;
  }

  /**
   * The available space for user data storage in the device in bytes.
   * @return availableDiskBytes
   */
  @javax.annotation.Nullable
  public String getAvailableDiskBytes() {
    return availableDiskBytes;
  }

  public void setAvailableDiskBytes(String availableDiskBytes) {
    this.availableDiskBytes = availableDiskBytes;
  }


  public GoogleChromeManagementV1StorageInfo totalDiskBytes(String totalDiskBytes) {
    this.totalDiskBytes = totalDiskBytes;
    return this;
  }

  /**
   * The total space for user data storage in the device in bytes.
   * @return totalDiskBytes
   */
  @javax.annotation.Nullable
  public String getTotalDiskBytes() {
    return totalDiskBytes;
  }

  public void setTotalDiskBytes(String totalDiskBytes) {
    this.totalDiskBytes = totalDiskBytes;
  }


  public GoogleChromeManagementV1StorageInfo volume(List<GoogleChromeManagementV1StorageInfoDiskVolume> volume) {
    this.volume = volume;
    return this;
  }

  public GoogleChromeManagementV1StorageInfo addVolumeItem(GoogleChromeManagementV1StorageInfoDiskVolume volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<>();
    }
    this.volume.add(volumeItem);
    return this;
  }

  /**
   * Information for disk volumes
   * @return volume
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1StorageInfoDiskVolume> getVolume() {
    return volume;
  }

  public void setVolume(List<GoogleChromeManagementV1StorageInfoDiskVolume> volume) {
    this.volume = volume;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1StorageInfo googleChromeManagementV1StorageInfo = (GoogleChromeManagementV1StorageInfo) o;
    return Objects.equals(this.availableDiskBytes, googleChromeManagementV1StorageInfo.availableDiskBytes) &&
        Objects.equals(this.totalDiskBytes, googleChromeManagementV1StorageInfo.totalDiskBytes) &&
        Objects.equals(this.volume, googleChromeManagementV1StorageInfo.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDiskBytes, totalDiskBytes, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1StorageInfo {\n");
    sb.append("    availableDiskBytes: ").append(toIndentedString(availableDiskBytes)).append("\n");
    sb.append("    totalDiskBytes: ").append(toIndentedString(totalDiskBytes)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
    openapiFields.add("availableDiskBytes");
    openapiFields.add("totalDiskBytes");
    openapiFields.add("volume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1StorageInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1StorageInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1StorageInfo is not found in the empty JSON string", GoogleChromeManagementV1StorageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1StorageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1StorageInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("availableDiskBytes") != null && !jsonObj.get("availableDiskBytes").isJsonNull()) && !jsonObj.get("availableDiskBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableDiskBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableDiskBytes").toString()));
      }
      if ((jsonObj.get("totalDiskBytes") != null && !jsonObj.get("totalDiskBytes").isJsonNull()) && !jsonObj.get("totalDiskBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalDiskBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalDiskBytes").toString()));
      }
      if (jsonObj.get("volume") != null && !jsonObj.get("volume").isJsonNull()) {
        JsonArray jsonArrayvolume = jsonObj.getAsJsonArray("volume");
        if (jsonArrayvolume != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volume").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volume` to be an array in the JSON string but got `%s`", jsonObj.get("volume").toString()));
          }

          // validate the optional field `volume` (array)
          for (int i = 0; i < jsonArrayvolume.size(); i++) {
            GoogleChromeManagementV1StorageInfoDiskVolume.validateJsonElement(jsonArrayvolume.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1StorageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1StorageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1StorageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1StorageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1StorageInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1StorageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1StorageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1StorageInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1StorageInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1StorageInfo
   */
  public static GoogleChromeManagementV1StorageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1StorageInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1StorageInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

