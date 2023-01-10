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
 * Information for disk volumes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1StorageInfoDiskVolume {
  public static final String SERIALIZED_NAME_STORAGE_FREE_BYTES = "storageFreeBytes";
  @SerializedName(SERIALIZED_NAME_STORAGE_FREE_BYTES)
  private String storageFreeBytes;

  public static final String SERIALIZED_NAME_STORAGE_TOTAL_BYTES = "storageTotalBytes";
  @SerializedName(SERIALIZED_NAME_STORAGE_TOTAL_BYTES)
  private String storageTotalBytes;

  public static final String SERIALIZED_NAME_VOLUME_ID = "volumeId";
  @SerializedName(SERIALIZED_NAME_VOLUME_ID)
  private String volumeId;

  public GoogleChromeManagementV1StorageInfoDiskVolume() {
  }

  public GoogleChromeManagementV1StorageInfoDiskVolume storageFreeBytes(String storageFreeBytes) {
    this.storageFreeBytes = storageFreeBytes;
    return this;
  }

  /**
   * Free storage space in bytes.
   * @return storageFreeBytes
   */
  @javax.annotation.Nullable
  public String getStorageFreeBytes() {
    return storageFreeBytes;
  }

  public void setStorageFreeBytes(String storageFreeBytes) {
    this.storageFreeBytes = storageFreeBytes;
  }


  public GoogleChromeManagementV1StorageInfoDiskVolume storageTotalBytes(String storageTotalBytes) {
    this.storageTotalBytes = storageTotalBytes;
    return this;
  }

  /**
   * Total storage space in bytes.
   * @return storageTotalBytes
   */
  @javax.annotation.Nullable
  public String getStorageTotalBytes() {
    return storageTotalBytes;
  }

  public void setStorageTotalBytes(String storageTotalBytes) {
    this.storageTotalBytes = storageTotalBytes;
  }


  public GoogleChromeManagementV1StorageInfoDiskVolume volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * Disk volume id.
   * @return volumeId
   */
  @javax.annotation.Nullable
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1StorageInfoDiskVolume googleChromeManagementV1StorageInfoDiskVolume = (GoogleChromeManagementV1StorageInfoDiskVolume) o;
    return Objects.equals(this.storageFreeBytes, googleChromeManagementV1StorageInfoDiskVolume.storageFreeBytes) &&
        Objects.equals(this.storageTotalBytes, googleChromeManagementV1StorageInfoDiskVolume.storageTotalBytes) &&
        Objects.equals(this.volumeId, googleChromeManagementV1StorageInfoDiskVolume.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageFreeBytes, storageTotalBytes, volumeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1StorageInfoDiskVolume {\n");
    sb.append("    storageFreeBytes: ").append(toIndentedString(storageFreeBytes)).append("\n");
    sb.append("    storageTotalBytes: ").append(toIndentedString(storageTotalBytes)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
    openapiFields.add("storageFreeBytes");
    openapiFields.add("storageTotalBytes");
    openapiFields.add("volumeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1StorageInfoDiskVolume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1StorageInfoDiskVolume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1StorageInfoDiskVolume is not found in the empty JSON string", GoogleChromeManagementV1StorageInfoDiskVolume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1StorageInfoDiskVolume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1StorageInfoDiskVolume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("storageFreeBytes") != null && !jsonObj.get("storageFreeBytes").isJsonNull()) && !jsonObj.get("storageFreeBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageFreeBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageFreeBytes").toString()));
      }
      if ((jsonObj.get("storageTotalBytes") != null && !jsonObj.get("storageTotalBytes").isJsonNull()) && !jsonObj.get("storageTotalBytes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageTotalBytes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageTotalBytes").toString()));
      }
      if ((jsonObj.get("volumeId") != null && !jsonObj.get("volumeId").isJsonNull()) && !jsonObj.get("volumeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1StorageInfoDiskVolume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1StorageInfoDiskVolume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1StorageInfoDiskVolume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1StorageInfoDiskVolume.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1StorageInfoDiskVolume>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1StorageInfoDiskVolume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1StorageInfoDiskVolume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1StorageInfoDiskVolume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1StorageInfoDiskVolume
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1StorageInfoDiskVolume
   */
  public static GoogleChromeManagementV1StorageInfoDiskVolume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1StorageInfoDiskVolume.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1StorageInfoDiskVolume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

