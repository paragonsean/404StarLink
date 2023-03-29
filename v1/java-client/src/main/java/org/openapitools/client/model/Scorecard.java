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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GaugeView;
import org.openapitools.client.model.SparkChartView;
import org.openapitools.client.model.Threshold;
import org.openapitools.client.model.TimeSeriesQuery;

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
 * A widget showing the latest value of a metric, and how this value relates to one or more thresholds.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:08.946005-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Scorecard {
  public static final String SERIALIZED_NAME_GAUGE_VIEW = "gaugeView";
  @SerializedName(SERIALIZED_NAME_GAUGE_VIEW)
  private GaugeView gaugeView;

  public static final String SERIALIZED_NAME_SPARK_CHART_VIEW = "sparkChartView";
  @SerializedName(SERIALIZED_NAME_SPARK_CHART_VIEW)
  private SparkChartView sparkChartView;

  public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS)
  private List<Threshold> thresholds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_SERIES_QUERY = "timeSeriesQuery";
  @SerializedName(SERIALIZED_NAME_TIME_SERIES_QUERY)
  private TimeSeriesQuery timeSeriesQuery;

  public Scorecard() {
  }

  public Scorecard gaugeView(GaugeView gaugeView) {
    this.gaugeView = gaugeView;
    return this;
  }

  /**
   * Get gaugeView
   * @return gaugeView
   */
  @javax.annotation.Nullable
  public GaugeView getGaugeView() {
    return gaugeView;
  }

  public void setGaugeView(GaugeView gaugeView) {
    this.gaugeView = gaugeView;
  }


  public Scorecard sparkChartView(SparkChartView sparkChartView) {
    this.sparkChartView = sparkChartView;
    return this;
  }

  /**
   * Get sparkChartView
   * @return sparkChartView
   */
  @javax.annotation.Nullable
  public SparkChartView getSparkChartView() {
    return sparkChartView;
  }

  public void setSparkChartView(SparkChartView sparkChartView) {
    this.sparkChartView = sparkChartView;
  }


  public Scorecard thresholds(List<Threshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public Scorecard addThresholdsItem(Threshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

  /**
   * The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, } Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
   * @return thresholds
   */
  @javax.annotation.Nullable
  public List<Threshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<Threshold> thresholds) {
    this.thresholds = thresholds;
  }


  public Scorecard timeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
    return this;
  }

  /**
   * Get timeSeriesQuery
   * @return timeSeriesQuery
   */
  @javax.annotation.Nullable
  public TimeSeriesQuery getTimeSeriesQuery() {
    return timeSeriesQuery;
  }

  public void setTimeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scorecard scorecard = (Scorecard) o;
    return Objects.equals(this.gaugeView, scorecard.gaugeView) &&
        Objects.equals(this.sparkChartView, scorecard.sparkChartView) &&
        Objects.equals(this.thresholds, scorecard.thresholds) &&
        Objects.equals(this.timeSeriesQuery, scorecard.timeSeriesQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gaugeView, sparkChartView, thresholds, timeSeriesQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scorecard {\n");
    sb.append("    gaugeView: ").append(toIndentedString(gaugeView)).append("\n");
    sb.append("    sparkChartView: ").append(toIndentedString(sparkChartView)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeSeriesQuery: ").append(toIndentedString(timeSeriesQuery)).append("\n");
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
    openapiFields.add("gaugeView");
    openapiFields.add("sparkChartView");
    openapiFields.add("thresholds");
    openapiFields.add("timeSeriesQuery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Scorecard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Scorecard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scorecard is not found in the empty JSON string", Scorecard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Scorecard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scorecard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gaugeView`
      if (jsonObj.get("gaugeView") != null && !jsonObj.get("gaugeView").isJsonNull()) {
        GaugeView.validateJsonElement(jsonObj.get("gaugeView"));
      }
      // validate the optional field `sparkChartView`
      if (jsonObj.get("sparkChartView") != null && !jsonObj.get("sparkChartView").isJsonNull()) {
        SparkChartView.validateJsonElement(jsonObj.get("sparkChartView"));
      }
      if (jsonObj.get("thresholds") != null && !jsonObj.get("thresholds").isJsonNull()) {
        JsonArray jsonArraythresholds = jsonObj.getAsJsonArray("thresholds");
        if (jsonArraythresholds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("thresholds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `thresholds` to be an array in the JSON string but got `%s`", jsonObj.get("thresholds").toString()));
          }

          // validate the optional field `thresholds` (array)
          for (int i = 0; i < jsonArraythresholds.size(); i++) {
            Threshold.validateJsonElement(jsonArraythresholds.get(i));
          };
        }
      }
      // validate the optional field `timeSeriesQuery`
      if (jsonObj.get("timeSeriesQuery") != null && !jsonObj.get("timeSeriesQuery").isJsonNull()) {
        TimeSeriesQuery.validateJsonElement(jsonObj.get("timeSeriesQuery"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Scorecard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scorecard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scorecard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scorecard.class));

       return (TypeAdapter<T>) new TypeAdapter<Scorecard>() {
           @Override
           public void write(JsonWriter out, Scorecard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scorecard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Scorecard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Scorecard
   * @throws IOException if the JSON string is invalid with respect to Scorecard
   */
  public static Scorecard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scorecard.class);
  }

  /**
   * Convert an instance of Scorecard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

