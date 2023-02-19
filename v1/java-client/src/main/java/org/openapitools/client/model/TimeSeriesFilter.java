/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v1
 * 
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
import org.openapitools.client.model.Aggregation;
import org.openapitools.client.model.PickTimeSeriesFilter;
import org.openapitools.client.model.StatisticalTimeSeriesFilter;

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
 * A filter that defines a subset of time series data that is displayed in a widget. Time series data is fetched using the ListTimeSeries (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:16.300251-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TimeSeriesFilter {
  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private Aggregation aggregation;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_PICK_TIME_SERIES_FILTER = "pickTimeSeriesFilter";
  @SerializedName(SERIALIZED_NAME_PICK_TIME_SERIES_FILTER)
  private PickTimeSeriesFilter pickTimeSeriesFilter;

  public static final String SERIALIZED_NAME_SECONDARY_AGGREGATION = "secondaryAggregation";
  @SerializedName(SERIALIZED_NAME_SECONDARY_AGGREGATION)
  private Aggregation secondaryAggregation;

  public static final String SERIALIZED_NAME_STATISTICAL_TIME_SERIES_FILTER = "statisticalTimeSeriesFilter";
  @SerializedName(SERIALIZED_NAME_STATISTICAL_TIME_SERIES_FILTER)
  private StatisticalTimeSeriesFilter statisticalTimeSeriesFilter;

  public TimeSeriesFilter() {
  }

  public TimeSeriesFilter aggregation(Aggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Get aggregation
   * @return aggregation
   */
  @javax.annotation.Nullable
  public Aggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(Aggregation aggregation) {
    this.aggregation = aggregation;
  }


  public TimeSeriesFilter filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Required. The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
   * @return filter
   */
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public TimeSeriesFilter pickTimeSeriesFilter(PickTimeSeriesFilter pickTimeSeriesFilter) {
    this.pickTimeSeriesFilter = pickTimeSeriesFilter;
    return this;
  }

  /**
   * Get pickTimeSeriesFilter
   * @return pickTimeSeriesFilter
   */
  @javax.annotation.Nullable
  public PickTimeSeriesFilter getPickTimeSeriesFilter() {
    return pickTimeSeriesFilter;
  }

  public void setPickTimeSeriesFilter(PickTimeSeriesFilter pickTimeSeriesFilter) {
    this.pickTimeSeriesFilter = pickTimeSeriesFilter;
  }


  public TimeSeriesFilter secondaryAggregation(Aggregation secondaryAggregation) {
    this.secondaryAggregation = secondaryAggregation;
    return this;
  }

  /**
   * Get secondaryAggregation
   * @return secondaryAggregation
   */
  @javax.annotation.Nullable
  public Aggregation getSecondaryAggregation() {
    return secondaryAggregation;
  }

  public void setSecondaryAggregation(Aggregation secondaryAggregation) {
    this.secondaryAggregation = secondaryAggregation;
  }


  public TimeSeriesFilter statisticalTimeSeriesFilter(StatisticalTimeSeriesFilter statisticalTimeSeriesFilter) {
    this.statisticalTimeSeriesFilter = statisticalTimeSeriesFilter;
    return this;
  }

  /**
   * Get statisticalTimeSeriesFilter
   * @return statisticalTimeSeriesFilter
   */
  @javax.annotation.Nullable
  public StatisticalTimeSeriesFilter getStatisticalTimeSeriesFilter() {
    return statisticalTimeSeriesFilter;
  }

  public void setStatisticalTimeSeriesFilter(StatisticalTimeSeriesFilter statisticalTimeSeriesFilter) {
    this.statisticalTimeSeriesFilter = statisticalTimeSeriesFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesFilter timeSeriesFilter = (TimeSeriesFilter) o;
    return Objects.equals(this.aggregation, timeSeriesFilter.aggregation) &&
        Objects.equals(this.filter, timeSeriesFilter.filter) &&
        Objects.equals(this.pickTimeSeriesFilter, timeSeriesFilter.pickTimeSeriesFilter) &&
        Objects.equals(this.secondaryAggregation, timeSeriesFilter.secondaryAggregation) &&
        Objects.equals(this.statisticalTimeSeriesFilter, timeSeriesFilter.statisticalTimeSeriesFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, filter, pickTimeSeriesFilter, secondaryAggregation, statisticalTimeSeriesFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesFilter {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pickTimeSeriesFilter: ").append(toIndentedString(pickTimeSeriesFilter)).append("\n");
    sb.append("    secondaryAggregation: ").append(toIndentedString(secondaryAggregation)).append("\n");
    sb.append("    statisticalTimeSeriesFilter: ").append(toIndentedString(statisticalTimeSeriesFilter)).append("\n");
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
    openapiFields.add("aggregation");
    openapiFields.add("filter");
    openapiFields.add("pickTimeSeriesFilter");
    openapiFields.add("secondaryAggregation");
    openapiFields.add("statisticalTimeSeriesFilter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeSeriesFilter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeSeriesFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeSeriesFilter is not found in the empty JSON string", TimeSeriesFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeSeriesFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeSeriesFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `aggregation`
      if (jsonObj.get("aggregation") != null && !jsonObj.get("aggregation").isJsonNull()) {
        Aggregation.validateJsonElement(jsonObj.get("aggregation"));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the optional field `pickTimeSeriesFilter`
      if (jsonObj.get("pickTimeSeriesFilter") != null && !jsonObj.get("pickTimeSeriesFilter").isJsonNull()) {
        PickTimeSeriesFilter.validateJsonElement(jsonObj.get("pickTimeSeriesFilter"));
      }
      // validate the optional field `secondaryAggregation`
      if (jsonObj.get("secondaryAggregation") != null && !jsonObj.get("secondaryAggregation").isJsonNull()) {
        Aggregation.validateJsonElement(jsonObj.get("secondaryAggregation"));
      }
      // validate the optional field `statisticalTimeSeriesFilter`
      if (jsonObj.get("statisticalTimeSeriesFilter") != null && !jsonObj.get("statisticalTimeSeriesFilter").isJsonNull()) {
        StatisticalTimeSeriesFilter.validateJsonElement(jsonObj.get("statisticalTimeSeriesFilter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeSeriesFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeSeriesFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeSeriesFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeSeriesFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeSeriesFilter>() {
           @Override
           public void write(JsonWriter out, TimeSeriesFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeSeriesFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeSeriesFilter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeSeriesFilter
   * @throws IOException if the JSON string is invalid with respect to TimeSeriesFilter
   */
  public static TimeSeriesFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeSeriesFilter.class);
  }

  /**
   * Convert an instance of TimeSeriesFilter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

