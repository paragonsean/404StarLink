/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
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
import org.openapitools.client.model.Distribution;

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
 * A single strongly-typed value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class TypedValue {
  public static final String SERIALIZED_NAME_BOOL_VALUE = "boolValue";
  @SerializedName(SERIALIZED_NAME_BOOL_VALUE)
  private Boolean boolValue;

  public static final String SERIALIZED_NAME_DISTRIBUTION_VALUE = "distributionValue";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_VALUE)
  private Distribution distributionValue;

  public static final String SERIALIZED_NAME_DOUBLE_VALUE = "doubleValue";
  @SerializedName(SERIALIZED_NAME_DOUBLE_VALUE)
  private Double doubleValue;

  public static final String SERIALIZED_NAME_INT64_VALUE = "int64Value";
  @SerializedName(SERIALIZED_NAME_INT64_VALUE)
  private String int64Value;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public TypedValue() {
  }

  public TypedValue boolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * A Boolean value: true or false.
   * @return boolValue
   */
  @javax.annotation.Nullable
  public Boolean getBoolValue() {
    return boolValue;
  }

  public void setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
  }


  public TypedValue distributionValue(Distribution distributionValue) {
    this.distributionValue = distributionValue;
    return this;
  }

  /**
   * Get distributionValue
   * @return distributionValue
   */
  @javax.annotation.Nullable
  public Distribution getDistributionValue() {
    return distributionValue;
  }

  public void setDistributionValue(Distribution distributionValue) {
    this.distributionValue = distributionValue;
  }


  public TypedValue doubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it has 16 significant digits of precision.
   * @return doubleValue
   */
  @javax.annotation.Nullable
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public TypedValue int64Value(String int64Value) {
    this.int64Value = int64Value;
    return this;
  }

  /**
   * A 64-bit integer. Its range is approximately ±9.2x1018.
   * @return int64Value
   */
  @javax.annotation.Nullable
  public String getInt64Value() {
    return int64Value;
  }

  public void setInt64Value(String int64Value) {
    this.int64Value = int64Value;
  }


  public TypedValue stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * A variable-length string value.
   * @return stringValue
   */
  @javax.annotation.Nullable
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypedValue typedValue = (TypedValue) o;
    return Objects.equals(this.boolValue, typedValue.boolValue) &&
        Objects.equals(this.distributionValue, typedValue.distributionValue) &&
        Objects.equals(this.doubleValue, typedValue.doubleValue) &&
        Objects.equals(this.int64Value, typedValue.int64Value) &&
        Objects.equals(this.stringValue, typedValue.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolValue, distributionValue, doubleValue, int64Value, stringValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypedValue {\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
    sb.append("    distributionValue: ").append(toIndentedString(distributionValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    int64Value: ").append(toIndentedString(int64Value)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
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
    openapiFields.add("boolValue");
    openapiFields.add("distributionValue");
    openapiFields.add("doubleValue");
    openapiFields.add("int64Value");
    openapiFields.add("stringValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TypedValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TypedValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TypedValue is not found in the empty JSON string", TypedValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TypedValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TypedValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `distributionValue`
      if (jsonObj.get("distributionValue") != null && !jsonObj.get("distributionValue").isJsonNull()) {
        Distribution.validateJsonElement(jsonObj.get("distributionValue"));
      }
      if ((jsonObj.get("int64Value") != null && !jsonObj.get("int64Value").isJsonNull()) && !jsonObj.get("int64Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `int64Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("int64Value").toString()));
      }
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TypedValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TypedValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TypedValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TypedValue.class));

       return (TypeAdapter<T>) new TypeAdapter<TypedValue>() {
           @Override
           public void write(JsonWriter out, TypedValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TypedValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TypedValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TypedValue
   * @throws IOException if the JSON string is invalid with respect to TypedValue
   */
  public static TypedValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TypedValue.class);
  }

  /**
   * Convert an instance of TypedValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

