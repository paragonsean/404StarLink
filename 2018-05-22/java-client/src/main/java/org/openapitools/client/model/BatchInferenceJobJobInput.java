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
import org.openapitools.client.model.BatchInferenceJobInputS3DataSource;

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
 * BatchInferenceJobJobInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchInferenceJobJobInput {
  public static final String SERIALIZED_NAME_S3_DATA_SOURCE = "s3DataSource";
  @SerializedName(SERIALIZED_NAME_S3_DATA_SOURCE)
  private BatchInferenceJobInputS3DataSource s3DataSource;

  public BatchInferenceJobJobInput() {
  }

  public BatchInferenceJobJobInput s3DataSource(BatchInferenceJobInputS3DataSource s3DataSource) {
    this.s3DataSource = s3DataSource;
    return this;
  }

  /**
   * Get s3DataSource
   * @return s3DataSource
   */
  @javax.annotation.Nonnull
  public BatchInferenceJobInputS3DataSource getS3DataSource() {
    return s3DataSource;
  }

  public void setS3DataSource(BatchInferenceJobInputS3DataSource s3DataSource) {
    this.s3DataSource = s3DataSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchInferenceJobJobInput batchInferenceJobJobInput = (BatchInferenceJobJobInput) o;
    return Objects.equals(this.s3DataSource, batchInferenceJobJobInput.s3DataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3DataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchInferenceJobJobInput {\n");
    sb.append("    s3DataSource: ").append(toIndentedString(s3DataSource)).append("\n");
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
    openapiFields.add("s3DataSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("s3DataSource");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchInferenceJobJobInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchInferenceJobJobInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchInferenceJobJobInput is not found in the empty JSON string", BatchInferenceJobJobInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchInferenceJobJobInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchInferenceJobJobInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchInferenceJobJobInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `s3DataSource`
      BatchInferenceJobInputS3DataSource.validateJsonElement(jsonObj.get("s3DataSource"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchInferenceJobJobInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchInferenceJobJobInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchInferenceJobJobInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchInferenceJobJobInput.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchInferenceJobJobInput>() {
           @Override
           public void write(JsonWriter out, BatchInferenceJobJobInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchInferenceJobJobInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchInferenceJobJobInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchInferenceJobJobInput
   * @throws IOException if the JSON string is invalid with respect to BatchInferenceJobJobInput
   */
  public static BatchInferenceJobJobInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchInferenceJobJobInput.class);
  }

  /**
   * Convert an instance of BatchInferenceJobJobInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

