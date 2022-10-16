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
import org.openapitools.client.model.DescribeDatasetExportJobResponseDatasetExportJob;

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
 * DescribeDatasetExportJobResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeDatasetExportJobResponse {
  public static final String SERIALIZED_NAME_DATASET_EXPORT_JOB = "datasetExportJob";
  @SerializedName(SERIALIZED_NAME_DATASET_EXPORT_JOB)
  private DescribeDatasetExportJobResponseDatasetExportJob datasetExportJob;

  public DescribeDatasetExportJobResponse() {
  }

  public DescribeDatasetExportJobResponse datasetExportJob(DescribeDatasetExportJobResponseDatasetExportJob datasetExportJob) {
    this.datasetExportJob = datasetExportJob;
    return this;
  }

  /**
   * Get datasetExportJob
   * @return datasetExportJob
   */
  @javax.annotation.Nullable
  public DescribeDatasetExportJobResponseDatasetExportJob getDatasetExportJob() {
    return datasetExportJob;
  }

  public void setDatasetExportJob(DescribeDatasetExportJobResponseDatasetExportJob datasetExportJob) {
    this.datasetExportJob = datasetExportJob;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDatasetExportJobResponse describeDatasetExportJobResponse = (DescribeDatasetExportJobResponse) o;
    return Objects.equals(this.datasetExportJob, describeDatasetExportJobResponse.datasetExportJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetExportJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDatasetExportJobResponse {\n");
    sb.append("    datasetExportJob: ").append(toIndentedString(datasetExportJob)).append("\n");
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
    openapiFields.add("datasetExportJob");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeDatasetExportJobResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeDatasetExportJobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeDatasetExportJobResponse is not found in the empty JSON string", DescribeDatasetExportJobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeDatasetExportJobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeDatasetExportJobResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `datasetExportJob`
      if (jsonObj.get("datasetExportJob") != null && !jsonObj.get("datasetExportJob").isJsonNull()) {
        DescribeDatasetExportJobResponseDatasetExportJob.validateJsonElement(jsonObj.get("datasetExportJob"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeDatasetExportJobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeDatasetExportJobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeDatasetExportJobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeDatasetExportJobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeDatasetExportJobResponse>() {
           @Override
           public void write(JsonWriter out, DescribeDatasetExportJobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeDatasetExportJobResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeDatasetExportJobResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeDatasetExportJobResponse
   * @throws IOException if the JSON string is invalid with respect to DescribeDatasetExportJobResponse
   */
  public static DescribeDatasetExportJobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeDatasetExportJobResponse.class);
  }

  /**
   * Convert an instance of DescribeDatasetExportJobResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

