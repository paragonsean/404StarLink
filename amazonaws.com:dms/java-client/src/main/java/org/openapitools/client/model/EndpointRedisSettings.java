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
import org.openapitools.client.model.RedisAuthTypeValue;
import org.openapitools.client.model.SslSecurityProtocolValue;

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
 * EndpointRedisSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EndpointRedisSettings {
  public static final String SERIALIZED_NAME_SERVER_NAME = "ServerName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SSL_SECURITY_PROTOCOL = "SslSecurityProtocol";
  @SerializedName(SERIALIZED_NAME_SSL_SECURITY_PROTOCOL)
  private SslSecurityProtocolValue sslSecurityProtocol;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "AuthType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private RedisAuthTypeValue authType;

  public static final String SERIALIZED_NAME_AUTH_USER_NAME = "AuthUserName";
  @SerializedName(SERIALIZED_NAME_AUTH_USER_NAME)
  private String authUserName;

  public static final String SERIALIZED_NAME_AUTH_PASSWORD = "AuthPassword";
  @SerializedName(SERIALIZED_NAME_AUTH_PASSWORD)
  private String authPassword;

  public static final String SERIALIZED_NAME_SSL_CA_CERTIFICATE_ARN = "SslCaCertificateArn";
  @SerializedName(SERIALIZED_NAME_SSL_CA_CERTIFICATE_ARN)
  private String sslCaCertificateArn;

  public EndpointRedisSettings() {
  }

  public EndpointRedisSettings serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

  /**
   * Get serverName
   * @return serverName
   */
  @javax.annotation.Nonnull
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public EndpointRedisSettings port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @javax.annotation.Nonnull
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointRedisSettings sslSecurityProtocol(SslSecurityProtocolValue sslSecurityProtocol) {
    this.sslSecurityProtocol = sslSecurityProtocol;
    return this;
  }

  /**
   * Get sslSecurityProtocol
   * @return sslSecurityProtocol
   */
  @javax.annotation.Nullable
  public SslSecurityProtocolValue getSslSecurityProtocol() {
    return sslSecurityProtocol;
  }

  public void setSslSecurityProtocol(SslSecurityProtocolValue sslSecurityProtocol) {
    this.sslSecurityProtocol = sslSecurityProtocol;
  }


  public EndpointRedisSettings authType(RedisAuthTypeValue authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   * @return authType
   */
  @javax.annotation.Nullable
  public RedisAuthTypeValue getAuthType() {
    return authType;
  }

  public void setAuthType(RedisAuthTypeValue authType) {
    this.authType = authType;
  }


  public EndpointRedisSettings authUserName(String authUserName) {
    this.authUserName = authUserName;
    return this;
  }

  /**
   * Get authUserName
   * @return authUserName
   */
  @javax.annotation.Nullable
  public String getAuthUserName() {
    return authUserName;
  }

  public void setAuthUserName(String authUserName) {
    this.authUserName = authUserName;
  }


  public EndpointRedisSettings authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

  /**
   * Get authPassword
   * @return authPassword
   */
  @javax.annotation.Nullable
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }


  public EndpointRedisSettings sslCaCertificateArn(String sslCaCertificateArn) {
    this.sslCaCertificateArn = sslCaCertificateArn;
    return this;
  }

  /**
   * Get sslCaCertificateArn
   * @return sslCaCertificateArn
   */
  @javax.annotation.Nullable
  public String getSslCaCertificateArn() {
    return sslCaCertificateArn;
  }

  public void setSslCaCertificateArn(String sslCaCertificateArn) {
    this.sslCaCertificateArn = sslCaCertificateArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRedisSettings endpointRedisSettings = (EndpointRedisSettings) o;
    return Objects.equals(this.serverName, endpointRedisSettings.serverName) &&
        Objects.equals(this.port, endpointRedisSettings.port) &&
        Objects.equals(this.sslSecurityProtocol, endpointRedisSettings.sslSecurityProtocol) &&
        Objects.equals(this.authType, endpointRedisSettings.authType) &&
        Objects.equals(this.authUserName, endpointRedisSettings.authUserName) &&
        Objects.equals(this.authPassword, endpointRedisSettings.authPassword) &&
        Objects.equals(this.sslCaCertificateArn, endpointRedisSettings.sslCaCertificateArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, port, sslSecurityProtocol, authType, authUserName, authPassword, sslCaCertificateArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointRedisSettings {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sslSecurityProtocol: ").append(toIndentedString(sslSecurityProtocol)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authUserName: ").append(toIndentedString(authUserName)).append("\n");
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    sslCaCertificateArn: ").append(toIndentedString(sslCaCertificateArn)).append("\n");
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
    openapiFields.add("ServerName");
    openapiFields.add("Port");
    openapiFields.add("SslSecurityProtocol");
    openapiFields.add("AuthType");
    openapiFields.add("AuthUserName");
    openapiFields.add("AuthPassword");
    openapiFields.add("SslCaCertificateArn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ServerName");
    openapiRequiredFields.add("Port");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointRedisSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointRedisSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointRedisSettings is not found in the empty JSON string", EndpointRedisSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointRedisSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointRedisSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointRedisSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ServerName`
      String.validateJsonElement(jsonObj.get("ServerName"));
      // validate the required field `Port`
      Integer.validateJsonElement(jsonObj.get("Port"));
      // validate the optional field `SslSecurityProtocol`
      if (jsonObj.get("SslSecurityProtocol") != null && !jsonObj.get("SslSecurityProtocol").isJsonNull()) {
        SslSecurityProtocolValue.validateJsonElement(jsonObj.get("SslSecurityProtocol"));
      }
      // validate the optional field `AuthType`
      if (jsonObj.get("AuthType") != null && !jsonObj.get("AuthType").isJsonNull()) {
        RedisAuthTypeValue.validateJsonElement(jsonObj.get("AuthType"));
      }
      // validate the optional field `AuthUserName`
      if (jsonObj.get("AuthUserName") != null && !jsonObj.get("AuthUserName").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AuthUserName"));
      }
      // validate the optional field `AuthPassword`
      if (jsonObj.get("AuthPassword") != null && !jsonObj.get("AuthPassword").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("AuthPassword"));
      }
      // validate the optional field `SslCaCertificateArn`
      if (jsonObj.get("SslCaCertificateArn") != null && !jsonObj.get("SslCaCertificateArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslCaCertificateArn"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointRedisSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointRedisSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointRedisSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointRedisSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointRedisSettings>() {
           @Override
           public void write(JsonWriter out, EndpointRedisSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointRedisSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointRedisSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointRedisSettings
   * @throws IOException if the JSON string is invalid with respect to EndpointRedisSettings
   */
  public static EndpointRedisSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointRedisSettings.class);
  }

  /**
   * Convert an instance of EndpointRedisSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

