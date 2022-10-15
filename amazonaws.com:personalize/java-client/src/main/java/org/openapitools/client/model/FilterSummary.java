/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
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
 * A short summary of a filter&#39;s attributes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:54:53.624516-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class FilterSummary {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTER_ARN = "filterArn";
  @SerializedName(SERIALIZED_NAME_FILTER_ARN)
  private String filterArn;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "creationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE_TIME = "lastUpdatedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE_TIME)
  private OffsetDateTime lastUpdatedDateTime;

  public static final String SERIALIZED_NAME_DATASET_GROUP_ARN = "datasetGroupArn";
  @SerializedName(SERIALIZED_NAME_DATASET_GROUP_ARN)
  private String datasetGroupArn;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public FilterSummary() {
  }

  public FilterSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FilterSummary filterArn(String filterArn) {
    this.filterArn = filterArn;
    return this;
  }

  /**
   * Get filterArn
   * @return filterArn
   */
  @javax.annotation.Nullable
  public String getFilterArn() {
    return filterArn;
  }

  public void setFilterArn(String filterArn) {
    this.filterArn = filterArn;
  }


  public FilterSummary creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public FilterSummary lastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

  /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }


  public FilterSummary datasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
    return this;
  }

  /**
   * Get datasetGroupArn
   * @return datasetGroupArn
   */
  @javax.annotation.Nullable
  public String getDatasetGroupArn() {
    return datasetGroupArn;
  }

  public void setDatasetGroupArn(String datasetGroupArn) {
    this.datasetGroupArn = datasetGroupArn;
  }


  public FilterSummary failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public FilterSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    FilterSummary filterSummary = (FilterSummary) o;
    return Objects.equals(this.name, filterSummary.name) &&
        Objects.equals(this.filterArn, filterSummary.filterArn) &&
        Objects.equals(this.creationDateTime, filterSummary.creationDateTime) &&
        Objects.equals(this.lastUpdatedDateTime, filterSummary.lastUpdatedDateTime) &&
        Objects.equals(this.datasetGroupArn, filterSummary.datasetGroupArn) &&
        Objects.equals(this.failureReason, filterSummary.failureReason) &&
        Objects.equals(this.status, filterSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, filterArn, creationDateTime, lastUpdatedDateTime, datasetGroupArn, failureReason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterArn: ").append(toIndentedString(filterArn)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    datasetGroupArn: ").append(toIndentedString(datasetGroupArn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("filterArn");
    openapiFields.add("creationDateTime");
    openapiFields.add("lastUpdatedDateTime");
    openapiFields.add("datasetGroupArn");
    openapiFields.add("failureReason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FilterSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FilterSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilterSummary is not found in the empty JSON string", FilterSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FilterSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilterSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `filterArn`
      if (jsonObj.get("filterArn") != null && !jsonObj.get("filterArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("filterArn"));
      }
      // validate the optional field `creationDateTime`
      if (jsonObj.get("creationDateTime") != null && !jsonObj.get("creationDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("creationDateTime"));
      }
      // validate the optional field `lastUpdatedDateTime`
      if (jsonObj.get("lastUpdatedDateTime") != null && !jsonObj.get("lastUpdatedDateTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("lastUpdatedDateTime"));
      }
      // validate the optional field `datasetGroupArn`
      if (jsonObj.get("datasetGroupArn") != null && !jsonObj.get("datasetGroupArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("datasetGroupArn"));
      }
      // validate the optional field `failureReason`
      if (jsonObj.get("failureReason") != null && !jsonObj.get("failureReason").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("failureReason"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilterSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilterSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilterSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilterSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<FilterSummary>() {
           @Override
           public void write(JsonWriter out, FilterSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilterSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FilterSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FilterSummary
   * @throws IOException if the JSON string is invalid with respect to FilterSummary
   */
  public static FilterSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilterSummary.class);
  }

  /**
   * Convert an instance of FilterSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

