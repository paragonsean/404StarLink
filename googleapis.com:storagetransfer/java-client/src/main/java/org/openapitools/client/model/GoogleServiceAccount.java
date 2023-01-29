/*
 * Storage Transfer API
 * Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
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
 * Google service account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:00:07.190451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleServiceAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_EMAIL = "accountEmail";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_EMAIL)
  private String accountEmail;

  public static final String SERIALIZED_NAME_SUBJECT_ID = "subjectId";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ID)
  private String subjectId;

  public GoogleServiceAccount() {
  }

  public GoogleServiceAccount accountEmail(String accountEmail) {
    this.accountEmail = accountEmail;
    return this;
  }

  /**
   * Email address of the service account.
   * @return accountEmail
   */
  @javax.annotation.Nullable
  public String getAccountEmail() {
    return accountEmail;
  }

  public void setAccountEmail(String accountEmail) {
    this.accountEmail = accountEmail;
  }


  public GoogleServiceAccount subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

  /**
   * Unique identifier for the service account.
   * @return subjectId
   */
  @javax.annotation.Nullable
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleServiceAccount googleServiceAccount = (GoogleServiceAccount) o;
    return Objects.equals(this.accountEmail, googleServiceAccount.accountEmail) &&
        Objects.equals(this.subjectId, googleServiceAccount.subjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountEmail, subjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleServiceAccount {\n");
    sb.append("    accountEmail: ").append(toIndentedString(accountEmail)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
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
    openapiFields.add("accountEmail");
    openapiFields.add("subjectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleServiceAccount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleServiceAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleServiceAccount is not found in the empty JSON string", GoogleServiceAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleServiceAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleServiceAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountEmail") != null && !jsonObj.get("accountEmail").isJsonNull()) && !jsonObj.get("accountEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountEmail").toString()));
      }
      if ((jsonObj.get("subjectId") != null && !jsonObj.get("subjectId").isJsonNull()) && !jsonObj.get("subjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleServiceAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleServiceAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleServiceAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleServiceAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleServiceAccount>() {
           @Override
           public void write(JsonWriter out, GoogleServiceAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleServiceAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleServiceAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleServiceAccount
   * @throws IOException if the JSON string is invalid with respect to GoogleServiceAccount
   */
  public static GoogleServiceAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleServiceAccount.class);
  }

  /**
   * Convert an instance of GoogleServiceAccount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

