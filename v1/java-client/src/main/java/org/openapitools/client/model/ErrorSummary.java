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
import org.openapitools.client.model.ErrorLogEntry;

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
 * A summary of errors by error code, plus a count and sample error log entries.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:35.098439-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ErrorSummary {
  /**
   * Required.
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    OK("OK"),
    
    CANCELLED("CANCELLED"),
    
    UNKNOWN("UNKNOWN"),
    
    INVALID_ARGUMENT("INVALID_ARGUMENT"),
    
    DEADLINE_EXCEEDED("DEADLINE_EXCEEDED"),
    
    NOT_FOUND("NOT_FOUND"),
    
    ALREADY_EXISTS("ALREADY_EXISTS"),
    
    PERMISSION_DENIED("PERMISSION_DENIED"),
    
    UNAUTHENTICATED("UNAUTHENTICATED"),
    
    RESOURCE_EXHAUSTED("RESOURCE_EXHAUSTED"),
    
    FAILED_PRECONDITION("FAILED_PRECONDITION"),
    
    ABORTED("ABORTED"),
    
    OUT_OF_RANGE("OUT_OF_RANGE"),
    
    UNIMPLEMENTED("UNIMPLEMENTED"),
    
    INTERNAL("INTERNAL"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    DATA_LOSS("DATA_LOSS");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ErrorCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "errorCount";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private String errorCount;

  public static final String SERIALIZED_NAME_ERROR_LOG_ENTRIES = "errorLogEntries";
  @SerializedName(SERIALIZED_NAME_ERROR_LOG_ENTRIES)
  private List<ErrorLogEntry> errorLogEntries = new ArrayList<>();

  public ErrorSummary() {
  }

  public ErrorSummary errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Required.
   * @return errorCode
   */
  @javax.annotation.Nullable
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorSummary errorCount(String errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Required. Count of this type of error.
   * @return errorCount
   */
  @javax.annotation.Nullable
  public String getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(String errorCount) {
    this.errorCount = errorCount;
  }


  public ErrorSummary errorLogEntries(List<ErrorLogEntry> errorLogEntries) {
    this.errorLogEntries = errorLogEntries;
    return this;
  }

  public ErrorSummary addErrorLogEntriesItem(ErrorLogEntry errorLogEntriesItem) {
    if (this.errorLogEntries == null) {
      this.errorLogEntries = new ArrayList<>();
    }
    this.errorLogEntries.add(errorLogEntriesItem);
    return this;
  }

  /**
   * Error samples. At most 5 error log entries are recorded for a given error code for a single transfer operation.
   * @return errorLogEntries
   */
  @javax.annotation.Nullable
  public List<ErrorLogEntry> getErrorLogEntries() {
    return errorLogEntries;
  }

  public void setErrorLogEntries(List<ErrorLogEntry> errorLogEntries) {
    this.errorLogEntries = errorLogEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorSummary errorSummary = (ErrorSummary) o;
    return Objects.equals(this.errorCode, errorSummary.errorCode) &&
        Objects.equals(this.errorCount, errorSummary.errorCount) &&
        Objects.equals(this.errorLogEntries, errorSummary.errorLogEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorCount, errorLogEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorSummary {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorLogEntries: ").append(toIndentedString(errorLogEntries)).append("\n");
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
    openapiFields.add("errorCode");
    openapiFields.add("errorCount");
    openapiFields.add("errorLogEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ErrorSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorSummary is not found in the empty JSON string", ErrorSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ErrorSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      // validate the optional field `errorCode`
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) {
        ErrorCodeEnum.validateJsonElement(jsonObj.get("errorCode"));
      }
      if ((jsonObj.get("errorCount") != null && !jsonObj.get("errorCount").isJsonNull()) && !jsonObj.get("errorCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCount").toString()));
      }
      if (jsonObj.get("errorLogEntries") != null && !jsonObj.get("errorLogEntries").isJsonNull()) {
        JsonArray jsonArrayerrorLogEntries = jsonObj.getAsJsonArray("errorLogEntries");
        if (jsonArrayerrorLogEntries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errorLogEntries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errorLogEntries` to be an array in the JSON string but got `%s`", jsonObj.get("errorLogEntries").toString()));
          }

          // validate the optional field `errorLogEntries` (array)
          for (int i = 0; i < jsonArrayerrorLogEntries.size(); i++) {
            ErrorLogEntry.validateJsonElement(jsonArrayerrorLogEntries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorSummary>() {
           @Override
           public void write(JsonWriter out, ErrorSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ErrorSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ErrorSummary
   * @throws IOException if the JSON string is invalid with respect to ErrorSummary
   */
  public static ErrorSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorSummary.class);
  }

  /**
   * Convert an instance of ErrorSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

