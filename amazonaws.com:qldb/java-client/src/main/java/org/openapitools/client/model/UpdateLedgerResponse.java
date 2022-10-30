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
 * UpdateLedgerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:17.054022-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateLedgerResponse {
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

  public static final String SERIALIZED_NAME_DELETION_PROTECTION = "DeletionProtection";
  @SerializedName(SERIALIZED_NAME_DELETION_PROTECTION)
  private Boolean deletionProtection;

  public static final String SERIALIZED_NAME_ENCRYPTION_DESCRIPTION = "EncryptionDescription";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_DESCRIPTION)
  private DescribeLedgerResponseEncryptionDescription encryptionDescription;

  public UpdateLedgerResponse() {
  }

  public UpdateLedgerResponse name(String name) {
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


  public UpdateLedgerResponse arn(String arn) {
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


  public UpdateLedgerResponse state(LedgerState state) {
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


  public UpdateLedgerResponse creationDateTime(OffsetDateTime creationDateTime) {
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


  public UpdateLedgerResponse deletionProtection(Boolean deletionProtection) {
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


  public UpdateLedgerResponse encryptionDescription(DescribeLedgerResponseEncryptionDescription encryptionDescription) {
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
    UpdateLedgerResponse updateLedgerResponse = (UpdateLedgerResponse) o;
    return Objects.equals(this.name, updateLedgerResponse.name) &&
        Objects.equals(this.arn, updateLedgerResponse.arn) &&
        Objects.equals(this.state, updateLedgerResponse.state) &&
        Objects.equals(this.creationDateTime, updateLedgerResponse.creationDateTime) &&
        Objects.equals(this.deletionProtection, updateLedgerResponse.deletionProtection) &&
        Objects.equals(this.encryptionDescription, updateLedgerResponse.encryptionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arn, state, creationDateTime, deletionProtection, encryptionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLedgerResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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
    openapiFields.add("DeletionProtection");
    openapiFields.add("EncryptionDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLedgerResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLedgerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLedgerResponse is not found in the empty JSON string", UpdateLedgerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLedgerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLedgerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!UpdateLedgerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLedgerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLedgerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLedgerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLedgerResponse>() {
           @Override
           public void write(JsonWriter out, UpdateLedgerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLedgerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateLedgerResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLedgerResponse
   * @throws IOException if the JSON string is invalid with respect to UpdateLedgerResponse
   */
  public static UpdateLedgerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLedgerResponse.class);
  }

  /**
   * Convert an instance of UpdateLedgerResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

