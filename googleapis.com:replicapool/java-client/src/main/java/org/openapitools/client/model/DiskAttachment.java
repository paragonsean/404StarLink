/*
 * Replica Pool
 * The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.
 *
 * The version of the OpenAPI document: v1beta1
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
 * Specifies how to attach a disk to a Replica.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:37.514463-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DiskAttachment {
  public static final String SERIALIZED_NAME_DEVICE_NAME = "deviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public DiskAttachment() {
  }

  public DiskAttachment deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * The device name of this disk.
   * @return deviceName
   */
  @javax.annotation.Nullable
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public DiskAttachment index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * A zero-based index to assign to this disk, where 0 is reserved for the boot disk. If not specified, this is assigned by the server.
   * @return index
   */
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskAttachment diskAttachment = (DiskAttachment) o;
    return Objects.equals(this.deviceName, diskAttachment.deviceName) &&
        Objects.equals(this.index, diskAttachment.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskAttachment {\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
    openapiFields.add("deviceName");
    openapiFields.add("index");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DiskAttachment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiskAttachment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiskAttachment is not found in the empty JSON string", DiskAttachment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiskAttachment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiskAttachment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deviceName") != null && !jsonObj.get("deviceName").isJsonNull()) && !jsonObj.get("deviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiskAttachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiskAttachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiskAttachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiskAttachment.class));

       return (TypeAdapter<T>) new TypeAdapter<DiskAttachment>() {
           @Override
           public void write(JsonWriter out, DiskAttachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiskAttachment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DiskAttachment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DiskAttachment
   * @throws IOException if the JSON string is invalid with respect to DiskAttachment
   */
  public static DiskAttachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiskAttachment.class);
  }

  /**
   * Convert an instance of DiskAttachment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

