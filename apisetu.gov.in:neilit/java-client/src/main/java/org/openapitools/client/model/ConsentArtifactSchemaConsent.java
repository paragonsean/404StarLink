/*
 * National Institute of Electronics and Information Technology
 * NIELIT, under Ministry of Electronics & IT (http://www.nielit.gov.in/) provides education and training in the area of Information, Electronics & Communication Technology. Certificates issued by NIELIT are made available in students' DigiLocker accounts.
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.ConsentArtifactSchemaConsentData;
import org.openapitools.client.model.ConsentArtifactSchemaConsentPermission;
import org.openapitools.client.model.ConsentArtifactSchemaConsentPurpose;
import org.openapitools.client.model.ConsentArtifactSchemaConsentUser;

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
 * ConsentArtifactSchemaConsent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:56.522348-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConsentArtifactSchemaConsent {
  public static final String SERIALIZED_NAME_CONSENT_ID = "consentId";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private UUID consentId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ConsentArtifactSchemaConsentData data;

  public static final String SERIALIZED_NAME_DATA_CONSUMER = "dataConsumer";
  @SerializedName(SERIALIZED_NAME_DATA_CONSUMER)
  private ConsentArtifactSchemaConsentData dataConsumer;

  public static final String SERIALIZED_NAME_DATA_PROVIDER = "dataProvider";
  @SerializedName(SERIALIZED_NAME_DATA_PROVIDER)
  private ConsentArtifactSchemaConsentData dataProvider;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private ConsentArtifactSchemaConsentPermission permission;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private ConsentArtifactSchemaConsentPurpose purpose;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private ConsentArtifactSchemaConsentUser user;

  public ConsentArtifactSchemaConsent() {
  }

  public ConsentArtifactSchemaConsent consentId(UUID consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * A unique consent id in UUID format.
   * @return consentId
   */
  @javax.annotation.Nonnull
  public UUID getConsentId() {
    return consentId;
  }

  public void setConsentId(UUID consentId) {
    this.consentId = consentId;
  }


  public ConsentArtifactSchemaConsent data(ConsentArtifactSchemaConsentData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentData getData() {
    return data;
  }

  public void setData(ConsentArtifactSchemaConsentData data) {
    this.data = data;
  }


  public ConsentArtifactSchemaConsent dataConsumer(ConsentArtifactSchemaConsentData dataConsumer) {
    this.dataConsumer = dataConsumer;
    return this;
  }

  /**
   * Get dataConsumer
   * @return dataConsumer
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentData getDataConsumer() {
    return dataConsumer;
  }

  public void setDataConsumer(ConsentArtifactSchemaConsentData dataConsumer) {
    this.dataConsumer = dataConsumer;
  }


  public ConsentArtifactSchemaConsent dataProvider(ConsentArtifactSchemaConsentData dataProvider) {
    this.dataProvider = dataProvider;
    return this;
  }

  /**
   * Get dataProvider
   * @return dataProvider
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentData getDataProvider() {
    return dataProvider;
  }

  public void setDataProvider(ConsentArtifactSchemaConsentData dataProvider) {
    this.dataProvider = dataProvider;
  }


  public ConsentArtifactSchemaConsent permission(ConsentArtifactSchemaConsentPermission permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentPermission getPermission() {
    return permission;
  }

  public void setPermission(ConsentArtifactSchemaConsentPermission permission) {
    this.permission = permission;
  }


  public ConsentArtifactSchemaConsent purpose(ConsentArtifactSchemaConsentPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentPurpose getPurpose() {
    return purpose;
  }

  public void setPurpose(ConsentArtifactSchemaConsentPurpose purpose) {
    this.purpose = purpose;
  }


  public ConsentArtifactSchemaConsent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ
   * @return timestamp
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ConsentArtifactSchemaConsent user(ConsentArtifactSchemaConsentUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull
  public ConsentArtifactSchemaConsentUser getUser() {
    return user;
  }

  public void setUser(ConsentArtifactSchemaConsentUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentArtifactSchemaConsent consentArtifactSchemaConsent = (ConsentArtifactSchemaConsent) o;
    return Objects.equals(this.consentId, consentArtifactSchemaConsent.consentId) &&
        Objects.equals(this.data, consentArtifactSchemaConsent.data) &&
        Objects.equals(this.dataConsumer, consentArtifactSchemaConsent.dataConsumer) &&
        Objects.equals(this.dataProvider, consentArtifactSchemaConsent.dataProvider) &&
        Objects.equals(this.permission, consentArtifactSchemaConsent.permission) &&
        Objects.equals(this.purpose, consentArtifactSchemaConsent.purpose) &&
        Objects.equals(this.timestamp, consentArtifactSchemaConsent.timestamp) &&
        Objects.equals(this.user, consentArtifactSchemaConsent.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, data, dataConsumer, dataProvider, permission, purpose, timestamp, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentArtifactSchemaConsent {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataConsumer: ").append(toIndentedString(dataConsumer)).append("\n");
    sb.append("    dataProvider: ").append(toIndentedString(dataProvider)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("consentId");
    openapiFields.add("data");
    openapiFields.add("dataConsumer");
    openapiFields.add("dataProvider");
    openapiFields.add("permission");
    openapiFields.add("purpose");
    openapiFields.add("timestamp");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consentId");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("dataConsumer");
    openapiRequiredFields.add("dataProvider");
    openapiRequiredFields.add("permission");
    openapiRequiredFields.add("purpose");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("user");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentArtifactSchemaConsent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentArtifactSchemaConsent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentArtifactSchemaConsent is not found in the empty JSON string", ConsentArtifactSchemaConsent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentArtifactSchemaConsent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentArtifactSchemaConsent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentArtifactSchemaConsent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("consentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consentId").toString()));
      }
      // validate the required field `data`
      ConsentArtifactSchemaConsentData.validateJsonElement(jsonObj.get("data"));
      // validate the required field `dataConsumer`
      ConsentArtifactSchemaConsentData.validateJsonElement(jsonObj.get("dataConsumer"));
      // validate the required field `dataProvider`
      ConsentArtifactSchemaConsentData.validateJsonElement(jsonObj.get("dataProvider"));
      // validate the required field `permission`
      ConsentArtifactSchemaConsentPermission.validateJsonElement(jsonObj.get("permission"));
      // validate the required field `purpose`
      ConsentArtifactSchemaConsentPurpose.validateJsonElement(jsonObj.get("purpose"));
      // validate the required field `user`
      ConsentArtifactSchemaConsentUser.validateJsonElement(jsonObj.get("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentArtifactSchemaConsent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentArtifactSchemaConsent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentArtifactSchemaConsent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentArtifactSchemaConsent.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentArtifactSchemaConsent>() {
           @Override
           public void write(JsonWriter out, ConsentArtifactSchemaConsent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentArtifactSchemaConsent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentArtifactSchemaConsent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentArtifactSchemaConsent
   * @throws IOException if the JSON string is invalid with respect to ConsentArtifactSchemaConsent
   */
  public static ConsentArtifactSchemaConsent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentArtifactSchemaConsent.class);
  }

  /**
   * Convert an instance of ConsentArtifactSchemaConsent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

