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
 * AnnotationLayerInfoGet200ResponseFiltersColumnNameInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:18:58.715288-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AnnotationLayerInfoGet200ResponseFiltersColumnNameInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public AnnotationLayerInfoGet200ResponseFiltersColumnNameInner() {
  }

  public AnnotationLayerInfoGet200ResponseFiltersColumnNameInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The filter name. Will be translated by babel
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AnnotationLayerInfoGet200ResponseFiltersColumnNameInner operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The filter operation key to use on list filters
   * @return operator
   */
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationLayerInfoGet200ResponseFiltersColumnNameInner annotationLayerInfoGet200ResponseFiltersColumnNameInner = (AnnotationLayerInfoGet200ResponseFiltersColumnNameInner) o;
    return Objects.equals(this.name, annotationLayerInfoGet200ResponseFiltersColumnNameInner.name) &&
        Objects.equals(this.operator, annotationLayerInfoGet200ResponseFiltersColumnNameInner.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationLayerInfoGet200ResponseFiltersColumnNameInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnotationLayerInfoGet200ResponseFiltersColumnNameInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotationLayerInfoGet200ResponseFiltersColumnNameInner is not found in the empty JSON string", AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnotationLayerInfoGet200ResponseFiltersColumnNameInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotationLayerInfoGet200ResponseFiltersColumnNameInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotationLayerInfoGet200ResponseFiltersColumnNameInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotationLayerInfoGet200ResponseFiltersColumnNameInner>() {
           @Override
           public void write(JsonWriter out, AnnotationLayerInfoGet200ResponseFiltersColumnNameInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnotationLayerInfoGet200ResponseFiltersColumnNameInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnotationLayerInfoGet200ResponseFiltersColumnNameInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnotationLayerInfoGet200ResponseFiltersColumnNameInner
   * @throws IOException if the JSON string is invalid with respect to AnnotationLayerInfoGet200ResponseFiltersColumnNameInner
   */
  public static AnnotationLayerInfoGet200ResponseFiltersColumnNameInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotationLayerInfoGet200ResponseFiltersColumnNameInner.class);
  }

  /**
   * Convert an instance of AnnotationLayerInfoGet200ResponseFiltersColumnNameInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

