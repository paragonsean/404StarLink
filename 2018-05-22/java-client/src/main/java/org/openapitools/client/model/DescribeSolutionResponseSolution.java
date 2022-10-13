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
import org.openapitools.client.model.SolutionAutoMLResult;
import org.openapitools.client.model.SolutionLatestSolutionVersion;
import org.openapitools.client.model.SolutionSolutionConfig;

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
 * DescribeSolutionResponseSolution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:53:08.261957-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeSolutionResponseSolution {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_SOLUTION_CONFIG = "solutionConfig";
  @SerializedName(SERIALIZED_NAME_SOLUTION_CONFIG)
  private SolutionSolutionConfig solutionConfig;

  public static final String SERIALIZED_NAME_AUTO_M_L_RESULT = "autoMLResult";
  @SerializedName(SERIALIZED_NAME_AUTO_M_L_RESULT)
  private SolutionAutoMLResult autoMLResult;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_LATEST_SOLUTION_VERSION = "latestSolutionVersion";
  @SerializedName(SERIALIZED_NAME_LATEST_SOLUTION_VERSION)
  private SolutionLatestSolutionVersion latestSolutionVersion;

  public DescribeSolutionResponseSolution() {
  }

  public DescribeSolutionResponseSolution name(String name) {
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


  public DescribeSolutionResponseSolution solutionArn(String solutionArn) {
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


  public DescribeSolutionResponseSolution performHPO(Boolean performHPO) {
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


  public DescribeSolutionResponseSolution performAutoML(Boolean performAutoML) {
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


  public DescribeSolutionResponseSolution recipeArn(String recipeArn) {
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


  public DescribeSolutionResponseSolution datasetGroupArn(String datasetGroupArn) {
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


  public DescribeSolutionResponseSolution eventType(String eventType) {
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


  public DescribeSolutionResponseSolution solutionConfig(SolutionSolutionConfig solutionConfig) {
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


  public DescribeSolutionResponseSolution autoMLResult(SolutionAutoMLResult autoMLResult) {
    this.autoMLResult = autoMLResult;
    return this;
  }

  /**
   * Get autoMLResult
   * @return autoMLResult
   */
  @javax.annotation.Nullable
  public SolutionAutoMLResult getAutoMLResult() {
    return autoMLResult;
  }

  public void setAutoMLResult(SolutionAutoMLResult autoMLResult) {
    this.autoMLResult = autoMLResult;
  }


  public DescribeSolutionResponseSolution status(String status) {
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


  public DescribeSolutionResponseSolution creationDateTime(OffsetDateTime creationDateTime) {
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


  public DescribeSolutionResponseSolution lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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


  public DescribeSolutionResponseSolution latestSolutionVersion(SolutionLatestSolutionVersion latestSolutionVersion) {
    this.latestSolutionVersion = latestSolutionVersion;
    return this;
  }

  /**
   * Get latestSolutionVersion
   * @return latestSolutionVersion
   */
  @javax.annotation.Nullable
  public SolutionLatestSolutionVersion getLatestSolutionVersion() {
    return latestSolutionVersion;
  }

  public void setLatestSolutionVersion(SolutionLatestSolutionVersion latestSolutionVersion) {
    this.latestSolutionVersion = latestSolutionVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSolutionResponseSolution describeSolutionResponseSolution = (DescribeSolutionResponseSolution) o;
    return Objects.equals(this.name, describeSolutionResponseSolution.name) &&
        Objects.equals(this.solutionArn, describeSolutionResponseSolution.solutionArn) &&
        Objects.equals(this.performHPO, describeSolutionResponseSolution.performHPO) &&
        Objects.equals(this.performAutoML, describeSolutionResponseSolution.performAutoML) &&
        Objects.equals(this.recipeArn, describeSolutionResponseSolution.recipeArn) &&
        Objects.equals(this.datasetGroupArn, describeSolutionResponseSolution.datasetGroupArn) &&
        Objects.equals(this.eventType, describeSolutionResponseSolution.eventType) &&
        Objects.equals(this.solutionConfig, describeSolutionResponseSolution.solutionConfig) &&
        Objects.equals(this.autoMLResult, describeSolutionResponseSolution.autoMLResult) &&
        Objects.equals(this.status, describeSolutionResponseSolution.status) &&
        Objects.equals(this.creationDateTime, describeSolutionResponseSolution.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, describeSolutionResponseSolution.lastUpdatedDateTime) &&
        Objects.equals(this.latestSolutionVersion, describeSolutionResponseSolution.latestSolutionVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, solutionArn, performHPO, performAutoML, recipeArn, datasetGroupArn, eventType, solutionConfig, autoMLResult, status, creationDateTime, lastUpdatedDateTime, latestSolutionVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSolutionResponseSolution {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solutionArn: ").append(toIndentedString(solutionArn)).append("\n");
    sb.append("    performHPO: ").append(toIndentedString(performHPO)).append("\n");
    sb.append("    performAutoML: ").append(toIndentedString(performAutoML)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    solutionConfig: ").append(toIndentedString(solutionConfig)).append("\n");
    sb.append("    autoMLResult: ").append(toIndentedString(autoMLResult)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    latestSolutionVersion: ").append(toIndentedString(latestSolutionVersion)).append("\n");
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
    openapiFields.add("solutionArn");
    openapiFields.add("performHPO");
    openapiFields.add("performAutoML");
    openapiFields.add("recipeArn");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("eventType");
    openapiFields.add("solutionConfig");
    openapiFields.add("autoMLResult");
    openapiFields.add("status");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("latestSolutionVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeSolutionResponseSolution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeSolutionResponseSolution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeSolutionResponseSolution is not found in the empty JSON string", DescribeSolutionResponseSolution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeSolutionResponseSolution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeSolutionResponseSolution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
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
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `eventType`
      if (jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eventType"));
      }
      // validate the optional field `solutionConfig`
      if (jsonObj.get("solutionConfig") != null && !jsonObj.get("solutionConfig").isJsonNull()) {
        SolutionSolutionConfig.validateJsonElement(jsonObj.get("solutionConfig"));
      }
      // validate the optional field `autoMLResult`
      if (jsonObj.get("autoMLResult") != null && !jsonObj.get("autoMLResult").isJsonNull()) {
        SolutionAutoMLResult.validateJsonElement(jsonObj.get("autoMLResult"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `latestSolutionVersion`
      if (jsonObj.get("latestSolutionVersion") != null && !jsonObj.get("latestSolutionVersion").isJsonNull()) {
        SolutionLatestSolutionVersion.validateJsonElement(jsonObj.get("latestSolutionVersion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeSolutionResponseSolution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeSolutionResponseSolution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeSolutionResponseSolution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeSolutionResponseSolution.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeSolutionResponseSolution>() {
           @Override
           public void write(JsonWriter out, DescribeSolutionResponseSolution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeSolutionResponseSolution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeSolutionResponseSolution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeSolutionResponseSolution
   * @throws IOException if the JSON string is invalid with respect to DescribeSolutionResponseSolution
   */
  public static DescribeSolutionResponseSolution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeSolutionResponseSolution.class);
  }

  /**
   * Convert an instance of DescribeSolutionResponseSolution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

