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
import org.openapitools.client.model.SolutionSolutionConfig;
import org.openapitools.client.model.SolutionVersionTunedHPOParams;
import org.openapitools.client.model.TrainingMode;

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
 * DescribeSolutionVersionResponseSolutionVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:08.261957-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeSolutionVersionResponseSolutionVersion {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOLUTION_VERSION_ARN = "solutionVersionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION_ARN)
  private String solutionVersionArn;

  public static final String SERIALIZED_NAME_SOLUTION_ARN = "solutionArn";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ARN)
  private String solutionArn;

  public static final String SERIALIZED_NAME_PERFORM_H_P_O = "performHPO";
  @SerializedName(SERIALIZED_NAME_PERFORM_H_P_O)
  private Boolean performHPO;

  public static final String SERIALIZED_NAME_PERFORM_AUTO_M_L = "performAutoML";
  @SerializedName(SERIALIZED_NAME_PERFORM_AUTO_M_L)
  private Boolean performAutoML;

  public static final String SERIALIZED_NAME_RECIPE_ARN = "recipeArn";
  @SerializedName(SERIALIZED_NAME_RECIPE_ARN)
  private String recipeArn;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_SOLUTION_CONFIG = "solutionConfig";
  @SerializedName(SERIALIZED_NAME_SOLUTION_CONFIG)
  private SolutionSolutionConfig solutionConfig;

  public static final String SERIALIZED_NAME_TRAINING_HOURS = "trainingHours";
  @SerializedName(SERIALIZED_NAME_TRAINING_HOURS)
  private Double trainingHours;

  public static final String SERIALIZED_NAME_TRAINING_MODE = "trainingMode";
  @SerializedName(SERIALIZED_NAME_TRAINING_MODE)
  private TrainingMode trainingMode;

  public static final String SERIALIZED_NAME_TUNED_H_P_O_PARAMS = "tunedHPOParams";
  @SerializedName(SERIALIZED_NAME_TUNED_H_P_O_PARAMS)
  private SolutionVersionTunedHPOParams tunedHPOParams;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public DescribeSolutionVersionResponseSolutionVersion() {
  }

  public DescribeSolutionVersionResponseSolutionVersion name(String name) {
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


  public DescribeSolutionVersionResponseSolutionVersion solutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
    return this;
  }

  /**
   * Get solutionVersionArn
   * @return solutionVersionArn
   */
  @javax.annotation.Nullable
  public String getSolutionVersionArn() {
    return solutionVersionArn;
  }

  public void setSolutionVersionArn(String solutionVersionArn) {
    this.solutionVersionArn = solutionVersionArn;
  }


  public DescribeSolutionVersionResponseSolutionVersion solutionArn(String solutionArn) {
    this.solutionArn = solutionArn;
    return this;
  }

  /**
   * Get solutionArn
   * @return solutionArn
   */
  @javax.annotation.Nullable
  public String getSolutionArn() {
    return solutionArn;
  }

  public void setSolutionArn(String solutionArn) {
    this.solutionArn = solutionArn;
  }


  public DescribeSolutionVersionResponseSolutionVersion performHPO(Boolean performHPO) {
    this.performHPO = performHPO;
    return this;
  }

  /**
   * Get performHPO
   * @return performHPO
   */
  @javax.annotation.Nullable
  public Boolean getPerformHPO() {
    return performHPO;
  }

  public void setPerformHPO(Boolean performHPO) {
    this.performHPO = performHPO;
  }


  public DescribeSolutionVersionResponseSolutionVersion performAutoML(Boolean performAutoML) {
    this.performAutoML = performAutoML;
    return this;
  }

  /**
   * Get performAutoML
   * @return performAutoML
   */
  @javax.annotation.Nullable
  public Boolean getPerformAutoML() {
    return performAutoML;
  }

  public void setPerformAutoML(Boolean performAutoML) {
    this.performAutoML = performAutoML;
  }


  public DescribeSolutionVersionResponseSolutionVersion recipeArn(String recipeArn) {
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


  public DescribeSolutionVersionResponseSolutionVersion eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public DescribeSolutionVersionResponseSolutionVersion datasetGroupArn(String datasetGroupArn) {
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


  public DescribeSolutionVersionResponseSolutionVersion solutionConfig(SolutionSolutionConfig solutionConfig) {
    this.solutionConfig = solutionConfig;
    return this;
  }

  /**
   * Get solutionConfig
   * @return solutionConfig
   */
  @javax.annotation.Nullable
  public SolutionSolutionConfig getSolutionConfig() {
    return solutionConfig;
  }

  public void setSolutionConfig(SolutionSolutionConfig solutionConfig) {
    this.solutionConfig = solutionConfig;
  }


  public DescribeSolutionVersionResponseSolutionVersion trainingHours(Double trainingHours) {
    this.trainingHours = trainingHours;
    return this;
  }

  /**
   * Get trainingHours
   * @return trainingHours
   */
  @javax.annotation.Nullable
  public Double getTrainingHours() {
    return trainingHours;
  }

  public void setTrainingHours(Double trainingHours) {
    this.trainingHours = trainingHours;
  }


  public DescribeSolutionVersionResponseSolutionVersion trainingMode(TrainingMode trainingMode) {
    this.trainingMode = trainingMode;
    return this;
  }

  /**
   * Get trainingMode
   * @return trainingMode
   */
  @javax.annotation.Nullable
  public TrainingMode getTrainingMode() {
    return trainingMode;
  }

  public void setTrainingMode(TrainingMode trainingMode) {
    this.trainingMode = trainingMode;
  }


  public DescribeSolutionVersionResponseSolutionVersion tunedHPOParams(SolutionVersionTunedHPOParams tunedHPOParams) {
    this.tunedHPOParams = tunedHPOParams;
    return this;
  }

  /**
   * Get tunedHPOParams
   * @return tunedHPOParams
   */
  @javax.annotation.Nullable
  public SolutionVersionTunedHPOParams getTunedHPOParams() {
    return tunedHPOParams;
  }

  public void setTunedHPOParams(SolutionVersionTunedHPOParams tunedHPOParams) {
    this.tunedHPOParams = tunedHPOParams;
  }


  public DescribeSolutionVersionResponseSolutionVersion status(String status) {
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


  public DescribeSolutionVersionResponseSolutionVersion failureReason(String failureReason) {
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


  public DescribeSolutionVersionResponseSolutionVersion creationDateTime(OffsetDateTime creationDateTime) {
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


  public DescribeSolutionVersionResponseSolutionVersion lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSolutionVersionResponseSolutionVersion describeSolutionVersionResponseSolutionVersion = (DescribeSolutionVersionResponseSolutionVersion) o;
    return Objects.equals(this.name, describeSolutionVersionResponseSolutionVersion.name) &&
        Objects.equals(this.solutionVersionArn, describeSolutionVersionResponseSolutionVersion.solutionVersionArn) &&
        Objects.equals(this.solutionArn, describeSolutionVersionResponseSolutionVersion.solutionArn) &&
        Objects.equals(this.performHPO, describeSolutionVersionResponseSolutionVersion.performHPO) &&
        Objects.equals(this.performAutoML, describeSolutionVersionResponseSolutionVersion.performAutoML) &&
        Objects.equals(this.recipeArn, describeSolutionVersionResponseSolutionVersion.recipeArn) &&
        Objects.equals(this.eventType, describeSolutionVersionResponseSolutionVersion.eventType) &&
        Objects.equals(this.datasetGroupArn, describeSolutionVersionResponseSolutionVersion.datasetGroupArn) &&
        Objects.equals(this.solutionConfig, describeSolutionVersionResponseSolutionVersion.solutionConfig) &&
        Objects.equals(this.trainingHours, describeSolutionVersionResponseSolutionVersion.trainingHours) &&
        Objects.equals(this.trainingMode, describeSolutionVersionResponseSolutionVersion.trainingMode) &&
        Objects.equals(this.tunedHPOParams, describeSolutionVersionResponseSolutionVersion.tunedHPOParams) &&
        Objects.equals(this.status, describeSolutionVersionResponseSolutionVersion.status) &&
        Objects.equals(this.failureReason, describeSolutionVersionResponseSolutionVersion.failureReason) &&
        Objects.equals(this.creationDateTime, describeSolutionVersionResponseSolutionVersion.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeSolutionVersionResponseSolutionVersion.lastUpdatedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, solutionVersionArn, solutionArn, performHPO, performAutoML, recipeArn, eventType, datasetGroupArn, solutionConfig, trainingHours, trainingMode, tunedHPOParams, status, failureReason, creationDateTime, lastUpdatedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSolutionVersionResponseSolutionVersion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solutionVersionArn: ").append(toIndentedString(solutionVersionArn)).append("\n");
    sb.append("    solutionArn: ").append(toIndentedString(solutionArn)).append("\n");
    sb.append("    performHPO: ").append(toIndentedString(performHPO)).append("\n");
    sb.append("    performAutoML: ").append(toIndentedString(performAutoML)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    solutionConfig: ").append(toIndentedString(solutionConfig)).append("\n");
    sb.append("    trainingHours: ").append(toIndentedString(trainingHours)).append("\n");
    sb.append("    trainingMode: ").append(toIndentedString(trainingMode)).append("\n");
    sb.append("    tunedHPOParams: ").append(toIndentedString(tunedHPOParams)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("solutionVersionArn");
    openapiFields.add("solutionArn");
    openapiFields.add("performHPO");
    openapiFields.add("performAutoML");
    openapiFields.add("recipeArn");
    openapiFields.add("eventType");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("solutionConfig");
    openapiFields.add("trainingHours");
    openapiFields.add("trainingMode");
    openapiFields.add("tunedHPOParams");
    openapiFields.add("status");
    openapiFields.add("failureReason");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeSolutionVersionResponseSolutionVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeSolutionVersionResponseSolutionVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeSolutionVersionResponseSolutionVersion is not found in the empty JSON string", DescribeSolutionVersionResponseSolutionVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeSolutionVersionResponseSolutionVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeSolutionVersionResponseSolutionVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `solutionVersionArn`
      if (jsonObj.get("solutionVersionArn") != null && !jsonObj.get("solutionVersionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("solutionVersionArn"));
      }
      // validate the optional field `solutionArn`
      if (jsonObj.get("solutionArn") != null && !jsonObj.get("solutionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("solutionArn"));
      }
      // validate the optional field `performHPO`
      if (jsonObj.get("performHPO") != null && !jsonObj.get("performHPO").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("performHPO"));
      }
      // validate the optional field `performAutoML`
      if (jsonObj.get("performAutoML") != null && !jsonObj.get("performAutoML").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("performAutoML"));
      }
      // validate the optional field `recipeArn`
      if (jsonObj.get("recipeArn") != null && !jsonObj.get("recipeArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recipeArn"));
      }
      // validate the optional field `eventType`
      if (jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eventType"));
      }
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `solutionConfig`
      if (jsonObj.get("solutionConfig") != null && !jsonObj.get("solutionConfig").isJsonNull()) {
        SolutionSolutionConfig.validateJsonElement(jsonObj.get("solutionConfig"));
      }
      // validate the optional field `trainingHours`
      if (jsonObj.get("trainingHours") != null && !jsonObj.get("trainingHours").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("trainingHours"));
      }
      // validate the optional field `trainingMode`
      if (jsonObj.get("trainingMode") != null && !jsonObj.get("trainingMode").isJsonNull()) {
        TrainingMode.validateJsonElement(jsonObj.get("trainingMode"));
      }
      // validate the optional field `tunedHPOParams`
      if (jsonObj.get("tunedHPOParams") != null && !jsonObj.get("tunedHPOParams").isJsonNull()) {
        SolutionVersionTunedHPOParams.validateJsonElement(jsonObj.get("tunedHPOParams"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeSolutionVersionResponseSolutionVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeSolutionVersionResponseSolutionVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeSolutionVersionResponseSolutionVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeSolutionVersionResponseSolutionVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeSolutionVersionResponseSolutionVersion>() {
           @Override
           public void write(JsonWriter out, DescribeSolutionVersionResponseSolutionVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeSolutionVersionResponseSolutionVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeSolutionVersionResponseSolutionVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeSolutionVersionResponseSolutionVersion
   * @throws IOException if the JSON string is invalid with respect to DescribeSolutionVersionResponseSolutionVersion
   */
  public static DescribeSolutionVersionResponseSolutionVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeSolutionVersionResponseSolutionVersion.class);
  }

  /**
   * Convert an instance of DescribeSolutionVersionResponseSolutionVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

