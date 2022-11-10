/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
 * Contact: mike.ralphson@gmail.com
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
import java.util.List;
import org.openapitools.client.model.CreateUserMessageAuthenticationMode;

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
 * ModifyUserMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:52.956161-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ModifyUserMessage {
  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ACCESS_STRING = "AccessString";
  @SerializedName(SERIALIZED_NAME_ACCESS_STRING)
  private String accessString;

  public static final String SERIALIZED_NAME_APPEND_ACCESS_STRING = "AppendAccessString";
  @SerializedName(SERIALIZED_NAME_APPEND_ACCESS_STRING)
  private String appendAccessString;

  public static final String SERIALIZED_NAME_PASSWORDS = "Passwords";
  @SerializedName(SERIALIZED_NAME_PASSWORDS)
  private List passwords;

  public static final String SERIALIZED_NAME_NO_PASSWORD_REQUIRED = "NoPasswordRequired";
  @SerializedName(SERIALIZED_NAME_NO_PASSWORD_REQUIRED)
  private Boolean noPasswordRequired;

  public static final String SERIALIZED_NAME_AUTHENTICATION_MODE = "AuthenticationMode";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_MODE)
  private CreateUserMessageAuthenticationMode authenticationMode;

  public ModifyUserMessage() {
  }

  public ModifyUserMessage userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ModifyUserMessage accessString(String accessString) {
    this.accessString = accessString;
    return this;
  }

  /**
   * Get accessString
   * @return accessString
   */
  @javax.annotation.Nullable
  public String getAccessString() {
    return accessString;
  }

  public void setAccessString(String accessString) {
    this.accessString = accessString;
  }


  public ModifyUserMessage appendAccessString(String appendAccessString) {
    this.appendAccessString = appendAccessString;
    return this;
  }

  /**
   * Get appendAccessString
   * @return appendAccessString
   */
  @javax.annotation.Nullable
  public String getAppendAccessString() {
    return appendAccessString;
  }

  public void setAppendAccessString(String appendAccessString) {
    this.appendAccessString = appendAccessString;
  }


  public ModifyUserMessage passwords(List passwords) {
    this.passwords = passwords;
    return this;
  }

  /**
   * Get passwords
   * @return passwords
   */
  @javax.annotation.Nullable
  public List getPasswords() {
    return passwords;
  }

  public void setPasswords(List passwords) {
    this.passwords = passwords;
  }


  public ModifyUserMessage noPasswordRequired(Boolean noPasswordRequired) {
    this.noPasswordRequired = noPasswordRequired;
    return this;
  }

  /**
   * Get noPasswordRequired
   * @return noPasswordRequired
   */
  @javax.annotation.Nullable
  public Boolean getNoPasswordRequired() {
    return noPasswordRequired;
  }

  public void setNoPasswordRequired(Boolean noPasswordRequired) {
    this.noPasswordRequired = noPasswordRequired;
  }


  public ModifyUserMessage authenticationMode(CreateUserMessageAuthenticationMode authenticationMode) {
    this.authenticationMode = authenticationMode;
    return this;
  }

  /**
   * Get authenticationMode
   * @return authenticationMode
   */
  @javax.annotation.Nullable
  public CreateUserMessageAuthenticationMode getAuthenticationMode() {
    return authenticationMode;
  }

  public void setAuthenticationMode(CreateUserMessageAuthenticationMode authenticationMode) {
    this.authenticationMode = authenticationMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyUserMessage modifyUserMessage = (ModifyUserMessage) o;
    return Objects.equals(this.userId, modifyUserMessage.userId) &&
        Objects.equals(this.accessString, modifyUserMessage.accessString) &&
        Objects.equals(this.appendAccessString, modifyUserMessage.appendAccessString) &&
        Objects.equals(this.passwords, modifyUserMessage.passwords) &&
        Objects.equals(this.noPasswordRequired, modifyUserMessage.noPasswordRequired) &&
        Objects.equals(this.authenticationMode, modifyUserMessage.authenticationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accessString, appendAccessString, passwords, noPasswordRequired, authenticationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyUserMessage {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessString: ").append(toIndentedString(accessString)).append("\n");
    sb.append("    appendAccessString: ").append(toIndentedString(appendAccessString)).append("\n");
    sb.append("    passwords: ").append(toIndentedString(passwords)).append("\n");
    sb.append("    noPasswordRequired: ").append(toIndentedString(noPasswordRequired)).append("\n");
    sb.append("    authenticationMode: ").append(toIndentedString(authenticationMode)).append("\n");
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
    openapiFields.add("UserId");
    openapiFields.add("AccessString");
    openapiFields.add("AppendAccessString");
    openapiFields.add("Passwords");
    openapiFields.add("NoPasswordRequired");
    openapiFields.add("AuthenticationMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UserId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyUserMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyUserMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyUserMessage is not found in the empty JSON string", ModifyUserMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyUserMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyUserMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyUserMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `UserId`
      String.validateJsonElement(jsonObj.get("UserId"));
      // validate the optional field `AccessString`
      if (jsonObj.get("AccessString") != null && !jsonObj.get("AccessString").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AccessString"));
      }
      // validate the optional field `AppendAccessString`
      if (jsonObj.get("AppendAccessString") != null && !jsonObj.get("AppendAccessString").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AppendAccessString"));
      }
      // validate the optional field `Passwords`
      if (jsonObj.get("Passwords") != null && !jsonObj.get("Passwords").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("Passwords"));
      }
      // validate the optional field `NoPasswordRequired`
      if (jsonObj.get("NoPasswordRequired") != null && !jsonObj.get("NoPasswordRequired").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("NoPasswordRequired"));
      }
      // validate the optional field `AuthenticationMode`
      if (jsonObj.get("AuthenticationMode") != null && !jsonObj.get("AuthenticationMode").isJsonNull()) {
        CreateUserMessageAuthenticationMode.validateJsonElement(jsonObj.get("AuthenticationMode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyUserMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyUserMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyUserMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyUserMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyUserMessage>() {
           @Override
           public void write(JsonWriter out, ModifyUserMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyUserMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyUserMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyUserMessage
   * @throws IOException if the JSON string is invalid with respect to ModifyUserMessage
   */
  public static ModifyUserMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyUserMessage.class);
  }

  /**
   * Convert an instance of ModifyUserMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

