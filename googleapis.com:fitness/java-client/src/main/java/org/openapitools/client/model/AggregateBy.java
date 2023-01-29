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
 * The specification of which data to aggregate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:08:03.093710-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class AggregateBy {
  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "dataSourceId";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId;

  public static final String SERIALIZED_NAME_DATA_TYPE_NAME = "dataTypeName";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE_NAME)
  private String dataTypeName;

  public AggregateBy() {
  }

  public AggregateBy dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  /**
   * A data source ID to aggregate. Only data from the specified data source ID will be included in the aggregation. If specified, this data source must exist; the OAuth scopes in the supplied credentials must grant read access to this data type. The dataset in the response will have the same data source ID. Note: Data can be aggregated by either the dataTypeName or the dataSourceId, not both.
   * @return dataSourceId
   */
  @javax.annotation.Nullable
  public String getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public AggregateBy dataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
    return this;
  }

  /**
   * The data type to aggregate. All data sources providing this data type will contribute data to the aggregation. The response will contain a single dataset for this data type name. The dataset will have a data source ID of derived::com.google.android.gms:aggregated. If the user has no data for this data type, an empty data set will be returned. Note: Data can be aggregated by either the dataTypeName or the dataSourceId, not both.
   * @return dataTypeName
   */
  @javax.annotation.Nullable
  public String getDataTypeName() {
    return dataTypeName;
  }

  public void setDataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateBy aggregateBy = (AggregateBy) o;
    return Objects.equals(this.dataSourceId, aggregateBy.dataSourceId) &&
        Objects.equals(this.dataTypeName, aggregateBy.dataTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, dataTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateBy {\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    dataTypeName: ").append(toIndentedString(dataTypeName)).append("\n");
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
    openapiFields.add("dataSourceId");
    openapiFields.add("dataTypeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AggregateBy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AggregateBy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregateBy is not found in the empty JSON string", AggregateBy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AggregateBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregateBy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataSourceId") != null && !jsonObj.get("dataSourceId").isJsonNull()) && !jsonObj.get("dataSourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataSourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataSourceId").toString()));
      }
      if ((jsonObj.get("dataTypeName") != null && !jsonObj.get("dataTypeName").isJsonNull()) && !jsonObj.get("dataTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataTypeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregateBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregateBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregateBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregateBy.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregateBy>() {
           @Override
           public void write(JsonWriter out, AggregateBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregateBy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AggregateBy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AggregateBy
   * @throws IOException if the JSON string is invalid with respect to AggregateBy
   */
  public static AggregateBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregateBy.class);
  }

  /**
   * Convert an instance of AggregateBy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

