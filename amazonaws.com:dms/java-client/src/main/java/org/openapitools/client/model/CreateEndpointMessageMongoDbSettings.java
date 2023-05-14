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
import org.openapitools.client.model.AuthMechanismValue;
import org.openapitools.client.model.AuthTypeValue;
import org.openapitools.client.model.NestingLevelValue;

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
 * CreateEndpointMessageMongoDbSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateEndpointMessageMongoDbSettings {
  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SERVER_NAME = "ServerName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "AuthType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeValue authType;

  public static final String SERIALIZED_NAME_AUTH_MECHANISM = "AuthMechanism";
  @SerializedName(SERIALIZED_NAME_AUTH_MECHANISM)
  private AuthMechanismValue authMechanism;

  public static final String SERIALIZED_NAME_NESTING_LEVEL = "NestingLevel";
  @SerializedName(SERIALIZED_NAME_NESTING_LEVEL)
  private NestingLevelValue nestingLevel;

  public static final String SERIALIZED_NAME_EXTRACT_DOC_ID = "ExtractDocId";
  @SerializedName(SERIALIZED_NAME_EXTRACT_DOC_ID)
  private String extractDocId;

  public static final String SERIALIZED_NAME_DOCS_TO_INVESTIGATE = "DocsToInvestigate";
  @SerializedName(SERIALIZED_NAME_DOCS_TO_INVESTIGATE)
  private String docsToInvestigate;

  public static final String SERIALIZED_NAME_AUTH_SOURCE = "AuthSource";
  @SerializedName(SERIALIZED_NAME_AUTH_SOURCE)
  private String authSource;

  public static final String SERIALIZED_NAME_KMS_KEY_ID = "KmsKeyId";
  @SerializedName(SERIALIZED_NAME_KMS_KEY_ID)
  private String kmsKeyId;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN = "SecretsManagerAccessRoleArn";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_ACCESS_ROLE_ARN)
  private String secretsManagerAccessRoleArn;

  public static final String SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID = "SecretsManagerSecretId";
  @SerializedName(SERIALIZED_NAME_SECRETS_MANAGER_SECRET_ID)
  private String secretsManagerSecretId;

  public CreateEndpointMessageMongoDbSettings() {
  }

  public CreateEndpointMessageMongoDbSettings username(String username) {
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


  public CreateEndpointMessageMongoDbSettings password(String password) {
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


  public CreateEndpointMessageMongoDbSettings serverName(String serverName) {
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


  public CreateEndpointMessageMongoDbSettings port(Integer port) {
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


  public CreateEndpointMessageMongoDbSettings databaseName(String databaseName) {
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


  public CreateEndpointMessageMongoDbSettings authType(AuthTypeValue authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   * @return authType
   */
  @javax.annotation.Nullable
  public AuthTypeValue getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeValue authType) {
    this.authType = authType;
  }


  public CreateEndpointMessageMongoDbSettings authMechanism(AuthMechanismValue authMechanism) {
    this.authMechanism = authMechanism;
    return this;
  }

  /**
   * Get authMechanism
   * @return authMechanism
   */
  @javax.annotation.Nullable
  public AuthMechanismValue getAuthMechanism() {
    return authMechanism;
  }

  public void setAuthMechanism(AuthMechanismValue authMechanism) {
    this.authMechanism = authMechanism;
  }


  public CreateEndpointMessageMongoDbSettings nestingLevel(NestingLevelValue nestingLevel) {
    this.nestingLevel = nestingLevel;
    return this;
  }

  /**
   * Get nestingLevel
   * @return nestingLevel
   */
  @javax.annotation.Nullable
  public NestingLevelValue getNestingLevel() {
    return nestingLevel;
  }

  public void setNestingLevel(NestingLevelValue nestingLevel) {
    this.nestingLevel = nestingLevel;
  }


  public CreateEndpointMessageMongoDbSettings extractDocId(String extractDocId) {
    this.extractDocId = extractDocId;
    return this;
  }

  /**
   * Get extractDocId
   * @return extractDocId
   */
  @javax.annotation.Nullable
  public String getExtractDocId() {
    return extractDocId;
  }

  public void setExtractDocId(String extractDocId) {
    this.extractDocId = extractDocId;
  }


  public CreateEndpointMessageMongoDbSettings docsToInvestigate(String docsToInvestigate) {
    this.docsToInvestigate = docsToInvestigate;
    return this;
  }

  /**
   * Get docsToInvestigate
   * @return docsToInvestigate
   */
  @javax.annotation.Nullable
  public String getDocsToInvestigate() {
    return docsToInvestigate;
  }

  public void setDocsToInvestigate(String docsToInvestigate) {
    this.docsToInvestigate = docsToInvestigate;
  }


  public CreateEndpointMessageMongoDbSettings authSource(String authSource) {
    this.authSource = authSource;
    return this;
  }

  /**
   * Get authSource
   * @return authSource
   */
  @javax.annotation.Nullable
  public String getAuthSource() {
    return authSource;
  }

  public void setAuthSource(String authSource) {
    this.authSource = authSource;
  }


  public CreateEndpointMessageMongoDbSettings kmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
    return this;
  }

  /**
   * Get kmsKeyId
   * @return kmsKeyId
   */
  @javax.annotation.Nullable
  public String getKmsKeyId() {
    return kmsKeyId;
  }

  public void setKmsKeyId(String kmsKeyId) {
    this.kmsKeyId = kmsKeyId;
  }


  public CreateEndpointMessageMongoDbSettings secretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
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


  public CreateEndpointMessageMongoDbSettings secretsManagerSecretId(String secretsManagerSecretId) {
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
    CreateEndpointMessageMongoDbSettings createEndpointMessageMongoDbSettings = (CreateEndpointMessageMongoDbSettings) o;
    return Objects.equals(this.username, createEndpointMessageMongoDbSettings.username) &&
        Objects.equals(this.password, createEndpointMessageMongoDbSettings.password) &&
        Objects.equals(this.serverName, createEndpointMessageMongoDbSettings.serverName) &&
        Objects.equals(this.port, createEndpointMessageMongoDbSettings.port) &&
        Objects.equals(this.databaseName, createEndpointMessageMongoDbSettings.databaseName) &&
        Objects.equals(this.authType, createEndpointMessageMongoDbSettings.authType) &&
        Objects.equals(this.authMechanism, createEndpointMessageMongoDbSettings.authMechanism) &&
        Objects.equals(this.nestingLevel, createEndpointMessageMongoDbSettings.nestingLevel) &&
        Objects.equals(this.extractDocId, createEndpointMessageMongoDbSettings.extractDocId) &&
        Objects.equals(this.docsToInvestigate, createEndpointMessageMongoDbSettings.docsToInvestigate) &&
        Objects.equals(this.authSource, createEndpointMessageMongoDbSettings.authSource) &&
        Objects.equals(this.kmsKeyId, createEndpointMessageMongoDbSettings.kmsKeyId) &&
        Objects.equals(this.secretsManagerAccessRoleArn, createEndpointMessageMongoDbSettings.secretsManagerAccessRoleArn) &&
        Objects.equals(this.secretsManagerSecretId, createEndpointMessageMongoDbSettings.secretsManagerSecretId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, serverName, port, databaseName, authType, authMechanism, nestingLevel, extractDocId, docsToInvestigate, authSource, kmsKeyId, secretsManagerAccessRoleArn, secretsManagerSecretId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEndpointMessageMongoDbSettings {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authMechanism: ").append(toIndentedString(authMechanism)).append("\n");
    sb.append("    nestingLevel: ").append(toIndentedString(nestingLevel)).append("\n");
    sb.append("    extractDocId: ").append(toIndentedString(extractDocId)).append("\n");
    sb.append("    docsToInvestigate: ").append(toIndentedString(docsToInvestigate)).append("\n");
    sb.append("    authSource: ").append(toIndentedString(authSource)).append("\n");
    sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
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
    openapiFields.add("Username");
    openapiFields.add("Password");
    openapiFields.add("ServerName");
    openapiFields.add("Port");
    openapiFields.add("DatabaseName");
    openapiFields.add("AuthType");
    openapiFields.add("AuthMechanism");
    openapiFields.add("NestingLevel");
    openapiFields.add("ExtractDocId");
    openapiFields.add("DocsToInvestigate");
    openapiFields.add("AuthSource");
    openapiFields.add("KmsKeyId");
    openapiFields.add("SecretsManagerAccessRoleArn");
    openapiFields.add("SecretsManagerSecretId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEndpointMessageMongoDbSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEndpointMessageMongoDbSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEndpointMessageMongoDbSettings is not found in the empty JSON string", CreateEndpointMessageMongoDbSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEndpointMessageMongoDbSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEndpointMessageMongoDbSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Username`
      if (jsonObj.get("Username") != null && !jsonObj.get("Username").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Username"));
      }
      // validate the optional field `Password`
      if (jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Password"));
      }
      // validate the optional field `ServerName`
      if (jsonObj.get("ServerName") != null && !jsonObj.get("ServerName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ServerName"));
      }
      // validate the optional field `Port`
      if (jsonObj.get("Port") != null && !jsonObj.get("Port").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("Port"));
      }
      // validate the optional field `DatabaseName`
      if (jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DatabaseName"));
      }
      // validate the optional field `AuthType`
      if (jsonObj.get("AuthType") != null && !jsonObj.get("AuthType").isJsonNull()) {
        AuthTypeValue.validateJsonElement(jsonObj.get("AuthType"));
      }
      // validate the optional field `AuthMechanism`
      if (jsonObj.get("AuthMechanism") != null && !jsonObj.get("AuthMechanism").isJsonNull()) {
        AuthMechanismValue.validateJsonElement(jsonObj.get("AuthMechanism"));
      }
      // validate the optional field `NestingLevel`
      if (jsonObj.get("NestingLevel") != null && !jsonObj.get("NestingLevel").isJsonNull()) {
        NestingLevelValue.validateJsonElement(jsonObj.get("NestingLevel"));
      }
      // validate the optional field `ExtractDocId`
      if (jsonObj.get("ExtractDocId") != null && !jsonObj.get("ExtractDocId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("ExtractDocId"));
      }
      // validate the optional field `DocsToInvestigate`
      if (jsonObj.get("DocsToInvestigate") != null && !jsonObj.get("DocsToInvestigate").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("DocsToInvestigate"));
      }
      // validate the optional field `AuthSource`
      if (jsonObj.get("AuthSource") != null && !jsonObj.get("AuthSource").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AuthSource"));
      }
      // validate the optional field `KmsKeyId`
      if (jsonObj.get("KmsKeyId") != null && !jsonObj.get("KmsKeyId").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("KmsKeyId"));
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
       if (!CreateEndpointMessageMongoDbSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEndpointMessageMongoDbSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEndpointMessageMongoDbSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEndpointMessageMongoDbSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEndpointMessageMongoDbSettings>() {
           @Override
           public void write(JsonWriter out, CreateEndpointMessageMongoDbSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEndpointMessageMongoDbSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEndpointMessageMongoDbSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEndpointMessageMongoDbSettings
   * @throws IOException if the JSON string is invalid with respect to CreateEndpointMessageMongoDbSettings
   */
  public static CreateEndpointMessageMongoDbSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEndpointMessageMongoDbSettings.class);
  }

  /**
   * Convert an instance of CreateEndpointMessageMongoDbSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

