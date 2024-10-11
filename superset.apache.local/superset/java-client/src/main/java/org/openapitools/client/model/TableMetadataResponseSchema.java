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
import org.openapitools.client.model.TableMetadataColumnsResponse;
import org.openapitools.client.model.TableMetadataForeignKeysIndexesResponse;
import org.openapitools.client.model.TableMetadataPrimaryKeyResponse;

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
 * TableMetadataResponseSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TableMetadataResponseSchema {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<TableMetadataColumnsResponse> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOREIGN_KEYS = "foreignKeys";
  @SerializedName(SERIALIZED_NAME_FOREIGN_KEYS)
  private List<TableMetadataForeignKeysIndexesResponse> foreignKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDEXES = "indexes";
  @SerializedName(SERIALIZED_NAME_INDEXES)
  private List<TableMetadataForeignKeysIndexesResponse> indexes = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIMARY_KEY = "primaryKey";
  @SerializedName(SERIALIZED_NAME_PRIMARY_KEY)
  private TableMetadataPrimaryKeyResponse primaryKey;

  public static final String SERIALIZED_NAME_SELECT_STAR = "selectStar";
  @SerializedName(SERIALIZED_NAME_SELECT_STAR)
  private String selectStar;

  public TableMetadataResponseSchema() {
  }

  public TableMetadataResponseSchema columns(List<TableMetadataColumnsResponse> columns) {
    this.columns = columns;
    return this;
  }

  public TableMetadataResponseSchema addColumnsItem(TableMetadataColumnsResponse columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * A list of columns and their metadata
   * @return columns
   */
  @javax.annotation.Nullable
  public List<TableMetadataColumnsResponse> getColumns() {
    return columns;
  }

  public void setColumns(List<TableMetadataColumnsResponse> columns) {
    this.columns = columns;
  }


  public TableMetadataResponseSchema foreignKeys(List<TableMetadataForeignKeysIndexesResponse> foreignKeys) {
    this.foreignKeys = foreignKeys;
    return this;
  }

  public TableMetadataResponseSchema addForeignKeysItem(TableMetadataForeignKeysIndexesResponse foreignKeysItem) {
    if (this.foreignKeys == null) {
      this.foreignKeys = new ArrayList<>();
    }
    this.foreignKeys.add(foreignKeysItem);
    return this;
  }

  /**
   * A list of foreign keys and their metadata
   * @return foreignKeys
   */
  @javax.annotation.Nullable
  public List<TableMetadataForeignKeysIndexesResponse> getForeignKeys() {
    return foreignKeys;
  }

  public void setForeignKeys(List<TableMetadataForeignKeysIndexesResponse> foreignKeys) {
    this.foreignKeys = foreignKeys;
  }


  public TableMetadataResponseSchema indexes(List<TableMetadataForeignKeysIndexesResponse> indexes) {
    this.indexes = indexes;
    return this;
  }

  public TableMetadataResponseSchema addIndexesItem(TableMetadataForeignKeysIndexesResponse indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * A list of indexes and their metadata
   * @return indexes
   */
  @javax.annotation.Nullable
  public List<TableMetadataForeignKeysIndexesResponse> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<TableMetadataForeignKeysIndexesResponse> indexes) {
    this.indexes = indexes;
  }


  public TableMetadataResponseSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the table
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TableMetadataResponseSchema primaryKey(TableMetadataPrimaryKeyResponse primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  /**
   * Primary keys metadata
   * @return primaryKey
   */
  @javax.annotation.Nullable
  public TableMetadataPrimaryKeyResponse getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(TableMetadataPrimaryKeyResponse primaryKey) {
    this.primaryKey = primaryKey;
  }


  public TableMetadataResponseSchema selectStar(String selectStar) {
    this.selectStar = selectStar;
    return this;
  }

  /**
   * SQL select star
   * @return selectStar
   */
  @javax.annotation.Nullable
  public String getSelectStar() {
    return selectStar;
  }

  public void setSelectStar(String selectStar) {
    this.selectStar = selectStar;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableMetadataResponseSchema tableMetadataResponseSchema = (TableMetadataResponseSchema) o;
    return Objects.equals(this.columns, tableMetadataResponseSchema.columns) &&
        Objects.equals(this.foreignKeys, tableMetadataResponseSchema.foreignKeys) &&
        Objects.equals(this.indexes, tableMetadataResponseSchema.indexes) &&
        Objects.equals(this.name, tableMetadataResponseSchema.name) &&
        Objects.equals(this.primaryKey, tableMetadataResponseSchema.primaryKey) &&
        Objects.equals(this.selectStar, tableMetadataResponseSchema.selectStar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, foreignKeys, indexes, name, primaryKey, selectStar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableMetadataResponseSchema {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    foreignKeys: ").append(toIndentedString(foreignKeys)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    selectStar: ").append(toIndentedString(selectStar)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("foreignKeys");
    openapiFields.add("indexes");
    openapiFields.add("name");
    openapiFields.add("primaryKey");
    openapiFields.add("selectStar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TableMetadataResponseSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TableMetadataResponseSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TableMetadataResponseSchema is not found in the empty JSON string", TableMetadataResponseSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TableMetadataResponseSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TableMetadataResponseSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            TableMetadataColumnsResponse.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if (jsonObj.get("foreignKeys") != null && !jsonObj.get("foreignKeys").isJsonNull()) {
        JsonArray jsonArrayforeignKeys = jsonObj.getAsJsonArray("foreignKeys");
        if (jsonArrayforeignKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("foreignKeys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `foreignKeys` to be an array in the JSON string but got `%s`", jsonObj.get("foreignKeys").toString()));
          }

          // validate the optional field `foreignKeys` (array)
          for (int i = 0; i < jsonArrayforeignKeys.size(); i++) {
            TableMetadataForeignKeysIndexesResponse.validateJsonElement(jsonArrayforeignKeys.get(i));
          };
        }
      }
      if (jsonObj.get("indexes") != null && !jsonObj.get("indexes").isJsonNull()) {
        JsonArray jsonArrayindexes = jsonObj.getAsJsonArray("indexes");
        if (jsonArrayindexes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("indexes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `indexes` to be an array in the JSON string but got `%s`", jsonObj.get("indexes").toString()));
          }

          // validate the optional field `indexes` (array)
          for (int i = 0; i < jsonArrayindexes.size(); i++) {
            TableMetadataForeignKeysIndexesResponse.validateJsonElement(jsonArrayindexes.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `primaryKey`
      if (jsonObj.get("primaryKey") != null && !jsonObj.get("primaryKey").isJsonNull()) {
        TableMetadataPrimaryKeyResponse.validateJsonElement(jsonObj.get("primaryKey"));
      }
      if ((jsonObj.get("selectStar") != null && !jsonObj.get("selectStar").isJsonNull()) && !jsonObj.get("selectStar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectStar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectStar").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TableMetadataResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TableMetadataResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TableMetadataResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TableMetadataResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<TableMetadataResponseSchema>() {
           @Override
           public void write(JsonWriter out, TableMetadataResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TableMetadataResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TableMetadataResponseSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TableMetadataResponseSchema
   * @throws IOException if the JSON string is invalid with respect to TableMetadataResponseSchema
   */
  public static TableMetadataResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TableMetadataResponseSchema.class);
  }

  /**
   * Convert an instance of TableMetadataResponseSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

