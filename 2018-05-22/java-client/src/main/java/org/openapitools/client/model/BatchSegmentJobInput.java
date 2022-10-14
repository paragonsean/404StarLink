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
import org.openapitools.client.model.S3DataConfig;

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
 * The input configuration of a batch segment job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class BatchSegmentJobInput {
  public static final String SERIALIZED_NAME_S3_DATA_SOURCE = "s3DataSource";
  @SerializedName(SERIALIZED_NAME_S3_DATA_SOURCE)
  private S3DataConfig s3DataSource;

  public BatchSegmentJobInput() {
  }

  public BatchSegmentJobInput s3DataSource(S3DataConfig s3DataSource) {
    this.s3DataSource = s3DataSource;
    return this;
  }

  /**
   * Get s3DataSource
   * @return s3DataSource
   */
  @javax.annotation.Nonnull
  public S3DataConfig getS3DataSource() {
    return s3DataSource;
  }

  public void setS3DataSource(S3DataConfig s3DataSource) {
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
    BatchSegmentJobInput batchSegmentJobInput = (BatchSegmentJobInput) o;
    return Objects.equals(this.s3DataSource, batchSegmentJobInput.s3DataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3DataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchSegmentJobInput {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to BatchSegmentJobInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchSegmentJobInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchSegmentJobInput is not found in the empty JSON string", BatchSegmentJobInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchSegmentJobInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchSegmentJobInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchSegmentJobInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `s3DataSource`
      S3DataConfig.validateJsonElement(jsonObj.get("s3DataSource"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchSegmentJobInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchSegmentJobInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchSegmentJobInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchSegmentJobInput.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchSegmentJobInput>() {
           @Override
           public void write(JsonWriter out, BatchSegmentJobInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchSegmentJobInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchSegmentJobInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchSegmentJobInput
   * @throws IOException if the JSON string is invalid with respect to BatchSegmentJobInput
   */
  public static BatchSegmentJobInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchSegmentJobInput.class);
  }

  /**
   * Convert an instance of BatchSegmentJobInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

