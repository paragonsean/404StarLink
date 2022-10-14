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
import java.util.List;
import org.openapitools.client.model.CreateDatasetExportJobRequestJobOutput;
import org.openapitools.client.model.IngestionMode;

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
 * CreateDatasetExportJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateDatasetExportJobRequest {
  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_DATASET_ARN = "datasetArn";
  @SerializedName(SERIALIZED_NAME_DATASET_ARN)
  private String datasetArn;

  public static final String SERIALIZED_NAME_INGESTION_MODE = "ingestionMode";
  @SerializedName(SERIALIZED_NAME_INGESTION_MODE)
  private IngestionMode ingestionMode;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_JOB_OUTPUT = "jobOutput";
  @SerializedName(SERIALIZED_NAME_JOB_OUTPUT)
  private CreateDatasetExportJobRequestJobOutput jobOutput;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateDatasetExportJobRequest() {
  }

  public CreateDatasetExportJobRequest jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Get jobName
   * @return jobName
   */
  @javax.annotation.Nonnull
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public CreateDatasetExportJobRequest datasetArn(String datasetArn) {
    this.datasetArn = datasetArn;
    return this;
  }

  /**
   * Get datasetArn
   * @return datasetArn
   */
  @javax.annotation.Nonnull
  public String getDatasetArn() {
    return datasetArn;
  }

  public void setDatasetArn(String datasetArn) {
    this.datasetArn = datasetArn;
  }


  public CreateDatasetExportJobRequest ingestionMode(IngestionMode ingestionMode) {
    this.ingestionMode = ingestionMode;
    return this;
  }

  /**
   * Get ingestionMode
   * @return ingestionMode
   */
  @javax.annotation.Nullable
  public IngestionMode getIngestionMode() {
    return ingestionMode;
  }

  public void setIngestionMode(IngestionMode ingestionMode) {
    this.ingestionMode = ingestionMode;
  }


  public CreateDatasetExportJobRequest roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public CreateDatasetExportJobRequest jobOutput(CreateDatasetExportJobRequestJobOutput jobOutput) {
    this.jobOutput = jobOutput;
    return this;
  }

  /**
   * Get jobOutput
   * @return jobOutput
   */
  @javax.annotation.Nonnull
  public CreateDatasetExportJobRequestJobOutput getJobOutput() {
    return jobOutput;
  }

  public void setJobOutput(CreateDatasetExportJobRequestJobOutput jobOutput) {
    this.jobOutput = jobOutput;
  }


  public CreateDatasetExportJobRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatasetExportJobRequest createDatasetExportJobRequest = (CreateDatasetExportJobRequest) o;
    return Objects.equals(this.jobName, createDatasetExportJobRequest.jobName) &&
        Objects.equals(this.datasetArn, createDatasetExportJobRequest.datasetArn) &&
        Objects.equals(this.ingestionMode, createDatasetExportJobRequest.ingestionMode) &&
        Objects.equals(this.roleArn, createDatasetExportJobRequest.roleArn) &&
        Objects.equals(this.jobOutput, createDatasetExportJobRequest.jobOutput) &&
        Objects.equals(this.tags, createDatasetExportJobRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, datasetArn, ingestionMode, roleArn, jobOutput, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatasetExportJobRequest {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    datasetArn: ").append(toIndentedString(datasetArn)).append("\n");
    sb.append("    ingestionMode: ").append(toIndentedString(ingestionMode)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    jobOutput: ").append(toIndentedString(jobOutput)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("jobName");
    openapiFields.add("datasetArn");
    openapiFields.add("ingestionMode");
    openapiFields.add("roleArn");
    openapiFields.add("jobOutput");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobName");
    openapiRequiredFields.add("datasetArn");
    openapiRequiredFields.add("roleArn");
    openapiRequiredFields.add("jobOutput");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDatasetExportJobRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDatasetExportJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDatasetExportJobRequest is not found in the empty JSON string", CreateDatasetExportJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDatasetExportJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDatasetExportJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDatasetExportJobRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `jobName`
      String.validateJsonElement(jsonObj.get("jobName"));
      // validate the required field `datasetArn`
      String.validateJsonElement(jsonObj.get("datasetArn"));
      // validate the optional field `ingestionMode`
      if (jsonObj.get("ingestionMode") != null && !jsonObj.get("ingestionMode").isJsonNull()) {
        IngestionMode.validateJsonElement(jsonObj.get("ingestionMode"));
      }
      // validate the required field `roleArn`
      String.validateJsonElement(jsonObj.get("roleArn"));
      // validate the required field `jobOutput`
      CreateDatasetExportJobRequestJobOutput.validateJsonElement(jsonObj.get("jobOutput"));
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDatasetExportJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDatasetExportJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDatasetExportJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDatasetExportJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDatasetExportJobRequest>() {
           @Override
           public void write(JsonWriter out, CreateDatasetExportJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDatasetExportJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDatasetExportJobRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDatasetExportJobRequest
   * @throws IOException if the JSON string is invalid with respect to CreateDatasetExportJobRequest
   */
  public static CreateDatasetExportJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDatasetExportJobRequest.class);
  }

  /**
   * Convert an instance of CreateDatasetExportJobRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

