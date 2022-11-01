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
import org.openapitools.client.model.ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration;

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
 * The Amazon Simple Storage Service (Amazon S3) bucket location in which a journal export job writes the journal contents.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:23.217080-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class S3ExportConfiguration {
  public static final String SERIALIZED_NAME_BUCKET = "Bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_PREFIX = "Prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_ENCRYPTION_CONFIGURATION = "EncryptionConfiguration";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_CONFIGURATION)
  private ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration encryptionConfiguration;

  public S3ExportConfiguration() {
  }

  public S3ExportConfiguration bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Get bucket
   * @return bucket
   */
  @javax.annotation.Nonnull
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public S3ExportConfiguration prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  @javax.annotation.Nonnull
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public S3ExportConfiguration encryptionConfiguration(ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
    return this;
  }

  /**
   * Get encryptionConfiguration
   * @return encryptionConfiguration
   */
  @javax.annotation.Nonnull
  public ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration getEncryptionConfiguration() {
    return encryptionConfiguration;
  }

  public void setEncryptionConfiguration(ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration encryptionConfiguration) {
    this.encryptionConfiguration = encryptionConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3ExportConfiguration s3ExportConfiguration = (S3ExportConfiguration) o;
    return Objects.equals(this.bucket, s3ExportConfiguration.bucket) &&
        Objects.equals(this.prefix, s3ExportConfiguration.prefix) &&
        Objects.equals(this.encryptionConfiguration, s3ExportConfiguration.encryptionConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, prefix, encryptionConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3ExportConfiguration {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    encryptionConfiguration: ").append(toIndentedString(encryptionConfiguration)).append("\n");
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
    openapiFields.add("Bucket");
    openapiFields.add("Prefix");
    openapiFields.add("EncryptionConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Bucket");
    openapiRequiredFields.add("Prefix");
    openapiRequiredFields.add("EncryptionConfiguration");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to S3ExportConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!S3ExportConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in S3ExportConfiguration is not found in the empty JSON string", S3ExportConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!S3ExportConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `S3ExportConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : S3ExportConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Bucket`
      String.validateJsonElement(jsonObj.get("Bucket"));
      // validate the required field `Prefix`
      String.validateJsonElement(jsonObj.get("Prefix"));
      // validate the required field `EncryptionConfiguration`
      ExportJournalToS3RequestS3ExportConfigurationEncryptionConfiguration.validateJsonElement(jsonObj.get("EncryptionConfiguration"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!S3ExportConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'S3ExportConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<S3ExportConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(S3ExportConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<S3ExportConfiguration>() {
           @Override
           public void write(JsonWriter out, S3ExportConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public S3ExportConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of S3ExportConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of S3ExportConfiguration
   * @throws IOException if the JSON string is invalid with respect to S3ExportConfiguration
   */
  public static S3ExportConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, S3ExportConfiguration.class);
  }

  /**
   * Convert an instance of S3ExportConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

