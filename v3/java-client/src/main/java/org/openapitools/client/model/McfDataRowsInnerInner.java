/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.McfDataRowsInnerInnerConversionPathValueInner;

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
 * A union object representing a dimension or metric value. Only one of \&quot;primitiveValue\&quot; or \&quot;conversionPathValue\&quot; attribute will be populated.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:01:26.696972-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class McfDataRowsInnerInner {
  public static final String SERIALIZED_NAME_CONVERSION_PATH_VALUE = "conversionPathValue";
  @SerializedName(SERIALIZED_NAME_CONVERSION_PATH_VALUE)
  private List<McfDataRowsInnerInnerConversionPathValueInner> conversionPathValue = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIMITIVE_VALUE = "primitiveValue";
  @SerializedName(SERIALIZED_NAME_PRIMITIVE_VALUE)
  private String primitiveValue;

  public McfDataRowsInnerInner() {
  }

  public McfDataRowsInnerInner conversionPathValue(List<McfDataRowsInnerInnerConversionPathValueInner> conversionPathValue) {
    this.conversionPathValue = conversionPathValue;
    return this;
  }

  public McfDataRowsInnerInner addConversionPathValueItem(McfDataRowsInnerInnerConversionPathValueInner conversionPathValueItem) {
    if (this.conversionPathValue == null) {
      this.conversionPathValue = new ArrayList<>();
    }
    this.conversionPathValue.add(conversionPathValueItem);
    return this;
  }

  /**
   * A conversion path dimension value, containing a list of interactions with their attributes.
   * @return conversionPathValue
   */
  @javax.annotation.Nullable
  public List<McfDataRowsInnerInnerConversionPathValueInner> getConversionPathValue() {
    return conversionPathValue;
  }

  public void setConversionPathValue(List<McfDataRowsInnerInnerConversionPathValueInner> conversionPathValue) {
    this.conversionPathValue = conversionPathValue;
  }


  public McfDataRowsInnerInner primitiveValue(String primitiveValue) {
    this.primitiveValue = primitiveValue;
    return this;
  }

  /**
   * A primitive dimension value. A primitive metric value.
   * @return primitiveValue
   */
  @javax.annotation.Nullable
  public String getPrimitiveValue() {
    return primitiveValue;
  }

  public void setPrimitiveValue(String primitiveValue) {
    this.primitiveValue = primitiveValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McfDataRowsInnerInner mcfDataRowsInnerInner = (McfDataRowsInnerInner) o;
    return Objects.equals(this.conversionPathValue, mcfDataRowsInnerInner.conversionPathValue) &&
        Objects.equals(this.primitiveValue, mcfDataRowsInnerInner.primitiveValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionPathValue, primitiveValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McfDataRowsInnerInner {\n");
    sb.append("    conversionPathValue: ").append(toIndentedString(conversionPathValue)).append("\n");
    sb.append("    primitiveValue: ").append(toIndentedString(primitiveValue)).append("\n");
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
    openapiFields.add("conversionPathValue");
    openapiFields.add("primitiveValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to McfDataRowsInnerInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!McfDataRowsInnerInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in McfDataRowsInnerInner is not found in the empty JSON string", McfDataRowsInnerInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!McfDataRowsInnerInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `McfDataRowsInnerInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conversionPathValue") != null && !jsonObj.get("conversionPathValue").isJsonNull()) {
        JsonArray jsonArrayconversionPathValue = jsonObj.getAsJsonArray("conversionPathValue");
        if (jsonArrayconversionPathValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conversionPathValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conversionPathValue` to be an array in the JSON string but got `%s`", jsonObj.get("conversionPathValue").toString()));
          }

          // validate the optional field `conversionPathValue` (array)
          for (int i = 0; i < jsonArrayconversionPathValue.size(); i++) {
            McfDataRowsInnerInnerConversionPathValueInner.validateJsonElement(jsonArrayconversionPathValue.get(i));
          };
        }
      }
      if ((jsonObj.get("primitiveValue") != null && !jsonObj.get("primitiveValue").isJsonNull()) && !jsonObj.get("primitiveValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primitiveValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primitiveValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McfDataRowsInnerInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McfDataRowsInnerInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McfDataRowsInnerInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McfDataRowsInnerInner.class));

       return (TypeAdapter<T>) new TypeAdapter<McfDataRowsInnerInner>() {
           @Override
           public void write(JsonWriter out, McfDataRowsInnerInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public McfDataRowsInnerInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of McfDataRowsInnerInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of McfDataRowsInnerInner
   * @throws IOException if the JSON string is invalid with respect to McfDataRowsInnerInner
   */
  public static McfDataRowsInnerInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McfDataRowsInnerInner.class);
  }

  /**
   * Convert an instance of McfDataRowsInnerInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

