/*
 * Amazon CodeGuru Profiler
 * <p> This section provides documentation for the Amazon CodeGuru Profiler API operations. </p> <p> Amazon CodeGuru Profiler collects runtime performance data from your live applications, and provides recommendations that can help you fine-tune your application performance. Using machine learning algorithms, CodeGuru Profiler can help you find your most expensive lines of code and suggest ways you can improve efficiency and remove CPU bottlenecks. </p> <p> Amazon CodeGuru Profiler provides different visualizations of profiling data to help you identify what code is running on the CPU, see how much time is consumed, and suggest ways to reduce CPU utilization. </p> <note> <p>Amazon CodeGuru Profiler currently supports applications written in all Java virtual machine (JVM) languages and Python. While CodeGuru Profiler supports both visualizations and recommendations for applications written in Java, it can also generate visualizations and a subset of recommendations for applications written in other JVM languages and Python.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/codeguru/latest/profiler-ug/what-is-codeguru-profiler.html\">What is Amazon CodeGuru Profiler</a> in the <i>Amazon CodeGuru Profiler User Guide</i>. </p>
 *
 * The version of the OpenAPI document: 2019-07-18
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
import java.util.Map;

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
 * ConfigureAgentResponseConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:43.000790-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ConfigureAgentResponseConfiguration {
  public static final String SERIALIZED_NAME_AGENT_PARAMETERS = "agentParameters";
  @SerializedName(SERIALIZED_NAME_AGENT_PARAMETERS)
  private Map agentParameters;

  public static final String SERIALIZED_NAME_PERIOD_IN_SECONDS = "periodInSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_IN_SECONDS)
  private Integer periodInSeconds;

  public static final String SERIALIZED_NAME_SHOULD_PROFILE = "shouldProfile";
  @SerializedName(SERIALIZED_NAME_SHOULD_PROFILE)
  private Boolean shouldProfile;

  public ConfigureAgentResponseConfiguration() {
  }

  public ConfigureAgentResponseConfiguration agentParameters(Map agentParameters) {
    this.agentParameters = agentParameters;
    return this;
  }

  /**
   * Get agentParameters
   * @return agentParameters
   */
  @javax.annotation.Nullable
  public Map getAgentParameters() {
    return agentParameters;
  }

  public void setAgentParameters(Map agentParameters) {
    this.agentParameters = agentParameters;
  }


  public ConfigureAgentResponseConfiguration periodInSeconds(Integer periodInSeconds) {
    this.periodInSeconds = periodInSeconds;
    return this;
  }

  /**
   * Get periodInSeconds
   * @return periodInSeconds
   */
  @javax.annotation.Nonnull
  public Integer getPeriodInSeconds() {
    return periodInSeconds;
  }

  public void setPeriodInSeconds(Integer periodInSeconds) {
    this.periodInSeconds = periodInSeconds;
  }


  public ConfigureAgentResponseConfiguration shouldProfile(Boolean shouldProfile) {
    this.shouldProfile = shouldProfile;
    return this;
  }

  /**
   * Get shouldProfile
   * @return shouldProfile
   */
  @javax.annotation.Nonnull
  public Boolean getShouldProfile() {
    return shouldProfile;
  }

  public void setShouldProfile(Boolean shouldProfile) {
    this.shouldProfile = shouldProfile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAgentResponseConfiguration configureAgentResponseConfiguration = (ConfigureAgentResponseConfiguration) o;
    return Objects.equals(this.agentParameters, configureAgentResponseConfiguration.agentParameters) &&
        Objects.equals(this.periodInSeconds, configureAgentResponseConfiguration.periodInSeconds) &&
        Objects.equals(this.shouldProfile, configureAgentResponseConfiguration.shouldProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentParameters, periodInSeconds, shouldProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAgentResponseConfiguration {\n");
    sb.append("    agentParameters: ").append(toIndentedString(agentParameters)).append("\n");
    sb.append("    periodInSeconds: ").append(toIndentedString(periodInSeconds)).append("\n");
    sb.append("    shouldProfile: ").append(toIndentedString(shouldProfile)).append("\n");
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
    openapiFields.add("agentParameters");
    openapiFields.add("periodInSeconds");
    openapiFields.add("shouldProfile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("periodInSeconds");
    openapiRequiredFields.add("shouldProfile");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigureAgentResponseConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigureAgentResponseConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigureAgentResponseConfiguration is not found in the empty JSON string", ConfigureAgentResponseConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigureAgentResponseConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigureAgentResponseConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigureAgentResponseConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agentParameters`
      if (jsonObj.get("agentParameters") != null && !jsonObj.get("agentParameters").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("agentParameters"));
      }
      // validate the required field `periodInSeconds`
      Integer.validateJsonElement(jsonObj.get("periodInSeconds"));
      // validate the required field `shouldProfile`
      Boolean.validateJsonElement(jsonObj.get("shouldProfile"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigureAgentResponseConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigureAgentResponseConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigureAgentResponseConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigureAgentResponseConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigureAgentResponseConfiguration>() {
           @Override
           public void write(JsonWriter out, ConfigureAgentResponseConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigureAgentResponseConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigureAgentResponseConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigureAgentResponseConfiguration
   * @throws IOException if the JSON string is invalid with respect to ConfigureAgentResponseConfiguration
   */
  public static ConfigureAgentResponseConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigureAgentResponseConfiguration.class);
  }

  /**
   * Convert an instance of ConfigureAgentResponseConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

