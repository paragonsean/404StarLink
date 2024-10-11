/*
 * Drive Labels API
 * An API for managing Drive Labels
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
import org.openapitools.client.model.GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse;
import org.openapitools.client.model.GoogleAppsDriveLabelsV2Label;

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
 * Response for Label update.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:15:59.934987-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse {
  public static final String SERIALIZED_NAME_RESPONSES = "responses";
  @SerializedName(SERIALIZED_NAME_RESPONSES)
  private List<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse> responses = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_LABEL = "updatedLabel";
  @SerializedName(SERIALIZED_NAME_UPDATED_LABEL)
  private GoogleAppsDriveLabelsV2Label updatedLabel;

  public GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse() {
  }

  public GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse responses(List<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse> responses) {
    this.responses = responses;
    return this;
  }

  public GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse addResponsesItem(GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * The reply of the updates. This maps 1:1 with the updates, although responses to some requests may be empty.
   * @return responses
   */
  @javax.annotation.Nullable
  public List<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse> responses) {
    this.responses = responses;
  }


  public GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse updatedLabel(GoogleAppsDriveLabelsV2Label updatedLabel) {
    this.updatedLabel = updatedLabel;
    return this;
  }

  /**
   * Get updatedLabel
   * @return updatedLabel
   */
  @javax.annotation.Nullable
  public GoogleAppsDriveLabelsV2Label getUpdatedLabel() {
    return updatedLabel;
  }

  public void setUpdatedLabel(GoogleAppsDriveLabelsV2Label updatedLabel) {
    this.updatedLabel = updatedLabel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse googleAppsDriveLabelsV2DeltaUpdateLabelResponse = (GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse) o;
    return Objects.equals(this.responses, googleAppsDriveLabelsV2DeltaUpdateLabelResponse.responses) &&
        Objects.equals(this.updatedLabel, googleAppsDriveLabelsV2DeltaUpdateLabelResponse.updatedLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, updatedLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    updatedLabel: ").append(toIndentedString(updatedLabel)).append("\n");
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
    openapiFields.add("responses");
    openapiFields.add("updatedLabel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse is not found in the empty JSON string", GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("responses") != null && !jsonObj.get("responses").isJsonNull()) {
        JsonArray jsonArrayresponses = jsonObj.getAsJsonArray("responses");
        if (jsonArrayresponses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("responses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `responses` to be an array in the JSON string but got `%s`", jsonObj.get("responses").toString()));
          }

          // validate the optional field `responses` (array)
          for (int i = 0; i < jsonArrayresponses.size(); i++) {
            GoogleAppsDriveLabelsV2DeltaUpdateLabelResponseResponse.validateJsonElement(jsonArrayresponses.get(i));
          };
        }
      }
      // validate the optional field `updatedLabel`
      if (jsonObj.get("updatedLabel") != null && !jsonObj.get("updatedLabel").isJsonNull()) {
        GoogleAppsDriveLabelsV2Label.validateJsonElement(jsonObj.get("updatedLabel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse>() {
           @Override
           public void write(JsonWriter out, GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse
   * @throws IOException if the JSON string is invalid with respect to GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse
   */
  public static GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse.class);
  }

  /**
   * Convert an instance of GoogleAppsDriveLabelsV2DeltaUpdateLabelResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

