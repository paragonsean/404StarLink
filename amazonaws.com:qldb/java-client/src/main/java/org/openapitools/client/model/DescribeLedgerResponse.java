/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.DescribeLedgerResponseEncryptionDescription;
import org.openapitools.client.model.LedgerState;
import org.openapitools.client.model.PermissionsMode;

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
 * DescribeLedgerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:55:42.369552-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeLedgerResponse {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private LedgerState state;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "CreationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_PERMISSIONS_MODE = "PermissionsMode";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_MODE)
  private PermissionsMode permissionsMode;

  public static final String SERIALIZED_NAME_DELETION_PROTECTION = "DeletionProtection";
  @SerializedName(SERIALIZED_NAME_DELETION_PROTECTION)
  private Boolean deletionProtection;

  public static final String SERIALIZED_NAME_ENCRYPTION_DESCRIPTION = "EncryptionDescription";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_DESCRIPTION)
  private DescribeLedgerResponseEncryptionDescription encryptionDescription;

  public DescribeLedgerResponse() {
  }

  public DescribeLedgerResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DescribeLedgerResponse arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public DescribeLedgerResponse state(LedgerState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public LedgerState getState() {
    return state;
  }

  public void setState(LedgerState state) {
    this.state = state;
  }


  public DescribeLedgerResponse creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public DescribeLedgerResponse permissionsMode(PermissionsMode permissionsMode) {
    this.permissionsMode = permissionsMode;
    return this;
  }

  /**
   * Get permissionsMode
   * @return permissionsMode
   */
  @javax.annotation.Nullable
  public PermissionsMode getPermissionsMode() {
    return permissionsMode;
  }

  public void setPermissionsMode(PermissionsMode permissionsMode) {
    this.permissionsMode = permissionsMode;
  }


  public DescribeLedgerResponse deletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

  /**
   * Get deletionProtection
   * @return deletionProtection
   */
  @javax.annotation.Nullable
  public Boolean getDeletionProtection() {
    return deletionProtection;
  }

  public void setDeletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
  }


  public DescribeLedgerResponse encryptionDescription(DescribeLedgerResponseEncryptionDescription encryptionDescription) {
    this.encryptionDescription = encryptionDescription;
    return this;
  }

  /**
   * Get encryptionDescription
   * @return encryptionDescription
   */
  @javax.annotation.Nullable
  public DescribeLedgerResponseEncryptionDescription getEncryptionDescription() {
    return encryptionDescription;
  }

  public void setEncryptionDescription(DescribeLedgerResponseEncryptionDescription encryptionDescription) {
    this.encryptionDescription = encryptionDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLedgerResponse describeLedgerResponse = (DescribeLedgerResponse) o;
    return Objects.equals(this.name, describeLedgerResponse.name) &&
        Objects.equals(this.arn, describeLedgerResponse.arn) &&
        Objects.equals(this.state, describeLedgerResponse.state) &&
        Objects.equals(this.creationDateTime, describeLedgerResponse.creationDateTime) &&
        Objects.equals(this.permissionsMode, describeLedgerResponse.permissionsMode) &&
        Objects.equals(this.deletionProtection, describeLedgerResponse.deletionProtection) &&
        Objects.equals(this.encryptionDescription, describeLedgerResponse.encryptionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, state, creationDateTime, permissionsMode, deletionProtection, encryptionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLedgerResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    permissionsMode: ").append(toIndentedString(permissionsMode)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    encryptionDescription: ").append(toIndentedString(encryptionDescription)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Arn");
    openapiFields.add("State");
    openapiFields.add("CreationDateTime");
    openapiFields.add("PermissionsMode");
    openapiFields.add("DeletionProtection");
    openapiFields.add("EncryptionDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeLedgerResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeLedgerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeLedgerResponse is not found in the empty JSON string", DescribeLedgerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeLedgerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeLedgerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Name`
      if (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Name"));
      }
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the optional field `State`
      if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
        LedgerState.validateJsonElement(jsonObj.get("State"));
      }
      // validate the optional field `CreationDateTime`
      if (jsonObj.get("CreationDateTime") != null && !jsonObj.get("CreationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreationDateTime"));
      }
      // validate the optional field `PermissionsMode`
      if (jsonObj.get("PermissionsMode") != null && !jsonObj.get("PermissionsMode").isJsonNull()) {
        PermissionsMode.validateJsonElement(jsonObj.get("PermissionsMode"));
      }
      // validate the optional field `DeletionProtection`
      if (jsonObj.get("DeletionProtection") != null && !jsonObj.get("DeletionProtection").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("DeletionProtection"));
      }
      // validate the optional field `EncryptionDescription`
      if (jsonObj.get("EncryptionDescription") != null && !jsonObj.get("EncryptionDescription").isJsonNull()) {
        DescribeLedgerResponseEncryptionDescription.validateJsonElement(jsonObj.get("EncryptionDescription"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeLedgerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeLedgerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeLedgerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeLedgerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeLedgerResponse>() {
           @Override
           public void write(JsonWriter out, DescribeLedgerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeLedgerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeLedgerResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeLedgerResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeLedgerResponse
   */
  public static DescribeLedgerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeLedgerResponse.class);
  }

  /**
   * Convert an instance of DescribeLedgerResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

