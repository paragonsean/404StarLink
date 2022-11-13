/*
 * Amazon ElastiCache
 * <fullname>Amazon ElastiCache</fullname> <p>Amazon ElastiCache is a web service that makes it easier to set up, operate, and scale a distributed cache in the cloud.</p> <p>With ElastiCache, customers get all of the benefits of a high-performance, in-memory cache with less of the administrative burden involved in launching and managing a distributed cache. The service makes setup, scaling, and cluster failure handling much simpler than in a self-managed cache deployment.</p> <p>In addition, through integration with Amazon CloudWatch, customers get enhanced visibility into the key performance statistics associated with their cache and can receive alarms if a part of their cache runs hot.</p>
 *
 * The version of the OpenAPI document: 2015-02-02
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
import org.openapitools.client.model.EngineDefaults;

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
 * DescribeEngineDefaultParametersResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:16.135451-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class DescribeEngineDefaultParametersResult {
  public static final String SERIALIZED_NAME_ENGINE_DEFAULTS = "EngineDefaults";
  @SerializedName(SERIALIZED_NAME_ENGINE_DEFAULTS)
  private EngineDefaults engineDefaults;

  public DescribeEngineDefaultParametersResult() {
  }

  public DescribeEngineDefaultParametersResult engineDefaults(EngineDefaults engineDefaults) {
    this.engineDefaults = engineDefaults;
    return this;
  }

  /**
   * Get engineDefaults
   * @return engineDefaults
   */
  @javax.annotation.Nullable
  public EngineDefaults getEngineDefaults() {
    return engineDefaults;
  }

  public void setEngineDefaults(EngineDefaults engineDefaults) {
    this.engineDefaults = engineDefaults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeEngineDefaultParametersResult describeEngineDefaultParametersResult = (DescribeEngineDefaultParametersResult) o;
    return Objects.equals(this.engineDefaults, describeEngineDefaultParametersResult.engineDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineDefaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeEngineDefaultParametersResult {\n");
    sb.append("    engineDefaults: ").append(toIndentedString(engineDefaults)).append("\n");
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
    openapiFields.add("EngineDefaults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DescribeEngineDefaultParametersResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DescribeEngineDefaultParametersResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DescribeEngineDefaultParametersResult is not found in the empty JSON string", DescribeEngineDefaultParametersResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DescribeEngineDefaultParametersResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DescribeEngineDefaultParametersResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `EngineDefaults`
      if (jsonObj.get("EngineDefaults") != null && !jsonObj.get("EngineDefaults").isJsonNull()) {
        EngineDefaults.validateJsonElement(jsonObj.get("EngineDefaults"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DescribeEngineDefaultParametersResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DescribeEngineDefaultParametersResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DescribeEngineDefaultParametersResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DescribeEngineDefaultParametersResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DescribeEngineDefaultParametersResult>() {
           @Override
           public void write(JsonWriter out, DescribeEngineDefaultParametersResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DescribeEngineDefaultParametersResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DescribeEngineDefaultParametersResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DescribeEngineDefaultParametersResult
   * @throws IOException if the JSON string is invalid with respect to DescribeEngineDefaultParametersResult
   */
  public static DescribeEngineDefaultParametersResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DescribeEngineDefaultParametersResult.class);
  }

  /**
   * Convert an instance of DescribeEngineDefaultParametersResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

