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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AnnotationLayerGet200ResponseDescriptionColumns;
import org.openapitools.client.model.AnnotationLayerGet200ResponseLabelColumns;
import org.openapitools.client.model.DatasetRestApiGetList;

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
 * DatasetGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DatasetGet200Response {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public static final String SERIALIZED_NAME_DESCRIPTION_COLUMNS = "description_columns";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_COLUMNS)
  private AnnotationLayerGet200ResponseDescriptionColumns descriptionColumns;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABEL_COLUMNS = "label_columns";
  @SerializedName(SERIALIZED_NAME_LABEL_COLUMNS)
  private AnnotationLayerGet200ResponseLabelColumns labelColumns;

  public static final String SERIALIZED_NAME_LIST_COLUMNS = "list_columns";
  @SerializedName(SERIALIZED_NAME_LIST_COLUMNS)
  private List<String> listColumns = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIST_TITLE = "list_title";
  @SerializedName(SERIALIZED_NAME_LIST_TITLE)
  private String listTitle;

  public static final String SERIALIZED_NAME_ORDER_COLUMNS = "order_columns";
  @SerializedName(SERIALIZED_NAME_ORDER_COLUMNS)
  private List<String> orderColumns = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<DatasetRestApiGetList> result = new ArrayList<>();

  public DatasetGet200Response() {
  }

  public DatasetGet200Response count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * The total record count on the backend
   * @return count
   */
  @javax.annotation.Nullable
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }


  public DatasetGet200Response descriptionColumns(AnnotationLayerGet200ResponseDescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
    return this;
  }

  /**
   * Get descriptionColumns
   * @return descriptionColumns
   */
  @javax.annotation.Nullable
  public AnnotationLayerGet200ResponseDescriptionColumns getDescriptionColumns() {
    return descriptionColumns;
  }

  public void setDescriptionColumns(AnnotationLayerGet200ResponseDescriptionColumns descriptionColumns) {
    this.descriptionColumns = descriptionColumns;
  }


  public DatasetGet200Response ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public DatasetGet200Response addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * A list of item ids, useful when you don&#39;t know the column id
   * @return ids
   */
  @javax.annotation.Nullable
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public DatasetGet200Response labelColumns(AnnotationLayerGet200ResponseLabelColumns labelColumns) {
    this.labelColumns = labelColumns;
    return this;
  }

  /**
   * Get labelColumns
   * @return labelColumns
   */
  @javax.annotation.Nullable
  public AnnotationLayerGet200ResponseLabelColumns getLabelColumns() {
    return labelColumns;
  }

  public void setLabelColumns(AnnotationLayerGet200ResponseLabelColumns labelColumns) {
    this.labelColumns = labelColumns;
  }


  public DatasetGet200Response listColumns(List<String> listColumns) {
    this.listColumns = listColumns;
    return this;
  }

  public DatasetGet200Response addListColumnsItem(String listColumnsItem) {
    if (this.listColumns == null) {
      this.listColumns = new ArrayList<>();
    }
    this.listColumns.add(listColumnsItem);
    return this;
  }

  /**
   * A list of columns
   * @return listColumns
   */
  @javax.annotation.Nullable
  public List<String> getListColumns() {
    return listColumns;
  }

  public void setListColumns(List<String> listColumns) {
    this.listColumns = listColumns;
  }


  public DatasetGet200Response listTitle(String listTitle) {
    this.listTitle = listTitle;
    return this;
  }

  /**
   * A title to render. Will be translated by babel
   * @return listTitle
   */
  @javax.annotation.Nullable
  public String getListTitle() {
    return listTitle;
  }

  public void setListTitle(String listTitle) {
    this.listTitle = listTitle;
  }


  public DatasetGet200Response orderColumns(List<String> orderColumns) {
    this.orderColumns = orderColumns;
    return this;
  }

  public DatasetGet200Response addOrderColumnsItem(String orderColumnsItem) {
    if (this.orderColumns == null) {
      this.orderColumns = new ArrayList<>();
    }
    this.orderColumns.add(orderColumnsItem);
    return this;
  }

  /**
   * A list of allowed columns to sort
   * @return orderColumns
   */
  @javax.annotation.Nullable
  public List<String> getOrderColumns() {
    return orderColumns;
  }

  public void setOrderColumns(List<String> orderColumns) {
    this.orderColumns = orderColumns;
  }


  public DatasetGet200Response result(List<DatasetRestApiGetList> result) {
    this.result = result;
    return this;
  }

  public DatasetGet200Response addResultItem(DatasetRestApiGetList resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * The result from the get list query
   * @return result
   */
  @javax.annotation.Nullable
  public List<DatasetRestApiGetList> getResult() {
    return result;
  }

  public void setResult(List<DatasetRestApiGetList> result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetGet200Response datasetGet200Response = (DatasetGet200Response) o;
    return Objects.equals(this.count, datasetGet200Response.count) &&
        Objects.equals(this.descriptionColumns, datasetGet200Response.descriptionColumns) &&
        Objects.equals(this.ids, datasetGet200Response.ids) &&
        Objects.equals(this.labelColumns, datasetGet200Response.labelColumns) &&
        Objects.equals(this.listColumns, datasetGet200Response.listColumns) &&
        Objects.equals(this.listTitle, datasetGet200Response.listTitle) &&
        Objects.equals(this.orderColumns, datasetGet200Response.orderColumns) &&
        Objects.equals(this.result, datasetGet200Response.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, descriptionColumns, ids, labelColumns, listColumns, listTitle, orderColumns, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetGet200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    descriptionColumns: ").append(toIndentedString(descriptionColumns)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    labelColumns: ").append(toIndentedString(labelColumns)).append("\n");
    sb.append("    listColumns: ").append(toIndentedString(listColumns)).append("\n");
    sb.append("    listTitle: ").append(toIndentedString(listTitle)).append("\n");
    sb.append("    orderColumns: ").append(toIndentedString(orderColumns)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("description_columns");
    openapiFields.add("ids");
    openapiFields.add("label_columns");
    openapiFields.add("list_columns");
    openapiFields.add("list_title");
    openapiFields.add("order_columns");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatasetGet200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetGet200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetGet200Response is not found in the empty JSON string", DatasetGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetGet200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `description_columns`
      if (jsonObj.get("description_columns") != null && !jsonObj.get("description_columns").isJsonNull()) {
        AnnotationLayerGet200ResponseDescriptionColumns.validateJsonElement(jsonObj.get("description_columns"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull() && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      // validate the optional field `label_columns`
      if (jsonObj.get("label_columns") != null && !jsonObj.get("label_columns").isJsonNull()) {
        AnnotationLayerGet200ResponseLabelColumns.validateJsonElement(jsonObj.get("label_columns"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("list_columns") != null && !jsonObj.get("list_columns").isJsonNull() && !jsonObj.get("list_columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_columns` to be an array in the JSON string but got `%s`", jsonObj.get("list_columns").toString()));
      }
      if ((jsonObj.get("list_title") != null && !jsonObj.get("list_title").isJsonNull()) && !jsonObj.get("list_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_title").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("order_columns") != null && !jsonObj.get("order_columns").isJsonNull() && !jsonObj.get("order_columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_columns` to be an array in the JSON string but got `%s`", jsonObj.get("order_columns").toString()));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            DatasetRestApiGetList.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetGet200Response>() {
           @Override
           public void write(JsonWriter out, DatasetGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetGet200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatasetGet200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatasetGet200Response
   * @throws IOException if the JSON string is invalid with respect to DatasetGet200Response
   */
  public static DatasetGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetGet200Response.class);
  }

  /**
   * Convert an instance of DatasetGet200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

