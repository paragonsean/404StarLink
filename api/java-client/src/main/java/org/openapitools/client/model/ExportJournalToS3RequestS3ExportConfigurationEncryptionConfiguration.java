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
 * ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:23.217080-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration {
  public static final String SERIALIZED_NAME_OBJECT_ENCRYPTION_TYPE = "ObjectEncryptionType";
  @SerializedName(SERIALIZED_NAME_OBJECT_ENCRYPTION_TYPE)
  private S3ObjectEncryptionType objectEncryptionType;

  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "KmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration() {
  }

  public ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration objectEncryptionType(S3ObjectEncryptionType objectEncryptionType) {
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


  public ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration kmsKeyArn(String kmsKeyArn) {
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
    ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration exportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration = (ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration) o;
    return Objects.equals(this.objectEncryptionType, exportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.objectEncryptionType) &&
        Objects.equals(this.kmsKeyArn, exportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.kmsKeyArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectEncryptionType, kmsKeyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration is not found in the empty JSON string", ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.openapiRequiredFields) {
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
       if (!ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration>() {
           @Override
           public void write(JsonWriter out, ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration
   * @throws IOException if the JSON string is invalid with respect to ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration
   */
  public static ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.class);
  }

  /**
   * Convert an instance of ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

