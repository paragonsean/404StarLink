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
 * A sparkChart is a small chart suitable for inclusion in a table-cell or inline in text. This message contains the configuration for a sparkChart to show up on a Scorecard, showing recent trends of the scorecard&#39;s timeseries.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:15.949518-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SparkChartView {
  public static final String SERIALIZED_NAME_MIN_ALIGNMENT_PERIOD = "minAlignmentPeriod";
  @SerializedName(SERIALIZED_NAME_MIN_ALIGNMENT_PERIOD)
  private String minAlignmentPeriod;

  /**
   * Required. The type of sparkchart to show in this chartView.
   */
  @JsonAdapter(SparkChartTypeEnum.Adapter.class)
  public enum SparkChartTypeEnum {
    CHART_TYPE_UNSPECIFIED("SPARK_CHART_TYPE_UNSPECIFIED"),
    
    LINE("SPARK_LINE"),
    
    BAR("SPARK_BAR");

    private String value;

    SparkChartTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SparkChartTypeEnum fromValue(String value) {
      for (SparkChartTypeEnum b : SparkChartTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SparkChartTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SparkChartTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SparkChartTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SparkChartTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SparkChartTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SPARK_CHART_TYPE = "sparkChartType";
  @SerializedName(SERIALIZED_NAME_SPARK_CHART_TYPE)
  private SparkChartTypeEnum sparkChartType;

  public SparkChartView() {
  }

  public SparkChartView minAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
    return this;
  }

  /**
   * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
   * @return minAlignmentPeriod
   */
  @javax.annotation.Nullable
  public String getMinAlignmentPeriod() {
    return minAlignmentPeriod;
  }

  public void setMinAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
  }


  public SparkChartView sparkChartType(SparkChartTypeEnum sparkChartType) {
    this.sparkChartType = sparkChartType;
    return this;
  }

  /**
   * Required. The type of sparkchart to show in this chartView.
   * @return sparkChartType
   */
  @javax.annotation.Nullable
  public SparkChartTypeEnum getSparkChartType() {
    return sparkChartType;
  }

  public void setSparkChartType(SparkChartTypeEnum sparkChartType) {
    this.sparkChartType = sparkChartType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkChartView sparkChartView = (SparkChartView) o;
    return Objects.equals(this.minAlignmentPeriod, sparkChartView.minAlignmentPeriod) &&
        Objects.equals(this.sparkChartType, sparkChartView.sparkChartType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAlignmentPeriod, sparkChartType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkChartView {\n");
    sb.append("    minAlignmentPeriod: ").append(toIndentedString(minAlignmentPeriod)).append("\n");
    sb.append("    sparkChartType: ").append(toIndentedString(sparkChartType)).append("\n");
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
    openapiFields.add("minAlignmentPeriod");
    openapiFields.add("sparkChartType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SparkChartView
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SparkChartView.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SparkChartView is not found in the empty JSON string", SparkChartView.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SparkChartView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SparkChartView` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("minAlignmentPeriod") != null && !jsonObj.get("minAlignmentPeriod").isJsonNull()) && !jsonObj.get("minAlignmentPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minAlignmentPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minAlignmentPeriod").toString()));
      }
      if ((jsonObj.get("sparkChartType") != null && !jsonObj.get("sparkChartType").isJsonNull()) && !jsonObj.get("sparkChartType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sparkChartType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sparkChartType").toString()));
      }
      // validate the optional field `sparkChartType`
      if (jsonObj.get("sparkChartType") != null && !jsonObj.get("sparkChartType").isJsonNull()) {
        SparkChartTypeEnum.validateJsonElement(jsonObj.get("sparkChartType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SparkChartView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SparkChartView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SparkChartView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SparkChartView.class));

       return (TypeAdapter<T>) new TypeAdapter<SparkChartView>() {
           @Override
           public void write(JsonWriter out, SparkChartView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SparkChartView read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SparkChartView given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SparkChartView
   * @throws IOException if the JSON string is invalid with respect to SparkChartView
   */
  public static SparkChartView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SparkChartView.class);
  }

  /**
   * Convert an instance of SparkChartView to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

