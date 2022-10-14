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
import org.openapitools.client.model.AlgorithmAlgorithmImage;
import org.openapitools.client.model.AlgorithmDefaultHyperParameterRanges;

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
 * Describes a custom algorithm.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Algorithm {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALGORITHM_ARN = "algorithmArn";
  @SerializedName(SERIALIZED_NAME_ALGORITHM_ARN)
  private String algorithmArn;

  public static final String SERIALIZED_NAME_ALGORITHM_IMAGE = "algorithmImage";
  @SerializedName(SERIALIZED_NAME_ALGORITHM_IMAGE)
  private AlgorithmAlgorithmImage algorithmImage;

  public static final String SERIALIZED_NAME_DEFAULT_HYPER_PARAMETERS = "defaultHyperParameters";
  @SerializedName(SERIALIZED_NAME_DEFAULT_HYPER_PARAMETERS)
  private Map defaultHyperParameters;

  public static final String SERIALIZED_NAME_DEFAULT_HYPER_PARAMETER_RANGES = "defaultHyperParameterRanges";
  @SerializedName(SERIALIZED_NAME_DEFAULT_HYPER_PARAMETER_RANGES)
  private AlgorithmDefaultHyperParameterRanges defaultHyperParameterRanges;

  public static final String SERIALIZED_NAME_DEFAULT_RESOURCE_CONFIG = "defaultResourceConfig";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RESOURCE_CONFIG)
  private Map defaultResourceConfig;

  public static final String SERIALIZED_NAME_TRAINING_INPUT_MODE = "trainingInputMode";
  @SerializedName(SERIALIZED_NAME_TRAINING_INPUT_MODE)
  private String trainingInputMode;

  public static final String SERIALIZED_NAME_ROLE_ARN = "roleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public Algorithm() {
  }

  public Algorithm name(String name) {
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


  public Algorithm algorithmArn(String algorithmArn) {
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


  public Algorithm algorithmImage(AlgorithmAlgorithmImage algorithmImage) {
    this.algorithmImage = algorithmImage;
    return this;
  }

  /**
   * Get algorithmImage
   * @return algorithmImage
   */
  @javax.annotation.Nullable
  public AlgorithmAlgorithmImage getAlgorithmImage() {
    return algorithmImage;
  }

  public void setAlgorithmImage(AlgorithmAlgorithmImage algorithmImage) {
    this.algorithmImage = algorithmImage;
  }


  public Algorithm defaultHyperParameters(Map defaultHyperParameters) {
    this.defaultHyperParameters = defaultHyperParameters;
    return this;
  }

  /**
   * Get defaultHyperParameters
   * @return defaultHyperParameters
   */
  @javax.annotation.Nullable
  public Map getDefaultHyperParameters() {
    return defaultHyperParameters;
  }

  public void setDefaultHyperParameters(Map defaultHyperParameters) {
    this.defaultHyperParameters = defaultHyperParameters;
  }


  public Algorithm defaultHyperParameterRanges(AlgorithmDefaultHyperParameterRanges defaultHyperParameterRanges) {
    this.defaultHyperParameterRanges = defaultHyperParameterRanges;
    return this;
  }

  /**
   * Get defaultHyperParameterRanges
   * @return defaultHyperParameterRanges
   */
  @javax.annotation.Nullable
  public AlgorithmDefaultHyperParameterRanges getDefaultHyperParameterRanges() {
    return defaultHyperParameterRanges;
  }

  public void setDefaultHyperParameterRanges(AlgorithmDefaultHyperParameterRanges defaultHyperParameterRanges) {
    this.defaultHyperParameterRanges = defaultHyperParameterRanges;
  }


  public Algorithm defaultResourceConfig(Map defaultResourceConfig) {
    this.defaultResourceConfig = defaultResourceConfig;
    return this;
  }

  /**
   * Get defaultResourceConfig
   * @return defaultResourceConfig
   */
  @javax.annotation.Nullable
  public Map getDefaultResourceConfig() {
    return defaultResourceConfig;
  }

  public void setDefaultResourceConfig(Map defaultResourceConfig) {
    this.defaultResourceConfig = defaultResourceConfig;
  }


  public Algorithm trainingInputMode(String trainingInputMode) {
    this.trainingInputMode = trainingInputMode;
    return this;
  }

  /**
   * Get trainingInputMode
   * @return trainingInputMode
   */
  @javax.annotation.Nullable
  public String getTrainingInputMode() {
    return trainingInputMode;
  }

  public void setTrainingInputMode(String trainingInputMode) {
    this.trainingInputMode = trainingInputMode;
  }


  public Algorithm roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nullable
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public Algorithm creationDateTime(OffsetDateTime creationDateTime) {
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


  public Algorithm lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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
    Algorithm algorithm = (Algorithm) o;
    return Objects.equals(this.name, algorithm.name) &&
        Objects.equals(this.algorithmArn, algorithm.algorithmArn) &&
        Objects.equals(this.algorithmImage, algorithm.algorithmImage) &&
        Objects.equals(this.defaultHyperParameters, algorithm.defaultHyperParameters) &&
        Objects.equals(this.defaultHyperParameterRanges, algorithm.defaultHyperParameterRanges) &&
        Objects.equals(this.defaultResourceConfig, algorithm.defaultResourceConfig) &&
        Objects.equals(this.trainingInputMode, algorithm.trainingInputMode) &&
        Objects.equals(this.roleArn, algorithm.roleArn) &&
        Objects.equals(this.creationDateTime, algorithm.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, algorithm.lastUpdatedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, algorithmArn, algorithmImage, defaultHyperParameters, defaultHyperParameterRanges, defaultResourceConfig, trainingInputMode, roleArn, creationDateTime, lastUpdatedDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Algorithm {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    algorithmArn: ").append(toIndentedString(algorithmArn)).append("\n");
    sb.append("    algorithmImage: ").append(toIndentedString(algorithmImage)).append("\n");
    sb.append("    defaultHyperParameters: ").append(toIndentedString(defaultHyperParameters)).append("\n");
    sb.append("    defaultHyperParameterRanges: ").append(toIndentedString(defaultHyperParameterRanges)).append("\n");
    sb.append("    defaultResourceConfig: ").append(toIndentedString(defaultResourceConfig)).append("\n");
    sb.append("    trainingInputMode: ").append(toIndentedString(trainingInputMode)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
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
    openapiFields.add("algorithmArn");
    openapiFields.add("algorithmImage");
    openapiFields.add("defaultHyperParameters");
    openapiFields.add("defaultHyperParameterRanges");
    openapiFields.add("defaultResourceConfig");
    openapiFields.add("trainingInputMode");
    openapiFields.add("roleArn");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Algorithm
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Algorithm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Algorithm is not found in the empty JSON string", Algorithm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Algorithm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Algorithm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `algorithmArn`
      if (jsonObj.get("algorithmArn") != null && !jsonObj.get("algorithmArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("algorithmArn"));
      }
      // validate the optional field `algorithmImage`
      if (jsonObj.get("algorithmImage") != null && !jsonObj.get("algorithmImage").isJsonNull()) {
        AlgorithmAlgorithmImage.validateJsonElement(jsonObj.get("algorithmImage"));
      }
      // validate the optional field `defaultHyperParameters`
      if (jsonObj.get("defaultHyperParameters") != null && !jsonObj.get("defaultHyperParameters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("defaultHyperParameters"));
      }
      // validate the optional field `defaultHyperParameterRanges`
      if (jsonObj.get("defaultHyperParameterRanges") != null && !jsonObj.get("defaultHyperParameterRanges").isJsonNull()) {
        AlgorithmDefaultHyperParameterRanges.validateJsonElement(jsonObj.get("defaultHyperParameterRanges"));
      }
      // validate the optional field `defaultResourceConfig`
      if (jsonObj.get("defaultResourceConfig") != null && !jsonObj.get("defaultResourceConfig").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("defaultResourceConfig"));
      }
      // validate the optional field `trainingInputMode`
      if (jsonObj.get("trainingInputMode") != null && !jsonObj.get("trainingInputMode").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("trainingInputMode"));
      }
      // validate the optional field `roleArn`
      if (jsonObj.get("roleArn") != null && !jsonObj.get("roleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("roleArn"));
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
       if (!Algorithm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Algorithm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Algorithm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Algorithm.class));

       return (TypeAdapter<T>) new TypeAdapter<Algorithm>() {
           @Override
           public void write(JsonWriter out, Algorithm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Algorithm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Algorithm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Algorithm
   * @throws IOException if the JSON string is invalid with respect to Algorithm
   */
  public static Algorithm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Algorithm.class);
  }

  /**
   * Convert an instance of Algorithm to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

