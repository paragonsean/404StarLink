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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Map;
import org.openapitools.client.model.CreateRecommenderRequestRecommenderConfig;
import org.openapitools.client.model.RecommenderLatestRecommenderUpdate;

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
 * DescribeRecommenderResponseRecommender
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeRecommenderResponseRecommender {
  public static final String SERIALIZED_NAME_RECOMMENDER_ARN = "recommenderArn";
  @SerializedName(SERIALIZED_NAME_RECOMMENDER_ARN)
  private String recommenderArn;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECIPE_ARN = "recipeArn";
  @SerializedName(SERIALIZED_NAME_RECIPE_ARN)
  private String recipeArn;

  public static final String SERIALIZED_NAME_RECOMMENDER_CONFIG = "recommenderConfig";
  @SerializedName(SERIALIZED_NAME_RECOMMENDER_CONFIG)
  private CreateRecommenderRequestRecommenderConfig recommenderConfig;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_LATEST_RECOMMENDER_UPDATE = "latestRecommenderUpdate";
  @SerializedName(SERIALIZED_NAME_LATEST_RECOMMENDER_UPDATE)
  private RecommenderLatestRecommenderUpdate latestRecommenderUpdate;

  public static final String SERIALIZED_NAME_MODEL_METRICS = "modelMetrics";
  @SerializedName(SERIALIZED_NAME_MODEL_METRICS)
  private Map modelMetrics;

  public DescribeRecommenderResponseRecommender() {
  }

  public DescribeRecommenderResponseRecommender recommenderArn(String recommenderArn) {
    this.recommenderArn = recommenderArn;
    return this;
  }

  /**
   * Get recommenderArn
   * @return recommenderArn
   */
  @javax.annotation.Nullable
  public String getRecommenderArn() {
    return recommenderArn;
  }

  public void setRecommenderArn(String recommenderArn) {
    this.recommenderArn = recommenderArn;
  }


  public DescribeRecommenderResponseRecommender datasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
    return this;
  }

  /**
   * Get datasetGroupArn
   * @return datasetGroupArn
   */
  @javax.annotation.Nullable
  public String getDatasetGroupArn() {
    return datasetGroupArn;
  }

  public void setDatasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
  }


  public DescribeRecommenderResponseRecommender name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DescribeRecommenderResponseRecommender recipeArn(String recipeArn) {
    this.recipeArn = recipeArn;
    return this;
  }

  /**
   * Get recipeArn
   * @return recipeArn
   */
  @javax.annotation.Nullable
  public String getRecipeArn() {
    return recipeArn;
  }

  public void setRecipeArn(String recipeArn) {
    this.recipeArn = recipeArn;
  }


  public DescribeRecommenderResponseRecommender recommenderConfig(CreateRecommenderRequestRecommenderConfig recommenderConfig) {
    this.recommenderConfig = recommenderConfig;
    return this;
  }

  /**
   * Get recommenderConfig
   * @return recommenderConfig
   */
  @javax.annotation.Nullable
  public CreateRecommenderRequestRecommenderConfig getRecommenderConfig() {
    return recommenderConfig;
  }

  public void setRecommenderConfig(CreateRecommenderRequestRecommenderConfig recommenderConfig) {
    this.recommenderConfig = recommenderConfig;
  }


  public DescribeRecommenderResponseRecommender creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public DescribeRecommenderResponseRecommender lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }


  public DescribeRecommenderResponseRecommender status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public DescribeRecommenderResponseRecommender failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public DescribeRecommenderResponseRecommender latestRecommenderUpdate(RecommenderLatestRecommenderUpdate latestRecommenderUpdate) {
    this.latestRecommenderUpdate = latestRecommenderUpdate;
    return this;
  }

  /**
   * Get latestRecommenderUpdate
   * @return latestRecommenderUpdate
   */
  @javax.annotation.Nullable
  public RecommenderLatestRecommenderUpdate getLatestRecommenderUpdate() {
    return latestRecommenderUpdate;
  }

  public void setLatestRecommenderUpdate(RecommenderLatestRecommenderUpdate latestRecommenderUpdate) {
    this.latestRecommenderUpdate = latestRecommenderUpdate;
  }


  public DescribeRecommenderResponseRecommender modelMetrics(Map modelMetrics) {
    this.modelMetrics = modelMetrics;
    return this;
  }

  /**
   * Get modelMetrics
   * @return modelMetrics
   */
  @javax.annotation.Nullable
  public Map getModelMetrics() {
    return modelMetrics;
  }

  public void setModelMetrics(Map modelMetrics) {
    this.modelMetrics = modelMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRecommenderResponseRecommender describeRecommenderResponseRecommender = (DescribeRecommenderResponseRecommender) o;
    return Objects.equals(this.recommenderArn, describeRecommenderResponseRecommender.recommenderArn) &&
        Objects.equals(this.datasetGroupArn, describeRecommenderResponseRecommender.datasetGroupArn) &&
        Objects.equals(this.name, describeRecommenderResponseRecommender.name) &&
        Objects.equals(this.recipeArn, describeRecommenderResponseRecommender.recipeArn) &&
        Objects.equals(this.recommenderConfig, describeRecommenderResponseRecommender.recommenderConfig) &&
        Objects.equals(this.creationDateTime, describeRecommenderResponseRecommender.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeRecommenderResponseRecommender.lastUpdatedDateTime) &&
        Objects.equals(this.status, describeRecommenderResponseRecommender.status) &&
        Objects.equals(this.failureReason, describeRecommenderResponseRecommender.failureReason) &&
        Objects.equals(this.latestRecommenderUpdate, describeRecommenderResponseRecommender.latestRecommenderUpdate) &&
        Objects.equals(this.modelMetrics, describeRecommenderResponseRecommender.modelMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommenderArn, datasetGroupArn, name, recipeArn, recommenderConfig, creationDateTime, lastUpdatedDateTime, status, failureReason, latestRecommenderUpdate, modelMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRecommenderResponseRecommender {\n");
    sb.append("    recommenderArn: ").append(toIndentedString(recommenderArn)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    recommenderConfig: ").append(toIndentedString(recommenderConfig)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    latestRecommenderUpdate: ").append(toIndentedString(latestRecommenderUpdate)).append("\n");
    sb.append("    modelMetrics: ").append(toIndentedString(modelMetrics)).append("\n");
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
    openapiFields.add("recommenderArn");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("name");
    openapiFields.add("recipeArn");
    openapiFields.add("recommenderConfig");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("status");
    openapiFields.add("failureReason");
    openapiFields.add("latestRecommenderUpdate");
    openapiFields.add("modelMetrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeRecommenderResponseRecommender
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeRecommenderResponseRecommender.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeRecommenderResponseRecommender is not found in the empty JSON string", DescribeRecommenderResponseRecommender.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeRecommenderResponseRecommender.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeRecommenderResponseRecommender` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `recommenderArn`
      if (jsonObj.get("recommenderArn") != null && !jsonObj.get("recommenderArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recommenderArn"));
      }
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `recipeArn`
      if (jsonObj.get("recipeArn") != null && !jsonObj.get("recipeArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recipeArn"));
      }
      // validate the optional field `recommenderConfig`
      if (jsonObj.get("recommenderConfig") != null && !jsonObj.get("recommenderConfig").isJsonNull()) {
        CreateRecommenderRequestRecommenderConfig.validateJsonElement(jsonObj.get("recommenderConfig"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `latestRecommenderUpdate`
      if (jsonObj.get("latestRecommenderUpdate") != null && !jsonObj.get("latestRecommenderUpdate").isJsonNull()) {
        RecommenderLatestRecommenderUpdate.validateJsonElement(jsonObj.get("latestRecommenderUpdate"));
      }
      // validate the optional field `modelMetrics`
      if (jsonObj.get("modelMetrics") != null && !jsonObj.get("modelMetrics").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("modelMetrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeRecommenderResponseRecommender.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeRecommenderResponseRecommender' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeRecommenderResponseRecommender> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeRecommenderResponseRecommender.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeRecommenderResponseRecommender>() {
           @Override
           public void write(JsonWriter out, DescribeRecommenderResponseRecommender value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeRecommenderResponseRecommender read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeRecommenderResponseRecommender given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeRecommenderResponseRecommender
   * @throws IOException if the JSON string is invalid with respect to DescribeRecommenderResponseRecommender
   */
  public static DescribeRecommenderResponseRecommender fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeRecommenderResponseRecommender.class);
  }

  /**
   * Convert an instance of DescribeRecommenderResponseRecommender to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

