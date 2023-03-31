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
import org.openapitools.client.model.ColumnSettings;
import org.openapitools.client.model.TableDataSet;

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
 * A table that displays time series data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:15.949518-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TimeSeriesTable {
  public static final String SERIALIZED_NAME_COLUMN_SETTINGS = "columnSettings";
  @SerializedName(SERIALIZED_NAME_COLUMN_SETTINGS)
  private List<ColumnSettings> columnSettings = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_SETS = "dataSets";
  @SerializedName(SERIALIZED_NAME_DATA_SETS)
  private List<TableDataSet> dataSets = new ArrayList<>();

  /**
   * Optional. Store rendering strategy
   */
  @JsonAdapter(MetricVisualizationEnum.Adapter.class)
  public enum MetricVisualizationEnum {
    METRIC_VISUALIZATION_UNSPECIFIED("METRIC_VISUALIZATION_UNSPECIFIED"),
    
    NUMBER("NUMBER"),
    
    BAR("BAR");

    private String value;

    MetricVisualizationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetricVisualizationEnum fromValue(String value) {
      for (MetricVisualizationEnum b : MetricVisualizationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetricVisualizationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetricVisualizationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetricVisualizationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetricVisualizationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MetricVisualizationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_METRIC_VISUALIZATION = "metricVisualization";
  @SerializedName(SERIALIZED_NAME_METRIC_VISUALIZATION)
  private MetricVisualizationEnum metricVisualization;

  public TimeSeriesTable() {
  }

  public TimeSeriesTable columnSettings(List<ColumnSettings> columnSettings) {
    this.columnSettings = columnSettings;
    return this;
  }

  public TimeSeriesTable addColumnSettingsItem(ColumnSettings columnSettingsItem) {
    if (this.columnSettings == null) {
      this.columnSettings = new ArrayList<>();
    }
    this.columnSettings.add(columnSettingsItem);
    return this;
  }

  /**
   * Optional. The list of the persistent column settings for the table.
   * @return columnSettings
   */
  @javax.annotation.Nullable
  public List<ColumnSettings> getColumnSettings() {
    return columnSettings;
  }

  public void setColumnSettings(List<ColumnSettings> columnSettings) {
    this.columnSettings = columnSettings;
  }


  public TimeSeriesTable dataSets(List<TableDataSet> dataSets) {
    this.dataSets = dataSets;
    return this;
  }

  public TimeSeriesTable addDataSetsItem(TableDataSet dataSetsItem) {
    if (this.dataSets == null) {
      this.dataSets = new ArrayList<>();
    }
    this.dataSets.add(dataSetsItem);
    return this;
  }

  /**
   * Required. The data displayed in this table.
   * @return dataSets
   */
  @javax.annotation.Nullable
  public List<TableDataSet> getDataSets() {
    return dataSets;
  }

  public void setDataSets(List<TableDataSet> dataSets) {
    this.dataSets = dataSets;
  }


  public TimeSeriesTable metricVisualization(MetricVisualizationEnum metricVisualization) {
    this.metricVisualization = metricVisualization;
    return this;
  }

  /**
   * Optional. Store rendering strategy
   * @return metricVisualization
   */
  @javax.annotation.Nullable
  public MetricVisualizationEnum getMetricVisualization() {
    return metricVisualization;
  }

  public void setMetricVisualization(MetricVisualizationEnum metricVisualization) {
    this.metricVisualization = metricVisualization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesTable timeSeriesTable = (TimeSeriesTable) o;
    return Objects.equals(this.columnSettings, timeSeriesTable.columnSettings) &&
        Objects.equals(this.dataSets, timeSeriesTable.dataSets) &&
        Objects.equals(this.metricVisualization, timeSeriesTable.metricVisualization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnSettings, dataSets, metricVisualization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesTable {\n");
    sb.append("    columnSettings: ").append(toIndentedString(columnSettings)).append("\n");
    sb.append("    dataSets: ").append(toIndentedString(dataSets)).append("\n");
    sb.append("    metricVisualization: ").append(toIndentedString(metricVisualization)).append("\n");
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
    openapiFields.add("columnSettings");
    openapiFields.add("dataSets");
    openapiFields.add("metricVisualization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeSeriesTable
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeSeriesTable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeSeriesTable is not found in the empty JSON string", TimeSeriesTable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeSeriesTable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeSeriesTable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columnSettings") != null && !jsonObj.get("columnSettings").isJsonNull()) {
        JsonArray jsonArraycolumnSettings = jsonObj.getAsJsonArray("columnSettings");
        if (jsonArraycolumnSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columnSettings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columnSettings` to be an array in the JSON string but got `%s`", jsonObj.get("columnSettings").toString()));
          }

          // validate the optional field `columnSettings` (array)
          for (int i = 0; i < jsonArraycolumnSettings.size(); i++) {
            ColumnSettings.validateJsonElement(jsonArraycolumnSettings.get(i));
          };
        }
      }
      if (jsonObj.get("dataSets") != null && !jsonObj.get("dataSets").isJsonNull()) {
        JsonArray jsonArraydataSets = jsonObj.getAsJsonArray("dataSets");
        if (jsonArraydataSets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dataSets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dataSets` to be an array in the JSON string but got `%s`", jsonObj.get("dataSets").toString()));
          }

          // validate the optional field `dataSets` (array)
          for (int i = 0; i < jsonArraydataSets.size(); i++) {
            TableDataSet.validateJsonElement(jsonArraydataSets.get(i));
          };
        }
      }
      if ((jsonObj.get("metricVisualization") != null && !jsonObj.get("metricVisualization").isJsonNull()) && !jsonObj.get("metricVisualization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricVisualization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricVisualization").toString()));
      }
      // validate the optional field `metricVisualization`
      if (jsonObj.get("metricVisualization") != null && !jsonObj.get("metricVisualization").isJsonNull()) {
        MetricVisualizationEnum.validateJsonElement(jsonObj.get("metricVisualization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeSeriesTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeSeriesTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeSeriesTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeSeriesTable.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeSeriesTable>() {
           @Override
           public void write(JsonWriter out, TimeSeriesTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeSeriesTable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeSeriesTable given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeSeriesTable
   * @throws IOException if the JSON string is invalid with respect to TimeSeriesTable
   */
  public static TimeSeriesTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeSeriesTable.class);
  }

  /**
   * Convert an instance of TimeSeriesTable to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

