/*
 * AWS Service Catalog
 * <fullname>Service Catalog</fullname> <p> <a href=\"http://aws.amazon.com/servicecatalog\">Service Catalog</a> enables organizations to create and manage catalogs of IT services that are approved for Amazon Web Services. To get the most out of this documentation, you should be familiar with the terminology discussed in <a href=\"http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html\">Service Catalog Concepts</a>.</p>
 *
 * The version of the OpenAPI document: 2015-12-10
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
 * The output for the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:10:09.580275-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class RecordOutput {
  public static final String SERIALIZED_NAME_OUTPUT_KEY = "OutputKey";
  @SerializedName(SERIALIZED_NAME_OUTPUT_KEY)
  private String outputKey;

  public static final String SERIALIZED_NAME_OUTPUT_VALUE = "OutputValue";
  @SerializedName(SERIALIZED_NAME_OUTPUT_VALUE)
  private String outputValue;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public RecordOutput() {
  }

  public RecordOutput outputKey(String outputKey) {
    this.outputKey = outputKey;
    return this;
  }

  /**
   * Get outputKey
   * @return outputKey
   */
  @javax.annotation.Nullable
  public String getOutputKey() {
    return outputKey;
  }

  public void setOutputKey(String outputKey) {
    this.outputKey = outputKey;
  }


  public RecordOutput outputValue(String outputValue) {
    this.outputValue = outputValue;
    return this;
  }

  /**
   * Get outputValue
   * @return outputValue
   */
  @javax.annotation.Nullable
  public String getOutputValue() {
    return outputValue;
  }

  public void setOutputValue(String outputValue) {
    this.outputValue = outputValue;
  }


  public RecordOutput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordOutput recordOutput = (RecordOutput) o;
    return Objects.equals(this.outputKey, recordOutput.outputKey) &&
        Objects.equals(this.outputValue, recordOutput.outputValue) &&
        Objects.equals(this.description, recordOutput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputKey, outputValue, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordOutput {\n");
    sb.append("    outputKey: ").append(toIndentedString(outputKey)).append("\n");
    sb.append("    outputValue: ").append(toIndentedString(outputValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("OutputKey");
    openapiFields.add("OutputValue");
    openapiFields.add("Description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordOutput is not found in the empty JSON string", RecordOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OutputKey`
      if (jsonObj.get("OutputKey") != null && !jsonObj.get("OutputKey").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OutputKey"));
      }
      // validate the optional field `OutputValue`
      if (jsonObj.get("OutputValue") != null && !jsonObj.get("OutputValue").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("OutputValue"));
      }
      // validate the optional field `Description`
      if (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("Description"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordOutput>() {
           @Override
           public void write(JsonWriter out, RecordOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordOutput
   * @throws IOException if the JSON string is invalid with respect to RecordOutput
   */
  public static RecordOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordOutput.class);
  }

  /**
   * Convert an instance of RecordOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

