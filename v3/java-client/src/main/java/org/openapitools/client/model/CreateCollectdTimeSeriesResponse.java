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
import org.openapitools.client.model.CollectdPayloadError;
import org.openapitools.client.model.CreateTimeSeriesSummary;

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
 * The CreateCollectdTimeSeries response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:19.132075-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateCollectdTimeSeriesResponse {
  public static final String SERIALIZED_NAME_PAYLOAD_ERRORS = "payloadErrors";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_ERRORS)
  private List<CollectdPayloadError> payloadErrors = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private CreateTimeSeriesSummary summary;

  public CreateCollectdTimeSeriesResponse() {
  }

  public CreateCollectdTimeSeriesResponse payloadErrors(List<CollectdPayloadError> payloadErrors) {
    this.payloadErrors = payloadErrors;
    return this;
  }

  public CreateCollectdTimeSeriesResponse addPayloadErrorsItem(CollectdPayloadError payloadErrorsItem) {
    if (this.payloadErrors == null) {
      this.payloadErrors = new ArrayList<>();
    }
    this.payloadErrors.add(payloadErrorsItem);
    return this;
  }

  /**
   * Records the error status for points that were not written due to an error in the request.Failed requests for which nothing is written will return an error response instead. Requests where data points were rejected by the backend will set summary instead.
   * @return payloadErrors
   */
  @javax.annotation.Nullable
  public List<CollectdPayloadError> getPayloadErrors() {
    return payloadErrors;
  }

  public void setPayloadErrors(List<CollectdPayloadError> payloadErrors) {
    this.payloadErrors = payloadErrors;
  }


  public CreateCollectdTimeSeriesResponse summary(CreateTimeSeriesSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nullable
  public CreateTimeSeriesSummary getSummary() {
    return summary;
  }

  public void setSummary(CreateTimeSeriesSummary summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCollectdTimeSeriesResponse createCollectdTimeSeriesResponse = (CreateCollectdTimeSeriesResponse) o;
    return Objects.equals(this.payloadErrors, createCollectdTimeSeriesResponse.payloadErrors) &&
        Objects.equals(this.summary, createCollectdTimeSeriesResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadErrors, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCollectdTimeSeriesResponse {\n");
    sb.append("    payloadErrors: ").append(toIndentedString(payloadErrors)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("payloadErrors");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCollectdTimeSeriesResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCollectdTimeSeriesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCollectdTimeSeriesResponse is not found in the empty JSON string", CreateCollectdTimeSeriesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCollectdTimeSeriesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCollectdTimeSeriesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("payloadErrors") != null && !jsonObj.get("payloadErrors").isJsonNull()) {
        JsonArray jsonArraypayloadErrors = jsonObj.getAsJsonArray("payloadErrors");
        if (jsonArraypayloadErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payloadErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payloadErrors` to be an array in the JSON string but got `%s`", jsonObj.get("payloadErrors").toString()));
          }

          // validate the optional field `payloadErrors` (array)
          for (int i = 0; i < jsonArraypayloadErrors.size(); i++) {
            CollectdPayloadError.validateJsonElement(jsonArraypayloadErrors.get(i));
          };
        }
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        CreateTimeSeriesSummary.validateJsonElement(jsonObj.get("summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCollectdTimeSeriesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCollectdTimeSeriesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCollectdTimeSeriesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCollectdTimeSeriesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCollectdTimeSeriesResponse>() {
           @Override
           public void write(JsonWriter out, CreateCollectdTimeSeriesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCollectdTimeSeriesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCollectdTimeSeriesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCollectdTimeSeriesResponse
   * @throws IOException if the JSON string is invalid with respect to CreateCollectdTimeSeriesResponse
   */
  public static CreateCollectdTimeSeriesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCollectdTimeSeriesResponse.class);
  }

  /**
   * Convert an instance of CreateCollectdTimeSeriesResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

