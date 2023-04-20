/*
 * Connectors API
 * Enables users to create and manage connections to Google Cloud services and third-party business applications using the Connectors interface.
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
import org.openapitools.client.model.ConfigVariableTemplate;

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
 * Ssl config details of a connector version
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:12:13.662521-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class SslConfigTemplate {
  public static final String SERIALIZED_NAME_ADDITIONAL_VARIABLES = "additionalVariables";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_VARIABLES)
  private List<ConfigVariableTemplate> additionalVariables = new ArrayList<>();

  /**
   * Gets or Sets clientCertType
   */
  @JsonAdapter(ClientCertTypeEnum.Adapter.class)
  public enum ClientCertTypeEnum {
    CERT_TYPE_UNSPECIFIED("CERT_TYPE_UNSPECIFIED"),
    
    PEM("PEM");

    private String value;

    ClientCertTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientCertTypeEnum fromValue(String value) {
      for (ClientCertTypeEnum b : ClientCertTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClientCertTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientCertTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientCertTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClientCertTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ClientCertTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CLIENT_CERT_TYPE = "clientCertType";
  @SerializedName(SERIALIZED_NAME_CLIENT_CERT_TYPE)
  private List<ClientCertTypeEnum> clientCertType = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_TLS_MANDATORY = "isTlsMandatory";
  @SerializedName(SERIALIZED_NAME_IS_TLS_MANDATORY)
  private Boolean isTlsMandatory;

  /**
   * Gets or Sets serverCertType
   */
  @JsonAdapter(ServerCertTypeEnum.Adapter.class)
  public enum ServerCertTypeEnum {
    CERT_TYPE_UNSPECIFIED("CERT_TYPE_UNSPECIFIED"),
    
    PEM("PEM");

    private String value;

    ServerCertTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServerCertTypeEnum fromValue(String value) {
      for (ServerCertTypeEnum b : ServerCertTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServerCertTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServerCertTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServerCertTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServerCertTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ServerCertTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SERVER_CERT_TYPE = "serverCertType";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT_TYPE)
  private List<ServerCertTypeEnum> serverCertType = new ArrayList<>();

  /**
   * Controls the ssl type for the given connector version
   */
  @JsonAdapter(SslTypeEnum.Adapter.class)
  public enum SslTypeEnum {
    SSL_TYPE_UNSPECIFIED("SSL_TYPE_UNSPECIFIED"),
    
    TLS("TLS"),
    
    MTLS("MTLS");

    private String value;

    SslTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SslTypeEnum fromValue(String value) {
      for (SslTypeEnum b : SslTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SslTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SslTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SslTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SslTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SslTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SSL_TYPE = "sslType";
  @SerializedName(SERIALIZED_NAME_SSL_TYPE)
  private SslTypeEnum sslType;

  public SslConfigTemplate() {
  }

  public SslConfigTemplate additionalVariables(List<ConfigVariableTemplate> additionalVariables) {
    this.additionalVariables = additionalVariables;
    return this;
  }

  public SslConfigTemplate addAdditionalVariablesItem(ConfigVariableTemplate additionalVariablesItem) {
    if (this.additionalVariables == null) {
      this.additionalVariables = new ArrayList<>();
    }
    this.additionalVariables.add(additionalVariablesItem);
    return this;
  }

  /**
   * Any additional fields that need to be rendered
   * @return additionalVariables
   */
  @javax.annotation.Nullable
  public List<ConfigVariableTemplate> getAdditionalVariables() {
    return additionalVariables;
  }

  public void setAdditionalVariables(List<ConfigVariableTemplate> additionalVariables) {
    this.additionalVariables = additionalVariables;
  }


  public SslConfigTemplate clientCertType(List<ClientCertTypeEnum> clientCertType) {
    this.clientCertType = clientCertType;
    return this;
  }

  public SslConfigTemplate addClientCertTypeItem(ClientCertTypeEnum clientCertTypeItem) {
    if (this.clientCertType == null) {
      this.clientCertType = new ArrayList<>();
    }
    this.clientCertType.add(clientCertTypeItem);
    return this;
  }

  /**
   * List of supported Client Cert Types
   * @return clientCertType
   */
  @javax.annotation.Nullable
  public List<ClientCertTypeEnum> getClientCertType() {
    return clientCertType;
  }

  public void setClientCertType(List<ClientCertTypeEnum> clientCertType) {
    this.clientCertType = clientCertType;
  }


  public SslConfigTemplate isTlsMandatory(Boolean isTlsMandatory) {
    this.isTlsMandatory = isTlsMandatory;
    return this;
  }

  /**
   * Boolean for determining if the connector version mandates TLS.
   * @return isTlsMandatory
   */
  @javax.annotation.Nullable
  public Boolean getIsTlsMandatory() {
    return isTlsMandatory;
  }

  public void setIsTlsMandatory(Boolean isTlsMandatory) {
    this.isTlsMandatory = isTlsMandatory;
  }


  public SslConfigTemplate serverCertType(List<ServerCertTypeEnum> serverCertType) {
    this.serverCertType = serverCertType;
    return this;
  }

  public SslConfigTemplate addServerCertTypeItem(ServerCertTypeEnum serverCertTypeItem) {
    if (this.serverCertType == null) {
      this.serverCertType = new ArrayList<>();
    }
    this.serverCertType.add(serverCertTypeItem);
    return this;
  }

  /**
   * List of supported Server Cert Types
   * @return serverCertType
   */
  @javax.annotation.Nullable
  public List<ServerCertTypeEnum> getServerCertType() {
    return serverCertType;
  }

  public void setServerCertType(List<ServerCertTypeEnum> serverCertType) {
    this.serverCertType = serverCertType;
  }


  public SslConfigTemplate sslType(SslTypeEnum sslType) {
    this.sslType = sslType;
    return this;
  }

  /**
   * Controls the ssl type for the given connector version
   * @return sslType
   */
  @javax.annotation.Nullable
  public SslTypeEnum getSslType() {
    return sslType;
  }

  public void setSslType(SslTypeEnum sslType) {
    this.sslType = sslType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SslConfigTemplate sslConfigTemplate = (SslConfigTemplate) o;
    return Objects.equals(this.additionalVariables, sslConfigTemplate.additionalVariables) &&
        Objects.equals(this.clientCertType, sslConfigTemplate.clientCertType) &&
        Objects.equals(this.isTlsMandatory, sslConfigTemplate.isTlsMandatory) &&
        Objects.equals(this.serverCertType, sslConfigTemplate.serverCertType) &&
        Objects.equals(this.sslType, sslConfigTemplate.sslType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalVariables, clientCertType, isTlsMandatory, serverCertType, sslType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SslConfigTemplate {\n");
    sb.append("    additionalVariables: ").append(toIndentedString(additionalVariables)).append("\n");
    sb.append("    clientCertType: ").append(toIndentedString(clientCertType)).append("\n");
    sb.append("    isTlsMandatory: ").append(toIndentedString(isTlsMandatory)).append("\n");
    sb.append("    serverCertType: ").append(toIndentedString(serverCertType)).append("\n");
    sb.append("    sslType: ").append(toIndentedString(sslType)).append("\n");
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
    openapiFields.add("additionalVariables");
    openapiFields.add("clientCertType");
    openapiFields.add("isTlsMandatory");
    openapiFields.add("serverCertType");
    openapiFields.add("sslType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SslConfigTemplate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SslConfigTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SslConfigTemplate is not found in the empty JSON string", SslConfigTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SslConfigTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SslConfigTemplate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("additionalVariables") != null && !jsonObj.get("additionalVariables").isJsonNull()) {
        JsonArray jsonArrayadditionalVariables = jsonObj.getAsJsonArray("additionalVariables");
        if (jsonArrayadditionalVariables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalVariables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalVariables` to be an array in the JSON string but got `%s`", jsonObj.get("additionalVariables").toString()));
          }

          // validate the optional field `additionalVariables` (array)
          for (int i = 0; i < jsonArrayadditionalVariables.size(); i++) {
            ConfigVariableTemplate.validateJsonElement(jsonArrayadditionalVariables.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("clientCertType") != null && !jsonObj.get("clientCertType").isJsonNull() && !jsonObj.get("clientCertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientCertType` to be an array in the JSON string but got `%s`", jsonObj.get("clientCertType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("serverCertType") != null && !jsonObj.get("serverCertType").isJsonNull() && !jsonObj.get("serverCertType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverCertType` to be an array in the JSON string but got `%s`", jsonObj.get("serverCertType").toString()));
      }
      if ((jsonObj.get("sslType") != null && !jsonObj.get("sslType").isJsonNull()) && !jsonObj.get("sslType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslType").toString()));
      }
      // validate the optional field `sslType`
      if (jsonObj.get("sslType") != null && !jsonObj.get("sslType").isJsonNull()) {
        SslTypeEnum.validateJsonElement(jsonObj.get("sslType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SslConfigTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SslConfigTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SslConfigTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SslConfigTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<SslConfigTemplate>() {
           @Override
           public void write(JsonWriter out, SslConfigTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SslConfigTemplate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SslConfigTemplate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SslConfigTemplate
   * @throws IOException if the JSON string is invalid with respect to SslConfigTemplate
   */
  public static SslConfigTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SslConfigTemplate.class);
  }

  /**
   * Convert an instance of SslConfigTemplate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

