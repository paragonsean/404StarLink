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
 * Groups a time series query definition with charting options.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:12.400520-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DataSet {
  public static final String SERIALIZED_NAME_LEGEND_TEMPLATE = "legendTemplate";
  @SerializedName(SERIALIZED_NAME_LEGEND_TEMPLATE)
  private String legendTemplate;

  public static final String SERIALIZED_NAME_MIN_ALIGNMENT_PERIOD = "minAlignmentPeriod";
  @SerializedName(SERIALIZED_NAME_MIN_ALIGNMENT_PERIOD)
  private String minAlignmentPeriod;

  /**
   * How this data should be plotted on the chart.
   */
  @JsonAdapter(PlotTypeEnum.Adapter.class)
  public enum PlotTypeEnum {
    PLOT_TYPE_UNSPECIFIED("PLOT_TYPE_UNSPECIFIED"),
    
    LINE("LINE"),
    
    STACKED_AREA("STACKED_AREA"),
    
    STACKED_BAR("STACKED_BAR"),
    
    HEATMAP("HEATMAP");

    private String value;

    PlotTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlotTypeEnum fromValue(String value) {
      for (PlotTypeEnum b : PlotTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlotTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlotTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlotTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlotTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlotTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLOT_TYPE = "plotType";
  @SerializedName(SERIALIZED_NAME_PLOT_TYPE)
  private PlotTypeEnum plotType;

  /**
   * Optional. The target axis to use for plotting the metric.
   */
  @JsonAdapter(TargetAxisEnum.Adapter.class)
  public enum TargetAxisEnum {
    TARGET_AXIS_UNSPECIFIED("TARGET_AXIS_UNSPECIFIED"),
    
    Y1("Y1"),
    
    Y2("Y2");

    private String value;

    TargetAxisEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetAxisEnum fromValue(String value) {
      for (TargetAxisEnum b : TargetAxisEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetAxisEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetAxisEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetAxisEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetAxisEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TargetAxisEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TARGET_AXIS = "targetAxis";
  @SerializedName(SERIALIZED_NAME_TARGET_AXIS)
  private TargetAxisEnum targetAxis;

  public static final String SERIALIZED_NAME_TIME_SERIES_QUERY = "timeSeriesQuery";
  @SerializedName(SERIALIZED_NAME_TIME_SERIES_QUERY)
  private TimeSeriesQuery timeSeriesQuery;

  public DataSet() {
  }

  public DataSet legendTemplate(String legendTemplate) {
    this.legendTemplate = legendTemplate;
    return this;
  }

  /**
   * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label&#39;s value.
   * @return legendTemplate
   */
  @javax.annotation.Nullable
  public String getLegendTemplate() {
    return legendTemplate;
  }

  public void setLegendTemplate(String legendTemplate) {
    this.legendTemplate = legendTemplate;
  }


  public DataSet minAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
    return this;
  }

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
   * @return minAlignmentPeriod
   */
  @javax.annotation.Nullable
  public String getMinAlignmentPeriod() {
    return minAlignmentPeriod;
  }

  public void setMinAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
  }


  public DataSet plotType(PlotTypeEnum plotType) {
    this.plotType = plotType;
    return this;
  }

  /**
   * How this data should be plotted on the chart.
   * @return plotType
   */
  @javax.annotation.Nullable
  public PlotTypeEnum getPlotType() {
    return plotType;
  }

  public void setPlotType(PlotTypeEnum plotType) {
    this.plotType = plotType;
  }


  public DataSet targetAxis(TargetAxisEnum targetAxis) {
    this.targetAxis = targetAxis;
    return this;
  }

  /**
   * Optional. The target axis to use for plotting the metric.
   * @return targetAxis
   */
  @javax.annotation.Nullable
  public TargetAxisEnum getTargetAxis() {
    return targetAxis;
  }

  public void setTargetAxis(TargetAxisEnum targetAxis) {
    this.targetAxis = targetAxis;
  }


  public DataSet timeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
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
    DataSet dataSet = (DataSet) o;
    return Objects.equals(this.legendTemplate, dataSet.legendTemplate) &&
        Objects.equals(this.minAlignmentPeriod, dataSet.minAlignmentPeriod) &&
        Objects.equals(this.plotType, dataSet.plotType) &&
        Objects.equals(this.targetAxis, dataSet.targetAxis) &&
        Objects.equals(this.timeSeriesQuery, dataSet.timeSeriesQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legendTemplate, minAlignmentPeriod, plotType, targetAxis, timeSeriesQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSet {\n");
    sb.append("    legendTemplate: ").append(toIndentedString(legendTemplate)).append("\n");
    sb.append("    minAlignmentPeriod: ").append(toIndentedString(minAlignmentPeriod)).append("\n");
    sb.append("    plotType: ").append(toIndentedString(plotType)).append("\n");
    sb.append("    targetAxis: ").append(toIndentedString(targetAxis)).append("\n");
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
    openapiFields.add("legendTemplate");
    openapiFields.add("minAlignmentPeriod");
    openapiFields.add("plotType");
    openapiFields.add("targetAxis");
    openapiFields.add("timeSeriesQuery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataSet is not found in the empty JSON string", DataSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("legendTemplate") != null && !jsonObj.get("legendTemplate").isJsonNull()) && !jsonObj.get("legendTemplate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legendTemplate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legendTemplate").toString()));
      }
      if ((jsonObj.get("minAlignmentPeriod") != null && !jsonObj.get("minAlignmentPeriod").isJsonNull()) && !jsonObj.get("minAlignmentPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minAlignmentPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minAlignmentPeriod").toString()));
      }
      if ((jsonObj.get("plotType") != null && !jsonObj.get("plotType").isJsonNull()) && !jsonObj.get("plotType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plotType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plotType").toString()));
      }
      // validate the optional field `plotType`
      if (jsonObj.get("plotType") != null && !jsonObj.get("plotType").isJsonNull()) {
        PlotTypeEnum.validateJsonElement(jsonObj.get("plotType"));
      }
      if ((jsonObj.get("targetAxis") != null && !jsonObj.get("targetAxis").isJsonNull()) && !jsonObj.get("targetAxis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAxis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAxis").toString()));
      }
      // validate the optional field `targetAxis`
      if (jsonObj.get("targetAxis") != null && !jsonObj.get("targetAxis").isJsonNull()) {
        TargetAxisEnum.validateJsonElement(jsonObj.get("targetAxis"));
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
       if (!DataSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataSet.class));

       return (TypeAdapter<T>) new TypeAdapter<DataSet>() {
           @Override
           public void write(JsonWriter out, DataSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataSet
   * @throws IOException if the JSON string is invalid with respect to DataSet
   */
  public static DataSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataSet.class);
  }

  /**
   * Convert an instance of DataSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

