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
 * CreateDatasetImportJobRequestDataSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:02:30.273417-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateDatasetImportJobRequestDataSource {
  public static final String SERIALIZED_NAME_DATA_LOCATION = "dataLocation";
  @SerializedName(SERIALIZED_NAME_DATA_LOCATION)
  private String dataLocation;

  public CreateDatasetImportJobRequestDataSource() {
  }

  public CreateDatasetImportJobRequestDataSource dataLocation(String dataLocation) {
    this.dataLocation = dataLocation;
    return this;
  }

  /**
   * Get dataLocation
   * @return dataLocation
   */
  @javax.annotation.Nullable
  public String getDataLocation() {
    return dataLocation;
  }

  public void setDataLocation(String dataLocation) {
    this.dataLocation = dataLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatasetImportJobRequestDataSource createDatasetImportJobRequestDataSource = (CreateDatasetImportJobRequestDataSource) o;
    return Objects.equals(this.dataLocation, createDatasetImportJobRequestDataSource.dataLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatasetImportJobRequestDataSource {\n");
    sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
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
    openapiFields.add("dataLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDatasetImportJobRequestDataSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDatasetImportJobRequestDataSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDatasetImportJobRequestDataSource is not found in the empty JSON string", CreateDatasetImportJobRequestDataSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDatasetImportJobRequestDataSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDatasetImportJobRequestDataSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dataLocation`
      if (jsonObj.get("dataLocation") != null && !jsonObj.get("dataLocation").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("dataLocation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDatasetImportJobRequestDataSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDatasetImportJobRequestDataSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDatasetImportJobRequestDataSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDatasetImportJobRequestDataSource.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDatasetImportJobRequestDataSource>() {
           @Override
           public void write(JsonWriter out, CreateDatasetImportJobRequestDataSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDatasetImportJobRequestDataSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDatasetImportJobRequestDataSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDatasetImportJobRequestDataSource
   * @throws IOException if the JSON string is invalid with respect to CreateDatasetImportJobRequestDataSource
   */
  public static CreateDatasetImportJobRequestDataSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDatasetImportJobRequestDataSource.class);
  }

  /**
   * Convert an instance of CreateDatasetImportJobRequestDataSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

