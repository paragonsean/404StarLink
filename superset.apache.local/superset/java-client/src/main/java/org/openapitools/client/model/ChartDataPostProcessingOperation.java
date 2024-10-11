/*
 * Superset
 * Superset
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
import java.util.Arrays;

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
 * ChartDataPostProcessingOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ChartDataPostProcessingOperation {
  /**
   * Post processing operation type
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    AGGREGATE("aggregate"),
    
    BOXPLOT("boxplot"),
    
    CONTRIBUTION("contribution"),
    
    CUM("cum"),
    
    GEODETIC_PARSE("geodetic_parse"),
    
    GEOHASH_DECODE("geohash_decode"),
    
    GEOHASH_ENCODE("geohash_encode"),
    
    PIVOT("pivot"),
    
    PROPHET("prophet"),
    
    ROLLING("rolling"),
    
    SELECT("select"),
    
    SORT("sort"),
    
    DIFF("diff"),
    
    COMPARE("compare");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public ChartDataPostProcessingOperation() {
  }

  public ChartDataPostProcessingOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Post processing operation type
   * @return operation
   */
  @javax.annotation.Nonnull
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public ChartDataPostProcessingOperation options(Object options) {
    this.options = options;
    return this;
  }

  /**
   * Options specifying how to perform the operation. Please refer to the respective post processing operation option schemas. For example, &#x60;ChartDataPostProcessingOperationOptions&#x60; specifies the required options for the pivot operation.
   * @return options
   */
  @javax.annotation.Nullable
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartDataPostProcessingOperation chartDataPostProcessingOperation = (ChartDataPostProcessingOperation) o;
    return Objects.equals(this.operation, chartDataPostProcessingOperation.operation) &&
        Objects.equals(this.options, chartDataPostProcessingOperation.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartDataPostProcessingOperation {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChartDataPostProcessingOperation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChartDataPostProcessingOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChartDataPostProcessingOperation is not found in the empty JSON string", ChartDataPostProcessingOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChartDataPostProcessingOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChartDataPostProcessingOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChartDataPostProcessingOperation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the required field `operation`
      OperationEnum.validateJsonElement(jsonObj.get("operation"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChartDataPostProcessingOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChartDataPostProcessingOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChartDataPostProcessingOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChartDataPostProcessingOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<ChartDataPostProcessingOperation>() {
           @Override
           public void write(JsonWriter out, ChartDataPostProcessingOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChartDataPostProcessingOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChartDataPostProcessingOperation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChartDataPostProcessingOperation
   * @throws IOException if the JSON string is invalid with respect to ChartDataPostProcessingOperation
   */
  public static ChartDataPostProcessingOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChartDataPostProcessingOperation.class);
  }

  /**
   * Convert an instance of ChartDataPostProcessingOperation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

