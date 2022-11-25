/*
 * reCAPTCHA Enterprise API
 * Help protect your website from fraudulent activity, spam, and abuse without creating friction.
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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.GoogleCloudRecaptchaenterpriseV1ScoreDistribution;

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
 * Metrics related to scoring.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:56:52.022302-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class GoogleCloudRecaptchaenterpriseV1ScoreMetrics {
  public static final String SERIALIZED_NAME_ACTION_METRICS = "actionMetrics";
  @SerializedName(SERIALIZED_NAME_ACTION_METRICS)
  private Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> actionMetrics = new HashMap<>();

  public static final String SERIALIZED_NAME_OVERALL_METRICS = "overallMetrics";
  @SerializedName(SERIALIZED_NAME_OVERALL_METRICS)
  private GoogleCloudRecaptchaenterpriseV1ScoreDistribution overallMetrics;

  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics() {
  }

  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics actionMetrics(Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> actionMetrics) {
    this.actionMetrics = actionMetrics;
    return this;
  }

  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics putActionMetricsItem(String key, GoogleCloudRecaptchaenterpriseV1ScoreDistribution actionMetricsItem) {
    if (this.actionMetrics == null) {
      this.actionMetrics = new HashMap<>();
    }
    this.actionMetrics.put(key, actionMetricsItem);
    return this;
  }

  /**
   * Action-based metrics. The map key is the action name which specified by the site owners at time of the \&quot;execute\&quot; client-side call.
   * @return actionMetrics
   */
  @javax.annotation.Nullable
  public Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> getActionMetrics() {
    return actionMetrics;
  }

  public void setActionMetrics(Map<String, GoogleCloudRecaptchaenterpriseV1ScoreDistribution> actionMetrics) {
    this.actionMetrics = actionMetrics;
  }


  public GoogleCloudRecaptchaenterpriseV1ScoreMetrics overallMetrics(GoogleCloudRecaptchaenterpriseV1ScoreDistribution overallMetrics) {
    this.overallMetrics = overallMetrics;
    return this;
  }

  /**
   * Get overallMetrics
   * @return overallMetrics
   */
  @javax.annotation.Nullable
  public GoogleCloudRecaptchaenterpriseV1ScoreDistribution getOverallMetrics() {
    return overallMetrics;
  }

  public void setOverallMetrics(GoogleCloudRecaptchaenterpriseV1ScoreDistribution overallMetrics) {
    this.overallMetrics = overallMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleCloudRecaptchaenterpriseV1ScoreMetrics googleCloudRecaptchaenterpriseV1ScoreMetrics = (GoogleCloudRecaptchaenterpriseV1ScoreMetrics) o;
    return Objects.equals(this.actionMetrics, googleCloudRecaptchaenterpriseV1ScoreMetrics.actionMetrics) &&
        Objects.equals(this.overallMetrics, googleCloudRecaptchaenterpriseV1ScoreMetrics.overallMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionMetrics, overallMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleCloudRecaptchaenterpriseV1ScoreMetrics {\n");
    sb.append("    actionMetrics: ").append(toIndentedString(actionMetrics)).append("\n");
    sb.append("    overallMetrics: ").append(toIndentedString(overallMetrics)).append("\n");
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
    openapiFields.add("actionMetrics");
    openapiFields.add("overallMetrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleCloudRecaptchaenterpriseV1ScoreMetrics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleCloudRecaptchaenterpriseV1ScoreMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleCloudRecaptchaenterpriseV1ScoreMetrics is not found in the empty JSON string", GoogleCloudRecaptchaenterpriseV1ScoreMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleCloudRecaptchaenterpriseV1ScoreMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleCloudRecaptchaenterpriseV1ScoreMetrics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `overallMetrics`
      if (jsonObj.get("overallMetrics") != null && !jsonObj.get("overallMetrics").isJsonNull()) {
        GoogleCloudRecaptchaenterpriseV1ScoreDistribution.validateJsonElement(jsonObj.get("overallMetrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleCloudRecaptchaenterpriseV1ScoreMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleCloudRecaptchaenterpriseV1ScoreMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleCloudRecaptchaenterpriseV1ScoreMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleCloudRecaptchaenterpriseV1ScoreMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleCloudRecaptchaenterpriseV1ScoreMetrics>() {
           @Override
           public void write(JsonWriter out, GoogleCloudRecaptchaenterpriseV1ScoreMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleCloudRecaptchaenterpriseV1ScoreMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleCloudRecaptchaenterpriseV1ScoreMetrics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleCloudRecaptchaenterpriseV1ScoreMetrics
   * @throws IOException if the JSON string is invalid with respect to GoogleCloudRecaptchaenterpriseV1ScoreMetrics
   */
  public static GoogleCloudRecaptchaenterpriseV1ScoreMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleCloudRecaptchaenterpriseV1ScoreMetrics.class);
  }

  /**
   * Convert an instance of GoogleCloudRecaptchaenterpriseV1ScoreMetrics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

