/*
 * Profile System
 * Create shopper profiles and manage their information.
 *
 * The version of the OpenAPI document: 1.0
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
 * UpdateClientProfileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:22.513001-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateClientProfileRequest {
  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private String document;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public UpdateClientProfileRequest() {
  }

  public UpdateClientProfileRequest birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Client&#39;s birth date in ISO 8601 format.
   * @return birthDate
   */
  @javax.annotation.Nullable
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }


  public UpdateClientProfileRequest document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Client&#39;s document.
   * @return document
   */
  @javax.annotation.Nullable
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }


  public UpdateClientProfileRequest documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Type of document informed in &#x60;document&#x60;.
   * @return documentType
   */
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public UpdateClientProfileRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Client&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateClientProfileRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Client&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UpdateClientProfileRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Client&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClientProfileRequest updateClientProfileRequest = (UpdateClientProfileRequest) o;
    return Objects.equals(this.birthDate, updateClientProfileRequest.birthDate) &&
        Objects.equals(this.document, updateClientProfileRequest.document) &&
        Objects.equals(this.documentType, updateClientProfileRequest.documentType) &&
        Objects.equals(this.email, updateClientProfileRequest.email) &&
        Objects.equals(this.firstName, updateClientProfileRequest.firstName) &&
        Objects.equals(this.lastName, updateClientProfileRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, document, documentType, email, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClientProfileRequest {\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
    openapiFields.add("birthDate");
    openapiFields.add("document");
    openapiFields.add("documentType");
    openapiFields.add("email");
    openapiFields.add("firstName");
    openapiFields.add("lastName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateClientProfileRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateClientProfileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateClientProfileRequest is not found in the empty JSON string", UpdateClientProfileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateClientProfileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateClientProfileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("birthDate") != null && !jsonObj.get("birthDate").isJsonNull()) && !jsonObj.get("birthDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthDate").toString()));
      }
      if ((jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) && !jsonObj.get("document").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateClientProfileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateClientProfileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateClientProfileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateClientProfileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateClientProfileRequest>() {
           @Override
           public void write(JsonWriter out, UpdateClientProfileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateClientProfileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateClientProfileRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateClientProfileRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateClientProfileRequest
   */
  public static UpdateClientProfileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateClientProfileRequest.class);
  }

  /**
   * Convert an instance of UpdateClientProfileRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

