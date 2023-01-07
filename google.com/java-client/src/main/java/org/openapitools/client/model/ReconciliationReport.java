/*
 * Travel Partner API
 * The Travel Partner API provides you with a RESTful interface to the Google Hotel Center platform. It enables an app to efficiently retrieve and change Hotel Center data, and is thus suitable for managing large or complex accounts.
 *
 * The version of the OpenAPI document: v3
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
 * Reconciliation report (Hotel Ads only). Covers the Reconciliation Reports functionality in pre-v3.0 API versions. Lets you see the status, validate, and upload your Commissions reconciliation reports. This only applies if you are in the Google Hotel Ads Commissions Program (GHACP). For more information about working with reconciliation reports in Hotel Center, refer to [Reconciliation reports](//support.google.com/hotelprices/answer/7019060#sending).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:00.307934-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReconciliationReport {
  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private String contents;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ReconciliationReport() {
  }

  public ReconciliationReport contents(String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Required. The contents of the commission report. Report contents must conform to the requirements specified in [Reconciliation reports] (//support.google.com/hotelprices/answer/7019060#creating).
   * @return contents
   */
  @javax.annotation.Nullable
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }


  public ReconciliationReport fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Required. Desired filename of the reconciliation report.
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public ReconciliationReport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource name in the format &#x60;accounts/{account_id}/reconciliationReports/{datetime}~{filename}&#x60;. The value for &#x60;{datetime}&#x60; must be from 0001-01-01T00:00:00 to 9999-12-31T23:59:59 inclusive.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciliationReport reconciliationReport = (ReconciliationReport) o;
    return Objects.equals(this.contents, reconciliationReport.contents) &&
        Objects.equals(this.fileName, reconciliationReport.fileName) &&
        Objects.equals(this.name, reconciliationReport.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, fileName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciliationReport {\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("contents");
    openapiFields.add("fileName");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReconciliationReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReconciliationReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReconciliationReport is not found in the empty JSON string", ReconciliationReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReconciliationReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReconciliationReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonNull()) && !jsonObj.get("contents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contents").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReconciliationReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReconciliationReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReconciliationReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReconciliationReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ReconciliationReport>() {
           @Override
           public void write(JsonWriter out, ReconciliationReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReconciliationReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReconciliationReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReconciliationReport
   * @throws IOException if the JSON string is invalid with respect to ReconciliationReport
   */
  public static ReconciliationReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReconciliationReport.class);
  }

  /**
   * Convert an instance of ReconciliationReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

