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
import org.openapitools.client.model.MetricAttributionMetricsOutputConfig;

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
 * Contains information on a metric attribution. A metric attribution creates reports on the data that you import into Amazon Personalize. Depending on how you import the data, you can view reports in Amazon CloudWatch or Amazon S3. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html\&quot;&gt;Measuring impact of recommendations&lt;/a&gt;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:35.017884-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MetricAttribution {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METRIC_ATTRIBUTION_ARN = "metricAttributionArn";
  @SerializedName(SERIALIZED_NAME_METRIC_ATTRIBUTION_ARN)
  private String metricAttributionArn;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_METRICS_OUTPUT_CONFIG = "metricsOutputConfig";
  @SerializedName(SERIALIZED_NAME_METRICS_OUTPUT_CONFIG)
  private MetricAttributionMetricsOutputConfig metricsOutputConfig;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public MetricAttribution() {
  }

  public MetricAttribution name(String name) {
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


  public MetricAttribution metricAttributionArn(String metricAttributionArn) {
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


  public MetricAttribution datasetGroupArn(String datasetGroupArn) {
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


  public MetricAttribution metricsOutputConfig(MetricAttributionMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
    return this;
  }

  /**
   * Get metricsOutputConfig
   * @return metricsOutputConfig
   */
  @javax.annotation.Nullable
  public MetricAttributionMetricsOutputConfig getMetricsOutputConfig() {
    return metricsOutputConfig;
  }

  public void setMetricsOutputConfig(MetricAttributionMetricsOutputConfig metricsOutputConfig) {
    this.metricsOutputConfig = metricsOutputConfig;
  }


  public MetricAttribution status(String status) {
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


  public MetricAttribution creationDateTime(OffsetDateTime creationDateTime) {
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


  public MetricAttribution lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
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


  public MetricAttribution failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricAttribution metricAttribution = (MetricAttribution) o;
    return Objects.equals(this.name, metricAttribution.name) &&
        Objects.equals(this.metricAttributionArn, metricAttribution.metricAttributionArn) &&
        Objects.equals(this.datasetGroupArn, metricAttribution.datasetGroupArn) &&
        Objects.equals(this.metricsOutputConfig, metricAttribution.metricsOutputConfig) &&
        Objects.equals(this.status, metricAttribution.status) &&
        Objects.equals(this.creationDateTime, metricAttribution.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, metricAttribution.lastUpdatedDateTime) &&
        Objects.equals(this.failureReason, metricAttribution.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metricAttributionArn, datasetGroupArn, metricsOutputConfig, status, creationDateTime, lastUpdatedDateTime, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricAttribution {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metricAttributionArn: ").append(toIndentedString(metricAttributionArn)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    metricsOutputConfig: ").append(toIndentedString(metricsOutputConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
    openapiFields.add("metricAttributionArn");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("metricsOutputConfig");
    openapiFields.add("status");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("failureReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MetricAttribution
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MetricAttribution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricAttribution is not found in the empty JSON string", MetricAttribution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MetricAttribution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetricAttribution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `metricAttributionArn`
      if (jsonObj.get("metricAttributionArn") != null && !jsonObj.get("metricAttributionArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("metricAttributionArn"));
      }
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `metricsOutputConfig`
      if (jsonObj.get("metricsOutputConfig") != null && !jsonObj.get("metricsOutputConfig").isJsonNull()) {
        MetricAttributionMetricsOutputConfig.validateJsonElement(jsonObj.get("metricsOutputConfig"));
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
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricAttribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricAttribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricAttribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricAttribution.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricAttribution>() {
           @Override
           public void write(JsonWriter out, MetricAttribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetricAttribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MetricAttribution given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MetricAttribution
   * @throws IOException if the JSON string is invalid with respect to MetricAttribution
   */
  public static MetricAttribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricAttribution.class);
  }

  /**
   * Convert an instance of MetricAttribution to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

