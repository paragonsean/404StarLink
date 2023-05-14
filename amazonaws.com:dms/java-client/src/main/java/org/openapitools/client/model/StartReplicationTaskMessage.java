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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.StartReplicationTaskTypeValue;

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
 * &lt;p/&gt;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:13:34.502814-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class StartReplicationTaskMessage {
  public static final String SERIALIZED_NAME_REPLICATION_TASK_ARN = "ReplicationTaskArn";
  @SerializedName(SERIALIZED_NAME_REPLICATION_TASK_ARN)
  private String replicationTaskArn;

  public static final String SERIALIZED_NAME_START_REPLICATION_TASK_TYPE = "StartReplicationTaskType";
  @SerializedName(SERIALIZED_NAME_START_REPLICATION_TASK_TYPE)
  private StartReplicationTaskTypeValue startReplicationTaskType;

  public static final String SERIALIZED_NAME_CDC_START_TIME = "CdcStartTime";
  @SerializedName(SERIALIZED_NAME_CDC_START_TIME)
  private OffsetDateTime cdcStartTime;

  public static final String SERIALIZED_NAME_CDC_START_POSITION = "CdcStartPosition";
  @SerializedName(SERIALIZED_NAME_CDC_START_POSITION)
  private String cdcStartPosition;

  public static final String SERIALIZED_NAME_CDC_STOP_POSITION = "CdcStopPosition";
  @SerializedName(SERIALIZED_NAME_CDC_STOP_POSITION)
  private String cdcStopPosition;

  public StartReplicationTaskMessage() {
  }

  public StartReplicationTaskMessage replicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
    return this;
  }

  /**
   * Get replicationTaskArn
   * @return replicationTaskArn
   */
  @javax.annotation.Nonnull
  public String getReplicationTaskArn() {
    return replicationTaskArn;
  }

  public void setReplicationTaskArn(String replicationTaskArn) {
    this.replicationTaskArn = replicationTaskArn;
  }


  public StartReplicationTaskMessage startReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
    this.startReplicationTaskType = startReplicationTaskType;
    return this;
  }

  /**
   * Get startReplicationTaskType
   * @return startReplicationTaskType
   */
  @javax.annotation.Nonnull
  public StartReplicationTaskTypeValue getStartReplicationTaskType() {
    return startReplicationTaskType;
  }

  public void setStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
    this.startReplicationTaskType = startReplicationTaskType;
  }


  public StartReplicationTaskMessage cdcStartTime(OffsetDateTime cdcStartTime) {
    this.cdcStartTime = cdcStartTime;
    return this;
  }

  /**
   * Get cdcStartTime
   * @return cdcStartTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCdcStartTime() {
    return cdcStartTime;
  }

  public void setCdcStartTime(OffsetDateTime cdcStartTime) {
    this.cdcStartTime = cdcStartTime;
  }


  public StartReplicationTaskMessage cdcStartPosition(String cdcStartPosition) {
    this.cdcStartPosition = cdcStartPosition;
    return this;
  }

  /**
   * Get cdcStartPosition
   * @return cdcStartPosition
   */
  @javax.annotation.Nullable
  public String getCdcStartPosition() {
    return cdcStartPosition;
  }

  public void setCdcStartPosition(String cdcStartPosition) {
    this.cdcStartPosition = cdcStartPosition;
  }


  public StartReplicationTaskMessage cdcStopPosition(String cdcStopPosition) {
    this.cdcStopPosition = cdcStopPosition;
    return this;
  }

  /**
   * Get cdcStopPosition
   * @return cdcStopPosition
   */
  @javax.annotation.Nullable
  public String getCdcStopPosition() {
    return cdcStopPosition;
  }

  public void setCdcStopPosition(String cdcStopPosition) {
    this.cdcStopPosition = cdcStopPosition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartReplicationTaskMessage startReplicationTaskMessage = (StartReplicationTaskMessage) o;
    return Objects.equals(this.replicationTaskArn, startReplicationTaskMessage.replicationTaskArn) &&
        Objects.equals(this.startReplicationTaskType, startReplicationTaskMessage.startReplicationTaskType) &&
        Objects.equals(this.cdcStartTime, startReplicationTaskMessage.cdcStartTime) &&
        Objects.equals(this.cdcStartPosition, startReplicationTaskMessage.cdcStartPosition) &&
        Objects.equals(this.cdcStopPosition, startReplicationTaskMessage.cdcStopPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationTaskArn, startReplicationTaskType, cdcStartTime, cdcStartPosition, cdcStopPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartReplicationTaskMessage {\n");
    sb.append("    replicationTaskArn: ").append(toIndentedString(replicationTaskArn)).append("\n");
    sb.append("    startReplicationTaskType: ").append(toIndentedString(startReplicationTaskType)).append("\n");
    sb.append("    cdcStartTime: ").append(toIndentedString(cdcStartTime)).append("\n");
    sb.append("    cdcStartPosition: ").append(toIndentedString(cdcStartPosition)).append("\n");
    sb.append("    cdcStopPosition: ").append(toIndentedString(cdcStopPosition)).append("\n");
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
    openapiFields.add("ReplicationTaskArn");
    openapiFields.add("StartReplicationTaskType");
    openapiFields.add("CdcStartTime");
    openapiFields.add("CdcStartPosition");
    openapiFields.add("CdcStopPosition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ReplicationTaskArn");
    openapiRequiredFields.add("StartReplicationTaskType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StartReplicationTaskMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StartReplicationTaskMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartReplicationTaskMessage is not found in the empty JSON string", StartReplicationTaskMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StartReplicationTaskMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartReplicationTaskMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StartReplicationTaskMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ReplicationTaskArn`
      String.validateJsonElement(jsonObj.get("ReplicationTaskArn"));
      // validate the required field `StartReplicationTaskType`
      StartReplicationTaskTypeValue.validateJsonElement(jsonObj.get("StartReplicationTaskType"));
      // validate the optional field `CdcStartTime`
      if (jsonObj.get("CdcStartTime") != null && !jsonObj.get("CdcStartTime").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("CdcStartTime"));
      }
      // validate the optional field `CdcStartPosition`
      if (jsonObj.get("CdcStartPosition") != null && !jsonObj.get("CdcStartPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStartPosition"));
      }
      // validate the optional field `CdcStopPosition`
      if (jsonObj.get("CdcStopPosition") != null && !jsonObj.get("CdcStopPosition").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("CdcStopPosition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartReplicationTaskMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartReplicationTaskMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartReplicationTaskMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartReplicationTaskMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<StartReplicationTaskMessage>() {
           @Override
           public void write(JsonWriter out, StartReplicationTaskMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartReplicationTaskMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StartReplicationTaskMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StartReplicationTaskMessage
   * @throws IOException if the JSON string is invalid with respect to StartReplicationTaskMessage
   */
  public static StartReplicationTaskMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartReplicationTaskMessage.class);
  }

  /**
   * Convert an instance of StartReplicationTaskMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

