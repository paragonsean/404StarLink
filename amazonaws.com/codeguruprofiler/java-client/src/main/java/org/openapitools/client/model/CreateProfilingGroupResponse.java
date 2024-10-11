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
import org.openapitools.client.model.CreateProfilingGroupResponseProfilingGroup;

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
 * The structure representing the createProfilingGroupResponse.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:14:43.000790-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class CreateProfilingGroupResponse {
  public static final String SERIALIZED_NAME_PROFILING_GROUP = "profilingGroup";
  @SerializedName(SERIALIZED_NAME_PROFILING_GROUP)
  private CreateProfilingGroupResponseProfilingGroup profilingGroup;

  public CreateProfilingGroupResponse() {
  }

  public CreateProfilingGroupResponse profilingGroup(CreateProfilingGroupResponseProfilingGroup profilingGroup) {
    this.profilingGroup = profilingGroup;
    return this;
  }

  /**
   * Get profilingGroup
   * @return profilingGroup
   */
  @javax.annotation.Nonnull
  public CreateProfilingGroupResponseProfilingGroup getProfilingGroup() {
    return profilingGroup;
  }

  public void setProfilingGroup(CreateProfilingGroupResponseProfilingGroup profilingGroup) {
    this.profilingGroup = profilingGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProfilingGroupResponse createProfilingGroupResponse = (CreateProfilingGroupResponse) o;
    return Objects.equals(this.profilingGroup, createProfilingGroupResponse.profilingGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilingGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProfilingGroupResponse {\n");
    sb.append("    profilingGroup: ").append(toIndentedString(profilingGroup)).append("\n");
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
    openapiFields.add("profilingGroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("profilingGroup");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateProfilingGroupResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateProfilingGroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProfilingGroupResponse is not found in the empty JSON string", CreateProfilingGroupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateProfilingGroupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProfilingGroupResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateProfilingGroupResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `profilingGroup`
      CreateProfilingGroupResponseProfilingGroup.validateJsonElement(jsonObj.get("profilingGroup"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProfilingGroupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProfilingGroupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProfilingGroupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProfilingGroupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProfilingGroupResponse>() {
           @Override
           public void write(JsonWriter out, CreateProfilingGroupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProfilingGroupResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateProfilingGroupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateProfilingGroupResponse
   * @throws IOException if the JSON string is invalid with respect to CreateProfilingGroupResponse
   */
  public static CreateProfilingGroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProfilingGroupResponse.class);
  }

  /**
   * Convert an instance of CreateProfilingGroupResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

