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
 * Information about a verification endpoint that can be used for 2FA.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:54.758298-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_LAST_VERIFICATION_TIME = "lastVerificationTime";
  @SerializedName(SERIALIZED_NAME_LAST_VERIFICATION_TIME)
  private String lastVerificationTime;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_REQUEST_TOKEN = "requestToken";
  @SerializedName(SERIALIZED_NAME_REQUEST_TOKEN)
  private String requestToken;

  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo() {
  }

  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo(
     String lastVerificationTime, 
     String requestToken
  ) {
    this();
    this.lastVerificationTime = lastVerificationTime;
    this.requestToken = requestToken;
  }

  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address for which to trigger a verification request.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Output only. Timestamp of the last successful verification for the endpoint, if any.
   * @return lastVerificationTime
   */
  @javax.annotation.Nullable
  public String getLastVerificationTime() {
    return lastVerificationTime;
  }



  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number for which to trigger a verification request. Should be given in E.164 format.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * Output only. Token to provide to the client to trigger endpoint verification. It must be used within 15 minutes.
   * @return requestToken
   */
  @javax.annotation.Nullable
  public String getRequestToken() {
    return requestToken;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo googleCloudRecaptchaenterpriseV1EndpointVerificationInfo = (GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo) o;
    return Objects.equals(this.emailAddress, googleCloudRecaptchaenterpriseV1EndpointVerificationInfo.emailAddress) &&
        Objects.equals(this.lastVerificationTime, googleCloudRecaptchaenterpriseV1EndpointVerificationInfo.lastVerificationTime) &&
        Objects.equals(this.phoneNumber, googleCloudRecaptchaenterpriseV1EndpointVerificationInfo.phoneNumber) &&
        Objects.equals(this.requestToken, googleCloudRecaptchaenterpriseV1EndpointVerificationInfo.requestToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, lastVerificationTime, phoneNumber, requestToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    lastVerificationTime: ").append(toIndentedString(lastVerificationTime)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
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
    openapiFields.add("emailAddress");
    openapiFields.add("lastVerificationTime");
    openapiFields.add("phoneNumber");
    openapiFields.add("requestToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if ((jsonObj.get("lastVerificationTime") != null && !jsonObj.get("lastVerificationTime").isJsonNull()) && !jsonObj.get("lastVerificationTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastVerificationTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastVerificationTime").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("requestToken") != null && !jsonObj.get("requestToken").isJsonNull()) && !jsonObj.get("requestToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo
   */
  public static GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

