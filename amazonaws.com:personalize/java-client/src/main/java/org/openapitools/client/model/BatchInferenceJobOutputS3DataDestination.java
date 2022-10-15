/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
 * BatchInferenceJobOutputS3DataDestination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchInferenceJobOutputS3DataDestination {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_KMS_KEY_ARN = "kmsKeyArn";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ARN)
  private String kmsKeyArn;

  public BatchInferenceJobOutputS3DataDestination() {
  }

  public BatchInferenceJobOutputS3DataDestination path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public BatchInferenceJobOutputS3DataDestination kmsKeyArn(String kmsKeyArn) {
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
    BatchInferenceJobOutputS3DataDestination batchInferenceJobOutputS3DataDestination = (BatchInferenceJobOutputS3DataDestination) o;
    return Objects.equals(this.path, batchInferenceJobOutputS3DataDestination.path) &&
        Objects.equals(this.kmsKeyArn, batchInferenceJobOutputS3DataDestination.kmsKeyArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, kmsKeyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchInferenceJobOutputS3DataDestination {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("path");
    openapiFields.add("kmsKeyArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchInferenceJobOutputS3DataDestination
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchInferenceJobOutputS3DataDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchInferenceJobOutputS3DataDestination is not found in the empty JSON string", BatchInferenceJobOutputS3DataDestination.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchInferenceJobOutputS3DataDestination.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchInferenceJobOutputS3DataDestination` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchInferenceJobOutputS3DataDestination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `path`
      String.validateJsonElement(jsonObj.get("path"));
      // validate the optional field `kmsKeyArn`
      if (jsonObj.get("kmsKeyArn") != null && !jsonObj.get("kmsKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("kmsKeyArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchInferenceJobOutputS3DataDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchInferenceJobOutputS3DataDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchInferenceJobOutputS3DataDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchInferenceJobOutputS3DataDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchInferenceJobOutputS3DataDestination>() {
           @Override
           public void write(JsonWriter out, BatchInferenceJobOutputS3DataDestination value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchInferenceJobOutputS3DataDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchInferenceJobOutputS3DataDestination given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchInferenceJobOutputS3DataDestination
   * @throws IOException if the JSON string is invalid with respect to BatchInferenceJobOutputS3DataDestination
   */
  public static BatchInferenceJobOutputS3DataDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchInferenceJobOutputS3DataDestination.class);
  }

  /**
   * Convert an instance of BatchInferenceJobOutputS3DataDestination to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

