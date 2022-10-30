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
import org.openapitools.client.model.EncryptionStatus;

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
 * DescribeLedgerResponseEncryptionDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:17.054022-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeLedgerResponseEncryptionDescription {
  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "KmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public static final String SERIALIZED_NAME_ENCRYPTION_STATUS = "EncryptionStatus";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_STATUS)
  private EncryptionStatus encryptionStatus;

  public static final String SERIALIZED_NAME_INACCESSIBLE_KMS_KEY_DATE_TIME = "InaccessibleKmsKeyDateTime";
  @SerializedName(SERIALIZED_NAME_INACCESSIBLE_KMS_KEY_DATE_TIME)
  private OffsetDateTime inaccessibleKmsKeyDateTime;

  public DescribeLedgerResponseEncryptionDescription() {
  }

  public DescribeLedgerResponseEncryptionDescription kmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
    return this;
  }

  /**
   * Get kmsKeyArn
   * @return kmsKeyArn
   */
  @javax.annotation.Nonnull
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }

  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
  }


  public DescribeLedgerResponseEncryptionDescription encryptionStatus(EncryptionStatus encryptionStatus) {
    this.encryptionStatus = encryptionStatus;
    return this;
  }

  /**
   * Get encryptionStatus
   * @return encryptionStatus
   */
  @javax.annotation.Nonnull
  public EncryptionStatus getEncryptionStatus() {
    return encryptionStatus;
  }

  public void setEncryptionStatus(EncryptionStatus encryptionStatus) {
    this.encryptionStatus = encryptionStatus;
  }


  public DescribeLedgerResponseEncryptionDescription inaccessibleKmsKeyDateTime(OffsetDateTime inaccessibleKmsKeyDateTime) {
    this.inaccessibleKmsKeyDateTime = inaccessibleKmsKeyDateTime;
    return this;
  }

  /**
   * Get inaccessibleKmsKeyDateTime
   * @return inaccessibleKmsKeyDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getInaccessibleKmsKeyDateTime() {
    return inaccessibleKmsKeyDateTime;
  }

  public void setInaccessibleKmsKeyDateTime(OffsetDateTime inaccessibleKmsKeyDateTime) {
    this.inaccessibleKmsKeyDateTime = inaccessibleKmsKeyDateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLedgerResponseEncryptionDescription describeLedgerResponseEncryptionDescription = (DescribeLedgerResponseEncryptionDescription) o;
    return Objects.equals(this.kmsKeyArn, describeLedgerResponseEncryptionDescription.kmsKeyArn) &&
        Objects.equals(this.encryptionStatus, describeLedgerResponseEncryptionDescription.encryptionStatus) &&
        Objects.equals(this.inaccessibleKmsKeyDateTime, describeLedgerResponseEncryptionDescription.inaccessibleKmsKeyDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kmsKeyArn, encryptionStatus, inaccessibleKmsKeyDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLedgerResponseEncryptionDescription {\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
    sb.append("    encryptionStatus: ").append(toIndentedString(encryptionStatus)).append("\n");
    sb.append("    inaccessibleKmsKeyDateTime: ").append(toIndentedString(inaccessibleKmsKeyDateTime)).append("\n");
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
    openapiFields.add("KmsKeyArn");
    openapiFields.add("EncryptionStatus");
    openapiFields.add("InaccessibleKmsKeyDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("KmsKeyArn");
    openapiRequiredFields.add("EncryptionStatus");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeLedgerResponseEncryptionDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeLedgerResponseEncryptionDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeLedgerResponseEncryptionDescription is not found in the empty JSON string", DescribeLedgerResponseEncryptionDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeLedgerResponseEncryptionDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeLedgerResponseEncryptionDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DescribeLedgerResponseEncryptionDescription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `KmsKeyArn`
      String.validateJsonElement(jsonObj.get("KmsKeyArn"));
      // validate the required field `EncryptionStatus`
      EncryptionStatus.validateJsonElement(jsonObj.get("EncryptionStatus"));
      // validate the optional field `InaccessibleKmsKeyDateTime`
      if (jsonObj.get("InaccessibleKmsKeyDateTime") != null && !jsonObj.get("InaccessibleKmsKeyDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("InaccessibleKmsKeyDateTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeLedgerResponseEncryptionDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeLedgerResponseEncryptionDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeLedgerResponseEncryptionDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeLedgerResponseEncryptionDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeLedgerResponseEncryptionDescription>() {
           @Override
           public void write(JsonWriter out, DescribeLedgerResponseEncryptionDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeLedgerResponseEncryptionDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeLedgerResponseEncryptionDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeLedgerResponseEncryptionDescription
   * @throws IOException if the JSON string is invalid with respect to DescribeLedgerResponseEncryptionDescription
   */
  public static DescribeLedgerResponseEncryptionDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeLedgerResponseEncryptionDescription.class);
  }

  /**
   * Convert an instance of DescribeLedgerResponseEncryptionDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

