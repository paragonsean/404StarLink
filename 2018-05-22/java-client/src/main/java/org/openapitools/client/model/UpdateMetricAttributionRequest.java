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
import org.openapitools.client.model.UpdateMetricAttributionRequestMetricsOutputConfig;

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
 * UpdateMetricAttributionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:49.326201-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpdateMetricAttributionRequest {
  public static final String SERIALIZED_NAME_ADD_METRICS = "addMetrics";
  @SerializedName(SERIALIZED_NAME_ADD_METRICS)
  private List addMetrics;

  public static final String SERIALIZED_NAME_REMOVE_METRICS = "removeMetrics";
  @SerializedName(SERIALIZED_NAME_REMOVE_METRICS)
  private List removeMetrics;

  public static final String SERIALIZED_NAME_METRICS_OUTPUT_CONFIG = "metricsOutputConfig";
  @SerializedName(SERIALIZED_NAME_METRICS_OUTPUT_CONFIG)
  private UpdateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig;

  public static final String SERIALIZED_NAME_METRIC_ATTRIBUTION_ARN = "metricAttributionArn";
  @SerializedName(SERIALIZED_NAME_METRIC_ATTRIBUTION_ARN)
  private String metricAttributionArn;

  public UpdateMetricAttributionRequest() {
  }

  public UpdateMetricAttributionRequest addMetrics(List addMetrics) {
    this.addMetrics = addMetrics;
    return this;
  }

  /**
   * Get addMetrics
   * @return addMetrics
   */
  @javax.annotation.Nullable
  public List getAddMetrics() {
    return addMetrics;
  }

  public void setAddMetrics(List addMetrics) {
    this.addMetrics = addMetrics;
  }


  public UpdateMetricAttributionRequest removeMetrics(List removeMetrics) {
    this.removeMetrics = removeMetrics;
    return this;
  }

  /**
   * Get removeMetrics
   * @return removeMetrics
   */
  @javax.annotation.Nullable
  public List getRemoveMetrics() {
    return removeMetrics;
  }

  public void setRemoveMetrics(List removeMetrics) {
    this.removeMetrics = removeMetrics;
  }


  public UpdateMetricAttributionRequest metricsOutputConfig(UpdateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
    return this;
  }

  /**
   * Get metricsOutputConfig
   * @return metricsOutputConfig
   */
  @javax.annotation.Nullable
  public UpdateMetricAttributionRequestMetricsOutputConfig getMetricsOutputConfig() {
    return metricsOutputConfig;
  }

  public void setMetricsOutputConfig(UpdateMetricAttributionRequestMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
  }


  public UpdateMetricAttributionRequest metricAttributionArn(String metricAttributionArn) {
    this.metricAttributionArn = metricAttributionArn;
    return this;
  }

  /**
   * Get metricAttributionArn
   * @return metricAttributionArn
   */
  @javax.annotation.Nullable
  public String getMetricAttributionArn() {
    return metricAttributionArn;
  }

  public void setMetricAttributionArn(String metricAttributionArn) {
    this.metricAttributionArn = metricAttributionArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMetricAttributionRequest updateMetricAttributionRequest = (UpdateMetricAttributionRequest) o;
    return Objects.equals(this.addMetrics, updateMetricAttributionRequest.addMetrics) &&
        Objects.equals(this.removeMetrics, updateMetricAttributionRequest.removeMetrics) &&
        Objects.equals(this.metricsOutputConfig, updateMetricAttributionRequest.metricsOutputConfig) &&
        Objects.equals(this.metricAttributionArn, updateMetricAttributionRequest.metricAttributionArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addMetrics, removeMetrics, metricsOutputConfig, metricAttributionArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMetricAttributionRequest {\n");
    sb.append("    addMetrics: ").append(toIndentedString(addMetrics)).append("\n");
    sb.append("    removeMetrics: ").append(toIndentedString(removeMetrics)).append("\n");
    sb.append("    metricsOutputConfig: ").append(toIndentedString(metricsOutputConfig)).append("\n");
    sb.append("    metricAttributionArn: ").append(toIndentedString(metricAttributionArn)).append("\n");
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
    openapiFields.add("addMetrics");
    openapiFields.add("removeMetrics");
    openapiFields.add("metricsOutputConfig");
    openapiFields.add("metricAttributionArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateMetricAttributionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateMetricAttributionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMetricAttributionRequest is not found in the empty JSON string", UpdateMetricAttributionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateMetricAttributionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMetricAttributionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `addMetrics`
      if (jsonObj.get("addMetrics") != null && !jsonObj.get("addMetrics").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("addMetrics"));
      }
      // validate the optional field `removeMetrics`
      if (jsonObj.get("removeMetrics") != null && !jsonObj.get("removeMetrics").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("removeMetrics"));
      }
      // validate the optional field `metricsOutputConfig`
      if (jsonObj.get("metricsOutputConfig") != null && !jsonObj.get("metricsOutputConfig").isJsonNull()) {
        UpdateMetricAttributionRequestMetricsOutputConfig.validateJsonElement(jsonObj.get("metricsOutputConfig"));
      }
      // validate the optional field `metricAttributionArn`
      if (jsonObj.get("metricAttributionArn") != null && !jsonObj.get("metricAttributionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("metricAttributionArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMetricAttributionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMetricAttributionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMetricAttributionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMetricAttributionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMetricAttributionRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMetricAttributionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMetricAttributionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateMetricAttributionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMetricAttributionRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateMetricAttributionRequest
   */
  public static UpdateMetricAttributionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMetricAttributionRequest.class);
  }

  /**
   * Convert an instance of UpdateMetricAttributionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

