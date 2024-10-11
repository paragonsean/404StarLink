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
import java.util.Arrays;
import org.openapitools.client.model.StartTableDataImportJobRequestDataSourceDataSourceConfig;

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
 * StartTableDataImportJobRequestDataSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:28.423278-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StartTableDataImportJobRequestDataSource {
  public static final String SERIALIZED_NAME_DATA_SOURCE_CONFIG = "dataSourceConfig";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_CONFIG)
  private StartTableDataImportJobRequestDataSourceDataSourceConfig dataSourceConfig;

  public StartTableDataImportJobRequestDataSource() {
  }

  public StartTableDataImportJobRequestDataSource dataSourceConfig(StartTableDataImportJobRequestDataSourceDataSourceConfig dataSourceConfig) {
    this.dataSourceConfig = dataSourceConfig;
    return this;
  }

  /**
   * Get dataSourceConfig
   * @return dataSourceConfig
   */
  @javax.annotation.Nonnull
  public StartTableDataImportJobRequestDataSourceDataSourceConfig getDataSourceConfig() {
    return dataSourceConfig;
  }

  public void setDataSourceConfig(StartTableDataImportJobRequestDataSourceDataSourceConfig dataSourceConfig) {
    this.dataSourceConfig = dataSourceConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartTableDataImportJobRequestDataSource startTableDataImportJobRequestDataSource = (StartTableDataImportJobRequestDataSource) o;
    return Objects.equals(this.dataSourceConfig, startTableDataImportJobRequestDataSource.dataSourceConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartTableDataImportJobRequestDataSource {\n");
    sb.append("    dataSourceConfig: ").append(toIndentedString(dataSourceConfig)).append("\n");
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
    openapiFields.add("dataSourceConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataSourceConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StartTableDataImportJobRequestDataSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StartTableDataImportJobRequestDataSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartTableDataImportJobRequestDataSource is not found in the empty JSON string", StartTableDataImportJobRequestDataSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StartTableDataImportJobRequestDataSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartTableDataImportJobRequestDataSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StartTableDataImportJobRequestDataSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `dataSourceConfig`
      StartTableDataImportJobRequestDataSourceDataSourceConfig.validateJsonElement(jsonObj.get("dataSourceConfig"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartTableDataImportJobRequestDataSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartTableDataImportJobRequestDataSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartTableDataImportJobRequestDataSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartTableDataImportJobRequestDataSource.class));

       return (TypeAdapter<T>) new TypeAdapter<StartTableDataImportJobRequestDataSource>() {
           @Override
           public void write(JsonWriter out, StartTableDataImportJobRequestDataSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartTableDataImportJobRequestDataSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StartTableDataImportJobRequestDataSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StartTableDataImportJobRequestDataSource
   * @throws IOException if the JSON string is invalid with respect to StartTableDataImportJobRequestDataSource
   */
  public static StartTableDataImportJobRequestDataSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartTableDataImportJobRequestDataSource.class);
  }

  /**
   * Convert an instance of StartTableDataImportJobRequestDataSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

