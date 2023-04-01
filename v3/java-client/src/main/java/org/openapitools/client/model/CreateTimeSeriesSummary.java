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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Error;

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
 * Summary of the result of a failed request to write data to a time series.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateTimeSeriesSummary {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUCCESS_POINT_COUNT = "successPointCount";
  @SerializedName(SERIALIZED_NAME_SUCCESS_POINT_COUNT)
  private Integer successPointCount;

  public static final String SERIALIZED_NAME_TOTAL_POINT_COUNT = "totalPointCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_POINT_COUNT)
  private Integer totalPointCount;

  public CreateTimeSeriesSummary() {
  }

  public CreateTimeSeriesSummary errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CreateTimeSeriesSummary addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * The number of points that failed to be written. Order is not guaranteed.
   * @return errors
   */
  @javax.annotation.Nullable
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public CreateTimeSeriesSummary successPointCount(Integer successPointCount) {
    this.successPointCount = successPointCount;
    return this;
  }

  /**
   * The number of points that were successfully written.
   * @return successPointCount
   */
  @javax.annotation.Nullable
  public Integer getSuccessPointCount() {
    return successPointCount;
  }

  public void setSuccessPointCount(Integer successPointCount) {
    this.successPointCount = successPointCount;
  }


  public CreateTimeSeriesSummary totalPointCount(Integer totalPointCount) {
    this.totalPointCount = totalPointCount;
    return this;
  }

  /**
   * The number of points in the request.
   * @return totalPointCount
   */
  @javax.annotation.Nullable
  public Integer getTotalPointCount() {
    return totalPointCount;
  }

  public void setTotalPointCount(Integer totalPointCount) {
    this.totalPointCount = totalPointCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeSeriesSummary createTimeSeriesSummary = (CreateTimeSeriesSummary) o;
    return Objects.equals(this.errors, createTimeSeriesSummary.errors) &&
        Objects.equals(this.successPointCount, createTimeSeriesSummary.successPointCount) &&
        Objects.equals(this.totalPointCount, createTimeSeriesSummary.totalPointCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, successPointCount, totalPointCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeSeriesSummary {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    successPointCount: ").append(toIndentedString(successPointCount)).append("\n");
    sb.append("    totalPointCount: ").append(toIndentedString(totalPointCount)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("successPointCount");
    openapiFields.add("totalPointCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeSeriesSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeSeriesSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeSeriesSummary is not found in the empty JSON string", CreateTimeSeriesSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeSeriesSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeSeriesSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            Error.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeSeriesSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeSeriesSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeSeriesSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeSeriesSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeSeriesSummary>() {
           @Override
           public void write(JsonWriter out, CreateTimeSeriesSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeSeriesSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeSeriesSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeSeriesSummary
   * @throws IOException if the JSON string is invalid with respect to CreateTimeSeriesSummary
   */
  public static CreateTimeSeriesSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeSeriesSummary.class);
  }

  /**
   * Convert an instance of CreateTimeSeriesSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

