/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
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
 * ApiV1AdminAccountsIdActionPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:23.722002-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ApiV1AdminAccountsIdActionPostRequest {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_SEND_EMAIL_NOTIFICATION = "send_email_notification";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL_NOTIFICATION)
  private Boolean sendEmailNotification;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  /**
   * Type of action to be taken. Enumerable oneOf: none disable silence suspend
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("none"),
    
    DISABLE("disable"),
    
    SILENCE("silence"),
    
    SUSPEND("suspend");

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

  public static final String SERIALIZED_NAME_WARNING_PRESET_ID = "warning_preset_id";
  @SerializedName(SERIALIZED_NAME_WARNING_PRESET_ID)
  private String warningPresetId;

  public ApiV1AdminAccountsIdActionPostRequest() {
  }

  public ApiV1AdminAccountsIdActionPostRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * ID of an associated report that caused this action to be taken
   * @return reportId
   */
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public ApiV1AdminAccountsIdActionPostRequest sendEmailNotification(Boolean sendEmailNotification) {
    this.sendEmailNotification = sendEmailNotification;
    return this;
  }

  /**
   * Whether an email should be sent to the user with the above information.
   * @return sendEmailNotification
   */
  @javax.annotation.Nullable
  public Boolean getSendEmailNotification() {
    return sendEmailNotification;
  }

  public void setSendEmailNotification(Boolean sendEmailNotification) {
    this.sendEmailNotification = sendEmailNotification;
  }


  public ApiV1AdminAccountsIdActionPostRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Additional text for clarification of why this action was taken
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public ApiV1AdminAccountsIdActionPostRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of action to be taken. Enumerable oneOf: none disable silence suspend
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ApiV1AdminAccountsIdActionPostRequest warningPresetId(String warningPresetId) {
    this.warningPresetId = warningPresetId;
    return this;
  }

  /**
   * ID of a preset warning
   * @return warningPresetId
   */
  @javax.annotation.Nullable
  public String getWarningPresetId() {
    return warningPresetId;
  }

  public void setWarningPresetId(String warningPresetId) {
    this.warningPresetId = warningPresetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AdminAccountsIdActionPostRequest apiV1AdminAccountsIdActionPostRequest = (ApiV1AdminAccountsIdActionPostRequest) o;
    return Objects.equals(this.reportId, apiV1AdminAccountsIdActionPostRequest.reportId) &&
        Objects.equals(this.sendEmailNotification, apiV1AdminAccountsIdActionPostRequest.sendEmailNotification) &&
        Objects.equals(this.text, apiV1AdminAccountsIdActionPostRequest.text) &&
        Objects.equals(this.type, apiV1AdminAccountsIdActionPostRequest.type) &&
        Objects.equals(this.warningPresetId, apiV1AdminAccountsIdActionPostRequest.warningPresetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, sendEmailNotification, text, type, warningPresetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AdminAccountsIdActionPostRequest {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    sendEmailNotification: ").append(toIndentedString(sendEmailNotification)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    warningPresetId: ").append(toIndentedString(warningPresetId)).append("\n");
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
    openapiFields.add("report_id");
    openapiFields.add("send_email_notification");
    openapiFields.add("text");
    openapiFields.add("type");
    openapiFields.add("warning_preset_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiV1AdminAccountsIdActionPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiV1AdminAccountsIdActionPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV1AdminAccountsIdActionPostRequest is not found in the empty JSON string", ApiV1AdminAccountsIdActionPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiV1AdminAccountsIdActionPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV1AdminAccountsIdActionPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("warning_preset_id") != null && !jsonObj.get("warning_preset_id").isJsonNull()) && !jsonObj.get("warning_preset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_preset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning_preset_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV1AdminAccountsIdActionPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV1AdminAccountsIdActionPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV1AdminAccountsIdActionPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV1AdminAccountsIdActionPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV1AdminAccountsIdActionPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV1AdminAccountsIdActionPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV1AdminAccountsIdActionPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiV1AdminAccountsIdActionPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiV1AdminAccountsIdActionPostRequest
   * @throws IOException if the JSON string is invalid with respect to ApiV1AdminAccountsIdActionPostRequest
   */
  public static ApiV1AdminAccountsIdActionPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV1AdminAccountsIdActionPostRequest.class);
  }

  /**
   * Convert an instance of ApiV1AdminAccountsIdActionPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

