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
import java.util.Arrays;
import org.openapitools.client.model.S3ObjectEncryptionType;

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
 * The encryption settings that are used by a journal export job to write data in an Amazon Simple Storage Service (Amazon S3) bucket.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:20.150579-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class S3EncryptionConfiguration {
  public static final String SERIALIZED_NAME_OBJECT_ENCRYPTION_TYPE = "ObjectEncryptionType";
  @SerializedName(SERIALIZED_NAME_OBJECT_ENCRYPTION_TYPE)
  private S3ObjectEncryptionType objectEncryptionType;

  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "KmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public S3EncryptionConfiguration() {
  }

  public S3EncryptionConfiguration objectEncryptionType(S3ObjectEncryptionType objectEncryptionType) {
    this.objectEncryptionType = objectEncryptionType;
    return this;
  }

  /**
   * Get objectEncryptionType
   * @return objectEncryptionType
   */
  @javax.annotation.Nonnull
  public S3ObjectEncryptionType getObjectEncryptionType() {
    return objectEncryptionType;
  }

  public void setObjectEncryptionType(S3ObjectEncryptionType objectEncryptionType) {
    this.objectEncryptionType = objectEncryptionType;
  }


  public S3EncryptionConfiguration kmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
    return this;
  }

  /**
   * Get kmsKeyArn
   * @return kmsKeyArn
   */
  @javax.annotation.Nullable
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }

  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3EncryptionConfiguration s3EncryptionConfiguration = (S3EncryptionConfiguration) o;
    return Objects.equals(this.objectEncryptionType, s3EncryptionConfiguration.objectEncryptionType) &&
        Objects.equals(this.kmsKeyArn, s3EncryptionConfiguration.kmsKeyArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectEncryptionType, kmsKeyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3EncryptionConfiguration {\n");
    sb.append("    objectEncryptionType: ").append(toIndentedString(objectEncryptionType)).append("\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
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
    openapiFields.add("ObjectEncryptionType");
    openapiFields.add("KmsKeyArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ObjectEncryptionType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to S3EncryptionConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!S3EncryptionConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in S3EncryptionConfiguration is not found in the empty JSON string", S3EncryptionConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!S3EncryptionConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `S3EncryptionConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : S3EncryptionConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ObjectEncryptionType`
      S3ObjectEncryptionType.validateJsonElement(jsonObj.get("ObjectEncryptionType"));
      // validate the optional field `KmsKeyArn`
      if (jsonObj.get("KmsKeyArn") != null && !jsonObj.get("KmsKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!S3EncryptionConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'S3EncryptionConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<S3EncryptionConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(S3EncryptionConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<S3EncryptionConfiguration>() {
           @Override
           public void write(JsonWriter out, S3EncryptionConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public S3EncryptionConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of S3EncryptionConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of S3EncryptionConfiguration
   * @throws IOException if the JSON string is invalid with respect to S3EncryptionConfiguration
   */
  public static S3EncryptionConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, S3EncryptionConfiguration.class);
  }

  /**
   * Convert an instance of S3EncryptionConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

