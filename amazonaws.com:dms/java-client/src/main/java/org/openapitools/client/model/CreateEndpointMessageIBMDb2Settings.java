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
 * CreateEndpointMessageIBMDb2Settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateEndpointMessageIBMDb2Settings {
  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SERVER_NAME = "ServerName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_SET_DATA_CAPTURE_CHANGES = "SetDataCaptureChanges";
  @SerializedName(SERIALIZED_NAME_SET_DATA_CAPTURE_CHANGES)
  private Boolean setDataCaptureChanges;

  public static final String SERIALIZED_NAME_CURRENT_LSN = "CurrentLsn";
  @SerializedName(SERIALIZED_NAME_CURRENT_LSN)
  private String currentLsn;

  public static final String SERIALIZED_NAME_MAX_K_BYTES_PER_READ = "MaxKBytesPerRead";
  @SerializedName(SERIALIZED_NAME_MAX_K_BYTES_PER_READ)
  private Integer maxKBytesPerRead;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN = "SecretsManagerAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN)
  private String secretsManagerAccessRoleArn;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID = "SecretsManagerSecretId";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID)
  private String secretsManagerSecretId;

  public CreateEndpointMessageIBMDb2Settings() {
  }

  public CreateEndpointMessageIBMDb2Settings databaseName(String databaseName) {
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


  public CreateEndpointMessageIBMDb2Settings password(String password) {
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


  public CreateEndpointMessageIBMDb2Settings port(Integer port) {
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


  public CreateEndpointMessageIBMDb2Settings serverName(String serverName) {
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


  public CreateEndpointMessageIBMDb2Settings setDataCaptureChanges(Boolean setDataCaptureChanges) {
    this.setDataCaptureChanges = setDataCaptureChanges;
    return this;
  }

  /**
   * Get setDataCaptureChanges
   * @return setDataCaptureChanges
   */
  @javax.annotation.Nullable
  public Boolean getSetDataCaptureChanges() {
    return setDataCaptureChanges;
  }

  public void setSetDataCaptureChanges(Boolean setDataCaptureChanges) {
    this.setDataCaptureChanges = setDataCaptureChanges;
  }


  public CreateEndpointMessageIBMDb2Settings currentLsn(String currentLsn) {
    this.currentLsn = currentLsn;
    return this;
  }

  /**
   * Get currentLsn
   * @return currentLsn
   */
  @javax.annotation.Nullable
  public String getCurrentLsn() {
    return currentLsn;
  }

  public void setCurrentLsn(String currentLsn) {
    this.currentLsn = currentLsn;
  }


  public CreateEndpointMessageIBMDb2Settings maxKBytesPerRead(Integer maxKBytesPerRead) {
    this.maxKBytesPerRead = maxKBytesPerRead;
    return this;
  }

  /**
   * Get maxKBytesPerRead
   * @return maxKBytesPerRead
   */
  @javax.annotation.Nullable
  public Integer getMaxKBytesPerRead() {
    return maxKBytesPerRead;
  }

  public void setMaxKBytesPerRead(Integer maxKBytesPerRead) {
    this.maxKBytesPerRead = maxKBytesPerRead;
  }


  public CreateEndpointMessageIBMDb2Settings username(String username) {
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


  public CreateEndpointMessageIBMDb2Settings secretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
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


  public CreateEndpointMessageIBMDb2Settings secretsManagerSecretId(String secretsManagerSecretId) {
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
    CreateEndpointMessageIBMDb2Settings createEndpointMessageIBMDb2Settings = (CreateEndpointMessageIBMDb2Settings) o;
    return Objects.equals(this.databaseName, createEndpointMessageIBMDb2Settings.databaseName) &&
        Objects.equals(this.password, createEndpointMessageIBMDb2Settings.password) &&
        Objects.equals(this.port, createEndpointMessageIBMDb2Settings.port) &&
        Objects.equals(this.serverName, createEndpointMessageIBMDb2Settings.serverName) &&
        Objects.equals(this.setDataCaptureChanges, createEndpointMessageIBMDb2Settings.setDataCaptureChanges) &&
        Objects.equals(this.currentLsn, createEndpointMessageIBMDb2Settings.currentLsn) &&
        Objects.equals(this.maxKBytesPerRead, createEndpointMessageIBMDb2Settings.maxKBytesPerRead) &&
        Objects.equals(this.username, createEndpointMessageIBMDb2Settings.username) &&
        Objects.equals(this.secretsManagerAccessRoleArn, createEndpointMessageIBMDb2Settings.secretsManagerAccessRoleArn) &&
        Objects.equals(this.secretsManagerSecretId, createEndpointMessageIBMDb2Settings.secretsManagerSecretId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, password, port, serverName, setDataCaptureChanges, currentLsn, maxKBytesPerRead, username, secretsManagerAccessRoleArn, secretsManagerSecretId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEndpointMessageIBMDb2Settings {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    setDataCaptureChanges: ").append(toIndentedString(setDataCaptureChanges)).append("\n");
    sb.append("    currentLsn: ").append(toIndentedString(currentLsn)).append("\n");
    sb.append("    maxKBytesPerRead: ").append(toIndentedString(maxKBytesPerRead)).append("\n");
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
    openapiFields.add("DatabaseName");
    openapiFields.add("Password");
    openapiFields.add("Port");
    openapiFields.add("ServerName");
    openapiFields.add("SetDataCaptureChanges");
    openapiFields.add("CurrentLsn");
    openapiFields.add("MaxKBytesPerRead");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateEndpointMessageIBMDb2Settings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEndpointMessageIBMDb2Settings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEndpointMessageIBMDb2Settings is not found in the empty JSON string", CreateEndpointMessageIBMDb2Settings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEndpointMessageIBMDb2Settings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEndpointMessageIBMDb2Settings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `DatabaseName`
      if (jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseName"));
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
      // validate the optional field `SetDataCaptureChanges`
      if (jsonObj.get("SetDataCaptureChanges") != null && !jsonObj.get("SetDataCaptureChanges").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("SetDataCaptureChanges"));
      }
      // validate the optional field `CurrentLsn`
      if (jsonObj.get("CurrentLsn") != null && !jsonObj.get("CurrentLsn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CurrentLsn"));
      }
      // validate the optional field `MaxKBytesPerRead`
      if (jsonObj.get("MaxKBytesPerRead") != null && !jsonObj.get("MaxKBytesPerRead").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MaxKBytesPerRead"));
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
       if (!CreateEndpointMessageIBMDb2Settings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEndpointMessageIBMDb2Settings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEndpointMessageIBMDb2Settings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEndpointMessageIBMDb2Settings.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEndpointMessageIBMDb2Settings>() {
           @Override
           public void write(JsonWriter out, CreateEndpointMessageIBMDb2Settings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEndpointMessageIBMDb2Settings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEndpointMessageIBMDb2Settings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEndpointMessageIBMDb2Settings
   * @throws IOException if the JSON string is invalid with respect to CreateEndpointMessageIBMDb2Settings
   */
  public static CreateEndpointMessageIBMDb2Settings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEndpointMessageIBMDb2Settings.class);
  }

  /**
   * Convert an instance of CreateEndpointMessageIBMDb2Settings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

