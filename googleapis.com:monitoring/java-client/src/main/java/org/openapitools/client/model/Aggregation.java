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
 * Describes how to combine multiple time series to provide a different view of the data. Aggregation of time series is done in two steps. First, each time series in the set is aligned to the same time interval boundaries, then the set of time series is optionally reduced in number.Alignment consists of applying the per_series_aligner operation to each time series after its data has been divided into regular alignment_period time intervals. This process takes all of the data points in an alignment period, applies a mathematical transformation such as averaging, minimum, maximum, delta, etc., and converts them into a single data point per period.Reduction is when the aligned and transformed time series can optionally be combined, reducing the number of time series through similar mathematical transformations. Reduction involves applying a cross_series_reducer to all the time series, optionally sorting the time series into subsets with group_by_fields, and applying the reducer to each subset.The raw time series data can contain a huge amount of information from multiple sources. Alignment and reduction transforms this mass of data into a more manageable and representative collection of data, for example \&quot;the 95% latency across the average of all tasks in a cluster\&quot;. This representative data can be more easily graphed and comprehended, and the individual time series data is still available for later drilldown. For more details, see Filtering and aggregation (https://cloud.google.com/monitoring/api/v3/aggregation).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:15.949518-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Aggregation {
  public static final String SERIALIZED_NAME_ALIGNMENT_PERIOD = "alignmentPeriod";
  @SerializedName(SERIALIZED_NAME_ALIGNMENT_PERIOD)
  private String alignmentPeriod;

  /**
   * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
   */
  @JsonAdapter(CrossSeriesReducerEnum.Adapter.class)
  public enum CrossSeriesReducerEnum {
    NONE("REDUCE_NONE"),
    
    MEAN("REDUCE_MEAN"),
    
    MIN("REDUCE_MIN"),
    
    MAX("REDUCE_MAX"),
    
    SUM("REDUCE_SUM"),
    
    STDDEV("REDUCE_STDDEV"),
    
    COUNT("REDUCE_COUNT"),
    
    COUNT_TRUE("REDUCE_COUNT_TRUE"),
    
    COUNT_FALSE("REDUCE_COUNT_FALSE"),
    
    FRACTION_TRUE("REDUCE_FRACTION_TRUE"),
    
    PERCENTILE_99("REDUCE_PERCENTILE_99"),
    
    PERCENTILE_95("REDUCE_PERCENTILE_95"),
    
    PERCENTILE_50("REDUCE_PERCENTILE_50"),
    
    PERCENTILE_05("REDUCE_PERCENTILE_05");

    private String value;

    CrossSeriesReducerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CrossSeriesReducerEnum fromValue(String value) {
      for (CrossSeriesReducerEnum b : CrossSeriesReducerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CrossSeriesReducerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CrossSeriesReducerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CrossSeriesReducerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CrossSeriesReducerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CrossSeriesReducerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CROSS_SERIES_REDUCER = "crossSeriesReducer";
  @SerializedName(SERIALIZED_NAME_CROSS_SERIES_REDUCER)
  private CrossSeriesReducerEnum crossSeriesReducer;

  public static final String SERIALIZED_NAME_GROUP_BY_FIELDS = "groupByFields";
  @SerializedName(SERIALIZED_NAME_GROUP_BY_FIELDS)
  private List<String> groupByFields = new ArrayList<>();

  /**
   * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
   */
  @JsonAdapter(PerSeriesAlignerEnum.Adapter.class)
  public enum PerSeriesAlignerEnum {
    NONE("ALIGN_NONE"),
    
    DELTA("ALIGN_DELTA"),
    
    RATE("ALIGN_RATE"),
    
    INTERPOLATE("ALIGN_INTERPOLATE"),
    
    NEXT_OLDER("ALIGN_NEXT_OLDER"),
    
    MIN("ALIGN_MIN"),
    
    MAX("ALIGN_MAX"),
    
    MEAN("ALIGN_MEAN"),
    
    COUNT("ALIGN_COUNT"),
    
    SUM("ALIGN_SUM"),
    
    STDDEV("ALIGN_STDDEV"),
    
    COUNT_TRUE("ALIGN_COUNT_TRUE"),
    
    COUNT_FALSE("ALIGN_COUNT_FALSE"),
    
    FRACTION_TRUE("ALIGN_FRACTION_TRUE"),
    
    PERCENTILE_99("ALIGN_PERCENTILE_99"),
    
    PERCENTILE_95("ALIGN_PERCENTILE_95"),
    
    PERCENTILE_50("ALIGN_PERCENTILE_50"),
    
    PERCENTILE_05("ALIGN_PERCENTILE_05"),
    
    PERCENT_CHANGE("ALIGN_PERCENT_CHANGE");

    private String value;

    PerSeriesAlignerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PerSeriesAlignerEnum fromValue(String value) {
      for (PerSeriesAlignerEnum b : PerSeriesAlignerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PerSeriesAlignerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PerSeriesAlignerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PerSeriesAlignerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PerSeriesAlignerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PerSeriesAlignerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PER_SERIES_ALIGNER = "perSeriesAligner";
  @SerializedName(SERIALIZED_NAME_PER_SERIES_ALIGNER)
  private PerSeriesAlignerEnum perSeriesAligner;

  public Aggregation() {
  }

  public Aggregation alignmentPeriod(String alignmentPeriod) {
    this.alignmentPeriod = alignmentPeriod;
    return this;
  }

  /**
   * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 2 years, or 104 weeks.
   * @return alignmentPeriod
   */
  @javax.annotation.Nullable
  public String getAlignmentPeriod() {
    return alignmentPeriod;
  }

  public void setAlignmentPeriod(String alignmentPeriod) {
    this.alignmentPeriod = alignmentPeriod;
  }


  public Aggregation crossSeriesReducer(CrossSeriesReducerEnum crossSeriesReducer) {
    this.crossSeriesReducer = crossSeriesReducer;
    return this;
  }

  /**
   * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
   * @return crossSeriesReducer
   */
  @javax.annotation.Nullable
  public CrossSeriesReducerEnum getCrossSeriesReducer() {
    return crossSeriesReducer;
  }

  public void setCrossSeriesReducer(CrossSeriesReducerEnum crossSeriesReducer) {
    this.crossSeriesReducer = crossSeriesReducer;
  }


  public Aggregation groupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  public Aggregation addGroupByFieldsItem(String groupByFieldsItem) {
    if (this.groupByFields == null) {
      this.groupByFields = new ArrayList<>();
    }
    this.groupByFields.add(groupByFieldsItem);
    return this;
  }

  /**
   * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
   * @return groupByFields
   */
  @javax.annotation.Nullable
  public List<String> getGroupByFields() {
    return groupByFields;
  }

  public void setGroupByFields(List<String> groupByFields) {
    this.groupByFields = groupByFields;
  }


  public Aggregation perSeriesAligner(PerSeriesAlignerEnum perSeriesAligner) {
    this.perSeriesAligner = perSeriesAligner;
    return this;
  }

  /**
   * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
   * @return perSeriesAligner
   */
  @javax.annotation.Nullable
  public PerSeriesAlignerEnum getPerSeriesAligner() {
    return perSeriesAligner;
  }

  public void setPerSeriesAligner(PerSeriesAlignerEnum perSeriesAligner) {
    this.perSeriesAligner = perSeriesAligner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aggregation aggregation = (Aggregation) o;
    return Objects.equals(this.alignmentPeriod, aggregation.alignmentPeriod) &&
        Objects.equals(this.crossSeriesReducer, aggregation.crossSeriesReducer) &&
        Objects.equals(this.groupByFields, aggregation.groupByFields) &&
        Objects.equals(this.perSeriesAligner, aggregation.perSeriesAligner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignmentPeriod, crossSeriesReducer, groupByFields, perSeriesAligner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregation {\n");
    sb.append("    alignmentPeriod: ").append(toIndentedString(alignmentPeriod)).append("\n");
    sb.append("    crossSeriesReducer: ").append(toIndentedString(crossSeriesReducer)).append("\n");
    sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
    sb.append("    perSeriesAligner: ").append(toIndentedString(perSeriesAligner)).append("\n");
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
    openapiFields.add("alignmentPeriod");
    openapiFields.add("crossSeriesReducer");
    openapiFields.add("groupByFields");
    openapiFields.add("perSeriesAligner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Aggregation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Aggregation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Aggregation is not found in the empty JSON string", Aggregation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Aggregation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Aggregation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alignmentPeriod") != null && !jsonObj.get("alignmentPeriod").isJsonNull()) && !jsonObj.get("alignmentPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alignmentPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alignmentPeriod").toString()));
      }
      if ((jsonObj.get("crossSeriesReducer") != null && !jsonObj.get("crossSeriesReducer").isJsonNull()) && !jsonObj.get("crossSeriesReducer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossSeriesReducer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossSeriesReducer").toString()));
      }
      // validate the optional field `crossSeriesReducer`
      if (jsonObj.get("crossSeriesReducer") != null && !jsonObj.get("crossSeriesReducer").isJsonNull()) {
        CrossSeriesReducerEnum.validateJsonElement(jsonObj.get("crossSeriesReducer"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupByFields") != null && !jsonObj.get("groupByFields").isJsonNull() && !jsonObj.get("groupByFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupByFields` to be an array in the JSON string but got `%s`", jsonObj.get("groupByFields").toString()));
      }
      if ((jsonObj.get("perSeriesAligner") != null && !jsonObj.get("perSeriesAligner").isJsonNull()) && !jsonObj.get("perSeriesAligner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `perSeriesAligner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("perSeriesAligner").toString()));
      }
      // validate the optional field `perSeriesAligner`
      if (jsonObj.get("perSeriesAligner") != null && !jsonObj.get("perSeriesAligner").isJsonNull()) {
        PerSeriesAlignerEnum.validateJsonElement(jsonObj.get("perSeriesAligner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Aggregation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Aggregation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Aggregation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Aggregation.class));

       return (TypeAdapter<T>) new TypeAdapter<Aggregation>() {
           @Override
           public void write(JsonWriter out, Aggregation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Aggregation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Aggregation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Aggregation
   * @throws IOException if the JSON string is invalid with respect to Aggregation
   */
  public static Aggregation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Aggregation.class);
  }

  /**
   * Convert an instance of Aggregation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

