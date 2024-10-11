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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Meta18;
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
 * DatabaseRestApiGetList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DatabaseRestApiGetList {
  public static final String SERIALIZED_NAME_ALLOW_CSV_UPLOAD = "allow_csv_upload";
  @SerializedName(SERIALIZED_NAME_ALLOW_CSV_UPLOAD)
  private Boolean allowCsvUpload;

  public static final String SERIALIZED_NAME_ALLOW_CTAS = "allow_ctas";
  @SerializedName(SERIALIZED_NAME_ALLOW_CTAS)
  private Boolean allowCtas;

  public static final String SERIALIZED_NAME_ALLOW_CVAS = "allow_cvas";
  @SerializedName(SERIALIZED_NAME_ALLOW_CVAS)
  private Boolean allowCvas;

  public static final String SERIALIZED_NAME_ALLOW_DML = "allow_dml";
  @SerializedName(SERIALIZED_NAME_ALLOW_DML)
  private Boolean allowDml;

  public static final String SERIALIZED_NAME_ALLOW_MULTI_SCHEMA_METADATA_FETCH = "allow_multi_schema_metadata_fetch";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTI_SCHEMA_METADATA_FETCH)
  private Boolean allowMultiSchemaMetadataFetch;

  public static final String SERIALIZED_NAME_ALLOW_RUN_ASYNC = "allow_run_async";
  @SerializedName(SERIALIZED_NAME_ALLOW_RUN_ASYNC)
  private Boolean allowRunAsync;

  public static final String SERIALIZED_NAME_ALLOWS_COST_ESTIMATE = "allows_cost_estimate";
  @SerializedName(SERIALIZED_NAME_ALLOWS_COST_ESTIMATE)
  private Object allowsCostEstimate = null;

  public static final String SERIALIZED_NAME_ALLOWS_SUBQUERY = "allows_subquery";
  @SerializedName(SERIALIZED_NAME_ALLOWS_SUBQUERY)
  private Object allowsSubquery = null;

  public static final String SERIALIZED_NAME_ALLOWS_VIRTUAL_TABLE_EXPLORE = "allows_virtual_table_explore";
  @SerializedName(SERIALIZED_NAME_ALLOWS_VIRTUAL_TABLE_EXPLORE)
  private Object allowsVirtualTableExplore = null;

  public static final String SERIALIZED_NAME_BACKEND = "backend";
  @SerializedName(SERIALIZED_NAME_BACKEND)
  private Object backend = null;

  public static final String SERIALIZED_NAME_CHANGED_ON = "changed_on";
  @SerializedName(SERIALIZED_NAME_CHANGED_ON)
  private OffsetDateTime changedOn;

  public static final String SERIALIZED_NAME_CHANGED_ON_DELTA_HUMANIZED = "changed_on_delta_humanized";
  @SerializedName(SERIALIZED_NAME_CHANGED_ON_DELTA_HUMANIZED)
  private Object changedOnDeltaHumanized = null;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Meta18 createdBy;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_EXPLORE_DATABASE_ID = "explore_database_id";
  @SerializedName(SERIALIZED_NAME_EXPLORE_DATABASE_ID)
  private Object exploreDatabaseId = null;

  public static final String SERIALIZED_NAME_EXPOSE_IN_SQLLAB = "expose_in_sqllab";
  @SerializedName(SERIALIZED_NAME_EXPOSE_IN_SQLLAB)
  private Boolean exposeInSqllab;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private String extra;

  public static final String SERIALIZED_NAME_FORCE_CTAS_SCHEMA = "force_ctas_schema";
  @SerializedName(SERIALIZED_NAME_FORCE_CTAS_SCHEMA)
  private String forceCtasSchema;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public DatabaseRestApiGetList() {
  }

  public DatabaseRestApiGetList(
     Object allowsCostEstimate, 
     Object allowsSubquery, 
     Object allowsVirtualTableExplore, 
     Object backend, 
     Object changedOnDeltaHumanized, 
     Object exploreDatabaseId
  ) {
    this();
    this.allowsCostEstimate = allowsCostEstimate;
    this.allowsSubquery = allowsSubquery;
    this.allowsVirtualTableExplore = allowsVirtualTableExplore;
    this.backend = backend;
    this.changedOnDeltaHumanized = changedOnDeltaHumanized;
    this.exploreDatabaseId = exploreDatabaseId;
  }

  public DatabaseRestApiGetList allowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
    return this;
  }

  /**
   * Get allowCsvUpload
   * @return allowCsvUpload
   */
  @javax.annotation.Nullable
  public Boolean getAllowCsvUpload() {
    return allowCsvUpload;
  }

  public void setAllowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
  }


  public DatabaseRestApiGetList allowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
    return this;
  }

  /**
   * Get allowCtas
   * @return allowCtas
   */
  @javax.annotation.Nullable
  public Boolean getAllowCtas() {
    return allowCtas;
  }

  public void setAllowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
  }


  public DatabaseRestApiGetList allowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
    return this;
  }

  /**
   * Get allowCvas
   * @return allowCvas
   */
  @javax.annotation.Nullable
  public Boolean getAllowCvas() {
    return allowCvas;
  }

  public void setAllowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
  }


  public DatabaseRestApiGetList allowDml(Boolean allowDml) {
    this.allowDml = allowDml;
    return this;
  }

  /**
   * Get allowDml
   * @return allowDml
   */
  @javax.annotation.Nullable
  public Boolean getAllowDml() {
    return allowDml;
  }

  public void setAllowDml(Boolean allowDml) {
    this.allowDml = allowDml;
  }


  public DatabaseRestApiGetList allowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
    return this;
  }

  /**
   * Get allowMultiSchemaMetadataFetch
   * @return allowMultiSchemaMetadataFetch
   */
  @javax.annotation.Nullable
  public Boolean getAllowMultiSchemaMetadataFetch() {
    return allowMultiSchemaMetadataFetch;
  }

  public void setAllowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
  }


  public DatabaseRestApiGetList allowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
    return this;
  }

  /**
   * Get allowRunAsync
   * @return allowRunAsync
   */
  @javax.annotation.Nullable
  public Boolean getAllowRunAsync() {
    return allowRunAsync;
  }

  public void setAllowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
  }


  /**
   * Get allowsCostEstimate
   * @return allowsCostEstimate
   */
  @javax.annotation.Nullable
  public Object getAllowsCostEstimate() {
    return allowsCostEstimate;
  }



  /**
   * Get allowsSubquery
   * @return allowsSubquery
   */
  @javax.annotation.Nullable
  public Object getAllowsSubquery() {
    return allowsSubquery;
  }



  /**
   * Get allowsVirtualTableExplore
   * @return allowsVirtualTableExplore
   */
  @javax.annotation.Nullable
  public Object getAllowsVirtualTableExplore() {
    return allowsVirtualTableExplore;
  }



  /**
   * Get backend
   * @return backend
   */
  @javax.annotation.Nullable
  public Object getBackend() {
    return backend;
  }



  public DatabaseRestApiGetList changedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
    return this;
  }

  /**
   * Get changedOn
   * @return changedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
  }


  /**
   * Get changedOnDeltaHumanized
   * @return changedOnDeltaHumanized
   */
  @javax.annotation.Nullable
  public Object getChangedOnDeltaHumanized() {
    return changedOnDeltaHumanized;
  }



  public DatabaseRestApiGetList createdBy(Meta18 createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  public Meta18 getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Meta18 createdBy) {
    this.createdBy = createdBy;
  }


  public DatabaseRestApiGetList databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Get databaseName
   * @return databaseName
   */
  @javax.annotation.Nonnull
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  /**
   * Get exploreDatabaseId
   * @return exploreDatabaseId
   */
  @javax.annotation.Nullable
  public Object getExploreDatabaseId() {
    return exploreDatabaseId;
  }



  public DatabaseRestApiGetList exposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
    return this;
  }

  /**
   * Get exposeInSqllab
   * @return exposeInSqllab
   */
  @javax.annotation.Nullable
  public Boolean getExposeInSqllab() {
    return exposeInSqllab;
  }

  public void setExposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
  }


  public DatabaseRestApiGetList extra(String extra) {
    this.extra = extra;
    return this;
  }

  /**
   * Get extra
   * @return extra
   */
  @javax.annotation.Nullable
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }


  public DatabaseRestApiGetList forceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
    return this;
  }

  /**
   * Get forceCtasSchema
   * @return forceCtasSchema
   */
  @javax.annotation.Nullable
  public String getForceCtasSchema() {
    return forceCtasSchema;
  }

  public void setForceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
  }


  public DatabaseRestApiGetList id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRestApiGetList databaseRestApiGetList = (DatabaseRestApiGetList) o;
    return Objects.equals(this.allowCsvUpload, databaseRestApiGetList.allowCsvUpload) &&
        Objects.equals(this.allowCtas, databaseRestApiGetList.allowCtas) &&
        Objects.equals(this.allowCvas, databaseRestApiGetList.allowCvas) &&
        Objects.equals(this.allowDml, databaseRestApiGetList.allowDml) &&
        Objects.equals(this.allowMultiSchemaMetadataFetch, databaseRestApiGetList.allowMultiSchemaMetadataFetch) &&
        Objects.equals(this.allowRunAsync, databaseRestApiGetList.allowRunAsync) &&
        Objects.equals(this.allowsCostEstimate, databaseRestApiGetList.allowsCostEstimate) &&
        Objects.equals(this.allowsSubquery, databaseRestApiGetList.allowsSubquery) &&
        Objects.equals(this.allowsVirtualTableExplore, databaseRestApiGetList.allowsVirtualTableExplore) &&
        Objects.equals(this.backend, databaseRestApiGetList.backend) &&
        Objects.equals(this.changedOn, databaseRestApiGetList.changedOn) &&
        Objects.equals(this.changedOnDeltaHumanized, databaseRestApiGetList.changedOnDeltaHumanized) &&
        Objects.equals(this.createdBy, databaseRestApiGetList.createdBy) &&
        Objects.equals(this.databaseName, databaseRestApiGetList.databaseName) &&
        Objects.equals(this.exploreDatabaseId, databaseRestApiGetList.exploreDatabaseId) &&
        Objects.equals(this.exposeInSqllab, databaseRestApiGetList.exposeInSqllab) &&
        Objects.equals(this.extra, databaseRestApiGetList.extra) &&
        Objects.equals(this.forceCtasSchema, databaseRestApiGetList.forceCtasSchema) &&
        Objects.equals(this.id, databaseRestApiGetList.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCsvUpload, allowCtas, allowCvas, allowDml, allowMultiSchemaMetadataFetch, allowRunAsync, allowsCostEstimate, allowsSubquery, allowsVirtualTableExplore, backend, changedOn, changedOnDeltaHumanized, createdBy, databaseName, exploreDatabaseId, exposeInSqllab, extra, forceCtasSchema, id);
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
    sb.append("class DatabaseRestApiGetList {\n");
    sb.append("    allowCsvUpload: ").append(toIndentedString(allowCsvUpload)).append("\n");
    sb.append("    allowCtas: ").append(toIndentedString(allowCtas)).append("\n");
    sb.append("    allowCvas: ").append(toIndentedString(allowCvas)).append("\n");
    sb.append("    allowDml: ").append(toIndentedString(allowDml)).append("\n");
    sb.append("    allowMultiSchemaMetadataFetch: ").append(toIndentedString(allowMultiSchemaMetadataFetch)).append("\n");
    sb.append("    allowRunAsync: ").append(toIndentedString(allowRunAsync)).append("\n");
    sb.append("    allowsCostEstimate: ").append(toIndentedString(allowsCostEstimate)).append("\n");
    sb.append("    allowsSubquery: ").append(toIndentedString(allowsSubquery)).append("\n");
    sb.append("    allowsVirtualTableExplore: ").append(toIndentedString(allowsVirtualTableExplore)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    changedOnDeltaHumanized: ").append(toIndentedString(changedOnDeltaHumanized)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    exploreDatabaseId: ").append(toIndentedString(exploreDatabaseId)).append("\n");
    sb.append("    exposeInSqllab: ").append(toIndentedString(exposeInSqllab)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    forceCtasSchema: ").append(toIndentedString(forceCtasSchema)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("allow_csv_upload");
    openapiFields.add("allow_ctas");
    openapiFields.add("allow_cvas");
    openapiFields.add("allow_dml");
    openapiFields.add("allow_multi_schema_metadata_fetch");
    openapiFields.add("allow_run_async");
    openapiFields.add("allows_cost_estimate");
    openapiFields.add("allows_subquery");
    openapiFields.add("allows_virtual_table_explore");
    openapiFields.add("backend");
    openapiFields.add("changed_on");
    openapiFields.add("changed_on_delta_humanized");
    openapiFields.add("created_by");
    openapiFields.add("database_name");
    openapiFields.add("explore_database_id");
    openapiFields.add("expose_in_sqllab");
    openapiFields.add("extra");
    openapiFields.add("force_ctas_schema");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("database_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatabaseRestApiGetList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatabaseRestApiGetList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseRestApiGetList is not found in the empty JSON string", DatabaseRestApiGetList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatabaseRestApiGetList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatabaseRestApiGetList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatabaseRestApiGetList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `created_by`
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) {
        Meta18.validateJsonElement(jsonObj.get("created_by"));
      }
      if (!jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) && !jsonObj.get("extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra").toString()));
      }
      if ((jsonObj.get("force_ctas_schema") != null && !jsonObj.get("force_ctas_schema").isJsonNull()) && !jsonObj.get("force_ctas_schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `force_ctas_schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("force_ctas_schema").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseRestApiGetList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseRestApiGetList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseRestApiGetList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseRestApiGetList.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseRestApiGetList>() {
           @Override
           public void write(JsonWriter out, DatabaseRestApiGetList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatabaseRestApiGetList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatabaseRestApiGetList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatabaseRestApiGetList
   * @throws IOException if the JSON string is invalid with respect to DatabaseRestApiGetList
   */
  public static DatabaseRestApiGetList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseRestApiGetList.class);
  }

  /**
   * Convert an instance of DatabaseRestApiGetList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

