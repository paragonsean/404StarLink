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
import org.openapitools.client.model.CreateSolutionRequestSolutionConfig;

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
 * CreateSolutionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:25.633240-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateSolutionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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
  private CreateSolutionRequestSolutionConfig solutionConfig;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateSolutionRequest() {
  }

  public CreateSolutionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateSolutionRequest performHPO(Boolean performHPO) {
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


  public CreateSolutionRequest performAutoML(Boolean performAutoML) {
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


  public CreateSolutionRequest recipeArn(String recipeArn) {
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


  public CreateSolutionRequest datasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
    return this;
  }

  /**
   * Get datasetGroupArn
   * @return datasetGroupArn
   */
  @javax.annotation.Nonnull
  public String getDatasetGroupArn() {
    return datasetGroupArn;
  }

  public void setDatasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
  }


  public CreateSolutionRequest eventType(String eventType) {
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


  public CreateSolutionRequest solutionConfig(CreateSolutionRequestSolutionConfig solutionConfig) {
    this.solutionConfig = solutionConfig;
    return this;
  }

  /**
   * Get solutionConfig
   * @return solutionConfig
   */
  @javax.annotation.Nullable
  public CreateSolutionRequestSolutionConfig getSolutionConfig() {
    return solutionConfig;
  }

  public void setSolutionConfig(CreateSolutionRequestSolutionConfig solutionConfig) {
    this.solutionConfig = solutionConfig;
  }


  public CreateSolutionRequest tags(List tags) {
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
    CreateSolutionRequest createSolutionRequest = (CreateSolutionRequest) o;
    return Objects.equals(this.name, createSolutionRequest.name) &&
        Objects.equals(this.performHPO, createSolutionRequest.performHPO) &&
        Objects.equals(this.performAutoML, createSolutionRequest.performAutoML) &&
        Objects.equals(this.recipeArn, createSolutionRequest.recipeArn) &&
        Objects.equals(this.datasetGroupArn, createSolutionRequest.datasetGroupArn) &&
        Objects.equals(this.eventType, createSolutionRequest.eventType) &&
        Objects.equals(this.solutionConfig, createSolutionRequest.solutionConfig) &&
        Objects.equals(this.tags, createSolutionRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, performHPO, performAutoML, recipeArn, datasetGroupArn, eventType, solutionConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSolutionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    performHPO: ").append(toIndentedString(performHPO)).append("\n");
    sb.append("    performAutoML: ").append(toIndentedString(performAutoML)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    solutionConfig: ").append(toIndentedString(solutionConfig)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("performHPO");
    openapiFields.add("performAutoML");
    openapiFields.add("recipeArn");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("eventType");
    openapiFields.add("solutionConfig");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("datasetGroupArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateSolutionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSolutionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSolutionRequest is not found in the empty JSON string", CreateSolutionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSolutionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSolutionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSolutionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      String.validateJsonElement(jsonObj.get("name"));
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
      // validate the required field `datasetGroupArn`
      String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      // validate the optional field `eventType`
      if (jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eventType"));
      }
      // validate the optional field `solutionConfig`
      if (jsonObj.get("solutionConfig") != null && !jsonObj.get("solutionConfig").isJsonNull()) {
        CreateSolutionRequestSolutionConfig.validateJsonElement(jsonObj.get("solutionConfig"));
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
       if (!CreateSolutionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSolutionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSolutionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSolutionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSolutionRequest>() {
           @Override
           public void write(JsonWriter out, CreateSolutionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSolutionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateSolutionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateSolutionRequest
   * @throws IOException if the JSON string is invalid with respect to CreateSolutionRequest
   */
  public static CreateSolutionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSolutionRequest.class);
  }

  /**
   * Convert an instance of CreateSolutionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

