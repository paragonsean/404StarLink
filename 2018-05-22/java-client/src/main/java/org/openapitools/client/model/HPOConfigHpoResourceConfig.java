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
 * HPOConfigHpoResourceConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:25.633240-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class HPOConfigHpoResourceConfig {
  public static final String SERIALIZED_NAME_MAX_NUMBER_OF_TRAINING_JOBS = "maxNumberOfTrainingJobs";
  @SerializedName(SERIALIZED_NAME_MAX_NUMBER_OF_TRAINING_JOBS)
  private String maxNumberOfTrainingJobs;

  public static final String SERIALIZED_NAME_MAX_PARALLEL_TRAINING_JOBS = "maxParallelTrainingJobs";
  @SerializedName(SERIALIZED_NAME_MAX_PARALLEL_TRAINING_JOBS)
  private String maxParallelTrainingJobs;

  public HPOConfigHpoResourceConfig() {
  }

  public HPOConfigHpoResourceConfig maxNumberOfTrainingJobs(String maxNumberOfTrainingJobs) {
    this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
    return this;
  }

  /**
   * Get maxNumberOfTrainingJobs
   * @return maxNumberOfTrainingJobs
   */
  @javax.annotation.Nullable
  public String getMaxNumberOfTrainingJobs() {
    return maxNumberOfTrainingJobs;
  }

  public void setMaxNumberOfTrainingJobs(String maxNumberOfTrainingJobs) {
    this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
  }


  public HPOConfigHpoResourceConfig maxParallelTrainingJobs(String maxParallelTrainingJobs) {
    this.maxParallelTrainingJobs = maxParallelTrainingJobs;
    return this;
  }

  /**
   * Get maxParallelTrainingJobs
   * @return maxParallelTrainingJobs
   */
  @javax.annotation.Nullable
  public String getMaxParallelTrainingJobs() {
    return maxParallelTrainingJobs;
  }

  public void setMaxParallelTrainingJobs(String maxParallelTrainingJobs) {
    this.maxParallelTrainingJobs = maxParallelTrainingJobs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPOConfigHpoResourceConfig hpOConfigHpoResourceConfig = (HPOConfigHpoResourceConfig) o;
    return Objects.equals(this.maxNumberOfTrainingJobs, hpOConfigHpoResourceConfig.maxNumberOfTrainingJobs) &&
        Objects.equals(this.maxParallelTrainingJobs, hpOConfigHpoResourceConfig.maxParallelTrainingJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumberOfTrainingJobs, maxParallelTrainingJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPOConfigHpoResourceConfig {\n");
    sb.append("    maxNumberOfTrainingJobs: ").append(toIndentedString(maxNumberOfTrainingJobs)).append("\n");
    sb.append("    maxParallelTrainingJobs: ").append(toIndentedString(maxParallelTrainingJobs)).append("\n");
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
    openapiFields.add("maxNumberOfTrainingJobs");
    openapiFields.add("maxParallelTrainingJobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HPOConfigHpoResourceConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HPOConfigHpoResourceConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HPOConfigHpoResourceConfig is not found in the empty JSON string", HPOConfigHpoResourceConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HPOConfigHpoResourceConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HPOConfigHpoResourceConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `maxNumberOfTrainingJobs`
      if (jsonObj.get("maxNumberOfTrainingJobs") != null && !jsonObj.get("maxNumberOfTrainingJobs").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("maxNumberOfTrainingJobs"));
      }
      // validate the optional field `maxParallelTrainingJobs`
      if (jsonObj.get("maxParallelTrainingJobs") != null && !jsonObj.get("maxParallelTrainingJobs").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("maxParallelTrainingJobs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HPOConfigHpoResourceConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HPOConfigHpoResourceConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HPOConfigHpoResourceConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HPOConfigHpoResourceConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<HPOConfigHpoResourceConfig>() {
           @Override
           public void write(JsonWriter out, HPOConfigHpoResourceConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HPOConfigHpoResourceConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HPOConfigHpoResourceConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HPOConfigHpoResourceConfig
   * @throws IOException if the JSON string is invalid with respect to HPOConfigHpoResourceConfig
   */
  public static HPOConfigHpoResourceConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HPOConfigHpoResourceConfig.class);
  }

  /**
   * Convert an instance of HPOConfigHpoResourceConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

