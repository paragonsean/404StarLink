/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import org.openapitools.client.model.TargetDbType;

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
 * Settings in JSON format for the source GCP MySQL endpoint.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GcpMySQLSettings {
  public static final String SERIALIZED_NAME_AFTER_CONNECT_SCRIPT = "AfterConnectScript";
  @SerializedName(SERIALIZED_NAME_AFTER_CONNECT_SCRIPT)
  private String afterConnectScript;

  public static final String SERIALIZED_NAME_CLEAN_SOURCE_METADATA_ON_MISMATCH = "CleanSourceMetadataOnMismatch";
  @SerializedName(SERIALIZED_NAME_CLEAN_SOURCE_METADATA_ON_MISMATCH)
  private Boolean cleanSourceMetadataOnMismatch;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_EVENTS_POLL_INTERVAL = "EventsPollInterval";
  @SerializedName(SERIALIZED_NAME_EVENTS_POLL_INTERVAL)
  private Integer eventsPollInterval;

  public static final String SERIALIZED_NAME_TARGET_DB_TYPE = "TargetDbType";
  @SerializedName(SERIALIZED_NAME_TARGET_DB_TYPE)
  private TargetDbType targetDbType;

  public static final String SERIALIZED_NAME_MAX_FILE_SIZE = "MaxFileSize";
  @SerializedName(SERIALIZED_NAME_MAX_FILE_SIZE)
  private Integer maxFileSize;

  public static final String SERIALIZED_NAME_PARALLEL_LOAD_THREADS = "ParallelLoadThreads";
  @SerializedName(SERIALIZED_NAME_PARALLEL_LOAD_THREADS)
  private Integer parallelLoadThreads;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVER_NAME = "ServerName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_SERVER_TIMEZONE = "ServerTimezone";
  @SerializedName(SERIALIZED_NAME_SERVER_TIMEZONE)
  private String serverTimezone;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN = "SecretsManagerAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN)
  private String secretsManagerAccessRoleArn;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID = "SecretsManagerSecretId";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID)
  private String secretsManagerSecretId;

  public GcpMySQLSettings() {
  }

  public GcpMySQLSettings afterConnectScript(String afterConnectScript) {
    this.afterConnectScript = afterConnectScript;
    return this;
  }

  /**
   * Get afterConnectScript
   * @return afterConnectScript
   */
  @javax.annotation.Nullable
  public String getAfterConnectScript() {
    return afterConnectScript;
  }

  public void setAfterConnectScript(String afterConnectScript) {
    this.afterConnectScript = afterConnectScript;
  }


  public GcpMySQLSettings cleanSourceMetadataOnMismatch(Boolean cleanSourceMetadataOnMismatch) {
    this.cleanSourceMetadataOnMismatch = cleanSourceMetadataOnMismatch;
    return this;
  }

  /**
   * Get cleanSourceMetadataOnMismatch
   * @return cleanSourceMetadataOnMismatch
   */
  @javax.annotation.Nullable
  public Boolean getCleanSourceMetadataOnMismatch() {
    return cleanSourceMetadataOnMismatch;
  }

  public void setCleanSourceMetadataOnMismatch(Boolean cleanSourceMetadataOnMismatch) {
    this.cleanSourceMetadataOnMismatch = cleanSourceMetadataOnMismatch;
  }


  public GcpMySQLSettings databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Get databaseName
   * @return databaseName
   */
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public GcpMySQLSettings eventsPollInterval(Integer eventsPollInterval) {
    this.eventsPollInterval = eventsPollInterval;
    return this;
  }

  /**
   * Get eventsPollInterval
   * @return eventsPollInterval
   */
  @javax.annotation.Nullable
  public Integer getEventsPollInterval() {
    return eventsPollInterval;
  }

  public void setEventsPollInterval(Integer eventsPollInterval) {
    this.eventsPollInterval = eventsPollInterval;
  }


  public GcpMySQLSettings targetDbType(TargetDbType targetDbType) {
    this.targetDbType = targetDbType;
    return this;
  }

  /**
   * Get targetDbType
   * @return targetDbType
   */
  @javax.annotation.Nullable
  public TargetDbType getTargetDbType() {
    return targetDbType;
  }

  public void setTargetDbType(TargetDbType targetDbType) {
    this.targetDbType = targetDbType;
  }


  public GcpMySQLSettings maxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

  /**
   * Get maxFileSize
   * @return maxFileSize
   */
  @javax.annotation.Nullable
  public Integer getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
  }


  public GcpMySQLSettings parallelLoadThreads(Integer parallelLoadThreads) {
    this.parallelLoadThreads = parallelLoadThreads;
    return this;
  }

  /**
   * Get parallelLoadThreads
   * @return parallelLoadThreads
   */
  @javax.annotation.Nullable
  public Integer getParallelLoadThreads() {
    return parallelLoadThreads;
  }

  public void setParallelLoadThreads(Integer parallelLoadThreads) {
    this.parallelLoadThreads = parallelLoadThreads;
  }


  public GcpMySQLSettings password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public GcpMySQLSettings port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public GcpMySQLSettings serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * Get serverName
   * @return serverName
   */
  @javax.annotation.Nullable
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public GcpMySQLSettings serverTimezone(String serverTimezone) {
    this.serverTimezone = serverTimezone;
    return this;
  }

  /**
   * Get serverTimezone
   * @return serverTimezone
   */
  @javax.annotation.Nullable
  public String getServerTimezone() {
    return serverTimezone;
  }

  public void setServerTimezone(String serverTimezone) {
    this.serverTimezone = serverTimezone;
  }


  public GcpMySQLSettings username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public GcpMySQLSettings secretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
    this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
    return this;
  }

  /**
   * Get secretsManagerAccessRoleArn
   * @return secretsManagerAccessRoleArn
   */
  @javax.annotation.Nullable
  public String getSecretsManagerAccessRoleArn() {
    return secretsManagerAccessRoleArn;
  }

  public void setSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
    this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
  }


  public GcpMySQLSettings secretsManagerSecretId(String secretsManagerSecretId) {
    this.secretsManagerSecretId = secretsManagerSecretId;
    return this;
  }

  /**
   * Get secretsManagerSecretId
   * @return secretsManagerSecretId
   */
  @javax.annotation.Nullable
  public String getSecretsManagerSecretId() {
    return secretsManagerSecretId;
  }

  public void setSecretsManagerSecretId(String secretsManagerSecretId) {
    this.secretsManagerSecretId = secretsManagerSecretId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcpMySQLSettings gcpMySQLSettings = (GcpMySQLSettings) o;
    return Objects.equals(this.afterConnectScript, gcpMySQLSettings.afterConnectScript) &&
        Objects.equals(this.cleanSourceMetadataOnMismatch, gcpMySQLSettings.cleanSourceMetadataOnMismatch) &&
        Objects.equals(this.databaseName, gcpMySQLSettings.databaseName) &&
        Objects.equals(this.eventsPollInterval, gcpMySQLSettings.eventsPollInterval) &&
        Objects.equals(this.targetDbType, gcpMySQLSettings.targetDbType) &&
        Objects.equals(this.maxFileSize, gcpMySQLSettings.maxFileSize) &&
        Objects.equals(this.parallelLoadThreads, gcpMySQLSettings.parallelLoadThreads) &&
        Objects.equals(this.password, gcpMySQLSettings.password) &&
        Objects.equals(this.port, gcpMySQLSettings.port) &&
        Objects.equals(this.serverName, gcpMySQLSettings.serverName) &&
        Objects.equals(this.serverTimezone, gcpMySQLSettings.serverTimezone) &&
        Objects.equals(this.username, gcpMySQLSettings.username) &&
        Objects.equals(this.secretsManagerAccessRoleArn, gcpMySQLSettings.secretsManagerAccessRoleArn) &&
        Objects.equals(this.secretsManagerSecretId, gcpMySQLSettings.secretsManagerSecretId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterConnectScript, cleanSourceMetadataOnMismatch, databaseName, eventsPollInterval, targetDbType, maxFileSize, parallelLoadThreads, password, port, serverName, serverTimezone, username, secretsManagerAccessRoleArn, secretsManagerSecretId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcpMySQLSettings {\n");
    sb.append("    afterConnectScript: ").append(toIndentedString(afterConnectScript)).append("\n");
    sb.append("    cleanSourceMetadataOnMismatch: ").append(toIndentedString(cleanSourceMetadataOnMismatch)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    eventsPollInterval: ").append(toIndentedString(eventsPollInterval)).append("\n");
    sb.append("    targetDbType: ").append(toIndentedString(targetDbType)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    parallelLoadThreads: ").append(toIndentedString(parallelLoadThreads)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    serverTimezone: ").append(toIndentedString(serverTimezone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    secretsManagerAccessRoleArn: ").append(toIndentedString(secretsManagerAccessRoleArn)).append("\n");
    sb.append("    secretsManagerSecretId: ").append(toIndentedString(secretsManagerSecretId)).append("\n");
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
    openapiFields.add("AfterConnectScript");
    openapiFields.add("CleanSourceMetadataOnMismatch");
    openapiFields.add("DatabaseName");
    openapiFields.add("EventsPollInterval");
    openapiFields.add("TargetDbType");
    openapiFields.add("MaxFileSize");
    openapiFields.add("ParallelLoadThreads");
    openapiFields.add("Password");
    openapiFields.add("Port");
    openapiFields.add("ServerName");
    openapiFields.add("ServerTimezone");
    openapiFields.add("Username");
    openapiFields.add("SecretsManagerAccessRoleArn");
    openapiFields.add("SecretsManagerSecretId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GcpMySQLSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GcpMySQLSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcpMySQLSettings is not found in the empty JSON string", GcpMySQLSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GcpMySQLSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcpMySQLSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AfterConnectScript`
      if (jsonObj.get("AfterConnectScript") != null && !jsonObj.get("AfterConnectScript").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AfterConnectScript"));
      }
      // validate the optional field `CleanSourceMetadataOnMismatch`
      if (jsonObj.get("CleanSourceMetadataOnMismatch") != null && !jsonObj.get("CleanSourceMetadataOnMismatch").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CleanSourceMetadataOnMismatch"));
      }
      // validate the optional field `DatabaseName`
      if (jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseName"));
      }
      // validate the optional field `EventsPollInterval`
      if (jsonObj.get("EventsPollInterval") != null && !jsonObj.get("EventsPollInterval").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("EventsPollInterval"));
      }
      // validate the optional field `TargetDbType`
      if (jsonObj.get("TargetDbType") != null && !jsonObj.get("TargetDbType").isJsonNull()) {
        TargetDbType.validateJsonElement(jsonObj.get("TargetDbType"));
      }
      // validate the optional field `MaxFileSize`
      if (jsonObj.get("MaxFileSize") != null && !jsonObj.get("MaxFileSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxFileSize"));
      }
      // validate the optional field `ParallelLoadThreads`
      if (jsonObj.get("ParallelLoadThreads") != null && !jsonObj.get("ParallelLoadThreads").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ParallelLoadThreads"));
      }
      // validate the optional field `Password`
      if (jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Password"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Port"));
      }
      // validate the optional field `ServerName`
      if (jsonObj.get("ServerName") != null && !jsonObj.get("ServerName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServerName"));
      }
      // validate the optional field `ServerTimezone`
      if (jsonObj.get("ServerTimezone") != null && !jsonObj.get("ServerTimezone").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServerTimezone"));
      }
      // validate the optional field `Username`
      if (jsonObj.get("Username") != null && !jsonObj.get("Username").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Username"));
      }
      // validate the optional field `SecretsManagerAccessRoleArn`
      if (jsonObj.get("SecretsManagerAccessRoleArn") != null && !jsonObj.get("SecretsManagerAccessRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SecretsManagerAccessRoleArn"));
      }
      // validate the optional field `SecretsManagerSecretId`
      if (jsonObj.get("SecretsManagerSecretId") != null && !jsonObj.get("SecretsManagerSecretId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SecretsManagerSecretId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcpMySQLSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcpMySQLSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcpMySQLSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcpMySQLSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<GcpMySQLSettings>() {
           @Override
           public void write(JsonWriter out, GcpMySQLSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcpMySQLSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GcpMySQLSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GcpMySQLSettings
   * @throws IOException if the JSON string is invalid with respect to GcpMySQLSettings
   */
  public static GcpMySQLSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcpMySQLSettings.class);
  }

  /**
   * Convert an instance of GcpMySQLSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

