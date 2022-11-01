/*
 * Amazon QLDB
 * The control plane for Amazon QLDB
 *
 * The version of the OpenAPI document: 2019-01-02
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ErrorCause;
import org.openapitools.client.model.JournalKinesisStreamDescriptionKinesisConfiguration;
import org.openapitools.client.model.StreamStatus;

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
 * Information about an Amazon QLDB journal stream, including the Amazon Resource Name (ARN), stream name, creation time, current status, and the parameters of the original stream creation request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:03:23.217080-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class JournalKinesisStreamDescription {
  public static final String SERIALIZED_NAME_LEDGER_NAME = "LedgerName";
  @SerializedName(SERIALIZED_NAME_LEDGER_NAME)
  private String ledgerName;

  public static final String SERIALIZED_NAME_CREATION_TIME = "CreationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_INCLUSIVE_START_TIME = "InclusiveStartTime";
  @SerializedName(SERIALIZED_NAME_INCLUSIVE_START_TIME)
  private OffsetDateTime inclusiveStartTime;

  public static final String SERIALIZED_NAME_EXCLUSIVE_END_TIME = "ExclusiveEndTime";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_END_TIME)
  private OffsetDateTime exclusiveEndTime;

  public static final String SERIALIZED_NAME_ROLE_ARN = "RoleArn";
  @SerializedName(SERIALIZED_NAME_ROLE_ARN)
  private String roleArn;

  public static final String SERIALIZED_NAME_STREAM_ID = "StreamId";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_ARN = "Arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StreamStatus status;

  public static final String SERIALIZED_NAME_KINESIS_CONFIGURATION = "KinesisConfiguration";
  @SerializedName(SERIALIZED_NAME_KINESIS_CONFIGURATION)
  private JournalKinesisStreamDescriptionKinesisConfiguration kinesisConfiguration;

  public static final String SERIALIZED_NAME_ERROR_CAUSE = "ErrorCause";
  @SerializedName(SERIALIZED_NAME_ERROR_CAUSE)
  private ErrorCause errorCause;

  public static final String SERIALIZED_NAME_STREAM_NAME = "StreamName";
  @SerializedName(SERIALIZED_NAME_STREAM_NAME)
  private String streamName;

  public JournalKinesisStreamDescription() {
  }

  public JournalKinesisStreamDescription ledgerName(String ledgerName) {
    this.ledgerName = ledgerName;
    return this;
  }

  /**
   * Get ledgerName
   * @return ledgerName
   */
  @javax.annotation.Nonnull
  public String getLedgerName() {
    return ledgerName;
  }

  public void setLedgerName(String ledgerName) {
    this.ledgerName = ledgerName;
  }


  public JournalKinesisStreamDescription creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public JournalKinesisStreamDescription inclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
    return this;
  }

  /**
   * Get inclusiveStartTime
   * @return inclusiveStartTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getInclusiveStartTime() {
    return inclusiveStartTime;
  }

  public void setInclusiveStartTime(OffsetDateTime inclusiveStartTime) {
    this.inclusiveStartTime = inclusiveStartTime;
  }


  public JournalKinesisStreamDescription exclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
    return this;
  }

  /**
   * Get exclusiveEndTime
   * @return exclusiveEndTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExclusiveEndTime() {
    return exclusiveEndTime;
  }

  public void setExclusiveEndTime(OffsetDateTime exclusiveEndTime) {
    this.exclusiveEndTime = exclusiveEndTime;
  }


  public JournalKinesisStreamDescription roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
   */
  @javax.annotation.Nonnull
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  public JournalKinesisStreamDescription streamId(String streamId) {
    this.streamId = streamId;
    return this;
  }

  /**
   * Get streamId
   * @return streamId
   */
  @javax.annotation.Nonnull
  public String getStreamId() {
    return streamId;
  }

  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public JournalKinesisStreamDescription arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public JournalKinesisStreamDescription status(StreamStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public StreamStatus getStatus() {
    return status;
  }

  public void setStatus(StreamStatus status) {
    this.status = status;
  }


  public JournalKinesisStreamDescription kinesisConfiguration(JournalKinesisStreamDescriptionKinesisConfiguration kinesisConfiguration) {
    this.kinesisConfiguration = kinesisConfiguration;
    return this;
  }

  /**
   * Get kinesisConfiguration
   * @return kinesisConfiguration
   */
  @javax.annotation.Nonnull
  public JournalKinesisStreamDescriptionKinesisConfiguration getKinesisConfiguration() {
    return kinesisConfiguration;
  }

  public void setKinesisConfiguration(JournalKinesisStreamDescriptionKinesisConfiguration kinesisConfiguration) {
    this.kinesisConfiguration = kinesisConfiguration;
  }


  public JournalKinesisStreamDescription errorCause(ErrorCause errorCause) {
    this.errorCause = errorCause;
    return this;
  }

  /**
   * Get errorCause
   * @return errorCause
   */
  @javax.annotation.Nullable
  public ErrorCause getErrorCause() {
    return errorCause;
  }

  public void setErrorCause(ErrorCause errorCause) {
    this.errorCause = errorCause;
  }


  public JournalKinesisStreamDescription streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  /**
   * Get streamName
   * @return streamName
   */
  @javax.annotation.Nonnull
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalKinesisStreamDescription journalKinesisStreamDescription = (JournalKinesisStreamDescription) o;
    return Objects.equals(this.ledgerName, journalKinesisStreamDescription.ledgerName) &&
        Objects.equals(this.creationTime, journalKinesisStreamDescription.creationTime) &&
        Objects.equals(this.inclusiveStartTime, journalKinesisStreamDescription.inclusiveStartTime) &&
        Objects.equals(this.exclusiveEndTime, journalKinesisStreamDescription.exclusiveEndTime) &&
        Objects.equals(this.roleArn, journalKinesisStreamDescription.roleArn) &&
        Objects.equals(this.streamId, journalKinesisStreamDescription.streamId) &&
        Objects.equals(this.arn, journalKinesisStreamDescription.arn) &&
        Objects.equals(this.status, journalKinesisStreamDescription.status) &&
        Objects.equals(this.kinesisConfiguration, journalKinesisStreamDescription.kinesisConfiguration) &&
        Objects.equals(this.errorCause, journalKinesisStreamDescription.errorCause) &&
        Objects.equals(this.streamName, journalKinesisStreamDescription.streamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerName, creationTime, inclusiveStartTime, exclusiveEndTime, roleArn, streamId, arn, status, kinesisConfiguration, errorCause, streamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalKinesisStreamDescription {\n");
    sb.append("    ledgerName: ").append(toIndentedString(ledgerName)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    inclusiveStartTime: ").append(toIndentedString(inclusiveStartTime)).append("\n");
    sb.append("    exclusiveEndTime: ").append(toIndentedString(exclusiveEndTime)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kinesisConfiguration: ").append(toIndentedString(kinesisConfiguration)).append("\n");
    sb.append("    errorCause: ").append(toIndentedString(errorCause)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
    openapiFields.add("LedgerName");
    openapiFields.add("CreationTime");
    openapiFields.add("InclusiveStartTime");
    openapiFields.add("ExclusiveEndTime");
    openapiFields.add("RoleArn");
    openapiFields.add("StreamId");
    openapiFields.add("Arn");
    openapiFields.add("Status");
    openapiFields.add("KinesisConfiguration");
    openapiFields.add("ErrorCause");
    openapiFields.add("StreamName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LedgerName");
    openapiRequiredFields.add("RoleArn");
    openapiRequiredFields.add("StreamId");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("KinesisConfiguration");
    openapiRequiredFields.add("StreamName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JournalKinesisStreamDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JournalKinesisStreamDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JournalKinesisStreamDescription is not found in the empty JSON string", JournalKinesisStreamDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JournalKinesisStreamDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JournalKinesisStreamDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JournalKinesisStreamDescription.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `LedgerName`
      String.validateJsonElement(jsonObj.get("LedgerName"));
      // validate the optional field `CreationTime`
      if (jsonObj.get("CreationTime") != null && !jsonObj.get("CreationTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CreationTime"));
      }
      // validate the optional field `InclusiveStartTime`
      if (jsonObj.get("InclusiveStartTime") != null && !jsonObj.get("InclusiveStartTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("InclusiveStartTime"));
      }
      // validate the optional field `ExclusiveEndTime`
      if (jsonObj.get("ExclusiveEndTime") != null && !jsonObj.get("ExclusiveEndTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("ExclusiveEndTime"));
      }
      // validate the required field `RoleArn`
      String.validateJsonElement(jsonObj.get("RoleArn"));
      // validate the required field `StreamId`
      String.validateJsonElement(jsonObj.get("StreamId"));
      // validate the optional field `Arn`
      if (jsonObj.get("Arn") != null && !jsonObj.get("Arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Arn"));
      }
      // validate the required field `Status`
      StreamStatus.validateJsonElement(jsonObj.get("Status"));
      // validate the required field `KinesisConfiguration`
      JournalKinesisStreamDescriptionKinesisConfiguration.validateJsonElement(jsonObj.get("KinesisConfiguration"));
      // validate the optional field `ErrorCause`
      if (jsonObj.get("ErrorCause") != null && !jsonObj.get("ErrorCause").isJsonNull()) {
        ErrorCause.validateJsonElement(jsonObj.get("ErrorCause"));
      }
      // validate the required field `StreamName`
      String.validateJsonElement(jsonObj.get("StreamName"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JournalKinesisStreamDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JournalKinesisStreamDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JournalKinesisStreamDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JournalKinesisStreamDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<JournalKinesisStreamDescription>() {
           @Override
           public void write(JsonWriter out, JournalKinesisStreamDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JournalKinesisStreamDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JournalKinesisStreamDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JournalKinesisStreamDescription
   * @throws IOException if the JSON string is invalid with respect to JournalKinesisStreamDescription
   */
  public static JournalKinesisStreamDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JournalKinesisStreamDescription.class);
  }

  /**
   * Convert an instance of JournalKinesisStreamDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

