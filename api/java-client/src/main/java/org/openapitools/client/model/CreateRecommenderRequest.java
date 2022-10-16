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
import org.openapitools.client.model.CreateRecommenderRequestRecommenderConfig;

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
 * CreateRecommenderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateRecommenderRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_RECIPE_ARN = "recipeArn";
  @SerializedName(SERIALIZED_NAME_RECIPE_ARN)
  private String recipeArn;

  public static final String SERIALIZED_NAME_RECOMMENDER_CONFIG = "recommenderConfig";
  @SerializedName(SERIALIZED_NAME_RECOMMENDER_CONFIG)
  private CreateRecommenderRequestRecommenderConfig recommenderConfig;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List tags;

  public CreateRecommenderRequest() {
  }

  public CreateRecommenderRequest name(String name) {
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


  public CreateRecommenderRequest datasetGroupArn(String datasetGroupArn) {
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


  public CreateRecommenderRequest recipeArn(String recipeArn) {
    this.recipeArn = recipeArn;
    return this;
  }

  /**
   * Get recipeArn
   * @return recipeArn
   */
  @javax.annotation.Nonnull
  public String getRecipeArn() {
    return recipeArn;
  }

  public void setRecipeArn(String recipeArn) {
    this.recipeArn = recipeArn;
  }


  public CreateRecommenderRequest recommenderConfig(CreateRecommenderRequestRecommenderConfig recommenderConfig) {
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


  public CreateRecommenderRequest tags(List tags) {
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
    CreateRecommenderRequest createRecommenderRequest = (CreateRecommenderRequest) o;
    return Objects.equals(this.name, createRecommenderRequest.name) &&
        Objects.equals(this.datasetGroupArn, createRecommenderRequest.datasetGroupArn) &&
        Objects.equals(this.recipeArn, createRecommenderRequest.recipeArn) &&
        Objects.equals(this.recommenderConfig, createRecommenderRequest.recommenderConfig) &&
        Objects.equals(this.tags, createRecommenderRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, datasetGroupArn, recipeArn, recommenderConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecommenderRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    recommenderConfig: ").append(toIndentedString(recommenderConfig)).append("\n");
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
    openapiFields.add("datasetGroupArn");
    openapiFields.add("recipeArn");
    openapiFields.add("recommenderConfig");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("datasetGroupArn");
    openapiRequiredFields.add("recipeArn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateRecommenderRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateRecommenderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRecommenderRequest is not found in the empty JSON string", CreateRecommenderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateRecommenderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRecommenderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRecommenderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      String.validateJsonElement(jsonObj.get("name"));
      // validate the required field `datasetGroupArn`
      String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      // validate the required field `recipeArn`
      String.validateJsonElement(jsonObj.get("recipeArn"));
      // validate the optional field `recommenderConfig`
      if (jsonObj.get("recommenderConfig") != null && !jsonObj.get("recommenderConfig").isJsonNull()) {
        CreateRecommenderRequestRecommenderConfig.validateJsonElement(jsonObj.get("recommenderConfig"));
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
       if (!CreateRecommenderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRecommenderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRecommenderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRecommenderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRecommenderRequest>() {
           @Override
           public void write(JsonWriter out, CreateRecommenderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRecommenderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateRecommenderRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateRecommenderRequest
   * @throws IOException if the JSON string is invalid with respect to CreateRecommenderRequest
   */
  public static CreateRecommenderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRecommenderRequest.class);
  }

  /**
   * Convert an instance of CreateRecommenderRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

