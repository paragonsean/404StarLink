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
 * CPU specifications for the device * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDeviceCpuInfo](https://chromeenterprise.google/policies/#ReportDeviceCpuInfo) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:08.888155-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1CpuInfo {
  /**
   * Output only. Architecture type for the CPU. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDeviceCpuInfo](https://chromeenterprise.google/policies/#ReportDeviceCpuInfo) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
   */
  @JsonAdapter(ArchitectureEnum.Adapter.class)
  public enum ArchitectureEnum {
    ARCHITECTURE_UNSPECIFIED("ARCHITECTURE_UNSPECIFIED"),
    
    X64("X64");

    private String value;

    ArchitectureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArchitectureEnum fromValue(String value) {
      for (ArchitectureEnum b : ArchitectureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArchitectureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArchitectureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArchitectureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArchitectureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ArchitectureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private ArchitectureEnum architecture;

  public static final String SERIALIZED_NAME_KEYLOCKER_CONFIGURED = "keylockerConfigured";
  @SerializedName(SERIALIZED_NAME_KEYLOCKER_CONFIGURED)
  private Boolean keylockerConfigured;

  public static final String SERIALIZED_NAME_KEYLOCKER_SUPPORTED = "keylockerSupported";
  @SerializedName(SERIALIZED_NAME_KEYLOCKER_SUPPORTED)
  private Boolean keylockerSupported;

  public static final String SERIALIZED_NAME_MAX_CLOCK_SPEED = "maxClockSpeed";
  @SerializedName(SERIALIZED_NAME_MAX_CLOCK_SPEED)
  private Integer maxClockSpeed;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public GoogleChromeManagementV1CpuInfo() {
  }

  public GoogleChromeManagementV1CpuInfo(
     ArchitectureEnum architecture, 
     Boolean keylockerConfigured, 
     Boolean keylockerSupported, 
     Integer maxClockSpeed, 
     String model
  ) {
    this();
    this.architecture = architecture;
    this.keylockerConfigured = keylockerConfigured;
    this.keylockerSupported = keylockerSupported;
    this.maxClockSpeed = maxClockSpeed;
    this.model = model;
  }

  /**
   * Output only. Architecture type for the CPU. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDeviceCpuInfo](https://chromeenterprise.google/policies/#ReportDeviceCpuInfo) * Data Collection Frequency: Only at Upload * Default Data Reporting Frequency: 3 hours - Policy Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: No * Reported for affiliated users only: N/A
   * @return architecture
   */
  @javax.annotation.Nullable
  public ArchitectureEnum getArchitecture() {
    return architecture;
  }



  /**
   * Output only. Whether keylocker is configured.&#x60;TRUE&#x60; &#x3D; Enabled; &#x60;FALSE&#x60; &#x3D; disabled. Only reported if keylockerSupported &#x3D; &#x60;TRUE&#x60;.
   * @return keylockerConfigured
   */
  @javax.annotation.Nullable
  public Boolean getKeylockerConfigured() {
    return keylockerConfigured;
  }



  /**
   * Output only. Whether keylocker is supported.
   * @return keylockerSupported
   */
  @javax.annotation.Nullable
  public Boolean getKeylockerSupported() {
    return keylockerSupported;
  }



  /**
   * Output only. The max CPU clock speed in kHz.
   * @return maxClockSpeed
   */
  @javax.annotation.Nullable
  public Integer getMaxClockSpeed() {
    return maxClockSpeed;
  }



  /**
   * Output only. The CPU model name. Example: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1CpuInfo googleChromeManagementV1CpuInfo = (GoogleChromeManagementV1CpuInfo) o;
    return Objects.equals(this.architecture, googleChromeManagementV1CpuInfo.architecture) &&
        Objects.equals(this.keylockerConfigured, googleChromeManagementV1CpuInfo.keylockerConfigured) &&
        Objects.equals(this.keylockerSupported, googleChromeManagementV1CpuInfo.keylockerSupported) &&
        Objects.equals(this.maxClockSpeed, googleChromeManagementV1CpuInfo.maxClockSpeed) &&
        Objects.equals(this.model, googleChromeManagementV1CpuInfo.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, keylockerConfigured, keylockerSupported, maxClockSpeed, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1CpuInfo {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    keylockerConfigured: ").append(toIndentedString(keylockerConfigured)).append("\n");
    sb.append("    keylockerSupported: ").append(toIndentedString(keylockerSupported)).append("\n");
    sb.append("    maxClockSpeed: ").append(toIndentedString(maxClockSpeed)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
    openapiFields.add("architecture");
    openapiFields.add("keylockerConfigured");
    openapiFields.add("keylockerSupported");
    openapiFields.add("maxClockSpeed");
    openapiFields.add("model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1CpuInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1CpuInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1CpuInfo is not found in the empty JSON string", GoogleChromeManagementV1CpuInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1CpuInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1CpuInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("architecture") != null && !jsonObj.get("architecture").isJsonNull()) && !jsonObj.get("architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("architecture").toString()));
      }
      // validate the optional field `architecture`
      if (jsonObj.get("architecture") != null && !jsonObj.get("architecture").isJsonNull()) {
        ArchitectureEnum.validateJsonElement(jsonObj.get("architecture"));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1CpuInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1CpuInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1CpuInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1CpuInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1CpuInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1CpuInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1CpuInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1CpuInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1CpuInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1CpuInfo
   */
  public static GoogleChromeManagementV1CpuInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1CpuInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1CpuInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

