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
 * Describes the metric data point.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:45.376997-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class MetricDatapoint {
  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Double average;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Double maximum;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Double minimum;

  public static final String SERIALIZED_NAME_SAMPLE_COUNT = "sampleCount";
  @SerializedName(SERIALIZED_NAME_SAMPLE_COUNT)
  private Double sampleCount;

  public static final String SERIALIZED_NAME_SUM = "sum";
  @SerializedName(SERIALIZED_NAME_SUM)
  private Double sum;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private MetricUnit unit;

  public MetricDatapoint() {
  }

  public MetricDatapoint average(Double average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
   */
  @javax.annotation.Nullable
  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }


  public MetricDatapoint maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
   */
  @javax.annotation.Nullable
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  public MetricDatapoint minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
   */
  @javax.annotation.Nullable
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  public MetricDatapoint sampleCount(Double sampleCount) {
    this.sampleCount = sampleCount;
    return this;
  }

  /**
   * Get sampleCount
   * @return sampleCount
   */
  @javax.annotation.Nullable
  public Double getSampleCount() {
    return sampleCount;
  }

  public void setSampleCount(Double sampleCount) {
    this.sampleCount = sampleCount;
  }


  public MetricDatapoint sum(Double sum) {
    this.sum = sum;
    return this;
  }

  /**
   * Get sum
   * @return sum
   */
  @javax.annotation.Nullable
  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }


  public MetricDatapoint timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public MetricDatapoint unit(MetricUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public MetricUnit getUnit() {
    return unit;
  }

  public void setUnit(MetricUnit unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDatapoint metricDatapoint = (MetricDatapoint) o;
    return Objects.equals(this.average, metricDatapoint.average) &&
        Objects.equals(this.maximum, metricDatapoint.maximum) &&
        Objects.equals(this.minimum, metricDatapoint.minimum) &&
        Objects.equals(this.sampleCount, metricDatapoint.sampleCount) &&
        Objects.equals(this.sum, metricDatapoint.sum) &&
        Objects.equals(this.timestamp, metricDatapoint.timestamp) &&
        Objects.equals(this.unit, metricDatapoint.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, maximum, minimum, sampleCount, sum, timestamp, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDatapoint {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    sampleCount: ").append(toIndentedString(sampleCount)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("average");
    openapiFields.add("maximum");
    openapiFields.add("minimum");
    openapiFields.add("sampleCount");
    openapiFields.add("sum");
    openapiFields.add("timestamp");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MetricDatapoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MetricDatapoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricDatapoint is not found in the empty JSON string", MetricDatapoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MetricDatapoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetricDatapoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `average`
      if (jsonObj.get("average") != null && !jsonObj.get("average").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("average"));
      }
      // validate the optional field `maximum`
      if (jsonObj.get("maximum") != null && !jsonObj.get("maximum").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("maximum"));
      }
      // validate the optional field `minimum`
      if (jsonObj.get("minimum") != null && !jsonObj.get("minimum").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("minimum"));
      }
      // validate the optional field `sampleCount`
      if (jsonObj.get("sampleCount") != null && !jsonObj.get("sampleCount").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("sampleCount"));
      }
      // validate the optional field `sum`
      if (jsonObj.get("sum") != null && !jsonObj.get("sum").isJsonNull()) {
        Double.validateJsonElement(jsonObj.get("sum"));
      }
      // validate the optional field `timestamp`
      if (jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("timestamp"));
      }
      // validate the optional field `unit`
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) {
        MetricUnit.validateJsonElement(jsonObj.get("unit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricDatapoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricDatapoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricDatapoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricDatapoint.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricDatapoint>() {
           @Override
           public void write(JsonWriter out, MetricDatapoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetricDatapoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MetricDatapoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MetricDatapoint
   * @throws IOException if the JSON string is invalid with respect to MetricDatapoint
   */
  public static MetricDatapoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricDatapoint.class);
  }

  /**
   * Convert an instance of MetricDatapoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

