/*
 * Fitness API
 * The Fitness API for managing users' fitness tracking data.
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
import org.openapitools.client.model.ValueMapValEntry;

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
 * Holder object for the value of a single field in a data point. A field value has a particular format and is only ever set to one of an integer or a floating point value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:59:03.273138-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Value {
  public static final String SERIALIZED_NAME_FP_VAL = "fpVal";
  @SerializedName(SERIALIZED_NAME_FP_VAL)
  private Double fpVal;

  public static final String SERIALIZED_NAME_INT_VAL = "intVal";
  @SerializedName(SERIALIZED_NAME_INT_VAL)
  private Integer intVal;

  public static final String SERIALIZED_NAME_MAP_VAL = "mapVal";
  @SerializedName(SERIALIZED_NAME_MAP_VAL)
  private List<ValueMapValEntry> mapVal = new ArrayList<>();

  public static final String SERIALIZED_NAME_STRING_VAL = "stringVal";
  @SerializedName(SERIALIZED_NAME_STRING_VAL)
  private String stringVal;

  public Value() {
  }

  public Value fpVal(Double fpVal) {
    this.fpVal = fpVal;
    return this;
  }

  /**
   * Floating point value. When this is set, other values must not be set.
   * @return fpVal
   */
  @javax.annotation.Nullable
  public Double getFpVal() {
    return fpVal;
  }

  public void setFpVal(Double fpVal) {
    this.fpVal = fpVal;
  }


  public Value intVal(Integer intVal) {
    this.intVal = intVal;
    return this;
  }

  /**
   * Integer value. When this is set, other values must not be set.
   * @return intVal
   */
  @javax.annotation.Nullable
  public Integer getIntVal() {
    return intVal;
  }

  public void setIntVal(Integer intVal) {
    this.intVal = intVal;
  }


  public Value mapVal(List<ValueMapValEntry> mapVal) {
    this.mapVal = mapVal;
    return this;
  }

  public Value addMapValItem(ValueMapValEntry mapValItem) {
    if (this.mapVal == null) {
      this.mapVal = new ArrayList<>();
    }
    this.mapVal.add(mapValItem);
    return this;
  }

  /**
   * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys should be kept small whenever possible. Data streams with large keys and high data frequency may be down sampled.
   * @return mapVal
   */
  @javax.annotation.Nullable
  public List<ValueMapValEntry> getMapVal() {
    return mapVal;
  }

  public void setMapVal(List<ValueMapValEntry> mapVal) {
    this.mapVal = mapVal;
  }


  public Value stringVal(String stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  /**
   * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and high data frequency may be down sampled.
   * @return stringVal
   */
  @javax.annotation.Nullable
  public String getStringVal() {
    return stringVal;
  }

  public void setStringVal(String stringVal) {
    this.stringVal = stringVal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Value value = (Value) o;
    return Objects.equals(this.fpVal, value.fpVal) &&
        Objects.equals(this.intVal, value.intVal) &&
        Objects.equals(this.mapVal, value.mapVal) &&
        Objects.equals(this.stringVal, value.stringVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fpVal, intVal, mapVal, stringVal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    sb.append("    fpVal: ").append(toIndentedString(fpVal)).append("\n");
    sb.append("    intVal: ").append(toIndentedString(intVal)).append("\n");
    sb.append("    mapVal: ").append(toIndentedString(mapVal)).append("\n");
    sb.append("    stringVal: ").append(toIndentedString(stringVal)).append("\n");
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
    openapiFields.add("fpVal");
    openapiFields.add("intVal");
    openapiFields.add("mapVal");
    openapiFields.add("stringVal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Value
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Value.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Value is not found in the empty JSON string", Value.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Value.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Value` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("mapVal") != null && !jsonObj.get("mapVal").isJsonNull()) {
        JsonArray jsonArraymapVal = jsonObj.getAsJsonArray("mapVal");
        if (jsonArraymapVal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mapVal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mapVal` to be an array in the JSON string but got `%s`", jsonObj.get("mapVal").toString()));
          }

          // validate the optional field `mapVal` (array)
          for (int i = 0; i < jsonArraymapVal.size(); i++) {
            ValueMapValEntry.validateJsonElement(jsonArraymapVal.get(i));
          };
        }
      }
      if ((jsonObj.get("stringVal") != null && !jsonObj.get("stringVal").isJsonNull()) && !jsonObj.get("stringVal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringVal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringVal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Value.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Value' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Value> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Value.class));

       return (TypeAdapter<T>) new TypeAdapter<Value>() {
           @Override
           public void write(JsonWriter out, Value value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Value read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Value given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Value
   * @throws IOException if the JSON string is invalid with respect to Value
   */
  public static Value fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Value.class);
  }

  /**
   * Convert an instance of Value to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

