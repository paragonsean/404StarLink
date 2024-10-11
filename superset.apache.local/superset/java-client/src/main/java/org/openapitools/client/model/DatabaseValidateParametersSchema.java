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
 * DatabaseValidateParametersSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DatabaseValidateParametersSchema {
  public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
  private Object configurationMethod = null;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_ENCRYPTED_EXTRA = "encrypted_extra";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_EXTRA)
  private String encryptedExtra;

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private String extra;

  public static final String SERIALIZED_NAME_IMPERSONATE_USER = "impersonate_user";
  @SerializedName(SERIALIZED_NAME_IMPERSONATE_USER)
  private Boolean impersonateUser;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, Object> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_SERVER_CERT = "server_cert";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT)
  private String serverCert;

  public DatabaseValidateParametersSchema() {
  }

  public DatabaseValidateParametersSchema configurationMethod(Object configurationMethod) {
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


  public DatabaseValidateParametersSchema databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * A database name to identify this connection.
   * @return databaseName
   */
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public DatabaseValidateParametersSchema encryptedExtra(String encryptedExtra) {
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


  public DatabaseValidateParametersSchema engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * SQLAlchemy engine to use
   * @return engine
   */
  @javax.annotation.Nonnull
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }


  public DatabaseValidateParametersSchema extra(String extra) {
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


  public DatabaseValidateParametersSchema impersonateUser(Boolean impersonateUser) {
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


  public DatabaseValidateParametersSchema parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DatabaseValidateParametersSchema putParametersItem(String key, Object parametersItem) {
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


  public DatabaseValidateParametersSchema serverCert(String serverCert) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseValidateParametersSchema databaseValidateParametersSchema = (DatabaseValidateParametersSchema) o;
    return Objects.equals(this.configurationMethod, databaseValidateParametersSchema.configurationMethod) &&
        Objects.equals(this.databaseName, databaseValidateParametersSchema.databaseName) &&
        Objects.equals(this.encryptedExtra, databaseValidateParametersSchema.encryptedExtra) &&
        Objects.equals(this.engine, databaseValidateParametersSchema.engine) &&
        Objects.equals(this.extra, databaseValidateParametersSchema.extra) &&
        Objects.equals(this.impersonateUser, databaseValidateParametersSchema.impersonateUser) &&
        Objects.equals(this.parameters, databaseValidateParametersSchema.parameters) &&
        Objects.equals(this.serverCert, databaseValidateParametersSchema.serverCert);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationMethod, databaseName, encryptedExtra, engine, extra, impersonateUser, parameters, serverCert);
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
    sb.append("class DatabaseValidateParametersSchema {\n");
    sb.append("    configurationMethod: ").append(toIndentedString(configurationMethod)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    encryptedExtra: ").append(toIndentedString(encryptedExtra)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    impersonateUser: ").append(toIndentedString(impersonateUser)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    serverCert: ").append(toIndentedString(serverCert)).append("\n");
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
    openapiFields.add("configuration_method");
    openapiFields.add("database_name");
    openapiFields.add("encrypted_extra");
    openapiFields.add("engine");
    openapiFields.add("extra");
    openapiFields.add("impersonate_user");
    openapiFields.add("parameters");
    openapiFields.add("server_cert");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configuration_method");
    openapiRequiredFields.add("engine");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatabaseValidateParametersSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatabaseValidateParametersSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatabaseValidateParametersSchema is not found in the empty JSON string", DatabaseValidateParametersSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatabaseValidateParametersSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatabaseValidateParametersSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatabaseValidateParametersSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull()) && !jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("encrypted_extra") != null && !jsonObj.get("encrypted_extra").isJsonNull()) && !jsonObj.get("encrypted_extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encrypted_extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encrypted_extra").toString()));
      }
      if (!jsonObj.get("engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine").toString()));
      }
      if ((jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) && !jsonObj.get("extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra").toString()));
      }
      if ((jsonObj.get("server_cert") != null && !jsonObj.get("server_cert").isJsonNull()) && !jsonObj.get("server_cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_cert").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatabaseValidateParametersSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatabaseValidateParametersSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatabaseValidateParametersSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatabaseValidateParametersSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DatabaseValidateParametersSchema>() {
           @Override
           public void write(JsonWriter out, DatabaseValidateParametersSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatabaseValidateParametersSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatabaseValidateParametersSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatabaseValidateParametersSchema
   * @throws IOException if the JSON string is invalid with respect to DatabaseValidateParametersSchema
   */
  public static DatabaseValidateParametersSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatabaseValidateParametersSchema.class);
  }

  /**
   * Convert an instance of DatabaseValidateParametersSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

