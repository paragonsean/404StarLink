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
 * Information about a user associated with telemetry data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:11.322773-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleChromeManagementV1TelemetryUserInfo {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ORG_UNIT_ID = "orgUnitId";
  @SerializedName(SERIALIZED_NAME_ORG_UNIT_ID)
  private String orgUnitId;

  public GoogleChromeManagementV1TelemetryUserInfo() {
  }

  public GoogleChromeManagementV1TelemetryUserInfo(
     String email, 
     String orgUnitId
  ) {
    this();
    this.email = email;
    this.orgUnitId = orgUnitId;
  }

  /**
   * Output only. User&#39;s email.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }



  /**
   * Output only. Organization unit ID of the user.
   * @return orgUnitId
   */
  @javax.annotation.Nullable
  public String getOrgUnitId() {
    return orgUnitId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChromeManagementV1TelemetryUserInfo googleChromeManagementV1TelemetryUserInfo = (GoogleChromeManagementV1TelemetryUserInfo) o;
    return Objects.equals(this.email, googleChromeManagementV1TelemetryUserInfo.email) &&
        Objects.equals(this.orgUnitId, googleChromeManagementV1TelemetryUserInfo.orgUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, orgUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChromeManagementV1TelemetryUserInfo {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("orgUnitId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleChromeManagementV1TelemetryUserInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleChromeManagementV1TelemetryUserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleChromeManagementV1TelemetryUserInfo is not found in the empty JSON string", GoogleChromeManagementV1TelemetryUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleChromeManagementV1TelemetryUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleChromeManagementV1TelemetryUserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("orgUnitId") != null && !jsonObj.get("orgUnitId").isJsonNull()) && !jsonObj.get("orgUnitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgUnitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgUnitId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleChromeManagementV1TelemetryUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleChromeManagementV1TelemetryUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleChromeManagementV1TelemetryUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleChromeManagementV1TelemetryUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleChromeManagementV1TelemetryUserInfo>() {
           @Override
           public void write(JsonWriter out, GoogleChromeManagementV1TelemetryUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleChromeManagementV1TelemetryUserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleChromeManagementV1TelemetryUserInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleChromeManagementV1TelemetryUserInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleChromeManagementV1TelemetryUserInfo
   */
  public static GoogleChromeManagementV1TelemetryUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleChromeManagementV1TelemetryUserInfo.class);
  }

  /**
   * Convert an instance of GoogleChromeManagementV1TelemetryUserInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

