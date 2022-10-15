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
 * DescribeBatchSegmentJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeBatchSegmentJobRequest {
  public static final String SERIALIZED_NAME_BATCH_SEGMENT_JOB_ARN = "batchSegmentJobArn";
  @SerializedName(SERIALIZED_NAME_BATCH_SEGMENT_JOB_ARN)
  private String batchSegmentJobArn;

  public DescribeBatchSegmentJobRequest() {
  }

  public DescribeBatchSegmentJobRequest batchSegmentJobArn(String batchSegmentJobArn) {
    this.batchSegmentJobArn = batchSegmentJobArn;
    return this;
  }

  /**
   * Get batchSegmentJobArn
   * @return batchSegmentJobArn
   */
  @javax.annotation.Nonnull
  public String getBatchSegmentJobArn() {
    return batchSegmentJobArn;
  }

  public void setBatchSegmentJobArn(String batchSegmentJobArn) {
    this.batchSegmentJobArn = batchSegmentJobArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBatchSegmentJobRequest describeBatchSegmentJobRequest = (DescribeBatchSegmentJobRequest) o;
    return Objects.equals(this.batchSegmentJobArn, describeBatchSegmentJobRequest.batchSegmentJobArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSegmentJobArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBatchSegmentJobRequest {\n");
    sb.append("    batchSegmentJobArn: ").append(toIndentedString(batchSegmentJobArn)).append("\n");
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
    openapiFields.add("batchSegmentJobArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batchSegmentJobArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeBatchSegmentJobRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeBatchSegmentJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeBatchSegmentJobRequest is not found in the empty JSON string", DescribeBatchSegmentJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeBatchSegmentJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeBatchSegmentJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DescribeBatchSegmentJobRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `batchSegmentJobArn`
      String.validateJsonElement(jsonObj.get("batchSegmentJobArn"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeBatchSegmentJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeBatchSegmentJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeBatchSegmentJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeBatchSegmentJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeBatchSegmentJobRequest>() {
           @Override
           public void write(JsonWriter out, DescribeBatchSegmentJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeBatchSegmentJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeBatchSegmentJobRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeBatchSegmentJobRequest
   * @throws IOException if the JSON string is invalid with respect to DescribeBatchSegmentJobRequest
   */
  public static DescribeBatchSegmentJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeBatchSegmentJobRequest.class);
  }

  /**
   * Convert an instance of DescribeBatchSegmentJobRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

