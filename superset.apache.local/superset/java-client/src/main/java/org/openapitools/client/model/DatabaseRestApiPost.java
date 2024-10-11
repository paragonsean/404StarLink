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
import java.util.HashMap;
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
 * DatabaseRestApiPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DatabaseRestApiPost {
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

  public static final String SERIALIZED_NAME_CACHE_TIMEOUT = "cache_timeout";
  @SerializedName(SERIALIZED_NAME_CACHE_TIMEOUT)
  private Integer cacheTimeout;

  public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
  private Object configurationMethod = sqlalchemy_form;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_ENCRYPTED_EXTRA = "encrypted_extra";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EXTRA)
  private String encryptedExtra;

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_EXPOSE_IN_SQLLAB = "expose_in_sqllab";
  @SerializedName(SERIALIZED_NAME_EXPOSE_IN_SQLLAB)
  private Boolean exposeInSqllab;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private String extra;

  public static final String SERIALIZED_NAME_FORCE_CTAS_SCHEMA = "force_ctas_schema";
  @SerializedName(SERIALIZED_NAME_FORCE_CTAS_SCHEMA)
  private String forceCtasSchema;

  public static final String SERIALIZED_NAME_IMPERSONATE_USER = "impersonate_user";
  @SerializedName(SERIALIZED_NAME_IMPERSONATE_USER)
  private Boolean impersonateUser;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, Object> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_SERVER_CERT = "server_cert";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT)
  private String serverCert;

  public static final String SERIALIZED_NAME_SQLALCHEMY_URI = "sqlalchemy_uri";
  @SerializedName(SERIALIZED_NAME_SQLALCHEMY_URI)
  private String sqlalchemyUri;

  public DatabaseRestApiPost() {
  }

  public DatabaseRestApiPost allowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
    return this;
  }

  /**
   * Allow to upload CSV file data into this databaseIf selected, please set the schemas allowed for csv upload in Extra.
   * @return allowCsvUpload
   */
  @javax.annotation.Nullable
  public Boolean getAllowCsvUpload() {
    return allowCsvUpload;
  }

  public void setAllowCsvUpload(Boolean allowCsvUpload) {
    this.allowCsvUpload = allowCsvUpload;
  }


  public DatabaseRestApiPost allowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
    return this;
  }

  /**
   * Allow CREATE TABLE AS option in SQL Lab
   * @return allowCtas
   */
  @javax.annotation.Nullable
  public Boolean getAllowCtas() {
    return allowCtas;
  }

  public void setAllowCtas(Boolean allowCtas) {
    this.allowCtas = allowCtas;
  }


  public DatabaseRestApiPost allowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
    return this;
  }

  /**
   * Allow CREATE VIEW AS option in SQL Lab
   * @return allowCvas
   */
  @javax.annotation.Nullable
  public Boolean getAllowCvas() {
    return allowCvas;
  }

  public void setAllowCvas(Boolean allowCvas) {
    this.allowCvas = allowCvas;
  }


  public DatabaseRestApiPost allowDml(Boolean allowDml) {
    this.allowDml = allowDml;
    return this;
  }

  /**
   * Allow users to run non-SELECT statements (UPDATE, DELETE, CREATE, ...) in SQL Lab
   * @return allowDml
   */
  @javax.annotation.Nullable
  public Boolean getAllowDml() {
    return allowDml;
  }

  public void setAllowDml(Boolean allowDml) {
    this.allowDml = allowDml;
  }


  public DatabaseRestApiPost allowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
    return this;
  }

  /**
   * Allow SQL Lab to fetch a list of all tables and all views across all database schemas. For large data warehouse with thousands of tables, this can be expensive and put strain on the system.
   * @return allowMultiSchemaMetadataFetch
   */
  @javax.annotation.Nullable
  public Boolean getAllowMultiSchemaMetadataFetch() {
    return allowMultiSchemaMetadataFetch;
  }

  public void setAllowMultiSchemaMetadataFetch(Boolean allowMultiSchemaMetadataFetch) {
    this.allowMultiSchemaMetadataFetch = allowMultiSchemaMetadataFetch;
  }


  public DatabaseRestApiPost allowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
    return this;
  }

  /**
   * Operate the database in asynchronous mode, meaning  that the queries are executed on remote workers as opposed to on the web server itself. This assumes that you have a Celery worker setup as well as a results backend. Refer to the installation docs for more information.
   * @return allowRunAsync
   */
  @javax.annotation.Nullable
  public Boolean getAllowRunAsync() {
    return allowRunAsync;
  }

  public void setAllowRunAsync(Boolean allowRunAsync) {
    this.allowRunAsync = allowRunAsync;
  }


  public DatabaseRestApiPost cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

  /**
   * Duration (in seconds) of the caching timeout for charts of this database. A timeout of 0 indicates that the cache never expires. Note this defaults to the global timeout if undefined.
   * @return cacheTimeout
   */
  @javax.annotation.Nullable
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }


  public DatabaseRestApiPost configurationMethod(Object configurationMethod) {
    this.configurationMethod = configurationMethod;
    return this;
  }

  /**
   * Configuration_method is used on the frontend to inform the backend whether to explode parameters or to provide only a sqlalchemy_uri.
   * @return configurationMethod
   */
  @javax.annotation.Nullable
  public Object getConfigurationMethod() {
    return configurationMethod;
  }

  public void setConfigurationMethod(Object configurationMethod) {
    this.configurationMethod = configurationMethod;
  }


  public DatabaseRestApiPost databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * A database name to identify this connection.
   * @return databaseName
   */
  @javax.annotation.Nonnull
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public DatabaseRestApiPost encryptedExtra(String encryptedExtra) {
    this.encryptedExtra = encryptedExtra;
    return this;
  }

  /**
   * &lt;p&gt;JSON string containing additional connection configuration.&lt;br&gt;This is used to provide connection information for systems like Hive, Presto, and BigQuery, which do not conform to the username:password syntax normally used by SQLAlchemy.&lt;/p&gt;
   * @return encryptedExtra
   */
  @javax.annotation.Nullable
  public String getEncryptedExtra() {
    return encryptedExtra;
  }

  public void setEncryptedExtra(String encryptedExtra) {
    this.encryptedExtra = encryptedExtra;
  }


  public DatabaseRestApiPost engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * SQLAlchemy engine to use
   * @return engine
   */
  @javax.annotation.Nullable
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public DatabaseRestApiPost exposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
    return this;
  }

  /**
   * Expose this database to SQLLab
   * @return exposeInSqllab
   */
  @javax.annotation.Nullable
  public Boolean getExposeInSqllab() {
    return exposeInSqllab;
  }

  public void setExposeInSqllab(Boolean exposeInSqllab) {
    this.exposeInSqllab = exposeInSqllab;
  }


  public DatabaseRestApiPost extra(String extra) {
    this.extra = extra;
    return this;
  }

  /**
   * &lt;p&gt;JSON string containing extra configuration elements.&lt;br&gt;1. The &lt;code&gt;engine_params&lt;/code&gt; object gets unpacked into the &lt;a href&#x3D;\&quot;https://docs.sqlalchemy.org/en/latest/core/engines.html#sqlalchemy.create_engine\&quot;&gt;sqlalchemy.create_engine&lt;/a&gt; call, while the &lt;code&gt;metadata_params&lt;/code&gt; gets unpacked into the &lt;a href&#x3D;\&quot;https://docs.sqlalchemy.org/en/rel_1_0/core/metadata.html#sqlalchemy.schema.MetaData\&quot;&gt;sqlalchemy.MetaData&lt;/a&gt; call.&lt;br&gt;2. The &lt;code&gt;metadata_cache_timeout&lt;/code&gt; is a cache timeout setting in seconds for metadata fetch of this database. Specify it as &lt;strong&gt;\&quot;metadata_cache_timeout\&quot;: {\&quot;schema_cache_timeout\&quot;: 600, \&quot;table_cache_timeout\&quot;: 600}&lt;/strong&gt;. If unset, cache will not be enabled for the functionality. A timeout of 0 indicates that the cache never expires.&lt;br&gt;3. The &lt;code&gt;schemas_allowed_for_csv_upload&lt;/code&gt; is a comma separated list of schemas that CSVs are allowed to upload to. Specify it as &lt;strong&gt;\&quot;schemas_allowed_for_csv_upload\&quot;: [\&quot;public\&quot;, \&quot;csv_upload\&quot;]&lt;/strong&gt;. If database flavor does not support schema or any schema is allowed to be accessed, just leave the list empty&lt;br&gt;4. the &lt;code&gt;version&lt;/code&gt; field is a string specifying the this db&#39;s version. This should be used with Presto DBs so that the syntax is correct&lt;br&gt;5. The &lt;code&gt;allows_virtual_table_explore&lt;/code&gt; field is a boolean specifying whether or not the Explore button in SQL Lab results is shown.&lt;/p&gt;
   * @return extra
   */
  @javax.annotation.Nullable
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }


  public DatabaseRestApiPost forceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
    return this;
  }

  /**
   * When allowing CREATE TABLE AS option in SQL Lab, this option forces the table to be created in this schema
   * @return forceCtasSchema
   */
  @javax.annotation.Nullable
  public String getForceCtasSchema() {
    return forceCtasSchema;
  }

  public void setForceCtasSchema(String forceCtasSchema) {
    this.forceCtasSchema = forceCtasSchema;
  }


  public DatabaseRestApiPost impersonateUser(Boolean impersonateUser) {
    this.impersonateUser = impersonateUser;
    return this;
  }

  /**
   * If Presto, all the queries in SQL Lab are going to be executed as the currently logged on user who must have permission to run them.&lt;br/&gt;If Hive and hive.server2.enable.doAs is enabled, will run the queries as service account, but impersonate the currently logged on user via hive.server2.proxy.user property.
   * @return impersonateUser
   */
  @javax.annotation.Nullable
  public Boolean getImpersonateUser() {
    return impersonateUser;
  }

  public void setImpersonateUser(Boolean impersonateUser) {
    this.impersonateUser = impersonateUser;
  }


  public DatabaseRestApiPost parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DatabaseRestApiPost putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * DB-specific parameters for configuration
   * @return parameters
   */
  @javax.annotation.Nullable
  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }


  public DatabaseRestApiPost serverCert(String serverCert) {
    this.serverCert = serverCert;
    return this;
  }

  /**
   * &lt;p&gt;Optional CA_BUNDLE contents to validate HTTPS requests. Only available on certain database engines.&lt;/p&gt;
   * @return serverCert
   */
  @javax.annotation.Nullable
  public String getServerCert() {
    return serverCert;
  }

  public void setServerCert(String serverCert) {
    this.serverCert = serverCert;
  }


  public DatabaseRestApiPost sqlalchemyUri(String sqlalchemyUri) {
    this.sqlalchemyUri = sqlalchemyUri;
    return this;
  }

  /**
   * &lt;p&gt;Refer to the &lt;a href&#x3D;\&quot;https://docs.sqlalchemy.org/en/rel_1_2/core/engines.html#database-urls\&quot;&gt;SqlAlchemy docs&lt;/a&gt; for more information on how to structure your URI.&lt;/p&gt;
   * @return sqlalchemyUri
   */
  @javax.annotation.Nullable
  public String getSqlalchemyUri() {
    return sqlalchemyUri;
  }

  public void setSqlalchemyUri(String sqlalchemyUri) {
    this.sqlalchemyUri = sqlalchemyUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseRestApiPost databaseRestApiPost = (DatabaseRestApiPost) o;
    return Objects.equals(this.allowCsvUpload, databaseRestApiPost.allowCsvUpload) &&
        Objects.equals(this.allowCtas, databaseRestApiPost.allowCtas) &&
        Objects.equals(this.allowCvas, databaseRestApiPost.allowCvas) &&
        Objects.equals(this.allowDml, databaseRestApiPost.allowDml) &&
        Objects.equals(this.allowMultiSchemaMetadataFetch, databaseRestApiPost.allowMultiSchemaMetadataFetch) &&
        Objects.equals(this.allowRunAsync, databaseRestApiPost.allowRunAsync) &&
        Objects.equals(this.cacheTimeout, databaseRestApiPost.cacheTimeout) &&
        Objects.equals(this.configurationMethod, databaseRestApiPost.configurationMethod) &&
        Objects.equals(this.databaseName, databaseRestApiPost.databaseName) &&
        Objects.equals(this.encryptedExtra, databaseRestApiPost.encryptedExtra) &&
        Objects.equals(this.engine, databaseRestApiPost.engine) &&
        Objects.equals(this.exposeInSqllab, databaseRestApiPost.exposeInSqllab) &&
        Objects.equals(this.extra, databaseRestApiPost.extra) &&
        Objects.equals(this.forceCtasSchema, databaseRestApiPost.forceCtasSchema) &&
        Objects.equals(this.impersonateUser, databaseRestApiPost.impersonateUser) &&
        Objects.equals(this.parameters, databaseRestApiPost.parameters) &&
        Objects.equals(this.serverCert, databaseRestApiPost.serverCert) &&
        Objects.equals(this.sqlalchemyUri, databaseRestApiPost.sqlalchemyUri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCsvUpload, allowCtas, allowCvas, allowDml, allowMultiSchemaMetadataFetch, allowRunAsync, cacheTimeout, configurationMethod, databaseName, encryptedExtra, engine, exposeInSqllab, extra, forceCtasSchema, impersonateUser, parameters, serverCert, sqlalchemyUri);
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
    sb.append("class DatabaseRestApiPost {\n");
    sb.append("    allowCsvUpload: ").append(toIndentedString(allowCsvUpload)).append("\n");
    sb.append("    allowCtas: ").append(toIndentedString(allowCtas)).append("\n");
    sb.append("    allowCvas: ").append(toIndentedString(allowCvas)).append("\n");
    sb.append("    allowDml: ").append(toIndentedString(allowDml)).append("\n");
    sb.append("    allowMultiSchemaMetadataFetch: ").append(toIndentedString(allowMultiSchemaMetadataFetch)).append("\n");
    sb.append("    allowRunAsync: ").append(toIndentedString(allowRunAsync)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    configurationMethod: ").append(toIndentedString(configurationMethod)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    encryptedExtra: ").append(toIndentedString(encryptedExtra)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    exposeInSqllab: ").append(toIndentedString(exposeInSqllab)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    forceCtasSchema: ").append(toIndentedString(forceCtasSchema)).append("\n");
    sb.append("    impersonateUser: ").append(toIndentedString(impersonateUser)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
    sb.append("    sqlalchemyUri: ").append(toIndentedString(sqlalchemyUri)).append("\n");
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
    openapiFields.add("cache_timeout");
    openapiFields.add("configuration_method");
    openapiFields.add("database_name");
    openapiFields.add("encrypted_extra");
    openapiFields.add("engine");
    openapiFields.add("expose_in_sqllab");
    openapiFields.add("extra");
    openapiFields.add("force_ctas_schema");
    openapiFields.add("impersonate_user");
    openapiFields.add("parameters");
    openapiFields.add("server_cert");
    openapiFields.add("sqlalchemy_uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("database_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatabaseRestApiPost
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatabaseRestApiPost.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseRestApiPost is not found in the empty JSON string", DatabaseRestApiPost.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatabaseRestApiPost.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatabaseRestApiPost` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatabaseRestApiPost.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("encrypted_extra") != null && !jsonObj.get("encrypted_extra").isJsonNull()) && !jsonObj.get("encrypted_extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_extra").toString()));
      }
      if ((jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) && !jsonObj.get("engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine").toString()));
      }
      if ((jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) && !jsonObj.get("extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra").toString()));
      }
      if ((jsonObj.get("force_ctas_schema") != null && !jsonObj.get("force_ctas_schema").isJsonNull()) && !jsonObj.get("force_ctas_schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `force_ctas_schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("force_ctas_schema").toString()));
      }
      if ((jsonObj.get("server_cert") != null && !jsonObj.get("server_cert").isJsonNull()) && !jsonObj.get("server_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_cert").toString()));
      }
      if ((jsonObj.get("sqlalchemy_uri") != null && !jsonObj.get("sqlalchemy_uri").isJsonNull()) && !jsonObj.get("sqlalchemy_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sqlalchemy_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sqlalchemy_uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseRestApiPost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseRestApiPost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseRestApiPost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseRestApiPost.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseRestApiPost>() {
           @Override
           public void write(JsonWriter out, DatabaseRestApiPost value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatabaseRestApiPost read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatabaseRestApiPost given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatabaseRestApiPost
   * @throws IOException if the JSON string is invalid with respect to DatabaseRestApiPost
   */
  public static DatabaseRestApiPost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseRestApiPost.class);
  }

  /**
   * Convert an instance of DatabaseRestApiPost to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

