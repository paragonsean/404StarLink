/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
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
 * Details about a user&#39;s account involved in the transaction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:04:37.006704-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1TransactionDataUser {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREATION_MS = "creationMs";
  @SerializedName(SERIALIZED_NAME_CREATION_MS)
  private String creationMs;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EMAIL_VERIFIED = "emailVerified";
  @SerializedName(SERIALIZED_NAME_EMAIL_VERIFIED)
  private Boolean emailVerified;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_VERIFIED = "phoneVerified";
  @SerializedName(SERIALIZED_NAME_PHONE_VERIFIED)
  private Boolean phoneVerified;

  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser() {
  }

  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Unique account identifier for this user. If using account defender, this should match the hashed_account_id field. Otherwise, a unique and persistent identifier for this account.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser creationMs(String creationMs) {
    this.creationMs = creationMs;
    return this;
  }

  /**
   * The epoch milliseconds of the user&#39;s account creation.
   * @return creationMs
   */
  @javax.annotation.Nullable
  public String getCreationMs() {
    return creationMs;
  }

  public void setCreationMs(String creationMs) {
    this.creationMs = creationMs;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * Whether the email has been verified to be accessible by the user (OTP or similar).
   * @return emailVerified
   */
  @javax.annotation.Nullable
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number of the user, with country code.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public GoogleCloudRecaptchaenterpriseV1TransactionDataUser phoneVerified(Boolean phoneVerified) {
    this.phoneVerified = phoneVerified;
    return this;
  }

  /**
   * Whether the phone number has been verified to be accessible by the user (OTP or similar).
   * @return phoneVerified
   */
  @javax.annotation.Nullable
  public Boolean getPhoneVerified() {
    return phoneVerified;
  }

  public void setPhoneVerified(Boolean phoneVerified) {
    this.phoneVerified = phoneVerified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1TransactionDataUser googleCloudRecaptchaenterpriseV1TransactionDataUser = (GoogleCloudRecaptchaenterpriseV1TransactionDataUser) o;
    return Objects.equals(this.accountId, googleCloudRecaptchaenterpriseV1TransactionDataUser.accountId) &&
        Objects.equals(this.creationMs, googleCloudRecaptchaenterpriseV1TransactionDataUser.creationMs) &&
        Objects.equals(this.email, googleCloudRecaptchaenterpriseV1TransactionDataUser.email) &&
        Objects.equals(this.emailVerified, googleCloudRecaptchaenterpriseV1TransactionDataUser.emailVerified) &&
        Objects.equals(this.phoneNumber, googleCloudRecaptchaenterpriseV1TransactionDataUser.phoneNumber) &&
        Objects.equals(this.phoneVerified, googleCloudRecaptchaenterpriseV1TransactionDataUser.phoneVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationMs, email, emailVerified, phoneNumber, phoneVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1TransactionDataUser {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationMs: ").append(toIndentedString(creationMs)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneVerified: ").append(toIndentedString(phoneVerified)).append("\n");
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
    openapiFields.add("creationMs");
    openapiFields.add("email");
    openapiFields.add("emailVerified");
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneVerified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionDataUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionDataUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1TransactionDataUser is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1TransactionDataUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1TransactionDataUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1TransactionDataUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("creationMs") != null && !jsonObj.get("creationMs").isJsonNull()) && !jsonObj.get("creationMs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creationMs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creationMs").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1TransactionDataUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1TransactionDataUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionDataUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1TransactionDataUser.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1TransactionDataUser>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1TransactionDataUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1TransactionDataUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1TransactionDataUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1TransactionDataUser
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1TransactionDataUser
   */
  public static GoogleCloudRecaptchaenterpriseV1TransactionDataUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1TransactionDataUser.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1TransactionDataUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

