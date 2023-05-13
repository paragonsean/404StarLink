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
import org.openapitools.client.model.KafkaSaslMechanism;
import org.openapitools.client.model.KafkaSecurityProtocol;
import org.openapitools.client.model.MessageFormatValue;

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
 * EndpointKafkaSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:28.765689-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class EndpointKafkaSettings {
  public static final String SERIALIZED_NAME_BROKER = "Broker";
  @SerializedName(SERIALIZED_NAME_BROKER)
  private String broker;

  public static final String SERIALIZED_NAME_TOPIC = "Topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_MESSAGE_FORMAT = "MessageFormat";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FORMAT)
  private MessageFormatValue messageFormat;

  public static final String SERIALIZED_NAME_INCLUDE_TRANSACTION_DETAILS = "IncludeTransactionDetails";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TRANSACTION_DETAILS)
  private Boolean includeTransactionDetails;

  public static final String SERIALIZED_NAME_INCLUDE_PARTITION_VALUE = "IncludePartitionValue";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PARTITION_VALUE)
  private Boolean includePartitionValue;

  public static final String SERIALIZED_NAME_PARTITION_INCLUDE_SCHEMA_TABLE = "PartitionIncludeSchemaTable";
  @SerializedName(SERIALIZED_NAME_PARTITION_INCLUDE_SCHEMA_TABLE)
  private Boolean partitionIncludeSchemaTable;

  public static final String SERIALIZED_NAME_INCLUDE_TABLE_ALTER_OPERATIONS = "IncludeTableAlterOperations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TABLE_ALTER_OPERATIONS)
  private Boolean includeTableAlterOperations;

  public static final String SERIALIZED_NAME_INCLUDE_CONTROL_DETAILS = "IncludeControlDetails";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CONTROL_DETAILS)
  private Boolean includeControlDetails;

  public static final String SERIALIZED_NAME_MESSAGE_MAX_BYTES = "MessageMaxBytes";
  @SerializedName(SERIALIZED_NAME_MESSAGE_MAX_BYTES)
  private Integer messageMaxBytes;

  public static final String SERIALIZED_NAME_INCLUDE_NULL_AND_EMPTY = "IncludeNullAndEmpty";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NULL_AND_EMPTY)
  private Boolean includeNullAndEmpty;

  public static final String SERIALIZED_NAME_SECURITY_PROTOCOL = "SecurityProtocol";
  @SerializedName(SERIALIZED_NAME_SECURITY_PROTOCOL)
  private KafkaSecurityProtocol securityProtocol;

  public static final String SERIALIZED_NAME_SSL_CLIENT_CERTIFICATE_ARN = "SslClientCertificateArn";
  @SerializedName(SERIALIZED_NAME_SSL_CLIENT_CERTIFICATE_ARN)
  private String sslClientCertificateArn;

  public static final String SERIALIZED_NAME_SSL_CLIENT_KEY_ARN = "SslClientKeyArn";
  @SerializedName(SERIALIZED_NAME_SSL_CLIENT_KEY_ARN)
  private String sslClientKeyArn;

  public static final String SERIALIZED_NAME_SSL_CLIENT_KEY_PASSWORD = "SslClientKeyPassword";
  @SerializedName(SERIALIZED_NAME_SSL_CLIENT_KEY_PASSWORD)
  private String sslClientKeyPassword;

  public static final String SERIALIZED_NAME_SSL_CA_CERTIFICATE_ARN = "SslCaCertificateArn";
  @SerializedName(SERIALIZED_NAME_SSL_CA_CERTIFICATE_ARN)
  private String sslCaCertificateArn;

  public static final String SERIALIZED_NAME_SASL_USERNAME = "SaslUsername";
  @SerializedName(SERIALIZED_NAME_SASL_USERNAME)
  private String saslUsername;

  public static final String SERIALIZED_NAME_SASL_PASSWORD = "SaslPassword";
  @SerializedName(SERIALIZED_NAME_SASL_PASSWORD)
  private String saslPassword;

  public static final String SERIALIZED_NAME_NO_HEX_PREFIX = "NoHexPrefix";
  @SerializedName(SERIALIZED_NAME_NO_HEX_PREFIX)
  private Boolean noHexPrefix;

  public static final String SERIALIZED_NAME_SASL_MECHANISM = "SaslMechanism";
  @SerializedName(SERIALIZED_NAME_SASL_MECHANISM)
  private KafkaSaslMechanism saslMechanism;

  public EndpointKafkaSettings() {
  }

  public EndpointKafkaSettings broker(String broker) {
    this.broker = broker;
    return this;
  }

  /**
   * Get broker
   * @return broker
   */
  @javax.annotation.Nullable
  public String getBroker() {
    return broker;
  }

  public void setBroker(String broker) {
    this.broker = broker;
  }


  public EndpointKafkaSettings topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public EndpointKafkaSettings messageFormat(MessageFormatValue messageFormat) {
    this.messageFormat = messageFormat;
    return this;
  }

  /**
   * Get messageFormat
   * @return messageFormat
   */
  @javax.annotation.Nullable
  public MessageFormatValue getMessageFormat() {
    return messageFormat;
  }

  public void setMessageFormat(MessageFormatValue messageFormat) {
    this.messageFormat = messageFormat;
  }


  public EndpointKafkaSettings includeTransactionDetails(Boolean includeTransactionDetails) {
    this.includeTransactionDetails = includeTransactionDetails;
    return this;
  }

  /**
   * Get includeTransactionDetails
   * @return includeTransactionDetails
   */
  @javax.annotation.Nullable
  public Boolean getIncludeTransactionDetails() {
    return includeTransactionDetails;
  }

  public void setIncludeTransactionDetails(Boolean includeTransactionDetails) {
    this.includeTransactionDetails = includeTransactionDetails;
  }


  public EndpointKafkaSettings includePartitionValue(Boolean includePartitionValue) {
    this.includePartitionValue = includePartitionValue;
    return this;
  }

  /**
   * Get includePartitionValue
   * @return includePartitionValue
   */
  @javax.annotation.Nullable
  public Boolean getIncludePartitionValue() {
    return includePartitionValue;
  }

  public void setIncludePartitionValue(Boolean includePartitionValue) {
    this.includePartitionValue = includePartitionValue;
  }


  public EndpointKafkaSettings partitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
    this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
    return this;
  }

  /**
   * Get partitionIncludeSchemaTable
   * @return partitionIncludeSchemaTable
   */
  @javax.annotation.Nullable
  public Boolean getPartitionIncludeSchemaTable() {
    return partitionIncludeSchemaTable;
  }

  public void setPartitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
    this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
  }


  public EndpointKafkaSettings includeTableAlterOperations(Boolean includeTableAlterOperations) {
    this.includeTableAlterOperations = includeTableAlterOperations;
    return this;
  }

  /**
   * Get includeTableAlterOperations
   * @return includeTableAlterOperations
   */
  @javax.annotation.Nullable
  public Boolean getIncludeTableAlterOperations() {
    return includeTableAlterOperations;
  }

  public void setIncludeTableAlterOperations(Boolean includeTableAlterOperations) {
    this.includeTableAlterOperations = includeTableAlterOperations;
  }


  public EndpointKafkaSettings includeControlDetails(Boolean includeControlDetails) {
    this.includeControlDetails = includeControlDetails;
    return this;
  }

  /**
   * Get includeControlDetails
   * @return includeControlDetails
   */
  @javax.annotation.Nullable
  public Boolean getIncludeControlDetails() {
    return includeControlDetails;
  }

  public void setIncludeControlDetails(Boolean includeControlDetails) {
    this.includeControlDetails = includeControlDetails;
  }


  public EndpointKafkaSettings messageMaxBytes(Integer messageMaxBytes) {
    this.messageMaxBytes = messageMaxBytes;
    return this;
  }

  /**
   * Get messageMaxBytes
   * @return messageMaxBytes
   */
  @javax.annotation.Nullable
  public Integer getMessageMaxBytes() {
    return messageMaxBytes;
  }

  public void setMessageMaxBytes(Integer messageMaxBytes) {
    this.messageMaxBytes = messageMaxBytes;
  }


  public EndpointKafkaSettings includeNullAndEmpty(Boolean includeNullAndEmpty) {
    this.includeNullAndEmpty = includeNullAndEmpty;
    return this;
  }

  /**
   * Get includeNullAndEmpty
   * @return includeNullAndEmpty
   */
  @javax.annotation.Nullable
  public Boolean getIncludeNullAndEmpty() {
    return includeNullAndEmpty;
  }

  public void setIncludeNullAndEmpty(Boolean includeNullAndEmpty) {
    this.includeNullAndEmpty = includeNullAndEmpty;
  }


  public EndpointKafkaSettings securityProtocol(KafkaSecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
    return this;
  }

  /**
   * Get securityProtocol
   * @return securityProtocol
   */
  @javax.annotation.Nullable
  public KafkaSecurityProtocol getSecurityProtocol() {
    return securityProtocol;
  }

  public void setSecurityProtocol(KafkaSecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }


  public EndpointKafkaSettings sslClientCertificateArn(String sslClientCertificateArn) {
    this.sslClientCertificateArn = sslClientCertificateArn;
    return this;
  }

  /**
   * Get sslClientCertificateArn
   * @return sslClientCertificateArn
   */
  @javax.annotation.Nullable
  public String getSslClientCertificateArn() {
    return sslClientCertificateArn;
  }

  public void setSslClientCertificateArn(String sslClientCertificateArn) {
    this.sslClientCertificateArn = sslClientCertificateArn;
  }


  public EndpointKafkaSettings sslClientKeyArn(String sslClientKeyArn) {
    this.sslClientKeyArn = sslClientKeyArn;
    return this;
  }

  /**
   * Get sslClientKeyArn
   * @return sslClientKeyArn
   */
  @javax.annotation.Nullable
  public String getSslClientKeyArn() {
    return sslClientKeyArn;
  }

  public void setSslClientKeyArn(String sslClientKeyArn) {
    this.sslClientKeyArn = sslClientKeyArn;
  }


  public EndpointKafkaSettings sslClientKeyPassword(String sslClientKeyPassword) {
    this.sslClientKeyPassword = sslClientKeyPassword;
    return this;
  }

  /**
   * Get sslClientKeyPassword
   * @return sslClientKeyPassword
   */
  @javax.annotation.Nullable
  public String getSslClientKeyPassword() {
    return sslClientKeyPassword;
  }

  public void setSslClientKeyPassword(String sslClientKeyPassword) {
    this.sslClientKeyPassword = sslClientKeyPassword;
  }


  public EndpointKafkaSettings sslCaCertificateArn(String sslCaCertificateArn) {
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


  public EndpointKafkaSettings saslUsername(String saslUsername) {
    this.saslUsername = saslUsername;
    return this;
  }

  /**
   * Get saslUsername
   * @return saslUsername
   */
  @javax.annotation.Nullable
  public String getSaslUsername() {
    return saslUsername;
  }

  public void setSaslUsername(String saslUsername) {
    this.saslUsername = saslUsername;
  }


  public EndpointKafkaSettings saslPassword(String saslPassword) {
    this.saslPassword = saslPassword;
    return this;
  }

  /**
   * Get saslPassword
   * @return saslPassword
   */
  @javax.annotation.Nullable
  public String getSaslPassword() {
    return saslPassword;
  }

  public void setSaslPassword(String saslPassword) {
    this.saslPassword = saslPassword;
  }


  public EndpointKafkaSettings noHexPrefix(Boolean noHexPrefix) {
    this.noHexPrefix = noHexPrefix;
    return this;
  }

  /**
   * Get noHexPrefix
   * @return noHexPrefix
   */
  @javax.annotation.Nullable
  public Boolean getNoHexPrefix() {
    return noHexPrefix;
  }

  public void setNoHexPrefix(Boolean noHexPrefix) {
    this.noHexPrefix = noHexPrefix;
  }


  public EndpointKafkaSettings saslMechanism(KafkaSaslMechanism saslMechanism) {
    this.saslMechanism = saslMechanism;
    return this;
  }

  /**
   * Get saslMechanism
   * @return saslMechanism
   */
  @javax.annotation.Nullable
  public KafkaSaslMechanism getSaslMechanism() {
    return saslMechanism;
  }

  public void setSaslMechanism(KafkaSaslMechanism saslMechanism) {
    this.saslMechanism = saslMechanism;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointKafkaSettings endpointKafkaSettings = (EndpointKafkaSettings) o;
    return Objects.equals(this.broker, endpointKafkaSettings.broker) &&
        Objects.equals(this.topic, endpointKafkaSettings.topic) &&
        Objects.equals(this.messageFormat, endpointKafkaSettings.messageFormat) &&
        Objects.equals(this.includeTransactionDetails, endpointKafkaSettings.includeTransactionDetails) &&
        Objects.equals(this.includePartitionValue, endpointKafkaSettings.includePartitionValue) &&
        Objects.equals(this.partitionIncludeSchemaTable, endpointKafkaSettings.partitionIncludeSchemaTable) &&
        Objects.equals(this.includeTableAlterOperations, endpointKafkaSettings.includeTableAlterOperations) &&
        Objects.equals(this.includeControlDetails, endpointKafkaSettings.includeControlDetails) &&
        Objects.equals(this.messageMaxBytes, endpointKafkaSettings.messageMaxBytes) &&
        Objects.equals(this.includeNullAndEmpty, endpointKafkaSettings.includeNullAndEmpty) &&
        Objects.equals(this.securityProtocol, endpointKafkaSettings.securityProtocol) &&
        Objects.equals(this.sslClientCertificateArn, endpointKafkaSettings.sslClientCertificateArn) &&
        Objects.equals(this.sslClientKeyArn, endpointKafkaSettings.sslClientKeyArn) &&
        Objects.equals(this.sslClientKeyPassword, endpointKafkaSettings.sslClientKeyPassword) &&
        Objects.equals(this.sslCaCertificateArn, endpointKafkaSettings.sslCaCertificateArn) &&
        Objects.equals(this.saslUsername, endpointKafkaSettings.saslUsername) &&
        Objects.equals(this.saslPassword, endpointKafkaSettings.saslPassword) &&
        Objects.equals(this.noHexPrefix, endpointKafkaSettings.noHexPrefix) &&
        Objects.equals(this.saslMechanism, endpointKafkaSettings.saslMechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broker, topic, messageFormat, includeTransactionDetails, includePartitionValue, partitionIncludeSchemaTable, includeTableAlterOperations, includeControlDetails, messageMaxBytes, includeNullAndEmpty, securityProtocol, sslClientCertificateArn, sslClientKeyArn, sslClientKeyPassword, sslCaCertificateArn, saslUsername, saslPassword, noHexPrefix, saslMechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointKafkaSettings {\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    messageFormat: ").append(toIndentedString(messageFormat)).append("\n");
    sb.append("    includeTransactionDetails: ").append(toIndentedString(includeTransactionDetails)).append("\n");
    sb.append("    includePartitionValue: ").append(toIndentedString(includePartitionValue)).append("\n");
    sb.append("    partitionIncludeSchemaTable: ").append(toIndentedString(partitionIncludeSchemaTable)).append("\n");
    sb.append("    includeTableAlterOperations: ").append(toIndentedString(includeTableAlterOperations)).append("\n");
    sb.append("    includeControlDetails: ").append(toIndentedString(includeControlDetails)).append("\n");
    sb.append("    messageMaxBytes: ").append(toIndentedString(messageMaxBytes)).append("\n");
    sb.append("    includeNullAndEmpty: ").append(toIndentedString(includeNullAndEmpty)).append("\n");
    sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
    sb.append("    sslClientCertificateArn: ").append(toIndentedString(sslClientCertificateArn)).append("\n");
    sb.append("    sslClientKeyArn: ").append(toIndentedString(sslClientKeyArn)).append("\n");
    sb.append("    sslClientKeyPassword: ").append(toIndentedString(sslClientKeyPassword)).append("\n");
    sb.append("    sslCaCertificateArn: ").append(toIndentedString(sslCaCertificateArn)).append("\n");
    sb.append("    saslUsername: ").append(toIndentedString(saslUsername)).append("\n");
    sb.append("    saslPassword: ").append(toIndentedString(saslPassword)).append("\n");
    sb.append("    noHexPrefix: ").append(toIndentedString(noHexPrefix)).append("\n");
    sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
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
    openapiFields.add("Broker");
    openapiFields.add("Topic");
    openapiFields.add("MessageFormat");
    openapiFields.add("IncludeTransactionDetails");
    openapiFields.add("IncludePartitionValue");
    openapiFields.add("PartitionIncludeSchemaTable");
    openapiFields.add("IncludeTableAlterOperations");
    openapiFields.add("IncludeControlDetails");
    openapiFields.add("MessageMaxBytes");
    openapiFields.add("IncludeNullAndEmpty");
    openapiFields.add("SecurityProtocol");
    openapiFields.add("SslClientCertificateArn");
    openapiFields.add("SslClientKeyArn");
    openapiFields.add("SslClientKeyPassword");
    openapiFields.add("SslCaCertificateArn");
    openapiFields.add("SaslUsername");
    openapiFields.add("SaslPassword");
    openapiFields.add("NoHexPrefix");
    openapiFields.add("SaslMechanism");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointKafkaSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointKafkaSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointKafkaSettings is not found in the empty JSON string", EndpointKafkaSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointKafkaSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointKafkaSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Broker`
      if (jsonObj.get("Broker") != null && !jsonObj.get("Broker").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Broker"));
      }
      // validate the optional field `Topic`
      if (jsonObj.get("Topic") != null && !jsonObj.get("Topic").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Topic"));
      }
      // validate the optional field `MessageFormat`
      if (jsonObj.get("MessageFormat") != null && !jsonObj.get("MessageFormat").isJsonNull()) {
        MessageFormatValue.validateJsonElement(jsonObj.get("MessageFormat"));
      }
      // validate the optional field `IncludeTransactionDetails`
      if (jsonObj.get("IncludeTransactionDetails") != null && !jsonObj.get("IncludeTransactionDetails").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludeTransactionDetails"));
      }
      // validate the optional field `IncludePartitionValue`
      if (jsonObj.get("IncludePartitionValue") != null && !jsonObj.get("IncludePartitionValue").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludePartitionValue"));
      }
      // validate the optional field `PartitionIncludeSchemaTable`
      if (jsonObj.get("PartitionIncludeSchemaTable") != null && !jsonObj.get("PartitionIncludeSchemaTable").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("PartitionIncludeSchemaTable"));
      }
      // validate the optional field `IncludeTableAlterOperations`
      if (jsonObj.get("IncludeTableAlterOperations") != null && !jsonObj.get("IncludeTableAlterOperations").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludeTableAlterOperations"));
      }
      // validate the optional field `IncludeControlDetails`
      if (jsonObj.get("IncludeControlDetails") != null && !jsonObj.get("IncludeControlDetails").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludeControlDetails"));
      }
      // validate the optional field `MessageMaxBytes`
      if (jsonObj.get("MessageMaxBytes") != null && !jsonObj.get("MessageMaxBytes").isJsonNull()) {
        Integer.validateJsonElement(jsonObj.get("MessageMaxBytes"));
      }
      // validate the optional field `IncludeNullAndEmpty`
      if (jsonObj.get("IncludeNullAndEmpty") != null && !jsonObj.get("IncludeNullAndEmpty").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("IncludeNullAndEmpty"));
      }
      // validate the optional field `SecurityProtocol`
      if (jsonObj.get("SecurityProtocol") != null && !jsonObj.get("SecurityProtocol").isJsonNull()) {
        KafkaSecurityProtocol.validateJsonElement(jsonObj.get("SecurityProtocol"));
      }
      // validate the optional field `SslClientCertificateArn`
      if (jsonObj.get("SslClientCertificateArn") != null && !jsonObj.get("SslClientCertificateArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslClientCertificateArn"));
      }
      // validate the optional field `SslClientKeyArn`
      if (jsonObj.get("SslClientKeyArn") != null && !jsonObj.get("SslClientKeyArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslClientKeyArn"));
      }
      // validate the optional field `SslClientKeyPassword`
      if (jsonObj.get("SslClientKeyPassword") != null && !jsonObj.get("SslClientKeyPassword").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslClientKeyPassword"));
      }
      // validate the optional field `SslCaCertificateArn`
      if (jsonObj.get("SslCaCertificateArn") != null && !jsonObj.get("SslCaCertificateArn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SslCaCertificateArn"));
      }
      // validate the optional field `SaslUsername`
      if (jsonObj.get("SaslUsername") != null && !jsonObj.get("SaslUsername").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SaslUsername"));
      }
      // validate the optional field `SaslPassword`
      if (jsonObj.get("SaslPassword") != null && !jsonObj.get("SaslPassword").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("SaslPassword"));
      }
      // validate the optional field `NoHexPrefix`
      if (jsonObj.get("NoHexPrefix") != null && !jsonObj.get("NoHexPrefix").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("NoHexPrefix"));
      }
      // validate the optional field `SaslMechanism`
      if (jsonObj.get("SaslMechanism") != null && !jsonObj.get("SaslMechanism").isJsonNull()) {
        KafkaSaslMechanism.validateJsonElement(jsonObj.get("SaslMechanism"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointKafkaSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointKafkaSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointKafkaSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointKafkaSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointKafkaSettings>() {
           @Override
           public void write(JsonWriter out, EndpointKafkaSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointKafkaSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointKafkaSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointKafkaSettings
   * @throws IOException if the JSON string is invalid with respect to EndpointKafkaSettings
   */
  public static EndpointKafkaSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointKafkaSettings.class);
  }

  /**
   * Convert an instance of EndpointKafkaSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

