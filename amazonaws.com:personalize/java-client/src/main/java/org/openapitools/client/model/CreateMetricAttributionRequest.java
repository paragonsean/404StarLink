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
import org.openapitools.client.model.CreateMetricAttributionRequestMetricsOutputConfig;

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
 * CreateMetricAttributionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateMetricAttributionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List metrics;

  public static final String SERIALIZED_NAME_METRICS_OUTPUT_CONFIG = "metricsOutputConfig";
  @SerializedName(SERIALIZED_NAME_METRICS_OUTPUT_CONFIG)
  private CreateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig;

  public CreateMetricAttributionRequest() {
  }

  public CreateMetricAttributionRequest name(String name) {
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


  public CreateMetricAttributionRequest datasetGroupArn(String datasetGroupArn) {
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


  public CreateMetricAttributionRequest metrics(List metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Get metrics
   * @return metrics
   */
  @javax.annotation.Nonnull
  public List getMetrics() {
    return metrics;
  }

  public void setMetrics(List metrics) {
    this.metrics = metrics;
  }


  public CreateMetricAttributionRequest metricsOutputConfig(CreateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
    return this;
  }

  /**
   * Get metricsOutputConfig
   * @return metricsOutputConfig
   */
  @javax.annotation.Nonnull
  public CreateMetricAttributionRequestMetricsOutputConfig getMetricsOutputConfig() {
    return metricsOutputConfig;
  }

  public void setMetricsOutputConfig(CreateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetricAttributionRequest createMetricAttributionRequest = (CreateMetricAttributionRequest) o;
    return Objects.equals(this.name, createMetricAttributionRequest.name) &&
        Objects.equals(this.datasetGroupArn, createMetricAttributionRequest.datasetGroupArn) &&
        Objects.equals(this.metrics, createMetricAttributionRequest.metrics) &&
        Objects.equals(this.metricsOutputConfig, createMetricAttributionRequest.metricsOutputConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, datasetGroupArn, metrics, metricsOutputConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMetricAttributionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    metricsOutputConfig: ").append(toIndentedString(metricsOutputConfig)).append("\n");
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
    openapiFields.add("metrics");
    openapiFields.add("metricsOutputConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("datasetGroupArn");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("metricsOutputConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateMetricAttributionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateMetricAttributionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMetricAttributionRequest is not found in the empty JSON string", CreateMetricAttributionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateMetricAttributionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMetricAttributionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMetricAttributionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      String.validateJsonElement(jsonObj.get("name"));
      // validate the required field `datasetGroupArn`
      String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      // validate the required field `metrics`
      List.validateJsonElement(jsonObj.get("metrics"));
      // validate the required field `metricsOutputConfig`
      CreateMetricAttributionRequestMetricsOutputConfig.validateJsonElement(jsonObj.get("metricsOutputConfig"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMetricAttributionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMetricAttributionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMetricAttributionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMetricAttributionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMetricAttributionRequest>() {
           @Override
           public void write(JsonWriter out, CreateMetricAttributionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMetricAttributionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateMetricAttributionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateMetricAttributionRequest
   * @throws IOException if the JSON string is invalid with respect to CreateMetricAttributionRequest
   */
  public static CreateMetricAttributionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMetricAttributionRequest.class);
  }

  /**
   * Convert an instance of CreateMetricAttributionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

