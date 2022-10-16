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
 * Provides information about a recipe. Each recipe provides an algorithm that Amazon Personalize uses in model training when you use the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html\&quot;&gt;CreateSolution&lt;/a&gt; operation. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Recipe {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECIPE_ARN = "recipeArn";
  @SerializedName(SERIALIZED_NAME_RECIPE_ARN)
  private String recipeArn;

  public static final String SERIALIZED_NAME_ALGORITHM_ARN = "algorithmArn";
  @SerializedName(SERIALIZED_NAME_ALGORITHM_ARN)
  private String algorithmArn;

  public static final String SERIALIZED_NAME_FEATURE_TRANSFORMATION_ARN = "featureTransformationArn";
  @SerializedName(SERIALIZED_NAME_FEATURE_TRANSFORMATION_ARN)
  private String featureTransformationArn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_RECIPE_TYPE = "recipeType";
  @SerializedName(SERIALIZED_NAME_RECIPE_TYPE)
  private String recipeType;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public Recipe() {
  }

  public Recipe name(String name) {
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


  public Recipe recipeArn(String recipeArn) {
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


  public Recipe algorithmArn(String algorithmArn) {
    this.algorithmArn = algorithmArn;
    return this;
  }

  /**
   * Get algorithmArn
   * @return algorithmArn
   */
  @javax.annotation.Nullable
  public String getAlgorithmArn() {
    return algorithmArn;
  }

  public void setAlgorithmArn(String algorithmArn) {
    this.algorithmArn = algorithmArn;
  }


  public Recipe featureTransformationArn(String featureTransformationArn) {
    this.featureTransformationArn = featureTransformationArn;
    return this;
  }

  /**
   * Get featureTransformationArn
   * @return featureTransformationArn
   */
  @javax.annotation.Nullable
  public String getFeatureTransformationArn() {
    return featureTransformationArn;
  }

  public void setFeatureTransformationArn(String featureTransformationArn) {
    this.featureTransformationArn = featureTransformationArn;
  }


  public Recipe status(String status) {
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


  public Recipe description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Recipe creationDateTime(OffsetDateTime creationDateTime) {
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


  public Recipe recipeType(String recipeType) {
    this.recipeType = recipeType;
    return this;
  }

  /**
   * Get recipeType
   * @return recipeType
   */
  @javax.annotation.Nullable
  public String getRecipeType() {
    return recipeType;
  }

  public void setRecipeType(String recipeType) {
    this.recipeType = recipeType;
  }


  public Recipe lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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
    Recipe recipe = (Recipe) o;
    return Objects.equals(this.name, recipe.name) &&
        Objects.equals(this.recipeArn, recipe.recipeArn) &&
        Objects.equals(this.algorithmArn, recipe.algorithmArn) &&
        Objects.equals(this.featureTransformationArn, recipe.featureTransformationArn) &&
        Objects.equals(this.status, recipe.status) &&
        Objects.equals(this.description, recipe.description) &&
        Objects.equals(this.creationDateTime, recipe.creationDateTime) &&
        Objects.equals(this.recipeType, recipe.recipeType) &&
        Objects.equals(this.lastUpdatedDateTime, recipe.lastUpdatedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipeArn, algorithmArn, featureTransformationArn, status, description, creationDateTime, recipeType, lastUpdatedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipeArn: ").append(toIndentedString(recipeArn)).append("\n");
    sb.append("    algorithmArn: ").append(toIndentedString(algorithmArn)).append("\n");
    sb.append("    featureTransformationArn: ").append(toIndentedString(featureTransformationArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    recipeType: ").append(toIndentedString(recipeType)).append("\n");
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
    openapiFields.add("recipeArn");
    openapiFields.add("algorithmArn");
    openapiFields.add("featureTransformationArn");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("creationDateTime");
    openapiFields.add("recipeType");
    openapiFields.add("lastUpdatedDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Recipe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Recipe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Recipe is not found in the empty JSON string", Recipe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Recipe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Recipe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `recipeArn`
      if (jsonObj.get("recipeArn") != null && !jsonObj.get("recipeArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recipeArn"));
      }
      // validate the optional field `algorithmArn`
      if (jsonObj.get("algorithmArn") != null && !jsonObj.get("algorithmArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("algorithmArn"));
      }
      // validate the optional field `featureTransformationArn`
      if (jsonObj.get("featureTransformationArn") != null && !jsonObj.get("featureTransformationArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("featureTransformationArn"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("description"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `recipeType`
      if (jsonObj.get("recipeType") != null && !jsonObj.get("recipeType").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("recipeType"));
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
       if (!Recipe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Recipe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Recipe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Recipe.class));

       return (TypeAdapter<T>) new TypeAdapter<Recipe>() {
           @Override
           public void write(JsonWriter out, Recipe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Recipe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Recipe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Recipe
   * @throws IOException if the JSON string is invalid with respect to Recipe
   */
  public static Recipe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Recipe.class);
  }

  /**
   * Convert an instance of Recipe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

