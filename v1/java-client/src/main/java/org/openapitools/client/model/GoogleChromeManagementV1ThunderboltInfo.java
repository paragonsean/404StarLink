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
 * Thunderbolt bus info. * This field provides device information, which is static and will not change over time. * Data for this field is controlled via policy: [ReportDeviceSecurityStatus](https://chromeenterprise.google/policies/#ReportDeviceSecurityStatus) * Data Collection Frequency: At device startup * Default Data Reporting Frequency: At device startup - Policy Controlled: No * Cache: If the device is offline, the collected data is stored locally, and will be reported when the device is next online: Yes * Reported for affiliated users only: N/A
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:11.322773-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1ThunderboltInfo {
  /**
   * Security level of the Thunderbolt bus.
   */
  @JsonAdapter(SecurityLevelEnum.Adapter.class)
  public enum SecurityLevelEnum {
    LEVEL_UNSPECIFIED("THUNDERBOLT_SECURITY_LEVEL_UNSPECIFIED"),
    
    NONE_LEVEL("THUNDERBOLT_SECURITY_NONE_LEVEL"),
    
    USER_LEVEL("THUNDERBOLT_SECURITY_USER_LEVEL"),
    
    SECURE_LEVEL("THUNDERBOLT_SECURITY_SECURE_LEVEL"),
    
    DP_ONLY_LEVEL("THUNDERBOLT_SECURITY_DP_ONLY_LEVEL"),
    
    USB_ONLY_LEVEL("THUNDERBOLT_SECURITY_USB_ONLY_LEVEL"),
    
    NO_PCIE_LEVEL("THUNDERBOLT_SECURITY_NO_PCIE_LEVEL");

    private String value;

    SecurityLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecurityLevelEnum fromValue(String value) {
      for (SecurityLevelEnum b : SecurityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SecurityLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecurityLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecurityLevelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SecurityLevelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SECURITY_LEVEL = "securityLevel";
  @SerializedName(SERIALIZED_NAME_SECURITY_LEVEL)
  private SecurityLevelEnum securityLevel;

  public GoogleChromeManagementV1ThunderboltInfo() {
  }

  public GoogleChromeManagementV1ThunderboltInfo securityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * Security level of the Thunderbolt bus.
   * @return securityLevel
   */
  @javax.annotation.Nullable
  public SecurityLevelEnum getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1ThunderboltInfo googleChromeManagementV1ThunderboltInfo = (GoogleChromeManagementV1ThunderboltInfo) o;
    return Objects.equals(this.securityLevel, googleChromeManagementV1ThunderboltInfo.securityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1ThunderboltInfo {\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
    openapiFields.add("securityLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1ThunderboltInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1ThunderboltInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1ThunderboltInfo is not found in the empty JSON string", GoogleChromeManagementV1ThunderboltInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1ThunderboltInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1ThunderboltInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("securityLevel") != null && !jsonObj.get("securityLevel").isJsonNull()) && !jsonObj.get("securityLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `securityLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("securityLevel").toString()));
      }
      // validate the optional field `securityLevel`
      if (jsonObj.get("securityLevel") != null && !jsonObj.get("securityLevel").isJsonNull()) {
        SecurityLevelEnum.validateJsonElement(jsonObj.get("securityLevel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1ThunderboltInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1ThunderboltInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1ThunderboltInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1ThunderboltInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1ThunderboltInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1ThunderboltInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1ThunderboltInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1ThunderboltInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1ThunderboltInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1ThunderboltInfo
   */
  public static GoogleChromeManagementV1ThunderboltInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1ThunderboltInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1ThunderboltInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

