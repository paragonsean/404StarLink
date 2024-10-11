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
import java.util.Map;
import org.openapitools.client.model.UpsertRowDataFilter;

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
 *  Data needed to upsert rows in a table as part of a single item in the BatchUpsertTableRows request. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:19:28.423278-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class UpsertRowData {
  public static final String SERIALIZED_NAME_BATCH_ITEM_ID = "batchItemId";
  @SerializedName(SERIALIZED_NAME_BATCH_ITEM_ID)
  private String batchItemId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private UpsertRowDataFilter filter;

  public static final String SERIALIZED_NAME_CELLS_TO_UPDATE = "cellsToUpdate";
  @SerializedName(SERIALIZED_NAME_CELLS_TO_UPDATE)
  private Map cellsToUpdate;

  public UpsertRowData() {
  }

  public UpsertRowData batchItemId(String batchItemId) {
    this.batchItemId = batchItemId;
    return this;
  }

  /**
   * Get batchItemId
   * @return batchItemId
   */
  @javax.annotation.Nonnull
  public String getBatchItemId() {
    return batchItemId;
  }

  public void setBatchItemId(String batchItemId) {
    this.batchItemId = batchItemId;
  }


  public UpsertRowData filter(UpsertRowDataFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nonnull
  public UpsertRowDataFilter getFilter() {
    return filter;
  }

  public void setFilter(UpsertRowDataFilter filter) {
    this.filter = filter;
  }


  public UpsertRowData cellsToUpdate(Map cellsToUpdate) {
    this.cellsToUpdate = cellsToUpdate;
    return this;
  }

  /**
   * Get cellsToUpdate
   * @return cellsToUpdate
   */
  @javax.annotation.Nonnull
  public Map getCellsToUpdate() {
    return cellsToUpdate;
  }

  public void setCellsToUpdate(Map cellsToUpdate) {
    this.cellsToUpdate = cellsToUpdate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertRowData upsertRowData = (UpsertRowData) o;
    return Objects.equals(this.batchItemId, upsertRowData.batchItemId) &&
        Objects.equals(this.filter, upsertRowData.filter) &&
        Objects.equals(this.cellsToUpdate, upsertRowData.cellsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchItemId, filter, cellsToUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertRowData {\n");
    sb.append("    batchItemId: ").append(toIndentedString(batchItemId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    cellsToUpdate: ").append(toIndentedString(cellsToUpdate)).append("\n");
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
    openapiFields.add("batchItemId");
    openapiFields.add("filter");
    openapiFields.add("cellsToUpdate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batchItemId");
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("cellsToUpdate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertRowData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertRowData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertRowData is not found in the empty JSON string", UpsertRowData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertRowData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertRowData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertRowData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `batchItemId`
      String.validateJsonElement(jsonObj.get("batchItemId"));
      // validate the required field `filter`
      UpsertRowDataFilter.validateJsonElement(jsonObj.get("filter"));
      // validate the required field `cellsToUpdate`
      Map.validateJsonElement(jsonObj.get("cellsToUpdate"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertRowData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertRowData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertRowData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertRowData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertRowData>() {
           @Override
           public void write(JsonWriter out, UpsertRowData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertRowData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertRowData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertRowData
   * @throws IOException if the JSON string is invalid with respect to UpsertRowData
   */
  public static UpsertRowData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertRowData.class);
  }

  /**
   * Convert an instance of UpsertRowData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

