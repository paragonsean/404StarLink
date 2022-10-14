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
 * Specifies the hyperparameters and their default ranges. Hyperparameters can be categorical, continuous, or integer-valued.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DefaultHyperParameterRanges {
  public static final String SERIALIZED_NAME_INTEGER_HYPER_PARAMETER_RANGES = "integerHyperParameterRanges";
  @SerializedName(SERIALIZED_NAME_INTEGER_HYPER_PARAMETER_RANGES)
  private List integerHyperParameterRanges;

  public static final String SERIALIZED_NAME_CONTINUOUS_HYPER_PARAMETER_RANGES = "continuousHyperParameterRanges";
  @SerializedName(SERIALIZED_NAME_CONTINUOUS_HYPER_PARAMETER_RANGES)
  private List continuousHyperParameterRanges;

  public static final String SERIALIZED_NAME_CATEGORICAL_HYPER_PARAMETER_RANGES = "categoricalHyperParameterRanges";
  @SerializedName(SERIALIZED_NAME_CATEGORICAL_HYPER_PARAMETER_RANGES)
  private List categoricalHyperParameterRanges;

  public DefaultHyperParameterRanges() {
  }

  public DefaultHyperParameterRanges integerHyperParameterRanges(List integerHyperParameterRanges) {
    this.integerHyperParameterRanges = integerHyperParameterRanges;
    return this;
  }

  /**
   * Get integerHyperParameterRanges
   * @return integerHyperParameterRanges
   */
  @javax.annotation.Nullable
  public List getIntegerHyperParameterRanges() {
    return integerHyperParameterRanges;
  }

  public void setIntegerHyperParameterRanges(List integerHyperParameterRanges) {
    this.integerHyperParameterRanges = integerHyperParameterRanges;
  }


  public DefaultHyperParameterRanges continuousHyperParameterRanges(List continuousHyperParameterRanges) {
    this.continuousHyperParameterRanges = continuousHyperParameterRanges;
    return this;
  }

  /**
   * Get continuousHyperParameterRanges
   * @return continuousHyperParameterRanges
   */
  @javax.annotation.Nullable
  public List getContinuousHyperParameterRanges() {
    return continuousHyperParameterRanges;
  }

  public void setContinuousHyperParameterRanges(List continuousHyperParameterRanges) {
    this.continuousHyperParameterRanges = continuousHyperParameterRanges;
  }


  public DefaultHyperParameterRanges categoricalHyperParameterRanges(List categoricalHyperParameterRanges) {
    this.categoricalHyperParameterRanges = categoricalHyperParameterRanges;
    return this;
  }

  /**
   * Get categoricalHyperParameterRanges
   * @return categoricalHyperParameterRanges
   */
  @javax.annotation.Nullable
  public List getCategoricalHyperParameterRanges() {
    return categoricalHyperParameterRanges;
  }

  public void setCategoricalHyperParameterRanges(List categoricalHyperParameterRanges) {
    this.categoricalHyperParameterRanges = categoricalHyperParameterRanges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultHyperParameterRanges defaultHyperParameterRanges = (DefaultHyperParameterRanges) o;
    return Objects.equals(this.integerHyperParameterRanges, defaultHyperParameterRanges.integerHyperParameterRanges) &&
        Objects.equals(this.continuousHyperParameterRanges, defaultHyperParameterRanges.continuousHyperParameterRanges) &&
        Objects.equals(this.categoricalHyperParameterRanges, defaultHyperParameterRanges.categoricalHyperParameterRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integerHyperParameterRanges, continuousHyperParameterRanges, categoricalHyperParameterRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultHyperParameterRanges {\n");
    sb.append("    integerHyperParameterRanges: ").append(toIndentedString(integerHyperParameterRanges)).append("\n");
    sb.append("    continuousHyperParameterRanges: ").append(toIndentedString(continuousHyperParameterRanges)).append("\n");
    sb.append("    categoricalHyperParameterRanges: ").append(toIndentedString(categoricalHyperParameterRanges)).append("\n");
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
    openapiFields.add("integerHyperParameterRanges");
    openapiFields.add("continuousHyperParameterRanges");
    openapiFields.add("categoricalHyperParameterRanges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DefaultHyperParameterRanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DefaultHyperParameterRanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultHyperParameterRanges is not found in the empty JSON string", DefaultHyperParameterRanges.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DefaultHyperParameterRanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DefaultHyperParameterRanges` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `integerHyperParameterRanges`
      if (jsonObj.get("integerHyperParameterRanges") != null && !jsonObj.get("integerHyperParameterRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("integerHyperParameterRanges"));
      }
      // validate the optional field `continuousHyperParameterRanges`
      if (jsonObj.get("continuousHyperParameterRanges") != null && !jsonObj.get("continuousHyperParameterRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("continuousHyperParameterRanges"));
      }
      // validate the optional field `categoricalHyperParameterRanges`
      if (jsonObj.get("categoricalHyperParameterRanges") != null && !jsonObj.get("categoricalHyperParameterRanges").isJsonNull()) {
        List.validateJsonElement(jsonObj.get("categoricalHyperParameterRanges"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultHyperParameterRanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultHyperParameterRanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultHyperParameterRanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultHyperParameterRanges.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultHyperParameterRanges>() {
           @Override
           public void write(JsonWriter out, DefaultHyperParameterRanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DefaultHyperParameterRanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DefaultHyperParameterRanges given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefaultHyperParameterRanges
   * @throws IOException if the JSON string is invalid with respect to DefaultHyperParameterRanges
   */
  public static DefaultHyperParameterRanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultHyperParameterRanges.class);
  }

  /**
   * Convert an instance of DefaultHyperParameterRanges to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

