/*
 * Amazon Honeycode
 *  Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals, resources, and even your team. 
 *
 * The version of the OpenAPI document: 2020-03-01
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
import org.openapitools.client.model.TableDataImportJobMetadataDataSource;
import org.openapitools.client.model.TableDataImportJobMetadataImportOptions;
import org.openapitools.client.model.TableDataImportJobMetadataSubmitter;

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
 * DescribeTableDataImportJobResultJobMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:28.423278-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeTableDataImportJobResultJobMetadata {
  public static final String SERIALIZED_NAME_SUBMITTER = "submitter";
  @SerializedName(SERIALIZED_NAME_SUBMITTER)
  private TableDataImportJobMetadataSubmitter submitter;

  public static final String SERIALIZED_NAME_SUBMIT_TIME = "submitTime";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TIME)
  private OffsetDateTime submitTime;

  public static final String SERIALIZED_NAME_IMPORT_OPTIONS = "importOptions";
  @SerializedName(SERIALIZED_NAME_IMPORT_OPTIONS)
  private TableDataImportJobMetadataImportOptions importOptions;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private TableDataImportJobMetadataDataSource dataSource;

  public DescribeTableDataImportJobResultJobMetadata() {
  }

  public DescribeTableDataImportJobResultJobMetadata submitter(TableDataImportJobMetadataSubmitter submitter) {
    this.submitter = submitter;
    return this;
  }

  /**
   * Get submitter
   * @return submitter
   */
  @javax.annotation.Nonnull
  public TableDataImportJobMetadataSubmitter getSubmitter() {
    return submitter;
  }

  public void setSubmitter(TableDataImportJobMetadataSubmitter submitter) {
    this.submitter = submitter;
  }


  public DescribeTableDataImportJobResultJobMetadata submitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
    return this;
  }

  /**
   * Get submitTime
   * @return submitTime
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
  }


  public DescribeTableDataImportJobResultJobMetadata importOptions(TableDataImportJobMetadataImportOptions importOptions) {
    this.importOptions = importOptions;
    return this;
  }

  /**
   * Get importOptions
   * @return importOptions
   */
  @javax.annotation.Nonnull
  public TableDataImportJobMetadataImportOptions getImportOptions() {
    return importOptions;
  }

  public void setImportOptions(TableDataImportJobMetadataImportOptions importOptions) {
    this.importOptions = importOptions;
  }


  public DescribeTableDataImportJobResultJobMetadata dataSource(TableDataImportJobMetadataDataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   * @return dataSource
   */
  @javax.annotation.Nonnull
  public TableDataImportJobMetadataDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(TableDataImportJobMetadataDataSource dataSource) {
    this.dataSource = dataSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTableDataImportJobResultJobMetadata describeTableDataImportJobResultJobMetadata = (DescribeTableDataImportJobResultJobMetadata) o;
    return Objects.equals(this.submitter, describeTableDataImportJobResultJobMetadata.submitter) &&
        Objects.equals(this.submitTime, describeTableDataImportJobResultJobMetadata.submitTime) &&
        Objects.equals(this.importOptions, describeTableDataImportJobResultJobMetadata.importOptions) &&
        Objects.equals(this.dataSource, describeTableDataImportJobResultJobMetadata.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitter, submitTime, importOptions, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTableDataImportJobResultJobMetadata {\n");
    sb.append("    submitter: ").append(toIndentedString(submitter)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    importOptions: ").append(toIndentedString(importOptions)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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
    openapiFields.add("submitter");
    openapiFields.add("submitTime");
    openapiFields.add("importOptions");
    openapiFields.add("dataSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submitter");
    openapiRequiredFields.add("submitTime");
    openapiRequiredFields.add("importOptions");
    openapiRequiredFields.add("dataSource");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeTableDataImportJobResultJobMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeTableDataImportJobResultJobMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeTableDataImportJobResultJobMetadata is not found in the empty JSON string", DescribeTableDataImportJobResultJobMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeTableDataImportJobResultJobMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeTableDataImportJobResultJobMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DescribeTableDataImportJobResultJobMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `submitter`
      TableDataImportJobMetadataSubmitter.validateJsonElement(jsonObj.get("submitter"));
      // validate the required field `submitTime`
      OffsetDateTime.validateJsonElement(jsonObj.get("submitTime"));
      // validate the required field `importOptions`
      TableDataImportJobMetadataImportOptions.validateJsonElement(jsonObj.get("importOptions"));
      // validate the required field `dataSource`
      TableDataImportJobMetadataDataSource.validateJsonElement(jsonObj.get("dataSource"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeTableDataImportJobResultJobMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeTableDataImportJobResultJobMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeTableDataImportJobResultJobMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeTableDataImportJobResultJobMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeTableDataImportJobResultJobMetadata>() {
           @Override
           public void write(JsonWriter out, DescribeTableDataImportJobResultJobMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeTableDataImportJobResultJobMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeTableDataImportJobResultJobMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeTableDataImportJobResultJobMetadata
   * @throws IOException if the JSON string is invalid with respect to DescribeTableDataImportJobResultJobMetadata
   */
  public static DescribeTableDataImportJobResultJobMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeTableDataImportJobResultJobMetadata.class);
  }

  /**
   * Convert an instance of DescribeTableDataImportJobResultJobMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

