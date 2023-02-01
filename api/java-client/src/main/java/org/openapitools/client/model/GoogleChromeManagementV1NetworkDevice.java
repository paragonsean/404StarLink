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
 * Details about the network device. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportNetworkDeviceConfiguration](https://chromeenterprise.google/policies/#ReportNetworkDeviceConfiguration) * Data Collection Frequency: At device startup * Default Data Reporting Frequency: At device startup - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: Yes * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:12.047255-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1NetworkDevice {
  public static final String SERIALIZED_NAME_ICCID = "iccid";
  @SerializedName(SERIALIZED_NAME_ICCID)
  private String iccid;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private String imei;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "macAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MDN = "mdn";
  @SerializedName(SERIALIZED_NAME_MDN)
  private String mdn;

  public static final String SERIALIZED_NAME_MEID = "meid";
  @SerializedName(SERIALIZED_NAME_MEID)
  private String meid;

  /**
   * Output only. Network device type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NETWORK_DEVICE_TYPE_UNSPECIFIED("NETWORK_DEVICE_TYPE_UNSPECIFIED"),
    
    CELLULAR_DEVICE("CELLULAR_DEVICE"),
    
    ETHERNET_DEVICE("ETHERNET_DEVICE"),
    
    WIFI_DEVICE("WIFI_DEVICE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public GoogleChromeManagementV1NetworkDevice() {
  }

  public GoogleChromeManagementV1NetworkDevice(
     String iccid, 
     String imei, 
     String macAddress, 
     String mdn, 
     String meid, 
     TypeEnum type
  ) {
    this();
    this.iccid = iccid;
    this.imei = imei;
    this.macAddress = macAddress;
    this.mdn = mdn;
    this.meid = meid;
    this.type = type;
  }

  /**
   * Output only. The integrated circuit card ID associated with the device&#39;s sim card.
   * @return iccid
   */
  @javax.annotation.Nullable
  public String getIccid() {
    return iccid;
  }



  /**
   * Output only. IMEI (if applicable) of the corresponding network device.
   * @return imei
   */
  @javax.annotation.Nullable
  public String getImei() {
    return imei;
  }



  /**
   * Output only. MAC address (if applicable) of the corresponding network device.
   * @return macAddress
   */
  @javax.annotation.Nullable
  public String getMacAddress() {
    return macAddress;
  }



  /**
   * Output only. The mobile directory number associated with the device&#39;s sim card.
   * @return mdn
   */
  @javax.annotation.Nullable
  public String getMdn() {
    return mdn;
  }



  /**
   * Output only. MEID (if applicable) of the corresponding network device.
   * @return meid
   */
  @javax.annotation.Nullable
  public String getMeid() {
    return meid;
  }



  /**
   * Output only. Network device type.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1NetworkDevice googleChromeManagementV1NetworkDevice = (GoogleChromeManagementV1NetworkDevice) o;
    return Objects.equals(this.iccid, googleChromeManagementV1NetworkDevice.iccid) &&
        Objects.equals(this.imei, googleChromeManagementV1NetworkDevice.imei) &&
        Objects.equals(this.macAddress, googleChromeManagementV1NetworkDevice.macAddress) &&
        Objects.equals(this.mdn, googleChromeManagementV1NetworkDevice.mdn) &&
        Objects.equals(this.meid, googleChromeManagementV1NetworkDevice.meid) &&
        Objects.equals(this.type, googleChromeManagementV1NetworkDevice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, imei, macAddress, mdn, meid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1NetworkDevice {\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mdn: ").append(toIndentedString(mdn)).append("\n");
    sb.append("    meid: ").append(toIndentedString(meid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("iccid");
    openapiFields.add("imei");
    openapiFields.add("macAddress");
    openapiFields.add("mdn");
    openapiFields.add("meid");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1NetworkDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1NetworkDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1NetworkDevice is not found in the empty JSON string", GoogleChromeManagementV1NetworkDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1NetworkDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1NetworkDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("iccid") != null && !jsonObj.get("iccid").isJsonNull()) && !jsonObj.get("iccid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iccid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iccid").toString()));
      }
      if ((jsonObj.get("imei") != null && !jsonObj.get("imei").isJsonNull()) && !jsonObj.get("imei").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imei` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imei").toString()));
      }
      if ((jsonObj.get("macAddress") != null && !jsonObj.get("macAddress").isJsonNull()) && !jsonObj.get("macAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `macAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("macAddress").toString()));
      }
      if ((jsonObj.get("mdn") != null && !jsonObj.get("mdn").isJsonNull()) && !jsonObj.get("mdn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mdn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mdn").toString()));
      }
      if ((jsonObj.get("meid") != null && !jsonObj.get("meid").isJsonNull()) && !jsonObj.get("meid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1NetworkDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1NetworkDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1NetworkDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1NetworkDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1NetworkDevice>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1NetworkDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1NetworkDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1NetworkDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1NetworkDevice
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1NetworkDevice
   */
  public static GoogleChromeManagementV1NetworkDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1NetworkDevice.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1NetworkDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

