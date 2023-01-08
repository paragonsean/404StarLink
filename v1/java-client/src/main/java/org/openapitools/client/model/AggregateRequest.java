/*
 * Fitness API
 * The Fitness API for managing users' fitness tracking data.
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
import org.openapitools.client.model.AggregateBy;
import org.openapitools.client.model.BucketByActivity;
import org.openapitools.client.model.BucketBySession;
import org.openapitools.client.model.BucketByTime;

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
 * Next id: 10
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:03.273138-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AggregateRequest {
  public static final String SERIALIZED_NAME_AGGREGATE_BY = "aggregateBy";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_BY)
  private List<AggregateBy> aggregateBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUCKET_BY_ACTIVITY_SEGMENT = "bucketByActivitySegment";
  @SerializedName(SERIALIZED_NAME_BUCKET_BY_ACTIVITY_SEGMENT)
  private BucketByActivity bucketByActivitySegment;

  public static final String SERIALIZED_NAME_BUCKET_BY_ACTIVITY_TYPE = "bucketByActivityType";
  @SerializedName(SERIALIZED_NAME_BUCKET_BY_ACTIVITY_TYPE)
  private BucketByActivity bucketByActivityType;

  public static final String SERIALIZED_NAME_BUCKET_BY_SESSION = "bucketBySession";
  @SerializedName(SERIALIZED_NAME_BUCKET_BY_SESSION)
  private BucketBySession bucketBySession;

  public static final String SERIALIZED_NAME_BUCKET_BY_TIME = "bucketByTime";
  @SerializedName(SERIALIZED_NAME_BUCKET_BY_TIME)
  private BucketByTime bucketByTime;

  public static final String SERIALIZED_NAME_END_TIME_MILLIS = "endTimeMillis";
  @SerializedName(SERIALIZED_NAME_END_TIME_MILLIS)
  private String endTimeMillis;

  /**
   * Gets or Sets filteredDataQualityStandard
   */
  @JsonAdapter(FilteredDataQualityStandardEnum.Adapter.class)
  public enum FilteredDataQualityStandardEnum {
    DATA_QUALITY_UNKNOWN("dataQualityUnknown"),
    
    DATA_QUALITY_BLOOD_PRESSURE_ESH2002("dataQualityBloodPressureEsh2002"),
    
    DATA_QUALITY_BLOOD_PRESSURE_ESH2010("dataQualityBloodPressureEsh2010"),
    
    DATA_QUALITY_BLOOD_PRESSURE_AAMI("dataQualityBloodPressureAami"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_AA("dataQualityBloodPressureBhsAA"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_AB("dataQualityBloodPressureBhsAB"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_BA("dataQualityBloodPressureBhsBA"),
    
    DATA_QUALITY_BLOOD_PRESSURE_BHS_BB("dataQualityBloodPressureBhsBB"),
    
    DATA_QUALITY_BLOOD_GLUCOSE_ISO151972003("dataQualityBloodGlucoseIso151972003"),
    
    DATA_QUALITY_BLOOD_GLUCOSE_ISO151972013("dataQualityBloodGlucoseIso151972013");

    private String value;

    FilteredDataQualityStandardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilteredDataQualityStandardEnum fromValue(String value) {
      for (FilteredDataQualityStandardEnum b : FilteredDataQualityStandardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilteredDataQualityStandardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilteredDataQualityStandardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilteredDataQualityStandardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilteredDataQualityStandardEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FilteredDataQualityStandardEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FILTERED_DATA_QUALITY_STANDARD = "filteredDataQualityStandard";
  @SerializedName(SERIALIZED_NAME_FILTERED_DATA_QUALITY_STANDARD)
  private List<FilteredDataQualityStandardEnum> filteredDataQualityStandard = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_TIME_MILLIS = "startTimeMillis";
  @SerializedName(SERIALIZED_NAME_START_TIME_MILLIS)
  private String startTimeMillis;

  public AggregateRequest() {
  }

  public AggregateRequest aggregateBy(List<AggregateBy> aggregateBy) {
    this.aggregateBy = aggregateBy;
    return this;
  }

  public AggregateRequest addAggregateByItem(AggregateBy aggregateByItem) {
    if (this.aggregateBy == null) {
      this.aggregateBy = new ArrayList<>();
    }
    this.aggregateBy.add(aggregateByItem);
    return this;
  }

  /**
   * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the same bucketing criteria. There will be one dataset in the response for every aggregateBy spec.
   * @return aggregateBy
   */
  @javax.annotation.Nullable
  public List<AggregateBy> getAggregateBy() {
    return aggregateBy;
  }

  public void setAggregateBy(List<AggregateBy> aggregateBy) {
    this.aggregateBy = aggregateBy;
  }


  public AggregateRequest bucketByActivitySegment(BucketByActivity bucketByActivitySegment) {
    this.bucketByActivitySegment = bucketByActivitySegment;
    return this;
  }

  /**
   * Get bucketByActivitySegment
   * @return bucketByActivitySegment
   */
  @javax.annotation.Nullable
  public BucketByActivity getBucketByActivitySegment() {
    return bucketByActivitySegment;
  }

  public void setBucketByActivitySegment(BucketByActivity bucketByActivitySegment) {
    this.bucketByActivitySegment = bucketByActivitySegment;
  }


  public AggregateRequest bucketByActivityType(BucketByActivity bucketByActivityType) {
    this.bucketByActivityType = bucketByActivityType;
    return this;
  }

  /**
   * Get bucketByActivityType
   * @return bucketByActivityType
   */
  @javax.annotation.Nullable
  public BucketByActivity getBucketByActivityType() {
    return bucketByActivityType;
  }

  public void setBucketByActivityType(BucketByActivity bucketByActivityType) {
    this.bucketByActivityType = bucketByActivityType;
  }


  public AggregateRequest bucketBySession(BucketBySession bucketBySession) {
    this.bucketBySession = bucketBySession;
    return this;
  }

  /**
   * Get bucketBySession
   * @return bucketBySession
   */
  @javax.annotation.Nullable
  public BucketBySession getBucketBySession() {
    return bucketBySession;
  }

  public void setBucketBySession(BucketBySession bucketBySession) {
    this.bucketBySession = bucketBySession;
  }


  public AggregateRequest bucketByTime(BucketByTime bucketByTime) {
    this.bucketByTime = bucketByTime;
    return this;
  }

  /**
   * Get bucketByTime
   * @return bucketByTime
   */
  @javax.annotation.Nullable
  public BucketByTime getBucketByTime() {
    return bucketByTime;
  }

  public void setBucketByTime(BucketByTime bucketByTime) {
    this.bucketByTime = bucketByTime;
  }


  public AggregateRequest endTimeMillis(String endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
    return this;
  }

  /**
   * The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. The maximum allowed difference between start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
   * @return endTimeMillis
   */
  @javax.annotation.Nullable
  public String getEndTimeMillis() {
    return endTimeMillis;
  }

  public void setEndTimeMillis(String endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
  }


  public AggregateRequest filteredDataQualityStandard(List<FilteredDataQualityStandardEnum> filteredDataQualityStandard) {
    this.filteredDataQualityStandard = filteredDataQualityStandard;
    return this;
  }

  public AggregateRequest addFilteredDataQualityStandardItem(FilteredDataQualityStandardEnum filteredDataQualityStandardItem) {
    if (this.filteredDataQualityStandard == null) {
      this.filteredDataQualityStandard = new ArrayList<>();
    }
    this.filteredDataQualityStandard.add(filteredDataQualityStandardItem);
    return this;
  }

  /**
   * DO NOT POPULATE THIS FIELD. It is ignored.
   * @return filteredDataQualityStandard
   */
  @javax.annotation.Nullable
  public List<FilteredDataQualityStandardEnum> getFilteredDataQualityStandard() {
    return filteredDataQualityStandard;
  }

  public void setFilteredDataQualityStandard(List<FilteredDataQualityStandardEnum> filteredDataQualityStandard) {
    this.filteredDataQualityStandard = filteredDataQualityStandard;
  }


  public AggregateRequest startTimeMillis(String startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  /**
   * The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive.
   * @return startTimeMillis
   */
  @javax.annotation.Nullable
  public String getStartTimeMillis() {
    return startTimeMillis;
  }

  public void setStartTimeMillis(String startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateRequest aggregateRequest = (AggregateRequest) o;
    return Objects.equals(this.aggregateBy, aggregateRequest.aggregateBy) &&
        Objects.equals(this.bucketByActivitySegment, aggregateRequest.bucketByActivitySegment) &&
        Objects.equals(this.bucketByActivityType, aggregateRequest.bucketByActivityType) &&
        Objects.equals(this.bucketBySession, aggregateRequest.bucketBySession) &&
        Objects.equals(this.bucketByTime, aggregateRequest.bucketByTime) &&
        Objects.equals(this.endTimeMillis, aggregateRequest.endTimeMillis) &&
        Objects.equals(this.filteredDataQualityStandard, aggregateRequest.filteredDataQualityStandard) &&
        Objects.equals(this.startTimeMillis, aggregateRequest.startTimeMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateBy, bucketByActivitySegment, bucketByActivityType, bucketBySession, bucketByTime, endTimeMillis, filteredDataQualityStandard, startTimeMillis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateRequest {\n");
    sb.append("    aggregateBy: ").append(toIndentedString(aggregateBy)).append("\n");
    sb.append("    bucketByActivitySegment: ").append(toIndentedString(bucketByActivitySegment)).append("\n");
    sb.append("    bucketByActivityType: ").append(toIndentedString(bucketByActivityType)).append("\n");
    sb.append("    bucketBySession: ").append(toIndentedString(bucketBySession)).append("\n");
    sb.append("    bucketByTime: ").append(toIndentedString(bucketByTime)).append("\n");
    sb.append("    endTimeMillis: ").append(toIndentedString(endTimeMillis)).append("\n");
    sb.append("    filteredDataQualityStandard: ").append(toIndentedString(filteredDataQualityStandard)).append("\n");
    sb.append("    startTimeMillis: ").append(toIndentedString(startTimeMillis)).append("\n");
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
    openapiFields.add("aggregateBy");
    openapiFields.add("bucketByActivitySegment");
    openapiFields.add("bucketByActivityType");
    openapiFields.add("bucketBySession");
    openapiFields.add("bucketByTime");
    openapiFields.add("endTimeMillis");
    openapiFields.add("filteredDataQualityStandard");
    openapiFields.add("startTimeMillis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregateRequest is not found in the empty JSON string", AggregateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("aggregateBy") != null && !jsonObj.get("aggregateBy").isJsonNull()) {
        JsonArray jsonArrayaggregateBy = jsonObj.getAsJsonArray("aggregateBy");
        if (jsonArrayaggregateBy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aggregateBy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aggregateBy` to be an array in the JSON string but got `%s`", jsonObj.get("aggregateBy").toString()));
          }

          // validate the optional field `aggregateBy` (array)
          for (int i = 0; i < jsonArrayaggregateBy.size(); i++) {
            AggregateBy.validateJsonElement(jsonArrayaggregateBy.get(i));
          };
        }
      }
      // validate the optional field `bucketByActivitySegment`
      if (jsonObj.get("bucketByActivitySegment") != null && !jsonObj.get("bucketByActivitySegment").isJsonNull()) {
        BucketByActivity.validateJsonElement(jsonObj.get("bucketByActivitySegment"));
      }
      // validate the optional field `bucketByActivityType`
      if (jsonObj.get("bucketByActivityType") != null && !jsonObj.get("bucketByActivityType").isJsonNull()) {
        BucketByActivity.validateJsonElement(jsonObj.get("bucketByActivityType"));
      }
      // validate the optional field `bucketBySession`
      if (jsonObj.get("bucketBySession") != null && !jsonObj.get("bucketBySession").isJsonNull()) {
        BucketBySession.validateJsonElement(jsonObj.get("bucketBySession"));
      }
      // validate the optional field `bucketByTime`
      if (jsonObj.get("bucketByTime") != null && !jsonObj.get("bucketByTime").isJsonNull()) {
        BucketByTime.validateJsonElement(jsonObj.get("bucketByTime"));
      }
      if ((jsonObj.get("endTimeMillis") != null && !jsonObj.get("endTimeMillis").isJsonNull()) && !jsonObj.get("endTimeMillis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTimeMillis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTimeMillis").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filteredDataQualityStandard") != null && !jsonObj.get("filteredDataQualityStandard").isJsonNull() && !jsonObj.get("filteredDataQualityStandard").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filteredDataQualityStandard` to be an array in the JSON string but got `%s`", jsonObj.get("filteredDataQualityStandard").toString()));
      }
      if ((jsonObj.get("startTimeMillis") != null && !jsonObj.get("startTimeMillis").isJsonNull()) && !jsonObj.get("startTimeMillis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTimeMillis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTimeMillis").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregateRequest>() {
           @Override
           public void write(JsonWriter out, AggregateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregateRequest
   * @throws IOException if the JSON string is invalid with respect to AggregateRequest
   */
  public static AggregateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregateRequest.class);
  }

  /**
   * Convert an instance of AggregateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

