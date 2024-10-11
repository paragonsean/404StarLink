/*
 * Superset
 * Superset
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
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ChartDataResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ChartDataResponseResult {
  public static final String SERIALIZED_NAME_ANNOTATION_DATA = "annotation_data";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_DATA)
  private List<Map<String, String>> annotationData;

  public static final String SERIALIZED_NAME_APPLIED_FILTERS = "applied_filters";
  @SerializedName(SERIALIZED_NAME_APPLIED_FILTERS)
  private List<Object> appliedFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_CACHE_KEY = "cache_key";
  @SerializedName(SERIALIZED_NAME_CACHE_KEY)
  private String cacheKey;

  public static final String SERIALIZED_NAME_CACHE_TIMEOUT = "cache_timeout";
  @SerializedName(SERIALIZED_NAME_CACHE_TIMEOUT)
  private Integer cacheTimeout;

  public static final String SERIALIZED_NAME_CACHED_DTTM = "cached_dttm";
  @SerializedName(SERIALIZED_NAME_CACHED_DTTM)
  private String cachedDttm;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Object> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_IS_CACHED = "is_cached";
  @SerializedName(SERIALIZED_NAME_IS_CACHED)
  private Boolean isCached;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_REJECTED_FILTERS = "rejected_filters";
  @SerializedName(SERIALIZED_NAME_REJECTED_FILTERS)
  private List<Object> rejectedFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROWCOUNT = "rowcount";
  @SerializedName(SERIALIZED_NAME_ROWCOUNT)
  private Integer rowcount;

  public static final String SERIALIZED_NAME_STACKTRACE = "stacktrace";
  @SerializedName(SERIALIZED_NAME_STACKTRACE)
  private String stacktrace;

  /**
   * Status of the query
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STOPPED("stopped"),
    
    FAILED("failed"),
    
    PENDING("pending"),
    
    RUNNING("running"),
    
    SCHEDULED("scheduled"),
    
    SUCCESS("success"),
    
    TIMED_OUT("timed_out");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public ChartDataResponseResult() {
  }

  public ChartDataResponseResult annotationData(List<Map<String, String>> annotationData) {
    this.annotationData = annotationData;
    return this;
  }

  public ChartDataResponseResult addAnnotationDataItem(Map<String, String> annotationDataItem) {
    if (this.annotationData == null) {
      this.annotationData = new ArrayList<>();
    }
    this.annotationData.add(annotationDataItem);
    return this;
  }

  /**
   * All requested annotation data
   * @return annotationData
   */
  @javax.annotation.Nullable
  public List<Map<String, String>> getAnnotationData() {
    return annotationData;
  }

  public void setAnnotationData(List<Map<String, String>> annotationData) {
    this.annotationData = annotationData;
  }


  public ChartDataResponseResult appliedFilters(List<Object> appliedFilters) {
    this.appliedFilters = appliedFilters;
    return this;
  }

  public ChartDataResponseResult addAppliedFiltersItem(Object appliedFiltersItem) {
    if (this.appliedFilters == null) {
      this.appliedFilters = new ArrayList<>();
    }
    this.appliedFilters.add(appliedFiltersItem);
    return this;
  }

  /**
   * A list with applied filters
   * @return appliedFilters
   */
  @javax.annotation.Nullable
  public List<Object> getAppliedFilters() {
    return appliedFilters;
  }

  public void setAppliedFilters(List<Object> appliedFilters) {
    this.appliedFilters = appliedFilters;
  }


  public ChartDataResponseResult cacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
    return this;
  }

  /**
   * Unique cache key for query object
   * @return cacheKey
   */
  @javax.annotation.Nullable
  public String getCacheKey() {
    return cacheKey;
  }

  public void setCacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
  }


  public ChartDataResponseResult cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

  /**
   * Cache timeout in following order: custom timeout, datasource timeout, default config timeout.
   * @return cacheTimeout
   */
  @javax.annotation.Nullable
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }


  public ChartDataResponseResult cachedDttm(String cachedDttm) {
    this.cachedDttm = cachedDttm;
    return this;
  }

  /**
   * Cache timestamp
   * @return cachedDttm
   */
  @javax.annotation.Nullable
  public String getCachedDttm() {
    return cachedDttm;
  }

  public void setCachedDttm(String cachedDttm) {
    this.cachedDttm = cachedDttm;
  }


  public ChartDataResponseResult data(List<Object> data) {
    this.data = data;
    return this;
  }

  public ChartDataResponseResult addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * A list with results
   * @return data
   */
  @javax.annotation.Nullable
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }


  public ChartDataResponseResult error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error
   * @return error
   */
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public ChartDataResponseResult isCached(Boolean isCached) {
    this.isCached = isCached;
    return this;
  }

  /**
   * Is the result cached
   * @return isCached
   */
  @javax.annotation.Nonnull
  public Boolean getIsCached() {
    return isCached;
  }

  public void setIsCached(Boolean isCached) {
    this.isCached = isCached;
  }


  public ChartDataResponseResult query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The executed query statement
   * @return query
   */
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public ChartDataResponseResult rejectedFilters(List<Object> rejectedFilters) {
    this.rejectedFilters = rejectedFilters;
    return this;
  }

  public ChartDataResponseResult addRejectedFiltersItem(Object rejectedFiltersItem) {
    if (this.rejectedFilters == null) {
      this.rejectedFilters = new ArrayList<>();
    }
    this.rejectedFilters.add(rejectedFiltersItem);
    return this;
  }

  /**
   * A list with rejected filters
   * @return rejectedFilters
   */
  @javax.annotation.Nullable
  public List<Object> getRejectedFilters() {
    return rejectedFilters;
  }

  public void setRejectedFilters(List<Object> rejectedFilters) {
    this.rejectedFilters = rejectedFilters;
  }


  public ChartDataResponseResult rowcount(Integer rowcount) {
    this.rowcount = rowcount;
    return this;
  }

  /**
   * Amount of rows in result set
   * @return rowcount
   */
  @javax.annotation.Nullable
  public Integer getRowcount() {
    return rowcount;
  }

  public void setRowcount(Integer rowcount) {
    this.rowcount = rowcount;
  }


  public ChartDataResponseResult stacktrace(String stacktrace) {
    this.stacktrace = stacktrace;
    return this;
  }

  /**
   * Get stacktrace
   * @return stacktrace
   */
  @javax.annotation.Nullable
  public String getStacktrace() {
    return stacktrace;
  }

  public void setStacktrace(String stacktrace) {
    this.stacktrace = stacktrace;
  }


  public ChartDataResponseResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the query
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataResponseResult chartDataResponseResult = (ChartDataResponseResult) o;
    return Objects.equals(this.annotationData, chartDataResponseResult.annotationData) &&
        Objects.equals(this.appliedFilters, chartDataResponseResult.appliedFilters) &&
        Objects.equals(this.cacheKey, chartDataResponseResult.cacheKey) &&
        Objects.equals(this.cacheTimeout, chartDataResponseResult.cacheTimeout) &&
        Objects.equals(this.cachedDttm, chartDataResponseResult.cachedDttm) &&
        Objects.equals(this.data, chartDataResponseResult.data) &&
        Objects.equals(this.error, chartDataResponseResult.error) &&
        Objects.equals(this.isCached, chartDataResponseResult.isCached) &&
        Objects.equals(this.query, chartDataResponseResult.query) &&
        Objects.equals(this.rejectedFilters, chartDataResponseResult.rejectedFilters) &&
        Objects.equals(this.rowcount, chartDataResponseResult.rowcount) &&
        Objects.equals(this.stacktrace, chartDataResponseResult.stacktrace) &&
        Objects.equals(this.status, chartDataResponseResult.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationData, appliedFilters, cacheKey, cacheTimeout, cachedDttm, data, error, isCached, query, rejectedFilters, rowcount, stacktrace, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataResponseResult {\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    appliedFilters: ").append(toIndentedString(appliedFilters)).append("\n");
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    cachedDttm: ").append(toIndentedString(cachedDttm)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    isCached: ").append(toIndentedString(isCached)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rejectedFilters: ").append(toIndentedString(rejectedFilters)).append("\n");
    sb.append("    rowcount: ").append(toIndentedString(rowcount)).append("\n");
    sb.append("    stacktrace: ").append(toIndentedString(stacktrace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("annotation_data");
    openapiFields.add("applied_filters");
    openapiFields.add("cache_key");
    openapiFields.add("cache_timeout");
    openapiFields.add("cached_dttm");
    openapiFields.add("data");
    openapiFields.add("error");
    openapiFields.add("is_cached");
    openapiFields.add("query");
    openapiFields.add("rejected_filters");
    openapiFields.add("rowcount");
    openapiFields.add("stacktrace");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cache_key");
    openapiRequiredFields.add("cache_timeout");
    openapiRequiredFields.add("cached_dttm");
    openapiRequiredFields.add("is_cached");
    openapiRequiredFields.add("query");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChartDataResponseResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChartDataResponseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChartDataResponseResult is not found in the empty JSON string", ChartDataResponseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChartDataResponseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChartDataResponseResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChartDataResponseResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("annotation_data") != null && !jsonObj.get("annotation_data").isJsonNull() && !jsonObj.get("annotation_data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotation_data` to be an array in the JSON string but got `%s`", jsonObj.get("annotation_data").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applied_filters") != null && !jsonObj.get("applied_filters").isJsonNull() && !jsonObj.get("applied_filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applied_filters` to be an array in the JSON string but got `%s`", jsonObj.get("applied_filters").toString()));
      }
      if ((jsonObj.get("cache_key") != null && !jsonObj.get("cache_key").isJsonNull()) && !jsonObj.get("cache_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_key").toString()));
      }
      if ((jsonObj.get("cached_dttm") != null && !jsonObj.get("cached_dttm").isJsonNull()) && !jsonObj.get("cached_dttm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cached_dttm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cached_dttm").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull() && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rejected_filters") != null && !jsonObj.get("rejected_filters").isJsonNull() && !jsonObj.get("rejected_filters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejected_filters` to be an array in the JSON string but got `%s`", jsonObj.get("rejected_filters").toString()));
      }
      if ((jsonObj.get("stacktrace") != null && !jsonObj.get("stacktrace").isJsonNull()) && !jsonObj.get("stacktrace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stacktrace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stacktrace").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChartDataResponseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChartDataResponseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChartDataResponseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChartDataResponseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ChartDataResponseResult>() {
           @Override
           public void write(JsonWriter out, ChartDataResponseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChartDataResponseResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChartDataResponseResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChartDataResponseResult
   * @throws IOException if the JSON string is invalid with respect to ChartDataResponseResult
   */
  public static ChartDataResponseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChartDataResponseResult.class);
  }

  /**
   * Convert an instance of ChartDataResponseResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

