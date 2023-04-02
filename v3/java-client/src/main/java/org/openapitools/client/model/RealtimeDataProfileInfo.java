/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
 *
 * The version of the OpenAPI document: v3
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
 * Information for the view (profile), for which the real time data was requested.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RealtimeDataProfileInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_INTERNAL_WEB_PROPERTY_ID = "internalWebPropertyId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_WEB_PROPERTY_ID)
  private String internalWebPropertyId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_PROFILE_NAME = "profileName";
  @SerializedName(SERIALIZED_NAME_PROFILE_NAME)
  private String profileName;

  public static final String SERIALIZED_NAME_TABLE_ID = "tableId";
  @SerializedName(SERIALIZED_NAME_TABLE_ID)
  private String tableId;

  public static final String SERIALIZED_NAME_WEB_PROPERTY_ID = "webPropertyId";
  @SerializedName(SERIALIZED_NAME_WEB_PROPERTY_ID)
  private String webPropertyId;

  public RealtimeDataProfileInfo() {
  }

  public RealtimeDataProfileInfo accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account ID to which this view (profile) belongs.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public RealtimeDataProfileInfo internalWebPropertyId(String internalWebPropertyId) {
    this.internalWebPropertyId = internalWebPropertyId;
    return this;
  }

  /**
   * Internal ID for the web property to which this view (profile) belongs.
   * @return internalWebPropertyId
   */
  @javax.annotation.Nullable
  public String getInternalWebPropertyId() {
    return internalWebPropertyId;
  }

  public void setInternalWebPropertyId(String internalWebPropertyId) {
    this.internalWebPropertyId = internalWebPropertyId;
  }


  public RealtimeDataProfileInfo profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * View (Profile) ID.
   * @return profileId
   */
  @javax.annotation.Nullable
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public RealtimeDataProfileInfo profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * View (Profile) name.
   * @return profileName
   */
  @javax.annotation.Nullable
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }


  public RealtimeDataProfileInfo tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Table ID for view (profile).
   * @return tableId
   */
  @javax.annotation.Nullable
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  public RealtimeDataProfileInfo webPropertyId(String webPropertyId) {
    this.webPropertyId = webPropertyId;
    return this;
  }

  /**
   * Web Property ID to which this view (profile) belongs.
   * @return webPropertyId
   */
  @javax.annotation.Nullable
  public String getWebPropertyId() {
    return webPropertyId;
  }

  public void setWebPropertyId(String webPropertyId) {
    this.webPropertyId = webPropertyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeDataProfileInfo realtimeDataProfileInfo = (RealtimeDataProfileInfo) o;
    return Objects.equals(this.accountId, realtimeDataProfileInfo.accountId) &&
        Objects.equals(this.internalWebPropertyId, realtimeDataProfileInfo.internalWebPropertyId) &&
        Objects.equals(this.profileId, realtimeDataProfileInfo.profileId) &&
        Objects.equals(this.profileName, realtimeDataProfileInfo.profileName) &&
        Objects.equals(this.tableId, realtimeDataProfileInfo.tableId) &&
        Objects.equals(this.webPropertyId, realtimeDataProfileInfo.webPropertyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, internalWebPropertyId, profileId, profileName, tableId, webPropertyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeDataProfileInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    internalWebPropertyId: ").append(toIndentedString(internalWebPropertyId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    webPropertyId: ").append(toIndentedString(webPropertyId)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("internalWebPropertyId");
    openapiFields.add("profileId");
    openapiFields.add("profileName");
    openapiFields.add("tableId");
    openapiFields.add("webPropertyId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RealtimeDataProfileInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealtimeDataProfileInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealtimeDataProfileInfo is not found in the empty JSON string", RealtimeDataProfileInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RealtimeDataProfileInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RealtimeDataProfileInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("internalWebPropertyId") != null && !jsonObj.get("internalWebPropertyId").isJsonNull()) && !jsonObj.get("internalWebPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalWebPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalWebPropertyId").toString()));
      }
      if ((jsonObj.get("profileId") != null && !jsonObj.get("profileId").isJsonNull()) && !jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
      if ((jsonObj.get("profileName") != null && !jsonObj.get("profileName").isJsonNull()) && !jsonObj.get("profileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileName").toString()));
      }
      if ((jsonObj.get("tableId") != null && !jsonObj.get("tableId").isJsonNull()) && !jsonObj.get("tableId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tableId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tableId").toString()));
      }
      if ((jsonObj.get("webPropertyId") != null && !jsonObj.get("webPropertyId").isJsonNull()) && !jsonObj.get("webPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webPropertyId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealtimeDataProfileInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealtimeDataProfileInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealtimeDataProfileInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealtimeDataProfileInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RealtimeDataProfileInfo>() {
           @Override
           public void write(JsonWriter out, RealtimeDataProfileInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RealtimeDataProfileInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RealtimeDataProfileInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RealtimeDataProfileInfo
   * @throws IOException if the JSON string is invalid with respect to RealtimeDataProfileInfo
   */
  public static RealtimeDataProfileInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealtimeDataProfileInfo.class);
  }

  /**
   * Convert an instance of RealtimeDataProfileInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

