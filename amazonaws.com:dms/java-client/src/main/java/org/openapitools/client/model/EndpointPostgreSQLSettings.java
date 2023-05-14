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
import org.openapitools.client.model.PluginNameValue;

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
 * EndpointPostgreSQLSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EndpointPostgreSQLSettings {
  public static final String SERIALIZED_NAME_AFTER_CONNECT_SCRIPT = "AfterConnectScript";
  @SerializedName(SERIALIZED_NAME_AFTER_CONNECT_SCRIPT)
  private String afterConnectScript;

  public static final String SERIALIZED_NAME_CAPTURE_DDLS = "CaptureDdls";
  @SerializedName(SERIALIZED_NAME_CAPTURE_DDLS)
  private Boolean captureDdls;

  public static final String SERIALIZED_NAME_MAX_FILE_SIZE = "MaxFileSize";
  @SerializedName(SERIALIZED_NAME_MAX_FILE_SIZE)
  private Integer maxFileSize;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DDL_ARTIFACTS_SCHEMA = "DdlArtifactsSchema";
  @SerializedName(SERIALIZED_NAME_DDL_ARTIFACTS_SCHEMA)
  private String ddlArtifactsSchema;

  public static final String SERIALIZED_NAME_EXECUTE_TIMEOUT = "ExecuteTimeout";
  @SerializedName(SERIALIZED_NAME_EXECUTE_TIMEOUT)
  private Integer executeTimeout;

  public static final String SERIALIZED_NAME_FAIL_TASKS_ON_LOB_TRUNCATION = "FailTasksOnLobTruncation";
  @SerializedName(SERIALIZED_NAME_FAIL_TASKS_ON_LOB_TRUNCATION)
  private Boolean failTasksOnLobTruncation;

  public static final String SERIALIZED_NAME_HEARTBEAT_ENABLE = "HeartbeatEnable";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_ENABLE)
  private Boolean heartbeatEnable;

  public static final String SERIALIZED_NAME_HEARTBEAT_SCHEMA = "HeartbeatSchema";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_SCHEMA)
  private String heartbeatSchema;

  public static final String SERIALIZED_NAME_HEARTBEAT_FREQUENCY = "HeartbeatFrequency";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_FREQUENCY)
  private Integer heartbeatFrequency;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVER_NAME = "ServerName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SLOT_NAME = "SlotName";
  @SerializedName(SERIALIZED_NAME_SLOT_NAME)
  private String slotName;

  public static final String SERIALIZED_NAME_PLUGIN_NAME = "PluginName";
  @SerializedName(SERIALIZED_NAME_PLUGIN_NAME)
  private PluginNameValue pluginName;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN = "SecretsManagerAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN)
  private String secretsManagerAccessRoleArn;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID = "SecretsManagerSecretId";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID)
  private String secretsManagerSecretId;

  public static final String SERIALIZED_NAME_TRIM_SPACE_IN_CHAR = "TrimSpaceInChar";
  @SerializedName(SERIALIZED_NAME_TRIM_SPACE_IN_CHAR)
  private Boolean trimSpaceInChar;

  public static final String SERIALIZED_NAME_MAP_BOOLEAN_AS_BOOLEAN = "MapBooleanAsBoolean";
  @SerializedName(SERIALIZED_NAME_MAP_BOOLEAN_AS_BOOLEAN)
  private Boolean mapBooleanAsBoolean;

  public EndpointPostgreSQLSettings() {
  }

  public EndpointPostgreSQLSettings afterConnectScript(String afterConnectScript) {
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


  public EndpointPostgreSQLSettings captureDdls(Boolean captureDdls) {
    this.captureDdls = captureDdls;
    return this;
  }

  /**
   * Get captureDdls
   * @return captureDdls
   */
  @javax.annotation.Nullable
  public Boolean getCaptureDdls() {
    return captureDdls;
  }

  public void setCaptureDdls(Boolean captureDdls) {
    this.captureDdls = captureDdls;
  }


  public EndpointPostgreSQLSettings maxFileSize(Integer maxFileSize) {
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


  public EndpointPostgreSQLSettings databaseName(String databaseName) {
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


  public EndpointPostgreSQLSettings ddlArtifactsSchema(String ddlArtifactsSchema) {
    this.ddlArtifactsSchema = ddlArtifactsSchema;
    return this;
  }

  /**
   * Get ddlArtifactsSchema
   * @return ddlArtifactsSchema
   */
  @javax.annotation.Nullable
  public String getDdlArtifactsSchema() {
    return ddlArtifactsSchema;
  }

  public void setDdlArtifactsSchema(String ddlArtifactsSchema) {
    this.ddlArtifactsSchema = ddlArtifactsSchema;
  }


  public EndpointPostgreSQLSettings executeTimeout(Integer executeTimeout) {
    this.executeTimeout = executeTimeout;
    return this;
  }

  /**
   * Get executeTimeout
   * @return executeTimeout
   */
  @javax.annotation.Nullable
  public Integer getExecuteTimeout() {
    return executeTimeout;
  }

  public void setExecuteTimeout(Integer executeTimeout) {
    this.executeTimeout = executeTimeout;
  }


  public EndpointPostgreSQLSettings failTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
    this.failTasksOnLobTruncation = failTasksOnLobTruncation;
    return this;
  }

  /**
   * Get failTasksOnLobTruncation
   * @return failTasksOnLobTruncation
   */
  @javax.annotation.Nullable
  public Boolean getFailTasksOnLobTruncation() {
    return failTasksOnLobTruncation;
  }

  public void setFailTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
    this.failTasksOnLobTruncation = failTasksOnLobTruncation;
  }


  public EndpointPostgreSQLSettings heartbeatEnable(Boolean heartbeatEnable) {
    this.heartbeatEnable = heartbeatEnable;
    return this;
  }

  /**
   * Get heartbeatEnable
   * @return heartbeatEnable
   */
  @javax.annotation.Nullable
  public Boolean getHeartbeatEnable() {
    return heartbeatEnable;
  }

  public void setHeartbeatEnable(Boolean heartbeatEnable) {
    this.heartbeatEnable = heartbeatEnable;
  }


  public EndpointPostgreSQLSettings heartbeatSchema(String heartbeatSchema) {
    this.heartbeatSchema = heartbeatSchema;
    return this;
  }

  /**
   * Get heartbeatSchema
   * @return heartbeatSchema
   */
  @javax.annotation.Nullable
  public String getHeartbeatSchema() {
    return heartbeatSchema;
  }

  public void setHeartbeatSchema(String heartbeatSchema) {
    this.heartbeatSchema = heartbeatSchema;
  }


  public EndpointPostgreSQLSettings heartbeatFrequency(Integer heartbeatFrequency) {
    this.heartbeatFrequency = heartbeatFrequency;
    return this;
  }

  /**
   * Get heartbeatFrequency
   * @return heartbeatFrequency
   */
  @javax.annotation.Nullable
  public Integer getHeartbeatFrequency() {
    return heartbeatFrequency;
  }

  public void setHeartbeatFrequency(Integer heartbeatFrequency) {
    this.heartbeatFrequency = heartbeatFrequency;
  }


  public EndpointPostgreSQLSettings password(String password) {
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


  public EndpointPostgreSQLSettings port(Integer port) {
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


  public EndpointPostgreSQLSettings serverName(String serverName) {
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


  public EndpointPostgreSQLSettings username(String username) {
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


  public EndpointPostgreSQLSettings slotName(String slotName) {
    this.slotName = slotName;
    return this;
  }

  /**
   * Get slotName
   * @return slotName
   */
  @javax.annotation.Nullable
  public String getSlotName() {
    return slotName;
  }

  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }


  public EndpointPostgreSQLSettings pluginName(PluginNameValue pluginName) {
    this.pluginName = pluginName;
    return this;
  }

  /**
   * Get pluginName
   * @return pluginName
   */
  @javax.annotation.Nullable
  public PluginNameValue getPluginName() {
    return pluginName;
  }

  public void setPluginName(PluginNameValue pluginName) {
    this.pluginName = pluginName;
  }


  public EndpointPostgreSQLSettings secretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
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


  public EndpointPostgreSQLSettings secretsManagerSecretId(String secretsManagerSecretId) {
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


  public EndpointPostgreSQLSettings trimSpaceInChar(Boolean trimSpaceInChar) {
    this.trimSpaceInChar = trimSpaceInChar;
    return this;
  }

  /**
   * Get trimSpaceInChar
   * @return trimSpaceInChar
   */
  @javax.annotation.Nullable
  public Boolean getTrimSpaceInChar() {
    return trimSpaceInChar;
  }

  public void setTrimSpaceInChar(Boolean trimSpaceInChar) {
    this.trimSpaceInChar = trimSpaceInChar;
  }


  public EndpointPostgreSQLSettings mapBooleanAsBoolean(Boolean mapBooleanAsBoolean) {
    this.mapBooleanAsBoolean = mapBooleanAsBoolean;
    return this;
  }

  /**
   * Get mapBooleanAsBoolean
   * @return mapBooleanAsBoolean
   */
  @javax.annotation.Nullable
  public Boolean getMapBooleanAsBoolean() {
    return mapBooleanAsBoolean;
  }

  public void setMapBooleanAsBoolean(Boolean mapBooleanAsBoolean) {
    this.mapBooleanAsBoolean = mapBooleanAsBoolean;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPostgreSQLSettings endpointPostgreSQLSettings = (EndpointPostgreSQLSettings) o;
    return Objects.equals(this.afterConnectScript, endpointPostgreSQLSettings.afterConnectScript) &&
        Objects.equals(this.captureDdls, endpointPostgreSQLSettings.captureDdls) &&
        Objects.equals(this.maxFileSize, endpointPostgreSQLSettings.maxFileSize) &&
        Objects.equals(this.databaseName, endpointPostgreSQLSettings.databaseName) &&
        Objects.equals(this.ddlArtifactsSchema, endpointPostgreSQLSettings.ddlArtifactsSchema) &&
        Objects.equals(this.executeTimeout, endpointPostgreSQLSettings.executeTimeout) &&
        Objects.equals(this.failTasksOnLobTruncation, endpointPostgreSQLSettings.failTasksOnLobTruncation) &&
        Objects.equals(this.heartbeatEnable, endpointPostgreSQLSettings.heartbeatEnable) &&
        Objects.equals(this.heartbeatSchema, endpointPostgreSQLSettings.heartbeatSchema) &&
        Objects.equals(this.heartbeatFrequency, endpointPostgreSQLSettings.heartbeatFrequency) &&
        Objects.equals(this.password, endpointPostgreSQLSettings.password) &&
        Objects.equals(this.port, endpointPostgreSQLSettings.port) &&
        Objects.equals(this.serverName, endpointPostgreSQLSettings.serverName) &&
        Objects.equals(this.username, endpointPostgreSQLSettings.username) &&
        Objects.equals(this.slotName, endpointPostgreSQLSettings.slotName) &&
        Objects.equals(this.pluginName, endpointPostgreSQLSettings.pluginName) &&
        Objects.equals(this.secretsManagerAccessRoleArn, endpointPostgreSQLSettings.secretsManagerAccessRoleArn) &&
        Objects.equals(this.secretsManagerSecretId, endpointPostgreSQLSettings.secretsManagerSecretId) &&
        Objects.equals(this.trimSpaceInChar, endpointPostgreSQLSettings.trimSpaceInChar) &&
        Objects.equals(this.mapBooleanAsBoolean, endpointPostgreSQLSettings.mapBooleanAsBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterConnectScript, captureDdls, maxFileSize, databaseName, ddlArtifactsSchema, executeTimeout, failTasksOnLobTruncation, heartbeatEnable, heartbeatSchema, heartbeatFrequency, password, port, serverName, username, slotName, pluginName, secretsManagerAccessRoleArn, secretsManagerSecretId, trimSpaceInChar, mapBooleanAsBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPostgreSQLSettings {\n");
    sb.append("    afterConnectScript: ").append(toIndentedString(afterConnectScript)).append("\n");
    sb.append("    captureDdls: ").append(toIndentedString(captureDdls)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    ddlArtifactsSchema: ").append(toIndentedString(ddlArtifactsSchema)).append("\n");
    sb.append("    executeTimeout: ").append(toIndentedString(executeTimeout)).append("\n");
    sb.append("    failTasksOnLobTruncation: ").append(toIndentedString(failTasksOnLobTruncation)).append("\n");
    sb.append("    heartbeatEnable: ").append(toIndentedString(heartbeatEnable)).append("\n");
    sb.append("    heartbeatSchema: ").append(toIndentedString(heartbeatSchema)).append("\n");
    sb.append("    heartbeatFrequency: ").append(toIndentedString(heartbeatFrequency)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    secretsManagerAccessRoleArn: ").append(toIndentedString(secretsManagerAccessRoleArn)).append("\n");
    sb.append("    secretsManagerSecretId: ").append(toIndentedString(secretsManagerSecretId)).append("\n");
    sb.append("    trimSpaceInChar: ").append(toIndentedString(trimSpaceInChar)).append("\n");
    sb.append("    mapBooleanAsBoolean: ").append(toIndentedString(mapBooleanAsBoolean)).append("\n");
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
    openapiFields.add("CaptureDdls");
    openapiFields.add("MaxFileSize");
    openapiFields.add("DatabaseName");
    openapiFields.add("DdlArtifactsSchema");
    openapiFields.add("ExecuteTimeout");
    openapiFields.add("FailTasksOnLobTruncation");
    openapiFields.add("HeartbeatEnable");
    openapiFields.add("HeartbeatSchema");
    openapiFields.add("HeartbeatFrequency");
    openapiFields.add("Password");
    openapiFields.add("Port");
    openapiFields.add("ServerName");
    openapiFields.add("Username");
    openapiFields.add("SlotName");
    openapiFields.add("PluginName");
    openapiFields.add("SecretsManagerAccessRoleArn");
    openapiFields.add("SecretsManagerSecretId");
    openapiFields.add("TrimSpaceInChar");
    openapiFields.add("MapBooleanAsBoolean");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointPostgreSQLSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointPostgreSQLSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointPostgreSQLSettings is not found in the empty JSON string", EndpointPostgreSQLSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointPostgreSQLSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointPostgreSQLSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AfterConnectScript`
      if (jsonObj.get("AfterConnectScript") != null && !jsonObj.get("AfterConnectScript").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AfterConnectScript"));
      }
      // validate the optional field `CaptureDdls`
      if (jsonObj.get("CaptureDdls") != null && !jsonObj.get("CaptureDdls").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("CaptureDdls"));
      }
      // validate the optional field `MaxFileSize`
      if (jsonObj.get("MaxFileSize") != null && !jsonObj.get("MaxFileSize").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxFileSize"));
      }
      // validate the optional field `DatabaseName`
      if (jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseName"));
      }
      // validate the optional field `DdlArtifactsSchema`
      if (jsonObj.get("DdlArtifactsSchema") != null && !jsonObj.get("DdlArtifactsSchema").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DdlArtifactsSchema"));
      }
      // validate the optional field `ExecuteTimeout`
      if (jsonObj.get("ExecuteTimeout") != null && !jsonObj.get("ExecuteTimeout").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("ExecuteTimeout"));
      }
      // validate the optional field `FailTasksOnLobTruncation`
      if (jsonObj.get("FailTasksOnLobTruncation") != null && !jsonObj.get("FailTasksOnLobTruncation").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("FailTasksOnLobTruncation"));
      }
      // validate the optional field `HeartbeatEnable`
      if (jsonObj.get("HeartbeatEnable") != null && !jsonObj.get("HeartbeatEnable").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("HeartbeatEnable"));
      }
      // validate the optional field `HeartbeatSchema`
      if (jsonObj.get("HeartbeatSchema") != null && !jsonObj.get("HeartbeatSchema").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("HeartbeatSchema"));
      }
      // validate the optional field `HeartbeatFrequency`
      if (jsonObj.get("HeartbeatFrequency") != null && !jsonObj.get("HeartbeatFrequency").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("HeartbeatFrequency"));
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
      // validate the optional field `Username`
      if (jsonObj.get("Username") != null && !jsonObj.get("Username").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Username"));
      }
      // validate the optional field `SlotName`
      if (jsonObj.get("SlotName") != null && !jsonObj.get("SlotName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SlotName"));
      }
      // validate the optional field `PluginName`
      if (jsonObj.get("PluginName") != null && !jsonObj.get("PluginName").isJsonNull()) {
        PluginNameValue.validateJsonElement(jsonObj.get("PluginName"));
      }
      // validate the optional field `SecretsManagerAccessRoleArn`
      if (jsonObj.get("SecretsManagerAccessRoleArn") != null && !jsonObj.get("SecretsManagerAccessRoleArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SecretsManagerAccessRoleArn"));
      }
      // validate the optional field `SecretsManagerSecretId`
      if (jsonObj.get("SecretsManagerSecretId") != null && !jsonObj.get("SecretsManagerSecretId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SecretsManagerSecretId"));
      }
      // validate the optional field `TrimSpaceInChar`
      if (jsonObj.get("TrimSpaceInChar") != null && !jsonObj.get("TrimSpaceInChar").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("TrimSpaceInChar"));
      }
      // validate the optional field `MapBooleanAsBoolean`
      if (jsonObj.get("MapBooleanAsBoolean") != null && !jsonObj.get("MapBooleanAsBoolean").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("MapBooleanAsBoolean"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointPostgreSQLSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointPostgreSQLSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointPostgreSQLSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointPostgreSQLSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointPostgreSQLSettings>() {
           @Override
           public void write(JsonWriter out, EndpointPostgreSQLSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointPostgreSQLSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointPostgreSQLSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointPostgreSQLSettings
   * @throws IOException if the JSON string is invalid with respect to EndpointPostgreSQLSettings
   */
  public static EndpointPostgreSQLSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointPostgreSQLSettings.class);
  }

  /**
   * Convert an instance of EndpointPostgreSQLSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

