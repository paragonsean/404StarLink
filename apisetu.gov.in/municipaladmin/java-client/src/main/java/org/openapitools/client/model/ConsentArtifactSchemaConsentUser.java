/*
 * Directorate of Municipal Administration, Karnataka
 * APIs provided by Directorate of Municipal Administration, Karnataka.
 *
 * The version of the OpenAPI document: 3.0.0
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
 * ConsentArtifactSchemaConsentUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:33.174984-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConsentArtifactSchemaConsentUser {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID_NUMBER = "idNumber";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public ConsentArtifactSchemaConsentUser() {
  }

  public ConsentArtifactSchemaConsentUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public ConsentArtifactSchemaConsentUser idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * Get idNumber
   * @return idNumber
   */
  @javax.annotation.Nonnull
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public ConsentArtifactSchemaConsentUser idType(String idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   */
  @javax.annotation.Nonnull
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }


  public ConsentArtifactSchemaConsentUser mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
   */
  @javax.annotation.Nonnull
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentArtifactSchemaConsentUser consentArtifactSchemaConsentUser = (ConsentArtifactSchemaConsentUser) o;
    return Objects.equals(this.email, consentArtifactSchemaConsentUser.email) &&
        Objects.equals(this.idNumber, consentArtifactSchemaConsentUser.idNumber) &&
        Objects.equals(this.idType, consentArtifactSchemaConsentUser.idType) &&
        Objects.equals(this.mobile, consentArtifactSchemaConsentUser.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idNumber, idType, mobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentArtifactSchemaConsentUser {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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
    openapiFields.add("idNumber");
    openapiFields.add("idType");
    openapiFields.add("mobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("idNumber");
    openapiRequiredFields.add("idType");
    openapiRequiredFields.add("mobile");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentArtifactSchemaConsentUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentArtifactSchemaConsentUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentArtifactSchemaConsentUser is not found in the empty JSON string", ConsentArtifactSchemaConsentUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentArtifactSchemaConsentUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentArtifactSchemaConsentUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentArtifactSchemaConsentUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("idNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idNumber").toString()));
      }
      if (!jsonObj.get("idType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idType").toString()));
      }
      if (!jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentArtifactSchemaConsentUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentArtifactSchemaConsentUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentArtifactSchemaConsentUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentArtifactSchemaConsentUser.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentArtifactSchemaConsentUser>() {
           @Override
           public void write(JsonWriter out, ConsentArtifactSchemaConsentUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentArtifactSchemaConsentUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentArtifactSchemaConsentUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentArtifactSchemaConsentUser
   * @throws IOException if the JSON string is invalid with respect to ConsentArtifactSchemaConsentUser
   */
  public static ConsentArtifactSchemaConsentUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentArtifactSchemaConsentUser.class);
  }

  /**
   * Convert an instance of ConsentArtifactSchemaConsentUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

