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
import org.openapitools.client.model.GoogleTypeDate;

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
 * Information about the battery. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDevicePowerStatus](https://chromeenterprise.google/policies/#ReportDevicePowerStatus) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:12.047255-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1BatteryInfo {
  public static final String SERIALIZED_NAME_DESIGN_CAPACITY = "designCapacity";
  @SerializedName(SERIALIZED_NAME_DESIGN_CAPACITY)
  private String designCapacity;

  public static final String SERIALIZED_NAME_DESIGN_MIN_VOLTAGE = "designMinVoltage";
  @SerializedName(SERIALIZED_NAME_DESIGN_MIN_VOLTAGE)
  private Integer designMinVoltage;

  public static final String SERIALIZED_NAME_MANUFACTURE_DATE = "manufactureDate";
  @SerializedName(SERIALIZED_NAME_MANUFACTURE_DATE)
  private GoogleTypeDate manufactureDate;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_TECHNOLOGY = "technology";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY)
  private String technology;

  public GoogleChromeManagementV1BatteryInfo() {
  }

  public GoogleChromeManagementV1BatteryInfo(
     String designCapacity, 
     Integer designMinVoltage, 
     String manufacturer, 
     String serialNumber, 
     String technology
  ) {
    this();
    this.designCapacity = designCapacity;
    this.designMinVoltage = designMinVoltage;
    this.manufacturer = manufacturer;
    this.serialNumber = serialNumber;
    this.technology = technology;
  }

  /**
   * Output only. Design capacity (mAmpere-hours).
   * @return designCapacity
   */
  @javax.annotation.Nullable
  public String getDesignCapacity() {
    return designCapacity;
  }



  /**
   * Output only. Designed minimum output voltage (mV)
   * @return designMinVoltage
   */
  @javax.annotation.Nullable
  public Integer getDesignMinVoltage() {
    return designMinVoltage;
  }



  public GoogleChromeManagementV1BatteryInfo manufactureDate(GoogleTypeDate manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * Get manufactureDate
   * @return manufactureDate
   */
  @javax.annotation.Nullable
  public GoogleTypeDate getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(GoogleTypeDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  }


  /**
   * Output only. Battery manufacturer.
   * @return manufacturer
   */
  @javax.annotation.Nullable
  public String getManufacturer() {
    return manufacturer;
  }



  /**
   * Output only. Battery serial number.
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }



  /**
   * Output only. Technology of the battery. Example: Li-ion
   * @return technology
   */
  @javax.annotation.Nullable
  public String getTechnology() {
    return technology;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1BatteryInfo googleChromeManagementV1BatteryInfo = (GoogleChromeManagementV1BatteryInfo) o;
    return Objects.equals(this.designCapacity, googleChromeManagementV1BatteryInfo.designCapacity) &&
        Objects.equals(this.designMinVoltage, googleChromeManagementV1BatteryInfo.designMinVoltage) &&
        Objects.equals(this.manufactureDate, googleChromeManagementV1BatteryInfo.manufactureDate) &&
        Objects.equals(this.manufacturer, googleChromeManagementV1BatteryInfo.manufacturer) &&
        Objects.equals(this.serialNumber, googleChromeManagementV1BatteryInfo.serialNumber) &&
        Objects.equals(this.technology, googleChromeManagementV1BatteryInfo.technology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designCapacity, designMinVoltage, manufactureDate, manufacturer, serialNumber, technology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1BatteryInfo {\n");
    sb.append("    designCapacity: ").append(toIndentedString(designCapacity)).append("\n");
    sb.append("    designMinVoltage: ").append(toIndentedString(designMinVoltage)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
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
    openapiFields.add("designCapacity");
    openapiFields.add("designMinVoltage");
    openapiFields.add("manufactureDate");
    openapiFields.add("manufacturer");
    openapiFields.add("serialNumber");
    openapiFields.add("technology");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1BatteryInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1BatteryInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1BatteryInfo is not found in the empty JSON string", GoogleChromeManagementV1BatteryInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1BatteryInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1BatteryInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("designCapacity") != null && !jsonObj.get("designCapacity").isJsonNull()) && !jsonObj.get("designCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `designCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("designCapacity").toString()));
      }
      // validate the optional field `manufactureDate`
      if (jsonObj.get("manufactureDate") != null && !jsonObj.get("manufactureDate").isJsonNull()) {
        GoogleTypeDate.validateJsonElement(jsonObj.get("manufactureDate"));
      }
      if ((jsonObj.get("manufacturer") != null && !jsonObj.get("manufacturer").isJsonNull()) && !jsonObj.get("manufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      if ((jsonObj.get("technology") != null && !jsonObj.get("technology").isJsonNull()) && !jsonObj.get("technology").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `technology` to be a primitive type in the JSON string but got `%s`", jsonObj.get("technology").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1BatteryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1BatteryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1BatteryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1BatteryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1BatteryInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1BatteryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1BatteryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1BatteryInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1BatteryInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1BatteryInfo
   */
  public static GoogleChromeManagementV1BatteryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1BatteryInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1BatteryInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

