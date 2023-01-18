/*
 * Amazon Lightsail
 * <p>Amazon Lightsail is the easiest way to get started with Amazon Web Services (Amazon Web Services) for developers who need to build websites or web applications. It includes everything you need to launch your project quickly - instances (virtual private servers), container services, storage buckets, managed databases, SSD-based block storage, static IP addresses, load balancers, content delivery network (CDN) distributions, DNS management of registered domains, and resource snapshots (backups) - for a low, predictable monthly price.</p> <p>You can manage your Lightsail resources using the Lightsail console, Lightsail API, Command Line Interface (CLI), or SDKs. For more information about Lightsail concepts and tasks, see the <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli\">Amazon Lightsail Developer Guide</a>.</p> <p>This API Reference provides detailed information about the actions, data types, parameters, and errors of the Lightsail service. For more information about the supported Amazon Web Services Regions, endpoints, and service quotas of the Lightsail service, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/lightsail.html\">Amazon Lightsail Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>.</p>
 *
 * The version of the OpenAPI document: 2016-11-28
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
import java.util.List;
import org.openapitools.client.model.DistributionMetricName;
import org.openapitools.client.model.MetricUnit;

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
 * GetDistributionMetricDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:29.318232-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GetDistributionMetricDataRequest {
  public static final String SERIALIZED_NAME_DISTRIBUTION_NAME = "distributionName";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_NAME)
  private String distributionName;

  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private DistributionMetricName metricName;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private MetricUnit unit;

  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private List statistics;

  public GetDistributionMetricDataRequest() {
  }

  public GetDistributionMetricDataRequest distributionName(String distributionName) {
    this.distributionName = distributionName;
    return this;
  }

  /**
   * Get distributionName
   * @return distributionName
   */
  @javax.annotation.Nonnull
  public String getDistributionName() {
    return distributionName;
  }

  public void setDistributionName(String distributionName) {
    this.distributionName = distributionName;
  }


  public GetDistributionMetricDataRequest metricName(DistributionMetricName metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Get metricName
   * @return metricName
   */
  @javax.annotation.Nonnull
  public DistributionMetricName getMetricName() {
    return metricName;
  }

  public void setMetricName(DistributionMetricName metricName) {
    this.metricName = metricName;
  }


  public GetDistributionMetricDataRequest startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public GetDistributionMetricDataRequest endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public GetDistributionMetricDataRequest period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @javax.annotation.Nonnull
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }


  public GetDistributionMetricDataRequest unit(MetricUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nonnull
  public MetricUnit getUnit() {
    return unit;
  }

  public void setUnit(MetricUnit unit) {
    this.unit = unit;
  }


  public GetDistributionMetricDataRequest statistics(List statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * @return statistics
   */
  @javax.annotation.Nonnull
  public List getStatistics() {
    return statistics;
  }

  public void setStatistics(List statistics) {
    this.statistics = statistics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDistributionMetricDataRequest getDistributionMetricDataRequest = (GetDistributionMetricDataRequest) o;
    return Objects.equals(this.distributionName, getDistributionMetricDataRequest.distributionName) &&
        Objects.equals(this.metricName, getDistributionMetricDataRequest.metricName) &&
        Objects.equals(this.startTime, getDistributionMetricDataRequest.startTime) &&
        Objects.equals(this.endTime, getDistributionMetricDataRequest.endTime) &&
        Objects.equals(this.period, getDistributionMetricDataRequest.period) &&
        Objects.equals(this.unit, getDistributionMetricDataRequest.unit) &&
        Objects.equals(this.statistics, getDistributionMetricDataRequest.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionName, metricName, startTime, endTime, period, unit, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDistributionMetricDataRequest {\n");
    sb.append("    distributionName: ").append(toIndentedString(distributionName)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
    openapiFields.add("distributionName");
    openapiFields.add("metricName");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("period");
    openapiFields.add("unit");
    openapiFields.add("statistics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("distributionName");
    openapiRequiredFields.add("metricName");
    openapiRequiredFields.add("startTime");
    openapiRequiredFields.add("endTime");
    openapiRequiredFields.add("period");
    openapiRequiredFields.add("unit");
    openapiRequiredFields.add("statistics");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDistributionMetricDataRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDistributionMetricDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDistributionMetricDataRequest is not found in the empty JSON string", GetDistributionMetricDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDistributionMetricDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDistributionMetricDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDistributionMetricDataRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `distributionName`
      String.validateJsonElement(jsonObj.get("distributionName"));
      // validate the required field `metricName`
      DistributionMetricName.validateJsonElement(jsonObj.get("metricName"));
      // validate the required field `startTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("startTime"));
      // validate the required field `endTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("endTime"));
      // validate the required field `period`
      Integer.validateJsonElement(jsonObj.get("period"));
      // validate the required field `unit`
      MetricUnit.validateJsonElement(jsonObj.get("unit"));
      // validate the required field `statistics`
      List.validateJsonElement(jsonObj.get("statistics"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDistributionMetricDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDistributionMetricDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDistributionMetricDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDistributionMetricDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDistributionMetricDataRequest>() {
           @Override
           public void write(JsonWriter out, GetDistributionMetricDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDistributionMetricDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDistributionMetricDataRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDistributionMetricDataRequest
   * @throws IOException if the JSON string is invalid with respect to GetDistributionMetricDataRequest
   */
  public static GetDistributionMetricDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDistributionMetricDataRequest.class);
  }

  /**
   * Convert an instance of GetDistributionMetricDataRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

