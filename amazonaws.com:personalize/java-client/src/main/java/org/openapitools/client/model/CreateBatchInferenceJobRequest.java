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
import org.openapitools.client.model.CreateBatchInferenceJobRequestBatchInferenceJobConfig;
import org.openapitools.client.model.CreateBatchInferenceJobRequestJobInput;
import org.openapitools.client.model.CreateBatchInferenceJobRequestJobOutput;

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
 * CreateBatchInferenceJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateBatchInferenceJobRequest {
  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_SOLUTION_VERSION_ARN = "solutionVersionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION_ARN)
  private String solutionVersionArn;

  public static final String SERIALIZED_NAME_FILTER_ARN = "filterArn";
  @SerializedName(SERIALIZED_NAME_FILTER_ARN)
  private String filterArn;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public static final String SERIALIZED_NAME_JOB_INPUT = "jobInput";
  @SerializedName(SERIALIZED_NAME_JOB_INPUT)
  private CreateBatchInferenceJobRequestJobInput jobInput;

  public static final String SERIALIZED_NAME_JOB_OUTPUT = "jobOutput";
  @SerializedName(SERIALIZED_NAME_JOB_OUTPUT)
  private CreateBatchInferenceJobRequestJobOutput jobOutput;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_BATCH_INFERENCE_JOB_CONFIG = "batchInferenceJobConfig";
  @SerializedName(SERIALIZED_NAME_BATCH_INFERENCE_JOB_CONFIG)
  private CreateBatchInferenceJobRequestBatchInferenceJobConfig batchInferenceJobConfig;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateBatchInferenceJobRequest() {
  }

  public CreateBatchInferenceJobRequest jobName(String jobName) {
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


  public CreateBatchInferenceJobRequest solutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
    return this;
  }

  /**
   * Get solutionVersionArn
   * @return solutionVersionArn
   */
  @javax.annotation.Nonnull
  public String getSolutionVersionArn() {
    return solutionVersionArn;
  }

  public void setSolutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
  }


  public CreateBatchInferenceJobRequest filterArn(String filterArn) {
    this.filterArn = filterArn;
    return this;
  }

  /**
   * Get filterArn
   * @return filterArn
   */
  @javax.annotation.Nullable
  public String getFilterArn() {
    return filterArn;
  }

  public void setFilterArn(String filterArn) {
    this.filterArn = filterArn;
  }


  public CreateBatchInferenceJobRequest numResults(Integer numResults) {
    this.numResults = numResults;
    return this;
  }

  /**
   * Get numResults
   * @return numResults
   */
  @javax.annotation.Nullable
  public Integer getNumResults() {
    return numResults;
  }

  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }


  public CreateBatchInferenceJobRequest jobInput(CreateBatchInferenceJobRequestJobInput jobInput) {
    this.jobInput = jobInput;
    return this;
  }

  /**
   * Get jobInput
   * @return jobInput
   */
  @javax.annotation.Nonnull
  public CreateBatchInferenceJobRequestJobInput getJobInput() {
    return jobInput;
  }

  public void setJobInput(CreateBatchInferenceJobRequestJobInput jobInput) {
    this.jobInput = jobInput;
  }


  public CreateBatchInferenceJobRequest jobOutput(CreateBatchInferenceJobRequestJobOutput jobOutput) {
    this.jobOutput = jobOutput;
    return this;
  }

  /**
   * Get jobOutput
   * @return jobOutput
   */
  @javax.annotation.Nonnull
  public CreateBatchInferenceJobRequestJobOutput getJobOutput() {
    return jobOutput;
  }

  public void setJobOutput(CreateBatchInferenceJobRequestJobOutput jobOutput) {
    this.jobOutput = jobOutput;
  }


  public CreateBatchInferenceJobRequest roleArn(String roleArn) {
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


  public CreateBatchInferenceJobRequest batchInferenceJobConfig(CreateBatchInferenceJobRequestBatchInferenceJobConfig batchInferenceJobConfig) {
    this.batchInferenceJobConfig = batchInferenceJobConfig;
    return this;
  }

  /**
   * Get batchInferenceJobConfig
   * @return batchInferenceJobConfig
   */
  @javax.annotation.Nullable
  public CreateBatchInferenceJobRequestBatchInferenceJobConfig getBatchInferenceJobConfig() {
    return batchInferenceJobConfig;
  }

  public void setBatchInferenceJobConfig(CreateBatchInferenceJobRequestBatchInferenceJobConfig batchInferenceJobConfig) {
    this.batchInferenceJobConfig = batchInferenceJobConfig;
  }


  public CreateBatchInferenceJobRequest tags(List tags) {
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
    CreateBatchInferenceJobRequest createBatchInferenceJobRequest = (CreateBatchInferenceJobRequest) o;
    return Objects.equals(this.jobName, createBatchInferenceJobRequest.jobName) &&
        Objects.equals(this.solutionVersionArn, createBatchInferenceJobRequest.solutionVersionArn) &&
        Objects.equals(this.filterArn, createBatchInferenceJobRequest.filterArn) &&
        Objects.equals(this.numResults, createBatchInferenceJobRequest.numResults) &&
        Objects.equals(this.jobInput, createBatchInferenceJobRequest.jobInput) &&
        Objects.equals(this.jobOutput, createBatchInferenceJobRequest.jobOutput) &&
        Objects.equals(this.roleArn, createBatchInferenceJobRequest.roleArn) &&
        Objects.equals(this.batchInferenceJobConfig, createBatchInferenceJobRequest.batchInferenceJobConfig) &&
        Objects.equals(this.tags, createBatchInferenceJobRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, solutionVersionArn, filterArn, numResults, jobInput, jobOutput, roleArn, batchInferenceJobConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchInferenceJobRequest {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    solutionVersionArn: ").append(toIndentedString(solutionVersionArn)).append("\n");
    sb.append("    filterArn: ").append(toIndentedString(filterArn)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    jobInput: ").append(toIndentedString(jobInput)).append("\n");
    sb.append("    jobOutput: ").append(toIndentedString(jobOutput)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    batchInferenceJobConfig: ").append(toIndentedString(batchInferenceJobConfig)).append("\n");
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
    openapiFields.add("solutionVersionArn");
    openapiFields.add("filterArn");
    openapiFields.add("numResults");
    openapiFields.add("jobInput");
    openapiFields.add("jobOutput");
    openapiFields.add("roleArn");
    openapiFields.add("batchInferenceJobConfig");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobName");
    openapiRequiredFields.add("solutionVersionArn");
    openapiRequiredFields.add("jobInput");
    openapiRequiredFields.add("jobOutput");
    openapiRequiredFields.add("roleArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateBatchInferenceJobRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBatchInferenceJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBatchInferenceJobRequest is not found in the empty JSON string", CreateBatchInferenceJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBatchInferenceJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBatchInferenceJobRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBatchInferenceJobRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `jobName`
      String.validateJsonElement(jsonObj.get("jobName"));
      // validate the required field `solutionVersionArn`
      String.validateJsonElement(jsonObj.get("solutionVersionArn"));
      // validate the optional field `filterArn`
      if (jsonObj.get("filterArn") != null && !jsonObj.get("filterArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("filterArn"));
      }
      // validate the optional field `numResults`
      if (jsonObj.get("numResults") != null && !jsonObj.get("numResults").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("numResults"));
      }
      // validate the required field `jobInput`
      CreateBatchInferenceJobRequestJobInput.validateJsonElement(jsonObj.get("jobInput"));
      // validate the required field `jobOutput`
      CreateBatchInferenceJobRequestJobOutput.validateJsonElement(jsonObj.get("jobOutput"));
      // validate the required field `roleArn`
      String.validateJsonElement(jsonObj.get("roleArn"));
      // validate the optional field `batchInferenceJobConfig`
      if (jsonObj.get("batchInferenceJobConfig") != null && !jsonObj.get("batchInferenceJobConfig").isJsonNull()) {
        CreateBatchInferenceJobRequestBatchInferenceJobConfig.validateJsonElement(jsonObj.get("batchInferenceJobConfig"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("tags"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBatchInferenceJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBatchInferenceJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBatchInferenceJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBatchInferenceJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBatchInferenceJobRequest>() {
           @Override
           public void write(JsonWriter out, CreateBatchInferenceJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBatchInferenceJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateBatchInferenceJobRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateBatchInferenceJobRequest
   * @throws IOException if the JSON string is invalid with respect to CreateBatchInferenceJobRequest
   */
  public static CreateBatchInferenceJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBatchInferenceJobRequest.class);
  }

  /**
   * Convert an instance of CreateBatchInferenceJobRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

