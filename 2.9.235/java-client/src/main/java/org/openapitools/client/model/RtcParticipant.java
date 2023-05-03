/*
 * REST API Version 2
 * Circuit REST API to interact with the Circuit system.  [Learn more about the Circuit Development Community](https://www.circuit.com/web/developers/home)
 *
 * The version of the OpenAPI document: 2.9.235
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * RtcParticipant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:55.210987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RtcParticipant {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FULLY_QUALIFIED_NUMBER = "fullyQualifiedNumber";
  @SerializedName(SERIALIZED_NAME_FULLY_QUALIFIED_NUMBER)
  private String fullyQualifiedNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_RESOLVED_USER = "resolvedUser";
  @SerializedName(SERIALIZED_NAME_RESOLVED_USER)
  private Object resolvedUser = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public RtcParticipant() {
  }

  public RtcParticipant displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the participant.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public RtcParticipant fullyQualifiedNumber(String fullyQualifiedNumber) {
    this.fullyQualifiedNumber = fullyQualifiedNumber;
    return this;
  }

  /**
   * missing documentation
   * @return fullyQualifiedNumber
   */
  @javax.annotation.Nullable
  public String getFullyQualifiedNumber() {
    return fullyQualifiedNumber;
  }

  public void setFullyQualifiedNumber(String fullyQualifiedNumber) {
    this.fullyQualifiedNumber = fullyQualifiedNumber;
  }


  public RtcParticipant phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * missing documentation
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public RtcParticipant resolvedUser(Object resolvedUser) {
    this.resolvedUser = resolvedUser;
    return this;
  }

  /**
   * missing documentation
   * @return resolvedUser
   */
  @javax.annotation.Nullable
  public Object getResolvedUser() {
    return resolvedUser;
  }

  public void setResolvedUser(Object resolvedUser) {
    this.resolvedUser = resolvedUser;
  }


  public RtcParticipant type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The RTC type of the participant.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public RtcParticipant userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the participant.
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtcParticipant rtcParticipant = (RtcParticipant) o;
    return Objects.equals(this.displayName, rtcParticipant.displayName) &&
        Objects.equals(this.fullyQualifiedNumber, rtcParticipant.fullyQualifiedNumber) &&
        Objects.equals(this.phoneNumber, rtcParticipant.phoneNumber) &&
        Objects.equals(this.resolvedUser, rtcParticipant.resolvedUser) &&
        Objects.equals(this.type, rtcParticipant.type) &&
        Objects.equals(this.userId, rtcParticipant.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, fullyQualifiedNumber, phoneNumber, resolvedUser, type, userId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtcParticipant {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fullyQualifiedNumber: ").append(toIndentedString(fullyQualifiedNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    resolvedUser: ").append(toIndentedString(resolvedUser)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("fullyQualifiedNumber");
    openapiFields.add("phoneNumber");
    openapiFields.add("resolvedUser");
    openapiFields.add("type");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RtcParticipant
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RtcParticipant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RtcParticipant is not found in the empty JSON string", RtcParticipant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RtcParticipant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RtcParticipant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("fullyQualifiedNumber") != null && !jsonObj.get("fullyQualifiedNumber").isJsonNull()) && !jsonObj.get("fullyQualifiedNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullyQualifiedNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullyQualifiedNumber").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RtcParticipant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RtcParticipant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RtcParticipant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RtcParticipant.class));

       return (TypeAdapter<T>) new TypeAdapter<RtcParticipant>() {
           @Override
           public void write(JsonWriter out, RtcParticipant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RtcParticipant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RtcParticipant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RtcParticipant
   * @throws IOException if the JSON string is invalid with respect to RtcParticipant
   */
  public static RtcParticipant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RtcParticipant.class);
  }

  /**
   * Convert an instance of RtcParticipant to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

