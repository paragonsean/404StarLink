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
import org.openapitools.client.model.GoogleChromeManagementV1ChromeAppPermission;
import org.openapitools.client.model.GoogleChromeManagementV1ChromeAppSiteAccess;

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
 * Chrome Web Store app information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:08.409671-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1ChromeAppInfo {
  public static final String SERIALIZED_NAME_GOOGLE_OWNED = "googleOwned";
  @SerializedName(SERIALIZED_NAME_GOOGLE_OWNED)
  private Boolean googleOwned;

  public static final String SERIALIZED_NAME_IS_CWS_HOSTED = "isCwsHosted";
  @SerializedName(SERIALIZED_NAME_IS_CWS_HOSTED)
  private Boolean isCwsHosted;

  public static final String SERIALIZED_NAME_IS_EXTENSION_POLICY_SUPPORTED = "isExtensionPolicySupported";
  @SerializedName(SERIALIZED_NAME_IS_EXTENSION_POLICY_SUPPORTED)
  private Boolean isExtensionPolicySupported;

  public static final String SERIALIZED_NAME_IS_KIOSK_ONLY = "isKioskOnly";
  @SerializedName(SERIALIZED_NAME_IS_KIOSK_ONLY)
  private Boolean isKioskOnly;

  public static final String SERIALIZED_NAME_IS_THEME = "isTheme";
  @SerializedName(SERIALIZED_NAME_IS_THEME)
  private Boolean isTheme;

  public static final String SERIALIZED_NAME_KIOSK_ENABLED = "kioskEnabled";
  @SerializedName(SERIALIZED_NAME_KIOSK_ENABLED)
  private Boolean kioskEnabled;

  public static final String SERIALIZED_NAME_MIN_USER_COUNT = "minUserCount";
  @SerializedName(SERIALIZED_NAME_MIN_USER_COUNT)
  private Integer minUserCount;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<GoogleChromeManagementV1ChromeAppPermission> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SITE_ACCESS = "siteAccess";
  @SerializedName(SERIALIZED_NAME_SITE_ACCESS)
  private List<GoogleChromeManagementV1ChromeAppSiteAccess> siteAccess = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORT_ENABLED = "supportEnabled";
  @SerializedName(SERIALIZED_NAME_SUPPORT_ENABLED)
  private Boolean supportEnabled;

  /**
   * Output only. Types of an item in the Chrome Web Store
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ITEM_TYPE_UNSPECIFIED("ITEM_TYPE_UNSPECIFIED"),
    
    EXTENSION("EXTENSION"),
    
    OTHERS("OTHERS");

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

  public GoogleChromeManagementV1ChromeAppInfo() {
  }

  public GoogleChromeManagementV1ChromeAppInfo(
     Boolean googleOwned, 
     Boolean isCwsHosted, 
     Boolean isExtensionPolicySupported, 
     Boolean isKioskOnly, 
     Boolean isTheme, 
     Boolean kioskEnabled, 
     Integer minUserCount, 
     List<GoogleChromeManagementV1ChromeAppPermission> permissions, 
     List<GoogleChromeManagementV1ChromeAppSiteAccess> siteAccess, 
     Boolean supportEnabled, 
     TypeEnum type
  ) {
    this();
    this.googleOwned = googleOwned;
    this.isCwsHosted = isCwsHosted;
    this.isExtensionPolicySupported = isExtensionPolicySupported;
    this.isKioskOnly = isKioskOnly;
    this.isTheme = isTheme;
    this.kioskEnabled = kioskEnabled;
    this.minUserCount = minUserCount;
    this.permissions = permissions;
    this.siteAccess = siteAccess;
    this.supportEnabled = supportEnabled;
    this.type = type;
  }

  /**
   * Output only. Whether the app or extension is built and maintained by Google. Version-specific field that will only be set when the requested app version is found.
   * @return googleOwned
   */
  @javax.annotation.Nullable
  public Boolean getGoogleOwned() {
    return googleOwned;
  }



  /**
   * Output only. Whether the app or extension is in a published state in the Chrome Web Store.
   * @return isCwsHosted
   */
  @javax.annotation.Nullable
  public Boolean getIsCwsHosted() {
    return isCwsHosted;
  }



  /**
   * Output only. Whether an app supports policy for extensions.
   * @return isExtensionPolicySupported
   */
  @javax.annotation.Nullable
  public Boolean getIsExtensionPolicySupported() {
    return isExtensionPolicySupported;
  }



  /**
   * Output only. Whether the app is only for Kiosk mode on ChromeOS devices
   * @return isKioskOnly
   */
  @javax.annotation.Nullable
  public Boolean getIsKioskOnly() {
    return isKioskOnly;
  }



  /**
   * Output only. Whether the app or extension is a theme.
   * @return isTheme
   */
  @javax.annotation.Nullable
  public Boolean getIsTheme() {
    return isTheme;
  }



  /**
   * Output only. Whether this app is enabled for Kiosk mode on ChromeOS devices
   * @return kioskEnabled
   */
  @javax.annotation.Nullable
  public Boolean getKioskEnabled() {
    return kioskEnabled;
  }



  /**
   * Output only. The minimum number of users using this app.
   * @return minUserCount
   */
  @javax.annotation.Nullable
  public Integer getMinUserCount() {
    return minUserCount;
  }



  /**
   * Output only. Every custom permission requested by the app. Version-specific field that will only be set when the requested app version is found.
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1ChromeAppPermission> getPermissions() {
    return permissions;
  }



  /**
   * Output only. Every permission giving access to domains or broad host patterns. ( e.g. www.google.com). This includes the matches from content scripts as well as hosts in the permissions node of the manifest. Version-specific field that will only be set when the requested app version is found.
   * @return siteAccess
   */
  @javax.annotation.Nullable
  public List<GoogleChromeManagementV1ChromeAppSiteAccess> getSiteAccess() {
    return siteAccess;
  }



  /**
   * Output only. The app developer has enabled support for their app. Version-specific field that will only be set when the requested app version is found.
   * @return supportEnabled
   */
  @javax.annotation.Nullable
  public Boolean getSupportEnabled() {
    return supportEnabled;
  }



  /**
   * Output only. Types of an item in the Chrome Web Store
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
    GoogleChromeManagementV1ChromeAppInfo googleChromeManagementV1ChromeAppInfo = (GoogleChromeManagementV1ChromeAppInfo) o;
    return Objects.equals(this.googleOwned, googleChromeManagementV1ChromeAppInfo.googleOwned) &&
        Objects.equals(this.isCwsHosted, googleChromeManagementV1ChromeAppInfo.isCwsHosted) &&
        Objects.equals(this.isExtensionPolicySupported, googleChromeManagementV1ChromeAppInfo.isExtensionPolicySupported) &&
        Objects.equals(this.isKioskOnly, googleChromeManagementV1ChromeAppInfo.isKioskOnly) &&
        Objects.equals(this.isTheme, googleChromeManagementV1ChromeAppInfo.isTheme) &&
        Objects.equals(this.kioskEnabled, googleChromeManagementV1ChromeAppInfo.kioskEnabled) &&
        Objects.equals(this.minUserCount, googleChromeManagementV1ChromeAppInfo.minUserCount) &&
        Objects.equals(this.permissions, googleChromeManagementV1ChromeAppInfo.permissions) &&
        Objects.equals(this.siteAccess, googleChromeManagementV1ChromeAppInfo.siteAccess) &&
        Objects.equals(this.supportEnabled, googleChromeManagementV1ChromeAppInfo.supportEnabled) &&
        Objects.equals(this.type, googleChromeManagementV1ChromeAppInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(googleOwned, isCwsHosted, isExtensionPolicySupported, isKioskOnly, isTheme, kioskEnabled, minUserCount, permissions, siteAccess, supportEnabled, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1ChromeAppInfo {\n");
    sb.append("    googleOwned: ").append(toIndentedString(googleOwned)).append("\n");
    sb.append("    isCwsHosted: ").append(toIndentedString(isCwsHosted)).append("\n");
    sb.append("    isExtensionPolicySupported: ").append(toIndentedString(isExtensionPolicySupported)).append("\n");
    sb.append("    isKioskOnly: ").append(toIndentedString(isKioskOnly)).append("\n");
    sb.append("    isTheme: ").append(toIndentedString(isTheme)).append("\n");
    sb.append("    kioskEnabled: ").append(toIndentedString(kioskEnabled)).append("\n");
    sb.append("    minUserCount: ").append(toIndentedString(minUserCount)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    siteAccess: ").append(toIndentedString(siteAccess)).append("\n");
    sb.append("    supportEnabled: ").append(toIndentedString(supportEnabled)).append("\n");
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
    openapiFields.add("googleOwned");
    openapiFields.add("isCwsHosted");
    openapiFields.add("isExtensionPolicySupported");
    openapiFields.add("isKioskOnly");
    openapiFields.add("isTheme");
    openapiFields.add("kioskEnabled");
    openapiFields.add("minUserCount");
    openapiFields.add("permissions");
    openapiFields.add("siteAccess");
    openapiFields.add("supportEnabled");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1ChromeAppInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1ChromeAppInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1ChromeAppInfo is not found in the empty JSON string", GoogleChromeManagementV1ChromeAppInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1ChromeAppInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1ChromeAppInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            GoogleChromeManagementV1ChromeAppPermission.validateJsonElement(jsonArraypermissions.get(i));
          };
        }
      }
      if (jsonObj.get("siteAccess") != null && !jsonObj.get("siteAccess").isJsonNull()) {
        JsonArray jsonArraysiteAccess = jsonObj.getAsJsonArray("siteAccess");
        if (jsonArraysiteAccess != null) {
          // ensure the json data is an array
          if (!jsonObj.get("siteAccess").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `siteAccess` to be an array in the JSON string but got `%s`", jsonObj.get("siteAccess").toString()));
          }

          // validate the optional field `siteAccess` (array)
          for (int i = 0; i < jsonArraysiteAccess.size(); i++) {
            GoogleChromeManagementV1ChromeAppSiteAccess.validateJsonElement(jsonArraysiteAccess.get(i));
          };
        }
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
       if (!GoogleChromeManagementV1ChromeAppInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1ChromeAppInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1ChromeAppInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1ChromeAppInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1ChromeAppInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1ChromeAppInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1ChromeAppInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1ChromeAppInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1ChromeAppInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1ChromeAppInfo
   */
  public static GoogleChromeManagementV1ChromeAppInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1ChromeAppInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1ChromeAppInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

