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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Map;
import org.openapitools.client.model.ComputePlatform;
import org.openapitools.client.model.ProfilingGroupDescriptionAgentOrchestrationConfig;
import org.openapitools.client.model.ProfilingGroupDescriptionProfilingStatus;

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
 *  Contains information about a profiling group. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:43.000790-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ProfilingGroupDescription {
  public static final String SERIALIZED_NAME_AGENT_ORCHESTRATION_CONFIG = "agentOrchestrationConfig";
  @SerializedName(SERIALIZED_NAME_AGENT_ORCHESTRATION_CONFIG)
  private ProfilingGroupDescriptionAgentOrchestrationConfig agentOrchestrationConfig;

  public static final String SERIALIZED_NAME_ARN = "arn";
  @SerializedName(SERIALIZED_NAME_ARN)
  private String arn;

  public static final String SERIALIZED_NAME_COMPUTE_PLATFORM = "computePlatform";
  @SerializedName(SERIALIZED_NAME_COMPUTE_PLATFORM)
  private ComputePlatform computePlatform;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROFILING_STATUS = "profilingStatus";
  @SerializedName(SERIALIZED_NAME_PROFILING_STATUS)
  private ProfilingGroupDescriptionProfilingStatus profilingStatus;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map tags;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProfilingGroupDescription() {
  }

  public ProfilingGroupDescription agentOrchestrationConfig(ProfilingGroupDescriptionAgentOrchestrationConfig agentOrchestrationConfig) {
    this.agentOrchestrationConfig = agentOrchestrationConfig;
    return this;
  }

  /**
   * Get agentOrchestrationConfig
   * @return agentOrchestrationConfig
   */
  @javax.annotation.Nullable
  public ProfilingGroupDescriptionAgentOrchestrationConfig getAgentOrchestrationConfig() {
    return agentOrchestrationConfig;
  }

  public void setAgentOrchestrationConfig(ProfilingGroupDescriptionAgentOrchestrationConfig agentOrchestrationConfig) {
    this.agentOrchestrationConfig = agentOrchestrationConfig;
  }


  public ProfilingGroupDescription arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
   */
  @javax.annotation.Nullable
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }


  public ProfilingGroupDescription computePlatform(ComputePlatform computePlatform) {
    this.computePlatform = computePlatform;
    return this;
  }

  /**
   * Get computePlatform
   * @return computePlatform
   */
  @javax.annotation.Nullable
  public ComputePlatform getComputePlatform() {
    return computePlatform;
  }

  public void setComputePlatform(ComputePlatform computePlatform) {
    this.computePlatform = computePlatform;
  }


  public ProfilingGroupDescription createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProfilingGroupDescription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ProfilingGroupDescription profilingStatus(ProfilingGroupDescriptionProfilingStatus profilingStatus) {
    this.profilingStatus = profilingStatus;
    return this;
  }

  /**
   * Get profilingStatus
   * @return profilingStatus
   */
  @javax.annotation.Nullable
  public ProfilingGroupDescriptionProfilingStatus getProfilingStatus() {
    return profilingStatus;
  }

  public void setProfilingStatus(ProfilingGroupDescriptionProfilingStatus profilingStatus) {
    this.profilingStatus = profilingStatus;
  }


  public ProfilingGroupDescription tags(Map tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public Map getTags() {
    return tags;
  }

  public void setTags(Map tags) {
    this.tags = tags;
  }


  public ProfilingGroupDescription updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilingGroupDescription profilingGroupDescription = (ProfilingGroupDescription) o;
    return Objects.equals(this.agentOrchestrationConfig, profilingGroupDescription.agentOrchestrationConfig) &&
        Objects.equals(this.arn, profilingGroupDescription.arn) &&
        Objects.equals(this.computePlatform, profilingGroupDescription.computePlatform) &&
        Objects.equals(this.createdAt, profilingGroupDescription.createdAt) &&
        Objects.equals(this.name, profilingGroupDescription.name) &&
        Objects.equals(this.profilingStatus, profilingGroupDescription.profilingStatus) &&
        Objects.equals(this.tags, profilingGroupDescription.tags) &&
        Objects.equals(this.updatedAt, profilingGroupDescription.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentOrchestrationConfig, arn, computePlatform, createdAt, name, profilingStatus, tags, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilingGroupDescription {\n");
    sb.append("    agentOrchestrationConfig: ").append(toIndentedString(agentOrchestrationConfig)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    computePlatform: ").append(toIndentedString(computePlatform)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profilingStatus: ").append(toIndentedString(profilingStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("agentOrchestrationConfig");
    openapiFields.add("arn");
    openapiFields.add("computePlatform");
    openapiFields.add("createdAt");
    openapiFields.add("name");
    openapiFields.add("profilingStatus");
    openapiFields.add("tags");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProfilingGroupDescription
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProfilingGroupDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfilingGroupDescription is not found in the empty JSON string", ProfilingGroupDescription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProfilingGroupDescription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProfilingGroupDescription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agentOrchestrationConfig`
      if (jsonObj.get("agentOrchestrationConfig") != null && !jsonObj.get("agentOrchestrationConfig").isJsonNull()) {
        ProfilingGroupDescriptionAgentOrchestrationConfig.validateJsonElement(jsonObj.get("agentOrchestrationConfig"));
      }
      // validate the optional field `arn`
      if (jsonObj.get("arn") != null && !jsonObj.get("arn").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("arn"));
      }
      // validate the optional field `computePlatform`
      if (jsonObj.get("computePlatform") != null && !jsonObj.get("computePlatform").isJsonNull()) {
        ComputePlatform.validateJsonElement(jsonObj.get("computePlatform"));
      }
      // validate the optional field `createdAt`
      if (jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("createdAt"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        String.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `profilingStatus`
      if (jsonObj.get("profilingStatus") != null && !jsonObj.get("profilingStatus").isJsonNull()) {
        ProfilingGroupDescriptionProfilingStatus.validateJsonElement(jsonObj.get("profilingStatus"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        Map.validateJsonElement(jsonObj.get("tags"));
      }
      // validate the optional field `updatedAt`
      if (jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("updatedAt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProfilingGroupDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfilingGroupDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfilingGroupDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfilingGroupDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfilingGroupDescription>() {
           @Override
           public void write(JsonWriter out, ProfilingGroupDescription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProfilingGroupDescription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProfilingGroupDescription given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProfilingGroupDescription
   * @throws IOException if the JSON string is invalid with respect to ProfilingGroupDescription
   */
  public static ProfilingGroupDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfilingGroupDescription.class);
  }

  /**
   * Convert an instance of ProfilingGroupDescription to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

