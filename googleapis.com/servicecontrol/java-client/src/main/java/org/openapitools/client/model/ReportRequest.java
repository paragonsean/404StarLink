/*
 * Service Control API
 * Provides admission control and telemetry reporting for services integrated with Service Infrastructure. 
 *
 * The version of the OpenAPI document: v2
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
import org.openapitools.client.model.AttributeContext;

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
 * Request message for the Report method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:16:54.152517-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ReportRequest {
  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<AttributeContext> operations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICE_CONFIG_ID = "serviceConfigId";
  @SerializedName(SERIALIZED_NAME_SERVICE_CONFIG_ID)
  private String serviceConfigId;

  public ReportRequest() {
  }

  public ReportRequest operations(List<AttributeContext> operations) {
    this.operations = operations;
    return this;
  }

  public ReportRequest addOperationsItem(AttributeContext operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Describes the list of operations to be reported. Each operation is represented as an AttributeContext, and contains all attributes around an API access.
   * @return operations
   */
  @javax.annotation.Nullable
  public List<AttributeContext> getOperations() {
    return operations;
  }

  public void setOperations(List<AttributeContext> operations) {
    this.operations = operations;
  }


  public ReportRequest serviceConfigId(String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  /**
   * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to &#39;latest&#39; to specify using the latest configuration.
   * @return serviceConfigId
   */
  @javax.annotation.Nullable
  public String getServiceConfigId() {
    return serviceConfigId;
  }

  public void setServiceConfigId(String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRequest reportRequest = (ReportRequest) o;
    return Objects.equals(this.operations, reportRequest.operations) &&
        Objects.equals(this.serviceConfigId, reportRequest.serviceConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, serviceConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRequest {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    serviceConfigId: ").append(toIndentedString(serviceConfigId)).append("\n");
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
    openapiFields.add("operations");
    openapiFields.add("serviceConfigId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportRequest is not found in the empty JSON string", ReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull()) {
        JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
        if (jsonArrayoperations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("operations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
          }

          // validate the optional field `operations` (array)
          for (int i = 0; i < jsonArrayoperations.size(); i++) {
            AttributeContext.validateJsonElement(jsonArrayoperations.get(i));
          };
        }
      }
      if ((jsonObj.get("serviceConfigId") != null && !jsonObj.get("serviceConfigId").isJsonNull()) && !jsonObj.get("serviceConfigId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceConfigId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceConfigId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRequest>() {
           @Override
           public void write(JsonWriter out, ReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportRequest
   * @throws IOException if the JSON string is invalid with respect to ReportRequest
   */
  public static ReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRequest.class);
  }

  /**
   * Convert an instance of ReportRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

