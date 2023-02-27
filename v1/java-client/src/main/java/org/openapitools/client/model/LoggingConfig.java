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
 * Specifies the logging behavior for transfer operations. For cloud-to-cloud transfers, logs are sent to Cloud Logging. See [Read transfer logs](https://cloud.google.com/storage-transfer/docs/read-transfer-logs) for details. For transfers to or from a POSIX file system, logs are stored in the Cloud Storage bucket that is the source or sink of the transfer. See [Managing Transfer for on-premises jobs] (https://cloud.google.com/storage-transfer/docs/managing-on-prem-jobs#viewing-logs) for details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:35.098439-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class LoggingConfig {
  public static final String SERIALIZED_NAME_ENABLE_ONPREM_GCS_TRANSFER_LOGS = "enableOnpremGcsTransferLogs";
  @SerializedName(SERIALIZED_NAME_ENABLE_ONPREM_GCS_TRANSFER_LOGS)
  private Boolean enableOnpremGcsTransferLogs;

  /**
   * Gets or Sets logActionStates
   */
  @JsonAdapter(LogActionStatesEnum.Adapter.class)
  public enum LogActionStatesEnum {
    LOGGABLE_ACTION_STATE_UNSPECIFIED("LOGGABLE_ACTION_STATE_UNSPECIFIED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED");

    private String value;

    LogActionStatesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogActionStatesEnum fromValue(String value) {
      for (LogActionStatesEnum b : LogActionStatesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LogActionStatesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogActionStatesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogActionStatesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LogActionStatesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LogActionStatesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LOG_ACTION_STATES = "logActionStates";
  @SerializedName(SERIALIZED_NAME_LOG_ACTION_STATES)
  private List<LogActionStatesEnum> logActionStates = new ArrayList<>();

  /**
   * Gets or Sets logActions
   */
  @JsonAdapter(LogActionsEnum.Adapter.class)
  public enum LogActionsEnum {
    LOGGABLE_ACTION_UNSPECIFIED("LOGGABLE_ACTION_UNSPECIFIED"),
    
    FIND("FIND"),
    
    DELETE("DELETE"),
    
    COPY("COPY");

    private String value;

    LogActionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogActionsEnum fromValue(String value) {
      for (LogActionsEnum b : LogActionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LogActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LogActionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LogActionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LOG_ACTIONS = "logActions";
  @SerializedName(SERIALIZED_NAME_LOG_ACTIONS)
  private List<LogActionsEnum> logActions = new ArrayList<>();

  public LoggingConfig() {
  }

  public LoggingConfig enableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
    this.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
    return this;
  }

  /**
   * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
   * @return enableOnpremGcsTransferLogs
   */
  @javax.annotation.Nullable
  public Boolean getEnableOnpremGcsTransferLogs() {
    return enableOnpremGcsTransferLogs;
  }

  public void setEnableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
    this.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
  }


  public LoggingConfig logActionStates(List<LogActionStatesEnum> logActionStates) {
    this.logActionStates = logActionStates;
    return this;
  }

  public LoggingConfig addLogActionStatesItem(LogActionStatesEnum logActionStatesItem) {
    if (this.logActionStates == null) {
      this.logActionStates = new ArrayList<>();
    }
    this.logActionStates.add(logActionStatesItem);
    return this;
  }

  /**
   * States in which &#x60;log_actions&#x60; are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
   * @return logActionStates
   */
  @javax.annotation.Nullable
  public List<LogActionStatesEnum> getLogActionStates() {
    return logActionStates;
  }

  public void setLogActionStates(List<LogActionStatesEnum> logActionStates) {
    this.logActionStates = logActionStates;
  }


  public LoggingConfig logActions(List<LogActionsEnum> logActions) {
    this.logActions = logActions;
    return this;
  }

  public LoggingConfig addLogActionsItem(LogActionsEnum logActionsItem) {
    if (this.logActions == null) {
      this.logActions = new ArrayList<>();
    }
    this.logActions.add(logActionsItem);
    return this;
  }

  /**
   * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
   * @return logActions
   */
  @javax.annotation.Nullable
  public List<LogActionsEnum> getLogActions() {
    return logActions;
  }

  public void setLogActions(List<LogActionsEnum> logActions) {
    this.logActions = logActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoggingConfig loggingConfig = (LoggingConfig) o;
    return Objects.equals(this.enableOnpremGcsTransferLogs, loggingConfig.enableOnpremGcsTransferLogs) &&
        Objects.equals(this.logActionStates, loggingConfig.logActionStates) &&
        Objects.equals(this.logActions, loggingConfig.logActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableOnpremGcsTransferLogs, logActionStates, logActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggingConfig {\n");
    sb.append("    enableOnpremGcsTransferLogs: ").append(toIndentedString(enableOnpremGcsTransferLogs)).append("\n");
    sb.append("    logActionStates: ").append(toIndentedString(logActionStates)).append("\n");
    sb.append("    logActions: ").append(toIndentedString(logActions)).append("\n");
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
    openapiFields.add("enableOnpremGcsTransferLogs");
    openapiFields.add("logActionStates");
    openapiFields.add("logActions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoggingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoggingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoggingConfig is not found in the empty JSON string", LoggingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoggingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoggingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("logActionStates") != null && !jsonObj.get("logActionStates").isJsonNull() && !jsonObj.get("logActionStates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logActionStates` to be an array in the JSON string but got `%s`", jsonObj.get("logActionStates").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("logActions") != null && !jsonObj.get("logActions").isJsonNull() && !jsonObj.get("logActions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logActions` to be an array in the JSON string but got `%s`", jsonObj.get("logActions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoggingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoggingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoggingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoggingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<LoggingConfig>() {
           @Override
           public void write(JsonWriter out, LoggingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoggingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoggingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoggingConfig
   * @throws IOException if the JSON string is invalid with respect to LoggingConfig
   */
  public static LoggingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoggingConfig.class);
  }

  /**
   * Convert an instance of LoggingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

