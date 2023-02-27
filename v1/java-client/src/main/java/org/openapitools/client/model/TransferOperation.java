/*
 * Storage Transfer API
 * Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 
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
import org.openapitools.client.model.ErrorSummary;
import org.openapitools.client.model.LoggingConfig;
import org.openapitools.client.model.NotificationConfig;
import org.openapitools.client.model.TransferCounters;
import org.openapitools.client.model.TransferSpec;

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
 * A description of the execution of a transfer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:35.098439-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TransferOperation {
  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  private TransferCounters counters;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_ERROR_BREAKDOWNS = "errorBreakdowns";
  @SerializedName(SERIALIZED_NAME_ERROR_BREAKDOWNS)
  private List<ErrorSummary> errorBreakdowns = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGGING_CONFIG = "loggingConfig";
  @SerializedName(SERIALIZED_NAME_LOGGING_CONFIG)
  private LoggingConfig loggingConfig;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_CONFIG = "notificationConfig";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_CONFIG)
  private NotificationConfig notificationConfig;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  /**
   * Status of the transfer operation.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STATUS_UNSPECIFIED("STATUS_UNSPECIFIED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    PAUSED("PAUSED"),
    
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED"),
    
    ABORTED("ABORTED"),
    
    QUEUED("QUEUED"),
    
    SUSPENDING("SUSPENDING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TRANSFER_JOB_NAME = "transferJobName";
  @SerializedName(SERIALIZED_NAME_TRANSFER_JOB_NAME)
  private String transferJobName;

  public static final String SERIALIZED_NAME_TRANSFER_SPEC = "transferSpec";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SPEC)
  private TransferSpec transferSpec;

  public TransferOperation() {
  }

  public TransferOperation counters(TransferCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
   */
  @javax.annotation.Nullable
  public TransferCounters getCounters() {
    return counters;
  }

  public void setCounters(TransferCounters counters) {
    this.counters = counters;
  }


  public TransferOperation endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of this transfer execution.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public TransferOperation errorBreakdowns(List<ErrorSummary> errorBreakdowns) {
    this.errorBreakdowns = errorBreakdowns;
    return this;
  }

  public TransferOperation addErrorBreakdownsItem(ErrorSummary errorBreakdownsItem) {
    if (this.errorBreakdowns == null) {
      this.errorBreakdowns = new ArrayList<>();
    }
    this.errorBreakdowns.add(errorBreakdownsItem);
    return this;
  }

  /**
   * Summarizes errors encountered with sample error log entries.
   * @return errorBreakdowns
   */
  @javax.annotation.Nullable
  public List<ErrorSummary> getErrorBreakdowns() {
    return errorBreakdowns;
  }

  public void setErrorBreakdowns(List<ErrorSummary> errorBreakdowns) {
    this.errorBreakdowns = errorBreakdowns;
  }


  public TransferOperation loggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  /**
   * Get loggingConfig
   * @return loggingConfig
   */
  @javax.annotation.Nullable
  public LoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  public void setLoggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
  }


  public TransferOperation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A globally unique ID assigned by the system.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TransferOperation notificationConfig(NotificationConfig notificationConfig) {
    this.notificationConfig = notificationConfig;
    return this;
  }

  /**
   * Get notificationConfig
   * @return notificationConfig
   */
  @javax.annotation.Nullable
  public NotificationConfig getNotificationConfig() {
    return notificationConfig;
  }

  public void setNotificationConfig(NotificationConfig notificationConfig) {
    this.notificationConfig = notificationConfig;
  }


  public TransferOperation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the Google Cloud project that owns the operation.
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public TransferOperation startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of this transfer execution.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public TransferOperation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the transfer operation.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransferOperation transferJobName(String transferJobName) {
    this.transferJobName = transferJobName;
    return this;
  }

  /**
   * The name of the transfer job that triggers this transfer operation.
   * @return transferJobName
   */
  @javax.annotation.Nullable
  public String getTransferJobName() {
    return transferJobName;
  }

  public void setTransferJobName(String transferJobName) {
    this.transferJobName = transferJobName;
  }


  public TransferOperation transferSpec(TransferSpec transferSpec) {
    this.transferSpec = transferSpec;
    return this;
  }

  /**
   * Get transferSpec
   * @return transferSpec
   */
  @javax.annotation.Nullable
  public TransferSpec getTransferSpec() {
    return transferSpec;
  }

  public void setTransferSpec(TransferSpec transferSpec) {
    this.transferSpec = transferSpec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOperation transferOperation = (TransferOperation) o;
    return Objects.equals(this.counters, transferOperation.counters) &&
        Objects.equals(this.endTime, transferOperation.endTime) &&
        Objects.equals(this.errorBreakdowns, transferOperation.errorBreakdowns) &&
        Objects.equals(this.loggingConfig, transferOperation.loggingConfig) &&
        Objects.equals(this.name, transferOperation.name) &&
        Objects.equals(this.notificationConfig, transferOperation.notificationConfig) &&
        Objects.equals(this.projectId, transferOperation.projectId) &&
        Objects.equals(this.startTime, transferOperation.startTime) &&
        Objects.equals(this.status, transferOperation.status) &&
        Objects.equals(this.transferJobName, transferOperation.transferJobName) &&
        Objects.equals(this.transferSpec, transferOperation.transferSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, endTime, errorBreakdowns, loggingConfig, name, notificationConfig, projectId, startTime, status, transferJobName, transferSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferOperation {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    errorBreakdowns: ").append(toIndentedString(errorBreakdowns)).append("\n");
    sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationConfig: ").append(toIndentedString(notificationConfig)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferJobName: ").append(toIndentedString(transferJobName)).append("\n");
    sb.append("    transferSpec: ").append(toIndentedString(transferSpec)).append("\n");
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
    openapiFields.add("counters");
    openapiFields.add("endTime");
    openapiFields.add("errorBreakdowns");
    openapiFields.add("loggingConfig");
    openapiFields.add("name");
    openapiFields.add("notificationConfig");
    openapiFields.add("projectId");
    openapiFields.add("startTime");
    openapiFields.add("status");
    openapiFields.add("transferJobName");
    openapiFields.add("transferSpec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransferOperation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransferOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferOperation is not found in the empty JSON string", TransferOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransferOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `counters`
      if (jsonObj.get("counters") != null && !jsonObj.get("counters").isJsonNull()) {
        TransferCounters.validateJsonElement(jsonObj.get("counters"));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if (jsonObj.get("errorBreakdowns") != null && !jsonObj.get("errorBreakdowns").isJsonNull()) {
        JsonArray jsonArrayerrorBreakdowns = jsonObj.getAsJsonArray("errorBreakdowns");
        if (jsonArrayerrorBreakdowns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errorBreakdowns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errorBreakdowns` to be an array in the JSON string but got `%s`", jsonObj.get("errorBreakdowns").toString()));
          }

          // validate the optional field `errorBreakdowns` (array)
          for (int i = 0; i < jsonArrayerrorBreakdowns.size(); i++) {
            ErrorSummary.validateJsonElement(jsonArrayerrorBreakdowns.get(i));
          };
        }
      }
      // validate the optional field `loggingConfig`
      if (jsonObj.get("loggingConfig") != null && !jsonObj.get("loggingConfig").isJsonNull()) {
        LoggingConfig.validateJsonElement(jsonObj.get("loggingConfig"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `notificationConfig`
      if (jsonObj.get("notificationConfig") != null && !jsonObj.get("notificationConfig").isJsonNull()) {
        NotificationConfig.validateJsonElement(jsonObj.get("notificationConfig"));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("transferJobName") != null && !jsonObj.get("transferJobName").isJsonNull()) && !jsonObj.get("transferJobName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferJobName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferJobName").toString()));
      }
      // validate the optional field `transferSpec`
      if (jsonObj.get("transferSpec") != null && !jsonObj.get("transferSpec").isJsonNull()) {
        TransferSpec.validateJsonElement(jsonObj.get("transferSpec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferOperation>() {
           @Override
           public void write(JsonWriter out, TransferOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransferOperation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferOperation
   * @throws IOException if the JSON string is invalid with respect to TransferOperation
   */
  public static TransferOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferOperation.class);
  }

  /**
   * Convert an instance of TransferOperation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

