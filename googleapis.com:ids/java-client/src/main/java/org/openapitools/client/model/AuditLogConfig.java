/*
 * Cloud IDS API
 * Cloud IDS (Cloud Intrusion Detection System) detects malware, spyware, command-and-control attacks, and other network-based threats. Its security efficacy is industry leading, built with Palo Alto Networks technologies. When you use this product, your organization name and consumption levels will be shared with Palo Alto Networks.
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
 * Provides the configuration for logging a type of permissions. Example: { \&quot;audit_log_configs\&quot;: [ { \&quot;log_type\&quot;: \&quot;DATA_READ\&quot;, \&quot;exempted_members\&quot;: [ \&quot;user:jose@example.com\&quot; ] }, { \&quot;log_type\&quot;: \&quot;DATA_WRITE\&quot; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:21.649040-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AuditLogConfig {
  public static final String SERIALIZED_NAME_EXEMPTED_MEMBERS = "exemptedMembers";
  @SerializedName(SERIALIZED_NAME_EXEMPTED_MEMBERS)
  private List<String> exemptedMembers = new ArrayList<>();

  /**
   * The log type that this config enables.
   */
  @JsonAdapter(LogTypeEnum.Adapter.class)
  public enum LogTypeEnum {
    LOG_TYPE_UNSPECIFIED("LOG_TYPE_UNSPECIFIED"),
    
    ADMIN_READ("ADMIN_READ"),
    
    DATA_WRITE("DATA_WRITE"),
    
    DATA_READ("DATA_READ");

    private String value;

    LogTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogTypeEnum fromValue(String value) {
      for (LogTypeEnum b : LogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LogTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LogTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LogTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LOG_TYPE = "logType";
  @SerializedName(SERIALIZED_NAME_LOG_TYPE)
  private LogTypeEnum logType;

  public AuditLogConfig() {
  }

  public AuditLogConfig exemptedMembers(List<String> exemptedMembers) {
    this.exemptedMembers = exemptedMembers;
    return this;
  }

  public AuditLogConfig addExemptedMembersItem(String exemptedMembersItem) {
    if (this.exemptedMembers == null) {
      this.exemptedMembers = new ArrayList<>();
    }
    this.exemptedMembers.add(exemptedMembersItem);
    return this;
  }

  /**
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * @return exemptedMembers
   */
  @javax.annotation.Nullable
  public List<String> getExemptedMembers() {
    return exemptedMembers;
  }

  public void setExemptedMembers(List<String> exemptedMembers) {
    this.exemptedMembers = exemptedMembers;
  }


  public AuditLogConfig logType(LogTypeEnum logType) {
    this.logType = logType;
    return this;
  }

  /**
   * The log type that this config enables.
   * @return logType
   */
  @javax.annotation.Nullable
  public LogTypeEnum getLogType() {
    return logType;
  }

  public void setLogType(LogTypeEnum logType) {
    this.logType = logType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogConfig auditLogConfig = (AuditLogConfig) o;
    return Objects.equals(this.exemptedMembers, auditLogConfig.exemptedMembers) &&
        Objects.equals(this.logType, auditLogConfig.logType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exemptedMembers, logType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogConfig {\n");
    sb.append("    exemptedMembers: ").append(toIndentedString(exemptedMembers)).append("\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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
    openapiFields.add("exemptedMembers");
    openapiFields.add("logType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuditLogConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuditLogConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditLogConfig is not found in the empty JSON string", AuditLogConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuditLogConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditLogConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("exemptedMembers") != null && !jsonObj.get("exemptedMembers").isJsonNull() && !jsonObj.get("exemptedMembers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptedMembers` to be an array in the JSON string but got `%s`", jsonObj.get("exemptedMembers").toString()));
      }
      if ((jsonObj.get("logType") != null && !jsonObj.get("logType").isJsonNull()) && !jsonObj.get("logType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logType").toString()));
      }
      // validate the optional field `logType`
      if (jsonObj.get("logType") != null && !jsonObj.get("logType").isJsonNull()) {
        LogTypeEnum.validateJsonElement(jsonObj.get("logType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditLogConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditLogConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditLogConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditLogConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditLogConfig>() {
           @Override
           public void write(JsonWriter out, AuditLogConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditLogConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuditLogConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuditLogConfig
   * @throws IOException if the JSON string is invalid with respect to AuditLogConfig
   */
  public static AuditLogConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditLogConfig.class);
  }

  /**
   * Convert an instance of AuditLogConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

