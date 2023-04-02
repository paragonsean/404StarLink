/*
 * Google Analytics API
 * Views and manages your Google Analytics data.
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
import org.openapitools.client.model.GoalUrlDestinationDetailsStepsInner;

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
 * Details for the goal of the type URL_DESTINATION.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:11:22.913673-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoalUrlDestinationDetails {
  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "caseSensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_FIRST_STEP_REQUIRED = "firstStepRequired";
  @SerializedName(SERIALIZED_NAME_FIRST_STEP_REQUIRED)
  private Boolean firstStepRequired;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<GoalUrlDestinationDetailsStepsInner> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public GoalUrlDestinationDetails() {
  }

  public GoalUrlDestinationDetails caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Determines if the goal URL must exactly match the capitalization of visited URLs.
   * @return caseSensitive
   */
  @javax.annotation.Nullable
  public Boolean getCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public GoalUrlDestinationDetails firstStepRequired(Boolean firstStepRequired) {
    this.firstStepRequired = firstStepRequired;
    return this;
  }

  /**
   * Determines if the first step in this goal is required.
   * @return firstStepRequired
   */
  @javax.annotation.Nullable
  public Boolean getFirstStepRequired() {
    return firstStepRequired;
  }

  public void setFirstStepRequired(Boolean firstStepRequired) {
    this.firstStepRequired = firstStepRequired;
  }


  public GoalUrlDestinationDetails matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX.
   * @return matchType
   */
  @javax.annotation.Nullable
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public GoalUrlDestinationDetails steps(List<GoalUrlDestinationDetailsStepsInner> steps) {
    this.steps = steps;
    return this;
  }

  public GoalUrlDestinationDetails addStepsItem(GoalUrlDestinationDetailsStepsInner stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * List of steps configured for this goal funnel.
   * @return steps
   */
  @javax.annotation.Nullable
  public List<GoalUrlDestinationDetailsStepsInner> getSteps() {
    return steps;
  }

  public void setSteps(List<GoalUrlDestinationDetailsStepsInner> steps) {
    this.steps = steps;
  }


  public GoalUrlDestinationDetails url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL for this goal.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalUrlDestinationDetails goalUrlDestinationDetails = (GoalUrlDestinationDetails) o;
    return Objects.equals(this.caseSensitive, goalUrlDestinationDetails.caseSensitive) &&
        Objects.equals(this.firstStepRequired, goalUrlDestinationDetails.firstStepRequired) &&
        Objects.equals(this.matchType, goalUrlDestinationDetails.matchType) &&
        Objects.equals(this.steps, goalUrlDestinationDetails.steps) &&
        Objects.equals(this.url, goalUrlDestinationDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, firstStepRequired, matchType, steps, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalUrlDestinationDetails {\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    firstStepRequired: ").append(toIndentedString(firstStepRequired)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("caseSensitive");
    openapiFields.add("firstStepRequired");
    openapiFields.add("matchType");
    openapiFields.add("steps");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoalUrlDestinationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoalUrlDestinationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalUrlDestinationDetails is not found in the empty JSON string", GoalUrlDestinationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoalUrlDestinationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoalUrlDestinationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("matchType") != null && !jsonObj.get("matchType").isJsonNull()) && !jsonObj.get("matchType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchType").toString()));
      }
      if (jsonObj.get("steps") != null && !jsonObj.get("steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
          }

          // validate the optional field `steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            GoalUrlDestinationDetailsStepsInner.validateJsonElement(jsonArraysteps.get(i));
          };
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalUrlDestinationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalUrlDestinationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalUrlDestinationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalUrlDestinationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalUrlDestinationDetails>() {
           @Override
           public void write(JsonWriter out, GoalUrlDestinationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoalUrlDestinationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoalUrlDestinationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoalUrlDestinationDetails
   * @throws IOException if the JSON string is invalid with respect to GoalUrlDestinationDetails
   */
  public static GoalUrlDestinationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalUrlDestinationDetails.class);
  }

  /**
   * Convert an instance of GoalUrlDestinationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

