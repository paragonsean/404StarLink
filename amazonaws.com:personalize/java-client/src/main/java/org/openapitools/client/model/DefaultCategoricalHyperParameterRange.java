/*
 * Amazon Personalize
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to customers.
 *
 * The version of the OpenAPI document: 2018-05-22
 * Contact: mike.ralphson@gmail.com
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
 * Provides the name and default range of a categorical hyperparameter and whether the hyperparameter is tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DefaultCategoricalHyperParameterRange {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List values;

  public static final String SERIALIZED_NAME_IS_TUNABLE = "isTunable";
  @SerializedName(SERIALIZED_NAME_IS_TUNABLE)
  private Boolean isTunable;

  public DefaultCategoricalHyperParameterRange() {
  }

  public DefaultCategoricalHyperParameterRange name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DefaultCategoricalHyperParameterRange values(List values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @javax.annotation.Nullable
  public List getValues() {
    return values;
  }

  public void setValues(List values) {
    this.values = values;
  }


  public DefaultCategoricalHyperParameterRange isTunable(Boolean isTunable) {
    this.isTunable = isTunable;
    return this;
  }

  /**
   * Get isTunable
   * @return isTunable
   */
  @javax.annotation.Nullable
  public Boolean getIsTunable() {
    return isTunable;
  }

  public void setIsTunable(Boolean isTunable) {
    this.isTunable = isTunable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultCategoricalHyperParameterRange defaultCategoricalHyperParameterRange = (DefaultCategoricalHyperParameterRange) o;
    return Objects.equals(this.name, defaultCategoricalHyperParameterRange.name) &&
        Objects.equals(this.values, defaultCategoricalHyperParameterRange.values) &&
        Objects.equals(this.isTunable, defaultCategoricalHyperParameterRange.isTunable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, isTunable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultCategoricalHyperParameterRange {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    isTunable: ").append(toIndentedString(isTunable)).append("\n");
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
    openapiFields.add("values");
    openapiFields.add("isTunable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DefaultCategoricalHyperParameterRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DefaultCategoricalHyperParameterRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultCategoricalHyperParameterRange is not found in the empty JSON string", DefaultCategoricalHyperParameterRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DefaultCategoricalHyperParameterRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DefaultCategoricalHyperParameterRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `values`
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("values"));
      }
      // validate the optional field `isTunable`
      if (jsonObj.get("isTunable") != null && !jsonObj.get("isTunable").isJsonNull()) {
        Boolean.validateJsonElement(jsonObj.get("isTunable"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultCategoricalHyperParameterRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultCategoricalHyperParameterRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultCategoricalHyperParameterRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultCategoricalHyperParameterRange.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultCategoricalHyperParameterRange>() {
           @Override
           public void write(JsonWriter out, DefaultCategoricalHyperParameterRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DefaultCategoricalHyperParameterRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DefaultCategoricalHyperParameterRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefaultCategoricalHyperParameterRange
   * @throws IOException if the JSON string is invalid with respect to DefaultCategoricalHyperParameterRange
   */
  public static DefaultCategoricalHyperParameterRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultCategoricalHyperParameterRange.class);
  }

  /**
   * Convert an instance of DefaultCategoricalHyperParameterRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

