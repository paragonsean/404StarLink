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
import java.util.Map;

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
 * The configuration details of the recommender.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:57.894352-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecommenderConfig {
  public static final String SERIALIZED_NAME_ITEM_EXPLORATION_CONFIG = "itemExplorationConfig";
  @SerializedName(SERIALIZED_NAME_ITEM_EXPLORATION_CONFIG)
  private Map itemExplorationConfig;

  public static final String SERIALIZED_NAME_MIN_RECOMMENDATION_REQUESTS_PER_SECOND = "minRecommendationRequestsPerSecond";
  @SerializedName(SERIALIZED_NAME_MIN_RECOMMENDATION_REQUESTS_PER_SECOND)
  private Integer minRecommendationRequestsPerSecond;

  public RecommenderConfig() {
  }

  public RecommenderConfig itemExplorationConfig(Map itemExplorationConfig) {
    this.itemExplorationConfig = itemExplorationConfig;
    return this;
  }

  /**
   * Get itemExplorationConfig
   * @return itemExplorationConfig
   */
  @javax.annotation.Nullable
  public Map getItemExplorationConfig() {
    return itemExplorationConfig;
  }

  public void setItemExplorationConfig(Map itemExplorationConfig) {
    this.itemExplorationConfig = itemExplorationConfig;
  }


  public RecommenderConfig minRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
    this.minRecommendationRequestsPerSecond = minRecommendationRequestsPerSecond;
    return this;
  }

  /**
   * Get minRecommendationRequestsPerSecond
   * @return minRecommendationRequestsPerSecond
   */
  @javax.annotation.Nullable
  public Integer getMinRecommendationRequestsPerSecond() {
    return minRecommendationRequestsPerSecond;
  }

  public void setMinRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
    this.minRecommendationRequestsPerSecond = minRecommendationRequestsPerSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommenderConfig recommenderConfig = (RecommenderConfig) o;
    return Objects.equals(this.itemExplorationConfig, recommenderConfig.itemExplorationConfig) &&
        Objects.equals(this.minRecommendationRequestsPerSecond, recommenderConfig.minRecommendationRequestsPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemExplorationConfig, minRecommendationRequestsPerSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommenderConfig {\n");
    sb.append("    itemExplorationConfig: ").append(toIndentedString(itemExplorationConfig)).append("\n");
    sb.append("    minRecommendationRequestsPerSecond: ").append(toIndentedString(minRecommendationRequestsPerSecond)).append("\n");
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
    openapiFields.add("itemExplorationConfig");
    openapiFields.add("minRecommendationRequestsPerSecond");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecommenderConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecommenderConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecommenderConfig is not found in the empty JSON string", RecommenderConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecommenderConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecommenderConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `itemExplorationConfig`
      if (jsonObj.get("itemExplorationConfig") != null && !jsonObj.get("itemExplorationConfig").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("itemExplorationConfig"));
      }
      // validate the optional field `minRecommendationRequestsPerSecond`
      if (jsonObj.get("minRecommendationRequestsPerSecond") != null && !jsonObj.get("minRecommendationRequestsPerSecond").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("minRecommendationRequestsPerSecond"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommenderConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommenderConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommenderConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommenderConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommenderConfig>() {
           @Override
           public void write(JsonWriter out, RecommenderConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommenderConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecommenderConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecommenderConfig
   * @throws IOException if the JSON string is invalid with respect to RecommenderConfig
   */
  public static RecommenderConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommenderConfig.class);
  }

  /**
   * Convert an instance of RecommenderConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

