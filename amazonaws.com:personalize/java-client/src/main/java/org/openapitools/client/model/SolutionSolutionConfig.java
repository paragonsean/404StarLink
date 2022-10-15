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
import org.openapitools.client.model.SolutionConfigAutoMLConfig;
import org.openapitools.client.model.SolutionConfigHpoConfig;
import org.openapitools.client.model.SolutionConfigOptimizationObjective;

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
 * SolutionSolutionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SolutionSolutionConfig {
  public static final String SERIALIZED_NAME_EVENT_VALUE_THRESHOLD = "eventValueThreshold";
  @SerializedName(SERIALIZED_NAME_EVENT_VALUE_THRESHOLD)
  private String eventValueThreshold;

  public static final String SERIALIZED_NAME_HPO_CONFIG = "hpoConfig";
  @SerializedName(SERIALIZED_NAME_HPO_CONFIG)
  private SolutionConfigHpoConfig hpoConfig;

  public static final String SERIALIZED_NAME_ALGORITHM_HYPER_PARAMETERS = "algorithmHyperParameters";
  @SerializedName(SERIALIZED_NAME_ALGORITHM_HYPER_PARAMETERS)
  private Map algorithmHyperParameters;

  public static final String SERIALIZED_NAME_FEATURE_TRANSFORMATION_PARAMETERS = "featureTransformationParameters";
  @SerializedName(SERIALIZED_NAME_FEATURE_TRANSFORMATION_PARAMETERS)
  private Map featureTransformationParameters;

  public static final String SERIALIZED_NAME_AUTO_M_L_CONFIG = "autoMLConfig";
  @SerializedName(SERIALIZED_NAME_AUTO_M_L_CONFIG)
  private SolutionConfigAutoMLConfig autoMLConfig;

  public static final String SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE = "optimizationObjective";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_OBJECTIVE)
  private SolutionConfigOptimizationObjective optimizationObjective;

  public SolutionSolutionConfig() {
  }

  public SolutionSolutionConfig eventValueThreshold(String eventValueThreshold) {
    this.eventValueThreshold = eventValueThreshold;
    return this;
  }

  /**
   * Get eventValueThreshold
   * @return eventValueThreshold
   */
  @javax.annotation.Nullable
  public String getEventValueThreshold() {
    return eventValueThreshold;
  }

  public void setEventValueThreshold(String eventValueThreshold) {
    this.eventValueThreshold = eventValueThreshold;
  }


  public SolutionSolutionConfig hpoConfig(SolutionConfigHpoConfig hpoConfig) {
    this.hpoConfig = hpoConfig;
    return this;
  }

  /**
   * Get hpoConfig
   * @return hpoConfig
   */
  @javax.annotation.Nullable
  public SolutionConfigHpoConfig getHpoConfig() {
    return hpoConfig;
  }

  public void setHpoConfig(SolutionConfigHpoConfig hpoConfig) {
    this.hpoConfig = hpoConfig;
  }


  public SolutionSolutionConfig algorithmHyperParameters(Map algorithmHyperParameters) {
    this.algorithmHyperParameters = algorithmHyperParameters;
    return this;
  }

  /**
   * Get algorithmHyperParameters
   * @return algorithmHyperParameters
   */
  @javax.annotation.Nullable
  public Map getAlgorithmHyperParameters() {
    return algorithmHyperParameters;
  }

  public void setAlgorithmHyperParameters(Map algorithmHyperParameters) {
    this.algorithmHyperParameters = algorithmHyperParameters;
  }


  public SolutionSolutionConfig featureTransformationParameters(Map featureTransformationParameters) {
    this.featureTransformationParameters = featureTransformationParameters;
    return this;
  }

  /**
   * Get featureTransformationParameters
   * @return featureTransformationParameters
   */
  @javax.annotation.Nullable
  public Map getFeatureTransformationParameters() {
    return featureTransformationParameters;
  }

  public void setFeatureTransformationParameters(Map featureTransformationParameters) {
    this.featureTransformationParameters = featureTransformationParameters;
  }


  public SolutionSolutionConfig autoMLConfig(SolutionConfigAutoMLConfig autoMLConfig) {
    this.autoMLConfig = autoMLConfig;
    return this;
  }

  /**
   * Get autoMLConfig
   * @return autoMLConfig
   */
  @javax.annotation.Nullable
  public SolutionConfigAutoMLConfig getAutoMLConfig() {
    return autoMLConfig;
  }

  public void setAutoMLConfig(SolutionConfigAutoMLConfig autoMLConfig) {
    this.autoMLConfig = autoMLConfig;
  }


  public SolutionSolutionConfig optimizationObjective(SolutionConfigOptimizationObjective optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }

  /**
   * Get optimizationObjective
   * @return optimizationObjective
   */
  @javax.annotation.Nullable
  public SolutionConfigOptimizationObjective getOptimizationObjective() {
    return optimizationObjective;
  }

  public void setOptimizationObjective(SolutionConfigOptimizationObjective optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionSolutionConfig solutionSolutionConfig = (SolutionSolutionConfig) o;
    return Objects.equals(this.eventValueThreshold, solutionSolutionConfig.eventValueThreshold) &&
        Objects.equals(this.hpoConfig, solutionSolutionConfig.hpoConfig) &&
        Objects.equals(this.algorithmHyperParameters, solutionSolutionConfig.algorithmHyperParameters) &&
        Objects.equals(this.featureTransformationParameters, solutionSolutionConfig.featureTransformationParameters) &&
        Objects.equals(this.autoMLConfig, solutionSolutionConfig.autoMLConfig) &&
        Objects.equals(this.optimizationObjective, solutionSolutionConfig.optimizationObjective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventValueThreshold, hpoConfig, algorithmHyperParameters, featureTransformationParameters, autoMLConfig, optimizationObjective);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionSolutionConfig {\n");
    sb.append("    eventValueThreshold: ").append(toIndentedString(eventValueThreshold)).append("\n");
    sb.append("    hpoConfig: ").append(toIndentedString(hpoConfig)).append("\n");
    sb.append("    algorithmHyperParameters: ").append(toIndentedString(algorithmHyperParameters)).append("\n");
    sb.append("    featureTransformationParameters: ").append(toIndentedString(featureTransformationParameters)).append("\n");
    sb.append("    autoMLConfig: ").append(toIndentedString(autoMLConfig)).append("\n");
    sb.append("    optimizationObjective: ").append(toIndentedString(optimizationObjective)).append("\n");
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
    openapiFields.add("eventValueThreshold");
    openapiFields.add("hpoConfig");
    openapiFields.add("algorithmHyperParameters");
    openapiFields.add("featureTransformationParameters");
    openapiFields.add("autoMLConfig");
    openapiFields.add("optimizationObjective");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SolutionSolutionConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SolutionSolutionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SolutionSolutionConfig is not found in the empty JSON string", SolutionSolutionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SolutionSolutionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SolutionSolutionConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `eventValueThreshold`
      if (jsonObj.get("eventValueThreshold") != null && !jsonObj.get("eventValueThreshold").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("eventValueThreshold"));
      }
      // validate the optional field `hpoConfig`
      if (jsonObj.get("hpoConfig") != null && !jsonObj.get("hpoConfig").isJsonNull()) {
        SolutionConfigHpoConfig.validateJsonElement(jsonObj.get("hpoConfig"));
      }
      // validate the optional field `algorithmHyperParameters`
      if (jsonObj.get("algorithmHyperParameters") != null && !jsonObj.get("algorithmHyperParameters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("algorithmHyperParameters"));
      }
      // validate the optional field `featureTransformationParameters`
      if (jsonObj.get("featureTransformationParameters") != null && !jsonObj.get("featureTransformationParameters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("featureTransformationParameters"));
      }
      // validate the optional field `autoMLConfig`
      if (jsonObj.get("autoMLConfig") != null && !jsonObj.get("autoMLConfig").isJsonNull()) {
        SolutionConfigAutoMLConfig.validateJsonElement(jsonObj.get("autoMLConfig"));
      }
      // validate the optional field `optimizationObjective`
      if (jsonObj.get("optimizationObjective") != null && !jsonObj.get("optimizationObjective").isJsonNull()) {
        SolutionConfigOptimizationObjective.validateJsonElement(jsonObj.get("optimizationObjective"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SolutionSolutionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SolutionSolutionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SolutionSolutionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SolutionSolutionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<SolutionSolutionConfig>() {
           @Override
           public void write(JsonWriter out, SolutionSolutionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SolutionSolutionConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SolutionSolutionConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SolutionSolutionConfig
   * @throws IOException if the JSON string is invalid with respect to SolutionSolutionConfig
   */
  public static SolutionSolutionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SolutionSolutionConfig.class);
  }

  /**
   * Convert an instance of SolutionSolutionConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

