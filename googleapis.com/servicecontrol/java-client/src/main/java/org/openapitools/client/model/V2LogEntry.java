/*
 * Service Control API
 * Provides admission control and telemetry reporting for services integrated with Service Infrastructure. 
 *
 * The version of the OpenAPI document: v2
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.V2HttpRequest;
import org.openapitools.client.model.V2LogEntryOperation;
import org.openapitools.client.model.V2LogEntrySourceLocation;

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
 * An individual log entry.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:54.152517-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class V2LogEntry {
  public static final String SERIALIZED_NAME_HTTP_REQUEST = "httpRequest";
  @SerializedName(SERIALIZED_NAME_HTTP_REQUEST)
  private V2HttpRequest httpRequest;

  public static final String SERIALIZED_NAME_INSERT_ID = "insertId";
  @SerializedName(SERIALIZED_NAME_INSERT_ID)
  private String insertId;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MONITORED_RESOURCE_LABELS = "monitoredResourceLabels";
  @SerializedName(SERIALIZED_NAME_MONITORED_RESOURCE_LABELS)
  private Map<String, String> monitoredResourceLabels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private V2LogEntryOperation operation;

  public static final String SERIALIZED_NAME_PROTO_PAYLOAD = "protoPayload";
  @SerializedName(SERIALIZED_NAME_PROTO_PAYLOAD)
  private Map<String, Object> protoPayload = new HashMap<>();

  /**
   * The severity of the log entry. The default value is &#x60;LogSeverity.DEFAULT&#x60;.
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    DEFAULT("DEFAULT"),
    
    DEBUG("DEBUG"),
    
    INFO("INFO"),
    
    NOTICE("NOTICE"),
    
    WARNING("WARNING"),
    
    ERROR("ERROR"),
    
    CRITICAL("CRITICAL"),
    
    ALERT("ALERT"),
    
    EMERGENCY("EMERGENCY");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SeverityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity;

  public static final String SERIALIZED_NAME_SOURCE_LOCATION = "sourceLocation";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCATION)
  private V2LogEntrySourceLocation sourceLocation;

  public static final String SERIALIZED_NAME_STRUCT_PAYLOAD = "structPayload";
  @SerializedName(SERIALIZED_NAME_STRUCT_PAYLOAD)
  private Map<String, Object> structPayload = new HashMap<>();

  public static final String SERIALIZED_NAME_TEXT_PAYLOAD = "textPayload";
  @SerializedName(SERIALIZED_NAME_TEXT_PAYLOAD)
  private String textPayload;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private String trace;

  public V2LogEntry() {
  }

  public V2LogEntry httpRequest(V2HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * Get httpRequest
   * @return httpRequest
   */
  @javax.annotation.Nullable
  public V2HttpRequest getHttpRequest() {
    return httpRequest;
  }

  public void setHttpRequest(V2HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
  }


  public V2LogEntry insertId(String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * A unique ID for the log entry used for deduplication. If omitted, the implementation will generate one based on operation_id.
   * @return insertId
   */
  @javax.annotation.Nullable
  public String getInsertId() {
    return insertId;
  }

  public void setInsertId(String insertId) {
    this.insertId = insertId;
  }


  public V2LogEntry labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V2LogEntry putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the log entry.
   * @return labels
   */
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V2LogEntry monitoredResourceLabels(Map<String, String> monitoredResourceLabels) {
    this.monitoredResourceLabels = monitoredResourceLabels;
    return this;
  }

  public V2LogEntry putMonitoredResourceLabelsItem(String key, String monitoredResourceLabelsItem) {
    if (this.monitoredResourceLabels == null) {
      this.monitoredResourceLabels = new HashMap<>();
    }
    this.monitoredResourceLabels.put(key, monitoredResourceLabelsItem);
    return this;
  }

  /**
   * A set of user-defined (key, value) data that provides additional information about the moniotored resource that the log entry belongs to.
   * @return monitoredResourceLabels
   */
  @javax.annotation.Nullable
  public Map<String, String> getMonitoredResourceLabels() {
    return monitoredResourceLabels;
  }

  public void setMonitoredResourceLabels(Map<String, String> monitoredResourceLabels) {
    this.monitoredResourceLabels = monitoredResourceLabels;
  }


  public V2LogEntry name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The log to which this log entry belongs. Examples: &#x60;\&quot;syslog\&quot;&#x60;, &#x60;\&quot;book_log\&quot;&#x60;.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V2LogEntry operation(V2LogEntryOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable
  public V2LogEntryOperation getOperation() {
    return operation;
  }

  public void setOperation(V2LogEntryOperation operation) {
    this.operation = operation;
  }


  public V2LogEntry protoPayload(Map<String, Object> protoPayload) {
    this.protoPayload = protoPayload;
    return this;
  }

  public V2LogEntry putProtoPayloadItem(String key, Object protoPayloadItem) {
    if (this.protoPayload == null) {
      this.protoPayload = new HashMap<>();
    }
    this.protoPayload.put(key, protoPayloadItem);
    return this;
  }

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The only accepted type currently is AuditLog.
   * @return protoPayload
   */
  @javax.annotation.Nullable
  public Map<String, Object> getProtoPayload() {
    return protoPayload;
  }

  public void setProtoPayload(Map<String, Object> protoPayload) {
    this.protoPayload = protoPayload;
  }


  public V2LogEntry severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the log entry. The default value is &#x60;LogSeverity.DEFAULT&#x60;.
   * @return severity
   */
  @javax.annotation.Nullable
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public V2LogEntry sourceLocation(V2LogEntrySourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * Get sourceLocation
   * @return sourceLocation
   */
  @javax.annotation.Nullable
  public V2LogEntrySourceLocation getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(V2LogEntrySourceLocation sourceLocation) {
    this.sourceLocation = sourceLocation;
  }


  public V2LogEntry structPayload(Map<String, Object> structPayload) {
    this.structPayload = structPayload;
    return this;
  }

  public V2LogEntry putStructPayloadItem(String key, Object structPayloadItem) {
    if (this.structPayload == null) {
      this.structPayload = new HashMap<>();
    }
    this.structPayload.put(key, structPayloadItem);
    return this;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @return structPayload
   */
  @javax.annotation.Nullable
  public Map<String, Object> getStructPayload() {
    return structPayload;
  }

  public void setStructPayload(Map<String, Object> structPayload) {
    this.structPayload = structPayload;
  }


  public V2LogEntry textPayload(String textPayload) {
    this.textPayload = textPayload;
    return this;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @return textPayload
   */
  @javax.annotation.Nullable
  public String getTextPayload() {
    return textPayload;
  }

  public void setTextPayload(String textPayload) {
    this.textPayload = textPayload;
  }


  public V2LogEntry timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time the event described by the log entry occurred. If omitted, defaults to operation start time.
   * @return timestamp
   */
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public V2LogEntry trace(String trace) {
    this.trace = trace;
    return this;
  }

  /**
   * Optional. Resource name of the trace associated with the log entry, if any. If this field contains a relative resource name, you can assume the name is relative to &#x60;//tracing.googleapis.com&#x60;. Example: &#x60;projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824&#x60;
   * @return trace
   */
  @javax.annotation.Nullable
  public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2LogEntry v2LogEntry = (V2LogEntry) o;
    return Objects.equals(this.httpRequest, v2LogEntry.httpRequest) &&
        Objects.equals(this.insertId, v2LogEntry.insertId) &&
        Objects.equals(this.labels, v2LogEntry.labels) &&
        Objects.equals(this.monitoredResourceLabels, v2LogEntry.monitoredResourceLabels) &&
        Objects.equals(this.name, v2LogEntry.name) &&
        Objects.equals(this.operation, v2LogEntry.operation) &&
        Objects.equals(this.protoPayload, v2LogEntry.protoPayload) &&
        Objects.equals(this.severity, v2LogEntry.severity) &&
        Objects.equals(this.sourceLocation, v2LogEntry.sourceLocation) &&
        Objects.equals(this.structPayload, v2LogEntry.structPayload) &&
        Objects.equals(this.textPayload, v2LogEntry.textPayload) &&
        Objects.equals(this.timestamp, v2LogEntry.timestamp) &&
        Objects.equals(this.trace, v2LogEntry.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpRequest, insertId, labels, monitoredResourceLabels, name, operation, protoPayload, severity, sourceLocation, structPayload, textPayload, timestamp, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2LogEntry {\n");
    sb.append("    httpRequest: ").append(toIndentedString(httpRequest)).append("\n");
    sb.append("    insertId: ").append(toIndentedString(insertId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    monitoredResourceLabels: ").append(toIndentedString(monitoredResourceLabels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    protoPayload: ").append(toIndentedString(protoPayload)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    structPayload: ").append(toIndentedString(structPayload)).append("\n");
    sb.append("    textPayload: ").append(toIndentedString(textPayload)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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
    openapiFields.add("httpRequest");
    openapiFields.add("insertId");
    openapiFields.add("labels");
    openapiFields.add("monitoredResourceLabels");
    openapiFields.add("name");
    openapiFields.add("operation");
    openapiFields.add("protoPayload");
    openapiFields.add("severity");
    openapiFields.add("sourceLocation");
    openapiFields.add("structPayload");
    openapiFields.add("textPayload");
    openapiFields.add("timestamp");
    openapiFields.add("trace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2LogEntry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2LogEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2LogEntry is not found in the empty JSON string", V2LogEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2LogEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2LogEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `httpRequest`
      if (jsonObj.get("httpRequest") != null && !jsonObj.get("httpRequest").isJsonNull()) {
        V2HttpRequest.validateJsonElement(jsonObj.get("httpRequest"));
      }
      if ((jsonObj.get("insertId") != null && !jsonObj.get("insertId").isJsonNull()) && !jsonObj.get("insertId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insertId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insertId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        V2LogEntryOperation.validateJsonElement(jsonObj.get("operation"));
      }
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        SeverityEnum.validateJsonElement(jsonObj.get("severity"));
      }
      // validate the optional field `sourceLocation`
      if (jsonObj.get("sourceLocation") != null && !jsonObj.get("sourceLocation").isJsonNull()) {
        V2LogEntrySourceLocation.validateJsonElement(jsonObj.get("sourceLocation"));
      }
      if ((jsonObj.get("textPayload") != null && !jsonObj.get("textPayload").isJsonNull()) && !jsonObj.get("textPayload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textPayload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textPayload").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("trace") != null && !jsonObj.get("trace").isJsonNull()) && !jsonObj.get("trace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2LogEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2LogEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2LogEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2LogEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<V2LogEntry>() {
           @Override
           public void write(JsonWriter out, V2LogEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2LogEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2LogEntry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2LogEntry
   * @throws IOException if the JSON string is invalid with respect to V2LogEntry
   */
  public static V2LogEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2LogEntry.class);
  }

  /**
   * Convert an instance of V2LogEntry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

