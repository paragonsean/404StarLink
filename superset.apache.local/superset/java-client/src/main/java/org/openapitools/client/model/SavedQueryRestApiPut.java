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
import java.util.Arrays;
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
 * SavedQueryRestApiPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SavedQueryRestApiPut {
  public static final String SERIALIZED_NAME_DB_ID = "db_id";
  @SerializedName(SERIALIZED_NAME_DB_ID)
  private Integer dbId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private String schema;

  public static final String SERIALIZED_NAME_SQL = "sql";
  @SerializedName(SERIALIZED_NAME_SQL)
  private String sql;

  public SavedQueryRestApiPut() {
  }

  public SavedQueryRestApiPut dbId(Integer dbId) {
    this.dbId = dbId;
    return this;
  }

  /**
   * Get dbId
   * @return dbId
   */
  @javax.annotation.Nullable
  public Integer getDbId() {
    return dbId;
  }

  public void setDbId(Integer dbId) {
    this.dbId = dbId;
  }


  public SavedQueryRestApiPut description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SavedQueryRestApiPut label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public SavedQueryRestApiPut schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @javax.annotation.Nullable
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }


  public SavedQueryRestApiPut sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * Get sql
   * @return sql
   */
  @javax.annotation.Nullable
  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedQueryRestApiPut savedQueryRestApiPut = (SavedQueryRestApiPut) o;
    return Objects.equals(this.dbId, savedQueryRestApiPut.dbId) &&
        Objects.equals(this.description, savedQueryRestApiPut.description) &&
        Objects.equals(this.label, savedQueryRestApiPut.label) &&
        Objects.equals(this.schema, savedQueryRestApiPut.schema) &&
        Objects.equals(this.sql, savedQueryRestApiPut.sql);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbId, description, label, schema, sql);
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
    sb.append("class SavedQueryRestApiPut {\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
    openapiFields.add("db_id");
    openapiFields.add("description");
    openapiFields.add("label");
    openapiFields.add("schema");
    openapiFields.add("sql");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SavedQueryRestApiPut
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SavedQueryRestApiPut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SavedQueryRestApiPut is not found in the empty JSON string", SavedQueryRestApiPut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SavedQueryRestApiPut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SavedQueryRestApiPut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull()) && !jsonObj.get("schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema").toString()));
      }
      if ((jsonObj.get("sql") != null && !jsonObj.get("sql").isJsonNull()) && !jsonObj.get("sql").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sql` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sql").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SavedQueryRestApiPut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SavedQueryRestApiPut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SavedQueryRestApiPut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SavedQueryRestApiPut.class));

       return (TypeAdapter<T>) new TypeAdapter<SavedQueryRestApiPut>() {
           @Override
           public void write(JsonWriter out, SavedQueryRestApiPut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SavedQueryRestApiPut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SavedQueryRestApiPut given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SavedQueryRestApiPut
   * @throws IOException if the JSON string is invalid with respect to SavedQueryRestApiPut
   */
  public static SavedQueryRestApiPut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SavedQueryRestApiPut.class);
  }

  /**
   * Convert an instance of SavedQueryRestApiPut to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

